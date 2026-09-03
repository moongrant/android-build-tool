package com.google.android.gms.common.images;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class Size {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f14998OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f14999OooO0O0;

    public Size(int i, int i2) {
        this.f14998OooO00o = i;
        this.f14999OooO0O0 = i2;
    }

    public static void OooO00o(String str) {
        throw new NumberFormatException(androidx.compose.compiler.plugins.kotlin.OooO0OO.OooO0OO(new StringBuilder(str.length() + 16), "Invalid Size: \"", str, "\""));
    }

    @NonNull
    public static Size parseSize(@NonNull String str) throws NumberFormatException {
        if (str == null) {
            throw new IllegalArgumentException("string must not be null");
        }
        int iIndexOf = str.indexOf(42);
        if (iIndexOf < 0) {
            iIndexOf = str.indexOf(120);
        }
        if (iIndexOf < 0) {
            OooO00o(str);
            throw null;
        }
        try {
            return new Size(Integer.parseInt(str.substring(0, iIndexOf)), Integer.parseInt(str.substring(iIndexOf + 1)));
        } catch (NumberFormatException unused) {
            OooO00o(str);
            throw null;
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Size) {
            Size size = (Size) obj;
            if (this.f14998OooO00o == size.f14998OooO00o && this.f14999OooO0O0 == size.f14999OooO0O0) {
                return true;
            }
        }
        return false;
    }

    public int getHeight() {
        return this.f14999OooO0O0;
    }

    public int getWidth() {
        return this.f14998OooO00o;
    }

    public int hashCode() {
        int i = this.f14998OooO00o;
        return ((i >>> 16) | (i << 16)) ^ this.f14999OooO0O0;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder(23);
        sb.append(this.f14998OooO00o);
        sb.append("x");
        sb.append(this.f14999OooO0O0);
        return sb.toString();
    }
}
