package androidx.compose.ui;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO00o {
    static {
        Modifier.Companion companion = Modifier.INSTANCE;
    }

    @NotNull
    public static Modifier OooO00o(Modifier modifier, @NotNull Modifier other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return other == Modifier.INSTANCE ? modifier : new CombinedModifier(modifier, other);
    }
}
