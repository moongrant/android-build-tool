package p221o00oOO;

import android.util.Base64;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.OooO0o;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import p217o00oO00o.o00000;
import p239o00oOooo.b;

/* JADX INFO: loaded from: classes.dex */
public final class o0ooOOo<Model, Data> implements o00000O0<Model, Data> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o<Data> f33761OooO00o;

    public interface OooO00o<Data> {
    }

    public static final class OooO0O0<Data> implements OooO0o<Data> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final String f33762Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final OooO00o<Data> f33763Oooo0oO;

        /* JADX INFO: Incorrect field signature: TData; */
        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public ByteArrayInputStream f33764Oooo0oo;

        public OooO0O0(String str, OooO00o<Data> oooO00o) {
            this.f33762Oooo0o = str;
            this.f33763Oooo0oO = oooO00o;
        }

        @Override // com.bumptech.glide.load.data.OooO0o
        @NonNull
        public final Class<Data> OooO00o() {
            Objects.requireNonNull((OooO0OO.OooO00o) this.f33763Oooo0oO);
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.OooO0o
        public final void OooO0O0() {
            try {
                OooO00o<Data> oooO00o = this.f33763Oooo0oO;
                ByteArrayInputStream byteArrayInputStream = this.f33764Oooo0oo;
                Objects.requireNonNull((OooO0OO.OooO00o) oooO00o);
                byteArrayInputStream.close();
            } catch (IOException unused) {
            }
        }

        @Override // com.bumptech.glide.load.data.OooO0o
        @NonNull
        public final DataSource OooO0Oo() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.OooO0o
        public final void OooO0o0(@NonNull Priority priority, @NonNull OooO0o.OooO00o<? super Data> oooO00o) {
            try {
                Object objOooO00o = ((OooO0OO.OooO00o) this.f33763Oooo0oO).OooO00o(this.f33762Oooo0o);
                this.f33764Oooo0oo = (ByteArrayInputStream) objOooO00o;
                oooO00o.OooO0o(objOooO00o);
            } catch (IllegalArgumentException e) {
                oooO00o.OooO0OO(e);
            }
        }

        @Override // com.bumptech.glide.load.data.OooO0o
        public final void cancel() {
        }
    }

    public static final class OooO0OO<Model> implements o00000O<Model, InputStream> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO00o<InputStream> f33765OooO00o = new OooO00o();

        public class OooO00o implements OooO00o<InputStream> {
            public final Object OooO00o(String str) throws IllegalArgumentException {
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

        @Override // p221o00oOO.o00000O
        @NonNull
        public final o00000O0<Model, InputStream> OooO00o(@NonNull o0000 o0000Var) {
            return new o0ooOOo(this.f33765OooO00o);
        }

        @Override // p221o00oOO.o00000O
        public final void OooO0O0() {
        }
    }

    public o0ooOOo(OooO00o<Data> oooO00o) {
        this.f33761OooO00o = oooO00o;
    }

    @Override // p221o00oOO.o00000O0
    public final boolean OooO00o(@NonNull Model model) {
        return model.toString().startsWith("data:image");
    }

    @Override // p221o00oOO.o00000O0
    public final o00000O0.OooO00o<Data> OooO0O0(@NonNull Model model, int i, int i2, @NonNull o00000 o00000Var) {
        return new o00000O0.OooO00o<>(new b(model), new OooO0O0(model.toString(), this.f33761OooO00o));
    }
}
