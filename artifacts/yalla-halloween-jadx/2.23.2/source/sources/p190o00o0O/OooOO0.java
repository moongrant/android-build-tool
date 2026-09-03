package p190o00o0O;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 {
    @NotNull
    public static final <K, V> OooO<K, V> OooO00o(@NotNull Pair<? extends K, ? extends V>... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        OooO<K, V> oooO = new OooO<>(pairs.length);
        int length = pairs.length;
        int i = 0;
        while (i < length) {
            Pair<? extends K, ? extends V> pair = pairs[i];
            i++;
            oooO.put(pair.getFirst(), pair.getSecond());
        }
        return oooO;
    }
}
