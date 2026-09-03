package com.airbnb.lottie;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Ooo<V> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final V f8920OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final Throwable f8921OooO0O0;

    /* JADX WARN: Multi-variable type inference failed */
    public o00Ooo(OooOO0 oooOO1) {
        this.f8920OooO00o = oooOO1;
        this.f8921OooO0O0 = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o00Ooo)) {
            return false;
        }
        o00Ooo o00ooo2 = (o00Ooo) obj;
        V v = this.f8920OooO00o;
        if (v != null && v.equals(o00ooo2.f8920OooO00o)) {
            return true;
        }
        Throwable th = this.f8921OooO0O0;
        if (th == null || o00ooo2.f8921OooO0O0 == null) {
            return false;
        }
        return th.toString().equals(th.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8920OooO00o, this.f8921OooO0O0});
    }

    public o00Ooo(Throwable th) {
        this.f8921OooO0O0 = th;
        this.f8920OooO00o = null;
    }
}
