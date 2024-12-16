package common;

import static helpers.PathReadingClass.getPort;
import static helpers.PathReadingClass.getURL;

public class BaseUrl {

    public final static String BASE_HOST = getURL() + getPort();
    public final static String MAIN_HOST = "http://localhost:3030";
    public final static String MANIFEST_HOST = "/manifest-mutation";
    public final static String VALIDATOR = "/core/storage/jsonata/kadzo.v2023.validators";
}

