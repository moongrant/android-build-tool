package com.yalla.yalla.ui.activity.room;

import android.view.View;
import com.yalla.yalla.ui.screen.user.MyOutfitScreen;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00o0 extends p472o0OoooO.oo0OOoo {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ RoomThemeStoreActivity f26455OooO0oO;

    public o0O00o0(RoomThemeStoreActivity roomThemeStoreActivity) {
        this.f26455OooO0oO = roomThemeStoreActivity;
    }

    @Override // p472o0OoooO.oo0OOoo
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        RoomThemeStoreActivity roomThemeStoreActivity = this.f26455OooO0oO;
        if (roomThemeStoreActivity.f26231OooOo0O) {
            roomThemeStoreActivity.finish();
        } else {
            MyOutfitScreen.navigate$default(MyOutfitScreen.INSTANCE, 3, null, true, 2, null);
        }
    }
}
