package helpers;

import entity.pojo.RequestObject;
import entity.pojo.ResponseJSONnata;
import entity.pojo.ResponseObject;

import java.util.List;

import static java.net.HttpURLConnection.HTTP_OK;

public class Service {

    public ResponseObject getResponseObjectPatch(String object, String attribute, String value) {
        return RequestHelper.doPatchReturnItem(new RequestObject(object, attribute, value), ResponseObject.class);
    }

    public List<ResponseJSONnata> getValidator() {
        return RequestHelper.doGetReturnList(HTTP_OK, ResponseJSONnata[].class);
    }
}
