package com.yalla.yalla.ui.activity.moment;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.util.o000OO00;
import com.yalla.yalla.model.moment.MomentPowerSelectModel;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.jvm.internal.Intrinsics;
import p564o0oOo0OO.o000O;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OOO;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OoOo0 extends o000O<MomentPowerSelectModel> {
    public o0OoOo0(MomentPowerSelectActivity momentPowerSelectActivity, int i) {
        super(momentPowerSelectActivity, i);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder helper = (ViewHolder) baseViewHolder;
        MomentPowerSelectModel item = (MomentPowerSelectModel) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        ImageView imageView = (ImageView) helper.getView(oO00O0oO.item_select_post_power_select);
        ImageView imageView2 = (ImageView) helper.getView(oO00O0oO.item_select_post_power_iv_image);
        TextView textView = (TextView) helper.getView(oO00O0oO.item_select_post_power_tv_title);
        TextView textView2 = (TextView) helper.getView(oO00O0oO.item_select_post_power_tv_content);
        View line = helper.getView(oO00O0oO.item_select_post_power_line);
        if (item.getSelect()) {
            imageView.setImageResource(oO00OOO.icon_moment_power_selected);
        } else {
            imageView.setImageResource(oO00OOO.icon_moment_power_unselect);
        }
        imageView2.setImageResource(item.getResId());
        textView.setText(item.getTitle());
        textView2.setText(item.getContent());
        if (helper.getLayoutPosition() == this.f10111OooOOoo.size() - 1) {
            Intrinsics.checkNotNullExpressionValue(line, "line");
            o000OO00.OooO0O0(line);
        } else {
            Intrinsics.checkNotNullExpressionValue(line, "line");
            o000OO00.OooOOOO(line);
        }
    }
}
