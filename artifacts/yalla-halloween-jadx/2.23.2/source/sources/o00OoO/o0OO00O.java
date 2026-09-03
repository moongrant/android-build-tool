package o00OoO;

import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import p173o00OooOO.oo00o;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OO00O<Model> implements o0OoOo0<Model, Model> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final o0OO00O<?> f37907OooO00o = new o0OO00O<>();

    public static class OooO00o<Model> implements o00O0O<Model, Model> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o<?> f37908OooO00o = new OooO00o<>();

        @Override // o00OoO.o00O0O
        public final void OooO0OO() {
        }

        @Override // o00OoO.o00O0O
        @NonNull
        public final o0OoOo0<Model, Model> OooO0Oo(oo000o oo000oVar) {
            return o0OO00O.f37907OooO00o;
        }
    }

    public static class OooO0O0<Model> implements com.bumptech.glide.load.data.OooO0o<Model> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Model f37909OooO0Oo;

        public OooO0O0(Model model) {
            this.f37909OooO0Oo = model;
        }

        @Override // com.bumptech.glide.load.data.OooO0o
        @NonNull
        public final Class<Model> OooO00o() {
            return (Class<Model>) this.f37909OooO0Oo.getClass();
        }

        @Override // com.bumptech.glide.load.data.OooO0o
        public final void OooO0O0() {
        }

        @Override // com.bumptech.glide.load.data.OooO0o
        public final void OooO0Oo(@NonNull Priority priority, @NonNull com.bumptech.glide.load.data.OooO0o.OooO00o<? super Model> oooO00o) {
            oooO00o.OooO0o0(this.f37909OooO0Oo);
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

    @Override // o00OoO.o0OoOo0
    public final boolean OooO00o(@NonNull Model model) {
        return true;
    }

    @Override // o00OoO.o0OoOo0
    public final o0OoOo0.OooO00o<Model> OooO0O0(@NonNull Model model, int i, int i2, @NonNull p154o00Oo0oo.oo0o0Oo oo0o0oo) {
        return new o0OoOo0.OooO00o<>(new oo00o(model), new OooO0O0(model));
    }
}
