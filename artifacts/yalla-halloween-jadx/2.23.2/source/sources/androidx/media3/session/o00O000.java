package androidx.media3.session;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.errorprone.annotations.DoNotMock;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
@DoNotMock
public class o00O000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Object f9322OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @GuardedBy("STATIC_LOCK")
    public static final HashMap<String, o00O000> f9323OooO0O0;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final androidx.media.OooOOOO.OooO0O0 f9324OooO00o;

        public OooO00o(androidx.media.OooOOOO.OooO0O0 oooO0O0) {
            this.f9324OooO00o = oooO0O0;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            OooO00o oooO00o = (OooO00o) obj;
            oooO00o.getClass();
            return this.f9324OooO00o.equals(oooO00o.f9324OooO00o);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{null, this.f9324OooO00o});
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ControllerInfo {pkg=");
            androidx.media.OooOOOO.OooO0O0 oooO0O0 = this.f9324OooO00o;
            sb.append(oooO0O0.f6164OooO00o.f6168OooO00o);
            sb.append(", uid=");
            return p022Oooo00O.OooOO0.OooO00o(sb, oooO0O0.f6164OooO00o.f6170OooO0OO, "})");
        }
    }

    static {
        p069o0000ooO.o0000.OooO00o("media3.session");
        f9322OooO00o = new Object();
        f9323OooO0O0 = new HashMap<>();
    }
}
