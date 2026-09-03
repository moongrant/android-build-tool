package o00OO00O;

import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p126o00O0oOo.o00000;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0<Data> implements o0OoOo0<byte[], Data> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC0430OooO0O0<Data> f37083OooO00o;

    public static class OooO00o implements o00O0O<byte[], ByteBuffer> {

        /* JADX INFO: renamed from: o00OO00O.OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
        public class C0429OooO00o implements InterfaceC0430OooO0O0<ByteBuffer> {
            @Override // o00OO00O.OooO0O0.InterfaceC0430OooO0O0
            public final Class<ByteBuffer> OooO00o() {
                return ByteBuffer.class;
            }

            @Override // o00OO00O.OooO0O0.InterfaceC0430OooO0O0
            public final ByteBuffer OooO0O0(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // o00OO00O.o00O0O
        @NonNull
        public final o0OoOo0<byte[], ByteBuffer> OooO0OO(@NonNull oo000o oo000oVar) {
            return new OooO0O0(new C0429OooO00o());
        }

        @Override // o00OO00O.o00O0O
        public final void OooO0Oo() {
        }
    }

    /* JADX INFO: renamed from: o00OO00O.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public interface InterfaceC0430OooO0O0<Data> {
        Class<Data> OooO00o();

        Data OooO0O0(byte[] bArr);
    }

    public static class OooO0OO<Data> implements com.bumptech.glide.load.data.OooO0o<Data> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final byte[] f37084OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final InterfaceC0430OooO0O0<Data> f37085OooO0o0;

        public OooO0OO(byte[] bArr, InterfaceC0430OooO0O0<Data> interfaceC0430OooO0O0) {
            this.f37084OooO0Oo = bArr;
            this.f37085OooO0o0 = interfaceC0430OooO0O0;
        }

        @Override // com.bumptech.glide.load.data.OooO0o
        @NonNull
        public final Class<Data> OooO00o() {
            return this.f37085OooO0o0.OooO00o();
        }

        @Override // com.bumptech.glide.load.data.OooO0o
        public final void OooO0O0() {
        }

        @Override // com.bumptech.glide.load.data.OooO0o
        public final void OooO0Oo(@NonNull Priority priority, @NonNull com.bumptech.glide.load.data.OooO0o.OooO00o<? super Data> oooO00o) {
            oooO00o.OooO0o0(this.f37085OooO0o0.OooO0O0(this.f37084OooO0Oo));
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

    public static class OooO0o implements o00O0O<byte[], InputStream> {

        public class OooO00o implements InterfaceC0430OooO0O0<InputStream> {
            @Override // o00OO00O.OooO0O0.InterfaceC0430OooO0O0
            public final Class<InputStream> OooO00o() {
                return InputStream.class;
            }

            @Override // o00OO00O.OooO0O0.InterfaceC0430OooO0O0
            public final InputStream OooO0O0(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // o00OO00O.o00O0O
        @NonNull
        public final o0OoOo0<byte[], InputStream> OooO0OO(@NonNull oo000o oo000oVar) {
            return new OooO0O0(new OooO00o());
        }

        @Override // o00OO00O.o00O0O
        public final void OooO0Oo() {
        }
    }

    public OooO0O0(InterfaceC0430OooO0O0<Data> interfaceC0430OooO0O0) {
        this.f37083OooO00o = interfaceC0430OooO0O0;
    }

    @Override // o00OO00O.o0OoOo0
    public final /* bridge */ /* synthetic */ boolean OooO00o(@NonNull byte[] bArr) {
        return true;
    }

    @Override // o00OO00O.o0OoOo0
    public final o0OoOo0.OooO00o OooO0O0(@NonNull byte[] bArr, int i, int i2, @NonNull o00000 o00000Var) {
        byte[] bArr2 = bArr;
        return new o0OoOo0.OooO00o(new o00OOO0O.OooO0o(bArr2), new OooO0OO(bArr2, this.f37083OooO00o));
    }
}
