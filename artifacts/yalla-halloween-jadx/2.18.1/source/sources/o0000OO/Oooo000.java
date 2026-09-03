package o0000OO;

import androidx.compose.runtime.Composable;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo000 {
    public static final void OooO00o(@NotNull o00000 state, @NotNull List<? extends o0O0O00.o0O0O00> measurables) {
        ArrayList<String> arrayList;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        int size = measurables.size() - 1;
        if (size < 0) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            o0O0O00.o0O0O00 o0o0o00 = measurables.get(i);
            Object objOooO00o = o0O0O00.o0OoOo0.OooO00o(o0o0o00);
            if (objOooO00o == null && (objOooO00o = o000oOoO.OooO00o(o0o0o00)) == null) {
                objOooO00o = new OooOOOO();
            }
            androidx.constraintlayout.core.state.OooO00o OooO00o2 = state.OooO00o(objOooO00o);
            if (OooO00o2 instanceof androidx.constraintlayout.core.state.OooO00o) {
                OooO00o2.f6880Oooo0O0 = o0o0o00;
                ConstraintWidget constraintWidget = OooO00o2.f6881Oooo0OO;
                if (constraintWidget != null) {
                    constraintWidget.f6960Ooooooo = o0o0o00;
                }
            }
            Intrinsics.checkNotNullParameter(o0o0o00, "<this>");
            Object objOooo0o = o0o0o00.Oooo0o();
            o0OoOo0 o0oooo1 = objOooo0o instanceof o0OoOo0 ? (o0OoOo0) objOooo0o : null;
            String strOooO00o = o0oooo1 != null ? o0oooo1.OooO00o() : null;
            if (strOooO00o != null && (objOooO00o instanceof String)) {
                String str = (String) objOooO00o;
                androidx.constraintlayout.core.state.OooO00o OooO00o3 = state.OooO00o(str);
                if (OooO00o3 instanceof androidx.constraintlayout.core.state.OooO00o) {
                    Objects.requireNonNull(OooO00o3);
                    if (state.f6888OooO0OO.containsKey(strOooO00o)) {
                        arrayList = state.f6888OooO0OO.get(strOooO00o);
                    } else {
                        arrayList = new ArrayList<>();
                        state.f6888OooO0OO.put(strOooO00o, arrayList);
                    }
                    arrayList.add(str);
                }
            }
            if (i2 > size) {
                return;
            } else {
                i = i2;
            }
        }
    }

    @Composable
    @PublishedApi
    @NotNull
    public static final Pair OooO0O0(@NotNull ConstraintLayoutScope scope, @NotNull o0O00OO remeasureRequesterState, @NotNull o000OOo measurer, @Nullable oOO00O ooo00o) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(remeasureRequesterState, "remeasureRequesterState");
        Intrinsics.checkNotNullParameter(measurer, "measurer");
        ooo00o.OooO0o0(-441911751);
        ooo00o.OooO0o0(-3687241);
        Object objOooO0o = ooo00o.OooO0o();
        oOO00O.OooO00o.C0323OooO00o c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
        if (objOooO0o == c0323OooO00o) {
            objOooO0o = new o00Oo0(scope);
            ooo00o.Oooo00o(objOooO0o);
        }
        ooo00o.Oooo0o0();
        o00Oo0 o00oo1 = (o00Oo0) objOooO0o;
        ooo00o.OooO0o0(-3686930);
        boolean zOooo0oo = ooo00o.Oooo0oo(257);
        Object objOooO0o2 = ooo00o.OooO0o();
        if (zOooo0oo || objOooO0o2 == c0323OooO00o) {
            objOooO0o2 = TuplesKt.to(new OooOo00(measurer, o00oo1, remeasureRequesterState), new OooOo(remeasureRequesterState, o00oo1));
            ooo00o.Oooo00o(objOooO0o2);
        }
        ooo00o.Oooo0o0();
        Pair pair = (Pair) objOooO0o2;
        ooo00o.Oooo0o0();
        return pair;
    }
}
