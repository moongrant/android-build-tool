package com.squareup.picasso;

import android.content.Context;
import android.net.Uri;
import com.zego.zegoavkit2.ZegoConstants;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import p412o0Oo0o00.o000;
import p412o0Oo0o00.o000000O;
import p412o0Oo0o00.o00000O;
import p412o0Oo0o00.o00000O0;
import p412o0Oo0o00.o0000O0;
import p412o0Oo0o00.o000O000;
import p412o0Oo0o00.o000O0o;
import p412o0Oo0o00.o000Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo00 implements Downloader {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000 f19763OooO00o;

    public OooOo00(Context context) {
        File fileOooO0Oo = o00oO0o.OooO0Oo(context);
        long jOooO00o = o00oO0o.OooO00o(fileOooO0Oo);
        o000 o000Var = new o000();
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
        o000Var.f39196Oooooo = (int) millis;
        long millis2 = timeUnit.toMillis(20000L);
        if (millis2 > 2147483647L) {
            throw new IllegalArgumentException("Timeout too large.");
        }
        if (millis2 == 0) {
            throw new IllegalArgumentException("Timeout too small.");
        }
        o000Var.f39198OoooooO = (int) millis2;
        long millis3 = timeUnit.toMillis(20000L);
        if (millis3 > 2147483647L) {
            throw new IllegalArgumentException("Timeout too large.");
        }
        if (millis3 == 0) {
            throw new IllegalArgumentException("Timeout too small.");
        }
        o000Var.f39199Ooooooo = (int) millis3;
        this.f19763OooO00o = o000Var;
        try {
            o000Var.f39186OoooOOO = new o000000O(fileOooO0Oo, jOooO00o);
            o000Var.f39200o000oOoO = null;
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayDeque, java.util.Deque<o0Oo0o00.o00000O>] */
    @Override // com.squareup.picasso.Downloader
    public final Downloader.OooO00o OooO00o(Uri uri, int i) throws IOException {
        o00000O0 o00000o1;
        if (i == 0) {
            o00000o1 = null;
        } else if (NetworkPolicy.OooO00o(i)) {
            o00000o1 = o00000O0.f39238OooOOO0;
        } else {
            o00000O0.OooO00o oooO00o = new o00000O0.OooO00o();
            if (!((NetworkPolicy.NO_CACHE.index & i) == 0)) {
                oooO00o.f39251OooO00o = true;
            }
            if (!((NetworkPolicy.NO_STORE.index & i) == 0)) {
                oooO00o.f39252OooO0O0 = true;
            }
            o00000o1 = new o00000O0(oooO00o);
        }
        o000O000.OooO00o oooO00o2 = new o000O000.OooO00o();
        oooO00o2.OooO0o0(uri.toString());
        if (o00000o1 != null) {
            String string = o00000o1.toString();
            if (string.isEmpty()) {
                oooO00o2.f39310OooO0OO.OooO0o("Cache-Control");
            } else {
                oooO00o2.f39310OooO0OO.OooO0oO("Cache-Control", string);
            }
        }
        o00000O o00000o = new o00000O(this.f19763OooO00o, oooO00o2.OooO00o());
        synchronized (o00000o) {
            if (o00000o.f39235OooO0O0) {
                throw new IllegalStateException("Already Executed");
            }
            o00000o.f39235OooO0O0 = true;
        }
        try {
            o0000O0 o0000o1 = o00000o.f39234OooO00o.f39179Oooo0oO;
            synchronized (o0000o1) {
                o0000o1.f39275OooO00o.add(o00000o);
            }
            o000O0o o000o0oOooO00o = o00000o.OooO00o();
            if (o000o0oOooO00o == null) {
                throw new IOException("Canceled");
            }
            o00000o.f39234OooO00o.f39179Oooo0oO.OooO00o(o00000o);
            int i2 = o000o0oOooO00o.f39315OooO0OO;
            if (i2 < 300) {
                boolean z = o000o0oOooO00o.f39312OooO != null;
                o000Oo0 o000oo1 = o000o0oOooO00o.f39319OooO0oO;
                return new Downloader.OooO00o(o000oo1.OooO0O0().o0000OO0(), z, o000oo1.OooO00o());
            }
            o000o0oOooO00o.f39319OooO0oO.close();
            throw new Downloader.ResponseException(i2 + ZegoConstants.ZegoVideoDataAuxPublishingStream + o000o0oOooO00o.f39316OooO0Oo, i, i2);
        } catch (Throwable th) {
            o00000o.f39234OooO00o.f39179Oooo0oO.OooO00o(o00000o);
            throw th;
        }
    }
}
