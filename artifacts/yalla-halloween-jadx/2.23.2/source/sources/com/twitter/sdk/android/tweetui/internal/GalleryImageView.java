package com.twitter.sdk.android.tweetui.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.squareup.picasso.o0OO00O;

/* JADX INFO: loaded from: classes2.dex */
public class GalleryImageView extends FrameLayout implements o0OO00O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final MultiTouchImageView f21869OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ProgressBar f21870OooO0o0;

    public GalleryImageView(Context context) {
        MultiTouchImageView multiTouchImageView = new MultiTouchImageView(context);
        ProgressBar progressBar = new ProgressBar(context);
        super(context);
        this.f21869OooO0Oo = multiTouchImageView;
        this.f21870OooO0o0 = progressBar;
        progressBar.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        addView(progressBar);
        multiTouchImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
        addView(multiTouchImageView);
    }

    @Override // com.squareup.picasso.o0OO00O
    public final void OooO00o() {
    }

    @Override // com.squareup.picasso.o0OO00O
    public final void OooO0O0(Bitmap bitmap) {
        this.f21869OooO0Oo.setImageBitmap(bitmap);
        this.f21870OooO0o0.setVisibility(8);
    }

    public void setSwipeToDismissCallback(OooO00o.InterfaceC0282OooO00o interfaceC0282OooO00o) {
        MultiTouchImageView multiTouchImageView = this.f21869OooO0Oo;
        multiTouchImageView.setOnTouchListener(OooO00o.OooO00o(multiTouchImageView, interfaceC0282OooO00o));
    }
}
