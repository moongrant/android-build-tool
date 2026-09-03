package com.yalla.yalla.ui.screen.user;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material.DividerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import com.yalla.yalla.model.user.FollowUserInfoModel;
import com.yalla.yalla.ui.vm.user.FollowingVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p193o00o0O0O.o0000oo;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nFollowingScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FollowingScreen.kt\ncom/yalla/yalla/ui/screen/user/FollowingScreen$Content$1$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,226:1\n164#2:227\n154#2:228\n*S KotlinDebug\n*F\n+ 1 FollowingScreen.kt\ncom/yalla/yalla/ui/screen/user/FollowingScreen$Content$1$1$1\n*L\n105#1:227\n107#1:228\n*E\n"})
public final class OooO0OO extends Lambda implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ p107o000ooO0.OooOOOO<FollowUserInfoModel> f29436OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ FollowingVM f29437OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0OO(p107o000ooO0.OooOOOO<FollowUserInfoModel> oooOOOO, FollowingVM followingVM) {
        super(4);
        this.f29436OooO0Oo = oooOOOO;
        this.f29437OooO0o0 = followingVM;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
        LazyItemScope items = lazyItemScope;
        int iIntValue = num.intValue();
        Composer composer2 = composer;
        int iIntValue2 = num2.intValue();
        Intrinsics.checkNotNullParameter(items, "$this$items");
        if ((iIntValue2 & 112) == 0) {
            iIntValue2 |= composer2.changed(iIntValue) ? 32 : 16;
        }
        if ((iIntValue2 & 721) == 144 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1638888286, iIntValue2, -1, "com.yalla.yalla.ui.screen.user.FollowingScreen.Content.<anonymous>.<anonymous>.<anonymous> (FollowingScreen.kt:88)");
            }
            p107o000ooO0.OooOOOO<FollowUserInfoModel> oooOOOO = this.f29436OooO0Oo;
            FollowUserInfoModel followUserInfoModelOooO00o = oooOOOO.OooO00o(iIntValue);
            if (followUserInfoModelOooO00o != null) {
                FollowingScreen.INSTANCE.UserItem(followUserInfoModelOooO00o, new OooO00o(followUserInfoModelOooO00o), new OooO0O0(this.f29437OooO0o0, followUserInfoModelOooO00o), composer2, 3080);
                if (iIntValue != oooOOOO.OooO0O0() - 1) {
                    DividerKt.m1074DivideroMI9zvI(BackgroundKt.m171backgroundbw27NRU$default(Modifier.INSTANCE, o0000oo.OooO0OO(composer2).f38618OooO0O0, null, 2, null), o0000oo.OooO0OO(composer2).f38621OooO0o, Dp.m3775constructorimpl((float) 0.5d), Dp.m3775constructorimpl(66), composer2, 3456, 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
