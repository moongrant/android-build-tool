package com.yalla.yalla.ui.adapter;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.base.paging.PagingViewHolder;
import com.yalla.yalla.data.db.table.FriendInfo;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.ui.view.UserTagView;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o000OO00 extends p400o0Oo0OO.OooOO0O<FriendInfo> {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f27542OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public final ComponentActivity f27543OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final LinkedHashSet<Long> f27544OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public String f27545OooOo00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OO00(@NotNull ComponentActivity activity) {
        super(Integer.valueOf(oO00OO0O.message_item_share_to_friends), o000OOo0.f27549OooO00o);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f27543OooOOo0 = activity;
        this.f27544OooOOoo = new LinkedHashSet<>();
        this.f27545OooOo00 = "";
    }

    public static void OooO0oO(o000OO00 o000oo01, int i, long j, Function1 action, int i2) {
        if ((i2 & 1) != 0) {
            i = -1;
        }
        if ((i2 & 2) != 0) {
            j = 0;
        }
        if ((i2 & 4) != 0) {
            action = o000O.f27494OooO0Oo;
        }
        o000oo01.getClass();
        Intrinsics.checkNotNullParameter(action, "action");
        if (i <= -1) {
            int itemCount = o000oo01.getItemCount();
            for (int i3 = 0; i3 < itemCount; i3++) {
                if (o000oo01.getData(i3).getFriend().getFriendId() == j) {
                    i = i3;
                }
            }
        }
        if (i == -1) {
            return;
        }
        long friendId = o000oo01.getData(i).getFriend().getFriendId();
        LinkedHashSet<Long> linkedHashSet = o000oo01.f27544OooOOoo;
        if (linkedHashSet.contains(Long.valueOf(friendId))) {
            linkedHashSet.remove(Long.valueOf(friendId));
        } else if (linkedHashSet.size() > 6) {
            action.invoke(Boolean.FALSE);
        } else {
            linkedHashSet.add(Long.valueOf(friendId));
            action.invoke(Boolean.TRUE);
        }
        o000oo01.notifyItemChanged(i);
    }

    @Override // p400o0Oo0OO.OooOO0O
    public final void OooO0o(PagingViewHolder holder, FriendInfo friendInfo) {
        String memoName;
        FriendInfo item = friendInfo;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        UserInfo userInfo = item.getUserInfo();
        if (userInfo == null) {
            userInfo = new UserInfo();
        }
        ImageView imageView = (ImageView) holder.getView(oO00O0oO.ivSelect);
        if (this.f27542OooOOo) {
            imageView.setSelected(this.f27544OooOOoo.contains(Long.valueOf(item.getFriend().getFriendId())));
            com.code.android.util.o000OO00.OooOOOO(imageView);
        } else {
            com.code.android.util.o000OO00.OooO0O0(imageView);
        }
        o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(holder.itemView.getContext());
        oooO00o.OooO00o(p543o0oO0O00.OooO.OooO0OO());
        oooO00o.f43911OooO0OO = userInfo.getUserHeader();
        oooO00o.f43909OooO00o = 0;
        oooO00o.OooO0Oo((ImageView) holder.getView(oO00O0oO.friendHead));
        TextView textView = (TextView) holder.getView(oO00O0oO.tvFriendName);
        String memoName2 = item.getFriend().getMemoName();
        if (memoName2 == null || StringsKt.isBlank(memoName2)) {
            UserInfo userInfo2 = item.getUserInfo();
            memoName = userInfo2 != null ? userInfo2.getUserName() : null;
        } else {
            memoName = item.getFriend().getMemoName();
        }
        textView.setText(memoName);
        TextView textView2 = (TextView) holder.getView(oO00O0oO.tvBio);
        if (!StringsKt.isBlank(this.f27545OooOo00)) {
            int i = oO00O0o.color_00d8c9;
            p417o0OoO0.o000O0o.OooO0Oo(textView, com.code.android.util.o0000.OooO00o(i), this.f27545OooOo00);
            String memoName3 = item.getFriend().getMemoName();
            if (!(memoName3 == null || StringsKt.isBlank(memoName3)) && StringsKt__StringsKt.contains(userInfo.getUserName(), this.f27545OooOo00, true)) {
                textView2.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.User_Edit_Remark_name) + ZegoConstants.ZegoVideoDataAuxPublishingStream + userInfo.getUserName());
                com.code.android.util.o000OO00.OooOOOO(textView2);
            } else if (StringsKt.OooO0o(userInfo.getUserIdx(), this.f27545OooOo00)) {
                textView2.setText("ID:" + userInfo.getUserIdx());
                com.code.android.util.o000OO00.OooOOOO(textView2);
            } else {
                com.code.android.util.o000OO00.OooO0O0(textView2);
            }
            p417o0OoO0.o000O0o.OooO0Oo(textView2, com.code.android.util.o0000.OooO00o(i), this.f27545OooOo00);
        } else {
            com.code.android.util.o000OO00.OooOOOO(textView2);
            String bio = userInfo.getBio();
            textView2.setText(bio == null || StringsKt.isBlank(bio) ? "" : userInfo.getBio());
        }
        UserTagView userTagView = (UserTagView) holder.getView(oO00O0oO.userTagView);
        userTagView.OooO0oo(userInfo.getPremiumLevel(), userInfo.isPremium());
        int vipLevel = userInfo.getVipLevel();
        ComponentActivity componentActivity = this.f27543OooOOo0;
        userTagView.OooO0Oo(vipLevel, true, componentActivity);
        userTagView.setSex(userInfo.getSex());
        UserTagView.OooOO0o(userTagView, componentActivity, Integer.valueOf(userInfo.getWealthLevel()), userInfo.getWealthBadgeWithBg(), 8);
        userTagView.setPremiumSize(18);
        userTagView.setKaVipSize(18);
        userTagView.setSexSize(15);
    }
}
