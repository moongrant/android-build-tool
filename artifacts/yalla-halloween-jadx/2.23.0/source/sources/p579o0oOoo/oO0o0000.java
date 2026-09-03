package p579o0oOoo;

import android.os.Looper;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.code.android.util.o0OoOo0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.data.repository.MomentSendRepo;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.moment.MomentSendContentModel;
import com.yalla.yalla.model.moment.MomentSendModel;
import com.yalla.yalla.model.moment.MomentSendResultModel;
import com.yalla.yalla.model.moment.MomentSendState;
import com.zego.zegoavkit2.ZegoConstants;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p375o0OOoOO.o00000O0;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes5.dex */
@DebugMetadata(c = "com.yalla.yalla.util.MomentSendShareForwardUtil$putShareForward$1", f = "MomentSendShareForwardUtil.kt", i = {}, l = {32, 39}, m = "invokeSuspend", n = {}, s = {})
public final class oO0o0000 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f56627OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Function1<MomentSendModel, Unit> f56628OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentSendModel f56629OooO0o0;

    @DebugMetadata(c = "com.yalla.yalla.util.MomentSendShareForwardUtil$putShareForward$1$1", f = "MomentSendShareForwardUtil.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ ApiResult<MomentSendResultModel> f56630OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentSendModel f56631OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function1<MomentSendModel, Unit> f56632OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(ApiResult<MomentSendResultModel> apiResult, Function1<? super MomentSendModel, Unit> function1, MomentSendModel momentSendModel, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f56630OooO0Oo = apiResult;
            this.f56632OooO0o0 = function1;
            this.f56631OooO0o = momentSendModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f56630OooO0Oo, this.f56632OooO0o0, this.f56631OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            ApiResult<MomentSendResultModel> apiResult = this.f56630OooO0Oo;
            boolean zIsSuccess = apiResult.isSuccess();
            Function1<MomentSendModel, Unit> function1 = this.f56632OooO0o0;
            MomentSendModel momentSendModel = this.f56631OooO0o;
            if (zIsSuccess) {
                o0OO000.OooO00o("103012");
                MomentSendResultModel data = apiResult.getData();
                if (data != null) {
                    if (data.getJoinedCircle()) {
                        String strOooO0OO = o0000.OooO0OO(oO00OOo0.post_send_and_follow_topic);
                        String[] strArr = new String[1];
                        MomentSendContentModel content = momentSendModel.getContent();
                        strArr[0] = content != null ? content.getCircleName() : null;
                        String strOooO00o = o0000O.OooO00o(strOooO0OO, strArr);
                        if (!StringsKt.isBlank(strOooO00o)) {
                            o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO00o, "runnable");
                            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                o000oo0OooO00o.run();
                            } else {
                                o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                            }
                        }
                    }
                    String dyid = data.getDyid();
                    if (dyid != null) {
                        momentSendModel.setPostId(o0OoOo0.OooO(0L, dyid));
                    }
                }
                if (function1 != null) {
                    function1.invoke(momentSendModel);
                }
            } else {
                momentSendModel.setSendPostState(MomentSendState.FailedContent);
                int code = apiResult.getError().getCode();
                if (code == 2095) {
                    o000O00O.OooO00o(oO00OOo0.This_content_was_not_approved);
                    LiveEventBus.get("MOMENT_BY_SYSTEM_REMOVE").post(Boxing.boxLong(momentSendModel.getPostId()));
                } else if (code == 4000) {
                    o000O00O.OooO00o(oO00OOo0.moment_delete_by_user);
                    LiveEventBus.get("MOMENT_BY_SYSTEM_REMOVE").post(Boxing.boxLong(momentSendModel.getPostId()));
                } else if (code != 4004) {
                    ApiError error = apiResult.getError();
                    Intrinsics.checkNotNullParameter(error, "error");
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o00000O0(error, null), 3, null);
                } else {
                    momentSendModel.setSendPostState(MomentSendState.FailedSendFrequently);
                }
                if (function1 != null) {
                    function1.invoke(null);
                }
            }
            OooOOO0.OooO0O0("putShareForward : \teditState=" + momentSendModel.getEditState() + " \tdyId=" + momentSendModel.getPostId() + " \teditId=" + momentSendModel.getEditId() + ZegoConstants.ZegoVideoDataAuxPublishingStream);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public oO0o0000(MomentSendModel momentSendModel, Function1<? super MomentSendModel, Unit> function1, Continuation<? super oO0o0000> continuation) {
        super(2, continuation);
        this.f56629OooO0o0 = momentSendModel;
        this.f56628OooO0o = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new oO0o0000(this.f56629OooO0o0, this.f56628OooO0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((oO0o0000) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f56627OooO0Oo;
        MomentSendModel momentSendModel = this.f56629OooO0o0;
        if (i != 0) {
            if (i == 1) {
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
        this.f56627OooO0Oo = 1;
        obj = MomentSendRepo.OooO00o(momentSendModel, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        ApiResult apiResult = (ApiResult) obj;
        boolean zIsSuccess = apiResult.isSuccess();
        MomentSendResultModel momentSendResultModel = (MomentSendResultModel) apiResult.getData();
        String dyid = momentSendResultModel != null ? momentSendResultModel.getDyid() : null;
        MomentSendResultModel momentSendResultModel2 = (MomentSendResultModel) apiResult.getData();
        OooOOO0.OooO0O0("putShareForward : \tisSuccess=" + zIsSuccess + "\tdyid=" + dyid + "\tisJoinedCircle=" + (momentSendResultModel2 != null ? Boxing.boxBoolean(momentSendResultModel2.getJoinedCircle()) : null));
        MainCoroutineDispatcher main = Dispatchers.getMain();
        OooO00o oooO00o = new OooO00o(apiResult, this.f56628OooO0o, momentSendModel, null);
        this.f56627OooO0Oo = 2;
        if (BuildersKt.withContext(main, oooO00o, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
