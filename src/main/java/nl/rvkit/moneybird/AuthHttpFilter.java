package nl.rvkit.moneybird;

import io.micronaut.context.annotation.Requires;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MutableHttpRequest;
import io.micronaut.http.annotation.Filter;
import io.micronaut.http.filter.ClientFilterChain;
import io.micronaut.http.filter.HttpClientFilter;
import io.micronaut.http.uri.UriBuilder;
import org.reactivestreams.Publisher;

import java.net.URI;

@Filter("/**")
@Requires(property = MoneyBirdConfiguration.PREFIX + ".token")
@Requires(property = MoneyBirdConfiguration.PREFIX + ".user")
public class AuthHttpFilter implements HttpClientFilter {

    private final MoneyBirdConfiguration configuration;

    public AuthHttpFilter(MoneyBirdConfiguration configuration) {
        this.configuration = configuration;
    }

    @Override
    public Publisher<? extends HttpResponse<?>> doFilter(MutableHttpRequest<?> request, ClientFilterChain chain) {

        String resourcePath = request.getUri().getPath().substring(7);

        URI newUri = UriBuilder.of(request.getUri()).replacePath("api/v2/" + configuration.getUser() + resourcePath).build();

        return chain.proceed(request.bearerAuth(configuration.getToken()).uri(newUri));
    }
}
