package p105o000oo0o;

import androidx.navigation.NavDestination;
import androidx.navigation.NavDestinationDsl;
import androidx.navigation.Navigator;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@NavDestinationDsl
@SourceDebugExtension({"SMAP\nNavDestinationBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDestinationBuilder.kt\nandroidx/navigation/NavDestinationBuilder\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,260:1\n215#2,2:261\n215#2,2:265\n1855#3,2:263\n*S KotlinDebug\n*F\n+ 1 NavDestinationBuilder.kt\nandroidx/navigation/NavDestinationBuilder\n*L\n152#1:261,2\n158#1:265,2\n155#1:263,2\n*E\n"})
public class o00O00<D extends NavDestination> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Navigator<? extends D> f35750OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f35751OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final String f35752OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f35753OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f35754OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final ArrayList f35755OooO0o0;

    public o00O00(@NotNull Navigator<? extends D> navigator, @Nullable String str) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f35750OooO00o = navigator;
        this.f35751OooO0O0 = -1;
        this.f35752OooO0OO = str;
        this.f35753OooO0Oo = new LinkedHashMap();
        this.f35755OooO0o0 = new ArrayList();
        this.f35754OooO0o = new LinkedHashMap();
    }
}
