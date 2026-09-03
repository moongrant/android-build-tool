package p674o0oooo0;

import java.io.IOException;
import java.nio.channels.WritableByteChannel;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface oo00oO extends o0O00o00, WritableByteChannel {
    @Deprecated(level = DeprecationLevel.WARNING, message = "moved to val: use getBuffer() instead", replaceWith = @ReplaceWith(expression = "buffer", imports = {}))
    @NotNull
    o0oOO OooO0OO();

    @NotNull
    o0oOO OooO0o0();

    @NotNull
    oo00oO OooOO0(@NotNull byte[] bArr) throws IOException;

    @NotNull
    oo00oO OooOo0(int i) throws IOException;

    @NotNull
    oo00oO OooOo00() throws IOException;

    @NotNull
    oo00oO OooOo0o(int i) throws IOException;

    @NotNull
    oo00oO OooOoO0(long j) throws IOException;

    @NotNull
    oo00oO OooOooO(int i) throws IOException;

    @NotNull
    oo00oO Oooo000(int i) throws IOException;

    @NotNull
    oo00oO Oooo0oo() throws IOException;

    @NotNull
    oo00oO OoooOoo(@NotNull String str) throws IOException;

    @NotNull
    oo00oO Oooooo0(@NotNull byte[] bArr, int i, int i2) throws IOException;

    @NotNull
    oo00oO Ooooooo(long j) throws IOException;

    @Override // p674o0oooo0.o0O00o00, java.io.Flushable
    void flush() throws IOException;

    @NotNull
    oo00oO o000000(@NotNull ByteString byteString) throws IOException;

    @NotNull
    oo00oO o0000O0(long j) throws IOException;

    long o0ooOOo(@NotNull o0O0O0O o0o0o0o) throws IOException;
}
