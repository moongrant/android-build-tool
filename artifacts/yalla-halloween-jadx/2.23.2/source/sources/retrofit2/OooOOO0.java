package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: loaded from: classes5.dex */
@IgnoreJRERequirement
public final class OooOOO0 extends retrofit2.OooO0OO.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooOOO0 f60470OooO00o = new OooOOO0();

    @IgnoreJRERequirement
    public static final class OooO00o<R> implements retrofit2.OooO0OO<R, CompletableFuture<R>> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Type f60471OooO00o;

        /* JADX INFO: renamed from: retrofit2.OooOOO0$OooO00o$OooO00o, reason: collision with other inner class name */
        @IgnoreJRERequirement
        public class C0498OooO00o implements OooO0o<R> {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final CompletableFuture<R> f60472OooO00o;

            public C0498OooO00o(OooO0O0 oooO0O0) {
                this.f60472OooO00o = oooO0O0;
            }

            @Override // retrofit2.OooO0o
            public final void OooO00o(Throwable th) {
                this.f60472OooO00o.completeExceptionally(th);
            }

            @Override // retrofit2.OooO0o
            public final void OooO0O0(retrofit2.OooO0O0<R> oooO0O0, o0000O0<R> o0000o1) {
                boolean zOooO0oO = o0000o1.f60546OooO00o.OooO0oO();
                CompletableFuture<R> completableFuture = this.f60472OooO00o;
                if (zOooO0oO) {
                    completableFuture.complete(o0000o1.f60547OooO0O0);
                } else {
                    completableFuture.completeExceptionally(new HttpException(o0000o1));
                }
            }
        }

        public OooO00o(Type type) {
            this.f60471OooO00o = type;
        }

        @Override // retrofit2.OooO0OO
        public final Object OooO00o(o0OOO0o o0ooo0o2) {
            OooO0O0 oooO0O0 = new OooO0O0(o0ooo0o2);
            o0ooo0o2.OooOooo(new C0498OooO00o(oooO0O0));
            return oooO0O0;
        }

        @Override // retrofit2.OooO0OO
        public final Type responseType() {
            return this.f60471OooO00o;
        }
    }

    @IgnoreJRERequirement
    public static final class OooO0O0<T> extends CompletableFuture<T> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final retrofit2.OooO0O0<?> f60473OooO0Oo;

        public OooO0O0(o0OOO0o o0ooo0o2) {
            this.f60473OooO0Oo = o0ooo0o2;
        }

        @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
        public final boolean cancel(boolean z) {
            if (z) {
                this.f60473OooO0Oo.cancel();
            }
            return super.cancel(z);
        }
    }

    @IgnoreJRERequirement
    public static final class OooO0OO<R> implements retrofit2.OooO0OO<R, CompletableFuture<o0000O0<R>>> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Type f60474OooO00o;

        @IgnoreJRERequirement
        public class OooO00o implements OooO0o<R> {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final CompletableFuture<o0000O0<R>> f60475OooO00o;

            public OooO00o(OooO0O0 oooO0O0) {
                this.f60475OooO00o = oooO0O0;
            }

            @Override // retrofit2.OooO0o
            public final void OooO00o(Throwable th) {
                this.f60475OooO00o.completeExceptionally(th);
            }

            @Override // retrofit2.OooO0o
            public final void OooO0O0(retrofit2.OooO0O0<R> oooO0O0, o0000O0<R> o0000o1) {
                this.f60475OooO00o.complete(o0000o1);
            }
        }

        public OooO0OO(Type type) {
            this.f60474OooO00o = type;
        }

        @Override // retrofit2.OooO0OO
        public final Object OooO00o(o0OOO0o o0ooo0o2) {
            OooO0O0 oooO0O0 = new OooO0O0(o0ooo0o2);
            o0ooo0o2.OooOooo(new OooO00o(oooO0O0));
            return oooO0O0;
        }

        @Override // retrofit2.OooO0OO
        public final Type responseType() {
            return this.f60474OooO00o;
        }
    }

    @Override // retrofit2.OooO0OO.OooO00o
    @Nullable
    public final retrofit2.OooO0OO OooO00o(Type type, Annotation[] annotationArr) {
        if (o0000O.OooO0o(type) != androidx.emoji2.text.oo000o.OooO0O0()) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        }
        Type typeOooO0o0 = o0000O.OooO0o0(0, (ParameterizedType) type);
        if (o0000O.OooO0o(typeOooO0o0) != o0000O0.class) {
            return new OooO00o(typeOooO0o0);
        }
        if (typeOooO0o0 instanceof ParameterizedType) {
            return new OooO0OO(o0000O.OooO0o0(0, (ParameterizedType) typeOooO0o0));
        }
        throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
    }
}
