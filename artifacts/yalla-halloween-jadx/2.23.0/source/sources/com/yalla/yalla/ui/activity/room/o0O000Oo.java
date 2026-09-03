package com.yalla.yalla.ui.activity.room;

import android.view.View;
import com.yalla.yalla.ui.screen.user.MyOutfitScreen;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O000Oo extends p466o0Oooo0o.oo00o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ RoomThemeStoreActivity f26899OooO0oO;

    public o0O000Oo(RoomThemeStoreActivity roomThemeStoreActivity) {
        this.f26899OooO0oO = roomThemeStoreActivity;
    }

    @Override // p466o0Oooo0o.oo00o
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        RoomThemeStoreActivity roomThemeStoreActivity = this.f26899OooO0oO;
        if (roomThemeStoreActivity.f26683OooOo0O) {
            roomThemeStoreActivity.finish();
        } else {
            MyOutfitScreen.navigate$default(MyOutfitScreen.INSTANCE, 3, null, true, 2, null);
        }
    }
}
