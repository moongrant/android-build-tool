package androidx.navigation;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO extends Lambda implements Function1<NavBackStackEntry, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f6889OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Ref.IntRef f6890OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ List<NavBackStackEntry> f6891OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ OooO0O0 f6892OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ Bundle f6893OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0OO(Ref.BooleanRef booleanRef, ArrayList arrayList, Ref.IntRef intRef, OooO0O0 oooO0O0, Bundle bundle) {
        super(1);
        this.f6889OooO0Oo = booleanRef;
        this.f6891OooO0o0 = arrayList;
        this.f6890OooO0o = intRef;
        this.f6892OooO0oO = oooO0O0;
        this.f6893OooO0oo = bundle;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(NavBackStackEntry navBackStackEntry) {
        List<NavBackStackEntry> listEmptyList;
        NavBackStackEntry entry = navBackStackEntry;
        Intrinsics.checkNotNullParameter(entry, "entry");
        this.f6889OooO0Oo.element = true;
        List<NavBackStackEntry> list = this.f6891OooO0o0;
        int iIndexOf = list.indexOf(entry);
        if (iIndexOf != -1) {
            Ref.IntRef intRef = this.f6890OooO0o;
            int i = iIndexOf + 1;
            listEmptyList = list.subList(intRef.element, i);
            intRef.element = i;
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        this.f6892OooO0oO.OooO00o(entry.getDestination(), this.f6893OooO0oo, entry, listEmptyList);
        return Unit.INSTANCE;
    }
}
