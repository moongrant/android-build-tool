package com.yalla.yalla.ui.activity.room;

import android.view.View;
import com.yalla.yalla.ui.screen.user.MyOutfitScreen;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p473o0OoooOo.o0OOOO0o;

/* JADX INFO: loaded from: classes4.dex */
public final class oo00oO extends o0OOOO0o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ RoomThemeStoreActivity f26493OooO0oO;

    public oo00oO(RoomThemeStoreActivity roomThemeStoreActivity) {
        this.f26493OooO0oO = roomThemeStoreActivity;
    }

    @Override // p473o0OoooOo.o0OOOO0o
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        RoomThemeStoreActivity roomThemeStoreActivity = this.f26493OooO0oO;
        if (roomThemeStoreActivity.f26229OooOo0O) {
            roomThemeStoreActivity.finish();
        } else {
            MyOutfitScreen.navigate$default(MyOutfitScreen.INSTANCE, 3, null, true, 2, null);
        }
    }
}
