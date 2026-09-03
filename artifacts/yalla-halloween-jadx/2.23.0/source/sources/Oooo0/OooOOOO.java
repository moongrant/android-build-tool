package Oooo0;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(24)
public class OooOOOO extends Oooo0 {

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NonNull
        public final OutputConfiguration f409OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public String f410OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f411OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public long f412OooO0Oo = 1;

        public OooO00o(@NonNull OutputConfiguration outputConfiguration) {
            this.f409OooO00o = outputConfiguration;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return Objects.equals(this.f409OooO00o, oooO00o.f409OooO00o) && this.f411OooO0OO == oooO00o.f411OooO0OO && this.f412OooO0Oo == oooO00o.f412OooO0Oo && Objects.equals(this.f410OooO0O0, oooO00o.f410OooO0O0);
        }

        public final int hashCode() {
            int iHashCode = this.f409OooO00o.hashCode() ^ 31;
            int i = (this.f411OooO0OO ? 1 : 0) ^ ((iHashCode << 5) - iHashCode);
            int i2 = (i << 5) - i;
            String str = this.f410OooO0O0;
            int iHashCode2 = (str == null ? 0 : str.hashCode()) ^ i2;
            int i3 = (iHashCode2 << 5) - iHashCode2;
            long j = this.f412OooO0Oo;
            return ((int) (j ^ (j >>> 32))) ^ i3;
        }
    }

    public OooOOOO(int i, @NonNull Surface surface) {
        super(new OooO00o(new OutputConfiguration(i, surface)));
    }

    @Override // Oooo0.Oooo0, Oooo0.OooOOO.OooO00o
    public void OooO0OO(long j) {
        ((OooO00o) this.f418OooO00o).f412OooO0Oo = j;
    }

    @Override // Oooo0.Oooo0, Oooo0.OooOOO.OooO00o
    public void OooO0Oo(@Nullable String str) {
        ((OooO00o) this.f418OooO00o).f410OooO0O0 = str;
    }

    @Override // Oooo0.Oooo0, Oooo0.OooOOO.OooO00o
    public void OooO0o() {
        ((OooO00o) this.f418OooO00o).f411OooO0OO = true;
    }

    @Override // Oooo0.Oooo0, Oooo0.OooOOO.OooO00o
    @Nullable
    public String OooO0o0() {
        return ((OooO00o) this.f418OooO00o).f410OooO0O0;
    }

    @Override // Oooo0.Oooo0, Oooo0.OooOOO.OooO00o
    @NonNull
    public Object OooO0oO() {
        Object obj = this.f418OooO00o;
        o000OO.OooOOO0.OooO00o(obj instanceof OooO00o);
        return ((OooO00o) obj).f409OooO00o;
    }

    @Override // Oooo0.Oooo0
    public boolean OooO0oo() {
        return ((OooO00o) this.f418OooO00o).f411OooO0OO;
    }

    @Override // Oooo0.Oooo0, Oooo0.OooOOO.OooO00o
    @Nullable
    public final Surface getSurface() {
        return ((OutputConfiguration) OooO0oO()).getSurface();
    }
}
