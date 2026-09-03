package com.google.common.collect;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O00O extends o000OO<Object> {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ com.google.common.base.o00O0O f19033OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Iterable f19034OooO0o0;

    public o00O00O(Iterable iterable, com.google.common.base.o00O0O o00o0o2) {
        this.f19034OooO0o0 = iterable;
        this.f19033OooO0o = o00o0o2;
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        Iterator it = this.f19034OooO0o0.iterator();
        it.getClass();
        com.google.common.base.o00O0O o00o0o2 = this.f19033OooO0o;
        o00o0o2.getClass();
        return new o00O0(it, o00o0o2);
    }
}
