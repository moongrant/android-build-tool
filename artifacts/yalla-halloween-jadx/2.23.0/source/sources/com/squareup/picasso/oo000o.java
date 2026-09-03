package com.squareup.picasso;

import android.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.twitter.sdk.android.tweetui.internal.TweetMediaView;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class oo000o {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final AtomicInteger f21849OooO0o = new AtomicInteger();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Picasso f21850OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00Ooo.OooO00o f21851OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f21852OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f21853OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Drawable f21854OooO0o0;

    public oo000o(Picasso picasso, Uri uri) {
        picasso.getClass();
        this.f21850OooO00o = picasso;
        this.f21851OooO0O0 = new o00Ooo.OooO00o(uri, picasso.f21761OooOO0);
    }

    public final o00Ooo OooO00o(long j) {
        int andIncrement = f21849OooO0o.getAndIncrement();
        o00Ooo.OooO00o oooO00o = this.f21851OooO0O0;
        if (oooO00o.f21812OooO0o0 && oooO00o.f21809OooO0OO == 0 && oooO00o.f21810OooO0Oo == 0) {
            throw new IllegalStateException("Center crop requires calling resize with positive width and height.");
        }
        if (oooO00o.f21813OooO0oO == null) {
            oooO00o.f21813OooO0oO = Picasso.Priority.NORMAL;
        }
        o00Ooo o00ooo2 = new o00Ooo(oooO00o.f21807OooO00o, oooO00o.f21808OooO0O0, oooO00o.f21809OooO0OO, oooO00o.f21810OooO0Oo, oooO00o.f21812OooO0o0, oooO00o.f21811OooO0o, oooO00o.f21813OooO0oO);
        o00ooo2.f21791OooO00o = andIncrement;
        o00ooo2.f21792OooO0O0 = j;
        if (this.f21850OooO00o.f21763OooOO0o) {
            o000000O.OooO0oo("Main", "created", o00ooo2.OooO0Oo(), o00ooo2.toString());
        }
        ((Picasso.OooO0o.OooO00o) this.f21850OooO00o.f21753OooO00o).getClass();
        return o00ooo2;
    }

    public final void OooO0O0(ImageView imageView, OooO oooO) {
        Bitmap bitmapOooO0o0;
        ImageView imageView2;
        long jNanoTime = System.nanoTime();
        o000000O.OooO0O0();
        if (imageView == null) {
            throw new IllegalArgumentException("Target must not be null.");
        }
        o00Ooo.OooO00o oooO00o = this.f21851OooO0O0;
        boolean z = true;
        if (!((oooO00o.f21807OooO00o == null && oooO00o.f21808OooO0O0 == 0) ? false : true)) {
            this.f21850OooO00o.OooO00o(imageView);
            o00O0O.OooO0OO(imageView, this.f21854OooO0o0);
            return;
        }
        if (this.f21852OooO0OO) {
            if (oooO00o.f21809OooO0OO == 0 && oooO00o.f21810OooO0Oo == 0) {
                z = false;
            }
            if (z) {
                throw new IllegalStateException("Fit cannot be used with resize.");
            }
            int width = imageView.getWidth();
            int height = imageView.getHeight();
            if (width == 0 || height == 0) {
                o00O0O.OooO0OO(imageView, this.f21854OooO0o0);
                this.f21850OooO00o.f21760OooO0oo.put(imageView, new OooOOO0(this, imageView, oooO));
                return;
            }
            this.f21851OooO0O0.OooO00o(width, height);
        }
        o00Ooo o00oooOooO00o = OooO00o(jNanoTime);
        String strOooO0OO = o000000O.OooO0OO(o00oooOooO00o);
        if (!MemoryPolicy.OooO00o(0) || (bitmapOooO0o0 = this.f21850OooO00o.OooO0o0(strOooO0OO)) == null) {
            o00O0O.OooO0OO(imageView, this.f21854OooO0o0);
            this.f21850OooO00o.OooO0OO(new OooOo00(this.f21850OooO00o, imageView, o00oooOooO00o, this.f21853OooO0Oo, strOooO0OO, oooO));
            return;
        }
        this.f21850OooO00o.OooO00o(imageView);
        Picasso picasso = this.f21850OooO00o;
        Context context = picasso.f21755OooO0OO;
        Picasso.LoadedFrom loadedFrom = Picasso.LoadedFrom.MEMORY;
        o00O0O.OooO0O0(imageView, context, bitmapOooO0o0, loadedFrom, false, picasso.f21762OooOO0O);
        if (this.f21850OooO00o.f21763OooOO0o) {
            o000000O.OooO0oo("Main", "completed", o00oooOooO00o.OooO0Oo(), "from " + loadedFrom);
        }
        if (oooO == null || (imageView2 = ((TweetMediaView.OooO0O0) oooO).f22383OooO00o.get()) == null) {
            return;
        }
        imageView2.setBackgroundResource(R.color.transparent);
    }
}
