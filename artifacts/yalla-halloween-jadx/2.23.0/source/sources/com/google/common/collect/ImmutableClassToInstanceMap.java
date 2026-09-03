package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@Immutable(containerOf = {"B"})
@GwtIncompatible
@ElementTypesAreNonnullByDefault
public final class ImmutableClassToInstanceMap<B> extends o000<Class<? extends B>, B> implements Serializable {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final ImmutableClassToInstanceMap<Object> f19151OooO0o0 = new ImmutableClassToInstanceMap<>(o0OoO00O.f19626OooOO0);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ImmutableMap<Class<? extends B>, B> f19152OooO0Oo;

    public ImmutableClassToInstanceMap(o0OoO00O o0ooo00o2) {
        this.f19152OooO0Oo = o0ooo00o2;
    }

    @Override // com.google.common.collect.o000, com.google.common.collect.o000Oo0
    public final Object OooO00o() {
        return this.f19152OooO0Oo;
    }

    @Override // com.google.common.collect.o000
    /* JADX INFO: renamed from: OooO0O0 */
    public final Map<Class<? extends B>, B> OooO00o() {
        return this.f19152OooO0Oo;
    }

    public Object readResolve() {
        return isEmpty() ? f19151OooO0o0 : this;
    }
}
