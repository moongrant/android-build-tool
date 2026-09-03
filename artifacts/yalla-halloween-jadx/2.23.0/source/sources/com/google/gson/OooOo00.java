package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOo00 extends Oooo0 implements Iterable<Oooo0> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ArrayList f20602OooO0Oo = new ArrayList();

    @Override // com.google.gson.Oooo0
    public final String OooO0O0() {
        ArrayList arrayList = this.f20602OooO0Oo;
        if (arrayList.size() == 1) {
            return ((Oooo0) arrayList.get(0)).OooO0O0();
        }
        throw new IllegalStateException();
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof OooOo00) && ((OooOo00) obj).f20602OooO0Oo.equals(this.f20602OooO0Oo));
    }

    public final int hashCode() {
        return this.f20602OooO0Oo.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator<Oooo0> iterator() {
        return this.f20602OooO0Oo.iterator();
    }
}
