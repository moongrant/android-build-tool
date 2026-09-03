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
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0O00 extends p564o0oOo0OO.o000O<RoomIndexModel> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ MainSearchRoomFragment f28942OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0O00(MainSearchRoomFragment mainSearchRoomFragment, Context context, int i) {
        super(context, i);
        this.f28942OooOoo0 = mainSearchRoomFragment;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder helper = (ViewHolder) baseViewHolder;
        RoomIndexModel roomIndexModel = (RoomIndexModel) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        if (roomIndexModel == null) {
            return;
        }
        o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(this.f10108OooOOOo);
        oooO00o.OooO00o(p543o0oO0O00.OooO.OooO0o());
        oooO00o.f43911OooO0OO = roomIndexModel.barimage;
        oooO00o.f43909OooO00o = 0;
        oooO00o.OooO0Oo((ImageView) helper.getView(oO00O0oO.head_pic));
        int i = oO00O0oO.iv_lock;
        String str = roomIndexModel.isencrypt;
        String str2 = AppEventsConstants.EVENT_PARAM_VALUE_NO;
        helper.setGone(i, !Intrinsics.areEqual(AppEventsConstants.EVENT_PARAM_VALUE_NO, str));
        helper.setGone(oO00O0oO.iv_official, roomIndexModel.isofficial == 1);
        int i2 = oO00O0oO.iv_honor;
        helper.setGone(i2, true);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) helper.getView(i2);
        lottieAnimationView.OooO0OO();
        if (Intrinsics.areEqual("4", roomIndexModel.bartype)) {
            helper.setImageResource(i2, oOo00OO0.upgraderoom_crown_somall);
        } else if (Intrinsics.areEqual(FeedbackType.Recharge, roomIndexModel.bartype)) {
            helper.setImageResource(i2, oOo00OO0.room_dreamland1);
        } else if (Intrinsics.areEqual(FeedbackType.Suggestions, roomIndexModel.bartype)) {
            helper.setImageResource(i2, oOo00OO0.room_princess_garden1);
        } else if (Intrinsics.areEqual(FeedbackType.Others, roomIndexModel.bartype)) {
            lottieAnimationView.setAnimation("lottie/lottie_anim_upgraderoom_sky.json");
            lottieAnimationView.setRepeatCount(-1);
            lottieAnimationView.OooO0oO();
        } else {
            helper.setImageResource(i2, oOo00OO0.upgraderoom_crown_somall);
            helper.setGone(i2, false);
        }
        TextView textView = (TextView) helper.getView(oO00O0oO.tv_room_name);
        int i3 = oO00O0o.color_00d8c9;
        int iOooO00o = com.code.android.util.o0000.OooO00o(i3);
        String str3 = roomIndexModel.barname;
        MainSearchRoomFragment mainSearchRoomFragment = this.f28942OooOoo0;
        textView.setText(p590o0oo0.OooOOOO.OooO0O0(iOooO00o, str3, mainSearchRoomFragment.searchText));
        ((TextView) helper.getView(oO00O0oO.tv_id)).setText(p590o0oo0.OooOOOO.OooO0O0(com.code.android.util.o0000.OooO00o(i3), o00O00OO.OooO00o("ID:", roomIndexModel.baridx), mainSearchRoomFragment.searchText));
        int i4 = oO00O0oO.tv_online_num;
        String str4 = roomIndexModel.onlinenum;
        if (str4 != null) {
            str2 = str4;
        }
        helper.setText(i4, str2);
        helper.getView(oO00O0oO.item_bg).setOnClickListener(new oo0o0Oo(this, roomIndexModel));
        View view = helper.getView(oO00O0oO.sv_room_id);
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.yalla.yalla.ui.view.UserPrettyIdView");
        ((UserPrettyIdView) view).setRoomPrettyId(roomIndexModel.isPrettyBarId);
    }
}
