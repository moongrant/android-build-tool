package p089o000o000;

import androidx.annotation.RestrictTo;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class OooOOOO {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @DebugMetadata(c = "androidx.paging.CancelableChannelFlowKt$cancelableChannelFlow$1", f = "CancelableChannelFlow.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o<T> extends SuspendLambda implements Function2<o00O0OO0<T>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Function2<o00O0OO0<T>, Continuation<? super Unit>, Object> f28677Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f28678Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f28679Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ Job f28680Oooo0oo;

        /* JADX INFO: renamed from: o000o000.OooOOOO$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0307OooO00o extends Lambda implements Function1<Throwable, Unit> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ o00O0OO0<T> f28681Oooo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0307OooO00o(o00O0OO0<T> o00o0oo1) {
                super(1);
                this.f28681Oooo0o = o00o0oo1;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(Throwable th) {
                SendChannel.DefaultImpls.close$default(this.f28681Oooo0o, null, 1, null);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(Job job, Function2<? super o00O0OO0<T>, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f28680Oooo0oo = job;
            this.f28677Oooo = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f28680Oooo0oo, this.f28677Oooo, continuation);
            oooO00o.f28679Oooo0oO = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((OooO00o) create((o00O0OO0) obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f28678Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o00O0OO0<T> o00o0oo1 = (o00O0OO0) this.f28679Oooo0oO;
                this.f28680Oooo0oo.invokeOnCompletion(new C0307OooO00o(o00o0oo1));
                Function2<o00O0OO0<T>, Continuation<? super Unit>, Object> function2 = this.f28677Oooo;
                this.f28678Oooo0o = 1;
                if (function2.invoke(o00o0oo1, this) == coroutine_suspended) {
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

    @NotNull
    public static final <T> Flow<T> OooO00o(@NotNull Job controller, @NotNull Function2<? super o00O0OO0<T>, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(block, "block");
        return o00O0O0O.OooO00o(new OooO00o(controller, block, null));
    }
}
