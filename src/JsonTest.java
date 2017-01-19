import java.util.HashMap;



public class JsonTest {
	public static void main(String[] args) {
		String json="{"+"'device':{'DeviceID':'8537388','IPV4':'192.168.1.101','Mode':'1'"
				+ ",'ConFlag':'1','Relay_State':'1','Category':'0'"
				+ ",'Model':'0','Voltage':'0','Current':'0','Electricity':'0'"
				+ ",'Power':'0','temp':'19','Frequency':'30','Version':'1','time':'123','UUID':'123'"+"}}";
		System.out.println(json);
		HashMap<String,Object> result=DataUtils.getDeviceInformation(json);
		System.out.println(Constants.DEVICE_ID+":"+result.get(Constants.DEVICE_ID));
		System.out.println(Constants.DEVICE_BRIGHTNESS+":"+result.get(Constants.DEVICE_BRIGHTNESS));
		System.out.println(Constants.DEVICE_CATEGORY+":"+result.get(Constants.DEVICE_CATEGORY));
		System.out.println(Constants.DEVICE_CMDTYPE+":"+result.get(Constants.DEVICE_CMDTYPE));
		System.out.println(Constants.DEVICE_CONFIAG+":"+result.get(Constants.DEVICE_CONFIAG));
		System.out.println(Constants.DEVICE_ELECTRICITY+":"+result.get(Constants.DEVICE_ELECTRICITY));
		System.out.println(Constants.DEVICE_FREQUENCY+":"+result.get(Constants.DEVICE_FREQUENCY));
		System.out.println(Constants.DEVICE_FUNPARM+":"+result.get(Constants.DEVICE_FUNPARM));
		System.out.println(Constants.DEVICE_HUMIDITY+":"+result.get(Constants.DEVICE_HUMIDITY));
		System.out.println(Constants.IP+":"+result.get(Constants.IP));
		System.out.println(Constants.DEVICE_MODE+":"+result.get(Constants.DEVICE_MODE));
		System.out.println(Constants.DEVICE_MODEL+":"+result.get(Constants.DEVICE_MODEL));
		System.out.println(Constants.DEVICE_NEW_VERSION_NUMBER+":"+result.get(Constants.DEVICE_NEW_VERSION_NUMBER));
		System.out.println(Constants.DEVICE_POWER+":"+result.get(Constants.DEVICE_POWER));
		System.out.println(Constants.DEVICE_RELAY_STATE+":"+result.get(Constants.DEVICE_RELAY_STATE));
		System.out.println(Constants.DEVICE_RETURN+":"+result.get(Constants.DEVICE_RETURN));
		System.out.println(Constants.DEVICE_TEMP+":"+result.get(Constants.DEVICE_TEMP));
		System.out.println(Constants.DEVICE_UUID+":"+result.get(Constants.DEVICE_UUID));
		System.out.println(Constants.DEVICE_VERDION+":"+result.get(Constants.DEVICE_VERDION));
		
	}
}
