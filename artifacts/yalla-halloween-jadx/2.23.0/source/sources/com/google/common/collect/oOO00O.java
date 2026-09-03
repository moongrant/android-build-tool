package com.google.common.collect;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class oOO00O extends o000OO<Object> {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ com.google.common.base.OooOOO0 f19665OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Iterable f19666OooO0o0;

    public oOO00O(o0O00 o0o01, com.google.common.reflect.OooOOOO oooOOOO) {
        this.f19666OooO0o0 = o0o01;
        this.f19665OooO0o = oooOOOO;
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        Iterator it = this.f19666OooO0o0.iterator();
        com.google.common.base.OooOOO0 oooOOO0 = this.f19665OooO0o;
        oooOOO0.getClass();
        return new o00O0O00(it, oooOOO0);
    }
}
