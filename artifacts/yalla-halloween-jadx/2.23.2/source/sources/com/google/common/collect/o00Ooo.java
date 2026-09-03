package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.Arrays;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(serializable = true)
@ElementTypesAreNonnullByDefault
public final class o00Ooo<F, T> extends o0O000<F> implements Serializable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final com.google.common.base.OooOOO<F, ? extends T> f19056OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o0O000<T> f19057OooO0o0;

    public o00Ooo(oo0O.OooO00o oooO00o, o0O000 o0o001) {
        oooO00o.getClass();
        this.f19056OooO0Oo = oooO00o;
        this.f19057OooO0o0 = o0o001;
    }

    @Override // java.util.Comparator
    public final int compare(@ParametricNullness F f, @ParametricNullness F f2) {
        com.google.common.base.OooOOO<F, ? extends T> oooOOO = this.f19056OooO0Oo;
        return this.f19057OooO0o0.compare(oooOOO.apply(f), oooOOO.apply(f2));
    }

    @Override // java.util.Comparator
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o00Ooo)) {
            return false;
        }
        o00Ooo o00ooo2 = (o00Ooo) obj;
        return this.f19056OooO0Oo.equals(o00ooo2.f19056OooO0Oo) && this.f19057OooO0o0.equals(o00ooo2.f19057OooO0o0);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19056OooO0Oo, this.f19057OooO0o0});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f19057OooO0o0);
        String strValueOf2 = String.valueOf(this.f19056OooO0Oo);
        StringBuilder sb = new StringBuilder(strValueOf2.length() + strValueOf.length() + 13);
        sb.append(strValueOf);
        sb.append(".onResultOf(");
        sb.append(strValueOf2);
        sb.append(")");
        return sb.toString();
    }
}
