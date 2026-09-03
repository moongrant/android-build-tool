package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p634o0ooO0oO.o0O0o;

/* JADX INFO: loaded from: classes5.dex */
@IgnoreJRERequirement
public final class o0O0O00 extends OooOOOO.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final o0O0O00 f61160OooO00o = new o0O0O00();

    @IgnoreJRERequirement
    public static final class OooO00o<T> implements OooOOOO<o0O0o, Optional<T>> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooOOOO<o0O0o, T> f61161OooO00o;

        public OooO00o(OooOOOO<o0O0o, T> oooOOOO) {
            this.f61161OooO00o = oooOOOO;
        }

        @Override // retrofit2.OooOOOO
        public final Object convert(o0O0o o0o0o) throws IOException {
            return Optional.ofNullable(this.f61161OooO00o.convert(o0o0o));
        }
    }

    @Override // retrofit2.OooOOOO.OooO00o
    @Nullable
    public final OooOOOO<o0O0o, ?> OooO0O0(Type type, Annotation[] annotationArr, o000OO o000oo2) {
        if (o0000OO0.OooO0o(type) != o0OO00O.OooO00o()) {
            return null;
        }
        return new OooO00o(o000oo2.OooO0o0(o0000OO0.OooO0o0(0, (ParameterizedType) type), annotationArr));
    }
}
