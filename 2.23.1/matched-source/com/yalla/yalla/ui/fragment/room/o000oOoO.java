package com.yalla.yalla.ui.fragment.room;

import android.os.Looper;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.model.RenewCustomizeTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p474o0OoooOO.oo0oO0;
import p565o0oOo000.o000OOo;

/* JADX INFO: loaded from: classes4.dex */
public final class o000oOoO extends Lambda implements Function1<RenewCustomizeTheme, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomThemeCustomizeFragment f28604OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000oOoO(RoomThemeCustomizeFragment roomThemeCustomizeFragment) {
        super(1);
        this.f28604OooO0Oo = roomThemeCustomizeFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(RenewCustomizeTheme renewCustomizeTheme) {
        RenewCustomizeTheme renewCustomizeTheme2 = renewCustomizeTheme;
        if (renewCustomizeTheme2 != null) {
            String strOooO0OO = o0000.OooO0OO(o000OOo.room_dialog_theme_customize_renewals_successful);
            if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    o000O00O.f13431OooO0O0.post(o000oo0OooO00o);
                }
            }
            oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
            oo0oO0.OooO0O0().postValue(Long.valueOf(renewCustomizeTheme2.getBalance()));
            this.f28604OooO0Oo.loadData();
        }
        return Unit.INSTANCE;
    }
}
