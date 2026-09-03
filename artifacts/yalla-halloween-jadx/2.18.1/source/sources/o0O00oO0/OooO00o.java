package o0O00oO0;

import Oooo000.o00Ooo;
import androidx.compose.animation.ExperimentalAnimationApi;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p086o000OooO.o00000;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Navigator.Name("animatedComposable")
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lo0O00oO0/OooO00o;", "Landroidx/navigation/Navigator;", "Lo0O00oO0/OooO00o$OooO00o;", "<init>", "()V", "OooO00o", "navigation-animation_release"}, k = 1, mv = {1, 7, 1})
@ExperimentalAnimationApi
public final class OooO00o extends Navigator<C0359OooO00o> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final o0O00OO<Boolean> f35222OooO0OO = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(Boolean.FALSE);

    /* JADX INFO: renamed from: o0O00oO0.OooO00o$OooO00o, reason: collision with other inner class name */
    @StabilityInferred(parameters = 0)
    @NavDestination.ClassType(Composable.class)
    @ExperimentalAnimationApi
    public static final class C0359OooO00o extends NavDestination {

        /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
        @NotNull
        public final Function4<o00Ooo, NavBackStackEntry, oOO00O, Integer, Unit> f35223o000oOoO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0359OooO00o(@NotNull OooO00o navigator, @NotNull Function4<? super o00Ooo, ? super NavBackStackEntry, ? super oOO00O, ? super Integer, Unit> content) {
            super(navigator);
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(content, "content");
            this.f35223o000oOoO = content;
        }
    }

    @Override // androidx.navigation.Navigator
    public final NavDestination OooO00o() {
        OooO0O0 oooO0O0 = OooO0O0.f35224OooO00o;
        return new C0359OooO00o(this, OooO0O0.f35225OooO0O0);
    }

    @Override // androidx.navigation.Navigator
    public final void OooO0Oo(@NotNull List<NavBackStackEntry> entries, @Nullable o00000 o00000Var, @Nullable Navigator.OooO00o oooO00o) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        Iterator<T> it = entries.iterator();
        while (it.hasNext()) {
            OooO0O0().OooO0o((NavBackStackEntry) it.next());
        }
        this.f35222OooO0OO.setValue(Boolean.FALSE);
    }

    @Override // androidx.navigation.Navigator
    public final void OooO0o0(@NotNull NavBackStackEntry popUpTo, boolean z) {
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        OooO0O0().OooO0Oo(popUpTo, z);
        this.f35222OooO0OO.setValue(Boolean.TRUE);
    }
}
