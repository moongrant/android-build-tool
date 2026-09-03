package p644o0ooOOo;

import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class oO0o0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f58096OooO00o = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinPackage(oO0o0o.class, "compose_release"), "designInfoProvider", "getDesignInfoProvider(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/constraintlayout/compose/DesignInfoProvider;"))};

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final SemanticsPropertyKey f58097OooO0O0 = new SemanticsPropertyKey("DesignInfoProvider", null, 2, null);

    public static final void OooO00o(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver, @NotNull oO000O0 oo000o0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        Intrinsics.checkNotNullParameter(oo000o0, "<set-?>");
        f58097OooO0O0.setValue(semanticsPropertyReceiver, f58096OooO00o[0], oo000o0);
    }
}
