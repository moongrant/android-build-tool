package com.yalla.yalla.ui.fragment.room;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.code.android.uikit.contentstate.ContentState;
import com.yalla.yalla.ui.vm.moment.RoomInfoMomentListVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p196o00o0OOO.oOO00O;
import p521o0o0O0o0.o000OO;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nRoomInfoMomentFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomInfoMomentFragment.kt\ncom/yalla/yalla/ui/fragment/room/RoomInfoMomentFragment$initView$1$1$3\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,194:1\n36#2:195\n1097#3,6:196\n*S KotlinDebug\n*F\n+ 1 RoomInfoMomentFragment.kt\ncom/yalla/yalla/ui/fragment/room/RoomInfoMomentFragment$initView$1$1$3\n*L\n103#1:195\n103#1:196,6\n*E\n"})
public final class OooOo extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomInfoMomentListVM f28439OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ RoomInfoMomentFragment f28440OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ LazyListState f28441OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MutableState<o000OO> f28442OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo(LazyListState lazyListState, MutableState mutableState, RoomInfoMomentFragment roomInfoMomentFragment, RoomInfoMomentListVM roomInfoMomentListVM) {
        super(2);
        this.f28439OooO0Oo = roomInfoMomentListVM;
        this.f28441OooO0o0 = lazyListState;
        this.f28440OooO0o = roomInfoMomentFragment;
        this.f28442OooO0oO = mutableState;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1624496476, iIntValue, -1, "com.yalla.yalla.ui.fragment.room.RoomInfoMomentFragment.initView.<anonymous>.<anonymous>.<anonymous> (RoomInfoMomentFragment.kt:100)");
            }
            RoomInfoMomentListVM roomInfoMomentListVM = this.f28439OooO0Oo;
            ContentState value = roomInfoMomentListVM.getContentState().getValue();
            composer2.startReplaceableGroup(1157296644);
            boolean zChanged = composer2.changed(roomInfoMomentListVM);
            Object objRememberedValue = composer2.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new OooOO0(roomInfoMomentListVM);
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            oOO00O.OooO0o0(value, false, null, null, null, null, (Function0) objRememberedValue, ComposableLambdaKt.composableLambda(composer2, -407121058, true, new OooOo00(this.f28441OooO0o0, this.f28442OooO0oO, this.f28440OooO0o, roomInfoMomentListVM)), composer2, 12582912, 62);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
