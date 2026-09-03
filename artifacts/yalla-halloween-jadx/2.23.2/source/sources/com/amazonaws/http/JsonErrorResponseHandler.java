package com.amazonaws.http;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.transform.JsonErrorUnmarshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.json.JsonUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class JsonErrorResponseHandler implements HttpResponseHandler<AmazonServiceException> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<? extends JsonErrorUnmarshaller> f12189OooO00o;

    public static final class JsonErrorResponse {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f12190OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String f12191OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Map<String, String> f12192OooO0OO;

        public JsonErrorResponse(String str, Map map) {
            this.f12191OooO0O0 = str;
            this.f12192OooO0OO = map;
            String str2 = StringUtils.OooO00o("m") + "essage";
            String str3 = "m".toUpperCase(Locale.ENGLISH) + "essage";
            this.f12190OooO00o = map.containsKey(str3) ? (String) map.get(str3) : map.containsKey(str2) ? (String) map.get(str2) : "";
        }

        public static JsonErrorResponse OooO00o(HttpResponse httpResponse) throws IOException {
            Map mapOooO0Oo = JsonUtils.OooO0Oo(new BufferedReader(new InputStreamReader(httpResponse.OooO00o(), StringUtils.f12681OooO00o)));
            String strSubstring = httpResponse.f12183OooO0Oo.get("x-amzn-ErrorType");
            if (strSubstring != null) {
                int iIndexOf = strSubstring.indexOf(58);
                if (iIndexOf != -1) {
                    strSubstring = strSubstring.substring(0, iIndexOf);
                }
            } else if (mapOooO0Oo.containsKey("__type")) {
                String str = (String) mapOooO0Oo.get("__type");
                strSubstring = str.substring(str.lastIndexOf("#") + 1);
            }
            return new JsonErrorResponse(strSubstring, mapOooO0Oo);
        }
    }

    public JsonErrorResponseHandler(ArrayList arrayList) {
        this.f12189OooO00o = arrayList;
    }

    @Override // com.amazonaws.http.HttpResponseHandler
    public final AmazonServiceException OooO00o(HttpResponse httpResponse) throws Exception {
        AmazonServiceException amazonServiceExceptionOooO00o;
        try {
            JsonErrorResponse jsonErrorResponseOooO00o = JsonErrorResponse.OooO00o(httpResponse);
            Iterator<? extends JsonErrorUnmarshaller> it = this.f12189OooO00o.iterator();
            while (true) {
                if (!it.hasNext()) {
                    amazonServiceExceptionOooO00o = null;
                    break;
                }
                JsonErrorUnmarshaller next = it.next();
                if (next.OooO0O0(jsonErrorResponseOooO00o)) {
                    amazonServiceExceptionOooO00o = next.OooO00o(jsonErrorResponseOooO00o);
                    break;
                }
            }
            if (amazonServiceExceptionOooO00o == null) {
                return null;
            }
            amazonServiceExceptionOooO00o.f12041OooO0oO = httpResponse.f12181OooO0O0;
            amazonServiceExceptionOooO00o.f12040OooO0o0 = jsonErrorResponseOooO00o.f12191OooO0O0;
            for (Map.Entry<String, String> entry : httpResponse.f12183OooO0Oo.entrySet()) {
                if ("X-Amzn-RequestId".equalsIgnoreCase(entry.getKey())) {
                    amazonServiceExceptionOooO00o.f12038OooO0Oo = entry.getValue();
                }
            }
            return amazonServiceExceptionOooO00o;
        } catch (IOException e) {
            throw new AmazonClientException("Unable to parse error response", e);
        }
    }

    @Override // com.amazonaws.http.HttpResponseHandler
    public final boolean OooO0O0() {
        return false;
    }
}
