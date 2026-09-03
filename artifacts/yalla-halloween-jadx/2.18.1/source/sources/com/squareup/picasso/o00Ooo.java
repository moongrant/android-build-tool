package com.squareup.picasso;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Ooo extends OooO00o<o00Oo0> {
    public o00Ooo(Picasso picasso, o00Oo0 o00oo1, Oooo0 oooo0, String str, int i) {
        super(picasso, o00oo1, oooo0, i, str);
    }

    @Override // com.squareup.picasso.OooO00o
    public final void OooO0O0(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
        if (bitmap == null) {
            throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", this));
        }
        o00Oo0 o00oo0OooO0Oo = OooO0Oo();
        if (o00oo0OooO0Oo != null) {
            o00oo0OooO0Oo.OooO0O0(bitmap);
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Target callback must not recycle bitmap!");
            }
        }
    }

    @Override // com.squareup.picasso.OooO00o
    public final void OooO0OO() {
        o00Oo0 o00oo0OooO0Oo = OooO0Oo();
        if (o00oo0OooO0Oo != null) {
            if (this.f19697OooO0oO == 0) {
                o00oo0OooO0Oo.OooO00o();
            } else {
                this.f19691OooO00o.f19796OooO0Oo.getResources().getDrawable(this.f19697OooO0oO);
                o00oo0OooO0Oo.OooO00o();
            }
        }
    }
}
