package com.yalla.yalla.ui.activity.moment;

import com.app.base.view.FixTextView;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.db.table.UserInfo;
import com.yalla.yalla.common.ui.view.UserPremiumView;
import com.yalla.yalla.common.ui.view.UserTagView;
import com.yalla.yalla.util.netimage.NetImageView;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OoOo0 extends p188o00o00o0.OooO0OO<UserInfo> {
    public o0OoOo0(TopicManagerActivity topicManagerActivity) {
        super(topicManagerActivity, R.layout.moment_layout_topic_manager_list);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(com.chad.library.adapter.base.OooO00o oooO00o, Object obj) {
        p188o00o00o0.OooO0o helper = (p188o00o00o0.OooO0o) oooO00o;
        UserInfo item = (UserInfo) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        NetImageView netImageView = (NetImageView) helper.OooO0Oo(R.id.nivUserHeader);
        UserPremiumView userPremiumView = (UserPremiumView) helper.OooO0Oo(R.id.vipView);
        UserTagView tagView = (UserTagView) helper.OooO0Oo(R.id.tvUserName);
        FixTextView fixTextView = (FixTextView) helper.OooO0Oo(R.id.tvUserRevoke);
        oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(getContext());
        oooO00o2.f48429OooO0OO = item.getUserHeader();
        oooO00o2.f48427OooO00o = 0;
        oooO00o2.OooO00o(o00OOO.OooO00o.OooO0o0());
        oooO00o2.OooO0o(netImageView);
        userPremiumView.OooO0Oo(item.isPremium(), item.getPremiumLevel());
        long userId = item.getUserId();
        Intrinsics.checkNotNullExpressionValue(tagView, "userTagView");
        String defaultValue = item.getUserName();
        o000oOoO block = new o000oOoO(tagView);
        Intrinsics.checkNotNullParameter(tagView, "tagView");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Intrinsics.checkNotNullParameter(block, "block");
        tagView.setTag(R.id.tag_friend_memo_name_tag, Long.valueOf(userId));
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getIO(), null, new o0o0O0O0.o00O0O.OooO0O0(userId, defaultValue, tagView, block, null), 2, null);
        tagView.setSex(item.getSex());
        helper.OooO0O0(fixTextView.getId());
    }
}
