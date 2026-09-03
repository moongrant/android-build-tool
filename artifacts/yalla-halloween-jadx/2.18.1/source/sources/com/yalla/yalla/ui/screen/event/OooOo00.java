package com.yalla.yalla.ui.screen.event;

import android.content.Context;
import com.yalla.yalla.model.EventModel;
import com.yalla.yalla.ui.composable.event.EventKt;
import com.yalla.yalla.ui.vm.event.EventDetailViewModel;
import com.yalla.yalla.ui.vm.event.EventViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.o0O00OO;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOo00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ EventDetailViewModel f24678Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Context f24679Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ EventModel f24680Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ EventViewModel f24681Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<Boolean> f24682OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo00(Context context, EventModel eventModel, EventViewModel eventViewModel, EventDetailViewModel eventDetailViewModel, o0O00OO<Boolean> o0o00oo2) {
        super(0);
        this.f24679Oooo0o = context;
        this.f24680Oooo0oO = eventModel;
        this.f24681Oooo0oo = eventViewModel;
        this.f24678Oooo = eventDetailViewModel;
        this.f24682OoooO00 = o0o00oo2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        EventKt.OooOO0O(this.f24679Oooo0o, this.f24680Oooo0oO.getHasSubscribe(), new OooOOOO(this.f24680Oooo0oO, this.f24681Oooo0oo, this.f24678Oooo, this.f24682OoooO00));
        return Unit.INSTANCE;
    }
}
