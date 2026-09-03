package androidx.media3.extractor.mp4;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import p080o000OoO.o000O000;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f8744OooO00o;

    /* JADX INFO: renamed from: androidx.media3.extractor.mp4.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C0156OooO00o extends OooO00o {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final long f8745OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final ArrayList f8746OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final ArrayList f8747OooO0Oo;

        public C0156OooO00o(int i, long j) {
            super(i);
            this.f8745OooO0O0 = j;
            this.f8746OooO0OO = new ArrayList();
            this.f8747OooO0Oo = new ArrayList();
        }

        @Nullable
        public final C0156OooO00o OooO0O0(int i) {
            ArrayList arrayList = this.f8747OooO0Oo;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0156OooO00o c0156OooO00o = (C0156OooO00o) arrayList.get(i2);
                if (c0156OooO00o.f8744OooO00o == i) {
                    return c0156OooO00o;
                }
            }
            return null;
        }

        @Nullable
        public final OooO0O0 OooO0OO(int i) {
            ArrayList arrayList = this.f8746OooO0OO;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                OooO0O0 oooO0O0 = (OooO0O0) arrayList.get(i2);
                if (oooO0O0.f8744OooO00o == i) {
                    return oooO0O0;
                }
            }
            return null;
        }

        @Override // androidx.media3.extractor.mp4.OooO00o
        public final String toString() {
            return OooO00o.OooO00o(this.f8744OooO00o) + " leaves: " + Arrays.toString(this.f8746OooO0OO.toArray()) + " containers: " + Arrays.toString(this.f8747OooO0Oo.toArray());
        }
    }

    public static final class OooO0O0 extends OooO00o {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o000O000 f8748OooO0O0;

        public OooO0O0(int i, o000O000 o000o001) {
            super(i);
            this.f8748OooO0O0 = o000o001;
        }
    }

    public OooO00o(int i) {
        this.f8744OooO00o = i;
    }

    public static String OooO00o(int i) {
        return "" + ((char) ((i >> 24) & 255)) + ((char) ((i >> 16) & 255)) + ((char) ((i >> 8) & 255)) + ((char) (i & 255));
    }

    public String toString() {
        return OooO00o(this.f8744OooO00o);
    }
}
