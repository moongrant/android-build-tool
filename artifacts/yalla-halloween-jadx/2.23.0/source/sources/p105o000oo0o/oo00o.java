package p105o000oo0o;

import android.content.Context;
import android.graphics.Bitmap;
import coil.decode.DataSource;
import java.io.File;
import java.nio.ByteBuffer;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p103o000oo00.o000O000;
import p109o000ooo.o0Oo0oo;
import p321o0O0ooO.o000O0O0;
import p659o0oooO00.o00000O;

/* JADX INFO: loaded from: classes2.dex */
public final class oo00o implements o00O0OO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final ByteBuffer f35797OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o0Oo0oo f35798OooO0O0;

    public static final class OooO00o implements o00O0OO0.OooO00o<ByteBuffer> {
        @Override // o000oo0o.o00O0OO0.OooO00o
        public final o00O0OO0 OooO00o(Object obj, o0Oo0oo o0oo0oo2) {
            return new oo00o((ByteBuffer) obj, o0oo0oo2);
        }
    }

    public oo00o(@NotNull ByteBuffer byteBuffer, @NotNull o0Oo0oo o0oo0oo2) {
        this.f35797OooO00o = byteBuffer;
        this.f35798OooO0O0 = o0oo0oo2;
    }

    @Override // p105o000oo0o.o00O0OO0
    @Nullable
    public final Object OooO00o(@NotNull Continuation<? super o00O0O0O> continuation) {
        ByteBuffer byteBuffer = this.f35797OooO00o;
        try {
            o00000O o00000o = new o00000O();
            o00000o.write(byteBuffer);
            byteBuffer.position(0);
            Context context = this.f35798OooO0O0.f35863OooO00o;
            Bitmap.Config[] configArr = o000O0O0.f42845OooO00o;
            File cacheDir = context.getCacheDir();
            cacheDir.mkdirs();
            return new oo0oOO0(new o000O000(o00000o, cacheDir, null), null, DataSource.MEMORY);
        } catch (Throwable th) {
            byteBuffer.position(0);
            throw th;
        }
    }
}
