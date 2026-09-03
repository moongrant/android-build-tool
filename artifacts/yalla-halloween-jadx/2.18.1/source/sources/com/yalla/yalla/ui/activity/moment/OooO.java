package com.yalla.yalla.ui.activity.moment;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.TopicInfoModel;
import com.yalla.yalla.ui.view.TopicFollowPostNumberView;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import p522o0o0O0o.oo0o0O0;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO extends p188o00o00o0.OooO0OO<TopicInfoModel> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ JoinTopicListActivity f22401OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO(JoinTopicListActivity joinTopicListActivity) {
        super(joinTopicListActivity, R.layout.item_join_topic_list);
        this.f22401OooO00o = joinTopicListActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(com.chad.library.adapter.base.OooO00o oooO00o, Object obj) {
        p188o00o00o0.OooO0o helper = (p188o00o00o0.OooO0o) oooO00o;
        TopicInfoModel item = (TopicInfoModel) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        JoinTopicListActivity joinTopicListActivity = this.f22401OooO00o;
        Objects.requireNonNull(joinTopicListActivity);
        ImageView imageView = (ImageView) helper.OooO0Oo(R.id.nivHeader);
        TextView textView = (TextView) helper.OooO0Oo(R.id.tvName);
        TopicFollowPostNumberView topicFollowPostNumberView = (TopicFollowPostNumberView) helper.OooO0Oo(R.id.numberView);
        TextView textView2 = (TextView) helper.OooO0Oo(R.id.tvDesc);
        imageView.setImageDrawable(null);
        oo0o0O0.OooO00o(textView);
        textView.setText("");
        textView2.setText("");
        if (item == null || TextUtils.isEmpty(item.getName())) {
            return;
        }
        imageView.setImageResource(R.drawable.icon_head_default_circular);
        oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(joinTopicListActivity);
        oooO00o2.OooO00o(o00OOO.OooO00o.OooO0o());
        oooO00o2.f48441OooOOOo = R.drawable.icon_head_default_circular;
        oooO00o2.f48431OooO0o = R.drawable.icon_head_default_circular;
        oooO00o2.OooO0oO(4);
        oooO00o2.f48429OooO0OO = item.getImage();
        oooO00o2.f48427OooO00o = 0;
        oooO00o2.OooO0o(imageView);
        textView.setText(item.getName());
        Drawable drawableOooO0O0 = item.isOwner() ? com.yalla.support.common.util.OooOOO.OooO0O0(R.drawable.ic_topic_owner) : null;
        if (item.isManager()) {
            drawableOooO0O0 = com.yalla.support.common.util.OooOOO.OooO0O0(R.drawable.ic_topic_manager);
        }
        oo0o0O0.OooO0oO(textView, drawableOooO0O0);
        topicFollowPostNumberView.OooO00o(item.getJoinNum(), item.getDyNum(), item.getPropPriceTotal());
        textView2.setText(R.string.topic_description_hint);
        if (TextUtils.isEmpty(item.getDescribe())) {
            return;
        }
        textView2.setText(item.getDescribe());
    }
}
