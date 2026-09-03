package com.yalla.yalla.ui.fragment.room;

import android.os.Looper;
import androidx.fragment.app.FragmentActivity;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.ThemeBoughtModel;
import com.yalla.yalla.ui.activity.room.RoomThemeStoreActivity;
import com.yalla.yalla.ui.screen.user.MyOutfitScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p475o0Ooooo0.o0O00oO0;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOO0o extends Lambda implements Function1<ThemeBoughtModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomThemeStoreFragment f28605OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOO0o(RoomThemeStoreFragment roomThemeStoreFragment) {
        super(1);
        this.f28605OooO0Oo = roomThemeStoreFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ThemeBoughtModel themeBoughtModel) {
        ThemeBoughtModel themeBoughtModel2 = themeBoughtModel;
        RoomThemeStoreFragment roomThemeStoreFragment = this.f28605OooO0Oo;
        roomThemeStoreFragment.initData();
        String strOooO0OO = o0000.OooO0OO(o000000.Purchase_successful);
        if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
            o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(strOooO0OO, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o.run();
            } else {
                o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
            }
        }
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        o0O00oO0.OooO0O0().postValue(themeBoughtModel2 != null ? Long.valueOf(themeBoughtModel2.getBalance()) : null);
        LiveEventBus.get("ROOM_THEME_UPDATE").post(Boolean.TRUE);
        FragmentActivity fragmentActivityRequireActivity = roomThemeStoreFragment.requireActivity();
        RoomThemeStoreActivity roomThemeStoreActivity = fragmentActivityRequireActivity instanceof RoomThemeStoreActivity ? (RoomThemeStoreActivity) fragmentActivityRequireActivity : null;
        if (roomThemeStoreActivity != null) {
            if (roomThemeStoreActivity.f26229OooOo0O) {
                roomThemeStoreActivity.finish();
            } else {
                MyOutfitScreen.navigate$default(MyOutfitScreen.INSTANCE, 3, null, true, 2, null);
            }
        }
        return Unit.INSTANCE;
    }
}
