package com.yalla.yalla.ui.fragment.message;

import com.yalla.yalla.data.db.table.Conversation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p403o0Oo0OOo.o00OOOOo;
import p403o0Oo0OOo.oo0o0O0;
import p464o0Oooo.o000000O;
import p574o0oOoOOo.oO0Oo0o0;
import p581o0oOoo00.o000OOo;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MessageListFragment f28549OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Conversation f28550OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO(MessageListFragment messageListFragment, Conversation conversation) {
        super(0);
        this.f28549OooO0Oo = messageListFragment;
        this.f28550OooO0o0 = conversation;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0OO000.OooO00o("104022");
        oO0Oo0o0 vm = this.f28549OooO0Oo.getVm();
        long targetId = this.f28550OooO0o0.getTargetId();
        vm.getClass();
        o00OOOOo o00oooooOooOOo0 = o000OOo.OooO00o().OooOOo0();
        o000000O o000000o2 = o000000O.f46674OooO00o;
        Long l = (Long) o000000O.OooOOo0().getValue();
        o00oooooOooOOo0.OooO0o(l == null ? 0L : l.longValue(), targetId);
        oo0o0O0 oo0o0o0OooOOOo = o000OOo.OooO00o().OooOOOo();
        Long l2 = (Long) o000000O.OooOOo0().getValue();
        oo0o0o0OooOOOo.OooO0OO(l2 != null ? l2.longValue() : 0L, targetId);
        return Unit.INSTANCE;
    }
}
