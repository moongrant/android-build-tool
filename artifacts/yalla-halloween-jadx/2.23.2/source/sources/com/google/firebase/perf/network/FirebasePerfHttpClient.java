package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import androidx.compose.animation.OooOOO;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;
import p308o0O0oO.OooO;
import p312o0O0oOO.o00000O;
import p312o0O0oOO.o0000Ooo;
import p316o0O0oOo0.o0OO00O;

/* JADX INFO: loaded from: classes3.dex */
public class FirebasePerfHttpClient {
    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest) throws IOException {
        Timer timer = new Timer();
        OooO oooOOooO0OO = OooO.OooO0OO(o0OO00O.f41914OooOo0O);
        try {
            oooOOooO0OO.OooOO0O(httpUriRequest.getURI().toString());
            oooOOooO0OO.OooO0Oo(httpUriRequest.getMethod());
            Long lOooO00o = o0000Ooo.OooO00o(httpUriRequest);
            if (lOooO00o != null) {
                oooOOooO0OO.OooO0o(lOooO00o.longValue());
            }
            timer.OooO0OO();
            oooOOooO0OO.OooO0oO(timer.OooO0O0());
            HttpResponse httpResponseExecute = httpClient.execute(httpUriRequest);
            oooOOooO0OO.OooOO0(timer.OooO00o());
            oooOOooO0OO.OooO0o0(httpResponseExecute.getStatusLine().getStatusCode());
            Long lOooO00o2 = o0000Ooo.OooO00o(httpResponseExecute);
            if (lOooO00o2 != null) {
                oooOOooO0OO.OooO(lOooO00o2.longValue());
            }
            String strOooO0O0 = o0000Ooo.OooO0O0(httpResponseExecute);
            if (strOooO0O0 != null) {
                oooOOooO0OO.OooO0oo(strOooO0O0);
            }
            oooOOooO0OO.OooO0O0();
            return httpResponseExecute;
        } catch (IOException e) {
            OooOOO.OooO00o(timer, oooOOooO0OO, oooOOooO0OO);
            throw e;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext) throws IOException {
        Timer timer = new Timer();
        OooO oooOOooO0OO = OooO.OooO0OO(o0OO00O.f41914OooOo0O);
        try {
            oooOOooO0OO.OooOO0O(httpUriRequest.getURI().toString());
            oooOOooO0OO.OooO0Oo(httpUriRequest.getMethod());
            Long lOooO00o = o0000Ooo.OooO00o(httpUriRequest);
            if (lOooO00o != null) {
                oooOOooO0OO.OooO0o(lOooO00o.longValue());
            }
            timer.OooO0OO();
            oooOOooO0OO.OooO0oO(timer.OooO0O0());
            HttpResponse httpResponseExecute = httpClient.execute(httpUriRequest, httpContext);
            oooOOooO0OO.OooOO0(timer.OooO00o());
            oooOOooO0OO.OooO0o0(httpResponseExecute.getStatusLine().getStatusCode());
            Long lOooO00o2 = o0000Ooo.OooO00o(httpResponseExecute);
            if (lOooO00o2 != null) {
                oooOOooO0OO.OooO(lOooO00o2.longValue());
            }
            String strOooO0O0 = o0000Ooo.OooO0O0(httpResponseExecute);
            if (strOooO0O0 != null) {
                oooOOooO0OO.OooO0oo(strOooO0O0);
            }
            oooOOooO0OO.OooO0O0();
            return httpResponseExecute;
        } catch (IOException e) {
            OooOOO.OooO00o(timer, oooOOooO0OO, oooOOooO0OO);
            throw e;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler) throws IOException {
        Timer timer = new Timer();
        OooO oooOOooO0OO = OooO.OooO0OO(o0OO00O.f41914OooOo0O);
        try {
            oooOOooO0OO.OooOO0O(httpUriRequest.getURI().toString());
            oooOOooO0OO.OooO0Oo(httpUriRequest.getMethod());
            Long lOooO00o = o0000Ooo.OooO00o(httpUriRequest);
            if (lOooO00o != null) {
                oooOOooO0OO.OooO0o(lOooO00o.longValue());
            }
            timer.OooO0OO();
            oooOOooO0OO.OooO0oO(timer.OooO0O0());
            return (T) httpClient.execute(httpUriRequest, new o00000O(responseHandler, timer, oooOOooO0OO));
        } catch (IOException e) {
            OooOOO.OooO00o(timer, oooOOooO0OO, oooOOooO0OO);
            throw e;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, HttpContext httpContext) throws IOException {
        Timer timer = new Timer();
        OooO oooOOooO0OO = OooO.OooO0OO(o0OO00O.f41914OooOo0O);
        try {
            oooOOooO0OO.OooOO0O(httpUriRequest.getURI().toString());
            oooOOooO0OO.OooO0Oo(httpUriRequest.getMethod());
            Long lOooO00o = o0000Ooo.OooO00o(httpUriRequest);
            if (lOooO00o != null) {
                oooOOooO0OO.OooO0o(lOooO00o.longValue());
            }
            timer.OooO0OO();
            oooOOooO0OO.OooO0oO(timer.OooO0O0());
            return (T) httpClient.execute(httpUriRequest, new o00000O(responseHandler, timer, oooOOooO0OO), httpContext);
        } catch (IOException e) {
            OooOOO.OooO00o(timer, oooOOooO0OO, oooOOooO0OO);
            throw e;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest) throws IOException {
        Timer timer = new Timer();
        OooO oooOOooO0OO = OooO.OooO0OO(o0OO00O.f41914OooOo0O);
        try {
            oooOOooO0OO.OooOO0O(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            oooOOooO0OO.OooO0Oo(httpRequest.getRequestLine().getMethod());
            Long lOooO00o = o0000Ooo.OooO00o(httpRequest);
            if (lOooO00o != null) {
                oooOOooO0OO.OooO0o(lOooO00o.longValue());
            }
            timer.OooO0OO();
            oooOOooO0OO.OooO0oO(timer.OooO0O0());
            HttpResponse httpResponseExecute = httpClient.execute(httpHost, httpRequest);
            oooOOooO0OO.OooOO0(timer.OooO00o());
            oooOOooO0OO.OooO0o0(httpResponseExecute.getStatusLine().getStatusCode());
            Long lOooO00o2 = o0000Ooo.OooO00o(httpResponseExecute);
            if (lOooO00o2 != null) {
                oooOOooO0OO.OooO(lOooO00o2.longValue());
            }
            String strOooO0O0 = o0000Ooo.OooO0O0(httpResponseExecute);
            if (strOooO0O0 != null) {
                oooOOooO0OO.OooO0oo(strOooO0O0);
            }
            oooOOooO0OO.OooO0O0();
            return httpResponseExecute;
        } catch (IOException e) {
            OooOOO.OooO00o(timer, oooOOooO0OO, oooOOooO0OO);
            throw e;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) throws IOException {
        Timer timer = new Timer();
        OooO oooOOooO0OO = OooO.OooO0OO(o0OO00O.f41914OooOo0O);
        try {
            oooOOooO0OO.OooOO0O(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            oooOOooO0OO.OooO0Oo(httpRequest.getRequestLine().getMethod());
            Long lOooO00o = o0000Ooo.OooO00o(httpRequest);
            if (lOooO00o != null) {
                oooOOooO0OO.OooO0o(lOooO00o.longValue());
            }
            timer.OooO0OO();
            oooOOooO0OO.OooO0oO(timer.OooO0O0());
            HttpResponse httpResponseExecute = httpClient.execute(httpHost, httpRequest, httpContext);
            oooOOooO0OO.OooOO0(timer.OooO00o());
            oooOOooO0OO.OooO0o0(httpResponseExecute.getStatusLine().getStatusCode());
            Long lOooO00o2 = o0000Ooo.OooO00o(httpResponseExecute);
            if (lOooO00o2 != null) {
                oooOOooO0OO.OooO(lOooO00o2.longValue());
            }
            String strOooO0O0 = o0000Ooo.OooO0O0(httpResponseExecute);
            if (strOooO0O0 != null) {
                oooOOooO0OO.OooO0oo(strOooO0O0);
            }
            oooOOooO0OO.OooO0O0();
            return httpResponseExecute;
        } catch (IOException e) {
            OooOOO.OooO00o(timer, oooOOooO0OO, oooOOooO0OO);
            throw e;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) throws IOException {
        Timer timer = new Timer();
        OooO oooOOooO0OO = OooO.OooO0OO(o0OO00O.f41914OooOo0O);
        try {
            oooOOooO0OO.OooOO0O(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            oooOOooO0OO.OooO0Oo(httpRequest.getRequestLine().getMethod());
            Long lOooO00o = o0000Ooo.OooO00o(httpRequest);
            if (lOooO00o != null) {
                oooOOooO0OO.OooO0o(lOooO00o.longValue());
            }
            timer.OooO0OO();
            oooOOooO0OO.OooO0oO(timer.OooO0O0());
            return (T) httpClient.execute(httpHost, httpRequest, new o00000O(responseHandler, timer, oooOOooO0OO));
        } catch (IOException e) {
            OooOOO.OooO00o(timer, oooOOooO0OO, oooOOooO0OO);
            throw e;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) throws IOException {
        Timer timer = new Timer();
        OooO oooOOooO0OO = OooO.OooO0OO(o0OO00O.f41914OooOo0O);
        try {
            oooOOooO0OO.OooOO0O(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            oooOOooO0OO.OooO0Oo(httpRequest.getRequestLine().getMethod());
            Long lOooO00o = o0000Ooo.OooO00o(httpRequest);
            if (lOooO00o != null) {
                oooOOooO0OO.OooO0o(lOooO00o.longValue());
            }
            timer.OooO0OO();
            oooOOooO0OO.OooO0oO(timer.OooO0O0());
            return (T) httpClient.execute(httpHost, httpRequest, new o00000O(responseHandler, timer, oooOOooO0OO), httpContext);
        } catch (IOException e) {
            OooOOO.OooO00o(timer, oooOOooO0OO, oooOOooO0OO);
            throw e;
        }
    }
}
