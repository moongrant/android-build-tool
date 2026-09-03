package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public final class zzlj {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Charset f15753OooO00o;
    public static final byte[] zzd;
    public static final ByteBuffer zze;
    public static final zzke zzf;

    static {
        Charset.forName("US-ASCII");
        f15753OooO00o = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        zzd = bArr;
        zze = ByteBuffer.wrap(bArr);
        o0O0o o0o0o = new o0O0o();
        try {
            int i = o0o0o.f15546OooO00o + o0o0o.f15547OooO0O0;
            o0o0o.f15546OooO00o = i;
            if (i > 0) {
                o0o0o.f15547OooO0O0 = i;
                o0o0o.f15546OooO00o = i - i;
            } else {
                o0o0o.f15547OooO0O0 = 0;
            }
            zzf = o0o0o;
        } catch (zzll e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static int zza(boolean z) {
        return z ? 1231 : 1237;
    }

    public static String zzd(byte[] bArr) {
        return new String(bArr, f15753OooO00o);
    }
}
