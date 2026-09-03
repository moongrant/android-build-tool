package com.yalla.yalla.ui.activity.message;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p584o0oOooO0.oO00OOO;
import p641o0ooOOOO.j5;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O000 extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Oooo000 f25829OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O000(Oooo000 oooo000) {
        super(1);
        this.f25829OooO0Oo = oooo000;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        Oooo000 chatBottomState;
        p430o0OoOOO0.o00O00OO o00o00oo2;
        if (bool.booleanValue() && (o00o00oo2 = (chatBottomState = this.f25829OooO0Oo).f25681OooO0OO) != null) {
            Intrinsics.checkNotNullParameter(chatBottomState, "chatBottomState");
            p367o0OOo0o0.OooOOOO value = chatBottomState.f25678OooO.getValue();
            if (value != null) {
                value.OooO00o();
            }
            chatBottomState.f25685OooO0oO.setValue(Boolean.TRUE);
            j5 j5Var = o00o00oo2.f45813OooO0O0;
            j5 j5Var2 = null;
            if (j5Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                j5Var = null;
            }
            j5Var.f58171OooO0o.f58598OooO0oo.setVisibility(0);
            j5 j5Var3 = o00o00oo2.f45813OooO0O0;
            if (j5Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                j5Var3 = null;
            }
            j5Var3.f58171OooO0o.f58597OooO0oO.setVisibility(8);
            j5 j5Var4 = o00o00oo2.f45813OooO0O0;
            if (j5Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                j5Var4 = null;
            }
            j5Var4.f58171OooO0o.f58595OooO0o.setImageResource(oO00OOO.icon_voice_prepare);
            j5 j5Var5 = o00o00oo2.f45813OooO0O0;
            if (j5Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                j5Var2 = j5Var5;
            }
            j5Var2.f58171OooO0o.f58592OooO0O0.setVisibility(8);
        }
        return Unit.INSTANCE;
    }
}
