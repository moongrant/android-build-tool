package com.yalla.yalla.ui.activity.message;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p414o0Oo0oO.oO0OOo0o;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000oo extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PrivateChatActivity f25357OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000oo(PrivateChatActivity privateChatActivity) {
        super(1);
        this.f25357OooO0Oo = privateChatActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        int i = PrivateChatActivity.f25239Oooo000;
        PrivateChatActivity privateChatActivity = this.f25357OooO0Oo;
        if (privateChatActivity.OooOo().getIsFriend() && zBooleanValue) {
            oO0OOo0o oo0ooo0oOooO0o0 = p415o0Oo0oO0.o00Ooo.OooO0o0();
            oo0ooo0oOooO0o0.getClass();
            p475o0Ooooo0.o0O00oO0 o0o00oo1 = p475o0Ooooo0.o0O00oO0.f47936OooO00o;
            if (oo0ooo0oOooO0o0.OooO0O0("hideToYallaChat4CompleteYallaChat" + p475o0Ooooo0.o0O00oO0.OooOOo0().getValue(), false)) {
                privateChatActivity.OooOo0().f44887OooOO0.setVisibility(8);
            } else {
                privateChatActivity.OooOo0().f44887OooOO0.setVisibility(0);
                oO0OOo0o oo0ooo0oOooO0o1 = p415o0Oo0oO0.o00Ooo.OooO0o0();
                oo0ooo0oOooO0o1.getClass();
                androidx.appcompat.widget.o0000O0O.OooO0O0("hideToYallaChat4CompleteYallaChat", p475o0Ooooo0.o0O00oO0.OooOOo0().getValue(), oo0ooo0oOooO0o1, true);
            }
        }
        return Unit.INSTANCE;
    }
}
