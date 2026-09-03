package com.google.android.gms.internal.measurement;

import android.net.Uri;
import androidx.annotation.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhq {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @GuardedBy("PhenotypeConstants.class")
    public static final p188o00o0O.OooOO0 f15720OooO00o = new p188o00o0O.OooOO0();

    /* JADX WARN: Multi-variable type inference failed */
    public static synchronized Uri zza(String str) {
        p188o00o0O.OooOO0 oooOO1 = f15720OooO00o;
        Uri uri = (Uri) oooOO1.getOrDefault("com.google.android.gms.measurement", null);
        if (uri != null) {
            return uri;
        }
        Uri uri2 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
        oooOO1.put("com.google.android.gms.measurement", uri2);
        return uri2;
    }
}
