package p452o0Ooo00O;

import androidx.compose.runtime.DisposableEffectResult;
import com.yalla.yalla.module.media.camera.CameraViewModel;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 CameraCommonComp.kt\ncom/yalla/yalla/module/media/camera/CameraCommonCompKt$PauseRecordingWarn$1\n*L\n1#1,496:1\n407#2,2:497\n*E\n"})
public final class OooOo implements DisposableEffectResult {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ CameraViewModel f46460OooO00o;

    public OooOo(CameraViewModel cameraViewModel) {
        this.f46460OooO00o = cameraViewModel;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        this.f46460OooO00o.f24240OooOo.setValue(Boolean.FALSE);
    }
}
