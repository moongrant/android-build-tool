package Oooo0;

import android.hardware.camera2.params.InputConfiguration;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0OO f406OooO00o;

    @RequiresApi(23)
    public static class OooO00o implements OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final InputConfiguration f407OooO00o;

        public OooO00o(@NonNull InputConfiguration inputConfiguration) {
            this.f407OooO00o = inputConfiguration;
        }

        @Override // Oooo0.OooOOO0.OooO0OO
        @Nullable
        public final InputConfiguration OooO00o() {
            return this.f407OooO00o;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof OooO0OO)) {
                return false;
            }
            return Objects.equals(this.f407OooO00o, ((OooO0OO) obj).OooO00o());
        }

        public final int hashCode() {
            return this.f407OooO00o.hashCode();
        }

        @NonNull
        public final String toString() {
            return this.f407OooO00o.toString();
        }
    }

    @RequiresApi(31)
    public static final class OooO0O0 extends OooO00o {
    }

    public interface OooO0OO {
        @Nullable
        InputConfiguration OooO00o();
    }

    public OooOOO0(@NonNull OooO00o oooO00o) {
        this.f406OooO00o = oooO00o;
    }

    @Nullable
    public static OooOOO0 OooO00o(@Nullable InputConfiguration inputConfiguration) {
        if (inputConfiguration == null) {
            return null;
        }
        return Build.VERSION.SDK_INT >= 31 ? new OooOOO0(new OooO0O0(inputConfiguration)) : new OooOOO0(new OooO00o(inputConfiguration));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof OooOOO0)) {
            return false;
        }
        return this.f406OooO00o.equals(((OooOOO0) obj).f406OooO00o);
    }

    public final int hashCode() {
        return this.f406OooO00o.hashCode();
    }

    @NonNull
    public final String toString() {
        return this.f406OooO00o.toString();
    }
}
