package com.yalla.yalla.ui.activity.message;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00000OO extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PrivateChatActivity f25800OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000OO(PrivateChatActivity privateChatActivity) {
        super(1);
        this.f25800OooO0Oo = privateChatActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        int i = PrivateChatActivity.f25694Oooo000;
        PrivateChatActivity privateChatActivity = this.f25800OooO0Oo;
        if (privateChatActivity.OooOo().getIsFriend() && zBooleanValue) {
            p409o0Oo0o0o.o0O0O00 o0o0o00OooO0o0 = p408o0Oo0o0O.o00Oo0.OooO0o0();
            o0o0o00OooO0o0.getClass();
            p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
            if (o0o0o00OooO0o0.OooO0O0("hideToYallaChat4CompleteYallaChat" + p464o0Oooo.o000000O.OooOOo0().getValue(), false)) {
                privateChatActivity.OooOo0().f58175OooOO0.setVisibility(8);
            } else {
                privateChatActivity.OooOo0().f58175OooOO0.setVisibility(0);
                p409o0Oo0o0o.o0O0O00 o0o0o00OooO0o1 = p408o0Oo0o0O.o00Oo0.OooO0o0();
                o0o0o00OooO0o1.getClass();
                com.google.firebase.messaging.o0OO00O.OooO00o("hideToYallaChat4CompleteYallaChat", p464o0Oooo.o000000O.OooOOo0().getValue(), o0o0o00OooO0o1, true);
            }
        }
        return Unit.INSTANCE;
    }
}
