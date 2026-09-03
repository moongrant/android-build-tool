package p650o0ooo;

import android.webkit.WebView;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p231o00oOoO.o0000O0O;
import p516o0o0O00o.o00000O0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nRoomWebDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomWebDialog.kt\ncom/yalla/yalla/ui/dialog/RoomWebDialog$OnDialog$3$1$4\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,138:1\n36#2:139\n36#2:146\n1097#3,6:140\n1097#3,6:147\n*S KotlinDebug\n*F\n+ 1 RoomWebDialog.kt\ncom/yalla/yalla/ui/dialog/RoomWebDialog$OnDialog$3$1$4\n*L\n131#1:139\n128#1:146\n131#1:140,6\n128#1:147,6\n*E\n"})
public final class w2 extends Lambda implements Function3<BoxScope, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ WebPageInfo f59201OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MutableState<WebView> f59202OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0000O0O f59203OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f59204OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(WebPageInfo webPageInfo, o0000O0O o0000o0o2, MutableState<WebView> mutableState, MutableState<Boolean> mutableState2) {
        super(3);
        this.f59201OooO0Oo = webPageInfo;
        this.f59203OooO0o0 = o0000o0o2;
        this.f59202OooO0o = mutableState;
        this.f59204OooO0oO = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
        BoxScope ContentStatus = boxScope;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(ContentStatus, "$this$ContentStatus");
        if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(376366969, iIntValue, -1, "com.yalla.yalla.ui.dialog.RoomWebDialog.OnDialog.<anonymous>.<anonymous>.<anonymous> (RoomWebDialog.kt:123)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            long j = this.f59201OooO0Oo.f32291OooOOOO;
            o0000O0O o0000o0o2 = this.f59203OooO0o0;
            composer2.startReplaceableGroup(1157296644);
            MutableState<WebView> mutableState = this.f59202OooO0o;
            boolean zChanged = composer2.changed(mutableState);
            Object objRememberedValue = composer2.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new u2(mutableState);
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            Function1 function1 = (Function1) objRememberedValue;
            composer2.startReplaceableGroup(1157296644);
            MutableState<Boolean> mutableState2 = this.f59204OooO0oO;
            boolean zChanged2 = composer2.changed(mutableState2);
            Object objRememberedValue2 = composer2.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new v2(mutableState2);
                composer2.updateRememberedValue(objRememberedValue2);
            }
            composer2.endReplaceableGroup();
            o00000O0.OooO00o(o0000o0o2, null, modifierFillMaxSize$default, j, function1, (Function0) objRememberedValue2, composer2, 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
