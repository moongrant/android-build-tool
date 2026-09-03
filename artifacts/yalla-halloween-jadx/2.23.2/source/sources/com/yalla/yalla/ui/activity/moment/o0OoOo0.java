package com.yalla.yalla.ui.activity.moment;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.util.o000O;
import com.yalla.yalla.model.moment.MomentPowerSelectModel;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.jvm.internal.Intrinsics;
import p571o0oOoO0.o0000oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OoOo0 extends o0000oo<MomentPowerSelectModel> {
    public o0OoOo0(MomentPowerSelectActivity momentPowerSelectActivity, int i) {
        super(momentPowerSelectActivity, i);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder helper = (ViewHolder) baseViewHolder;
        MomentPowerSelectModel item = (MomentPowerSelectModel) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        ImageView imageView = (ImageView) helper.getView(p562o0oOo000.o0OO00O.item_select_post_power_select);
        ImageView imageView2 = (ImageView) helper.getView(p562o0oOo000.o0OO00O.item_select_post_power_iv_image);
        TextView textView = (TextView) helper.getView(p562o0oOo000.o0OO00O.item_select_post_power_tv_title);
        TextView textView2 = (TextView) helper.getView(p562o0oOo000.o0OO00O.item_select_post_power_tv_content);
        View view = helper.getView(p562o0oOo000.o0OO00O.item_select_post_power_line);
        if (item.getSelect()) {
            imageView.setImageResource(p562o0oOo000.o0O0O00.icon_moment_power_selected);
        } else {
            imageView.setImageResource(p562o0oOo000.o0O0O00.icon_moment_power_unselect);
        }
        imageView2.setImageResource(item.getResId());
        textView.setText(item.getTitle());
        textView2.setText(item.getContent());
        if (helper.getLayoutPosition() == this.f13189OooOOoo.size() - 1) {
            Intrinsics.checkNotNull(view);
            o000O.OooO0O0(view);
        } else {
            Intrinsics.checkNotNull(view);
            o000O.OooOOOO(view);
        }
    }
}
