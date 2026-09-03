package com.squareup.picasso;

import android.graphics.Bitmap;
import com.twitter.sdk.android.tweetui.internal.GalleryImageView;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0o0Oo extends OooO00o<o0OO00O> {
    public oo0o0Oo(Picasso picasso, GalleryImageView galleryImageView, o00Ooo o00ooo2, String str, int i) {
        super(picasso, galleryImageView, o00ooo2, i, str);
    }

    @Override // com.squareup.picasso.OooO00o
    public final void OooO0O0(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
        if (bitmap == null) {
            throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", this));
        }
        o0OO00O o0oo00oOooO0Oo = OooO0Oo();
        if (o0oo00oOooO0Oo != null) {
            o0oo00oOooO0Oo.OooO0O0(bitmap);
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Target callback must not recycle bitmap!");
            }
        }
    }

    @Override // com.squareup.picasso.OooO00o
    public final void OooO0OO() {
        o0OO00O o0oo00oOooO0Oo = OooO0Oo();
        if (o0oo00oOooO0Oo != null) {
            int i = this.f21683OooO0oO;
            if (i == 0) {
                o0oo00oOooO0Oo.OooO00o();
            } else {
                this.f21677OooO00o.f21755OooO0OO.getResources().getDrawable(i);
                o0oo00oOooO0Oo.OooO00o();
            }
        }
    }
}
