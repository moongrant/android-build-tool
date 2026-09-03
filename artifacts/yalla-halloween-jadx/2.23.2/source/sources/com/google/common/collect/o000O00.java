package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Queue;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class o000O00<E> extends o0000O<E> implements Queue<E> {
    @Override // com.google.common.collect.o0000O, com.google.common.collect.o000Oo0
    public /* bridge */ /* synthetic */ Object OooO00o() {
        OooO0Oo();
        return null;
    }

    @Override // com.google.common.collect.o0000O
    /* JADX INFO: renamed from: OooO0O0 */
    public /* bridge */ /* synthetic */ Collection OooO00o() {
        OooO0Oo();
        return null;
    }

    public abstract void OooO0Oo();

    @Override // java.util.Queue
    @ParametricNullness
    public final E element() {
        OooO0Oo();
        throw null;
    }

    @CanIgnoreReturnValue
    public boolean offer(@ParametricNullness E e) {
        OooO0Oo();
        throw null;
    }

    @Override // java.util.Queue
    @CheckForNull
    public final E peek() {
        OooO0Oo();
        throw null;
    }

    @Override // java.util.Queue
    @CanIgnoreReturnValue
    @CheckForNull
    public final E poll() {
        OooO0Oo();
        throw null;
    }

    @Override // java.util.Queue
    @ParametricNullness
    @CanIgnoreReturnValue
    public final E remove() {
        OooO0Oo();
        throw null;
    }
}
