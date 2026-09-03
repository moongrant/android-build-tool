package p032OoooO0;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025Oooo0O0.OooOo;
import p025Oooo0O0.o00000O0;
import p418o0Oo0oo.o00000;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2", f = "LongPressTextDragObserver.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class o000O0Oo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public /* synthetic */ Object f3052Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o00000 f3053Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o00O00OO f3054Oooo0oo;

    @DebugMetadata(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$1", f = "LongPressTextDragObserver.kt", i = {}, l = {82}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f3055Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o00000 f3056Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ o00O00OO f3057Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o00000 o00000Var, o00O00OO o00o00oo2, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f3056Oooo0oO = o00000Var;
            this.f3057Oooo0oo = o00o00oo2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f3056Oooo0oO, this.f3057Oooo0oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f3055Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o00000 o00000Var = this.f3056Oooo0oO;
                o00O00OO o00o00oo2 = this.f3057Oooo0oo;
                this.f3055Oooo0o = 1;
                Object objOooO0O0 = o00000O0.OooO0O0(o00000Var, new o00(o00o00oo2, null), this);
                if (objOooO0O0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objOooO0O0 = Unit.INSTANCE;
                }
                if (objOooO0O0 == coroutine_suspended) {
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

    @DebugMetadata(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$2", f = "LongPressTextDragObserver.kt", i = {}, l = {85}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f3058Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o00000 f3059Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ o00O00OO f3060Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o00000 o00000Var, o00O00OO o00o00oo2, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f3059Oooo0oO = o00000Var;
            this.f3060Oooo0oo = o00o00oo2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f3059Oooo0oO, this.f3060Oooo0oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f3058Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o00000 o00000Var = this.f3059Oooo0oO;
                o00O00OO o00o00oo2 = this.f3060Oooo0oo;
                this.f3058Oooo0o = 1;
                Object objOooO0o = OooOo.OooO0o(o00000Var, new o000O0O0(o00o00oo2), new o000O(o00o00oo2), new o000OO00(o00o00oo2), new o000OOo0(o00o00oo2), this);
                if (objOooO0o != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objOooO0o = Unit.INSTANCE;
                }
                if (objOooO0o == coroutine_suspended) {
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
    public o000O0Oo(o00000 o00000Var, o00O00OO o00o00oo2, Continuation<? super o000O0Oo> continuation) {
        super(2, continuation);
        this.f3053Oooo0oO = o00000Var;
        this.f3054Oooo0oo = o00o00oo2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        o000O0Oo o000o0oo2 = new o000O0Oo(this.f3053Oooo0oO, this.f3054Oooo0oo, continuation);
        o000o0oo2.f3052Oooo0o = obj;
        return o000o0oo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
        return ((o000O0Oo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.f3052Oooo0o;
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new OooO00o(this.f3053Oooo0oO, this.f3054Oooo0oo, null), 3, null);
        return BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new OooO0O0(this.f3053Oooo0oO, this.f3054Oooo0oo, null), 3, null);
    }
}
