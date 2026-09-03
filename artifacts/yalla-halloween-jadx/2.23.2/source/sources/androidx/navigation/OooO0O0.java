package androidx.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.activity.o000oOoO;
import androidx.annotation.IdRes;
import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.o0000O0;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.OooO0O0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0oO.o0oOO;
import p105o000oo0o.o000;
import p105o000oo0o.o0000;
import p105o000oo0o.o0000OO0;
import p105o000oo0o.o000O0;
import p105o000oo0o.o000O000;
import p105o000oo0o.o000O0o;
import p105o000oo0o.o000OO;
import p105o000oo0o.o000Oo0;
import p105o000oo0o.o00O0;
import p105o000oo0o.o00O00O;
import p105o000oo0o.o00O00OO;
import p105o000oo0o.o00O00o0;
import p105o000oo0o.o00O0O00;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nNavController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavController.kt\nandroidx/navigation/NavController\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 NavigatorProvider.kt\nandroidx/navigation/NavigatorProviderKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 7 Uri.kt\nandroidx/core/net/UriKt\n+ 8 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,2572:1\n179#2,2:2573\n1295#2,2:2583\n1295#2,2:2585\n179#2,2:2704\n1#3:2575\n150#4:2576\n533#5,6:2577\n1855#5,2:2587\n1855#5,2:2589\n1855#5,2:2591\n1855#5,2:2593\n1864#5,3:2595\n1774#5,4:2598\n1855#5:2602\n766#5:2603\n857#5,2:2604\n1856#5:2606\n766#5:2607\n857#5,2:2608\n766#5:2610\n857#5,2:2611\n1855#5,2:2613\n1855#5:2615\n1789#5,3:2616\n1856#5:2619\n819#5:2627\n847#5,2:2628\n1855#5:2630\n1856#5:2638\n1855#5,2:2639\n1855#5,2:2641\n378#5,7:2643\n1855#5,2:2650\n1855#5,2:2652\n819#5:2654\n847#5,2:2655\n1855#5,2:2657\n1855#5,2:2659\n533#5,6:2661\n533#5,6:2667\n533#5,6:2673\n1855#5,2:2679\n1855#5,2:2681\n1864#5,3:2684\n1855#5,2:2690\n533#5,6:2692\n533#5,6:2698\n361#6,7:2620\n361#6,7:2631\n29#7:2683\n13674#8,3:2687\n*S KotlinDebug\n*F\n+ 1 NavController.kt\nandroidx/navigation/NavController\n*L\n77#1:2573,2\n663#1:2583,2\n682#1:2585,2\n2480#1:2704,2\n161#1:2576\n605#1:2577,6\n805#1:2587,2\n810#1:2589,2\n818#1:2591,2\n822#1:2593,2\n904#1:2595,3\n964#1:2598,4\n1098#1:2602\n1099#1:2603\n1099#1:2604,2\n1098#1:2606\n1106#1:2607\n1106#1:2608,2\n1110#1:2610\n1110#1:2611,2\n1179#1:2613,2\n1195#1:2615\n1198#1:2616,3\n1195#1:2619\n1262#1:2627\n1262#1:2628,2\n1262#1:2630\n1262#1:2638\n1808#1:2639,2\n1846#1:2641,2\n1866#1:2643,7\n1879#1:2650,2\n1889#1:2652,2\n1957#1:2654\n1957#1:2655,2\n1960#1:2657,2\n2002#1:2659,2\n2044#1:2661,6\n2069#1:2667,6\n2096#1:2673,6\n2106#1:2679,2\n2122#1:2681,2\n2267#1:2684,3\n2310#1:2690,2\n2415#1:2692,6\n2437#1:2698,6\n1248#1:2620,7\n1263#1:2631,7\n2194#1:2683\n2305#1:2687,3\n*E\n"})
public class OooO0O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public final StateFlow<List<NavBackStackEntry>> f9938OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Context f9939OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final Activity f9940OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public androidx.navigation.OooO f9941OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public Bundle f9942OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f9943OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public Parcelable[] f9944OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final ArrayDeque<NavBackStackEntry> f9945OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<List<NavBackStackEntry>> f9946OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<List<NavBackStackEntry>> f9947OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final StateFlow<List<NavBackStackEntry>> f9948OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f9949OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f9950OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f9951OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f9952OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @Nullable
    public LifecycleOwner f9953OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public final CopyOnWriteArrayList<InterfaceC0164OooO0O0> f9954OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public o000O0 f9955OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public Lifecycle.State f9956OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f9957OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public final OooOO0 f9958OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final o000OO f9959OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final boolean f9960OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @NotNull
    public final OooOOOO f9961OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @Nullable
    public Function1<? super NavBackStackEntry, Unit> f9962OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @Nullable
    public Function1<? super NavBackStackEntry, Unit> f9963OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f9964OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @NotNull
    public final ArrayList f9965OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f9966OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    @NotNull
    public final Lazy f9967OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<NavBackStackEntry> f9968OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    @NotNull
    public final SharedFlow f9969Oooo000;

    public static final class OooO extends Lambda implements Function1<NavBackStackEntry, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Ref.BooleanRef f9970OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ NavDestination f9971OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ OooO0O0 f9972OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Bundle f9973OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(Ref.BooleanRef booleanRef, OooO0O0 oooO0O0, NavDestination navDestination, Bundle bundle) {
            super(1);
            this.f9970OooO0Oo = booleanRef;
            this.f9972OooO0o0 = oooO0O0;
            this.f9971OooO0o = navDestination;
            this.f9973OooO0oO = bundle;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(NavBackStackEntry navBackStackEntry) {
            NavBackStackEntry it = navBackStackEntry;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f9970OooO0Oo.element = true;
            List<NavBackStackEntry> listEmptyList = CollectionsKt.emptyList();
            this.f9972OooO0o0.OooO00o(this.f9971OooO0o, this.f9973OooO0oO, it, listEmptyList);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nNavController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavController.kt\nandroidx/navigation/NavController$NavControllerNavigatorState\n+ 2 NavigatorProvider.kt\nandroidx/navigation/NavigatorProviderKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2572:1\n150#2:2573\n150#2:2574\n2624#3,3:2575\n*S KotlinDebug\n*F\n+ 1 NavController.kt\nandroidx/navigation/NavController$NavControllerNavigatorState\n*L\n288#1:2573\n325#1:2574\n357#1:2575,3\n*E\n"})
    public final class OooO00o extends o00O0O00 {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @NotNull
        public final Navigator<? extends NavDestination> f9974OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ OooO0O0 f9975OooO0oo;

        /* JADX INFO: renamed from: androidx.navigation.OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0163OooO00o extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ boolean f9977OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ NavBackStackEntry f9978OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0163OooO00o(NavBackStackEntry navBackStackEntry, boolean z) {
                super(0);
                this.f9978OooO0o0 = navBackStackEntry;
                this.f9977OooO0o = z;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                OooO00o.super.OooO0OO(this.f9978OooO0o0, this.f9977OooO0o);
                return Unit.INSTANCE;
            }
        }

        public OooO00o(@NotNull OooO0O0 oooO0O0, Navigator<? extends NavDestination> navigator) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            this.f9975OooO0oo = oooO0O0;
            this.f9974OooO0oO = navigator;
        }

        @Override // p105o000oo0o.o00O0O00
        @NotNull
        public final NavBackStackEntry OooO00o(@NotNull NavDestination destination, @Nullable Bundle bundle) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            NavBackStackEntry.Companion companion = NavBackStackEntry.INSTANCE;
            OooO0O0 oooO0O0 = this.f9975OooO0oo;
            return NavBackStackEntry.Companion.OooO0O0(companion, oooO0O0.f9939OooO00o, destination, bundle, oooO0O0.OooO0oO(), oooO0O0.f9955OooOOo0);
        }

        @Override // p105o000oo0o.o00O0O00
        public final void OooO0O0(@NotNull NavBackStackEntry entry) {
            boolean z;
            o000O0 o000o0;
            Intrinsics.checkNotNullParameter(entry, "entry");
            OooO0O0 oooO0O0 = this.f9975OooO0oo;
            boolean zAreEqual = Intrinsics.areEqual(oooO0O0.f9964OooOoOO.get(entry), Boolean.TRUE);
            super.OooO0O0(entry);
            oooO0O0.f9964OooOoOO.remove(entry);
            ArrayDeque<NavBackStackEntry> arrayDeque = oooO0O0.f9945OooO0oO;
            boolean zContains = arrayDeque.contains(entry);
            MutableStateFlow<List<NavBackStackEntry>> mutableStateFlow = oooO0O0.f9947OooOO0;
            if (zContains) {
                if (this.f35766OooO0Oo) {
                    return;
                }
                oooO0O0.OooOOoo();
                oooO0O0.f9946OooO0oo.tryEmit(CollectionsKt.toMutableList((Collection) arrayDeque));
                mutableStateFlow.tryEmit(oooO0O0.OooOOOo());
                return;
            }
            oooO0O0.OooOOo(entry);
            if (entry.getLifecycle().getState().isAtLeast(Lifecycle.State.CREATED)) {
                entry.setMaxLifecycle(Lifecycle.State.DESTROYED);
            }
            if (!(arrayDeque instanceof Collection) || !arrayDeque.isEmpty()) {
                Iterator<NavBackStackEntry> it = arrayDeque.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = true;
                        break;
                    } else if (Intrinsics.areEqual(it.next().getId(), entry.getId())) {
                        z = false;
                        break;
                    }
                }
            } else {
                z = true;
                break;
            }
            if (z && !zAreEqual && (o000o0 = oooO0O0.f9955OooOOo0) != null) {
                String backStackEntryId = entry.getId();
                Intrinsics.checkNotNullParameter(backStackEntryId, "backStackEntryId");
                ViewModelStore viewModelStore = (ViewModelStore) o000o0.f35717OooO00o.remove(backStackEntryId);
                if (viewModelStore != null) {
                    viewModelStore.clear();
                }
            }
            oooO0O0.OooOOoo();
            mutableStateFlow.tryEmit(oooO0O0.OooOOOo());
        }

        @Override // p105o000oo0o.o00O0O00
        public final void OooO0OO(@NotNull NavBackStackEntry popUpTo, boolean z) {
            Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
            OooO0O0 oooO0O0 = this.f9975OooO0oo;
            Navigator navigatorOooO0O0 = oooO0O0.f9961OooOo0o.OooO0O0(popUpTo.getDestination().f9910OooO0Oo);
            if (!Intrinsics.areEqual(navigatorOooO0O0, this.f9974OooO0oO)) {
                Object obj = oooO0O0.f9957OooOo.get(navigatorOooO0O0);
                Intrinsics.checkNotNull(obj);
                ((OooO00o) obj).OooO0OO(popUpTo, z);
                return;
            }
            Function1<? super NavBackStackEntry, Unit> function1 = oooO0O0.f9962OooOoO;
            if (function1 != null) {
                function1.invoke(popUpTo);
                super.OooO0OO(popUpTo, z);
                return;
            }
            C0163OooO00o onComplete = new C0163OooO00o(popUpTo, z);
            Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
            Intrinsics.checkNotNullParameter(onComplete, "onComplete");
            ArrayDeque<NavBackStackEntry> arrayDeque = oooO0O0.f9945OooO0oO;
            int iIndexOf = arrayDeque.indexOf(popUpTo);
            if (iIndexOf < 0) {
                Log.i("NavController", "Ignoring pop of " + popUpTo + " as it was not found on the current back stack");
                return;
            }
            int i = iIndexOf + 1;
            if (i != arrayDeque.size()) {
                oooO0O0.OooOOO0(arrayDeque.get(i).getDestination().f9915OooOO0, true, false);
            }
            OooO0O0.OooOOOO(oooO0O0, popUpTo);
            onComplete.invoke();
            oooO0O0.OooOo00();
            oooO0O0.OooO0O0();
        }

        @Override // p105o000oo0o.o00O0O00
        public final void OooO0Oo(@NotNull NavBackStackEntry popUpTo, boolean z) {
            Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
            super.OooO0Oo(popUpTo, z);
            this.f9975OooO0oo.f9964OooOoOO.put(popUpTo, Boolean.valueOf(z));
        }

        @Override // p105o000oo0o.o00O0O00
        public final void OooO0o0(@NotNull NavBackStackEntry backStackEntry) {
            Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
            OooO0O0 oooO0O0 = this.f9975OooO0oo;
            Navigator navigatorOooO0O0 = oooO0O0.f9961OooOo0o.OooO0O0(backStackEntry.getDestination().f9910OooO0Oo);
            if (!Intrinsics.areEqual(navigatorOooO0O0, this.f9974OooO0oO)) {
                Object obj = oooO0O0.f9957OooOo.get(navigatorOooO0O0);
                if (obj == null) {
                    throw new IllegalStateException(o0oOO.OooO0O0(new StringBuilder("NavigatorBackStack for "), backStackEntry.getDestination().f9910OooO0Oo, " should already be created").toString());
                }
                ((OooO00o) obj).OooO0o0(backStackEntry);
                return;
            }
            Function1<? super NavBackStackEntry, Unit> function1 = oooO0O0.f9963OooOoO0;
            if (function1 != null) {
                function1.invoke(backStackEntry);
                Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
                super.OooO0o0(backStackEntry);
            } else {
                Log.i("NavController", "Ignoring add of destination " + backStackEntry.getDestination() + " outside of the call to navigate(). ");
            }
        }

        public final void OooO0oO(@NotNull NavBackStackEntry backStackEntry) {
            Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
            super.OooO0o0(backStackEntry);
        }
    }

    /* JADX INFO: renamed from: androidx.navigation.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public interface InterfaceC0164OooO0O0 {
        void OooO00o();
    }

    public static final class OooO0OO extends Lambda implements Function1<Context, Context> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f9979OooO0Oo = new OooO0OO();

        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Context invoke(Context context) {
            Context it = context;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it instanceof ContextWrapper) {
                return ((ContextWrapper) it).getBaseContext();
            }
            return null;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<androidx.navigation.OooOO0O> {
        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final androidx.navigation.OooOO0O invoke() {
            OooO0O0 oooO0O0 = OooO0O0.this;
            oooO0O0.getClass();
            return new androidx.navigation.OooOO0O(oooO0O0.f9939OooO00o, oooO0O0.f9961OooOo0o);
        }
    }

    public static final class OooOO0 extends o000oOoO {
        public OooOO0() {
            super(false);
        }

        @Override // androidx.activity.o000oOoO
        public final void OooO00o() {
            OooO0O0.this.OooOO0O();
        }
    }

    public static final class OooOO0O extends Lambda implements Function1<String, Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ String f9982OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(String str) {
            super(1);
            this.f9982OooO0Oo = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(String str) {
            return Boolean.valueOf(Intrinsics.areEqual(str, this.f9982OooO0Oo));
        }
    }

    /* JADX WARN: Type inference failed for: r5v16, types: [o000oo0o.o000OO] */
    public OooO0O0(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f9939OooO00o = context;
        for (Object obj : SequencesKt.generateSequence(context, OooO0OO.f9979OooO0Oo)) {
            if (((Context) obj) instanceof Activity) {
                this.f9940OooO0O0 = (Activity) obj;
                this.f9945OooO0oO = new ArrayDeque<>();
                MutableStateFlow<List<NavBackStackEntry>> MutableStateFlow = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
                this.f9946OooO0oo = MutableStateFlow;
                this.f9938OooO = FlowKt.asStateFlow(MutableStateFlow);
                MutableStateFlow<List<NavBackStackEntry>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
                this.f9947OooOO0 = MutableStateFlow2;
                this.f9948OooOO0O = FlowKt.asStateFlow(MutableStateFlow2);
                this.f9949OooOO0o = new LinkedHashMap();
                this.f9951OooOOO0 = new LinkedHashMap();
                this.f9950OooOOO = new LinkedHashMap();
                this.f9952OooOOOO = new LinkedHashMap();
                this.f9954OooOOo = new CopyOnWriteArrayList<>();
                this.f9956OooOOoo = Lifecycle.State.INITIALIZED;
                this.f9959OooOo00 = new LifecycleEventObserver() { // from class: o000oo0o.o000OO
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                        OooO0O0 this$0 = this.f35744OooO0Oo;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(lifecycleOwner, "<anonymous parameter 0>");
                        Intrinsics.checkNotNullParameter(event, "event");
                        this$0.f9956OooOOoo = event.getTargetState();
                        if (this$0.f9941OooO0OO != null) {
                            Iterator<NavBackStackEntry> it = this$0.f9945OooO0oO.iterator();
                            while (it.hasNext()) {
                                it.next().handleLifecycleEvent(event);
                            }
                        }
                    }
                };
                this.f9958OooOo0 = new OooOO0();
                this.f9960OooOo0O = true;
                OooOOOO oooOOOO = new OooOOOO();
                this.f9961OooOo0o = oooOOOO;
                this.f9957OooOo = new LinkedHashMap();
                this.f9964OooOoOO = new LinkedHashMap();
                oooOOOO.OooO00o(new androidx.navigation.OooOO0(oooOOOO));
                oooOOOO.OooO00o(new androidx.navigation.OooO00o(this.f9939OooO00o));
                this.f9965OooOoo = new ArrayList();
                this.f9967OooOooO = LazyKt.lazy(new OooO0o());
                MutableSharedFlow<NavBackStackEntry> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 0, BufferOverflow.DROP_OLDEST, 2, null);
                this.f9968OooOooo = mutableSharedFlowMutableSharedFlow$default;
                this.f9969Oooo000 = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
            }
        }
        obj = null;
        this.f9940OooO0O0 = (Activity) obj;
        this.f9945OooO0oO = new ArrayDeque<>();
        MutableStateFlow<List<NavBackStackEntry>> MutableStateFlow3 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this.f9946OooO0oo = MutableStateFlow3;
        this.f9938OooO = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<List<NavBackStackEntry>> MutableStateFlow4 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this.f9947OooOO0 = MutableStateFlow4;
        this.f9948OooOO0O = FlowKt.asStateFlow(MutableStateFlow4);
        this.f9949OooOO0o = new LinkedHashMap();
        this.f9951OooOOO0 = new LinkedHashMap();
        this.f9950OooOOO = new LinkedHashMap();
        this.f9952OooOOOO = new LinkedHashMap();
        this.f9954OooOOo = new CopyOnWriteArrayList<>();
        this.f9956OooOOoo = Lifecycle.State.INITIALIZED;
        this.f9959OooOo00 = new LifecycleEventObserver() { // from class: o000oo0o.o000OO
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                OooO0O0 this$0 = this.f35744OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(lifecycleOwner, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(event, "event");
                this$0.f9956OooOOoo = event.getTargetState();
                if (this$0.f9941OooO0OO != null) {
                    Iterator<NavBackStackEntry> it = this$0.f9945OooO0oO.iterator();
                    while (it.hasNext()) {
                        it.next().handleLifecycleEvent(event);
                    }
                }
            }
        };
        this.f9958OooOo0 = new OooOO0();
        this.f9960OooOo0O = true;
        OooOOOO oooOOOO2 = new OooOOOO();
        this.f9961OooOo0o = oooOOOO2;
        this.f9957OooOo = new LinkedHashMap();
        this.f9964OooOoOO = new LinkedHashMap();
        oooOOOO2.OooO00o(new androidx.navigation.OooOO0(oooOOOO2));
        oooOOOO2.OooO00o(new androidx.navigation.OooO00o(this.f9939OooO00o));
        this.f9965OooOoo = new ArrayList();
        this.f9967OooOooO = LazyKt.lazy(new OooO0o());
        MutableSharedFlow<NavBackStackEntry> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(1, 0, BufferOverflow.DROP_OLDEST, 2, null);
        this.f9968OooOooo = mutableSharedFlowMutableSharedFlow$default2;
        this.f9969Oooo000 = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
    }

    public static boolean OooOO0o(o00O00OO o00o00oo2, String route, boolean z) {
        boolean zOooO0OO;
        NavBackStackEntry navBackStackEntryPrevious;
        boolean z2;
        Intrinsics.checkNotNullParameter(route, "route");
        ArrayDeque<NavBackStackEntry> arrayDeque = o00o00oo2.f9945OooO0oO;
        if (arrayDeque.isEmpty()) {
            zOooO0OO = false;
        } else {
            ArrayList arrayList = new ArrayList();
            ListIterator<NavBackStackEntry> listIterator = arrayDeque.listIterator(arrayDeque.size());
            do {
                if (!listIterator.hasPrevious()) {
                    navBackStackEntryPrevious = null;
                    break;
                }
                navBackStackEntryPrevious = listIterator.previous();
                NavBackStackEntry navBackStackEntry = navBackStackEntryPrevious;
                NavDestination destination = navBackStackEntry.getDestination();
                Bundle arguments = navBackStackEntry.getArguments();
                destination.getClass();
                Intrinsics.checkNotNullParameter(route, "route");
                if (Intrinsics.areEqual(destination.f9916OooOO0O, route)) {
                    z2 = true;
                } else {
                    NavDestination.OooO0O0 oooO0O0OooO0Oo = destination.OooO0Oo(route);
                    if (Intrinsics.areEqual(destination, oooO0O0OooO0Oo != null ? oooO0O0OooO0Oo.f9919OooO0Oo : null)) {
                        if (arguments != null) {
                            Bundle bundle = oooO0O0OooO0Oo.f9921OooO0o0;
                            if (bundle != null) {
                                Set<String> setKeySet = bundle.keySet();
                                Intrinsics.checkNotNullExpressionValue(setKeySet, "matchingArgs.keySet()");
                                Iterator<T> it = setKeySet.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        String str = (String) it.next();
                                        if (arguments.containsKey(str)) {
                                            oooO0O0OooO0Oo.f9919OooO0Oo.OooO0OO().get(str);
                                            if (!Intrinsics.areEqual((Object) null, (Object) null)) {
                                            }
                                        }
                                    } else {
                                        z2 = true;
                                    }
                                }
                            }
                        } else {
                            oooO0O0OooO0Oo.getClass();
                        }
                    }
                    z2 = false;
                }
                if (z || !z2) {
                    arrayList.add(o00o00oo2.f9961OooOo0o.OooO0O0(navBackStackEntry.getDestination().f9910OooO0Oo));
                }
            } while (!z2);
            NavBackStackEntry navBackStackEntry2 = navBackStackEntryPrevious;
            NavDestination destination2 = navBackStackEntry2 != null ? navBackStackEntry2.getDestination() : null;
            if (destination2 == null) {
                Log.i("NavController", "Ignoring popBackStack to route " + route + " as it was not found on the current back stack");
                zOooO0OO = false;
            } else {
                zOooO0OO = o00o00oo2.OooO0OO(arrayList, destination2, z, false);
            }
        }
        return zOooO0OO && o00o00oo2.OooO0O0();
    }

    public static /* synthetic */ void OooOOOO(OooO0O0 oooO0O0, NavBackStackEntry navBackStackEntry) {
        oooO0O0.OooOOO(navBackStackEntry, false, new ArrayDeque<>());
    }

    public final void OooO(NavBackStackEntry navBackStackEntry, NavBackStackEntry navBackStackEntry2) {
        this.f9949OooOO0o.put(navBackStackEntry, navBackStackEntry2);
        LinkedHashMap linkedHashMap = this.f9951OooOOO0;
        if (linkedHashMap.get(navBackStackEntry2) == null) {
            linkedHashMap.put(navBackStackEntry2, new AtomicInteger(0));
        }
        Object obj = linkedHashMap.get(navBackStackEntry2);
        Intrinsics.checkNotNull(obj);
        ((AtomicInteger) obj).incrementAndGet();
    }

    public final void OooO00o(NavDestination navDestination, Bundle bundle, NavBackStackEntry navBackStackEntry, List<NavBackStackEntry> list) {
        NavBackStackEntry navBackStackEntry2;
        NavBackStackEntry navBackStackEntryPrevious;
        NavBackStackEntry navBackStackEntryPrevious2;
        NavDestination destination = navBackStackEntry.getDestination();
        boolean z = destination instanceof o0000;
        ArrayDeque<NavBackStackEntry> arrayDeque = this.f9945OooO0oO;
        if (!z) {
            while (!arrayDeque.isEmpty() && (arrayDeque.last().getDestination() instanceof o0000) && OooOOO0(arrayDeque.last().getDestination().f9915OooOO0, true, false)) {
            }
        }
        ArrayDeque<NavBackStackEntry> arrayDeque2 = new ArrayDeque();
        if (navDestination instanceof androidx.navigation.OooO) {
            NavDestination navDestination2 = destination;
            while (true) {
                Intrinsics.checkNotNull(navDestination2);
                androidx.navigation.OooO oooO = navDestination2.f9912OooO0o0;
                if (oooO != null) {
                    ListIterator<NavBackStackEntry> listIterator = list.listIterator(list.size());
                    do {
                        if (!listIterator.hasPrevious()) {
                            navBackStackEntryPrevious2 = null;
                            break;
                        }
                        navBackStackEntryPrevious2 = listIterator.previous();
                    } while (!Intrinsics.areEqual(navBackStackEntryPrevious2.getDestination(), oooO));
                    NavBackStackEntry navBackStackEntryOooO0O0 = navBackStackEntryPrevious2;
                    if (navBackStackEntryOooO0O0 == null) {
                        navBackStackEntryOooO0O0 = NavBackStackEntry.Companion.OooO0O0(NavBackStackEntry.INSTANCE, this.f9939OooO00o, oooO, bundle, OooO0oO(), this.f9955OooOOo0);
                    }
                    arrayDeque2.addFirst(navBackStackEntryOooO0O0);
                    if ((!arrayDeque.isEmpty()) && arrayDeque.last().getDestination() == oooO) {
                        OooOOOO(this, arrayDeque.last());
                    }
                } else {
                    oooO = oooO;
                }
                if (oooO == null || oooO == navDestination) {
                    break;
                } else {
                    navDestination2 = oooO;
                }
            }
        }
        NavDestination destination2 = arrayDeque2.isEmpty() ? destination : ((NavBackStackEntry) arrayDeque2.first()).getDestination();
        while (destination2 != null && OooO0Oo(destination2.f9915OooOO0) != destination2) {
            destination2 = destination2.f9912OooO0o0;
            if (destination2 != null) {
                Bundle bundle2 = bundle != null && bundle.isEmpty() ? null : bundle;
                ListIterator<NavBackStackEntry> listIterator2 = list.listIterator(list.size());
                do {
                    if (!listIterator2.hasPrevious()) {
                        navBackStackEntryPrevious = null;
                        break;
                    }
                    navBackStackEntryPrevious = listIterator2.previous();
                } while (!Intrinsics.areEqual(navBackStackEntryPrevious.getDestination(), destination2));
                NavBackStackEntry navBackStackEntryOooO0O1 = navBackStackEntryPrevious;
                if (navBackStackEntryOooO0O1 == null) {
                    navBackStackEntryOooO0O1 = NavBackStackEntry.Companion.OooO0O0(NavBackStackEntry.INSTANCE, this.f9939OooO00o, destination2, destination2.OooO0O0(bundle2), OooO0oO(), this.f9955OooOOo0);
                }
                arrayDeque2.addFirst(navBackStackEntryOooO0O1);
            }
        }
        if (!arrayDeque2.isEmpty()) {
            destination = ((NavBackStackEntry) arrayDeque2.first()).getDestination();
        }
        while (!arrayDeque.isEmpty() && (arrayDeque.last().getDestination() instanceof androidx.navigation.OooO)) {
            NavDestination destination3 = arrayDeque.last().getDestination();
            Intrinsics.checkNotNull(destination3, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            if (((androidx.navigation.OooO) destination3).OooO0oo(destination.f9915OooOO0, false) != null) {
                break;
            } else {
                OooOOOO(this, arrayDeque.last());
            }
        }
        NavBackStackEntry navBackStackEntryFirstOrNull = arrayDeque.firstOrNull();
        if (navBackStackEntryFirstOrNull == null) {
            navBackStackEntryFirstOrNull = (NavBackStackEntry) arrayDeque2.firstOrNull();
        }
        if (!Intrinsics.areEqual(navBackStackEntryFirstOrNull != null ? navBackStackEntryFirstOrNull.getDestination() : null, this.f9941OooO0OO)) {
            ListIterator<NavBackStackEntry> listIterator3 = list.listIterator(list.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    navBackStackEntry2 = null;
                    break;
                }
                NavBackStackEntry navBackStackEntryPrevious3 = listIterator3.previous();
                NavDestination destination4 = navBackStackEntryPrevious3.getDestination();
                androidx.navigation.OooO oooO2 = this.f9941OooO0OO;
                Intrinsics.checkNotNull(oooO2);
                if (Intrinsics.areEqual(destination4, oooO2)) {
                    navBackStackEntry2 = navBackStackEntryPrevious3;
                    break;
                }
            }
            NavBackStackEntry navBackStackEntryOooO0O2 = navBackStackEntry2;
            if (navBackStackEntryOooO0O2 == null) {
                NavBackStackEntry.Companion companion = NavBackStackEntry.INSTANCE;
                Context context = this.f9939OooO00o;
                androidx.navigation.OooO oooO3 = this.f9941OooO0OO;
                Intrinsics.checkNotNull(oooO3);
                androidx.navigation.OooO oooO4 = this.f9941OooO0OO;
                Intrinsics.checkNotNull(oooO4);
                navBackStackEntryOooO0O2 = NavBackStackEntry.Companion.OooO0O0(companion, context, oooO3, oooO4.OooO0O0(bundle), OooO0oO(), this.f9955OooOOo0);
            }
            arrayDeque2.addFirst(navBackStackEntryOooO0O2);
        }
        for (NavBackStackEntry navBackStackEntry3 : arrayDeque2) {
            Object obj = this.f9957OooOo.get(this.f9961OooOo0o.OooO0O0(navBackStackEntry3.getDestination().f9910OooO0Oo));
            if (obj == null) {
                throw new IllegalStateException(o0oOO.OooO0O0(new StringBuilder("NavigatorBackStack for "), navDestination.f9910OooO0Oo, " should already be created").toString());
            }
            ((OooO00o) obj).OooO0oO(navBackStackEntry3);
        }
        arrayDeque.addAll(arrayDeque2);
        arrayDeque.add(navBackStackEntry);
        for (NavBackStackEntry navBackStackEntry4 : CollectionsKt.plus((Collection<? extends NavBackStackEntry>) arrayDeque2, navBackStackEntry)) {
            androidx.navigation.OooO oooO5 = navBackStackEntry4.getDestination().f9912OooO0o0;
            if (oooO5 != null) {
                OooO(navBackStackEntry4, OooO0o0(oooO5.f9915OooOO0));
            }
        }
    }

    public final boolean OooO0O0() {
        ArrayDeque<NavBackStackEntry> arrayDeque;
        while (true) {
            arrayDeque = this.f9945OooO0oO;
            if (arrayDeque.isEmpty() || !(arrayDeque.last().getDestination() instanceof androidx.navigation.OooO)) {
                break;
            }
            OooOOOO(this, arrayDeque.last());
        }
        NavBackStackEntry navBackStackEntryLastOrNull = arrayDeque.lastOrNull();
        ArrayList arrayList = this.f9965OooOoo;
        if (navBackStackEntryLastOrNull != null) {
            arrayList.add(navBackStackEntryLastOrNull);
        }
        this.f9966OooOoo0++;
        OooOOoo();
        int i = this.f9966OooOoo0 - 1;
        this.f9966OooOoo0 = i;
        if (i == 0) {
            List<NavBackStackEntry> mutableList = CollectionsKt.toMutableList((Collection) arrayList);
            arrayList.clear();
            for (NavBackStackEntry navBackStackEntry : mutableList) {
                for (InterfaceC0164OooO0O0 interfaceC0164OooO0O0 : this.f9954OooOOo) {
                    navBackStackEntry.getDestination();
                    navBackStackEntry.getArguments();
                    interfaceC0164OooO0O0.OooO00o();
                }
                this.f9968OooOooo.tryEmit(navBackStackEntry);
            }
            this.f9946OooO0oo.tryEmit(CollectionsKt.toMutableList((Collection) arrayDeque));
            this.f9947OooOO0.tryEmit(OooOOOo());
        }
        return navBackStackEntryLastOrNull != null;
    }

    public final boolean OooO0OO(ArrayList arrayList, NavDestination navDestination, boolean z, boolean z2) {
        String str;
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        ArrayDeque arrayDeque = new ArrayDeque();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Navigator navigator = (Navigator) it.next();
            Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
            NavBackStackEntry navBackStackEntryLast = this.f9945OooO0oO.last();
            this.f9962OooOoO = new o0000OO0(booleanRef2, booleanRef, this, z2, arrayDeque);
            navigator.OooO0o0(navBackStackEntryLast, z2);
            this.f9962OooOoO = null;
            if (!booleanRef2.element) {
                break;
            }
        }
        if (z2) {
            LinkedHashMap linkedHashMap = this.f9950OooOOO;
            if (!z) {
                Iterator it2 = SequencesKt.takeWhile(SequencesKt.generateSequence(navDestination, o000.f35704OooO0Oo), new o000O000(this)).iterator();
                while (it2.hasNext()) {
                    Integer numValueOf = Integer.valueOf(((NavDestination) it2.next()).f9915OooOO0);
                    NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) arrayDeque.firstOrNull();
                    linkedHashMap.put(numValueOf, navBackStackEntryState != null ? navBackStackEntryState.f9904OooO0Oo : null);
                }
            }
            if (!arrayDeque.isEmpty()) {
                NavBackStackEntryState navBackStackEntryState2 = (NavBackStackEntryState) arrayDeque.first();
                Iterator it3 = SequencesKt.takeWhile(SequencesKt.generateSequence(OooO0Oo(navBackStackEntryState2.f9906OooO0o0), o000O0o.f35743OooO0Oo), new o000Oo0(this)).iterator();
                while (true) {
                    boolean zHasNext = it3.hasNext();
                    str = navBackStackEntryState2.f9904OooO0Oo;
                    if (!zHasNext) {
                        break;
                    }
                    linkedHashMap.put(Integer.valueOf(((NavDestination) it3.next()).f9915OooOO0), str);
                }
                this.f9952OooOOOO.put(str, arrayDeque);
            }
        }
        OooOo00();
        return booleanRef.element;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Nullable
    public final NavDestination OooO0Oo(@IdRes int i) {
        NavDestination destination;
        androidx.navigation.OooO oooO;
        androidx.navigation.OooO oooO2 = this.f9941OooO0OO;
        if (oooO2 == null) {
            return null;
        }
        Intrinsics.checkNotNull(oooO2);
        if (oooO2.f9915OooOO0 == i) {
            return this.f9941OooO0OO;
        }
        NavBackStackEntry navBackStackEntryLastOrNull = this.f9945OooO0oO.lastOrNull();
        if (navBackStackEntryLastOrNull == null || (destination = navBackStackEntryLastOrNull.getDestination()) == null) {
            destination = this.f9941OooO0OO;
            Intrinsics.checkNotNull(destination);
        }
        if (destination.f9915OooOO0 == i) {
            return destination;
        }
        if (destination instanceof androidx.navigation.OooO) {
            oooO = (androidx.navigation.OooO) destination;
        } else {
            oooO = destination.f9912OooO0o0;
            Intrinsics.checkNotNull(oooO);
        }
        return oooO.OooO0oo(i, true);
    }

    @Nullable
    public final NavDestination OooO0o() {
        NavBackStackEntry navBackStackEntryLastOrNull = this.f9945OooO0oO.lastOrNull();
        if (navBackStackEntryLastOrNull != null) {
            return navBackStackEntryLastOrNull.getDestination();
        }
        return null;
    }

    @NotNull
    public final NavBackStackEntry OooO0o0(@IdRes int i) {
        NavBackStackEntry navBackStackEntryPrevious;
        ArrayDeque<NavBackStackEntry> arrayDeque = this.f9945OooO0oO;
        ListIterator<NavBackStackEntry> listIterator = arrayDeque.listIterator(arrayDeque.size());
        do {
            if (!listIterator.hasPrevious()) {
                navBackStackEntryPrevious = null;
                break;
            }
            navBackStackEntryPrevious = listIterator.previous();
        } while (!(navBackStackEntryPrevious.getDestination().f9915OooOO0 == i));
        NavBackStackEntry navBackStackEntry = navBackStackEntryPrevious;
        if (navBackStackEntry != null) {
            return navBackStackEntry;
        }
        StringBuilder sbOooO0O0 = o0000O0.OooO0O0("No destination with ID ", i, " is on the NavController's back stack. The current destination is ");
        sbOooO0O0.append(OooO0o());
        throw new IllegalArgumentException(sbOooO0O0.toString().toString());
    }

    @NotNull
    public final Lifecycle.State OooO0oO() {
        return this.f9953OooOOOo == null ? Lifecycle.State.CREATED : this.f9956OooOOoo;
    }

    @Nullable
    public final NavBackStackEntry OooO0oo() {
        Object next;
        Iterator it = CollectionsKt.reversed(this.f9945OooO0oO).iterator();
        if (it.hasNext()) {
            it.next();
        }
        Iterator it2 = SequencesKt.asSequence(it).iterator();
        while (it2.hasNext()) {
            next = it2.next();
            if (!(((NavBackStackEntry) next).getDestination() instanceof androidx.navigation.OooO)) {
                return (NavBackStackEntry) next;
            }
        }
        next = null;
        return (NavBackStackEntry) next;
    }

    /* JADX WARN: Code duplicated, block: B:88:0x01bb  */
    @MainThread
    public final void OooOO0(NavDestination navDestination, Bundle bundle, OooOOO0 oooOOO0, Navigator.OooO00o oooO00o) {
        boolean z;
        int i;
        int iNextIndex;
        boolean z2;
        Iterator it;
        int iNextIndex2;
        NavDestination destination;
        int i2;
        LinkedHashMap linkedHashMap = this.f9957OooOo;
        Iterator it2 = linkedHashMap.values().iterator();
        while (it2.hasNext()) {
            ((OooO00o) it2.next()).f35766OooO0Oo = true;
        }
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        boolean zOooOOO0 = (oooOOO0 == null || (i2 = oooOOO0.f9999OooO0OO) == -1) ? false : OooOOO0(i2, oooOOO0.f10000OooO0Oo, oooOOO0.f10002OooO0o0);
        Bundle bundleOooO0O0 = navDestination.OooO0O0(bundle);
        if ((oooOOO0 != null && oooOOO0.f9998OooO0O0) && this.f9950OooOOO.containsKey(Integer.valueOf(navDestination.f9915OooOO0))) {
            booleanRef.element = OooOOo0(navDestination.f9915OooOO0, bundleOooO0O0, oooOOO0, oooO00o);
            z = false;
        } else {
            boolean z3 = oooOOO0 != null && oooOOO0.f9997OooO00o;
            OooOOOO oooOOOO = this.f9961OooOo0o;
            if (z3) {
                ArrayDeque<NavBackStackEntry> arrayDeque = this.f9945OooO0oO;
                NavBackStackEntry navBackStackEntryLastOrNull = arrayDeque.lastOrNull();
                if (navDestination instanceof androidx.navigation.OooO) {
                    int i3 = androidx.navigation.OooO.f9928OooOOo0;
                    androidx.navigation.OooO oooO = (androidx.navigation.OooO) navDestination;
                    Intrinsics.checkNotNullParameter(oooO, "<this>");
                    i = ((NavDestination) SequencesKt.last(SequencesKt.generateSequence(oooO.OooO0oo(oooO.f9929OooOOO, true), o00O00O.f35761OooO0Oo))).f9915OooOO0;
                } else {
                    i = navDestination.f9915OooOO0;
                }
                if ((navBackStackEntryLastOrNull == null || (destination = navBackStackEntryLastOrNull.getDestination()) == null || i != destination.f9915OooOO0) ? false : true) {
                    ArrayDeque<NavBackStackEntry> arrayDeque2 = new ArrayDeque();
                    ListIterator<NavBackStackEntry> listIterator = arrayDeque.listIterator(arrayDeque.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            if (listIterator.previous().getDestination() == navDestination) {
                                iNextIndex = listIterator.nextIndex();
                                break;
                            }
                        } else {
                            iNextIndex = -1;
                            break;
                        }
                    }
                    while (CollectionsKt.getLastIndex(arrayDeque) >= iNextIndex) {
                        NavBackStackEntry navBackStackEntryRemoveLast = arrayDeque.removeLast();
                        OooOOo(navBackStackEntryRemoveLast);
                        arrayDeque2.addFirst(new NavBackStackEntry(navBackStackEntryRemoveLast, navBackStackEntryRemoveLast.getDestination().OooO0O0(bundle)));
                    }
                    for (NavBackStackEntry navBackStackEntry : arrayDeque2) {
                        androidx.navigation.OooO oooO2 = navBackStackEntry.getDestination().f9912OooO0o0;
                        if (oooO2 != null) {
                            OooO(navBackStackEntry, OooO0o0(oooO2.f9915OooOO0));
                        }
                        arrayDeque.add(navBackStackEntry);
                    }
                    Iterator it3 = arrayDeque2.iterator();
                    while (it3.hasNext()) {
                        NavBackStackEntry backStackEntry = (NavBackStackEntry) it3.next();
                        Navigator navigatorOooO0O0 = oooOOOO.OooO0O0(backStackEntry.getDestination().f9910OooO0Oo);
                        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
                        NavDestination destination2 = backStackEntry.getDestination();
                        if (!(destination2 instanceof NavDestination)) {
                            destination2 = null;
                        }
                        if (destination2 != null) {
                            o00O00o0.OooO00o(o00O0.f35749OooO0Oo);
                            navigatorOooO0O0.OooO0OO(destination2);
                            o00O0O00 o00o0o00OooO0O0 = navigatorOooO0O0.OooO0O0();
                            Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
                            ReentrantLock reentrantLock = o00o0o00OooO0O0.f35763OooO00o;
                            reentrantLock.lock();
                            try {
                                List<NavBackStackEntry> mutableList = CollectionsKt.toMutableList((Collection) o00o0o00OooO0O0.f35768OooO0o0.getValue());
                                ListIterator<NavBackStackEntry> listIterator2 = mutableList.listIterator(mutableList.size());
                                while (true) {
                                    if (!listIterator2.hasPrevious()) {
                                        it = it3;
                                        iNextIndex2 = -1;
                                        break;
                                    } else {
                                        it = it3;
                                        if (Intrinsics.areEqual(listIterator2.previous().getId(), backStackEntry.getId())) {
                                            iNextIndex2 = listIterator2.nextIndex();
                                            break;
                                        }
                                        it3 = it;
                                    }
                                }
                                mutableList.set(iNextIndex2, backStackEntry);
                                o00o0o00OooO0O0.f35764OooO0O0.setValue(mutableList);
                                Unit unit = Unit.INSTANCE;
                                reentrantLock.unlock();
                                it3 = it;
                            } catch (Throwable th) {
                                reentrantLock.unlock();
                                throw th;
                            }
                        }
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (!z) {
                NavBackStackEntry navBackStackEntryOooO0O0 = NavBackStackEntry.Companion.OooO0O0(NavBackStackEntry.INSTANCE, this.f9939OooO00o, navDestination, bundleOooO0O0, OooO0oO(), this.f9955OooOOo0);
                Navigator navigatorOooO0O1 = oooOOOO.OooO0O0(navDestination.f9910OooO0Oo);
                List<NavBackStackEntry> listListOf = CollectionsKt.listOf(navBackStackEntryOooO0O0);
                this.f9963OooOoO0 = new OooO(booleanRef, this, navDestination, bundleOooO0O0);
                navigatorOooO0O1.OooO0Oo(listListOf, oooOOO0, oooO00o);
                this.f9963OooOoO0 = null;
            }
        }
        OooOo00();
        Iterator it4 = linkedHashMap.values().iterator();
        while (it4.hasNext()) {
            ((OooO00o) it4.next()).f35766OooO0Oo = false;
        }
        if (zOooOOO0 || booleanRef.element || z) {
            OooO0O0();
        } else {
            OooOOoo();
        }
    }

    @MainThread
    public final void OooOO0O() {
        if (this.f9945OooO0oO.isEmpty()) {
            return;
        }
        NavDestination navDestinationOooO0o = OooO0o();
        Intrinsics.checkNotNull(navDestinationOooO0o);
        if (OooOOO0(navDestinationOooO0o.f9915OooOO0, true, false)) {
            OooO0O0();
        }
    }

    public final void OooOOO(NavBackStackEntry navBackStackEntry, boolean z, ArrayDeque<NavBackStackEntryState> arrayDeque) {
        o000O0 o000o0;
        StateFlow<Set<NavBackStackEntry>> stateFlow;
        Set<NavBackStackEntry> value;
        ArrayDeque<NavBackStackEntry> arrayDeque2 = this.f9945OooO0oO;
        NavBackStackEntry navBackStackEntryLast = arrayDeque2.last();
        if (!Intrinsics.areEqual(navBackStackEntryLast, navBackStackEntry)) {
            throw new IllegalStateException(("Attempted to pop " + navBackStackEntry.getDestination() + ", which is not the top of the back stack (" + navBackStackEntryLast.getDestination() + ')').toString());
        }
        arrayDeque2.removeLast();
        OooO00o oooO00o = (OooO00o) this.f9957OooOo.get(this.f9961OooOo0o.OooO0O0(navBackStackEntryLast.getDestination().f9910OooO0Oo));
        boolean z2 = true;
        if (!((oooO00o == null || (stateFlow = oooO00o.f35767OooO0o) == null || (value = stateFlow.getValue()) == null || !value.contains(navBackStackEntryLast)) ? false : true) && !this.f9951OooOOO0.containsKey(navBackStackEntryLast)) {
            z2 = false;
        }
        Lifecycle.State currentState = navBackStackEntryLast.getLifecycle().getState();
        Lifecycle.State state = Lifecycle.State.CREATED;
        if (currentState.isAtLeast(state)) {
            if (z) {
                navBackStackEntryLast.setMaxLifecycle(state);
                arrayDeque.addFirst(new NavBackStackEntryState(navBackStackEntryLast));
            }
            if (z2) {
                navBackStackEntryLast.setMaxLifecycle(state);
            } else {
                navBackStackEntryLast.setMaxLifecycle(Lifecycle.State.DESTROYED);
                OooOOo(navBackStackEntryLast);
            }
        }
        if (z || z2 || (o000o0 = this.f9955OooOOo0) == null) {
            return;
        }
        String backStackEntryId = navBackStackEntryLast.getId();
        Intrinsics.checkNotNullParameter(backStackEntryId, "backStackEntryId");
        ViewModelStore viewModelStore = (ViewModelStore) o000o0.f35717OooO00o.remove(backStackEntryId);
        if (viewModelStore != null) {
            viewModelStore.clear();
        }
    }

    @MainThread
    public final boolean OooOOO0(@IdRes int i, boolean z, boolean z2) {
        NavDestination destination;
        ArrayDeque<NavBackStackEntry> arrayDeque = this.f9945OooO0oO;
        if (arrayDeque.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = CollectionsKt.reversed(arrayDeque).iterator();
        do {
            if (!it.hasNext()) {
                destination = null;
                break;
            }
            destination = ((NavBackStackEntry) it.next()).getDestination();
            Navigator navigatorOooO0O0 = this.f9961OooOo0o.OooO0O0(destination.f9910OooO0Oo);
            if (z || destination.f9915OooOO0 != i) {
                arrayList.add(navigatorOooO0O0);
            }
        } while (destination.f9915OooOO0 != i);
        if (destination != null) {
            return OooO0OO(arrayList, destination, z, z2);
        }
        int i2 = NavDestination.f9908OooOO0o;
        Log.i("NavController", "Ignoring popBackStack to destination " + NavDestination.OooO00o.OooO0O0(i, this.f9939OooO00o) + " as it was not found on the current back stack");
        return false;
    }

    @NotNull
    public final ArrayList OooOOOo() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f9957OooOo.values().iterator();
        while (it.hasNext()) {
            Set<NavBackStackEntry> value = ((OooO00o) it.next()).f35767OooO0o.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : value) {
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
                if ((arrayList.contains(navBackStackEntry) || navBackStackEntry.getMaxLifecycle().isAtLeast(Lifecycle.State.STARTED)) ? false : true) {
                    arrayList2.add(obj);
                }
            }
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        for (NavBackStackEntry navBackStackEntry2 : this.f9945OooO0oO) {
            NavBackStackEntry navBackStackEntry3 = navBackStackEntry2;
            if (!arrayList.contains(navBackStackEntry3) && navBackStackEntry3.getMaxLifecycle().isAtLeast(Lifecycle.State.STARTED)) {
                arrayList3.add(navBackStackEntry2);
            }
        }
        CollectionsKt__MutableCollectionsKt.addAll(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!(((NavBackStackEntry) obj2).getDestination() instanceof androidx.navigation.OooO)) {
                arrayList4.add(obj2);
            }
        }
        return arrayList4;
    }

    @Nullable
    public final void OooOOo(@NotNull NavBackStackEntry child) {
        Intrinsics.checkNotNullParameter(child, "child");
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) this.f9949OooOO0o.remove(child);
        if (navBackStackEntry == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.f9951OooOOO0;
        AtomicInteger atomicInteger = (AtomicInteger) linkedHashMap.get(navBackStackEntry);
        Integer numValueOf = atomicInteger != null ? Integer.valueOf(atomicInteger.decrementAndGet()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            OooO00o oooO00o = (OooO00o) this.f9957OooOo.get(this.f9961OooOo0o.OooO0O0(navBackStackEntry.getDestination().f9910OooO0Oo));
            if (oooO00o != null) {
                oooO00o.OooO0O0(navBackStackEntry);
            }
            linkedHashMap.remove(navBackStackEntry);
        }
    }

    public final boolean OooOOo0(int i, Bundle bundle, OooOOO0 oooOOO0, Navigator.OooO00o oooO00o) {
        NavDestination destination;
        NavBackStackEntry navBackStackEntry;
        NavDestination destination2;
        androidx.navigation.OooO oooO;
        NavDestination navDestinationOooO0oo;
        LinkedHashMap linkedHashMap = this.f9950OooOOO;
        if (!linkedHashMap.containsKey(Integer.valueOf(i))) {
            return false;
        }
        String str = (String) linkedHashMap.get(Integer.valueOf(i));
        CollectionsKt.removeAll(linkedHashMap.values(), new OooOO0O(str));
        ArrayDeque<NavBackStackEntryState> arrayDeque = (ArrayDeque) TypeIntrinsics.asMutableMap(this.f9952OooOOOO).remove(str);
        ArrayList arrayList = new ArrayList();
        NavBackStackEntry navBackStackEntryLastOrNull = this.f9945OooO0oO.lastOrNull();
        if (navBackStackEntryLastOrNull == null || (destination = navBackStackEntryLastOrNull.getDestination()) == null) {
            destination = this.f9941OooO0OO;
            if (destination == null) {
                throw new IllegalStateException("You must call setGraph() before calling getGraph()".toString());
            }
            Intrinsics.checkNotNull(destination, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        }
        if (arrayDeque != null) {
            for (NavBackStackEntryState navBackStackEntryState : arrayDeque) {
                int i2 = navBackStackEntryState.f9906OooO0o0;
                if (destination.f9915OooOO0 == i2) {
                    navDestinationOooO0oo = destination;
                } else {
                    if (destination instanceof androidx.navigation.OooO) {
                        oooO = (androidx.navigation.OooO) destination;
                    } else {
                        oooO = destination.f9912OooO0o0;
                        Intrinsics.checkNotNull(oooO);
                    }
                    navDestinationOooO0oo = oooO.OooO0oo(i2, true);
                }
                Context context = this.f9939OooO00o;
                if (navDestinationOooO0oo == null) {
                    int i3 = NavDestination.f9908OooOO0o;
                    throw new IllegalStateException(("Restore State failed: destination " + NavDestination.OooO00o.OooO0O0(navBackStackEntryState.f9906OooO0o0, context) + " cannot be found from the current destination " + destination).toString());
                }
                arrayList.add(navBackStackEntryState.OooO00o(context, navDestinationOooO0oo, OooO0oO(), this.f9955OooOOo0));
                destination = navDestinationOooO0oo;
            }
        }
        ArrayList<List<NavBackStackEntry>> arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList) {
            if (!(((NavBackStackEntry) obj).getDestination() instanceof androidx.navigation.OooO)) {
                arrayList3.add(obj);
            }
        }
        Iterator it = arrayList3.iterator();
        while (true) {
            String str2 = null;
            if (!it.hasNext()) {
                break;
            }
            NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) it.next();
            List list = (List) CollectionsKt.lastOrNull((List) arrayList2);
            if (list != null && (navBackStackEntry = (NavBackStackEntry) CollectionsKt.last(list)) != null && (destination2 = navBackStackEntry.getDestination()) != null) {
                str2 = destination2.f9910OooO0Oo;
            }
            if (Intrinsics.areEqual(str2, navBackStackEntry2.getDestination().f9910OooO0Oo)) {
                list.add(navBackStackEntry2);
            } else {
                arrayList2.add(CollectionsKt.mutableListOf(navBackStackEntry2));
            }
        }
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        for (List<NavBackStackEntry> list2 : arrayList2) {
            Navigator navigatorOooO0O0 = this.f9961OooOo0o.OooO0O0(((NavBackStackEntry) CollectionsKt.first((List) list2)).getDestination().f9910OooO0Oo);
            this.f9963OooOoO0 = new androidx.navigation.OooO0OO(booleanRef, arrayList, new Ref.IntRef(), this, bundle);
            navigatorOooO0O0.OooO0Oo(list2, oooOOO0, oooO00o);
            this.f9963OooOoO0 = null;
        }
        return booleanRef.element;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00b8  */
    public final void OooOOoo() {
        NavDestination destination;
        StateFlow<Set<NavBackStackEntry>> stateFlow;
        Set<NavBackStackEntry> value;
        List<NavBackStackEntry> mutableList = CollectionsKt.toMutableList((Collection) this.f9945OooO0oO);
        if (mutableList.isEmpty()) {
            return;
        }
        NavDestination destination2 = ((NavBackStackEntry) CollectionsKt.last(mutableList)).getDestination();
        if (!(destination2 instanceof o0000)) {
            destination = null;
            break;
        }
        Iterator it = CollectionsKt.reversed(mutableList).iterator();
        while (true) {
            if (!it.hasNext()) {
                destination = null;
                break;
            }
            destination = ((NavBackStackEntry) it.next()).getDestination();
            if (!(destination instanceof androidx.navigation.OooO) && !(destination instanceof o0000)) {
                break;
            }
        }
        HashMap map = new HashMap();
        for (NavBackStackEntry navBackStackEntry : CollectionsKt.reversed(mutableList)) {
            Lifecycle.State maxLifecycle = navBackStackEntry.getMaxLifecycle();
            NavDestination destination3 = navBackStackEntry.getDestination();
            if (destination2 != null && destination3.f9915OooOO0 == destination2.f9915OooOO0) {
                Lifecycle.State state = Lifecycle.State.RESUMED;
                if (maxLifecycle != state) {
                    OooO00o oooO00o = (OooO00o) this.f9957OooOo.get(this.f9961OooOo0o.OooO0O0(navBackStackEntry.getDestination().f9910OooO0Oo));
                    if (Intrinsics.areEqual((oooO00o == null || (stateFlow = oooO00o.f35767OooO0o) == null || (value = stateFlow.getValue()) == null) ? null : Boolean.valueOf(value.contains(navBackStackEntry)), Boolean.TRUE)) {
                        map.put(navBackStackEntry, Lifecycle.State.STARTED);
                    } else {
                        AtomicInteger atomicInteger = (AtomicInteger) this.f9951OooOOO0.get(navBackStackEntry);
                        if (atomicInteger != null && atomicInteger.get() == 0) {
                            map.put(navBackStackEntry, Lifecycle.State.STARTED);
                        } else {
                            map.put(navBackStackEntry, state);
                        }
                    }
                }
                destination2 = destination2.f9912OooO0o0;
            } else if (destination == null || destination3.f9915OooOO0 != destination.f9915OooOO0) {
                navBackStackEntry.setMaxLifecycle(Lifecycle.State.CREATED);
            } else {
                if (maxLifecycle == Lifecycle.State.RESUMED) {
                    navBackStackEntry.setMaxLifecycle(Lifecycle.State.STARTED);
                } else {
                    Lifecycle.State state2 = Lifecycle.State.STARTED;
                    if (maxLifecycle != state2) {
                        map.put(navBackStackEntry, state2);
                    }
                }
                destination = destination.f9912OooO0o0;
            }
        }
        for (NavBackStackEntry navBackStackEntry2 : mutableList) {
            Lifecycle.State state3 = (Lifecycle.State) map.get(navBackStackEntry2);
            if (state3 != null) {
                navBackStackEntry2.setMaxLifecycle(state3);
            } else {
                navBackStackEntry2.updateState();
            }
        }
    }

    public final void OooOo00() {
        int i;
        boolean z = false;
        if (this.f9960OooOo0O) {
            ArrayDeque<NavBackStackEntry> arrayDeque = this.f9945OooO0oO;
            if ((arrayDeque instanceof Collection) && arrayDeque.isEmpty()) {
                i = 0;
            } else {
                Iterator<NavBackStackEntry> it = arrayDeque.iterator();
                i = 0;
                while (it.hasNext()) {
                    if ((!(it.next().getDestination() instanceof androidx.navigation.OooO)) && (i = i + 1) < 0) {
                        CollectionsKt.throwCountOverflow();
                    }
                }
            }
            if (i > 1) {
                z = true;
            }
        }
        OooOO0 oooOO1 = this.f9958OooOo0;
        oooOO1.f2191OooO00o = z;
        Function0<Unit> function0 = oooOO1.f2193OooO0OO;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
