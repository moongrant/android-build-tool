package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.lang.Comparable;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class o00000O0<C extends Comparable> implements Comparable<o00000O0<C>>, Serializable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C f18944OooO0Oo = "";

    public static final class OooO00o extends o00000O0<Comparable<?>> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final OooO00o f18945OooO0o0 = new OooO00o();

        private Object readResolve() {
            return f18945OooO0o0;
        }

        @Override // com.google.common.collect.o00000O0
        /* JADX INFO: renamed from: OooO00o */
        public final int compareTo(o00000O0<Comparable<?>> o00000o1) {
            return o00000o1 == this ? 0 : 1;
        }

        @Override // com.google.common.collect.o00000O0
        public final void OooO0O0(StringBuilder sb) {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.o00000O0
        public final void OooO0OO(StringBuilder sb) {
            sb.append("+∞)");
        }

        @Override // com.google.common.collect.o00000O0
        public final boolean OooO0Oo() {
            return false;
        }

        @Override // com.google.common.collect.o00000O0, java.lang.Comparable
        public final int compareTo(Object obj) {
            return ((o00000O0) obj) == this ? 0 : 1;
        }

        @Override // com.google.common.collect.o00000O0
        public final int hashCode() {
            return System.identityHashCode(this);
        }

        public final String toString() {
            return "+∞";
        }
    }

    public static final class OooO0O0 extends o00000O0<Comparable<?>> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final OooO0O0 f18946OooO0o0 = new OooO0O0();

        private Object readResolve() {
            return f18946OooO0o0;
        }

        @Override // com.google.common.collect.o00000O0
        /* JADX INFO: renamed from: OooO00o */
        public final int compareTo(o00000O0<Comparable<?>> o00000o1) {
            return o00000o1 == this ? 0 : -1;
        }

        @Override // com.google.common.collect.o00000O0
        public final void OooO0O0(StringBuilder sb) {
            sb.append("(-∞");
        }

        @Override // com.google.common.collect.o00000O0
        public final void OooO0OO(StringBuilder sb) {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.o00000O0
        public final boolean OooO0Oo() {
            return true;
        }

        @Override // com.google.common.collect.o00000O0, java.lang.Comparable
        public final int compareTo(Object obj) {
            return ((o00000O0) obj) == this ? 0 : -1;
        }

        @Override // com.google.common.collect.o00000O0
        public final int hashCode() {
            return System.identityHashCode(this);
        }

        public final String toString() {
            return "-∞";
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
    public int compareTo(o00000O0<C> o00000o1) {
        if (o00000o1 == OooO0O0.f18946OooO0o0) {
            return 1;
        }
        if (o00000o1 == OooO00o.f18945OooO0o0) {
            return -1;
        }
        C c = o00000o1.f18944OooO0Oo;
        Range<Comparable> range = Range.f18886OooO0o;
        int iCompareTo = this.f18944OooO0Oo.compareTo(c);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        return 0;
    }

    public abstract void OooO0O0(StringBuilder sb);

    public abstract void OooO0OO(StringBuilder sb);

    public abstract boolean OooO0Oo();

    public final boolean equals(@CheckForNull Object obj) {
        if (!(obj instanceof o00000O0)) {
            return false;
        }
        try {
            return compareTo((o00000O0) obj) == 0;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public abstract int hashCode();
}
