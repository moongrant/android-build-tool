package com.google.common.collect;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O extends o0O0OOOo<Object, Map.Entry<Object, Object>> {

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o0OOOO0o.OooO f18464Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O(Iterator it, o0OOOO0o.OooO oooO) {
        super(it);
        this.f18464Oooo0oO = oooO;
    }

    @Override // com.google.common.collect.o0O0OOOo
    public final Map.Entry<Object, Object> OooO00o(Object obj) {
        return new o000OO0O(obj, this.f18464Oooo0oO.apply(obj));
    }
}
