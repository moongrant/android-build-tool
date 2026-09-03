package o000O00;

import androidx.navigation.NavDestinationDsl;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@NavDestinationDsl
@SourceDebugExtension({"SMAP\nNavGraphBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavGraphBuilder.kt\nandroidx/navigation/NavGraphBuilder\n+ 2 NavigatorProvider.kt\nandroidx/navigation/NavigatorProviderKt\n*L\n1#1,193:1\n161#2:194\n161#2:195\n*S KotlinDebug\n*F\n+ 1 NavGraphBuilder.kt\nandroidx/navigation/NavGraphBuilder\n*L\n131#1:194\n149#1:195\n*E\n"})
public final class o00000O0 extends o000000<androidx.navigation.OooO> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final ArrayList f34372OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final androidx.navigation.OooOOOO f34373OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public final String f34374OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000O0(@NotNull androidx.navigation.OooOOOO provider, @NotNull String startDestination, @Nullable String str) {
        super(provider.OooO0O0(androidx.navigation.OooOOOO.OooO00o.OooO00o(androidx.navigation.OooOO0.class)), str);
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(startDestination, "startDestination");
        provider.getClass();
        Intrinsics.checkNotNullParameter(androidx.navigation.OooOO0.class, "navigatorClass");
        this.f34372OooO = new ArrayList();
        this.f34373OooO0oO = provider;
        this.f34374OooO0oo = startDestination;
    }
}
