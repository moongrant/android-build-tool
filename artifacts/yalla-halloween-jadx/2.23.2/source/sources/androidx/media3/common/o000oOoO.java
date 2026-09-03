package androidx.media3.common;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import java.util.ArrayList;
import java.util.Arrays;
import p069o0000ooO.o0000oo;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes.dex */
public final class o000oOoO implements OooO0OO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final String f6762OooO = o00.Oooo00o(0);

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final String f6763OooOO0 = o00.Oooo00o(1);

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @UnstableApi
    public static final androidx.compose.compiler.plugins.kotlin.k1.OooO00o f6764OooOO0O = new androidx.compose.compiler.plugins.kotlin.k1.OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @UnstableApi
    public final int f6765OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @UnstableApi
    public final int f6766OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @UnstableApi
    public final String f6767OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooOO0[] f6768OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f6769OooO0oo;

    @UnstableApi
    public o000oOoO(String str, OooOO0... oooOO0Arr) {
        p080o000OoO.o00Oo0.OooO00o(oooOO0Arr.length > 0);
        this.f6767OooO0o0 = str;
        this.f6768OooO0oO = oooOO0Arr;
        this.f6765OooO0Oo = oooOO0Arr.length;
        int iOooO0oO = o0000oo.OooO0oO(oooOO0Arr[0].f6412OooOOOO);
        this.f6766OooO0o = iOooO0oO == -1 ? o0000oo.OooO0oO(oooOO0Arr[0].f6410OooOOO) : iOooO0oO;
        String str2 = oooOO0Arr[0].f6403OooO0o;
        str2 = (str2 == null || str2.equals("und")) ? "" : str2;
        int i = oooOO0Arr[0].f6406OooO0oo | 16384;
        for (int i2 = 1; i2 < oooOO0Arr.length; i2++) {
            String str3 = oooOO0Arr[i2].f6403OooO0o;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : str3)) {
                OooO0OO(i2, "languages", oooOO0Arr[0].f6403OooO0o, oooOO0Arr[i2].f6403OooO0o);
                return;
            } else {
                if (i != (oooOO0Arr[i2].f6406OooO0oo | 16384)) {
                    OooO0OO(i2, "role flags", Integer.toBinaryString(oooOO0Arr[0].f6406OooO0oo), Integer.toBinaryString(oooOO0Arr[i2].f6406OooO0oo));
                    return;
                }
            }
        }
    }

    public static void OooO0OO(int i, String str, @Nullable String str2, @Nullable String str3) {
        StringBuilder sbOooO00o = androidx.compose.compiler.plugins.kotlin.OooO0OO.OooO00o("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        sbOooO00o.append(str3);
        sbOooO00o.append("' (track ");
        sbOooO00o.append(i);
        sbOooO00o.append(")");
        Log.OooO0Oo("TrackGroup", "", new IllegalStateException(sbOooO00o.toString()));
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o000oOoO.class != obj.getClass()) {
            return false;
        }
        o000oOoO o000oooo2 = (o000oOoO) obj;
        return this.f6767OooO0o0.equals(o000oooo2.f6767OooO0o0) && Arrays.equals(this.f6768OooO0oO, o000oooo2.f6768OooO0oO);
    }

    public final int hashCode() {
        if (this.f6769OooO0oo == 0) {
            this.f6769OooO0oo = androidx.compose.animation.OooO0O0.OooO00o(this.f6767OooO0o0, 527, 31) + Arrays.hashCode(this.f6768OooO0oO);
        }
        return this.f6769OooO0oo;
    }

    @Override // androidx.media3.common.OooO0OO
    @UnstableApi
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        OooOO0[] oooOO0Arr = this.f6768OooO0oO;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(oooOO0Arr.length);
        for (OooOO0 oooOO1 : oooOO0Arr) {
            arrayList.add(oooOO1.OooO0oO(true));
        }
        bundle.putParcelableArrayList(f6762OooO, arrayList);
        bundle.putString(f6763OooOO0, this.f6767OooO0o0);
        return bundle;
    }
}
