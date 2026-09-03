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
import p406o0Oo0Ooo.oOO0OO0O;
import p564o0oOo0OO.o000O;
import p584o0oOooO0.oO00O0oO;

/* JADX INFO: loaded from: classes4.dex */
public final class o000000 extends o000O<UserInfo> {
    public o000000(TopicManagerActivity topicManagerActivity, int i) {
        super(topicManagerActivity, i);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder helper = (ViewHolder) baseViewHolder;
        UserInfo item = (UserInfo) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        NetImageView netImageView = (NetImageView) helper.getView(oO00O0oO.nivUserHeader);
        UserPremiumView userPremiumView = (UserPremiumView) helper.getView(oO00O0oO.vipView);
        UserTagView tagView = (UserTagView) helper.getView(oO00O0oO.tvUserName);
        FixTextView fixTextView = (FixTextView) helper.getView(oO00O0oO.tvUserRevoke);
        o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(this.f56196OooOo);
        oooO00o.f43911OooO0OO = item.getUserHeader();
        oooO00o.f43909OooO00o = 0;
        oooO00o.OooO00o(p543o0oO0O00.OooO.OooO0OO());
        oooO00o.OooO0Oo(netImageView);
        userPremiumView.OooO0Oo(item.getPremiumLevel(), item.isPremium());
        long userId = item.getUserId();
        Intrinsics.checkNotNullExpressionValue(tagView, "userTagView");
        String defaultValue = item.getUserName();
        o000OOo block = new o000OOo(tagView);
        Intrinsics.checkNotNullParameter(tagView, "tagView");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Intrinsics.checkNotNullParameter(block, "block");
        tagView.setTag(oO00O0oO.tag_friend_memo_name_tag, Long.valueOf(userId));
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getIO(), null, new oOO0OO0O(userId, tagView, defaultValue, null, block), 2, null);
        tagView.setSex(item.getSex());
        helper.addOnClickListener(fixTextView.getId());
    }
}
