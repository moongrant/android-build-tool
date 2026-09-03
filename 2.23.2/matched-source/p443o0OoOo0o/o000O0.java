package p443o0OoOo0o;

import androidx.lifecycle.Observer;
import com.app.base.protobuf.room.Room;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.mixedroom.roomcenter.RoomFrameUIController;
import com.yalla.yalla.ui.activity.room.LuckyPacketDetailActivity;
import com.yalla.yalla.ui.vm.moment.BaseMomentVM;
import com.yalla.yalla.ui.vm.store.RoomThemeCustomCreateVM;
import kotlin.jvm.internal.Intrinsics;
import p598o0oo00Oo.o0000O00;
import p650o0ooo.o0OOOO0o;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o000O0 implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f47277OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f47278OooO0o0;

    public /* synthetic */ o000O0(Object obj, int i) {
        this.f47277OooO0Oo = i;
        this.f47278OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f47277OooO0Oo;
        Object obj2 = this.f47278OooO0o0;
        switch (i) {
            case 0:
                RoomFrameUIController this$0 = (RoomFrameUIController) obj2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.app.base.protobuf.room.Room.BonusDetailReply");
                Room.BonusDetailReply bonusDetailReply = (Room.BonusDetailReply) obj;
                o0000O00.OooO0O0("bonusDetail = " + bonusDetailReply);
                if (this$0.f23084OooO00o.f22280OooO0oO) {
                    boolean gotbonus = bonusDetailReply.getGotbonus();
                    MixedRoomActivity mixedRoomActivity = this$0.f23084OooO00o;
                    if (gotbonus) {
                        int i2 = LuckyPacketDetailActivity.f26104OooOo;
                        LuckyPacketDetailActivity.OooO00o.OooO00o(mixedRoomActivity, bonusDetailReply.getBonusid(), bonusDetailReply.getBonustype());
                    } else if (bonusDetailReply.getBonustotalnum() != bonusDetailReply.getBonusgrabnum()) {
                        o0OOOO0o o0oooo0o2 = new o0OOOO0o(mixedRoomActivity);
                        o0oooo0o2.f58714OooOo00 = true;
                        long bonusid = bonusDetailReply.getBonusid();
                        int bonustype = bonusDetailReply.getBonustype();
                        String fromuseravatar = bonusDetailReply.getFromuseravatar();
                        Intrinsics.checkNotNullExpressionValue(fromuseravatar, "getFromuseravatar(...)");
                        String giftimg = bonusDetailReply.getGiftimg();
                        Intrinsics.checkNotNullExpressionValue(giftimg, "getGiftimg(...)");
                        String fromusername = bonusDetailReply.getFromusername();
                        Intrinsics.checkNotNullExpressionValue(fromusername, "getFromusername(...)");
                        bonusDetailReply.getBonuscount();
                        String bonusinfo = bonusDetailReply.getBonusinfo();
                        Intrinsics.checkNotNullExpressionValue(bonusinfo, "getBonusinfo(...)");
                        o0oooo0o2.OooOO0O(bonusid, bonustype, fromuseravatar, giftimg, fromusername, bonusinfo, null);
                        o0oooo0o2.OooO();
                    } else {
                        o0OOOO0o o0oooo0o3 = new o0OOOO0o(mixedRoomActivity);
                        o0oooo0o3.OooOO0o(bonusDetailReply.getBonustype(), bonusDetailReply.getBonusid());
                        o0oooo0o3.OooO();
                    }
                    break;
                }
                break;
            case 1:
                BaseMomentVM newMomentVM = (BaseMomentVM) obj2;
                long jLongValue = ((Long) obj).longValue();
                Intrinsics.checkNotNullParameter(newMomentVM, "$newMomentVM");
                o0000O00.OooO("动态编辑 发送成功 刷新 = " + jLongValue);
                newMomentVM.squareSingle4Edited(jLongValue);
                break;
            default:
                ((RoomThemeCustomCreateVM) obj2).loadThemePrice();
                break;
        }
    }
}
