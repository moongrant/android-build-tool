package com.squareup.picasso;

import android.content.Context;
import android.net.Uri;
import com.zego.zegoavkit2.ZegoConstants;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OoOo0 implements Downloader {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final com.squareup.okhttp.o00Oo0 f21847OooO00o;

    public o0OoOo0(Context context) {
        StringBuilder sb = o000000O.f21773OooO00o;
        File file = new File(context.getApplicationContext().getCacheDir(), "picasso-cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        long jOooO00o = o000000O.OooO00o(file);
        com.squareup.okhttp.o00Oo0 o00oo1 = new com.squareup.okhttp.o00Oo0();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (timeUnit == null) {
            throw new IllegalArgumentException("unit == null");
        }
        long millis = timeUnit.toMillis(15000L);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException("Timeout too large.");
        }
        if (millis == 0) {
            throw new IllegalArgumentException("Timeout too small.");
        }
        o00oo1.f21618OooOoO0 = (int) millis;
        long millis2 = timeUnit.toMillis(20000L);
        if (millis2 > 2147483647L) {
            throw new IllegalArgumentException("Timeout too large.");
        }
        if (millis2 == 0) {
            throw new IllegalArgumentException("Timeout too small.");
        }
        o00oo1.f21617OooOoO = (int) millis2;
        long millis3 = timeUnit.toMillis(20000L);
        if (millis3 > 2147483647L) {
            throw new IllegalArgumentException("Timeout too large.");
        }
        if (millis3 == 0) {
            throw new IllegalArgumentException("Timeout too small.");
        }
        o00oo1.f21619OooOoOO = (int) millis3;
        this.f21847OooO00o = o00oo1;
        try {
            o00oo1.f21605OooOOO = new com.squareup.okhttp.OooO0OO(file, jOooO00o);
            o00oo1.f21606OooOOO0 = null;
        } catch (IOException unused) {
        }
    }

    @Override // com.squareup.picasso.Downloader
    public final Downloader.OooO00o OooO00o(Uri uri, int i) throws IOException {
        com.squareup.okhttp.OooO oooO;
        if (i != 0) {
            if ((NetworkPolicy.OFFLINE.index & i) != 0) {
                oooO = com.squareup.okhttp.OooO.f21497OooOOO0;
            } else {
                com.squareup.okhttp.OooO.OooO00o oooO00o = new com.squareup.okhttp.OooO.OooO00o();
                if (!((NetworkPolicy.NO_CACHE.index & i) == 0)) {
                    oooO00o.f21510OooO00o = true;
                }
                if (!((NetworkPolicy.NO_STORE.index & i) == 0)) {
                    oooO00o.f21511OooO0O0 = true;
                }
                oooO = new com.squareup.okhttp.OooO(oooO00o);
            }
        } else {
            oooO = null;
        }
        com.squareup.okhttp.o00Ooo.OooO00o oooO00o2 = new com.squareup.okhttp.o00Ooo.OooO00o();
        oooO00o2.OooO0Oo(uri.toString());
        if (oooO != null) {
            String string = oooO.toString();
            if (string.isEmpty()) {
                oooO00o2.f21628OooO0OO.OooO0o0("Cache-Control");
            } else {
                oooO00o2.f21628OooO0OO.OooO0o("Cache-Control", string);
            }
        }
        com.squareup.okhttp.o00Oo0 o00oo1 = this.f21847OooO00o;
        com.squareup.okhttp.o00Ooo o00oooOooO00o = oooO00o2.OooO00o();
        o00oo1.getClass();
        com.squareup.okhttp.OooOO0 oooOO1 = new com.squareup.okhttp.OooOO0(o00oo1, o00oooOooO00o);
        synchronized (oooOO1) {
            if (oooOO1.f21548OooO0O0) {
                throw new IllegalStateException("Already Executed");
            }
            oooOO1.f21548OooO0O0 = true;
        }
        try {
            oooOO1.f21547OooO00o.f21599OooO0o0.OooO00o(oooOO1);
            com.squareup.okhttp.oo000o oo000oVarOooO00o = oooOO1.OooO00o();
            if (oo000oVarOooO00o == null) {
                throw new IOException("Canceled");
            }
            oooOO1.f21547OooO00o.f21599OooO0o0.OooO0O0(oooOO1);
            int i2 = oo000oVarOooO00o.f21653OooO0OO;
            if (i2 < 300) {
                boolean z = oo000oVarOooO00o.f21650OooO != null;
                com.squareup.okhttp.o00oO0o o00oo0o2 = oo000oVarOooO00o.f21657OooO0oO;
                return new Downloader.OooO00o(o00oo0o2.OooO00o(), o00oo0o2.OooO0OO().o0000OoO(), z);
            }
            oo000oVarOooO00o.f21657OooO0oO.close();
            throw new Downloader.ResponseException(i2 + ZegoConstants.ZegoVideoDataAuxPublishingStream + oo000oVarOooO00o.f21654OooO0Oo, i, i2);
        } catch (Throwable th) {
            oooOO1.f21547OooO00o.f21599OooO0o0.OooO0O0(oooOO1);
            throw th;
        }
    }
}
