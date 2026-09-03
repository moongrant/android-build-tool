package com.google.android.gms.internal.measurement;

import android.net.Uri;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhh {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final p188o00o0O.Oooo000 f15716OooO00o;

    public zzhh(p188o00o0O.Oooo000 oooo000) {
        this.f15716OooO00o = oooo000;
    }

    @Nullable
    public final String zza(@Nullable Uri uri, @Nullable String str, @Nullable String str2, String str3) {
        p188o00o0O.Oooo000 oooo000;
        if (uri != null) {
            oooo000 = (p188o00o0O.Oooo000) this.f15716OooO00o.getOrDefault(uri.toString(), null);
        } else {
            oooo000 = null;
        }
        if (oooo000 == null) {
            return null;
        }
        return (String) oooo000.getOrDefault("".concat(str3), null);
    }
}
