package androidx.navigation;

import androidx.annotation.IdRes;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import o000O00.o000000O;
import o000O00.o0O0O00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p188o00o0O.Oooo0;
import p188o00o0O.o000oOoO;
import p188o00o0O.o0OoOo0;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nNavGraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavGraph.kt\nandroidx/navigation/NavGraph\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 6 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n+ 7 SparseArray.kt\nandroidx/collection/SparseArrayKt\n*L\n1#1,479:1\n232#2,3:480\n1603#3,9:483\n1855#3:492\n1856#3:494\n1612#3:495\n1#4:493\n1#4:496\n179#5,2:497\n32#6,2:499\n22#7:501\n56#7,4:502\n*S KotlinDebug\n*F\n+ 1 NavGraph.kt\nandroidx/navigation/NavGraph\n*L\n59#1:480,3\n71#1:483,9\n71#1:492\n71#1:494\n71#1:495\n71#1:493\n196#1:497,2\n387#1:499,2\n389#1:501\n396#1:502,4\n*E\n"})
public class OooO extends NavDestination implements Iterable<NavDestination>, KMappedMarker {

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public static final /* synthetic */ int f6834OooOOo0 = 0;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f6835OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final Oooo0<NavDestination> f6836OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @Nullable
    public String f6837OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @Nullable
    public String f6838OooOOOo;

    @SourceDebugExtension({"SMAP\nNavGraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavGraph.kt\nandroidx/navigation/NavGraph$iterator$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,479:1\n1#2:480\n*E\n"})
    public static final class OooO00o implements Iterator<NavDestination>, KMutableIterator {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f6839OooO0Oo = -1;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f6841OooO0o0;

        public OooO00o() {
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f6839OooO0Oo + 1 < OooO.this.f6836OooOOO0.OooO();
        }

