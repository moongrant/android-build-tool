package p439o0OoOo0O;

import androidx.lifecycle.Observer;
import com.app.base.protobuf.room.Room;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.mixedroom.roomcenter.RoomFrameUIController;
import com.yalla.yalla.ui.activity.room.LuckyPacketDetailActivity;
import kotlin.jvm.internal.Intrinsics;
import p519o0o0O0oO.oO00Oo00;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o000000 implements Observer<Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomFrameUIController f46097OooO0Oo;

    public o000000(RoomFrameUIController roomFrameUIController) {
        this.f46097OooO0Oo = roomFrameUIController;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.app.base.protobuf.room.Room.BonusDetailReply");
        Room.BonusDetailReply bonusDetailReply = (Room.BonusDetailReply) obj;
        OooOOO0.OooO0O0("bonusDetail = " + bonusDetailReply);
        RoomFrameUIController roomFrameUIController = this.f46097OooO0Oo;
        if (roomFrameUIController.f23544OooO00o.f22753OooO0oO) {
            boolean gotbonus = bonusDetailReply.getGotbonus();
            MixedRoomActivity mixedRoomActivity = roomFrameUIController.f23544OooO00o;
            if (gotbonus) {
                int i = LuckyPacketDetailActivity.f26556OooOo;
                LuckyPacketDetailActivity.OooO00o.OooO00o(mixedRoomActivity, bonusDetailReply.getBonusid(), bonusDetailReply.getBonustype());
                return;
            }
            if (bonusDetailReply.getBonustotalnum() == bonusDetailReply.getBonusgrabnum()) {
                oO00Oo00 oo00oo00 = new oO00Oo00(mixedRoomActivity);
                oo00oo00.OooOO0o(bonusDetailReply.getBonustype(), bonusDetailReply.getBonusid());
                oo00oo00.OooO();
                return;
            }
            oO00Oo00 oo00oo01 = new oO00Oo00(mixedRoomActivity);
            oo00oo01.f52843OooOo00 = true;
            long bonusid = bonusDetailReply.getBonusid();
            int bonustype = bonusDetailReply.getBonustype();
            String fromuseravatar = bonusDetailReply.getFromuseravatar();
            Intrinsics.checkNotNullExpressionValue(fromuseravatar, "this.fromuseravatar");
            String giftimg = bonusDetailReply.getGiftimg();
            Intrinsics.checkNotNullExpressionValue(giftimg, "this.giftimg");
            String fromusername = bonusDetailReply.getFromusername();
            Intrinsics.checkNotNullExpressionValue(fromusername, "this.fromusername");
            bonusDetailReply.getBonuscount();
            String bonusinfo = bonusDetailReply.getBonusinfo();
            Intrinsics.checkNotNullExpressionValue(bonusinfo, "this.bonusinfo");
            oo00oo01.OooOO0O(bonusid, bonustype, fromuseravatar, giftimg, fromusername, bonusinfo, null);
            oo00oo01.OooO();
        }
    }
}
