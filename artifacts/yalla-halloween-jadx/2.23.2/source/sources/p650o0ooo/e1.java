package p650o0ooo;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.res.StringResources_androidKt;
import com.yalla.yalla.model.gift.GifListJson;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p207o00o0oO0.o000O0Oo;
import p562o0oOo000.o000000;
import p587o0oOooOO.c0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nRoomGifBuyDialogUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomGifBuyDialogUtil.kt\ncom/yalla/yalla/ui/dialog/RoomGifBuyDialogUtil$showRoomGifBuyDialog$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,110:1\n36#2:111\n1097#3,6:112\n*S KotlinDebug\n*F\n+ 1 RoomGifBuyDialogUtil.kt\ncom/yalla/yalla/ui/dialog/RoomGifBuyDialogUtil$showRoomGifBuyDialog$1\n*L\n32#1:111\n32#1:112,6\n*E\n"})
public final class e1 extends Lambda implements Function3<MutableState<Boolean>, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f58196OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ GifListJson f58197OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(c0 c0Var, GifListJson gifListJson) {
        super(3);
        this.f58196OooO0Oo = c0Var;
        this.f58197OooO0o0 = gifListJson;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(MutableState<Boolean> mutableState, Composer composer, Integer num) {
        MutableState<Boolean> it = mutableState;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(it, "it");
        if ((iIntValue & 14) == 0) {
            iIntValue |= composer2.changed(it) ? 4 : 2;
        }
        if ((iIntValue & 91) == 18 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(852008412, iIntValue, -1, "com.yalla.yalla.ui.dialog.RoomGifBuyDialogUtil.showRoomGifBuyDialog.<anonymous> (RoomGifBuyDialogUtil.kt:29)");
            }
            String strStringResource = StringResources_androidKt.stringResource(o000000.Pay, composer2, 0);
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer2, 1362092999, true, new b1(this.f58197OooO0o0));
            composer2.startReplaceableGroup(1157296644);
            Function0<Unit> function0 = this.f58196OooO0Oo;
            boolean zChanged = composer2.changed(function0);
            Object objRememberedValue = composer2.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new c1(function0);
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            o000O0Oo.OooO0Oo(it, null, null, composableLambda, false, false, null, null, strStringResource, false, null, false, (Function0) objRememberedValue, null, false, false, null, d1.f58183OooO0Oo, null, null, composer2, (iIntValue & 14) | 3072, 12582912, 913142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
