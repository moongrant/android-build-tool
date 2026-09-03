package com.google.android.gms.internal.play_billing;

import p265o00ooo00.Oooo0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzm {
    public static String OooO00o(int i, int i2, String str) {
        if (i < 0) {
            return zzn.zza("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return zzn.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(Oooo0.OooO00o(26, "negative size: ", i2));
    }

    public static int zza(int i, int i2, String str) {
        String strZza;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i < 0) {
            strZza = zzn.zza("%s (%s) must not be negative", "index", Integer.valueOf(i));
        } else {
            if (i2 < 0) {
                throw new IllegalArgumentException(Oooo0.OooO00o(26, "negative size: ", i2));
            }
            strZza = zzn.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException(strZza);
    }

    public static int zzb(int i, int i2, String str) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(OooO00o(i, i2, "index"));
        }
        return i;
    }

    public static void zzc(int i, int i2, int i3) {
        String strOooO00o;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strOooO00o = OooO00o(i, i3, "start index");
            } else {
                strOooO00o = (i2 < 0 || i2 > i3) ? OooO00o(i2, i3, "end index") : zzn.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strOooO00o);
        }
    }
}
