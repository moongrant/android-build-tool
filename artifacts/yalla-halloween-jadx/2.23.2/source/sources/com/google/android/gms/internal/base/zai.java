package com.google.android.gms.internal.base;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import net.sqlcipher.database.SQLiteDatabase;
import p265o00oooO.o000O;
import p265o00oooO.o000OO00;

/* JADX INFO: loaded from: classes3.dex */
public final class zai extends Drawable implements Drawable.Callback {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f14859OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f14860OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f14861OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public long f14862OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f14863OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f14864OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final boolean f14865OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f14866OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final o000OO00 f14867OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final Drawable f14868OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final Drawable f14869OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f14870OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f14871OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public int f14872OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f14873OooOOo0;

    public zai(@Nullable Drawable drawable, @Nullable Drawable drawable2) {
        this(null);
        drawable = drawable == null ? o000O.f40395OooO00o : drawable;
        this.f14869OooOOO0 = drawable;
        drawable.setCallback(this);
        o000OO00 o000oo01 = this.f14867OooOO0o;
        o000oo01.f40398OooO0O0 = drawable.getChangingConfigurations() | o000oo01.f40398OooO0O0;
        drawable2 = drawable2 == null ? o000O.f40395OooO00o : drawable2;
        this.f14868OooOOO = drawable2;
        drawable2.setCallback(this);
        o000OO00 o000oo02 = this.f14867OooOO0o;
        o000oo02.f40398OooO0O0 = drawable2.getChangingConfigurations() | o000oo02.f40398OooO0O0;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0059  */
    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        int i2 = this.f14860OooO0Oo;
        int i3 = 0;
        boolean z = true;
        if (i2 == 1) {
            this.f14862OooO0o0 = SystemClock.uptimeMillis();
            this.f14860OooO0Oo = 2;
            z = false;
        } else if (i2 == 2 && this.f14862OooO0o0 >= 0) {
            float fUptimeMillis = (SystemClock.uptimeMillis() - this.f14862OooO0o0) / this.f14864OooO0oo;
            z = fUptimeMillis >= 1.0f;
            if (z) {
                this.f14860OooO0Oo = 0;
            }
            this.f14859OooO = (int) ((this.f14861OooO0o * Math.min(fUptimeMillis, 1.0f)) + 0.0f);
        }
        int i4 = this.f14859OooO;
        boolean z2 = this.f14865OooOO0;
        Drawable drawable = this.f14869OooOOO0;
        Drawable drawable2 = this.f14868OooOOO;
        if (!z) {
            if (z2) {
                drawable.setAlpha(this.f14863OooO0oO - i4);
            }
            drawable.draw(canvas);
            if (z2) {
                drawable.setAlpha(this.f14863OooO0oO);
            }
            if (i4 > 0) {
                drawable2.setAlpha(i4);
                drawable2.draw(canvas);
                drawable2.setAlpha(this.f14863OooO0oO);
            }
            invalidateSelf();
            return;
        }
        if (z2) {
            if (i4 == 0) {
            }
            i = this.f14863OooO0oO;
            if (i4 == i) {
                drawable2.setAlpha(i);
                drawable2.draw(canvas);
            }
        }
        i3 = i4;
        drawable.draw(canvas);
        i4 = i3;
        i = this.f14863OooO0oO;
        if (i4 == i) {
            drawable2.setAlpha(i);
            drawable2.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        o000OO00 o000oo01 = this.f14867OooOO0o;
        return changingConfigurations | o000oo01.f40397OooO00o | o000oo01.f40398OooO0O0;
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public final Drawable.ConstantState getConstantState() {
        if (!zac()) {
            return null;
        }
        int changingConfigurations = getChangingConfigurations();
        o000OO00 o000oo01 = this.f14867OooOO0o;
        o000oo01.f40397OooO00o = changingConfigurations;
        return o000oo01;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return Math.max(this.f14869OooOOO0.getIntrinsicHeight(), this.f14868OooOOO.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.max(this.f14869OooOOO0.getIntrinsicWidth(), this.f14868OooOOO.getIntrinsicWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (!this.f14873OooOOo0) {
            this.f14872OooOOo = Drawable.resolveOpacity(this.f14869OooOOO0.getOpacity(), this.f14868OooOOO.getOpacity());
            this.f14873OooOOo0 = true;
        }
        return this.f14872OooOOo;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f14866OooOO0O && super.mutate() == this) {
            if (!zac()) {
                throw new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
            }
            this.f14869OooOOO0.mutate();
            this.f14868OooOOO.mutate();
            this.f14866OooOO0O = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f14869OooOOO0.setBounds(rect);
        this.f14868OooOOO.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f14859OooO == this.f14863OooO0oO) {
            this.f14859OooO = i;
        }
        this.f14863OooO0oO = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f14869OooOOO0.setColorFilter(colorFilter);
        this.f14868OooOOO.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final Drawable zaa() {
        return this.f14868OooOOO;
    }

    public final void zab(int i) {
        this.f14861OooO0o = this.f14863OooO0oO;
        this.f14859OooO = 0;
        this.f14864OooO0oo = SQLiteDatabase.MAX_SQL_CACHE_SIZE;
        this.f14860OooO0Oo = 1;
        invalidateSelf();
    }

    public final boolean zac() {
        if (!this.f14870OooOOOO) {
            boolean z = false;
            if (this.f14869OooOOO0.getConstantState() != null && this.f14868OooOOO.getConstantState() != null) {
                z = true;
            }
            this.f14871OooOOOo = z;
            this.f14870OooOOOO = true;
        }
        return this.f14871OooOOOo;
    }

    public zai(@Nullable o000OO00 o000oo01) {
        this.f14860OooO0Oo = 0;
        this.f14863OooO0oO = 255;
        this.f14859OooO = 0;
        this.f14865OooOO0 = true;
        this.f14867OooOO0o = new o000OO00(o000oo01);
    }
}
