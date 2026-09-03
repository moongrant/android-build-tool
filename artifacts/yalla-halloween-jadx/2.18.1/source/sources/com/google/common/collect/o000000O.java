package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Comparator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
public abstract class o000000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO00o f18412OooO00o = new OooO00o();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final OooO0O0 f18413OooO0O0 = new OooO0O0(-1);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final OooO0O0 f18414OooO0OO = new OooO0O0(1);

    public static class OooO00o extends o000000O {
        @Override // com.google.common.collect.o000000O
        public final o000000O OooO00o(int i, int i2) {
            int i3;
            if (i < i2) {
                i3 = -1;
            } else {
                i3 = i > i2 ? 1 : 0;
            }
            return OooO0oO(i3);
        }

        @Override // com.google.common.collect.o000000O
        public final o000000O OooO0O0(Comparable comparable, Comparable comparable2) {
            return OooO0oO(comparable.compareTo(comparable2));
        }

        @Override // com.google.common.collect.o000000O
        public final <T> o000000O OooO0OO(@NullableDecl T t, @NullableDecl T t2, Comparator<T> comparator) {
            return OooO0oO(comparator.compare(t, t2));
        }

        @Override // com.google.common.collect.o000000O
        public final o000000O OooO0Oo(boolean z, boolean z2) {
            return OooO0oO(o0OOOOO.OooO00o.OooO00o(z, z2));
        }

        @Override // com.google.common.collect.o000000O
        public final int OooO0o() {
            return 0;
        }

        @Override // com.google.common.collect.o000000O
        public final o000000O OooO0o0(boolean z, boolean z2) {
            return OooO0oO(o0OOOOO.OooO00o.OooO00o(z2, z));
        }

        public final o000000O OooO0oO(int i) {
            if (i < 0) {
                return o000000O.f18413OooO0O0;
            }
            return i > 0 ? o000000O.f18414OooO0OO : o000000O.f18412OooO00o;
        }
    }

    public static final class OooO0O0 extends o000000O {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f18415OooO0Oo;

        public OooO0O0(int i) {
            this.f18415OooO0Oo = i;
        }

        @Override // com.google.common.collect.o000000O
        public final o000000O OooO00o(int i, int i2) {
            return this;
        }

        @Override // com.google.common.collect.o000000O
        public final o000000O OooO0O0(@NullableDecl Comparable comparable, @NullableDecl Comparable comparable2) {
            return this;
        }

        @Override // com.google.common.collect.o000000O
        public final <T> o000000O OooO0OO(@NullableDecl T t, @NullableDecl T t2, @NullableDecl Comparator<T> comparator) {
            return this;
        }

        @Override // com.google.common.collect.o000000O
        public final o000000O OooO0Oo(boolean z, boolean z2) {
            return this;
        }

        @Override // com.google.common.collect.o000000O
        public final int OooO0o() {
            return this.f18415OooO0Oo;
        }

        @Override // com.google.common.collect.o000000O
        public final o000000O OooO0o0(boolean z, boolean z2) {
            return this;
        }
    }

    public abstract o000000O OooO00o(int i, int i2);

    public abstract o000000O OooO0O0(Comparable<?> comparable, Comparable<?> comparable2);

    public abstract <T> o000000O OooO0OO(@NullableDecl T t, @NullableDecl T t2, Comparator<T> comparator);

    public abstract o000000O OooO0Oo(boolean z, boolean z2);

    public abstract int OooO0o();

    public abstract o000000O OooO0o0(boolean z, boolean z2);
}
