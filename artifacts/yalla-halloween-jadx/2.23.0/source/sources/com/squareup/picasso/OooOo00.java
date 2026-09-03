package com.squareup.picasso;

import android.R;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.twitter.sdk.android.tweetui.internal.TweetMediaView;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOo00 extends OooO00o<ImageView> {

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public OooO f21743OooOOO0;

    public OooOo00(Picasso picasso, ImageView imageView, o00Ooo o00ooo2, int i, String str, OooO oooO) {
        super(picasso, imageView, o00ooo2, i, str);
        this.f21743OooOOO0 = oooO;
    }

    @Override // com.squareup.picasso.OooO00o
    public final void OooO00o() {
        this.f21687OooOO0o = true;
        if (this.f21743OooOOO0 != null) {
            this.f21743OooOOO0 = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.squareup.picasso.OooO00o
    public final void OooO0O0(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
        ImageView imageView;
        if (bitmap == null) {
            throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", this));
        }
        ImageView imageView2 = (ImageView) this.f21679OooO0OO.get();
        if (imageView2 == null) {
            return;
        }
        Picasso picasso = this.f21677OooO00o;
        o00O0O.OooO0O0(imageView2, picasso.f21755OooO0OO, bitmap, loadedFrom, this.f21680OooO0Oo, picasso.f21762OooOO0O);
        OooO oooO = this.f21743OooOOO0;
        if (oooO == null || (imageView = ((TweetMediaView.OooO0O0) oooO).f22383OooO00o.get()) == null) {
            return;
        }
        imageView.setBackgroundResource(R.color.transparent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.squareup.picasso.OooO00o
    public final void OooO0OO() {
        ImageView imageView = (ImageView) this.f21679OooO0OO.get();
        if (imageView == null) {
            return;
        }
        int i = this.f21683OooO0oO;
        if (i != 0) {
            imageView.setImageResource(i);
            return;
        }
        Drawable drawable = this.f21684OooO0oo;
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        }
    }
}
