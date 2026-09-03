package p406o0Oo0Ooo;

import androidx.compose.animation.OooO;
import com.app.base.protobuf.MessageIM;
import com.code.android.util.o0000;
import com.google.protobuf.InvalidProtocolBufferException;
import com.yalla.yalla.model.ImResult;
import com.yalla.yalla.model.http.ApiError1005;
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
import p140o00OOooo.OooOO0;
import p377o0OOoOo.o0000O;
import p429o0OoOOO.o00O0;
import p429o0OoOOO.oOO00O;
import p464o0Oooo.o000000O;
import p542o0o0o00O.o000oOoO;
import p584o0oOooO0.oO00OOo0;
import p592o0oo00O.OooOOO0;
import p634o0ooO0oO.o00OOOO0;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.data.repository.ImMessageRepo$queryAccountStatus$1", f = "ImMessageRepo.kt", i = {}, l = {795}, m = "invokeSuspend", n = {}, s = {})
public final class oOOO0O0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f45016OooO0Oo;

    public oOOO0O0o(Continuation<? super oOOO0O0o> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new oOOO0O0o(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return new oOOO0O0o(continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws InvalidProtocolBufferException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f45016OooO0Oo;
        long jLongValue = 0;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            o000000O o000000o2 = o000000O.f46674OooO00o;
            Long lBoxLong = (Long) o000000O.OooOOo0().getValue();
            if (lBoxLong == null) {
                lBoxLong = Boxing.boxLong(0L);
            }
            long jLongValue2 = lBoxLong.longValue();
            Integer numBoxInt = (Integer) o000000O.OooOOO0().getValue();
            if (numBoxInt == null) {
                numBoxInt = Boxing.boxInt(0);
            }
            int iIntValue = numBoxInt.intValue();
            this.f45016OooO0Oo = 1;
            MessageIM.BanStatusIn.Builder mRequestBuilder = MessageIM.BanStatusIn.newBuilder();
            mRequestBuilder.setUserId(jLongValue2);
            mRequestBuilder.setRegion(iIntValue);
            o00OOOO0 o00oooo1 = o000oOoO.f55784OooO00o;
            String str = o0000O.f44090OooOOo0;
            Intrinsics.checkNotNullExpressionValue(mRequestBuilder, "mRequestBuilder");
            obj = o000oOoO.OooO0O0(str, mRequestBuilder, this);
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
        o00O0 o00o1 = o00O0.f45732OooO00o;
        if (zIsSuccess) {
            MessageIM.BanStatusOut from = MessageIM.BanStatusOut.parseFrom(imResult.getBody());
            if (from.getStatus() == 1) {
                ApiError1005 apiError1005 = new ApiError1005();
                apiError1005.setData(new ApiError1005.ApiError1005Data());
                ApiError1005.ApiError1005Data data = apiError1005.getData();
                if (data != null) {
                    data.setBlockingMsg(o0000.OooO0OO(oO00OOo0.account_closure));
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
                    o000000O o000000o3 = o000000O.f46674OooO00o;
                    Long l = (Long) o000000O.OooOOo0().getValue();
                    if (l != null) {
                        Intrinsics.checkNotNullExpressionValue(l, "Account.userId.value ?: 0");
                        jLongValue = l.longValue();
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
                o00o1.OooO0OO(new oOO00O(oOO00O.Account_Suspension, OooOO0.OooO00o(apiError1005)));
                OooOOO0.OooO0O0("CommonError.Account_Suspension data = " + apiError1005.getData());
            } else {
                OooOOO0.OooO0O0("CommonError.Account_Suspension state = 0");
                o00o1.OooO0OO(new oOO00O(oOO00O.Account_Suspension, null, 2, null));
            }
        } else {
            OooO.OooO0O0(oOO00O.Account_Suspension, null, 2, null, o00o1);
        }
        return Unit.INSTANCE;
    }
}
