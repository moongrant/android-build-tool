package p497o0o00OoO;

import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.ui.activity.user.BadgeActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import o0oo0000.OooO00o;

/* JADX INFO: loaded from: classes4.dex */
public final class o0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oo0O f49677OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ RoomUserInfoModel f49678OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(oo0O oo0o, RoomUserInfoModel roomUserInfoModel) {
        super(0);
        this.f49677OooO0Oo = oo0o;
        this.f49678OooO0o0 = roomUserInfoModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        oo0O oo0o = this.f49677OooO0Oo;
        oo0o.getClass();
        OooO00o.OooO0O0("102199");
        int i = BadgeActivity.f26604OooOo;
        MixedRoomActivity mixedRoomActivity = oo0o.f49626OooO00o;
        RoomUserInfoModel roomUserInfoModel = this.f49678OooO0o0;
        long jLongValue = roomUserInfoModel.getUserId().getValue().longValue();
        String value = roomUserInfoModel.getUserName().getValue();
        String value2 = roomUserInfoModel.getUserHeader().getValue();
        String value3 = roomUserInfoModel.getMedal().getValue();
        if (value3 == null) {
            value3 = "";
        }
        BadgeActivity.OooO00o.OooO00o(mixedRoomActivity, jLongValue, value, value2, value3, false);
        return Unit.INSTANCE;
    }
}
