package p670o0oooo0;

import com.google.gson.OooOOO0;
import com.google.gson.reflect.TypeToken;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import p641o0ooOO0o.o0O00oO0;
import retrofit2.OooOOO;
import retrofit2.o0000O0O;

/* JADX INFO: loaded from: classes5.dex */
public final class o00O000o extends OooOOO.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOOO0 f59911OooO00o;

    public o00O000o(OooOOO0 oooOOO0) {
        this.f59911OooO00o = oooOOO0;
    }

    public static o00O000o OooO0OO(OooOOO0 oooOOO0) {
        if (oooOOO0 != null) {
            return new o00O000o(oooOOO0);
        }
        throw new NullPointerException("gson == null");
    }

    @Override // retrofit2.OooOOO.OooO00o
    public final OooOOO OooO00o(Type type) {
        TypeToken<?> typeToken = TypeToken.get(type);
        OooOOO0 oooOOO0 = this.f59911OooO00o;
        return new o00O00(oooOOO0, oooOOO0.OooO0o0(typeToken));
    }

    @Override // retrofit2.OooOOO.OooO00o
    public final OooOOO<o0O00oO0, ?> OooO0O0(Type type, Annotation[] annotationArr, o0000O0O o0000o0o2) {
        TypeToken<?> typeToken = TypeToken.get(type);
        OooOOO0 oooOOO0 = this.f59911OooO00o;
        return new o00O00O(oooOOO0, oooOOO0.OooO0o0(typeToken));
    }
}
