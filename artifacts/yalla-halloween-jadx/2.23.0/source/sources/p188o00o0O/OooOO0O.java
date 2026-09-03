package p188o00o0O;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O {
    @NotNull
    public static final <K, V> OooOO0<K, V> OooO00o(@NotNull Pair<? extends K, ? extends V>... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        OooOO0<K, V> oooOO1 = new OooOO0<>(pairs.length);
        int length = pairs.length;
        int i = 0;
        while (i < length) {
            Pair<? extends K, ? extends V> pair = pairs[i];
            i++;
            oooOO1.put(pair.getFirst(), pair.getSecond());
        }
        return oooOO1;
    }
}
