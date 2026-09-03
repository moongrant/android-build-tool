package com.yalla.yalla.ui.activity.moment;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.view.FixTextView;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.db.table.UserInfo;
import com.yalla.yalla.common.ui.view.UserTagView;
import com.yalla.yalla.util.netimage.NetImageView;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import p254o00ooO0O.oOO00O;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo000 extends p188o00o00o0.OooO0OO<UserInfo> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ TopicInfoActivity f22416OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo000(TopicInfoActivity topicInfoActivity) {
        super(topicInfoActivity, R.layout.item_member_list_topic);
        this.f22416OooO00o = topicInfoActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(com.chad.library.adapter.base.OooO00o oooO00o, Object obj) {
        p188o00o00o0.OooO0o helper = (p188o00o00o0.OooO0o) oooO00o;
        UserInfo item = (UserInfo) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        ConstraintLayout constraintLayout = (ConstraintLayout) helper.OooO0Oo(R.id.layout);
        FixTextView tvTopicMember = (FixTextView) helper.OooO0Oo(R.id.tvTopicMember);
        NetImageView netImageView = (NetImageView) helper.OooO0Oo(R.id.nivUserHeader);
        UserTagView tagView = (UserTagView) helper.OooO0Oo(R.id.userTagView);
        View bottomLine = helper.OooO0Oo(R.id.bottomLine);
        Intrinsics.checkNotNullExpressionValue(tvTopicMember, "tvTopicMember");
        oOO00O.OooO00o(tvTopicMember);
        Intrinsics.checkNotNullExpressionValue(bottomLine, "bottomLine");
        oOO00O.OooO(bottomLine);
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
        layoutParams2.setMarginStart(com.yalla.support.common.util.OooOo00.OooO00o(10.0f));
        layoutParams2.setMarginEnd(com.yalla.support.common.util.OooOo00.OooO00o(10.0f));
        constraintLayout.setLayoutParams(layoutParams2);
        int layoutPosition = helper.getLayoutPosition();
        TopicInfoActivity topicInfoActivity = this.f22416OooO00o;
        TopicInfoActivity.OooO00o oooO00o2 = TopicInfoActivity.f22623OoooooO;
        if (layoutPosition == topicInfoActivity.OooOooo().getHeaderLayoutCount() + 0) {
            oOO00O.OooO(tvTopicMember);
            constraintLayout.setBackgroundResource(R.drawable.room_shape_white_bg_top_r6);
        } else {
            if (helper.getLayoutPosition() == this.f22416OooO00o.OooOooo().getHeaderLayoutCount() + (getData().size() - 1) && this.f22416OooO00o.f22629OooooOo) {
                constraintLayout.setBackgroundResource(R.drawable.room_shape_white_bg_bottom_r6);
                oOO00O.OooO00o(bottomLine);
            } else {
                constraintLayout.setBackgroundResource(R.drawable.room_shape_white_bg_middle);
            }
        }
        oO0O00.OooO00o oooO00o3 = new oO0O00.OooO00o(getContext());
        oooO00o3.f48429OooO0OO = item.getUserHeader();
        oooO00o3.f48427OooO00o = 0;
        oooO00o3.OooO00o(o00OOO.OooO00o.OooO0o0());
        oooO00o3.OooO0o(netImageView);
        tagView.OooO0oO(item.isPremium(), item.getPremiumLevel());
        tagView.setKaVip(item.getVipLevel());
        long userId = item.getUserId();
        Intrinsics.checkNotNullExpressionValue(tagView, "userTagView");
        String defaultValue = item.getUserName();
        OooOo block = new OooOo(tagView);
        Intrinsics.checkNotNullParameter(tagView, "tagView");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Intrinsics.checkNotNullParameter(block, "block");
        tagView.setTag(R.id.tag_friend_memo_name_tag, Long.valueOf(userId));
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getIO(), null, new o0o0O0O0.o00O0O.OooO0O0(userId, defaultValue, tagView, block, null), 2, null);
        tagView.setSex(item.getSex());
    }
}
