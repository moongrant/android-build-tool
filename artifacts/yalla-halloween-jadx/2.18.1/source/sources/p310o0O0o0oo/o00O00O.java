package p310o0O0o0oo;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.OooOOO;
import com.google.android.exoplayer2.o000oOoO;
import java.io.IOException;
import p709oo0oOOo.OooO0OO;

/* JADX INFO: loaded from: classes2.dex */
public interface o00O00O {

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Object f36330OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f36331OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f36332OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final long f36333OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f36334OooO0o0;

        public OooO00o(Object obj, int i, int i2, long j, int i3) {
            this.f36330OooO00o = obj;
            this.f36331OooO0O0 = i;
            this.f36332OooO0OO = i2;
            this.f36333OooO0Oo = j;
            this.f36334OooO0o0 = i3;
        }

        public final OooO00o OooO00o(Object obj) {
            return this.f36330OooO00o.equals(obj) ? this : new OooO00o(obj, this.f36331OooO0O0, this.f36332OooO0OO, this.f36333OooO0Oo, this.f36334OooO0o0);
        }

        public final boolean OooO0O0() {
            return this.f36331OooO0O0 != -1;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || OooO00o.class != obj.getClass()) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return this.f36330OooO00o.equals(oooO00o.f36330OooO00o) && this.f36331OooO0O0 == oooO00o.f36331OooO0O0 && this.f36332OooO0OO == oooO00o.f36332OooO0OO && this.f36333OooO0Oo == oooO00o.f36333OooO0Oo && this.f36334OooO0o0 == oooO00o.f36334OooO0o0;
        }

        public final int hashCode() {
            return ((((((((this.f36330OooO00o.hashCode() + 527) * 31) + this.f36331OooO0O0) * 31) + this.f36332OooO0OO) * 31) + ((int) this.f36333OooO0Oo)) * 31) + this.f36334OooO0o0;
        }
    }

    public interface OooO0O0 {
        void OooO00o(o00O00O o00o00o2, o000oOoO o000oooo2);
    }

    boolean OooO();

    void OooO00o(OooO0O0 oooO0O0);

    void OooO0O0(OooO0O0 oooO0O0);

    void OooO0OO(o00O0O00 o00o0o01);

    o00O00 OooO0Oo(OooO00o oooO00o, OooO0OO oooO0OO, long j);

    OooOOO OooO0o();

    void OooO0o0(OooO0O0 oooO0O0, @Nullable p709oo0oOOo.o000oOoO o000oooo2);

    void OooO0oO(Handler handler, com.google.android.exoplayer2.drm.OooO00o oooO00o);

    void OooO0oo() throws IOException;

    void OooOO0(Handler handler, o00O0O00 o00o0o01);

    @Nullable
    o000oOoO OooOO0O();

    void OooOO0o(OooO0O0 oooO0O0);

    void OooOOO0(o00O00 o00o01);
}
