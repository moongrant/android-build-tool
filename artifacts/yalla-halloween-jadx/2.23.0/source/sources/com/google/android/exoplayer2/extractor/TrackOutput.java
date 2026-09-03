package com.google.android.exoplayer2.extractor;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.OooOo;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;
import p244o00oo0Oo.o00;
import p245o00oo0o.o00Oo00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public interface TrackOutput {

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f11792OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final byte[] f11793OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f11794OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f11795OooO0Oo;

        public OooO00o(int i, byte[] bArr, int i2, int i3) {
            this.f11792OooO00o = i;
            this.f11793OooO0O0 = bArr;
            this.f11794OooO0OO = i2;
            this.f11795OooO0Oo = i3;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || OooO00o.class != obj.getClass()) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return this.f11792OooO00o == oooO00o.f11792OooO00o && this.f11794OooO0OO == oooO00o.f11794OooO0OO && this.f11795OooO0Oo == oooO00o.f11795OooO0Oo && Arrays.equals(this.f11793OooO0O0, oooO00o.f11793OooO0O0);
        }

        public final int hashCode() {
            return ((((Arrays.hashCode(this.f11793OooO0O0) + (this.f11792OooO00o * 31)) * 31) + this.f11794OooO0OO) * 31) + this.f11795OooO0Oo;
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface SampleDataPart {
    }

    int OooO00o(o00 o00Var, int i, boolean z) throws IOException;

    void OooO0O0(int i, o00Oo00 o00oo00);

    void OooO0OO(OooOo oooOo);

    void OooO0Oo(int i, o00Oo00 o00oo00);

    void OooO0o0(long j, int i, int i2, int i3, @Nullable OooO00o oooO00o);
}
