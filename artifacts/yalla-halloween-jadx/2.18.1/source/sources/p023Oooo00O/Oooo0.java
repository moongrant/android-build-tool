package p023Oooo00O;

import androidx.compose.animation.core.MutatePriority;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Objects;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p023Oooo00O.o0O0O00;
import p100o000oOoO.o0OOO00;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class Oooo0<T, V extends o0O0O00> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final V f1001OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o00OO0O0<T, V> f1002OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final T f1003OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final o0ooOOo<T, V> f1004OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f1005OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final o000OO00 f1006OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f1007OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final o00O000o<T> f1008OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final V f1009OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public V f1010OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public V f1011OooOO0O;

    @DebugMetadata(c = "androidx.compose.animation.core.Animatable$snapTo$2", f = "Animatable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Oooo0<T, V> f1012Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ T f1013Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Oooo0<T, V> oooo0, T t, Continuation<? super OooO00o> continuation) {
            super(1, continuation);
            this.f1012Oooo0o = oooo0;
            this.f1013Oooo0oO = t;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return new OooO00o(this.f1012Oooo0o, this.f1013Oooo0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((OooO00o) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            Oooo0.OooO0O0(this.f1012Oooo0o);
            Object objOooO00o = Oooo0.OooO00o(this.f1012Oooo0o, this.f1013Oooo0oO);
            this.f1012Oooo0o.f1004OooO0OO.OooO0oo((T) objOooO00o);
            this.f1012Oooo0o.f1007OooO0o0.setValue(objOooO00o);
            return Unit.INSTANCE;
        }
    }

    public Oooo0(T t, @NotNull o00OO0O0<T, V> typeConverter, @Nullable T t2) {
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
        this.f1002OooO00o = typeConverter;
        this.f1003OooO0O0 = t2;
        this.f1004OooO0OO = new o0ooOOo<>(typeConverter, t, null, 60);
        this.f1005OooO0Oo = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(Boolean.FALSE);
        this.f1007OooO0o0 = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(t);
        this.f1006OooO0o = new o000OO00();
        this.f1008OooO0oO = new o00O000o<>(t2, 3);
        V v = (V) OooO0Oo(t, Float.NEGATIVE_INFINITY);
        this.f1009OooO0oo = v;
        V v2 = (V) OooO0Oo(t, Float.POSITIVE_INFINITY);
        this.f1001OooO = v2;
        this.f1010OooOO0 = v;
        this.f1011OooOO0O = v2;
    }

    public static final Object OooO00o(Oooo0 oooo0, Object obj) {
        if (Intrinsics.areEqual(oooo0.f1010OooOO0, oooo0.f1009OooO0oo) && Intrinsics.areEqual(oooo0.f1011OooOO0O, oooo0.f1001OooO)) {
            return obj;
        }
        V vInvoke = oooo0.f1002OooO00o.OooO00o().invoke(obj);
        int iOooO0O0 = vInvoke.OooO0O0();
        boolean z = false;
        for (int i = 0; i < iOooO0O0; i++) {
            if (vInvoke.OooO00o(i) < oooo0.f1010OooOO0.OooO00o(i) || vInvoke.OooO00o(i) > oooo0.f1011OooOO0O.OooO00o(i)) {
                vInvoke.OooO0o0(i, RangesKt.coerceIn(vInvoke.OooO00o(i), oooo0.f1010OooOO0.OooO00o(i), oooo0.f1011OooOO0O.OooO00o(i)));
                z = true;
            }
        }
        return z ? oooo0.f1002OooO00o.OooO0O0().invoke(vInvoke) : obj;
    }

    public static final void OooO0O0(Oooo0 oooo0) {
        o0ooOOo<T, V> o0ooooo2 = oooo0.f1004OooO0OO;
        o0ooooo2.f1239Oooo0oo.OooO0Oo();
        o0ooooo2.f1236Oooo = Long.MIN_VALUE;
        oooo0.f1005OooO0Oo.setValue(Boolean.FALSE);
    }

    public static Object OooO0OO(Oooo0 oooo0, Object obj, oo000o oo000oVar, Function1 function1, Continuation continuation, int i) {
        oo000o animationSpec = (i & 2) != 0 ? oooo0.f1008OooO0oO : oo000oVar;
        T tInvoke = (i & 4) != 0 ? oooo0.f1002OooO00o.OooO0O0().invoke(oooo0.f1004OooO0OO.f1239Oooo0oo) : null;
        Function1 function2 = (i & 8) != 0 ? null : function1;
        Object objOooO0o = oooo0.OooO0o();
        o00OO0O0<T, V> typeConverter = oooo0.f1002OooO00o;
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
        o00O00o0 o00o00o1 = new o00O00o0(animationSpec, typeConverter, objOooO0o, obj, (o0O0O00) typeConverter.OooO00o().invoke(tInvoke));
        long j = oooo0.f1004OooO0OO.f1236Oooo;
        o000OO00 o000oo01 = oooo0.f1006OooO0o;
        Oooo000 oooo000 = new Oooo000(oooo0, tInvoke, o00o00o1, j, function2, null);
        MutatePriority mutatePriority = MutatePriority.Default;
        Objects.requireNonNull(o000oo01);
        return CoroutineScopeKt.coroutineScope(new o000OOo0(mutatePriority, o000oo01, oooo000, null), continuation);
    }

    public final V OooO0Oo(T t, float f) {
        V vInvoke = this.f1002OooO00o.OooO00o().invoke(t);
        int iOooO0O0 = vInvoke.OooO0O0();
        for (int i = 0; i < iOooO0O0; i++) {
            vInvoke.OooO0o0(i, f);
        }
        return vInvoke;
    }

    public final T OooO0o() {
        return this.f1004OooO0OO.getValue();
    }

    public final T OooO0o0() {
        return this.f1007OooO0o0.getValue();
    }

    @Nullable
    public final Object OooO0oO(T t, @NotNull Continuation<? super Unit> continuation) {
        o000OO00 o000oo01 = this.f1006OooO0o;
        OooO00o oooO00o = new OooO00o(this, t, null);
        MutatePriority mutatePriority = MutatePriority.Default;
        Objects.requireNonNull(o000oo01);
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new o000OOo0(mutatePriority, o000oo01, oooO00o, null), continuation);
        return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }
}
