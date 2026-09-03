package com.app.base.adapter.setting;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.app.base.framework.abs.AbsView.AbsView;
import com.weieyu.yalla.R;

/* JADX INFO: loaded from: classes.dex */
public class SettingItemView extends AbsView<SettingModel, SettingTag> {

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public TextView f11442OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public ImageView f11443OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public TextView f11444OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public View f11445OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public View f11446OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public TextView f11447Ooooo00;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public RelativeLayout f11448o000oOoO;

    @Override // com.app.base.framework.abs.AbsView.AbsView
    public final int OooO0OO() {
        return R.layout.item_setting;
    }

    @Override // com.app.base.framework.abs.AbsView.AbsView
    public final void OooO0Oo() {
    }

    @Override // com.app.base.framework.abs.AbsView.AbsView
    public final void OooO0o() {
        this.f11448o000oOoO = (RelativeLayout) OooO0O0(R.id.item_setting_content_layout);
        this.f11442OoooOOO = (TextView) OooO00o(R.id.item_setting_title_tv);
        this.f11443OoooOOo = (ImageView) OooO00o(R.id.item_setting_notice_iv);
        this.f11444OoooOo0 = (TextView) OooO00o(R.id.item_setting_point_red);
        this.f11445OoooOoO = OooO00o(R.id.item_setting_line);
        this.f11446OoooOoo = OooO00o(R.id.item_setting_line_view);
        this.f11447Ooooo00 = (TextView) OooO0O0(R.id.item_setting_logout_tv);
    }

    @Override // com.app.base.framework.abs.AbsView.AbsView
    public final void OooO0o0() {
        this.f11448o000oOoO.setVisibility(8);
        this.f11442OoooOOO.setText("");
        this.f11443OoooOOo.setImageDrawable(null);
        this.f11443OoooOOo.setVisibility(8);
        this.f11444OoooOo0.setVisibility(8);
        this.f11445OoooOoO.setVisibility(8);
        this.f11446OoooOoo.setVisibility(8);
        this.f11447Ooooo00.setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o00Oo00.OooO00o
    public final void onClickNotDouble(View view) {
        int id = view.getId();
        if (id == R.id.item_setting_logout_tv || id == R.id.item_setting_content_layout) {
            OooO0oO(((SettingModel) this.f11708Oooo).getTag());
        }
    }
}
