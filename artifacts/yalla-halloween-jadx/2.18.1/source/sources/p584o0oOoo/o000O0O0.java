package p584o0oOoo;

import Oooo000.o0000OO0;
import Oooo000.o000O000;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.accompanist.navigation.animation.AnimatedNavHostKt;
import com.yalla.yalla.common.model.ShopVehicleListModel;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o0O00oO0.OooO00o;
import org.jetbrains.annotations.NotNull;
import p023Oooo00O.o00oO0o;
import p043OooooO0.o000OOo0;
import p043OooooO0.o00O0000;
import p086o000OooO.Oooo0;
import p086o000OooO.o0000;
import p086o000OooO.o000000;
import p086o000OooO.o000OOo;
import p086o000OooO.o0OOO0o;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class o000O0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o000O0O0 f46951OooO00o = new o000O0O0();

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static void OooO00o(o000OOo o000ooo2, o000000 o000000Var, o0000O o0000o2) {
        List arguments = CollectionsKt.emptyList();
        List deepLinks = CollectionsKt.emptyList();
        o0000OO0 o0000oo0OooO = Oooo000.o000000.OooO(o00oO0o.OooO0Oo(ShopVehicleListModel.VehicleTagType_Vip400, 0, null, 6), o0000OO0.f46944Oooo0o);
        o000O000 o000o000OooOO0 = Oooo000.o000000.OooOO0(o00oO0o.OooO0Oo(ShopVehicleListModel.VehicleTagType_Vip400, 0, null, 6), o000.f46940Oooo0o);
        o0000OO0 o0000oo0OooO2 = Oooo000.o000000.OooO(o00oO0o.OooO0Oo(ShopVehicleListModel.VehicleTagType_Vip400, 0, null, 6), o000O000.f46949Oooo0o);
        o000O000 o000o000OooOO1 = Oooo000.o000000.OooOO0(o00oO0o.OooO0Oo(ShopVehicleListModel.VehicleTagType_Vip400, 0, null, 6), o000O0o.f46953Oooo0o);
        String route = o0000o2.OooO0Oo();
        o000Oo0 o000oo1 = new o000Oo0(o0000oo0OooO);
        o000O00 o000o01 = new o000O00(o000o000OooOO0);
        o000O00O o000o00o2 = new o000O00O(o0000oo0OooO2);
        o000O0 o000o0 = new o000O0(o000o000OooOO1);
        o000OOo0 content = o00O0000.OooO0O0(403984421, true, new o000OO0O(o000000Var, o0000o2));
        Intrinsics.checkNotNullParameter(o000ooo2, "<this>");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(deepLinks, "deepLinks");
        Intrinsics.checkNotNullParameter(content, "content");
        o0000 o0000Var = o000ooo2.f28448OooO0oO;
        Objects.requireNonNull(o0000Var);
        Intrinsics.checkNotNullParameter(OooO00o.class, "navigatorClass");
        OooO00o.C0359OooO00o destination = new OooO00o.C0359OooO00o((OooO00o) o0000Var.OooO0O0(o0000.f28405OooO0O0.OooO00o(OooO00o.class)), content);
        destination.OooO0oO(route);
        Iterator it = arguments.iterator();
        while (it.hasNext()) {
            Objects.requireNonNull((Oooo0) it.next());
            Intrinsics.checkNotNullParameter(null, "argumentName");
            Intrinsics.checkNotNullParameter(null, "argument");
            destination.f8635OoooO0.put(null, null);
        }
        Iterator it2 = deepLinks.iterator();
        while (it2.hasNext()) {
            destination.OooO00o((o0OOO0o) it2.next());
        }
        AnimatedNavHostKt.f12898OooO00o.put(route, o000oo1);
        AnimatedNavHostKt.f12899OooO0O0.put(route, o000o01);
        AnimatedNavHostKt.f12900OooO0OO.put(route, o000o00o2);
        AnimatedNavHostKt.f12901OooO0Oo.put(route, o000o0);
        Intrinsics.checkNotNullParameter(destination, "destination");
        o000ooo2.f28441OooO.add(destination);
    }
}
