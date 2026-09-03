package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class o00000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO00o f18919OooO00o = new OooO00o();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final OooO0O0 f18920OooO0O0 = new OooO0O0(-1);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final OooO0O0 f18921OooO0OO = new OooO0O0(1);

    public class OooO00o extends o00000 {
        public static o00000 OooO0oO(int i) {
            if (i < 0) {
                return o00000.f18920OooO0O0;
            }
            return i > 0 ? o00000.f18921OooO0OO : o00000.f18919OooO00o;
        }

        @Override // com.google.common.collect.o00000
        public final o00000 OooO00o(int i, int i2) {
            int i3;
            if (i < i2) {
                i3 = -1;
            } else {
                i3 = i > i2 ? 1 : 0;
            }
            return OooO0oO(i3);
        }

        @Override // com.google.common.collect.o00000
        public final o00000 OooO0O0(o00000O0 o00000o1, o00000O0 o00000o2) {
            return OooO0oO(o00000o1.compareTo(o00000o2));
        }

        @Override // com.google.common.collect.o00000
        public final <T> o00000 OooO0OO(@ParametricNullness T t, @ParametricNullness T t2, Comparator<T> comparator) {
            return OooO0oO(comparator.compare(t, t2));
        }

        @Override // com.google.common.collect.o00000
        public final o00000 OooO0Oo(boolean z, boolean z2) {
            int i;
            if (z == z2) {
                i = 0;
            } else {
                i = z ? 1 : -1;
            }
            return OooO0oO(i);
        }

        @Override // com.google.common.collect.o00000
        public final int OooO0o() {
            return 0;
        }

        @Override // com.google.common.collect.o00000
        public final o00000 OooO0o0(boolean z, boolean z2) {
            int i;
            if (z2 == z) {
                i = 0;
            } else {
                i = z2 ? 1 : -1;
            }
            return OooO0oO(i);
        }
    }

    public static final class OooO0O0 extends o00000 {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f18922OooO0Oo;

        public OooO0O0(int i) {
            this.f18922OooO0Oo = i;
        }

        @Override // com.google.common.collect.o00000
        public final o00000 OooO00o(int i, int i2) {
            return this;
        }

        @Override // com.google.common.collect.o00000
        public final o00000 OooO0O0(o00000O0 o00000o1, o00000O0 o00000o2) {
            return this;
        }

        @Override // com.google.common.collect.o00000
        public final <T> o00000 OooO0OO(@ParametricNullness T t, @ParametricNullness T t2, Comparator<T> comparator) {
            return this;
        }

        @Override // com.google.common.collect.o00000
        public final o00000 OooO0Oo(boolean z, boolean z2) {
            return this;
        }

        @Override // com.google.common.collect.o00000
        public final int OooO0o() {
            return this.f18922OooO0Oo;
        }

        @Override // com.google.common.collect.o00000
        public final o00000 OooO0o0(boolean z, boolean z2) {
            return this;
        }
    }

    public abstract o00000 OooO00o(int i, int i2);

    public abstract o00000 OooO0O0(o00000O0 o00000o1, o00000O0 o00000o2);

    public abstract <T> o00000 OooO0OO(@ParametricNullness T t, @ParametricNullness T t2, Comparator<T> comparator);

    public abstract o00000 OooO0Oo(boolean z, boolean z2);

    public abstract int OooO0o();

    public abstract o00000 OooO0o0(boolean z, boolean z2);
}
