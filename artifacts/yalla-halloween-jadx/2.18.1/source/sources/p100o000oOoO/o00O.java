package p100o000oOoO;

import android.os.Trace;
import androidx.compose.runtime.InvalidationResult;
import androidx.compose.runtime.Recomposer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p036OoooOOO.o0O0O00;
import p036OoooOOO.o0OO00O;
import p036OoooOOO.o0Oo0oo;
import p036OoooOOO.oo0o0Oo;
import p047Oooooo0.o0oOOo;

/* JADX INFO: loaded from: classes.dex */
public final class o00O implements oo0O {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NotNull
    public final Object f29327Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final o00O0OOO f29328Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final o00O000<?> f29329Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public final AtomicReference<Object> f29330Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @NotNull
    public final HashSet<oo0OOoo> f29331OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @NotNull
    public final o0OO0O0 f29332OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @NotNull
    public final HashSet<oo0oO0> f29333OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @NotNull
    public final o0O0O00<oo0OOoo> f29334OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @NotNull
    public final o0O0O00<o00OOO0<?>> f29335OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    @NotNull
    public final List<Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit>> f29336OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    @NotNull
    public final o0O0O00<oo0OOoo> f29337OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    @NotNull
    public o0OO00O<oo0OOoo, oo0o0Oo<Object>> f29338OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public boolean f29339OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @Nullable
    public o00O f29340OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public int f29341Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @NotNull
    public final o00O00o0 f29342Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @Nullable
    public final CoroutineContext f29343OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public boolean f29344OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    @NotNull
    public Function2<? super oOO00O, ? super Integer, Unit> f29345OooooOo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @NotNull
    public final List<Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit>> f29346o000oOoO;

    public static final class OooO00o implements o0OO000o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final Set<oo0oO0> f29347OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final List<oo0oO0> f29348OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public final List<oo0oO0> f29349OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NotNull
        public final List<Function0<Unit>> f29350OooO0Oo;

