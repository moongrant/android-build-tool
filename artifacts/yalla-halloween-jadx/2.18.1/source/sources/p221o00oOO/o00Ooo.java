package p221o00oOO;

import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p217o00oO00o.o00000;
import p239o00oOooo.b;

/* JADX INFO: loaded from: classes.dex */
public final class o00Ooo<Data> implements o00000O0<byte[], Data> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0O0<Data> f33739OooO00o;

    public static class OooO00o implements o00000O<byte[], ByteBuffer> {

        /* JADX INFO: renamed from: o00oOO.o00Ooo$OooO00o$OooO00o, reason: collision with other inner class name */
        public class C0351OooO00o implements OooO0O0<ByteBuffer> {
            @Override // o00oOO.o00Ooo.OooO0O0
            public final Class<ByteBuffer> OooO00o() {
                return ByteBuffer.class;
            }

            @Override // o00oOO.o00Ooo.OooO0O0
            public final ByteBuffer OooO0O0(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // p221o00oOO.o00000O
        @NonNull
        public final o00000O0<byte[], ByteBuffer> OooO00o(@NonNull o0000 o0000Var) {
            return new o00Ooo(new C0351OooO00o());
        }

        @Override // p221o00oOO.o00000O
        public final void OooO0O0() {
        }
    }

    public interface OooO0O0<Data> {
        Class<Data> OooO00o();

        Data OooO0O0(byte[] bArr);
    }

    public static class OooO0OO<Data> implements com.bumptech.glide.load.data.OooO0o<Data> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final byte[] f33740Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final OooO0O0<Data> f33741Oooo0oO;

        public OooO0OO(byte[] bArr, OooO0O0<Data> oooO0O0) {
            this.f33740Oooo0o = bArr;
            this.f33741Oooo0oO = oooO0O0;
        }

        @Override // com.bumptech.glide.load.data.OooO0o
        @NonNull
        public final Class<Data> OooO00o() {
            return this.f33741Oooo0oO.OooO00o();
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
        public final void OooO0o0(@NonNull Priority priority, @NonNull com.bumptech.glide.load.data.OooO0o.OooO00o<? super Data> oooO00o) {
            oooO00o.OooO0o(this.f33741Oooo0oO.OooO0O0(this.f33740Oooo0o));
        }

        @Override // com.bumptech.glide.load.data.OooO0o
        public final void cancel() {
        }
    }

    public static class OooO0o implements o00000O<byte[], InputStream> {

        public class OooO00o implements OooO0O0<InputStream> {
            @Override // o00oOO.o00Ooo.OooO0O0
            public final Class<InputStream> OooO00o() {
                return InputStream.class;
            }

            @Override // o00oOO.o00Ooo.OooO0O0
            public final InputStream OooO0O0(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // p221o00oOO.o00000O
        @NonNull
        public final o00000O0<byte[], InputStream> OooO00o(@NonNull o0000 o0000Var) {
            return new o00Ooo(new OooO00o());
        }

        @Override // p221o00oOO.o00000O
        public final void OooO0O0() {
        }
    }

    public o00Ooo(OooO0O0<Data> oooO0O0) {
        this.f33739OooO00o = oooO0O0;
    }

    @Override // p221o00oOO.o00000O0
    public final /* bridge */ /* synthetic */ boolean OooO00o(@NonNull byte[] bArr) {
        return true;
    }

    @Override // p221o00oOO.o00000O0
    public final o00000O0.OooO00o OooO0O0(@NonNull byte[] bArr, int i, int i2, @NonNull o00000 o00000Var) {
        byte[] bArr2 = bArr;
        return new o00000O0.OooO00o(new b(bArr2), new OooO0OO(bArr2, this.f33739OooO00o));
    }
}
