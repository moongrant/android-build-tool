package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Equivalence;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
public final class oo0oOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f19694OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f19695OooO0O0 = -1;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f19696OooO0OO = -1;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @CheckForNull
    public o00O.o0OoOo0 f19697OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @CheckForNull
    public Equivalence<Object> f19698OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @CheckForNull
    public o00O.o0OoOo0 f19699OooO0o0;

    public final o00O.o0OoOo0 OooO00o() {
        return (o00O.o0OoOo0) com.google.common.base.OooOo.OooO00o(this.f19697OooO0Oo, o00O.o0OoOo0.STRONG);
    }

    public final <K, V> ConcurrentMap<K, V> OooO0O0() {
        if (!this.f19694OooO00o) {
            int i = this.f19695OooO0O0;
            if (i == -1) {
                i = 16;
            }
            int i2 = this.f19696OooO0OO;
            if (i2 == -1) {
                i2 = 4;
            }
            return new ConcurrentHashMap(i, 0.75f, i2);
        }
        o00O.OooO00o oooO00o = o00O.f19452OooOOO0;
        o00O.o0OoOo0 o0oooo0OooO00o = OooO00o();
        o00O.o0OoOo0 o0oooo0 = o00O.o0OoOo0.STRONG;
        if (o0oooo0OooO00o == o0oooo0 && ((o00O.o0OoOo0) com.google.common.base.OooOo.OooO00o(this.f19699OooO0o0, o0oooo0)) == o0oooo0) {
            return new o00O(this, o00O.o00O0O.OooO00o.f19494OooO00o);
        }
        if (OooO00o() == o0oooo0 && ((o00O.o0OoOo0) com.google.common.base.OooOo.OooO00o(this.f19699OooO0o0, o0oooo0)) == o00O.o0OoOo0.WEAK) {
            return new o00O(this, o00O.o00Ooo.OooO00o.f19496OooO00o);
        }
        o00O.o0OoOo0 o0oooo0OooO00o2 = OooO00o();
        o00O.o0OoOo0 o0oooo1 = o00O.o0OoOo0.WEAK;
        if (o0oooo0OooO00o2 == o0oooo1 && ((o00O.o0OoOo0) com.google.common.base.OooOo.OooO00o(this.f19699OooO0o0, o0oooo0)) == o0oooo0) {
            return new o00O(this, o00O.o0OOO0o.OooO00o.f19500OooO00o);
        }
        if (OooO00o() == o0oooo1 && ((o00O.o0OoOo0) com.google.common.base.OooOo.OooO00o(this.f19699OooO0o0, o0oooo0)) == o0oooo1) {
            return new o00O(this, o00O.o0OO00O.OooO00o.f19498OooO00o);
        }
        throw new AssertionError();
    }

    public final String toString() {
        com.google.common.base.OooOo.OooO00o oooO00oOooO0O0 = com.google.common.base.OooOo.OooO0O0(this);
        int i = this.f19695OooO0O0;
        if (i != -1) {
            oooO00oOooO0O0.OooO0O0(String.valueOf(i), "initialCapacity");
        }
        int i2 = this.f19696OooO0OO;
        if (i2 != -1) {
            oooO00oOooO0O0.OooO0O0(String.valueOf(i2), "concurrencyLevel");
        }
        o00O.o0OoOo0 o0oooo0 = this.f19697OooO0Oo;
        if (o0oooo0 != null) {
            oooO00oOooO0O0.OooO00o(com.google.common.base.OooO0OO.OooO0O0(o0oooo0.toString()), "keyStrength");
        }
        o00O.o0OoOo0 o0oooo1 = this.f19699OooO0o0;
        if (o0oooo1 != null) {
            oooO00oOooO0O0.OooO00o(com.google.common.base.OooO0OO.OooO0O0(o0oooo1.toString()), "valueStrength");
        }
        if (this.f19698OooO0o != null) {
            com.google.common.base.OooOo.OooO00o.OooO0O0 oooO0O0 = new com.google.common.base.OooOo.OooO00o.OooO0O0();
            oooO00oOooO0O0.f19078OooO0OO.f19081OooO0OO = oooO0O0;
            oooO00oOooO0O0.f19078OooO0OO = oooO0O0;
            oooO0O0.f19080OooO0O0 = "keyEquivalence";
        }
        return oooO00oOooO0O0.toString();
    }
}
