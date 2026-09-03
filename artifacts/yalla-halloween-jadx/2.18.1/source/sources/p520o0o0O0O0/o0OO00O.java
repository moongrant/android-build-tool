package p520o0o0O0O0;

import com.app.base.protobuf.MessageIM;
import com.google.protobuf.InvalidProtocolBufferException;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.manager.error.CommonError;
import com.yalla.yalla.common.manager.error.CommonErrorHandler;
import com.yalla.yalla.common.model.ApiError1005;
import com.yalla.yalla.common.model.ImResult;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153o00Oo0oO.o0ooOOo;
import p189o00o00oO.oo0o0Oo;
import p254o00ooO0O.o000O0O0;
import p498o0o00Oo0.OooOOO;
import p515o0o0O00.o00O00;
import p516o0o0O000.o0Oo0oo;
import p531o0o0OOO0.o00O000;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.yalla.yalla.data.repository.ImMessageRepo$queryAccountStatus$1", f = "ImMessageRepo.kt", i = {}, l = {688}, m = "invokeSuspend", n = {}, s = {})
public final class o0OO00O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f42809Oooo0o;

    public o0OO00O(Continuation<? super o0OO00O> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0OO00O(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return new o0OO00O(continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws InvalidProtocolBufferException, BadPaddingException, IllegalBlockSizeException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f42809Oooo0o;
        long jLongValue = 0;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            OooOOO oooOOO = OooOOO.f41216OooO00o;
            Long value = oooOOO.OooOo().getValue();
            if (value == null) {
                value = Boxing.boxLong(0L);
            }
            long jLongValue2 = value.longValue();
            Integer value2 = oooOOO.OooOOO().getValue();
            if (value2 == null) {
                value2 = Boxing.boxInt(0);
            }
            int iIntValue = value2.intValue();
            this.f42809Oooo0o = 1;
            MessageIM.BanStatusIn.Builder mRequestBuilder = MessageIM.BanStatusIn.newBuilder();
            mRequestBuilder.setUserId(jLongValue2);
            mRequestBuilder.setRegion(iIntValue);
            o00O000 o00o001 = o00O000.f43398OooO00o;
            o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
            String str = o0ooOOo.f32234OooOOo0;
            Intrinsics.checkNotNullExpressionValue(mRequestBuilder, "mRequestBuilder");
            obj = o00o001.OooO0O0(str, mRequestBuilder, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        ImResult imResult = (ImResult) obj;
        if (imResult.getBody() == null) {
            oo0o0Oo.OooO0O0(CommonError.Account_Suspension, null, 2, null, CommonErrorHandler.INSTANCE);
        } else {
            MessageIM.BanStatusOut from = MessageIM.BanStatusOut.parseFrom(imResult.getBody());
            if (from.getStatus() == 1) {
                ApiError1005 apiError1005 = new ApiError1005();
                apiError1005.setData(new ApiError1005.ApiError1005Data());
                ApiError1005.ApiError1005Data data = apiError1005.getData();
                if (data != null) {
                    data.setBlockingMsg(o000O0O0.OooO0OO(R.string.account_closure));
                }
                ApiError1005.ApiError1005Data data2 = apiError1005.getData();
                if (data2 != null) {
                    data2.setEndTime(String.valueOf(from.getExpire()));
                }
                ApiError1005.ApiError1005Data data3 = apiError1005.getData();
                if (data3 != null) {
                    data3.setPrettyId(from.getPrettyId());
                }
                ApiError1005.ApiError1005Data data4 = apiError1005.getData();
                if (data4 != null) {
                    Long value3 = OooOOO.f41216OooO00o.OooOo().getValue();
                    if (value3 != null) {
                        Intrinsics.checkNotNullExpressionValue(value3, "Account.userId.value ?: 0");
                        jLongValue = value3.longValue();
                    }
                    data4.setUserId(jLongValue);
                }
                ApiError1005.ApiError1005Data data5 = apiError1005.getData();
                if (data5 != null) {
                    String reason = from.getReason();
                    Intrinsics.checkNotNullExpressionValue(reason, "mResponse.reason");
                    data5.setReason(reason);
                }
                ApiError1005.ApiError1005Data data6 = apiError1005.getData();
                if (data6 != null) {
                    data6.setInLoginShow(true);
                }
                CommonErrorHandler.INSTANCE.post(new CommonError(CommonError.Account_Suspension, o0Oo0oo.OooO0O0(apiError1005)));
                o00O00.OooO0O0("CommonError.Account_Suspension data = " + apiError1005.getData());
            } else {
                o00O00.OooO0O0("CommonError.Account_Suspension state = 0");
                oo0o0Oo.OooO0O0(CommonError.Account_Suspension, null, 2, null, CommonErrorHandler.INSTANCE);
            }
        }
        return Unit.INSTANCE;
    }
}
