package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import kotlin.Unit;
import p634o0ooO0oO.o0O0o;
import p634o0ooO0oO.oo00oO;
import retrofit2.http.Streaming;

/* JADX INFO: loaded from: classes5.dex */
public final class OooO00o extends OooOOOO.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f61002OooO00o = true;

    public static final class OooO implements OooOOOO<o0O0o, Unit> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO f61003OooO00o = new OooO();

        @Override // retrofit2.OooOOOO
        public final Unit convert(o0O0o o0o0o) throws IOException {
            o0o0o.close();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: retrofit2.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C0522OooO00o implements OooOOOO<o0O0o, o0O0o> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final C0522OooO00o f61004OooO00o = new C0522OooO00o();

        @Override // retrofit2.OooOOOO
        public final o0O0o convert(o0O0o o0o0o) throws IOException {
            o0O0o o0o0o2 = o0o0o;
            try {
                return o0000OO0.OooO00o(o0o0o2);
            } finally {
                o0o0o2.close();
            }
        }
    }

    public static final class OooO0O0 implements OooOOOO<oo00oO, oo00oO> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO0O0 f61005OooO00o = new OooO0O0();

        @Override // retrofit2.OooOOOO
        public final oo00oO convert(oo00oO oo00oo) throws IOException {
            return oo00oo;
        }
    }

    public static final class OooO0OO implements OooOOOO<o0O0o, o0O0o> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO0OO f61006OooO00o = new OooO0OO();

        @Override // retrofit2.OooOOOO
        public final o0O0o convert(o0O0o o0o0o) throws IOException {
            return o0o0o;
        }
    }

    public static final class OooO0o implements OooOOOO<Object, String> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO0o f61007OooO00o = new OooO0o();

        @Override // retrofit2.OooOOOO
        public final String convert(Object obj) throws IOException {
            return obj.toString();
        }
    }

    public static final class OooOO0 implements OooOOOO<o0O0o, Void> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooOO0 f61008OooO00o = new OooOO0();

        @Override // retrofit2.OooOOOO
        public final Void convert(o0O0o o0o0o) throws IOException {
            o0o0o.close();
            return null;
        }
    }

    @Override // retrofit2.OooOOOO.OooO00o
    @Nullable
    public final OooOOOO OooO00o(Type type) {
        if (oo00oO.class.isAssignableFrom(o0000OO0.OooO0o(type))) {
            return OooO0O0.f61005OooO00o;
        }
        return null;
    }

    @Override // retrofit2.OooOOOO.OooO00o
    @Nullable
    public final OooOOOO<o0O0o, ?> OooO0O0(Type type, Annotation[] annotationArr, o000OO o000oo2) {
        if (type == o0O0o.class) {
            return o0000OO0.OooO(annotationArr, Streaming.class) ? OooO0OO.f61006OooO00o : C0522OooO00o.f61004OooO00o;
        }
        if (type == Void.class) {
            return OooOO0.f61008OooO00o;
        }
        if (!this.f61002OooO00o || type != Unit.class) {
            return null;
        }
        try {
            return OooO.f61003OooO00o;
        } catch (NoClassDefFoundError unused) {
            this.f61002OooO00o = false;
            return null;
        }
    }
}
