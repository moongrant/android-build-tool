package p659o0oooO00;

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
public interface o0000 extends o00O00, ReadableByteChannel {
    @NotNull
    o00000O OooO0O0();

    @Deprecated(level = DeprecationLevel.WARNING, message = "moved to val: use getBuffer() instead", replaceWith = @ReplaceWith(expression = "buffer", imports = {}))
    @NotNull
    o00000O OooO0Oo();

    long OooOoO0(@NotNull ByteString byteString) throws IOException;

    int OooOoo(@NotNull o000O0O0 o000o0o1) throws IOException;

    @NotNull
    String OooOoo0(long j) throws IOException;

    boolean Oooo00O(long j, @NotNull ByteString byteString) throws IOException;

    @NotNull
    String OoooO0() throws IOException;

    void OoooOoO(long j) throws IOException;

    @NotNull
    String OooooO0(long j) throws IOException;

    @NotNull
    ByteString Oooooo0(long j) throws IOException;

    @NotNull
    String o000000(@NotNull Charset charset) throws IOException;

    long o0000Oo0() throws IOException;

    @NotNull
    InputStream o0000OoO();

    int o0000Ooo() throws IOException;

    long o000oOoO() throws IOException;

    @NotNull
    byte[] o00Ooo() throws IOException;

    long o00oO0O(@NotNull o0000Ooo o0000ooo) throws IOException;

    void o0ooOoO(@NotNull o00000O o00000o, long j) throws IOException;

    boolean oo000o() throws IOException;

    byte readByte() throws IOException;

    void readFully(@NotNull byte[] bArr) throws IOException;

    int readInt() throws IOException;

    long readLong() throws IOException;

    short readShort() throws IOException;

    boolean request(long j) throws IOException;

    void skip(long j) throws IOException;
}
