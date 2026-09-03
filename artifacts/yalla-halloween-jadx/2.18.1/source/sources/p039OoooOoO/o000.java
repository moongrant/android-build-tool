package p039OoooOoO;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o000<K, V> extends o0000O0O<K, V, K> {
    /* JADX WARN: Illegal instructions before constructor call */
    public o000(@NotNull o0000O0<K, V> builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        o000O[] o000oArr = new o000O[8];
        for (int i = 0; i < 8; i++) {
            o000oArr[i] = new o000OOo0();
        }
        super(builder, o000oArr);
    }
}
