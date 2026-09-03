package p221o00oOO;

import androidx.annotation.NonNull;
import androidx.lifecycle.OooOOO;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o000OO0O.OooO;

/* JADX INFO: loaded from: classes.dex */
public final class o00000OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0000 f33699OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o f33700OooO0O0;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Map<Class<?>, C0350OooO00o<?>> f33701OooO00o = new HashMap();

        /* JADX INFO: renamed from: o00oOO.o00000OO$OooO00o$OooO00o, reason: collision with other inner class name */
        public static class C0350OooO00o<Model> {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final List<o00000O0<Model, ?>> f33702OooO00o;

            public C0350OooO00o(List<o00000O0<Model, ?>> list) {
                this.f33702OooO00o = list;
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final <Model> void OooO00o(Class<Model> cls, List<o00000O0<Model, ?>> list) {
            if (this.f33701OooO00o.put((Class<?>) cls, new C0350OooO00o<>(list)) != null) {
                throw new IllegalStateException(OooOOO.OooO00o("Already cached loaders for model: ", cls));
            }
        }
    }

    public o00000OO(@NonNull OooO<List<Throwable>> oooO) {
        o0000 o0000Var = new o0000(oooO);
        this.f33700OooO0O0 = new OooO00o();
        this.f33699OooO00o = o0000Var;
    }
}
