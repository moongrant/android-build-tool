package p045OooooOo;

import androidx.compose.runtime.Composable;
import java.util.Arrays;
import java.util.Objects;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o00Oo00;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0 {
    @Composable
    @NotNull
    public static final Object OooO00o(@NotNull Object[] inputs, @Nullable o00O o00o2, @NotNull Function0 init, @Nullable oOO00O ooo00o, int i) {
        Object objOooO0O0;
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        Intrinsics.checkNotNullParameter(init, "init");
        ooo00o.OooO0o0(441892779);
        if ((i & 2) != 0) {
            o00o2 = o00OO000.f4038OooO00o;
        }
        Object objOooO00o = null;
        ooo00o.OooO0o0(1059366469);
        String string = Integer.toString(ooo00o.Oooo0(), CharsKt.checkRadix(36));
        Intrinsics.checkNotNullExpressionValue(string, "toString(this, checkRadix(radix))");
        ooo00o.Oooo0o0();
        Objects.requireNonNull(o00o2, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
        o00O0OO o00o0oo2 = (o00O0OO) ooo00o.OooOO0o(oo0oOO0.f4048OooO00o);
        Object[] objArrCopyOf = Arrays.copyOf(inputs, inputs.length);
        ooo00o.OooO0o0(-568225417);
        boolean zOooo0oo = false;
        for (Object obj : objArrCopyOf) {
            zOooo0oo |= ooo00o.Oooo0oo(obj);
        }
        Object objOooO0o = ooo00o.OooO0o();
        if (zOooo0oo || objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
            if (o00o0oo2 != null && (objOooO0O0 = o00o0oo2.OooO0O0(string)) != null) {
                objOooO00o = o00o2.OooO00o(objOooO0O0);
            }
            objOooO0o = objOooO00o == null ? init.invoke() : objOooO00o;
            ooo00o.Oooo00o(objOooO0o);
        }
        ooo00o.Oooo0o0();
        if (o00o0oo2 != null) {
            o00Oo00.OooO00o(o00o0oo2, string, new oo00o(o00o0oo2, string, o0OOO00.OooO0o(o00o2, ooo00o), o0OOO00.OooO0o(objOooO0o, ooo00o)), ooo00o);
        }
        ooo00o.Oooo0o0();
        return objOooO0o;
    }
}
