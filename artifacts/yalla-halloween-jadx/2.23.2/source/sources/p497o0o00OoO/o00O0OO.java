package p497o0o00OoO;

import com.yalla.yalla.model.room.RoomUserInfoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.MutableStateFlow;
import p187o00o00o0.OooO;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0OO extends Lambda implements Function1<RoomUserInfoModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oo0O f49845OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0OO(oo0O oo0o) {
        super(1);
        this.f49845OooO0Oo = oo0o;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(RoomUserInfoModel roomUserInfoModel) {
        RoomUserInfoModel roomUserInfoModel2 = roomUserInfoModel;
        MutableStateFlow<String> userIdx = roomUserInfoModel2 != null ? roomUserInfoModel2.getUserIdx() : null;
        MutableStateFlow<String> userName = roomUserInfoModel2 != null ? roomUserInfoModel2.getUserName() : null;
        o0000O00.OooO0O0("RoomUserInfoManager showUserInformation userIdx = " + userIdx + ", userName = " + userName + " \n model = " + OooO.OooO00o(roomUserInfoModel2));
        oo0O oo0o = this.f49845OooO0Oo;
        if (roomUserInfoModel2 != null) {
            oo0O.OooO0OO(oo0o, oo0o.OooO0o0(), roomUserInfoModel2);
            oo0o.OooO0o0().OooO();
        } else {
            oo0o.OooO0o0().OooO0O0();
        }
        return Unit.INSTANCE;
    }
}
