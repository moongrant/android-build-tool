package com.yalla.yalla.ui.screen.user;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material.DividerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import com.yalla.yalla.model.user.VisitorUserInfoModel;
import com.yalla.yalla.ui.vm.user.UserVisitorVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p147o00Oo0Oo.o000OOo;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nUserVisitorScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserVisitorScreen.kt\ncom/yalla/yalla/ui/screen/user/UserVisitorScreen$Content$1$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,170:1\n164#2:171\n154#2:172\n*S KotlinDebug\n*F\n+ 1 UserVisitorScreen.kt\ncom/yalla/yalla/ui/screen/user/UserVisitorScreen$Content$1$1$1\n*L\n74#1:171\n74#1:172\n*E\n"})
public final class o0ooOOo extends Lambda implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000O0.OooO0O0<VisitorUserInfoModel> f30193OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ UserVisitorVM f30194OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0ooOOo(o000O0.OooO0O0<VisitorUserInfoModel> oooO0O0, UserVisitorVM userVisitorVM) {
        super(4);
        this.f30193OooO0Oo = oooO0O0;
        this.f30194OooO0o0 = userVisitorVM;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
        int i;
        LazyItemScope items = lazyItemScope;
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
                ComposerKt.traceEventStart(-1113755398, iIntValue2, -1, "com.yalla.yalla.ui.screen.user.UserVisitorScreen.Content.<anonymous>.<anonymous>.<anonymous> (UserVisitorScreen.kt:55)");
            }
            o000O0.OooO0O0<VisitorUserInfoModel> oooO0O0 = this.f30193OooO0Oo;
            VisitorUserInfoModel visitorUserInfoModelOooO00o = oooO0O0.OooO00o(iIntValue);
            if (visitorUserInfoModelOooO00o != null) {
                if (visitorUserInfoModelOooO00o.getVisitorType()) {
                    composer2.startReplaceableGroup(207208642);
                    UserVisitorScreen.INSTANCE.InvisibleVisitorItem(visitorUserInfoModelOooO00o, oo000o.f30195OooO0Oo, composer2, 440);
                    composer2.endReplaceableGroup();
                } else {
                    composer2.startReplaceableGroup(207208826);
                    UserVisitorScreen.INSTANCE.VisitorItem(visitorUserInfoModelOooO00o, new o00oO0o(visitorUserInfoModelOooO00o, this.f30194OooO0o0), composer2, 392);
                    composer2.endReplaceableGroup();
                }
                if (iIntValue != oooO0O0.OooO0O0() - 1) {
                    DividerKt.m1058DivideroMI9zvI(BackgroundKt.m169backgroundbw27NRU$default(Modifier.INSTANCE, o000OOo.OooO0OO(composer2).f37703OooO0O0, null, 2, null), o000OOo.OooO0OO(composer2).f37706OooO0o, Dp.m3765constructorimpl((float) 0.5d), Dp.m3765constructorimpl(66), composer2, 3456, 0);
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
