package p497o0o00OoO;

import androidx.lifecycle.MutableLiveData;
import com.app.base.protobuf.room.Room;
import com.yalla.yalla.mixedroom.MixedRoomDataSource;
import com.yalla.yalla.mixedroom.model.RoomConfiguration;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.room.NewRoomUserInfoTransformutilsKt;
import com.yalla.yalla.model.room.RoomUserInfoDTO;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.service.room.RoomLiveService;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p384o0OOoo0O.o000oOoO;
import p412o0Oo0o0O.o00OO;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.activity.room.live.bottom.RoomUserInfoManager$initObserver$5$1", f = "RoomUserInfoManager.kt", i = {}, l = {119}, m = "invokeSuspend", n = {}, s = {})
public final class o00OO000 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public RoomUserInfoModel f49850OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f49851OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public oo0O f49852OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ RoomUserInfoModel f49853OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ oo0O f49854OooO0oo;

    public static final class OooO00o extends Lambda implements Function1<RoomUserInfoDTO, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ oo0O f49855OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(oo0O oo0o) {
            super(1);
            this.f49855OooO0Oo = oo0o;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(RoomUserInfoDTO roomUserInfoDTO) {
            RoomUserInfoDTO roomUserInfoDTO2 = roomUserInfoDTO;
            if (roomUserInfoDTO2 != null) {
                oo0O oo0o = this.f49855OooO0Oo;
                if (oo0o.OooO0o0().OooO0OO()) {
                    oo0O.OooO0OO(oo0o, oo0o.OooO0o0(), NewRoomUserInfoTransformutilsKt.transformToModel(roomUserInfoDTO2));
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<ApiError, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ RoomUserInfoModel f49856OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(RoomUserInfoModel roomUserInfoModel) {
            super(1);
            this.f49856OooO0Oo = roomUserInfoModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            ApiError it = apiError;
            Intrinsics.checkNotNullParameter(it, "it");
            long jLongValue = this.f49856OooO0Oo.getUserId().getValue().longValue();
            if (jLongValue > 0) {
                Room.UserInfoRequest.Builder builderNewBuilder = Room.UserInfoRequest.newBuilder();
                builderNewBuilder.setUserid(jLongValue);
                RoomLiveService roomLiveService = RoomLiveService.f24596OooOo00;
                if (roomLiveService != null) {
                    roomLiveService.OooO0oo(10060, builderNewBuilder.build().toByteArray());
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO000(RoomUserInfoModel roomUserInfoModel, oo0O oo0o, Continuation<? super o00OO000> continuation) {
        super(2, continuation);
        this.f49853OooO0oO = roomUserInfoModel;
        this.f49854OooO0oo = oo0o;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o00OO000(this.f49853OooO0oO, this.f49854OooO0oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o00OO000) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        RoomUserInfoModel roomUserInfoModel;
        oo0O oo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f49851OooO0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            RoomConfiguration roomConfiguration = MixedRoomDataSource.OooO0o0().f22991OooO0o;
            if (roomConfiguration != null) {
                if (!(roomConfiguration.getBarid() == null)) {
                    o00OO o00oo2 = o00OO.f46151OooO00o;
                    roomUserInfoModel = this.f49853OooO0oO;
                    long jLongValue = roomUserInfoModel.getUserId().getValue().longValue();
                    Long value = com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO.OooO00o().f24539OooO0Oo.getValue();
                    if (value != null) {
                        long jLongValue2 = value.longValue();
                        this.f49850OooO0Oo = roomUserInfoModel;
                        oo0O oo0o2 = this.f49854OooO0oo;
                        this.f49852OooO0o0 = oo0o2;
                        this.f49851OooO0o = 1;
                        Object objOooO0o0 = o00oo2.OooO0o0(jLongValue, jLongValue2, this);
                        if (objOooO0o0 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        oo0o = oo0o2;
                        obj = objOooO0o0;
                    }
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        oo0o = this.f49852OooO0o0;
        roomUserInfoModel = this.f49850OooO0Oo;
        ResultKt.throwOnFailure(obj);
        ((MutableLiveData) obj).observe(oo0o.f49626OooO00o, new o000oOoO(new OooO00o(oo0o), new OooO0O0(roomUserInfoModel), null, false, 12));
        return Unit.INSTANCE;
    }
}
