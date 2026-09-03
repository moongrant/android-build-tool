package o0o0000;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.common.model.ApiResult;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o000oOoO {

    @DebugMetadata(c = "com.yalla.yalla.api.ApiObserverKt", f = "ApiObserver.kt", i = {0, 0, 1, 1, 1}, l = {63, 65, 70}, m = "doApiResult", n = {"$this$doApiResult", "onFinish", "$this$doApiResult", "onFinish", "overrideError"}, s = {"L$0", "L$1", "L$0", "L$1", "Z$0"})
    public static final class OooO00o<T> extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public /* synthetic */ Object f40825Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public ApiResult f40826Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public Function2 f40827Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public boolean f40828Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public int f40829OoooO00;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f40825Oooo = obj;
            this.f40829OoooO00 |= Integer.MIN_VALUE;
            return o000oOoO.OooO0O0(null, false, null, null, null, this);
        }
    }

    public static Object OooO00o(Flow flow, Function2 function2, Function2 function3, Continuation continuation, int i) {
        if ((i & 1) != 0) {
            function2 = null;
        }
        if ((i & 4) != 0) {
            function3 = null;
        }
        Object objCollect = flow.collect(new Oooo0(function2, null, false, function3), continuation);
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
            int i = oooO00o.f40829OoooO00;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f40829OoooO00 = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        } else {
            oooO00o = new OooO00o(continuation);
        }
        Object obj = oooO00o.f40825Oooo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO00o.f40829OoooO00;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (apiResult.isSuccess()) {
                T data = apiResult.getData();
                oooO00o.f40826Oooo0o = apiResult2;
                oooO00o.f40827Oooo0oO = function5;
                oooO00o.f40829OoooO00 = 1;
                if (function4.invoke(data, oooO00o) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (function3 != null) {
                    ApiError error = apiResult.getError();
                    oooO00o.f40826Oooo0o = apiResult2;
                    oooO00o.f40827Oooo0oO = function5;
                    z2 = z;
                    oooO00o.f40828Oooo0oo = z2;
                    oooO00o.f40829OoooO00 = 2;
                    if (function3.invoke(error, oooO00o) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    z2 = z;
                }
                if (!z2) {
                    ApiError error2 = apiResult2.getError();
                    Intrinsics.checkNotNullParameter(error2, "error");
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOOOO(error2, null), 3, null);
                }
            }
            if (function5 == null) {
                return Unit.INSTANCE;
            }
            oooO00o.f40826Oooo0o = null;
            oooO00o.f40827Oooo0oO = null;
            oooO00o.f40829OoooO00 = 3;
            if (function5.invoke(apiResult2, oooO00o) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i2 == 1) {
            Function2<? super ApiResult<T>, ? super Continuation<? super Unit>, ? extends Object> function6 = oooO00o.f40827Oooo0oO;
            ApiResult<T> apiResult3 = oooO00o.f40826Oooo0o;
            ResultKt.throwOnFailure(obj);
            function5 = function6;
            apiResult2 = apiResult3;
            if (function5 == null) {
                return Unit.INSTANCE;
            }
            oooO00o.f40826Oooo0o = null;
            oooO00o.f40827Oooo0oO = null;
            oooO00o.f40829OoooO00 = 3;
            if (function5.invoke(apiResult2, oooO00o) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i2 == 2) {
            boolean z3 = oooO00o.f40828Oooo0oo;
            function5 = oooO00o.f40827Oooo0oO;
            ApiResult<T> apiResult4 = oooO00o.f40826Oooo0o;
            ResultKt.throwOnFailure(obj);
            z2 = z3;
            apiResult2 = apiResult4;
            if (!z2) {
                ApiError error3 = apiResult2.getError();
                Intrinsics.checkNotNullParameter(error3, "error");
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOOOO(error3, null), 3, null);
            }
            if (function5 == null) {
                return Unit.INSTANCE;
            }
            oooO00o.f40826Oooo0o = null;
            oooO00o.f40827Oooo0oO = null;
            oooO00o.f40829OoooO00 = 3;
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

    public static void OooO0Oo(LiveData liveData, LifecycleOwner owner, final Function1 onSuccess) {
        final boolean z = false;
        Intrinsics.checkNotNullParameter(liveData, "<this>");
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        final Function1 function1 = null;
        liveData.observe(owner, new Observer() { // from class: o0o0000.Oooo000
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                Function1 onSuccess2 = onSuccess;
                Function1 function2 = function1;
                boolean z2 = z;
                Function1 function3 = function1;
                ApiResult result = (ApiResult) obj;
                Intrinsics.checkNotNullParameter(onSuccess2, "$onSuccess");
                if (result.isSuccess()) {
                    onSuccess2.invoke(result.getData());
                } else {
                    if (function2 != null) {
                        function2.invoke(result.getError());
                    }
                    if (!z2) {
                        ApiError error = result.getError();
                        Intrinsics.checkNotNullParameter(error, "error");
                        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOOOO(error, null), 3, null);
                    }
                }
                if (function3 != null) {
                    Intrinsics.checkNotNullExpressionValue(result, "result");
                    function3.invoke(result);
                }
            }
        });
    }
}
