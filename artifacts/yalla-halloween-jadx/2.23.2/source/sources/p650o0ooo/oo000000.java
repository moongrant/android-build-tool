package p650o0ooo;

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
public final class oo000000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f59042OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ RoomUserInfoModel f59043OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo000000(MutableState<Boolean> mutableState, RoomUserInfoModel roomUserInfoModel) {
        super(0);
        this.f59042OooO0Oo = mutableState;
        this.f59043OooO0o0 = roomUserInfoModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        boolean zBooleanValue = this.f59042OooO0Oo.getValue().booleanValue();
        RoomUserInfoModel roomUserInfoModel = this.f59043OooO0o0;
        if (zBooleanValue) {
            String userIdx = String.valueOf(roomUserInfoModel.getUserId().getValue().longValue());
            Intrinsics.checkNotNullParameter(userIdx, "userIdx");
            Intrinsics.checkNotNullParameter("1", "blockaction");
            String strOooO0O0 = o000oOoO.OooO0O0("{\"to\":", userIdx, ",\"blockaction\":1}");
            RoomLiveService roomLiveService = RoomLiveService.f24596OooOo00;
            if (roomLiveService != null) {
                roomLiveService.OooO0oO(10008, strOooO0O0);
            }
        } else {
            String userIdx2 = String.valueOf(roomUserInfoModel.getUserId().getValue().longValue());
            Intrinsics.checkNotNullParameter(userIdx2, "userIdx");
            Intrinsics.checkNotNullParameter(AppEventsConstants.EVENT_PARAM_VALUE_NO, "blockaction");
            String strOooO0O1 = o000oOoO.OooO0O0("{\"to\":", userIdx2, ",\"blockaction\":0}");
            RoomLiveService roomLiveService2 = RoomLiveService.f24596OooOo00;
            if (roomLiveService2 != null) {
                roomLiveService2.OooO0oO(10008, strOooO0O1);
            }
        }
        return Unit.INSTANCE;
    }
}
