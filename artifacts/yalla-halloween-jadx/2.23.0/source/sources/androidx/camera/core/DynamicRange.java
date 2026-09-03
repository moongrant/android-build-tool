package androidx.camera.core;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class DynamicRange {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f3405OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f3406OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public static final DynamicRange f3399OooO0OO = new DynamicRange(0, 0);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public static final DynamicRange f3400OooO0Oo = new DynamicRange(1, 8);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public static final DynamicRange f3402OooO0o0 = new DynamicRange(3, 10);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public static final DynamicRange f3401OooO0o = new DynamicRange(4, 10);

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public static final DynamicRange f3403OooO0oO = new DynamicRange(5, 10);

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public static final DynamicRange f3404OooO0oo = new DynamicRange(6, 10);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public static final DynamicRange f3398OooO = new DynamicRange(6, 8);

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface BitDepth {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface DynamicRangeEncoding {
    }

    public DynamicRange(int i, int i2) {
        this.f3405OooO00o = i;
        this.f3406OooO0O0 = i2;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean OooO00o() {
        return OooO0O0() && this.f3405OooO00o != 1 && this.f3406OooO0O0 == 10;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean OooO0O0() {
        int i = this.f3405OooO00o;
        return (i == 0 || i == 2 || this.f3406OooO0O0 == 0) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DynamicRange)) {
            return false;
        }
        DynamicRange dynamicRange = (DynamicRange) obj;
        return this.f3405OooO00o == dynamicRange.f3405OooO00o && this.f3406OooO0O0 == dynamicRange.f3406OooO0O0;
    }

    public final int hashCode() {
        return ((this.f3405OooO00o ^ 1000003) * 1000003) ^ this.f3406OooO0O0;
    }

    @NonNull
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DynamicRange@");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("{encoding=");
        switch (this.f3405OooO00o) {
            case 0:
                str = "UNSPECIFIED";
                break;
            case 1:
                str = "SDR";
                break;
            case 2:
                str = "HDR_UNSPECIFIED";
                break;
            case 3:
                str = "HLG";
                break;
            case 4:
                str = "HDR10";
                break;
            case 5:
                str = "HDR10_PLUS";
                break;
            case 6:
                str = "DOLBY_VISION";
                break;
            default:
                str = "<Unknown>";
                break;
        }
        sb.append(str);
        sb.append(", bitDepth=");
        return p022Oooo00O.OooOO0.OooO0O0(sb, this.f3406OooO0O0, "}");
    }
}
