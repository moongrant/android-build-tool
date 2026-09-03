package p105o000oo0o;

import android.os.Bundle;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nNavigatorState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigatorState.kt\nandroidx/navigation/NavigatorState\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,228:1\n1747#2,3:229\n1747#2,3:232\n959#2,7:235\n1747#2,3:242\n2624#2,3:245\n533#2,6:248\n378#2,7:254\n451#2,6:261\n*S KotlinDebug\n*F\n+ 1 NavigatorState.kt\nandroidx/navigation/NavigatorState\n*L\n83#1:229,3\n84#1:232,3\n112#1:235,7\n134#1:242,3\n135#1:245,3\n140#1:248,6\n167#1:254,7\n192#1:261,6\n*E\n"})
public abstract class o00O0O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final ReentrantLock f35763OooO00o = new ReentrantLock(true);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<List<NavBackStackEntry>> f35764OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Set<NavBackStackEntry>> f35765OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f35766OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final StateFlow<Set<NavBackStackEntry>> f35767OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final StateFlow<List<NavBackStackEntry>> f35768OooO0o0;

    public o00O0O00() {
        MutableStateFlow<List<NavBackStackEntry>> MutableStateFlow = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this.f35764OooO0O0 = MutableStateFlow;
        MutableStateFlow<Set<NavBackStackEntry>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(SetsKt.emptySet());
        this.f35765OooO0OO = MutableStateFlow2;
        this.f35768OooO0o0 = FlowKt.asStateFlow(MutableStateFlow);
        this.f35767OooO0o = FlowKt.asStateFlow(MutableStateFlow2);
    }

    @NotNull
    public abstract NavBackStackEntry OooO00o(@NotNull NavDestination navDestination, @Nullable Bundle bundle);

    public void OooO0O0(@NotNull NavBackStackEntry entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        MutableStateFlow<Set<NavBackStackEntry>> mutableStateFlow = this.f35765OooO0OO;
        mutableStateFlow.setValue(SetsKt.minus(mutableStateFlow.getValue(), entry));
    }

    public void OooO0OO(@NotNull NavBackStackEntry popUpTo, boolean z) {
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        ReentrantLock reentrantLock = this.f35763OooO00o;
        reentrantLock.lock();
        try {
            MutableStateFlow<List<NavBackStackEntry>> mutableStateFlow = this.f35764OooO0O0;
            List<NavBackStackEntry> value = mutableStateFlow.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : value) {
                if (!(!Intrinsics.areEqual((NavBackStackEntry) obj, popUpTo))) {
                    break;
                } else {
                    arrayList.add(obj);
                }
            }
            mutableStateFlow.setValue(arrayList);
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void OooO0Oo(@NotNull NavBackStackEntry popUpTo, boolean z) {
        boolean z2;
        NavBackStackEntry navBackStackEntryPrevious;
        NavBackStackEntry navBackStackEntry;
        boolean z3;
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        MutableStateFlow<Set<NavBackStackEntry>> mutableStateFlow = this.f35765OooO0OO;
        Set<NavBackStackEntry> value = mutableStateFlow.getValue();
        if (!(value instanceof Collection) || !value.isEmpty()) {
            Iterator<T> it = value.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z2 = false;
                    break;
                } else {
                    if (((NavBackStackEntry) it.next()) == popUpTo) {
                        z2 = true;
                        break;
                    }
                }
            }
        } else {
            z2 = false;
            break;
        }
        StateFlow<List<NavBackStackEntry>> stateFlow = this.f35768OooO0o0;
        if (z2) {
            List<NavBackStackEntry> value2 = stateFlow.getValue();
            if (!(value2 instanceof Collection) || !value2.isEmpty()) {
                Iterator<T> it2 = value2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z3 = true;
                        break;
                    } else {
                        if (((NavBackStackEntry) it2.next()) == popUpTo) {
                            z3 = false;
                            break;
                        }
                    }
                }
            } else {
                z3 = true;
                break;
            }
            if (z3) {
                return;
            }
        }
        mutableStateFlow.setValue(SetsKt.plus(mutableStateFlow.getValue(), popUpTo));
        List<NavBackStackEntry> value3 = stateFlow.getValue();
        ListIterator<NavBackStackEntry> listIterator = value3.listIterator(value3.size());
        do {
            if (!listIterator.hasPrevious()) {
                navBackStackEntryPrevious = null;
                break;
            } else {
                navBackStackEntryPrevious = listIterator.previous();
                navBackStackEntry = navBackStackEntryPrevious;
            }
        } while (!(!Intrinsics.areEqual(navBackStackEntry, popUpTo) && stateFlow.getValue().lastIndexOf(navBackStackEntry) < stateFlow.getValue().lastIndexOf(popUpTo)));
        NavBackStackEntry navBackStackEntry2 = navBackStackEntryPrevious;
        if (navBackStackEntry2 != null) {
            mutableStateFlow.setValue(SetsKt.plus(mutableStateFlow.getValue(), navBackStackEntry2));
        }
        OooO0OO(popUpTo, z);
    }

    public void OooO0o0(@NotNull NavBackStackEntry backStackEntry) {
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        ReentrantLock reentrantLock = this.f35763OooO00o;
        reentrantLock.lock();
        try {
            MutableStateFlow<List<NavBackStackEntry>> mutableStateFlow = this.f35764OooO0O0;
            mutableStateFlow.setValue(CollectionsKt.plus((Collection<? extends NavBackStackEntry>) mutableStateFlow.getValue(), backStackEntry));
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }
}
