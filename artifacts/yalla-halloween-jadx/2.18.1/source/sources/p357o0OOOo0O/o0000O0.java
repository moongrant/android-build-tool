package p357o0OOOo0O;

import com.google.firebase.components.DependencyException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p373o0OOo0o0.o0000Ooo;
import p375o0OOo0oo.o0OOO0o;
import p375o0OOo0oo.o0ooOOo;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000O0 extends o00Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Set<Class<?>> f38338OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Set<Class<?>> f38339OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Set<Class<?>> f38340OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Set<Class<?>> f38341OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Set<Class<?>> f38342OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Set<Class<?>> f38343OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o00oO0o f38344OooO0oO;

    public static class OooO00o implements o0000Ooo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Set<Class<?>> f38345OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o0000Ooo f38346OooO0O0;

        public OooO00o(Set<Class<?>> set, o0000Ooo o0000ooo) {
            this.f38345OooO00o = set;
            this.f38346OooO0O0 = o0000ooo;
        }
    }

    public o0000O0(oo000o<?> oo000oVar, o00oO0o o00oo0o2) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (o00000 o00000Var : oo000oVar.f38368OooO0OO) {
            int i = o00000Var.f38323OooO0OO;
            if (!(i == 0)) {
                if (i == 2) {
                    hashSet3.add(o00000Var.f38321OooO00o);
                } else if (o00000Var.OooO00o()) {
                    hashSet5.add(o00000Var.f38321OooO00o);
                } else {
                    hashSet2.add(o00000Var.f38321OooO00o);
                }
            } else if (o00000Var.OooO00o()) {
                hashSet4.add(o00000Var.f38321OooO00o);
            } else {
                hashSet.add(o00000Var.f38321OooO00o);
            }
        }
        if (!oo000oVar.f38372OooO0oO.isEmpty()) {
            hashSet.add(o0000Ooo.class);
        }
        this.f38338OooO00o = Collections.unmodifiableSet(hashSet);
        this.f38339OooO0O0 = Collections.unmodifiableSet(hashSet2);
        this.f38340OooO0OO = Collections.unmodifiableSet(hashSet3);
        this.f38341OooO0Oo = Collections.unmodifiableSet(hashSet4);
        this.f38343OooO0o0 = Collections.unmodifiableSet(hashSet5);
        this.f38342OooO0o = oo000oVar.f38372OooO0oO;
        this.f38344OooO0oO = o00oo0o2;
    }

    @Override // p357o0OOOo0O.o00Oo0, p357o0OOOo0O.o00oO0o
    public final <T> T OooO00o(Class<T> cls) {
        if (!this.f38338OooO00o.contains(cls)) {
            throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        T t = (T) this.f38344OooO0oO.OooO00o(cls);
        return !cls.equals(o0000Ooo.class) ? t : (T) new OooO00o(this.f38342OooO0o, (o0000Ooo) t);
    }

    @Override // p357o0OOOo0O.o00oO0o
    public final <T> o0OOO0o<T> OooO0O0(Class<T> cls) {
        if (this.f38339OooO0O0.contains(cls)) {
            return this.f38344OooO0oO.OooO0O0(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<%s>.", cls));
    }

    @Override // p357o0OOOo0O.o00oO0o
    public final <T> o0OOO0o<Set<T>> OooO0OO(Class<T> cls) {
        if (this.f38343OooO0o0.contains(cls)) {
            return this.f38344OooO0oO.OooO0OO(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", cls));
    }

    @Override // p357o0OOOo0O.o00Oo0, p357o0OOOo0O.o00oO0o
    public final <T> Set<T> OooO0Oo(Class<T> cls) {
        if (this.f38341OooO0Oo.contains(cls)) {
            return this.f38344OooO0oO.OooO0Oo(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Set<%s>.", cls));
    }

    @Override // p357o0OOOo0O.o00oO0o
    public final <T> o0ooOOo<T> OooO0o0(Class<T> cls) {
        if (this.f38340OooO0OO.contains(cls)) {
            return this.f38344OooO0oO.OooO0o0(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Deferred<%s>.", cls));
    }
}
