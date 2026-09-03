package com.google.android.exoplayer2.extractor;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import p318o0O0oOo.o000;
import p709oo0oOOo.OooOO0O;

/* JADX INFO: loaded from: classes2.dex */
public interface TrackOutput {

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f13735OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final byte[] f13736OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f13737OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f13738OooO0Oo;

        public OooO00o(int i, byte[] bArr, int i2, int i3) {
            this.f13735OooO00o = i;
            this.f13736OooO0O0 = bArr;
            this.f13737OooO0OO = i2;
            this.f13738OooO0Oo = i3;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || OooO00o.class != obj.getClass()) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return this.f13735OooO00o == oooO00o.f13735OooO00o && this.f13737OooO0OO == oooO00o.f13737OooO0OO && this.f13738OooO0Oo == oooO00o.f13738OooO0Oo && Arrays.equals(this.f13736OooO0O0, oooO00o.f13736OooO0O0);
        }

        public final int hashCode() {
            return ((((Arrays.hashCode(this.f13736OooO0O0) + (this.f13735OooO00o * 31)) * 31) + this.f13737OooO0OO) * 31) + this.f13738OooO0Oo;
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface SampleDataPart {
    }

    void OooO00o(o000 o000Var, int i);

    int OooO0O0(OooOO0O oooOO0O, int i, boolean z) throws IOException;

    void OooO0OO(o000 o000Var, int i);

    void OooO0Oo(long j, int i, int i2, int i3, @Nullable OooO00o oooO00o);

    void OooO0o0(Format format);
}
