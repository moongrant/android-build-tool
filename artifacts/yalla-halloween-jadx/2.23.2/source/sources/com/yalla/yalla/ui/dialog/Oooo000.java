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
import p475o0Ooooo0.o0O00oO0;
import p562o0oOo000.o0OO00O;
import p571o0oOoO0.o0000oo;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
public final class Oooo000 extends o0000oo<Room.RoshamboModel> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ RoomMoraGameListDialog f27398OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo000(RoomMoraGameListDialog roomMoraGameListDialog, MixedRoomActivity mixedRoomActivity) {
        super(mixedRoomActivity, (ArrayList) null);
        this.f27398OooOoo0 = roomMoraGameListDialog;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder helper = (ViewHolder) baseViewHolder;
        Room.RoshamboModel roshamboModel = (Room.RoshamboModel) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        int itemViewType = helper.getItemViewType();
        int iOooO00o = RoomMoraGameListDialog.GuessType.ChallengeGuessing.getValue();
        RoomMoraGameListDialog roomMoraGameListDialog = this.f27398OooOoo0;
        if (itemViewType != iOooO00o) {
            int i = RoomMoraGameListDialog.f27488OooOOO0;
            if (roshamboModel == null) {
                roomMoraGameListDialog.getClass();
                return;
            }
            o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(roomMoraGameListDialog.getContext());
            String headphoto = roshamboModel.getHeadphoto();
            int iOooO00o2 = o0000O0.OooO00o(35);
            oooO00o.f43126OooO0OO = p184o00o00O0.OooO0OO.OooO0oo(iOooO00o2, iOooO00o2, headphoto);
            oooO00o.f43124OooO00o = 0;
            oooO00o.OooO00o(d1.OooO0OO());
            oooO00o.f43129OooO0o0 = true;
            oooO00o.OooO0Oo((ImageView) helper.getView(o0OO00O.niv_header));
            helper.setText(o0OO00O.tv_name, roshamboModel.getName());
            o0OOo0Oo.Oooo000.OooO00o oooO00o2 = new o0OOo0Oo.Oooo000.OooO00o(roomMoraGameListDialog.getContext());
            oooO00o2.f43126OooO0OO = roshamboModel.getGiftImage();
            oooO00o2.f43124OooO00o = 0;
            oooO00o2.OooO00o(d1.OooO0O0());
            oooO00o2.OooO0Oo((ImageView) helper.getView(o0OO00O.iv_mora_gift_icon));
            int moranum = roshamboModel.getMoranum() / 100;
            View view = helper.getView(o0OO00O.iv_hundred);
            Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
            RoomMoraGameListDialog.OooOOO0((ImageView) view, moranum);
            int moranum2 = (roshamboModel.getMoranum() % 100) / 10;
            View view2 = helper.getView(o0OO00O.iv_ten);
            Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
            RoomMoraGameListDialog.OooOOO0((ImageView) view2, moranum2);
            int moranum3 = (roshamboModel.getMoranum() % 100) % 10;
            View view3 = helper.getView(o0OO00O.iv_one);
            Intrinsics.checkNotNullExpressionValue(view3, "getView(...)");
            RoomMoraGameListDialog.OooOOO0((ImageView) view3, moranum3);
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            Long l = (Long) o0O00oO0.OooOOo0().getValue();
            long userId = roshamboModel.getUserId();
            if (l != null && l.longValue() == userId) {
                helper.setVisible(o0OO00O.iv_mora_pk, false);
                return;
            } else {
                helper.setVisible(o0OO00O.iv_mora_pk, true);
                return;
            }
        }
        int i2 = RoomMoraGameListDialog.f27488OooOOO0;
        if (roshamboModel == null) {
            roomMoraGameListDialog.getClass();
            return;
        }
        o0OOo0Oo.Oooo000.OooO00o oooO00o3 = new o0OOo0Oo.Oooo000.OooO00o(roomMoraGameListDialog.getContext());
        String headphoto2 = roshamboModel.getHeadphoto();
        float f = 30;
        int iOooO00o3 = o0000O0.OooO00o(f);
        oooO00o3.f43126OooO0OO = p184o00o00O0.OooO0OO.OooO0oo(iOooO00o3, iOooO00o3, headphoto2);
        oooO00o3.f43124OooO00o = 0;
        oooO00o3.OooO00o(d1.OooO0OO());
        oooO00o3.f43129OooO0o0 = true;
        oooO00o3.OooO0Oo((ImageView) helper.getView(o0OO00O.niv_header));
        o0OOo0Oo.Oooo000.OooO00o oooO00o4 = new o0OOo0Oo.Oooo000.OooO00o(roomMoraGameListDialog.getContext());
        String toHeadphoto = roshamboModel.getToHeadphoto();
        int iOooO00o4 = o0000O0.OooO00o(f);
        oooO00o4.f43126OooO0OO = p184o00o00O0.OooO0OO.OooO0oo(iOooO00o4, iOooO00o4, toHeadphoto);
        oooO00o4.f43124OooO00o = 0;
        oooO00o4.OooO00o(d1.OooO0OO());
        oooO00o4.f43129OooO0o0 = true;
        oooO00o4.OooO0Oo((ImageView) helper.getView(o0OO00O.niv_header2));
        helper.setText(o0OO00O.tv_name, roshamboModel.getName());
        helper.setText(o0OO00O.tv_name2, roshamboModel.getToNickname());
        o0OOo0Oo.Oooo000.OooO00o oooO00o5 = new o0OOo0Oo.Oooo000.OooO00o(roomMoraGameListDialog.getContext());
        oooO00o5.f43126OooO0OO = roshamboModel.getGiftImage();
        oooO00o5.f43124OooO00o = 0;
        oooO00o5.OooO00o(d1.OooO0O0());
        oooO00o5.OooO0Oo((ImageView) helper.getView(o0OO00O.iv_mora_gift_icon));
        int moranum4 = roshamboModel.getMoranum() / 100;
        View view4 = helper.getView(o0OO00O.iv_hundred);
        Intrinsics.checkNotNullExpressionValue(view4, "getView(...)");
        RoomMoraGameListDialog.OooOOO0((ImageView) view4, moranum4);
        int moranum5 = (roshamboModel.getMoranum() % 100) / 10;
        View view5 = helper.getView(o0OO00O.iv_ten);
        Intrinsics.checkNotNullExpressionValue(view5, "getView(...)");
        RoomMoraGameListDialog.OooOOO0((ImageView) view5, moranum5);
        int moranum6 = (roshamboModel.getMoranum() % 100) % 10;
        View view6 = helper.getView(o0OO00O.iv_one);
        Intrinsics.checkNotNullExpressionValue(view6, "getView(...)");
        RoomMoraGameListDialog.OooOOO0((ImageView) view6, moranum6);
        o0O00oO0 o0o00oo2 = o0O00oO0.f47936OooO00o;
        Long l2 = (Long) o0O00oO0.OooOOo0().getValue();
        long toUserId = roshamboModel.getToUserId();
        if (l2 != null && l2.longValue() == toUserId) {
            helper.setVisible(o0OO00O.iv_mora_pk, true);
        } else {
            helper.setVisible(o0OO00O.iv_mora_pk, false);
        }
    }
}
