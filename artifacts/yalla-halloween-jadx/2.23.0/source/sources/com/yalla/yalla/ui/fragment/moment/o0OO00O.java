package com.yalla.yalla.ui.fragment.moment;

import com.jeremyliao.liveeventbus.LiveEventBus;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO00O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o0OO00O f28881OooO0Oo = new o0OO00O();

    public o0OO00O() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0OO000.OooO00o("103030");
        LiveEventBus.get("TOPIC_CREATE_CHECK_CLICK").post(Boolean.TRUE);
        return Unit.INSTANCE;
    }
}
