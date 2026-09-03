package com.yalla.yalla.ui.fragment.message;

import com.yalla.yalla.data.db.table.Conversation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p407o0Oo0Oo.Oooo000;
import p407o0Oo0Oo.o000000;
import p408o0Oo0Oo0.o00Oo0;
import p475o0Ooooo0.o0O00oO0;
import p582o0oOoo0.o0000O0O;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MessageListFragment f28042OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Conversation f28043OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO(MessageListFragment messageListFragment, Conversation conversation) {
        super(0);
        this.f28042OooO0Oo = messageListFragment;
        this.f28043OooO0o0 = conversation;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0oo0000.OooO00o.OooO0O0("104022");
        o0000O0O vm = this.f28042OooO0Oo.getVm();
        long targetId = this.f28043OooO0o0.getTargetId();
        vm.getClass();
        o000000 o000000VarOooOOo = o00Oo0.OooO00o().OooOOo();
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        Long l = (Long) o0O00oO0.OooOOo0().getValue();
        o000000VarOooOOo.OooO0o(l == null ? 0L : l.longValue(), targetId);
        Oooo000 oooo000OooOOo0 = o00Oo0.OooO00o().OooOOo0();
        Long l2 = (Long) o0O00oO0.OooOOo0().getValue();
        oooo000OooOOo0.OooO0OO(l2 != null ? l2.longValue() : 0L, targetId);
        return Unit.INSTANCE;
    }
}
