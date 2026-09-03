package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p660o0ooo0o0.o00OOOOo;

/* JADX INFO: loaded from: classes4.dex */
@IgnoreJRERequirement
public final class o00Ooo extends OooOO0.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final o00Ooo f53792OooO00o = new o00Ooo();

    @IgnoreJRERequirement
    public static final class OooO00o<T> implements OooOO0<o00OOOOo, Optional<T>> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooOO0<o00OOOOo, T> f53793OooO00o;

        public OooO00o(OooOO0<o00OOOOo, T> oooOO1) {
            this.f53793OooO00o = oooOO1;
        }

        @Override // retrofit2.OooOO0
        public final Object OooO00o(o00OOOOo o00ooooo2) throws IOException {
            return Optional.ofNullable(this.f53793OooO00o.OooO00o(o00ooooo2));
        }
    }

    @Override // retrofit2.OooOO0.OooO00o
    @Nullable
    public final OooOO0<o00OOOOo, ?> OooO0O0(Type type, Annotation[] annotationArr, o0O0O00 o0o0o00) {
        if (o000000.OooO0o(type) != Optional.class) {
            return null;
        }
        return new OooO00o(o0o0o00.OooO0o0(o000000.OooO0o0(0, (ParameterizedType) type), annotationArr));
    }
}
