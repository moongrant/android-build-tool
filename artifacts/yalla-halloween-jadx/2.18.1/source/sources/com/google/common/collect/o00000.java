package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.lang.Comparable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
public abstract class o00000<C extends Comparable> implements Comparable<o00000<C>>, Serializable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NullableDecl
    public final C f18408Oooo0o = null;

    public static final class OooO00o extends o00000<Comparable<?>> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public static final OooO00o f18409Oooo0oO = new OooO00o();

        private Object readResolve() {
            return f18409Oooo0oO;
        }

        @Override // com.google.common.collect.o00000
        /* JADX INFO: renamed from: OooO00o */
        public final int compareTo(o00000<Comparable<?>> o00000Var) {
            return o00000Var == this ? 0 : 1;
        }

        @Override // com.google.common.collect.o00000
        public final void OooO0O0(StringBuilder sb) {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.o00000
        public final void OooO0Oo(StringBuilder sb) {
            sb.append("+∞)");
        }

        @Override // com.google.common.collect.o00000
        public final boolean OooO0o0() {
            return false;
        }

        @Override // com.google.common.collect.o00000, java.lang.Comparable
        public final int compareTo(Object obj) {
            return ((o00000) obj) == this ? 0 : 1;
        }

        @Override // com.google.common.collect.o00000
        public final int hashCode() {
            return System.identityHashCode(this);
        }

        public final String toString() {
            return "+∞";
        }
    }

    public static final class OooO0O0 extends o00000<Comparable<?>> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public static final OooO0O0 f18410Oooo0oO = new OooO0O0();

        private Object readResolve() {
            return f18410Oooo0oO;
        }

        @Override // com.google.common.collect.o00000
        /* JADX INFO: renamed from: OooO00o */
        public final int compareTo(o00000<Comparable<?>> o00000Var) {
            return o00000Var == this ? 0 : -1;
        }

        @Override // com.google.common.collect.o00000
        public final void OooO0O0(StringBuilder sb) {
            sb.append("(-∞");
        }

        @Override // com.google.common.collect.o00000
        public final void OooO0Oo(StringBuilder sb) {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.o00000
        public final boolean OooO0o0() {
            return true;
        }

        @Override // com.google.common.collect.o00000, java.lang.Comparable
        public final int compareTo(Object obj) {
            return ((o00000) obj) == this ? 0 : -1;
        }

        @Override // com.google.common.collect.o00000
        public final int hashCode() {
            return System.identityHashCode(this);
        }

        public final String toString() {
            return "-∞";
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
    public int compareTo(o00000<C> o00000Var) {
        if (o00000Var == OooO0O0.f18410Oooo0oO) {
            return 1;
        }
        if (o00000Var == OooO00o.f18409Oooo0oO) {
            return -1;
        }
        C c = this.f18408Oooo0o;
        C c2 = o00000Var.f18408Oooo0o;
        Range<Comparable> range = Range.f18368Oooo0oo;
        int iCompareTo = c.compareTo(c2);
        return iCompareTo != 0 ? iCompareTo : o0OOOOO.OooO00o.OooO00o(false, false);
    }

    public abstract void OooO0O0(StringBuilder sb);

    public abstract void OooO0Oo(StringBuilder sb);

    public abstract boolean OooO0o0();

    public final boolean equals(Object obj) {
        if (!(obj instanceof o00000)) {
            return false;
        }
        try {
            return compareTo((o00000) obj) == 0;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public abstract int hashCode();
}
