package com.yalla.yalla.ui.fragment;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.facebook.appevents.AppEventsConstants;
import com.yalla.yalla.data.constant.FeedbackType;
import com.yalla.yalla.model.room.RoomIndexModel;
import com.yalla.yalla.ui.view.UserPrettyIdView;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.jvm.internal.Intrinsics;
import p022Oooo00O.o00O00OO;
import p605o0oo0O0O.o0O0O0Oo;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
public final class o000000 extends p571o0oOoO0.o0000oo<RoomIndexModel> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ MainSearchRoomFragment f28360OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000000(MainSearchRoomFragment mainSearchRoomFragment, Context context, int i) {
        super(context, i);
        this.f28360OooOoo0 = mainSearchRoomFragment;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder helper = (ViewHolder) baseViewHolder;
        RoomIndexModel roomIndexModel = (RoomIndexModel) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        if (roomIndexModel == null) {
            return;
        }
        o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(this.f13186OooOOOo);
        oooO00o.OooO00o(d1.OooO0o());
        oooO00o.f43126OooO0OO = roomIndexModel.barimage;
        oooO00o.f43124OooO00o = 0;
        oooO00o.OooO0Oo((ImageView) helper.getView(p562o0oOo000.o0OO00O.head_pic));
        int i = p562o0oOo000.o0OO00O.iv_lock;
        String str = roomIndexModel.isencrypt;
        String str2 = AppEventsConstants.EVENT_PARAM_VALUE_NO;
        helper.setGone(i, !Intrinsics.areEqual(AppEventsConstants.EVENT_PARAM_VALUE_NO, str));
        helper.setGone(p562o0oOo000.o0OO00O.iv_official, roomIndexModel.isofficial == 1);
        int i2 = p562o0oOo000.o0OO00O.iv_honor;
        helper.setGone(i2, true);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) helper.getView(i2);
        lottieAnimationView.OooO0OO();
        if (Intrinsics.areEqual("4", roomIndexModel.bartype)) {
            helper.setImageResource(i2, p562o0oOo000.o0Oo0oo.upgraderoom_crown_somall);
        } else if (Intrinsics.areEqual(FeedbackType.Recharge, roomIndexModel.bartype)) {
            helper.setImageResource(i2, p562o0oOo000.o0Oo0oo.room_dreamland1);
        } else if (Intrinsics.areEqual(FeedbackType.Suggestions, roomIndexModel.bartype)) {
            helper.setImageResource(i2, p562o0oOo000.o0Oo0oo.room_princess_garden1);
        } else if (Intrinsics.areEqual(FeedbackType.Others, roomIndexModel.bartype)) {
            lottieAnimationView.setAnimation("lottie/lottie_anim_upgraderoom_sky.json");
            lottieAnimationView.setRepeatCount(-1);
            lottieAnimationView.OooO0oO();
        } else {
            helper.setImageResource(i2, p562o0oOo000.o0Oo0oo.upgraderoom_crown_somall);
            helper.setGone(i2, false);
        }
        TextView textView = (TextView) helper.getView(p562o0oOo000.o0OO00O.tv_room_name);
        int i3 = p562o0oOo000.o0OOO0o.color_00d8c9;
        int iOooO00o = com.code.android.util.o0000.OooO00o(i3);
        String str3 = roomIndexModel.barname;
        MainSearchRoomFragment mainSearchRoomFragment = this.f28360OooOoo0;
        textView.setText(o0O0O0Oo.OooO0O0(iOooO00o, str3, mainSearchRoomFragment.searchText));
        ((TextView) helper.getView(p562o0oOo000.o0OO00O.tv_id)).setText(o0O0O0Oo.OooO0O0(com.code.android.util.o0000.OooO00o(i3), o00O00OO.OooO00o("ID:", roomIndexModel.baridx), mainSearchRoomFragment.searchText));
        int i4 = p562o0oOo000.o0OO00O.tv_online_num;
        String str4 = roomIndexModel.onlinenum;
        if (str4 != null) {
            str2 = str4;
        }
        helper.setText(i4, str2);
        helper.getView(p562o0oOo000.o0OO00O.item_bg).setOnClickListener(new o000OOo(this, roomIndexModel));
        View view = helper.getView(p562o0oOo000.o0OO00O.sv_room_id);
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.yalla.yalla.ui.view.UserPrettyIdView");
        ((UserPrettyIdView) view).setRoomPrettyId(roomIndexModel.isPrettyBarId);
    }
}
