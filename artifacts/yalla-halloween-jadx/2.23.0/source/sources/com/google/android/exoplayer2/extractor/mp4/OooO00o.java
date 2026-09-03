package com.google.android.exoplayer2.extractor.mp4;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import p245o00oo0o.o00Oo00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f12052OooO00o;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.mp4.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C0203OooO00o extends OooO00o {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final long f12053OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final ArrayList f12054OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final ArrayList f12055OooO0Oo;

        public C0203OooO00o(int i, long j) {
            super(i);
            this.f12053OooO0O0 = j;
            this.f12054OooO0OO = new ArrayList();
            this.f12055OooO0Oo = new ArrayList();
        }

        @Nullable
        public final C0203OooO00o OooO0O0(int i) {
            ArrayList arrayList = this.f12055OooO0Oo;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0203OooO00o c0203OooO00o = (C0203OooO00o) arrayList.get(i2);
                if (c0203OooO00o.f12052OooO00o == i) {
                    return c0203OooO00o;
                }
            }
            return null;
        }

        @Nullable
        public final OooO0O0 OooO0OO(int i) {
            ArrayList arrayList = this.f12054OooO0OO;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                OooO0O0 oooO0O0 = (OooO0O0) arrayList.get(i2);
                if (oooO0O0.f12052OooO00o == i) {
                    return oooO0O0;
                }
            }
            return null;
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.OooO00o
        public final String toString() {
            return OooO00o.OooO00o(this.f12052OooO00o) + " leaves: " + Arrays.toString(this.f12054OooO0OO.toArray()) + " containers: " + Arrays.toString(this.f12055OooO0Oo.toArray());
        }
    }

    public static final class OooO0O0 extends OooO00o {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o00Oo00 f12056OooO0O0;

        public OooO0O0(int i, o00Oo00 o00oo00) {
            super(i);
            this.f12056OooO0O0 = o00oo00;
        }
    }

    public OooO00o(int i) {
        this.f12052OooO00o = i;
    }

    public static String OooO00o(int i) {
        return "" + ((char) ((i >> 24) & 255)) + ((char) ((i >> 16) & 255)) + ((char) ((i >> 8) & 255)) + ((char) (i & 255));
    }

    public String toString() {
        return OooO00o(this.f12052OooO00o);
    }
}
