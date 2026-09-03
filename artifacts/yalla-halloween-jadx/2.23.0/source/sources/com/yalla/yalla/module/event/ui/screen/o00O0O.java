package com.yalla.yalla.module.event.ui.screen;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.yalla.yalla.model.event.EventModel;
import com.yalla.yalla.module.event.ui.view.EventKt;
import com.yalla.yalla.module.event.vm.EventDetailViewModel;
import com.yalla.yalla.module.event.vm.EventViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Context f23957OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ EventViewModel f23958OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ EventModel f23959OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ EventDetailViewModel f23960OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f23961OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O(Context context, EventModel eventModel, EventViewModel eventViewModel, EventDetailViewModel eventDetailViewModel, MutableState<Boolean> mutableState) {
        super(0);
        this.f23957OooO0Oo = context;
        this.f23959OooO0o0 = eventModel;
        this.f23958OooO0o = eventViewModel;
        this.f23960OooO0oO = eventDetailViewModel;
        this.f23961OooO0oo = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        EventModel eventModel = this.f23959OooO0o0;
        EventKt.OooOO0(this.f23957OooO0Oo, eventModel.getHasSubscribe(), new o0OoOo0(this.f23958OooO0o, eventModel, this.f23960OooO0oO, this.f23961OooO0oo));
        return Unit.INSTANCE;
    }
}
