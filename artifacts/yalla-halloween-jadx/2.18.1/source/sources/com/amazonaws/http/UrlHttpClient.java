package com.amazonaws.http;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.qiniu.android.http.request.Request;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes.dex */
public class UrlHttpClient implements HttpClient {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Log f10411OooO0O0 = LogFactory.OooO00o(UrlHttpClient.class);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ClientConfiguration f10412OooO00o;

    public UrlHttpClient(ClientConfiguration clientConfiguration) {
        this.f10412OooO00o = clientConfiguration;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    public final HttpResponse OooO00o(HttpRequest httpRequest) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) httpRequest.f10392OooO0O0.toURL().openConnection();
        Objects.requireNonNull(this.f10412OooO00o);
        httpURLConnection.setConnectTimeout(this.f10412OooO00o.f10283OooO0o);
        httpURLConnection.setReadTimeout(this.f10412OooO00o.f10284OooO0o0);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setUseCaches(false);
        if (httpRequest.f10395OooO0o0) {
            httpURLConnection.setChunkedStreamingMode(0);
        }
        if (httpURLConnection instanceof HttpsURLConnection) {
            Objects.requireNonNull(this.f10412OooO00o);
        }
        Map<String, String> map = httpRequest.f10393OooO0OO;
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : httpRequest.f10393OooO0OO.entrySet()) {
                String key = entry.getKey();
                if (!key.equals("Content-Length") && !key.equals("Host")) {
                    key.equals("Expect");
                    httpURLConnection.setRequestProperty(key, entry.getValue());
                }
            }
        }
        httpURLConnection.setRequestMethod(httpRequest.f10391OooO00o);
        if (httpRequest.f10394OooO0Oo != null && httpRequest.OooO00o() >= 0) {
            httpURLConnection.setDoOutput(true);
            if (!httpRequest.f10395OooO0o0) {
                httpURLConnection.setFixedLengthStreamingMode((int) httpRequest.OooO00o());
            }
            OutputStream outputStream = httpURLConnection.getOutputStream();
            InputStream inputStream = httpRequest.f10394OooO0Oo;
            byte[] bArr = new byte[8192];
            while (true) {
                int i = inputStream.read(bArr);
                if (i == -1) {
                    break;
                }
                outputStream.write(bArr, 0, i);
            }
            outputStream.flush();
            outputStream.close();
        }
        String responseMessage = httpURLConnection.getResponseMessage();
        int responseCode = httpURLConnection.getResponseCode();
        InputStream errorStream = httpURLConnection.getErrorStream();
        if (errorStream == null && !Request.HttpMethodHEAD.equals(httpRequest.f10391OooO00o)) {
            try {
                errorStream = httpURLConnection.getInputStream();
            } catch (IOException unused) {
            }
        }
        HttpResponse.Builder builder = new HttpResponse.Builder();
        builder.f10402OooO0O0 = responseCode;
        builder.f10401OooO00o = responseMessage;
        builder.f10403OooO0OO = errorStream;
        for (Map.Entry<String, List<String>> entry2 : httpURLConnection.getHeaderFields().entrySet()) {
            if (entry2.getKey() != null) {
                builder.f10404OooO0Oo.put(entry2.getKey(), entry2.getValue().get(0));
            }
        }
        return new HttpResponse(builder.f10401OooO00o, builder.f10402OooO0O0, Collections.unmodifiableMap(builder.f10404OooO0Oo), builder.f10403OooO0OO, null);
    }
}
