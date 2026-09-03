package com.google.common.collect;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class o00OO0O0 extends oo0oO0<Object, Map.Entry<Object, Object>> {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ com.google.common.base.OooOOO0 f19523OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO0O0(Iterator it, com.google.common.base.OooOOO0 oooOOO0) {
        super(it);
        this.f19523OooO0o0 = oooOOO0;
    }

    @Override // com.google.common.collect.oo0oO0
    public final Map.Entry<Object, Object> OooO00o(@ParametricNullness Object obj) {
        return new o000O0O0(obj, this.f19523OooO0o0.apply(obj));
    }
}
