package com.yalla.yalla.ui.screen.store;

import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.RenewCustomizeTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p464o0Oooo.o000000O;
import p526o0o0OOO0.oo0oOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0OO extends Lambda implements Function1<RenewCustomizeTheme, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final OooO0OO f29691OooO0Oo = new OooO0OO();

    public OooO0OO() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(RenewCustomizeTheme renewCustomizeTheme) {
        RenewCustomizeTheme renewCustomizeTheme2 = renewCustomizeTheme;
        LiveEventBus.get("ROOM_THEME_UPDATE").post(Boolean.TRUE);
        o000000O o000000o2 = o000000O.f46674OooO00o;
        o000000O.OooO0O0().postValue(renewCustomizeTheme2 != null ? Long.valueOf(renewCustomizeTheme2.getBalance()) : null);
        oo0oOO0.OooO0o(null);
        return Unit.INSTANCE;
    }
}
