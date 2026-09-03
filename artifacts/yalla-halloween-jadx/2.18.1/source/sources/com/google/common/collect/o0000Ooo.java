package com.google.common.collect;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000Ooo extends o00OOO0.OooO0OO<Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0000 f18440Oooo0o;

    public o0000Ooo(o0000 o0000Var) {
        this.f18440Oooo0o = o0000Var;
    }

    @Override // com.google.common.collect.o00OOO0.OooO0OO
    public final o00OO<Object> OooO0o0() {
        return this.f18440Oooo0o;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<o00OO.OooO00o<Object>> iterator() {
        return ((Oooo000) this.f18440Oooo0o).f18367Oooo.OooO0oo();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return ((Oooo000) this.f18440Oooo0o).f18367Oooo.entrySet().size();
    }
}
