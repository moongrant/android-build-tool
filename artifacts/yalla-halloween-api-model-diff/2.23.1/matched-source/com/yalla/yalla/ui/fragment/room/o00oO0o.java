package com.yalla.yalla.ui.fragment.room;

import android.os.Looper;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.model.ThemeModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p565o0oOo000.o000OOo;
import p593o0oOoooO.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00oO0o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomThemeStoreFragment f28610OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ThemeModel f28611OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00oO0o(RoomThemeStoreFragment roomThemeStoreFragment, ThemeModel themeModel) {
        super(0);
        this.f28610OooO0Oo = roomThemeStoreFragment;
        this.f28611OooO0o0 = themeModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        RoomThemeStoreFragment roomThemeStoreFragment = this.f28610OooO0Oo;
        if (roomThemeStoreFragment.isHasRoom) {
            ThemeModel themeModel = this.f28611OooO0o0;
            int themeTagType = themeModel.getThemeTagType();
            if (themeTagType == 2 || themeTagType == 3) {
                h0.OooO0OO("102014", MapsKt.mapOf(new Pair("shopid", Long.valueOf(themeModel.getShopId()))));
            }
            roomThemeStoreFragment.showPurchase(themeModel);
        } else {
            String strOooO0OO = o0000.OooO0OO(o000OOo.message_room_theme_to_create_room);
            if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    o000O00O.f13431OooO0O0.post(o000oo0OooO00o);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
