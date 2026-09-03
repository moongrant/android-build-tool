package o00OoO;

import android.util.Base64;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import p173o00OooOO.oo00o;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO<Model, Data> implements o0OoOo0<Model, Data> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o<Data> f37836OooO00o;

    public interface OooO00o<Data> {
    }

    public static final class OooO0O0<Data> implements com.bumptech.glide.load.data.OooO0o<Data> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final String f37837OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public ByteArrayInputStream f37838OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final OooO00o<Data> f37839OooO0o0;

        public OooO0O0(String str, OooO00o<Data> oooO00o) {
            this.f37837OooO0Oo = str;
            this.f37839OooO0o0 = oooO00o;
        }

        @Override // com.bumptech.glide.load.data.OooO0o
        @NonNull
        public final Class<Data> OooO00o() {
            this.f37839OooO0o0.getClass();
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.OooO0o
        public final void OooO0O0() {
            try {
                OooO00o<Data> oooO00o = this.f37839OooO0o0;
                ByteArrayInputStream byteArrayInputStream = this.f37838OooO0o;
                ((OooO0OO.OooO00o) oooO00o).getClass();
                byteArrayInputStream.close();
            } catch (IOException unused) {
            }
        }

        @Override // com.bumptech.glide.load.data.OooO0o
        public final void OooO0Oo(@NonNull Priority priority, @NonNull com.bumptech.glide.load.data.OooO0o.OooO00o<? super Data> oooO00o) {
            try {
                ByteArrayInputStream byteArrayInputStreamOooO00o = ((OooO0OO.OooO00o) this.f37839OooO0o0).OooO00o(this.f37837OooO0Oo);
                this.f37838OooO0o = byteArrayInputStreamOooO00o;
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
        public final OooO00o f37840OooO00o = new OooO00o();

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

        @Override // o00OoO.o00O0O
        public final void OooO0OO() {
        }

        @Override // o00OoO.o00O0O
        @NonNull
        public final o0OoOo0<Model, InputStream> OooO0Oo(@NonNull oo000o oo000oVar) {
            return new OooO(this.f37840OooO00o);
        }
    }

    public OooO(OooO0OO.OooO00o oooO00o) {
        this.f37836OooO00o = oooO00o;
    }

    @Override // o00OoO.o0OoOo0
    public final boolean OooO00o(@NonNull Model model) {
        return model.toString().startsWith("data:image");
    }

    @Override // o00OoO.o0OoOo0
    public final o0OoOo0.OooO00o<Data> OooO0O0(@NonNull Model model, int i, int i2, @NonNull p154o00Oo0oo.oo0o0Oo oo0o0oo) {
        return new o0OoOo0.OooO00o<>(new oo00o(model), new OooO0O0(model.toString(), this.f37836OooO00o));
    }
}
