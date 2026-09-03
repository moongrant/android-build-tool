package p087o000Oooo;

import androidx.compose.runtime.Composable;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.NavBackStackEntry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p043OooooO0.o00O0000;
import p045OooooOo.o00O0O00;
import p045OooooOo.oo0o0O0;
import p047Oooooo0.o00OO0OO;
import p100o000oOoO.o00OOOO0;
import p100o000oOoO.o00Oo00;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.o0o0Oo;
import p100o000oOoO.oO0Oo;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0ooO;

/* JADX INFO: loaded from: classes.dex */
public final class o0000OO0 {

    public static final class OooO extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ List<NavBackStackEntry> f28545Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Collection<NavBackStackEntry> f28546Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f28547Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(List<NavBackStackEntry> list, Collection<NavBackStackEntry> collection, int i) {
            super(2);
            this.f28545Oooo0o = list;
            this.f28546Oooo0oO = collection;
            this.f28547Oooo0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            o0000OO0.OooO0O0(this.f28545Oooo0o, this.f28546Oooo0oO, ooo00o, this.f28547Oooo0oo | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o000O00O f28548Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ NavBackStackEntry f28549Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o000O00O o000o00o2, NavBackStackEntry navBackStackEntry) {
            super(0);
            this.f28548Oooo0o = o000o00o2;
            this.f28549Oooo0oO = navBackStackEntry;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o000O00O o000o00o2 = this.f28548Oooo0o;
            NavBackStackEntry backStackEntry = this.f28549Oooo0oO;
            Objects.requireNonNull(o000o00o2);
            Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
            o000o00o2.OooO0O0().OooO0Oo(backStackEntry, false);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ o000O00O.OooO00o f28550Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ NavBackStackEntry f28551Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o00O0O00 f28552Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ o000O00O f28553Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(NavBackStackEntry navBackStackEntry, o00O0O00 o00o0o01, o000O00O o000o00o2, o000O00O.OooO00o oooO00o) {
            super(2);
            this.f28551Oooo0o = navBackStackEntry;
            this.f28552Oooo0oO = o00o0o01;
            this.f28553Oooo0oo = o000o00o2;
            this.f28550Oooo = oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            oOO00O ooo00o2 = ooo00o;
            if ((num.intValue() & 11) == 2 && ooo00o2.OooOo0()) {
                ooo00o2.OooOoo0();
            } else {
                NavBackStackEntry navBackStackEntry = this.f28551Oooo0o;
                o00Oo00.OooO0O0(navBackStackEntry, new o000O000(this.f28553Oooo0oo, navBackStackEntry), ooo00o2);
                NavBackStackEntry navBackStackEntry2 = this.f28551Oooo0o;
                o000O0.OooO00o(navBackStackEntry2, this.f28552Oooo0oO, o00O0000.OooO00o(ooo00o2, -497631156, new o000O0o(this.f28550Oooo, navBackStackEntry2)), ooo00o2, 456);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o000O00O f28554Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f28555Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(o000O00O o000o00o2, int i) {
            super(2);
            this.f28554Oooo0o = o000o00o2;
            this.f28555Oooo0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            o0000OO0.OooO00o(this.f28554Oooo0o, ooo00o, this.f28555Oooo0oO | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<o00OOOO0, o0o0Oo> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ NavBackStackEntry f28556Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ List<NavBackStackEntry> f28557Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(NavBackStackEntry navBackStackEntry, List<NavBackStackEntry> list) {
            super(1);
            this.f28556Oooo0o = navBackStackEntry;
            this.f28557Oooo0oO = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public final o0o0Oo invoke(o00OOOO0 o00oooo1) {
            o00OOOO0 DisposableEffect = o00oooo1;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            final List<NavBackStackEntry> list = this.f28557Oooo0oO;
            final NavBackStackEntry navBackStackEntry = this.f28556Oooo0o;
            LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: o000Oooo.o000Oo0
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    List this_PopulateVisibleList = list;
                    NavBackStackEntry entry = navBackStackEntry;
                    Intrinsics.checkNotNullParameter(this_PopulateVisibleList, "$this_PopulateVisibleList");
                    Intrinsics.checkNotNullParameter(entry, "$entry");
                    Intrinsics.checkNotNullParameter(lifecycleOwner, "<anonymous parameter 0>");
                    Intrinsics.checkNotNullParameter(event, "event");
                    if (event == Lifecycle.Event.ON_START && !this_PopulateVisibleList.contains(entry)) {
                        this_PopulateVisibleList.add(entry);
                    }
                    if (event == Lifecycle.Event.ON_STOP) {
                        this_PopulateVisibleList.remove(entry);
                    }
                }
            };
            navBackStackEntry.getLifecycle().addObserver(lifecycleEventObserver);
            return new o000O00(this.f28556Oooo0o, lifecycleEventObserver);
        }
    }

    @Composable
    public static final void OooO00o(@NotNull o000O00O dialogNavigator, @Nullable oOO00O ooo00o, int i) {
        Object obj;
        Intrinsics.checkNotNullParameter(dialogNavigator, "dialogNavigator");
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(294589392);
        if ((((i & 14) == 0 ? (ooo00oOooOOo.Oooo0oo(dialogNavigator) ? 4 : 2) | i : i) & 11) == 2 && ooo00oOooOOo.OooOo0()) {
            ooo00oOooOOo.OooOoo0();
        } else {
            o00O0O00 o00o0o00OooO00o = oo0o0O0.OooO00o(ooo00oOooOOo);
            StateFlow<List<NavBackStackEntry>> stateFlow = dialogNavigator.OooO0O0().f28438OooO0o0;
            Intrinsics.checkNotNullParameter(stateFlow, "<this>");
            ooo00oOooOOo.OooO0o0(-1439883919);
            oO0Oo oo0ooOooO00o = o0OOO00.OooO00o(stateFlow, stateFlow.getValue(), EmptyCoroutineContext.INSTANCE, ooo00oOooOOo, 0);
            ooo00oOooOOo.Oooo0o0();
            List transitionsInProgress = (List) oo0ooOooO00o.getValue();
            Intrinsics.checkNotNullParameter(transitionsInProgress, "transitionsInProgress");
            ooo00oOooOOo.OooO0o0(467378629);
            ooo00oOooOOo.OooO0o0(-3686930);
            boolean zOooo0oo = ooo00oOooOOo.Oooo0oo(transitionsInProgress);
            Object objOooO0o = ooo00oOooOOo.OooO0o();
            if (zOooo0oo || objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
                obj = objOooO0o;
                o00OO0OO o00oo0oo = new o00OO0OO();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : transitionsInProgress) {
                    if (((NavBackStackEntry) obj2).getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
                        arrayList.add(obj2);
                    }
                }
                o00oo0oo.addAll(arrayList);
                ooo00oOooOOo.Oooo00o(o00oo0oo);
                obj = o00oo0oo;
            }
            obj = objOooO0o;
            ooo00oOooOOo.Oooo0o0();
            o00OO0OO o00oo0oo2 = (o00OO0OO) obj;
            ooo00oOooOOo.Oooo0o0();
            OooO0O0(o00oo0oo2, (List) oo0ooOooO00o.getValue(), ooo00oOooOOo, 64);
            ListIterator listIterator = o00oo0oo2.listIterator();
            while (true) {
                p047Oooooo0.o0o0Oo o0o0oo = (p047Oooooo0.o0o0Oo) listIterator;
                if (!o0o0oo.hasNext()) {
                    break;
                }
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) o0o0oo.next();
                o000O00O.OooO00o oooO00o = (o000O00O.OooO00o) navBackStackEntry.getDestination();
                o0000OO0.OooO0OO.OooO00o(new OooO00o(dialogNavigator, navBackStackEntry), oooO00o.f28571o000oOoO, o00O0000.OooO00o(ooo00oOooOOo, 1129586364, new OooO0O0(navBackStackEntry, o00o0o00OooO00o, dialogNavigator, oooO00o)), ooo00oOooOOo, 384, 0);
            }
        }
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO0OO(dialogNavigator, i));
    }

    @Composable
    public static final void OooO0O0(@NotNull List<NavBackStackEntry> list, @NotNull Collection<NavBackStackEntry> transitionsInProgress, @Nullable oOO00O ooo00o, int i) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(transitionsInProgress, "transitionsInProgress");
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(1537894851);
        for (NavBackStackEntry navBackStackEntry : transitionsInProgress) {
            o00Oo00.OooO0O0(navBackStackEntry.getLifecycle(), new OooO0o(navBackStackEntry, list), ooo00oOooOOo);
        }
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO(list, transitionsInProgress, i));
    }
}
