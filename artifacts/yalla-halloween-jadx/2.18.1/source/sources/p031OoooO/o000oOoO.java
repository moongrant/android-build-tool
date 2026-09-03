package p031OoooO;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Stable;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o0000O0O.OooOOO0;
import o00O0O.OooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p023Oooo00O.Oooo0;
import p023Oooo00O.o00OO00O;
import p023Oooo00O.o00OO0O0;
import p023Oooo00O.o0Oo0oo;
import p023Oooo00O.oo0O;
import p026Oooo0OO.o0000;
import p026Oooo0OO.o00000OO;
import p026Oooo0OO.o0000O;
import p026Oooo0OO.o0000O0;
import p026Oooo0OO.o0000O00;
import p026Oooo0OO.o0000O0O;
import p026Oooo0OO.o0000OO0;
import p026Oooo0OO.o000O00;
import p026Oooo0OO.o000O0o;
import p026Oooo0OO.o000Oo0;
import p047Oooooo0.o00OO0OO;
import p100o000oOoO.o00Oo00;
import p100o000oOoO.oO0Oo;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes.dex */
@Stable
public final class o000oOoO implements OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float f2845OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f2846OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final float f2847OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final float f2848OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final float f2849OooO0o0;

    @DebugMetadata(c = "androidx.compose.material.DefaultButtonElevation$elevation$1", f = "Button.kt", i = {}, l = {506}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f2850Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o0000OO0 f2851Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ o00OO0OO<o0000O> f2852Oooo0oo;

        /* JADX INFO: renamed from: OoooO.o000oOoO$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0021OooO00o implements FlowCollector<o0000O> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ o00OO0OO<o0000O> f2853Oooo0o;

            public C0021OooO00o(o00OO0OO<o0000O> o00oo0oo) {
                this.f2853Oooo0o = o00oo0oo;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(o0000O o0000o2, Continuation continuation) {
                o0000O o0000o3 = o0000o2;
                if (o0000o3 instanceof o0000O0) {
                    this.f2853Oooo0o.add(o0000o3);
                } else if (o0000o3 instanceof o0000O0O) {
                    this.f2853Oooo0o.remove(((o0000O0O) o0000o3).f1713OooO00o);
                } else if (o0000o3 instanceof o0000) {
                    this.f2853Oooo0o.add(o0000o3);
                } else if (o0000o3 instanceof o0000O00) {
                    this.f2853Oooo0o.remove(((o0000O00) o0000o3).f1712OooO00o);
                } else if (o0000o3 instanceof o000Oo0) {
                    this.f2853Oooo0o.add(o0000o3);
                } else if (o0000o3 instanceof o000O00) {
                    this.f2853Oooo0o.remove(((o000O00) o0000o3).f1720OooO00o);
                } else if (o0000o3 instanceof o000O0o) {
                    this.f2853Oooo0o.remove(((o000O0o) o0000o3).f1727OooO00o);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o0000OO0 o0000oo1, o00OO0OO<o0000O> o00oo0oo, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f2851Oooo0oO = o0000oo1;
            this.f2852Oooo0oo = o00oo0oo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f2851Oooo0oO, this.f2852Oooo0oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f2850Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<o0000O> flowOooO00o = this.f2851Oooo0oO.OooO00o();
                C0021OooO00o c0021OooO00o = new C0021OooO00o(this.f2852Oooo0oo);
                this.f2850Oooo0o = 1;
                if (flowOooO00o.collect(c0021OooO00o, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "androidx.compose.material.DefaultButtonElevation$elevation$2", f = "Button.kt", i = {}, l = {551}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f2854Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Oooo0<OooOOO0, o0Oo0oo> f2855Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ float f2856Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Oooo0<OooOOO0, o0Oo0oo> oooo0, float f, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f2855Oooo0oO = oooo0;
            this.f2856Oooo0oo = f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f2855Oooo0oO, this.f2856Oooo0oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f2854Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Oooo0<OooOOO0, o0Oo0oo> oooo0 = this.f2855Oooo0oO;
                OooOOO0 oooOOO0 = new OooOOO0(this.f2856Oooo0oo);
                this.f2854Oooo0o = 1;
                if (oooo0.OooO0oO(oooOOO0, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "androidx.compose.material.DefaultButtonElevation$elevation$3", f = "Button.kt", i = {}, l = {561}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ float f2857Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f2858Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Oooo0<OooOOO0, o0Oo0oo> f2859Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ o000oOoO f2860Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ o0000O f2861OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(Oooo0<OooOOO0, o0Oo0oo> oooo0, o000oOoO o000oooo2, float f, o0000O o0000o2, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f2859Oooo0oO = oooo0;
            this.f2860Oooo0oo = o000oooo2;
            this.f2857Oooo = f;
            this.f2861OoooO00 = o0000o2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0OO(this.f2859Oooo0oO, this.f2860Oooo0oo, this.f2857Oooo, this.f2861OoooO00, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object interaction;
            o00OO00O<OooOOO0> o00oo00o;
            Object objOooO0oO;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f2858Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                float f = this.f2859Oooo0oO.OooO0o0().f27306Oooo0o;
                o00OO00O<OooOOO0> o00oo00o2 = null;
                if (OooOOO0.OooO00o(f, this.f2860Oooo0oo.f2846OooO0O0)) {
                    OooO.OooO00o oooO00o = OooO.f30391OooO0O0;
                    interaction = new o000Oo0(OooO.f30392OooO0OO);
                } else if (OooOOO0.OooO00o(f, this.f2860Oooo0oo.f2848OooO0Oo)) {
                    interaction = new o0000O0();
                } else {
                    interaction = OooOOO0.OooO00o(f, this.f2860Oooo0oo.f2849OooO0o0) ? new o0000() : null;
                }
                Oooo0<OooOOO0, o0Oo0oo> oooo0 = this.f2859Oooo0oO;
                float f2 = this.f2857Oooo;
                o0000O interaction2 = this.f2861OoooO00;
                this.f2858Oooo0o = 1;
                o00OO00O<OooOOO0> o00oo00o3 = o00Ooo.f2878OooO00o;
                if (interaction2 != null) {
                    Intrinsics.checkNotNullParameter(interaction2, "interaction");
                    if ((interaction2 instanceof o000Oo0) || (interaction2 instanceof o00000OO) || (interaction2 instanceof o0000O0) || (interaction2 instanceof o0000)) {
                        o00oo00o2 = o00Ooo.f2878OooO00o;
                    }
                } else if (interaction != null) {
                    Intrinsics.checkNotNullParameter(interaction, "interaction");
                    if ((interaction instanceof o000Oo0) || (interaction instanceof o00000OO)) {
                        o00oo00o = o00Ooo.f2879OooO0O0;
                    } else if (interaction instanceof o0000O0) {
                        o00oo00o = o00Ooo.f2880OooO0OO;
                    } else if (interaction instanceof o0000) {
                        o00oo00o = o00Ooo.f2879OooO0O0;
                    }
                    o00oo00o2 = o00oo00o;
                }
                o00OO00O<OooOOO0> o00oo00o4 = o00oo00o2;
                if (o00oo00o4 == null ? (objOooO0oO = oooo0.OooO0oO(new OooOOO0(f2), this)) != IntrinsicsKt.getCOROUTINE_SUSPENDED() : (objOooO0oO = Oooo0.OooO0OO(oooo0, new OooOOO0(f2), o00oo00o4, null, this, 12)) != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objOooO0oO = Unit.INSTANCE;
                }
                if (objOooO0oO == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public o000oOoO(float f, float f2, float f3, float f4, float f5) {
        this.f2845OooO00o = f;
        this.f2846OooO0O0 = f2;
        this.f2847OooO0OO = f3;
        this.f2848OooO0Oo = f4;
        this.f2849OooO0o0 = f5;
    }

    @Override // p031OoooO.OooO0o
    @Composable
    @NotNull
    public final oO0Oo<OooOOO0> OooO00o(boolean z, @NotNull o0000OO0 interactionSource, @Nullable oOO00O ooo00o, int i) {
        float f;
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        ooo00o.OooO0o0(-1588756907);
        ooo00o.OooO0o0(-492369756);
        Object objOooO0o = ooo00o.OooO0o();
        oOO00O.OooO00o.C0323OooO00o c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
        if (objOooO0o == c0323OooO00o) {
            objOooO0o = new o00OO0OO();
            ooo00o.Oooo00o(objOooO0o);
        }
        ooo00o.Oooo0o0();
        o00OO0OO o00oo0oo = (o00OO0OO) objOooO0o;
        o00Oo00.OooO0o0(interactionSource, new OooO00o(interactionSource, o00oo0oo, null), ooo00o);
        o0000O o0000o2 = (o0000O) CollectionsKt.lastOrNull((List) o00oo0oo);
        if (!z) {
            f = this.f2847OooO0OO;
        } else if (o0000o2 instanceof o000Oo0) {
            f = this.f2846OooO0O0;
        } else if (o0000o2 instanceof o0000O0) {
            f = this.f2848OooO0Oo;
        } else {
            f = o0000o2 instanceof o0000 ? this.f2849OooO0o0 : this.f2845OooO00o;
        }
        float f2 = f;
        ooo00o.OooO0o0(-492369756);
        Object objOooO0o2 = ooo00o.OooO0o();
        if (objOooO0o2 == c0323OooO00o) {
            OooOOO0 oooOOO0 = new OooOOO0(f2);
            OooOOO0.OooO00o oooO00o = OooOOO0.f27305Oooo0oO;
            o00OO0O0<Float, o0Oo0oo> o00oo0o1 = oo0O.f1293OooO00o;
            Intrinsics.checkNotNullParameter(oooO00o, "<this>");
            objOooO0o2 = new Oooo0(oooOOO0, oo0O.f1295OooO0OO, null);
            ooo00o.Oooo00o(objOooO0o2);
        }
        ooo00o.Oooo0o0();
        Oooo0 oooo0 = (Oooo0) objOooO0o2;
        if (z) {
            ooo00o.OooO0o0(-1598807310);
            o00Oo00.OooO0o0(new OooOOO0(f2), new OooO0OO(oooo0, this, f2, o0000o2, null), ooo00o);
            ooo00o.Oooo0o0();
        } else {
            ooo00o.OooO0o0(-1598807481);
            o00Oo00.OooO0o0(new OooOOO0(f2), new OooO0O0(oooo0, f2, null), ooo00o);
            ooo00o.Oooo0o0();
        }
        oO0Oo oo0oo = oooo0.f1004OooO0OO;
        ooo00o.Oooo0o0();
        return oo0oo;
    }
}
