package o00O0;

import coil.size.Size;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p115o00O00oO.o00oO0o;

/* JADX INFO: loaded from: classes.dex */
public interface OooOO0O<T> {

    public static final class OooO00o {
        /* JADX WARN: Incorrect return type in method signature: <T:Ljava/lang/Object;>(Lo00O0/OooOO0O<TT;>;TT;)Z */
        public static void OooO00o(@NotNull OooOO0O oooOO0O, @NotNull Object data) {
            Intrinsics.checkNotNullParameter(oooOO0O, "this");
            Intrinsics.checkNotNullParameter(data, "data");
        }
    }

    boolean OooO00o(@NotNull T t);

    @Nullable
    String OooO0O0(@NotNull T t);

    @Nullable
    Object OooO0OO(@NotNull p113o00O00Oo.OooO0O0 oooO0O0, @NotNull T t, @NotNull Size size, @NotNull o00oO0o o00oo0o2, @NotNull Continuation<? super OooOO0> continuation);
}
