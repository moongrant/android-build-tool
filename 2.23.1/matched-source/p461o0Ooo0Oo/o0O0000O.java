package p461o0Ooo0Oo;

import android.content.Context;
import androidx.camera.view.PreviewView;
import androidx.compose.runtime.MutableState;
import com.yalla.yalla.module.media.camera.CameraViewModel;
import com.yalla.yalla.module.media.camera.OooOo00;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p473o0OoooO0.o0oOOo;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nCameraUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CameraUtils.kt\ncom/yalla/yalla/module/media/utils/CameraUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,155:1\n766#2:156\n857#2,2:157\n1855#2,2:159\n1855#2,2:161\n*S KotlinDebug\n*F\n+ 1 CameraUtils.kt\ncom/yalla/yalla/module/media/utils/CameraUtils\n*L\n62#1:156\n62#1:157,2\n78#1:159,2\n84#1:161,2\n*E\n"})
public final class o0O0000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0O0000O f47793OooO00o = new o0O0000O();

    @DebugMetadata(c = "com.yalla.yalla.module.media.utils.CameraUtils", f = "CameraUtils.kt", i = {0}, l = {38}, m = "switchCamera", n = {"cameraViewModel"}, s = {"L$0"})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public CameraViewModel f47794OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f47796OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f47797OooO0oO;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f47796OooO0o0 = obj;
            this.f47797OooO0oO |= Integer.MIN_VALUE;
            return o0O0000O.this.OooO00o(null, null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO00o(@NotNull CameraViewModel cameraViewModel, @NotNull Context context, @NotNull MutableState<PreviewView> mutableState, @NotNull Continuation<? super Unit> continuation) {
        OooO00o oooO00o;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f47797OooO0oO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f47797OooO0oO = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        } else {
            oooO00o = new OooO00o(continuation);
        }
        Object obj = oooO00o.f47796OooO0o0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO00o.f47797OooO0oO;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            cameraViewModel.getClass();
            cameraViewModel.f23777OooOO0O.setValue(Boolean.valueOf(!cameraViewModel.OooO0oO()));
            o0oOOo.f47875OooO0O0.OooO0O0("showFrontCamera", cameraViewModel.OooO0oO());
            PreviewView value = mutableState.getValue();
            oooO00o.f47794OooO0Oo = cameraViewModel;
            oooO00o.f47797OooO0oO = 1;
            if (OooOo00.OooO0O0(cameraViewModel, context, value, oooO00o) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cameraViewModel = oooO00o.f47794OooO0Oo;
            ResultKt.throwOnFailure(obj);
        }
        cameraViewModel.getClass();
        return Unit.INSTANCE;
    }
}
