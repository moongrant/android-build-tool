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
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public class ShowImageUrlMoreHolderView extends AbsViewLinearLayout<AbsListenerTag> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public RelativeLayout f27313OooO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public ImageView f27314OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public ImageView f27315OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public PhotoView f27316OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public LinearLayout f27317OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public ProgressBar f27318OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public TextView f27319OooOOOO;

    public ShowImageUrlMoreHolderView(Context context) {
        super(context);
    }

    @Override // com.yalla.yalla.base.abs.AbsView.AbsViewLinearLayout
    public final void OooO0OO() {
    }

    @Override // com.yalla.yalla.base.abs.AbsView.AbsViewLinearLayout
    public final void OooO0Oo() {
        this.f27313OooO = (RelativeLayout) OooO00o(o0OO00O.layout_show_image_url_more_layout);
        this.f27315OooOO0O = (ImageView) OooO00o(o0OO00O.layout_show_image_url_more_pic_bg);
        this.f27314OooOO0 = (ImageView) OooO00o(o0OO00O.layout_show_image_url_more_pic_small);
        this.f27316OooOO0o = (PhotoView) OooO00o(o0OO00O.layout_show_image_url_more_pic_iv);
        this.f27317OooOOO = (LinearLayout) OooO00o(o0OO00O.layout_show_image_url_more_pic_iv_err);
        this.f27318OooOOO0 = (ProgressBar) OooO00o(o0OO00O.layout_show_image_url_more_progress);
        this.f27319OooOOOO = (TextView) OooO00o(o0OO00O.layout_show_image_url_more_pic_info);
        OooO0o0();
    }

    public final void OooO0o0() {
        this.f27313OooO.setVisibility(0);
        this.f27315OooOO0O.setVisibility(0);
        this.f27318OooOOO0.setVisibility(0);
        this.f27316OooOO0o.setVisibility(8);
        this.f27319OooOOOO.setVisibility(8);
        this.f27316OooOO0o.setImageDrawable(null);
        this.f27314OooOO0.setVisibility(8);
        this.f27317OooOOO.setVisibility(8);
    }

    @Override // com.yalla.yalla.base.abs.AbsView.AbsViewLinearLayout
    public int getConvertViewId() {
        return oo0o0Oo.layout_show_image_url_more;
    }

    @Override // p400o0Oo0O0.OooOO0O
    public final void onClickNotDouble(View view) {
    }
}
