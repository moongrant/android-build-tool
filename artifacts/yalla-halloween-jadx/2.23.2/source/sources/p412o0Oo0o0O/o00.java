package p412o0Oo0o0O;

import com.app.base.protobuf.MessageIM;
import com.code.android.util.o0000;
import com.google.protobuf.InvalidProtocolBufferException;
import com.yalla.yalla.model.ImResult;
import com.yalla.yalla.model.http.ApiError1005;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.unsigned.OooO0OO;
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
import p187o00o00o0.OooO;
import p384o0OOoo0O.Oooo0;
import p435o0OoOOOo.o0O000;
import p435o0OoOOOo.o0O0o;
import p475o0Ooooo0.o0O00oO0;
import p480o0o000O.OooOO0;
import p562o0oOo000.o000000;
import p598o0oo00Oo.o0000O00;
import p641o0ooOO0o.o0OoO00O;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.data.repository.ImMessageRepo$queryAccountStatus$1", f = "ImMessageRepo.kt", i = {}, l = {795}, m = "invokeSuspend", n = {}, s = {})
public final class o00 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f45935OooO0Oo;

    public o00(Continuation<? super o00> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o00(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return new o00(continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws InvalidProtocolBufferException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f45935OooO0Oo;
        long jLongValue = 0;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            Long lBoxLong = (Long) o0O00oO0.OooOOo0().getValue();
            if (lBoxLong == null) {
                lBoxLong = Boxing.boxLong(0L);
            }
            long jLongValue2 = lBoxLong.longValue();
            Integer numBoxInt = (Integer) o0O00oO0.OooOOO0().getValue();
            if (numBoxInt == null) {
                numBoxInt = Boxing.boxInt(0);
            }
            int iIntValue = numBoxInt.intValue();
            this.f45935OooO0Oo = 1;
            MessageIM.BanStatusIn.Builder builderNewBuilder = MessageIM.BanStatusIn.newBuilder();
            builderNewBuilder.setUserId(jLongValue2);
            builderNewBuilder.setRegion(iIntValue);
            o0OoO00O o0ooo00o2 = OooOO0.f48392OooO00o;
            String str = Oooo0.f43349OooOOo0;
            Intrinsics.checkNotNull(builderNewBuilder);
            obj = OooOO0.OooO0O0(str, builderNewBuilder, this);
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
        boolean zIsSuccess = imResult.isSuccess();
        o0O000 o0o001 = o0O000.f47005OooO00o;
        if (zIsSuccess) {
            MessageIM.BanStatusOut from = MessageIM.BanStatusOut.parseFrom(imResult.getBody());
            if (from.getStatus() == 1) {
                ApiError1005 apiError1005 = new ApiError1005();
                apiError1005.setData(new ApiError1005.ApiError1005Data());
                ApiError1005.ApiError1005Data data = apiError1005.getData();
                if (data != null) {
                    data.setBlockingMsg(o0000.OooO0OO(o000000.account_closure));
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
                    o0O00oO0 o0o00oo2 = o0O00oO0.f47936OooO00o;
                    Long l = (Long) o0O00oO0.OooOOo0().getValue();
                    if (l != null) {
                        Intrinsics.checkNotNull(l);
                        jLongValue = l.longValue();
                    }
                    data4.setUserId(jLongValue);
                }
                ApiError1005.ApiError1005Data data5 = apiError1005.getData();
                if (data5 != null) {
                    String reason = from.getReason();
                    Intrinsics.checkNotNullExpressionValue(reason, "getReason(...)");
                    data5.setReason(reason);
                }
                ApiError1005.ApiError1005Data data6 = apiError1005.getData();
                if (data6 != null) {
                    data6.setInLoginShow(true);
                }
                o0o001.OooO0OO(new o0O0o(o0O0o.Account_Suspension, OooO.OooO00o(apiError1005)));
                o0000O00.OooO0O0("CommonError.Account_Suspension data = " + apiError1005.getData());
            } else {
                o0000O00.OooO0O0("CommonError.Account_Suspension state = 0");
                o0o001.OooO0OO(new o0O0o(o0O0o.Account_Suspension, null, 2, null));
            }
        } else {
            OooO0OO.OooO0O0(o0O0o.Account_Suspension, null, 2, null, o0o001);
        }
        return Unit.INSTANCE;
    }
}
