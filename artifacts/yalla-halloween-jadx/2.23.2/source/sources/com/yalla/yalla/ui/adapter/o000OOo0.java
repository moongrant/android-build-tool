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
import p642o0ooOOO0.d1;
import p643o0ooOOOO.h3;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o000OOo0 extends h3<FriendInfo> {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f27084OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public final ComponentActivity f27085OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final LinkedHashSet<Long> f27086OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public String f27087OooOo00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OOo0(@NotNull ComponentActivity activity) {
        super(Integer.valueOf(p562o0oOo000.oo0o0Oo.message_item_share_to_friends), o00.f26994OooO00o);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f27085OooOOo0 = activity;
        this.f27086OooOOoo = new LinkedHashSet<>();
        this.f27087OooOo00 = "";
    }

    public static void OooO0oO(o000OOo0 o000ooo1, int i, long j, Function1 action, int i2) {
        if ((i2 & 1) != 0) {
            i = -1;
        }
        if ((i2 & 2) != 0) {
            j = 0;
        }
        if ((i2 & 4) != 0) {
            action = o000OO00.f27079OooO0Oo;
        }
        o000ooo1.getClass();
        Intrinsics.checkNotNullParameter(action, "action");
        if (i <= -1) {
            int itemCount = o000ooo1.getItemCount();
            for (int i3 = 0; i3 < itemCount; i3++) {
                if (o000ooo1.getData(i3).getFriend().getFriendId() == j) {
                    i = i3;
                }
            }
        }
        if (i == -1) {
            return;
        }
        long friendId = o000ooo1.getData(i).getFriend().getFriendId();
        LinkedHashSet<Long> linkedHashSet = o000ooo1.f27086OooOOoo;
        if (linkedHashSet.contains(Long.valueOf(friendId))) {
            linkedHashSet.remove(Long.valueOf(friendId));
        } else if (linkedHashSet.size() > 6) {
            action.invoke(Boolean.FALSE);
        } else {
            linkedHashSet.add(Long.valueOf(friendId));
            action.invoke(Boolean.TRUE);
        }
        o000ooo1.notifyItemChanged(i);
    }

    @Override // p643o0ooOOOO.h3
    public final void OooO0o(PagingViewHolder holder, FriendInfo friendInfo) {
        String memoName;
        FriendInfo item = friendInfo;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        UserInfo userInfo = item.getUserInfo();
        if (userInfo == null) {
            userInfo = new UserInfo();
        }
        ImageView imageView = (ImageView) holder.getView(p562o0oOo000.o0OO00O.ivSelect);
        if (this.f27084OooOOo) {
            imageView.setSelected(this.f27086OooOOoo.contains(Long.valueOf(item.getFriend().getFriendId())));
            com.code.android.util.o000O.OooOOOO(imageView);
        } else {
            com.code.android.util.o000O.OooO0O0(imageView);
        }
        o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(holder.itemView.getContext());
        oooO00o.OooO00o(d1.OooO0OO());
        oooO00o.f43126OooO0OO = userInfo.getUserHeader();
        oooO00o.f43124OooO00o = 0;
        oooO00o.OooO0Oo((ImageView) holder.getView(p562o0oOo000.o0OO00O.friendHead));
        TextView textView = (TextView) holder.getView(p562o0oOo000.o0OO00O.tvFriendName);
        String memoName2 = item.getFriend().getMemoName();
        if (memoName2 == null || StringsKt.isBlank(memoName2)) {
            UserInfo userInfo2 = item.getUserInfo();
            memoName = userInfo2 != null ? userInfo2.getUserName() : null;
        } else {
            memoName = item.getFriend().getMemoName();
        }
        textView.setText(memoName);
        TextView textView2 = (TextView) holder.getView(p562o0oOo000.o0OO00O.tvBio);
        if (!StringsKt.isBlank(this.f27087OooOo00)) {
            int i = p562o0oOo000.o0OOO0o.color_00d8c9;
            p423o0OoO0OO.o00O0O0O.OooO0Oo(textView, com.code.android.util.o0000.OooO00o(i), this.f27087OooOo00);
            String memoName3 = item.getFriend().getMemoName();
            if (!(memoName3 == null || StringsKt.isBlank(memoName3)) && StringsKt__StringsKt.contains(userInfo.getUserName(), this.f27087OooOo00, true)) {
                textView2.setText(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.User_Edit_Remark_name) + ZegoConstants.ZegoVideoDataAuxPublishingStream + userInfo.getUserName());
                com.code.android.util.o000O.OooOOOO(textView2);
            } else if (StringsKt__StringsKt.contains$default(userInfo.getUserIdx(), this.f27087OooOo00, false, 2, (Object) null)) {
                textView2.setText("ID:" + userInfo.getUserIdx());
                com.code.android.util.o000O.OooOOOO(textView2);
            } else {
                com.code.android.util.o000O.OooO0O0(textView2);
            }
            p423o0OoO0OO.o00O0O0O.OooO0Oo(textView2, com.code.android.util.o0000.OooO00o(i), this.f27087OooOo00);
        } else {
            com.code.android.util.o000O.OooOOOO(textView2);
            String bio = userInfo.getBio();
            textView2.setText(bio == null || StringsKt.isBlank(bio) ? "" : userInfo.getBio());
        }
        UserTagView userTagView = (UserTagView) holder.getView(p562o0oOo000.o0OO00O.userTagView);
        userTagView.OooO0oo(userInfo.getPremiumLevel(), userInfo.isPremium());
        int vipLevel = userInfo.getVipLevel();
        ComponentActivity componentActivity = this.f27085OooOOo0;
        userTagView.OooO0Oo(vipLevel, true, componentActivity);
        userTagView.setSex(userInfo.getSex());
        UserTagView.OooOO0o(userTagView, componentActivity, Integer.valueOf(userInfo.getWealthLevel()), userInfo.getWealthBadgeWithBg(), 8);
        userTagView.setPremiumSize(18);
        userTagView.setKaVipSize(18);
        userTagView.setSexSize(15);
    }
}
