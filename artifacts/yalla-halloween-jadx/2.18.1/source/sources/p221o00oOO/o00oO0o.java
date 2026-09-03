package p221o00oOO;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.OooO0o;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import p217o00oO00o.o00000;
import p239o00oOooo.b;
import p243o00oo00O.o0000Ooo;

/* JADX INFO: loaded from: classes.dex */
public final class o00oO0o implements o00000O0<File, ByteBuffer> {

    public static final class OooO00o implements OooO0o<ByteBuffer> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final File f33742Oooo0o;

        public OooO00o(File file) {
            this.f33742Oooo0o = file;
        }

        @Override // com.bumptech.glide.load.data.OooO0o
        @NonNull
        public final Class<ByteBuffer> OooO00o() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.OooO0o
        public final void OooO0O0() {
        }

        @Override // com.bumptech.glide.load.data.OooO0o
        @NonNull
        public final DataSource OooO0Oo() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.OooO0o
        public final void OooO0o0(@NonNull Priority priority, @NonNull OooO0o.OooO00o<? super ByteBuffer> oooO00o) {
            try {
                oooO00o.OooO0o(o0000Ooo.OooO00o(this.f33742Oooo0o));
            } catch (IOException e) {
                if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e);
                }
                oooO00o.OooO0OO(e);
            }
        }

        @Override // com.bumptech.glide.load.data.OooO0o
        public final void cancel() {
        }
    }

    public static class OooO0O0 implements o00000O<File, ByteBuffer> {
        @Override // p221o00oOO.o00000O
        @NonNull
        public final o00000O0<File, ByteBuffer> OooO00o(@NonNull o0000 o0000Var) {
            return new o00oO0o();
        }

        @Override // p221o00oOO.o00000O
        public final void OooO0O0() {
        }
    }

    @Override // p221o00oOO.o00000O0
    public final /* bridge */ /* synthetic */ boolean OooO00o(@NonNull File file) {
        return true;
    }

    @Override // p221o00oOO.o00000O0
    public final o00000O0.OooO00o<ByteBuffer> OooO0O0(@NonNull File file, int i, int i2, @NonNull o00000 o00000Var) {
        File file2 = file;
        return new o00000O0.OooO00o<>(new b(file2), new OooO00o(file2));
    }
}
