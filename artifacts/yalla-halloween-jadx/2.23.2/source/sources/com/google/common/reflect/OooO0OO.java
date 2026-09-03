package com.google.common.reflect;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0OO extends OooO0O0.C0237OooO0O0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ TypeVariable f19285OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ OooO0O0.C0237OooO0O0 f19286OooO0OO;

    public OooO0OO(TypeVariable typeVariable, OooO0O0.C0237OooO0O0 c0237OooO0O0) {
        this.f19285OooO0O0 = typeVariable;
        this.f19286OooO0OO = c0237OooO0O0;
    }

    @Override // com.google.common.reflect.OooO0O0.C0237OooO0O0
    public final Type OooO00o(TypeVariable typeVariable, OooO0OO oooO0OO) {
        return typeVariable.getGenericDeclaration().equals(this.f19285OooO0O0.getGenericDeclaration()) ? typeVariable : this.f19286OooO0OO.OooO00o(typeVariable, oooO0OO);
    }
}
