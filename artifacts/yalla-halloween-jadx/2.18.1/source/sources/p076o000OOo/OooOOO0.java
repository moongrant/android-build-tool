package p076o000OOo;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO0 {
    @NotNull
    public static final <T> OooOo00<T> OooO00o(@NotNull Function0<? extends T> defaultFactory) {
        Intrinsics.checkNotNullParameter(defaultFactory, "defaultFactory");
        return new OooOo00<>(defaultFactory);
    }
}
