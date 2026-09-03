package p047Oooooo0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p100o000oOoO.o0OOo000;

/* JADX INFO: loaded from: classes.dex */
public final class oo0o0O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public static final AtomicReference<o00O000> f4155OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final Function1<o00O0O0, Unit> f4156OooO00o = OooO00o.f4165Oooo0o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final o0OOo000<oo00o> f4157OooO0O0 = new o0OOo000<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final Object f4158OooO0OO = new Object();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static o00O0O0 f4159OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public static final o00O0O00 f4160OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static int f4161OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public static final List<Function2<Set<? extends Object>, oo00o, Unit>> f4162OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public static final List<Function1<Object, Unit>> f4163OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public static final oo00o f4164OooOO0;

    public static final class OooO00o extends Lambda implements Function1<o00O0O0, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f4165Oooo0o = new OooO00o();

        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o00O0O0 o00o0o0) {
            o00O0O0 it = o00o0o0;
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<Object, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function1<Object, Unit> f4166Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Function1<Object, Unit> f4167Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Function1<Object, Unit> function1, Function1<Object, Unit> function2) {
            super(1);
            this.f4166Oooo0o = function1;
            this.f4167Oooo0oO = function2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Object state) {
            Intrinsics.checkNotNullParameter(state, "state");
            this.f4166Oooo0o.invoke(state);
            this.f4167Oooo0oO.invoke(state);
            return Unit.INSTANCE;
        }
    }

    static {
        o00O0O0 o00o0o0 = o00O0O0.f4079OoooO00;
        f4159OooO0Oo = o00o0o0;
        f4161OooO0o0 = 1;
        f4160OooO0o = new o00O0O00();
        f4162OooO0oO = new ArrayList();
        f4163OooO0oo = new ArrayList();
        int i = f4161OooO0o0;
        f4161OooO0o0 = i + 1;
        o00O000 o00o001 = new o00O000(i, o00o0o0);
        f4159OooO0Oo = f4159OooO0Oo.OooO0oO(o00o001.f4151OooO0O0);
        AtomicReference<o00O000> atomicReference = new AtomicReference<>(o00o001);
        f4155OooO = atomicReference;
        o00O000 o00o002 = atomicReference.get();
        Intrinsics.checkNotNullExpressionValue(o00o002, "currentGlobalSnapshot.get()");
        f4164OooOO0 = o00o002;
    }

    @NotNull
    public static final oo00o OooO() {
        oo00o oo00oVarOooO00o = f4157OooO0O0.OooO00o();
        if (oo00oVarOooO00o != null) {
            return oo00oVarOooO00o;
        }
        o00O000 o00o001 = f4155OooO.get();
        Intrinsics.checkNotNullExpressionValue(o00o001, "currentGlobalSnapshot.get()");
        return o00o001;
    }

    public static final void OooO00o() {
        OooO0o(o00O0OO0.f4097Oooo0o);
    }

    public static final Function1 OooO0O0(Function1 function1, Function1 function2) {
        if (function1 == null || function2 == null || Intrinsics.areEqual(function1, function2)) {
            return function1 == null ? function2 : function1;
        }
        return new o00O0OO(function1, function2);
    }

    public static final Map OooO0OO(o00O000o o00o000o2, o00O000o o00o000o3, o00O0O0 o00o0o0) {
        o0O0o o0o0oOooOOOo;
        Set<o0oOOo> setOooOo0O = o00o000o3.OooOo0O();
        int iOooO0Oo = o00o000o2.OooO0Oo();
        if (setOooOo0O == null) {
            return null;
        }
        o00O0O0 o00o0o0OooO0o0 = o00o000o3.OooO0o0().OooO0oO(o00o000o3.OooO0Oo()).OooO0o0(o00o000o3.f4065OooO);
        HashMap map = null;
        for (o0oOOo o0oooo2 : setOooOo0O) {
            o0O0o o0o0oOooO00o = o0oooo2.OooO00o();
            o0O0o o0o0oOooOOOo2 = OooOOOo(o0o0oOooO00o, iOooO0Oo, o00o0o0);
            if (o0o0oOooOOOo2 != null && (o0o0oOooOOOo = OooOOOo(o0o0oOooO00o, iOooO0Oo, o00o0o0OooO0o0)) != null && !Intrinsics.areEqual(o0o0oOooOOOo2, o0o0oOooOOOo)) {
                o0O0o o0o0oOooOOOo3 = OooOOOo(o0o0oOooO00o, o00o000o3.OooO0Oo(), o00o000o3.OooO0o0());
                if (o0o0oOooOOOo3 == null) {
                    OooOOOO();
                    throw null;
                }
                o0O0o o0o0oOooOOOO = o0oooo2.OooOOOO(o0o0oOooOOOo, o0o0oOooOOOo2, o0o0oOooOOOo3);
                if (o0o0oOooOOOO == null) {
                    return null;
                }
                if (map == null) {
                    map = new HashMap();
                }
                map.put(o0o0oOooOOOo2, o0o0oOooOOOO);
            }
        }
        return map;
    }

    public static final void OooO0Oo(oo00o oo00oVar) {
        if (!f4159OooO0Oo.OooO0OO(oo00oVar.OooO0Oo())) {
            throw new IllegalStateException("Snapshot is not open".toString());
        }
    }

    public static final <T> T OooO0o(Function1<? super o00O0O0, ? extends T> function1) {
        T t;
        List mutableList;
        o00O000 previousGlobalSnapshot = f4155OooO.get();
        Object obj = f4158OooO0OO;
        synchronized (obj) {
            Intrinsics.checkNotNullExpressionValue(previousGlobalSnapshot, "previousGlobalSnapshot");
            t = (T) OooOo00(previousGlobalSnapshot, function1);
        }
        Set<o0oOOo> set = previousGlobalSnapshot.f4068OooO0oo;
        if (set != null) {
            synchronized (obj) {
                mutableList = CollectionsKt.toMutableList((Collection) f4162OooO0oO);
            }
            int size = mutableList.size();
            for (int i = 0; i < size; i++) {
                ((Function2) mutableList.get(i)).invoke(set, previousGlobalSnapshot);
            }
        }
        return t;
    }

    @NotNull
    public static final o00O0O0 OooO0o0(@NotNull o00O0O0 o00o0o0, int i, int i2) {
        Intrinsics.checkNotNullParameter(o00o0o0, "<this>");
        while (i < i2) {
            o00o0o0 = o00o0o0.OooO0oO(i);
            i++;
        }
        return o00o0o0;
    }

    public static final oo00o OooO0oO(oo00o oo00oVar, Function1<Object, Unit> function1, boolean z) {
        boolean z2 = oo00oVar instanceof o00O000o;
        if (z2 || oo00oVar == null) {
            return new o0O00000(z2 ? (o00O000o) oo00oVar : null, function1, null, false, z);
        }
        return new o0O0000O(oo00oVar, function1, z);
    }

    @PublishedApi
    @NotNull
    public static final <T extends o0O0o> T OooO0oo(@NotNull T r, @NotNull oo00o snapshot) {
        Intrinsics.checkNotNullParameter(r, "r");
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        T t = (T) OooOOOo(r, snapshot.OooO0Oo(), snapshot.OooO0o0());
        if (t != null) {
            return t;
        }
        OooOOOO();
        throw null;
    }

    public static final Function1<Object, Unit> OooOO0(Function1<Object, Unit> function1, Function1<Object, Unit> function2, boolean z) {
        if (!z) {
            function2 = null;
        }
        if (function1 == null || function2 == null || Intrinsics.areEqual(function1, function2)) {
            return function1 == null ? function2 : function1;
        }
        return new OooO0O0(function1, function2);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    /* JADX WARN: Code duplicated, block: B:27:0x0054  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
    
        r7 = true;
     */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T extends o0O0o> T OooOO0O(@NotNull T t, @NotNull o0oOOo state) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        o00O0O00 o00o0o01 = f4160OooO0o;
        int i = f4161OooO0o0;
        if (o00o0o01.f4090OooO00o > 0) {
            i = o00o0o01.f4091OooO0O0[0];
        }
        int i2 = i - 1;
        T t2 = null;
        o0O0o o0o0o = null;
        for (o0O0o o0o0oOooO00o = state.OooO00o(); o0o0oOooO00o != null; o0o0oOooO00o = o0o0oOooO00o.f4145OooO0O0) {
            int i3 = o0o0oOooO00o.f4144OooO00o;
            if (i3 != 0) {
                if (i3 == 0 || i3 > i2) {
                    z = false;
                } else if ((r7 = i3 + 0) >= 0) {
                    z2 = false;
                    if (z2) {
                        z = false;
                    } else {
                        z = true;
                    }
                } else {
                    z2 = false;
                    if (z2) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    if (o0o0o != null) {
                        if (i3 >= o0o0o.f4144OooO00o) {
                            t2 = (T) o0o0o;
                            break;
                        }
                        break;
                    }
                    o0o0o = o0o0oOooO00o;
                }
            }
            t2 = (T) o0o0oOooO00o;
            break;
        }
        if (t2 != null) {
            t2.f4144OooO00o = Integer.MAX_VALUE;
            return t2;
        }
        T t3 = (T) t.OooO0O0();
        t3.f4144OooO00o = Integer.MAX_VALUE;
        t3.f4145OooO0O0 = state.OooO00o();
        state.OooO0oo(t3);
        return t3;
    }

    @NotNull
    public static final <T extends o0O0o> T OooOO0o(@NotNull T t, @NotNull o0oOOo state, @NotNull oo00o snapshot) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        T t2 = (T) OooOO0O(t, state);
        t2.OooO00o(t);
        t2.f4144OooO00o = snapshot.OooO0Oo();
        return t2;
    }

    @NotNull
    public static final <T extends o0O0o> T OooOOO(@NotNull T t, @NotNull o0oOOo state, @NotNull oo00o snapshot, @NotNull T candidate) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        Intrinsics.checkNotNullParameter(candidate, "candidate");
        if (snapshot.OooO0oO()) {
            snapshot.OooOOO0(state);
        }
        int iOooO0Oo = snapshot.OooO0Oo();
        if (candidate.f4144OooO00o == iOooO0Oo) {
            return candidate;
        }
        T t2 = (T) OooOO0O(t, state);
        t2.f4144OooO00o = iOooO0Oo;
        snapshot.OooOOO0(state);
        return t2;
    }

    @PublishedApi
    public static final void OooOOO0(@NotNull oo00o snapshot, @NotNull o0oOOo state) {
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        Intrinsics.checkNotNullParameter(state, "state");
        Function1<Object, Unit> function1OooO0oo = snapshot.OooO0oo();
        if (function1OooO0oo != null) {
            function1OooO0oo.invoke(state);
        }
    }

    public static final Void OooOOOO() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied".toString());
    }

    public static final <T extends o0O0o> T OooOOOo(T t, int i, o00O0O0 o00o0o0) {
        T t2 = null;
        while (t != null) {
            int i2 = t.f4144OooO00o;
            if (((i2 == 0 || i2 > i || o00o0o0.OooO0OO(i2)) ? false : true) && (t2 == null || t2.f4144OooO00o < t.f4144OooO00o)) {
                t2 = t;
            }
            t = (T) t.f4145OooO0O0;
        }
        if (t2 != null) {
            return t2;
        }
        return null;
    }

    @NotNull
    public static final <T extends o0O0o> T OooOOo(@NotNull T t, @NotNull o0oOOo state, @NotNull oo00o snapshot) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        Function1<Object, Unit> function1OooO0o = snapshot.OooO0o();
        if (function1OooO0o != null) {
            function1OooO0o.invoke(state);
        }
        T t2 = (T) OooOOOo(t, snapshot.OooO0Oo(), snapshot.OooO0o0());
        if (t2 != null) {
            return t2;
        }
        OooOOOO();
        throw null;
    }

    @NotNull
    public static final <T extends o0O0o> T OooOOo0(@NotNull T t, @NotNull o0oOOo state) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        return (T) OooOOo(t, state, OooO());
    }

    public static final void OooOOoo(int i) {
        o00O0O00 o00o0o01 = f4160OooO0o;
        int i2 = o00o0o01.f4093OooO0Oo[i];
        o00o0o01.OooO0OO(i2, o00o0o01.f4090OooO00o - 1);
        o00o0o01.f4090OooO00o--;
        o00o0o01.OooO0O0(i2);
        int[] iArr = o00o0o01.f4091OooO0O0;
        int i3 = o00o0o01.f4090OooO00o >> 1;
        while (i2 < i3) {
            int i4 = (i2 + 1) << 1;
            int i5 = i4 - 1;
            if (i4 < o00o0o01.f4090OooO00o && iArr[i4] < iArr[i5]) {
                if (iArr[i4] >= iArr[i2]) {
                    break;
                }
                o00o0o01.OooO0OO(i4, i2);
                i2 = i4;
            } else {
                if (iArr[i5] >= iArr[i2]) {
                    break;
                }
                o00o0o01.OooO0OO(i5, i2);
                i2 = i5;
            }
        }
        o00o0o01.f4093OooO0Oo[i] = o00o0o01.f4094OooO0o0;
        o00o0o01.f4094OooO0o0 = i;
    }

    @PublishedApi
    @NotNull
    public static final <T extends o0O0o> T OooOo0(@NotNull T t, @NotNull o0oOOo state, @NotNull oo00o snapshot) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        if (snapshot.OooO0oO()) {
            snapshot.OooOOO0(state);
        }
        T t2 = (T) OooOOOo(t, snapshot.OooO0Oo(), snapshot.OooO0o0());
        if (t2 == null) {
            OooOOOO();
            throw null;
        }
        if (t2.f4144OooO00o == snapshot.OooO0Oo()) {
            return t2;
        }
        T t3 = (T) OooOO0o(t2, state, snapshot);
        snapshot.OooOOO0(state);
        return t3;
    }

    public static final <T> T OooOo00(oo00o oo00oVar, Function1<? super o00O0O0, ? extends T> function1) {
        T tInvoke = function1.invoke(f4159OooO0Oo.OooO0O0(oo00oVar.f4151OooO0O0));
        synchronized (f4158OooO0OO) {
            int i = f4161OooO0o0;
            f4161OooO0o0 = i + 1;
            o00O0O0 o00o0o0OooO0O0 = f4159OooO0Oo.OooO0O0(oo00oVar.f4151OooO0O0);
            f4159OooO0Oo = o00o0o0OooO0O0;
            f4155OooO.set(new o00O000(i, o00o0o0OooO0O0));
            oo00oVar.OooO0OO();
            f4159OooO0Oo = f4159OooO0Oo.OooO0oO(i);
            Unit unit = Unit.INSTANCE;
        }
        return tInvoke;
    }
}
