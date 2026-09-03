package com.yalla.yalla.ui.screen.event;

import com.yalla.yalla.model.EventModel;
import com.yalla.yalla.ui.vm.event.EventDetailViewModel;
import com.yalla.yalla.ui.vm.event.EventViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.o0O00OO;
import p391o0OOooOo.o0O00000;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOOO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<Boolean> f24673Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ EventModel f24674Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ EventViewModel f24675Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ EventDetailViewModel f24676Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOOO(EventModel eventModel, EventViewModel eventViewModel, EventDetailViewModel eventDetailViewModel, o0O00OO<Boolean> o0o00oo2) {
        super(0);
        this.f24674Oooo0o = eventModel;
        this.f24675Oooo0oO = eventViewModel;
        this.f24676Oooo0oo = eventDetailViewModel;
        this.f24673Oooo = o0o00oo2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0O00000.OooO0OO(this.f24674Oooo0o.getHasSubscribe() ? "Room_explore_Everts_More_Unsubscribe_OK" : "Room_explore_Everts_More_subscribe");
        EventViewModel eventViewModel = this.f24675Oooo0oO;
        EventModel eventModel = this.f24674Oooo0o;
        eventViewModel.subscribeEvent(eventModel, new OooOOO(eventModel, this.f24676Oooo0oo, this.f24673Oooo));
        return Unit.INSTANCE;
    }
}
