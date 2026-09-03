package p519o0o0O0oO;

import androidx.compose.runtime.MutableState;
import com.facebook.appevents.AppEventsConstants;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.service.room.RoomLiveService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p004OooO0oO.o000oOoO;

/* JADX INFO: loaded from: classes4.dex */
public final class oOOOoo00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f52998OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ RoomUserInfoModel f52999OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOOOoo00(MutableState<Boolean> mutableState, RoomUserInfoModel roomUserInfoModel) {
        super(0);
        this.f52998OooO0Oo = mutableState;
        this.f52999OooO0o0 = roomUserInfoModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        boolean zBooleanValue = this.f52998OooO0Oo.getValue().booleanValue();
        RoomUserInfoModel roomUserInfoModel = this.f52999OooO0o0;
        if (zBooleanValue) {
            String userIdx = String.valueOf(roomUserInfoModel.getUserId().getValue().longValue());
            Intrinsics.checkNotNullParameter(userIdx, "userIdx");
            Intrinsics.checkNotNullParameter("1", "blockaction");
            String strOooO00o = o000oOoO.OooO00o("{\"to\":", userIdx, ",\"blockaction\":1}");
            RoomLiveService roomLiveService = RoomLiveService.f25058OooOo00;
            if (roomLiveService != null) {
                roomLiveService.OooO0oO(10008, strOooO00o);
            }
        } else {
            String userIdx2 = String.valueOf(roomUserInfoModel.getUserId().getValue().longValue());
            Intrinsics.checkNotNullParameter(userIdx2, "userIdx");
            Intrinsics.checkNotNullParameter(AppEventsConstants.EVENT_PARAM_VALUE_NO, "blockaction");
            String strOooO00o2 = o000oOoO.OooO00o("{\"to\":", userIdx2, ",\"blockaction\":0}");
            RoomLiveService roomLiveService2 = RoomLiveService.f25058OooOo00;
            if (roomLiveService2 != null) {
                roomLiveService2.OooO0oO(10008, strOooO00o2);
            }
        }
        return Unit.INSTANCE;
    }
}
