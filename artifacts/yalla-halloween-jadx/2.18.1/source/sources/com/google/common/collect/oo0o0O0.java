package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Equivalence;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(emulated = true)
public final class oo0o0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f18683OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f18684OooO0O0 = -1;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f18685OooO0OO = -1;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @MonotonicNonNullDecl
    public o00O0OO.o0OoOo0 f18686OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @MonotonicNonNullDecl
    public Equivalence<Object> f18687OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @MonotonicNonNullDecl
    public o00O0OO.o0OoOo0 f18688OooO0o0;

    public final o00O0OO.o0OoOo0 OooO00o() {
        return (o00O0OO.o0OoOo0) o0OOOO0o.OooOOO0.OooO00o(this.f18686OooO0Oo, o00O0OO.o0OoOo0.STRONG);
    }

    public final o00O0OO.o0OoOo0 OooO0O0() {
        return (o00O0OO.o0OoOo0) o0OOOO0o.OooOOO0.OooO00o(this.f18688OooO0o0, o00O0OO.o0OoOo0.STRONG);
    }

    public final <K, V> ConcurrentMap<K, V> OooO0OO() {
        if (!this.f18683OooO00o) {
            int i = this.f18684OooO0O0;
            if (i == -1) {
                i = 16;
            }
            int i2 = this.f18685OooO0OO;
            if (i2 == -1) {
                i2 = 4;
            }
            return new ConcurrentHashMap(i, 0.75f, i2);
        }
        o00O0OO.o000OOo<Object, Object, o00O0OO.OooO> o000ooo2 = o00O0OO.f18483o000oOoO;
        o00O0OO.o0OoOo0 o0oooo0OooO00o = OooO00o();
        o00O0OO.o0OoOo0 o0oooo1 = o00O0OO.o0OoOo0.STRONG;
        if (o0oooo0OooO00o == o0oooo1 && OooO0O0() == o0oooo1) {
            return new o00O0OO(this, o00O0OO.o00O0O.OooO00o.f18525OooO00o);
        }
        if (OooO00o() == o0oooo1 && OooO0O0() == o00O0OO.o0OoOo0.WEAK) {
            return new o00O0OO(this, o00O0OO.o00Ooo.OooO00o.f18527OooO00o);
        }
        o00O0OO.o0OoOo0 o0oooo0OooO00o2 = OooO00o();
        o00O0OO.o0OoOo0 o0oooo2 = o00O0OO.o0OoOo0.WEAK;
        if (o0oooo0OooO00o2 == o0oooo2 && OooO0O0() == o0oooo1) {
            return new o00O0OO(this, o00O0OO.o0OOO0o.OooO00o.f18531OooO00o);
        }
        if (OooO00o() == o0oooo2 && OooO0O0() == o0oooo2) {
            return new o00O0OO(this, o00O0OO.o0OO00O.OooO00o.f18529OooO00o);
        }
        throw new AssertionError();
    }

    public final oo0o0O0 OooO0Oo(o00O0OO.o0OoOo0 o0oooo1) {
        o00O0OO.o0OoOo0 o0oooo2 = this.f18686OooO0Oo;
        o0OOOO0o.OooOOOO.OooOOOo(o0oooo2 == null, "Key strength was already set to %s", o0oooo2);
        Objects.requireNonNull(o0oooo1);
        this.f18686OooO0Oo = o0oooo1;
        if (o0oooo1 != o00O0OO.o0OoOo0.STRONG) {
            this.f18683OooO00o = true;
        }
        return this;
    }

    public final String toString() {
        o0OOOO0o.OooOOO0.OooO00o oooO00oOooO0O0 = o0OOOO0o.OooOOO0.OooO0O0(this);
        int i = this.f18684OooO0O0;
        if (i != -1) {
            oooO00oOooO0O0.OooO00o("initialCapacity", i);
        }
        int i2 = this.f18685OooO0OO;
        if (i2 != -1) {
            oooO00oOooO0O0.OooO00o("concurrencyLevel", i2);
        }
        o00O0OO.o0OoOo0 o0oooo1 = this.f18686OooO0Oo;
        if (o0oooo1 != null) {
            oooO00oOooO0O0.OooO0OO("keyStrength", o0OOOO0o.OooO0O0.OooO00o(o0oooo1.toString()));
        }
        o00O0OO.o0OoOo0 o0oooo2 = this.f18688OooO0o0;
        if (o0oooo2 != null) {
            oooO00oOooO0O0.OooO0OO("valueStrength", o0OOOO0o.OooO0O0.OooO00o(o0oooo2.toString()));
        }
        if (this.f18687OooO0o != null) {
            o0OOOO0o.OooOOO0.OooO00o.C0379OooO00o c0379OooO00o = new o0OOOO0o.OooOOO0.OooO00o.C0379OooO00o();
            oooO00oOooO0O0.f38240OooO0OO.f38244OooO0OO = c0379OooO00o;
            oooO00oOooO0O0.f38240OooO0OO = c0379OooO00o;
            c0379OooO00o.f38243OooO0O0 = "keyEquivalence";
        }
        return oooO00oOooO0O0.toString();
    }
}
