package com.yalla.yalla.ui.activity.moment;

import com.chad.library.adapter.base.BaseViewHolder;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.ui.view.FixTextView;
import com.yalla.yalla.ui.view.UserPremiumView;
import com.yalla.yalla.ui.view.UserTagView;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import p412o0Oo0o0O.o000O0o;
import p571o0oOoO0.o0000oo;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
public final class o000000 extends o0000oo<UserInfo> {
    public o000000(TopicManagerActivity topicManagerActivity, int i) {
        super(topicManagerActivity, i);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder helper = (ViewHolder) baseViewHolder;
        UserInfo item = (UserInfo) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        NetImageView netImageView = (NetImageView) helper.getView(p562o0oOo000.o0OO00O.nivUserHeader);
        UserPremiumView userPremiumView = (UserPremiumView) helper.getView(p562o0oOo000.o0OO00O.vipView);
        UserTagView tagView = (UserTagView) helper.getView(p562o0oOo000.o0OO00O.tvUserName);
        FixTextView fixTextView = (FixTextView) helper.getView(p562o0oOo000.o0OO00O.tvUserRevoke);
        o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(this.f56423OooOo);
        oooO00o.f43126OooO0OO = item.getUserHeader();
        oooO00o.f43124OooO00o = 0;
        oooO00o.OooO00o(d1.OooO0OO());
        oooO00o.OooO0Oo(netImageView);
        userPremiumView.OooO0Oo(item.getPremiumLevel(), item.isPremium());
        long userId = item.getUserId();
        Intrinsics.checkNotNull(tagView);
        String defaultValue = item.getUserName();
        o000OOo block = new o000OOo(tagView);
        Intrinsics.checkNotNullParameter(tagView, "tagView");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Intrinsics.checkNotNullParameter(block, "block");
        tagView.setTag(p562o0oOo000.o0OO00O.tag_friend_memo_name_tag, Long.valueOf(userId));
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getIO(), null, new o000O0o(userId, tagView, defaultValue, null, block), 2, null);
        tagView.setSex(item.getSex());
        helper.addOnClickListener(fixTextView.getId());
    }
}
