package com.google.common.collect;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class o00OO0OO extends OooOOO0<Object, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Map.Entry f19524OooO0Oo;

    public o00OO0OO(Map.Entry entry) {
        this.f19524OooO0Oo = entry;
    }

    @Override // java.util.Map.Entry
    @ParametricNullness
    public final Object getKey() {
        return this.f19524OooO0Oo.getKey();
    }

    @Override // java.util.Map.Entry
    @ParametricNullness
    public final Object getValue() {
        return this.f19524OooO0Oo.getValue();
    }
}
