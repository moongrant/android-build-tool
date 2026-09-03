package com.yalla.yalla.ui.activity.message;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p405o0Oo0OOO.oO0O00oO;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O000 extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Oooo000 f25380OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O000(Oooo000 oooo000) {
        super(1);
        this.f25380OooO0Oo = oooo000;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        Oooo000 chatBottomState;
        p434o0OoOOOO.o0oOOo o0oooo;
        if (bool.booleanValue() && (o0oooo = (chatBottomState = this.f25380OooO0Oo).f25226OooO0OO) != null) {
            Intrinsics.checkNotNullParameter(chatBottomState, "chatBottomState");
            p371o0OOo0oO.oo000o value = chatBottomState.f25223OooO.getValue();
            if (value != null) {
                value.OooO00o();
            }
            chatBottomState.f25230OooO0oO.setValue(Boolean.TRUE);
            oO0O00oO oo0o00oo = o0oooo.f46979OooO0O0;
            oO0O00oO oo0o00oo2 = null;
            if (oo0o00oo == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                oo0o00oo = null;
            }
            oo0o00oo.f44883OooO0o.f45240OooO0oo.setVisibility(0);
            oO0O00oO oo0o00oo3 = o0oooo.f46979OooO0O0;
            if (oo0o00oo3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                oo0o00oo3 = null;
            }
            oo0o00oo3.f44883OooO0o.f45239OooO0oO.setVisibility(8);
            oO0O00oO oo0o00oo4 = o0oooo.f46979OooO0O0;
            if (oo0o00oo4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                oo0o00oo4 = null;
            }
            oo0o00oo4.f44883OooO0o.f45237OooO0o.setImageResource(p562o0oOo000.o0O0O00.icon_voice_prepare);
            oO0O00oO oo0o00oo5 = o0oooo.f46979OooO0O0;
            if (oo0o00oo5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                oo0o00oo2 = oo0o00oo5;
            }
            oo0o00oo2.f44883OooO0o.f45234OooO0O0.setVisibility(8);
        }
        return Unit.INSTANCE;
    }
}
