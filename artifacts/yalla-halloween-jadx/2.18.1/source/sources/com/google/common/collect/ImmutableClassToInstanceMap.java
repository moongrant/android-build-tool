package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@Immutable(containerOf = {"B"})
@GwtIncompatible
public final class ImmutableClassToInstanceMap<B> extends o0000OO0<Class<? extends B>, B> implements Serializable {

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public static final ImmutableClassToInstanceMap<Object> f18163Oooo0oO = new ImmutableClassToInstanceMap<>(o0O00000.f18579OoooO0O);

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final ImmutableMap<Class<? extends B>, B> f18164Oooo0o;

    public ImmutableClassToInstanceMap(ImmutableMap<Class<? extends B>, B> immutableMap) {
        this.f18164Oooo0o = immutableMap;
    }

    @Override // com.google.common.collect.o0000OO0, com.google.common.collect.o000O0o
    public final Object OooO00o() {
        return this.f18164Oooo0o;
    }

    @Override // com.google.common.collect.o0000OO0
    /* JADX INFO: renamed from: OooO0O0 */
    public final Map<Class<? extends B>, B> OooO00o() {
        return this.f18164Oooo0o;
    }

    public Object readResolve() {
        return isEmpty() ? f18163Oooo0oO : this;
    }
}
