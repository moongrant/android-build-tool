package androidx.navigation;

import android.os.Bundle;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p086o000OooO.o0000;
import p086o000OooO.o00000;

/* JADX INFO: loaded from: classes.dex */
@Navigator.Name("navigation")
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/navigation/OooO0o;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/OooO0OO;", "navigation-common_release"}, k = 1, mv = {1, 6, 0})
public class OooO0o extends Navigator<OooO0OO> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final o0000 f8660OooO0OO;

    public OooO0o(@NotNull o0000 navigatorProvider) {
        Intrinsics.checkNotNullParameter(navigatorProvider, "navigatorProvider");
        this.f8660OooO0OO = navigatorProvider;
    }

    @Override // androidx.navigation.Navigator
    public final NavDestination OooO00o() {
        return new OooO0OO(this);
    }

    @Override // androidx.navigation.Navigator
    public final void OooO0Oo(@NotNull List<NavBackStackEntry> entries, @Nullable o00000 o00000Var, @Nullable Navigator.OooO00o oooO00o) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        for (NavBackStackEntry navBackStackEntry : entries) {
            OooO0OO oooO0OO = (OooO0OO) navBackStackEntry.getDestination();
            Bundle arguments = navBackStackEntry.getArguments();
            int i = oooO0OO.f8653OoooOOO;
            String str = oooO0OO.f8655OoooOo0;
            if (!((i == 0 && str == null) ? false : true)) {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("no start destination defined via app:startDestination for ");
                int i2 = oooO0OO.f8637OoooO0O;
                sbOooO0o0.append(i2 != 0 ? String.valueOf(i2) : "the root navigation");
                throw new IllegalStateException(sbOooO0o0.toString().toString());
            }
            NavDestination navDestinationOooOO0 = str != null ? oooO0OO.OooOO0(str, false) : oooO0OO.OooO0oo(i, false);
            if (navDestinationOooOO0 == null) {
                if (oooO0OO.f8654OoooOOo == null) {
                    String strValueOf = oooO0OO.f8655OoooOo0;
                    if (strValueOf == null) {
                        strValueOf = String.valueOf(oooO0OO.f8653OoooOOO);
                    }
                    oooO0OO.f8654OoooOOo = strValueOf;
                }
                String str2 = oooO0OO.f8654OoooOOo;
                Intrinsics.checkNotNull(str2);
                throw new IllegalArgumentException(OooO0o.OooO0OO.OooO00o("navigation destination ", str2, " is not a direct child of this NavGraph"));
            }
            this.f8660OooO0OO.OooO0O0(navDestinationOooOO0.f8631Oooo0o).OooO0Oo(CollectionsKt.listOf(OooO0O0().OooO00o(navDestinationOooOO0, navDestinationOooOO0.OooO0O0(arguments))), o00000Var, oooO00o);
        }
    }
}
