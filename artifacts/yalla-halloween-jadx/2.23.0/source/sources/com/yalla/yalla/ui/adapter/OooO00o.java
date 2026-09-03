package com.yalla.yalla.ui.adapter;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.base.paging.PagingViewHolder;
import com.yalla.yalla.data.db.table.FriendInfo;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.ui.view.SexView;
import com.yalla.yalla.ui.view.UserPremiumView;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class OooO00o extends p400o0Oo0OO.OooOO0O<FriendInfo> {

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public String f27410OooOOo0;

    /* JADX INFO: renamed from: com.yalla.yalla.ui.adapter.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C0329OooO00o extends androidx.recyclerview.widget.OooOo.OooO<FriendInfo> {
        @Override // androidx.recyclerview.widget.OooOo.OooO
        public final boolean OooO00o(FriendInfo friendInfo, FriendInfo friendInfo2) {
            FriendInfo oldItem = friendInfo;
            FriendInfo newItem = friendInfo2;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            UserInfo userInfo = oldItem.getUserInfo();
            return (userInfo != null && userInfo.areItemShowContentsTheSame(newItem.getUserInfo())) && Intrinsics.areEqual(oldItem.getFriend().getMemoName(), newItem.getFriend().getMemoName());
        }

        @Override // androidx.recyclerview.widget.OooOo.OooO
        public final boolean OooO0O0(FriendInfo friendInfo, FriendInfo friendInfo2) {
            FriendInfo oldItem = friendInfo;
            FriendInfo newItem = friendInfo2;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return oldItem.getFriend().getUid() == newItem.getFriend().getUid() && oldItem.getFriend().getFriendId() == newItem.getFriend().getFriendId();
        }
    }

    public OooO00o() {
        super(Integer.valueOf(oO00OO0O.moment_item_at_friends), new C0329OooO00o());
        this.f27410OooOOo0 = "";
    }

    @Override // p400o0Oo0OO.OooOO0O
    public final void OooO0o(PagingViewHolder helper, FriendInfo friendInfo) {
        FriendInfo model = friendInfo;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(model, "model");
        UserInfo userInfo = model.getUserInfo();
        if (userInfo != null) {
            String memoName = model.getFriend().getMemoName();
            o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(helper.itemView.getContext());
            oooO00o.OooO00o(p543o0oO0O00.OooO.OooO0OO());
            oooO00o.f43911OooO0OO = userInfo.getUserHeader();
            oooO00o.f43909OooO00o = 0;
            oooO00o.OooO0Oo((ImageView) helper.getView(oO00O0oO.friendHead));
            TextView textView = (TextView) helper.getView(oO00O0oO.tvFriendName);
            if (memoName == null || StringsKt.isBlank(memoName)) {
                memoName = userInfo.getUserName();
            }
            textView.setText(memoName);
            p417o0OoO0.o000O0o.OooO0OO(textView, p417o0OoO0.o000O0.OooO00o(oO00O0o.color_87000000, textView));
            if (!StringsKt.isBlank(this.f27410OooOOo0)) {
                p417o0OoO0.o000O0o.OooO0Oo(textView, p417o0OoO0.o000O0.OooO00o(oO00O0o.color_00d8c9, textView), this.f27410OooOOo0);
            }
            TextView textView2 = (TextView) helper.getView(oO00O0oO.tvBio);
            String bio = userInfo.getBio();
            textView2.setText(bio == null || StringsKt.isBlank(bio) ? "" : userInfo.getBio());
            p417o0OoO0.o000O0o.OooO0OO(textView2, p417o0OoO0.o000O0.OooO00o(oO00O0o.color_38000000, textView2));
            if (!StringsKt.isBlank(this.f27410OooOOo0)) {
                textView2.setText("ID:" + userInfo.getUserIdx());
                p417o0OoO0.o000O0o.OooO0Oo(textView2, p417o0OoO0.o000O0.OooO00o(oO00O0o.color_00d8c9, textView2), this.f27410OooOOo0);
            }
            ((SexView) helper.getView(oO00O0oO.sex)).setSex(userInfo.getSex());
            ((UserPremiumView) helper.getView(oO00O0oO.vip)).OooO0Oo(userInfo.getPremiumLevel(), userInfo.isPremium());
        }
    }
}
