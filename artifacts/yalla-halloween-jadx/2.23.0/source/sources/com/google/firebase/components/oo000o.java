package com.google.firebase.components;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class oo000o implements OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Set<Qualified<?>> f19845OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Set<Qualified<?>> f19846OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Set<Qualified<?>> f19847OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Set<Qualified<?>> f19848OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Set<Class<?>> f19849OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Set<Qualified<?>> f19850OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooO0OO f19851OooO0oO;

    public static class OooO00o implements o0O0o000.OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Set<Class<?>> f19852OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o0O0o000.OooO0OO f19853OooO0O0;

        public OooO00o(Set<Class<?>> set, o0O0o000.OooO0OO oooO0OO) {
            this.f19852OooO00o = set;
            this.f19853OooO0O0 = oooO0OO;
        }
    }

    public oo000o(OooO0O0 oooO0O0, OooOOOO oooOOOO) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (OooOo oooOo : oooO0O0.f19796OooO0OO) {
            int i = oooOo.f19821OooO0OO;
            boolean z = i == 0;
            int i2 = oooOo.f19820OooO0O0;
            Qualified<?> qualified = oooOo.f19819OooO00o;
            if (z) {
                if (i2 == 2) {
                    hashSet4.add(qualified);
                } else {
                    hashSet.add(qualified);
                }
            } else if (i == 2) {
                hashSet3.add(qualified);
            } else if (i2 == 2) {
                hashSet5.add(qualified);
            } else {
                hashSet2.add(qualified);
            }
        }
        Set<Class<?>> set = oooO0O0.f19800OooO0oO;
        if (!set.isEmpty()) {
            hashSet.add(Qualified.OooO00o(o0O0o000.OooO0OO.class));
        }
        this.f19845OooO00o = Collections.unmodifiableSet(hashSet);
        this.f19846OooO0O0 = Collections.unmodifiableSet(hashSet2);
        this.f19847OooO0OO = Collections.unmodifiableSet(hashSet3);
        this.f19848OooO0Oo = Collections.unmodifiableSet(hashSet4);
        this.f19850OooO0o0 = Collections.unmodifiableSet(hashSet5);
        this.f19849OooO0o = set;
        this.f19851OooO0oO = oooOOOO;
    }

    @Override // com.google.firebase.components.OooO0OO
    public final <T> T OooO00o(Class<T> cls) {
        if (!this.f19845OooO00o.contains(Qualified.OooO00o(cls))) {
            throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        T t = (T) this.f19851OooO0oO.OooO00o(cls);
        return !cls.equals(o0O0o000.OooO0OO.class) ? t : (T) new OooO00o(this.f19849OooO0o, (o0O0o000.OooO0OO) t);
    }

    @Override // com.google.firebase.components.OooO0OO
    public final <T> p298o0O0o00o.OooO0OO<T> OooO0O0(Qualified<T> qualified) {
        if (this.f19846OooO0O0.contains(qualified)) {
            return this.f19851OooO0oO.OooO0O0(qualified);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<%s>.", qualified));
    }

    @Override // com.google.firebase.components.OooO0OO
    public final <T> Set<T> OooO0OO(Qualified<T> qualified) {
        if (this.f19848OooO0Oo.contains(qualified)) {
            return this.f19851OooO0oO.OooO0OO(qualified);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Set<%s>.", qualified));
    }

    @Override // com.google.firebase.components.OooO0OO
    public final <T> T OooO0Oo(Qualified<T> qualified) {
        if (this.f19845OooO00o.contains(qualified)) {
            return (T) this.f19851OooO0oO.OooO0Oo(qualified);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", qualified));
    }

    @Override // com.google.firebase.components.OooO0OO
    public final <T> p298o0O0o00o.OooO0O0<T> OooO0o(Qualified<T> qualified) {
        if (this.f19847OooO0OO.contains(qualified)) {
            return this.f19851OooO0oO.OooO0o(qualified);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Deferred<%s>.", qualified));
    }

    @Override // com.google.firebase.components.OooO0OO
    public final <T> p298o0O0o00o.OooO0OO<T> OooO0o0(Class<T> cls) {
        return OooO0O0(Qualified.OooO00o(cls));
    }

    public final <T> p298o0O0o00o.OooO0O0<T> OooO0oO(Class<T> cls) {
        return OooO0o(Qualified.OooO00o(cls));
    }

    public final Set OooO0oo(Class cls) {
        return OooO0OO(Qualified.OooO00o(cls));
    }
}
