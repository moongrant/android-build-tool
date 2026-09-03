package com.yalla.yalla.ui.activity.moment;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.util.o0000O0;
import com.code.android.util.o000OO00;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.ui.view.FixTextView;
import com.yalla.yalla.ui.view.UserTagView;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import p406o0Oo0Ooo.oOO0OO0O;
import p564o0oOo0OO.o000O;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0o0Oo extends o000O<UserInfo> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ TopicInfoActivity f26449OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0o0Oo(TopicInfoActivity topicInfoActivity, int i) {
        super(topicInfoActivity, i);
        this.f26449OooOoo0 = topicInfoActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder helper = (ViewHolder) baseViewHolder;
        UserInfo item = (UserInfo) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        ConstraintLayout constraintLayout = (ConstraintLayout) helper.getView(oO00O0oO.layout);
        FixTextView tvTopicMember = (FixTextView) helper.getView(oO00O0oO.tvTopicMember);
        NetImageView netImageView = (NetImageView) helper.getView(oO00O0oO.nivUserHeader);
        UserTagView tagView = (UserTagView) helper.getView(oO00O0oO.userTagView);
        View bottomLine = helper.getView(oO00O0oO.bottomLine);
        Intrinsics.checkNotNullExpressionValue(tvTopicMember, "tvTopicMember");
        o000OO00.OooO0O0(tvTopicMember);
        Intrinsics.checkNotNullExpressionValue(bottomLine, "bottomLine");
        o000OO00.OooOOOO(bottomLine);
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
        float f = 10;
        layoutParams2.setMarginStart(o0000O0.OooO00o(f));
        layoutParams2.setMarginEnd(o0000O0.OooO00o(f));
        constraintLayout.setLayoutParams(layoutParams2);
        int layoutPosition = helper.getLayoutPosition();
        int i = TopicInfoActivity.f26367OooOoOO;
        TopicInfoActivity topicInfoActivity = this.f26449OooOoo0;
        if (layoutPosition == topicInfoActivity.OooOoO0().OooOOO0() + 0) {
            o000OO00.OooOOOO(tvTopicMember);
            constraintLayout.setBackgroundResource(oOo00OO0.room_shape_white_bg_top_r6);
        } else {
            if (helper.getLayoutPosition() == topicInfoActivity.OooOoO0().OooOOO0() + (this.f10111OooOOoo.size() - 1) && topicInfoActivity.f26369OooOo) {
                constraintLayout.setBackgroundResource(oOo00OO0.room_shape_white_bg_bottom_r6);
                o000OO00.OooO0O0(bottomLine);
            } else {
                constraintLayout.setBackgroundResource(oOo00OO0.room_shape_white_bg_middle);
            }
        }
        o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(this.f56196OooOo);
        oooO00o.f43911OooO0OO = item.getUserHeader();
        oooO00o.f43909OooO00o = 0;
        oooO00o.OooO00o(p543o0oO0O00.OooO.OooO0OO());
        oooO00o.OooO0Oo(netImageView);
        tagView.OooO0oo(item.getPremiumLevel(), item.isPremium());
        tagView.OooO0Oo(item.getVipLevel(), true, topicInfoActivity);
        long userId = item.getUserId();
        Intrinsics.checkNotNullExpressionValue(tagView, "userTagView");
        String defaultValue = item.getUserName();
        o0OO00O block = new o0OO00O(tagView);
        Intrinsics.checkNotNullParameter(tagView, "tagView");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Intrinsics.checkNotNullParameter(block, "block");
        tagView.setTag(oO00O0oO.tag_friend_memo_name_tag, Long.valueOf(userId));
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getIO(), null, new oOO0OO0O(userId, tagView, defaultValue, null, block), 2, null);
        tagView.setSex(item.getSex());
    }
}
