package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.ForOverride;
import java.io.Serializable;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class Equivalence<T> {

    public static final class OooO00o extends Equivalence<Object> implements Serializable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f19055OooO0Oo = new OooO00o();

        private Object readResolve() {
            return f19055OooO0Oo;
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

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f19056OooO0Oo = new OooO0O0();

        private Object readResolve() {
            return f19056OooO0Oo;
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
        public final boolean equals(@CheckForNull Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Wrapper)) {
                return false;
            }
            ((Wrapper) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("null".length() + "null".length() + 7);
            sb.append("null.wrap(null)");
            return sb.toString();
        }
    }

    @ForOverride
    public abstract boolean OooO00o(T t, T t2);

    @ForOverride
    public abstract int OooO0O0(T t);

    public final boolean OooO0OO(@CheckForNull T t, @CheckForNull T t2) {
        if (t == t2) {
            return true;
        }
        if (t == null || t2 == null) {
            return false;
        }
        return OooO00o(t, t2);
    }
}
