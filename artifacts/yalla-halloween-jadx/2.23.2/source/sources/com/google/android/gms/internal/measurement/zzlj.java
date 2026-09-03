package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public final class zzlj {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Charset f15277OooO00o;
    public static final byte[] zzd;
    public static final ByteBuffer zze;
    public static final zzke zzf;

    static {
        Charset.forName("US-ASCII");
        f15277OooO00o = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        zzd = bArr;
        zze = ByteBuffer.wrap(bArr);
        o0 o0Var = new o0();
        try {
            int i = o0Var.f14913OooO00o + o0Var.f14914OooO0O0;
            o0Var.f14913OooO00o = i;
            if (i > 0) {
                o0Var.f14914OooO0O0 = i;
                o0Var.f14913OooO00o = i - i;
            } else {
                o0Var.f14914OooO0O0 = 0;
            }
            zzf = o0Var;
        } catch (zzll e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static int zza(boolean z) {
        return z ? 1231 : 1237;
    }

    public static String zzd(byte[] bArr) {
        return new String(bArr, f15277OooO00o);
    }
}
