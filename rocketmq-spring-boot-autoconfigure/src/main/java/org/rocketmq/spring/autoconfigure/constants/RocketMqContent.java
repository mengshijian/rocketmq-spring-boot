package org.rocketmq.spring.autoconfigure.constants;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.io.Serializable;

/**
 * @author mengsj
 * @since 0.0.1
 */
public class RocketMqContent implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * FastJSON serialize
     *
     * @return content json string
     */
    @Override
    public String toString() {
        return JSON.toJSONString(this, SerializerFeature.NotWriteDefaultValue);
    }
}
