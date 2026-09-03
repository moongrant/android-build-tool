package p710ooOO;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o0O0O00.OooO0OO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o000oOoO {
    @Nullable
    public static final <T> T OooO00o(@NotNull o0OO00O searchBeyondBounds, int i, @NotNull Function1<? super OooO0OO.OooO00o, ? extends T> block) {
        Intrinsics.checkNotNullParameter(searchBeyondBounds, "$this$searchBeyondBounds");
        Intrinsics.checkNotNullParameter(block, "block");
        OooO0OO oooO0OO = searchBeyondBounds.f53482OoooOO0;
        if (oooO0OO == null) {
            return null;
        }
        int i2 = 5;
        if (!(i == 5)) {
            if (i == 6) {
                i2 = 6;
            } else {
                if (i == 3) {
                    i2 = 3;
                } else {
                    if (i == 4) {
                        i2 = 4;
                    } else {
                        if (i == 1) {
                            i2 = 2;
                        } else {
                            if (!(i == 2)) {
                                throw new IllegalStateException("Unsupported direction for beyond bounds layout".toString());
                            }
                            i2 = 1;
                        }
                    }
                }
            }
        }
        return (T) oooO0OO.OooO00o(i2, block);
    }
}
