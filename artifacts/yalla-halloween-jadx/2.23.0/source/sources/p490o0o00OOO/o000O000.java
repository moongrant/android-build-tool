package p490o0o00OOO;

import com.yalla.yalla.model.room.RoomUserInfoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.MutableStateFlow;
import p140o00OOooo.OooOO0;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O000 extends Lambda implements Function1<RoomUserInfoModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000O f48604OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O000(o000O o000o) {
        super(1);
        this.f48604OooO0Oo = o000o;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(RoomUserInfoModel roomUserInfoModel) {
        RoomUserInfoModel roomUserInfoModel2 = roomUserInfoModel;
        MutableStateFlow<String> userIdx = roomUserInfoModel2 != null ? roomUserInfoModel2.getUserIdx() : null;
        MutableStateFlow<String> userName = roomUserInfoModel2 != null ? roomUserInfoModel2.getUserName() : null;
        OooOOO0.OooO0O0("RoomUserInfoManager showUserInformation userIdx = " + userIdx + ", userName = " + userName + " \n model = " + OooOO0.OooO00o(roomUserInfoModel2));
        o000O o000o = this.f48604OooO0Oo;
        if (roomUserInfoModel2 != null) {
            o000O.OooO0OO(o000o, o000o.OooO0o0(), roomUserInfoModel2);
            o000o.OooO0o0().OooO();
        } else {
            o000o.OooO0o0().OooO0O0();
        }
        return Unit.INSTANCE;
    }
}
