package com.yalla.yalla.mixedroom;

import com.yalla.yalla.model.event.EventModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class o000OO implements Function0<Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ EventModel f23516OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MixedRoomActivity f23517OooO0o0;

    public o000OO(MixedRoomActivity mixedRoomActivity, EventModel eventModel) {
        this.f23517OooO0o0 = mixedRoomActivity;
        this.f23516OooO0Oo = eventModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        p560o0oOo000.o00000O0 o00000o1 = p560o0oOo000.o0000OO0.f56183OooO0O0;
        final EventModel eventModel = this.f23516OooO0Oo;
        o00000o1.OooO0Oo(this.f23517OooO0o0, eventModel, new Function1() { // from class: com.yalla.yalla.mixedroom.o0000O0O
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                o000OO o000oo2 = this.f23506OooO0Oo;
                o000oo2.getClass();
                eventModel.setHasSubscribe(((Boolean) obj).booleanValue());
                o000oo2.f23517OooO0o0.f23437OooOoo.notifyDataSetChanged();
                return null;
            }
        });
        return null;
    }
}
