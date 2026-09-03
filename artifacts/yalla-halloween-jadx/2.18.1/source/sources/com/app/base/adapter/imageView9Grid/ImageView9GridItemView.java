package com.app.base.adapter.imageView9Grid;

import android.text.TextUtils;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.app.base.framework.abs.AbsListener.AbsListenerTag;
import com.app.base.framework.abs.AbsView.AbsView;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.yalla.util.netimage.NetImageView;
import o00OOO.OooO00o;
import p042Ooooo0o.o000O0Oo;
import p515o0o0O00.o00O00;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes.dex */
public class ImageView9GridItemView extends AbsView<ImageView9GridModel, AbsListenerTag> {

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public NetImageView f11354OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public TextView f11355OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public boolean f11356OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public String f11357OoooOoO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public RelativeLayout f11358o000oOoO;

    @Override // com.app.base.framework.abs.AbsView.AbsView
    public final int OooO0OO() {
        return R.layout.item_imageview_9_grid;
    }

    @Override // com.app.base.framework.abs.AbsView.AbsView
    public final void OooO0Oo() {
    }

    @Override // com.app.base.framework.abs.AbsView.AbsView
    public final void OooO0o() {
        this.f11358o000oOoO = (RelativeLayout) OooO00o(R.id.item_imageview_9_grid_layout);
        this.f11354OoooOOO = (NetImageView) OooO00o(R.id.item_imageview_9_grid_image);
        this.f11355OoooOOo = (TextView) OooO00o(R.id.item_imageview_9_grid_gif);
    }

    @Override // com.app.base.framework.abs.AbsView.AbsView
    public final void OooO0o0() {
        if (!this.f11356OoooOo0) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f11354OoooOOO.getLayoutParams();
            layoutParams.width = 0;
            layoutParams.height = 0;
            this.f11354OoooOOO.setLayoutParams(layoutParams);
            this.f11356OoooOo0 = true;
            GridLayout.LayoutParams layoutParams2 = new GridLayout.LayoutParams();
            layoutParams2.width = -2;
            layoutParams2.height = -2;
            this.f11358o000oOoO.setLayoutParams(layoutParams2);
        }
        this.f11354OoooOOO.setScaleType(ImageView.ScaleType.CENTER);
        this.f11354OoooOOO.setBackgroundResource(R.drawable.shape_bg_image_default_circluar);
        this.f11354OoooOOO.setImageResource(R.drawable.icon_picture_default_circluar);
        this.f11355OoooOOo.setVisibility(8);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [Model, com.app.base.adapter.imageView9Grid.ImageView9GridModel] */
    @Override // com.app.base.framework.abs.AbsView.AbsView
    public final void OooO0oo(ImageView9GridModel imageView9GridModel, int i) {
        ImageView9GridModel imageView9GridModel2 = imageView9GridModel;
        this.f11708Oooo = imageView9GridModel2;
        this.f11714OoooO00 = i;
        OooO0o0();
        if (imageView9GridModel2 == 0) {
            return;
        }
        int i2 = (int) (((double) 0) * 0.0d);
        this.f11357OoooOoO = CloudImageUtilKt.imgSize(CloudImageUtilKt.imgPng(imageView9GridModel2.getUrl()), i2, i2);
        if (CloudImageUtilKt.imgContainsGif(imageView9GridModel2.getUrl())) {
            this.f11355OoooOOo.setVisibility(0);
        }
        if (!TextUtils.isEmpty(imageView9GridModel2.getUrl())) {
            this.f11354OoooOOO.setVisibility(0);
        }
        StringBuilder sbOooO0O0 = o000O0Oo.OooO0O0(" position = ", i, "\n width = ", i2, ", height = ");
        sbOooO0O0.append(i2);
        sbOooO0O0.append("\n model.getUrl() = ");
        sbOooO0O0.append(imageView9GridModel2.getUrl());
        sbOooO0O0.append("\n gifUrlFormatPng = ");
        sbOooO0O0.append(this.f11357OoooOoO);
        o00O00.OooO0O0(sbOooO0O0.toString());
        oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(this.f11711Oooo0oo);
        oooO00o.f48454OooOoo0 = 2;
        oooO00o.OooO00o(OooO00o.OooO0o());
        oooO00o.OooO0oO(4);
        oooO00o.f48429OooO0OO = this.f11357OoooOoO;
        oooO00o.f48427OooO00o = 0;
        oooO00o.OooO0o(this.f11354OoooOOO);
    }

    @Override // o00Oo00.OooO00o
    public final void onClickNotDouble(View view) {
        int id = view.getId();
        if (id == R.id.item_imageview_9_grid_layout || id == R.id.item_imageview_9_grid_image) {
            OooO0oO(AbsListenerTag.Default);
        }
    }
}
