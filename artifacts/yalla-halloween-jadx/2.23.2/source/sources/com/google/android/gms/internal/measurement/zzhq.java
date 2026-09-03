package com.google.android.gms.internal.measurement;

import android.net.Uri;
import androidx.annotation.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhq {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @GuardedBy("PhenotypeConstants.class")
    public static final p190o00o0O.OooO f15244OooO00o = new p190o00o0O.OooO();

    /* JADX WARN: Multi-variable type inference failed */
    public static synchronized Uri zza(String str) {
        p190o00o0O.OooO oooO = f15244OooO00o;
        Uri uri = (Uri) oooO.getOrDefault("com.google.android.gms.measurement", null);
        if (uri != null) {
            return uri;
        }
        Uri uri2 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
        oooO.put("com.google.android.gms.measurement", uri2);
        return uri2;
    }
}
