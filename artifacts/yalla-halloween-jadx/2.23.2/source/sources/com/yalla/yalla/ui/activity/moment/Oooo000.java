package com.yalla.yalla.ui.activity.moment;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import com.yalla.yalla.ui.composable.common.LoadMoreState;
import com.yalla.yalla.ui.vm.moment.MomentRecordEditVM;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import p516o0o0O00o.o00Oo00;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMomentEditRecordScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentEditRecordScreen.kt\ncom/yalla/yalla/ui/activity/moment/MomentEditRecordScreen$ListContent$3$2$1$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,143:1\n50#2:144\n49#2:145\n1097#3,6:146\n*S KotlinDebug\n*F\n+ 1 MomentEditRecordScreen.kt\ncom/yalla/yalla/ui/activity/moment/MomentEditRecordScreen$ListContent$3$2$1$2\n*L\n128#1:144\n128#1:145\n128#1:146,6\n*E\n"})
public final class Oooo000 extends Lambda implements Function3<LazyItemScope, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentRecordEditVM f25789OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ long f25790OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo000(MomentRecordEditVM momentRecordEditVM, long j, int i) {
        super(3);
        this.f25789OooO0Oo = momentRecordEditVM;
        this.f25790OooO0o0 = j;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
        LazyItemScope item = lazyItemScope;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(item, "$this$item");
        if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(315383475, iIntValue, -1, "com.yalla.yalla.ui.activity.moment.MomentEditRecordScreen.ListContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MomentEditRecordScreen.kt:127)");
            }
            MomentRecordEditVM momentRecordEditVM = this.f25789OooO0Oo;
            LoadMoreState value = momentRecordEditVM.getLoadMoreState().getValue();
            long j = this.f25790OooO0o0;
            Long lValueOf = Long.valueOf(j);
            composer2.startReplaceableGroup(511388516);
            boolean zChanged = composer2.changed(lValueOf) | composer2.changed(momentRecordEditVM);
            Object objRememberedValue = composer2.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new OooOo(momentRecordEditVM, j, null);
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            EffectsKt.LaunchedEffect(value, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composer2, 64);
            o00Oo00.OooO0O0(momentRecordEditVM.getLoadMoreState().getValue(), null, composer2, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
