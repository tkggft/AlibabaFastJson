package cn.com.demo.json;

import cn.com.demo.model.User;
import com.alibaba.fastjson.JSONObject;
import java.util.Map;

public class JsonTools {

  /**
   * 字符串json转json对象
   */
  public JSONObject jsonStringToJSONObject(String json) {
    return JSONObject.parseObject(json);
  }

  /**
   * 将对象转换成json字符串
   */
  public String objectToJSONString(User user) {
    return JSONObject.toJSONString(user);
  }

  /**
   * 将json字符串专换为user对象
   */
  public User jsonStringToUser(String json) {
    return JSONObject.parseObject(json, User.class);
  }

  /***
   *  将json转换为map对象
   * @param json
   * @return
   */
  public Map<String, Object> jsonStringToMap(String json) {
    return JSONObject.parseObject(json, Map.class);
  }

}
