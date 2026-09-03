package com.yalla.yalla.ui.activity.room;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00Ooo extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ CreateRoomActivity f26435OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Ooo(CreateRoomActivity createRoomActivity) {
        super(1);
        this.f26435OooO0Oo = createRoomActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        if (bool.booleanValue()) {
            CreateRoomActivity createRoomActivity = this.f26435OooO0Oo;
            createRoomActivity.getClass();
            p139o00OOOo0.OooOO0O.OooO0OO(createRoomActivity, 1.0f, 1.0f, false, false, new o00Oo0(createRoomActivity));
        }
        return Unit.INSTANCE;
    }
}
