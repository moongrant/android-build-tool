package com.app.base.adapter.showImageUrlMore;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.app.base.framework.abs.AbsListener.AbsListenerTag;
import com.app.base.framework.abs.AbsView.AbsViewLinearLayout;
import com.app.selectPicture.view.photoview.PhotoView;
import com.weieyu.yalla.R;

/* JADX INFO: loaded from: classes.dex */
public class ShowImageUrlMoreHolderView extends AbsViewLinearLayout<AbsListenerTag> {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public ImageView f11449OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public RelativeLayout f11450OoooO0;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public ImageView f11451OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public PhotoView f11452OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public LinearLayout f11453OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public TextView f11454OoooOOo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public ProgressBar f11455o000oOoO;

    public ShowImageUrlMoreHolderView(Context context) {
        super(context);
    }

    @Override // com.app.base.framework.abs.AbsView.AbsViewLinearLayout
    public final void OooO0OO() {
    }

    @Override // com.app.base.framework.abs.AbsView.AbsViewLinearLayout
    public final void OooO0Oo() {
        this.f11450OoooO0 = (RelativeLayout) OooO00o(R.id.layout_show_image_url_more_layout);
        this.f11449OoooO = (ImageView) OooO00o(R.id.layout_show_image_url_more_pic_bg);
        this.f11451OoooO0O = (ImageView) OooO00o(R.id.layout_show_image_url_more_pic_small);
        this.f11452OoooOO0 = (PhotoView) OooO00o(R.id.layout_show_image_url_more_pic_iv);
        this.f11453OoooOOO = (LinearLayout) OooO00o(R.id.layout_show_image_url_more_pic_iv_err);
        this.f11455o000oOoO = (ProgressBar) OooO00o(R.id.layout_show_image_url_more_progress);
        this.f11454OoooOOo = (TextView) OooO00o(R.id.layout_show_image_url_more_pic_info);
        OooO0o0();
    }

    public final void OooO0o0() {
        this.f11450OoooO0.setVisibility(0);
        this.f11449OoooO.setVisibility(0);
        this.f11455o000oOoO.setVisibility(0);
        this.f11452OoooOO0.setVisibility(8);
        this.f11454OoooOOo.setVisibility(8);
        this.f11452OoooOO0.setImageDrawable(null);
        this.f11451OoooO0O.setVisibility(8);
        this.f11453OoooOOO.setVisibility(8);
    }

    @Override // com.app.base.framework.abs.AbsView.AbsViewLinearLayout
    public int getConvertViewId() {
        return R.layout.layout_show_image_url_more;
    }

    @Override // o00Oo00.OooO00o
    public final void onClickNotDouble(View view) {
    }
}
