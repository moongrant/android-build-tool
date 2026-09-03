package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import kotlin.Unit;
import p660o0ooo0o0.o00OOOOo;
import p660o0ooo0o0.o0o0Oo;
import retrofit2.http.Streaming;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO00o extends retrofit2.OooOO0.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f53733OooO00o = true;

    public static final class OooO implements retrofit2.OooOO0<o00OOOOo, Unit> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO f53734OooO00o = new OooO();

        @Override // retrofit2.OooOO0
        public final Unit OooO00o(o00OOOOo o00ooooo2) throws IOException {
            o00ooooo2.close();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: retrofit2.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C0448OooO00o implements retrofit2.OooOO0<o00OOOOo, o00OOOOo> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final C0448OooO00o f53735OooO00o = new C0448OooO00o();

        @Override // retrofit2.OooOO0
        public final o00OOOOo OooO00o(o00OOOOo o00ooooo2) throws IOException {
            o00OOOOo o00ooooo3 = o00ooooo2;
            try {
                return o000000.OooO00o(o00ooooo3);
            } finally {
                o00ooooo3.close();
            }
        }
    }

    public static final class OooO0O0 implements retrofit2.OooOO0<o0o0Oo, o0o0Oo> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO0O0 f53736OooO00o = new OooO0O0();

        @Override // retrofit2.OooOO0
        public final o0o0Oo OooO00o(o0o0Oo o0o0oo) throws IOException {
            return o0o0oo;
        }
    }

    public static final class OooO0OO implements retrofit2.OooOO0<o00OOOOo, o00OOOOo> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO0OO f53737OooO00o = new OooO0OO();

        @Override // retrofit2.OooOO0
        public final o00OOOOo OooO00o(o00OOOOo o00ooooo2) throws IOException {
            return o00ooooo2;
        }
    }

    public static final class OooO0o implements retrofit2.OooOO0<Object, String> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO0o f53738OooO00o = new OooO0o();

        @Override // retrofit2.OooOO0
        public final String OooO00o(Object obj) throws IOException {
            return obj.toString();
        }
    }

    public static final class OooOO0 implements retrofit2.OooOO0<o00OOOOo, Void> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooOO0 f53739OooO00o = new OooOO0();

        @Override // retrofit2.OooOO0
        public final Void OooO00o(o00OOOOo o00ooooo2) throws IOException {
            o00ooooo2.close();
            return null;
        }
    }

    @Override // retrofit2.OooOO0.OooO00o
    @Nullable
    public final retrofit2.OooOO0 OooO00o(Type type) {
        if (o0o0Oo.class.isAssignableFrom(o000000.OooO0o(type))) {
            return OooO0O0.f53736OooO00o;
        }
        return null;
    }

    @Override // retrofit2.OooOO0.OooO00o
    @Nullable
    public final retrofit2.OooOO0<o00OOOOo, ?> OooO0O0(Type type, Annotation[] annotationArr, o0O0O00 o0o0o00) {
        if (type == o00OOOOo.class) {
            return o000000.OooO(annotationArr, Streaming.class) ? OooO0OO.f53737OooO00o : C0448OooO00o.f53735OooO00o;
        }
        if (type == Void.class) {
            return OooOO0.f53739OooO00o;
        }
        if (!this.f53733OooO00o || type != Unit.class) {
            return null;
        }
        try {
            return OooO.f53734OooO00o;
        } catch (NoClassDefFoundError unused) {
            this.f53733OooO00o = false;
            return null;
        }
    }
}
