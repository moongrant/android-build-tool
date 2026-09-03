package com.yalla.yalla.ui.vm.message;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import androidx.lifecycle.ViewModelKt;
import com.code.android.util.o00oO0o;
import com.facebook.share.internal.ShareConstants;
import com.qiniu.android.collect.ReportItem;
import com.yalla.yalla.data.db.table.YallaTeamMessage;
import com.yalla.yalla.model.FeedbackModel;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p376o0OOoOOO.o00;
import p376o0OOoOOO.o00O0000;
import p394o0Oo00oO.o0O0O00;
import p403o0Oo0OOo.oO0oO000;
import p406o0Oo0Ooo.r0;
import p464o0Oooo.o000000O;
import p472o0Ooooo0.oO0000o0;
import p581o0oOoo00.o000OOo;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0006\u0010\u0003\u001a\u00020\u0002J\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004J\"\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005J\u0006\u0010\u000f\u001a\u00020\u0002J\"\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f0\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0005R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/yalla/yalla/ui/vm/message/YallaTeamVM;", "Lo0Oo00oO/o0O0O00;", "", "clearMessage", "Lo00Oo000/OooO0o;", "", "Lcom/yalla/yalla/data/db/table/YallaTeamMessage;", "getYallaTeamMessage", "", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "typeId", "Landroidx/lifecycle/LiveData;", "Lcom/yalla/yalla/model/http/ApiResult;", "Lcom/yalla/yalla/model/FeedbackModel;", "sendFeedback", "updateAllMessageStateRead", "", "messageId", "score", "submitCustomerSatisfaction", "messageCount", "Landroidx/lifecycle/LiveData;", "getMessageCount", "()Landroidx/lifecycle/LiveData;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class YallaTeamVM extends o0O0O00 {
    public static final int $stable = 8;

    @NotNull
    private final LiveData<Integer> messageCount;

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
            oO0oO000 oo0oo000Oooo0 = o000OOo.OooO00o().Oooo0();
            o000000O o000000o2 = o000000O.f46674OooO00o;
            oo0oo000Oooo0.OooO0Oo(((Number) androidx.compose.ui.graphics.colorspace.OooO0OO.OooO0O0()).longValue());
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
            oO0oO000 oo0oo000Oooo0 = o000OOo.OooO00o().Oooo0();
            o000000O o000000o2 = o000000O.f46674OooO00o;
            oo0oo000Oooo0.OooO0o0(((Number) androidx.compose.ui.graphics.colorspace.OooO0OO.OooO0O0()).longValue());
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<androidx.paging.o0O0O00<Integer, YallaTeamMessage>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f32009OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final androidx.paging.o0O0O00<Integer, YallaTeamMessage> invoke() {
            oO0oO000 oo0oo000Oooo0 = o000OOo.OooO00o().Oooo0();
            o000000O o000000o2 = o000000O.f46674OooO00o;
            return oo0oo000Oooo0.OooO0oo(((Number) androidx.compose.ui.graphics.colorspace.OooO0OO.OooO0O0()).longValue());
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.YallaTeamVM$sendFeedback$1", f = "YallaTeamVM.kt", i = {0, 1, 1, 1}, l = {34, 44, 53}, m = "invokeSuspend", n = {"$this$liveDataAsync", "$this$liveDataAsync", ReportItem.QualityKeyResult, "feedbackMessage"}, s = {"L$0", "L$0", "L$1", "L$2"})
    @SourceDebugExtension({"SMAP\nYallaTeamVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 YallaTeamVM.kt\ncom/yalla/yalla/ui/vm/message/YallaTeamVM$sendFeedback$1\n+ 2 ApiCall.kt\ncom/yalla/yalla/http/ApiCallKt\n+ 3 JsonUtil.kt\ncom/code/android/json/JsonUtil\n*L\n1#1,65:1\n18#2,7:66\n25#2,10:74\n109#3:73\n*S KotlinDebug\n*F\n+ 1 YallaTeamVM.kt\ncom/yalla/yalla/ui/vm/message/YallaTeamVM$sendFeedback$1\n*L\n34#1:66,7\n34#1:74,10\n34#1:73\n*E\n"})
    public static final class OooO0OO extends SuspendLambda implements Function2<LiveDataScope<ApiResult<FeedbackModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f32010OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public ApiResult f32011OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f32012OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public YallaTeamMessage f32013OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public /* synthetic */ Object f32014OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ String f32015OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(int i, String str, Continuation continuation) {
            super(2, continuation);
            this.f32015OooO0oo = str;
            this.f32010OooO = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0OO oooO0OO = new OooO0OO(this.f32010OooO, this.f32015OooO0oo, continuation);
            oooO0OO.f32014OooO0oO = obj;
            return oooO0OO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<FeedbackModel>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:48:0x010c  */
        /* JADX WARN: Code duplicated, block: B:50:0x0157 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:51:0x0158  */
        /* JADX WARN: Code duplicated, block: B:53:0x019a  */
        /* JADX WARN: Code duplicated, block: B:56:0x01aa A[RETURN] */
        /* JADX WARN: Type inference failed for: r5v1 */
        /* JADX WARN: Type inference failed for: r5v3, types: [com.yalla.yalla.data.db.table.YallaTeamMessage, com.yalla.yalla.model.http.ApiResult, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v7 */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objOooO0OO;
            LiveDataScope liveDataScope;
            Object objOooO0OO2;
            IOException iOException;
            LiveDataScope liveDataScope2;
            ApiResult apiResult;
            ?? r5;
            YallaTeamMessage message;
            Long l;
            int i;
            ApiResult apiResult2;
            YallaTeamMessage yallaTeamMessage;
            LiveDataScope liveDataScope3;
            LiveDataScope liveDataScope4;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f32012OooO0o;
            oO0000o0 oo0000o0 = oO0000o0.f47205OooO00o;
            String str = this.f32015OooO0oo;
            boolean z = true;
            try {
                try {
                    if (i2 != 0) {
                        if (i2 == 1) {
                            liveDataScope4 = (LiveDataScope) this.f32014OooO0oO;
                            ResultKt.throwOnFailure(obj);
                            objOooO0OO = obj;
                        } else if (i2 == 2) {
                            yallaTeamMessage = this.f32013OooO0o0;
                            ApiResult apiResult3 = this.f32011OooO0Oo;
                            LiveDataScope liveDataScope5 = (LiveDataScope) this.f32014OooO0oO;
                            ResultKt.throwOnFailure(obj);
                            liveDataScope3 = liveDataScope5;
                            z = true;
                            i = 2;
                            apiResult2 = apiResult3;
                            l = null;
                            YallaTeamMessage message2 = new YallaTeamMessage();
                            o000000O o000000o2 = o000000O.f46674OooO00o;
                            message2.setUid(((Number) androidx.compose.ui.graphics.colorspace.OooO0OO.OooO0O0()).longValue());
                            message2.setTime(yallaTeamMessage.getTime() + 1);
                            message2.setRead(z);
                            message2.setMid(oo0000o0.OooO00o(l));
                            message2.setType(i);
                            Intrinsics.checkNotNullParameter(message2, "message");
                            o000OOo.OooO00o().Oooo0().OooO0oO(message2);
                            apiResult = apiResult2;
                            liveDataScope2 = liveDataScope3;
                            r5 = l;
                            this.f32014OooO0oO = r5;
                            this.f32011OooO0Oo = r5;
                            this.f32013OooO0o0 = r5;
                            this.f32012OooO0o = 3;
                            if (liveDataScope2.emit(apiResult, this) == coroutine_suspended) {
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
                    ResultKt.throwOnFailure(obj);
                    liveDataScope4 = (LiveDataScope) this.f32014OooO0oO;
                    int i3 = this.f32010OooO;
                    try {
                        r0 r0Var = r0.f45135OooO00o;
                        this.f32014OooO0oO = liveDataScope4;
                        this.f32012OooO0o = 1;
                        objOooO0OO = r0Var.OooO00o(i3, str, this);
                        if (objOooO0OO == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (IOException e) {
                        iOException = e;
                        liveDataScope = liveDataScope4;
                        String strOooO0oo = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00.OooO00o("WebAPIException", "time out ", iOException, 1, "time out", null, 4, null));
                        objOooO0OO2 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo != null ? strOooO0oo : "");
                        Intrinsics.checkNotNull(objOooO0OO2);
                        Object obj2 = objOooO0OO2;
                        liveDataScope2 = liveDataScope;
                        objOooO0OO = obj2;
                    }
                } catch (IOException e2) {
                    iOException = e2;
                    liveDataScope = liveDataScope4;
                }
            } catch (CancellationException e3) {
                liveDataScope = liveDataScope4;
                z = true;
                String strOooO0oo2 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00O0000.OooO00o("WebAPIException", "canceled ", e3, 3, "canceled", null, 4, null));
                objOooO0OO2 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo2 != null ? strOooO0oo2 : "");
                Intrinsics.checkNotNull(objOooO0OO2);
                Object obj3 = objOooO0OO2;
                liveDataScope2 = liveDataScope;
                objOooO0OO = obj3;
                apiResult = (ApiResult) objOooO0OO;
                if (apiResult.isSuccess()) {
                    message = new YallaTeamMessage();
                    o000000O o000000o3 = o000000O.f46674OooO00o;
                    message.setUid(((Number) androidx.compose.ui.graphics.colorspace.OooO0OO.OooO0O0()).longValue());
                    message.setMessage(str);
                    message.setTime(System.currentTimeMillis());
                    message.setRead(z);
                    l = null;
                    message.setMid(oo0000o0.OooO00o(null));
                    message.setType(z ? 1 : 0);
                    Intrinsics.checkNotNullParameter(message, "message");
                    o000OOo.OooO00o().Oooo0().OooO0oO(message);
                    this.f32014OooO0oO = liveDataScope2;
                    this.f32011OooO0Oo = apiResult;
                    this.f32013OooO0o0 = message;
                    i = 2;
                    this.f32012OooO0o = 2;
                    if (DelayKt.delay(300L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    LiveDataScope liveDataScope6 = liveDataScope2;
                    apiResult2 = apiResult;
                    yallaTeamMessage = message;
                    liveDataScope3 = liveDataScope6;
                } else {
                    r5 = 0;
                }
                this.f32014OooO0oO = r5;
                this.f32011OooO0Oo = r5;
                this.f32013OooO0o0 = r5;
                this.f32012OooO0o = 3;
                if (liveDataScope2.emit(apiResult, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            } catch (Exception e4) {
                OooOOO0.OooO0o0("WebAPIException", e4.getMessage(), e4);
                String message3 = e4.getMessage();
                String name = message3 == null ? e4.getClass().getName() : message3;
                Intrinsics.checkNotNullExpressionValue(name, "e.message ?: e.javaClass.name");
                String strOooO0oo3 = com.code.android.json.OooO00o.OooO00o().OooO0oo(new ApiError(2, name, null, 4, null));
                objOooO0OO = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo3 != null ? strOooO0oo3 : "");
                Intrinsics.checkNotNull(objOooO0OO);
            }
            liveDataScope2 = liveDataScope4;
            z = true;
            apiResult = (ApiResult) objOooO0OO;
            if (apiResult.isSuccess()) {
                message = new YallaTeamMessage();
                o000000O o000000o4 = o000000O.f46674OooO00o;
                message.setUid(((Number) androidx.compose.ui.graphics.colorspace.OooO0OO.OooO0O0()).longValue());
                message.setMessage(str);
                message.setTime(System.currentTimeMillis());
                message.setRead(z);
                l = null;
                message.setMid(oo0000o0.OooO00o(null));
                message.setType(z ? 1 : 0);
                Intrinsics.checkNotNullParameter(message, "message");
                o000OOo.OooO00o().Oooo0().OooO0oO(message);
                this.f32014OooO0oO = liveDataScope2;
                this.f32011OooO0Oo = apiResult;
                this.f32013OooO0o0 = message;
                i = 2;
                this.f32012OooO0o = 2;
                if (DelayKt.delay(300L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                LiveDataScope liveDataScope7 = liveDataScope2;
                apiResult2 = apiResult;
                yallaTeamMessage = message;
                liveDataScope3 = liveDataScope7;
                YallaTeamMessage message4 = new YallaTeamMessage();
                o000000O o000000o5 = o000000O.f46674OooO00o;
                message4.setUid(((Number) androidx.compose.ui.graphics.colorspace.OooO0OO.OooO0O0()).longValue());
                message4.setTime(yallaTeamMessage.getTime() + 1);
                message4.setRead(z);
                message4.setMid(oo0000o0.OooO00o(l));
                message4.setType(i);
                Intrinsics.checkNotNullParameter(message4, "message");
                o000OOo.OooO00o().Oooo0().OooO0oO(message4);
                apiResult = apiResult2;
                liveDataScope2 = liveDataScope3;
                r5 = l;
            } else {
                r5 = 0;
            }
            this.f32014OooO0oO = r5;
            this.f32011OooO0Oo = r5;
            this.f32013OooO0o0 = r5;
            this.f32012OooO0o = 3;
            if (liveDataScope2.emit(apiResult, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.YallaTeamVM$submitCustomerSatisfaction$1", f = "YallaTeamVM.kt", i = {}, l = {63, 63}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0o extends SuspendLambda implements Function2<LiveDataScope<ApiResult<String>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f32016OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f32017OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f32018OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f32019OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(long j, int i, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f32017OooO0o = j;
            this.f32019OooO0oO = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0o oooO0o = new OooO0o(this.f32017OooO0o, this.f32019OooO0oO, continuation);
            oooO0o.f32018OooO0o0 = obj;
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
            int i = this.f32016OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f32018OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f32018OooO0o0;
            r0 r0Var = r0.f45135OooO00o;
            this.f32018OooO0o0 = liveDataScope;
            this.f32016OooO0Oo = 1;
            obj = r0Var.OooO0O0(this.f32017OooO0o, this.f32019OooO0oO, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f32018OooO0o0 = null;
            this.f32016OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public YallaTeamVM() {
        oO0oO000 oo0oo000Oooo0 = o000OOo.OooO00o().Oooo0();
        o000000O o000000o2 = o000000O.f46674OooO00o;
        this.messageCount = FlowLiveDataConversions.asLiveData$default(FlowKt.debounce(oo0oo000Oooo0.OooO0O0(((Number) androidx.compose.ui.graphics.colorspace.OooO0OO.OooO0O0()).longValue()), 300L), ViewModelKt.getViewModelScope(this).getCoroutineContext(), 0L, 2, (Object) null);
    }

    public final void clearMessage() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new OooO00o(null), 2, null);
    }

    @NotNull
    public final LiveData<Integer> getMessageCount() {
        return this.messageCount;
    }

    @NotNull
    public final p143o00Oo000.OooO0o<Integer, YallaTeamMessage> getYallaTeamMessage() {
        return new p143o00Oo000.OooO0o<>(ViewModelKt.getViewModelScope(this), OooO0O0.f32009OooO0Oo);
    }

    @NotNull
    public final LiveData<ApiResult<FeedbackModel>> sendFeedback(@NotNull String message, int typeId) {
        Intrinsics.checkNotNullParameter(message, "message");
        return o00oO0o.OooO00o(new OooO0OO(typeId, message, null));
    }

    @NotNull
    public final LiveData<ApiResult<String>> submitCustomerSatisfaction(long messageId, int score) {
        return o00oO0o.OooO00o(new OooO0o(messageId, score, null));
    }

    public final void updateAllMessageStateRead() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new OooO(null), 2, null);
    }
}
