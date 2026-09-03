package com.google.android.exoplayer2.extractor.mp4;

import androidx.annotation.Nullable;
import com.android.billingclient.api.o0OO00O;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.KotlinVersion;
import p318o0O0oOo.o000;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f13995OooO00o;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.mp4.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C0100OooO00o extends OooO00o {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final long f13996OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final List<OooO0O0> f13997OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final List<C0100OooO00o> f13998OooO0Oo;

        public C0100OooO00o(int i, long j) {
            super(i);
            this.f13996OooO0O0 = j;
            this.f13997OooO0OO = new ArrayList();
            this.f13998OooO0Oo = new ArrayList();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.google.android.exoplayer2.extractor.mp4.OooO00o$OooO00o>] */
        /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList, java.util.List<com.google.android.exoplayer2.extractor.mp4.OooO00o$OooO00o>] */
        @Nullable
        public final C0100OooO00o OooO0O0(int i) {
            int size = this.f13998OooO0Oo.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0100OooO00o c0100OooO00o = (C0100OooO00o) this.f13998OooO0Oo.get(i2);
                if (c0100OooO00o.f13995OooO00o == i) {
                    return c0100OooO00o;
                }
            }
            return null;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.google.android.exoplayer2.extractor.mp4.OooO00o$OooO0O0>] */
        /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList, java.util.List<com.google.android.exoplayer2.extractor.mp4.OooO00o$OooO0O0>] */
        @Nullable
        public final OooO0O0 OooO0OO(int i) {
            int size = this.f13997OooO0OO.size();
            for (int i2 = 0; i2 < size; i2++) {
                OooO0O0 oooO0O0 = (OooO0O0) this.f13997OooO0OO.get(i2);
                if (oooO0O0.f13995OooO00o == i) {
                    return oooO0O0;
                }
            }
            return null;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<com.google.android.exoplayer2.extractor.mp4.OooO00o$OooO0O0>] */
        /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList, java.util.List<com.google.android.exoplayer2.extractor.mp4.OooO00o$OooO00o>] */
        @Override // com.google.android.exoplayer2.extractor.mp4.OooO00o
        public final String toString() {
            String strOooO00o = OooO00o.OooO00o(this.f13995OooO00o);
            String string = Arrays.toString(this.f13997OooO0OO.toArray());
            String string2 = Arrays.toString(this.f13998OooO0Oo.toArray());
            StringBuilder sb = new StringBuilder(o0OO00O.OooO00o(string2, o0OO00O.OooO00o(string, o0OO00O.OooO00o(strOooO00o, 22))));
            sb.append(strOooO00o);
            sb.append(" leaves: ");
            sb.append(string);
            sb.append(" containers: ");
            sb.append(string2);
            return sb.toString();
        }
    }

    public static final class OooO0O0 extends OooO00o {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o000 f13999OooO0O0;

        public OooO0O0(int i, o000 o000Var) {
            super(i);
            this.f13999OooO0O0 = o000Var;
        }
    }

    public OooO00o(int i) {
        this.f13995OooO00o = i;
    }

    public static String OooO00o(int i) {
        char c = (char) ((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
        char c2 = (char) ((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        char c3 = (char) ((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        char c4 = (char) (i & KotlinVersion.MAX_COMPONENT_VALUE);
        StringBuilder sb = new StringBuilder(4);
        sb.append(c);
        sb.append(c2);
        sb.append(c3);
        sb.append(c4);
        return sb.toString();
    }

    public String toString() {
        return OooO00o(this.f13995OooO00o);
    }
}
