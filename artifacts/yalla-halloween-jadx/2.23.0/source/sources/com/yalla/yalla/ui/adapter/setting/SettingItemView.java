package com.yalla.yalla.ui.adapter.setting;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.yalla.yalla.base.abs.AbsListener.AbsListenerTag;
import com.yalla.yalla.base.abs.AbsView.AbsView;
import p505o0o00oo0.OooOOOO;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public class SettingItemView extends AbsView<SettingModel, SettingTag> {

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public RelativeLayout f27768OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public ImageView f27769OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public TextView f27770OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public TextView f27771OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public View f27772OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public TextView f27773OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public View f27774OooOOo0;

    @Override // com.yalla.yalla.base.abs.AbsView.AbsView
    public final int OooO0OO() {
        return oO00OO0O.item_setting;
    }

    @Override // com.yalla.yalla.base.abs.AbsView.AbsView
    public final void OooO0Oo() {
    }

    @Override // com.yalla.yalla.base.abs.AbsView.AbsView
    public final void OooO0o() {
        this.f27768OooOO0o = (RelativeLayout) OooO0O0(oO00O0oO.item_setting_content_layout);
        this.f27770OooOOO0 = (TextView) OooO00o(oO00O0oO.item_setting_title_tv);
        this.f27769OooOOO = (ImageView) OooO00o(oO00O0oO.item_setting_notice_iv);
        this.f27771OooOOOO = (TextView) OooO00o(oO00O0oO.item_setting_point_red);
        this.f27772OooOOOo = OooO00o(oO00O0oO.item_setting_line);
        this.f27774OooOOo0 = OooO00o(oO00O0oO.item_setting_line_view);
        this.f27773OooOOo = (TextView) OooO0O0(oO00O0oO.item_setting_logout_tv);
    }

    @Override // com.yalla.yalla.base.abs.AbsView.AbsView
    public final void OooO0o0() {
        this.f27768OooOO0o.setVisibility(8);
        this.f27770OooOOO0.setText("");
        this.f27769OooOOO.setImageDrawable(null);
        this.f27769OooOOO.setVisibility(8);
        this.f27771OooOOOO.setVisibility(8);
        this.f27772OooOOOo.setVisibility(8);
        this.f27774OooOOo0.setVisibility(8);
        this.f27773OooOOo.setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p629o0ooO0O0.o00000OO
    public final void onClickNotDouble(View view) {
        int id = view.getId();
        if (id == oO00O0oO.item_setting_logout_tv || id == oO00O0oO.item_setting_content_layout) {
            Enum tag = ((SettingModel) this.f22734OooO0oO).getTag();
            Object obj = this.f22731OooO0Oo;
            if (obj != null) {
                OooOOOO oooOOOO = (OooOOOO) obj;
                int i = oooOOOO.f49720OooO0O0;
                oooOOOO.f49721OooO0OO.OooO0Oo(oooOOOO.f49719OooO00o, i, (AbsListenerTag) tag);
            }
        }
    }
}
