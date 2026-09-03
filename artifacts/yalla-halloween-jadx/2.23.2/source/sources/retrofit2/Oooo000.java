package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import p641o0ooOO0o.o0O00O0o;

/* JADX INFO: loaded from: classes5.dex */
public final class Oooo000 extends OooO0OO.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final Executor f60491OooO00o;

    public static final class OooO00o<T> implements OooO0O0<T> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Executor f60492OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final OooO0O0<T> f60493OooO0o0;

        /* JADX INFO: renamed from: retrofit2.Oooo000$OooO00o$OooO00o, reason: collision with other inner class name */
        public class C0499OooO00o implements OooO0o<T> {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final /* synthetic */ OooO0o f60494OooO00o;

            public C0499OooO00o(OooO0o oooO0o) {
                this.f60494OooO00o = oooO0o;
            }

            @Override // retrofit2.OooO0o
            public final void OooO00o(final Throwable th) {
                Executor executor = OooO00o.this.f60492OooO0Oo;
                final OooO0o oooO0o = this.f60494OooO00o;
                executor.execute(new Runnable() { // from class: retrofit2.OooOo
                    @Override // java.lang.Runnable
                    public final void run() {
                        Oooo000.OooO00o oooO00o = Oooo000.OooO00o.this;
                        oooO0o.OooO00o(th);
                    }
                });
            }

            @Override // retrofit2.OooO0o
            public final void OooO0O0(OooO0O0<T> oooO0O0, final o0000O0<T> o0000o1) {
                Executor executor = OooO00o.this.f60492OooO0Oo;
                final OooO0o oooO0o = this.f60494OooO00o;
                executor.execute(new Runnable() { // from class: retrofit2.OooOo00
                    @Override // java.lang.Runnable
                    public final void run() {
                        Oooo000.OooO00o oooO00o = Oooo000.OooO00o.this;
                        boolean zIsCanceled = oooO00o.f60493OooO0o0.isCanceled();
                        OooO0o oooO0o2 = oooO0o;
                        if (zIsCanceled) {
                            oooO0o2.OooO00o(new IOException("Canceled"));
                        } else {
                            oooO0o2.OooO0O0(oooO00o, o0000o1);
                        }
                    }
                });
            }
        }

        public OooO00o(Executor executor, OooO0O0<T> oooO0O0) {
            this.f60492OooO0Oo = executor;
            this.f60493OooO0o0 = oooO0O0;
        }

        @Override // retrofit2.OooO0O0
        public final o0O00O0o OooO00o() {
            return this.f60493OooO0o0.OooO00o();
        }

        @Override // retrofit2.OooO0O0
        public final o0000O0<T> OooO0OO() throws IOException {
            return this.f60493OooO0o0.OooO0OO();
        }

        @Override // retrofit2.OooO0O0
        public final void OooOooo(OooO0o<T> oooO0o) {
            Objects.requireNonNull(oooO0o, "callback == null");
            this.f60493OooO0o0.OooOooo(new C0499OooO00o(oooO0o));
        }

        @Override // retrofit2.OooO0O0
        public final void cancel() {
            this.f60493OooO0o0.cancel();
        }

        @Override // retrofit2.OooO0O0
        public final boolean isCanceled() {
            return this.f60493OooO0o0.isCanceled();
        }

        @Override // retrofit2.OooO0O0
        public final OooO0O0<T> clone() {
            return new OooO00o(this.f60492OooO0Oo, this.f60493OooO0o0.clone());
        }
    }

    public Oooo000(@Nullable Executor executor) {
        this.f60491OooO00o = executor;
    }

    @Override // retrofit2.OooO0OO.OooO00o
    @Nullable
    public final OooO0OO OooO00o(Type type, Annotation[] annotationArr) {
        if (o0000O.OooO0o(type) != OooO0O0.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new OooOOOO(o0000O.OooO0o0(0, (ParameterizedType) type), o0000O.OooO(annotationArr, SkipCallbackExecutor.class) ? null : this.f60491OooO00o);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
