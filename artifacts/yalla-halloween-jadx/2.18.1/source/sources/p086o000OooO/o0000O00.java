package p086o000OooO;

import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class o0000O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final ReentrantLock f28433OooO00o = new ReentrantLock(true);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<List<NavBackStackEntry>> f28434OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Set<NavBackStackEntry>> f28435OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean f28436OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final StateFlow<Set<NavBackStackEntry>> f28437OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final StateFlow<List<NavBackStackEntry>> f28438OooO0o0;

    public o0000O00() {
        MutableStateFlow<List<NavBackStackEntry>> MutableStateFlow = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this.f28434OooO0O0 = MutableStateFlow;
        MutableStateFlow<Set<NavBackStackEntry>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(SetsKt.emptySet());
        this.f28435OooO0OO = MutableStateFlow2;
        this.f28438OooO0o0 = FlowKt.asStateFlow(MutableStateFlow);
        this.f28437OooO0o = FlowKt.asStateFlow(MutableStateFlow2);
    }

    @NotNull
    public abstract NavBackStackEntry OooO00o(@NotNull NavDestination navDestination, @Nullable Bundle bundle);

    public void OooO0O0(@NotNull NavBackStackEntry entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        MutableStateFlow<Set<NavBackStackEntry>> mutableStateFlow = this.f28435OooO0OO;
        mutableStateFlow.setValue(SetsKt.minus(mutableStateFlow.getValue(), entry));
    }

    public void OooO0OO(@NotNull NavBackStackEntry popUpTo, boolean z) {
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        ReentrantLock reentrantLock = this.f28433OooO00o;
        reentrantLock.lock();
        try {
            MutableStateFlow<List<NavBackStackEntry>> mutableStateFlow = this.f28434OooO0O0;
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
        NavBackStackEntry navBackStackEntryPrevious;
        NavBackStackEntry navBackStackEntry;
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        MutableStateFlow<Set<NavBackStackEntry>> mutableStateFlow = this.f28435OooO0OO;
        mutableStateFlow.setValue(SetsKt.plus(mutableStateFlow.getValue(), popUpTo));
        List<NavBackStackEntry> value = this.f28438OooO0o0.getValue();
        ListIterator<NavBackStackEntry> listIterator = value.listIterator(value.size());
        do {
            if (!listIterator.hasPrevious()) {
                navBackStackEntryPrevious = null;
                break;
            } else {
                navBackStackEntryPrevious = listIterator.previous();
                navBackStackEntry = navBackStackEntryPrevious;
            }
        } while (!(!Intrinsics.areEqual(navBackStackEntry, popUpTo) && this.f28438OooO0o0.getValue().lastIndexOf(navBackStackEntry) < this.f28438OooO0o0.getValue().lastIndexOf(popUpTo)));
        NavBackStackEntry navBackStackEntry2 = navBackStackEntryPrevious;
        if (navBackStackEntry2 != null) {
            MutableStateFlow<Set<NavBackStackEntry>> mutableStateFlow2 = this.f28435OooO0OO;
            mutableStateFlow2.setValue(SetsKt.plus(mutableStateFlow2.getValue(), navBackStackEntry2));
        }
        OooO0OO(popUpTo, z);
    }

    public final void OooO0o(@NotNull NavBackStackEntry backStackEntry) {
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) CollectionsKt.lastOrNull((List) this.f28438OooO0o0.getValue());
        if (navBackStackEntry != null) {
            MutableStateFlow<Set<NavBackStackEntry>> mutableStateFlow = this.f28435OooO0OO;
            mutableStateFlow.setValue(SetsKt.plus(mutableStateFlow.getValue(), navBackStackEntry));
        }
        MutableStateFlow<Set<NavBackStackEntry>> mutableStateFlow2 = this.f28435OooO0OO;
        mutableStateFlow2.setValue(SetsKt.plus(mutableStateFlow2.getValue(), backStackEntry));
        OooO0o0(backStackEntry);
    }

    public void OooO0o0(@NotNull NavBackStackEntry backStackEntry) {
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        ReentrantLock reentrantLock = this.f28433OooO00o;
        reentrantLock.lock();
        try {
            MutableStateFlow<List<NavBackStackEntry>> mutableStateFlow = this.f28434OooO0O0;
            mutableStateFlow.setValue(CollectionsKt.plus((Collection<? extends NavBackStackEntry>) mutableStateFlow.getValue(), backStackEntry));
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }
}
