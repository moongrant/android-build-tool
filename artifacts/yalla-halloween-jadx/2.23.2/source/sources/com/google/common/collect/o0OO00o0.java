package com.google.common.collect;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OO00o0 implements Iterator<o0oOO.OooO00o<Object>> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @CheckForNull
    public TreeMultiset.OooO0o<Object> f19145OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ TreeMultiset f19146OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @CheckForNull
    public o0OO00OO f19147OooO0o0;

    /* JADX WARN: Code duplicated, block: B:19:0x0045  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public o0OO00o0(TreeMultiset treeMultiset) {
        TreeMultiset.OooO0o<Object> oooO0oOooO0oO;
        this.f19146OooO0o = treeMultiset;
        TreeMultiset.OooO0o oooO0o = (TreeMultiset.OooO0o) treeMultiset.f18898OooO0oo.f18900OooO00o;
        if (oooO0o != null) {
            o000O0Oo<E> o000o0oo2 = treeMultiset.f18897OooO;
            boolean z = o000o0oo2.f18966OooO0oo;
            TreeMultiset.OooO0o<Object> oooO0o2 = treeMultiset.f18899OooOO0;
            if (z) {
                Comparator<? super E> comparator = treeMultiset.f18883OooO0o;
                T t = o000o0oo2.f18961OooO;
                oooO0oOooO0oO = oooO0o.OooO0oO(comparator, t);
                if (oooO0oOooO0oO != null) {
                    if (o000o0oo2.f18967OooOO0 == BoundType.OPEN && comparator.compare((Object) t, (Object) oooO0oOooO0oO.f18906OooO00o) == 0) {
                        oooO0oOooO0oO = oooO0oOooO0oO.f18913OooO0oo;
                        Objects.requireNonNull(oooO0oOooO0oO);
                    }
                }
            } else {
                oooO0oOooO0oO = oooO0o2.f18913OooO0oo;
                Objects.requireNonNull(oooO0oOooO0oO);
            }
            oooO0oOooO0oO = (oooO0oOooO0oO == oooO0o2 || !o000o0oo2.OooO00o((E) oooO0oOooO0oO.f18906OooO00o)) ? null : oooO0oOooO0oO;
        }
        this.f19145OooO0Oo = oooO0oOooO0oO;
        this.f19147OooO0o0 = null;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        TreeMultiset.OooO0o<Object> oooO0o = this.f19145OooO0Oo;
        if (oooO0o == null) {
            return false;
        }
        if (!this.f19146OooO0o.f18897OooO.OooO0Oo((E) oooO0o.f18906OooO00o)) {
            return true;
        }
        this.f19145OooO0Oo = null;
        return false;
    }

    @Override // java.util.Iterator
    public final o0oOO.OooO00o<Object> next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Objects.requireNonNull(this.f19145OooO0Oo);
        TreeMultiset.OooO0o<Object> oooO0o = this.f19145OooO0Oo;
        int i = TreeMultiset.f18896OooOO0O;
        TreeMultiset treeMultiset = this.f19146OooO0o;
        treeMultiset.getClass();
        o0OO00OO o0oo00oo2 = new o0OO00OO(treeMultiset, oooO0o);
        this.f19147OooO0o0 = o0oo00oo2;
        TreeMultiset.OooO0o<Object> oooO0o2 = this.f19145OooO0Oo.f18913OooO0oo;
        Objects.requireNonNull(oooO0o2);
        if (oooO0o2 == treeMultiset.f18899OooOO0) {
            this.f19145OooO0Oo = null;
        } else {
            TreeMultiset.OooO0o<Object> oooO0o3 = this.f19145OooO0Oo.f18913OooO0oo;
            Objects.requireNonNull(oooO0o3);
            this.f19145OooO0Oo = oooO0o3;
        }
        return o0oo00oo2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        com.google.common.base.o0OoOo0.OooOOO(this.f19147OooO0o0 != null, "no calls to next() since the last call to remove()");
        this.f19146OooO0o.o0000OOo(this.f19147OooO0o0.f19143OooO0Oo.f18906OooO00o);
        this.f19147OooO0o0 = null;
    }
}
