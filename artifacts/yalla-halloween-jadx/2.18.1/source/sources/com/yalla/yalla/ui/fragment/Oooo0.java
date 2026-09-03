package com.yalla.yalla.ui.fragment;

import com.yalla.yalla.common.db.table.Conversation;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class Oooo0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MessageListFragment f24069Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Conversation f24070Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo0(MessageListFragment messageListFragment, Conversation conversation) {
        super(0);
        this.f24069Oooo0o = messageListFragment;
        this.f24070Oooo0oO = conversation;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        p596o0oo0.OooOOO0 vm = this.f24069Oooo0o.getVm();
        long targetId = this.f24070Oooo0oO.getTargetId();
        Objects.requireNonNull(vm);
        p490o0o00O0.OooOo00 oooOo00OooOOoo = p491o0o00O00.OooO0OO.OooO00o().OooOOoo();
        p498o0o00Oo0.OooOOO oooOOO = p498o0o00Oo0.OooOOO.f41216OooO00o;
        Long value = oooOOO.OooOo().getValue();
        oooOo00OooOOoo.OooO0o0(value == null ? 0L : value.longValue(), targetId);
        p490o0o00O0.OooOOO OooOOo2 = p491o0o00O00.OooO0OO.OooO00o().OooOOo();
        Long value2 = oooOOO.OooOo().getValue();
        OooOOo2.OooO0o0(value2 != null ? value2.longValue() : 0L, targetId);
        return Unit.INSTANCE;
    }
}
