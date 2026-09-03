package com.yalla.yalla.ui.screen.user;

import android.os.Looper;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.RenewCustomizeTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p475o0Ooooo0.o0O00oO0;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OoOo0 extends Lambda implements Function1<RenewCustomizeTheme, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o0OoOo0 f29648OooO0Oo = new o0OoOo0();

    public o0OoOo0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(RenewCustomizeTheme renewCustomizeTheme) {
        RenewCustomizeTheme renewCustomizeTheme2 = renewCustomizeTheme;
        if (renewCustomizeTheme2 != null) {
            String strOooO0OO = o0000.OooO0OO(o000000.room_dialog_theme_customize_renewals_successful);
            if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                }
            }
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            o0O00oO0.OooO0O0().postValue(Long.valueOf(renewCustomizeTheme2.getBalance()));
            LiveEventBus.get("ROOM_THEME_UPDATE").post(Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }
}
