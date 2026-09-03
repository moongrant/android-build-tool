package com.yalla.yalla.module.event.ui.screen;

import com.yalla.yalla.module.event.vm.EventCreateViewModel;
import java.util.Calendar;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0O0 extends Lambda implements Function1<Long, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ EventCreateViewModel f23410OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(EventCreateViewModel eventCreateViewModel) {
        super(1);
        this.f23410OooO0Oo = eventCreateViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Long l) {
        long jLongValue = l.longValue();
        EventCreateViewModel eventCreateViewModel = this.f23410OooO0Oo;
        eventCreateViewModel.getDateModelStart().setTimeInMillis(jLongValue);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis((((long) 2) * 3600000) + jLongValue);
        Intrinsics.checkNotNullExpressionValue(calendar, "apply(...)");
        eventCreateViewModel.setDateModelEnd(calendar);
        return Unit.INSTANCE;
    }
}
