package p039OoooOoO;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o000OO0O<K, V> extends o0000oo<K, V, V> {
    /* JADX WARN: Illegal instructions before constructor call */
    public o000OO0O(@NotNull o000O0O0<K, V> node) {
        Intrinsics.checkNotNullParameter(node, "node");
        o000O[] o000oArr = new o000O[8];
        for (int i = 0; i < 8; i++) {
            o000oArr[i] = new o0O0ooO();
        }
        super(node, o000oArr);
    }
}
