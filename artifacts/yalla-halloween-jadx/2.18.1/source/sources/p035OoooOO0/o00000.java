package p035OoooOO0;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p023Oooo00O.Oooo0;
import p023Oooo00O.o0000O0;
import p023Oooo00O.o00OO00O;
import p023Oooo00O.o00oO0o;
import p023Oooo00O.o0Oo0oo;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2", f = "RippleAnimation.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class o00000 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public /* synthetic */ Object f3571Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o000000O f3572Oooo0oO;

    @DebugMetadata(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$1", f = "RippleAnimation.kt", i = {}, l = {89}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f3573Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o000000O f3574Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o000000O o000000o2, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f3574Oooo0oO = o000000o2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f3574Oooo0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f3573Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Oooo0<Float, o0Oo0oo> oooo0 = this.f3574Oooo0oO.f3590OooO0oO;
                Float fBoxFloat = Boxing.boxFloat(1.0f);
                o00OO00O o00oo00oOooO0Oo = o00oO0o.OooO0Oo(75, 0, o0000O0.OooO00o.f1052OooO00o, 2);
                this.f3573Oooo0o = 1;
                if (Oooo0.OooO0OO(oooo0, fBoxFloat, o00oo00oOooO0Oo, null, this, 12) == coroutine_suspended) {
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

    @DebugMetadata(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$2", f = "RippleAnimation.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f3575Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o000000O f3576Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o000000O o000000o2, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f3576Oooo0oO = o000000o2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f3576Oooo0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f3575Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Oooo0<Float, o0Oo0oo> oooo0 = this.f3576Oooo0oO.f3591OooO0oo;
                Float fBoxFloat = Boxing.boxFloat(1.0f);
                o00OO00O o00oo00oOooO0Oo = o00oO0o.OooO0Oo(225, 0, o0000O0.f1051OooO00o, 2);
                this.f3575Oooo0o = 1;
                if (Oooo0.OooO0OO(oooo0, fBoxFloat, o00oo00oOooO0Oo, null, this, 12) == coroutine_suspended) {
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

    @DebugMetadata(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$3", f = "RippleAnimation.kt", i = {}, l = {101}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f3577Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o000000O f3578Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(o000000O o000000o2, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f3578Oooo0oO = o000000o2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0OO(this.f3578Oooo0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f3577Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Oooo0<Float, o0Oo0oo> oooo0 = this.f3578Oooo0oO.f3583OooO;
                Float fBoxFloat = Boxing.boxFloat(1.0f);
                o00OO00O o00oo00oOooO0Oo = o00oO0o.OooO0Oo(225, 0, o0000O0.OooO00o.f1052OooO00o, 2);
                this.f3577Oooo0o = 1;
                if (Oooo0.OooO0OO(oooo0, fBoxFloat, o00oo00oOooO0Oo, null, this, 12) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000(o000000O o000000o2, Continuation<? super o00000> continuation) {
        super(2, continuation);
        this.f3572Oooo0oO = o000000o2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        o00000 o00000Var = new o00000(this.f3572Oooo0oO, continuation);
        o00000Var.f3571Oooo0o = obj;
        return o00000Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
        return ((o00000) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.f3571Oooo0o;
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new OooO00o(this.f3572Oooo0oO, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new OooO0O0(this.f3572Oooo0oO, null), 3, null);
        return BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new OooO0OO(this.f3572Oooo0oO, null), 3, null);
    }
}
