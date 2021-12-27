package kim.configure.springboot.autoconfigure;


import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Project : kim.figure.springboot.ssg-spring-boot-starter
 * @Date : 2021-12-27
 * @Author : "DoHyeong Walker Kim"
 * @ChangeHistory :
 * @Note :
 */
@ConfigurationProperties(prefix = "spring.ssg")
public class SsgProperties {
    private String[] excludePrefixes;
    private String staticPathLocations;
    private String disPath;

    public String[] getExcludePrefixes() {
        return excludePrefixes;
    }

    public String getStaticPathLocations() {
        return staticPathLocations;
    }

    public String getDisPath() {
        return disPath;
    }
}
