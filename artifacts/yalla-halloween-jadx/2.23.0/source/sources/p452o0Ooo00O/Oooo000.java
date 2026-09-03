package p452o0Ooo00O;

import android.net.Uri;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import com.code.android.util.OooOOO;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.yalla.yalla.model.media.MediaModel;
import com.yalla.yalla.model.media.SelectMusicFrom;
import com.yalla.yalla.model.media.SelectMusicModelWrapper;
import com.yalla.yalla.module.media.camera.CameraViewModel;
import com.zego.zegoavkit2.ZegoConstants;
import java.io.File;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p450o0Ooo00.OooO;
import p468o0OoooO0.o0OO0O0;

/* JADX INFO: loaded from: classes4.dex */
public final class Oooo000 implements ImageCapture.OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ File f46478OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ CameraViewModel f46479OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f46480OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function2<MediaModel, SelectMusicModelWrapper, Unit> f46481OooO0Oo;

    @DebugMetadata(c = "com.yalla.yalla.module.media.camera.CameraScreenKt$takePicture$1$1$onImageSaved$1", f = "CameraScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function2<MediaModel, SelectMusicModelWrapper, Unit> f46482OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ CameraViewModel f46483OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Uri f46484OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(Function2<? super MediaModel, ? super SelectMusicModelWrapper, Unit> function2, Uri uri, CameraViewModel cameraViewModel, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f46482OooO0Oo = function2;
            this.f46484OooO0o0 = uri;
            this.f46483OooO0o = cameraViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f46482OooO0Oo, this.f46484OooO0o0, this.f46483OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            MediaModel mediaModel = new MediaModel(true, this.f46484OooO0o0, null, 4, null);
            CameraViewModel cameraViewModel = this.f46483OooO0o;
            cameraViewModel.getClass();
            this.f46482OooO0Oo.invoke(mediaModel, new SelectMusicModelWrapper(SelectMusicFrom.CAMERA_PAGE, cameraViewModel.OooO0o().f24263OooO00o.getValue()));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Oooo000(File file, CameraViewModel cameraViewModel, CoroutineScope coroutineScope, Function2<? super MediaModel, ? super SelectMusicModelWrapper, Unit> function2) {
        this.f46478OooO00o = file;
        this.f46479OooO0O0 = cameraViewModel;
        this.f46480OooO0OO = coroutineScope;
        this.f46481OooO0Oo = function2;
    }

    @Override // androidx.camera.core.ImageCapture.OooOO0
    public final void OooO00o(@NotNull ImageCaptureException exc) {
        Intrinsics.checkNotNullParameter(exc, "exc");
        o0OO0O0.OooO00o("_Camera", "Photo capture failed: " + exc.getMessage() + ZegoConstants.ZegoVideoDataAuxPublishingStream + exc);
        o000O00O.OooO0O0(o0000.OooO0OO(OooO.take_photo_error));
    }

    @Override // androidx.camera.core.ImageCapture.OooOO0
    public final void OooO0O0(@NotNull ImageCapture.OooOOO0 output) {
        Intrinsics.checkNotNullParameter(output, "output");
        Uri uriFromFile = output.f3431OooO00o;
        if (uriFromFile == null) {
            uriFromFile = Uri.fromFile(this.f46478OooO00o);
            Intrinsics.checkNotNullExpressionValue(uriFromFile, "fromFile(photoFile)");
        }
        o0OO0O0.OooO00o("_Camera", "Photo capture succeeded: " + uriFromFile);
        CameraViewModel cameraViewModel = this.f46479OooO0O0;
        cameraViewModel.f24233OooOOO.setValue(uriFromFile);
        OooOOO.OooO0OO(this.f46480OooO0OO, new OooO00o(this.f46481OooO0Oo, uriFromFile, cameraViewModel, null));
    }
}