        @Override // java.util.Iterator
        public final NavDestination next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f6841OooO0o0 = true;
            Oooo0<NavDestination> oooo0 = OooO.this.f6836OooOOO0;
            int i = this.f6839OooO0Oo + 1;
            this.f6839OooO0Oo = i;
            NavDestination navDestinationOooOO0 = oooo0.OooOO0(i);
            Intrinsics.checkNotNullExpressionValue(navDestinationOooOO0, "nodes.valueAt(++index)");
            return navDestinationOooOO0;
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.f6841OooO0o0) {
                throw new IllegalStateException("You must call next() before you can remove an element".toString());
            }
            Oooo0<NavDestination> oooo0 = OooO.this.f6836OooOOO0;
            oooo0.OooOO0(this.f6839OooO0Oo).f6818OooO0o0 = null;
            int i = this.f6839OooO0Oo;
            Object[] objArr = oooo0.f38808OooO0o;
            Object obj = objArr[i];
            Object obj2 = Oooo0.f38806OooO0oo;
            if (obj != obj2) {
                objArr[i] = obj2;
                oooo0.f38807OooO0Oo = true;
            }
            this.f6839OooO0Oo = i - 1;
            this.f6841OooO0o0 = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO(@NotNull Navigator<? extends OooO> navGraphNavigator) {
        super(navGraphNavigator);
        Intrinsics.checkNotNullParameter(navGraphNavigator, "navGraphNavigator");
        this.f6836OooOOO0 = new Oooo0<>();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Nullable
    public final NavDestination OooO(@NotNull String route, boolean z) {
        OooO oooO;
        Object next;
        Intrinsics.checkNotNullParameter(route, "route");
        int iHashCode = (route != null ? "android-app://androidx.navigation/".concat(route) : "").hashCode();
        Oooo0<NavDestination> oooo0 = this.f6836OooOOO0;
        NavDestination navDestination = (NavDestination) oooo0.OooO0o(iHashCode, null);
        if (navDestination == null) {
            Iterator it = SequencesKt.asSequence(o0OoOo0.OooO00o(oooo0)).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((NavDestination) next).OooO0Oo(route) != null));
            navDestination = (NavDestination) next;
        }
        if (navDestination != null) {
            return navDestination;
        }
        if (!z || (oooO = this.f6818OooO0o0) == null) {
            return null;
        }
        Intrinsics.checkNotNull(oooO);
        if (route == null || StringsKt.isBlank(route)) {
            return null;
        }
        return oooO.OooO(route, true);
    }

    @Override // androidx.navigation.NavDestination
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Nullable
    public final NavDestination.OooO0O0 OooO0o0(@NotNull o0O0O00 navDeepLinkRequest) {
        Intrinsics.checkNotNullParameter(navDeepLinkRequest, "navDeepLinkRequest");
        NavDestination.OooO0O0 OooO0o1 = super.OooO0o0(navDeepLinkRequest);
        ArrayList arrayList = new ArrayList();
        OooO00o oooO00o = new OooO00o();
        while (oooO00o.hasNext()) {
            NavDestination.OooO0O0 OooO0o2 = ((NavDestination) oooO00o.next()).OooO0o0(navDeepLinkRequest);
            if (OooO0o2 != null) {
                arrayList.add(OooO0o2);
            }
        }
        return (NavDestination.OooO0O0) CollectionsKt___CollectionsKt.maxOrNull((Iterable) CollectionsKt.listOfNotNull((Object[]) new NavDestination.OooO0O0[]{OooO0o1, (NavDestination.OooO0O0) CollectionsKt___CollectionsKt.maxOrNull((Iterable) arrayList)}));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Nullable
    public final NavDestination OooO0oo(@IdRes int i, boolean z) {
        OooO oooO;
        NavDestination navDestination = (NavDestination) this.f6836OooOOO0.OooO0o(i, null);
        if (navDestination != null) {
            return navDestination;
        }
        if (!z || (oooO = this.f6818OooO0o0) == null) {
            return null;
        }
        Intrinsics.checkNotNull(oooO);
        return oooO.OooO0oo(i, true);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Nullable
    public final NavDestination.OooO0O0 OooOO0(@NotNull o0O0O00 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return super.OooO0o0(request);
    }

    @Override // androidx.navigation.NavDestination
    public final boolean equals(@Nullable Object obj) {
        if (obj != null && (obj instanceof OooO)) {
            Oooo0<NavDestination> oooo0 = this.f6836OooOOO0;
            List mutableList = SequencesKt.toMutableList(SequencesKt.asSequence(o0OoOo0.OooO00o(oooo0)));
            OooO oooO = (OooO) obj;
            Oooo0<NavDestination> oooo1 = oooO.f6836OooOOO0;
            o000oOoO o000ooooOooO00o = o0OoOo0.OooO00o(oooo1);
            while (o000ooooOooO00o.hasNext()) {
                mutableList.remove((NavDestination) o000ooooOooO00o.next());
            }
            if (super.equals(obj) && oooo0.OooO() == oooo1.OooO() && this.f6835OooOOO == oooO.f6835OooOOO && mutableList.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.navigation.NavDestination
    public final int hashCode() {
        int iOooO00o = this.f6835OooOOO;
        Oooo0<NavDestination> oooo0 = this.f6836OooOOO0;
        int iOooO = oooo0.OooO();
        for (int i = 0; i < iOooO; i++) {
            iOooO00o = o000000O.OooO00o(iOooO00o, 31, oooo0.OooO0oO(i), 31) + oooo0.OooOO0(i).hashCode();
        }
        return iOooO00o;
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<NavDestination> iterator() {
        return new OooO00o();
    }

    @Override // androidx.navigation.NavDestination
    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        String str = this.f6838OooOOOo;
        NavDestination navDestinationOooO = !(str == null || StringsKt.isBlank(str)) ? OooO(str, true) : null;
        if (navDestinationOooO == null) {
            navDestinationOooO = OooO0oo(this.f6835OooOOO, true);
        }
        sb.append(" startDestination=");
        if (navDestinationOooO == null) {
            String str2 = this.f6838OooOOOo;
            if (str2 != null) {
                sb.append(str2);
            } else {
                String str3 = this.f6837OooOOOO;
                if (str3 != null) {
                    sb.append(str3);
                } else {
                    sb.append("0x" + Integer.toHexString(this.f6835OooOOO));
                }
            }
        } else {
            sb.append("{");
            sb.append(navDestinationOooO.toString());
            sb.append("}");
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
        return string;
    }
}
