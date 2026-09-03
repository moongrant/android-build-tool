package p384o0OOoo0O;

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
import p381o0OOoOo0.Oooo000;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OoOo0<T> implements FlowCollector {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function2<T, Continuation<? super Unit>, Object> f43468OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ boolean f43469OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function2<ApiError, Continuation<? super Unit>, Object> f43470OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Function2<ApiResult<T>, Continuation<? super Unit>, Object> f43471OooO0oO;

    @DebugMetadata(c = "com.yalla.yalla.api.old.ApiObserverKt$collectApiResult$2", f = "ApiObserver.kt", i = {0, 0, 1, 1}, l = {81, 83, 88}, m = "emit", n = {"this", ReportItem.QualityKeyResult, "this", ReportItem.QualityKeyResult}, s = {"L$0", "L$1", "L$0", "L$1"})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public o0OoOo0 f43472OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public /* synthetic */ Object f43473OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public ApiResult f43474OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ o0OoOo0<T> f43475OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f43476OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(o0OoOo0<? super T> o0oooo1, Continuation<? super OooO00o> continuation) {
            super(continuation);
            this.f43475OooO0oO = o0oooo1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f43473OooO0o = obj;
            this.f43476OooO0oo |= Integer.MIN_VALUE;
            return this.f43475OooO0oO.emit(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o0OoOo0(Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2, Function2<? super ApiError, ? super Continuation<? super Unit>, ? extends Object> function3, boolean z, Function2<? super ApiResult<T>, ? super Continuation<? super Unit>, ? extends Object> function4) {
        this.f43468OooO0Oo = function2;
        this.f43470OooO0o0 = function3;
        this.f43469OooO0o = z;
        this.f43471OooO0oO = function4;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0083  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ac A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    @Nullable
    /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
    public final Object emit(@NotNull ApiResult<T> apiResult, @NotNull Continuation<? super Unit> continuation) {
        OooO00o oooO00o;
        o0OoOo0<T> o0oooo1;
        Function2<ApiResult<T>, Continuation<? super Unit>, Object> function2;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f43476OooO0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f43476OooO0oo = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(this, continuation);
            }
        } else {
            oooO00o = new OooO00o(this, continuation);
        }
        Object obj = oooO00o.f43473OooO0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO00o.f43476OooO0oo;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (apiResult.isSuccess()) {
                Function2<T, Continuation<? super Unit>, Object> function3 = this.f43468OooO0Oo;
                if (function3 != null) {
                    T data = apiResult.getData();
                    oooO00o.f43472OooO0Oo = this;
                    oooO00o.f43474OooO0o0 = apiResult;
                    oooO00o.f43476OooO0oo = 1;
                    if (function3.invoke(data, oooO00o) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                o0oooo1 = this;
            } else {
                Function2<ApiError, Continuation<? super Unit>, Object> function4 = this.f43470OooO0o0;
                if (function4 != null) {
                    ApiError error = apiResult.getError();
                    oooO00o.f43472OooO0Oo = this;
                    oooO00o.f43474OooO0o0 = apiResult;
                    oooO00o.f43476OooO0oo = 2;
                    if (function4.invoke(error, oooO00o) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                o0oooo1 = this;
                if (!o0oooo1.f43469OooO0o) {
                    ApiError error2 = apiResult.getError();
                    Intrinsics.checkNotNullParameter(error2, "error");
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new Oooo000(error2, null), 3, null);
                }
            }
            function2 = o0oooo1.f43471OooO0oO;
            if (function2 == null) {
                return Unit.INSTANCE;
            }
            oooO00o.f43472OooO0Oo = null;
            oooO00o.f43474OooO0o0 = null;
            oooO00o.f43476OooO0oo = 3;
            if (function2.invoke(apiResult, oooO00o) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i2 == 1) {
            apiResult = oooO00o.f43474OooO0o0;
            o0oooo1 = oooO00o.f43472OooO0Oo;
            ResultKt.throwOnFailure(obj);
            function2 = o0oooo1.f43471OooO0oO;
            if (function2 == null) {
                return Unit.INSTANCE;
            }
            oooO00o.f43472OooO0Oo = null;
            oooO00o.f43474OooO0o0 = null;
            oooO00o.f43476OooO0oo = 3;
            if (function2.invoke(apiResult, oooO00o) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i2 == 2) {
            apiResult = oooO00o.f43474OooO0o0;
            o0oooo1 = oooO00o.f43472OooO0Oo;
            ResultKt.throwOnFailure(obj);
            if (!o0oooo1.f43469OooO0o) {
                ApiError error3 = apiResult.getError();
                Intrinsics.checkNotNullParameter(error3, "error");
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new Oooo000(error3, null), 3, null);
            }
            function2 = o0oooo1.f43471OooO0oO;
            if (function2 == null) {
                return Unit.INSTANCE;
            }
            oooO00o.f43472OooO0Oo = null;
            oooO00o.f43474OooO0o0 = null;
            oooO00o.f43476OooO0oo = 3;
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
