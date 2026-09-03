package com.app.base.view.imageMore;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.app.base.adapter.imageView9Grid.ImageView9GridModel;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.yalla.util.netimage.NetImageView;
import java.util.Objects;
import p616o0oo0Ooo.oO0O00;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes.dex */
public class ImageMoreItemView extends RelativeLayout implements o00Oo00.OooO00o {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f12180Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public NetImageView f12181Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public TextView f12182Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f12183Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public OooO00o f12184OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public ImageView9GridModel f12185OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public String f12186OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public int f12187OoooO0O;

    public class OooO00o extends o00Oo0 {
        public OooO00o() {
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(View view) {
            Objects.requireNonNull(ImageMoreItemView.this);
        }
    }

    public ImageMoreItemView(Context context) {
        this(context, null);
    }

    public final void OooO00o() {
        this.f12181Oooo0o.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.f12181Oooo0o.setBackgroundResource(R.drawable.shape_bg_image_default_circluar);
        this.f12181Oooo0o.setImageResource(R.drawable.icon_picture_default_circluar);
        this.f12182Oooo0oO.setVisibility(8);
    }

    public final void OooO0O0(ImageView9GridModel imageView9GridModel, int i, int i2, int i3) {
        this.f12185OoooO0 = imageView9GridModel;
        this.f12187OoooO0O = i;
        this.f12183Oooo0oo = i2;
        this.f12180Oooo = i3;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f12181Oooo0o.getLayoutParams();
        layoutParams.width = i2;
        layoutParams.height = i3;
        this.f12181Oooo0o.setLayoutParams(layoutParams);
        OooO00o();
        OooO0OO(true);
    }

    public final void OooO0OO(boolean z) {
        if (this.f12185OoooO0 == null) {
            return;
        }
        if (z) {
            setVisibility(0);
            this.f12181Oooo0o.setVisibility(0);
        }
        int gifType = this.f12185OoooO0.getGifType();
        if (gifType == 0) {
            this.f12182Oooo0oO.setVisibility(8);
        } else if (gifType == 1 || CloudImageUtilKt.imgContainsGif(this.f12185OoooO0.getUrl())) {
            this.f12182Oooo0oO.setVisibility(0);
        }
        this.f12186OoooO00 = CloudImageUtilKt.imgSize(this.f12185OoooO0.getUrl(), this.f12183Oooo0oo, this.f12180Oooo);
        oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(getContext());
        oooO00o.OooO00o(o00OOO.OooO00o.OooO0o());
        oooO00o.f48454OooOoo0 = 2;
        oooO00o.f48444OooOOoo = 1;
        oooO00o.OooO0oO(4);
        oooO00o.f48429OooO0OO = this.f12186OoooO00;
        oooO00o.f48427OooO00o = 0;
        oooO00o.f48432OooO0o0 = false;
        oooO00o.OooO0o(this.f12181Oooo0o);
    }

    public ImageView9GridModel getData() {
        return this.f12185OoooO0;
    }

    public NetImageView getImageIv() {
        return this.f12181Oooo0o;
    }

    public o00Oo0 getNoDoubleClickListener() {
        if (this.f12184OoooO == null) {
            this.f12184OoooO = new OooO00o();
        }
        return this.f12184OoooO;
    }

    public int getPosition() {
        return this.f12187OoooO0O;
    }

    @Override // o00Oo00.OooO00o
    public final void onClickNotDouble(View view) {
    }

    public ImageMoreItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ImageMoreItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12183Oooo0oo = 0;
        this.f12180Oooo = 0;
        this.f12186OoooO00 = null;
        this.f12184OoooO = null;
        View.inflate(getContext(), R.layout.item_image_more_item, this);
        this.f12181Oooo0o = (NetImageView) p148o00Oo0O.o00Oo0.OooO00o(this, R.id.item_image_more_item_image, null);
        this.f12182Oooo0oO = (TextView) p148o00Oo0O.o00Oo0.OooO00o(this, R.id.item_image_more_item_gif, null);
    }
}
