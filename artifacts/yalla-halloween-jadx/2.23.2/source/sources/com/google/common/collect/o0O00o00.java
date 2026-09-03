package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(serializable = true)
@ElementTypesAreNonnullByDefault
public final class o0O00o00<T> extends o0O000<T> implements Serializable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o0O000<? super T> f19100OooO0Oo;

    public o0O00o00(o0O000<? super T> o0o001) {
        o0o001.getClass();
        this.f19100OooO0Oo = o0o001;
    }

    @Override // com.google.common.collect.o0O000
    public final <S extends T> o0O000<S> OooO0O0() {
        return this.f19100OooO0Oo;
    }

    @Override // java.util.Comparator
    public final int compare(@ParametricNullness T t, @ParametricNullness T t2) {
        return this.f19100OooO0Oo.compare(t2, t);
    }

    @Override // java.util.Comparator
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o0O00o00) {
            return this.f19100OooO0Oo.equals(((o0O00o00) obj).f19100OooO0Oo);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f19100OooO0Oo.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f19100OooO0Oo);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 10);
        sb.append(strValueOf);
        sb.append(".reverse()");
        return sb.toString();
    }
}
