package p662o0oooO0O;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public interface o0O0o0 extends oO00000, ReadableByteChannel {
    @NotNull
    oo0OOoo OooO0O0();

    @Deprecated(level = DeprecationLevel.WARNING, message = "moved to val: use getBuffer() instead", replaceWith = @ReplaceWith(expression = "buffer", imports = {}))
    @NotNull
    oo0OOoo OooO0Oo();

    long OooOoO0(@NotNull ByteString byteString) throws IOException;

    @NotNull
    String OooOooO(long j) throws IOException;

    boolean Oooo00O(long j, @NotNull ByteString byteString) throws IOException;

    void Oooo0o(@NotNull oo0OOoo oo0oooo, long j) throws IOException;

    @NotNull
    String OoooO0O() throws IOException;

    void OoooOoO(long j) throws IOException;

    int Ooooo0o(@NotNull o0OOO0 o0ooo1) throws IOException;

    @NotNull
    String OooooOO(long j) throws IOException;

    @NotNull
    ByteString Oooooo0(long j) throws IOException;

    @NotNull
    String o000000o(@NotNull Charset charset) throws IOException;

    long o00000oo(@NotNull o0O0o00O o0o0o00o) throws IOException;

    long o0000Oo0() throws IOException;

    @NotNull
    InputStream o0000OoO();

    int o0000Ooo() throws IOException;

    long o000oOoO() throws IOException;

    boolean o00oO0O() throws IOException;

    @NotNull
    byte[] o00ooo() throws IOException;

    byte readByte() throws IOException;

    void readFully(@NotNull byte[] bArr) throws IOException;

    int readInt() throws IOException;

    long readLong() throws IOException;

    short readShort() throws IOException;

    boolean request(long j) throws IOException;

    void skip(long j) throws IOException;
}
