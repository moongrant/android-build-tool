package com.yalla.yalla.ui.screen.user;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.LifecycleOwner;
import com.yalla.yalla.model.ThemeModel;
import com.yalla.yalla.ui.vm.user.RoomThemeVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import p571o0oOoOO.o0O0OOO0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nRoomThemeMineScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomThemeMineScreen.kt\ncom/yalla/yalla/ui/screen/user/RoomThemeMineScreen$MainContent$2$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,518:1\n154#2:519\n*S KotlinDebug\n*F\n+ 1 RoomThemeMineScreen.kt\ncom/yalla/yalla/ui/screen/user/RoomThemeMineScreen$MainContent$2$1$1\n*L\n95#1:519\n*E\n"})
public final class o00Oo0 extends Lambda implements Function4<LazyGridItemScope, Integer, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000O0.OooO0O0<ThemeModel> f30178OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o0O0OOO0 f30179OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ RoomThemeVM f30180OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f30181OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f30182OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Oo0(o000O0.OooO0O0<ThemeModel> oooO0O0, RoomThemeVM roomThemeVM, o0O0OOO0 o0o0ooo0, LifecycleOwner lifecycleOwner, CoroutineScope coroutineScope) {
        super(4);
        this.f30178OooO0Oo = oooO0O0;
        this.f30180OooO0o0 = roomThemeVM;
        this.f30179OooO0o = o0o0ooo0;
        this.f30181OooO0oO = lifecycleOwner;
        this.f30182OooO0oo = coroutineScope;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Unit invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer, Integer num2) {
        int i;
        LazyGridItemScope items = lazyGridItemScope;
        int iIntValue = num.intValue();
        Composer composer2 = composer;
        int iIntValue2 = num2.intValue();
        Intrinsics.checkNotNullParameter(items, "$this$items");
        if ((iIntValue2 & 112) == 0) {
            i = (composer2.changed(iIntValue) ? 32 : 16) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((i & 721) == 144 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-271717491, iIntValue2, -1, "com.yalla.yalla.ui.screen.user.RoomThemeMineScreen.MainContent.<anonymous>.<anonymous>.<anonymous> (RoomThemeMineScreen.kt:88)");
            }
            ThemeModel themeModelOooO00o = this.f30178OooO0Oo.OooO00o(iIntValue);
            if (themeModelOooO00o != null) {
                RoomThemeMineScreen.INSTANCE.ThemeItem(themeModelOooO00o, SizeKt.m509height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m3765constructorimpl(269)), new o00O0O(themeModelOooO00o, this.f30180OooO0o0, this.f30179OooO0o, this.f30181OooO0oO, this.f30182OooO0oo), composer2, 3128, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
