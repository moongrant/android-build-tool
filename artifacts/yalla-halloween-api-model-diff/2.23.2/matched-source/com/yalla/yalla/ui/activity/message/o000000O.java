package com.yalla.yalla.ui.activity.message;

import android.app.NotificationManager;
import android.os.Looper;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import com.app.base.protobuf.room.Room;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.model.room.RoomItemInfoModel;
import com.yalla.yalla.model.room.RoomItemInfoModelTag;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.ui.activity.room.RoomSettingActivity;
import com.yalla.yalla.ui.adapter.PrivateChatAdapter;
import com.yalla.yalla.ui.fragment.StoreCoinFragment;
import com.yalla.yalla.ui.view.HeaderLayout;
import com.yalla.yalla.ui.view.UserPremiumView;
import com.yalla.yalla.ui.view.UserVipView;
import com.yalla.yalla.ui.view.UserWealthTagView;
import com.yalla.yalla.ui.vm.UserBlackVM;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p650o0ooo.o0OOOO0o;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o000000O implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f25345OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ View.OnClickListener f25346OooO0o0;

    public /* synthetic */ o000000O(int i, View.OnClickListener onClickListener) {
        this.f25345OooO0Oo = i;
        this.f25346OooO0o0 = onClickListener;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        UserWealthTagView f29933Ooooo0o;
        UserVipView f29931OoooOoo;
        UserPremiumView f29930OoooOoO;
        int i = this.f25345OooO0Oo;
        int i2 = 0;
        View.OnClickListener onClickListener = this.f25346OooO0o0;
        switch (i) {
            case 0:
                PrivateChatActivity this$0 = (PrivateChatActivity) onClickListener;
                UserInfo userInfo = (UserInfo) obj;
                int i3 = PrivateChatActivity.f25239Oooo000;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (userInfo != null) {
                    Intrinsics.checkNotNullParameter("Yalla_Notice_FriendRequest", ViewHierarchyConstants.TAG_KEY);
                    Object systemService = com.code.android.util.o000O00O.OooO00o().getSystemService("notification");
                    Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
                    ((NotificationManager) systemService).cancel("Yalla_Notice_FriendRequest", 0);
                    HeaderLayout headerLayout = this$0.f22282OooOO0;
                    if (headerLayout != null && (f29930OoooOoO = headerLayout.getF29930OoooOoO()) != null) {
                        f29930OoooOoO.OooO0Oo(userInfo.getPremiumLevel(), userInfo.isPremium());
                    }
                    PrivateChatAdapter privateChatAdapterOooOo0O = this$0.OooOo0O();
                    privateChatAdapterOooOo0O.getClass();
                    Intrinsics.checkNotNullParameter(userInfo, "userInfo");
                    privateChatAdapterOooOo0O.f26970OooOOoo = userInfo;
                    HeaderLayout headerLayout2 = this$0.f22282OooOO0;
                    if (headerLayout2 != null && (f29931OoooOoo = headerLayout2.getF29931OoooOoo()) != null) {
                        f29931OoooOoo.OooOOOO(userInfo.getVipLevel(), true, this$0);
                    }
                    HeaderLayout headerLayout3 = this$0.f22282OooOO0;
                    if (headerLayout3 != null && (f29933Ooooo0o = headerLayout3.getF29933Ooooo0o()) != null) {
                        Integer numValueOf = Integer.valueOf(userInfo.getWealthLevel());
                        String wealthBadgeWithBg = userInfo.getWealthBadgeWithBg();
                        int i4 = UserWealthTagView.f30267OooO0o0;
                        f29933Ooooo0o.OooO0O0(this$0, numValueOf, wealthBadgeWithBg, 10.0f);
                    }
                    if (com.code.android.util.OooOo00.OooO00o(userInfo)) {
                        this$0.OooOo().getGiftSendUser().getUserHeader().setValue("");
                    } else {
                        float f = 24;
                        this$0.OooOo().getGiftSendUser().getUserHeader().setValue(p184o00o00O0.OooO0OO.OooO0oo(com.code.android.util.o0000O0.OooO00o(f), com.code.android.util.o0000O0.OooO00o(f), userInfo.getUserHeader()));
                    }
                    HeaderLayout headerLayout4 = this$0.f22282OooOO0;
                    if (headerLayout4 != null) {
                        headerLayout4.setYallaVisible(userInfo.isOfficialRole());
                    }
                    ((UserBlackVM) this$0.f25249OooOoO0.getValue()).checkIsFriendAndBlock(userInfo.getUserId());
                    break;
                }
                break;
            case 1:
                RoomSettingActivity this$1 = (RoomSettingActivity) onClickListener;
                int i5 = RoomSettingActivity.f26191Oooo00O;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                for (Object obj2 : this$1.f26195OooOo00) {
                    int i6 = i2 + 1;
                    if (i2 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    RoomItemInfoModel roomItemInfoModel = (RoomItemInfoModel) obj2;
                    if (roomItemInfoModel.getTag() == RoomItemInfoModelTag.AllowOpenApplyMic) {
                        roomItemInfoModel.setTurnOnSwitch(Boolean.valueOf(com.yalla.yalla.service.room.OooO00o.f24517OooO0oO.OooO()));
                        this$1.OooOo().notifyDataSetChanged();
                    }
                    i2 = i6;
                }
                break;
            case 2:
                o0OOOO0o this$2 = (o0OOOO0o) onClickListener;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.app.base.protobuf.room.Room.GetBonusReply");
                Room.GetBonusReply getBonusReply = (Room.GetBonusReply) obj;
                long j = this$2.f58705OooOOO;
                if (j > 0 && j == getBonusReply.getBonusid() && !this$2.f58706OooOOO0) {
                    int state = getBonusReply.getState();
                    if (state == this$2.f58713OooOo0) {
                        this$2.f58706OooOOO0 = true;
                        this$2.OooOO0().f43924OooO0OO.setVisibility(4);
                        this$2.OooOO0().f43927OooO0o0.setVisibility(4);
                        this$2.OooOO0().f43925OooO0Oo.setVisibility(0);
                        this$2.OooOO0().f43926OooO0o.setVisibility(0);
                        this$2.OooOO0().f43932OooOO0o.setText(String.valueOf(getBonusReply.getBonuscount()));
                        if (getBonusReply.getBonustype() == 2) {
                            o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(this$2.f58507OooO0Oo);
                            oooO00o.f43126OooO0OO = p184o00o00O0.OooO0OO.OooO0Oo(getBonusReply.getGiftimg());
                            oooO00o.f43124OooO00o = 0;
                            oooO00o.f43138OooOOOo = p562o0oOo000.o0Oo0oo.room_dialog_lucky_golds_send_gift_item_default;
                            oooO00o.OooO0Oo(this$2.OooOO0().f43933OooOOO);
                        } else {
                            this$2.OooOO0().f43933OooOOO.setImageResource(p562o0oOo000.o0Oo0oo.coin3);
                        }
                        break;
                    } else if (state == this$2.f58715OooOo0O) {
                        this$2.OooOO0o(getBonusReply.getBonustype(), getBonusReply.getBonusid());
                        break;
                    } else if (state == this$2.f58716OooOo0o || state == this$2.f58712OooOo) {
                        String strOooO0OO = com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.lucky_golds_max_today);
                        if (((strOooO0OO == null || StringsKt.isBlank(strOooO0OO)) ? 1 : 0) == 0) {
                            com.code.android.util.o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(strOooO0OO, "runnable");
                            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                o000oo0OooO00o.run();
                            } else {
                                com.code.android.util.o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                            }
                            break;
                        }
                    }
                }
                break;
            default:
                StoreCoinFragment this$3 = (StoreCoinFragment) onClickListener;
                String url = (String) obj;
                Intrinsics.checkNotNullParameter(this$3, "this$0");
                o0oo0000.OooO00o.OooO0O0("105035");
                if (!com.code.android.util.OooOo00.OooO00o(url)) {
                    WebPageInfo webPageInfo = new WebPageInfo(WebFrom.StoreCoin);
                    Intrinsics.checkNotNull(url);
                    Intrinsics.checkNotNullParameter(url, "url");
                    webPageInfo.f32283OooO0o0 = url;
                    webPageInfo.f32280OooO = true;
                    webPageInfo.OooO0Oo(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.room_unique_id));
                    int i7 = WebActivity.f25130OooOoO0;
                    FragmentActivity fragmentActivityRequireActivity = this$3.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                    WebActivity.OooO00o.OooO00o(fragmentActivityRequireActivity, webPageInfo);
                    break;
                }
                break;
        }
    }
}
