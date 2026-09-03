package com.amazonaws.http;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.transform.JsonErrorUnmarshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.json.JsonUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class JsonErrorResponseHandler implements HttpResponseHandler<AmazonServiceException> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<? extends JsonErrorUnmarshaller> f10405OooO00o;

    public static final class JsonErrorResponse {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f10406OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String f10407OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Map<String, String> f10408OooO0OO;

        public JsonErrorResponse(String str, Map map) {
            this.f10407OooO0O0 = str;
            this.f10408OooO0OO = map;
            String str2 = StringUtils.OooO00o("m") + "essage";
            String str3 = StringUtils.OooO0O0("m") + "essage";
            this.f10406OooO00o = map.containsKey(str3) ? (String) map.get(str3) : map.containsKey(str2) ? (String) map.get(str2) : "";
        }

        public static JsonErrorResponse OooO00o(HttpResponse httpResponse) throws IOException {
            Map<String, String> mapOooO0Oo = JsonUtils.OooO0Oo(new BufferedReader(new InputStreamReader(httpResponse.OooO00o(), StringUtils.f11186OooO00o)));
            String strSubstring = httpResponse.f10399OooO0Oo.get("x-amzn-ErrorType");
            if (strSubstring != null) {
                int iIndexOf = strSubstring.indexOf(58);
                if (iIndexOf != -1) {
                    strSubstring = strSubstring.substring(0, iIndexOf);
                }
            } else if (mapOooO0Oo.containsKey("__type")) {
                String str = mapOooO0Oo.get("__type");
                strSubstring = str.substring(str.lastIndexOf("#") + 1);
            }
            return new JsonErrorResponse(strSubstring, mapOooO0Oo);
        }
    }

    public JsonErrorResponseHandler(List<? extends JsonErrorUnmarshaller> list) {
        this.f10405OooO00o = list;
    }

    @Override // com.amazonaws.http.HttpResponseHandler
    public final AmazonServiceException OooO00o(HttpResponse httpResponse) throws Exception {
        AmazonServiceException amazonServiceExceptionOooO00o;
        try {
            JsonErrorResponse jsonErrorResponseOooO00o = JsonErrorResponse.OooO00o(httpResponse);
            Iterator<? extends JsonErrorUnmarshaller> it = this.f10405OooO00o.iterator();
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
            amazonServiceExceptionOooO00o.f10267Oooo = httpResponse.f10397OooO0O0;
            amazonServiceExceptionOooO00o.f10269Oooo0oO = jsonErrorResponseOooO00o.f10407OooO0O0;
            for (Map.Entry<String, String> entry : httpResponse.f10399OooO0Oo.entrySet()) {
                if ("X-Amzn-RequestId".equalsIgnoreCase(entry.getKey())) {
                    amazonServiceExceptionOooO00o.f10268Oooo0o = entry.getValue();
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
