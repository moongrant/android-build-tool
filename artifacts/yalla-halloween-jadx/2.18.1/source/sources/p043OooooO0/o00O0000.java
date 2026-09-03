package p043OooooO0;

import androidx.compose.runtime.ComposeCompilerApi;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o00oOoo;
import p100o000oOoO.o0O0OOO0;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0OOoo;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0000 {
    @ComposeCompilerApi
    @NotNull
    public static final o000OOo0 OooO00o(@NotNull oOO00O composer, int i, @NotNull Object block) {
        o00 o00Var;
        Intrinsics.checkNotNullParameter(composer, "composer");
        Intrinsics.checkNotNullParameter(block, "block");
        composer.OooO0o0(i);
        Object objOooO0o = composer.OooO0o();
        if (objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
            o00Var = new o00(i, true);
            composer.Oooo00o(o00Var);
        } else {
            Objects.requireNonNull(objOooO0o, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
            o00Var = (o00) objOooO0o;
        }
        o00Var.OooOo00(block);
        composer.Oooo0o0();
        return o00Var;
    }

    @ComposeCompilerApi
    @NotNull
    public static final o000OOo0 OooO0O0(int i, boolean z, @NotNull Object block) {
        Intrinsics.checkNotNullParameter(block, "block");
        o00 o00Var = new o00(i, z);
        o00Var.OooOo00(block);
        return o00Var;
    }

    public static final int OooO0OO(int i) {
        return 2 << (((i % 10) * 3) + 1);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0026  */
    public static final boolean OooO0Oo(@Nullable o0O0OOO0 o0o0ooo0, @NotNull o0O0OOO0 other) {
        boolean z;
        Intrinsics.checkNotNullParameter(other, "other");
        if (o0o0ooo0 == null) {
            return true;
        }
        if ((o0o0ooo0 instanceof oo0OOoo) && (other instanceof oo0OOoo)) {
            oo0OOoo oo0oooo = (oo0OOoo) o0o0ooo0;
            if (oo0oooo.f29698OooO0O0 == null) {
                z = false;
            } else {
                o00oOoo o00oooo2 = oo0oooo.f29699OooO0OO;
                if (o00oooo2 != null ? o00oooo2.OooO00o() : false) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (!z || Intrinsics.areEqual(o0o0ooo0, other) || Intrinsics.areEqual(oo0oooo.f29699OooO0OO, ((oo0OOoo) other).f29699OooO0OO)) {
                return true;
            }
        }
        return false;
    }

    public static final int OooO0o0(int i) {
        return 1 << (((i % 10) * 3) + 1);
    }
}
