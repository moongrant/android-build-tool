package p047Oooooo0;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public class o00O000o extends oo00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public o00O0O0 f4065OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final Function1<Object, Unit> f4066OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public final Function1<Object, Unit> f4067OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public Set<o0oOOo> f4068OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public int[] f4069OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f4070OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f4071OooOO0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O000o(int i, @NotNull o00O0O0 invalid, @Nullable Function1<Object, Unit> function1, @Nullable Function1<Object, Unit> function2) {
        super(i, invalid);
        Intrinsics.checkNotNullParameter(invalid, "invalid");
        this.f4066OooO0o = function1;
        this.f4067OooO0oO = function2;
        this.f4065OooO = o00O0O0.f4079OoooO00;
        this.f4069OooOO0 = new int[0];
        this.f4070OooOO0O = 1;
    }

    @Override // p047Oooooo0.oo00o
    public final void OooO0O0() {
        oo0o0O0.f4159OooO0Oo = oo0o0O0.f4159OooO0Oo.OooO0O0(OooO0Oo()).OooO00o(this.f4065OooO);
    }

    @Override // p047Oooooo0.oo00o
    public void OooO0OO() {
        if (this.f4152OooO0OO) {
            return;
        }
        super.OooO0OO();
        OooOO0O(this);
    }

    @Override // p047Oooooo0.oo00o
    @Nullable
    public final Function1<Object, Unit> OooO0o() {
        return this.f4066OooO0o;
    }

    @Override // p047Oooooo0.oo00o
    public boolean OooO0oO() {
        return false;
    }

    @Override // p047Oooooo0.oo00o
    @Nullable
    public final Function1<Object, Unit> OooO0oo() {
        return this.f4067OooO0oO;
    }

    @Override // p047Oooooo0.oo00o
    public void OooOO0(@NotNull oo00o snapshot) {
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        this.f4070OooOO0O++;
    }

    @Override // p047Oooooo0.oo00o
    public void OooOO0O(@NotNull oo00o snapshot) {
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        int i = this.f4070OooOO0O;
        if (!(i > 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int i2 = i - 1;
        this.f4070OooOO0O = i2;
        if (i2 != 0 || this.f4071OooOO0o) {
            return;
        }
        Set<o0oOOo> setOooOo0O = OooOo0O();
        if (setOooOo0O != null) {
            if (!(true ^ this.f4071OooOO0o)) {
                throw new IllegalStateException("Unsupported operation on a snapshot that has been applied".toString());
            }
            OooOoO0(null);
            int iOooO0Oo = OooO0Oo();
            Iterator<o0oOOo> it = setOooOo0O.iterator();
            while (it.hasNext()) {
                for (o0O0o o0o0oOooO00o = it.next().OooO00o(); o0o0oOooO00o != null; o0o0oOooO00o = o0o0oOooO00o.f4145OooO0O0) {
                    int i3 = o0o0oOooO00o.f4144OooO00o;
                    if (i3 == iOooO0Oo || CollectionsKt.contains(this.f4065OooO, Integer.valueOf(i3))) {
                        o0o0oOooO00o.f4144OooO00o = 0;
                    }
                }
            }
        }
        OooO00o();
    }

    @Override // p047Oooooo0.oo00o
    public void OooOO0o() {
        if (this.f4071OooOO0o || this.f4152OooO0OO) {
            return;
        }
        OooOo00();
    }

    @Override // p047Oooooo0.oo00o
    public void OooOOO0(@NotNull o0oOOo state) {
        Intrinsics.checkNotNullParameter(state, "state");
        Set<o0oOOo> setOooOo0O = OooOo0O();
        if (setOooOo0O == null) {
            setOooOo0O = new HashSet<>();
            OooOoO0(setOooOo0O);
        }
        setOooOo0O.add(state);
    }

    @Override // p047Oooooo0.oo00o
    public final void OooOOOO() {
        int length = this.f4069OooOO0.length;
        for (int i = 0; i < length; i++) {
            oo0o0O0.OooOOoo(this.f4069OooOO0[i]);
        }
        OooOOO();
    }

    @Override // p047Oooooo0.oo00o
    @NotNull
    public oo00o OooOOoo(@Nullable Function1<Object, Unit> function1) {
        o00O00O o00o00o2;
        if (!(!this.f4152OooO0OO)) {
            throw new IllegalArgumentException("Cannot use a disposed snapshot".toString());
        }
        OooOoOO();
        int iOooO0Oo = OooO0Oo();
        OooOo(OooO0Oo());
        Object obj = oo0o0O0.f4158OooO0OO;
        synchronized (obj) {
            int i = oo0o0O0.f4161OooO0o0;
            oo0o0O0.f4161OooO0o0 = i + 1;
            oo0o0O0.f4159OooO0Oo = oo0o0O0.f4159OooO0Oo.OooO0oO(i);
            o00o00o2 = new o00O00O(i, oo0o0O0.OooO0o0(OooO0o0(), iOooO0Oo + 1, i), function1, this);
        }
        if (!this.f4071OooOO0o && !this.f4152OooO0OO) {
            int iOooO0Oo2 = OooO0Oo();
            synchronized (obj) {
                int i2 = oo0o0O0.f4161OooO0o0;
                oo0o0O0.f4161OooO0o0 = i2 + 1;
                OooOOo0(i2);
                oo0o0O0.f4159OooO0Oo = oo0o0O0.f4159OooO0Oo.OooO0oO(OooO0Oo());
                Unit unit = Unit.INSTANCE;
            }
            OooOOo(oo0o0O0.OooO0o0(OooO0o0(), iOooO0Oo2 + 1, OooO0Oo()));
        }
        return o00o00o2;
    }

    public final void OooOo(int i) {
        synchronized (oo0o0O0.f4158OooO0OO) {
            this.f4065OooO = this.f4065OooO.OooO0oO(i);
            Unit unit = Unit.INSTANCE;
        }
    }

    @NotNull
    public o00O0 OooOo0() {
        Map<o0O0o, ? extends o0O0o> mapOooO0OO;
        Pair pair;
        Set<o0oOOo> setOooOo0O = OooOo0O();
        if (setOooOo0O != null) {
            AtomicReference<o00O000> atomicReference = oo0o0O0.f4155OooO;
            o00O000 o00o001 = atomicReference.get();
            Intrinsics.checkNotNullExpressionValue(o00o001, "currentGlobalSnapshot.get()");
            mapOooO0OO = oo0o0O0.OooO0OO(o00o001, this, oo0o0O0.f4159OooO0Oo.OooO0O0(atomicReference.get().f4151OooO0O0));
        } else {
            mapOooO0OO = null;
        }
        synchronized (oo0o0O0.f4158OooO0OO) {
            oo0o0O0.OooO0Oo(this);
            if (setOooOo0O == null || setOooOo0O.size() == 0) {
                OooO0O0();
                o00O000 previousGlobalSnapshot = oo0o0O0.f4155OooO.get();
                Intrinsics.checkNotNullExpressionValue(previousGlobalSnapshot, "previousGlobalSnapshot");
                Function1<o00O0O0, Unit> function1 = oo0o0O0.f4156OooO00o;
                oo0o0O0.OooOo00(previousGlobalSnapshot, oo0o0O0.f4156OooO00o);
                Set<o0oOOo> set = previousGlobalSnapshot.f4068OooO0oo;
                pair = (set == null || !(set.isEmpty() ^ true)) ? TuplesKt.to(CollectionsKt.emptyList(), null) : TuplesKt.to(CollectionsKt.toMutableList((Collection) oo0o0O0.f4162OooO0oO), set);
            } else {
                o00O000 previousGlobalSnapshot2 = oo0o0O0.f4155OooO.get();
                o00O0 o00o0OooOo0o = OooOo0o(oo0o0O0.f4161OooO0o0, mapOooO0OO, oo0o0O0.f4159OooO0Oo.OooO0O0(previousGlobalSnapshot2.f4151OooO0O0));
                if (!Intrinsics.areEqual(o00o0OooOo0o, o00O0.OooO0O0.f4058OooO00o)) {
                    return o00o0OooOo0o;
                }
                OooO0O0();
                Intrinsics.checkNotNullExpressionValue(previousGlobalSnapshot2, "previousGlobalSnapshot");
                Function1<o00O0O0, Unit> function2 = oo0o0O0.f4156OooO00o;
                oo0o0O0.OooOo00(previousGlobalSnapshot2, oo0o0O0.f4156OooO00o);
                Set<o0oOOo> set2 = previousGlobalSnapshot2.f4068OooO0oo;
                OooOoO0(null);
                previousGlobalSnapshot2.f4068OooO0oo = null;
                pair = TuplesKt.to(CollectionsKt.toMutableList((Collection) oo0o0O0.f4162OooO0oO), set2);
            }
            List list = (List) pair.component1();
            Set set3 = (Set) pair.component2();
            this.f4071OooOO0o = true;
            if (set3 != null && (!set3.isEmpty())) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((Function2) list.get(i)).invoke(set3, this);
                }
            }
            if (setOooOo0O != null && (!setOooOo0O.isEmpty())) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((Function2) list.get(i2)).invoke(setOooOo0O, this);
                }
            }
            synchronized (oo0o0O0.f4158OooO0OO) {
                int length = this.f4069OooOO0.length;
                for (int i3 = 0; i3 < length; i3++) {
                    oo0o0O0.OooOOoo(this.f4069OooOO0[i3]);
                }
                OooOOO();
                Unit unit = Unit.INSTANCE;
            }
            return o00O0.OooO0O0.f4058OooO00o;
        }
    }

    public final void OooOo00() {
        OooOo(OooO0Oo());
        Unit unit = Unit.INSTANCE;
        if (this.f4071OooOO0o || this.f4152OooO0OO) {
            return;
        }
        int iOooO0Oo = OooO0Oo();
        synchronized (oo0o0O0.f4158OooO0OO) {
            int i = oo0o0O0.f4161OooO0o0;
            oo0o0O0.f4161OooO0o0 = i + 1;
            OooOOo0(i);
            oo0o0O0.f4159OooO0Oo = oo0o0O0.f4159OooO0Oo.OooO0oO(OooO0Oo());
        }
        OooOOo(oo0o0O0.OooO0o0(OooO0o0(), iOooO0Oo + 1, OooO0Oo()));
    }

    @Nullable
    public Set<o0oOOo> OooOo0O() {
        return this.f4068OooO0oo;
    }

    @NotNull
    public final o00O0 OooOo0o(int i, @Nullable Map<o0O0o, ? extends o0O0o> map, @NotNull o00O0O0 invalidSnapshots) {
        o0O0o o0o0oOooOOOo;
        o0O0o o0o0oOooOOOO;
        Intrinsics.checkNotNullParameter(invalidSnapshots, "invalidSnapshots");
        o00O0O0 o00o0o0OooO0o0 = OooO0o0().OooO0oO(OooO0Oo()).OooO0o0(this.f4065OooO);
        Set<o0oOOo> setOooOo0O = OooOo0O();
        Intrinsics.checkNotNull(setOooOo0O);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        for (o0oOOo o0oooo2 : setOooOo0O) {
            o0O0o o0o0oOooO00o = o0oooo2.OooO00o();
            o0O0o o0o0oOooOOOo2 = oo0o0O0.OooOOOo(o0o0oOooO00o, i, invalidSnapshots);
            if (o0o0oOooOOOo2 != null && (o0o0oOooOOOo = oo0o0O0.OooOOOo(o0o0oOooO00o, OooO0Oo(), o00o0o0OooO0o0)) != null && !Intrinsics.areEqual(o0o0oOooOOOo2, o0o0oOooOOOo)) {
                o0O0o o0o0oOooOOOo3 = oo0o0O0.OooOOOo(o0o0oOooO00o, OooO0Oo(), OooO0o0());
                if (o0o0oOooOOOo3 == null) {
                    oo0o0O0.OooOOOO();
                    throw null;
                }
                if (map == null || (o0o0oOooOOOO = map.get(o0o0oOooOOOo2)) == null) {
                    o0o0oOooOOOO = o0oooo2.OooOOOO(o0o0oOooOOOo, o0o0oOooOOOo2, o0o0oOooOOOo3);
                }
                if (o0o0oOooOOOO == null) {
                    return new o00O0.OooO00o(this);
                }
                if (!Intrinsics.areEqual(o0o0oOooOOOO, o0o0oOooOOOo3)) {
                    if (Intrinsics.areEqual(o0o0oOooOOOO, o0o0oOooOOOo2)) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(TuplesKt.to(o0oooo2, o0o0oOooOOOo2.OooO0O0()));
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(o0oooo2);
                    } else {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(!Intrinsics.areEqual(o0o0oOooOOOO, o0o0oOooOOOo) ? TuplesKt.to(o0oooo2, o0o0oOooOOOO) : TuplesKt.to(o0oooo2, o0o0oOooOOOo.OooO0O0()));
                    }
                }
            }
        }
        if (arrayList != null) {
            OooOo00();
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                Pair pair = (Pair) arrayList.get(i2);
                o0oOOo o0oooo3 = (o0oOOo) pair.component1();
                o0O0o o0o0o = (o0O0o) pair.component2();
                o0o0o.f4144OooO00o = OooO0Oo();
                synchronized (oo0o0O0.f4158OooO0OO) {
                    o0o0o.f4145OooO0O0 = o0oooo3.OooO00o();
                    o0oooo3.OooO0oo(o0o0o);
                    Unit unit = Unit.INSTANCE;
                }
            }
        }
        if (arrayList2 != null) {
            setOooOo0O.removeAll(arrayList2);
        }
        return o00O0.OooO0O0.f4058OooO00o;
    }

    @NotNull
    public o00O000o OooOoO(@Nullable Function1<Object, Unit> function1, @Nullable Function1<Object, Unit> function2) {
        o00O00 o00o01;
        if (!(!this.f4152OooO0OO)) {
            throw new IllegalArgumentException("Cannot use a disposed snapshot".toString());
        }
        OooOoOO();
        OooOo(OooO0Oo());
        Object obj = oo0o0O0.f4158OooO0OO;
        synchronized (obj) {
            int i = oo0o0O0.f4161OooO0o0;
            oo0o0O0.f4161OooO0o0 = i + 1;
            oo0o0O0.f4159OooO0Oo = oo0o0O0.f4159OooO0Oo.OooO0oO(i);
            o00O0O0 o00o0o0OooO0o0 = OooO0o0();
            OooOOo(o00o0o0OooO0o0.OooO0oO(i));
            o00o01 = new o00O00(i, oo0o0O0.OooO0o0(o00o0o0OooO0o0, OooO0Oo() + 1, i), oo0o0O0.OooOO0(function1, this.f4066OooO0o, true), oo0o0O0.OooO0O0(function2, this.f4067OooO0oO), this);
        }
        if (!this.f4071OooOO0o && !this.f4152OooO0OO) {
            int iOooO0Oo = OooO0Oo();
            synchronized (obj) {
                int i2 = oo0o0O0.f4161OooO0o0;
                oo0o0O0.f4161OooO0o0 = i2 + 1;
                OooOOo0(i2);
                oo0o0O0.f4159OooO0Oo = oo0o0O0.f4159OooO0Oo.OooO0oO(OooO0Oo());
                Unit unit = Unit.INSTANCE;
            }
            OooOOo(oo0o0O0.OooO0o0(OooO0o0(), iOooO0Oo + 1, OooO0Oo()));
        }
        return o00o01;
    }

    public void OooOoO0(@Nullable Set<o0oOOo> set) {
        this.f4068OooO0oo = set;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x000f  */
    public final void OooOoOO() {
        boolean z;
        if (this.f4071OooOO0o) {
            z = this.f4153OooO0Oo >= 0;
        }
        if (!z) {
            throw new IllegalStateException("Unsupported operation on a disposed or applied snapshot".toString());
        }
    }
}
