package kim.configure.springboot.autoconfigure;

import kim.figure.ssg.SsgConfig;
import kim.figure.ssg.SsgGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Project : kim.figure.springboot.ssg-spring-boot-starter
 * @Date : 2021-12-27
 * @Author : "DoHyeong Walker Kim"
 * @ChangeHistory :
 * @Note :
 */
@Configuration
@EnableConfigurationProperties(SsgProperties.class)
public class SsgAutoConfiguration {
    @Autowired
    private SsgProperties ssgProperties;

    @Bean
    @ConditionalOnMissingBean
    public SsgConfig ssgConfig(){
        String distPath = ssgProperties.getDisPath() == null ? System.getProperty("spring.ssg") : ssgProperties.getDisPath();
        String staticPathLocations = ssgProperties.getDisPath() == null ? System.getProperty("spring.mvc.static-path-pattern") : ssgProperties.getStaticPathLocations();
        return null;
    }

    @Bean
    @ConditionalOnMissingBean
    public SsgGenerator ssgGenerator(SsgConfig ssgConfig) {

        return new SsgGenerator(ssgConfig);
    }
}
