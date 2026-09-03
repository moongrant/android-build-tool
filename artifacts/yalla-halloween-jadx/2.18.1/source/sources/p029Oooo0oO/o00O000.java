package p029Oooo0oO;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o0000O0O.OooOo;
import o0000O0O.Oooo000;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p023Oooo00O.Oooo0;
import p023Oooo00O.o0000O0O;
import p023Oooo00O.o00O000o;
import p023Oooo00O.o0OO00O;
import p023Oooo00O.oo000o;
import p027Oooo0o.o00oO0o;

/* JADX INFO: loaded from: classes.dex */
public final class o00O000 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f2276OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f2277OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f2278OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f2279OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Map<Object, o000O> f2280OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f2281OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public Map<Object, Integer> f2282OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f2283OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f2284OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final Set<Object> f2285OooOO0;

    @DebugMetadata(c = "androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator$startAnimationsIfNeeded$1$1", f = "LazyGridItemPlacementAnimator.kt", i = {}, l = {420}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f2286Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o0O00OO f2287Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ o0000O0O<OooOo> f2288Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o0O00OO o0o00oo2, o0000O0O<OooOo> o0000o0o2, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f2287Oooo0oO = o0o00oo2;
            this.f2288Oooo0oo = o0000o0o2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f2287Oooo0oO, this.f2288Oooo0oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            oo000o oo000oVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f2286Oooo0o;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (((Boolean) this.f2287Oooo0oO.f2428OooO0O0.f1005OooO0Oo.getValue()).booleanValue()) {
                        o0000O0O<OooOo> o0000o0o2 = this.f2288Oooo0oo;
                        oo000oVar = o0000o0o2 instanceof o00O000o ? (o00O000o) o0000o0o2 : o00O000o.f2289OooO00o;
                    } else {
                        oo000oVar = this.f2288Oooo0oo;
                    }
                    oo000o oo000oVar2 = oo000oVar;
                    o0O00OO o0o00oo2 = this.f2287Oooo0oO;
                    Oooo0<OooOo, o0OO00O> oooo0 = o0o00oo2.f2428OooO0O0;
                    OooOo oooOo = new OooOo(o0o00oo2.f2429OooO0OO);
                    this.f2286Oooo0o = 1;
                    if (Oooo0.OooO0OO(oooo0, oooOo, oo000oVar2, null, this, 12) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                this.f2287Oooo0oO.OooO00o(false);
            } catch (CancellationException unused) {
            }
            return Unit.INSTANCE;
        }
    }

    public o00O000(@NotNull CoroutineScope scope, boolean z) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f2277OooO00o = scope;
        this.f2278OooO0O0 = z;
        this.f2280OooO0Oo = new LinkedHashMap();
        this.f2282OooO0o0 = MapsKt.emptyMap();
        this.f2281OooO0o = -1;
        this.f2284OooO0oo = -1;
        this.f2285OooOO0 = new LinkedHashSet();
    }

    public final int OooO00o(int i, int i2, int i3, long j, boolean z, int i4, int i5) {
        boolean z2 = false;
        if (!(this.f2279OooO0OO != 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int i6 = this.f2284OooO0oo;
        boolean z3 = z ? i6 > i : i6 < i;
        if (z ? this.f2281OooO0o < i : this.f2281OooO0o > i) {
            z2 = true;
        }
        if (z3) {
            int iAbs = Math.abs(i - this.f2284OooO0oo);
            int i7 = this.f2279OooO0OO;
            return OooO0O0(j) + (((((iAbs + i7) - 1) / i7) - 1) * i3) + i4 + this.f2276OooO;
        }
        if (!z2) {
            return i5;
        }
        int iAbs2 = Math.abs(this.f2281OooO0o - i);
        int i8 = this.f2279OooO0OO;
        return OooO0O0(j) + ((this.f2283OooO0oO - i2) - (((((iAbs2 + i8) - 1) / i8) - 1) * i3));
    }

    public final int OooO0O0(long j) {
        if (this.f2278OooO0O0) {
            return OooOo.OooO0OO(j);
        }
        OooOo.OooO00o oooO00o = OooOo.f27310OooO0O0;
        return (int) (j >> 32);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Object, Oooo0oO.o000O>] */
    public final void OooO0OO() {
        this.f2280OooO0Oo.clear();
        this.f2282OooO0o0 = MapsKt.emptyMap();
        this.f2281OooO0o = -1;
        this.f2283OooO0oO = 0;
        this.f2284OooO0oo = -1;
        this.f2276OooO = 0;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x00bd  */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList, java.util.List<Oooo0oO.o0O00OO>] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList, java.util.List<Oooo0oO.o0O00OO>] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList, java.util.List, java.util.List<Oooo0oO.o0O00OO>] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList, java.util.List<Oooo0oO.o0O00OO>] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.ArrayList, java.util.List<Oooo0oO.o0O00OO>] */
    public final void OooO0Oo(oo0O oo0o, o000O o000o) {
        oo0O oo0o2 = oo0o;
        o000O o000o2 = o000o;
        while (o000o2.f2254OooO0Oo.size() > oo0o.OooO0o()) {
            CollectionsKt.removeLast(o000o2.f2254OooO0Oo);
        }
        while (o000o2.f2254OooO0Oo.size() < oo0o.OooO0o()) {
            int size = o000o2.f2254OooO0Oo.size();
            long j = oo0o2.f2481OooO00o;
            ?? r6 = o000o2.f2254OooO0Oo;
            long j2 = o000o2.f2253OooO0OO;
            OooOo.OooO00o oooO00o = OooOo.f27310OooO0O0;
            r6.add(new o0O00OO(Oooo000.OooO00o(((int) (j >> 32)) - ((int) (j2 >> 32)), OooOo.OooO0OO(j) - OooOo.OooO0OO(j2)), oo0o2.OooO0Oo(size)));
        }
        ?? r2 = o000o2.f2254OooO0Oo;
        int i = 0;
        int size2 = r2.size();
        while (i < size2) {
            o0O00OO o0o00oo2 = (o0O00OO) r2.get(i);
            long j3 = o0o00oo2.f2429OooO0OO;
            long j4 = o000o2.f2253OooO0OO;
            OooOo.OooO00o oooO00o2 = OooOo.f27310OooO0O0;
            long jOooO00o = o00oO0o.OooO00o(j4, OooOo.OooO0OO(j3), ((int) (j3 >> 32)) + ((int) (j4 >> 32)));
            long j5 = oo0o2.f2482OooO0O0;
            o0o00oo2.f2427OooO00o = oo0o2.OooO0Oo(i);
            o0000O0O<OooOo> o0000o0oOooO0OO = oo0o2.OooO0OO(i);
            if (!OooOo.OooO0O0(jOooO00o, j5)) {
                long j6 = o000o2.f2253OooO0OO;
                o0o00oo2.f2429OooO0OO = Oooo000.OooO00o(((int) (j5 >> 32)) - ((int) (j6 >> 32)), OooOo.OooO0OO(j5) - OooOo.OooO0OO(j6));
                if (o0000o0oOooO0OO != null) {
                    o0o00oo2.OooO00o(true);
                    BuildersKt__Builders_commonKt.launch$default(this.f2277OooO00o, null, null, new OooO00o(o0o00oo2, o0000o0oOooO0OO, null), 3, null);
                }
            }
            i++;
            oo0o2 = oo0o;
            o000o2 = o000o;
        }
    }
}
