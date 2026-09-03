package p377o0OOoOo;

import com.qiniu.android.collect.ReportItem;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
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
import p375o0OOoOO.o00000O0;

/* JADX INFO: loaded from: classes4.dex */
public final class o000 implements FlowCollector<ApiResult<Object>> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function2<Object, Continuation<? super Unit>, Object> f44064OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ boolean f44065OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function2<ApiError, Continuation<? super Unit>, Object> f44066OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Function2<ApiResult<Object>, Continuation<? super Unit>, Object> f44067OooO0oO;

    @DebugMetadata(c = "com.yalla.yalla.api.old.ApiObserverKt$collectApiResult$2", f = "ApiObserver.kt", i = {0, 0, 1, 1}, l = {81, 83, 88}, m = "emit", n = {"this", ReportItem.QualityKeyResult, "this", ReportItem.QualityKeyResult}, s = {"L$0", "L$1", "L$0", "L$1"})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public o000 f44068OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public /* synthetic */ Object f44069OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public ApiResult f44070OooO0o0;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f44072OooO0oo;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f44069OooO0o = obj;
            this.f44072OooO0oo |= Integer.MIN_VALUE;
            return o000.this.emit(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o000(Function2<Object, ? super Continuation<? super Unit>, ? extends Object> function2, Function2<? super ApiError, ? super Continuation<? super Unit>, ? extends Object> function3, boolean z, Function2<? super ApiResult<Object>, ? super Continuation<? super Unit>, ? extends Object> function4) {
        this.f44064OooO0Oo = function2;
        this.f44066OooO0o0 = function3;
        this.f44065OooO0o = z;
        this.f44067OooO0oO = function4;
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
        o000 o000Var;
        Function2<ApiResult<Object>, Continuation<? super Unit>, Object> function2;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f44072OooO0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f44072OooO0oo = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        } else {
            oooO00o = new OooO00o(continuation);
        }
        Object obj = oooO00o.f44069OooO0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO00o.f44072OooO0oo;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (apiResult.isSuccess()) {
                Function2<Object, Continuation<? super Unit>, Object> function3 = this.f44064OooO0Oo;
                if (function3 != null) {
                    Object data = apiResult.getData();
                    oooO00o.f44068OooO0Oo = this;
                    oooO00o.f44070OooO0o0 = apiResult;
                    oooO00o.f44072OooO0oo = 1;
                    if (function3.invoke(data, oooO00o) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                o000Var = this;
            } else {
                Function2<ApiError, Continuation<? super Unit>, Object> function4 = this.f44066OooO0o0;
                if (function4 != null) {
                    ApiError error = apiResult.getError();
                    oooO00o.f44068OooO0Oo = this;
                    oooO00o.f44070OooO0o0 = apiResult;
                    oooO00o.f44072OooO0oo = 2;
                    if (function4.invoke(error, oooO00o) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                o000Var = this;
                if (!o000Var.f44065OooO0o) {
                    ApiError error2 = apiResult.getError();
                    Intrinsics.checkNotNullParameter(error2, "error");
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o00000O0(error2, null), 3, null);
                }
            }
            function2 = o000Var.f44067OooO0oO;
            if (function2 == null) {
                return Unit.INSTANCE;
            }
            oooO00o.f44068OooO0Oo = null;
            oooO00o.f44070OooO0o0 = null;
            oooO00o.f44072OooO0oo = 3;
            if (function2.invoke(apiResult, oooO00o) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i2 == 1) {
            apiResult = oooO00o.f44070OooO0o0;
            o000Var = oooO00o.f44068OooO0Oo;
            ResultKt.throwOnFailure(obj);
            function2 = o000Var.f44067OooO0oO;
            if (function2 == null) {
                return Unit.INSTANCE;
            }
            oooO00o.f44068OooO0Oo = null;
            oooO00o.f44070OooO0o0 = null;
            oooO00o.f44072OooO0oo = 3;
            if (function2.invoke(apiResult, oooO00o) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i2 == 2) {
            apiResult = oooO00o.f44070OooO0o0;
            o000Var = oooO00o.f44068OooO0Oo;
            ResultKt.throwOnFailure(obj);
            if (!o000Var.f44065OooO0o) {
                ApiError error3 = apiResult.getError();
                Intrinsics.checkNotNullParameter(error3, "error");
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o00000O0(error3, null), 3, null);
            }
            function2 = o000Var.f44067OooO0oO;
            if (function2 == null) {
                return Unit.INSTANCE;
            }
            oooO00o.f44068OooO0Oo = null;
            oooO00o.f44070OooO0o0 = null;
            oooO00o.f44072OooO0oo = 3;
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
