package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
public abstract class o000O00<E> extends o000OO<E> implements Set<E> {
    @Override // com.google.common.collect.o000OO
    /* JADX INFO: renamed from: OooO0oo, reason: merged with bridge method [inline-methods] */
    public abstract Set<E> OooO00o();

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(@NullableDecl Object obj) {
        return obj == this || OooO00o().equals(obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return OooO00o().hashCode();
    }
}
