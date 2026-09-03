package o00OO00O;

import android.util.Base64;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import p126o00O0oOo.o00000;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO<Model, Data> implements o0OoOo0<Model, Data> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o<Data> f37074OooO00o;

    public interface OooO00o<Data> {
    }

    public static final class OooO0O0<Data> implements com.bumptech.glide.load.data.OooO0o<Data> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final String f37075OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public ByteArrayInputStream f37076OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final OooO00o<Data> f37077OooO0o0;

        public OooO0O0(String str, OooO00o<Data> oooO00o) {
            this.f37075OooO0Oo = str;
            this.f37077OooO0o0 = oooO00o;
        }

        @Override // com.bumptech.glide.load.data.OooO0o
        @NonNull
        public final Class<Data> OooO00o() {
            this.f37077OooO0o0.getClass();
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.OooO0o
        public final void OooO0O0() {
            try {
                OooO00o<Data> oooO00o = this.f37077OooO0o0;
                ByteArrayInputStream byteArrayInputStream = this.f37076OooO0o;
                ((OooO0OO.OooO00o) oooO00o).getClass();
                byteArrayInputStream.close();
            } catch (IOException unused) {
            }
        }

        @Override // com.bumptech.glide.load.data.OooO0o
        public final void OooO0Oo(@NonNull Priority priority, @NonNull com.bumptech.glide.load.data.OooO0o.OooO00o<? super Data> oooO00o) {
            try {
                ByteArrayInputStream byteArrayInputStreamOooO00o = ((OooO0OO.OooO00o) this.f37077OooO0o0).OooO00o(this.f37075OooO0Oo);
                this.f37076OooO0o = byteArrayInputStreamOooO00o;
                oooO00o.OooO0o0(byteArrayInputStreamOooO00o);
            } catch (IllegalArgumentException e) {
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

    public static final class OooO0OO<Model> implements o00O0O<Model, InputStream> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO00o f37078OooO00o = new OooO00o();

        public class OooO00o implements OooO00o<InputStream> {
            public final ByteArrayInputStream OooO00o(String str) throws IllegalArgumentException {
                if (!str.startsWith("data:image")) {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
                int iIndexOf = str.indexOf(44);
                if (iIndexOf == -1) {
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                if (str.substring(0, iIndexOf).endsWith(";base64")) {
                    return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
                }
                throw new IllegalArgumentException("Not a base64 image data URL.");
            }
        }

        @Override // o00OO00O.o00O0O
        @NonNull
        public final o0OoOo0<Model, InputStream> OooO0OO(@NonNull oo000o oo000oVar) {
            return new OooO(this.f37078OooO00o);
        }

        @Override // o00OO00O.o00O0O
        public final void OooO0Oo() {
        }
    }

    public OooO(OooO0OO.OooO00o oooO00o) {
        this.f37074OooO00o = oooO00o;
    }

    @Override // o00OO00O.o0OoOo0
    public final boolean OooO00o(@NonNull Model model) {
        return model.toString().startsWith("data:image");
    }

    @Override // o00OO00O.o0OoOo0
    public final o0OoOo0.OooO00o<Data> OooO0O0(@NonNull Model model, int i, int i2, @NonNull o00000 o00000Var) {
        return new o0OoOo0.OooO00o<>(new o00OOO0O.OooO0o(model), new OooO0O0(model.toString(), this.f37074OooO00o));
    }
}
