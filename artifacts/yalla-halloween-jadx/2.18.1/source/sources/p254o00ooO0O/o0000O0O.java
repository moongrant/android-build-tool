package p254o00ooO0O;

import androidx.lifecycle.CoroutineLiveDataKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import kotlin.BuilderInference;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o0000O0O {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @DebugMetadata(c = "com.code.android.util.LiveDataUtilKt$liveDataAsync$1", f = "LiveDataUtil.kt", i = {}, l = {13}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o<T> extends SuspendLambda implements Function2<LiveDataScope<T>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f34266Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f34267Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ Function2<LiveDataScope<T>, Continuation<? super Unit>, Object> f34268Oooo0oo;

        /* JADX INFO: renamed from: o00ooO0O.o0000O0O$OooO00o$OooO00o, reason: collision with other inner class name */
        @DebugMetadata(c = "com.code.android.util.LiveDataUtilKt$liveDataAsync$1$1", f = "LiveDataUtil.kt", i = {}, l = {14}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0354OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public int f34269Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public final /* synthetic */ Function2<LiveDataScope<T>, Continuation<? super Unit>, Object> f34270Oooo0oO;

            /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
            public final /* synthetic */ LiveDataScope<T> f34271Oooo0oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0354OooO00o(Function2<? super LiveDataScope<T>, ? super Continuation<? super Unit>, ? extends Object> function2, LiveDataScope<T> liveDataScope, Continuation<? super C0354OooO00o> continuation) {
                super(2, continuation);
                this.f34270Oooo0oO = function2;
                this.f34271Oooo0oo = liveDataScope;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0354OooO00o(this.f34270Oooo0oO, this.f34271Oooo0oo, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C0354OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f34269Oooo0o;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Function2<LiveDataScope<T>, Continuation<? super Unit>, Object> function2 = this.f34270Oooo0oO;
                    LiveDataScope<T> liveDataScope = this.f34271Oooo0oo;
                    this.f34269Oooo0o = 1;
                    if (function2.invoke(liveDataScope, this) == coroutine_suspended) {
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
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(Function2<? super LiveDataScope<T>, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f34268Oooo0oo = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f34268Oooo0oo, continuation);
            oooO00o.f34267Oooo0oO = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((OooO00o) create((LiveDataScope) obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f34266Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LiveDataScope liveDataScope = (LiveDataScope) this.f34267Oooo0oO;
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C0354OooO00o c0354OooO00o = new C0354OooO00o(this.f34268Oooo0oo, liveDataScope, null);
                this.f34266Oooo0o = 1;
                if (BuildersKt.withContext(io2, c0354OooO00o, this) == coroutine_suspended) {
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
    public static final <T> LiveData<T> OooO00o(@BuilderInference @NotNull Function2<? super LiveDataScope<T>, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return CoroutineLiveDataKt.liveData$default((CoroutineContext) null, 0L, new OooO00o(block, null), 3, (Object) null);
    }
}
