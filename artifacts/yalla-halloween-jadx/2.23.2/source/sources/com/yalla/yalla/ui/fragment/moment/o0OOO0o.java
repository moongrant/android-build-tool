package com.yalla.yalla.ui.fragment.moment;

import com.jeremyliao.liveeventbus.LiveEventBus;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOO0o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o0OOO0o f28346OooO0Oo = new o0OOO0o();

    public o0OOO0o() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        LiveEventBus.get("TOPIC_TO_RECOMMEND").post(null);
        return Unit.INSTANCE;
    }
}
