package com.yalla.yalla.module.event.ui.screen;

import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.module.event.vm.EventDetailViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oo000o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ EventDetailViewModel f23981OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo000o(EventDetailViewModel eventDetailViewModel) {
        super(0);
        this.f23981OooO0Oo = eventDetailViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        EventDetailViewModel eventDetailViewModel = this.f23981OooO0Oo;
        eventDetailViewModel.delete();
        LiveEventBus.get("EVENT_DELETED").post(Long.valueOf(eventDetailViewModel.getEventModel().getId()));
        return Unit.INSTANCE;
    }
}
