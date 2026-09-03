package p125o00O0o0O;

import android.content.Context;
import android.graphics.Bitmap;
import coil.decode.DataSource;
import java.io.File;
import java.nio.ByteBuffer;
import kotlin.coroutines.Continuation;
import o00OO00O.OooOo00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p124o00O0o00.o0000OO0;
import p131o00O0oo0.o0O0O00;
import p662o0oooO0O.oo0OOoo;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OoOo0 implements o0ooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final ByteBuffer f36627OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o0O0O00 f36628OooO0O0;

    public static final class OooO00o implements o0ooOOo.OooO00o<ByteBuffer> {
        @Override // o00O0o0O.o0ooOOo.OooO00o
        public final o0ooOOo OooO00o(Object obj, o0O0O00 o0o0o00) {
            return new o0OoOo0((ByteBuffer) obj, o0o0o00);
        }
    }

    public o0OoOo0(@NotNull ByteBuffer byteBuffer, @NotNull o0O0O00 o0o0o00) {
        this.f36627OooO00o = byteBuffer;
        this.f36628OooO0O0 = o0o0o00;
    }

    @Override // p125o00O0o0O.o0ooOOo
    @Nullable
    public final Object OooO00o(@NotNull Continuation<? super o00oO0o> continuation) {
        ByteBuffer byteBuffer = this.f36627OooO00o;
        try {
            oo0OOoo oo0oooo = new oo0OOoo();
            oo0oooo.write(byteBuffer);
            byteBuffer.position(0);
            Context context = this.f36628OooO0O0.f36838OooO00o;
            Bitmap.Config[] configArr = OooOo00.f37081OooO00o;
            File cacheDir = context.getCacheDir();
            cacheDir.mkdirs();
            return new oo0o0Oo(new o0000OO0(oo0oooo, cacheDir, null), null, DataSource.MEMORY);
        } catch (Throwable th) {
            byteBuffer.position(0);
            throw th;
        }
    }
}
