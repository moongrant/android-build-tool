package com.yalla.yalla.ui.screen.store;

import androidx.compose.runtime.MutableState;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.yalla.yalla.model.RenewCustomizeTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p475o0Ooooo0.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO00o extends Lambda implements Function1<RenewCustomizeTheme, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f29149OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO00o(MutableState<Boolean> mutableState) {
        super(1);
        this.f29149OooO0Oo = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(RenewCustomizeTheme renewCustomizeTheme) {
        RenewCustomizeTheme renewCustomizeTheme2 = renewCustomizeTheme;
        Observable<Object> observable = LiveEventBus.get("ROOM_THEME_UPDATE");
        Boolean bool = Boolean.TRUE;
        observable.post(bool);
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        o0O00oO0.OooO0O0().postValue(renewCustomizeTheme2 != null ? Long.valueOf(renewCustomizeTheme2.getBalance()) : null);
        this.f29149OooO0Oo.setValue(bool);
        return Unit.INSTANCE;
    }
}
