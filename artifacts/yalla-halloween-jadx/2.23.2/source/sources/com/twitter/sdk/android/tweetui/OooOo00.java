package com.twitter.sdk.android.tweetui;

import android.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.Picasso;
import com.twitter.sdk.android.core.models.MediaEntity;
import com.twitter.sdk.android.tweetui.internal.GalleryImageView;
import com.twitter.sdk.android.tweetui.internal.MultiTouchImageView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo00 extends p114o00O00o.OooO0OO {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ArrayList f21846OooO0OO = new ArrayList();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Context f21847OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final com.twitter.sdk.android.tweetui.internal.OooO00o.InterfaceC0282OooO00o f21848OooO0o0;

    public OooOo00(Context context, OooOOOO oooOOOO) {
        this.f21847OooO0Oo = context;
        this.f21848OooO0o0 = oooOOOO;
    }

    @Override // p114o00O00o.OooO0OO
    public final void OooO00o(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // p114o00O00o.OooO0OO
    public final int OooO0OO() {
        return this.f21846OooO0OO.size();
    }

    @Override // p114o00O00o.OooO0OO
    public final Object OooO0oO(ViewGroup viewGroup, int i) {
        Bitmap bitmapOooO0o0;
        Context context = this.f21847OooO0Oo;
        GalleryImageView galleryImageView = new GalleryImageView(context);
        galleryImageView.setSwipeToDismissCallback(this.f21848OooO0o0);
        viewGroup.addView(galleryImageView);
        com.squareup.picasso.oo000o oo000oVarOooO0Oo = Picasso.OooO0o(context).OooO0Oo(((MediaEntity) this.f21846OooO0OO.get(i)).f21555OooOO0O);
        long jNanoTime = System.nanoTime();
        com.squareup.picasso.o000000O.OooO0O0();
        if (oo000oVarOooO0Oo.f21379OooO0OO) {
            throw new IllegalStateException("Fit cannot be used with a Target.");
        }
        com.squareup.picasso.o00Ooo.OooO00o oooO00o = oo000oVarOooO0Oo.f21378OooO0O0;
        boolean z = (oooO00o.f21334OooO00o == null && oooO00o.f21335OooO0O0 == 0) ? false : true;
        ProgressBar progressBar = galleryImageView.f21870OooO0o0;
        MultiTouchImageView multiTouchImageView = galleryImageView.f21869OooO0Oo;
        Picasso picasso = oo000oVarOooO0Oo.f21377OooO00o;
        if (z) {
            com.squareup.picasso.o00Ooo o00oooOooO00o = oo000oVarOooO0Oo.OooO00o(jNanoTime);
            String strOooO0OO = com.squareup.picasso.o000000O.OooO0OO(o00oooOooO00o);
            if (!MemoryPolicy.OooO00o(0) || (bitmapOooO0o0 = picasso.OooO0o0(strOooO0OO)) == null) {
                multiTouchImageView.setImageResource(R.color.transparent);
                progressBar.setVisibility(0);
                picasso.OooO0OO(new com.squareup.picasso.oo0o0Oo(oo000oVarOooO0Oo.f21377OooO00o, galleryImageView, o00oooOooO00o, strOooO0OO, oo000oVarOooO0Oo.f21380OooO0Oo));
            } else {
                picasso.OooO00o(galleryImageView);
                galleryImageView.OooO0O0(bitmapOooO0o0);
            }
        } else {
            picasso.OooO00o(galleryImageView);
            multiTouchImageView.setImageResource(R.color.transparent);
            progressBar.setVisibility(0);
        }
        return galleryImageView;
    }

    @Override // p114o00O00o.OooO0OO
    public final boolean OooO0oo(View view, Object obj) {
        return view == obj;
    }
}
