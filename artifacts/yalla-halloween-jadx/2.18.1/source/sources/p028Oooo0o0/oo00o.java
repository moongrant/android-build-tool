package p028Oooo0o0;

import androidx.compose.foundation.layout.LayoutOrientation;
import androidx.compose.foundation.layout.SizeMode;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0000O0O.OooO;
import o0O0O00.o000000;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p048OoooooO.o00OO0O0;
import p048OoooooO.o00OO0OO;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes.dex */
public final class oo00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0O00OOO.OooO00o f2227OooO00o;

    public static final class OooO00o extends Lambda implements Function5<Integer, int[], LayoutDirection, OooO, int[], Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f2228Oooo0o = new OooO00o();

        public OooO00o() {
            super(5);
        }

        @Override // kotlin.jvm.functions.Function5
        public final Unit invoke(Integer num, int[] iArr, LayoutDirection layoutDirection, OooO oooO, int[] iArr2) {
            int iIntValue = num.intValue();
            int[] size = iArr;
            OooO density = oooO;
            int[] outPosition = iArr2;
            Intrinsics.checkNotNullParameter(size, "size");
            Intrinsics.checkNotNullParameter(layoutDirection, "<anonymous parameter 2>");
            Intrinsics.checkNotNullParameter(density, "density");
            Intrinsics.checkNotNullParameter(outPosition, "outPosition");
            o00O000 o00o001 = o00O000.f2029OooO00o;
            o00O000.f2032OooO0Oo.OooO0OO(density, iIntValue, size, outPosition);
            return Unit.INSTANCE;
        }
    }

    static {
        LayoutOrientation layoutOrientation = LayoutOrientation.Vertical;
        o00O000 o00o001 = o00O000.f2029OooO00o;
        o00O000.OooOo00 oooOo00 = o00O000.f2032OooO0Oo;
        o00OO0OO.OooO00o horizontal = o00OO0O0.OooO00o.f4182OooOOO;
        Intrinsics.checkNotNullParameter(horizontal, "horizontal");
        o00O0O0.OooO00o oooO00o = new o00O0O0.OooO00o(horizontal);
        f2227OooO00o = (o0O00OOO.OooO00o) o0O00OOO.OooO0o(layoutOrientation, OooO00o.f2228Oooo0o, 0, SizeMode.Wrap, oooO00o);
    }

    @Composable
    @PublishedApi
    @NotNull
    public static final o000000 OooO00o(@NotNull o00O000.OooOo verticalArrangement, @NotNull o00OO0O0.OooO0O0 horizontal, @Nullable oOO00O ooo00o) {
        Object objOooO0o;
        Intrinsics.checkNotNullParameter(verticalArrangement, "verticalArrangement");
        Intrinsics.checkNotNullParameter(horizontal, "horizontalAlignment");
        ooo00o.OooO0o0(1089876336);
        ooo00o.OooO0o0(511388516);
        boolean zOooo0oo = ooo00o.Oooo0oo(verticalArrangement) | ooo00o.Oooo0oo(horizontal);
        Object objOooO0o2 = ooo00o.OooO0o();
        if (zOooo0oo || objOooO0o2 == oOO00O.OooO00o.f29689OooO0O0) {
            o00O000 o00o001 = o00O000.f2029OooO00o;
            if (Intrinsics.areEqual(verticalArrangement, o00O000.f2032OooO0Oo) && Intrinsics.areEqual(horizontal, o00OO0O0.OooO00o.f4182OooOOO)) {
                objOooO0o = f2227OooO00o;
            } else {
                LayoutOrientation layoutOrientation = LayoutOrientation.Vertical;
                float fOooO00o = verticalArrangement.OooO00o();
                Intrinsics.checkNotNullParameter(horizontal, "horizontal");
                o00O0O0.OooO00o oooO00o = new o00O0O0.OooO00o(horizontal);
                objOooO0o = o0O00OOO.OooO0o(layoutOrientation, new o00O0(verticalArrangement), fOooO00o, SizeMode.Wrap, oooO00o);
            }
            objOooO0o2 = objOooO0o;
            ooo00o.Oooo00o(objOooO0o2);
        }
        ooo00o.Oooo0o0();
        o000000 o000000Var = (o000000) objOooO0o2;
        ooo00o.Oooo0o0();
        return o000000Var;
    }
}
