package Oooo0;

import android.view.View;
import android.widget.Magnifier;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(28)
public final class o00OO0OO implements o00OO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o00OO0OO f686OooO00o = new o00OO0OO();

    @StabilityInferred(parameters = 0)
    @RequiresApi(28)
    public static class OooO00o implements o00OO00O {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final Magnifier f687OooO00o;

        public OooO00o(@NotNull Magnifier magnifier) {
            Intrinsics.checkNotNullParameter(magnifier, "magnifier");
            this.f687OooO00o = magnifier;
        }

        @Override // Oooo0.o00OO00O
        public final long OooO00o() {
            return o0000O0O.o0OoOo0.OooO00o(this.f687OooO00o.getWidth(), this.f687OooO00o.getHeight());
        }

        @Override // Oooo0.o00OO00O
        public void OooO0O0(long j, long j2, float f) {
            this.f687OooO00o.show(o00O0O.OooO.OooO0OO(j), o00O0O.OooO.OooO0Oo(j));
        }

        @Override // Oooo0.o00OO00O
        public final void OooO0OO() {
            this.f687OooO00o.update();
        }

        @Override // Oooo0.o00OO00O
        public final void dismiss() {
            this.f687OooO00o.dismiss();
        }
    }

    @Override // Oooo0.o00OO0O0
    public final boolean OooO00o() {
        return false;
    }

    @Override // Oooo0.o00OO0O0
    public final o00OO00O OooO0O0(o00O0O0 style, View view, o0000O0O.OooO density, float f) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(density, "density");
        return new OooO00o(new Magnifier(view));
    }
}
