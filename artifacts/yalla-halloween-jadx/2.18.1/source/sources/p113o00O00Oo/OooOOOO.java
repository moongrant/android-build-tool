package p113o00O00Oo;

import android.graphics.Bitmap;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import java.util.TreeMap;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import o00O00o0.OooO00o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p119o00O0Oo0.Oooo000;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(19)
@VisibleForTesting
public final class OooOOOO implements OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final OooO00o<Integer, Bitmap> f30256OooO00o = new OooO00o<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final TreeMap<Integer, Integer> f30257OooO0O0 = new TreeMap<>();

    @Override // p113o00O00Oo.OooO0OO
    @Nullable
    public final Bitmap OooO00o() {
        Bitmap bitmapOooO0Oo = this.f30256OooO00o.OooO0Oo();
        if (bitmapOooO0Oo != null) {
            OooO0o(bitmapOooO0Oo.getAllocationByteCount());
        }
        return bitmapOooO0Oo;
    }

    @Override // p113o00O00Oo.OooO0OO
    public final void OooO0O0(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        int iOooO00o = Oooo000.OooO00o(bitmap);
        this.f30256OooO00o.OooO0O0(Integer.valueOf(iOooO00o), bitmap);
        Integer num = this.f30257OooO0O0.get(Integer.valueOf(iOooO00o));
        this.f30257OooO0O0.put(Integer.valueOf(iOooO00o), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // p113o00O00Oo.OooO0OO
    @Nullable
    public final Bitmap OooO0OO(@Px int i, @Px int i2, @NotNull Bitmap.Config config) {
        Intrinsics.checkNotNullParameter(config, "config");
        int iOooO0O0 = Oooo000.OooO0O0(config) * i * i2;
        Integer numCeilingKey = this.f30257OooO0O0.ceilingKey(Integer.valueOf(iOooO0O0));
        if (numCeilingKey != null) {
            if (!(numCeilingKey.intValue() <= iOooO0O0 * 4)) {
                numCeilingKey = null;
            }
            if (numCeilingKey != null) {
                iOooO0O0 = numCeilingKey.intValue();
            }
        }
        Bitmap bitmapOooO0o0 = this.f30256OooO00o.OooO0o0(Integer.valueOf(iOooO0O0));
        if (bitmapOooO0o0 != null) {
            OooO0o(iOooO0O0);
            bitmapOooO0o0.reconfigure(i, i2, config);
        }
        return bitmapOooO0o0;
    }

    @Override // p113o00O00Oo.OooO0OO
    @NotNull
    public final String OooO0Oo(@Px int i, @Px int i2, @NotNull Bitmap.Config config) {
        Intrinsics.checkNotNullParameter(config, "config");
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        sb.append(Oooo000.OooO0O0(config) * i * i2);
        sb.append(']');
        return sb.toString();
    }

    public final void OooO0o(int i) {
        int iIntValue = ((Number) MapsKt.getValue(this.f30257OooO0O0, Integer.valueOf(i))).intValue();
        if (iIntValue == 1) {
            this.f30257OooO0O0.remove(Integer.valueOf(i));
        } else {
            this.f30257OooO0O0.put(Integer.valueOf(i), Integer.valueOf(iIntValue - 1));
        }
    }

    @Override // p113o00O00Oo.OooO0OO
    @NotNull
    public final String OooO0o0(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        sb.append(Oooo000.OooO00o(bitmap));
        sb.append(']');
        return sb.toString();
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("SizeStrategy: entries=");
        sbOooO0o0.append(this.f30256OooO00o);
        sbOooO0o0.append(", sizes=");
        sbOooO0o0.append(this.f30257OooO0O0);
        return sbOooO0o0.toString();
    }
}
