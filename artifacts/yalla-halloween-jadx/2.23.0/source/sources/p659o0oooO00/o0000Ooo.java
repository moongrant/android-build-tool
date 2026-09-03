package p659o0oooO00;

import java.io.IOException;
import java.nio.channels.WritableByteChannel;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public interface o0000Ooo extends o00O000, WritableByteChannel {
    @NotNull
    o00000O OooO0O0();

    @Deprecated(level = DeprecationLevel.WARNING, message = "moved to val: use getBuffer() instead", replaceWith = @ReplaceWith(expression = "buffer", imports = {}))
    @NotNull
    o00000O OooO0Oo();

    @NotNull
    o0000Ooo OooOO0o() throws IOException;

    @NotNull
    o0000Ooo OooOOO(int i) throws IOException;

    @NotNull
    o0000Ooo OooOOOo(long j) throws IOException;

    @NotNull
    o0000Ooo OooOoO() throws IOException;

    @NotNull
    o0000Ooo OooOooo(@NotNull String str) throws IOException;

    long Oooo000(@NotNull o00O00 o00o01) throws IOException;

    @NotNull
    o0000Ooo Ooooo00(long j) throws IOException;

    @Override // p659o0oooO00.o00O000, java.io.Flushable
    void flush() throws IOException;

    @NotNull
    o0000Ooo o00000O0(long j) throws IOException;

    @NotNull
    o0000Ooo o0000O00(@NotNull ByteString byteString) throws IOException;

    @NotNull
    o0000Ooo o000OO(int i, int i2, @NotNull byte[] bArr) throws IOException;

    @NotNull
    o0000Ooo o00o0O(int i) throws IOException;

    @NotNull
    o0000Ooo o00oO0o(int i) throws IOException;

    @NotNull
    o0000Ooo o0OoOo0(int i) throws IOException;

    @NotNull
    o0000Ooo write(@NotNull byte[] bArr) throws IOException;
}
