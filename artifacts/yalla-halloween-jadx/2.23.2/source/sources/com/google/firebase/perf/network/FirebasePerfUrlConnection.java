package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import p308o0O0oO.OooO;
import p312o0O0oOO.o000000;
import p312o0O0oOO.o0000Ooo;
import p312o0O0oOO.o000OOo;
import p316o0O0oOo0.o0OO00O;

/* JADX INFO: loaded from: classes3.dex */
public class FirebasePerfUrlConnection {
    @Keep
    public static Object getContent(URL url) throws IOException {
        o0OO00O o0oo00o2 = o0OO00O.f41914OooOo0O;
        Timer timer = new Timer();
        timer.OooO0OO();
        long j = timer.f20004OooO0Oo;
        OooO oooO = new OooO(o0oo00o2);
        try {
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            if (uRLConnectionOpenConnection instanceof HttpsURLConnection) {
                return new o000000((HttpsURLConnection) uRLConnectionOpenConnection, timer, oooO).getContent();
            }
            return uRLConnectionOpenConnection instanceof HttpURLConnection ? new o000OOo((HttpURLConnection) uRLConnectionOpenConnection, timer, oooO).getContent() : uRLConnectionOpenConnection.getContent();
        } catch (IOException e) {
            oooO.OooO0oO(j);
            oooO.OooOO0(timer.OooO00o());
            oooO.OooOO0O(url.toString());
            o0000Ooo.OooO0OO(oooO);
            throw e;
        }
    }

    @Keep
    public static Object instrument(Object obj) throws IOException {
        if (obj instanceof HttpsURLConnection) {
            return new o000000((HttpsURLConnection) obj, new Timer(), new OooO(o0OO00O.f41914OooOo0O));
        }
        return obj instanceof HttpURLConnection ? new o000OOo((HttpURLConnection) obj, new Timer(), new OooO(o0OO00O.f41914OooOo0O)) : obj;
    }

    @Keep
    public static InputStream openStream(URL url) throws IOException {
        o0OO00O o0oo00o2 = o0OO00O.f41914OooOo0O;
        Timer timer = new Timer();
        timer.OooO0OO();
        long j = timer.f20004OooO0Oo;
        OooO oooO = new OooO(o0oo00o2);
        try {
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            if (uRLConnectionOpenConnection instanceof HttpsURLConnection) {
                return new o000000((HttpsURLConnection) uRLConnectionOpenConnection, timer, oooO).getInputStream();
            }
            return uRLConnectionOpenConnection instanceof HttpURLConnection ? new o000OOo((HttpURLConnection) uRLConnectionOpenConnection, timer, oooO).getInputStream() : uRLConnectionOpenConnection.getInputStream();
        } catch (IOException e) {
            oooO.OooO0oO(j);
            oooO.OooOO0(timer.OooO00o());
            oooO.OooOO0O(url.toString());
            o0000Ooo.OooO0OO(oooO);
            throw e;
        }
    }

    @Keep
    public static Object getContent(URL url, Class[] clsArr) throws IOException {
        o0OO00O o0oo00o2 = o0OO00O.f41914OooOo0O;
        Timer timer = new Timer();
        timer.OooO0OO();
        long j = timer.f20004OooO0Oo;
        OooO oooO = new OooO(o0oo00o2);
        try {
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            if (uRLConnectionOpenConnection instanceof HttpsURLConnection) {
                return new o000000((HttpsURLConnection) uRLConnectionOpenConnection, timer, oooO).getContent(clsArr);
            }
            if (uRLConnectionOpenConnection instanceof HttpURLConnection) {
                return new o000OOo((HttpURLConnection) uRLConnectionOpenConnection, timer, oooO).getContent(clsArr);
            }
            return uRLConnectionOpenConnection.getContent(clsArr);
        } catch (IOException e) {
            oooO.OooO0oO(j);
            oooO.OooOO0(timer.OooO00o());
            oooO.OooOO0O(url.toString());
            o0000Ooo.OooO0OO(oooO);
            throw e;
        }
    }
}
