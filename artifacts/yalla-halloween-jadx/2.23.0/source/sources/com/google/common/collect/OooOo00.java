package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import java.lang.Comparable;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
public abstract class OooOo00<C extends Comparable> implements o0O000Oo<C> {
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o0O000Oo) {
            return OooO00o().equals(((o0O000Oo) obj).OooO00o());
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
