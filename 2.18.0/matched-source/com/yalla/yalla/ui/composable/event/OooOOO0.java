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
import p100o000oOoO.o0O00O;
import p393o0OOooOo.o0O00000;
import p498o0o00OOo.o000oOoO;
import p518o0o0O000.OooOo00;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ Context f23746Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ o0O00O<Boolean> f23747OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ EventModel f23748OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final /* synthetic */ o0O00O<Boolean> f23749OoooO0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO0(Context context, EventModel eventModel, o0O00O<Boolean> o0o00o2, o0O00O<Boolean> o0o00o3) {
        super(0);
        this.f23746Oooo = context;
        this.f23748OoooO00 = eventModel;
        this.f23747OoooO0 = o0o00o2;
        this.f23749OoooO0O = o0o00o3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0O00000.OooO0OO("Room_Everts_subscribe_calendar");
        if (Build.VERSION.SDK_INT >= 24) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getIO(), null, new OooOO0(this.f23747OoooO0, null), 2, null);
            Context context = this.f23746Oooo;
            String eventName = this.f23748OoooO00.getEventName();
            String eventDesc = this.f23748OoooO00.getEventDesc();
            long eventStartTime = this.f23748OoooO00.getEventStartTime();
            if (o000oOoO.OooO00o(eventStartTime, p280o0O00OoO.OooO.OooO00o()) == 3) {
                eventStartTime *= (long) 1000;
            }
            long j = eventStartTime;
            long eventEndTime = this.f23748OoooO00.getEventEndTime();
            if (o000oOoO.OooO00o(eventEndTime, p280o0O00OoO.OooO.OooO00o()) == 3) {
                eventEndTime *= (long) 1000;
            }
            OooOo00.OooO00o(context, eventName, eventDesc, j, eventEndTime, new OooOO0O(this.f23749OoooO0O));
        }
        return Unit.INSTANCE;
    }
}
