package com.yalla.yalla.ui.composable.event;

import android.content.Context;
import android.os.Build;
import com.yalla.yalla.model.EventModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import p100o000oOoO.o0O00OO;
import p391o0OOooOo.o0O00000;
import p496o0o00OOo.o000oOoO;
import p516o0o0O000.OooOo00;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<Boolean> f23727Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Context f23728Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ EventModel f23729Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<Boolean> f23730Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO0(Context context, EventModel eventModel, o0O00OO<Boolean> o0o00oo2, o0O00OO<Boolean> o0o00oo3) {
        super(0);
        this.f23728Oooo0o = context;
        this.f23729Oooo0oO = eventModel;
        this.f23730Oooo0oo = o0o00oo2;
        this.f23727Oooo = o0o00oo3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0O00000.OooO0OO("Room_Everts_subscribe_calendar");
        if (Build.VERSION.SDK_INT >= 24) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getIO(), null, new OooOO0(this.f23730Oooo0oo, null), 2, null);
            Context context = this.f23728Oooo0o;
            String eventName = this.f23729Oooo0oO.getEventName();
            String eventDesc = this.f23729Oooo0oO.getEventDesc();
            long eventStartTime = this.f23729Oooo0oO.getEventStartTime();
            if (o000oOoO.OooO00o(eventStartTime, p279o0O00OoO.OooO.OooO00o()) == 3) {
                eventStartTime *= (long) 1000;
            }
            long j = eventStartTime;
            long eventEndTime = this.f23729Oooo0oO.getEventEndTime();
            if (o000oOoO.OooO00o(eventEndTime, p279o0O00OoO.OooO.OooO00o()) == 3) {
                eventEndTime *= (long) 1000;
            }
            OooOo00.OooO00o(context, eventName, eventDesc, j, eventEndTime, new OooOO0O(this.f23727Oooo));
        }
        return Unit.INSTANCE;
    }
}
