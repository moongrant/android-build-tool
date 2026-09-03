package Oooo0;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(26)
public class OooOo00 extends OooOOOO {

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NonNull
        public final OutputConfiguration f414OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public String f415OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public long f416OooO0OO = 1;

        public OooO00o(@NonNull OutputConfiguration outputConfiguration) {
            this.f414OooO00o = outputConfiguration;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return Objects.equals(this.f414OooO00o, oooO00o.f414OooO00o) && this.f416OooO0OO == oooO00o.f416OooO0OO && Objects.equals(this.f415OooO0O0, oooO00o.f415OooO0O0);
        }

        public final int hashCode() {
            int iHashCode = this.f414OooO00o.hashCode() ^ 31;
            int i = (iHashCode << 5) - iHashCode;
            String str = this.f415OooO0O0;
            int iHashCode2 = (str == null ? 0 : str.hashCode()) ^ i;
            int i2 = (iHashCode2 << 5) - iHashCode2;
            long j = this.f416OooO0OO;
            return ((int) (j ^ (j >>> 32))) ^ i2;
        }
    }

    public OooOo00(int i, @NonNull Surface surface) {
        super(new OooO00o(new OutputConfiguration(i, surface)));
    }

    @Override // Oooo0.Oooo0, Oooo0.OooOOO.OooO00o
    public final void OooO0O0(@NonNull Surface surface) {
        ((OutputConfiguration) OooO0oO()).addSurface(surface);
    }

    @Override // Oooo0.OooOOOO, Oooo0.Oooo0, Oooo0.OooOOO.OooO00o
    public void OooO0OO(long j) {
        ((OooO00o) this.f417OooO00o).f416OooO0OO = j;
    }

    @Override // Oooo0.OooOOOO, Oooo0.Oooo0, Oooo0.OooOOO.OooO00o
    public void OooO0Oo(@Nullable String str) {
        ((OooO00o) this.f417OooO00o).f415OooO0O0 = str;
    }

    @Override // Oooo0.OooOOOO, Oooo0.Oooo0, Oooo0.OooOOO.OooO00o
    public final void OooO0o() {
        ((OutputConfiguration) OooO0oO()).enableSurfaceSharing();
    }

    @Override // Oooo0.OooOOOO, Oooo0.Oooo0, Oooo0.OooOOO.OooO00o
    @Nullable
    public String OooO0o0() {
        return ((OooO00o) this.f417OooO00o).f415OooO0O0;
    }

    @Override // Oooo0.OooOOOO, Oooo0.Oooo0, Oooo0.OooOOO.OooO00o
    @NonNull
    public Object OooO0oO() {
        Object obj = this.f417OooO00o;
        o000OO.OooOOO0.OooO00o(obj instanceof OooO00o);
        return ((OooO00o) obj).f414OooO00o;
    }

    @Override // Oooo0.OooOOOO, Oooo0.Oooo0
    public final boolean OooO0oo() {
        throw new AssertionError("isSurfaceSharingEnabled() should not be called on API >= 26");
    }
}
