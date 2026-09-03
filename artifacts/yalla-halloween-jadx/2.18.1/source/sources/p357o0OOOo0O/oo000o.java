package p357o0OOOo0O;

import androidx.annotation.Nullable;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class oo000o<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f38366OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Set<Class<? super T>> f38367OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Set<o00000> f38368OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f38369OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o0OOO0o<T> f38370OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f38371OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Set<Class<?>> f38372OooO0oO;

    public static class OooO0O0<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Set<Class<? super T>> f38373OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Set<o00000> f38374OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f38375OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f38376OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public Set<Class<?>> f38377OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public o0OOO0o<T> f38378OooO0o0;

        public OooO0O0(Class cls, Class[] clsArr, OooO00o oooO00o) {
            HashSet hashSet = new HashSet();
            this.f38373OooO00o = hashSet;
            this.f38374OooO0O0 = new HashSet();
            this.f38375OooO0OO = 0;
            this.f38376OooO0Oo = 0;
            this.f38377OooO0o = new HashSet();
            hashSet.add(cls);
            for (Class cls2 : clsArr) {
                Objects.requireNonNull(cls2, "Null interface");
            }
            Collections.addAll(this.f38373OooO00o, clsArr);
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.util.HashSet, java.util.Set<o0OOOo0O.o00000>] */
        @CanIgnoreReturnValue
        public final OooO0O0<T> OooO00o(o00000 o00000Var) {
            if (!(!this.f38373OooO00o.contains(o00000Var.f38321OooO00o))) {
                throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
            }
            this.f38374OooO0O0.add(o00000Var);
            return this;
        }

        public final oo000o<T> OooO0O0() {
            if (this.f38378OooO0o0 != null) {
                return new oo000o<>(null, new HashSet(this.f38373OooO00o), new HashSet(this.f38374OooO0O0), this.f38375OooO0OO, this.f38376OooO0Oo, this.f38378OooO0o0, this.f38377OooO0o);
            }
            throw new IllegalStateException("Missing required property: factory.");
        }

        @CanIgnoreReturnValue
        public final OooO0O0<T> OooO0OO() {
            if (!(this.f38375OooO0OO == 0)) {
                throw new IllegalStateException("Instantiation type has already been set.");
            }
            this.f38375OooO0OO = 2;
            return this;
        }
    }

    public oo000o(@Nullable String str, Set<Class<? super T>> set, Set<o00000> set2, int i, int i2, o0OOO0o<T> o0ooo0o2, Set<Class<?>> set3) {
        this.f38366OooO00o = str;
        this.f38367OooO0O0 = Collections.unmodifiableSet(set);
        this.f38368OooO0OO = Collections.unmodifiableSet(set2);
        this.f38369OooO0Oo = i;
        this.f38371OooO0o0 = i2;
        this.f38370OooO0o = o0ooo0o2;
        this.f38372OooO0oO = Collections.unmodifiableSet(set3);
    }

    public static <T> OooO0O0<T> OooO00o(Class<T> cls) {
        return new OooO0O0<>(cls, new Class[0], null);
    }

    @SafeVarargs
    public static <T> oo000o<T> OooO0OO(T t, Class<T> cls, Class<? super T>... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(cls);
        for (Class<? super T> cls2 : clsArr) {
            Objects.requireNonNull(cls2, "Null interface");
        }
        Collections.addAll(hashSet, clsArr);
        return new oo000o<>(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new o00Ooo(t), hashSet3);
    }

    public final boolean OooO0O0() {
        return this.f38371OooO0o0 == 0;
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f38367OooO0O0.toArray()) + ">{" + this.f38369OooO0Oo + ", type=" + this.f38371OooO0o0 + ", deps=" + Arrays.toString(this.f38368OooO0OO.toArray()) + "}";
    }
}
