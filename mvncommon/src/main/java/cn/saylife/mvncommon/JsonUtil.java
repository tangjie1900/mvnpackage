package cn.saylife.mvncommon;

import com.alibaba.fastjson.JSONObject;

public class JsonUtil {

    public static <T> String convertString(T t) {
        if (null == t)
            return null;
        else
            return JSONObject.toJSONString(t);
    }
}
