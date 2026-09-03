package p662o0oooO0O;

import java.io.IOException;
import java.nio.channels.WritableByteChannel;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public interface o0O0o00O extends ooo0Oo0, WritableByteChannel {
    @NotNull
    oo0OOoo OooO0O0();

    @Deprecated(level = DeprecationLevel.WARNING, message = "moved to val: use getBuffer() instead", replaceWith = @ReplaceWith(expression = "buffer", imports = {}))
    @NotNull
    oo0OOoo OooO0Oo();

    @NotNull
    o0O0o00O OooOOO0() throws IOException;

    @NotNull
    o0O0o00O OooOOOO(int i) throws IOException;

    @NotNull
    o0O0o00O OooOOo0(long j) throws IOException;

    @NotNull
    o0O0o00O OooOoO() throws IOException;

    @NotNull
    o0O0o00O Oooo000(@NotNull String str) throws IOException;

    @NotNull
    o0O0o00O Ooooo00(long j) throws IOException;

    @Override // p662o0oooO0O.ooo0Oo0, java.io.Flushable
    void flush() throws IOException;

    @NotNull
    o0O0o00O o00000O(long j) throws IOException;

    @NotNull
    o0O0o00O o0000oo(@NotNull ByteString byteString) throws IOException;

    @NotNull
    o0O0o00O o000OO(int i, int i2, @NotNull byte[] bArr) throws IOException;

    long o00Oo0(@NotNull oO00000 oo00000) throws IOException;

    @NotNull
    o0O0o00O o0OoOo0(int i) throws IOException;

    @NotNull
    o0O0o00O o0ooOO0(int i) throws IOException;

    @NotNull
    o0O0o00O oo000o(int i) throws IOException;

    @NotNull
    o0O0o00O write(@NotNull byte[] bArr) throws IOException;
}
