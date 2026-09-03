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
public final class o0OoOo0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Context f23504OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ EventViewModel f23505OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ EventModel f23506OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ EventDetailViewModel f23507OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f23508OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoOo0(Context context, EventModel eventModel, EventViewModel eventViewModel, EventDetailViewModel eventDetailViewModel, MutableState<Boolean> mutableState) {
        super(0);
        this.f23504OooO0Oo = context;
        this.f23506OooO0o0 = eventModel;
        this.f23505OooO0o = eventViewModel;
        this.f23507OooO0oO = eventDetailViewModel;
        this.f23508OooO0oo = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        EventModel eventModel = this.f23506OooO0o0;
        EventKt.OooOO0(this.f23504OooO0Oo, eventModel.getHasSubscribe(), new o000oOoO(this.f23505OooO0o, eventModel, this.f23507OooO0oO, this.f23508OooO0oo));
        return Unit.INSTANCE;
    }
}
