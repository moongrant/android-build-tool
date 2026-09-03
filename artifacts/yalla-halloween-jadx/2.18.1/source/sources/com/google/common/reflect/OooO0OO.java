package com.google.common.reflect;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO extends OooO0O0.C0131OooO0O0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ TypeVariable f18751OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ OooO0O0.C0131OooO0O0 f18752OooO0OO;

    public OooO0OO(TypeVariable typeVariable, OooO0O0.C0131OooO0O0 c0131OooO0O0) {
        this.f18751OooO0O0 = typeVariable;
        this.f18752OooO0OO = c0131OooO0O0;
    }

    @Override // com.google.common.reflect.OooO0O0.C0131OooO0O0
    public final Type OooO00o(TypeVariable<?> typeVariable, OooO0O0.C0131OooO0O0 c0131OooO0O0) {
        return typeVariable.getGenericDeclaration().equals(this.f18751OooO0O0.getGenericDeclaration()) ? typeVariable : this.f18752OooO0OO.OooO00o(typeVariable, c0131OooO0O0);
    }
}
