package com.yalla.yalla.ui.activity.message;

import android.app.NotificationManager;
import android.view.View;
import androidx.lifecycle.Observer;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.model.room.RoomItemInfoModel;
import com.yalla.yalla.model.room.RoomItemInfoModelTag;
import com.yalla.yalla.ui.activity.room.RoomSettingActivity;
import com.yalla.yalla.ui.adapter.PrivateChatAdapter;
import com.yalla.yalla.ui.view.HeaderLayout;
import com.yalla.yalla.ui.view.UserPremiumView;
import com.yalla.yalla.ui.view.UserVipView;
import com.yalla.yalla.ui.view.UserWealthTagView;
import com.yalla.yalla.ui.vm.UserBlackVM;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p675oO0Oo.oOO0OO;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o000000O implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f25344OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ View.OnClickListener f25345OooO0o0;

    public /* synthetic */ o000000O(int i, View.OnClickListener onClickListener) {
        this.f25344OooO0Oo = i;
        this.f25345OooO0o0 = onClickListener;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        UserWealthTagView f29943Ooooo0o;
        UserVipView f29941OoooOoo;
        UserPremiumView f29940OoooOoO;
        int i = this.f25344OooO0Oo;
        int i2 = 0;
        View.OnClickListener onClickListener = this.f25345OooO0o0;
        switch (i) {
            case 0:
                PrivateChatActivity this$0 = (PrivateChatActivity) onClickListener;
                UserInfo userInfo = (UserInfo) obj;
                int i3 = PrivateChatActivity.f25240Oooo000;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (userInfo != null) {
                    Intrinsics.checkNotNullParameter("Yalla_Notice_FriendRequest", ViewHierarchyConstants.TAG_KEY);
                    Object systemService = com.code.android.util.o000O00O.OooO00o().getSystemService("notification");
                    Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
                    ((NotificationManager) systemService).cancel("Yalla_Notice_FriendRequest", 0);
                    HeaderLayout headerLayout = this$0.f22289OooOO0;
                    if (headerLayout != null && (f29940OoooOoO = headerLayout.getF29940OoooOoO()) != null) {
                        f29940OoooOoO.OooO0Oo(userInfo.getPremiumLevel(), userInfo.isPremium());
                    }
                    PrivateChatAdapter privateChatAdapterOooOo0O = this$0.OooOo0O();
                    privateChatAdapterOooOo0O.getClass();
                    Intrinsics.checkNotNullParameter(userInfo, "userInfo");
                    privateChatAdapterOooOo0O.f26971OooOOoo = userInfo;
                    HeaderLayout headerLayout2 = this$0.f22289OooOO0;
                    if (headerLayout2 != null && (f29941OoooOoo = headerLayout2.getF29941OoooOoo()) != null) {
                        f29941OoooOoo.OooOOOO(userInfo.getVipLevel(), true, this$0);
                    }
                    HeaderLayout headerLayout3 = this$0.f22289OooOO0;
                    if (headerLayout3 != null && (f29943Ooooo0o = headerLayout3.getF29943Ooooo0o()) != null) {
                        Integer numValueOf = Integer.valueOf(userInfo.getWealthLevel());
                        String wealthBadgeWithBg = userInfo.getWealthBadgeWithBg();
                        int i4 = UserWealthTagView.f30277OooO0o0;
                        f29943Ooooo0o.OooO0O0(this$0, numValueOf, wealthBadgeWithBg, 10.0f);
                    }
                    if (com.code.android.util.OooOo00.OooO00o(userInfo)) {
                        this$0.OooOo().getGiftSendUser().getUserHeader().setValue("");
                    } else {
                        float f = 24;
                        this$0.OooOo().getGiftSendUser().getUserHeader().setValue(p184o00o00O0.OooO0OO.OooO0oo(com.code.android.util.o0000O0.OooO00o(f), com.code.android.util.o0000O0.OooO00o(f), userInfo.getUserHeader()));
                    }
                    HeaderLayout headerLayout4 = this$0.f22289OooOO0;
                    if (headerLayout4 != null) {
                        headerLayout4.setYallaVisible(userInfo.isOfficialRole());
                    }
                    ((UserBlackVM) this$0.f25250OooOoO0.getValue()).checkIsFriendAndBlock(userInfo.getUserId());
                    break;
                }
                break;
            case 1:
                RoomSettingActivity this$1 = (RoomSettingActivity) onClickListener;
                int i5 = RoomSettingActivity.f26193Oooo00O;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                for (Object obj2 : this$1.f26197OooOo00) {
                    int i6 = i2 + 1;
                    if (i2 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    RoomItemInfoModel roomItemInfoModel = (RoomItemInfoModel) obj2;
                    if (roomItemInfoModel.getTag() == RoomItemInfoModelTag.AllowOpenApplyMic) {
                        roomItemInfoModel.setTurnOnSwitch(Boolean.valueOf(com.yalla.yalla.service.room.OooO00o.f24525OooO0oO.OooO()));
                        this$1.OooOo().notifyDataSetChanged();
                    }
                    i2 = i6;
                }
                break;
            default:
                oOO0OO this$2 = (oOO0OO) onClickListener;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                this$2.OooOOOo();
                break;
        }
    }
}