        public OooO00o(@NotNull Set<oo0oO0> abandoning) {
            Intrinsics.checkNotNullParameter(abandoning, "abandoning");
            this.f29347OooO00o = abandoning;
            this.f29348OooO0O0 = new ArrayList();
            this.f29349OooO0OO = new ArrayList();
            this.f29350OooO0Oo = new ArrayList();
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<kotlin.jvm.functions.Function0<kotlin.Unit>>] */
        @Override // p100o000oOoO.o0OO000o
        public final void OooO00o(@NotNull Function0<Unit> effect) {
            Intrinsics.checkNotNullParameter(effect, "effect");
            this.f29350OooO0Oo.add(effect);
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<o000oOoO.oo0oO0>] */
        /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List<o000oOoO.oo0oO0>] */
        /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<o000oOoO.oo0oO0>] */
        @Override // p100o000oOoO.o0OO000o
        public final void OooO0O0(@NotNull oo0oO0 instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            int iLastIndexOf = this.f29349OooO0OO.lastIndexOf(instance);
            if (iLastIndexOf < 0) {
                this.f29348OooO0O0.add(instance);
            } else {
                this.f29349OooO0OO.remove(iLastIndexOf);
                this.f29347OooO00o.remove(instance);
            }
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<o000oOoO.oo0oO0>] */
        /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List<o000oOoO.oo0oO0>] */
        /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<o000oOoO.oo0oO0>] */
        @Override // p100o000oOoO.o0OO000o
        public final void OooO0OO(@NotNull oo0oO0 instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            int iLastIndexOf = this.f29348OooO0O0.lastIndexOf(instance);
            if (iLastIndexOf < 0) {
                this.f29349OooO0OO.add(instance);
            } else {
                this.f29348OooO0O0.remove(iLastIndexOf);
                this.f29347OooO00o.remove(instance);
            }
        }

        public final void OooO0Oo() {
            if (!this.f29347OooO00o.isEmpty()) {
                Intrinsics.checkNotNullParameter("Compose:abandons", "name");
                Trace.beginSection("Compose:abandons");
                try {
                    Iterator<oo0oO0> it = this.f29347OooO00o.iterator();
                    while (it.hasNext()) {
                        oo0oO0 next = it.next();
                        it.remove();
                        next.OooO00o();
                    }
                    Unit unit = Unit.INSTANCE;
                } finally {
                    Trace.endSection();
                }
            }
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<kotlin.jvm.functions.Function0<kotlin.Unit>>] */
        /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList, java.util.List, java.util.List<kotlin.jvm.functions.Function0<kotlin.Unit>>] */
        /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList, java.util.List<kotlin.jvm.functions.Function0<kotlin.Unit>>] */
        public final void OooO0o() {
            if (!this.f29350OooO0Oo.isEmpty()) {
                Intrinsics.checkNotNullParameter("Compose:sideeffects", "name");
                Trace.beginSection("Compose:sideeffects");
                try {
                    ?? r0 = this.f29350OooO0Oo;
                    int size = r0.size();
                    for (int i = 0; i < size; i++) {
                        ((Function0) r0.get(i)).invoke();
                    }
                    this.f29350OooO0Oo.clear();
                    Unit unit = Unit.INSTANCE;
                } finally {
                    Trace.endSection();
                }
            }
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<o000oOoO.oo0oO0>] */
        /* JADX WARN: Type inference failed for: r0v12, types: [java.util.ArrayList, java.util.List<o000oOoO.oo0oO0>] */
        /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List<o000oOoO.oo0oO0>] */
        /* JADX WARN: Type inference failed for: r0v8, types: [java.util.ArrayList, java.util.List, java.util.List<o000oOoO.oo0oO0>] */
        /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList, java.util.List<o000oOoO.oo0oO0>] */
        public final void OooO0o0() {
            if (!this.f29349OooO0OO.isEmpty()) {
                Intrinsics.checkNotNullParameter("Compose:onForgotten", "name");
                Trace.beginSection("Compose:onForgotten");
                try {
                    for (int size = this.f29349OooO0OO.size() - 1; -1 < size; size--) {
                        oo0oO0 oo0oo0 = (oo0oO0) this.f29349OooO0OO.get(size);
                        if (!this.f29347OooO00o.contains(oo0oo0)) {
                            oo0oo0.OooO0O0();
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            if (!this.f29348OooO0O0.isEmpty()) {
                Intrinsics.checkNotNullParameter("Compose:onRemembered", "name");
                Trace.beginSection("Compose:onRemembered");
                try {
                    ?? r0 = this.f29348OooO0O0;
                    int size2 = r0.size();
                    for (int i = 0; i < size2; i++) {
                        oo0oO0 oo0oo1 = (oo0oO0) r0.get(i);
                        this.f29347OooO00o.remove(oo0oo1);
                        oo0oo1.OooO0Oo();
                    }
                    Unit unit2 = Unit.INSTANCE;
                } finally {
                    Trace.endSection();
                }
            }
        }
    }

    public o00O(o00O0OOO parent, o00O000 applier) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(applier, "applier");
        this.f29328Oooo0o = parent;
        this.f29329Oooo0oO = applier;
        this.f29330Oooo0oo = new AtomicReference<>(null);
        this.f29327Oooo = new Object();
        HashSet<oo0oO0> hashSet = new HashSet<>();
        this.f29333OoooO00 = hashSet;
        o0OO0O0 o0oo0o1 = new o0OO0O0();
        this.f29332OoooO0 = o0oo0o1;
        this.f29334OoooO0O = new o0O0O00<>();
        this.f29331OoooO = new HashSet<>();
        this.f29335OoooOO0 = new o0O0O00<>();
        ArrayList arrayList = new ArrayList();
        this.f29346o000oOoO = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f29336OoooOOO = arrayList2;
        this.f29337OoooOOo = new o0O0O00<>();
        this.f29338OoooOo0 = new o0OO00O<>();
        o00O00o0 o00o00o1 = new o00O00o0(applier, parent, o0oo0o1, hashSet, arrayList, arrayList2, this);
        parent.OooOO0o(o00o00o1);
        this.f29342Ooooo0o = o00o00o1;
        this.f29343OooooO0 = null;
        boolean z = parent instanceof Recomposer;
        o00O00 o00o01 = o00O00.f29354OooO00o;
        this.f29345OooooOo = o00O00.f29355OooO0O0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r3v12, types: [T, java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    public static final void OooOo00(o00O o00o2, boolean z, Ref.ObjectRef<HashSet<oo0OOoo>> objectRef, Object obj) {
        o0O0O00<oo0OOoo> o0o0o00 = o00o2.f29334OoooO0O;
        int iOooO0Oo = o0o0o00.OooO0Oo(obj);
        if (iOooO0Oo < 0) {
            return;
        }
        oo0o0Oo oo0o0ooOooO00o = o0O0O00.OooO00o(o0o0o00, iOooO0Oo);
        Objects.requireNonNull(oo0o0ooOooO00o);
        int i = 0;
        while (true) {
            if (!(i < oo0o0ooOooO00o.f3681Oooo0o)) {
                return;
            }
            int i2 = i + 1;
            Object obj2 = oo0o0ooOooO00o.f3682Oooo0oO[i];
            Objects.requireNonNull(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            oo0OOoo oo0oooo = (oo0OOoo) obj2;
            if (!o00o2.f29337OoooOOo.OooO0o0(obj, oo0oooo) && oo0oooo.OooO0O0(obj) != InvalidationResult.IGNORED) {
                if (!(oo0oooo.f29703OooO0oO != null) || z) {
                    HashSet<oo0OOoo> hashSet = objectRef.element;
                    ?? r3 = hashSet;
                    if (hashSet == null) {
                        ?? hashSet2 = new HashSet();
                        objectRef.element = hashSet2;
                        r3 = hashSet2;
                    }
                    r3.add(oo0oooo);
                } else {
                    o00o2.f29331OoooO.add(oo0oooo);
                }
            }
            i = i2;
        }
    }

    @Override // p100o000oOoO.o00O0OO
    public final void OooO(@NotNull Function2<? super oOO00O, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        if (!(!this.f29344OooooOO)) {
            throw new IllegalStateException("The composition is disposed".toString());
        }
        this.f29345OooooOo = content;
        this.f29328Oooo0o.OooO00o(this, content);
    }

    @Override // p100o000oOoO.oo0O
    public final void OooO00o(@NotNull Function2<? super oOO00O, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        try {
            synchronized (this.f29327Oooo) {
                OooOo0o();
                o00O00o0 o00o00o1 = this.f29342Ooooo0o;
                o0OO00O<oo0OOoo, oo0o0Oo<Object>> invalidationsRequested = this.f29338OoooOo0;
                this.f29338OoooOo0 = new o0OO00O<>();
                Objects.requireNonNull(o00o00o1);
                Intrinsics.checkNotNullParameter(invalidationsRequested, "invalidationsRequested");
                Intrinsics.checkNotNullParameter(content, "content");
                if (!o00o00o1.f29377OooO0o0.isEmpty()) {
                    oo0o0O0.OooO0Oo("Expected applyChanges() to have been called".toString());
                    throw null;
                }
                o00o00o1.OoooOOO(invalidationsRequested, content);
                Unit unit = Unit.INSTANCE;
            }
        } catch (Throwable th) {
            if (!this.f29333OoooO00.isEmpty()) {
                HashSet<oo0oO0> abandoning = this.f29333OoooO00;
                Intrinsics.checkNotNullParameter(abandoning, "abandoning");
                new ArrayList();
                new ArrayList();
                new ArrayList();
                if (true ^ abandoning.isEmpty()) {
                    Intrinsics.checkNotNullParameter("Compose:abandons", "name");
                    Trace.beginSection("Compose:abandons");
                    try {
                        Iterator<oo0oO0> it = abandoning.iterator();
                        while (it.hasNext()) {
                            oo0oO0 next = it.next();
                            it.remove();
                            next.OooO00o();
                        }
                        Unit unit2 = Unit.INSTANCE;
                    } finally {
                        Trace.endSection();
                    }
                }
            }
            throw th;
        }
    }

    @Override // p100o000oOoO.oo0O
    public final boolean OooO0O0(@NotNull Set<? extends Object> values) {
        Intrinsics.checkNotNullParameter(values, "values");
        oo0o0Oo oo0o0oo = (oo0o0Oo) values;
        int i = 0;
        while (true) {
            if (!(i < oo0o0oo.f3681Oooo0o)) {
                return false;
            }
            int i2 = i + 1;
            Object obj = oo0o0oo.f3682Oooo0oO[i];
            Objects.requireNonNull(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            if (this.f29334OoooO0O.OooO0OO(obj) || this.f29335OoooOO0.OooO0OO(obj)) {
                return true;
            }
            i = i2;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList, java.util.List<kotlin.jvm.functions.Function3<o000oOoO.o00O000<?>, o000oOoO.o0OO0o00, o000oOoO.o0OO000o, kotlin.Unit>>] */
    @Override // p100o000oOoO.oo0O
    public final void OooO0OO() {
        synchronized (this.f29327Oooo) {
            if (!this.f29336OoooOOO.isEmpty()) {
                OooOo0(this.f29336OoooOOO);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00d1 A[PHI: r9
      0x00d1: PHI (r9v1 int) = (r9v0 int), (r9v9 int) binds: [B:25:0x0073, B:57:0x00ca] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x00da  */
    /* JADX WARN: Code duplicated, block: B:62:0x010b  */
    @Override // p100o000oOoO.oo0O
    public final void OooO0Oo(@NotNull Object key) {
        oo0OOoo oo0ooooOoooo00;
        int i;
        int i2;
        Object[] objArr;
        int i3;
        Intrinsics.checkNotNullParameter(key, "value");
        o00O00o0 o00o00o1 = this.f29342Ooooo0o;
        int i4 = 0;
        if ((o00o00o1.f29395OooOoO > 0) || (oo0ooooOoooo00 = o00o00o1.Ooooo00()) == null) {
            return;
        }
        oo0ooooOoooo00.f29697OooO00o |= 1;
        this.f29334OoooO0O.OooO0O0(key, oo0ooooOoooo00);
        boolean z = key instanceof o00OOO0;
        if (z) {
            this.f29335OoooOO0.OooO0o(key);
            Iterator<T> it = ((o00OOO0) key).OooOO0o().iterator();
            while (it.hasNext()) {
                this.f29335OoooOO0.OooO0O0((o0oOOo) it.next(), key);
            }
        }
        Intrinsics.checkNotNullParameter(key, "instance");
        if ((oo0ooooOoooo00.f29697OooO00o & 32) != 0) {
            return;
        }
        o0Oo0oo o0oo0oo2 = oo0ooooOoooo00.f29701OooO0o;
        if (o0oo0oo2 == null) {
            o0oo0oo2 = new o0Oo0oo();
            oo0ooooOoooo00.f29701OooO0o = o0oo0oo2;
        }
        int i5 = oo0ooooOoooo00.f29702OooO0o0;
        Intrinsics.checkNotNullParameter(key, "key");
        int i6 = o0oo0oo2.f3678OooO00o;
        int i7 = -1;
        if (i6 > 0) {
            int i8 = i6 - 1;
            int iIdentityHashCode = System.identityHashCode(key);
            while (true) {
                if (i4 <= i8) {
                    int i9 = (i4 + i8) >>> 1;
                    Object obj = o0oo0oo2.f3679OooO0O0[i9];
                    int iIdentityHashCode2 = System.identityHashCode(obj);
                    if (iIdentityHashCode2 >= iIdentityHashCode) {
                        if (iIdentityHashCode2 <= iIdentityHashCode) {
                            if (obj != key) {
                                i3 = i9 - 1;
                                while (true) {
                                    if (-1 < i3) {
                                        Object obj2 = o0oo0oo2.f3679OooO0O0[i3];
                                        if (obj2 != key) {
                                            if (System.identityHashCode(obj2) == iIdentityHashCode) {
                                                i3--;
                                            }
                                        }
                                    }
                                    int i10 = i9 + 1;
                                    int i11 = o0oo0oo2.f3678OooO00o;
                                    while (true) {
                                        if (i10 >= i11) {
                                            i10 = o0oo0oo2.f3678OooO00o;
                                        } else {
                                            Object obj3 = o0oo0oo2.f3679OooO0O0[i10];
                                            if (obj3 == key) {
                                                i3 = i10;
                                                break;
                                            } else if (System.identityHashCode(obj3) == iIdentityHashCode) {
                                                i10++;
                                            }
                                        }
                                        i3 = -(i10 + 1);
                                        break;
                                    }
                                }
                            } else {
                                i7 = i9;
                                break;
                            }
                        } else {
                            i8 = i9 - 1;
                        }
                    } else {
                        i4 = i9 + 1;
                    }
                } else {
                    i3 = -(i4 + 1);
                }
                i7 = i3;
                break;
            }
            if (i7 >= 0) {
                o0oo0oo2.f3680OooO0OO[i7] = i5;
            } else {
                i = -(i7 + 1);
                i2 = o0oo0oo2.f3678OooO00o;
                objArr = o0oo0oo2.f3679OooO0O0;
                if (i2 == objArr.length) {
                    Object[] objArr2 = new Object[objArr.length * 2];
                    int[] iArr = new int[objArr.length * 2];
                    int i12 = i + 1;
                    ArraysKt.copyInto(objArr, objArr2, i12, i, i2);
                    ArraysKt.copyInto(o0oo0oo2.f3680OooO0OO, iArr, i12, i, o0oo0oo2.f3678OooO00o);
                    ArraysKt.OooO0o0(o0oo0oo2.f3679OooO0O0, objArr2, 0, 0, i, 6);
                    ArraysKt___ArraysJvmKt.copyInto$default(o0oo0oo2.f3680OooO0OO, iArr, 0, 0, i, 6, (Object) null);
                    o0oo0oo2.f3679OooO0O0 = objArr2;
                    o0oo0oo2.f3680OooO0OO = iArr;
                } else {
                    int i13 = i + 1;
                    ArraysKt.copyInto(objArr, objArr, i13, i, i2);
                    int[] iArr2 = o0oo0oo2.f3680OooO0OO;
                    ArraysKt.copyInto(iArr2, iArr2, i13, i, o0oo0oo2.f3678OooO00o);
                }
                o0oo0oo2.f3679OooO0O0[i] = key;
                o0oo0oo2.f3680OooO0OO[i] = i5;
                o0oo0oo2.f3678OooO00o++;
            }
        } else {
            i = -(i7 + 1);
            i2 = o0oo0oo2.f3678OooO00o;
            objArr = o0oo0oo2.f3679OooO0O0;
            if (i2 == objArr.length) {
                Object[] objArr3 = new Object[objArr.length * 2];
                int[] iArr3 = new int[objArr.length * 2];
                int i14 = i + 1;
                ArraysKt.copyInto(objArr, objArr3, i14, i, i2);
                ArraysKt.copyInto(o0oo0oo2.f3680OooO0OO, iArr3, i14, i, o0oo0oo2.f3678OooO00o);
                ArraysKt.OooO0o0(o0oo0oo2.f3679OooO0O0, objArr3, 0, 0, i, 6);
                ArraysKt___ArraysJvmKt.copyInto$default(o0oo0oo2.f3680OooO0OO, iArr3, 0, 0, i, 6, (Object) null);
                o0oo0oo2.f3679OooO0O0 = objArr3;
                o0oo0oo2.f3680OooO0OO = iArr3;
            } else {
                int i15 = i + 1;
                ArraysKt.copyInto(objArr, objArr, i15, i, i2);
                int[] iArr4 = o0oo0oo2.f3680OooO0OO;
                ArraysKt.copyInto(iArr4, iArr4, i15, i, o0oo0oo2.f3678OooO00o);
            }
            o0oo0oo2.f3679OooO0O0[i] = key;
            o0oo0oo2.f3680OooO0OO[i] = i5;
            o0oo0oo2.f3678OooO00o++;
        }
        if (z) {
            o0OO00O<o00OOO0<?>, Object> o0oo00o2 = oo0ooooOoooo00.f29703OooO0oO;
            if (o0oo00o2 == null) {
                o0oo00o2 = new o0OO00O<>();
                oo0ooooOoooo00.f29703OooO0oO = o0oo00o2;
            }
            o0oo00o2.OooO0O0(key, ((o00OOO0) key).OooO0Oo());
        }
    }

    @Override // p100o000oOoO.oo0O
    public final void OooO0o(@NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        o00O00o0 o00o00o1 = this.f29342Ooooo0o;
        Objects.requireNonNull(o00o00o1);
        Intrinsics.checkNotNullParameter(block, "block");
        if (!(!o00o00o1.f29398OooOoo)) {
            oo0o0O0.OooO0Oo("Preparing a composition while composing is not supported".toString());
            throw null;
        }
        o00o00o1.f29398OooOoo = true;
        try {
            ((o0O0o00O) block).invoke();
        } finally {
            o00o00o1.f29398OooOoo = false;
        }
    }

    @Override // p100o000oOoO.o00O0OO
    public final boolean OooO0o0() {
        return this.f29344OooooOO;
    }

    @Override // p100o000oOoO.oo0O
    public final void OooO0oO(@NotNull Set<? extends Object> values) {
        Object obj;
        boolean zAreEqual;
        Object objPlus;
        Intrinsics.checkNotNullParameter(values, "values");
        do {
            obj = this.f29330Oooo0oo.get();
            if (obj == null) {
                zAreEqual = true;
            } else {
                Object obj2 = o00OO000.f29493OooO00o;
                zAreEqual = Intrinsics.areEqual(obj, o00OO000.f29493OooO00o);
            }
            if (zAreEqual) {
                objPlus = values;
            } else if (obj instanceof Set) {
                objPlus = new Set[]{(Set) obj, values};
            } else {
                if (!(obj instanceof Object[])) {
                    StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("corrupt pendingModifications: ");
                    sbOooO0o0.append(this.f29330Oooo0oo);
                    throw new IllegalStateException(sbOooO0o0.toString().toString());
                }
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>");
                objPlus = ArraysKt.plus((Set<? extends Object>[]) obj, values);
            }
        } while (!this.f29330Oooo0oo.compareAndSet(obj, objPlus));
        if (obj == null) {
            synchronized (this.f29327Oooo) {
                OooOo();
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Override // p100o000oOoO.oo0O
    public final void OooO0oo() {
        synchronized (this.f29327Oooo) {
            OooOo0(this.f29346o000oOoO);
            OooOo();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // p100o000oOoO.oo0O
    public final boolean OooOO0() {
        return this.f29342Ooooo0o.f29398OooOoo;
    }

    @Override // p100o000oOoO.oo0O
    public final void OooOO0O(@NotNull List<Pair<o0O00O, o0O00O>> references) {
        Intrinsics.checkNotNullParameter(references, "references");
        ArrayList arrayList = (ArrayList) references;
        int size = arrayList.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                z = true;
                break;
            } else if (!Intrinsics.areEqual(((o0O00O) ((Pair) arrayList.get(i)).getFirst()).f29531OooO0OO, this)) {
                break;
            } else {
                i++;
            }
        }
        oo0o0O0.OooO0oO(z);
        try {
            this.f29342Ooooo0o.Ooooo0o(references);
            Unit unit = Unit.INSTANCE;
        } catch (Throwable th) {
            if (!this.f29333OoooO00.isEmpty()) {
                HashSet<oo0oO0> abandoning = this.f29333OoooO00;
                Intrinsics.checkNotNullParameter(abandoning, "abandoning");
                new ArrayList();
                new ArrayList();
                new ArrayList();
                if (!abandoning.isEmpty()) {
                    Intrinsics.checkNotNullParameter("Compose:abandons", "name");
                    Trace.beginSection("Compose:abandons");
                    try {
                        Iterator<oo0oO0> it = abandoning.iterator();
                        while (it.hasNext()) {
                            oo0oO0 next = it.next();
                            it.remove();
                            next.OooO00o();
                        }
                        Unit unit2 = Unit.INSTANCE;
                    } finally {
                        Trace.endSection();
                    }
                }
            }
            throw th;
        }
    }

    @Override // p100o000oOoO.oo0O
    public final void OooOO0o(@NotNull Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        synchronized (this.f29327Oooo) {
            OooOoOO(value);
            o0O0O00<o00OOO0<?>> o0o0o00 = this.f29335OoooOO0;
            int iOooO0Oo = o0o0o00.OooO0Oo(value);
            if (iOooO0Oo >= 0) {
                oo0o0Oo oo0o0ooOooO00o = o0O0O00.OooO00o(o0o0o00, iOooO0Oo);
                Objects.requireNonNull(oo0o0ooOooO00o);
                int i = 0;
                while (true) {
                    if (!(i < oo0o0ooOooO00o.f3681Oooo0o)) {
                        break;
                    }
                    int i2 = i + 1;
                    Object obj = oo0o0ooOooO00o.f3682Oooo0oO[i];
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                    OooOoOO((o00OOO0) obj);
                    i = i2;
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // p100o000oOoO.o00O0OO
    public final boolean OooOOO() {
        boolean z;
        synchronized (this.f29327Oooo) {
            z = this.f29338OoooOo0.f3677OooO0OO > 0;
        }
        return z;
    }

    @Override // p100o000oOoO.oo0O
    public final void OooOOO0(@NotNull o0O00O0o state) {
        Intrinsics.checkNotNullParameter(state, "state");
        OooO00o oooO00o = new OooO00o(this.f29333OoooO00);
        o0OO0o00 o0oo0o00OooO0o0 = state.f29536OooO00o.OooO0o0();
        try {
            oo0o0O0.OooO0o(o0oo0o00OooO0o0, oooO00o);
            Unit unit = Unit.INSTANCE;
            o0oo0o00OooO0o0.OooO0o();
            oooO00o.OooO0o0();
        } catch (Throwable th) {
            o0oo0o00OooO0o0.OooO0o();
            throw th;
        }
    }

    @Override // p100o000oOoO.oo0O
    public final void OooOOOO() {
        synchronized (this.f29327Oooo) {
            this.f29342Ooooo0o.f29391OooOo0.clear();
            if (!this.f29333OoooO00.isEmpty()) {
                HashSet<oo0oO0> abandoning = this.f29333OoooO00;
                Intrinsics.checkNotNullParameter(abandoning, "abandoning");
                new ArrayList();
                new ArrayList();
                new ArrayList();
                if (!abandoning.isEmpty()) {
                    Intrinsics.checkNotNullParameter("Compose:abandons", "name");
                    Trace.beginSection("Compose:abandons");
                    try {
                        Iterator<oo0oO0> it = abandoning.iterator();
                        while (it.hasNext()) {
                            oo0oO0 next = it.next();
                            it.remove();
                            next.OooO00o();
                        }
                        Unit unit = Unit.INSTANCE;
                        Trace.endSection();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            Unit unit2 = Unit.INSTANCE;
        }
    }

    @Override // p100o000oOoO.oo0O
    public final <R> R OooOOOo(@Nullable oo0O oo0o, int i, @NotNull Function0<? extends R> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (oo0o == null || Intrinsics.areEqual(oo0o, this) || i < 0) {
            return block.invoke();
        }
        this.f29340OoooOoo = (o00O) oo0o;
        this.f29341Ooooo00 = i;
        try {
            return block.invoke();
        } finally {
            this.f29340OoooOoo = null;
            this.f29341Ooooo00 = 0;
        }
    }

    @Override // p100o000oOoO.oo0O
    public final void OooOOo() {
        synchronized (this.f29327Oooo) {
            for (Object obj : this.f29332OoooO0.f29603Oooo0oo) {
                oo0OOoo oo0oooo = obj instanceof oo0OOoo ? (oo0OOoo) obj : null;
                if (oo0oooo != null) {
                    oo0oooo.invalidate();
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // p100o000oOoO.oo0O
    public final boolean OooOOo0() {
        boolean zOoooooo;
        synchronized (this.f29327Oooo) {
            OooOo0o();
            try {
                o00O00o0 o00o00o1 = this.f29342Ooooo0o;
                o0OO00O<oo0OOoo, oo0o0Oo<Object>> o0oo00o2 = this.f29338OoooOo0;
                this.f29338OoooOo0 = new o0OO00O<>();
                zOoooooo = o00o00o1.Ooooooo(o0oo00o2);
                if (!zOoooooo) {
                    OooOo();
                }
            } catch (Throwable th) {
                if (!this.f29333OoooO00.isEmpty()) {
                    HashSet<oo0oO0> abandoning = this.f29333OoooO00;
                    Intrinsics.checkNotNullParameter(abandoning, "abandoning");
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    if (!abandoning.isEmpty()) {
                        Intrinsics.checkNotNullParameter("Compose:abandons", "name");
                        Trace.beginSection("Compose:abandons");
                        try {
                            Iterator<oo0oO0> it = abandoning.iterator();
                            while (it.hasNext()) {
                                oo0oO0 next = it.next();
                                it.remove();
                                next.OooO00o();
                            }
                            Unit unit = Unit.INSTANCE;
                        } finally {
                            Trace.endSection();
                        }
                    }
                }
                throw th;
            }
        }
        return zOoooooo;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0092  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOOoo(Set<? extends Object> set, boolean z) {
        boolean z2;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        for (Object obj : set) {
            if (obj instanceof oo0OOoo) {
                ((oo0OOoo) obj).OooO0O0(null);
            } else {
                OooOo00(this, z, objectRef, obj);
                o0O0O00<o00OOO0<?>> o0o0o00 = this.f29335OoooOO0;
                int iOooO0Oo = o0o0o00.OooO0Oo(obj);
                if (iOooO0Oo >= 0) {
                    Iterator<T> it = o0O0O00.OooO00o(o0o0o00, iOooO0Oo).iterator();
                    while (it.hasNext()) {
                        OooOo00(this, z, objectRef, (o00OOO0) it.next());
                    }
                }
            }
        }
        if (!z || !(!this.f29331OoooO.isEmpty())) {
            HashSet hashSet = (HashSet) objectRef.element;
            if (hashSet != null) {
                o0O0O00<oo0OOoo> o0o0o01 = this.f29334OoooO0O;
                int i = o0o0o01.f3674OooO0Oo;
                int i2 = 0;
                for (int i3 = 0; i3 < i; i3++) {
                    int i4 = o0o0o01.f3671OooO00o[i3];
                    oo0o0Oo<oo0OOoo> oo0o0oo = o0o0o01.f3673OooO0OO[i4];
                    Intrinsics.checkNotNull(oo0o0oo);
                    int i5 = oo0o0oo.f3681Oooo0o;
                    int i6 = 0;
                    for (int i7 = 0; i7 < i5; i7++) {
                        Object obj2 = oo0o0oo.f3682Oooo0oO[i7];
                        Objects.requireNonNull(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                        if (!hashSet.contains((oo0OOoo) obj2)) {
                            if (i6 != i7) {
                                oo0o0oo.f3682Oooo0oO[i6] = obj2;
                            }
                            i6++;
                        }
                    }
                    int i8 = oo0o0oo.f3681Oooo0o;
                    for (int i9 = i6; i9 < i8; i9++) {
                        oo0o0oo.f3682Oooo0oO[i9] = null;
                    }
                    oo0o0oo.f3681Oooo0o = i6;
                    if (i6 > 0) {
                        if (i2 != i3) {
                            int[] iArr = o0o0o01.f3671OooO00o;
                            int i10 = iArr[i2];
                            iArr[i2] = i4;
                            iArr[i3] = i10;
                        }
                        i2++;
                    }
                }
                int i11 = o0o0o01.f3674OooO0Oo;
                for (int i12 = i2; i12 < i11; i12++) {
                    o0o0o01.f3672OooO0O0[o0o0o01.f3671OooO00o[i12]] = null;
                }
                o0o0o01.f3674OooO0Oo = i2;
                OooOo0O();
                return;
            }
            return;
        }
        o0O0O00<oo0OOoo> o0o0o02 = this.f29334OoooO0O;
        int i13 = o0o0o02.f3674OooO0Oo;
        int i14 = 0;
        for (int i15 = 0; i15 < i13; i15++) {
            int i16 = o0o0o02.f3671OooO00o[i15];
            oo0o0Oo<oo0OOoo> oo0o0oo2 = o0o0o02.f3673OooO0OO[i16];
            Intrinsics.checkNotNull(oo0o0oo2);
            int i17 = oo0o0oo2.f3681Oooo0o;
            int i18 = 0;
            for (int i19 = 0; i19 < i17; i19++) {
                Object obj3 = oo0o0oo2.f3682Oooo0oO[i19];
                Objects.requireNonNull(obj3, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                oo0OOoo oo0oooo = (oo0OOoo) obj3;
                if (this.f29331OoooO.contains(oo0oooo)) {
                    z2 = true;
                } else {
                    HashSet hashSet2 = (HashSet) objectRef.element;
                    if (hashSet2 != null && hashSet2.contains(oo0oooo)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                if (!z2) {
                    if (i18 != i19) {
                        oo0o0oo2.f3682Oooo0oO[i18] = obj3;
                    }
                    i18++;
                }
            }
            int i20 = oo0o0oo2.f3681Oooo0o;
            for (int i21 = i18; i21 < i20; i21++) {
                oo0o0oo2.f3682Oooo0oO[i21] = null;
            }
            oo0o0oo2.f3681Oooo0o = i18;
            if (i18 > 0) {
                if (i14 != i15) {
                    int[] iArr2 = o0o0o02.f3671OooO00o;
                    int i22 = iArr2[i14];
                    iArr2[i14] = i16;
                    iArr2[i15] = i22;
                }
                i14++;
            }
        }
        int i23 = o0o0o02.f3674OooO0Oo;
        for (int i24 = i14; i24 < i23; i24++) {
            o0o0o02.f3672OooO0O0[o0o0o02.f3671OooO00o[i24]] = null;
        }
        o0o0o02.f3674OooO0Oo = i14;
        OooOo0O();
        this.f29331OoooO.clear();
    }

    public final void OooOo() {
        Object andSet = this.f29330Oooo0oo.getAndSet(null);
        Object obj = o00OO000.f29493OooO00o;
        if (Intrinsics.areEqual(andSet, o00OO000.f29493OooO00o)) {
            return;
        }
        if (andSet instanceof Set) {
            OooOOoo((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            if (andSet == null) {
                throw new IllegalStateException("calling recordModificationsOf and applyChanges concurrently is not supported".toString());
            }
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("corrupt pendingModifications drain: ");
            sbOooO0o0.append(this.f29330Oooo0oo);
            throw new IllegalStateException(sbOooO0o0.toString().toString());
        }
        for (Set<? extends Object> set : (Set[]) andSet) {
            OooOOoo(set, false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a5  */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.ArrayList, java.util.List<kotlin.jvm.functions.Function3<o000oOoO.o00O000<?>, o000oOoO.o0OO0o00, o000oOoO.o0OO000o, kotlin.Unit>>] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList, java.util.List<kotlin.jvm.functions.Function3<o000oOoO.o00O000<?>, o000oOoO.o0OO0o00, o000oOoO.o0OO000o, kotlin.Unit>>] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.ArrayList, java.util.List<kotlin.jvm.functions.Function3<o000oOoO.o00O000<?>, o000oOoO.o0OO0o00, o000oOoO.o0OO000o, kotlin.Unit>>] */
    public final void OooOo0(List<Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit>> list) {
        boolean z;
        OooO00o oooO00o = new OooO00o(this.f29333OoooO00);
        try {
            if (list.isEmpty()) {
                if (this.f29336OoooOOO.isEmpty()) {
                    oooO00o.OooO0Oo();
                    return;
                }
                return;
            }
            Intrinsics.checkNotNullParameter("Compose:applyChanges", "name");
            Trace.beginSection("Compose:applyChanges");
            try {
                this.f29329Oooo0oO.OooO0Oo();
                o0OO0o00 o0oo0o00OooO0o0 = this.f29332OoooO0.OooO0o0();
                try {
                    o00O000<?> o00o001 = this.f29329Oooo0oO;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        list.get(i).invoke(o00o001, o0oo0o00OooO0o0, oooO00o);
                    }
                    list.clear();
                    Unit unit = Unit.INSTANCE;
                    o0oo0o00OooO0o0.OooO0o();
                    this.f29329Oooo0oO.OooO();
                    Trace.endSection();
                    oooO00o.OooO0o0();
                    oooO00o.OooO0o();
                    if (this.f29339OoooOoO) {
                        Intrinsics.checkNotNullParameter("Compose:unobserve", "name");
                        Trace.beginSection("Compose:unobserve");
                        try {
                            this.f29339OoooOoO = false;
                            o0O0O00<oo0OOoo> o0o0o00 = this.f29334OoooO0O;
                            int i2 = o0o0o00.f3674OooO0Oo;
                            int i3 = 0;
                            for (int i4 = 0; i4 < i2; i4++) {
                                int i5 = o0o0o00.f3671OooO00o[i4];
                                oo0o0Oo<oo0OOoo> oo0o0oo = o0o0o00.f3673OooO0OO[i5];
                                Intrinsics.checkNotNull(oo0o0oo);
                                int i6 = oo0o0oo.f3681Oooo0o;
                                int i7 = 0;
                                for (int i8 = 0; i8 < i6; i8++) {
                                    Object obj = oo0o0oo.f3682Oooo0oO[i8];
                                    if (obj == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                                    }
                                    oo0OOoo oo0oooo = (oo0OOoo) obj;
                                    if (oo0oooo.f29698OooO0O0 == null) {
                                        z = false;
                                    } else {
                                        o00oOoo o00oooo2 = oo0oooo.f29699OooO0OO;
                                        if (o00oooo2 != null ? o00oooo2.OooO00o() : false) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                    }
                                    if (!(!z)) {
                                        if (i7 != i8) {
                                            oo0o0oo.f3682Oooo0oO[i7] = obj;
                                        }
                                        i7++;
                                    }
                                }
                                int i9 = oo0o0oo.f3681Oooo0o;
                                for (int i10 = i7; i10 < i9; i10++) {
                                    oo0o0oo.f3682Oooo0oO[i10] = null;
                                }
                                oo0o0oo.f3681Oooo0o = i7;
                                if (i7 > 0) {
                                    if (i3 != i4) {
                                        int[] iArr = o0o0o00.f3671OooO00o;
                                        int i11 = iArr[i3];
                                        iArr[i3] = i5;
                                        iArr[i4] = i11;
                                    }
                                    i3++;
                                }
                            }
                            int i12 = o0o0o00.f3674OooO0Oo;
                            for (int i13 = i3; i13 < i12; i13++) {
                                o0o0o00.f3672OooO0O0[o0o0o00.f3671OooO00o[i13]] = null;
                            }
                            o0o0o00.f3674OooO0Oo = i3;
                            OooOo0O();
                            Unit unit2 = Unit.INSTANCE;
                            Trace.endSection();
                        } catch (Throwable th) {
                            Trace.endSection();
                            throw th;
                        }
                    }
                    if (this.f29336OoooOOO.isEmpty()) {
                        oooO00o.OooO0Oo();
                    }
                } catch (Throwable th2) {
                    o0oo0o00OooO0o0.OooO0o();
                    throw th2;
                }
            } catch (Throwable th3) {
                Trace.endSection();
                throw th3;
            }
        } catch (Throwable th4) {
            if (this.f29336OoooOOO.isEmpty()) {
                oooO00o.OooO0Oo();
            }
            throw th4;
        }
    }

    public final void OooOo0O() {
        o0O0O00<o00OOO0<?>> o0o0o00 = this.f29335OoooOO0;
        int i = o0o0o00.f3674OooO0Oo;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = o0o0o00.f3671OooO00o[i3];
            oo0o0Oo<o00OOO0<?>> oo0o0oo = o0o0o00.f3673OooO0OO[i4];
            Intrinsics.checkNotNull(oo0o0oo);
            int i5 = oo0o0oo.f3681Oooo0o;
            int i6 = 0;
            for (int i7 = 0; i7 < i5; i7++) {
                Object obj = oo0o0oo.f3682Oooo0oO[i7];
                Objects.requireNonNull(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                if (!(!this.f29334OoooO0O.OooO0OO((o00OOO0) obj))) {
                    if (i6 != i7) {
                        oo0o0oo.f3682Oooo0oO[i6] = obj;
                    }
                    i6++;
                }
            }
            int i8 = oo0o0oo.f3681Oooo0o;
            for (int i9 = i6; i9 < i8; i9++) {
                oo0o0oo.f3682Oooo0oO[i9] = null;
            }
            oo0o0oo.f3681Oooo0o = i6;
            if (i6 > 0) {
                if (i2 != i3) {
                    int[] iArr = o0o0o00.f3671OooO00o;
                    int i10 = iArr[i2];
                    iArr[i2] = i4;
                    iArr[i3] = i10;
                }
                i2++;
            }
        }
        int i11 = o0o0o00.f3674OooO0Oo;
        for (int i12 = i2; i12 < i11; i12++) {
            o0o0o00.f3672OooO0O0[o0o0o00.f3671OooO00o[i12]] = null;
        }
        o0o0o00.f3674OooO0Oo = i2;
        Iterator<oo0OOoo> it = this.f29331OoooO.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator()");
        while (it.hasNext()) {
            if (!(it.next().f29703OooO0oO != null)) {
                it.remove();
            }
        }
    }

    public final void OooOo0o() {
        AtomicReference<Object> atomicReference = this.f29330Oooo0oo;
        Object obj = o00OO000.f29493OooO00o;
        Object obj2 = o00OO000.f29493OooO00o;
        Object andSet = atomicReference.getAndSet(obj2);
        if (andSet != null) {
            if (Intrinsics.areEqual(andSet, obj2)) {
                throw new IllegalStateException("pending composition has not been applied".toString());
            }
            if (andSet instanceof Set) {
                OooOOoo((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("corrupt pendingModifications drain: ");
                sbOooO0o0.append(this.f29330Oooo0oo);
                throw new IllegalStateException(sbOooO0o0.toString().toString());
            }
            for (Set<? extends Object> set : (Set[]) andSet) {
                OooOOoo(set, true);
            }
        }
    }

    public final InvalidationResult OooOoO(oo0OOoo oo0oooo, o00oOoo o00oooo2, Object obj) {
        synchronized (this.f29327Oooo) {
            o00O o00o2 = this.f29340OoooOoo;
            if (o00o2 == null || !this.f29332OoooO0.OooO0O0(this.f29341Ooooo00, o00oooo2)) {
                o00o2 = null;
            }
            if (o00o2 == null) {
                o00O00o0 o00o00o1 = this.f29342Ooooo0o;
                if (o00o00o1.f29398OooOoo && o00o00o1.o000000O(oo0oooo, obj)) {
                    return InvalidationResult.IMMINENT;
                }
                if (obj == null) {
                    this.f29338OoooOo0.OooO0O0(oo0oooo, null);
                } else {
                    o00OO000.OooO0O0(this.f29338OoooOo0, oo0oooo, obj);
                }
            }
            if (o00o2 != null) {
                return o00o2.OooOoO(oo0oooo, o00oooo2, obj);
            }
            this.f29328Oooo0o.OooO0oo(this);
            return this.f29342Ooooo0o.f29398OooOoo ? InvalidationResult.DEFERRED : InvalidationResult.SCHEDULED;
        }
    }

    @NotNull
    public final InvalidationResult OooOoO0(@NotNull oo0OOoo scope, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        int i = scope.f29697OooO00o;
        if ((i & 2) != 0) {
            scope.f29697OooO00o = i | 4;
        }
        o00oOoo o00oooo2 = scope.f29699OooO0OO;
        if (o00oooo2 == null || !this.f29332OoooO0.OooO0oO(o00oooo2) || !o00oooo2.OooO00o()) {
            return InvalidationResult.IGNORED;
        }
        if (o00oooo2.OooO00o()) {
            return !(scope.f29700OooO0Oo != null) ? InvalidationResult.IGNORED : OooOoO(scope, o00oooo2, obj);
        }
        return InvalidationResult.IGNORED;
    }

    public final void OooOoOO(Object obj) {
        o0O0O00<oo0OOoo> o0o0o00 = this.f29334OoooO0O;
        int iOooO0Oo = o0o0o00.OooO0Oo(obj);
        if (iOooO0Oo >= 0) {
            for (oo0OOoo oo0oooo : o0O0O00.OooO00o(o0o0o00, iOooO0Oo)) {
                if (oo0oooo.OooO0O0(obj) == InvalidationResult.IMMINENT) {
                    this.f29337OoooOOo.OooO0O0(obj, oo0oooo);
                }
            }
        }
    }

    @Override // p100o000oOoO.o00O0OO
    public final void dispose() {
        synchronized (this.f29327Oooo) {
            if (!this.f29344OooooOO) {
                this.f29344OooooOO = true;
                o00O00 o00o01 = o00O00.f29354OooO00o;
                this.f29345OooooOo = o00O00.f29356OooO0OO;
                boolean z = this.f29332OoooO0.f29602Oooo0oO > 0;
                if (z || (true ^ this.f29333OoooO00.isEmpty())) {
                    OooO00o oooO00o = new OooO00o(this.f29333OoooO00);
                    if (z) {
                        o0OO0o00 o0oo0o00OooO0o0 = this.f29332OoooO0.OooO0o0();
                        try {
                            oo0o0O0.OooO0o(o0oo0o00OooO0o0, oooO00o);
                            Unit unit = Unit.INSTANCE;
                            o0oo0o00OooO0o0.OooO0o();
                            this.f29329Oooo0oO.clear();
                            oooO00o.OooO0o0();
                        } catch (Throwable th) {
                            o0oo0o00OooO0o0.OooO0o();
                            throw th;
                        }
                    }
                    oooO00o.OooO0Oo();
                }
                this.f29342Ooooo0o.o000oOoO();
            }
            Unit unit2 = Unit.INSTANCE;
        }
        this.f29328Oooo0o.OooOOOO(this);
    }
}
