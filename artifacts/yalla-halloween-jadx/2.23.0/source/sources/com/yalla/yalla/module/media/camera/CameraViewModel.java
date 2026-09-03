package com.yalla.yalla.module.media.camera;

import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import androidx.camera.core.CameraControl;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ViewPort;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.o000OO0O;
import androidx.camera.core.impl.o00O0;
import androidx.camera.core.impl.o00O00O;
import androidx.camera.core.impl.o00O0O0;
import androidx.camera.video.VideoRecordEvent;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import com.facebook.internal.NativeProtocol;
import com.google.android.exoplayer2.OooOOO;
import com.yalla.yalla.model.media.MediaVideoItemModel;
import com.yalla.yalla.model.media.SelectMusicModel;
import com.yalla.yalla.module.media.camera.CameraViewModel;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import o0OOo000.OooO0O0;
import o0OOo000.OooOO0O;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0oO.o000O0Oo;
import p039OoooOoo.o00OOO0;
import p452o0Ooo00O.Oooo0;
import p468o0OoooO0.o0OO0O0;
import p468o0OoooO0.o0OOo000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nCameraViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CameraViewModel.kt\ncom/yalla/yalla/module/media/camera/CameraViewModel\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,395:1\n81#2:396\n107#2,2:397\n81#2:399\n107#2,2:400\n81#2:402\n107#2,2:403\n81#2:405\n107#2,2:406\n81#2:408\n107#2,2:409\n81#2:411\n107#2,2:412\n81#2:414\n107#2,2:415\n*S KotlinDebug\n*F\n+ 1 CameraViewModel.kt\ncom/yalla/yalla/module/media/camera/CameraViewModel\n*L\n52#1:396\n52#1:397,2\n72#1:399\n72#1:400,2\n83#1:402\n83#1:403,2\n88#1:405\n88#1:406,2\n104#1:408\n104#1:409,2\n114#1:411\n114#1:412,2\n125#1:414\n125#1:415,2\n*E\n"})
public final class CameraViewModel extends ViewModel {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final Lazy f24221OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public ViewPort f24222OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public LifecycleOwner f24223OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Lazy f24224OooO0OO = LazyKt.lazy(OooOO0.f24266OooO0Oo);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Bundle f24225OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final MutableState f24226OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f24227OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final MutableState<Boolean> f24228OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final Lazy f24229OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final Lazy f24230OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final MutableState f24231OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final Lazy f24232OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public final MutableState f24233OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final Lazy f24234OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public final MutableState f24235OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @Nullable
    public CameraSelector f24236OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @Nullable
    public androidx.camera.lifecycle.OooOO0 f24237OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public o000O0Oo f24238OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final MutableState f24239OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final MutableState f24240OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public final MutableState f24241OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @Nullable
    public ImageCapture f24242OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public final ArrayList f24243OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @NotNull
    public final Lazy f24244OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public final Lazy f24245OooOoO0;

