package com.yalla.yalla.module.event.ui.screen;

import androidx.compose.runtime.MutableState;
import com.yalla.yalla.model.event.EventModel;
import com.yalla.yalla.module.event.vm.EventDetailViewModel;
import com.yalla.yalla.module.event.vm.EventViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OoOo0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ EventViewModel f23976OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ EventDetailViewModel f23977OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ EventModel f23978OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f23979OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoOo0(EventViewModel eventViewModel, EventModel eventModel, EventDetailViewModel eventDetailViewModel, MutableState<Boolean> mutableState) {
        super(0);
        this.f23976OooO0Oo = eventViewModel;
        this.f23978OooO0o0 = eventModel;
        this.f23977OooO0o = eventDetailViewModel;
        this.f23979OooO0oO = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        EventModel eventModel = this.f23978OooO0o0;
        this.f23976OooO0Oo.subscribeEvent(eventModel, new o000oOoO(eventModel, this.f23977OooO0o, this.f23979OooO0oO));
        return Unit.INSTANCE;
    }
}
