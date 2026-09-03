package com.amazonaws.http;

import OooO00o.OooO00o;
import OooO0o.OooO0OO;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.util.HttpUtils;
import com.amazonaws.util.StringUtils;
import com.facebook.internal.security.CertificateUtil;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import p708oo000o.Oooo0;

/* JADX INFO: loaded from: classes.dex */
public class HttpRequestFactory {
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    public final HttpRequest OooO00o(Request request, ClientConfiguration clientConfiguration) {
        DefaultRequest defaultRequest = (DefaultRequest) request;
        boolean z = true;
        String strOooO00o = HttpUtils.OooO00o(defaultRequest.f10291OooO0o0.toString(), defaultRequest.f10286OooO00o, true);
        String strOooO0O0 = HttpUtils.OooO0O0(request);
        HttpMethodName httpMethodName = defaultRequest.f10293OooO0oo;
        boolean z2 = defaultRequest.f10285OooO != null;
        if ((httpMethodName == HttpMethodName.POST) && !z2) {
            z = false;
        }
        if (strOooO0O0 != null && z) {
            strOooO00o = OooO0OO.OooO00o(strOooO00o, "?", strOooO0O0);
        }
        HashMap map = new HashMap();
        URI uri = defaultRequest.f10291OooO0o0;
        String host = uri.getHost();
        if (HttpUtils.OooO0OO(uri)) {
            StringBuilder sbOooO00o = Oooo0.OooO00o(host, CertificateUtil.DELIMITER);
            sbOooO00o.append(uri.getPort());
            host = sbOooO00o.toString();
        }
        map.put("Host", host);
        for (Map.Entry entry : defaultRequest.f10289OooO0Oo.entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }
        if (map.get("Content-Type") == null || ((String) map.get("Content-Type")).isEmpty()) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("application/x-www-form-urlencoded; charset=");
            sbOooO0o0.append(StringUtils.OooO00o("UTF-8"));
            map.put("Content-Type", sbOooO0o0.toString());
        }
        InputStream byteArrayInputStream = defaultRequest.f10285OooO;
        HttpMethodName httpMethodName2 = HttpMethodName.PATCH;
        if (httpMethodName == httpMethodName2) {
            httpMethodName = HttpMethodName.POST;
            map.put("X-HTTP-Method-Override", httpMethodName2.toString());
        }
        if (httpMethodName == HttpMethodName.POST && defaultRequest.f10285OooO == null && strOooO0O0 != null) {
            byte[] bytes = strOooO0O0.getBytes(StringUtils.f11186OooO00o);
            byteArrayInputStream = new ByteArrayInputStream(bytes);
            map.put("Content-Length", String.valueOf(bytes.length));
        }
        Objects.requireNonNull(clientConfiguration);
        map.put("Accept-Encoding", "identity");
        HttpRequest httpRequest = new HttpRequest(httpMethodName.toString(), URI.create(strOooO00o), map, byteArrayInputStream);
        httpRequest.f10395OooO0o0 = defaultRequest.f10287OooO0O0;
        return httpRequest;
    }
}
