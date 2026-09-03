package com.google.android.gms.common.images;

import Oooo000.o00O0O;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class Size {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f15502OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f15503OooO0O0;

    public Size(int i, int i2) {
        this.f15502OooO00o = i;
        this.f15503OooO0O0 = i2;
    }

    public static NumberFormatException OooO00o(String str) {
        throw new NumberFormatException(o00O0O.OooO0O0(new StringBuilder(str.length() + 16), "Invalid Size: \"", str, "\""));
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
            if (this.f15502OooO00o == size.f15502OooO00o && this.f15503OooO0O0 == size.f15503OooO0O0) {
                return true;
            }
        }
        return false;
    }

    public int getHeight() {
        return this.f15503OooO0O0;
    }

    public int getWidth() {
        return this.f15502OooO00o;
    }

    public int hashCode() {
        int i = this.f15503OooO0O0;
        int i2 = this.f15502OooO00o;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }

    @NonNull
    public String toString() {
        int i = this.f15502OooO00o;
        int i2 = this.f15503OooO0O0;
        StringBuilder sb = new StringBuilder(23);
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        return sb.toString();
    }
}
