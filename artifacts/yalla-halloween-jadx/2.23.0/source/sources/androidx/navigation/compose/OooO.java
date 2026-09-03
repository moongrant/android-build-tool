package androidx.navigation.compose;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigator;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import o000O00.o0000O00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Navigator.Name("composable")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/navigation/compose/OooO;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/compose/OooO$OooO00o;", "<init>", "()V", "OooO00o", "navigation-compose_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nComposeNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeNavigator.kt\nandroidx/navigation/compose/ComposeNavigator\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,121:1\n1855#2,2:122\n*S KotlinDebug\n*F\n+ 1 ComposeNavigator.kt\nandroidx/navigation/compose/ComposeNavigator\n*L\n56#1:122,2\n*E\n"})
public final class OooO extends Navigator<OooO00o> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final MutableState<Boolean> f6998OooO0OO = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    @StabilityInferred(parameters = 0)
    @NavDestination.ClassType(Composable.class)
    public static final class OooO00o extends NavDestination {

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        @Nullable
        public Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> f6999OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        @NotNull
        public final Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> f7000OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        @Nullable
        public Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> f7001OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        @Nullable
        public Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> f7002OooOOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        @Nullable
        public Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> f7003OooOOo0;

        public OooO00o(@NotNull OooO oooO, @NotNull ComposableLambda composableLambda) {
            super(oooO);
            this.f7000OooOOO0 = composableLambda;
        }
    }

    @Override // androidx.navigation.Navigator
    public final NavDestination OooO00o() {
        return new OooO00o(this, OooO0O0.f7006OooO00o);
    }

    @Override // androidx.navigation.Navigator
    public final void OooO0Oo(@NotNull List<NavBackStackEntry> list, @Nullable androidx.navigation.OooOOO0 oooOOO0, @Nullable Navigator.OooO00o oooO00o) {
        boolean z;
        for (NavBackStackEntry backStackEntry : list) {
            o0000O00 o0000o00OooO0O0 = OooO0O0();
            Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
            MutableStateFlow<Set<NavBackStackEntry>> mutableStateFlow = o0000o00OooO0O0.f34377OooO0OO;
            Set<NavBackStackEntry> value = mutableStateFlow.getValue();
            boolean z2 = true;
            if (!(value instanceof Collection) || !value.isEmpty()) {
                Iterator<T> it = value.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((NavBackStackEntry) it.next()) == backStackEntry) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
            } else {
                z = false;
                break;
            }
            StateFlow<List<NavBackStackEntry>> stateFlow = o0000o00OooO0O0.f34380OooO0o0;
            if (z) {
                List<NavBackStackEntry> value2 = stateFlow.getValue();
                if (!(value2 instanceof Collection) || !value2.isEmpty()) {
                    Iterator<T> it2 = value2.iterator();
                    do {
                        if (!it2.hasNext()) {
                            z2 = false;
                            break;
                        }
                    } while (!(((NavBackStackEntry) it2.next()) == backStackEntry));
                } else {
                    z2 = false;
                    break;
                }
                if (z2) {
                }
            }
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) CollectionsKt.lastOrNull((List) stateFlow.getValue());
            if (navBackStackEntry != null) {
                mutableStateFlow.setValue(SetsKt.plus(mutableStateFlow.getValue(), navBackStackEntry));
            }
            mutableStateFlow.setValue(SetsKt.plus(mutableStateFlow.getValue(), backStackEntry));
            o0000o00OooO0O0.OooO0o0(backStackEntry);
        }
        this.f6998OooO0OO.setValue(Boolean.FALSE);
    }

    @Override // androidx.navigation.Navigator
    public final void OooO0o0(@NotNull NavBackStackEntry navBackStackEntry, boolean z) {
        OooO0O0().OooO0Oo(navBackStackEntry, z);
        this.f6998OooO0OO.setValue(Boolean.TRUE);
    }
}
