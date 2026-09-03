package com.yalla.yalla.module.event.ui.screen;

import com.yalla.yalla.model.event.EventTagModel;
import com.yalla.yalla.module.event.vm.EventCreateViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO00o extends Lambda implements Function1<EventTagModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ EventCreateViewModel f23871OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO00o(EventCreateViewModel eventCreateViewModel) {
        super(1);
        this.f23871OooO0Oo = eventCreateViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(EventTagModel eventTagModel) {
        EventTagModel it = eventTagModel;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f23871OooO0Oo.setSelectTag(it);
        return Unit.INSTANCE;
    }
}
