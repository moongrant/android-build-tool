package o0o0000;

import com.qiniu.android.collect.ReportItem;
import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.common.model.ApiResult;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo0 implements FlowCollector<ApiResult<Object>> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ Function2<ApiResult<Object>, Continuation<? super Unit>, Object> f40812Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Function2<Object, Continuation<? super Unit>, Object> f40813Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Function2<ApiError, Continuation<? super Unit>, Object> f40814Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ boolean f40815Oooo0oo;

    @DebugMetadata(c = "com.yalla.yalla.api.ApiObserverKt$collectApiResult$2", f = "ApiObserver.kt", i = {0, 0, 1, 1}, l = {81, 83, 88}, m = "emit", n = {"this", ReportItem.QualityKeyResult, "this", ReportItem.QualityKeyResult}, s = {"L$0", "L$1", "L$0", "L$1"})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public Oooo0 f40817Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public ApiResult f40818Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public /* synthetic */ Object f40819Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public int f40820OoooO00;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f40819Oooo0oo = obj;
            this.f40820OoooO00 |= Integer.MIN_VALUE;
            return Oooo0.this.emit(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Oooo0(Function2<Object, ? super Continuation<? super Unit>, ? extends Object> function2, Function2<? super ApiError, ? super Continuation<? super Unit>, ? extends Object> function3, boolean z, Function2<? super ApiResult<Object>, ? super Continuation<? super Unit>, ? extends Object> function4) {
        this.f40813Oooo0o = function2;
        this.f40814Oooo0oO = function3;
        this.f40815Oooo0oo = z;
        this.f40812Oooo = function4;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0083  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ac A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    @Nullable
    /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
    public final Object emit(@NotNull ApiResult<Object> apiResult, @NotNull Continuation<? super Unit> continuation) {
        OooO00o oooO00o;
        Oooo0 oooo0;
        Function2<ApiResult<Object>, Continuation<? super Unit>, Object> function2;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f40820OoooO00;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f40820OoooO00 = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        } else {
            oooO00o = new OooO00o(continuation);
        }
        Object obj = oooO00o.f40819Oooo0oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO00o.f40820OoooO00;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (apiResult.isSuccess()) {
                Function2<Object, Continuation<? super Unit>, Object> function3 = this.f40813Oooo0o;
                if (function3 != null) {
                    Object data = apiResult.getData();
                    oooO00o.f40817Oooo0o = this;
                    oooO00o.f40818Oooo0oO = apiResult;
                    oooO00o.f40820OoooO00 = 1;
                    if (function3.invoke(data, oooO00o) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                oooo0 = this;
            } else {
                Function2<ApiError, Continuation<? super Unit>, Object> function4 = this.f40814Oooo0oO;
                if (function4 != null) {
                    ApiError error = apiResult.getError();
                    oooO00o.f40817Oooo0o = this;
                    oooO00o.f40818Oooo0oO = apiResult;
                    oooO00o.f40820OoooO00 = 2;
                    if (function4.invoke(error, oooO00o) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                oooo0 = this;
                if (!oooo0.f40815Oooo0oo) {
                    ApiError error2 = apiResult.getError();
                    Intrinsics.checkNotNullParameter(error2, "error");
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOOOO(error2, null), 3, null);
                }
            }
            function2 = oooo0.f40812Oooo;
            if (function2 == null) {
                return Unit.INSTANCE;
            }
            oooO00o.f40817Oooo0o = null;
            oooO00o.f40818Oooo0oO = null;
            oooO00o.f40820OoooO00 = 3;
            if (function2.invoke(apiResult, oooO00o) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i2 == 1) {
            apiResult = oooO00o.f40818Oooo0oO;
            oooo0 = oooO00o.f40817Oooo0o;
            ResultKt.throwOnFailure(obj);
            function2 = oooo0.f40812Oooo;
            if (function2 == null) {
                return Unit.INSTANCE;
            }
            oooO00o.f40817Oooo0o = null;
            oooO00o.f40818Oooo0oO = null;
            oooO00o.f40820OoooO00 = 3;
            if (function2.invoke(apiResult, oooO00o) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i2 == 2) {
            apiResult = oooO00o.f40818Oooo0oO;
            oooo0 = oooO00o.f40817Oooo0o;
            ResultKt.throwOnFailure(obj);
            if (!oooo0.f40815Oooo0oo) {
                ApiError error3 = apiResult.getError();
                Intrinsics.checkNotNullParameter(error3, "error");
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOOOO(error3, null), 3, null);
            }
            function2 = oooo0.f40812Oooo;
            if (function2 == null) {
                return Unit.INSTANCE;
            }
            oooO00o.f40817Oooo0o = null;
            oooO00o.f40818Oooo0oO = null;
            oooO00o.f40820OoooO00 = 3;
            if (function2.invoke(apiResult, oooO00o) == coroutine_suspended) {
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
}
