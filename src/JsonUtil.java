import com.alibaba.fastjson.JSONObject;

public class JsonUtil {
	public static void main(String[] args) {
//		ServerUpload su=new ServerUpload();
//		su.setUserId("RQ=");
//		su.setState(1);
//		String js=JSONObject.toJSONString(su);
//		System.out.println("json结果："+js);
		String re="RQ=";
		String result=re.substring(0, 2);
		System.out.println("截取后的："+result);
	
	}

}
