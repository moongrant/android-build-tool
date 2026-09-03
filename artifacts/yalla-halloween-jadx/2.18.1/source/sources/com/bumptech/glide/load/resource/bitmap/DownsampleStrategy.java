package com.bumptech.glide.load.resource.bitmap;

import p217o00oO00o.o000000O;

/* JADX INFO: loaded from: classes.dex */
public abstract class DownsampleStrategy {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO0OO f12505OooO00o = new OooO0OO();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final OooO00o f12506OooO0O0 = new OooO00o();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final OooO0O0 f12507OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final OooO0o f12508OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final o000000O<DownsampleStrategy> f12509OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final OooO0O0 f12510OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final boolean f12511OooO0oO;

    public static class OooO00o extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public final SampleSizeRounding OooO00o(int i, int i2, int i3, int i4) {
            if (OooO0O0(i, i2, i3, i4) == 1.0f) {
                return SampleSizeRounding.QUALITY;
            }
            return DownsampleStrategy.f12511OooO0oO ? SampleSizeRounding.QUALITY : SampleSizeRounding.MEMORY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public final float OooO0O0(int i, int i2, int i3, int i4) {
            return Math.min(1.0f, DownsampleStrategy.f12505OooO00o.OooO0O0(i, i2, i3, i4));
        }
    }

    public static class OooO0O0 extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public final SampleSizeRounding OooO00o(int i, int i2, int i3, int i4) {
            return SampleSizeRounding.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public final float OooO0O0(int i, int i2, int i3, int i4) {
            return Math.max(i3 / i, i4 / i2);
        }
    }

    public static class OooO0OO extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public final SampleSizeRounding OooO00o(int i, int i2, int i3, int i4) {
            return DownsampleStrategy.f12511OooO0oO ? SampleSizeRounding.QUALITY : SampleSizeRounding.MEMORY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public final float OooO0O0(int i, int i2, int i3, int i4) {
            if (DownsampleStrategy.f12511OooO0oO) {
                return Math.min(i3 / i, i4 / i2);
            }
            int iMax = Math.max(i2 / i4, i / i3);
            if (iMax == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(iMax);
        }
    }

    public static class OooO0o extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public final SampleSizeRounding OooO00o(int i, int i2, int i3, int i4) {
            return SampleSizeRounding.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public final float OooO0O0(int i, int i2, int i3, int i4) {
            return 1.0f;
        }
    }

    public enum SampleSizeRounding {
        MEMORY,
        QUALITY
    }

    static {
        OooO0O0 oooO0O0 = new OooO0O0();
        f12507OooO0OO = oooO0O0;
        f12508OooO0Oo = new OooO0o();
        f12510OooO0o0 = oooO0O0;
        f12509OooO0o = o000000O.OooO00o("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", oooO0O0);
        f12511OooO0oO = true;
    }

    public abstract SampleSizeRounding OooO00o(int i, int i2, int i3, int i4);

    public abstract float OooO0O0(int i, int i2, int i3, int i4);
}
