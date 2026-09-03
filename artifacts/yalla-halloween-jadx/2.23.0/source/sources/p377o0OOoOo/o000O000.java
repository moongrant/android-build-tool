package p377o0OOoOo;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
import kotlin.Function;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p375o0OOoOO.o00000O0;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O000 {

    @DebugMetadata(c = "com.yalla.yalla.api.old.ApiObserverKt", f = "ApiObserver.kt", i = {0, 0, 1, 1, 1}, l = {63, 65, 70}, m = "doApiResult", n = {"$this$doApiResult", "onFinish", "$this$doApiResult", "onFinish", "overrideError"}, s = {"L$0", "L$1", "L$0", "L$1", "Z$0"})
    public static final class OooO00o<T> extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public ApiResult f44220OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f44221OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Function2 f44222OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public /* synthetic */ Object f44223OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f44224OooO0oo;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f44223OooO0oO = obj;
            this.f44224OooO0oo |= Integer.MIN_VALUE;
            return o000O000.OooO0O0(null, false, null, null, null, this);
        }
    }

    public static final class OooO0O0 implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f44225OooO0Oo;

        public OooO0O0(o000O0o function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f44225OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f44225OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f44225OooO0Oo;
        }

        public final int hashCode() {
            return this.f44225OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f44225OooO0Oo.invoke(obj);
        }
    }

    public static Object OooO00o(MutableSharedFlow mutableSharedFlow, Function2 function2, Function2 function3, Continuation continuation, int i) {
        if ((i & 1) != 0) {
            function2 = null;
        }
        if ((i & 4) != 0) {
            function3 = null;
        }
        Object objCollect = mutableSharedFlow.collect(new o000(function2, null, false, function3), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008b  */
    /* JADX WARN: Code duplicated, block: B:31:0x00af  */
    /* JADX WARN: Code duplicated, block: B:33:0x00bb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Nullable
    public static final <T> Object OooO0O0(@NotNull ApiResult<T> apiResult, boolean z, @Nullable Function2<? super ApiResult<T>, ? super Continuation<? super Unit>, ? extends Object> function2, @Nullable Function2<? super ApiError, ? super Continuation<? super Unit>, ? extends Object> function3, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function4, @NotNull Continuation<? super Unit> continuation) {
        OooO00o oooO00o;
        boolean z2;
        ApiResult<T> apiResult2 = apiResult;
        Function2<? super ApiResult<T>, ? super Continuation<? super Unit>, ? extends Object> function5 = function2;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f44224OooO0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f44224OooO0oo = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        } else {
            oooO00o = new OooO00o(continuation);
        }
        Object obj = oooO00o.f44223OooO0oO;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO00o.f44224OooO0oo;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (apiResult.isSuccess()) {
                T data = apiResult.getData();
                oooO00o.f44220OooO0Oo = apiResult2;
                oooO00o.f44222OooO0o0 = function5;
                oooO00o.f44224OooO0oo = 1;
                if (function4.invoke(data, oooO00o) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (function3 != null) {
                    ApiError error = apiResult.getError();
                    oooO00o.f44220OooO0Oo = apiResult2;
                    oooO00o.f44222OooO0o0 = function5;
                    z2 = z;
                    oooO00o.f44221OooO0o = z2;
                    oooO00o.f44224OooO0oo = 2;
                    if (function3.invoke(error, oooO00o) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    z2 = z;
                }
                if (!z2) {
                    ApiError error2 = apiResult2.getError();
                    Intrinsics.checkNotNullParameter(error2, "error");
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o00000O0(error2, null), 3, null);
                }
            }
            if (function5 == null) {
                return Unit.INSTANCE;
            }
            oooO00o.f44220OooO0Oo = null;
            oooO00o.f44222OooO0o0 = null;
            oooO00o.f44224OooO0oo = 3;
            if (function5.invoke(apiResult2, oooO00o) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i2 == 1) {
            Function2<? super ApiResult<T>, ? super Continuation<? super Unit>, ? extends Object> function6 = oooO00o.f44222OooO0o0;
            ApiResult<T> apiResult3 = oooO00o.f44220OooO0Oo;
            ResultKt.throwOnFailure(obj);
            function5 = function6;
            apiResult2 = apiResult3;
            if (function5 == null) {
                return Unit.INSTANCE;
            }
            oooO00o.f44220OooO0Oo = null;
            oooO00o.f44222OooO0o0 = null;
            oooO00o.f44224OooO0oo = 3;
            if (function5.invoke(apiResult2, oooO00o) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i2 == 2) {
            boolean z3 = oooO00o.f44221OooO0o;
            function5 = oooO00o.f44222OooO0o0;
            ApiResult<T> apiResult4 = oooO00o.f44220OooO0Oo;
            ResultKt.throwOnFailure(obj);
            z2 = z3;
            apiResult2 = apiResult4;
            if (!z2) {
                ApiError error3 = apiResult2.getError();
                Intrinsics.checkNotNullParameter(error3, "error");
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o00000O0(error3, null), 3, null);
            }
            if (function5 == null) {
                return Unit.INSTANCE;
            }
            oooO00o.f44220OooO0Oo = null;
            oooO00o.f44222OooO0o0 = null;
            oooO00o.f44224OooO0oo = 3;
            if (function5.invoke(apiResult2, oooO00o) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object OooO0OO(ApiResult apiResult, boolean z, Function2 function2, Function2 function3, Function2 function4, Continuation continuation, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        return OooO0O0(apiResult, z, (i & 2) != 0 ? null : function2, (i & 4) != 0 ? null : function3, function4, continuation);
    }

    public static void OooO0Oo(LiveData liveData, LifecycleOwner owner, boolean z, Function1 function1, Function1 function2, Function1 onSuccess, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            function1 = null;
        }
        if ((i & 8) != 0) {
            function2 = null;
        }
        Intrinsics.checkNotNullParameter(liveData, "<this>");
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        liveData.observe(owner, new OooO0O0(new o000O0o(onSuccess, function2, function1, z)));
    }
}
