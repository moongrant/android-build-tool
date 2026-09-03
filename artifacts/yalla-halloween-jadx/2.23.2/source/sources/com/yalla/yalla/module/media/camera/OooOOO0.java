package com.yalla.yalla.module.media.camera;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.res.StringResources_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p207o00o0oO0.o000O0Oo;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nCameraActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CameraActivity.kt\ncom/yalla/yalla/module/media/camera/CameraActivity$openCameraError$1$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,166:1\n36#2:167\n1097#3,6:168\n*S KotlinDebug\n*F\n+ 1 CameraActivity.kt\ncom/yalla/yalla/module/media/camera/CameraActivity$openCameraError$1$1\n*L\n160#1:167\n160#1:168,6\n*E\n"})
public final class OooOOO0 extends Lambda implements Function3<MutableState<Boolean>, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ CameraActivity f23880OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO0(CameraActivity cameraActivity) {
        super(3);
        this.f23880OooO0Oo = cameraActivity;
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
                ComposerKt.traceEventStart(2060472183, iIntValue, -1, "com.yalla.yalla.module.media.camera.CameraActivity.openCameraError.<anonymous>.<anonymous> (CameraActivity.kt:155)");
            }
            String strStringResource = StringResources_androidKt.stringResource(o000000.open_camera_error, composer2, 0);
            composer2.startReplaceableGroup(1157296644);
            CameraActivity cameraActivity = this.f23880OooO0Oo;
            boolean zChanged = composer2.changed(cameraActivity);
            Object objRememberedValue = composer2.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new OooOO0O(cameraActivity);
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            o000O0Oo.OooO0Oo(it, strStringResource, null, null, false, false, null, null, null, false, null, false, (Function0) objRememberedValue, null, false, false, null, null, null, null, composer2, (iIntValue & 14) | 196608, 0, 1044444);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
