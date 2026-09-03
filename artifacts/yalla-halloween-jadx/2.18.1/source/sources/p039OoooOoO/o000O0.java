package p039OoooOoO;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o000O0<K, V> extends o0000oo<K, V, K> {
    /* JADX WARN: Illegal instructions before constructor call */
    public o000O0(@NotNull o000O0O0<K, V> node) {
        Intrinsics.checkNotNullParameter(node, "node");
        o000O[] o000oArr = new o000O[8];
        for (int i = 0; i < 8; i++) {
            o000oArr[i] = new o000OOo0();
        }
        super(node, o000oArr);
    }
}
