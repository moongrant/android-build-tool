package com.yalla.yalla.ui.activity.main;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.yalla.yalla.model.RedemptionCodeModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nRedemptionCodeRecordScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RedemptionCodeRecordScreen.kt\ncom/yalla/yalla/ui/activity/main/RedemptionCodeRecordScreen$HistoryList$1$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,245:1\n1#2:246\n*E\n"})
public final class OooOOO extends Lambda implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ p107o000ooO0.OooOOOO<RedemptionCodeModel> f24997OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO(p107o000ooO0.OooOOOO<RedemptionCodeModel> oooOOOO) {
        super(4);
        this.f24997OooO0Oo = oooOOOO;
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
                ComposerKt.traceEventStart(-1227365236, iIntValue2, -1, "com.yalla.yalla.ui.activity.main.RedemptionCodeRecordScreen.HistoryList.<anonymous>.<anonymous>.<anonymous> (RedemptionCodeRecordScreen.kt:98)");
            }
            RedemptionCodeModel redemptionCodeModelOooO00o = this.f24997OooO0Oo.OooO00o(iIntValue);
            if (redemptionCodeModelOooO00o != null) {
                RedemptionCodeRecordScreen.INSTANCE.ItemView(redemptionCodeModelOooO00o, composer2, 56);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
