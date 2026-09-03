package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import o0O0oo00.OooOOO;
import p306o0O0oO.o00oO0o;
import p306o0O0oO.o0ooOOo;
import p308o0O0oO0O.o00O0O;
import p634o0ooO0oO.o00O00o0;
import p634o0ooO0oO.o00OO;
import p634o0ooO0oO.o00OOO0;
import p634o0ooO0oO.o00OOOOo;
import p634o0ooO0oO.o0O0o;
import p634o0ooO0oO.o0oOOo;
import p634o0ooO0oO.oo00o;
import p634o0ooO0oO.oo00oO;

/* JADX INFO: loaded from: classes3.dex */
public class FirebasePerfOkHttpClient {
    public static void OooO00o(o0oOOo o0oooo, o00O0O o00o0o2, long j, long j2) throws IOException {
        o00OOOOo o00ooooo2 = o0oooo.f57342OooO0Oo;
        if (o00ooooo2 == null) {
            return;
        }
        o00OO o00oo2 = o00ooooo2.f57313OooO00o;
        o00oo2.getClass();
        try {
            o00o0o2.OooOO0O(new URL(o00oo2.f57202OooO).toString());
            o00o0o2.OooO0Oo(o00ooooo2.f57314OooO0O0);
            oo00oO oo00oo = o00ooooo2.f57316OooO0Oo;
            if (oo00oo != null) {
                long jContentLength = oo00oo.contentLength();
                if (jContentLength != -1) {
                    o00o0o2.OooO0o(jContentLength);
                }
            }
            o0O0o o0o0o = o0oooo.f57347OooOO0;
            if (o0o0o != null) {
                long jOooO0OO = o0o0o.OooO0OO();
                if (jOooO0OO != -1) {
                    o00o0o2.OooO(jOooO0OO);
                }
                o00OOO0 o00ooo0OooO0oO = o0o0o.OooO0oO();
                if (o00ooo0OooO0oO != null) {
                    o00o0o2.OooO0oo(o00ooo0OooO0oO.f57235OooO00o);
                }
            }
            o00o0o2.OooO0o0(o0oooo.f57345OooO0oO);
            o00o0o2.OooO0oO(j);
            o00o0o2.OooOO0(j2);
            o00o0o2.OooO0O0();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    @Keep
    public static void enqueue(o00O00o0 o00o00o1, oo00o oo00oVar) {
        Timer timer = new Timer();
        o00o00o1.OooOOo0(new o00oO0o(oo00oVar, OooOOO.f42635OooOo0O, timer, timer.f20477OooO0Oo));
    }

    @Keep
    public static o0oOOo execute(o00O00o0 o00o00o1) throws IOException {
        o00O0O o00o0o2 = new o00O0O(OooOOO.f42635OooOo0O);
        Timer timer = new Timer();
        long j = timer.f20477OooO0Oo;
        try {
            o0oOOo o0ooooOooO0OO = o00o00o1.OooO0OO();
            OooO00o(o0ooooOooO0OO, o00o0o2, j, timer.OooO00o());
            return o0ooooOooO0OO;
        } catch (IOException e) {
            o00OOOOo o00oooooOooO00o = o00o00o1.OooO00o();
            if (o00oooooOooO00o != null) {
                o00OO o00oo2 = o00oooooOooO00o.f57313OooO00o;
                if (o00oo2 != null) {
                    try {
                        o00o0o2.OooOO0O(new URL(o00oo2.f57202OooO).toString());
                    } catch (MalformedURLException e2) {
                        throw new RuntimeException(e2);
                    }
                }
                String str = o00oooooOooO00o.f57314OooO0O0;
                if (str != null) {
                    o00o0o2.OooO0Oo(str);
                }
            }
            o00o0o2.OooO0oO(j);
            o00o0o2.OooOO0(timer.OooO00o());
            o0ooOOo.OooO0OO(o00o0o2);
            throw e;
        }
    }
}
