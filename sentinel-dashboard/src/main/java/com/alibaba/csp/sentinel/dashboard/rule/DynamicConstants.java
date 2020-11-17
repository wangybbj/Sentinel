package com.alibaba.csp.sentinel.dashboard.rule;

public interface DynamicConstants {
    String CONFIG = "spring.cloud.sentinel.datasource.{rule}.{type}.{property}";

    String SERVER_ADDR = "server-addr";
    String DATA_ID = "data-id";
    String GROUP_ID = "group-id";
    String RULE_TYPE = "rule-type";
    String DATA_TYPE = "data-type";
}
