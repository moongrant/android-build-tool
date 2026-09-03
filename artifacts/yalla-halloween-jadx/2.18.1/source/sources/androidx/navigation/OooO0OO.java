package androidx.navigation;

import androidx.annotation.IdRes;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p016OooOoO0.OooOo00;
import p021OooOooo.o0OOO0o;
import p021OooOooo.o0ooOOo;
import p086o000OooO.oo0o0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO extends NavDestination implements Iterable<NavDestination>, KMappedMarker {

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    @NotNull
    public static final OooO00o f8652OoooOoO = new OooO00o();

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public int f8653OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    @Nullable
    public String f8654OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    @Nullable
    public String f8655OoooOo0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @NotNull
    public final o0ooOOo<NavDestination> f8656o000oOoO;

    public static final class OooO00o {
    }

    public static final class OooO0O0 implements Iterator<NavDestination>, KMutableIterator {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f8657Oooo0o = -1;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public boolean f8658Oooo0oO;

        public OooO0O0() {
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f8657Oooo0o + 1 < OooO0OO.this.f8656o000oOoO.OooOO0o();
        }

        @Override // java.util.Iterator
        public final NavDestination next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f8658Oooo0oO = true;
            o0ooOOo<NavDestination> o0ooooo2 = OooO0OO.this.f8656o000oOoO;
            int i = this.f8657Oooo0o + 1;
            this.f8657Oooo0o = i;
            NavDestination navDestinationOooOOO0 = o0ooooo2.OooOOO0(i);
            Intrinsics.checkNotNullExpressionValue(navDestinationOooOOO0, "nodes.valueAt(++index)");
            return navDestinationOooOOO0;
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.f8658Oooo0oO) {
                throw new IllegalStateException("You must call next() before you can remove an element".toString());
            }
            o0ooOOo<NavDestination> o0ooooo2 = OooO0OO.this.f8656o000oOoO;
            o0ooooo2.OooOOO0(this.f8657Oooo0o).f8632Oooo0oO = null;
            int i = this.f8657Oooo0o;
            Object[] objArr = o0ooooo2.f438Oooo0oo;
            Object obj = objArr[i];
            Object obj2 = o0ooOOo.f434OoooO00;
            if (obj != obj2) {
                objArr[i] = obj2;
                o0ooooo2.f436Oooo0o = true;
            }
            this.f8657Oooo0o = i - 1;
            this.f8658Oooo0oO = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0OO(@NotNull Navigator<? extends OooO0OO> navGraphNavigator) {
        super(navGraphNavigator);
        Intrinsics.checkNotNullParameter(navGraphNavigator, "navGraphNavigator");
        this.f8656o000oOoO = new o0ooOOo<>();
    }

    @Nullable
    public final NavDestination OooO(@Nullable String str) {
        if (str == null || StringsKt.isBlank(str)) {
            return null;
        }
        return OooOO0(str, true);
    }

    @Override // androidx.navigation.NavDestination
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Nullable
    public final NavDestination.OooO0O0 OooO0o0(@NotNull oo0o0Oo navDeepLinkRequest) {
        Intrinsics.checkNotNullParameter(navDeepLinkRequest, "navDeepLinkRequest");
        NavDestination.OooO0O0 OooO0o1 = super.OooO0o0(navDeepLinkRequest);
        ArrayList arrayList = new ArrayList();
        OooO0O0 oooO0O0 = new OooO0O0();
        while (oooO0O0.hasNext()) {
            NavDestination.OooO0O0 OooO0o2 = ((NavDestination) oooO0O0.next()).OooO0o0(navDeepLinkRequest);
            if (OooO0o2 != null) {
                arrayList.add(OooO0o2);
            }
        }
        return (NavDestination.OooO0O0) CollectionsKt.maxOrNull((Iterable) CollectionsKt.listOfNotNull((Object[]) new NavDestination.OooO0O0[]{OooO0o1, (NavDestination.OooO0O0) CollectionsKt.maxOrNull((Iterable) arrayList)}));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Nullable
    public final NavDestination OooO0oo(@IdRes int i, boolean z) {
        OooO0OO oooO0OO;
        NavDestination navDestinationOooO0oO = this.f8656o000oOoO.OooO0oO(i, null);
        if (navDestinationOooO0oO != null) {
            return navDestinationOooO0oO;
        }
        if (!z || (oooO0OO = this.f8632Oooo0oO) == null) {
            return null;
        }
        Intrinsics.checkNotNull(oooO0OO);
        return oooO0OO.OooO0oo(i, true);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Nullable
    public final NavDestination OooOO0(@NotNull String route, boolean z) {
        OooO0OO oooO0OO;
        Intrinsics.checkNotNullParameter(route, "route");
        NavDestination navDestinationOooO0oO = this.f8656o000oOoO.OooO0oO((route != null ? OooOo00.OooO0Oo("android-app://androidx.navigation/", route) : "").hashCode(), null);
        if (navDestinationOooO0oO != null) {
            return navDestinationOooO0oO;
        }
        if (!z || (oooO0OO = this.f8632Oooo0oO) == null) {
            return null;
        }
        Intrinsics.checkNotNull(oooO0OO);
        return oooO0OO.OooO(route);
    }

    public final void OooOO0O(String str) {
        int iHashCode;
        if (str == null) {
            iHashCode = 0;
        } else {
            if (!(!Intrinsics.areEqual(str, this.f8634OoooO))) {
                throw new IllegalArgumentException(("Start destination " + str + " cannot use the same route as the graph " + this).toString());
            }
            if (!(!StringsKt.isBlank(str))) {
                throw new IllegalArgumentException("Cannot have an empty start destination route".toString());
            }
            iHashCode = ("android-app://androidx.navigation/" + str).hashCode();
        }
        this.f8653OoooOOO = iHashCode;
        this.f8655OoooOo0 = str;
    }

    @Override // androidx.navigation.NavDestination
    public final boolean equals(@Nullable Object obj) {
        if (obj == null || !(obj instanceof OooO0OO)) {
            return false;
        }
        List mutableList = SequencesKt.toMutableList(SequencesKt.asSequence(o0OOO0o.OooO00o(this.f8656o000oOoO)));
        OooO0OO oooO0OO = (OooO0OO) obj;
        Iterator itOooO00o = o0OOO0o.OooO00o(oooO0OO.f8656o000oOoO);
        while (true) {
            o0OOO0o.OooO00o oooO00o = (o0OOO0o.OooO00o) itOooO00o;
            if (!oooO00o.hasNext()) {
                break;
            }
            mutableList.remove((NavDestination) oooO00o.next());
        }
        return super.equals(obj) && this.f8656o000oOoO.OooOO0o() == oooO0OO.f8656o000oOoO.OooOO0o() && this.f8653OoooOOO == oooO0OO.f8653OoooOOO && mutableList.isEmpty();
    }

    @Override // androidx.navigation.NavDestination
    public final int hashCode() {
        int iOooOO0 = this.f8653OoooOOO;
        o0ooOOo<NavDestination> o0ooooo2 = this.f8656o000oOoO;
        int iOooOO0o = o0ooooo2.OooOO0o();
        for (int i = 0; i < iOooOO0o; i++) {
            iOooOO0 = (((iOooOO0 * 31) + o0ooooo2.OooOO0(i)) * 31) + o0ooooo2.OooOOO0(i).hashCode();
        }
        return iOooOO0;
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<NavDestination> iterator() {
        return new OooO0O0();
    }

    @Override // androidx.navigation.NavDestination
    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        NavDestination navDestinationOooO = OooO(this.f8655OoooOo0);
        if (navDestinationOooO == null) {
            navDestinationOooO = OooO0oo(this.f8653OoooOOO, true);
        }
        sb.append(" startDestination=");
        if (navDestinationOooO == null) {
            String str = this.f8655OoooOo0;
            if (str != null) {
                sb.append(str);
            } else {
                String str2 = this.f8654OoooOOo;
                if (str2 != null) {
                    sb.append(str2);
                } else {
                    StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("0x");
                    sbOooO0o0.append(Integer.toHexString(this.f8653OoooOOO));
                    sb.append(sbOooO0o0.toString());
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
