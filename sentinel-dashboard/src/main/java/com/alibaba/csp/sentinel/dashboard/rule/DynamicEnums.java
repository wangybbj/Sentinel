package com.alibaba.csp.sentinel.dashboard.rule;

import com.alibaba.csp.sentinel.dashboard.datasource.entity.gateway.GatewayFlowRuleEntity;
import com.alibaba.csp.sentinel.dashboard.datasource.entity.rule.*;

/**
 * @author tangzedong.programmer@gamil.com
 * @apiNote
 * @since 2020/9/21 19:51
 */
public class DynamicEnums {

    public enum Type {
        Nacos("nacos");
        private String name;

        Type(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public enum Rule {
        FLOW(FlowRuleEntity.class, "flow"),
        DEGRADE(DegradeRuleEntity.class, "degrade"),
        SYSTEM(SystemRuleEntity.class, "system"),
        AUTHORITY(AuthorityRuleEntity.class, "authority"),
        PARAM_FLOW(ParamFlowRuleEntity.class, "param-flow"),
        GATEWAY_FLOW(GatewayFlowRuleEntity.class, "gw-flow");
        private Class entityClass;
        private String key;

        Rule(Class entityClass, String key) {
            this.entityClass = entityClass;
            this.key = key;
        }

        public <T> Class<T> getEntityClass() {
            return entityClass;
        }

        public String getKey() {
            return key;
        }
    }
}
