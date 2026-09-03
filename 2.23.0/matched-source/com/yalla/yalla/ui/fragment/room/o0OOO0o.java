package com.yalla.yalla.ui.fragment.room;

import android.os.Looper;
import androidx.fragment.app.FragmentActivity;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
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
import p464o0Oooo.o000000O;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOO0o extends Lambda implements Function1<ThemeBoughtModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomThemeStoreFragment f29139OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOO0o(RoomThemeStoreFragment roomThemeStoreFragment) {
        super(1);
        this.f29139OooO0Oo = roomThemeStoreFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ThemeBoughtModel themeBoughtModel) {
        ThemeBoughtModel themeBoughtModel2 = themeBoughtModel;
        RoomThemeStoreFragment roomThemeStoreFragment = this.f29139OooO0Oo;
        roomThemeStoreFragment.initData();
        String strOooO0OO = o0000.OooO0OO(oO00OOo0.Purchase_successful);
        if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
            o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o.run();
            } else {
                o000O0.f10355OooO0O0.post(o000oo0OooO00o);
            }
        }
        o000000O o000000o2 = o000000O.f46674OooO00o;
        o000000O.OooO0O0().postValue(themeBoughtModel2 != null ? Long.valueOf(themeBoughtModel2.getBalance()) : null);
        LiveEventBus.get("ROOM_THEME_UPDATE").post(Boolean.TRUE);
        FragmentActivity fragmentActivityRequireActivity = roomThemeStoreFragment.requireActivity();
        RoomThemeStoreActivity roomThemeStoreActivity = fragmentActivityRequireActivity instanceof RoomThemeStoreActivity ? (RoomThemeStoreActivity) fragmentActivityRequireActivity : null;
        if (roomThemeStoreActivity != null) {
            if (roomThemeStoreActivity.f26683OooOo0O) {
                roomThemeStoreActivity.finish();
            } else {
                MyOutfitScreen.navigate$default(MyOutfitScreen.INSTANCE, 3, null, true, 2, null);
            }
        }
        return Unit.INSTANCE;
    }
}
