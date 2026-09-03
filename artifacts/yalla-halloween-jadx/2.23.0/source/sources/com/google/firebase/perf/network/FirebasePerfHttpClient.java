package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import o0O0oo00.OooOOO;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;
import p306o0O0oO.OooOo;
import p306o0O0oO.o0ooOOo;
import p306o0O0oO.oo000o;
import p308o0O0oO0O.o00O0O;

/* JADX INFO: loaded from: classes3.dex */
public class FirebasePerfHttpClient {
    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest) throws IOException {
        Timer timer = new Timer();
        o00O0O o00o0oOooO0OO = o00O0O.OooO0OO(OooOOO.f42635OooOo0O);
        try {
            o00o0oOooO0OO.OooOO0O(httpUriRequest.getURI().toString());
            o00o0oOooO0OO.OooO0Oo(httpUriRequest.getMethod());
            Long lOooO00o = o0ooOOo.OooO00o(httpUriRequest);
            if (lOooO00o != null) {
                o00o0oOooO0OO.OooO0o(lOooO00o.longValue());
            }
            timer.OooO0OO();
            o00o0oOooO0OO.OooO0oO(timer.OooO0O0());
            HttpResponse httpResponseExecute = httpClient.execute(httpUriRequest);
            o00o0oOooO0OO.OooOO0(timer.OooO00o());
            o00o0oOooO0OO.OooO0o0(httpResponseExecute.getStatusLine().getStatusCode());
            Long lOooO00o2 = o0ooOOo.OooO00o(httpResponseExecute);
            if (lOooO00o2 != null) {
                o00o0oOooO0OO.OooO(lOooO00o2.longValue());
            }
            String strOooO0O0 = o0ooOOo.OooO0O0(httpResponseExecute);
            if (strOooO0O0 != null) {
                o00o0oOooO0OO.OooO0oo(strOooO0O0);
            }
            o00o0oOooO0OO.OooO0O0();
            return httpResponseExecute;
        } catch (IOException e) {
            OooOo.OooO00o(timer, o00o0oOooO0OO, o00o0oOooO0OO);
            throw e;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext) throws IOException {
        Timer timer = new Timer();
        o00O0O o00o0oOooO0OO = o00O0O.OooO0OO(OooOOO.f42635OooOo0O);
        try {
            o00o0oOooO0OO.OooOO0O(httpUriRequest.getURI().toString());
            o00o0oOooO0OO.OooO0Oo(httpUriRequest.getMethod());
            Long lOooO00o = o0ooOOo.OooO00o(httpUriRequest);
            if (lOooO00o != null) {
                o00o0oOooO0OO.OooO0o(lOooO00o.longValue());
            }
            timer.OooO0OO();
            o00o0oOooO0OO.OooO0oO(timer.OooO0O0());
            HttpResponse httpResponseExecute = httpClient.execute(httpUriRequest, httpContext);
            o00o0oOooO0OO.OooOO0(timer.OooO00o());
            o00o0oOooO0OO.OooO0o0(httpResponseExecute.getStatusLine().getStatusCode());
            Long lOooO00o2 = o0ooOOo.OooO00o(httpResponseExecute);
            if (lOooO00o2 != null) {
                o00o0oOooO0OO.OooO(lOooO00o2.longValue());
            }
            String strOooO0O0 = o0ooOOo.OooO0O0(httpResponseExecute);
            if (strOooO0O0 != null) {
                o00o0oOooO0OO.OooO0oo(strOooO0O0);
            }
            o00o0oOooO0OO.OooO0O0();
            return httpResponseExecute;
        } catch (IOException e) {
            OooOo.OooO00o(timer, o00o0oOooO0OO, o00o0oOooO0OO);
            throw e;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler) throws IOException {
        Timer timer = new Timer();
        o00O0O o00o0oOooO0OO = o00O0O.OooO0OO(OooOOO.f42635OooOo0O);
        try {
            o00o0oOooO0OO.OooOO0O(httpUriRequest.getURI().toString());
            o00o0oOooO0OO.OooO0Oo(httpUriRequest.getMethod());
            Long lOooO00o = o0ooOOo.OooO00o(httpUriRequest);
            if (lOooO00o != null) {
                o00o0oOooO0OO.OooO0o(lOooO00o.longValue());
            }
            timer.OooO0OO();
            o00o0oOooO0OO.OooO0oO(timer.OooO0O0());
            return (T) httpClient.execute(httpUriRequest, new oo000o(responseHandler, timer, o00o0oOooO0OO));
        } catch (IOException e) {
            OooOo.OooO00o(timer, o00o0oOooO0OO, o00o0oOooO0OO);
            throw e;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, HttpContext httpContext) throws IOException {
        Timer timer = new Timer();
        o00O0O o00o0oOooO0OO = o00O0O.OooO0OO(OooOOO.f42635OooOo0O);
        try {
            o00o0oOooO0OO.OooOO0O(httpUriRequest.getURI().toString());
            o00o0oOooO0OO.OooO0Oo(httpUriRequest.getMethod());
            Long lOooO00o = o0ooOOo.OooO00o(httpUriRequest);
            if (lOooO00o != null) {
                o00o0oOooO0OO.OooO0o(lOooO00o.longValue());
            }
            timer.OooO0OO();
            o00o0oOooO0OO.OooO0oO(timer.OooO0O0());
            return (T) httpClient.execute(httpUriRequest, new oo000o(responseHandler, timer, o00o0oOooO0OO), httpContext);
        } catch (IOException e) {
            OooOo.OooO00o(timer, o00o0oOooO0OO, o00o0oOooO0OO);
            throw e;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest) throws IOException {
        Timer timer = new Timer();
        o00O0O o00o0oOooO0OO = o00O0O.OooO0OO(OooOOO.f42635OooOo0O);
        try {
            o00o0oOooO0OO.OooOO0O(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            o00o0oOooO0OO.OooO0Oo(httpRequest.getRequestLine().getMethod());
            Long lOooO00o = o0ooOOo.OooO00o(httpRequest);
            if (lOooO00o != null) {
                o00o0oOooO0OO.OooO0o(lOooO00o.longValue());
            }
            timer.OooO0OO();
            o00o0oOooO0OO.OooO0oO(timer.OooO0O0());
            HttpResponse httpResponseExecute = httpClient.execute(httpHost, httpRequest);
            o00o0oOooO0OO.OooOO0(timer.OooO00o());
            o00o0oOooO0OO.OooO0o0(httpResponseExecute.getStatusLine().getStatusCode());
            Long lOooO00o2 = o0ooOOo.OooO00o(httpResponseExecute);
            if (lOooO00o2 != null) {
                o00o0oOooO0OO.OooO(lOooO00o2.longValue());
            }
            String strOooO0O0 = o0ooOOo.OooO0O0(httpResponseExecute);
            if (strOooO0O0 != null) {
                o00o0oOooO0OO.OooO0oo(strOooO0O0);
            }
            o00o0oOooO0OO.OooO0O0();
            return httpResponseExecute;
        } catch (IOException e) {
            OooOo.OooO00o(timer, o00o0oOooO0OO, o00o0oOooO0OO);
            throw e;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) throws IOException {
        Timer timer = new Timer();
        o00O0O o00o0oOooO0OO = o00O0O.OooO0OO(OooOOO.f42635OooOo0O);
        try {
            o00o0oOooO0OO.OooOO0O(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            o00o0oOooO0OO.OooO0Oo(httpRequest.getRequestLine().getMethod());
            Long lOooO00o = o0ooOOo.OooO00o(httpRequest);
            if (lOooO00o != null) {
                o00o0oOooO0OO.OooO0o(lOooO00o.longValue());
            }
            timer.OooO0OO();
            o00o0oOooO0OO.OooO0oO(timer.OooO0O0());
            HttpResponse httpResponseExecute = httpClient.execute(httpHost, httpRequest, httpContext);
            o00o0oOooO0OO.OooOO0(timer.OooO00o());
            o00o0oOooO0OO.OooO0o0(httpResponseExecute.getStatusLine().getStatusCode());
            Long lOooO00o2 = o0ooOOo.OooO00o(httpResponseExecute);
            if (lOooO00o2 != null) {
                o00o0oOooO0OO.OooO(lOooO00o2.longValue());
            }
            String strOooO0O0 = o0ooOOo.OooO0O0(httpResponseExecute);
            if (strOooO0O0 != null) {
                o00o0oOooO0OO.OooO0oo(strOooO0O0);
            }
            o00o0oOooO0OO.OooO0O0();
            return httpResponseExecute;
        } catch (IOException e) {
            OooOo.OooO00o(timer, o00o0oOooO0OO, o00o0oOooO0OO);
            throw e;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) throws IOException {
        Timer timer = new Timer();
        o00O0O o00o0oOooO0OO = o00O0O.OooO0OO(OooOOO.f42635OooOo0O);
        try {
            o00o0oOooO0OO.OooOO0O(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            o00o0oOooO0OO.OooO0Oo(httpRequest.getRequestLine().getMethod());
            Long lOooO00o = o0ooOOo.OooO00o(httpRequest);
            if (lOooO00o != null) {
                o00o0oOooO0OO.OooO0o(lOooO00o.longValue());
            }
            timer.OooO0OO();
            o00o0oOooO0OO.OooO0oO(timer.OooO0O0());
            return (T) httpClient.execute(httpHost, httpRequest, new oo000o(responseHandler, timer, o00o0oOooO0OO));
        } catch (IOException e) {
            OooOo.OooO00o(timer, o00o0oOooO0OO, o00o0oOooO0OO);
            throw e;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) throws IOException {
        Timer timer = new Timer();
        o00O0O o00o0oOooO0OO = o00O0O.OooO0OO(OooOOO.f42635OooOo0O);
        try {
            o00o0oOooO0OO.OooOO0O(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            o00o0oOooO0OO.OooO0Oo(httpRequest.getRequestLine().getMethod());
            Long lOooO00o = o0ooOOo.OooO00o(httpRequest);
            if (lOooO00o != null) {
                o00o0oOooO0OO.OooO0o(lOooO00o.longValue());
            }
            timer.OooO0OO();
            o00o0oOooO0OO.OooO0oO(timer.OooO0O0());
            return (T) httpClient.execute(httpHost, httpRequest, new oo000o(responseHandler, timer, o00o0oOooO0OO), httpContext);
        } catch (IOException e) {
            OooOo.OooO00o(timer, o00o0oOooO0OO, o00o0oOooO0OO);
            throw e;
        }
    }
}
