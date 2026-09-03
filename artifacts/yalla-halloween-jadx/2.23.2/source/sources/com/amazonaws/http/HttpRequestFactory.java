package com.amazonaws.http;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.DefaultRequest;
import com.amazonaws.util.HttpUtils;
import com.amazonaws.util.StringUtils;
import com.facebook.internal.security.CertificateUtil;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import p031OoooO0.o0OoOo0;
import p037OoooOo0.o000O0o;

/* JADX INFO: loaded from: classes2.dex */
public class HttpRequestFactory {
    public static HttpRequest OooO00o(DefaultRequest defaultRequest, ClientConfiguration clientConfiguration) {
        boolean z = true;
        String strOooO00o = HttpUtils.OooO00o(defaultRequest.f12071OooO0o0.toString(), defaultRequest.f12066OooO00o, true);
        String strOooO0O0 = HttpUtils.OooO0O0(defaultRequest);
        HttpMethodName httpMethodName = defaultRequest.f12073OooO0oo;
        boolean z2 = defaultRequest.f12065OooO != null;
        if ((httpMethodName == HttpMethodName.POST) && !z2) {
            z = false;
        }
        if (strOooO0O0 != null && z) {
            strOooO00o = o0OoOo0.OooO0O0(strOooO00o, "?", strOooO0O0);
        }
        HashMap map = new HashMap();
        URI uri = defaultRequest.f12071OooO0o0;
        String host = uri.getHost();
        if (HttpUtils.OooO0OO(uri)) {
            StringBuilder sbOooO0O0 = o000O0o.OooO0O0(host, CertificateUtil.DELIMITER);
            sbOooO0O0.append(uri.getPort());
            host = sbOooO0O0.toString();
        }
        map.put("Host", host);
        for (Map.Entry entry : defaultRequest.f12069OooO0Oo.entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }
        if (map.get("Content-Type") == null || ((String) map.get("Content-Type")).isEmpty()) {
            map.put("Content-Type", "application/x-www-form-urlencoded; charset=" + StringUtils.OooO00o("UTF-8"));
        }
        InputStream byteArrayInputStream = defaultRequest.f12065OooO;
        HttpMethodName httpMethodName2 = HttpMethodName.PATCH;
        if (httpMethodName == httpMethodName2) {
            httpMethodName = HttpMethodName.POST;
            map.put("X-HTTP-Method-Override", httpMethodName2.toString());
        }
        if (httpMethodName == HttpMethodName.POST && defaultRequest.f12065OooO == null && strOooO0O0 != null) {
            byte[] bytes = strOooO0O0.getBytes(StringUtils.f12681OooO00o);
            byteArrayInputStream = new ByteArrayInputStream(bytes);
            map.put("Content-Length", String.valueOf(bytes.length));
        }
        clientConfiguration.getClass();
        map.put("Accept-Encoding", "identity");
        HttpRequest httpRequest = new HttpRequest(httpMethodName.toString(), URI.create(strOooO00o), map, byteArrayInputStream);
        httpRequest.f12179OooO0o0 = defaultRequest.f12067OooO0O0;
        return httpRequest;
    }
}
