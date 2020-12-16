package cn.huang.live.configuration.springSecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity// 这个注解必须加，开启Security
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private CustomUserDatailService customUserDatailService;

    /**
     * 指定加密方式
     *  使用BCrypt加密密码
     */
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    //  验证身份
    // huang:方法名不重要，参数是AuthenticationManagerBuilder就行，只能一个地方用
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
        /*写死*/
//        auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder())
//                .withUser("admin")
//                .password(new BCryptPasswordEncoder().encode("admin"))
//                .roles("ADMIN")
//                .and()
//                .withUser("super")
//                .password(new BCryptPasswordEncoder().encode("super"))
//                .roles("SUPER")
//                .and()
//                .withUser("test")
//                .password(new BCryptPasswordEncoder().encode("test"))
//                .roles("TEST");

        //数据库获取
        auth
                .authenticationProvider(daoAuthenticationProvider())
//                .userDetailsService(customUserDatailService)
//                .passwordEncoder(passwordEncoder())
        ;
    }

    @Bean
    protected AuthenticationProvider daoAuthenticationProvider(){
        DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
        daoAuthenticationProvider.setUserDetailsService(customUserDatailService);
        daoAuthenticationProvider.setPasswordEncoder(passwordEncoder());
        return daoAuthenticationProvider;
    }
}
