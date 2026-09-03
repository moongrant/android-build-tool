package com.google.android.material.carousel;

import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float f16628OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final List<OooO0O0> f16629OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f16630OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f16631OooO0Oo;

    /* JADX INFO: renamed from: com.google.android.material.carousel.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C0219OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final float f16632OooO00o;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public OooO0O0 f16634OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public OooO0O0 f16635OooO0Oo;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ArrayList f16633OooO0O0 = new ArrayList();

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f16637OooO0o0 = -1;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f16636OooO0o = -1;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public float f16638OooO0oO = 0.0f;

        public C0219OooO00o(float f) {
            this.f16632OooO00o = f;
        }

        @NonNull
        @CanIgnoreReturnValue
        public final void OooO00o(float f, @FloatRange(from = 0.0d, to = 1.0d) float f2, float f3, boolean z) {
            if (f3 <= 0.0f) {
                return;
            }
            OooO0O0 oooO0O0 = new OooO0O0(Float.MIN_VALUE, f, f2, f3);
            ArrayList arrayList = this.f16633OooO0O0;
            if (z) {
                if (this.f16634OooO0OO == null) {
                    this.f16634OooO0OO = oooO0O0;
                    this.f16637OooO0o0 = arrayList.size();
                }
                if (this.f16636OooO0o != -1 && arrayList.size() - this.f16636OooO0o > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                }
                if (f3 != this.f16634OooO0OO.f16642OooO0Oo) {
                    throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
                this.f16635OooO0Oo = oooO0O0;
                this.f16636OooO0o = arrayList.size();
            } else {
                if (this.f16634OooO0OO == null && f3 < this.f16638OooO0oO) {
                    throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
                }
                if (this.f16635OooO0Oo != null && f3 > this.f16638OooO0oO) {
                    throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                }
            }
            this.f16638OooO0oO = f3;
            arrayList.add(oooO0O0);
        }

        @NonNull
        public final OooO00o OooO0O0() {
            if (this.f16634OooO0OO == null) {
                throw new IllegalStateException("There must be a keyline marked as focal.");
            }
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (true) {
                ArrayList arrayList2 = this.f16633OooO0O0;
                int size = arrayList2.size();
                float f = this.f16632OooO00o;
                if (i >= size) {
                    return new OooO00o(f, arrayList, this.f16637OooO0o0, this.f16636OooO0o);
                }
                OooO0O0 oooO0O0 = (OooO0O0) arrayList2.get(i);
                arrayList.add(new OooO0O0((i * f) + (this.f16634OooO0OO.f16640OooO0O0 - (this.f16637OooO0o0 * f)), oooO0O0.f16640OooO0O0, oooO0O0.f16641OooO0OO, oooO0O0.f16642OooO0Oo));
                i++;
            }
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final float f16639OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final float f16640OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final float f16641OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final float f16642OooO0Oo;

        public OooO0O0(float f, float f2, float f3, float f4) {
            this.f16639OooO00o = f;
            this.f16640OooO0O0 = f2;
            this.f16641OooO0OO = f3;
            this.f16642OooO0Oo = f4;
        }
    }

    public OooO00o(float f, ArrayList arrayList, int i, int i2) {
        this.f16628OooO00o = f;
        this.f16629OooO0O0 = Collections.unmodifiableList(arrayList);
        this.f16630OooO0OO = i;
        this.f16631OooO0Oo = i2;
    }

    public final OooO0O0 OooO00o() {
        return this.f16629OooO0O0.get(this.f16630OooO0OO);
    }

    public final OooO0O0 OooO0O0() {
        return this.f16629OooO0O0.get(0);
    }

    public final OooO0O0 OooO0OO() {
        return this.f16629OooO0O0.get(this.f16631OooO0Oo);
    }

    public final OooO0O0 OooO0Oo() {
        List<OooO0O0> list = this.f16629OooO0O0;
        return list.get(list.size() - 1);
    }
}
