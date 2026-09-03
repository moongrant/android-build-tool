package com.amazonaws.util.json;

import com.amazonaws.AmazonClientException;
import com.google.gson.stream.JsonReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class JsonUtils {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final AwsJsonFactory f9602OooO00o = new GsonFactory();

    @Deprecated
    public enum JsonEngine {
        Gson,
        Jackson
    }

    public static AwsJsonReader OooO00o(Reader reader) {
        ((GsonFactory) f9602OooO00o).getClass();
        return new GsonFactory.GsonReader(reader);
    }

    public static AwsJsonWriter OooO0O0(StringWriter stringWriter) {
        ((GsonFactory) f9602OooO00o).getClass();
        return new GsonFactory.GsonWriter(stringWriter);
    }

    public static Map<String, String> OooO0OO(String str) {
        if (str == null || str.isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        try {
            GsonFactory.GsonReader gsonReader = (GsonFactory.GsonReader) OooO00o(new StringReader(str));
            if (gsonReader.OooO0oO() == null) {
                return Collections.EMPTY_MAP;
            }
            HashMap map = new HashMap();
            gsonReader.OooO00o();
            while (gsonReader.hasNext()) {
                String strOooO0o0 = gsonReader.OooO0o0();
                if (gsonReader.OooO0Oo()) {
                    gsonReader.OooO0OO();
                } else {
                    map.put(strOooO0o0, gsonReader.OooO0o());
                }
            }
            gsonReader.OooO0O0();
            gsonReader.close();
            return Collections.unmodifiableMap(map);
        } catch (IOException e) {
            throw new AmazonClientException("Unable to parse JSON String.", e);
        }
    }

    public static Map OooO0Oo(BufferedReader bufferedReader) {
        AwsJsonReader awsJsonReaderOooO00o = OooO00o(bufferedReader);
        try {
            GsonFactory.GsonReader gsonReader = (GsonFactory.GsonReader) awsJsonReaderOooO00o;
            AwsJsonToken awsJsonTokenOooO0oO = gsonReader.OooO0oO();
            JsonReader jsonReader = gsonReader.f9600OooO00o;
            if (awsJsonTokenOooO0oO == null) {
                return Collections.EMPTY_MAP;
            }
            HashMap map = new HashMap();
            gsonReader.OooO00o();
            while (gsonReader.hasNext()) {
                String strOooO0o0 = gsonReader.OooO0o0();
                if (!gsonReader.OooO0Oo()) {
                    map.put(strOooO0o0, gsonReader.OooO0o());
                } else if (AwsJsonToken.BEGIN_ARRAY.equals(gsonReader.OooO0oO())) {
                    StringWriter stringWriter = new StringWriter();
                    AwsJsonWriter awsJsonWriterOooO0O0 = OooO0O0(stringWriter);
                    ((GsonFactory.GsonReader) awsJsonReaderOooO00o).f9600OooO00o.beginArray();
                    ((GsonFactory.GsonWriter) awsJsonWriterOooO0O0).f9601OooO00o.beginArray();
                    while (true) {
                        try {
                            AwsJsonToken awsJsonToken = AwsJsonToken.END_ARRAY;
                            if (awsJsonToken.equals(gsonReader.OooO0oO())) {
                                break;
                            }
                            AwsJsonToken awsJsonTokenOooO0oO2 = gsonReader.OooO0oO();
                            if (AwsJsonToken.BEGIN_OBJECT.equals(awsJsonTokenOooO0oO2)) {
                                gsonReader.OooO00o();
                                ((GsonFactory.GsonWriter) awsJsonWriterOooO0O0).OooO00o();
                            } else if (AwsJsonToken.FIELD_NAME.equals(awsJsonTokenOooO0oO2)) {
                                String strOooO0o1 = gsonReader.OooO0o0();
                                if (!AwsJsonToken.BEGIN_ARRAY.equals(gsonReader.OooO0oO())) {
                                    ((GsonFactory.GsonWriter) awsJsonWriterOooO0O0).OooO0OO(strOooO0o1);
                                }
                            } else if (AwsJsonToken.END_OBJECT.equals(awsJsonTokenOooO0oO2)) {
                                gsonReader.OooO0O0();
                                ((GsonFactory.GsonWriter) awsJsonWriterOooO0O0).OooO0O0();
                            } else if (awsJsonToken.equals(awsJsonTokenOooO0oO2)) {
                                jsonReader.endArray();
                                ((GsonFactory.GsonWriter) awsJsonWriterOooO0O0).f9601OooO00o.endArray();
                            } else if (AwsJsonToken.VALUE_STRING.equals(awsJsonTokenOooO0oO2) || AwsJsonToken.VALUE_NUMBER.equals(awsJsonTokenOooO0oO2) || AwsJsonToken.VALUE_NULL.equals(awsJsonTokenOooO0oO2) || AwsJsonToken.VALUE_BOOLEAN.equals(awsJsonTokenOooO0oO2)) {
                                ((GsonFactory.GsonWriter) awsJsonWriterOooO0O0).OooO0Oo(gsonReader.OooO0o());
                            } else {
                                gsonReader.OooO0OO();
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    jsonReader.endArray();
                    GsonFactory.GsonWriter gsonWriter = (GsonFactory.GsonWriter) awsJsonWriterOooO0O0;
                    gsonWriter.f9601OooO00o.endArray();
                    ((GsonFactory.GsonWriter) awsJsonWriterOooO0O0).f9601OooO00o.flush();
                    gsonWriter.close();
                    map.put(strOooO0o0, stringWriter.toString());
                } else {
                    gsonReader.OooO0OO();
                }
            }
            gsonReader.OooO0O0();
            gsonReader.close();
            return Collections.unmodifiableMap(map);
        } catch (IOException e2) {
            throw new AmazonClientException("Unable to parse JSON String.", e2);
        }
    }
}
