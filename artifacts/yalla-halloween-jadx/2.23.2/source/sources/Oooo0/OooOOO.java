package Oooo0;

import android.os.Build;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class OooOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f405OooO00o;

    public interface OooO00o {
        void OooO00o(long j);

        void OooO0O0(@NonNull Surface surface);

        void OooO0OO(long j);

        void OooO0Oo(@Nullable String str);

        void OooO0o();

        @Nullable
        String OooO0o0();

        @Nullable
        Object OooO0oO();

        @Nullable
        Surface getSurface();
    }

    public OooOOO(int i, @NonNull Surface surface) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            this.f405OooO00o = new Oooo000(i, surface);
            return;
        }
        if (i2 >= 28) {
            this.f405OooO00o = new OooOo(i, surface);
            return;
        }
        if (i2 >= 26) {
            this.f405OooO00o = new OooOo00(i, surface);
        } else if (i2 >= 24) {
            this.f405OooO00o = new OooOOOO(i, surface);
        } else {
            this.f405OooO00o = new Oooo0(surface);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof OooOOO)) {
            return false;
        }
        return this.f405OooO00o.equals(((OooOOO) obj).f405OooO00o);
    }

    public final int hashCode() {
        return this.f405OooO00o.hashCode();
    }

    public OooOOO(@NonNull OooOOOO oooOOOO) {
        this.f405OooO00o = oooOOOO;
    }
}
