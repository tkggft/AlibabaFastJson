package cn.com.demo.test;

import cn.com.demo.model.User;
import com.alibaba.fastjson.JSONObject;
import java.util.Map;

public class TestDemo {

  public static void main(String[] args) {
   User user = new User("Tom",30,"male");

    String strUser = JSONObject.toJSONString(user);


    Map<String,Object> userObjc = JSONObject.parseObject(strUser,Map.class);

    System.out.println(userObjc.get("name")+"--"+userObjc.get("age"));
  }

}
