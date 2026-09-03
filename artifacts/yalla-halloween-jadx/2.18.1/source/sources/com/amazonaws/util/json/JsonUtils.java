package com.amazonaws.util.json;

import com.amazonaws.AmazonClientException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class JsonUtils {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final AwsJsonFactory f11198OooO00o = new GsonFactory();

    @Deprecated
    public enum JsonEngine {
        Gson,
        Jackson
    }

    public static AwsJsonReader OooO00o(Reader reader) {
        Objects.requireNonNull((GsonFactory) f11198OooO00o);
        return new GsonFactory.GsonReader(reader);
    }

    public static AwsJsonWriter OooO0O0(Writer writer) {
        Objects.requireNonNull((GsonFactory) f11198OooO00o);
        return new GsonFactory.GsonWriter(writer);
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
            gsonReader.OooO0O0();
            while (gsonReader.hasNext()) {
                String strOooO0o = gsonReader.OooO0o();
                if (gsonReader.OooO0o0()) {
                    gsonReader.OooO0Oo();
                } else {
                    map.put(strOooO0o, gsonReader.OooO0OO());
                }
            }
            gsonReader.OooO00o();
            gsonReader.close();
            return Collections.unmodifiableMap(map);
        } catch (IOException e) {
            throw new AmazonClientException("Unable to parse JSON String.", e);
        }
    }

    public static Map<String, String> OooO0Oo(Reader reader) {
        AwsJsonReader awsJsonReaderOooO00o = OooO00o(reader);
        try {
            GsonFactory.GsonReader gsonReader = (GsonFactory.GsonReader) awsJsonReaderOooO00o;
            if (gsonReader.OooO0oO() == null) {
                return Collections.EMPTY_MAP;
            }
            HashMap map = new HashMap();
            gsonReader.OooO0O0();
            while (gsonReader.hasNext()) {
                String strOooO0o = gsonReader.OooO0o();
                if (!gsonReader.OooO0o0()) {
                    map.put(strOooO0o, gsonReader.OooO0OO());
                } else if (AwsJsonToken.BEGIN_ARRAY.equals(gsonReader.OooO0oO())) {
                    StringWriter stringWriter = new StringWriter();
                    AwsJsonWriter awsJsonWriterOooO0O0 = OooO0O0(stringWriter);
                    ((GsonFactory.GsonReader) awsJsonReaderOooO00o).f11196OooO00o.beginArray();
                    ((GsonFactory.GsonWriter) awsJsonWriterOooO0O0).f11197OooO00o.beginArray();
                    while (true) {
                        try {
                            AwsJsonToken awsJsonToken = AwsJsonToken.END_ARRAY;
                            if (awsJsonToken.equals(gsonReader.OooO0oO())) {
                                break;
                            }
                            AwsJsonToken awsJsonTokenOooO0oO = gsonReader.OooO0oO();
                            if (AwsJsonToken.BEGIN_OBJECT.equals(awsJsonTokenOooO0oO)) {
                                gsonReader.OooO0O0();
                                ((GsonFactory.GsonWriter) awsJsonWriterOooO0O0).OooO0O0();
                            } else if (AwsJsonToken.FIELD_NAME.equals(awsJsonTokenOooO0oO)) {
                                String strOooO0o2 = gsonReader.OooO0o();
                                if (!AwsJsonToken.BEGIN_ARRAY.equals(gsonReader.OooO0oO())) {
                                    ((GsonFactory.GsonWriter) awsJsonWriterOooO0O0).OooO0Oo(strOooO0o2);
                                }
                            } else if (AwsJsonToken.END_OBJECT.equals(awsJsonTokenOooO0oO)) {
                                gsonReader.OooO00o();
                                ((GsonFactory.GsonWriter) awsJsonWriterOooO0O0).OooO00o();
                            } else if (awsJsonToken.equals(awsJsonTokenOooO0oO)) {
                                ((GsonFactory.GsonReader) awsJsonReaderOooO00o).f11196OooO00o.endArray();
                                ((GsonFactory.GsonWriter) awsJsonWriterOooO0O0).f11197OooO00o.endArray();
                            } else if (AwsJsonToken.VALUE_STRING.equals(awsJsonTokenOooO0oO) || AwsJsonToken.VALUE_NUMBER.equals(awsJsonTokenOooO0oO) || AwsJsonToken.VALUE_NULL.equals(awsJsonTokenOooO0oO) || AwsJsonToken.VALUE_BOOLEAN.equals(awsJsonTokenOooO0oO)) {
                                ((GsonFactory.GsonWriter) awsJsonWriterOooO0O0).OooO0OO(gsonReader.OooO0OO());
                            } else {
                                gsonReader.OooO0Oo();
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    ((GsonFactory.GsonReader) awsJsonReaderOooO00o).f11196OooO00o.endArray();
                    ((GsonFactory.GsonWriter) awsJsonWriterOooO0O0).f11197OooO00o.endArray();
                    ((GsonFactory.GsonWriter) awsJsonWriterOooO0O0).f11197OooO00o.flush();
                    ((GsonFactory.GsonWriter) awsJsonWriterOooO0O0).close();
                    map.put(strOooO0o, stringWriter.toString());
                } else {
                    gsonReader.OooO0Oo();
                }
            }
            gsonReader.OooO00o();
            gsonReader.close();
            return Collections.unmodifiableMap(map);
        } catch (IOException e2) {
            throw new AmazonClientException("Unable to parse JSON String.", e2);
        }
    }
}
