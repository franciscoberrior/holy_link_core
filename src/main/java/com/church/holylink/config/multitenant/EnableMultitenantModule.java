package com.church.holylink.config.multitenant;

import com.church.holylink.config.multitenant.MultitenantConfig;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Import({MultitenantConfig.class})
@Configuration
@ConditionalOnExpression("'${multitenant.enabled:true}' != 'false'")
public @interface EnableMultitenantModule {
}