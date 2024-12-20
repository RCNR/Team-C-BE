package umc.teamc.youthStepUp.global.config;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import umc.teamc.youthStepUp.auth.resolver.MemberIdInfoResolver;
import umc.teamc.youthStepUp.auth.resolver.MemberInfoResolver;

@EnableWebMvc
@Configuration
@RequiredArgsConstructor
public class WebConfig implements WebMvcConfigurer {
    private final MemberIdInfoResolver memberIdInfoResolver;
    private final MemberInfoResolver memberInfoResolver;

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> resolvers) {
        resolvers.add(memberIdInfoResolver);
        resolvers.add(memberInfoResolver);
    }
}
