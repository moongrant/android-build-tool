package p105o000oo0o;

import androidx.navigation.NavDestinationDsl;
import androidx.navigation.OooO;
import androidx.navigation.OooOO0;
import androidx.navigation.OooOOOO;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@NavDestinationDsl
@SourceDebugExtension({"SMAP\nNavGraphBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavGraphBuilder.kt\nandroidx/navigation/NavGraphBuilder\n+ 2 NavigatorProvider.kt\nandroidx/navigation/NavigatorProviderKt\n*L\n1#1,193:1\n161#2:194\n161#2:195\n*S KotlinDebug\n*F\n+ 1 NavGraphBuilder.kt\nandroidx/navigation/NavGraphBuilder\n*L\n131#1:194\n149#1:195\n*E\n"})
public final class oOO00O extends o00O00<OooO> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final ArrayList f35771OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final OooOOOO f35772OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public final String f35773OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO00O(@NotNull OooOOOO provider, @NotNull String startDestination, @Nullable String str) {
        super(provider.OooO0O0(OooOOOO.OooO00o.OooO00o(OooOO0.class)), str);
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(startDestination, "startDestination");
        provider.getClass();
        Intrinsics.checkNotNullParameter(OooOO0.class, "navigatorClass");
        this.f35771OooO = new ArrayList();
        this.f35772OooO0oO = provider;
        this.f35773OooO0oo = startDestination;
    }
}
