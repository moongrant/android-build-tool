package p039OoooOoO;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o000O0o<K, V> extends o0000O0O<K, V, V> {
    /* JADX WARN: Illegal instructions before constructor call */
    public o000O0o(@NotNull o0000O0<K, V> builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        o000O[] o000oArr = new o000O[8];
        for (int i = 0; i < 8; i++) {
            o000oArr[i] = new o0O0ooO();
        }
        super(builder, o000oArr);
    }
}
