package com.google.common.collect;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0O00 extends oo0oO0<Object, Object> {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ com.google.common.base.OooOOO0 f19519OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O00(Iterator it, com.google.common.base.OooOOO0 oooOOO0) {
        super(it);
        this.f19519OooO0o0 = oooOOO0;
    }

    @Override // com.google.common.collect.oo0oO0
    @ParametricNullness
    public final Object OooO00o(@ParametricNullness Object obj) {
        return this.f19519OooO0o0.apply(obj);
    }
}
