package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import p334o0OO00o.o0OOO0OO;
import p334o0OO00o.o0o0Oo;

/* JADX INFO: loaded from: classes2.dex */
public final class zzkm {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Charset f15980OooO00o;
    public static final byte[] zzd;
    public static final ByteBuffer zze;
    public static final zzjh zzf;

    static {
        Charset.forName("US-ASCII");
        f15980OooO00o = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        zzd = bArr;
        zze = ByteBuffer.wrap(bArr);
        o0o0Oo o0o0oo = new o0o0Oo();
        try {
            int i = o0o0oo.f37444OooO00o + o0o0oo.f37445OooO0O0;
            o0o0oo.f37444OooO00o = i;
            if (i > 0) {
                o0o0oo.f37445OooO0O0 = i;
                o0o0oo.f37444OooO00o = i - i;
            } else {
                o0o0oo.f37445OooO0O0 = 0;
            }
            zzf = o0o0oo;
        } catch (zzko e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static Object OooO00o(Object obj, Object obj2) {
        return ((zzll) obj).zzbG().zzay((zzll) obj2).zzaG();
    }

    public static int zza(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int zzb(byte[] bArr) {
        int length = bArr.length;
        for (byte b : bArr) {
            length = (length * 31) + b;
        }
        if (length == 0) {
            return 1;
        }
        return length;
    }

    public static int zzc(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static String zzh(byte[] bArr) {
        return new String(bArr, f15980OooO00o);
    }

    public static boolean zzi(byte[] bArr) {
        return o0OOO0OO.f37432OooO00o.OooO00o(bArr, 0, bArr.length);
    }
}
