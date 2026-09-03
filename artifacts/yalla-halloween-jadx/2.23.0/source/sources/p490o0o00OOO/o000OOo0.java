package p490o0o00OOO;

import com.code.android.util.o0000;
import com.yalla.yalla.model.FriendCheckModel;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p157o00OoOO0.o0OO00O;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o000OOo0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000O f48628OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ RoomUserInfoModel f48629OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OOo0(o000O o000o, RoomUserInfoModel roomUserInfoModel) {
        super(0);
        this.f48628OooO0Oo = o000o;
        this.f48629OooO0o0 = roomUserInfoModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o000O o000o = this.f48628OooO0Oo;
        o000o.getClass();
        o0OO000.OooO00o("102191");
        FriendCheckModel friendCheckModel = o000o.f48595OooO0Oo;
        boolean z = friendCheckModel.isBlack;
        RoomUserInfoModel roomUserInfoModel = this.f48629OooO0o0;
        if (z) {
            o0OO00O o0oo00o2 = new o0OO00O(o000o.f48470OooO00o);
            o0oo00o2.OooOOoo(oO00OOo0.As_Block_Add_Friends);
            o0oo00o2.OooOo(true);
            o0oo00o2.OooOo0(new o000O0O0(o000o, roomUserInfoModel));
            o0oo00o2.OooOO0o();
        } else if (friendCheckModel.isVerify) {
            o000o.OooO0oO(roomUserInfoModel.getUserId().getValue().longValue());
        } else {
            o000o.OooO0o(roomUserInfoModel.getUserId().getValue().longValue(), o0000.OooO0OO(oO00OOo0.addbuddy));
        }
        return Unit.INSTANCE;
    }
}
