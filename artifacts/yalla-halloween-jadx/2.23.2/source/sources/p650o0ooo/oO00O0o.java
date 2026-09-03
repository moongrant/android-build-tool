package p650o0ooo;

import android.view.View;
import com.app.base.protobuf.room.Room;
import com.code.android.util.o0000;
import com.yalla.yalla.model.Vip;
import com.yalla.yalla.service.room.RoomLiveService;
import com.yalla.yalla.ui.screen.user.vip.VipScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0oo0000.OooO00o;
import p041Ooooo0o.o00000;
import p205o00o0o0o.o000O;
import p415o0Oo0oO0.o00Ooo;
import p562o0oOo000.o000000;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00O0o extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oO00OOOo f58779OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00O0o(oO00OOOo oo00oooo) {
        super(1);
        this.f58779OooO0Oo = oo00oooo;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View setNoDoubleClickListener = view;
        Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
        OooO00o.OooO0O0("102321");
        oO00OOOo oo00oooo = this.f58779OooO0Oo;
        oo00oooo.OooOO0O(false);
        Vip vip = Vip.INSTANCE;
        if (Vip.isFrozen$default(vip, null, 1, null)) {
            o000O o000o = new o000O(oo00oooo.f58784OooOO0O);
            o000o.OooOo00(o0000.OooO0OO(o000000.Lucky_Packet_Send_Vip_Freeze));
            o000o.OooOOOO(o000000.Unfreeze_VIP);
            o000o.OooOo0(oO00OOO.f58783OooO0Oo);
            o000o.OooOo(true);
            o000o.OooOO0o();
        } else if (Vip.isNotVip$default(vip, null, 1, null)) {
            VipScreen.navigate$default(VipScreen.INSTANCE, null, false, 3, null);
        } else {
            String strValueOf = String.valueOf(oo00oooo.OooOO0().f44029OooOoOO.getText());
            if (o00Ooo.OooO0oo().OooOOo()) {
                OooO00o.OooO0O0("102134");
                int iOooOOO = o00Ooo.OooO0oo().OooOOO();
                int iOooOOO0 = o00Ooo.OooO0oo().OooOOO0();
                int iOooOOOO = o00Ooo.OooO0oo().OooOOOO();
                Room.NewSendBonusRequest.Builder builderNewBuilder = Room.NewSendBonusRequest.newBuilder();
                builderNewBuilder.setBonustype(2);
                builderNewBuilder.setBonuscount(iOooOOO0);
                builderNewBuilder.setBonusnum(iOooOOOO);
                builderNewBuilder.setGiftid(iOooOOO);
                builderNewBuilder.setBonusinfo(strValueOf);
                RoomLiveService roomLiveService = RoomLiveService.f24596OooOo00;
                if (roomLiveService != null) {
                    roomLiveService.OooO0oo(10073, builderNewBuilder.build().toByteArray());
                }
                int iOooOOO2 = o00Ooo.OooO0oo().OooOOO();
                int iOooOOO1 = o00Ooo.OooO0oo().OooOOO0();
                int iOooOOOO2 = o00Ooo.OooO0oo().OooOOOO();
                StringBuilder sbOooO00o = o00000.OooO00o("Send Content Lucky Packet Gift\ngiftId: ", iOooOOO2, " \ngiftCount: ", iOooOOO1, " \ngiftPackets: ");
                sbOooO00o.append(iOooOOOO2);
                sbOooO00o.append(" \nluckyPacketContentGift: ");
                sbOooO00o.append(strValueOf);
                o0000O00.OooO0O0(sbOooO00o.toString());
            } else {
                OooO00o.OooO0O0("102132");
                int iOooOOOo = o00Ooo.OooO0oo().OooOOOo();
                int iOooOOo0 = o00Ooo.OooO0oo().OooOOo0();
                Room.NewSendBonusRequest.Builder builderNewBuilder2 = Room.NewSendBonusRequest.newBuilder();
                builderNewBuilder2.setBonustype(1);
                builderNewBuilder2.setBonuscount(iOooOOOo);
                builderNewBuilder2.setBonusnum(iOooOOo0);
                builderNewBuilder2.setGiftid(0);
                builderNewBuilder2.setBonusinfo(strValueOf);
                RoomLiveService roomLiveService2 = RoomLiveService.f24596OooOo00;
                if (roomLiveService2 != null) {
                    roomLiveService2.OooO0oo(10073, builderNewBuilder2.build().toByteArray());
                }
                StringBuilder sbOooO00o2 = o00000.OooO00o("Send Content Lucky Packet Golds \ngoldsCoin: ", o00Ooo.OooO0oo().OooOOOo(), " \ngoldsPackets: ", o00Ooo.OooO0oo().OooOOo0(), " \nluckyPacketContentGolds: ");
                sbOooO00o2.append(strValueOf);
                o0000O00.OooO0O0(sbOooO00o2.toString());
            }
            oo00oooo.OooO0O0();
        }
        return Unit.INSTANCE;
    }
}
