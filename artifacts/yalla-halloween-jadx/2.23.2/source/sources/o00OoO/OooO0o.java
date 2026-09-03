package o00OoO;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import p173o00OooOO.oo00o;
import p174o00OooOo.o00O0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o implements o0OoOo0<File, ByteBuffer> {

    public static final class OooO00o implements com.bumptech.glide.load.data.OooO0o<ByteBuffer> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final File f37848OooO0Oo;

        public OooO00o(File file) {
            this.f37848OooO0Oo = file;
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
        public final void OooO0Oo(@NonNull Priority priority, @NonNull com.bumptech.glide.load.data.OooO0o.OooO00o<? super ByteBuffer> oooO00o) {
            try {
                oooO00o.OooO0o0(o00O0.OooO00o(this.f37848OooO0Oo));
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

        @Override // com.bumptech.glide.load.data.OooO0o
        @NonNull
        public final DataSource getDataSource() {
            return DataSource.LOCAL;
        }
    }

    public static class OooO0O0 implements o00O0O<File, ByteBuffer> {
        @Override // o00OoO.o00O0O
        public final void OooO0OO() {
        }

        @Override // o00OoO.o00O0O
        @NonNull
        public final o0OoOo0<File, ByteBuffer> OooO0Oo(@NonNull oo000o oo000oVar) {
            return new OooO0o();
        }
    }

    @Override // o00OoO.o0OoOo0
    public final /* bridge */ /* synthetic */ boolean OooO00o(@NonNull File file) {
        return true;
    }

    @Override // o00OoO.o0OoOo0
    public final o0OoOo0.OooO00o<ByteBuffer> OooO0O0(@NonNull File file, int i, int i2, @NonNull p154o00Oo0oo.oo0o0Oo oo0o0oo) {
        File file2 = file;
        return new o0OoOo0.OooO00o<>(new oo00o(file2), new OooO00o(file2));
    }
}
