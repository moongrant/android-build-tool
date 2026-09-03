package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import p308o0O0oO.OooO;
import p312o0O0oOO.o00000OO;
import p312o0O0oOO.o0000Ooo;
import p316o0O0oOo0.o0OO00O;
import p641o0ooOO0o.o00OO;
import p641o0ooOO0o.o00OOO00;
import p641o0ooOO0o.o0O000O;
import p641o0ooOO0o.o0O000Oo;
import p641o0ooOO0o.o0O00O0o;
import p641o0ooOO0o.o0O00o00;
import p641o0ooOO0o.o0O00oO0;
import p641o0ooOO0o.o0oO0Ooo;

/* JADX INFO: loaded from: classes3.dex */
public class FirebasePerfOkHttpClient {
    public static void OooO00o(o0O00o00 o0o00o01, OooO oooO, long j, long j2) throws IOException {
        o0O00O0o o0o00o0o = o0o00o01.f57847OooO0Oo;
        if (o0o00o0o == null) {
            return;
        }
        o0O000O o0o000o = o0o00o0o.f57828OooO00o;
        o0o000o.getClass();
        try {
            oooO.OooOO0O(new URL(o0o000o.f57788OooO).toString());
            oooO.OooO0Oo(o0o00o0o.f57829OooO0O0);
            o0oO0Ooo o0oo0ooo2 = o0o00o0o.f57831OooO0Oo;
            if (o0oo0ooo2 != null) {
                long jContentLength = o0oo0ooo2.contentLength();
                if (jContentLength != -1) {
                    oooO.OooO0o(jContentLength);
                }
            }
            o0O00oO0 o0o00oo1 = o0o00o01.f57852OooOO0;
            if (o0o00oo1 != null) {
                long jOooO0OO = o0o00oo1.OooO0OO();
                if (jOooO0OO != -1) {
                    oooO.OooO(jOooO0OO);
                }
                o0O000Oo o0o000ooOooO0oO = o0o00oo1.OooO0oO();
                if (o0o000ooOooO0oO != null) {
                    oooO.OooO0oo(o0o000ooOooO0oO.f57808OooO00o);
                }
            }
            oooO.OooO0o0(o0o00o01.f57850OooO0oO);
            oooO.OooO0oO(j);
            oooO.OooOO0(j2);
            oooO.OooO0O0();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    @Keep
    public static void enqueue(o00OO o00oo2, o00OOO00 o00ooo00) {
        Timer timer = new Timer();
        o00oo2.OoooOOO(new o00000OO(o00ooo00, o0OO00O.f41914OooOo0O, timer, timer.f20004OooO0Oo));
    }

    @Keep
    public static o0O00o00 execute(o00OO o00oo2) throws IOException {
        OooO oooO = new OooO(o0OO00O.f41914OooOo0O);
        Timer timer = new Timer();
        long j = timer.f20004OooO0Oo;
        try {
            o0O00o00 o0o00o00OooO0OO = o00oo2.OooO0OO();
            OooO00o(o0o00o00OooO0OO, oooO, j, timer.OooO00o());
            return o0o00o00OooO0OO;
        } catch (IOException e) {
            o0O00O0o o0o00o0oOooO00o = o00oo2.OooO00o();
            if (o0o00o0oOooO00o != null) {
                o0O000O o0o000o = o0o00o0oOooO00o.f57828OooO00o;
                if (o0o000o != null) {
                    try {
                        oooO.OooOO0O(new URL(o0o000o.f57788OooO).toString());
                    } catch (MalformedURLException e2) {
                        throw new RuntimeException(e2);
                    }
                }
                String str = o0o00o0oOooO00o.f57829OooO0O0;
                if (str != null) {
                    oooO.OooO0Oo(str);
                }
            }
            oooO.OooO0oO(j);
            oooO.OooOO0(timer.OooO00o());
            o0000Ooo.OooO0OO(oooO);
            throw e;
        }
    }
}
