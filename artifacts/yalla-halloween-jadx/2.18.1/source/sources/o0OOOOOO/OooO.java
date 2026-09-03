package o0OOOOOO;

import com.google.common.collect.ImmutableSet;
import com.google.common.reflect.TypeToken;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO extends OooOO0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ ImmutableSet.OooO00o f38256OooO0O0;

    public OooO(ImmutableSet.OooO00o oooO00o) {
        this.f38256OooO0O0 = oooO00o;
    }

    @Override // o0OOOOOO.OooOO0
    public final void OooO0O0(Class<?> cls) {
        this.f38256OooO0O0.OooO0Oo(cls);
    }

    @Override // o0OOOOOO.OooOO0
    public final void OooO0OO(GenericArrayType genericArrayType) {
        ImmutableSet.OooO00o oooO00o = this.f38256OooO0O0;
        Class<? super T> clsOooO0OO = new TypeToken.OooO00o(genericArrayType.getGenericComponentType()).OooO0OO();
        o0OOOO0o.OooO<Type, String> oooO = com.google.common.reflect.OooO.f18733OooO00o;
        oooO00o.OooO0Oo(Array.newInstance(clsOooO0OO, 0).getClass());
    }

    @Override // o0OOOOOO.OooOO0
    public final void OooO0Oo(ParameterizedType parameterizedType) {
        this.f38256OooO0O0.OooO0Oo((Class) parameterizedType.getRawType());
    }

    @Override // o0OOOOOO.OooOO0
    public final void OooO0o(WildcardType wildcardType) {
        OooO00o(wildcardType.getUpperBounds());
    }

    @Override // o0OOOOOO.OooOO0
    public final void OooO0o0(TypeVariable<?> typeVariable) {
        OooO00o(typeVariable.getBounds());
    }
}
