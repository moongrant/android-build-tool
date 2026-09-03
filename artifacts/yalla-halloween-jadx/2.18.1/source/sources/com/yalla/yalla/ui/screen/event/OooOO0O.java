package com.yalla.yalla.ui.screen.event;

import com.yalla.yalla.model.EventModel;
import com.yalla.yalla.ui.composable.event.EventKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOO0O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ EventModel f24668Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0O(EventModel eventModel) {
        super(0);
        this.f24668Oooo0o = eventModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        EventKt.OooOO0o(this.f24668Oooo0o);
        return Unit.INSTANCE;
    }
}
