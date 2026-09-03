package com.yalla.yalla.ui.dialog;

import android.view.View;
import android.widget.ImageView;
import com.app.base.protobuf.room.Room;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.util.o0000O0;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import p464o0Oooo.o000000O;
import p564o0oOo0OO.o000O;
import p584o0oOooO0.oO00O0oO;

/* JADX INFO: loaded from: classes4.dex */
public final class Oooo0 extends o000O<Room.RoshamboModel> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ RoomMoraGameListDialog f27860OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo0(RoomMoraGameListDialog roomMoraGameListDialog, MixedRoomActivity mixedRoomActivity) {
        super(mixedRoomActivity, (ArrayList) null);
        this.f27860OooOoo0 = roomMoraGameListDialog;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder helper = (ViewHolder) baseViewHolder;
        Room.RoshamboModel roshamboModel = (Room.RoshamboModel) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        int itemViewType = helper.getItemViewType();
        int iOooO00o = RoomMoraGameListDialog.GuessType.ChallengeGuessing.getValue();
        RoomMoraGameListDialog roomMoraGameListDialog = this.f27860OooOoo0;
        if (itemViewType != iOooO00o) {
            int i = RoomMoraGameListDialog.f27951OooOOO0;
            if (roshamboModel == null) {
                roomMoraGameListDialog.getClass();
                return;
            }
            o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(roomMoraGameListDialog.getContext());
            String headphoto = roshamboModel.getHeadphoto();
            int iOooO00o2 = o0000O0.OooO00o(35);
            oooO00o.f43911OooO0OO = p139o00OOooO.OooO0o.OooO0oo(iOooO00o2, iOooO00o2, headphoto);
            oooO00o.f43909OooO00o = 0;
            oooO00o.OooO00o(p543o0oO0O00.OooO.OooO0OO());
            oooO00o.f43914OooO0o0 = true;
            oooO00o.OooO0Oo((ImageView) helper.getView(oO00O0oO.niv_header));
            helper.setText(oO00O0oO.tv_name, roshamboModel.getName());
            o0OOo0O.OooOO0.OooO00o oooO00o2 = new o0OOo0O.OooOO0.OooO00o(roomMoraGameListDialog.getContext());
            oooO00o2.f43911OooO0OO = roshamboModel.getGiftImage();
            oooO00o2.f43909OooO00o = 0;
            oooO00o2.OooO00o(p543o0oO0O00.OooO.OooO0O0());
            oooO00o2.OooO0Oo((ImageView) helper.getView(oO00O0oO.iv_mora_gift_icon));
            int moranum = roshamboModel.getMoranum() / 100;
            View view = helper.getView(oO00O0oO.iv_hundred);
            Intrinsics.checkNotNullExpressionValue(view, "helper.getView(R.id.iv_hundred)");
            RoomMoraGameListDialog.OooOOO0((ImageView) view, moranum);
            int moranum2 = (roshamboModel.getMoranum() % 100) / 10;
            View view2 = helper.getView(oO00O0oO.iv_ten);
            Intrinsics.checkNotNullExpressionValue(view2, "helper.getView(R.id.iv_ten)");
            RoomMoraGameListDialog.OooOOO0((ImageView) view2, moranum2);
            int moranum3 = (roshamboModel.getMoranum() % 100) % 10;
            View view3 = helper.getView(oO00O0oO.iv_one);
            Intrinsics.checkNotNullExpressionValue(view3, "helper.getView(R.id.iv_one)");
            RoomMoraGameListDialog.OooOOO0((ImageView) view3, moranum3);
            o000000O o000000o2 = o000000O.f46674OooO00o;
            Long l = (Long) o000000O.OooOOo0().getValue();
            long userId = roshamboModel.getUserId();
            if (l != null && l.longValue() == userId) {
                helper.setVisible(oO00O0oO.iv_mora_pk, false);
                return;
            } else {
                helper.setVisible(oO00O0oO.iv_mora_pk, true);
                return;
            }
        }
        int i2 = RoomMoraGameListDialog.f27951OooOOO0;
        if (roshamboModel == null) {
            roomMoraGameListDialog.getClass();
            return;
        }
        o0OOo0O.OooOO0.OooO00o oooO00o3 = new o0OOo0O.OooOO0.OooO00o(roomMoraGameListDialog.getContext());
        String headphoto2 = roshamboModel.getHeadphoto();
        float f = 30;
        int iOooO00o3 = o0000O0.OooO00o(f);
        oooO00o3.f43911OooO0OO = p139o00OOooO.OooO0o.OooO0oo(iOooO00o3, iOooO00o3, headphoto2);
        oooO00o3.f43909OooO00o = 0;
        oooO00o3.OooO00o(p543o0oO0O00.OooO.OooO0OO());
        oooO00o3.f43914OooO0o0 = true;
        oooO00o3.OooO0Oo((ImageView) helper.getView(oO00O0oO.niv_header));
        o0OOo0O.OooOO0.OooO00o oooO00o4 = new o0OOo0O.OooOO0.OooO00o(roomMoraGameListDialog.getContext());
        String toHeadphoto = roshamboModel.getToHeadphoto();
        int iOooO00o4 = o0000O0.OooO00o(f);
        oooO00o4.f43911OooO0OO = p139o00OOooO.OooO0o.OooO0oo(iOooO00o4, iOooO00o4, toHeadphoto);
        oooO00o4.f43909OooO00o = 0;
        oooO00o4.OooO00o(p543o0oO0O00.OooO.OooO0OO());
        oooO00o4.f43914OooO0o0 = true;
        oooO00o4.OooO0Oo((ImageView) helper.getView(oO00O0oO.niv_header2));
        helper.setText(oO00O0oO.tv_name, roshamboModel.getName());
        helper.setText(oO00O0oO.tv_name2, roshamboModel.getToNickname());
        o0OOo0O.OooOO0.OooO00o oooO00o5 = new o0OOo0O.OooOO0.OooO00o(roomMoraGameListDialog.getContext());
        oooO00o5.f43911OooO0OO = roshamboModel.getGiftImage();
        oooO00o5.f43909OooO00o = 0;
        oooO00o5.OooO00o(p543o0oO0O00.OooO.OooO0O0());
        oooO00o5.OooO0Oo((ImageView) helper.getView(oO00O0oO.iv_mora_gift_icon));
        int moranum4 = roshamboModel.getMoranum() / 100;
        View view4 = helper.getView(oO00O0oO.iv_hundred);
        Intrinsics.checkNotNullExpressionValue(view4, "helper.getView(R.id.iv_hundred)");
        RoomMoraGameListDialog.OooOOO0((ImageView) view4, moranum4);
        int moranum5 = (roshamboModel.getMoranum() % 100) / 10;
        View view5 = helper.getView(oO00O0oO.iv_ten);
        Intrinsics.checkNotNullExpressionValue(view5, "helper.getView(R.id.iv_ten)");
        RoomMoraGameListDialog.OooOOO0((ImageView) view5, moranum5);
        int moranum6 = (roshamboModel.getMoranum() % 100) % 10;
        View view6 = helper.getView(oO00O0oO.iv_one);
        Intrinsics.checkNotNullExpressionValue(view6, "helper.getView(R.id.iv_one)");
        RoomMoraGameListDialog.OooOOO0((ImageView) view6, moranum6);
        o000000O o000000o3 = o000000O.f46674OooO00o;
        Long l2 = (Long) o000000O.OooOOo0().getValue();
        long toUserId = roshamboModel.getToUserId();
        if (l2 != null && l2.longValue() == toUserId) {
            helper.setVisible(oO00O0oO.iv_mora_pk, true);
        } else {
            helper.setVisible(oO00O0oO.iv_mora_pk, false);
        }
    }
}
