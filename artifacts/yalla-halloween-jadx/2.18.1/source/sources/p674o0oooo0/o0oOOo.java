package p674o0oooo0;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface o0oOOo extends o0O0O0O, ReadableByteChannel {
    @Deprecated(level = DeprecationLevel.WARNING, message = "moved to val: use getBuffer() instead", replaceWith = @ReplaceWith(expression = "buffer", imports = {}))
    @NotNull
    o0oOO OooO0OO();

    @NotNull
    o0oOO OooO0o0();

    long OooOO0O(@NotNull o0O00o00 o0o00o01) throws IOException;

    @NotNull
    String OooOOO0(long j) throws IOException;

    @NotNull
    ByteString OooOOOo(long j) throws IOException;

    @NotNull
    byte[] OooOoo0() throws IOException;

    boolean OooOooo() throws IOException;

    long Oooo0oO(@NotNull ByteString byteString) throws IOException;

    @NotNull
    String OoooO(long j) throws IOException;

    boolean Ooooo00(long j, @NotNull ByteString byteString) throws IOException;

    @NotNull
    String OooooO0(@NotNull Charset charset) throws IOException;

    long o00000O0() throws IOException;

    int o00000OO(@NotNull o0O00 o0o01) throws IOException;

    @NotNull
    InputStream o0000OO0();

    void o0000oo(long j) throws IOException;

    long o000OO() throws IOException;

    void o0O0O00(@NotNull o0oOO o0ooo2, long j) throws IOException;

    @NotNull
    byte[] o0OO00O(long j) throws IOException;

    @NotNull
    String o0ooOO0() throws IOException;

    int o0ooOoO() throws IOException;

    byte readByte() throws IOException;

    void readFully(@NotNull byte[] bArr) throws IOException;

    int readInt() throws IOException;

    long readLong() throws IOException;

    short readShort() throws IOException;

    boolean request(long j) throws IOException;

    void skip(long j) throws IOException;
}
