package com.google.common.collect;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class oOO00O extends o000OO<Object> {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ com.google.common.base.OooOOO f19189OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Iterable f19190OooO0o0;

    public oOO00O(o0O00 o0o01, com.google.common.reflect.OooOOOO oooOOOO) {
        this.f19190OooO0o0 = o0o01;
        this.f19189OooO0o = oooOOOO;
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        Iterator it = this.f19190OooO0o0.iterator();
        com.google.common.base.OooOOO oooOOO = this.f19189OooO0o;
        oooOOO.getClass();
        return new o00O0O00(it, oooOOO);
    }
}
