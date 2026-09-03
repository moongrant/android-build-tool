package com.squareup.picasso;

import android.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.twitter.sdk.android.tweetui.internal.TweetMediaView;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import p420o0Oo0ooO.oO00Oo0;
import p420o0Oo0ooO.oO00Oo00;

/* JADX INFO: loaded from: classes2.dex */
public final class o000oOoO {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final AtomicInteger f19814OooO0o = new AtomicInteger();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Picasso f19815OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Oooo0.OooO00o f19816OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f19817OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f19818OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Drawable f19819OooO0o0;

    public o000oOoO(Picasso picasso, Uri uri) {
        Objects.requireNonNull(picasso);
        this.f19815OooO00o = picasso;
        this.f19816OooO0O0 = new Oooo0.OooO00o(uri, picasso.f19802OooOO0O);
    }

    public final Oooo0 OooO00o(long j) {
        int andIncrement = f19814OooO0o.getAndIncrement();
        Oooo0.OooO00o oooO00o = this.f19816OooO0O0;
        if (oooO00o.f19787OooO0o0 && oooO00o.f19784OooO0OO == 0 && oooO00o.f19785OooO0Oo == 0) {
            throw new IllegalStateException("Center crop requires calling resize with positive width and height.");
        }
        if (oooO00o.f19788OooO0oO == null) {
            oooO00o.f19788OooO0oO = Picasso.Priority.NORMAL;
        }
        Oooo0 oooo0 = new Oooo0(oooO00o.f19782OooO00o, oooO00o.f19783OooO0O0, oooO00o.f19784OooO0OO, oooO00o.f19785OooO0Oo, oooO00o.f19787OooO0o0, oooO00o.f19786OooO0o, oooO00o.f19788OooO0oO);
        oooo0.f19766OooO00o = andIncrement;
        oooo0.f19767OooO0O0 = j;
        if (this.f19815OooO00o.f19804OooOOO0) {
            o00oO0o.OooOO0("Main", "created", oooo0.OooO0Oo(), oooo0.toString());
        }
        Objects.requireNonNull((Picasso.OooO.OooO00o) this.f19815OooO00o.f19794OooO0O0);
        return oooo0;
    }

    /* JADX WARN: Type inference failed for: r15v5, types: [java.util.Map<android.widget.ImageView, o0Oo0ooO.oO00Oo0>, java.util.WeakHashMap] */
    public final void OooO0O0(ImageView imageView, oO00Oo00 oo00oo00) {
        Bitmap bitmapOooO0o0;
        ImageView imageView2;
        long jNanoTime = System.nanoTime();
        o00oO0o.OooO0O0();
        if (imageView == null) {
            throw new IllegalArgumentException("Target must not be null.");
        }
        Oooo0.OooO00o oooO00o = this.f19816OooO0O0;
        boolean z = true;
        if (!((oooO00o.f19782OooO00o == null && oooO00o.f19783OooO0O0 == 0) ? false : true)) {
            this.f19815OooO00o.OooO00o(imageView);
            OooOo.OooO0OO(imageView, this.f19819OooO0o0);
            return;
        }
        if (this.f19817OooO0OO) {
            if (oooO00o.f19784OooO0OO == 0 && oooO00o.f19785OooO0Oo == 0) {
                z = false;
            }
            if (z) {
                throw new IllegalStateException("Fit cannot be used with resize.");
            }
            int width = imageView.getWidth();
            int height = imageView.getHeight();
            if (width == 0 || height == 0) {
                OooOo.OooO0OO(imageView, this.f19819OooO0o0);
                this.f19815OooO00o.f19792OooO.put(imageView, new oO00Oo0(this, imageView, oo00oo00));
                return;
            }
            this.f19816OooO0O0.OooO00o(width, height);
        }
        Oooo0 oooo0OooO00o = OooO00o(jNanoTime);
        String strOooO0o0 = o00oO0o.OooO0o0(oooo0OooO00o);
        if (!MemoryPolicy.OooO00o(0) || (bitmapOooO0o0 = this.f19815OooO00o.OooO0o0(strOooO0o0)) == null) {
            OooOo.OooO0OO(imageView, this.f19819OooO0o0);
            this.f19815OooO00o.OooO0OO(new OooOOO0(this.f19815OooO00o, imageView, oooo0OooO00o, this.f19818OooO0Oo, strOooO0o0, oo00oo00));
            return;
        }
        this.f19815OooO00o.OooO00o(imageView);
        Picasso picasso = this.f19815OooO00o;
        Context context = picasso.f19796OooO0Oo;
        Picasso.LoadedFrom loadedFrom = Picasso.LoadedFrom.MEMORY;
        OooOo.OooO0O0(imageView, context, bitmapOooO0o0, loadedFrom, false, picasso.f19803OooOO0o);
        if (this.f19815OooO00o.f19804OooOOO0) {
            o00oO0o.OooOO0("Main", "completed", oooo0OooO00o.OooO0Oo(), "from " + loadedFrom);
        }
        if (oo00oo00 == null || (imageView2 = ((TweetMediaView.OooO0O0) oo00oo00).f20188OooO00o.get()) == null) {
            return;
        }
        imageView2.setBackgroundResource(R.color.transparent);
    }
}
