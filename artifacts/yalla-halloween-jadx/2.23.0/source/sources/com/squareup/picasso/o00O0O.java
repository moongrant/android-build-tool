package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0O extends BitmapDrawable {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final Paint f21780OooO0oo = new Paint();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f21781OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f21782OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Picasso.LoadedFrom f21783OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Drawable f21784OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f21785OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f21786OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f21787OooO0oO;

    public o00O0O(Context context, Bitmap bitmap, Drawable drawable, Picasso.LoadedFrom loadedFrom, boolean z, boolean z2) {
        super(context.getResources(), bitmap);
        this.f21787OooO0oO = 255;
        this.f21781OooO00o = z2;
        this.f21782OooO0O0 = context.getResources().getDisplayMetrics().density;
        this.f21783OooO0OO = loadedFrom;
        if ((loadedFrom == Picasso.LoadedFrom.MEMORY || z) ? false : true) {
            this.f21784OooO0Oo = drawable;
            this.f21785OooO0o = true;
            this.f21786OooO0o0 = SystemClock.uptimeMillis();
        }
    }

    public static Path OooO00o(Point point, int i) {
        Point point2 = new Point(point.x + i, point.y);
        Point point3 = new Point(point.x, point.y + i);
        Path path = new Path();
        path.moveTo(point.x, point.y);
        path.lineTo(point2.x, point2.y);
        path.lineTo(point3.x, point3.y);
        return path;
    }

    public static void OooO0O0(ImageView imageView, Context context, Bitmap bitmap, Picasso.LoadedFrom loadedFrom, boolean z, boolean z2) {
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof AnimationDrawable) {
            ((AnimationDrawable) drawable).stop();
        }
        imageView.setImageDrawable(new o00O0O(context, bitmap, drawable, loadedFrom, z, z2));
    }

    public static void OooO0OO(ImageView imageView, Drawable drawable) {
        imageView.setImageDrawable(drawable);
        if (imageView.getDrawable() instanceof AnimationDrawable) {
            ((AnimationDrawable) imageView.getDrawable()).start();
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f21785OooO0o) {
            float fUptimeMillis = (SystemClock.uptimeMillis() - this.f21786OooO0o0) / 200.0f;
            if (fUptimeMillis >= 1.0f) {
                this.f21785OooO0o = false;
                this.f21784OooO0Oo = null;
                super.draw(canvas);
            } else {
                Drawable drawable = this.f21784OooO0Oo;
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                super.setAlpha((int) (this.f21787OooO0oO * fUptimeMillis));
                super.draw(canvas);
                super.setAlpha(this.f21787OooO0oO);
            }
        } else {
            super.draw(canvas);
        }
        if (this.f21781OooO00o) {
            Paint paint = f21780OooO0oo;
            paint.setColor(-1);
            Point point = new Point(0, 0);
            float f = this.f21782OooO0O0;
            canvas.drawPath(OooO00o(point, (int) (16.0f * f)), paint);
            paint.setColor(this.f21783OooO0OO.debugColor);
            canvas.drawPath(OooO00o(new Point(0, 0), (int) (f * 15.0f)), paint);
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f21784OooO0Oo;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f21787OooO0oO = i;
        Drawable drawable = this.f21784OooO0Oo;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
        super.setAlpha(i);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f21784OooO0Oo;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        super.setColorFilter(colorFilter);
    }
}
