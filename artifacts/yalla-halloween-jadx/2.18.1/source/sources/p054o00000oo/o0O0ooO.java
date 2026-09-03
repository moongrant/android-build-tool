package p054o00000oo;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o0O0ooO implements o000O {
    @Override // p054o00000oo.o000O
    public final void OooO00o(@NotNull o00 buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        buffer.OooO00o();
    }

    public final boolean equals(@Nullable Object obj) {
        return obj instanceof o0O0ooO;
    }

    public final int hashCode() {
        return Reflection.getOrCreateKotlinClass(o0O0ooO.class).hashCode();
    }

    @NotNull
    public final String toString() {
        return "FinishComposingTextCommand()";
    }
}
