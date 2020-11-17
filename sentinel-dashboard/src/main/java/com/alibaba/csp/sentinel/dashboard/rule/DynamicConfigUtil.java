package com.alibaba.csp.sentinel.dashboard.rule;

import org.springframework.core.env.Environment;

public final class DynamicConfigUtil {

    public static String getProperty(Environment environment, DynamicEnums.Type type, DynamicEnums.Rule rule, String property) {
        return environment.getProperty(DynamicConstants.CONFIG
                .replace("{type}", type.getName())
                .replace("{rule}", rule.getKey())
                .replace("{property}", property));
    }
}
