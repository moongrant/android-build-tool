package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.ForOverride;
import java.io.Serializable;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
public abstract class Equivalence<T> {

    public static final class OooO00o extends Equivalence<Object> implements Serializable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f18112Oooo0o = new OooO00o();

        private Object readResolve() {
            return f18112Oooo0o;
        }

        @Override // com.google.common.base.Equivalence
        public final boolean OooO00o(Object obj, Object obj2) {
            return obj.equals(obj2);
        }

        @Override // com.google.common.base.Equivalence
        public final int OooO0O0(Object obj) {
            return obj.hashCode();
        }
    }

    public static final class OooO0O0 extends Equivalence<Object> implements Serializable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0O0 f18113Oooo0o = new OooO0O0();

        private Object readResolve() {
            return f18113Oooo0o;
        }

        @Override // com.google.common.base.Equivalence
        public final boolean OooO00o(Object obj, Object obj2) {
            return false;
        }

        @Override // com.google.common.base.Equivalence
        public final int OooO0O0(Object obj) {
            return System.identityHashCode(obj);
        }
    }

    public static final class Wrapper<T> implements Serializable {
        public final boolean equals(@NullableDecl Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Wrapper)) {
                return false;
            }
            Objects.requireNonNull((Wrapper) obj);
            throw null;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "null.wrap(null)";
        }
    }

    @ForOverride
    public abstract boolean OooO00o(T t, T t2);

    @ForOverride
    public abstract int OooO0O0(T t);

    public final boolean OooO0OO(@NullableDecl T t, @NullableDecl T t2) {
        if (t == t2) {
            return true;
        }
        if (t == null || t2 == null) {
            return false;
        }
        return OooO00o(t, t2);
    }
}
