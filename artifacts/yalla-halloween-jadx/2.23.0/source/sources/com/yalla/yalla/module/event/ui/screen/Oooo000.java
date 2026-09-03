package com.yalla.yalla.module.event.ui.screen;

import com.yalla.yalla.model.event.EventModel;
import com.yalla.yalla.module.event.ui.view.EventKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class Oooo000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ EventModel f23884OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo000(EventModel eventModel) {
        super(0);
        this.f23884OooO0Oo = eventModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        EventKt.OooOO0O(this.f23884OooO0Oo);
        return Unit.INSTANCE;
    }
}
