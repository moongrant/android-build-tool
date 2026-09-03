package com.yalla.yalla.ui.screen.user;

import android.app.Activity;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.yalla.yalla.ui.activity.room.RoomThemeStoreActivity;
import com.yalla.yalla.ui.activity.store.StoreActivity;
import com.yalla.yalla.ui.activity.store.VehicleStoreActivity;
import com.yalla.yalla.ui.screen.store.StoreChatBubbleScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import o000O00.o00000O;
import p526o0o0OOO0.oo0oOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOo00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ p184o00o00o.Oooo000 f29992OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ FragmentActivity f29993OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo00(p184o00o00o.Oooo000 oooo000, FragmentActivity fragmentActivity) {
        super(0);
        this.f29992OooO0Oo = oooo000;
        this.f29993OooO0o0 = fragmentActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int iOooO0oO = this.f29992OooO0Oo.OooO0oO();
        FragmentActivity fragmentActivity = this.f29993OooO0o0;
        if (iOooO0oO == 0 || iOooO0oO == 1) {
            StoreActivity.OooOo0(fragmentActivity, false);
        } else if (iOooO0oO == 2) {
            p188o00o0O.OooOO0<Activity, o00000O> oooOO1 = oo0oOO0.f53618OooO00o;
            StoreChatBubbleScreen storeChatBubbleScreen = StoreChatBubbleScreen.INSTANCE;
            if (oo0oOO0.OooO00o(storeChatBubbleScreen)) {
                oo0oOO0.OooO0O0(storeChatBubbleScreen);
            } else {
                storeChatBubbleScreen.navigate(true);
            }
        } else if (iOooO0oO == 3) {
            int i = RoomThemeStoreActivity.f26679OooOo0o;
            Intent intent = new Intent(fragmentActivity, (Class<?>) RoomThemeStoreActivity.class);
            intent.putExtra("IS_SHOW_RECHARGE", true);
            intent.putExtra("IsFromMyOutfit", true);
            if (fragmentActivity != null) {
                fragmentActivity.startActivity(intent);
            }
        } else if (iOooO0oO == 4) {
            int i2 = VehicleStoreActivity.f27043OooOo;
            VehicleStoreActivity.OooO00o.OooO00o(fragmentActivity, true);
        }
        return Unit.INSTANCE;
    }
}
