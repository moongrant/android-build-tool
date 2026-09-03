package com.yalla.yalla.ui.activity.message;

import android.app.NotificationManager;
import androidx.lifecycle.Observer;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.ui.adapter.PrivateChatAdapter;
import com.yalla.yalla.ui.view.HeaderLayout;
import com.yalla.yalla.ui.view.UserPremiumView;
import com.yalla.yalla.ui.view.UserVipView;
import com.yalla.yalla.ui.view.UserWealthTagView;
import com.yalla.yalla.ui.vm.UserBlackVM;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o00000 implements Observer<UserInfo> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PrivateChatActivity f25795OooO0Oo;

    public o00000(PrivateChatActivity privateChatActivity) {
        this.f25795OooO0Oo = privateChatActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(UserInfo userInfo) {
        UserWealthTagView f30478Ooooo0o;
        UserVipView f30476OoooOoo;
        UserPremiumView f30475OoooOoO;
        UserInfo userInfo2 = userInfo;
        if (userInfo2 == null) {
            return;
        }
        Intrinsics.checkNotNullParameter("Yalla_Notice_FriendRequest", ViewHierarchyConstants.TAG_KEY);
        Object systemService = com.code.android.util.o000O0.OooO00o().getSystemService("notification");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).cancel("Yalla_Notice_FriendRequest", 0);
        PrivateChatActivity privateChatActivity = this.f25795OooO0Oo;
        HeaderLayout headerLayout = privateChatActivity.f22755OooOO0;
        if (headerLayout != null && (f30475OoooOoO = headerLayout.getF30475OoooOoO()) != null) {
            f30475OoooOoO.OooO0Oo(userInfo2.getPremiumLevel(), userInfo2.isPremium());
        }
        int i = PrivateChatActivity.f25694Oooo000;
        PrivateChatAdapter privateChatAdapterOooOo0O = privateChatActivity.OooOo0O();
        privateChatAdapterOooOo0O.getClass();
        Intrinsics.checkNotNullParameter(userInfo2, "userInfo");
        privateChatAdapterOooOo0O.f27435OooOOoo = userInfo2;
        HeaderLayout headerLayout2 = privateChatActivity.f22755OooOO0;
        if (headerLayout2 != null && (f30476OoooOoo = headerLayout2.getF30476OoooOoo()) != null) {
            f30476OoooOoo.OooOOOO(userInfo2.getVipLevel(), true, privateChatActivity);
        }
        HeaderLayout headerLayout3 = privateChatActivity.f22755OooOO0;
        if (headerLayout3 != null && (f30478Ooooo0o = headerLayout3.getF30478Ooooo0o()) != null) {
            Integer numValueOf = Integer.valueOf(userInfo2.getWealthLevel());
            String wealthBadgeWithBg = userInfo2.getWealthBadgeWithBg();
            int i2 = UserWealthTagView.f30812OooO0o0;
            f30478Ooooo0o.OooO0O0(privateChatActivity, numValueOf, wealthBadgeWithBg, 10.0f);
        }
        if (com.code.android.util.OooOo00.OooO00o(userInfo2)) {
            privateChatActivity.OooOo().getGiftSendUser().getUserHeader().setValue("");
        } else {
            float f = 24;
            privateChatActivity.OooOo().getGiftSendUser().getUserHeader().setValue(p139o00OOooO.OooO0o.OooO0oo(com.code.android.util.o0000O0.OooO00o(f), com.code.android.util.o0000O0.OooO00o(f), userInfo2.getUserHeader()));
        }
        HeaderLayout headerLayout4 = privateChatActivity.f22755OooOO0;
        if (headerLayout4 != null) {
            headerLayout4.setYallaVisible(userInfo2.isOfficialRole());
        }
        ((UserBlackVM) privateChatActivity.f25704OooOoO0.getValue()).checkIsFriendAndBlock(userInfo2.getUserId());
    }
}
