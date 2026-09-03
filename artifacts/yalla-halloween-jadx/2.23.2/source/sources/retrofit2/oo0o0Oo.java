package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p641o0ooOO0o.o0O00oO0;

/* JADX INFO: loaded from: classes5.dex */
@IgnoreJRERequirement
public final class oo0o0Oo extends OooOOO.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final oo0o0Oo f60645OooO00o = new oo0o0Oo();

    @IgnoreJRERequirement
    public static final class OooO00o<T> implements OooOOO<o0O00oO0, Optional<T>> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooOOO<o0O00oO0, T> f60646OooO00o;

        public OooO00o(OooOOO<o0O00oO0, T> oooOOO) {
            this.f60646OooO00o = oooOOO;
        }

        @Override // retrofit2.OooOOO
        public final Object convert(o0O00oO0 o0o00oo1) throws IOException {
            return Optional.ofNullable(this.f60646OooO00o.convert(o0o00oo1));
        }
    }

    @Override // retrofit2.OooOOO.OooO00o
    @Nullable
    public final OooOOO<o0O00oO0, ?> OooO0O0(Type type, Annotation[] annotationArr, o0000O0O o0000o0o2) {
        if (o0000O.OooO0o(type) != o0Oo0oo.OooO00o()) {
            return null;
        }
        return new OooO00o(o0000o0o2.OooO0o0(o0000O.OooO0o0(0, (ParameterizedType) type), annotationArr));
    }
}
