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
import p105o000oo0o.o00O00OO;
import p230o00oOo0o.o000000;
import p532o0o0OOo0.o00O00;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOo00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000000 f29450OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ FragmentActivity f29451OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo00(o000000 o000000Var, FragmentActivity fragmentActivity) {
        super(0);
        this.f29450OooO0Oo = o000000Var;
        this.f29451OooO0o0 = fragmentActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int iOooO0oO = this.f29450OooO0Oo.OooO0oO();
        FragmentActivity fragmentActivity = this.f29451OooO0o0;
        if (iOooO0oO == 0 || iOooO0oO == 1) {
            StoreActivity.OooOo0(fragmentActivity, false);
        } else if (iOooO0oO == 2) {
            p190o00o0O.OooO<Activity, o00O00OO> oooO = o00O00.f53494OooO00o;
            StoreChatBubbleScreen storeChatBubbleScreen = StoreChatBubbleScreen.INSTANCE;
            if (o00O00.OooO00o(storeChatBubbleScreen)) {
                o00O00.OooO0O0(storeChatBubbleScreen);
            } else {
                storeChatBubbleScreen.navigate(true);
            }
        } else if (iOooO0oO == 3) {
            int i = RoomThemeStoreActivity.f26225OooOo0o;
            Intent intent = new Intent(fragmentActivity, (Class<?>) RoomThemeStoreActivity.class);
            intent.putExtra("IS_SHOW_RECHARGE", true);
            intent.putExtra("IsFromMyOutfit", true);
            if (fragmentActivity != null) {
                fragmentActivity.startActivity(intent);
            }
        } else if (iOooO0oO == 4) {
            int i2 = VehicleStoreActivity.f26578OooOo;
            VehicleStoreActivity.OooO00o.OooO00o(fragmentActivity, true);
        }
        return Unit.INSTANCE;
    }
}
