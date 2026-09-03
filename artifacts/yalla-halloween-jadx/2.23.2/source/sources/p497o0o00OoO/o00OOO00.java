package p497o0o00OoO;

import com.code.android.util.o0000;
import com.yalla.yalla.model.FriendCheckModel;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import o0oo0000.OooO00o;
import p205o00o0o0o.o000O;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OOO00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oo0O f49863OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ RoomUserInfoModel f49864OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOO00(oo0O oo0o, RoomUserInfoModel roomUserInfoModel) {
        super(0);
        this.f49863OooO0Oo = oo0o;
        this.f49864OooO0o0 = roomUserInfoModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        oo0O oo0o = this.f49863OooO0Oo;
        oo0o.getClass();
        OooO00o.OooO0O0("102191");
        FriendCheckModel friendCheckModel = oo0o.f49903OooO0Oo;
        boolean z = friendCheckModel.isBlack;
        RoomUserInfoModel roomUserInfoModel = this.f49864OooO0o0;
        if (z) {
            o000O o000o = new o000O(oo0o.f49626OooO00o);
            o000o.OooOOoo(o000000.As_Block_Add_Friends);
            o000o.OooOo(true);
            o000o.OooOo0(new o00OO0OO(oo0o, roomUserInfoModel));
            o000o.OooOO0o();
        } else if (friendCheckModel.isVerify) {
            oo0o.OooO0oO(roomUserInfoModel.getUserId().getValue().longValue());
        } else {
            oo0o.OooO0o(roomUserInfoModel.getUserId().getValue().longValue(), o0000.OooO0OO(o000000.addbuddy));
        }
        return Unit.INSTANCE;
    }
}
