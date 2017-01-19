import java.util.HashMap;

import com.alibaba.fastjson.JSONObject;

public class DataUtils {
	 public static HashMap<String, Object> getDeviceInformation(String result) {
	        try {
	            JSONObject json = JSONObject.parseObject(result);
	            if (json != null) {
	                if (json.containsKey(Constants.RESULT)) {
	                    //获取设备对象传递来的信息
	                	HashMap<String, Object> data=new HashMap<String, Object>();
	                    JSONObject deviceObject = json.getJSONObject(Constants.RESULT);
	                    if (deviceObject.containsKey(Constants.DEVICE_ID)) {
	                        int id = deviceObject.getIntValue(Constants.DEVICE_ID);
	                        data.put(Constants.DEVICE_ID, id + "");
	                    }
	                    if (deviceObject.containsKey(Constants.DEVICE_CATEGORY)) {
	                        int category = deviceObject.getIntValue(Constants.DEVICE_CATEGORY);
	                        data.put(Constants.DEVICE_CATEGORY, category);
	                    }
	                    if (deviceObject.containsKey(Constants.DEVICE_IPV4)) {
	                        data.put(Constants.IP, deviceObject.getString(Constants.DEVICE_IPV4)+"");
	                    }
	                    if (deviceObject.containsKey(Constants.DEVICE_RELAY_STATE)) {
	                        data.put(Constants.DEVICE_RELAY_STATE, deviceObject.getIntValue(Constants.DEVICE_RELAY_STATE));
	                    }
	                    if (deviceObject.containsKey(Constants.DEVICE_MODE)) {
	                        data.put(Constants.DEVICE_MODE, deviceObject.getIntValue(Constants.DEVICE_MODE));
	                    }
	                    if (deviceObject.containsKey(Constants.DEVICE_MODEL)) {
	                        data.put(Constants.DEVICE_MODEL, deviceObject.getIntValue(Constants.DEVICE_MODEL));
	                    }
	                    if (deviceObject.containsKey(Constants.DEVICE_CONFIAG)) {
	                        data.put(Constants.DEVICE_CONFIAG, deviceObject.getIntValue(Constants.DEVICE_CONFIAG));
	                    }
	                    if (deviceObject.containsKey(Constants.DEVICE_VOLTAGE)) {
	                        data.put(Constants.DEVICE_VOLTAGE, deviceObject.getIntValue(Constants.DEVICE_VOLTAGE));
	                    }
	                    if (deviceObject.containsKey(Constants.DEVICE_ELECTRICITY)) {
	                        data.put(Constants.DEVICE_ELECTRICITY, deviceObject.getIntValue(Constants.DEVICE_ELECTRICITY));
	                    }
	                    if (deviceObject.containsKey(Constants.DEVICE_FUNPARM)) {
	                        data.put(Constants.DEVICE_FUNPARM, deviceObject.getString(Constants.DEVICE_FUNPARM));
	                    }
	                    if (deviceObject.containsKey(Constants.DEVICE_POWER)) {
	                        data.put(Constants.DEVICE_POWER, deviceObject.getIntValue(Constants.DEVICE_POWER));
	                    }
	                    if (deviceObject.containsKey(Constants.DEVICE_TEMP)) {
	                        data.put(Constants.DEVICE_TEMP, deviceObject.getIntValue(Constants.DEVICE_TEMP));
	                    }
	                    if (deviceObject.containsKey(Constants.DEVICE_FREQUENCY)) {
	                        data.put(Constants.DEVICE_FREQUENCY, deviceObject.getIntValue(Constants.DEVICE_FREQUENCY));
	                    }
	                    if (deviceObject.containsKey(Constants.DEVICE_VERDION)) {
	                        data.put(Constants.DEVICE_VERDION, deviceObject.getIntValue(Constants.DEVICE_VERDION));
	                    }
	                    if (deviceObject.containsKey(Constants.DEVICE_TIME)) {
	                        data.put(Constants.DEVICE_TIME, deviceObject.getIntValue(Constants.DEVICE_TIME));
	                    }
	                    if (deviceObject.containsKey(Constants.DEVICE_UUID)) {
	                        data.put(Constants.DEVICE_UUID, deviceObject.getIntValue(Constants.DEVICE_UUID));
	                    }
	                    if (deviceObject.containsKey(Constants.DEVICE_NEW_VERSION_NUMBER)) {
	                        data.put(Constants.DEVICE_NEW_VERSION_NUMBER, deviceObject.getIntValue(Constants.DEVICE_NEW_VERSION_NUMBER));
	                    }
	                    return data;
	                } else if (json.containsKey("File")) {
	                    JSONObject fileObject = json.getJSONObject("File");
	                    return null;
	                }
	            } else {
	                return null;
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	            return null;
	        }
	        return null;
	    }

}
