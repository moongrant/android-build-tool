package o000000;

import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o0000Ooo extends o00Oo0<o0000Ooo, p418o0Oo0oo.o000000O> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000Ooo(@NotNull oo000o layoutNodeWrapper, @NotNull p418o0Oo0oo.o000000O modifier) {
        super(layoutNodeWrapper, modifier);
        Intrinsics.checkNotNullParameter(layoutNodeWrapper, "layoutNodeWrapper");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
    }

    @Override // o000000.o00Oo0
    public final void OooO00o() {
        this.f26651Oooo = true;
        ((p418o0Oo0oo.o000000O) this.f26653Oooo0oO).OoooO00().f39668Oooo0o = this.f26652Oooo0o;
        ((p418o0Oo0oo.o000000O) this.f26653Oooo0oO).OoooO00().f39669Oooo0oO = true;
    }

    @Override // o000000.o00Oo0
    public final void OooO0O0() {
        this.f26651Oooo = false;
        ((p418o0Oo0oo.o000000O) this.f26653Oooo0oO).OoooO00().f39669Oooo0oO = false;
    }

    public final boolean OooO0OO() {
        p418o0Oo0oo.o000000 o000000VarOoooO00 = ((p418o0Oo0oo.o000000O) this.f26653Oooo0oO).OoooO00();
        Objects.requireNonNull(o000000VarOoooO00);
        if (!(o000000VarOoooO00 instanceof o0Oo0oo.o00000O.OooO00o)) {
            o0000Ooo o0000ooo = (o0000Ooo) this.f26654Oooo0oo;
            if (!(o0000ooo != null ? o0000ooo.OooO0OO() : false)) {
                return false;
            }
        }
        return true;
    }
}
