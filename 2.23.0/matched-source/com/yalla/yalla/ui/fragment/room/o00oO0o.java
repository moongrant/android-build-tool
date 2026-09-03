package com.yalla.yalla.ui.fragment.room;

import android.os.Looper;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.model.ThemeModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o00oO0o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomThemeStoreFragment f29137OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ThemeModel f29138OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00oO0o(RoomThemeStoreFragment roomThemeStoreFragment, ThemeModel themeModel) {
        super(0);
        this.f29137OooO0Oo = roomThemeStoreFragment;
        this.f29138OooO0o0 = themeModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        RoomThemeStoreFragment roomThemeStoreFragment = this.f29137OooO0Oo;
        if (roomThemeStoreFragment.isHasRoom) {
            ThemeModel themeModel = this.f29138OooO0o0;
            int themeTagType = themeModel.getThemeTagType();
            if (themeTagType == 2 || themeTagType == 3) {
                o0OO000.OooO0O0("102014", MapsKt.mapOf(new Pair("shopid", Long.valueOf(themeModel.getShopId()))));
            }
            roomThemeStoreFragment.showPurchase(themeModel);
        } else {
            String strOooO0OO = o0000.OooO0OO(oO00OOo0.message_room_theme_to_create_room);
            if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
