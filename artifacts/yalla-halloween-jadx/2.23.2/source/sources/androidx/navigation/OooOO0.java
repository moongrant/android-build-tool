package androidx.navigation;

import android.os.Bundle;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p004OooO0oO.o000oOoO;

/* JADX INFO: loaded from: classes2.dex */
@Navigator.Name("navigation")
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/navigation/OooOO0;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/OooO;", "navigation-common_release"}, k = 1, mv = {1, 8, 0})
public class OooOO0 extends Navigator<OooO> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final OooOOOO f9990OooO0OO;

    public OooOO0(@NotNull OooOOOO navigatorProvider) {
        Intrinsics.checkNotNullParameter(navigatorProvider, "navigatorProvider");
        this.f9990OooO0OO = navigatorProvider;
    }

    @Override // androidx.navigation.Navigator
    public final void OooO0Oo(@NotNull List<NavBackStackEntry> entries, @Nullable OooOOO0 oooOOO0, @Nullable Navigator.OooO00o oooO00o) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        for (NavBackStackEntry navBackStackEntry : entries) {
            NavDestination destination = navBackStackEntry.getDestination();
            Intrinsics.checkNotNull(destination, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            OooO oooO = (OooO) destination;
            Bundle arguments = navBackStackEntry.getArguments();
            int i = oooO.f9929OooOOO;
            String str = oooO.f9932OooOOOo;
            if (!((i == 0 && str == null) ? false : true)) {
                StringBuilder sb = new StringBuilder("no start destination defined via app:startDestination for ");
                int i2 = oooO.f9915OooOO0;
                sb.append(i2 != 0 ? String.valueOf(i2) : "the root navigation");
                throw new IllegalStateException(sb.toString().toString());
            }
            NavDestination navDestinationOooO = str != null ? oooO.OooO(str, false) : oooO.OooO0oo(i, false);
            if (navDestinationOooO == null) {
                if (oooO.f9931OooOOOO == null) {
                    String strValueOf = oooO.f9932OooOOOo;
                    if (strValueOf == null) {
                        strValueOf = String.valueOf(oooO.f9929OooOOO);
                    }
                    oooO.f9931OooOOOO = strValueOf;
                }
                String str2 = oooO.f9931OooOOOO;
                Intrinsics.checkNotNull(str2);
                throw new IllegalArgumentException(o000oOoO.OooO0O0("navigation destination ", str2, " is not a direct child of this NavGraph"));
            }
            this.f9990OooO0OO.OooO0O0(navDestinationOooO.f9910OooO0Oo).OooO0Oo(CollectionsKt.listOf(OooO0O0().OooO00o(navDestinationOooO, navDestinationOooO.OooO0O0(arguments))), oooOOO0, oooO00o);
        }
    }

    @Override // androidx.navigation.Navigator
    @NotNull
    /* JADX INFO: renamed from: OooO0oO, reason: merged with bridge method [inline-methods] */
    public OooO OooO00o() {
        return new OooO(this);
    }
}
