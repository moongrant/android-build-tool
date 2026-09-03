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
public final class o0O00o00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0O00OOO.OooO00o f2150OooO00o;

    public static final class OooO00o extends Lambda implements Function5<Integer, int[], LayoutDirection, OooO, int[], Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f2151Oooo0o = new OooO00o();

        public OooO00o() {
            super(5);
        }

        @Override // kotlin.jvm.functions.Function5
        public final Unit invoke(Integer num, int[] iArr, LayoutDirection layoutDirection, OooO oooO, int[] iArr2) {
            int iIntValue = num.intValue();
            int[] size = iArr;
            LayoutDirection layoutDirection2 = layoutDirection;
            OooO density = oooO;
            int[] outPosition = iArr2;
            Intrinsics.checkNotNullParameter(size, "size");
            Intrinsics.checkNotNullParameter(layoutDirection2, "layoutDirection");
            Intrinsics.checkNotNullParameter(density, "density");
            Intrinsics.checkNotNullParameter(outPosition, "outPosition");
            o00O000 o00o001 = o00O000.f2029OooO00o;
            o00O000.f2030OooO0O0.OooO0O0(density, iIntValue, size, layoutDirection2, outPosition);
            return Unit.INSTANCE;
        }
    }

    static {
        LayoutOrientation layoutOrientation = LayoutOrientation.Horizontal;
        o00O000 o00o001 = o00O000.f2029OooO00o;
        o00O000.OooOOOO oooOOOO = o00O000.f2030OooO0O0;
        o00OO0OO.OooO0O0 vertical = o00OO0O0.OooO00o.f4180OooOO0O;
        Intrinsics.checkNotNullParameter(vertical, "vertical");
        o00O0O0.OooO0O0 oooO0O0 = new o00O0O0.OooO0O0(vertical);
        f2150OooO00o = (o0O00OOO.OooO00o) o0O00OOO.OooO0o(layoutOrientation, OooO00o.f2151Oooo0o, 0, SizeMode.Wrap, oooO0O0);
    }

    @Composable
    @PublishedApi
    @NotNull
    public static final o000000 OooO00o(@NotNull o00O000.OooO0o horizontalArrangement, @NotNull o00OO0O0.OooO0OO vertical, @Nullable oOO00O ooo00o) {
        Object objOooO0o;
        Intrinsics.checkNotNullParameter(horizontalArrangement, "horizontalArrangement");
        Intrinsics.checkNotNullParameter(vertical, "verticalAlignment");
        ooo00o.OooO0o0(-837807694);
        ooo00o.OooO0o0(511388516);
        boolean zOooo0oo = ooo00o.Oooo0oo(horizontalArrangement) | ooo00o.Oooo0oo(vertical);
        Object objOooO0o2 = ooo00o.OooO0o();
        if (zOooo0oo || objOooO0o2 == oOO00O.OooO00o.f29689OooO0O0) {
            o00O000 o00o001 = o00O000.f2029OooO00o;
            if (Intrinsics.areEqual(horizontalArrangement, o00O000.f2030OooO0O0) && Intrinsics.areEqual(vertical, o00OO0O0.OooO00o.f4180OooOO0O)) {
                objOooO0o = f2150OooO00o;
            } else {
                LayoutOrientation layoutOrientation = LayoutOrientation.Horizontal;
                float fOooO00o = horizontalArrangement.OooO00o();
                Intrinsics.checkNotNullParameter(vertical, "vertical");
                o00O0O0.OooO0O0 oooO0O0 = new o00O0O0.OooO0O0(vertical);
                objOooO0o = o0O00OOO.OooO0o(layoutOrientation, new o0O00oO0(horizontalArrangement), fOooO00o, SizeMode.Wrap, oooO0O0);
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
