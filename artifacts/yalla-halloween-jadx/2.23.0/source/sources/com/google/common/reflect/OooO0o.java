package com.google.common.reflect;

import com.google.common.collect.ImmutableSet;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0o extends OooOO0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ ImmutableSet.OooO00o f19765OooO0O0;

    public OooO0o(ImmutableSet.OooO00o oooO00o) {
        this.f19765OooO0O0 = oooO00o;
    }

    @Override // com.google.common.reflect.OooOO0
    public final void OooO0O0(Class<?> cls) {
        this.f19765OooO0O0.OooO00o(cls);
    }

    @Override // com.google.common.reflect.OooOO0
    public final void OooO0OO(GenericArrayType genericArrayType) {
        Class<? super T> clsOooO0OO = new TypeToken.OooO00o(genericArrayType.getGenericComponentType()).OooO0OO();
        com.google.common.base.OooOOOO oooOOOO = OooOO0O.f19767OooO00o;
        this.f19765OooO0O0.OooO00o(Array.newInstance(clsOooO0OO, 0).getClass());
    }

    @Override // com.google.common.reflect.OooOO0
    public final void OooO0Oo(ParameterizedType parameterizedType) {
        this.f19765OooO0O0.OooO00o((Class) parameterizedType.getRawType());
    }

    @Override // com.google.common.reflect.OooOO0
    public final void OooO0o(WildcardType wildcardType) {
        OooO00o(wildcardType.getUpperBounds());
    }

    @Override // com.google.common.reflect.OooOO0
    public final void OooO0o0(TypeVariable<?> typeVariable) {
        OooO00o(typeVariable.getBounds());
    }
}
