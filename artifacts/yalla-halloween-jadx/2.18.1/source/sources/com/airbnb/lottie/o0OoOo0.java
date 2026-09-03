package com.airbnb.lottie;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class o0OoOo0<V> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final V f10248OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final Throwable f10249OooO0O0;

    public o0OoOo0(V v) {
        this.f10248OooO00o = v;
        this.f10249OooO0O0 = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0OoOo0)) {
            return false;
        }
        o0OoOo0 o0oooo1 = (o0OoOo0) obj;
        V v = this.f10248OooO00o;
        if (v != null && v.equals(o0oooo1.f10248OooO00o)) {
            return true;
        }
        Throwable th = this.f10249OooO0O0;
        if (th == null || o0oooo1.f10249OooO0O0 == null) {
            return false;
        }
        return th.toString().equals(this.f10249OooO0O0.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10248OooO00o, this.f10249OooO0O0});
    }

    public o0OoOo0(Throwable th) {
        this.f10249OooO0O0 = th;
        this.f10248OooO00o = null;
    }
}
