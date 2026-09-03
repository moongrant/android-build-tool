package p516o0o0O00o;

import android.webkit.WebView;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import com.code.android.uikit.contentstate.ContentState;
import com.yalla.yalla.ui.view.webView.BaseWebView2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p476o0OooooO.o0OOo000;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nBaseWebView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseWebView.kt\ncom/yalla/yalla/ui/composable/common/BaseWebViewKt$BaseWebView2$4\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,244:1\n25#2:245\n83#2,3:252\n1097#3,6:246\n1097#3,6:255\n164#4:261\n81#5:262\n107#5,2:263\n81#5:265\n*S KotlinDebug\n*F\n+ 1 BaseWebView.kt\ncom/yalla/yalla/ui/composable/common/BaseWebViewKt$BaseWebView2$4\n*L\n196#1:245\n203#1:252,3\n196#1:246,6\n203#1:255,6\n239#1:261\n196#1:262\n196#1:263,2\n197#1:265\n*E\n"})
public final class o000O0o extends Lambda implements Function3<BoxScope, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<WebView> f51223OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Function1<Boolean, Unit> f51224OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableState<ContentState> f51225OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Function1<BaseWebView2, Unit> f51226OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o000O0o(MutableState<WebView> mutableState, MutableState<ContentState> mutableState2, Function1<? super Boolean, Unit> function1, Function1<? super BaseWebView2, Unit> function2) {
        super(3);
        this.f51223OooO0Oo = mutableState;
        this.f51225OooO0o0 = mutableState2;
        this.f51224OooO0o = function1;
        this.f51226OooO0oO = function2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
        BoxScope ContentStatus = boxScope;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(ContentStatus, "$this$ContentStatus");
        if ((iIntValue & 14) == 0) {
            iIntValue |= composer2.changed(ContentStatus) ? 4 : 2;
        }
        if ((iIntValue & 91) == 18 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(696020204, iIntValue, -1, "com.yalla.yalla.ui.composable.common.BaseWebView2.<anonymous> (BaseWebView.kt:195)");
            }
            composer2.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer2.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            MutableState mutableState = (MutableState) objRememberedValue;
            boolean zChanged = false;
            State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(((Number) mutableState.getValue()).floatValue(), (((Number) mutableState.getValue()).floatValue() > 0.0f ? 1 : (((Number) mutableState.getValue()).floatValue() == 0.0f ? 0 : -1)) == 0 ? AnimationSpecKt.tween$default(0, 0, null, 6, null) : AnimationSpecKt.tween$default(200, 0, null, 6, null), 0.0f, "", null, composer2, 3072, 20);
            MutableState<WebView> mutableState2 = this.f51223OooO0Oo;
            MutableState<ContentState> mutableState3 = this.f51225OooO0o0;
            Function1<Boolean, Unit> function1 = this.f51224OooO0o;
            Function1<BaseWebView2, Unit> function2 = this.f51226OooO0oO;
            Object[] objArr = {mutableState2, mutableState, mutableState3, function1, function2};
            composer2.startReplaceableGroup(-568225417);
            for (int i = 0; i < 5; i++) {
                zChanged |= composer2.changed(objArr[i]);
            }
            Object objRememberedValue2 = composer2.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new o000O000(function2, mutableState2, mutableState, function1, mutableState3);
                composer2.updateRememberedValue(objRememberedValue2);
            }
            composer2.endReplaceableGroup();
            Modifier.Companion companion = Modifier.INSTANCE;
            AndroidView_androidKt.AndroidView((Function1) objRememberedValue2, ContentStatus.matchParentSize(companion), null, composer2, 0, 4);
            if (stateAnimateFloatAsState.getValue().floatValue() > 0.0f && stateAnimateFloatAsState.getValue().floatValue() < 1.0f) {
                ProgressIndicatorKt.m1158LinearProgressIndicator_5eSRE(stateAnimateFloatAsState.getValue().floatValue(), SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl((float) 1.5d)), o0OOo000.f48355o00ooo, o0OOo000.f48158OooOoO0, 0, composer2, 48, 16);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
