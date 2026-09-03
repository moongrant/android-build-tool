package p490o0o00OOO;

import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.ui.activity.user.BadgeActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class oo00o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000O f48715OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ RoomUserInfoModel f48716OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo00o(o000O o000o, RoomUserInfoModel roomUserInfoModel) {
        super(0);
        this.f48715OooO0Oo = o000o;
        this.f48716OooO0o0 = roomUserInfoModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o000O o000o = this.f48715OooO0Oo;
        o000o.getClass();
        o0OO000.OooO00o("102199");
        int i = BadgeActivity.f27070OooOo;
        MixedRoomActivity mixedRoomActivity = o000o.f48470OooO00o;
        RoomUserInfoModel roomUserInfoModel = this.f48716OooO0o0;
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
