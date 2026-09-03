package com.squareup.picasso;

import android.R;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.twitter.sdk.android.tweetui.internal.TweetMediaView;
import p420o0Oo0ooO.oO00Oo00;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO0 extends OooO00o<ImageView> {

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public oO00Oo00 f19752OooOOO0;

    public OooOOO0(Picasso picasso, ImageView imageView, Oooo0 oooo0, int i, String str, oO00Oo00 oo00oo00) {
        super(picasso, imageView, oooo0, i, str);
        this.f19752OooOOO0 = oo00oo00;
    }

    @Override // com.squareup.picasso.OooO00o
    public final void OooO00o() {
        this.f19701OooOO0o = true;
        if (this.f19752OooOOO0 != null) {
            this.f19752OooOOO0 = null;
        }
    }

    @Override // com.squareup.picasso.OooO00o
    public final void OooO0O0(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
        ImageView imageView;
        if (bitmap == null) {
            throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", this));
        }
        ImageView imageView2 = (ImageView) this.f19693OooO0OO.get();
        if (imageView2 == null) {
            return;
        }
        Picasso picasso = this.f19691OooO00o;
        OooOo.OooO0O0(imageView2, picasso.f19796OooO0Oo, bitmap, loadedFrom, this.f19694OooO0Oo, picasso.f19803OooOO0o);
        oO00Oo00 oo00oo00 = this.f19752OooOOO0;
        if (oo00oo00 == null || (imageView = ((TweetMediaView.OooO0O0) oo00oo00).f20188OooO00o.get()) == null) {
            return;
        }
        imageView.setBackgroundResource(R.color.transparent);
    }

    @Override // com.squareup.picasso.OooO00o
    public final void OooO0OO() {
        ImageView imageView = (ImageView) this.f19693OooO0OO.get();
        if (imageView == null) {
            return;
        }
        int i = this.f19697OooO0oO;
        if (i != 0) {
            imageView.setImageResource(i);
            return;
        }
        Drawable drawable = this.f19698OooO0oo;
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        }
    }
}
