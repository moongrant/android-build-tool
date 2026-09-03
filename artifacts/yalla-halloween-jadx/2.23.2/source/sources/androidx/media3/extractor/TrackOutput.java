package androidx.media3.extractor;

import androidx.annotation.Nullable;
import androidx.media3.common.OooOO0;
import androidx.media3.common.util.UnstableApi;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;
import p069o0000ooO.o00000O0;
import p080o000OoO.o000O000;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public interface TrackOutput {

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f8372OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final byte[] f8373OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f8374OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f8375OooO0Oo;

        public OooO00o(int i, byte[] bArr, int i2, int i3) {
            this.f8372OooO00o = i;
            this.f8373OooO0O0 = bArr;
            this.f8374OooO0OO = i2;
            this.f8375OooO0Oo = i3;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || OooO00o.class != obj.getClass()) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return this.f8372OooO00o == oooO00o.f8372OooO00o && this.f8374OooO0OO == oooO00o.f8374OooO0OO && this.f8375OooO0Oo == oooO00o.f8375OooO0Oo && Arrays.equals(this.f8373OooO0O0, oooO00o.f8373OooO0O0);
        }

        public final int hashCode() {
            return ((((Arrays.hashCode(this.f8373OooO0O0) + (this.f8372OooO00o * 31)) * 31) + this.f8374OooO0OO) * 31) + this.f8375OooO0Oo;
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface SampleDataPart {
    }

    int OooO00o(o00000O0 o00000o1, int i, boolean z) throws IOException;

    void OooO0O0(OooOO0 oooOO1);

    void OooO0OO(int i, o000O000 o000o001);

    void OooO0Oo(int i, o000O000 o000o001);

    void OooO0o0(long j, int i, int i2, int i3, @Nullable OooO00o oooO00o);
}
