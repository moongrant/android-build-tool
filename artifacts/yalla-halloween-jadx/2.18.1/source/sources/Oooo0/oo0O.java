package Oooo0;

import android.view.View;
import android.widget.Magnifier;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(29)
public final class oo0O implements o00OO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final oo0O f775OooO00o = new oo0O();

    @StabilityInferred(parameters = 0)
    @RequiresApi(29)
    public static final class OooO00o extends o00OO0OO.OooO00o {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(@NotNull Magnifier magnifier) {
            super(magnifier);
            Intrinsics.checkNotNullParameter(magnifier, "magnifier");
        }

        @Override // Oooo0.o00OO0OO.OooO00o, Oooo0.o00OO00O
        public final void OooO0O0(long j, long j2, float f) {
            if (!Float.isNaN(f)) {
                this.f687OooO00o.setZoom(f);
            }
            if (o00O0O.OooOO0.OooO0OO(j2)) {
                this.f687OooO00o.show(o00O0O.OooO.OooO0OO(j), o00O0O.OooO.OooO0Oo(j), o00O0O.OooO.OooO0OO(j2), o00O0O.OooO.OooO0Oo(j2));
            } else {
                this.f687OooO00o.show(o00O0O.OooO.OooO0OO(j), o00O0O.OooO.OooO0Oo(j));
            }
        }
    }

    @Override // Oooo0.o00OO0O0
    public final boolean OooO00o() {
        return true;
    }

    @Override // Oooo0.o00OO0O0
    public final o00OO00O OooO0O0(o00O0O0 style, View view, o0000O0O.OooO density, float f) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(density, "density");
        o00O0O0.OooO00o oooO00o = o00O0O0.f647OooO0oO;
        if (Intrinsics.areEqual(style, o00O0O0.f646OooO)) {
            return new OooO00o(new Magnifier(view));
        }
        long jO00ooo = density.o00ooo(style.f650OooO0O0);
        float fOoooOoo = density.OoooOoo(style.f651OooO0OO);
        float fOoooOoo2 = density.OoooOoo(style.f652OooO0Oo);
        Magnifier.Builder builder = new Magnifier.Builder(view);
        o00O0O.OooOo00.OooO00o oooO00o2 = o00O0O.OooOo00.f30416OooO0O0;
        if (jO00ooo != o00O0O.OooOo00.f30418OooO0Oo) {
            builder.setSize(MathKt.roundToInt(o00O0O.OooOo00.OooO0Oo(jO00ooo)), MathKt.roundToInt(o00O0O.OooOo00.OooO0O0(jO00ooo)));
        }
        if (!Float.isNaN(fOoooOoo)) {
            builder.setCornerRadius(fOoooOoo);
        }
        if (!Float.isNaN(fOoooOoo2)) {
            builder.setElevation(fOoooOoo2);
        }
        if (!Float.isNaN(f)) {
            builder.setInitialZoom(f);
        }
        builder.setClippingEnabled(style.f654OooO0o0);
        Magnifier magnifierBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(magnifierBuild, "Builder(view).run {\n    …    build()\n            }");
        return new OooO00o(magnifierBuild);
    }
}
