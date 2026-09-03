package p119o00O0Oo0;

import java.util.List;
import kotlin.Pair;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import o00O0.OooOO0O;
import oOO00O.OooO0O0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p674o0oooo0.o0oOOo;

/* JADX INFO: loaded from: classes.dex */
@JvmName(name = "-ComponentRegistries")
public final class Oooo0 {
    @NotNull
    public static final Object OooO00o(@NotNull OooO0O0 oooO0O0, @NotNull Object data) {
        Intrinsics.checkNotNullParameter(oooO0O0, "<this>");
        Intrinsics.checkNotNullParameter(data, "data");
        List<Pair<o00O0O0.OooO0O0<? extends Object, ?>, Class<? extends Object>>> list = oooO0O0.f52970OooO0O0;
        int i = 0;
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i2 = i + 1;
                Pair<o00O0O0.OooO0O0<? extends Object, ?>, Class<? extends Object>> pair = list.get(i);
                o00O0O0.OooO0O0<? extends Object, ?> oooO0O0Component1 = pair.component1();
                if (pair.component2().isAssignableFrom(data.getClass()) && oooO0O0Component1.OooO00o(data)) {
                    data = oooO0O0Component1.OooO0O0(data);
                }
                if (i2 > size) {
                    break;
                }
                i = i2;
            }
        }
        return data;
    }

    @NotNull
    public static final <T> p115o00O00oO.Oooo0 OooO0O0(@NotNull OooO0O0 oooO0O0, @NotNull T data, @NotNull o0oOOo source, @Nullable String str) {
        p115o00O00oO.Oooo0 oooo0;
        Intrinsics.checkNotNullParameter(oooO0O0, "<this>");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(source, "source");
        List<p115o00O00oO.Oooo0> list = oooO0O0.f52972OooO0Oo;
        int size = list.size() - 1;
        if (size < 0) {
            oooo0 = null;
            break;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            oooo0 = list.get(i);
            if (oooo0.OooO00o(source)) {
                break;
            }
            if (i2 > size) {
                oooo0 = null;
                break;
            }
            i = i2;
        }
        p115o00O00oO.Oooo0 oooo1 = oooo0;
        if (oooo1 != null) {
            return oooo1;
        }
        throw new IllegalStateException(Intrinsics.stringPlus("Unable to decode data. No decoder supports: ", data).toString());
    }

    @NotNull
    public static final <T> OooOO0O<T> OooO0OO(@NotNull OooO0O0 oooO0O0, @NotNull T data) {
        Pair<OooOO0O<? extends Object>, Class<? extends Object>> pair;
        Intrinsics.checkNotNullParameter(oooO0O0, "<this>");
        Intrinsics.checkNotNullParameter(data, "data");
        List<Pair<OooOO0O<? extends Object>, Class<? extends Object>>> list = oooO0O0.f52971OooO0OO;
        int size = list.size() - 1;
        if (size < 0) {
            pair = null;
            break;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            pair = list.get(i);
            Pair<OooOO0O<? extends Object>, Class<? extends Object>> pair2 = pair;
            if (pair2.component2().isAssignableFrom(data.getClass()) && pair2.component1().OooO00o(data)) {
                break;
            }
            if (i2 > size) {
                pair = null;
                break;
            }
            i = i2;
        }
        Pair<OooOO0O<? extends Object>, Class<? extends Object>> pair3 = pair;
        if (pair3 != null) {
            return (OooOO0O) pair3.getFirst();
        }
        throw new IllegalStateException(Intrinsics.stringPlus("Unable to fetch data. No fetcher supports: ", data).toString());
    }
}
