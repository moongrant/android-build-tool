package com.yalla.yalla.module.event.ui.screen;

import com.yalla.yalla.model.event.EventModel;
import com.yalla.yalla.module.event.vm.EventViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0O00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ EventViewModel f23971OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ EventModel f23972OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0O00(EventViewModel eventViewModel, EventModel eventModel) {
        super(0);
        this.f23971OooO0Oo = eventViewModel;
        this.f23972OooO0o0 = eventModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        EventViewModel.subscribeEvent$default(this.f23971OooO0Oo, this.f23972OooO0o0, null, 2, null);
        return Unit.INSTANCE;
    }
}
