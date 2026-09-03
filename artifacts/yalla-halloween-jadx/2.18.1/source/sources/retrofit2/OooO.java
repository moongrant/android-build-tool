package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: loaded from: classes4.dex */
@IgnoreJRERequirement
public final class OooO extends retrofit2.OooO0OO.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO f53727OooO00o = new OooO();

    @IgnoreJRERequirement
    public static final class OooO00o<R> implements retrofit2.OooO0OO<R, CompletableFuture<R>> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Type f53728OooO00o;

        /* JADX INFO: renamed from: retrofit2.OooO$OooO00o$OooO00o, reason: collision with other inner class name */
        @IgnoreJRERequirement
        public class C0447OooO00o implements OooO0o<R> {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final CompletableFuture<R> f53729OooO00o;

            public C0447OooO00o(CompletableFuture<R> completableFuture) {
                this.f53729OooO00o = completableFuture;
            }

            @Override // retrofit2.OooO0o
            public final void OooO00o(Throwable th) {
                this.f53729OooO00o.completeExceptionally(th);
            }

            @Override // retrofit2.OooO0o
            public final void OooO0O0(retrofit2.OooO0O0<R> oooO0O0, oo0o0Oo<R> oo0o0oo) {
                if (oo0o0oo.OooO00o()) {
                    this.f53729OooO00o.complete(oo0o0oo.f53907OooO0O0);
                } else {
                    this.f53729OooO00o.completeExceptionally(new HttpException(oo0o0oo));
                }
            }
        }

        public OooO00o(Type type) {
            this.f53728OooO00o = type;
        }

        @Override // retrofit2.OooO0OO
        public final Object OooO00o(retrofit2.OooO0O0 oooO0O0) {
            OooO0O0 oooO0O1 = new OooO0O0(oooO0O0);
            ((o00Oo0) oooO0O0).OoooOo0(new C0447OooO00o(oooO0O1));
            return oooO0O1;
        }

        @Override // retrofit2.OooO0OO
        public final Type responseType() {
            return this.f53728OooO00o;
        }
    }

    @IgnoreJRERequirement
    public static final class OooO0O0<T> extends CompletableFuture<T> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final retrofit2.OooO0O0<?> f53730Oooo0o;

        public OooO0O0(retrofit2.OooO0O0<?> oooO0O0) {
            this.f53730Oooo0o = oooO0O0;
        }

        @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
        public final boolean cancel(boolean z) {
            if (z) {
                this.f53730Oooo0o.cancel();
            }
            return super.cancel(z);
        }
    }

    @IgnoreJRERequirement
    public static final class OooO0OO<R> implements retrofit2.OooO0OO<R, CompletableFuture<oo0o0Oo<R>>> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Type f53731OooO00o;

        @IgnoreJRERequirement
        public class OooO00o implements OooO0o<R> {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final CompletableFuture<oo0o0Oo<R>> f53732OooO00o;

            public OooO00o(CompletableFuture<oo0o0Oo<R>> completableFuture) {
                this.f53732OooO00o = completableFuture;
            }

            @Override // retrofit2.OooO0o
            public final void OooO00o(Throwable th) {
                this.f53732OooO00o.completeExceptionally(th);
            }

            @Override // retrofit2.OooO0o
            public final void OooO0O0(retrofit2.OooO0O0<R> oooO0O0, oo0o0Oo<R> oo0o0oo) {
                this.f53732OooO00o.complete(oo0o0oo);
            }
        }

        public OooO0OO(Type type) {
            this.f53731OooO00o = type;
        }

        @Override // retrofit2.OooO0OO
        public final Object OooO00o(retrofit2.OooO0O0 oooO0O0) {
            OooO0O0 oooO0O1 = new OooO0O0(oooO0O0);
            ((o00Oo0) oooO0O0).OoooOo0(new OooO00o(oooO0O1));
            return oooO0O1;
        }

        @Override // retrofit2.OooO0OO
        public final Type responseType() {
            return this.f53731OooO00o;
        }
    }

    @Override // retrofit2.OooO0OO.OooO00o
    @Nullable
    public final retrofit2.OooO0OO OooO00o(Type type, Annotation[] annotationArr) {
        if (o000000.OooO0o(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        }
        Type typeOooO0o0 = o000000.OooO0o0(0, (ParameterizedType) type);
        if (o000000.OooO0o(typeOooO0o0) != oo0o0Oo.class) {
            return new OooO00o(typeOooO0o0);
        }
        if (typeOooO0o0 instanceof ParameterizedType) {
            return new OooO0OO(o000000.OooO0o0(0, (ParameterizedType) typeOooO0o0));
        }
        throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
    }
}
