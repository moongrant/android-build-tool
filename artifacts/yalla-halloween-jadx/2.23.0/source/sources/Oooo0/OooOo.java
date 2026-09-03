package Oooo0;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(28)
public class OooOo extends OooOo00 {

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NonNull
        public final OutputConfiguration f413OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public long f414OooO0O0 = 1;

        public OooO00o(@NonNull OutputConfiguration outputConfiguration) {
            this.f413OooO00o = outputConfiguration;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return Objects.equals(this.f413OooO00o, oooO00o.f413OooO00o) && this.f414OooO0O0 == oooO00o.f414OooO0O0;
        }

        public final int hashCode() {
            int iHashCode = this.f413OooO00o.hashCode() ^ 31;
            int i = (iHashCode << 5) - iHashCode;
            long j = this.f414OooO0O0;
            return ((int) (j ^ (j >>> 32))) ^ i;
        }
    }

    public OooOo(int i, @NonNull Surface surface) {
        super(new OooO00o(new OutputConfiguration(i, surface)));
    }

    @Override // Oooo0.OooOo00, Oooo0.OooOOOO, Oooo0.Oooo0, Oooo0.OooOOO.OooO00o
    public void OooO0OO(long j) {
        ((OooO00o) this.f418OooO00o).f414OooO0O0 = j;
    }

    @Override // Oooo0.OooOo00, Oooo0.OooOOOO, Oooo0.Oooo0, Oooo0.OooOOO.OooO00o
    public final void OooO0Oo(@Nullable String str) {
        ((OutputConfiguration) OooO0oO()).setPhysicalCameraId(str);
    }

    @Override // Oooo0.OooOo00, Oooo0.OooOOOO, Oooo0.Oooo0, Oooo0.OooOOO.OooO00o
    @Nullable
    public final String OooO0o0() {
        return null;
    }

    @Override // Oooo0.OooOo00, Oooo0.OooOOOO, Oooo0.Oooo0, Oooo0.OooOOO.OooO00o
    @NonNull
    public Object OooO0oO() {
        Object obj = this.f418OooO00o;
        o000OO.OooOOO0.OooO00o(obj instanceof OooO00o);
        return ((OooO00o) obj).f413OooO00o;
    }
}
