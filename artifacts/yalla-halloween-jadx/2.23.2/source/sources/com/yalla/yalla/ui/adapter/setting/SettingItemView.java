package com.yalla.yalla.ui.adapter.setting;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.yalla.yalla.base.abs.AbsListener.AbsListenerTag;
import com.yalla.yalla.base.abs.AbsView.AbsView;
import p514o0o0O000.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public class SettingItemView extends AbsView<SettingModel, SettingTag> {

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public RelativeLayout f27306OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public ImageView f27307OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public TextView f27308OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public TextView f27309OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public View f27310OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public TextView f27311OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public View f27312OooOOo0;

    @Override // com.yalla.yalla.base.abs.AbsView.AbsView
    public final int OooO0OO() {
        return oo0o0Oo.item_setting;
    }

    @Override // com.yalla.yalla.base.abs.AbsView.AbsView
    public final void OooO0Oo() {
    }

    @Override // com.yalla.yalla.base.abs.AbsView.AbsView
    public final void OooO0o() {
        this.f27306OooOO0o = (RelativeLayout) OooO0O0(o0OO00O.item_setting_content_layout);
        this.f27308OooOOO0 = (TextView) OooO00o(o0OO00O.item_setting_title_tv);
        this.f27307OooOOO = (ImageView) OooO00o(o0OO00O.item_setting_notice_iv);
        this.f27309OooOOOO = (TextView) OooO00o(o0OO00O.item_setting_point_red);
        this.f27310OooOOOo = OooO00o(o0OO00O.item_setting_line);
        this.f27312OooOOo0 = OooO00o(o0OO00O.item_setting_line_view);
        this.f27311OooOOo = (TextView) OooO0O0(o0OO00O.item_setting_logout_tv);
    }

    @Override // com.yalla.yalla.base.abs.AbsView.AbsView
    public final void OooO0o0() {
        this.f27306OooOO0o.setVisibility(8);
        this.f27308OooOOO0.setText("");
        this.f27307OooOOO.setImageDrawable(null);
        this.f27307OooOOO.setVisibility(8);
        this.f27309OooOOOO.setVisibility(8);
        this.f27310OooOOOo.setVisibility(8);
        this.f27312OooOOo0.setVisibility(8);
        this.f27311OooOOo.setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p400o0Oo0O0.OooOO0O
    public final void onClickNotDouble(View view) {
        int id = view.getId();
        if (id == o0OO00O.item_setting_logout_tv || id == o0OO00O.item_setting_content_layout) {
            Enum tag = ((SettingModel) this.f22261OooO0oO).getTag();
            Object obj = this.f22258OooO0Oo;
            if (obj != null) {
                OooO0O0 oooO0O0 = (OooO0O0) obj;
                int i = oooO0O0.f51083OooO0O0;
                oooO0O0.f51084OooO0OO.OooO0Oo(oooO0O0.f51082OooO00o, i, (AbsListenerTag) tag);
            }
        }
    }
}
