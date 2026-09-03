package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOo00 extends o000oOoO implements Iterable<o000oOoO> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ArrayList f20129OooO0Oo = new ArrayList();

    @Override // com.google.gson.o000oOoO
    public final String OooO0O0() {
        ArrayList arrayList = this.f20129OooO0Oo;
        if (arrayList.size() == 1) {
            return ((o000oOoO) arrayList.get(0)).OooO0O0();
        }
        throw new IllegalStateException();
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof OooOo00) && ((OooOo00) obj).f20129OooO0Oo.equals(this.f20129OooO0Oo));
    }

    public final int hashCode() {
        return this.f20129OooO0Oo.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator<o000oOoO> iterator() {
        return this.f20129OooO0Oo.iterator();
    }
}
