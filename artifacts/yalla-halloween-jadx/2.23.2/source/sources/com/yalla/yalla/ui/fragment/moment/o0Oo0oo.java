package com.yalla.yalla.ui.fragment.moment;

import com.jeremyliao.liveeventbus.LiveEventBus;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0Oo0oo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o0Oo0oo f28347OooO0Oo = new o0Oo0oo();

    public o0Oo0oo() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0oo0000.OooO00o.OooO0O0("103030");
        LiveEventBus.get("TOPIC_CREATE_CHECK_CLICK").post(Boolean.TRUE);
        return Unit.INSTANCE;
    }
}
