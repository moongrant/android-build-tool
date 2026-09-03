package p538o0o0Oo0;

import android.os.Looper;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooO;
import com.yalla.support.common.util.OooOo;
import com.yalla.yalla.common.model.Error;
import com.yalla.yalla.common.model.Response;
import com.yalla.yalla.common.repository.PostRepo$sendPost$$inlined$call$1;
import com.yalla.yalla.model.MomentSendContentModel;
import com.yalla.yalla.model.MomentSendModel;
import com.yalla.yalla.model.MomentSendResultModel;
import com.yalla.yalla.model.MomentSendState;
import com.yalla.yalla.ui.activity.moment.MomentSendActivity;
import java.util.Objects;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p074o000O0oo.OooOOO;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o0O0ooO;
import p391o0OOooOo.o0O00000;
import p498o0o00Oo0.oo00o;
import p515o0o0O00.o00O00;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.activity.moment.MomentSendActivity$sendPost$1", f = "MomentSendActivity.kt", i = {}, l = {961, 968}, m = "invokeSuspend", n = {}, s = {})
public final class o000OO0O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ Function1<MomentSendModel, Unit> f43931Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f43932Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ MomentSendActivity f43933Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ MomentSendModel f43934Oooo0oo;

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.moment.MomentSendActivity$sendPost$1$1", f = "MomentSendActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Response<MomentSendResultModel> f43935Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Function1<MomentSendModel, Unit> f43936Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ MomentSendModel f43937Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(Response<MomentSendResultModel> response, Function1<? super MomentSendModel, Unit> function1, MomentSendModel momentSendModel, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f43935Oooo0o = response;
            this.f43936Oooo0oO = function1;
            this.f43937Oooo0oo = momentSendModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f43935Oooo0o, this.f43936Oooo0oO, this.f43937Oooo0oo, continuation);
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
            if (this.f43935Oooo0o.getIsSuccess()) {
                o0O00000.OooO0OO("Moemnts_post_post");
                MomentSendResultModel data = this.f43935Oooo0o.getData();
                if (data != null) {
                    MomentSendModel momentSendModel = this.f43937Oooo0oo;
                    if (data.getJoinedCircle()) {
                        String strOooO0OO = o000O0O0.OooO0OO(R.string.post_send_and_follow_topic);
                        String[] strArr = new String[1];
                        MomentSendContentModel content = momentSendModel.getContent();
                        strArr[0] = content != null ? content.getCircleName() : null;
                        String strOooO00o = OooOo.OooO00o(strOooO0OO, strArr);
                        ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
                        if (!StringsKt.isBlank(strOooO00o)) {
                            o0O0ooO o0o0oooOooO0O0 = OooOOO.OooO0O0(toastUtil, strOooO00o, "runnable");
                            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                o0o0oooOooO0O0.run();
                            } else {
                                o00O000 o00o001 = o00O000.f34346OooO00o;
                                o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
                            }
                        }
                    }
                    String dyid = data.getDyid();
                    if (dyid != null) {
                        momentSendModel.setPostId(OooO.OooO0oO(dyid));
                    }
                }
                Function1<MomentSendModel, Unit> function1 = this.f43936Oooo0oO;
                if (function1 != null) {
                    function1.invoke(this.f43937Oooo0oo);
                }
            } else {
                Error error = this.f43935Oooo0o.getError();
                if (error != null) {
                    MomentSendModel momentSendModel2 = this.f43937Oooo0oo;
                    Integer code2 = error.getCode();
                    if (code2 != null && code2.intValue() == 4004) {
                        momentSendModel2.setSendPostState(MomentSendState.FailedSendFrequently);
                    }
                }
                Function1<MomentSendModel, Unit> function2 = this.f43936Oooo0oO;
                if (function2 != null) {
                    function2.invoke(null);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o000OO0O(MomentSendActivity momentSendActivity, MomentSendModel momentSendModel, Function1<? super MomentSendModel, Unit> function1, Continuation<? super o000OO0O> continuation) {
        super(2, continuation);
        this.f43933Oooo0oO = momentSendActivity;
        this.f43934Oooo0oo = momentSendModel;
        this.f43931Oooo = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o000OO0O(this.f43933Oooo0oO, this.f43934Oooo0oo, this.f43931Oooo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o000OO0O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f43932Oooo0o;
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
        oo00o oo00oVar = this.f43933Oooo0oO.f22384oo000o;
        MomentSendModel momentSendModel = this.f43934Oooo0oo;
        this.f43932Oooo0o = 1;
        Objects.requireNonNull(oo00oVar);
        obj = BuildersKt.withContext(Dispatchers.getIO(), new PostRepo$sendPost$$inlined$call$1(oo00oVar, null, momentSendModel), this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        Response response = (Response) obj;
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("sendPost : \tisSuccess=");
        sbOooO0o0.append(response.getIsSuccess());
        sbOooO0o0.append("\tdyid=");
        MomentSendResultModel momentSendResultModel = (MomentSendResultModel) response.getData();
        sbOooO0o0.append(momentSendResultModel != null ? momentSendResultModel.getDyid() : null);
        sbOooO0o0.append("\tisJoinedCircle=");
        MomentSendResultModel momentSendResultModel2 = (MomentSendResultModel) response.getData();
        sbOooO0o0.append(momentSendResultModel2 != null ? Boxing.boxBoolean(momentSendResultModel2.getJoinedCircle()) : null);
        o00O00.OooO0O0(sbOooO0o0.toString());
        MainCoroutineDispatcher main = Dispatchers.getMain();
        OooO00o oooO00o = new OooO00o(response, this.f43931Oooo, this.f43934Oooo0oo, null);
        this.f43932Oooo0o = 2;
        if (BuildersKt.withContext(main, oooO00o, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
