package com.yalla.yalla.ui.adapter.showImageUrlMore;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.app.selectPicture.view.photoview.PhotoView;
import com.yalla.yalla.base.abs.AbsListener.AbsListenerTag;
import com.yalla.yalla.base.abs.AbsView.AbsViewLinearLayout;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public class ShowImageUrlMoreHolderView extends AbsViewLinearLayout<AbsListenerTag> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public RelativeLayout f27775OooO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public ImageView f27776OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public ImageView f27777OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public PhotoView f27778OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public LinearLayout f27779OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public ProgressBar f27780OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public TextView f27781OooOOOO;

    public ShowImageUrlMoreHolderView(Context context) {
        super(context);
    }

    @Override // com.yalla.yalla.base.abs.AbsView.AbsViewLinearLayout
    public final void OooO0OO() {
    }

    @Override // com.yalla.yalla.base.abs.AbsView.AbsViewLinearLayout
    public final void OooO0Oo() {
        this.f27775OooO = (RelativeLayout) OooO00o(oO00O0oO.layout_show_image_url_more_layout);
        this.f27777OooOO0O = (ImageView) OooO00o(oO00O0oO.layout_show_image_url_more_pic_bg);
        this.f27776OooOO0 = (ImageView) OooO00o(oO00O0oO.layout_show_image_url_more_pic_small);
        this.f27778OooOO0o = (PhotoView) OooO00o(oO00O0oO.layout_show_image_url_more_pic_iv);
        this.f27779OooOOO = (LinearLayout) OooO00o(oO00O0oO.layout_show_image_url_more_pic_iv_err);
        this.f27780OooOOO0 = (ProgressBar) OooO00o(oO00O0oO.layout_show_image_url_more_progress);
        this.f27781OooOOOO = (TextView) OooO00o(oO00O0oO.layout_show_image_url_more_pic_info);
        OooO0o0();
    }

    public final void OooO0o0() {
        this.f27775OooO.setVisibility(0);
        this.f27777OooOO0O.setVisibility(0);
        this.f27780OooOOO0.setVisibility(0);
        this.f27778OooOO0o.setVisibility(8);
        this.f27781OooOOOO.setVisibility(8);
        this.f27778OooOO0o.setImageDrawable(null);
        this.f27776OooOO0.setVisibility(8);
        this.f27779OooOOO.setVisibility(8);
    }

    @Override // com.yalla.yalla.base.abs.AbsView.AbsViewLinearLayout
    public int getConvertViewId() {
        return oO00OO0O.layout_show_image_url_more;
    }

    @Override // p629o0ooO0O0.o00000OO
    public final void onClickNotDouble(View view) {
    }
}
