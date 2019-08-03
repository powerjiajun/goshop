package com.core.config;

import com.ctrip.framework.apollo.model.ConfigChangeEvent;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfigChangeListener;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component
public class ApolloListener {


    @ApolloConfigChangeListener
    private void changeHandler(ConfigChangeEvent changeEvent) {
        if (!CollectionUtils.isEmpty(changeEvent.changedKeys())) {
            for (String key : changeEvent.changedKeys()) {

            }
        }
        if (changeEvent.isChanged("name")) {

        }
    }

}
