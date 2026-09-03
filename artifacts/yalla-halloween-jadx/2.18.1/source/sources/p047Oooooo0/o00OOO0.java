package p047Oooooo0;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p036OoooOOO.o000OOo;
import p036OoooOOO.o0O0O00;
import p036OoooOOO.oo0o0Oo;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class o00OOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Function1<Function0<Unit>, Unit> f4112OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Function2<Set<? extends Object>, oo00o, Unit> f4113OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Function1<Object, Unit> f4114OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final o000OOo<OooO00o<?>> f4115OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f4116OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public o00O00o0 f4117OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public OooO00o<?> f4118OooO0oO;

    public static final class OooO00o<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final Function1<T, Unit> f4119OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final o0O0O00<T> f4120OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public final HashSet<Object> f4121OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public T f4122OooO0Oo;

        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(@NotNull Function1<? super T, Unit> onChanged) {
            Intrinsics.checkNotNullParameter(onChanged, "onChanged");
            this.f4119OooO00o = onChanged;
            this.f4120OooO0O0 = new o0O0O00<>();
            this.f4121OooO0OO = new HashSet<>();
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Set<? extends Object>, oo00o, Unit> {
        public OooO0O0() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Set<? extends Object> set, oo00o oo00oVar) {
            int i;
            Unit unit;
            Set<? extends Object> applied = set;
            Intrinsics.checkNotNullParameter(applied, "applied");
            Intrinsics.checkNotNullParameter(oo00oVar, "<anonymous parameter 1>");
            o00OOO0 o00ooo1 = o00OOO0.this;
            synchronized (o00ooo1.f4115OooO0Oo) {
                o000OOo<OooO00o<?>> o000ooo2 = o00ooo1.f4115OooO0Oo;
                int i2 = o000ooo2.f3664Oooo0oo;
                i = 0;
                if (i2 > 0) {
                    OooO00o<?>[] oooO00oArr = o000ooo2.f3662Oooo0o;
                    int i3 = 0;
                    do {
                        OooO00o<?> oooO00o = oooO00oArr[i];
                        HashSet<Object> hashSet = oooO00o.f4121OooO0OO;
                        o0O0O00<?> o0o0o00 = oooO00o.f4120OooO0O0;
                        Iterator<? extends Object> it = applied.iterator();
                        while (it.hasNext()) {
                            int iOooO0Oo = o0o0o00.OooO0Oo(it.next());
                            if (iOooO0Oo >= 0) {
                                Iterator it2 = o0O0O00.OooO00o(o0o0o00, iOooO0Oo).iterator();
                                while (true) {
                                    oo0o0Oo.OooO00o oooO00o2 = (oo0o0Oo.OooO00o) it2;
                                    if (oooO00o2.hasNext()) {
                                        hashSet.add(oooO00o2.next());
                                        i3 = 1;
                                    }
                                }
                            }
                        }
                        i++;
                    } while (i < i2);
                    i = i3;
                }
                unit = Unit.INSTANCE;
            }
            if (i != 0) {
                o00OOO0 o00ooo2 = o00OOO0.this;
                o00ooo2.f4112OooO00o.invoke(new o00OOO0O(o00ooo2));
            }
            return unit;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<Object, Unit> {
        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Object value) {
            Intrinsics.checkNotNullParameter(value, "state");
            o00OOO0 o00ooo1 = o00OOO0.this;
            if (!o00ooo1.f4116OooO0o) {
                synchronized (o00ooo1.f4115OooO0Oo) {
                    OooO00o<?> oooO00o = o00ooo1.f4118OooO0oO;
                    Intrinsics.checkNotNull(oooO00o);
                    Objects.requireNonNull(oooO00o);
                    Intrinsics.checkNotNullParameter(value, "value");
                    o0O0O00<?> o0o0o00 = oooO00o.f4120OooO0O0;
                    Object obj = oooO00o.f4122OooO0Oo;
                    Intrinsics.checkNotNull(obj);
                    o0o0o00.OooO0O0(value, obj);
                    Unit unit = Unit.INSTANCE;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o00OOO0(@NotNull Function1<? super Function0<Unit>, Unit> onChangedExecutor) {
        Intrinsics.checkNotNullParameter(onChangedExecutor, "onChangedExecutor");
        this.f4112OooO00o = onChangedExecutor;
        this.f4113OooO0O0 = new OooO0O0();
        this.f4114OooO0OO = new OooO0OO();
        this.f4115OooO0Oo = new o000OOo<>(new OooO00o[16]);
    }

    public final void OooO00o() {
        synchronized (this.f4115OooO0Oo) {
            o000OOo<OooO00o<?>> o000ooo2 = this.f4115OooO0Oo;
            int i = o000ooo2.f3664Oooo0oo;
            if (i > 0) {
                OooO00o<?>[] oooO00oArr = o000ooo2.f3662Oooo0o;
                int i2 = 0;
                do {
                    o0O0O00<?> o0o0o00 = oooO00oArr[i2].f4120OooO0O0;
                    int length = o0o0o00.f3673OooO0OO.length;
                    for (int i3 = 0; i3 < length; i3++) {
                        oo0o0Oo<?> oo0o0oo = o0o0o00.f3673OooO0OO[i3];
                        if (oo0o0oo != null) {
                            oo0o0oo.clear();
                        }
                        o0o0o00.f3671OooO00o[i3] = i3;
                        o0o0o00.f3672OooO0O0[i3] = null;
                    }
                    o0o0o00.f3674OooO0Oo = 0;
                    i2++;
                } while (i2 < i);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final <T> void OooO0O0(@NotNull T scope, @NotNull Function1<? super T, Unit> onValueChangedForScope, @NotNull Function0<Unit> block) {
        int i;
        OooO00o<?> oooO00o;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(onValueChangedForScope, "onValueChangedForScope");
        Intrinsics.checkNotNullParameter(block, "block");
        OooO00o<?> oooO00o2 = this.f4118OooO0oO;
        boolean z = this.f4116OooO0o;
        synchronized (this.f4115OooO0Oo) {
            o000OOo<OooO00o<?>> o000ooo2 = this.f4115OooO0Oo;
            int i2 = o000ooo2.f3664Oooo0oo;
            if (i2 <= 0) {
                i = -1;
                break;
            }
            OooO00o<?>[] oooO00oArr = o000ooo2.f3662Oooo0o;
            i = 0;
            while (true) {
                if (oooO00oArr[i].f4119OooO00o == onValueChangedForScope) {
                    break;
                }
                i++;
                if (i >= i2) {
                    i = -1;
                    break;
                }
            }
            if (i == -1) {
                oooO00o = new OooO00o<>(onValueChangedForScope);
                this.f4115OooO0Oo.OooO0O0(oooO00o);
            } else {
                oooO00o = this.f4115OooO0Oo.f3662Oooo0o[i];
            }
            oooO00o.f4120OooO0O0.OooO0o(scope);
        }
        T t = oooO00o.f4122OooO0Oo;
        oooO00o.f4122OooO0Oo = scope;
        this.f4118OooO0oO = oooO00o;
        this.f4116OooO0o = false;
        oo00o.f4149OooO0o0.OooO00o(this.f4114OooO0OO, block);
        this.f4118OooO0oO = oooO00o2;
        oooO00o.f4122OooO0Oo = t;
        this.f4116OooO0o = z;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList, java.util.List<kotlin.jvm.functions.Function2<java.util.Set<? extends java.lang.Object>, Oooooo0.oo00o, kotlin.Unit>>] */
    public final void OooO0OO() {
        Function2<Set<? extends Object>, oo00o, Unit> observer = this.f4113OooO0O0;
        Intrinsics.checkNotNullParameter(observer, "observer");
        Function1<o00O0O0, Unit> function1 = oo0o0O0.f4156OooO00o;
        oo0o0O0.OooO0o(oo0o0O0.f4156OooO00o);
        synchronized (oo0o0O0.f4158OooO0OO) {
            oo0o0O0.f4162OooO0oO.add(observer);
        }
        this.f4117OooO0o0 = new o00O00o0(observer);
    }

    public final void OooO0Oo() {
        o00O00o0 o00o00o1 = this.f4117OooO0o0;
        if (o00o00o1 != null) {
            o00o00o1.dispose();
        }
    }
}
