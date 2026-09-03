package p021OooOooo;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o000oOoO {
    @NotNull
    public static final <K, V> Oooo0<K, V> OooO00o(@NotNull Pair<? extends K, ? extends V>... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        Oooo0<K, V> oooo0 = new Oooo0<>(pairs.length);
        int length = pairs.length;
        int i = 0;
        while (i < length) {
            Pair<? extends K, ? extends V> pair = pairs[i];
            i++;
            oooo0.put(pair.getFirst(), pair.getSecond());
        }
        return oooo0;
    }
}
