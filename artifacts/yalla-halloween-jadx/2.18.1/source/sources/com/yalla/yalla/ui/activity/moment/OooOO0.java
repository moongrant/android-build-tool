package com.yalla.yalla.ui.activity.moment;

import android.widget.ImageView;
import android.widget.TextView;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.MomentPowerSelectModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0 extends p188o00o00o0.OooO0OO<MomentPowerSelectModel> {
    public OooOO0(MomentPowerSelectActivity momentPowerSelectActivity) {
        super(momentPowerSelectActivity, R.layout.item_select_post_power);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(com.chad.library.adapter.base.OooO00o oooO00o, Object obj) {
        p188o00o00o0.OooO0o helper = (p188o00o00o0.OooO0o) oooO00o;
        MomentPowerSelectModel item = (MomentPowerSelectModel) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        ImageView imageView = (ImageView) helper.OooO0Oo(R.id.item_select_post_power_select);
        ImageView imageView2 = (ImageView) helper.OooO0Oo(R.id.item_select_post_power_iv_image);
        TextView textView = (TextView) helper.OooO0Oo(R.id.item_select_post_power_tv_title);
        TextView textView2 = (TextView) helper.OooO0Oo(R.id.item_select_post_power_tv_content);
        if (item.getSelect()) {
            imageView.setImageResource(R.drawable.recom_checked);
        } else {
            imageView.setImageResource(R.drawable.icon_authority_weiquanzequan);
        }
        imageView2.setImageResource(item.getResId());
        textView.setText(item.getTitle());
        textView2.setText(item.getContent());
    }
}
