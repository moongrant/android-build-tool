package com.twitter.sdk.android.tweetui.internal;

import android.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.squareup.picasso.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public class GalleryImageView extends FrameLayout implements o00Oo0 {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final MultiTouchImageView f20147Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final ProgressBar f20148Oooo0oO;

    public GalleryImageView(Context context) {
        MultiTouchImageView multiTouchImageView = new MultiTouchImageView(context);
        ProgressBar progressBar = new ProgressBar(context);
        super(context);
        this.f20147Oooo0o = multiTouchImageView;
        this.f20148Oooo0oO = progressBar;
        progressBar.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        addView(progressBar);
        multiTouchImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
        addView(multiTouchImageView);
    }

    @Override // com.squareup.picasso.o00Oo0
    public final void OooO00o() {
    }

    @Override // com.squareup.picasso.o00Oo0
    public final void OooO0O0(Bitmap bitmap) {
        this.f20147Oooo0o.setImageBitmap(bitmap);
        this.f20148Oooo0oO.setVisibility(8);
    }

    public final void OooO0OO() {
        this.f20147Oooo0o.setImageResource(R.color.transparent);
        this.f20148Oooo0oO.setVisibility(0);
    }

    public void setSwipeToDismissCallback(OooO00o.InterfaceC0183OooO00o interfaceC0183OooO00o) {
        this.f20147Oooo0o.setOnTouchListener(OooO00o.OooO00o(this.f20147Oooo0o, interfaceC0183OooO00o));
    }
}
