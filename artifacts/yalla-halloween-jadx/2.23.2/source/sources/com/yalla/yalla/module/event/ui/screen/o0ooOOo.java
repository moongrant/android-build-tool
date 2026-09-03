package com.yalla.yalla.module.event.ui.screen;

import com.yalla.yalla.model.event.EventModel;
import com.yalla.yalla.module.event.ui.view.EventKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0ooOOo extends Lambda implements Function1<EventModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o0ooOOo f23509OooO0Oo = new o0ooOOo();

    public o0ooOOo() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(EventModel eventModel) {
        EventModel it = eventModel;
        Intrinsics.checkNotNullParameter(it, "it");
        EventKt.OooOO0O(it);
        return Unit.INSTANCE;
    }
}
