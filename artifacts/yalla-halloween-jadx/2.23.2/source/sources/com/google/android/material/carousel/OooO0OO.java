package com.google.android.material.carousel;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0OO extends o0O000o0.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final int[] f16177OooO00o = {1};

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final int[] f16178OooO0O0 = {1, 0};

    @VisibleForTesting
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f16179OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public float f16180OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f16181OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f16182OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public float f16183OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public float f16184OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final int f16185OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final float f16186OooO0oo;

        /* JADX WARN: Code duplicated, block: B:37:0x00af  */
        public OooO00o(int i, float f, float f2, float f3, int i2, float f4, int i3, float f5, int i4, float f6) {
            this.f16179OooO00o = i;
            float fOooO00o = o0000O00.OooO00o.OooO00o(f, f2, f3);
            this.f16180OooO0O0 = fOooO00o;
            this.f16181OooO0OO = i2;
            this.f16184OooO0o0 = f4;
            this.f16182OooO0Oo = i3;
            this.f16183OooO0o = f5;
            this.f16185OooO0oO = i4;
            float f7 = i4;
            float f8 = i3;
            float f9 = i2;
            float f10 = f6 - ((f9 * fOooO00o) + ((f4 * f8) + (f5 * f7)));
            if (i2 > 0 && f10 > 0.0f) {
                this.f16180OooO0O0 = Math.min(f10 / f9, f3 - fOooO00o) + fOooO00o;
            } else if (i2 > 0 && f10 < 0.0f) {
                this.f16180OooO0O0 = Math.max(f10 / f9, f2 - fOooO00o) + fOooO00o;
            }
            float f11 = this.f16180OooO0O0;
            float f12 = f8 / 2.0f;
            float f13 = (f6 - ((f9 + f12) * (i2 > 0 ? f11 : 0.0f))) / (f12 + f7);
            this.f16183OooO0o = f13;
            float f14 = (f11 + f13) / 2.0f;
            this.f16184OooO0o0 = f14;
            if (i3 > 0 && f13 != f5) {
                float f15 = (f5 - f13) * f7;
                float fMin = Math.min(Math.abs(f15), f14 * 0.1f * f8);
                if (f15 > 0.0f) {
                    this.f16184OooO0o0 -= fMin / f8;
                    this.f16183OooO0o = (fMin / f7) + this.f16183OooO0o;
                } else {
                    this.f16184OooO0o0 = (fMin / f8) + this.f16184OooO0o0;
                    this.f16183OooO0o -= fMin / f7;
                }
            }
            boolean z = true;
            if (i4 > 0 && i2 > 0 && i3 > 0) {
                float f16 = this.f16183OooO0o;
                float f17 = this.f16184OooO0o0;
                if (f16 <= f17 || f17 <= this.f16180OooO0O0) {
                    z = false;
                }
            } else if (i4 > 0 && i2 > 0 && this.f16183OooO0o <= this.f16180OooO0O0) {
                z = false;
            }
            this.f16186OooO0oo = !z ? Float.MAX_VALUE : i * Math.abs(f5 - this.f16183OooO0o);
        }

        @NonNull
        public final String toString() {
            return "Arrangement [priority=" + this.f16179OooO00o + ", smallCount=" + this.f16181OooO0OO + ", smallSize=" + this.f16180OooO0O0 + ", mediumCount=" + this.f16182OooO0Oo + ", mediumSize=" + this.f16184OooO0o0 + ", largeCount=" + this.f16185OooO0oO + ", largeSize=" + this.f16183OooO0o + ", cost=" + this.f16186OooO0oo + "]";
        }
    }
}
