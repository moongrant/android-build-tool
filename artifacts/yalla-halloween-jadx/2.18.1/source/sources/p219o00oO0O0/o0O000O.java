package p219o00oO0O0;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import p078o000Oo00.OooO;
import p243o00oo00O.o000O000;

/* JADX INFO: loaded from: classes.dex */
public final class o0O000O implements o0oOOo {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final Bitmap.Config f33653OooOO0 = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f33654OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0OoOoOo f33655OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Set<Bitmap.Config> f33656OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO00o f33657OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long f33658OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f33659OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public long f33660OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f33661OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f33662OooO0oo;

    public static final class OooO00o {
    }

    public o0O000O(long j) {
        o0O000o0 o0o000o1 = new o0O000o0();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        Set<Bitmap.Config> setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.f33658OooO0Oo = j;
        this.f33655OooO00o = o0o000o1;
        this.f33656OooO0O0 = setUnmodifiableSet;
        this.f33657OooO0OO = new OooO00o();
    }

    public final synchronized void OooO(long j) {
        while (this.f33660OooO0o0 > j) {
            o0O000o0 o0o000o1 = (o0O000o0) this.f33655OooO00o;
            Bitmap bitmapOooO0Oo = o0o000o1.f33669OooO0O0.OooO0Oo();
            if (bitmapOooO0Oo != null) {
                o0o000o1.OooO00o(Integer.valueOf(o000O000.OooO0Oo(bitmapOooO0Oo)), bitmapOooO0Oo);
            }
            if (bitmapOooO0Oo == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    OooO0oO();
                }
                this.f33660OooO0o0 = 0L;
                return;
            }
            Objects.requireNonNull(this.f33657OooO0OO);
            long j2 = this.f33660OooO0o0;
            Objects.requireNonNull((o0O000o0) this.f33655OooO00o);
            this.f33660OooO0o0 = j2 - ((long) o000O000.OooO0Oo(bitmapOooO0Oo));
            this.f33654OooO++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Evicting bitmap=" + ((o0O000o0) this.f33655OooO00o).OooO0o0(bitmapOooO0Oo));
            }
            OooO0o();
            bitmapOooO0Oo.recycle();
        }
    }

    @Override // p219o00oO0O0.o0oOOo
    @SuppressLint({"InlinedApi"})
    public final void OooO00o(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            OooO.OooO00o("trimMemory, level=", i, "LruBitmapPool");
        }
        if (i >= 40 || (Build.VERSION.SDK_INT >= 23 && i >= 20)) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "clearMemory");
            }
            OooO(0L);
        } else if (i >= 20 || i == 15) {
            OooO(this.f33658OooO0Oo / 2);
        }
    }

    @Override // p219o00oO0O0.o0oOOo
    public final synchronized void OooO0O0(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable()) {
                Objects.requireNonNull((o0O000o0) this.f33655OooO00o);
                if (o000O000.OooO0Oo(bitmap) <= this.f33658OooO0Oo && this.f33656OooO0O0.contains(bitmap.getConfig())) {
                    Objects.requireNonNull((o0O000o0) this.f33655OooO00o);
                    int iOooO0Oo = o000O000.OooO0Oo(bitmap);
                    ((o0O000o0) this.f33655OooO00o).OooO0o(bitmap);
                    Objects.requireNonNull(this.f33657OooO0OO);
                    this.f33662OooO0oo++;
                    this.f33660OooO0o0 += (long) iOooO0Oo;
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        Log.v("LruBitmapPool", "Put bitmap in pool=" + ((o0O000o0) this.f33655OooO00o).OooO0o0(bitmap));
                    }
                    OooO0o();
                    OooO(this.f33658OooO0Oo);
                    return;
                }
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + ((o0O000o0) this.f33655OooO00o).OooO0o0(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f33656OooO0O0.contains(bitmap.getConfig()));
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p219o00oO0O0.o0oOOo
    @NonNull
    public final Bitmap OooO0OO(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapOooO0oo = OooO0oo(i, i2, config);
        if (bitmapOooO0oo != null) {
            bitmapOooO0oo.eraseColor(0);
            return bitmapOooO0oo;
        }
        if (config == null) {
            config = f33653OooOO0;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // p219o00oO0O0.o0oOOo
    @NonNull
    public final Bitmap OooO0Oo(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapOooO0oo = OooO0oo(i, i2, config);
        if (bitmapOooO0oo != null) {
            return bitmapOooO0oo;
        }
        if (config == null) {
            config = f33653OooOO0;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    public final void OooO0o() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            OooO0oO();
        }
    }

    @Override // p219o00oO0O0.o0oOOo
    public final void OooO0o0() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        OooO(0L);
    }

    public final void OooO0oO() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Hits=");
        sbOooO0o0.append(this.f33659OooO0o);
        sbOooO0o0.append(", misses=");
        sbOooO0o0.append(this.f33661OooO0oO);
        sbOooO0o0.append(", puts=");
        sbOooO0o0.append(this.f33662OooO0oo);
        sbOooO0o0.append(", evictions=");
        sbOooO0o0.append(this.f33654OooO);
        sbOooO0o0.append(", currentSize=");
        sbOooO0o0.append(this.f33660OooO0o0);
        sbOooO0o0.append(", maxSize=");
        sbOooO0o0.append(this.f33658OooO0Oo);
        sbOooO0o0.append("\nStrategy=");
        sbOooO0o0.append(this.f33655OooO00o);
        Log.v("LruBitmapPool", sbOooO0o0.toString());
    }

    @Nullable
    public final synchronized Bitmap OooO0oo(int i, int i2, @Nullable Bitmap.Config config) {
        Bitmap bitmapOooO0O0;
        if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
        bitmapOooO0O0 = ((o0O000o0) this.f33655OooO00o).OooO0O0(i, i2, config != null ? config : f33653OooOO0);
        if (bitmapOooO0O0 == null) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Missing bitmap=");
                Objects.requireNonNull((o0O000o0) this.f33655OooO00o);
                sb.append(o0O000o0.OooO0OO(o000O000.OooO0OO(i, i2, config), config));
                Log.d("LruBitmapPool", sb.toString());
            }
            this.f33661OooO0oO++;
        } else {
            this.f33659OooO0o++;
            long j = this.f33660OooO0o0;
            Objects.requireNonNull((o0O000o0) this.f33655OooO00o);
            this.f33660OooO0o0 = j - ((long) o000O000.OooO0Oo(bitmapOooO0O0));
            Objects.requireNonNull(this.f33657OooO0OO);
            bitmapOooO0O0.setHasAlpha(true);
            bitmapOooO0O0.setPremultiplied(true);
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Get bitmap=");
            Objects.requireNonNull((o0O000o0) this.f33655OooO00o);
            sb2.append(o0O000o0.OooO0OO(o000O000.OooO0OO(i, i2, config), config));
            Log.v("LruBitmapPool", sb2.toString());
        }
        OooO0o();
        return bitmapOooO0O0;
    }
}
