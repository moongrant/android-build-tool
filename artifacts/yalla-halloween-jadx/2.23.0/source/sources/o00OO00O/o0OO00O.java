package o00OO00O;

import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import p126o00O0oOo.o00000;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OO00O<Model> implements o0OoOo0<Model, Model> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final o0OO00O<?> f37145OooO00o = new o0OO00O<>();

    public static class OooO00o<Model> implements o00O0O<Model, Model> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o<?> f37146OooO00o = new OooO00o<>();

        @Override // o00OO00O.o00O0O
        @NonNull
        public final o0OoOo0<Model, Model> OooO0OO(oo000o oo000oVar) {
            return o0OO00O.f37145OooO00o;
        }

        @Override // o00OO00O.o00O0O
        public final void OooO0Oo() {
        }
    }

    public static class OooO0O0<Model> implements com.bumptech.glide.load.data.OooO0o<Model> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Model f37147OooO0Oo;

        public OooO0O0(Model model) {
            this.f37147OooO0Oo = model;
        }

        @Override // com.bumptech.glide.load.data.OooO0o
        @NonNull
        public final Class<Model> OooO00o() {
            return (Class<Model>) this.f37147OooO0Oo.getClass();
        }

        @Override // com.bumptech.glide.load.data.OooO0o
        public final void OooO0O0() {
        }

        @Override // com.bumptech.glide.load.data.OooO0o
        public final void OooO0Oo(@NonNull Priority priority, @NonNull com.bumptech.glide.load.data.OooO0o.OooO00o<? super Model> oooO00o) {
            oooO00o.OooO0o0(this.f37147OooO0Oo);
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

    @Override // o00OO00O.o0OoOo0
    public final boolean OooO00o(@NonNull Model model) {
        return true;
    }

    @Override // o00OO00O.o0OoOo0
    public final o0OoOo0.OooO00o<Model> OooO0O0(@NonNull Model model, int i, int i2, @NonNull o00000 o00000Var) {
        return new o0OoOo0.OooO00o<>(new o00OOO0O.OooO0o(model), new OooO0O0(model));
    }
}
