package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import p660o0ooo0o0.o00OOO00;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOOOO extends OooO0OO.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final Executor f53748OooO00o;

    public static final class OooO00o<T> implements OooO0O0<T> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final Executor f53749Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final OooO0O0<T> f53750Oooo0oO;

        /* JADX INFO: renamed from: retrofit2.OooOOOO$OooO00o$OooO00o, reason: collision with other inner class name */
        public class C0449OooO00o implements OooO0o<T> {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final /* synthetic */ OooO0o f53751OooO00o;

            public C0449OooO00o(OooO0o oooO0o) {
                this.f53751OooO00o = oooO0o;
            }

            @Override // retrofit2.OooO0o
            public final void OooO00o(final Throwable th) {
                Executor executor = OooO00o.this.f53749Oooo0o;
                final OooO0o oooO0o = this.f53751OooO00o;
                executor.execute(new Runnable() { // from class: retrofit2.OooOOO0
                    @Override // java.lang.Runnable
                    public final void run() {
                        OooOOOO.OooO00o.C0449OooO00o c0449OooO00o = this.f53745Oooo0o;
                        OooO0o oooO0o2 = oooO0o;
                        Throwable th2 = th;
                        OooOOOO.OooO00o oooO00o = OooOOOO.OooO00o.this;
                        oooO0o2.OooO00o(th2);
                    }
                });
            }

            @Override // retrofit2.OooO0o
            public final void OooO0O0(OooO0O0<T> oooO0O0, final oo0o0Oo<T> oo0o0oo) {
                Executor executor = OooO00o.this.f53749Oooo0o;
                final OooO0o oooO0o = this.f53751OooO00o;
                executor.execute(new Runnable() { // from class: retrofit2.OooOOO
                    @Override // java.lang.Runnable
                    public final void run() {
                        OooOOOO.OooO00o.C0449OooO00o c0449OooO00o = this.f53742Oooo0o;
                        OooO0o oooO0o2 = oooO0o;
                        oo0o0Oo oo0o0oo2 = oo0o0oo;
                        if (OooOOOO.OooO00o.this.f53750Oooo0oO.OooO0oo()) {
                            oooO0o2.OooO00o(new IOException("Canceled"));
                        } else {
                            oooO0o2.OooO0O0(OooOOOO.OooO00o.this, oo0o0oo2);
                        }
                    }
                });
            }
        }

        public OooO00o(Executor executor, OooO0O0<T> oooO0O0) {
            this.f53749Oooo0o = executor;
            this.f53750Oooo0oO = oooO0O0;
        }

        @Override // retrofit2.OooO0O0
        public final o00OOO00 OooO00o() {
            return this.f53750Oooo0oO.OooO00o();
        }

        @Override // retrofit2.OooO0O0
        public final oo0o0Oo<T> OooO0O0() throws IOException {
            return this.f53750Oooo0oO.OooO0O0();
        }

        @Override // retrofit2.OooO0O0
        public final boolean OooO0oo() {
            return this.f53750Oooo0oO.OooO0oo();
        }

        @Override // retrofit2.OooO0O0
        public final void OoooOo0(OooO0o<T> oooO0o) {
            Objects.requireNonNull(oooO0o, "callback == null");
            this.f53750Oooo0oO.OoooOo0(new C0449OooO00o(oooO0o));
        }

        @Override // retrofit2.OooO0O0
        public final void cancel() {
            this.f53750Oooo0oO.cancel();
        }

        public final Object clone() throws CloneNotSupportedException {
            return new OooO00o(this.f53749Oooo0o, this.f53750Oooo0oO.mo2076clone());
        }

        @Override // retrofit2.OooO0O0
        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public final OooO0O0<T> mo2076clone() {
            return new OooO00o(this.f53749Oooo0o, this.f53750Oooo0oO.mo2076clone());
        }
    }

    public OooOOOO(@Nullable Executor executor) {
        this.f53748OooO00o = executor;
    }

    @Override // retrofit2.OooO0OO.OooO00o
    @Nullable
    public final OooO0OO OooO00o(Type type, Annotation[] annotationArr) {
        if (o000000.OooO0o(type) != OooO0O0.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new OooOO0O(o000000.OooO0o0(0, (ParameterizedType) type), o000000.OooO(annotationArr, SkipCallbackExecutor.class) ? null : this.f53748OooO00o);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
