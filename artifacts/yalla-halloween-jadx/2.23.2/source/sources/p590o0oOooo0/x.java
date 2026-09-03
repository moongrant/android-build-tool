package p590o0oOooo0;

import android.os.Looper;
import androidx.activity.OooOo00;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
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
import p381o0OOoOo0.Oooo000;
import p562o0oOo000.o000000;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.util.MomentSendShareForwardUtil$putShareForward$1", f = "MomentSendShareForwardUtil.kt", i = {}, l = {32, 39}, m = "invokeSuspend", n = {}, s = {})
public final class x extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f57300OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Function1<MomentSendModel, Unit> f57301OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentSendModel f57302OooO0o0;

    @DebugMetadata(c = "com.yalla.yalla.util.MomentSendShareForwardUtil$putShareForward$1$1", f = "MomentSendShareForwardUtil.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ ApiResult<MomentSendResultModel> f57303OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentSendModel f57304OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function1<MomentSendModel, Unit> f57305OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(ApiResult<MomentSendResultModel> apiResult, Function1<? super MomentSendModel, Unit> function1, MomentSendModel momentSendModel, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f57303OooO0Oo = apiResult;
            this.f57305OooO0o0 = function1;
            this.f57304OooO0o = momentSendModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f57303OooO0Oo, this.f57305OooO0o0, this.f57304OooO0o, continuation);
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
            ApiResult<MomentSendResultModel> apiResult = this.f57303OooO0Oo;
            boolean zIsSuccess = apiResult.isSuccess();
            Function1<MomentSendModel, Unit> function1 = this.f57305OooO0o0;
            MomentSendModel momentSendModel = this.f57304OooO0o;
            if (zIsSuccess) {
                o0oo0000.OooO00o.OooO0O0("103012");
                MomentSendResultModel data = apiResult.getData();
                if (data != null) {
                    if (data.getJoinedCircle()) {
                        String strOooO0OO = o0000.OooO0OO(o000000.post_send_and_follow_topic);
                        String[] strArr = new String[1];
                        MomentSendContentModel content = momentSendModel.getContent();
                        strArr[0] = content != null ? content.getCircleName() : null;
                        String strOooO00o = o0000O.OooO00o(strOooO0OO, strArr);
                        if (!StringsKt.isBlank(strOooO00o)) {
                            o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(strOooO00o, "runnable");
                            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                o000oo0OooO00o.run();
                            } else {
                                o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
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
                    o000O00.OooO00o(o000000.This_content_was_not_approved);
                    LiveEventBus.get("MOMENT_BY_SYSTEM_REMOVE").post(Boxing.boxLong(momentSendModel.getPostId()));
                } else if (code == 4000) {
                    o000O00.OooO00o(o000000.moment_delete_by_user);
                    LiveEventBus.get("MOMENT_BY_SYSTEM_REMOVE").post(Boxing.boxLong(momentSendModel.getPostId()));
                } else if (code != 4004) {
                    ApiError error = apiResult.getError();
                    Intrinsics.checkNotNullParameter(error, "error");
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new Oooo000(error, null), 3, null);
                } else {
                    momentSendModel.setSendPostState(MomentSendState.FailedSendFrequently);
                }
                if (function1 != null) {
                    function1.invoke(null);
                }
            }
            o0000O00.OooO0O0("putShareForward : \teditState=" + momentSendModel.getEditState() + " \tdyId=" + momentSendModel.getPostId() + " \teditId=" + momentSendModel.getEditId() + ZegoConstants.ZegoVideoDataAuxPublishingStream);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x(MomentSendModel momentSendModel, Function1<? super MomentSendModel, Unit> function1, Continuation<? super x> continuation) {
        super(2, continuation);
        this.f57302OooO0o0 = momentSendModel;
        this.f57301OooO0o = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new x(this.f57302OooO0o0, this.f57301OooO0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((x) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f57300OooO0Oo;
        MomentSendModel momentSendModel = this.f57302OooO0o0;
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
        this.f57300OooO0Oo = 1;
        obj = MomentSendRepo.OooO00o(momentSendModel, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        ApiResult apiResult = (ApiResult) obj;
        boolean zIsSuccess = apiResult.isSuccess();
        MomentSendResultModel momentSendResultModel = (MomentSendResultModel) apiResult.getData();
        String dyid = momentSendResultModel != null ? momentSendResultModel.getDyid() : null;
        MomentSendResultModel momentSendResultModel2 = (MomentSendResultModel) apiResult.getData();
        o0000O00.OooO0O0("putShareForward : \tisSuccess=" + zIsSuccess + "\tdyid=" + dyid + "\tisJoinedCircle=" + (momentSendResultModel2 != null ? Boxing.boxBoolean(momentSendResultModel2.getJoinedCircle()) : null));
        MainCoroutineDispatcher main = Dispatchers.getMain();
        OooO00o oooO00o = new OooO00o(apiResult, this.f57301OooO0o, momentSendModel, null);
        this.f57300OooO0Oo = 2;
        if (BuildersKt.withContext(main, oooO00o, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
