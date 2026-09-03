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
import p642o0ooOOO0.d1;
import p643o0ooOOOO.h3;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class OooO00o extends h3<FriendInfo> {

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public String f26945OooOOo0;

    /* JADX INFO: renamed from: com.yalla.yalla.ui.adapter.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C0328OooO00o extends androidx.recyclerview.widget.Oooo000.OooO<FriendInfo> {
        @Override // androidx.recyclerview.widget.Oooo000.OooO
        public final boolean OooO00o(FriendInfo friendInfo, FriendInfo friendInfo2) {
            FriendInfo oldItem = friendInfo;
            FriendInfo newItem = friendInfo2;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            UserInfo userInfo = oldItem.getUserInfo();
            return (userInfo != null && userInfo.areItemShowContentsTheSame(newItem.getUserInfo())) && Intrinsics.areEqual(oldItem.getFriend().getMemoName(), newItem.getFriend().getMemoName());
        }

        @Override // androidx.recyclerview.widget.Oooo000.OooO
        public final boolean OooO0O0(FriendInfo friendInfo, FriendInfo friendInfo2) {
            FriendInfo oldItem = friendInfo;
            FriendInfo newItem = friendInfo2;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return oldItem.getFriend().getUid() == newItem.getFriend().getUid() && oldItem.getFriend().getFriendId() == newItem.getFriend().getFriendId();
        }
    }

    public OooO00o() {
        super(Integer.valueOf(p562o0oOo000.oo0o0Oo.moment_item_at_friends), new C0328OooO00o());
        this.f26945OooOOo0 = "";
    }

    @Override // p643o0ooOOOO.h3
    public final void OooO0o(PagingViewHolder helper, FriendInfo friendInfo) {
        FriendInfo model = friendInfo;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(model, "model");
        UserInfo userInfo = model.getUserInfo();
        if (userInfo != null) {
            String memoName = model.getFriend().getMemoName();
            o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(helper.itemView.getContext());
            oooO00o.OooO00o(d1.OooO0OO());
            oooO00o.f43126OooO0OO = userInfo.getUserHeader();
            oooO00o.f43124OooO00o = 0;
            oooO00o.OooO0Oo((ImageView) helper.getView(p562o0oOo000.o0OO00O.friendHead));
            TextView textView = (TextView) helper.getView(p562o0oOo000.o0OO00O.tvFriendName);
            if (memoName == null || StringsKt.isBlank(memoName)) {
                memoName = userInfo.getUserName();
            }
            textView.setText(memoName);
            p423o0OoO0OO.o00O0O0O.OooO0OO(textView, p423o0OoO0OO.o00O0OOO.OooO00o(p562o0oOo000.o0OOO0o.color_87000000, textView));
            if (!StringsKt.isBlank(this.f26945OooOOo0)) {
                p423o0OoO0OO.o00O0O0O.OooO0Oo(textView, p423o0OoO0OO.o00O0OOO.OooO00o(p562o0oOo000.o0OOO0o.color_00d8c9, textView), this.f26945OooOOo0);
            }
            TextView textView2 = (TextView) helper.getView(p562o0oOo000.o0OO00O.tvBio);
            String bio = userInfo.getBio();
            textView2.setText(bio == null || StringsKt.isBlank(bio) ? "" : userInfo.getBio());
            p423o0OoO0OO.o00O0O0O.OooO0OO(textView2, p423o0OoO0OO.o00O0OOO.OooO00o(p562o0oOo000.o0OOO0o.color_38000000, textView2));
            if (!StringsKt.isBlank(this.f26945OooOOo0)) {
                textView2.setText("ID:" + userInfo.getUserIdx());
                p423o0OoO0OO.o00O0O0O.OooO0Oo(textView2, p423o0OoO0OO.o00O0OOO.OooO00o(p562o0oOo000.o0OOO0o.color_00d8c9, textView2), this.f26945OooOOo0);
            }
            ((SexView) helper.getView(p562o0oOo000.o0OO00O.sex)).setSex(userInfo.getSex());
            ((UserPremiumView) helper.getView(p562o0oOo000.o0OO00O.vip)).OooO0Oo(userInfo.getPremiumLevel(), userInfo.isPremium());
        }
    }
}
