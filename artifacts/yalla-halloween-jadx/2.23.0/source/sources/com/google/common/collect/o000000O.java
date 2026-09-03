package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.Comparator;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(serializable = true)
@ElementTypesAreNonnullByDefault
public final class o000000O<T> extends o0O000<T> implements Serializable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Comparator<T> f19403OooO0Oo;

    public o000000O(Comparator<T> comparator) {
        comparator.getClass();
        this.f19403OooO0Oo = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(@ParametricNullness T t, @ParametricNullness T t2) {
        return this.f19403OooO0Oo.compare(t, t2);
    }

    @Override // java.util.Comparator
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o000000O) {
            return this.f19403OooO0Oo.equals(((o000000O) obj).f19403OooO0Oo);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19403OooO0Oo.hashCode();
    }

    public final String toString() {
        return this.f19403OooO0Oo.toString();
    }
}
