package com.google.android.gms.common.images;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Uri f15501OooO00o;

    public OooO0o(Uri uri) {
        this.f15501OooO00o = uri;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OooO0o) {
            return Objects.equal(((OooO0o) obj).f15501OooO00o, this.f15501OooO00o);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f15501OooO00o);
    }
}
