package com.google.android.gms.internal.measurement;

import android.net.Uri;
import androidx.annotation.GuardedBy;
import p021OooOooo.Oooo0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhp {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @GuardedBy("PhenotypeConstants.class")
    public static final Oooo0 f15953OooO00o = new Oooo0();

    /* JADX WARN: Multi-variable type inference failed */
    public static synchronized Uri zza(String str) {
        Oooo0 oooo0 = f15953OooO00o;
        Uri uri = (Uri) oooo0.getOrDefault("com.google.android.gms.measurement", null);
        if (uri != null) {
            return uri;
        }
        Uri uri2 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
        oooo0.put("com.google.android.gms.measurement", uri2);
        return uri2;
    }
}
