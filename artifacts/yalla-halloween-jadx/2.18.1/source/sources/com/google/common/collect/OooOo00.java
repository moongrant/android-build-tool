package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import java.lang.Comparable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtIncompatible
public abstract class OooOo00<C extends Comparable> implements o0oOOo<C> {
    public final boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o0oOOo) {
            return OooO00o().equals(((o0oOOo) obj).OooO00o());
        }
        return false;
    }

    public final int hashCode() {
        return OooO00o().hashCode();
    }

    public final String toString() {
        return OooO00o().toString();
    }
}
