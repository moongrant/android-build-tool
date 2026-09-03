package p156o00OoO00;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p174o00OooOo.o00OO0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo implements OooOO0 {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final Bitmap.Config f37968OooOO0 = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f37969OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Oooo000 f37970OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Set<Bitmap.Config> f37971OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO00o f37972OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f37973OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f37974OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public long f37975OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f37976OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f37977OooO0oo;

    public static final class OooO00o {
    }

    public OooOo(long j) {
        o000oOoO o000oooo2 = new o000oOoO();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        Set<Bitmap.Config> setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.f37973OooO0Oo = j;
        this.f37970OooO00o = o000oooo2;
        this.f37971OooO0O0 = setUnmodifiableSet;
        this.f37972OooO0OO = new OooO00o();
    }

    @Override // p156o00OoO00.OooOO0
    @SuppressLint({"InlinedApi"})
    public final void OooO00o(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i);
        }
        if (i >= 40 || i >= 20) {
            OooO0O0();
        } else if (i >= 20 || i == 15) {
            OooO0oo(this.f37973OooO0Oo / 2);
        }
    }

    @Override // p156o00OoO00.OooOO0
    public final void OooO0O0() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        OooO0oo(0L);
    }

    @Override // p156o00OoO00.OooOO0
    @NonNull
    public final Bitmap OooO0OO(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapOooO0oO = OooO0oO(i, i2, config);
        if (bitmapOooO0oO != null) {
            return bitmapOooO0oO;
        }
        if (config == null) {
            config = f37968OooOO0;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // p156o00OoO00.OooOO0
    public final synchronized void OooO0Oo(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable()) {
                ((o000oOoO) this.f37970OooO00o).getClass();
                if (o00OO0O0.OooO0OO(bitmap) <= this.f37973OooO0Oo && this.f37971OooO0O0.contains(bitmap.getConfig())) {
                    ((o000oOoO) this.f37970OooO00o).getClass();
                    int iOooO0OO = o00OO0O0.OooO0OO(bitmap);
                    ((o000oOoO) this.f37970OooO00o).OooO0o(bitmap);
                    this.f37972OooO0OO.getClass();
                    this.f37977OooO0oo++;
                    this.f37975OooO0o0 += (long) iOooO0OO;
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        Log.v("LruBitmapPool", "Put bitmap in pool=" + ((o000oOoO) this.f37970OooO00o).OooO0o0(bitmap));
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        OooO0o();
                    }
                    OooO0oo(this.f37973OooO0Oo);
                    return;
                }
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + ((o000oOoO) this.f37970OooO00o).OooO0o0(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f37971OooO0O0.contains(bitmap.getConfig()));
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void OooO0o() {
        Log.v("LruBitmapPool", "Hits=" + this.f37974OooO0o + ", misses=" + this.f37976OooO0oO + ", puts=" + this.f37977OooO0oo + ", evictions=" + this.f37969OooO + ", currentSize=" + this.f37975OooO0o0 + ", maxSize=" + this.f37973OooO0Oo + "\nStrategy=" + this.f37970OooO00o);
    }

    @Override // p156o00OoO00.OooOO0
    @NonNull
    public final Bitmap OooO0o0(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapOooO0oO = OooO0oO(i, i2, config);
        if (bitmapOooO0oO != null) {
            bitmapOooO0oO.eraseColor(0);
            return bitmapOooO0oO;
        }
        if (config == null) {
            config = f37968OooOO0;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    @Nullable
    public final synchronized Bitmap OooO0oO(int i, int i2, @Nullable Bitmap.Config config) {
        Bitmap bitmapOooO0O0;
        int i3;
        try {
            if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
                throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            }
            bitmapOooO0O0 = ((o000oOoO) this.f37970OooO00o).OooO0O0(i, i2, config != null ? config : f37968OooOO0);
            int i4 = 8;
            if (bitmapOooO0O0 == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb = new StringBuilder("Missing bitmap=");
                    ((o000oOoO) this.f37970OooO00o).getClass();
                    char[] cArr = o00OO0O0.f38351OooO00o;
                    int i5 = i * i2;
                    int i6 = o00OO0O0.OooO00o.f38354OooO00o[(config == null ? Bitmap.Config.ARGB_8888 : config).ordinal()];
                    if (i6 == 1) {
                        i3 = 1;
                    } else if (i6 == 2 || i6 == 3) {
                        i3 = 2;
                    } else {
                        i3 = i6 != 4 ? 4 : 8;
                    }
                    sb.append(o000oOoO.OooO0OO(i3 * i5, config));
                    Log.d("LruBitmapPool", sb.toString());
                }
                this.f37976OooO0oO++;
            } else {
                this.f37974OooO0o++;
                long j = this.f37975OooO0o0;
                ((o000oOoO) this.f37970OooO00o).getClass();
                this.f37975OooO0o0 = j - ((long) o00OO0O0.OooO0OO(bitmapOooO0O0));
                this.f37972OooO0OO.getClass();
                bitmapOooO0O0.setHasAlpha(true);
                bitmapOooO0O0.setPremultiplied(true);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb2 = new StringBuilder("Get bitmap=");
                ((o000oOoO) this.f37970OooO00o).getClass();
                char[] cArr2 = o00OO0O0.f38351OooO00o;
                int i7 = i * i2;
                int i8 = o00OO0O0.OooO00o.f38354OooO00o[(config == null ? Bitmap.Config.ARGB_8888 : config).ordinal()];
                if (i8 == 1) {
                    i4 = 1;
                } else if (i8 == 2 || i8 == 3) {
                    i4 = 2;
                } else if (i8 != 4) {
                    i4 = 4;
                }
                sb2.append(o000oOoO.OooO0OO(i4 * i7, config));
                Log.v("LruBitmapPool", sb2.toString());
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                OooO0o();
            }
        } catch (Throwable th) {
            throw th;
        }
        return bitmapOooO0O0;
    }

    public final synchronized void OooO0oo(long j) {
        while (this.f37975OooO0o0 > j) {
            o000oOoO o000oooo2 = (o000oOoO) this.f37970OooO00o;
            Bitmap bitmapOooO0OO = o000oooo2.f37993OooO0O0.OooO0OO();
            if (bitmapOooO0OO != null) {
                o000oooo2.OooO00o(Integer.valueOf(o00OO0O0.OooO0OO(bitmapOooO0OO)), bitmapOooO0OO);
            }
            if (bitmapOooO0OO == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    OooO0o();
                }
                this.f37975OooO0o0 = 0L;
                return;
            }
            this.f37972OooO0OO.getClass();
            long j2 = this.f37975OooO0o0;
            ((o000oOoO) this.f37970OooO00o).getClass();
            this.f37975OooO0o0 = j2 - ((long) o00OO0O0.OooO0OO(bitmapOooO0OO));
            this.f37969OooO++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Evicting bitmap=" + ((o000oOoO) this.f37970OooO00o).OooO0o0(bitmapOooO0OO));
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                OooO0o();
            }
            bitmapOooO0OO.recycle();
        }
    }
}
