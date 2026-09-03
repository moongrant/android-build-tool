package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import p634o0ooO0oO.o00OOOOo;

/* JADX INFO: loaded from: classes5.dex */
public final class Oooo0 extends OooO0OO.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final Executor f61020OooO00o;

    public static final class OooO00o<T> implements OooO0O0<T> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Executor f61021OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final OooO0O0<T> f61022OooO0o0;

        /* JADX INFO: renamed from: retrofit2.Oooo0$OooO00o$OooO00o, reason: collision with other inner class name */
        public class C0524OooO00o implements OooO0o<T> {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final /* synthetic */ OooO0o f61023OooO00o;

            public C0524OooO00o(OooO0o oooO0o) {
                this.f61023OooO00o = oooO0o;
            }

            @Override // retrofit2.OooO0o
            public final void OooO00o(final Throwable th) {
                Executor executor = OooO00o.this.f61021OooO0Oo;
                final OooO0o oooO0o = this.f61023OooO00o;
                executor.execute(new Runnable() { // from class: retrofit2.Oooo000
                    @Override // java.lang.Runnable
                    public final void run() {
                        Oooo0.OooO00o oooO00o = Oooo0.OooO00o.this;
                        oooO0o.OooO00o(th);
                    }
                });
            }

            @Override // retrofit2.OooO0o
            public final void OooO0O0(OooO0O0<T> oooO0O0, final o0000O0O<T> o0000o0o2) {
                Executor executor = OooO00o.this.f61021OooO0Oo;
                final OooO0o oooO0o = this.f61023OooO00o;
                executor.execute(new Runnable() { // from class: retrofit2.OooOo
                    @Override // java.lang.Runnable
                    public final void run() {
                        Oooo0.OooO00o oooO00o = Oooo0.OooO00o.this;
                        boolean zIsCanceled = oooO00o.f61022OooO0o0.isCanceled();
                        OooO0o oooO0o2 = oooO0o;
                        if (zIsCanceled) {
                            oooO0o2.OooO00o(new IOException("Canceled"));
                        } else {
                            oooO0o2.OooO0O0(oooO00o, o0000o0o2);
                        }
                    }
                });
            }
        }

        public OooO00o(Executor executor, OooO0O0<T> oooO0O0) {
            this.f61021OooO0Oo = executor;
            this.f61022OooO0o0 = oooO0O0;
        }

        @Override // retrofit2.OooO0O0
        public final o00OOOOo OooO00o() {
            return this.f61022OooO0o0.OooO00o();
        }

        @Override // retrofit2.OooO0O0
        public final o0000O0O<T> OooO0OO() throws IOException {
            return this.f61022OooO0o0.OooO0OO();
        }

        @Override // retrofit2.OooO0O0
        public final void OooOooO(OooO0o<T> oooO0o) {
            Objects.requireNonNull(oooO0o, "callback == null");
            this.f61022OooO0o0.OooOooO(new C0524OooO00o(oooO0o));
        }

        @Override // retrofit2.OooO0O0
        public final void cancel() {
            this.f61022OooO0o0.cancel();
        }

        @Override // retrofit2.OooO0O0
        public final boolean isCanceled() {
            return this.f61022OooO0o0.isCanceled();
        }

        @Override // retrofit2.OooO0O0
        public final OooO0O0<T> clone() {
            return new OooO00o(this.f61021OooO0Oo, this.f61022OooO0o0.clone());
        }
    }

    public Oooo0(@Nullable Executor executor) {
        this.f61020OooO00o = executor;
    }

    @Override // retrofit2.OooO0OO.OooO00o
    @Nullable
    public final OooO0OO OooO00o(Type type, Annotation[] annotationArr) {
        if (o0000OO0.OooO0o(type) != OooO0O0.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new OooOo00(o0000OO0.OooO0o0(0, (ParameterizedType) type), o0000OO0.OooO(annotationArr, SkipCallbackExecutor.class) ? null : this.f61020OooO00o);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
