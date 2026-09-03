package com.yalla.yalla.module.event.ui.screen;

import androidx.compose.runtime.MutableState;
import com.yalla.yalla.model.event.EventModel;
import com.yalla.yalla.module.event.vm.EventDetailViewModel;
import com.yalla.yalla.module.event.vm.EventViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o000oOoO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ EventViewModel f23482OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ EventDetailViewModel f23483OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ EventModel f23484OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f23485OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000oOoO(EventViewModel eventViewModel, EventModel eventModel, EventDetailViewModel eventDetailViewModel, MutableState<Boolean> mutableState) {
        super(0);
        this.f23482OooO0Oo = eventViewModel;
        this.f23484OooO0o0 = eventModel;
        this.f23483OooO0o = eventDetailViewModel;
        this.f23485OooO0oO = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        EventModel eventModel = this.f23484OooO0o0;
        this.f23482OooO0Oo.subscribeEvent(eventModel, new Oooo0(eventModel, this.f23483OooO0o, this.f23485OooO0oO));
        return Unit.INSTANCE;
    }
}
