package p450o0Ooo00;

import Jni.FFmpegCmd;
import android.app.Activity;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.OooOOO;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.model.media.MediaModel;
import com.yalla.yalla.model.media.SelectMusicModelWrapper;
import com.yalla.yalla.module.media.camera.CameraActivity;
import com.yalla.yalla.module.media.music.MusicScreen;
import com.yalla.yalla.module.media.preview.YLMediaPreViewScreen;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p449o0Ooo0.o000OO00;
import p452o0Ooo00O.OooOOOO;
import p468o0OoooO0.o0OO0;
import p468o0OoooO0.o0OO00o0;
import p468o0OoooO0.o0OO0O0;
import p468o0OoooO0.o0OOOO00;
import p468o0OoooO0.o0o0000;
import p468o0OoooO0.oo0ooO;
import p560o0oOo000.o00000OO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class OooO0OO implements o00000OO {

    @DebugMetadata(c = "com.yalla.yalla.module.media.MediaModuleService$init$1", f = "MediaModuleService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new OooO00o(continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            o0OOOO00 o0oooo01 = o0OOOO00.f46930OooO00o;
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            MediaCodecInfo[] codecInfos = new MediaCodecList(1).getCodecInfos();
            Intrinsics.checkNotNullExpressionValue(codecInfos, "getCodecInfos(...)");
            for (MediaCodecInfo mediaCodecInfo : codecInfos) {
                if (!mediaCodecInfo.isEncoder()) {
                    String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                    Intrinsics.checkNotNullExpressionValue(supportedTypes, "getSupportedTypes(...)");
                    if (!(supportedTypes.length == 0)) {
                        String[] supportedTypes2 = mediaCodecInfo.getSupportedTypes();
                        Intrinsics.checkNotNull(supportedTypes2);
                        for (String str : supportedTypes2) {
                            if (StringsKt.OooOO0o(str, "video/avc")) {
                                MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                                int length = capabilitiesForType.colorFormats.length;
                                for (int i = 0; i < length; i++) {
                                    hashSet.add(Integer.valueOf(capabilitiesForType.colorFormats[i]));
                                }
                            }
                        }
                    }
                }
            }
            if (hashSet.contains(2135033992)) {
                OooO00o.OooO00o.OooO00o("yuv420p", arrayList);
            }
            if (hashSet.contains(21)) {
                OooO00o.OooO00o.OooO00o("nv12", arrayList);
            }
            if (hashSet.contains(19)) {
                OooO00o.OooO00o.OooO00o("yuv420p", arrayList);
            }
            if (arrayList.contains("nv12")) {
                OooO00o.OooO00o.OooO00o("nv21", arrayList);
            }
            if (hashSet.contains(40)) {
                OooO00o.OooO00o.OooO00o("yuv422p", arrayList);
            }
            if (hashSet.contains(25)) {
                OooO00o.OooO00o.OooO00o("yuyv422", arrayList);
            }
            if (hashSet.contains(27)) {
                OooO00o.OooO00o.OooO00o("yuv422p", arrayList);
            }
            if (arrayList.contains("nv12")) {
                arrayList.remove("nv12");
                arrayList.add(0, "nv12");
            }
            if (arrayList.contains("yuv420p")) {
                arrayList.remove("yuv420p");
                arrayList.add(0, "yuv420p");
            }
            int size = arrayList.size();
            String[] strArr = new String[size];
            for (int i2 = 0; i2 < size; i2++) {
                strArr[i2] = "";
            }
            int size2 = arrayList.size();
            for (int i3 = 0; i3 < size2; i3++) {
                Object obj2 = arrayList.get(i3);
                Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                strArr[i3] = obj2;
            }
            o0OOOO00.f46931OooO0O0 = FFmpegCmd.checkEncoder(strArr);
            return Unit.INSTANCE;
        }
    }

    @Override // p560o0oOo000.o00000OO
    public final void OooO00o(@NotNull MediaModel mediaModel, @Nullable SelectMusicModelWrapper selectMusicModelWrapper) {
        Intrinsics.checkNotNullParameter(mediaModel, "mediaModel");
        YLMediaPreViewScreen.navigate$default(YLMediaPreViewScreen.INSTANCE, mediaModel, 0L, 0L, selectMusicModelWrapper, 6, null);
    }

    @Override // p560o0oOo000.o00000OO
    public final void OooO0O0() {
        OooOOO.OooO0O0(GlobalScope.INSTANCE, new OooO00o(null));
    }

    @Override // p560o0oOo000.o00000OO
    public final void OooO0OO() {
        Lazy lazy = o0OO0.f46906OooO00o;
        OooOOO.OooO0O0(GlobalScope.INSTANCE, new oo0ooO(0L, null));
    }

    @Override // p560o0oOo000.o00000OO
    public final void OooO0Oo(@NotNull MixedRoomActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        new o000OO00(activity).OooO();
    }

    @Override // p560o0oOo000.o00000OO
    public final void OooO0o(long j, long j2, @NotNull Activity context, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(context, "context");
        int i = CameraActivity.f24134OooOOo;
        Intrinsics.checkNotNullParameter(context, "context");
        o0OO0O0.OooO00o("_Camera", "enableTakePicture: " + z + "   enableRecordingVideo:" + z2 + "    firstShowTakePicture:null   minMontageDurationMs:" + j + "    maxMontageDurationMs:" + j2);
        o0o0000.OooO00o(new OooOOOO(j, j2, context, z, z2));
    }

    @Override // p560o0oOo000.o00000OO
    public final void OooO0o0(@NotNull ArrayList exceptFileList) {
        Intrinsics.checkNotNullParameter(exceptFileList, "exceptFileList");
        Lazy lazy = o0OO0.f46906OooO00o;
        OooOOO.OooO0O0(GlobalScope.INSTANCE, new o0OO00o0(exceptFileList, null));
    }

    @Override // p560o0oOo000.o00000OO
    public final void OooO0oO() {
        MusicScreen.navigate$default(MusicScreen.INSTANCE, true, true, null, 0L, null, 28, null);
    }
}
