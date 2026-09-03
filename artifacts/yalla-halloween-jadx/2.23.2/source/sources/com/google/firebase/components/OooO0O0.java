package com.google.firebase.components;

import androidx.annotation.Nullable;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0O0<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f19320OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Set<Qualified<? super T>> f19321OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Set<Oooo000> f19322OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f19323OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooO<T> f19324OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f19325OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Set<Class<?>> f19326OooO0oO;

    public static class OooO00o<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public String f19327OooO00o = null;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final HashSet f19328OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final HashSet f19329OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f19330OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public OooO<T> f19331OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f19332OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final HashSet f19333OooO0oO;

        public OooO00o(Class cls, Class[] clsArr) {
            HashSet hashSet = new HashSet();
            this.f19328OooO0O0 = hashSet;
            this.f19329OooO0OO = new HashSet();
            this.f19330OooO0Oo = 0;
            this.f19332OooO0o0 = 0;
            this.f19333OooO0oO = new HashSet();
            hashSet.add(Qualified.OooO00o(cls));
            for (Class cls2 : clsArr) {
                if (cls2 == null) {
                    throw new NullPointerException("Null interface");
                }
                this.f19328OooO0O0.add(Qualified.OooO00o(cls2));
            }
        }

        @CanIgnoreReturnValue
        public final void OooO00o(Oooo000 oooo000) {
            if (!(!this.f19328OooO0O0.contains(oooo000.f19354OooO00o))) {
                throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
            }
            this.f19329OooO0OO.add(oooo000);
        }

        public final OooO0O0<T> OooO0O0() {
            if (this.f19331OooO0o != null) {
                return new OooO0O0<>(this.f19327OooO00o, new HashSet(this.f19328OooO0O0), new HashSet(this.f19329OooO0OO), this.f19330OooO0Oo, this.f19332OooO0o0, this.f19331OooO0o, this.f19333OooO0oO);
            }
            throw new IllegalStateException("Missing required property: factory.");
        }

        @CanIgnoreReturnValue
        public final void OooO0OO(int i) {
            if (!(this.f19330OooO0Oo == 0)) {
                throw new IllegalStateException("Instantiation type has already been set.");
            }
            this.f19330OooO0Oo = i;
        }
    }

    public OooO0O0(@Nullable String str, Set<Qualified<? super T>> set, Set<Oooo000> set2, int i, int i2, OooO<T> oooO, Set<Class<?>> set3) {
        this.f19320OooO00o = str;
        this.f19321OooO0O0 = Collections.unmodifiableSet(set);
        this.f19322OooO0OO = Collections.unmodifiableSet(set2);
        this.f19323OooO0Oo = i;
        this.f19325OooO0o0 = i2;
        this.f19324OooO0o = oooO;
        this.f19326OooO0oO = Collections.unmodifiableSet(set3);
    }

    public static <T> OooO00o<T> OooO00o(Class<T> cls) {
        return new OooO00o<>(cls, new Class[0]);
    }

    @SafeVarargs
    public static <T> OooO0O0<T> OooO0O0(T t, Class<T> cls, Class<? super T>... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(Qualified.OooO00o(cls));
        for (Class<? super T> cls2 : clsArr) {
            if (cls2 == null) {
                throw new NullPointerException("Null interface");
            }
            hashSet.add(Qualified.OooO00o(cls2));
        }
        return new OooO0O0<>(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new com.google.firebase.components.OooO00o(t), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f19321OooO0O0.toArray()) + ">{" + this.f19323OooO0Oo + ", type=" + this.f19325OooO0o0 + ", deps=" + Arrays.toString(this.f19322OooO0OO.toArray()) + "}";
    }
}
