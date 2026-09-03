package com.squareup.picasso;

import android.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.twitter.sdk.android.tweetui.internal.TweetMediaView;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class oo000o {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final AtomicInteger f21376OooO0o = new AtomicInteger();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Picasso f21377OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00Ooo.OooO00o f21378OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f21379OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f21380OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Drawable f21381OooO0o0;

    public oo000o(Picasso picasso, Uri uri) {
        picasso.getClass();
        this.f21377OooO00o = picasso;
        this.f21378OooO0O0 = new o00Ooo.OooO00o(uri, picasso.f21288OooOO0);
    }

    public final o00Ooo OooO00o(long j) {
        int andIncrement = f21376OooO0o.getAndIncrement();
        o00Ooo.OooO00o oooO00o = this.f21378OooO0O0;
        if (oooO00o.f21339OooO0o0 && oooO00o.f21336OooO0OO == 0 && oooO00o.f21337OooO0Oo == 0) {
            throw new IllegalStateException("Center crop requires calling resize with positive width and height.");
        }
        if (oooO00o.f21340OooO0oO == null) {
            oooO00o.f21340OooO0oO = Picasso.Priority.NORMAL;
        }
        o00Ooo o00ooo2 = new o00Ooo(oooO00o.f21334OooO00o, oooO00o.f21335OooO0O0, oooO00o.f21336OooO0OO, oooO00o.f21337OooO0Oo, oooO00o.f21339OooO0o0, oooO00o.f21338OooO0o, oooO00o.f21340OooO0oO);
        o00ooo2.f21318OooO00o = andIncrement;
        o00ooo2.f21319OooO0O0 = j;
        if (this.f21377OooO00o.f21290OooOO0o) {
            o000000O.OooO0oo("Main", "created", o00ooo2.OooO0Oo(), o00ooo2.toString());
        }
        ((Picasso.OooO0o.OooO00o) this.f21377OooO00o.f21280OooO00o).getClass();
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
        o00Ooo.OooO00o oooO00o = this.f21378OooO0O0;
        boolean z = true;
        if (!((oooO00o.f21334OooO00o == null && oooO00o.f21335OooO0O0 == 0) ? false : true)) {
            this.f21377OooO00o.OooO00o(imageView);
            o00O0O.OooO0OO(imageView, this.f21381OooO0o0);
            return;
        }
        if (this.f21379OooO0OO) {
            if (oooO00o.f21336OooO0OO == 0 && oooO00o.f21337OooO0Oo == 0) {
                z = false;
            }
            if (z) {
                throw new IllegalStateException("Fit cannot be used with resize.");
            }
            int width = imageView.getWidth();
            int height = imageView.getHeight();
            if (width == 0 || height == 0) {
                o00O0O.OooO0OO(imageView, this.f21381OooO0o0);
                this.f21377OooO00o.f21287OooO0oo.put(imageView, new OooOOO0(this, imageView, oooO));
                return;
            }
            this.f21378OooO0O0.OooO00o(width, height);
        }
        o00Ooo o00oooOooO00o = OooO00o(jNanoTime);
        String strOooO0OO = o000000O.OooO0OO(o00oooOooO00o);
        if (!MemoryPolicy.OooO00o(0) || (bitmapOooO0o0 = this.f21377OooO00o.OooO0o0(strOooO0OO)) == null) {
            o00O0O.OooO0OO(imageView, this.f21381OooO0o0);
            this.f21377OooO00o.OooO0OO(new OooOo00(this.f21377OooO00o, imageView, o00oooOooO00o, this.f21380OooO0Oo, strOooO0OO, oooO));
            return;
        }
        this.f21377OooO00o.OooO00o(imageView);
        Picasso picasso = this.f21377OooO00o;
        Context context = picasso.f21282OooO0OO;
        Picasso.LoadedFrom loadedFrom = Picasso.LoadedFrom.MEMORY;
        o00O0O.OooO0O0(imageView, context, bitmapOooO0o0, loadedFrom, false, picasso.f21289OooOO0O);
        if (this.f21377OooO00o.f21290OooOO0o) {
            o000000O.OooO0oo("Main", "completed", o00oooOooO00o.OooO0Oo(), "from " + loadedFrom);
        }
        if (oooO == null || (imageView2 = ((TweetMediaView.OooO0O0) oooO).f21909OooO00o.get()) == null) {
            return;
        }
        imageView2.setBackgroundResource(R.color.transparent);
    }
}
