package com.google.common.collect;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0O00 extends oo0oO0<Object, Object> {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ com.google.common.base.OooOOO f19043OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O00(Iterator it, com.google.common.base.OooOOO oooOOO) {
        super(it);
        this.f19043OooO0o0 = oooOOO;
    }

    @Override // com.google.common.collect.oo0oO0
    @ParametricNullness
    public final Object OooO00o(@ParametricNullness Object obj) {
        return this.f19043OooO0o0.apply(obj);
    }
}
