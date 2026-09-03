package p100o000oOoO;

import kotlin.Unit;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@JvmInline
public final class oO00000o<T> {
    @NotNull
    public static <T> oOO00O OooO00o(@NotNull oOO00O composer) {
        Intrinsics.checkNotNullParameter(composer, "composer");
        return composer;
    }

    public static final <V> void OooO0O0(oOO00O ooo00o, V v, @NotNull Function2<? super T, ? super V, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (ooo00o.OooOOO0() || !Intrinsics.areEqual(ooo00o.OooO0o(), v)) {
            ooo00o.Oooo00o(v);
            ooo00o.OooOoOO(v, block);
        }
    }
}
