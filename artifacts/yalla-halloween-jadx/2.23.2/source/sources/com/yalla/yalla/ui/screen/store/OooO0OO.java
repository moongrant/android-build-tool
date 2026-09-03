package com.yalla.yalla.ui.screen.store;

import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.RenewCustomizeTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p475o0Ooooo0.o0O00oO0;
import p532o0o0OOo0.o00O00;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0OO extends Lambda implements Function1<RenewCustomizeTheme, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final OooO0OO f29153OooO0Oo = new OooO0OO();

    public OooO0OO() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(RenewCustomizeTheme renewCustomizeTheme) {
        RenewCustomizeTheme renewCustomizeTheme2 = renewCustomizeTheme;
        LiveEventBus.get("ROOM_THEME_UPDATE").post(Boolean.TRUE);
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        o0O00oO0.OooO0O0().postValue(renewCustomizeTheme2 != null ? Long.valueOf(renewCustomizeTheme2.getBalance()) : null);
        o00O00.OooO0o(null);
        return Unit.INSTANCE;
    }
}
