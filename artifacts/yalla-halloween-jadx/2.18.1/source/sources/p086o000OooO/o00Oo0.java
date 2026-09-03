package p086o000OooO;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.activity.OnBackPressedDispatcher;
import androidx.annotation.IdRes;
import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.o00000O0;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavBackStackEntryState;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class o00Oo0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final StateFlow<List<NavBackStackEntry>> f28451OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Context f28452OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public Activity f28453OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public androidx.navigation.OooO0OO f28454OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public Bundle f28455OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f28456OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public Parcelable[] f28457OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final ArrayDeque<NavBackStackEntry> f28458OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<List<NavBackStackEntry>> f28459OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final Map<NavBackStackEntry, NavBackStackEntry> f28460OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final Map<NavBackStackEntry, AtomicInteger> f28461OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final Map<Integer, String> f28462OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public LifecycleOwner f28463OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final Map<String, ArrayDeque<NavBackStackEntryState>> f28464OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @Nullable
    public OnBackPressedDispatcher f28465OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @Nullable
    public o0ooOOo f28466OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public Lifecycle.State f28467OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public final CopyOnWriteArrayList<OooO0O0> f28468OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o00O0O f28469OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @Nullable
    public Function1<? super NavBackStackEntry, Unit> f28470OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public boolean f28471OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final OooOO0 f28472OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public o0000 f28473OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @NotNull
    public final Map<Navigator<? extends NavDestination>, OooO00o> f28474OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @NotNull
    public final Map<NavBackStackEntry, Boolean> f28475OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @Nullable
    public Function1<? super NavBackStackEntry, Unit> f28476OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f28477OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @NotNull
    public final Lazy f28478OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @NotNull
    public final List<NavBackStackEntry> f28479OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<NavBackStackEntry> f28480OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    @NotNull
    public final Flow<NavBackStackEntry> f28481OooOooo;

    public static final class OooO extends Lambda implements Function1<NavBackStackEntry, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Bundle f28482Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Ref.BooleanRef f28483Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o00Oo0 f28484Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ NavDestination f28485Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(Ref.BooleanRef booleanRef, o00Oo0 o00oo1, NavDestination navDestination, Bundle bundle) {
            super(1);
            this.f28483Oooo0o = booleanRef;
            this.f28484Oooo0oO = o00oo1;
            this.f28485Oooo0oo = navDestination;
            this.f28482Oooo = bundle;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(NavBackStackEntry navBackStackEntry) {
            NavBackStackEntry it = navBackStackEntry;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f28483Oooo0o.element = true;
            this.f28484Oooo0oO.OooO00o(this.f28485Oooo0oo, this.f28482Oooo, it, CollectionsKt.emptyList());
            return Unit.INSTANCE;
        }
    }

    public final class OooO00o extends o0000O00 {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @NotNull
        public final Navigator<? extends NavDestination> f28486OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ o00Oo0 f28487OooO0oo;

        /* JADX INFO: renamed from: o000OooO.o00Oo0$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0302OooO00o extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public final /* synthetic */ NavBackStackEntry f28489Oooo0oO;

            /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
            public final /* synthetic */ boolean f28490Oooo0oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0302OooO00o(NavBackStackEntry navBackStackEntry, boolean z) {
                super(0);
                this.f28489Oooo0oO = navBackStackEntry;
                this.f28490Oooo0oo = z;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                OooO00o.super.OooO0OO(this.f28489Oooo0oO, this.f28490Oooo0oo);
                return Unit.INSTANCE;
            }
        }

        public OooO00o(@NotNull o00Oo0 o00oo1, Navigator<? extends NavDestination> navigator) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            this.f28487OooO0oo = o00oo1;
            this.f28486OooO0oO = navigator;
        }

        @Override // p086o000OooO.o0000O00
        @NotNull
        public final NavBackStackEntry OooO00o(@NotNull NavDestination destination, @Nullable Bundle bundle) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            NavBackStackEntry.Companion companion = NavBackStackEntry.INSTANCE;
            o00Oo0 o00oo1 = this.f28487OooO0oo;
            return NavBackStackEntry.Companion.OooO0O0(companion, o00oo1.f28452OooO00o, destination, bundle, o00oo1.OooO(), this.f28487OooO0oo.f28466OooOOOo);
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.util.LinkedHashMap, java.util.Map<androidx.navigation.NavBackStackEntry, java.lang.Boolean>] */
        @Override // p086o000OooO.o0000O00
        public final void OooO0O0(@NotNull NavBackStackEntry entry) {
            o0ooOOo o0ooooo2;
            Intrinsics.checkNotNullParameter(entry, "entry");
            boolean zAreEqual = Intrinsics.areEqual(this.f28487OooO0oo.f28475OooOoO.get(entry), Boolean.TRUE);
            super.OooO0O0(entry);
            this.f28487OooO0oo.f28475OooOoO.remove(entry);
            if (this.f28487OooO0oo.f28458OooO0oO.contains(entry)) {
                if (this.f28436OooO0Oo) {
                    return;
                }
                this.f28487OooO0oo.OooOo00();
                o00Oo0 o00oo1 = this.f28487OooO0oo;
                o00oo1.f28459OooO0oo.tryEmit(o00oo1.OooOOo0());
                return;
            }
            this.f28487OooO0oo.OooOOoo(entry);
            if (entry.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
                entry.setMaxLifecycle(Lifecycle.State.DESTROYED);
            }
            ArrayDeque<NavBackStackEntry> arrayDeque = this.f28487OooO0oo.f28458OooO0oO;
            boolean z = true;
            if (!(arrayDeque instanceof Collection) || !arrayDeque.isEmpty()) {
                Iterator<NavBackStackEntry> it = arrayDeque.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.areEqual(it.next().getId(), entry.getId())) {
                        z = false;
                        break;
                    }
                }
            }
            if (z && !zAreEqual && (o0ooooo2 = this.f28487OooO0oo.f28466OooOOOo) != null) {
                String backStackEntryId = entry.getId();
                Intrinsics.checkNotNullParameter(backStackEntryId, "backStackEntryId");
                ViewModelStore viewModelStoreRemove = o0ooooo2.f28532OooO00o.remove(backStackEntryId);
                if (viewModelStoreRemove != null) {
                    viewModelStoreRemove.clear();
                }
            }
            this.f28487OooO0oo.OooOo00();
            o00Oo0 o00oo2 = this.f28487OooO0oo;
            o00oo2.f28459OooO0oo.tryEmit(o00oo2.OooOOo0());
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.util.LinkedHashMap, java.util.Map<androidx.navigation.Navigator<? extends androidx.navigation.NavDestination>, o000OooO.o00Oo0$OooO00o>] */
        @Override // p086o000OooO.o0000O00
        public final void OooO0OO(@NotNull NavBackStackEntry popUpTo, boolean z) {
            Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
            Navigator navigatorOooO0O0 = this.f28487OooO0oo.f28473OooOo0O.OooO0O0(popUpTo.getDestination().f8631Oooo0o);
            if (!Intrinsics.areEqual(navigatorOooO0O0, this.f28486OooO0oO)) {
                Object obj = this.f28487OooO0oo.f28474OooOo0o.get(navigatorOooO0O0);
                Intrinsics.checkNotNull(obj);
                ((OooO00o) obj).OooO0OO(popUpTo, z);
                return;
            }
            o00Oo0 o00oo1 = this.f28487OooO0oo;
            Function1<? super NavBackStackEntry, Unit> function1 = o00oo1.f28476OooOoO0;
            if (function1 != null) {
                function1.invoke(popUpTo);
                super.OooO0OO(popUpTo, z);
                return;
            }
            C0302OooO00o onComplete = new C0302OooO00o(popUpTo, z);
            Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
            Intrinsics.checkNotNullParameter(onComplete, "onComplete");
            int iIndexOf = o00oo1.f28458OooO0oO.indexOf(popUpTo);
            if (iIndexOf < 0) {
                Log.i("NavController", "Ignoring pop of " + popUpTo + " as it was not found on the current back stack");
                return;
            }
            int i = iIndexOf + 1;
            if (i != o00oo1.f28458OooO0oO.size()) {
                o00oo1.OooOOO(o00oo1.f28458OooO0oO.get(i).getDestination().f8637OoooO0O, true, false);
            }
            o00Oo0.OooOOOo(o00oo1, popUpTo, false, null, 6, null);
            onComplete.invoke();
            o00oo1.OooOo0();
            o00oo1.OooO0O0();
        }

        @Override // p086o000OooO.o0000O00
        public final void OooO0Oo(@NotNull NavBackStackEntry popUpTo, boolean z) {
            Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
            super.OooO0Oo(popUpTo, z);
            this.f28487OooO0oo.f28475OooOoO.put(popUpTo, Boolean.valueOf(z));
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.util.LinkedHashMap, java.util.Map<androidx.navigation.Navigator<? extends androidx.navigation.NavDestination>, o000OooO.o00Oo0$OooO00o>] */
        @Override // p086o000OooO.o0000O00
        public final void OooO0o0(@NotNull NavBackStackEntry backStackEntry) {
            Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
            Navigator navigatorOooO0O0 = this.f28487OooO0oo.f28473OooOo0O.OooO0O0(backStackEntry.getDestination().f8631Oooo0o);
            if (!Intrinsics.areEqual(navigatorOooO0O0, this.f28486OooO0oO)) {
                Object obj = this.f28487OooO0oo.f28474OooOo0o.get(navigatorOooO0O0);
                if (obj == null) {
                    throw new IllegalStateException(p058o0000OoO.OooO.OooO00o(OooO00o.OooO00o.OooO0o0("NavigatorBackStack for "), backStackEntry.getDestination().f8631Oooo0o, " should already be created").toString());
                }
                ((OooO00o) obj).OooO0o0(backStackEntry);
                return;
            }
            Function1<? super NavBackStackEntry, Unit> function1 = this.f28487OooO0oo.f28470OooOo;
            if (function1 != null) {
                function1.invoke(backStackEntry);
                Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
                super.OooO0o0(backStackEntry);
            } else {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Ignoring add of destination ");
                sbOooO0o0.append(backStackEntry.getDestination());
                sbOooO0o0.append(" outside of the call to navigate(). ");
                Log.i("NavController", sbOooO0o0.toString());
            }
        }

        public final void OooO0oo(@NotNull NavBackStackEntry backStackEntry) {
            Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
            super.OooO0o0(backStackEntry);
        }
    }

    public interface OooO0O0 {
        void OooO00o();
    }

    public static final class OooO0OO extends Lambda implements Function1<Context, Context> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0OO f28491Oooo0o = new OooO0OO();

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

    public static final class OooO0o extends Lambda implements Function0<o000000O> {
        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o000000O invoke() {
            Objects.requireNonNull(o00Oo0.this);
            o00Oo0 o00oo1 = o00Oo0.this;
            return new o000000O(o00oo1.f28452OooO00o, o00oo1.f28473OooOo0O);
        }
    }

    public static final class OooOO0 extends androidx.activity.OooOOO {
        public OooOO0() {
            super(false);
        }

        @Override // androidx.activity.OooOOO
        public final void OooO00o() {
            o00Oo0.this.OooOOO0();
        }
    }

    public static final class OooOO0O extends Lambda implements Function1<NavBackStackEntry, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ boolean f28494Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Ref.BooleanRef f28495Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Ref.BooleanRef f28496Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ o00Oo0 f28497Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ ArrayDeque<NavBackStackEntryState> f28498OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2, o00Oo0 o00oo1, boolean z, ArrayDeque<NavBackStackEntryState> arrayDeque) {
            super(1);
            this.f28495Oooo0o = booleanRef;
            this.f28496Oooo0oO = booleanRef2;
            this.f28497Oooo0oo = o00oo1;
            this.f28494Oooo = z;
            this.f28498OoooO00 = arrayDeque;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(NavBackStackEntry navBackStackEntry) {
            NavBackStackEntry entry = navBackStackEntry;
            Intrinsics.checkNotNullParameter(entry, "entry");
            this.f28495Oooo0o.element = true;
            this.f28496Oooo0oO.element = true;
            this.f28497Oooo0oo.OooOOOO(entry, this.f28494Oooo, this.f28498OoooO00);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function1<NavDestination, Boolean> {
        public OooOOO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(NavDestination navDestination) {
            NavDestination destination = navDestination;
            Intrinsics.checkNotNullParameter(destination, "destination");
            return Boolean.valueOf(!o00Oo0.this.f28462OooOO0o.containsKey(Integer.valueOf(destination.f8637OoooO0O)));
        }
    }

    public static final class OooOOO0 extends Lambda implements Function1<NavDestination, NavDestination> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooOOO0 f28500Oooo0o = new OooOOO0();

        public OooOOO0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final NavDestination invoke(NavDestination navDestination) {
            NavDestination destination = navDestination;
            Intrinsics.checkNotNullParameter(destination, "destination");
            androidx.navigation.OooO0OO oooO0OO = destination.f8632Oooo0oO;
            boolean z = false;
            if (oooO0OO != null && oooO0OO.f8653OoooOOO == destination.f8637OoooO0O) {
                z = true;
            }
            if (z) {
                return oooO0OO;
            }
            return null;
        }
    }

    public static final class OooOOOO extends Lambda implements Function1<NavDestination, NavDestination> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooOOOO f28501Oooo0o = new OooOOOO();

        public OooOOOO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final NavDestination invoke(NavDestination navDestination) {
            NavDestination destination = navDestination;
            Intrinsics.checkNotNullParameter(destination, "destination");
            androidx.navigation.OooO0OO oooO0OO = destination.f8632Oooo0oO;
            boolean z = false;
            if (oooO0OO != null && oooO0OO.f8653OoooOOO == destination.f8637OoooO0O) {
                z = true;
            }
            if (z) {
                return oooO0OO;
            }
            return null;
        }
    }

    public static final class OooOo extends Lambda implements Function1<String, Boolean> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ String f28502Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(String str) {
            super(1);
            this.f28502Oooo0o = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(String str) {
            return Boolean.valueOf(Intrinsics.areEqual(str, this.f28502Oooo0o));
        }
    }

    public static final class OooOo00 extends Lambda implements Function1<NavDestination, Boolean> {
        public OooOo00() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(NavDestination navDestination) {
            NavDestination destination = navDestination;
            Intrinsics.checkNotNullParameter(destination, "destination");
            return Boolean.valueOf(!o00Oo0.this.f28462OooOO0o.containsKey(Integer.valueOf(destination.f8637OoooO0O)));
        }
    }

    public static final class Oooo000 extends Lambda implements Function1<NavBackStackEntry, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ o00Oo0 f28504Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Ref.BooleanRef f28505Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ List<NavBackStackEntry> f28506Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ Ref.IntRef f28507Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ Bundle f28508OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo000(Ref.BooleanRef booleanRef, List<NavBackStackEntry> list, Ref.IntRef intRef, o00Oo0 o00oo1, Bundle bundle) {
            super(1);
            this.f28505Oooo0o = booleanRef;
            this.f28506Oooo0oO = list;
            this.f28507Oooo0oo = intRef;
            this.f28504Oooo = o00oo1;
            this.f28508OoooO00 = bundle;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(NavBackStackEntry navBackStackEntry) {
            List<NavBackStackEntry> listEmptyList;
            NavBackStackEntry entry = navBackStackEntry;
            Intrinsics.checkNotNullParameter(entry, "entry");
            this.f28505Oooo0o.element = true;
            int iIndexOf = this.f28506Oooo0oO.indexOf(entry);
            if (iIndexOf != -1) {
                int i = iIndexOf + 1;
                listEmptyList = this.f28506Oooo0oO.subList(this.f28507Oooo0oo.element, i);
                this.f28507Oooo0oo.element = i;
            } else {
                listEmptyList = CollectionsKt.emptyList();
            }
            this.f28504Oooo.OooO00o(entry.getDestination(), this.f28508OoooO00, entry, listEmptyList);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r5v13, types: [o000OooO.o00O0O] */
    public o00Oo0(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f28452OooO00o = context;
        for (Object obj : SequencesKt.generateSequence(context, OooO0OO.f28491Oooo0o)) {
            if (((Context) obj) instanceof Activity) {
                this.f28453OooO0O0 = (Activity) obj;
                this.f28458OooO0oO = new ArrayDeque<>();
                MutableStateFlow<List<NavBackStackEntry>> MutableStateFlow = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
                this.f28459OooO0oo = MutableStateFlow;
                this.f28451OooO = FlowKt.asStateFlow(MutableStateFlow);
                this.f28460OooOO0 = new LinkedHashMap();
                this.f28461OooOO0O = new LinkedHashMap();
                this.f28462OooOO0o = new LinkedHashMap();
                this.f28464OooOOO0 = new LinkedHashMap();
                this.f28468OooOOo0 = new CopyOnWriteArrayList<>();
                this.f28467OooOOo = Lifecycle.State.INITIALIZED;
                this.f28469OooOOoo = new LifecycleEventObserver() { // from class: o000OooO.o00O0O
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                        o00Oo0 this$0 = this.f28450Oooo0o;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(lifecycleOwner, "<anonymous parameter 0>");
                        Intrinsics.checkNotNullParameter(event, "event");
                        Lifecycle.State targetState = event.getTargetState();
                        Intrinsics.checkNotNullExpressionValue(targetState, "event.targetState");
                        this$0.f28467OooOOo = targetState;
                        if (this$0.f28454OooO0OO != null) {
                            Iterator<NavBackStackEntry> it = this$0.f28458OooO0oO.iterator();
                            while (it.hasNext()) {
                                it.next().handleLifecycleEvent(event);
                            }
                        }
                    }
                };
                this.f28472OooOo00 = new OooOO0();
                this.f28471OooOo0 = true;
                this.f28473OooOo0O = new o0000();
                this.f28474OooOo0o = new LinkedHashMap();
                this.f28475OooOoO = new LinkedHashMap();
                o0000 o0000Var = this.f28473OooOo0O;
                o0000Var.OooO00o(new androidx.navigation.OooO0o(o0000Var));
                this.f28473OooOo0O.OooO00o(new androidx.navigation.OooO00o(this.f28452OooO00o));
                this.f28479OooOoo0 = new ArrayList();
                this.f28478OooOoo = LazyKt.lazy(new OooO0o());
                MutableSharedFlow<NavBackStackEntry> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 0, BufferOverflow.DROP_OLDEST, 2, null);
                this.f28480OooOooO = mutableSharedFlowMutableSharedFlow$default;
                this.f28481OooOooo = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
            }
        }
        obj = null;
        this.f28453OooO0O0 = (Activity) obj;
        this.f28458OooO0oO = new ArrayDeque<>();
        MutableStateFlow<List<NavBackStackEntry>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this.f28459OooO0oo = MutableStateFlow2;
        this.f28451OooO = FlowKt.asStateFlow(MutableStateFlow2);
        this.f28460OooOO0 = new LinkedHashMap();
        this.f28461OooOO0O = new LinkedHashMap();
        this.f28462OooOO0o = new LinkedHashMap();
        this.f28464OooOOO0 = new LinkedHashMap();
        this.f28468OooOOo0 = new CopyOnWriteArrayList<>();
        this.f28467OooOOo = Lifecycle.State.INITIALIZED;
        this.f28469OooOOoo = new LifecycleEventObserver() { // from class: o000OooO.o00O0O
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                o00Oo0 this$0 = this.f28450Oooo0o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(lifecycleOwner, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(event, "event");
                Lifecycle.State targetState = event.getTargetState();
                Intrinsics.checkNotNullExpressionValue(targetState, "event.targetState");
                this$0.f28467OooOOo = targetState;
                if (this$0.f28454OooO0OO != null) {
                    Iterator<NavBackStackEntry> it = this$0.f28458OooO0oO.iterator();
                    while (it.hasNext()) {
                        it.next().handleLifecycleEvent(event);
                    }
                }
            }
        };
        this.f28472OooOo00 = new OooOO0();
        this.f28471OooOo0 = true;
        this.f28473OooOo0O = new o0000();
        this.f28474OooOo0o = new LinkedHashMap();
        this.f28475OooOoO = new LinkedHashMap();
        o0000 o0000Var2 = this.f28473OooOo0O;
        o0000Var2.OooO00o(new androidx.navigation.OooO0o(o0000Var2));
        this.f28473OooOo0O.OooO00o(new androidx.navigation.OooO00o(this.f28452OooO00o));
        this.f28479OooOoo0 = new ArrayList();
        this.f28478OooOoo = LazyKt.lazy(new OooO0o());
        MutableSharedFlow<NavBackStackEntry> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(1, 0, BufferOverflow.DROP_OLDEST, 2, null);
        this.f28480OooOooO = mutableSharedFlowMutableSharedFlow$default2;
        this.f28481OooOooo = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
    }

    public static /* synthetic */ void OooOOOo(o00Oo0 o00oo1, NavBackStackEntry navBackStackEntry, boolean z, ArrayDeque arrayDeque, int i, Object obj) {
        o00oo1.OooOOOO(navBackStackEntry, false, new ArrayDeque<>());
    }

    @NotNull
    public final Lifecycle.State OooO() {
        return this.f28463OooOOO == null ? Lifecycle.State.CREATED : this.f28467OooOOo;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.LinkedHashMap, java.util.Map<androidx.navigation.Navigator<? extends androidx.navigation.NavDestination>, o000OooO.o00Oo0$OooO00o>] */
    public final void OooO00o(NavDestination navDestination, Bundle bundle, NavBackStackEntry navBackStackEntry, List<NavBackStackEntry> list) {
        NavBackStackEntry navBackStackEntryPrevious;
        NavDestination destination;
        androidx.navigation.OooO0OO oooO0OO;
        NavBackStackEntry navBackStackEntryPrevious2;
        NavBackStackEntry navBackStackEntryPrevious3;
        NavDestination destination2 = navBackStackEntry.getDestination();
        if (!(destination2 instanceof p086o000OooO.Oooo000)) {
            while (!this.f28458OooO0oO.isEmpty() && (this.f28458OooO0oO.last().getDestination() instanceof p086o000OooO.Oooo000) && OooOOO(this.f28458OooO0oO.last().getDestination().f8637OoooO0O, true, false)) {
            }
        }
        ArrayDeque<NavBackStackEntry> arrayDeque = new ArrayDeque();
        if (navDestination instanceof androidx.navigation.OooO0OO) {
            NavDestination navDestination2 = destination2;
            while (true) {
                Intrinsics.checkNotNull(navDestination2);
                androidx.navigation.OooO0OO oooO0OO2 = navDestination2.f8632Oooo0oO;
                if (oooO0OO2 != null) {
                    ListIterator<NavBackStackEntry> listIterator = list.listIterator(list.size());
                    do {
                        if (!listIterator.hasPrevious()) {
                            navBackStackEntryPrevious3 = null;
                            break;
                        }
                        navBackStackEntryPrevious3 = listIterator.previous();
                    } while (!Intrinsics.areEqual(navBackStackEntryPrevious3.getDestination(), oooO0OO2));
                    NavBackStackEntry navBackStackEntryOooO0O0 = navBackStackEntryPrevious3;
                    if (navBackStackEntryOooO0O0 == null) {
                        navBackStackEntryOooO0O0 = NavBackStackEntry.Companion.OooO0O0(NavBackStackEntry.INSTANCE, this.f28452OooO00o, oooO0OO2, bundle, OooO(), this.f28466OooOOOo);
                    }
                    arrayDeque.addFirst(navBackStackEntryOooO0O0);
                    if ((!this.f28458OooO0oO.isEmpty()) && this.f28458OooO0oO.last().getDestination() == oooO0OO2) {
                        OooOOOo(this, this.f28458OooO0oO.last(), false, null, 6, null);
                    }
                }
                if (oooO0OO2 == null || oooO0OO2 == navDestination) {
                    break;
                } else {
                    navDestination2 = oooO0OO2;
                }
            }
        }
        NavDestination destination3 = arrayDeque.isEmpty() ? destination2 : ((NavBackStackEntry) arrayDeque.first()).getDestination();
        while (destination3 != null && OooO0OO(destination3.f8637OoooO0O) == null) {
            destination3 = destination3.f8632Oooo0oO;
            if (destination3 != null) {
                ListIterator<NavBackStackEntry> listIterator2 = list.listIterator(list.size());
                do {
                    if (!listIterator2.hasPrevious()) {
                        navBackStackEntryPrevious2 = null;
                        break;
                    }
                    navBackStackEntryPrevious2 = listIterator2.previous();
                } while (!Intrinsics.areEqual(navBackStackEntryPrevious2.getDestination(), destination3));
                NavBackStackEntry navBackStackEntryOooO0O1 = navBackStackEntryPrevious2;
                if (navBackStackEntryOooO0O1 == null) {
                    navBackStackEntryOooO0O1 = NavBackStackEntry.Companion.OooO0O0(NavBackStackEntry.INSTANCE, this.f28452OooO00o, destination3, destination3.OooO0O0(bundle), OooO(), this.f28466OooOOOo);
                }
                arrayDeque.addFirst(navBackStackEntryOooO0O1);
            }
        }
        if (!arrayDeque.isEmpty()) {
            destination2 = ((NavBackStackEntry) arrayDeque.last()).getDestination();
        }
        while (!this.f28458OooO0oO.isEmpty() && (this.f28458OooO0oO.last().getDestination() instanceof androidx.navigation.OooO0OO) && ((androidx.navigation.OooO0OO) this.f28458OooO0oO.last().getDestination()).OooO0oo(destination2.f8637OoooO0O, false) == null) {
            OooOOOo(this, this.f28458OooO0oO.last(), false, null, 6, null);
        }
        NavBackStackEntry navBackStackEntryFirstOrNull = this.f28458OooO0oO.firstOrNull();
        if (navBackStackEntryFirstOrNull == null) {
            navBackStackEntryFirstOrNull = (NavBackStackEntry) arrayDeque.firstOrNull();
        }
        if (!Intrinsics.areEqual(navBackStackEntryFirstOrNull != null ? navBackStackEntryFirstOrNull.getDestination() : null, this.f28454OooO0OO)) {
            ListIterator<NavBackStackEntry> listIterator3 = list.listIterator(list.size());
            do {
                if (!listIterator3.hasPrevious()) {
                    navBackStackEntryPrevious = null;
                    break;
                }
                navBackStackEntryPrevious = listIterator3.previous();
                destination = navBackStackEntryPrevious.getDestination();
                oooO0OO = this.f28454OooO0OO;
                Intrinsics.checkNotNull(oooO0OO);
            } while (!Intrinsics.areEqual(destination, oooO0OO));
            NavBackStackEntry navBackStackEntryOooO0O2 = navBackStackEntryPrevious;
            if (navBackStackEntryOooO0O2 == null) {
                NavBackStackEntry.Companion companion = NavBackStackEntry.INSTANCE;
                Context context = this.f28452OooO00o;
                androidx.navigation.OooO0OO oooO0OO3 = this.f28454OooO0OO;
                Intrinsics.checkNotNull(oooO0OO3);
                androidx.navigation.OooO0OO oooO0OO4 = this.f28454OooO0OO;
                Intrinsics.checkNotNull(oooO0OO4);
                navBackStackEntryOooO0O2 = NavBackStackEntry.Companion.OooO0O0(companion, context, oooO0OO3, oooO0OO4.OooO0O0(bundle), OooO(), this.f28466OooOOOo);
            }
            arrayDeque.addFirst(navBackStackEntryOooO0O2);
        }
        for (NavBackStackEntry navBackStackEntry2 : arrayDeque) {
            Object obj = this.f28474OooOo0o.get(this.f28473OooOo0O.OooO0O0(navBackStackEntry2.getDestination().f8631Oooo0o));
            if (obj == null) {
                throw new IllegalStateException(p058o0000OoO.OooO.OooO00o(OooO00o.OooO00o.OooO0o0("NavigatorBackStack for "), navDestination.f8631Oooo0o, " should already be created").toString());
            }
            ((OooO00o) obj).OooO0oo(navBackStackEntry2);
        }
        this.f28458OooO0oO.addAll(arrayDeque);
        this.f28458OooO0oO.add(navBackStackEntry);
        for (NavBackStackEntry navBackStackEntry3 : CollectionsKt.plus((Collection<? extends NavBackStackEntry>) arrayDeque, navBackStackEntry)) {
            androidx.navigation.OooO0OO oooO0OO5 = navBackStackEntry3.getDestination().f8632Oooo0oO;
            if (oooO0OO5 != null) {
                OooOO0O(navBackStackEntry3, OooO0o0(oooO0OO5.f8637OoooO0O));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.ArrayList, java.util.List<androidx.navigation.NavBackStackEntry>] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList, java.util.List<androidx.navigation.NavBackStackEntry>] */
    public final boolean OooO0O0() {
        while (!this.f28458OooO0oO.isEmpty() && (this.f28458OooO0oO.last().getDestination() instanceof androidx.navigation.OooO0OO)) {
            OooOOOo(this, this.f28458OooO0oO.last(), false, null, 6, null);
        }
        NavBackStackEntry navBackStackEntryLastOrNull = this.f28458OooO0oO.lastOrNull();
        if (navBackStackEntryLastOrNull != null) {
            this.f28479OooOoo0.add(navBackStackEntryLastOrNull);
        }
        this.f28477OooOoOO++;
        OooOo00();
        int i = this.f28477OooOoOO - 1;
        this.f28477OooOoOO = i;
        if (i == 0) {
            List<NavBackStackEntry> mutableList = CollectionsKt.toMutableList((Collection) this.f28479OooOoo0);
            this.f28479OooOoo0.clear();
            for (NavBackStackEntry navBackStackEntry : mutableList) {
                for (OooO0O0 oooO0O0 : this.f28468OooOOo0) {
                    navBackStackEntry.getDestination();
                    navBackStackEntry.getArguments();
                    oooO0O0.OooO00o();
                }
                this.f28480OooOooO.tryEmit(navBackStackEntry);
            }
            this.f28459OooO0oo.tryEmit(OooOOo0());
        }
        return navBackStackEntryLastOrNull != null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Nullable
    public final NavDestination OooO0OO(@IdRes int i) {
        NavDestination destination;
        androidx.navigation.OooO0OO oooO0OO = this.f28454OooO0OO;
        if (oooO0OO == null) {
            return null;
        }
        Intrinsics.checkNotNull(oooO0OO);
        if (oooO0OO.f8637OoooO0O == i) {
            return this.f28454OooO0OO;
        }
        NavBackStackEntry navBackStackEntryLastOrNull = this.f28458OooO0oO.lastOrNull();
        if (navBackStackEntryLastOrNull == null || (destination = navBackStackEntryLastOrNull.getDestination()) == null) {
            destination = this.f28454OooO0OO;
            Intrinsics.checkNotNull(destination);
        }
        return OooO0Oo(destination, i);
    }

    public final NavDestination OooO0Oo(NavDestination navDestination, @IdRes int i) {
        androidx.navigation.OooO0OO oooO0OO;
        if (navDestination.f8637OoooO0O == i) {
            return navDestination;
        }
        if (navDestination instanceof androidx.navigation.OooO0OO) {
            oooO0OO = (androidx.navigation.OooO0OO) navDestination;
        } else {
            oooO0OO = navDestination.f8632Oooo0oO;
            Intrinsics.checkNotNull(oooO0OO);
        }
        return oooO0OO.OooO0oo(i, true);
    }

    @Nullable
    public final NavBackStackEntry OooO0o() {
        return this.f28458OooO0oO.lastOrNull();
    }

    @NotNull
    public final NavBackStackEntry OooO0o0(@IdRes int i) {
        NavBackStackEntry navBackStackEntryPrevious;
        ArrayDeque<NavBackStackEntry> arrayDeque = this.f28458OooO0oO;
        ListIterator<NavBackStackEntry> listIterator = arrayDeque.listIterator(arrayDeque.size());
        do {
            if (!listIterator.hasPrevious()) {
                navBackStackEntryPrevious = null;
                break;
            }
            navBackStackEntryPrevious = listIterator.previous();
        } while (!(navBackStackEntryPrevious.getDestination().f8637OoooO0O == i));
        NavBackStackEntry navBackStackEntry = navBackStackEntryPrevious;
        if (navBackStackEntry != null) {
            return navBackStackEntry;
        }
        StringBuilder sbOooO00o = o00000O0.OooO00o("No destination with ID ", i, " is on the NavController's back stack. The current destination is ");
        sbOooO00o.append(OooO0oO());
        throw new IllegalArgumentException(sbOooO00o.toString().toString());
    }

    @Nullable
    public final NavDestination OooO0oO() {
        NavBackStackEntry navBackStackEntryOooO0o = OooO0o();
        if (navBackStackEntryOooO0o != null) {
            return navBackStackEntryOooO0o.getDestination();
        }
        return null;
    }

    @MainThread
    @NotNull
    public final androidx.navigation.OooO0OO OooO0oo() {
        androidx.navigation.OooO0OO oooO0OO = this.f28454OooO0OO;
        if (oooO0OO == null) {
            throw new IllegalStateException("You must call setGraph() before calling getGraph()".toString());
        }
        Objects.requireNonNull(oooO0OO, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        return oooO0OO;
    }

    @Nullable
    public final NavBackStackEntry OooOO0() {
        Object next;
        Iterator it = CollectionsKt.reversed(this.f28458OooO0oO).iterator();
        if (it.hasNext()) {
            it.next();
        }
        Iterator it2 = SequencesKt.asSequence(it).iterator();
        while (it2.hasNext()) {
            next = it2.next();
            if (!(((NavBackStackEntry) next).getDestination() instanceof androidx.navigation.OooO0OO)) {
                return (NavBackStackEntry) next;
            }
        }
        next = null;
        return (NavBackStackEntry) next;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.LinkedHashMap, java.util.Map<androidx.navigation.NavBackStackEntry, java.util.concurrent.atomic.AtomicInteger>] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.LinkedHashMap, java.util.Map<androidx.navigation.NavBackStackEntry, java.util.concurrent.atomic.AtomicInteger>] */
    public final void OooOO0O(NavBackStackEntry navBackStackEntry, NavBackStackEntry navBackStackEntry2) {
        this.f28460OooOO0.put(navBackStackEntry, navBackStackEntry2);
        if (this.f28461OooOO0O.get(navBackStackEntry2) == null) {
            this.f28461OooOO0O.put(navBackStackEntry2, new AtomicInteger(0));
        }
        Object obj = this.f28461OooOO0O.get(navBackStackEntry2);
        Intrinsics.checkNotNull(obj);
        ((AtomicInteger) obj).incrementAndGet();
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0127 A[LOOP:1: B:50:0x0121->B:52:0x0127, LOOP_END] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.LinkedHashMap, java.util.Map<androidx.navigation.Navigator<? extends androidx.navigation.NavDestination>, o000OooO.o00Oo0$OooO00o>] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.util.LinkedHashMap, java.util.Map<androidx.navigation.Navigator<? extends androidx.navigation.NavDestination>, o000OooO.o00Oo0$OooO00o>] */
    @MainThread
    public final void OooOO0o(NavDestination navDestination, Bundle bundle, o00000 o00000Var, Navigator.OooO00o oooO00o) {
        boolean z;
        NavDestination destination;
        Iterator it;
        int i;
        Iterator it2 = this.f28474OooOo0o.values().iterator();
        while (true) {
            z = true;
            if (!it2.hasNext()) {
                break;
            } else {
                ((OooO00o) it2.next()).f28436OooO0Oo = true;
            }
        }
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        boolean zOooOOO = (o00000Var == null || (i = o00000Var.f28411OooO0OO) == -1) ? false : OooOOO(i, o00000Var.f28412OooO0Oo, o00000Var.f28414OooO0o0);
        Bundle bundleOooO0O0 = navDestination.OooO0O0(bundle);
        if ((o00000Var != null && o00000Var.f28410OooO0O0) && this.f28462OooOO0o.containsKey(Integer.valueOf(navDestination.f8637OoooO0O))) {
            booleanRef.element = OooOOo(navDestination.f8637OoooO0O, bundleOooO0O0, o00000Var, oooO00o);
        } else {
            NavBackStackEntry navBackStackEntryOooO0o = OooO0o();
            Navigator navigatorOooO0O0 = this.f28473OooOo0O.OooO0O0(navDestination.f8631Oooo0o);
            if (o00000Var != null && o00000Var.f28409OooO00o) {
                if ((navBackStackEntryOooO0o == null || (destination = navBackStackEntryOooO0o.getDestination()) == null || navDestination.f8637OoooO0O != destination.f8637OoooO0O) ? false : true) {
                    OooOOoo(this.f28458OooO0oO.removeLast());
                    NavBackStackEntry backStackEntry = new NavBackStackEntry(navBackStackEntryOooO0o, bundleOooO0O0);
                    this.f28458OooO0oO.addLast(backStackEntry);
                    androidx.navigation.OooO0OO oooO0OO = backStackEntry.getDestination().f8632Oooo0oO;
                    if (oooO0OO != null) {
                        OooOO0O(backStackEntry, OooO0o0(oooO0OO.f8637OoooO0O));
                    }
                    Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
                    NavDestination destination2 = backStackEntry.getDestination();
                    NavDestination navDestination2 = destination2 instanceof NavDestination ? destination2 : null;
                    if (navDestination2 != null) {
                        o00000O.OooO00o(o0000Ooo.f28439Oooo0o);
                        navigatorOooO0O0.OooO0OO(navDestination2);
                        o0000O00 o0000o00OooO0O0 = navigatorOooO0O0.OooO0O0();
                        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
                        MutableStateFlow<List<NavBackStackEntry>> mutableStateFlow = o0000o00OooO0O0.f28434OooO0O0;
                        mutableStateFlow.setValue(CollectionsKt.plus((Collection<? extends NavBackStackEntry>) CollectionsKt.minus(mutableStateFlow.getValue(), CollectionsKt.last((List) o0000o00OooO0O0.f28434OooO0O0.getValue())), backStackEntry));
                    }
                }
                OooOo0();
                it = this.f28474OooOo0o.values().iterator();
                while (it.hasNext()) {
                    ((OooO00o) it.next()).f28436OooO0Oo = false;
                }
                if (!zOooOOO || booleanRef.element || z) {
                    OooO0O0();
                } else {
                    OooOo00();
                    return;
                }
            }
            List<NavBackStackEntry> listListOf = CollectionsKt.listOf(NavBackStackEntry.Companion.OooO0O0(NavBackStackEntry.INSTANCE, this.f28452OooO00o, navDestination, bundleOooO0O0, OooO(), this.f28466OooOOOo));
            this.f28470OooOo = new OooO(booleanRef, this, navDestination, bundleOooO0O0);
            navigatorOooO0O0.OooO0Oo(listListOf, o00000Var, oooO00o);
            this.f28470OooOo = null;
        }
        z = false;
        OooOo0();
        it = this.f28474OooOo0o.values().iterator();
        while (it.hasNext()) {
            ((OooO00o) it.next()).f28436OooO0Oo = false;
        }
        if (zOooOOO) {
        }
        OooO0O0();
    }

    @MainThread
    public final boolean OooOOO(@IdRes int i, boolean z, boolean z2) {
        NavDestination navDestination;
        String str;
        Ref.BooleanRef booleanRef;
        if (this.f28458OooO0oO.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = CollectionsKt.reversed(this.f28458OooO0oO).iterator();
        while (true) {
            if (!it.hasNext()) {
                navDestination = null;
                break;
            }
            NavDestination destination = ((NavBackStackEntry) it.next()).getDestination();
            Navigator navigatorOooO0O0 = this.f28473OooOo0O.OooO0O0(destination.f8631Oooo0o);
            if (z || destination.f8637OoooO0O != i) {
                arrayList.add(navigatorOooO0O0);
            }
            if (destination.f8637OoooO0O == i) {
                navDestination = destination;
                break;
            }
        }
        if (navDestination == null) {
            Log.i("NavController", "Ignoring popBackStack to destination " + NavDestination.f8629OoooOO0.OooO0O0(this.f28452OooO00o, i) + " as it was not found on the current back stack");
            return false;
        }
        Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
        ArrayDeque<NavBackStackEntryState> arrayDeque = new ArrayDeque<>();
        Iterator it2 = arrayList.iterator();
        do {
            if (!it2.hasNext()) {
                str = null;
                break;
            }
            Navigator navigator = (Navigator) it2.next();
            booleanRef = new Ref.BooleanRef();
            NavBackStackEntry navBackStackEntryLast = this.f28458OooO0oO.last();
            this.f28476OooOoO0 = new OooOO0O(booleanRef, booleanRef2, this, z2, arrayDeque);
            navigator.OooO0o0(navBackStackEntryLast, z2);
            str = null;
            this.f28476OooOoO0 = null;
        } while (booleanRef.element);
        if (z2) {
            if (!z) {
                for (NavDestination navDestination2 : SequencesKt.takeWhile(SequencesKt.generateSequence(navDestination, OooOOO0.f28500Oooo0o), new OooOOO())) {
                    Map<Integer, String> map = this.f28462OooOO0o;
                    Integer numValueOf = Integer.valueOf(navDestination2.f8637OoooO0O);
                    NavBackStackEntryState navBackStackEntryStateFirstOrNull = arrayDeque.firstOrNull();
                    map.put(numValueOf, navBackStackEntryStateFirstOrNull != null ? navBackStackEntryStateFirstOrNull.f8626Oooo0o : str);
                }
            }
            if (!arrayDeque.isEmpty()) {
                NavBackStackEntryState navBackStackEntryStateFirst = arrayDeque.first();
                Iterator it3 = SequencesKt.takeWhile(SequencesKt.generateSequence(OooO0OO(navBackStackEntryStateFirst.f8627Oooo0oO), OooOOOO.f28501Oooo0o), new OooOo00()).iterator();
                while (it3.hasNext()) {
                    this.f28462OooOO0o.put(Integer.valueOf(((NavDestination) it3.next()).f8637OoooO0O), navBackStackEntryStateFirst.f8626Oooo0o);
                }
                this.f28464OooOOO0.put(navBackStackEntryStateFirst.f8626Oooo0o, arrayDeque);
            }
        }
        OooOo0();
        return booleanRef2.element;
    }

    @MainThread
    public final boolean OooOOO0() {
        if (!this.f28458OooO0oO.isEmpty()) {
            NavDestination navDestinationOooO0oO = OooO0oO();
            Intrinsics.checkNotNull(navDestinationOooO0oO);
            if (OooOOO(navDestinationOooO0oO.f8637OoooO0O, true, false) && OooO0O0()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.LinkedHashMap, java.util.Map<androidx.navigation.Navigator<? extends androidx.navigation.NavDestination>, o000OooO.o00Oo0$OooO00o>] */
    public final void OooOOOO(NavBackStackEntry navBackStackEntry, boolean z, ArrayDeque<NavBackStackEntryState> arrayDeque) {
        o0ooOOo o0ooooo2;
        StateFlow<Set<NavBackStackEntry>> stateFlow;
        Set<NavBackStackEntry> value;
        NavBackStackEntry navBackStackEntryLast = this.f28458OooO0oO.last();
        if (!Intrinsics.areEqual(navBackStackEntryLast, navBackStackEntry)) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Attempted to pop ");
            sbOooO0o0.append(navBackStackEntry.getDestination());
            sbOooO0o0.append(", which is not the top of the back stack (");
            sbOooO0o0.append(navBackStackEntryLast.getDestination());
            sbOooO0o0.append(')');
            throw new IllegalStateException(sbOooO0o0.toString().toString());
        }
        this.f28458OooO0oO.removeLast();
        OooO00o oooO00o = (OooO00o) this.f28474OooOo0o.get(this.f28473OooOo0O.OooO0O0(navBackStackEntryLast.getDestination().f8631Oooo0o));
        boolean z2 = (oooO00o != null && (stateFlow = oooO00o.f28437OooO0o) != null && (value = stateFlow.getValue()) != null && value.contains(navBackStackEntryLast)) || this.f28461OooOO0O.containsKey(navBackStackEntryLast);
        Lifecycle.State currentState = navBackStackEntryLast.getLifecycle().getCurrentState();
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
                OooOOoo(navBackStackEntryLast);
            }
        }
        if (z || z2 || (o0ooooo2 = this.f28466OooOOOo) == null) {
            return;
        }
        String backStackEntryId = navBackStackEntryLast.getId();
        Intrinsics.checkNotNullParameter(backStackEntryId, "backStackEntryId");
        ViewModelStore viewModelStoreRemove = o0ooooo2.f28532OooO00o.remove(backStackEntryId);
        if (viewModelStoreRemove != null) {
            viewModelStoreRemove.clear();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Integer, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Integer, java.lang.String>] */
    public final boolean OooOOo(int i, Bundle bundle, o00000 o00000Var, Navigator.OooO00o oooO00o) {
        NavDestination navDestinationOooO0oo;
        NavBackStackEntry navBackStackEntry;
        NavDestination destination;
        if (!this.f28462OooOO0o.containsKey(Integer.valueOf(i))) {
            return false;
        }
        String str = (String) this.f28462OooOO0o.get(Integer.valueOf(i));
        CollectionsKt.removeAll(this.f28462OooOO0o.values(), new OooOo(str));
        ArrayDeque<NavBackStackEntryState> arrayDeque = (ArrayDeque) TypeIntrinsics.asMutableMap(this.f28464OooOOO0).remove(str);
        ArrayList arrayList = new ArrayList();
        NavBackStackEntry navBackStackEntryLastOrNull = this.f28458OooO0oO.lastOrNull();
        if (navBackStackEntryLastOrNull == null || (navDestinationOooO0oo = navBackStackEntryLastOrNull.getDestination()) == null) {
            navDestinationOooO0oo = OooO0oo();
        }
        if (arrayDeque != null) {
            for (NavBackStackEntryState navBackStackEntryState : arrayDeque) {
                NavDestination navDestinationOooO0Oo = OooO0Oo(navDestinationOooO0oo, navBackStackEntryState.f8627Oooo0oO);
                if (navDestinationOooO0Oo == null) {
                    throw new IllegalStateException(("Restore State failed: destination " + NavDestination.f8629OoooOO0.OooO0O0(this.f28452OooO00o, navBackStackEntryState.f8627Oooo0oO) + " cannot be found from the current destination " + navDestinationOooO0oo).toString());
                }
                arrayList.add(navBackStackEntryState.OooO00o(this.f28452OooO00o, navDestinationOooO0Oo, OooO(), this.f28466OooOOOo));
                navDestinationOooO0oo = navDestinationOooO0Oo;
            }
        }
        ArrayList<List<NavBackStackEntry>> arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList) {
            if (!(((NavBackStackEntry) obj).getDestination() instanceof androidx.navigation.OooO0OO)) {
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
            if (list != null && (navBackStackEntry = (NavBackStackEntry) CollectionsKt.last(list)) != null && (destination = navBackStackEntry.getDestination()) != null) {
                str2 = destination.f8631Oooo0o;
            }
            if (Intrinsics.areEqual(str2, navBackStackEntry2.getDestination().f8631Oooo0o)) {
                list.add(navBackStackEntry2);
            } else {
                arrayList2.add(CollectionsKt.mutableListOf(navBackStackEntry2));
            }
        }
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        for (List<NavBackStackEntry> list2 : arrayList2) {
            Navigator navigatorOooO0O0 = this.f28473OooOo0O.OooO0O0(((NavBackStackEntry) CollectionsKt.first((List) list2)).getDestination().f8631Oooo0o);
            this.f28470OooOo = new Oooo000(booleanRef, arrayList, new Ref.IntRef(), this, bundle);
            navigatorOooO0O0.OooO0Oo(list2, o00000Var, oooO00o);
            this.f28470OooOo = null;
        }
        return booleanRef.element;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.LinkedHashMap, java.util.Map<androidx.navigation.Navigator<? extends androidx.navigation.NavDestination>, o000OooO.o00Oo0$OooO00o>] */
    @NotNull
    public final List<NavBackStackEntry> OooOOo0() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f28474OooOo0o.values().iterator();
        while (it.hasNext()) {
            Set<NavBackStackEntry> value = ((OooO00o) it.next()).f28437OooO0o.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : value) {
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
                if ((arrayList.contains(navBackStackEntry) || navBackStackEntry.getMaxLifecycle().isAtLeast(Lifecycle.State.STARTED)) ? false : true) {
                    arrayList2.add(obj);
                }
            }
            CollectionsKt.addAll(arrayList, arrayList2);
        }
        ArrayDeque<NavBackStackEntry> arrayDeque = this.f28458OooO0oO;
        ArrayList arrayList3 = new ArrayList();
        for (NavBackStackEntry navBackStackEntry2 : arrayDeque) {
            NavBackStackEntry navBackStackEntry3 = navBackStackEntry2;
            if (!arrayList.contains(navBackStackEntry3) && navBackStackEntry3.getMaxLifecycle().isAtLeast(Lifecycle.State.STARTED)) {
                arrayList3.add(navBackStackEntry2);
            }
        }
        CollectionsKt.addAll(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!(((NavBackStackEntry) obj2).getDestination() instanceof androidx.navigation.OooO0OO)) {
                arrayList4.add(obj2);
            }
        }
        return arrayList4;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.LinkedHashMap, java.util.Map<androidx.navigation.NavBackStackEntry, java.util.concurrent.atomic.AtomicInteger>] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.LinkedHashMap, java.util.Map<androidx.navigation.Navigator<? extends androidx.navigation.NavDestination>, o000OooO.o00Oo0$OooO00o>] */
    @Nullable
    public final NavBackStackEntry OooOOoo(@NotNull NavBackStackEntry child) {
        Intrinsics.checkNotNullParameter(child, "child");
        NavBackStackEntry navBackStackEntryRemove = this.f28460OooOO0.remove(child);
        if (navBackStackEntryRemove == null) {
            return null;
        }
        AtomicInteger atomicInteger = (AtomicInteger) this.f28461OooOO0O.get(navBackStackEntryRemove);
        Integer numValueOf = atomicInteger != null ? Integer.valueOf(atomicInteger.decrementAndGet()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            OooO00o oooO00o = (OooO00o) this.f28474OooOo0o.get(this.f28473OooOo0O.OooO0O0(navBackStackEntryRemove.getDestination().f8631Oooo0o));
            if (oooO00o != null) {
                oooO00o.OooO0O0(navBackStackEntryRemove);
            }
            this.f28461OooOO0O.remove(navBackStackEntryRemove);
        }
        return navBackStackEntryRemove;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003b  */
    public final void OooOo0() {
        boolean z;
        int i;
        OooOO0 oooOO1 = this.f28472OooOo00;
        if (this.f28471OooOo0) {
            ArrayDeque<NavBackStackEntry> arrayDeque = this.f28458OooO0oO;
            if ((arrayDeque instanceof Collection) && arrayDeque.isEmpty()) {
                i = 0;
            } else {
                Iterator<NavBackStackEntry> it = arrayDeque.iterator();
                i = 0;
                while (it.hasNext()) {
                    if ((!(it.next().getDestination() instanceof androidx.navigation.OooO0OO)) && (i = i + 1) < 0) {
                        CollectionsKt.throwCountOverflow();
                    }
                }
            }
            z = i > 1;
        }
        oooOO1.f4327OooO00o = z;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00b7  */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.util.LinkedHashMap, java.util.Map<androidx.navigation.NavBackStackEntry, java.util.concurrent.atomic.AtomicInteger>] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.LinkedHashMap, java.util.Map<androidx.navigation.Navigator<? extends androidx.navigation.NavDestination>, o000OooO.o00Oo0$OooO00o>] */
    public final void OooOo00() {
        NavDestination destination;
        StateFlow<Set<NavBackStackEntry>> stateFlow;
        Set<NavBackStackEntry> value;
        List<NavBackStackEntry> mutableList = CollectionsKt.toMutableList((Collection) this.f28458OooO0oO);
        if (mutableList.isEmpty()) {
            return;
        }
        NavDestination destination2 = ((NavBackStackEntry) CollectionsKt.last(mutableList)).getDestination();
        if (!(destination2 instanceof p086o000OooO.Oooo000)) {
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
            if (!(destination instanceof androidx.navigation.OooO0OO) && !(destination instanceof p086o000OooO.Oooo000)) {
                break;
            }
        }
        HashMap map = new HashMap();
        for (NavBackStackEntry navBackStackEntry : CollectionsKt.reversed(mutableList)) {
            Lifecycle.State maxLifecycle = navBackStackEntry.getMaxLifecycle();
            NavDestination destination3 = navBackStackEntry.getDestination();
            if (destination2 != null && destination3.f8637OoooO0O == destination2.f8637OoooO0O) {
                Lifecycle.State state = Lifecycle.State.RESUMED;
                if (maxLifecycle != state) {
                    OooO00o oooO00o = (OooO00o) this.f28474OooOo0o.get(this.f28473OooOo0O.OooO0O0(navBackStackEntry.getDestination().f8631Oooo0o));
                    if (Intrinsics.areEqual((oooO00o == null || (stateFlow = oooO00o.f28437OooO0o) == null || (value = stateFlow.getValue()) == null) ? null : Boolean.valueOf(value.contains(navBackStackEntry)), Boolean.TRUE)) {
                        map.put(navBackStackEntry, Lifecycle.State.STARTED);
                    } else {
                        AtomicInteger atomicInteger = (AtomicInteger) this.f28461OooOO0O.get(navBackStackEntry);
                        boolean z = false;
                        if (atomicInteger != null && atomicInteger.get() == 0) {
                            z = true;
                        }
                        if (z) {
                            map.put(navBackStackEntry, Lifecycle.State.STARTED);
                        } else {
                            map.put(navBackStackEntry, state);
                        }
                    }
                }
                destination2 = destination2.f8632Oooo0oO;
            } else if (destination == null || destination3.f8637OoooO0O != destination.f8637OoooO0O) {
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
                destination = destination.f8632Oooo0oO;
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
}
