package androidx.navigation.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.window.DialogProperties;
import androidx.compose.ui.window.SecureFlagPolicy;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Navigator.Name("dialog")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/navigation/compose/OooOo00;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/compose/OooOo00$OooO00o;", "<init>", "()V", "OooO00o", "navigation-compose_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDialogNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogNavigator.kt\nandroidx/navigation/compose/DialogNavigator\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,85:1\n1855#2,2:86\n*S KotlinDebug\n*F\n+ 1 DialogNavigator.kt\nandroidx/navigation/compose/DialogNavigator\n*L\n54#1:86,2\n*E\n"})
public final class OooOo00 extends Navigator<OooO00o> {

    @StabilityInferred(parameters = 0)
    @NavDestination.ClassType(Composable.class)
    public static final class OooO00o extends NavDestination implements o000O00.OooO0O0 {

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        @NotNull
        public final Function3<NavBackStackEntry, Composer, Integer, Unit> f7039OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        @NotNull
        public final DialogProperties f7040OooOOO0;

        public OooO00o() {
            throw null;
        }

        public OooO00o(OooOo00 oooOo00, ComposableLambda composableLambda) {
            DialogProperties dialogProperties = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
            super(oooOo00);
            this.f7040OooOOO0 = dialogProperties;
            this.f7039OooOOO = composableLambda;
        }
    }

    @Override // androidx.navigation.Navigator
    public final NavDestination OooO00o() {
        return new OooO00o(this, OooO0OO.f7008OooO00o);
    }

    @Override // androidx.navigation.Navigator
    public final void OooO0Oo(@NotNull List<NavBackStackEntry> list, @Nullable androidx.navigation.OooOOO0 oooOOO0, @Nullable Navigator.OooO00o oooO00o) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            OooO0O0().OooO0o0((NavBackStackEntry) it.next());
        }
    }

    @Override // androidx.navigation.Navigator
    public final void OooO0o0(@NotNull NavBackStackEntry navBackStackEntry, boolean z) {
        OooO0O0().OooO0Oo(navBackStackEntry, z);
    }
}
