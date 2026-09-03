package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class o000O00O<E> extends o0000O<E> implements Set<E> {
    @Override // com.google.common.collect.o0000O
    /* JADX INFO: renamed from: OooO0Oo, reason: merged with bridge method [inline-methods] */
    public abstract Set<E> OooO00o();

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(@CheckForNull Object obj) {
        return obj == this || OooO00o().equals(obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return OooO00o().hashCode();
    }
}
