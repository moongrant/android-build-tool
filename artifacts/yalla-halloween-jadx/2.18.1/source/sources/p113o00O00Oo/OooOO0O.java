package p113o00O00Oo;

import OooO00o.OooO00o;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.annotation.Px;
import java.util.HashSet;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p119o00O0Oo0.Oooo000;
import p119o00O0Oo0.o0OO00O;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O implements OooO0O0 {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public static final Set<Bitmap.Config> f30233OooOO0O;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f30234OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f30235OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Set<Bitmap.Config> f30236OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final OooO0OO f30237OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final o0OO00O f30238OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f30239OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final HashSet<Bitmap> f30240OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f30241OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f30242OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f30243OooOO0;

    static {
        Set setCreateSetBuilder = SetsKt.createSetBuilder();
        setCreateSetBuilder.add(Bitmap.Config.ALPHA_8);
        setCreateSetBuilder.add(Bitmap.Config.RGB_565);
        setCreateSetBuilder.add(Bitmap.Config.ARGB_4444);
        setCreateSetBuilder.add(Bitmap.Config.ARGB_8888);
        if (Build.VERSION.SDK_INT >= 26) {
            setCreateSetBuilder.add(Bitmap.Config.RGBA_F16);
        }
        f30233OooOO0O = SetsKt.build(setCreateSetBuilder);
    }

    public OooOO0O(int i) {
        Set<Bitmap.Config> allowedConfigs = f30233OooOO0O;
        OooOOOO strategy = new OooOOOO();
        Intrinsics.checkNotNullParameter(allowedConfigs, "allowedConfigs");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        this.f30235OooO00o = i;
        this.f30236OooO0O0 = allowedConfigs;
        this.f30237OooO0OO = strategy;
        this.f30238OooO0Oo = null;
        this.f30240OooO0o0 = new HashSet<>();
        if (!(i >= 0)) {
            throw new IllegalArgumentException("maxSize must be >= 0.".toString());
        }
    }

    @Override // p113o00O00Oo.OooO0O0
    public final synchronized void OooO00o(int i) {
        o0OO00O o0oo00o2 = this.f30238OooO0Oo;
        if (o0oo00o2 != null && o0oo00o2.getLevel() <= 2) {
            Intrinsics.stringPlus("trimMemory, level=", Integer.valueOf(i));
            o0oo00o2.OooO00o();
        }
        if (i >= 40) {
            o0OO00O o0oo00o3 = this.f30238OooO0Oo;
            if (o0oo00o3 != null && o0oo00o3.getLevel() <= 2) {
                o0oo00o3.OooO00o();
            }
            OooO0oO(-1);
        } else {
            boolean z = false;
            if (10 <= i && i < 20) {
                z = true;
            }
            if (z) {
                OooO0oO(this.f30239OooO0o / 2);
            }
        }
    }

    @Override // p113o00O00Oo.OooO0O0
    public final synchronized void OooO0O0(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        if (bitmap.isRecycled()) {
            o0OO00O o0oo00o2 = this.f30238OooO0Oo;
            if (o0oo00o2 != null && o0oo00o2.getLevel() <= 6) {
                Intrinsics.stringPlus("Rejecting recycled bitmap from pool; bitmap: ", bitmap);
                o0oo00o2.OooO00o();
            }
            return;
        }
        int iOooO00o = Oooo000.OooO00o(bitmap);
        if (bitmap.isMutable() && iOooO00o <= this.f30235OooO00o && this.f30236OooO0O0.contains(bitmap.getConfig())) {
            if (this.f30240OooO0o0.contains(bitmap)) {
                o0OO00O o0oo00o3 = this.f30238OooO0Oo;
                if (o0oo00o3 != null && o0oo00o3.getLevel() <= 6) {
                    Intrinsics.stringPlus("Rejecting duplicate bitmap from pool; bitmap: ", this.f30237OooO0OO.OooO0o0(bitmap));
                    o0oo00o3.OooO00o();
                }
                return;
            }
            this.f30237OooO0OO.OooO0O0(bitmap);
            this.f30240OooO0o0.add(bitmap);
            this.f30239OooO0o += iOooO00o;
            this.f30234OooO++;
            o0OO00O o0oo00o4 = this.f30238OooO0Oo;
            if (o0oo00o4 != null && o0oo00o4.getLevel() <= 2) {
                this.f30237OooO0OO.OooO0o0(bitmap);
                OooO0o();
                o0oo00o4.OooO00o();
            }
            OooO0oO(this.f30235OooO00o);
            return;
        }
        o0OO00O o0oo00o5 = this.f30238OooO0Oo;
        if (o0oo00o5 != null && o0oo00o5.getLevel() <= 2) {
            this.f30237OooO0OO.OooO0o0(bitmap);
            bitmap.isMutable();
            int i = this.f30235OooO00o;
            this.f30236OooO0O0.contains(bitmap.getConfig());
            o0oo00o5.OooO00o();
        }
        bitmap.recycle();
    }

    @Override // p113o00O00Oo.OooO0O0
    @NotNull
    public final Bitmap OooO0OO(@Px int i, @Px int i2, @NotNull Bitmap.Config config) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(config, "config");
        Bitmap bitmapOooO0o0 = OooO0o0(i, i2, config);
        if (bitmapOooO0o0 == null) {
            bitmapOooO0o0 = null;
        } else {
            bitmapOooO0o0.eraseColor(0);
        }
        if (bitmapOooO0o0 != null) {
            return bitmapOooO0o0;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, config);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(width, height, config)");
        return bitmapCreateBitmap;
    }

    @Override // p113o00O00Oo.OooO0O0
    @NotNull
    public final Bitmap OooO0Oo(@Px int i, @Px int i2, @NotNull Bitmap.Config config) {
        Intrinsics.checkNotNullParameter(config, "config");
        Bitmap bitmapOooO0o0 = OooO0o0(i, i2, config);
        if (bitmapOooO0o0 != null) {
            return bitmapOooO0o0;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, config);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(width, height, config)");
        return bitmapCreateBitmap;
    }

    public final String OooO0o() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Hits=");
        sbOooO0o0.append(this.f30241OooO0oO);
        sbOooO0o0.append(", misses=");
        sbOooO0o0.append(this.f30242OooO0oo);
        sbOooO0o0.append(", puts=");
        sbOooO0o0.append(this.f30234OooO);
        sbOooO0o0.append(", evictions=");
        sbOooO0o0.append(this.f30243OooOO0);
        sbOooO0o0.append(", currentSize=");
        sbOooO0o0.append(this.f30239OooO0o);
        sbOooO0o0.append(", maxSize=");
        sbOooO0o0.append(this.f30235OooO00o);
        sbOooO0o0.append(", strategy=");
        sbOooO0o0.append(this.f30237OooO0OO);
        return sbOooO0o0.toString();
    }

    @Nullable
    public final synchronized Bitmap OooO0o0(@Px int i, @Px int i2, @NotNull Bitmap.Config config) {
        Bitmap bitmapOooO0OO;
        Intrinsics.checkNotNullParameter(config, "config");
        if (!(!Oooo000.OooO0Oo(config))) {
            throw new IllegalArgumentException("Cannot create a mutable hardware bitmap.".toString());
        }
        bitmapOooO0OO = this.f30237OooO0OO.OooO0OO(i, i2, config);
        if (bitmapOooO0OO == null) {
            o0OO00O o0oo00o2 = this.f30238OooO0Oo;
            if (o0oo00o2 != null && o0oo00o2.getLevel() <= 2) {
                Intrinsics.stringPlus("Missing bitmap=", this.f30237OooO0OO.OooO0Oo(i, i2, config));
                o0oo00o2.OooO00o();
            }
            this.f30242OooO0oo++;
        } else {
            this.f30240OooO0o0.remove(bitmapOooO0OO);
            this.f30239OooO0o -= Oooo000.OooO00o(bitmapOooO0OO);
            this.f30241OooO0oO++;
            bitmapOooO0OO.setDensity(0);
            bitmapOooO0OO.setHasAlpha(true);
            bitmapOooO0OO.setPremultiplied(true);
        }
        o0OO00O o0oo00o3 = this.f30238OooO0Oo;
        if (o0oo00o3 != null && o0oo00o3.getLevel() <= 2) {
            this.f30237OooO0OO.OooO0Oo(i, i2, config);
            OooO0o();
            o0oo00o3.OooO00o();
        }
        return bitmapOooO0OO;
    }

    public final synchronized void OooO0oO(int i) {
        while (this.f30239OooO0o > i) {
            Bitmap bitmapOooO00o = this.f30237OooO0OO.OooO00o();
            if (bitmapOooO00o == null) {
                o0OO00O o0oo00o2 = this.f30238OooO0Oo;
                if (o0oo00o2 != null && o0oo00o2.getLevel() <= 5) {
                    Intrinsics.stringPlus("Size mismatch, resetting.\n", OooO0o());
                    o0oo00o2.OooO00o();
                }
                this.f30239OooO0o = 0;
                return;
            }
            this.f30240OooO0o0.remove(bitmapOooO00o);
            this.f30239OooO0o -= Oooo000.OooO00o(bitmapOooO00o);
            this.f30243OooOO0++;
            o0OO00O o0oo00o3 = this.f30238OooO0Oo;
            if (o0oo00o3 != null && o0oo00o3.getLevel() <= 2) {
                this.f30237OooO0OO.OooO0o0(bitmapOooO00o);
                OooO0o();
                o0oo00o3.OooO00o();
            }
            bitmapOooO00o.recycle();
        }
    }
}
