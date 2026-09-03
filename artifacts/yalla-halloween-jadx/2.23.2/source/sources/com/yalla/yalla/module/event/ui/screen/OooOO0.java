package com.yalla.yalla.module.event.ui.screen;

import com.yalla.yalla.module.event.vm.EventDetailViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ EventDetailViewModel f23413OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0(EventDetailViewModel eventDetailViewModel) {
        super(0);
        this.f23413OooO0Oo = eventDetailViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f23413OooO0Oo.getDetail();
        return Unit.INSTANCE;
    }
}
