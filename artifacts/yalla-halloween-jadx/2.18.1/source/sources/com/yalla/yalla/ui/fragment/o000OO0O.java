package com.yalla.yalla.ui.fragment;

import android.os.Looper;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.ThemeBoughtModel;
import com.yalla.yalla.ui.activity.room.RoomThemeMineActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o0O0ooO;
import p255o00ooO0o.oo0oOO0;

/* JADX INFO: loaded from: classes3.dex */
public final class o000OO0O extends Lambda implements Function1<ThemeBoughtModel, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ RoomThemeStoreFragment f24508Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ oo0oOO0 f24509Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OO0O(RoomThemeStoreFragment roomThemeStoreFragment, oo0oOO0 oo0ooo0) {
        super(1);
        this.f24508Oooo0o = roomThemeStoreFragment;
        this.f24509Oooo0oO = oo0ooo0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ThemeBoughtModel themeBoughtModel) {
        ThemeBoughtModel themeBoughtModel2 = themeBoughtModel;
        this.f24508Oooo0o.initData();
        String strOooO0OO = p254o00ooO0O.o000O0O0.OooO0OO(R.string.Purchase_successful);
        ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
        if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
            o0O0ooO o0o0oooOooO0O0 = p074o000O0oo.OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o0o0oooOooO0O0.run();
            } else {
                o00O000 o00o001 = o00O000.f34346OooO00o;
                o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
            }
        }
        p498o0o00Oo0.OooOOO.f41216OooO00o.OooO0OO().postValue(themeBoughtModel2 != null ? Long.valueOf(themeBoughtModel2.getBalance()) : null);
        RoomThemeMineActivity.OooO00o oooO00o = RoomThemeMineActivity.f22993Oooooo0;
        RoomThemeMineActivity.f22993Oooooo0.OooO00o(this.f24509Oooo0oO.f34199OooO00o, RoomThemeMineActivity.ThemeType.Mine);
        return Unit.INSTANCE;
    }
}
