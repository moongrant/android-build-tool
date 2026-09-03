package com.bumptech.glide.load.resource.bitmap;

import p126o00O0oOo.o000000O;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DownsampleStrategy {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO f9984OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final OooO0OO f9985OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final OooO0o f9986OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final OooOO0 f9987OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final o000000O<DownsampleStrategy> f9988OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final OooO0o f9989OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final boolean f9990OooO0oO;

    public static class OooO extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public final SampleSizeRounding OooO00o(int i, int i2, int i3, int i4) {
            return DownsampleStrategy.f9990OooO0oO ? SampleSizeRounding.QUALITY : SampleSizeRounding.MEMORY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public final float OooO0O0(int i, int i2, int i3, int i4) {
            if (DownsampleStrategy.f9990OooO0oO) {
                return Math.min(i3 / i, i4 / i2);
            }
            int iMax = Math.max(i2 / i4, i / i3);
            if (iMax == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(iMax);
        }
    }

    public static class OooO00o extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public final SampleSizeRounding OooO00o(int i, int i2, int i3, int i4) {
            return SampleSizeRounding.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public final float OooO0O0(int i, int i2, int i3, int i4) {
            int iMin = Math.min(i2 / i4, i / i3);
            if (iMin == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(iMin);
        }
    }

    public static class OooO0O0 extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public final SampleSizeRounding OooO00o(int i, int i2, int i3, int i4) {
            return SampleSizeRounding.MEMORY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public final float OooO0O0(int i, int i2, int i3, int i4) {
            int iCeil = (int) Math.ceil(Math.max(i2 / i4, i / i3));
            int iMax = Math.max(1, Integer.highestOneBit(iCeil));
            return 1.0f / (iMax << (iMax >= iCeil ? 0 : 1));
        }
    }

    public static class OooO0OO extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public final SampleSizeRounding OooO00o(int i, int i2, int i3, int i4) {
            return OooO0O0(i, i2, i3, i4) == 1.0f ? SampleSizeRounding.QUALITY : DownsampleStrategy.f9984OooO00o.OooO00o(i, i2, i3, i4);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public final float OooO0O0(int i, int i2, int i3, int i4) {
            return Math.min(1.0f, DownsampleStrategy.f9984OooO00o.OooO0O0(i, i2, i3, i4));
        }
    }

    public static class OooO0o extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public final SampleSizeRounding OooO00o(int i, int i2, int i3, int i4) {
            return SampleSizeRounding.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public final float OooO0O0(int i, int i2, int i3, int i4) {
            return Math.max(i3 / i, i4 / i2);
        }
    }

    public static class OooOO0 extends DownsampleStrategy {
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
        new OooO00o();
        new OooO0O0();
        f9984OooO00o = new OooO();
        f9985OooO0O0 = new OooO0OO();
        OooO0o oooO0o = new OooO0o();
        f9986OooO0OO = oooO0o;
        f9987OooO0Oo = new OooOO0();
        f9989OooO0o0 = oooO0o;
        f9988OooO0o = o000000O.OooO00o(oooO0o, "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy");
        f9990OooO0oO = true;
    }

    public abstract SampleSizeRounding OooO00o(int i, int i2, int i3, int i4);

    public abstract float OooO0O0(int i, int i2, int i3, int i4);
}
