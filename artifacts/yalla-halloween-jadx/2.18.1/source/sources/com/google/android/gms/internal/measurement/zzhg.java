package com.google.android.gms.internal.measurement;

import android.net.Uri;
import javax.annotation.Nullable;
import p021OooOooo.o00oO0o;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhg {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00oO0o f15949OooO00o;

    public zzhg(o00oO0o o00oo0o2) {
        this.f15949OooO00o = o00oo0o2;
    }

    @Nullable
    public final String zza(@Nullable Uri uri, @Nullable String str, @Nullable String str2, String str3) {
        if (uri == null) {
            return null;
        }
        o00oO0o o00oo0o2 = (o00oO0o) this.f15949OooO00o.getOrDefault(uri.toString(), null);
        if (o00oo0o2 == null) {
            return null;
        }
        return (String) o00oo0o2.getOrDefault("".concat(String.valueOf(str3)), null);
    }
}
