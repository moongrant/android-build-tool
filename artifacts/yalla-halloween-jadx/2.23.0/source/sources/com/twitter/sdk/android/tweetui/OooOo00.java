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

/* JADX INFO: loaded from: classes4.dex */
public final class OooOo00 extends p082o000OoOo.OooOO0O {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ArrayList f22320OooO0OO = new ArrayList();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Context f22321OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final com.twitter.sdk.android.tweetui.internal.OooO00o.InterfaceC0283OooO00o f22322OooO0o0;

    public OooOo00(Context context, OooOOOO oooOOOO) {
        this.f22321OooO0Oo = context;
        this.f22322OooO0o0 = oooOOOO;
    }

    @Override // p082o000OoOo.OooOO0O
    public final void OooO00o(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // p082o000OoOo.OooOO0O
    public final int OooO0OO() {
        return this.f22320OooO0OO.size();
    }

    @Override // p082o000OoOo.OooOO0O
    public final Object OooO0oO(ViewGroup viewGroup, int i) {
        Bitmap bitmapOooO0o0;
        Context context = this.f22321OooO0Oo;
        GalleryImageView galleryImageView = new GalleryImageView(context);
        galleryImageView.setSwipeToDismissCallback(this.f22322OooO0o0);
        viewGroup.addView(galleryImageView);
        com.squareup.picasso.oo000o oo000oVarOooO0Oo = Picasso.OooO0o(context).OooO0Oo(((MediaEntity) this.f22320OooO0OO.get(i)).f22026OooOO0O);
        long jNanoTime = System.nanoTime();
        com.squareup.picasso.o000000O.OooO0O0();
        if (oo000oVarOooO0Oo.f21852OooO0OO) {
            throw new IllegalStateException("Fit cannot be used with a Target.");
        }
        com.squareup.picasso.o00Ooo.OooO00o oooO00o = oo000oVarOooO0Oo.f21851OooO0O0;
        boolean z = (oooO00o.f21807OooO00o == null && oooO00o.f21808OooO0O0 == 0) ? false : true;
        ProgressBar progressBar = galleryImageView.f22344OooO0o0;
        MultiTouchImageView multiTouchImageView = galleryImageView.f22343OooO0Oo;
        Picasso picasso = oo000oVarOooO0Oo.f21850OooO00o;
        if (z) {
            com.squareup.picasso.o00Ooo o00oooOooO00o = oo000oVarOooO0Oo.OooO00o(jNanoTime);
            String strOooO0OO = com.squareup.picasso.o000000O.OooO0OO(o00oooOooO00o);
            if (!MemoryPolicy.OooO00o(0) || (bitmapOooO0o0 = picasso.OooO0o0(strOooO0OO)) == null) {
                multiTouchImageView.setImageResource(R.color.transparent);
                progressBar.setVisibility(0);
                picasso.OooO0OO(new com.squareup.picasso.oo0o0Oo(oo000oVarOooO0Oo.f21850OooO00o, galleryImageView, o00oooOooO00o, strOooO0OO, oo000oVarOooO0Oo.f21853OooO0Oo));
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

    @Override // p082o000OoOo.OooOO0O
    public final boolean OooO0oo(View view, Object obj) {
        return view == obj;
    }
}
