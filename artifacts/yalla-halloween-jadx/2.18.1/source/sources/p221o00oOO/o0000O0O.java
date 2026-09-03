package p221o00oOO;

import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.OooO0o;
import p217o00oO00o.o00000;
import p239o00oOooo.b;

/* JADX INFO: loaded from: classes.dex */
public final class o0000O0O<Model> implements o00000O0<Model, Model> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final o0000O0O<?> f33712OooO00o = new o0000O0O<>();

    public static class OooO00o<Model> implements o00000O<Model, Model> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o<?> f33713OooO00o = new OooO00o<>();

        @Deprecated
        public OooO00o() {
        }

        @Override // p221o00oOO.o00000O
        @NonNull
        public final o00000O0<Model, Model> OooO00o(o0000 o0000Var) {
            return o0000O0O.f33712OooO00o;
        }

        @Override // p221o00oOO.o00000O
        public final void OooO0O0() {
        }
    }

    public static class OooO0O0<Model> implements OooO0o<Model> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final Model f33714Oooo0o;

        public OooO0O0(Model model) {
            this.f33714Oooo0o = model;
        }

        @Override // com.bumptech.glide.load.data.OooO0o
        @NonNull
        public final Class<Model> OooO00o() {
            return (Class<Model>) this.f33714Oooo0o.getClass();
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
        public final void OooO0o0(@NonNull Priority priority, @NonNull OooO0o.OooO00o<? super Model> oooO00o) {
            oooO00o.OooO0o(this.f33714Oooo0o);
        }

        @Override // com.bumptech.glide.load.data.OooO0o
        public final void cancel() {
        }
    }

    @Deprecated
    public o0000O0O() {
    }

    @Override // p221o00oOO.o00000O0
    public final boolean OooO00o(@NonNull Model model) {
        return true;
    }

    @Override // p221o00oOO.o00000O0
    public final o00000O0.OooO00o<Model> OooO0O0(@NonNull Model model, int i, int i2, @NonNull o00000 o00000Var) {
        return new o00000O0.OooO00o<>(new b(model), new OooO0O0(model));
    }
}
