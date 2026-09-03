package com.yalla.yalla.ui.vm.message;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import androidx.lifecycle.ViewModelKt;
import com.facebook.share.internal.ShareConstants;
import com.qiniu.android.collect.ReportItem;
import com.yalla.yalla.common.db.table.YallaTeamMessage;
import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.FeedbackModel;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p089o000o000.o00O00o0;
import p254o00ooO0O.o0000O0O;
import p464o0Ooo0oO.o0000O;
import p498o0o00Oo0.OooOOO;
import p515o0o0O00.o00O00;
import p516o0o0O000.o0OOO0o;
import p520o0o0O0O0.o0O00o0;
import p527o0o0OO0.o0OoOo0;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0006\u0010\u0003\u001a\u00020\u0002J\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004J\"\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005J\u0006\u0010\u000f\u001a\u00020\u0002J\"\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f0\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0005R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/yalla/yalla/ui/vm/message/YallaTeamVM;", "Lo00OO/OooO00o;", "", "clearMessage", "Lo0Ooo0oO/o0000O;", "", "Lcom/yalla/yalla/common/db/table/YallaTeamMessage;", "getYallaTeamMessage", "", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "typeId", "Landroidx/lifecycle/LiveData;", "Lcom/yalla/yalla/common/model/ApiResult;", "Lcom/yalla/yalla/model/FeedbackModel;", "sendFeedback", "updateAllMessageStateRead", "", "messageId", "score", "submitCustomerSatisfaction", "messageCount", "Landroidx/lifecycle/LiveData;", "getMessageCount", "()Landroidx/lifecycle/LiveData;", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class YallaTeamVM extends o00OO.OooO00o {
    public static final int $stable = 8;

    @NotNull
    private final LiveData<Integer> messageCount = FlowLiveDataConversions.asLiveData$default(FlowKt.debounce(p491o0o00O00.OooO0OO.OooO00o().Oooo0OO().OooO0Oo(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(OooOOO.f41216OooO00o)).longValue()), 300), ViewModelKt.getViewModelScope(this).getCoroutineContext(), 0, 2, (Object) null);

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.YallaTeamVM$updateAllMessageStateRead$1", f = "YallaTeamVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public OooO(Continuation<? super OooO> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new OooO(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            p491o0o00O00.OooO0OO.OooO00o().Oooo0OO().OooO0O0(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(OooOOO.f41216OooO00o)).longValue());
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.YallaTeamVM$clearMessage$1", f = "YallaTeamVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new OooO00o(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            p491o0o00O00.OooO0OO.OooO00o().Oooo0OO().OooO0OO(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(OooOOO.f41216OooO00o)).longValue());
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<o00O00o0<Integer, YallaTeamMessage>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0O0 f25682Oooo0o = new OooO0O0();

        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o00O00o0<Integer, YallaTeamMessage> invoke() {
            return p491o0o00O00.OooO0OO.OooO00o().Oooo0OO().OooO0oo(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(OooOOO.f41216OooO00o)).longValue());
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.YallaTeamVM$sendFeedback$1", f = "YallaTeamVM.kt", i = {0, 1, 1, 1}, l = {34, 44, 53}, m = "invokeSuspend", n = {"$this$liveDataAsync", "$this$liveDataAsync", ReportItem.QualityKeyResult, "feedbackMessage"}, s = {"L$0", "L$0", "L$1", "L$2"})
    public static final class OooO0OO extends SuspendLambda implements Function2<LiveDataScope<ApiResult<FeedbackModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public /* synthetic */ Object f25683Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public ApiResult f25684Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public YallaTeamMessage f25685Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f25686Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ int f25687OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ String f25688OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(String str, int i, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f25688OoooO00 = str;
            this.f25687OoooO0 = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0OO oooO0OO = new OooO0OO(this.f25688OoooO00, this.f25687OoooO0, continuation);
            oooO0OO.f25683Oooo = obj;
            return oooO0OO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<FeedbackModel>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:46:0x017c A[RETURN] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [int] */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v11 */
        /* JADX WARN: Type inference failed for: r2v15 */
        /* JADX WARN: Type inference failed for: r2v16 */
        /* JADX WARN: Type inference failed for: r2v2 */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r2v4 */
        /* JADX WARN: Type inference failed for: r3v12 */
        /* JADX WARN: Type inference failed for: r3v13 */
        /* JADX WARN: Type inference failed for: r3v14 */
        /* JADX WARN: Type inference failed for: r3v15 */
        /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v8, types: [androidx.lifecycle.LiveDataScope] */
        /* JADX WARN: Type inference failed for: r3v9 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ?? r3;
            ApiResult apiResult;
            YallaTeamMessage message;
            ?? r4;
            ?? r5;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ?? r2 = this.f25686Oooo0oo;
            String str = "";
            try {
                if (r2 != 0) {
                    if (r2 == 1) {
                        LiveDataScope liveDataScope = (LiveDataScope) this.f25683Oooo;
                        ResultKt.throwOnFailure(obj);
                        r2 = liveDataScope;
                    } else if (r2 == 2) {
                        message = this.f25685Oooo0oO;
                        apiResult = this.f25684Oooo0o;
                        LiveDataScope liveDataScope2 = (LiveDataScope) this.f25683Oooo;
                        ResultKt.throwOnFailure(obj);
                        r5 = liveDataScope2;
                        r5 = r3;
                        YallaTeamMessage message2 = new YallaTeamMessage();
                        message2.setUid(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(OooOOO.f41216OooO00o)).longValue());
                        message2.setTime(message.getTime() + 1);
                        message2.setRead(true);
                        message2.setMid(o0OoOo0.f43133OooO00o.OooO00o(null));
                        message2.setType(2);
                        Intrinsics.checkNotNullParameter(message2, "message");
                        p491o0o00O00.OooO0OO.OooO00o().Oooo0OO().OooO0o(message2);
                        r4 = r5;
                        this.f25683Oooo = null;
                        this.f25684Oooo0o = null;
                        this.f25685Oooo0oO = null;
                        this.f25686Oooo0oo = 3;
                        if (r4.emit(apiResult, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (r2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                LiveDataScope liveDataScope3 = (LiveDataScope) this.f25683Oooo;
                String str2 = this.f25688OoooO00;
                int i = this.f25687OoooO0;
                o0O00o0 o0o00o1 = o0O00o0.f42793OooO00o;
                this.f25683Oooo = liveDataScope3;
                this.f25686Oooo0oo = 1;
                obj = o0o00o1.OooO00o(str2, i, this);
                r2 = liveDataScope3;
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (IOException e) {
                ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
                o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
                String strOooO0oo = o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
                if (strOooO0oo != null) {
                    Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                    str = strOooO0oo;
                }
                obj = o0OOO0o.OooO0O0(str, ApiResult.class);
                Intrinsics.checkNotNull(obj);
            } catch (CancellationException unused) {
                ApiError apiError = new ApiError(3, "canceled");
                o0OOO0o o0ooo0o3 = o0OOO0o.f42120OooO00o;
                String strOooO0oo2 = o0OOO0o.OooO00o().OooO0oo(apiError);
                if (strOooO0oo2 != null) {
                    Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                    str = strOooO0oo2;
                }
                obj = o0OOO0o.OooO0O0(str, ApiResult.class);
                Intrinsics.checkNotNull(obj);
            } catch (Exception e2) {
                o00O00.OooO0o0("WebAPIException", e2.getMessage());
                e2.printStackTrace();
                String message3 = e2.getMessage();
                if (message3 == null) {
                    message3 = e2.getClass().getName();
                }
                Intrinsics.checkNotNullExpressionValue(message3, "e.message ?: e.javaClass.name");
                ApiError apiError2 = new ApiError(2, message3);
                o0OOO0o o0ooo0o4 = o0OOO0o.f42120OooO00o;
                String strOooO0oo3 = o0OOO0o.OooO00o().OooO0oo(apiError2);
                if (strOooO0oo3 != null) {
                    Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                    str = strOooO0oo3;
                }
                obj = o0OOO0o.OooO0O0(str, ApiResult.class);
                Intrinsics.checkNotNull(obj);
            }
            r3 = r2;
            apiResult = (ApiResult) obj;
            r4 = r3;
            if (apiResult.isSuccess()) {
                message = new YallaTeamMessage();
                message.setUid(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(OooOOO.f41216OooO00o)).longValue());
                message.setMessage(this.f25688OoooO00);
                message.setTime(System.currentTimeMillis());
                message.setRead(true);
                message.setMid(o0OoOo0.f43133OooO00o.OooO00o(null));
                message.setType(1);
                Intrinsics.checkNotNullParameter(message, "message");
                p491o0o00O00.OooO0OO.OooO00o().Oooo0OO().OooO0o(message);
                this.f25683Oooo = r3;
                this.f25684Oooo0o = apiResult;
                this.f25685Oooo0oO = message;
                this.f25686Oooo0oo = 2;
                if (DelayKt.delay(300L, this) == coroutine_suspended) {
                    r5 = r3;
                    return coroutine_suspended;
                }
                r5 = r3;
                YallaTeamMessage message4 = new YallaTeamMessage();
                message4.setUid(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(OooOOO.f41216OooO00o)).longValue());
                message4.setTime(message.getTime() + 1);
                message4.setRead(true);
                message4.setMid(o0OoOo0.f43133OooO00o.OooO00o(null));
                message4.setType(2);
                Intrinsics.checkNotNullParameter(message4, "message");
                p491o0o00O00.OooO0OO.OooO00o().Oooo0OO().OooO0o(message4);
                r4 = r5;
            }
            this.f25683Oooo = null;
            this.f25684Oooo0o = null;
            this.f25685Oooo0oO = null;
            this.f25686Oooo0oo = 3;
            if (r4.emit(apiResult, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.YallaTeamVM$submitCustomerSatisfaction$1", f = "YallaTeamVM.kt", i = {}, l = {63, 63}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0o extends SuspendLambda implements Function2<LiveDataScope<ApiResult<String>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ int f25689Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f25690Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f25691Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ long f25692Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(long j, int i, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f25692Oooo0oo = j;
            this.f25689Oooo = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0o oooO0o = new OooO0o(this.f25692Oooo0oo, this.f25689Oooo, continuation);
            oooO0o.f25691Oooo0oO = obj;
            return oooO0o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<String>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO0o) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25690Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25691Oooo0oO;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            liveDataScope = (LiveDataScope) this.f25691Oooo0oO;
            o0O00o0 o0o00o1 = o0O00o0.f42793OooO00o;
            long j = this.f25692Oooo0oo;
            int i2 = this.f25689Oooo;
            this.f25691Oooo0oO = liveDataScope;
            this.f25690Oooo0o = 1;
            obj = o0o00o1.OooO0O0(j, i2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f25691Oooo0oO = null;
            this.f25690Oooo0o = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public final void clearMessage() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new OooO00o(null), 2, null);
    }

    @NotNull
    public final LiveData<Integer> getMessageCount() {
        return this.messageCount;
    }

    @NotNull
    public final o0000O<Integer, YallaTeamMessage> getYallaTeamMessage() {
        return new o0000O<>(ViewModelKt.getViewModelScope(this), OooO0O0.f25682Oooo0o);
    }

    @NotNull
    public final LiveData<ApiResult<FeedbackModel>> sendFeedback(@NotNull String message, int typeId) {
        Intrinsics.checkNotNullParameter(message, "message");
        return o0000O0O.OooO00o(new OooO0OO(message, typeId, null));
    }

    @NotNull
    public final LiveData<ApiResult<String>> submitCustomerSatisfaction(long messageId, int score) {
        return o0000O0O.OooO00o(new OooO0o(messageId, score, null));
    }

    public final void updateAllMessageStateRead() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new OooO(null), 2, null);
    }
}
