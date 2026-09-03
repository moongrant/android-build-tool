package p665o0oooOo;

import com.google.gson.OooOOO0;
import com.google.gson.reflect.TypeToken;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import p634o0ooO0oO.o0O0o;
import retrofit2.OooOOOO;
import retrofit2.o000OO;

/* JADX INFO: loaded from: classes5.dex */
public final class oOo00OO0 extends OooOOOO.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOOO0 f60332OooO00o;

    public oOo00OO0(OooOOO0 oooOOO0) {
        this.f60332OooO00o = oooOOO0;
    }

    public static oOo00OO0 OooO0OO(OooOOO0 oooOOO0) {
        if (oooOOO0 != null) {
            return new oOo00OO0(oooOOO0);
        }
        throw new NullPointerException("gson == null");
    }

    @Override // retrofit2.OooOOOO.OooO00o
    public final OooOOOO OooO00o(Type type) {
        TypeToken<?> typeToken = TypeToken.get(type);
        OooOOO0 oooOOO0 = this.f60332OooO00o;
        return new oO00O0oO(oooOOO0, oooOOO0.OooO0o0(typeToken));
    }

    @Override // retrofit2.OooOOOO.OooO00o
    public final OooOOOO<o0O0o, ?> OooO0O0(Type type, Annotation[] annotationArr, o000OO o000oo2) {
        TypeToken<?> typeToken = TypeToken.get(type);
        OooOOO0 oooOOO0 = this.f60332OooO00o;
        return new oO00OO0O(oooOOO0, oooOOO0.OooO0o0(typeToken));
    }
}
