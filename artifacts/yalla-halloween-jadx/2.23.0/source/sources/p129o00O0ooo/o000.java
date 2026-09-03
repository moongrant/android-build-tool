package p129o00O0ooo;

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
import p532o0o0Oo.o0000oo;

/* JADX INFO: loaded from: classes2.dex */
public final class o000 implements o0000oo {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final Bitmap.Config f36953OooOO0 = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f36954OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000O000 f36955OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Set<Bitmap.Config> f36956OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO00o f36957OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f36958OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f36959OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public long f36960OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f36961OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f36962OooO0oo;

    public static final class OooO00o {
    }

    public o000(long j) {
        o000Oo0 o000oo1 = new o000Oo0();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        Set<Bitmap.Config> setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.f36958OooO0Oo = j;
        this.f36955OooO00o = o000oo1;
        this.f36956OooO0O0 = setUnmodifiableSet;
        this.f36957OooO0OO = new OooO00o();
    }

    @Override // p129o00O0ooo.o0000oo
    @SuppressLint({"InlinedApi"})
    public final void OooO00o(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i);
        }
        if (i >= 40 || i >= 20) {
            OooO0O0();
        } else if (i >= 20 || i == 15) {
            OooO0oo(this.f36958OooO0Oo / 2);
        }
    }

    @Override // p129o00O0ooo.o0000oo
    public final void OooO0O0() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        OooO0oo(0L);
    }

    @Override // p129o00O0ooo.o0000oo
    @NonNull
    public final Bitmap OooO0OO(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapOooO0oO = OooO0oO(i, i2, config);
        if (bitmapOooO0oO != null) {
            return bitmapOooO0oO;
        }
        if (config == null) {
            config = f36953OooOO0;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // p129o00O0ooo.o0000oo
    public final synchronized void OooO0Oo(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable()) {
                ((o000Oo0) this.f36955OooO00o).getClass();
                if (o0000oo.OooO0OO(bitmap) <= this.f36958OooO0Oo && this.f36956OooO0O0.contains(bitmap.getConfig())) {
                    ((o000Oo0) this.f36955OooO00o).getClass();
                    int iOooO0OO = o0000oo.OooO0OO(bitmap);
                    ((o000Oo0) this.f36955OooO00o).OooO0o(bitmap);
                    this.f36957OooO0OO.getClass();
                    this.f36962OooO0oo++;
                    this.f36960OooO0o0 += (long) iOooO0OO;
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        Log.v("LruBitmapPool", "Put bitmap in pool=" + ((o000Oo0) this.f36955OooO00o).OooO0o0(bitmap));
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        OooO0o();
                    }
                    OooO0oo(this.f36958OooO0Oo);
                    return;
                }
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + ((o000Oo0) this.f36955OooO00o).OooO0o0(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f36956OooO0O0.contains(bitmap.getConfig()));
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void OooO0o() {
        Log.v("LruBitmapPool", "Hits=" + this.f36959OooO0o + ", misses=" + this.f36961OooO0oO + ", puts=" + this.f36962OooO0oo + ", evictions=" + this.f36954OooO + ", currentSize=" + this.f36960OooO0o0 + ", maxSize=" + this.f36958OooO0Oo + "\nStrategy=" + this.f36955OooO00o);
    }

    @Override // p129o00O0ooo.o0000oo
    @NonNull
    public final Bitmap OooO0o0(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapOooO0oO = OooO0oO(i, i2, config);
        if (bitmapOooO0oO != null) {
            bitmapOooO0oO.eraseColor(0);
            return bitmapOooO0oO;
        }
        if (config == null) {
            config = f36953OooOO0;
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
            bitmapOooO0O0 = ((o000Oo0) this.f36955OooO00o).OooO0O0(i, i2, config != null ? config : f36953OooOO0);
            int i4 = 8;
            if (bitmapOooO0O0 == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb = new StringBuilder("Missing bitmap=");
                    ((o000Oo0) this.f36955OooO00o).getClass();
                    char[] cArr = o0000oo.f54571OooO00o;
                    int i5 = i * i2;
                    int i6 = o0000oo.OooO00o.f54574OooO00o[(config == null ? Bitmap.Config.ARGB_8888 : config).ordinal()];
                    if (i6 == 1) {
                        i3 = 1;
                    } else if (i6 == 2 || i6 == 3) {
                        i3 = 2;
                    } else {
                        i3 = i6 != 4 ? 4 : 8;
                    }
                    sb.append(o000Oo0.OooO0OO(i3 * i5, config));
                    Log.d("LruBitmapPool", sb.toString());
                }
                this.f36961OooO0oO++;
            } else {
                this.f36959OooO0o++;
                long j = this.f36960OooO0o0;
                ((o000Oo0) this.f36955OooO00o).getClass();
                this.f36960OooO0o0 = j - ((long) o0000oo.OooO0OO(bitmapOooO0O0));
                this.f36957OooO0OO.getClass();
                bitmapOooO0O0.setHasAlpha(true);
                bitmapOooO0O0.setPremultiplied(true);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb2 = new StringBuilder("Get bitmap=");
                ((o000Oo0) this.f36955OooO00o).getClass();
                char[] cArr2 = o0000oo.f54571OooO00o;
                int i7 = i * i2;
                int i8 = o0000oo.OooO00o.f54574OooO00o[(config == null ? Bitmap.Config.ARGB_8888 : config).ordinal()];
                if (i8 == 1) {
                    i4 = 1;
                } else if (i8 == 2 || i8 == 3) {
                    i4 = 2;
                } else if (i8 != 4) {
                    i4 = 4;
                }
                sb2.append(o000Oo0.OooO0OO(i4 * i7, config));
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
        while (this.f36960OooO0o0 > j) {
            o000Oo0 o000oo1 = (o000Oo0) this.f36955OooO00o;
            Bitmap bitmapOooO0OO = o000oo1.f36985OooO0O0.OooO0OO();
            if (bitmapOooO0OO != null) {
                o000oo1.OooO00o(Integer.valueOf(o0000oo.OooO0OO(bitmapOooO0OO)), bitmapOooO0OO);
            }
            if (bitmapOooO0OO == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    OooO0o();
                }
                this.f36960OooO0o0 = 0L;
                return;
            }
            this.f36957OooO0OO.getClass();
            long j2 = this.f36960OooO0o0;
            ((o000Oo0) this.f36955OooO00o).getClass();
            this.f36960OooO0o0 = j2 - ((long) o0000oo.OooO0OO(bitmapOooO0OO));
            this.f36954OooO++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Evicting bitmap=" + ((o000Oo0) this.f36955OooO00o).OooO0o0(bitmapOooO0OO));
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                OooO0o();
            }
            bitmapOooO0OO.recycle();
        }
    }
}
