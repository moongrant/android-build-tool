package p490o0o00OOO;

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
import p377o0OOoOo.o0000OO0;
import p406o0Oo0Ooo.n;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.activity.room.live.bottom.RoomUserInfoManager$initObserver$5$onChanged$1", f = "RoomUserInfoManager.kt", i = {}, l = {119}, m = "invokeSuspend", n = {}, s = {})
public final class o000O00O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public RoomUserInfoModel f48605OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f48606OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public o000O f48607OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ RoomUserInfoModel f48608OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ o000O f48609OooO0oo;

    public static final class OooO00o extends Lambda implements Function1<RoomUserInfoDTO, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o000O f48610OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o000O o000o) {
            super(1);
            this.f48610OooO0Oo = o000o;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(RoomUserInfoDTO roomUserInfoDTO) {
            RoomUserInfoDTO roomUserInfoDTO2 = roomUserInfoDTO;
            if (roomUserInfoDTO2 != null) {
                o000O o000o = this.f48610OooO0Oo;
                if (o000o.OooO0o0().OooO0OO()) {
                    o000O.OooO0OO(o000o, o000o.OooO0o0(), NewRoomUserInfoTransformutilsKt.transformToModel(roomUserInfoDTO2));
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<ApiError, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ RoomUserInfoModel f48611OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(RoomUserInfoModel roomUserInfoModel) {
            super(1);
            this.f48611OooO0Oo = roomUserInfoModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            ApiError it = apiError;
            Intrinsics.checkNotNullParameter(it, "it");
            long jLongValue = this.f48611OooO0Oo.getUserId().getValue().longValue();
            if (jLongValue > 0) {
                Room.UserInfoRequest.Builder builderNewBuilder = Room.UserInfoRequest.newBuilder();
                builderNewBuilder.setUserid(jLongValue);
                RoomLiveService roomLiveService = RoomLiveService.f25058OooOo00;
                if (roomLiveService != null) {
                    roomLiveService.OooO0oo(10060, builderNewBuilder.build().toByteArray());
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O00O(RoomUserInfoModel roomUserInfoModel, o000O o000o, Continuation<? super o000O00O> continuation) {
        super(2, continuation);
        this.f48608OooO0oO = roomUserInfoModel;
        this.f48609OooO0oo = o000o;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o000O00O(this.f48608OooO0oO, this.f48609OooO0oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o000O00O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        RoomUserInfoModel roomUserInfoModel;
        o000O o000o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f48606OooO0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            RoomConfiguration roomConfiguration = MixedRoomDataSource.OooO0o0().f23460OooO0o;
            if (roomConfiguration != null) {
                if (!(roomConfiguration.getBarid() == null)) {
                    n nVar = n.f44887OooO00o;
                    roomUserInfoModel = this.f48608OooO0oO;
                    long jLongValue = roomUserInfoModel.getUserId().getValue().longValue();
                    Long value = com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO.OooO00o().f25001OooO0Oo.getValue();
                    if (value != null) {
                        long jLongValue2 = value.longValue();
                        this.f48605OooO0Oo = roomUserInfoModel;
                        o000O o000o2 = this.f48609OooO0oo;
                        this.f48607OooO0o0 = o000o2;
                        this.f48606OooO0o = 1;
                        Object objOooO0o0 = nVar.OooO0o0(jLongValue, jLongValue2, this);
                        if (objOooO0o0 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        o000o = o000o2;
                        obj = objOooO0o0;
                    }
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        o000o = this.f48607OooO0o0;
        roomUserInfoModel = this.f48605OooO0Oo;
        ResultKt.throwOnFailure(obj);
        ((MutableLiveData) obj).observe(o000o.f48470OooO00o, new o0000OO0(new OooO00o(o000o), new OooO0O0(roomUserInfoModel), null, false, 12));
        return Unit.INSTANCE;
    }
}
