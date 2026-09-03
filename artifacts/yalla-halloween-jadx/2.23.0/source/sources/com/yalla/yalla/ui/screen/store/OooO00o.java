package com.yalla.yalla.ui.screen.store;

import androidx.compose.runtime.MutableState;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.yalla.yalla.model.RenewCustomizeTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p464o0Oooo.o000000O;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO00o extends Lambda implements Function1<RenewCustomizeTheme, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f29687OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO00o(MutableState<Boolean> mutableState) {
        super(1);
        this.f29687OooO0Oo = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(RenewCustomizeTheme renewCustomizeTheme) {
        RenewCustomizeTheme renewCustomizeTheme2 = renewCustomizeTheme;
        Observable<Object> observable = LiveEventBus.get("ROOM_THEME_UPDATE");
        Boolean bool = Boolean.TRUE;
        observable.post(bool);
        o000000O o000000o2 = o000000O.f46674OooO00o;
        o000000O.OooO0O0().postValue(renewCustomizeTheme2 != null ? Long.valueOf(renewCustomizeTheme2.getBalance()) : null);
        this.f29687OooO0Oo.setValue(bool);
        return Unit.INSTANCE;
    }
}
