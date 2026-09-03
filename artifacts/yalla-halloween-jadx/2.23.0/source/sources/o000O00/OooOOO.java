package o000O00;

import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavBackStackEntryState;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO extends Lambda implements Function1<NavBackStackEntry, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f34353OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ androidx.navigation.OooO0O0 f34354OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f34355OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ boolean f34356OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ ArrayDeque<NavBackStackEntryState> f34357OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO(Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2, androidx.navigation.OooO0O0 oooO0O0, boolean z, ArrayDeque<NavBackStackEntryState> arrayDeque) {
        super(1);
        this.f34353OooO0Oo = booleanRef;
        this.f34355OooO0o0 = booleanRef2;
        this.f34354OooO0o = oooO0O0;
        this.f34356OooO0oO = z;
        this.f34357OooO0oo = arrayDeque;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(NavBackStackEntry navBackStackEntry) {
        NavBackStackEntry entry = navBackStackEntry;
        Intrinsics.checkNotNullParameter(entry, "entry");
        this.f34353OooO0Oo.element = true;
        this.f34355OooO0o0.element = true;
        this.f34354OooO0o.OooOOO(entry, this.f34356OooO0oO, this.f34357OooO0oo);
        return Unit.INSTANCE;
    }
}
