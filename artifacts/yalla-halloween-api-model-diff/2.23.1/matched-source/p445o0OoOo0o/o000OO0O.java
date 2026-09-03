package p445o0OoOo0o;

import androidx.lifecycle.Observer;
import com.app.base.protobuf.room.Room;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.mixedroom.roomcenter.RoomFrameUIController;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.activity.room.LuckyPacketDetailActivity;
import com.yalla.yalla.ui.screen.store.StoreChatBubbleMineScreen;
import com.yalla.yalla.ui.vm.moment.BaseMomentVM;
import kotlin.jvm.internal.Intrinsics;
import p597o0oo00O.OooOOOO;
import p675oO0Oo.oO0O00oO;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o000OO0O implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f47296OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f47297OooO0o0;

    public /* synthetic */ o000OO0O(Object obj, int i) {
        this.f47296OooO0Oo = i;
        this.f47297OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f47296OooO0Oo;
        Object obj2 = this.f47297OooO0o0;
        switch (i) {
            case 0:
                RoomFrameUIController this$0 = (RoomFrameUIController) obj2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.app.base.protobuf.room.Room.BonusDetailReply");
                Room.BonusDetailReply bonusDetailReply = (Room.BonusDetailReply) obj;
                OooOOOO.OooO0O0("bonusDetail = " + bonusDetailReply);
                if (this$0.f23095OooO00o.f22287OooO0oO) {
                    boolean gotbonus = bonusDetailReply.getGotbonus();
                    MixedRoomActivity mixedRoomActivity = this$0.f23095OooO00o;
                    if (gotbonus) {
                        int i2 = LuckyPacketDetailActivity.f26106OooOo;
                        LuckyPacketDetailActivity.OooO00o.OooO00o(mixedRoomActivity, bonusDetailReply.getBonusid(), bonusDetailReply.getBonustype());
                    } else if (bonusDetailReply.getBonustotalnum() != bonusDetailReply.getBonusgrabnum()) {
                        oO0O00oO oo0o00oo = new oO0O00oO(mixedRoomActivity);
                        oo0o00oo.f59696OooOo00 = true;
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
                        oo0o00oo.OooOO0O(bonusid, bonustype, fromuseravatar, giftimg, fromusername, bonusinfo, null);
                        oo0o00oo.OooO();
                    } else {
                        oO0O00oO oo0o00oo2 = new oO0O00oO(mixedRoomActivity);
                        oo0o00oo2.OooOO0o(bonusDetailReply.getBonustype(), bonusDetailReply.getBonusid());
                        oo0o00oo2.OooO();
                    }
                    break;
                }
                break;
            case 1:
                BaseMomentVM newMomentVM = (BaseMomentVM) obj2;
                MomentDetailModel it = (MomentDetailModel) obj;
                Intrinsics.checkNotNullParameter(newMomentVM, "$newMomentVM");
                Intrinsics.checkNotNullParameter(it, "it");
                newMomentVM.updateComment(it);
                break;
            default:
                StoreChatBubbleMineScreen.MainContent$lambda$0((p107o000ooO0.OooOOOO) obj2, ((Boolean) obj).booleanValue());
                break;
        }
    }
}
