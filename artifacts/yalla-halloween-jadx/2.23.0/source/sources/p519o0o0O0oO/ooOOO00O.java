package p519o0o0O0oO;

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
import p041Ooooo0o.o00000;
import p157o00OoOO0.o0OO00O;
import p408o0Oo0o0O.o00Oo0;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class ooOOO00O extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oO0o0000 f53031OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ooOOO00O(oO0o0000 oo0o0000) {
        super(1);
        this.f53031OooO0Oo = oo0o0000;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View setNoDoubleClickListener = view;
        Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
        o0OO000.OooO00o("102321");
        oO0o0000 oo0o0000 = this.f53031OooO0Oo;
        oo0o0000.OooOO0O(false);
        Vip vip = Vip.INSTANCE;
        if (Vip.isFrozen$default(vip, null, 1, null)) {
            o0OO00O o0oo00o2 = new o0OO00O(oo0o0000.f52884OooOO0O);
            o0oo00o2.OooOo00(o0000.OooO0OO(oO00OOo0.Lucky_Packet_Send_Vip_Freeze));
            o0oo00o2.OooOOOO(oO00OOo0.Unfreeze_VIP);
            o0oo00o2.OooOo0(oO0Oo0o0.f52878OooO0Oo);
            o0oo00o2.OooOo(true);
            o0oo00o2.OooOO0o();
        } else if (Vip.isNotVip$default(vip, null, 1, null)) {
            VipScreen.navigate$default(VipScreen.INSTANCE, null, false, 3, null);
        } else {
            String strValueOf = String.valueOf(oo0o0000.OooOO0().f59316OooOoOO.getText());
            if (o00Oo0.OooO0oo().OooOOo()) {
                o0OO000.OooO00o("102134");
                int iOooOOO = o00Oo0.OooO0oo().OooOOO();
                int iOooOOO0 = o00Oo0.OooO0oo().OooOOO0();
                int iOooOOOO = o00Oo0.OooO0oo().OooOOOO();
                Room.NewSendBonusRequest.Builder builderNewBuilder = Room.NewSendBonusRequest.newBuilder();
                builderNewBuilder.setBonustype(2);
                builderNewBuilder.setBonuscount(iOooOOO0);
                builderNewBuilder.setBonusnum(iOooOOOO);
                builderNewBuilder.setGiftid(iOooOOO);
                builderNewBuilder.setBonusinfo(strValueOf);
                RoomLiveService roomLiveService = RoomLiveService.f25058OooOo00;
                if (roomLiveService != null) {
                    roomLiveService.OooO0oo(10073, builderNewBuilder.build().toByteArray());
                }
                int iOooOOO2 = o00Oo0.OooO0oo().OooOOO();
                int iOooOOO1 = o00Oo0.OooO0oo().OooOOO0();
                int iOooOOOO2 = o00Oo0.OooO0oo().OooOOOO();
                StringBuilder sbOooO00o = o00000.OooO00o("Send Content Lucky Packet Gift\ngiftId: ", iOooOOO2, " \ngiftCount: ", iOooOOO1, " \ngiftPackets: ");
                sbOooO00o.append(iOooOOOO2);
                sbOooO00o.append(" \nluckyPacketContentGift: ");
                sbOooO00o.append(strValueOf);
                OooOOO0.OooO0O0(sbOooO00o.toString());
            } else {
                o0OO000.OooO00o("102132");
                int iOooOOOo = o00Oo0.OooO0oo().OooOOOo();
                int iOooOOo0 = o00Oo0.OooO0oo().OooOOo0();
                Room.NewSendBonusRequest.Builder builderNewBuilder2 = Room.NewSendBonusRequest.newBuilder();
                builderNewBuilder2.setBonustype(1);
                builderNewBuilder2.setBonuscount(iOooOOOo);
                builderNewBuilder2.setBonusnum(iOooOOo0);
                builderNewBuilder2.setGiftid(0);
                builderNewBuilder2.setBonusinfo(strValueOf);
                RoomLiveService roomLiveService2 = RoomLiveService.f25058OooOo00;
                if (roomLiveService2 != null) {
                    roomLiveService2.OooO0oo(10073, builderNewBuilder2.build().toByteArray());
                }
                StringBuilder sbOooO00o2 = o00000.OooO00o("Send Content Lucky Packet Golds \ngoldsCoin: ", o00Oo0.OooO0oo().OooOOOo(), " \ngoldsPackets: ", o00Oo0.OooO0oo().OooOOo0(), " \nluckyPacketContentGolds: ");
                sbOooO00o2.append(strValueOf);
                OooOOO0.OooO0O0(sbOooO00o2.toString());
            }
            oo0o0000.OooO0O0();
        }
        return Unit.INSTANCE;
    }
}
