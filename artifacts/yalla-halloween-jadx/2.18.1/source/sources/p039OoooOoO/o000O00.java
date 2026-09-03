package p039OoooOoO;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o000O00<K, V> extends o0000oo<K, V, Map.Entry<? extends K, ? extends V>> {
    /* JADX WARN: Illegal instructions before constructor call */
    public o000O00(@NotNull o000O0O0<K, V> node) {
        Intrinsics.checkNotNullParameter(node, "node");
        o000O[] o000oArr = new o000O[8];
        for (int i = 0; i < 8; i++) {
            o000oArr[i] = new o000OO00();
        }
        super(node, o000oArr);
    }
}
