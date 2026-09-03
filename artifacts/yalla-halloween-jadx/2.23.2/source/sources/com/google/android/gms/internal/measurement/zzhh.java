package com.google.android.gms.internal.measurement;

import android.net.Uri;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhh {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final p190o00o0O.OooOo f15240OooO00o;

    public zzhh(p190o00o0O.OooOo oooOo) {
        this.f15240OooO00o = oooOo;
    }

    @Nullable
    public final String zza(@Nullable Uri uri, @Nullable String str, @Nullable String str2, String str3) {
        p190o00o0O.OooOo oooOo;
        if (uri != null) {
            oooOo = (p190o00o0O.OooOo) this.f15240OooO00o.getOrDefault(uri.toString(), null);
        } else {
            oooOo = null;
        }
        if (oooOo == null) {
            return null;
        }
        return (String) oooOo.getOrDefault("".concat(str3), null);
    }
}
