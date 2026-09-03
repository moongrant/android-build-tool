package p086o000OooO;

import androidx.navigation.NavDestination;
import androidx.navigation.NavDestinationDsl;
import androidx.navigation.Navigator;
import androidx.navigation.OooO00o;
import androidx.navigation.OooO0OO;
import androidx.navigation.OooO0o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@NavDestinationDsl
public final class o000OOo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final List<NavDestination> f28441OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Navigator<OooO0OO> f28442OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f28443OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final String f28444OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public Map<String, o0OoOo0> f28445OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public Map<Integer, o000oOoO> f28446OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public List<o0OOO0o> f28447OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final o0000 f28448OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public String f28449OooO0oo;

    public o000OOo(@NotNull o0000 provider, @NotNull String startDestination, @Nullable String str) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(startDestination, "startDestination");
        Objects.requireNonNull(provider);
        Intrinsics.checkNotNullParameter(OooO0o.class, "navigatorClass");
        Navigator<OooO0OO> navigator = provider.OooO0O0(o0000.f28405OooO0O0.OooO00o(OooO0o.class));
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f28442OooO00o = navigator;
        this.f28443OooO0O0 = -1;
        this.f28444OooO0OO = str;
        this.f28445OooO0Oo = new LinkedHashMap();
        this.f28447OooO0o0 = new ArrayList();
        this.f28446OooO0o = new LinkedHashMap();
        this.f28441OooO = new ArrayList();
        this.f28448OooO0oO = provider;
        this.f28449OooO0oo = startDestination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.navigation.NavDestination, androidx.navigation.OooO0OO, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.LinkedHashMap, java.util.Map<java.lang.String, o000OooO.o0OoOo0>] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList, java.util.List<o000OooO.o0OOO0o>] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Integer, o000OooO.o000oOoO>] */
    @NotNull
    private OooO0OO OooO0O0() {
        ?? OooO00o2 = this.f28442OooO00o.OooO00o();
        String str = this.f28444OooO0OO;
        if (str != null) {
            OooO00o2.OooO0oO(str);
        }
        int i = this.f28443OooO0O0;
        if (i != -1) {
            OooO00o2.f8637OoooO0O = i;
        }
        OooO00o2.f8633Oooo0oo = null;
        for (Map.Entry entry : this.f28445OooO0Oo.entrySet()) {
            String argumentName = (String) entry.getKey();
            o0OoOo0 argument = (o0OoOo0) entry.getValue();
            Intrinsics.checkNotNullParameter(argumentName, "argumentName");
            Intrinsics.checkNotNullParameter(argument, "argument");
            OooO00o2.f8635OoooO0.put(argumentName, argument);
        }
        Iterator it = this.f28447OooO0o0.iterator();
        while (it.hasNext()) {
            OooO00o2.OooO00o((o0OOO0o) it.next());
        }
        for (Map.Entry entry2 : this.f28446OooO0o.entrySet()) {
            int iIntValue = ((Number) entry2.getKey()).intValue();
            o000oOoO action = (o000oOoO) entry2.getValue();
            Intrinsics.checkNotNullParameter(action, "action");
            if (!(!(OooO00o2 instanceof OooO00o.C0059OooO00o))) {
                throw new UnsupportedOperationException("Cannot add action " + iIntValue + " to " + ((Object) OooO00o2) + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
            }
            if (!(iIntValue != 0)) {
                throw new IllegalArgumentException("Cannot have an action with actionId 0".toString());
            }
            OooO00o2.f8636OoooO00.OooOO0O(iIntValue, action);
        }
        return OooO00o2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.ArrayList, java.util.List<androidx.navigation.NavDestination>] */
    @NotNull
    public final OooO0OO OooO00o() {
        OooO0OO oooO0OO = (OooO0OO) OooO0O0();
        ?? nodes = this.f28441OooO;
        Intrinsics.checkNotNullParameter(nodes, "nodes");
        for (NavDestination node : nodes) {
            if (node != null) {
                Intrinsics.checkNotNullParameter(node, "node");
                int i = node.f8637OoooO0O;
                String str = node.f8634OoooO;
                if (!((i == 0 && str == null) ? false : true)) {
                    throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.".toString());
                }
                String str2 = oooO0OO.f8634OoooO;
                if (str2 != null && !(!Intrinsics.areEqual(str, str2))) {
                    throw new IllegalArgumentException(("Destination " + node + " cannot have the same route as graph " + oooO0OO).toString());
                }
                if (!(i != oooO0OO.f8637OoooO0O)) {
                    throw new IllegalArgumentException(("Destination " + node + " cannot have the same id as graph " + oooO0OO).toString());
                }
                NavDestination navDestinationOooO0oO = oooO0OO.f8656o000oOoO.OooO0oO(i, null);
                if (navDestinationOooO0oO != node) {
                    if (!(node.f8632Oooo0oO == null)) {
                        throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.".toString());
                    }
                    if (navDestinationOooO0oO != null) {
                        navDestinationOooO0oO.f8632Oooo0oO = null;
                    }
                    node.f8632Oooo0oO = oooO0OO;
                    oooO0OO.f8656o000oOoO.OooOO0O(node.f8637OoooO0O, node);
                } else {
                    continue;
                }
            }
        }
        String startDestRoute = this.f28449OooO0oo;
        if (startDestRoute == null) {
            if (this.f28444OooO0OO != null) {
                throw new IllegalStateException("You must set a start destination route");
            }
            throw new IllegalStateException("You must set a start destination id");
        }
        Intrinsics.checkNotNull(startDestRoute);
        Intrinsics.checkNotNullParameter(startDestRoute, "startDestRoute");
        oooO0OO.OooOO0O(startDestRoute);
        return oooO0OO;
    }
}
