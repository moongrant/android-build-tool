package com.yalla.yalla.ui.activity.moment;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.util.o0000O0;
import com.code.android.util.o000O;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.ui.view.FixTextView;
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
public final class oo0o0Oo extends o0000oo<UserInfo> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ TopicInfoActivity f25997OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0o0Oo(TopicInfoActivity topicInfoActivity, int i) {
        super(topicInfoActivity, i);
        this.f25997OooOoo0 = topicInfoActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder helper = (ViewHolder) baseViewHolder;
        UserInfo item = (UserInfo) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        ConstraintLayout constraintLayout = (ConstraintLayout) helper.getView(p562o0oOo000.o0OO00O.layout);
        FixTextView fixTextView = (FixTextView) helper.getView(p562o0oOo000.o0OO00O.tvTopicMember);
        NetImageView netImageView = (NetImageView) helper.getView(p562o0oOo000.o0OO00O.nivUserHeader);
        UserTagView tagView = (UserTagView) helper.getView(p562o0oOo000.o0OO00O.userTagView);
        View view = helper.getView(p562o0oOo000.o0OO00O.bottomLine);
        Intrinsics.checkNotNull(fixTextView);
        o000O.OooO0O0(fixTextView);
        Intrinsics.checkNotNull(view);
        o000O.OooOOOO(view);
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
        float f = 10;
        layoutParams2.setMarginStart(o0000O0.OooO00o(f));
        layoutParams2.setMarginEnd(o0000O0.OooO00o(f));
        constraintLayout.setLayoutParams(layoutParams2);
        int layoutPosition = helper.getLayoutPosition();
        int i = TopicInfoActivity.f25916OooOoOO;
        TopicInfoActivity topicInfoActivity = this.f25997OooOoo0;
        if (layoutPosition == topicInfoActivity.OooOoO0().OooOOO0() + 0) {
            o000O.OooOOOO(fixTextView);
            constraintLayout.setBackgroundResource(p562o0oOo000.o0Oo0oo.room_shape_white_bg_top_r6);
        } else {
            if (helper.getLayoutPosition() == topicInfoActivity.OooOoO0().OooOOO0() + (this.f13189OooOOoo.size() - 1) && topicInfoActivity.f25918OooOo) {
                constraintLayout.setBackgroundResource(p562o0oOo000.o0Oo0oo.room_shape_white_bg_bottom_r6);
                o000O.OooO0O0(view);
            } else {
                constraintLayout.setBackgroundResource(p562o0oOo000.o0Oo0oo.room_shape_white_bg_middle);
            }
        }
        o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(this.f56423OooOo);
        oooO00o.f43126OooO0OO = item.getUserHeader();
        oooO00o.f43124OooO00o = 0;
        oooO00o.OooO00o(d1.OooO0OO());
        oooO00o.OooO0Oo(netImageView);
        tagView.OooO0oo(item.getPremiumLevel(), item.isPremium());
        tagView.OooO0Oo(item.getVipLevel(), true, topicInfoActivity);
        long userId = item.getUserId();
        Intrinsics.checkNotNull(tagView);
        String defaultValue = item.getUserName();
        o0OO00O block = new o0OO00O(tagView);
        Intrinsics.checkNotNullParameter(tagView, "tagView");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Intrinsics.checkNotNullParameter(block, "block");
        tagView.setTag(p562o0oOo000.o0OO00O.tag_friend_memo_name_tag, Long.valueOf(userId));
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getIO(), null, new o000O0o(userId, tagView, defaultValue, null, block), 2, null);
        tagView.setSex(item.getSex());
    }
}
