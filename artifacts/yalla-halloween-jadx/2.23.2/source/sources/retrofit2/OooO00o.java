package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import kotlin.Unit;
import p641o0ooOO0o.o0O00oO0;
import p641o0ooOO0o.o0oO0Ooo;
import retrofit2.http.Streaming;

/* JADX INFO: loaded from: classes5.dex */
public final class OooO00o extends OooOOO.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f60463OooO00o = true;

    public static final class OooO implements OooOOO<o0O00oO0, Unit> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO f60464OooO00o = new OooO();

        @Override // retrofit2.OooOOO
        public final Unit convert(o0O00oO0 o0o00oo1) throws IOException {
            o0o00oo1.close();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: retrofit2.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C0497OooO00o implements OooOOO<o0O00oO0, o0O00oO0> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final C0497OooO00o f60465OooO00o = new C0497OooO00o();

        @Override // retrofit2.OooOOO
        public final o0O00oO0 convert(o0O00oO0 o0o00oo1) throws IOException {
            o0O00oO0 o0o00oo2 = o0o00oo1;
            try {
                return o0000O.OooO00o(o0o00oo2);
            } finally {
                o0o00oo2.close();
            }
        }
    }

    public static final class OooO0O0 implements OooOOO<o0oO0Ooo, o0oO0Ooo> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO0O0 f60466OooO00o = new OooO0O0();

        @Override // retrofit2.OooOOO
        public final o0oO0Ooo convert(o0oO0Ooo o0oo0ooo2) throws IOException {
            return o0oo0ooo2;
        }
    }

    public static final class OooO0OO implements OooOOO<o0O00oO0, o0O00oO0> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO0OO f60467OooO00o = new OooO0OO();

        @Override // retrofit2.OooOOO
        public final o0O00oO0 convert(o0O00oO0 o0o00oo1) throws IOException {
            return o0o00oo1;
        }
    }

    public static final class OooO0o implements OooOOO<Object, String> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO0o f60468OooO00o = new OooO0o();

        @Override // retrofit2.OooOOO
        public final String convert(Object obj) throws IOException {
            return obj.toString();
        }
    }

    public static final class OooOO0 implements OooOOO<o0O00oO0, Void> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooOO0 f60469OooO00o = new OooOO0();

        @Override // retrofit2.OooOOO
        public final Void convert(o0O00oO0 o0o00oo1) throws IOException {
            o0o00oo1.close();
            return null;
        }
    }

    @Override // retrofit2.OooOOO.OooO00o
    @Nullable
    public final OooOOO OooO00o(Type type) {
        if (o0oO0Ooo.class.isAssignableFrom(o0000O.OooO0o(type))) {
            return OooO0O0.f60466OooO00o;
        }
        return null;
    }

    @Override // retrofit2.OooOOO.OooO00o
    @Nullable
    public final OooOOO<o0O00oO0, ?> OooO0O0(Type type, Annotation[] annotationArr, o0000O0O o0000o0o2) {
        if (type == o0O00oO0.class) {
            return o0000O.OooO(annotationArr, Streaming.class) ? OooO0OO.f60467OooO00o : C0497OooO00o.f60465OooO00o;
        }
        if (type == Void.class) {
            return OooOO0.f60469OooO00o;
        }
        if (!this.f60463OooO00o || type != Unit.class) {
            return null;
        }
        try {
            return OooO.f60464OooO00o;
        } catch (NoClassDefFoundError unused) {
            this.f60463OooO00o = false;
            return null;
        }
    }
}
