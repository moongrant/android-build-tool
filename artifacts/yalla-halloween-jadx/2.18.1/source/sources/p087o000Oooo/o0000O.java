package p087o000Oooo;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p086o000OooO.o00000;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Navigator.Name("composable")
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lo000Oooo/o0000O;", "Landroidx/navigation/Navigator;", "Lo000Oooo/o0000O$OooO00o;", "<init>", "()V", "OooO00o", "navigation-compose_release"}, k = 1, mv = {1, 6, 0})
public final class o0000O extends Navigator<OooO00o> {

    @StabilityInferred(parameters = 0)
    @NavDestination.ClassType(Composable.class)
    public static final class OooO00o extends NavDestination {

        /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
        @NotNull
        public final Function3<NavBackStackEntry, oOO00O, Integer, Unit> f28539o000oOoO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(@NotNull o0000O navigator, @NotNull Function3<? super NavBackStackEntry, ? super oOO00O, ? super Integer, Unit> content) {
            super(navigator);
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(content, "content");
            this.f28539o000oOoO = content;
        }
    }

    @Override // androidx.navigation.Navigator
    public final NavDestination OooO00o() {
        o0000O0O o0000o0o2 = o0000O0O.f28542OooO00o;
        return new OooO00o(this, o0000O0O.f28543OooO0O0);
    }

    @Override // androidx.navigation.Navigator
    public final void OooO0Oo(@NotNull List<NavBackStackEntry> entries, @Nullable o00000 o00000Var, @Nullable Navigator.OooO00o oooO00o) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        Iterator<T> it = entries.iterator();
        while (it.hasNext()) {
            OooO0O0().OooO0o((NavBackStackEntry) it.next());
        }
    }

    @Override // androidx.navigation.Navigator
    public final void OooO0o0(@NotNull NavBackStackEntry popUpTo, boolean z) {
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        OooO0O0().OooO0Oo(popUpTo, z);
    }
}
