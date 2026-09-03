package com.amazonaws.http;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes2.dex */
public class UrlHttpClient implements HttpClient {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Log f12195OooO0O0 = LogFactory.OooO00o(UrlHttpClient.class);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ClientConfiguration f12196OooO00o;

    public UrlHttpClient(ClientConfiguration clientConfiguration) {
        this.f12196OooO00o = clientConfiguration;
    }

    public final HttpResponse OooO00o(HttpRequest httpRequest) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(httpRequest.f12176OooO0O0.toURL().openConnection()));
        ClientConfiguration clientConfiguration = this.f12196OooO00o;
        clientConfiguration.getClass();
        httpURLConnection.setConnectTimeout(clientConfiguration.f12063OooO0o);
        httpURLConnection.setReadTimeout(clientConfiguration.f12064OooO0o0);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setUseCaches(false);
        if (httpRequest.f12179OooO0o0) {
            httpURLConnection.setChunkedStreamingMode(0);
        }
        if (httpURLConnection instanceof HttpsURLConnection) {
        }
        Map<String, String> map = httpRequest.f12177OooO0OO;
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                if (!key.equals("Content-Length") && !key.equals("Host")) {
                    key.equals("Expect");
                    httpURLConnection.setRequestProperty(key, entry.getValue());
                }
            }
        }
        String str = httpRequest.f12175OooO00o;
        httpURLConnection.setRequestMethod(str);
        InputStream inputStream = httpRequest.f12178OooO0Oo;
        if (inputStream != null && httpRequest.OooO00o() >= 0) {
            httpURLConnection.setDoOutput(true);
            if (!httpRequest.f12179OooO0o0) {
                httpURLConnection.setFixedLengthStreamingMode((int) httpRequest.OooO00o());
            }
            OutputStream outputStream = httpURLConnection.getOutputStream();
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
        if (errorStream == null && !"HEAD".equals(str)) {
            try {
                errorStream = httpURLConnection.getInputStream();
            } catch (IOException unused) {
            }
        }
        HttpResponse.Builder builder = new HttpResponse.Builder();
        builder.f12186OooO0O0 = responseCode;
        builder.f12185OooO00o = responseMessage;
        builder.f12187OooO0OO = errorStream;
        Iterator<Map.Entry<String, List<String>>> it = httpURLConnection.getHeaderFields().entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            HashMap map2 = builder.f12188OooO0Oo;
            if (!zHasNext) {
                return new HttpResponse(builder.f12185OooO00o, builder.f12186OooO0O0, Collections.unmodifiableMap(map2), builder.f12187OooO0OO);
            }
            Map.Entry<String, List<String>> next = it.next();
            if (next.getKey() != null) {
                map2.put(next.getKey(), next.getValue().get(0));
            }
        }
    }
}
