package p100o000oOoO;

import java.util.HashSet;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p037OoooOOo.o00000O0;
import p038OoooOo0.o000O0O0;
import p047Oooooo0.o0O0o;
import p047Oooooo0.o0oOOo;
import p047Oooooo0.oo00o;
import p047Oooooo0.oo00oO;
import p047Oooooo0.oo0o0O0;

/* JADX INFO: loaded from: classes.dex */
public final class o00OOO00<T> implements o0oOOo, o00OOO0<T> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final Function0<T> f29499Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public OooO00o<T> f29500Oooo0oO;

    public static final class OooO00o<T> extends o0O0o {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @NotNull
        public static final Object f29501OooO0o = new Object();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public HashSet<o0oOOo> f29502OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public Object f29503OooO0Oo = f29501OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f29504OooO0o0;

        @Override // p047Oooooo0.o0O0o
        public final void OooO00o(@NotNull o0O0o value) {
            Intrinsics.checkNotNullParameter(value, "value");
            OooO00o oooO00o = (OooO00o) value;
            this.f29502OooO0OO = oooO00o.f29502OooO0OO;
            this.f29503OooO0Oo = oooO00o.f29503OooO0Oo;
            this.f29504OooO0o0 = oooO00o.f29504OooO0o0;
        }

        @Override // p047Oooooo0.o0O0o
        @NotNull
        public final o0O0o OooO0O0() {
            return new OooO00o();
        }

        public final boolean OooO0OO(@NotNull o00OOO0<?> derivedState, @NotNull oo00o snapshot) {
            Intrinsics.checkNotNullParameter(derivedState, "derivedState");
            Intrinsics.checkNotNullParameter(snapshot, "snapshot");
            return this.f29503OooO0Oo != f29501OooO0o && this.f29504OooO0o0 == OooO0Oo(derivedState, snapshot);
        }

        public final int OooO0Oo(@NotNull o00OOO0<?> derivedState, @NotNull oo00o snapshot) {
            HashSet<o0oOOo> hashSet;
            Intrinsics.checkNotNullParameter(derivedState, "derivedState");
            Intrinsics.checkNotNullParameter(snapshot, "snapshot");
            synchronized (oo0o0O0.f4158OooO0OO) {
                hashSet = this.f29502OooO0OO;
            }
            int iIdentityHashCode = 7;
            if (hashSet != null) {
                o00000O0<Pair<Function1<o00OOO0<?>, Unit>, Function1<o00OOO0<?>, Unit>>> o00000o0OooO00o = o0OOO0.f29636OooO00o.OooO00o();
                if (o00000o0OooO00o == null) {
                    o000O0O0.OooO00o oooO00o = o000O0O0.f3709Oooo0oO;
                    o00000o0OooO00o = o000O0O0.f3710Oooo0oo;
                }
                int size = o00000o0OooO00o.size();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    o00000o0OooO00o.get(i2).component1().invoke(derivedState);
                }
                try {
                    for (o0oOOo stateObject : hashSet) {
                        o0O0o o0o0oOooO00o = stateObject.OooO00o();
                        Intrinsics.checkNotNullExpressionValue(stateObject, "stateObject");
                        o0O0o o0o0oOooOOo = oo0o0O0.OooOOo(o0o0oOooO00o, stateObject, snapshot);
                        iIdentityHashCode = (((iIdentityHashCode * 31) + System.identityHashCode(o0o0oOooOOo)) * 31) + o0o0oOooOOo.f4144OooO00o;
                    }
                    Unit unit = Unit.INSTANCE;
                } finally {
                    int size2 = o00000o0OooO00o.size();
                    while (i < size2) {
                        o00000o0OooO00o.get(i).component2().invoke(derivedState);
                        i++;
                    }
                }
            }
            return iIdentityHashCode;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<Object, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o00OOO00<T> f29505Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ HashSet<o0oOOo> f29506Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o00OOO00<T> o00ooo01, HashSet<o0oOOo> hashSet) {
            super(1);
            this.f29505Oooo0o = o00ooo01;
            this.f29506Oooo0oO = hashSet;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (it == this.f29505Oooo0o) {
                throw new IllegalStateException("A derived state calculation cannot read itself".toString());
            }
            if (it instanceof o0oOOo) {
                this.f29506Oooo0oO.add(it);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o00OOO00(@NotNull Function0<? extends T> calculation) {
        Intrinsics.checkNotNullParameter(calculation, "calculation");
        this.f29499Oooo0o = calculation;
        this.f29500Oooo0oO = new OooO00o<>();
    }

    @Override // p047Oooooo0.o0oOOo
    @NotNull
    public final o0O0o OooO00o() {
        return this.f29500Oooo0oO;
    }

    @Override // p100o000oOoO.o00OOO0
    public final T OooO0Oo() {
        return (T) OooOOO((OooO00o) oo0o0O0.OooO0oo(this.f29500Oooo0oO, oo0o0O0.OooO()), oo0o0O0.OooO(), this.f29499Oooo0o).f29503OooO0Oo;
    }

    @Override // p047Oooooo0.o0oOOo
    public final void OooO0oo(@NotNull o0O0o value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f29500Oooo0oO = (OooO00o) value;
    }

    @Override // p100o000oOoO.o00OOO0
    @NotNull
    public final Set<o0oOOo> OooOO0o() {
        HashSet<o0oOOo> hashSet = OooOOO((OooO00o) oo0o0O0.OooO0oo(this.f29500Oooo0oO, oo0o0O0.OooO()), oo0o0O0.OooO(), this.f29499Oooo0o).f29502OooO0OO;
        return hashSet != null ? hashSet : SetsKt.emptySet();
    }

    public final OooO00o<T> OooOOO(OooO00o<T> oooO00o, oo00o oo00oVar, Function0<? extends T> function0) {
        OooO00o<T> oooO00o2;
        if (oooO00o.OooO0OO(this, oo00oVar)) {
            return oooO00o;
        }
        Boolean boolOooO00o = o0OOO0.f29637OooO0O0.OooO00o();
        int i = 0;
        boolean zBooleanValue = boolOooO00o != null ? boolOooO00o.booleanValue() : false;
        HashSet<o0oOOo> hashSet = new HashSet<>();
        o00000O0<Pair<Function1<o00OOO0<?>, Unit>, Function1<o00OOO0<?>, Unit>>> o00000o0OooO00o = o0OOO0.f29636OooO00o.OooO00o();
        if (o00000o0OooO00o == null) {
            o000O0O0.OooO00o oooO00o3 = o000O0O0.f3709Oooo0oO;
            o00000o0OooO00o = o000O0O0.f3710Oooo0oo;
        }
        int size = o00000o0OooO00o.size();
        for (int i2 = 0; i2 < size; i2++) {
            o00000o0OooO00o.get(i2).component1().invoke(this);
        }
        if (!zBooleanValue) {
            try {
                o0OOO0.f29637OooO0O0.OooO0O0(Boolean.TRUE);
            } catch (Throwable th) {
                int size2 = o00000o0OooO00o.size();
                while (i < size2) {
                    o00000o0OooO00o.get(i).component2().invoke(this);
                    i++;
                }
                throw th;
            }
        }
        Object objOooO00o = oo00o.f4149OooO0o0.OooO00o(new OooO0O0(this, hashSet), function0);
        if (!zBooleanValue) {
            o0OOO0.f29637OooO0O0.OooO0O0(Boolean.FALSE);
        }
        int size3 = o00000o0OooO00o.size();
        while (i < size3) {
            o00000o0OooO00o.get(i).component2().invoke(this);
            i++;
        }
        synchronized (oo0o0O0.f4158OooO0OO) {
            oo00o oo00oVarOooO = oo0o0O0.OooO();
            oooO00o2 = (OooO00o) oo0o0O0.OooOO0o(this.f29500Oooo0oO, this, oo00oVarOooO);
            oooO00o2.f29502OooO0OO = hashSet;
            oooO00o2.f29504OooO0o0 = oooO00o2.OooO0Oo(this, oo00oVarOooO);
            oooO00o2.f29503OooO0Oo = objOooO00o;
        }
        if (!zBooleanValue) {
            oo0o0O0.OooO().OooOO0o();
        }
        return oooO00o2;
    }

    @Override // p047Oooooo0.o0oOOo
    public final /* synthetic */ o0O0o OooOOOO(o0O0o o0o0o, o0O0o o0o0o2, o0O0o o0o0o3) {
        oo00oO.OooO00o(o0o0o, o0o0o2, o0o0o3);
        return null;
    }

    @Override // p100o000oOoO.oO0Oo
    public final T getValue() {
        Function1<Object, Unit> function1OooO0o = oo0o0O0.OooO().OooO0o();
        if (function1OooO0o != null) {
            function1OooO0o.invoke(this);
        }
        return OooO0Oo();
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("DerivedState(value=");
        OooO00o oooO00o = (OooO00o) oo0o0O0.OooO0oo(this.f29500Oooo0oO, oo0o0O0.OooO());
        sbOooO0o0.append(oooO00o.OooO0OO(this, oo0o0O0.OooO()) ? String.valueOf(oooO00o.f29503OooO0Oo) : "<Not calculated>");
        sbOooO0o0.append(")@");
        sbOooO0o0.append(hashCode());
        return sbOooO0o0.toString();
    }
}
