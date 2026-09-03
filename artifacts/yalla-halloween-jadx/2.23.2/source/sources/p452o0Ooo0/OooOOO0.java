package p452o0Ooo0;

import androidx.compose.runtime.DisposableEffectResult;
import com.yalla.yalla.module.media.camera.CameraViewModel;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 CameraCommonComp.kt\ncom/yalla/yalla/module/media/camera/CameraCommonCompKt$PauseRecordingWarn$1\n*L\n1#1,496:1\n407#2,2:497\n*E\n"})
public final class OooOOO0 implements DisposableEffectResult {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ CameraViewModel f47598OooO00o;

    public OooOOO0(CameraViewModel cameraViewModel) {
        this.f47598OooO00o = cameraViewModel;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        this.f47598OooO00o.f23773OooOo.setValue(Boolean.FALSE);
    }
}
