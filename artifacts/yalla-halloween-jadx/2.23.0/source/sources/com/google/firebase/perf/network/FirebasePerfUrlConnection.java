package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import o0O0oo00.OooOOO;
import p306o0O0oO.o000oOoO;
import p306o0O0oO.o0OoOo0;
import p306o0O0oO.o0ooOOo;
import p308o0O0oO0O.o00O0O;

/* JADX INFO: loaded from: classes3.dex */
public class FirebasePerfUrlConnection {
    @Keep
    public static Object getContent(URL url) throws IOException {
        OooOOO oooOOO = OooOOO.f42635OooOo0O;
        Timer timer = new Timer();
        timer.OooO0OO();
        long j = timer.f20477OooO0Oo;
        o00O0O o00o0o2 = new o00O0O(oooOOO);
        try {
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            if (uRLConnectionOpenConnection instanceof HttpsURLConnection) {
                return new o0OoOo0((HttpsURLConnection) uRLConnectionOpenConnection, timer, o00o0o2).getContent();
            }
            return uRLConnectionOpenConnection instanceof HttpURLConnection ? new o000oOoO((HttpURLConnection) uRLConnectionOpenConnection, timer, o00o0o2).getContent() : uRLConnectionOpenConnection.getContent();
        } catch (IOException e) {
            o00o0o2.OooO0oO(j);
            o00o0o2.OooOO0(timer.OooO00o());
            o00o0o2.OooOO0O(url.toString());
            o0ooOOo.OooO0OO(o00o0o2);
            throw e;
        }
    }

    @Keep
    public static Object instrument(Object obj) throws IOException {
        if (obj instanceof HttpsURLConnection) {
            return new o0OoOo0((HttpsURLConnection) obj, new Timer(), new o00O0O(OooOOO.f42635OooOo0O));
        }
        return obj instanceof HttpURLConnection ? new o000oOoO((HttpURLConnection) obj, new Timer(), new o00O0O(OooOOO.f42635OooOo0O)) : obj;
    }

    @Keep
    public static InputStream openStream(URL url) throws IOException {
        OooOOO oooOOO = OooOOO.f42635OooOo0O;
        Timer timer = new Timer();
        timer.OooO0OO();
        long j = timer.f20477OooO0Oo;
        o00O0O o00o0o2 = new o00O0O(oooOOO);
        try {
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            if (uRLConnectionOpenConnection instanceof HttpsURLConnection) {
                return new o0OoOo0((HttpsURLConnection) uRLConnectionOpenConnection, timer, o00o0o2).getInputStream();
            }
            return uRLConnectionOpenConnection instanceof HttpURLConnection ? new o000oOoO((HttpURLConnection) uRLConnectionOpenConnection, timer, o00o0o2).getInputStream() : uRLConnectionOpenConnection.getInputStream();
        } catch (IOException e) {
            o00o0o2.OooO0oO(j);
            o00o0o2.OooOO0(timer.OooO00o());
            o00o0o2.OooOO0O(url.toString());
            o0ooOOo.OooO0OO(o00o0o2);
            throw e;
        }
    }

    @Keep
    public static Object getContent(URL url, Class[] clsArr) throws IOException {
        OooOOO oooOOO = OooOOO.f42635OooOo0O;
        Timer timer = new Timer();
        timer.OooO0OO();
        long j = timer.f20477OooO0Oo;
        o00O0O o00o0o2 = new o00O0O(oooOOO);
        try {
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            if (uRLConnectionOpenConnection instanceof HttpsURLConnection) {
                return new o0OoOo0((HttpsURLConnection) uRLConnectionOpenConnection, timer, o00o0o2).getContent(clsArr);
            }
            if (uRLConnectionOpenConnection instanceof HttpURLConnection) {
                return new o000oOoO((HttpURLConnection) uRLConnectionOpenConnection, timer, o00o0o2).getContent(clsArr);
            }
            return uRLConnectionOpenConnection.getContent(clsArr);
        } catch (IOException e) {
            o00o0o2.OooO0oO(j);
            o00o0o2.OooOO0(timer.OooO00o());
            o00o0o2.OooOO0O(url.toString());
            o0ooOOo.OooO0OO(o00o0o2);
            throw e;
        }
    }
}
