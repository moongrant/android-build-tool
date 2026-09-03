package com.yalla.yalla.ui.fragment;

import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.RenewCustomizeTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class o000 extends Lambda implements Function1<RenewCustomizeTheme, Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ RoomThemeCustomizeFragment f24479Oooo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000(RoomThemeCustomizeFragment roomThemeCustomizeFragment) {
        super(1);
        this.f24479Oooo = roomThemeCustomizeFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(RenewCustomizeTheme renewCustomizeTheme) {
        RenewCustomizeTheme renewCustomizeTheme2 = renewCustomizeTheme;
        if (renewCustomizeTheme2 != null) {
            ToastUtil.f12582OooO00o.OooO0O0(p255o00ooO0O.o000O0O0.OooO0OO(R.string.room_dialog_theme_customize_renewals_successful));
            p500o0o00Oo0.OooOOO.f41235OooO00o.OooO0OO().postValue(Long.valueOf(renewCustomizeTheme2.getBalance()));
            this.f24479Oooo.loadData();
        }
        return Unit.INSTANCE;
    }
}