    public static final class OooO extends Lambda implements Function0<Boolean> {
        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            boolean zOooO00o;
            CameraViewModel cameraViewModel = CameraViewModel.this;
            Bundle bundle = cameraViewModel.f24225OooO0Oo;
            Bundle bundle2 = null;
            if (bundle == null) {
                Intrinsics.throwUninitializedPropertyAccessException(NativeProtocol.WEB_DIALOG_PARAMS);
                bundle = null;
            }
            if (bundle.containsKey("camera_first_show_take_picture")) {
                Bundle bundle3 = cameraViewModel.f24225OooO0Oo;
                if (bundle3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(NativeProtocol.WEB_DIALOG_PARAMS);
                } else {
                    bundle2 = bundle3;
                }
                zOooO00o = bundle2.getBoolean("camera_first_show_take_picture");
            } else {
                zOooO00o = p454o0Ooo0O.Oooo000.f46496OooO0O0.OooO00o("showTakePicture", false);
            }
            return Boolean.valueOf(zOooO00o);
        }
    }

    @StabilityInferred(parameters = 0)
    @SourceDebugExtension({"SMAP\nCameraViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CameraViewModel.kt\ncom/yalla/yalla/module/media/camera/CameraViewModel$CameraVideoState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,395:1\n81#2:396\n107#2,2:397\n81#2:399\n107#2,2:400\n81#2:402\n107#2,2:403\n81#2:405\n107#2,2:406\n81#2:408\n107#2,2:409\n81#2:411\n107#2,2:412\n1864#3,3:414\n*S KotlinDebug\n*F\n+ 1 CameraViewModel.kt\ncom/yalla/yalla/module/media/camera/CameraViewModel$CameraVideoState\n*L\n217#1:396\n217#1:397,2\n222#1:399\n222#1:400,2\n227#1:402\n227#1:403,2\n232#1:405\n232#1:406,2\n237#1:408\n237#1:409,2\n242#1:411\n242#1:412,2\n280#1:414,3\n*E\n"})
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        @NotNull
        public final MutableState f24247OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final long f24248OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f24249OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public final ArrayList<MediaVideoItemModel> f24250OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public androidx.camera.video.OooOOOO<androidx.camera.video.OooOO0O> f24251OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @NotNull
        public final MutableState<Boolean> f24252OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @Nullable
        public androidx.camera.video.OooOOO0 f24253OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @NotNull
        public final MutableState<VideoRecordState> f24254OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        @Nullable
        public File f24255OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        @NotNull
        public final MutableState f24256OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        @NotNull
        public final MutableState f24257OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        @NotNull
        public final MutableState f24258OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        @NotNull
        public final MutableState f24259OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        @NotNull
        public final MutableState f24260OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        @Nullable
        public Function0<Unit> f24261OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        @NotNull
        public final Oooo0 f24262OooOOOo;

        /* JADX WARN: Type inference failed for: r4v9, types: [o0Ooo00O.Oooo0] */
        public OooO00o(long j, @NotNull final OooO0O0 musicState) {
            Intrinsics.checkNotNullParameter(musicState, "musicState");
            this.f24248OooO00o = j;
            this.f24250OooO0OO = new ArrayList<>();
            this.f24252OooO0o = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
            this.f24254OooO0oO = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(VideoRecordState.IDLE, null, 2, null);
            this.f24247OooO = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);
            Float fValueOf = Float.valueOf(0.0f);
            this.f24256OooOO0 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(fValueOf, null, 2, null);
            this.f24257OooOO0O = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);
            this.f24258OooOO0o = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(fValueOf, null, 2, null);
            this.f24260OooOOO0 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);
            this.f24259OooOOO = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(fValueOf, null, 2, null);
            this.f24262OooOOOo = new o000OO.OooO00o() { // from class: o0Ooo00O.Oooo0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // o000OO.OooO00o
                public final void accept(Object obj) throws IOException {
                    CameraViewModel.VideoRecordState videoRecordState;
                    long j2;
                    VideoRecordEvent videoRecordEvent = (VideoRecordEvent) obj;
                    CameraViewModel.OooO00o this$0 = this.f46476OooO00o;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    CameraViewModel.OooO0O0 musicState2 = musicState;
                    Intrinsics.checkNotNullParameter(musicState2, "$musicState");
                    o00OOO0 o00ooo1 = videoRecordEvent.f4029OooO0O0;
                    Intrinsics.checkNotNullExpressionValue(o00ooo1, "event.recordingStats");
                    long jOooO0O0 = o00ooo1.OooO0O0() / ((long) 1000);
                    this$0.f24247OooO.setValue(Long.valueOf(TimeUnit.NANOSECONDS.toMillis(o00ooo1.OooO0OO())));
                    MutableState mutableState = this$0.f24247OooO;
                    float fLongValue = ((Number) mutableState.getValue()).longValue() * 1.0f;
                    float f = this$0.f24248OooO00o;
                    Float fValueOf2 = Float.valueOf(fLongValue / f);
                    MutableState mutableState2 = this$0.f24256OooOO0;
                    mutableState2.setValue(fValueOf2);
                    this$0.f24260OooOOO0.setValue(Long.valueOf(((Number) mutableState.getValue()).longValue() + this$0.OooO0O0()));
                    MutableState mutableState3 = this$0.f24258OooOO0o;
                    this$0.f24259OooOOO.setValue(Float.valueOf(((Number) mutableState2.getValue()).floatValue() + ((Number) mutableState3.getValue()).floatValue()));
                    boolean z = videoRecordEvent instanceof VideoRecordEvent.Finalize;
                    ArrayList<MediaVideoItemModel> arrayList = this$0.f24250OooO0OO;
                    if (z) {
                        File file = this$0.f24255OooO0oo;
                        String absolutePath = file != null ? file.getAbsolutePath() : null;
                        if (absolutePath == null) {
                            absolutePath = "";
                        }
                        File file2 = this$0.f24255OooO0oo;
                        String filePath = file2 != null ? file2.getAbsolutePath() : null;
                        if (filePath == null) {
                            filePath = "";
                        }
                        Intrinsics.checkNotNullParameter(filePath, "filePath");
                        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                        try {
                            mediaMetadataRetriever.setDataSource(filePath);
                            String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
                            Intrinsics.checkNotNull(strExtractMetadata);
                            long j3 = Long.parseLong(strExtractMetadata);
                            mediaMetadataRetriever.release();
                            j2 = j3;
                        } catch (Exception unused) {
                            mediaMetadataRetriever.release();
                            j2 = 0;
                        } catch (Throwable th) {
                            mediaMetadataRetriever.release();
                            throw th;
                        }
                        MediaVideoItemModel mediaVideoItemModel = new MediaVideoItemModel(absolutePath, j2, ((Number) mutableState2.getValue()).floatValue());
                        arrayList.add(mediaVideoItemModel);
                        this$0.f24257OooOO0O.setValue(Long.valueOf(mediaVideoItemModel.getDuration() + this$0.OooO0O0()));
                        mutableState3.setValue(Float.valueOf((this$0.OooO0O0() * 1.0f) / f));
                        o0OO0O0.OooO00o("_CameraVM", "recordVideo Finalize file: " + this$0.f24255OooO0oo);
                        o0OO0O0.OooO00o("_CameraVM", "preAllRecordingTimeLength: " + this$0.OooO0O0() + "     preAllRecordingPercent: " + ((Number) mutableState3.getValue()).floatValue());
                        int i = 0;
                        for (MediaVideoItemModel mediaVideoItemModel2 : arrayList) {
                            int i2 = i + 1;
                            if (i < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            o0OO0O0.OooO00o("_CameraVM", "current item: " + i + "  " + mediaVideoItemModel2);
                            i = i2;
                        }
                        Function0<Unit> function0 = this$0.f24261OooOOOO;
                        if (function0 != null) {
                            function0.invoke();
                        }
                    }
                    if (videoRecordEvent instanceof VideoRecordEvent.OooO0O0 ? true : videoRecordEvent instanceof VideoRecordEvent.OooO0OO) {
                        videoRecordState = CameraViewModel.VideoRecordState.Recording;
                    } else if (z) {
                        videoRecordState = arrayList.size() > 0 ? CameraViewModel.VideoRecordState.Pause : CameraViewModel.VideoRecordState.Complete;
                    } else {
                        videoRecordState = CameraViewModel.VideoRecordState.IDLE;
                    }
                    MutableState<CameraViewModel.VideoRecordState> mutableState4 = this$0.f24254OooO0oO;
                    if (mutableState4.getValue() != videoRecordState) {
                        if (videoRecordState == CameraViewModel.VideoRecordState.Recording) {
                            long jOooO00o = this$0.OooO00o();
                            SelectMusicModel value = musicState2.f24263OooO00o.getValue();
                            if (value != null) {
                                o0OO0O0.OooO00o("_CameraVM", "audio startPlay  allRecordingTimeInMillis " + jOooO00o);
                                if (jOooO00o == 0) {
                                    OooO0O0 oooO0O0 = o0OOo000.f46938OooO00o;
                                    o0OOo000.OooO00o(value.getFilePath(), true, Long.valueOf(value.getStartPosition()), Long.valueOf(value.getDurationMs()), null, 32);
                                } else {
                                    OooO0O0 oooO0O1 = o0OOo000.f46938OooO00o;
                                    OooO0O0 oooO0O2 = o0OOo000.f46938OooO00o;
                                    if (Intrinsics.areEqual(oooO0O2.f43845OooOO0, OooOO0O.C0461OooOO0O.f43856OooO00o) && Intrinsics.areEqual(oooO0O2.f43844OooO0oo.f43858OooO00o, value.getFilePath())) {
                                        OooOOO oooOOO = oooO0O2.f43841OooO0o;
                                        if (!oooOOO.isPlaying()) {
                                            oooOOO.Oooo00O(true);
                                            oooOOO.Oooo00O(true);
                                        }
                                    } else {
                                        o0OOo000.OooO00o(value.getFilePath(), true, Long.valueOf(value.getStartPosition()), Long.valueOf(value.getDurationMs()), null, 32);
                                    }
                                    oooO0O2.f43841OooO0o.o00Ooo(5, jOooO00o);
                                }
                            }
                        } else if (videoRecordState == CameraViewModel.VideoRecordState.Pause) {
                            if (this$0.f24249OooO0O0) {
                                if (musicState2.f24263OooO00o.getValue() != null) {
                                    o0OO0O0.OooO00o("_CameraVM", "audio stop");
                                    OooO0O0 oooO0O3 = o0OOo000.f46938OooO00o;
                                    o0OOo000.OooO0O0();
                                }
                            } else if (musicState2.f24263OooO00o.getValue() != null) {
                                o0OO0O0.OooO00o("_CameraVM", "audio pause");
                                OooO0O0 oooO0O4 = o0OOo000.f46938OooO00o;
                                o0OOo000.f46938OooO00o.pause();
                            }
                        }
                    }
                    mutableState4.setValue(videoRecordState);
                }
            };
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final long OooO00o() {
            return ((Number) this.f24260OooOOO0.getValue()).longValue();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final long OooO0O0() {
            return ((Number) this.f24257OooOO0O.getValue()).longValue();
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final MutableState<SelectMusicModel> f24263OooO00o = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    public static final class OooO0OO extends Lambda implements Function0<Boolean> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            Bundle bundle = CameraViewModel.this.f24225OooO0Oo;
            if (bundle == null) {
                Intrinsics.throwUninitializedPropertyAccessException(NativeProtocol.WEB_DIALOG_PARAMS);
                bundle = null;
            }
            return Boolean.valueOf(bundle.getBoolean("camera_recording_video"));
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Boolean> {
        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            Bundle bundle = CameraViewModel.this.f24225OooO0Oo;
            if (bundle == null) {
                Intrinsics.throwUninitializedPropertyAccessException(NativeProtocol.WEB_DIALOG_PARAMS);
                bundle = null;
            }
            return Boolean.valueOf(bundle.getBoolean("camera_take_picture"));
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<OooO0O0> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOO0 f24266OooO0Oo = new OooOO0();

        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final OooO0O0 invoke() {
            return new OooO0O0();
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<androidx.camera.core.OooOOOO> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOO0O f24267OooO0Oo = new OooOO0O();

        public OooOO0O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final androidx.camera.core.OooOOOO invoke() {
            androidx.camera.core.OooOOOO.OooO00o oooO00o = new androidx.camera.core.OooOOOO.OooO00o();
            androidx.camera.core.impl.OooO0o oooO0o = ImageOutputConfig.f3541OooOO0O;
            o00O00O o00o00o2 = oooO00o.f3474OooO00o;
            o00o00o2.Oooo0oO(oooO0o, 1);
            o00O0O0 o00o0o0 = new o00O0O0(o00O0.Oooo0O0(o00o00o2));
            o000OO0O.OooO0o(o00o0o0);
            return new androidx.camera.core.OooOOOO(o00o0o0);
        }
    }

    public static final class OooOOO extends Lambda implements Function0<Long> {
        public OooOOO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            Bundle bundle = CameraViewModel.this.f24225OooO0Oo;
            if (bundle == null) {
                Intrinsics.throwUninitializedPropertyAccessException(NativeProtocol.WEB_DIALOG_PARAMS);
                bundle = null;
            }
            return Long.valueOf(bundle.getLong("camera_min_recording_video_time"));
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<Long> {
        public OooOOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            Bundle bundle = CameraViewModel.this.f24225OooO0Oo;
            if (bundle == null) {
                Intrinsics.throwUninitializedPropertyAccessException(NativeProtocol.WEB_DIALOG_PARAMS);
                bundle = null;
            }
            return Long.valueOf(bundle.getLong("camera_max_recording_video_time"));
        }
    }

    public static final class OooOOOO extends Lambda implements Function0<OooO00o> {
        public OooOOOO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final OooO00o invoke() {
            CameraViewModel cameraViewModel = CameraViewModel.this;
            return new OooO00o(((Number) cameraViewModel.f24234OooOOO0.getValue()).longValue(), cameraViewModel.OooO0o());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yalla/yalla/module/media/camera/CameraViewModel$VideoRecordState;", "", "IDLE", "Recording", "Pause", "Complete", "Media_YallaRelease"}, k = 1, mv = {1, 8, 0})
    public enum VideoRecordState {
        IDLE,
        Recording,
        Pause,
        Complete
    }

    public CameraViewModel() {
        Boolean bool = Boolean.FALSE;
        this.f24226OooO0o = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.f24228OooO0oO = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.f24229OooO0oo = LazyKt.lazy(new OooO0o());
        this.f24221OooO = LazyKt.lazy(new OooO0OO());
        this.f24230OooOO0 = LazyKt.lazy(new OooO());
        Boolean bool2 = Boolean.TRUE;
        this.f24231OooOO0O = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool2, null, 2, null);
        this.f24232OooOO0o = LazyKt.lazy(new OooOOO());
        this.f24234OooOOO0 = LazyKt.lazy(new OooOOO0());
        this.f24233OooOOO = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.f24235OooOOOO = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool2, null, 2, null);
        this.f24239OooOOoo = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        p454o0Ooo0O.Oooo000 oooo000 = p454o0Ooo0O.Oooo000.f46496OooO0O0;
        oooo000.getClass();
        Intrinsics.checkNotNullParameter("flashMode", "key");
        this.f24241OooOo0 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(oooo000.f46495OooO00o.getInt("flashMode", 2)), null, 2, null);
        this.f24243OooOo0O = new ArrayList();
        this.f24244OooOo0o = LazyKt.lazy(OooOO0O.f24267OooO0Oo);
        this.f24240OooOo = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(oooo000.OooO00o("pauseRecordingVideo", true)), null, 2, null);
        this.f24245OooOoO0 = LazyKt.lazy(new OooOOOO());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean OooO() {
        return ((Boolean) this.f24235OooOOOO.getValue()).booleanValue();
    }

    public final void OooO0O0() {
        Object objM4213constructorimpl;
        CameraControl cameraControlOooO0OO;
        CameraControl cameraControlOooO0OO2;
        o0OO0O0.OooO00o("_CameraVM", "checkTorch");
        try {
            Result.Companion companion = Result.INSTANCE;
            com.google.common.util.concurrent.OooO00o<Void> oooO00oOooO0o0 = null;
            if (OooO() || OooO0o0() != 1 || OooO0oO()) {
                o0OO0O0.OooO00o("_CameraVM", "checkTorch disable");
                o000O0Oo o000o0oo2 = this.f24238OooOOo0;
                if (o000o0oo2 != null && (cameraControlOooO0OO = o000o0oo2.OooO0OO()) != null) {
                    oooO00oOooO0o0 = cameraControlOooO0OO.OooO0o0(false);
                }
            } else {
                o0OO0O0.OooO00o("_CameraVM", "checkTorch enable");
                o000O0Oo o000o0oo3 = this.f24238OooOOo0;
                if (o000o0oo3 != null && (cameraControlOooO0OO2 = o000o0oo3.OooO0OO()) != null) {
                    oooO00oOooO0o0 = cameraControlOooO0OO2.OooO0o0(true);
                }
            }
            objM4213constructorimpl = Result.m4213constructorimpl(oooO00oOooO0o0);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM4213constructorimpl = Result.m4213constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m4216exceptionOrNullimpl(objM4213constructorimpl) != null) {
            o0OO0O0.OooO00o("_CameraVM", "checkTorch error");
        }
    }

    public final boolean OooO0OO() {
        return ((Boolean) this.f24221OooO.getValue()).booleanValue();
    }

    public final boolean OooO0Oo() {
        return ((Boolean) this.f24229OooO0oo.getValue()).booleanValue();
    }

    @NotNull
    public final OooO0O0 OooO0o() {
        return (OooO0O0) this.f24224OooO0OO.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int OooO0o0() {
        return ((Number) this.f24241OooOo0.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean OooO0oO() {
        return ((Boolean) this.f24231OooOO0O.getValue()).booleanValue();
    }

    @NotNull
    public final OooO00o OooO0oo() {
        return (OooO00o) this.f24245OooOoO0.getValue();
    }
}
