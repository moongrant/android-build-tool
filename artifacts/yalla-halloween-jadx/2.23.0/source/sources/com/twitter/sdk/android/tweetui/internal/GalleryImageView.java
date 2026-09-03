package com.twitter.sdk.android.tweetui.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.squareup.picasso.o0OO00O;

/* JADX INFO: loaded from: classes4.dex */
public class GalleryImageView extends FrameLayout implements o0OO00O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final MultiTouchImageView f22343OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ProgressBar f22344OooO0o0;

    public GalleryImageView(Context context) {
        MultiTouchImageView multiTouchImageView = new MultiTouchImageView(context);
        ProgressBar progressBar = new ProgressBar(context);
        super(context);
        this.f22343OooO0Oo = multiTouchImageView;
        this.f22344OooO0o0 = progressBar;
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
        this.f22343OooO0Oo.setImageBitmap(bitmap);
        this.f22344OooO0o0.setVisibility(8);
    }

    public void setSwipeToDismissCallback(OooO00o.InterfaceC0283OooO00o interfaceC0283OooO00o) {
        MultiTouchImageView multiTouchImageView = this.f22343OooO0Oo;
        multiTouchImageView.setOnTouchListener(OooO00o.OooO00o(multiTouchImageView, interfaceC0283OooO00o));
    }
}
