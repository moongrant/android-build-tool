package com.yalla.yalla.module.media.camera;

import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import androidx.camera.core.CameraControl;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ViewPort;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.o000OO0O;
import androidx.camera.core.impl.o00O0O00;
import androidx.camera.core.impl.o00O0O0O;
import androidx.camera.core.impl.oOO00O;
import androidx.camera.video.VideoRecordEvent;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.media3.exoplayer.OooO;
import com.facebook.internal.NativeProtocol;
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
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0oO.o000O0Oo;
import p039OoooOoo.o00OOOOo;
import p363o0OOo00O.OooO0o;
import p363o0OOo00O.OooOOO;
import p459o0Ooo0Oo.o0oOO;
import p460o0Ooo0o.o00OOO00;
import p460o0Ooo0o.oo0o0O0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nCameraViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CameraViewModel.kt\ncom/yalla/yalla/module/media/camera/CameraViewModel\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,395:1\n81#2:396\n107#2,2:397\n81#2:399\n107#2,2:400\n81#2:402\n107#2,2:403\n81#2:405\n107#2,2:406\n81#2:408\n107#2,2:409\n81#2:411\n107#2,2:412\n81#2:414\n107#2,2:415\n*S KotlinDebug\n*F\n+ 1 CameraViewModel.kt\ncom/yalla/yalla/module/media/camera/CameraViewModel\n*L\n52#1:396\n52#1:397,2\n72#1:399\n72#1:400,2\n83#1:402\n83#1:403,2\n88#1:405\n88#1:406,2\n104#1:408\n104#1:409,2\n114#1:411\n114#1:412,2\n125#1:414\n125#1:415,2\n*E\n"})
public final class CameraViewModel extends ViewModel {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final Lazy f23754OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public ViewPort f23755OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public LifecycleOwner f23756OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Lazy f23757OooO0OO = LazyKt.lazy(OooOO0.f23799OooO0Oo);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Bundle f23758OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final MutableState f23759OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f23760OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final MutableState<Boolean> f23761OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final Lazy f23762OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final Lazy f23763OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final MutableState f23764OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final Lazy f23765OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public final MutableState f23766OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final Lazy f23767OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public final MutableState f23768OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @Nullable
    public CameraSelector f23769OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @Nullable
    public androidx.camera.lifecycle.OooOO0 f23770OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public o000O0Oo f23771OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final MutableState f23772OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final MutableState f23773OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public final MutableState f23774OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @Nullable
    public ImageCapture f23775OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public final ArrayList f23776OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @NotNull
    public final Lazy f23777OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public final Lazy f23778OooOoO0;

    public static final class OooO extends Lambda implements Function0<Boolean> {
        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            boolean zOooO00o;
            CameraViewModel cameraViewModel = CameraViewModel.this;
            Bundle bundle = cameraViewModel.f23758OooO0Oo;
            Bundle bundle2 = null;
            if (bundle == null) {
                Intrinsics.throwUninitializedPropertyAccessException(NativeProtocol.WEB_DIALOG_PARAMS);
                bundle = null;
            }
            if (bundle.containsKey("camera_first_show_take_picture")) {
                Bundle bundle3 = cameraViewModel.f23758OooO0Oo;
                if (bundle3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(NativeProtocol.WEB_DIALOG_PARAMS);
                } else {
                    bundle2 = bundle3;
                }
                zOooO00o = bundle2.getBoolean("camera_first_show_take_picture");
            } else {
                zOooO00o = o0oOO.f47775OooO0O0.OooO00o("showTakePicture", false);
            }
            return Boolean.valueOf(zOooO00o);
        }
    }

    @StabilityInferred(parameters = 0)
    @SourceDebugExtension({"SMAP\nCameraViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CameraViewModel.kt\ncom/yalla/yalla/module/media/camera/CameraViewModel$CameraVideoState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,395:1\n81#2:396\n107#2,2:397\n81#2:399\n107#2,2:400\n81#2:402\n107#2,2:403\n81#2:405\n107#2,2:406\n81#2:408\n107#2,2:409\n81#2:411\n107#2,2:412\n1864#3,3:414\n*S KotlinDebug\n*F\n+ 1 CameraViewModel.kt\ncom/yalla/yalla/module/media/camera/CameraViewModel$CameraVideoState\n*L\n217#1:396\n217#1:397,2\n222#1:399\n222#1:400,2\n227#1:402\n227#1:403,2\n232#1:405\n232#1:406,2\n237#1:408\n237#1:409,2\n242#1:411\n242#1:412,2\n280#1:414,3\n*E\n"})
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        @NotNull
        public final MutableState f23780OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final long f23781OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f23782OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public final ArrayList<MediaVideoItemModel> f23783OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public androidx.camera.video.OooOOOO<androidx.camera.video.OooOO0O> f23784OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @NotNull
        public final MutableState<Boolean> f23785OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @Nullable
        public androidx.camera.video.OooOOO0 f23786OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @NotNull
        public final MutableState<VideoRecordState> f23787OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        @Nullable
        public File f23788OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        @NotNull
        public final MutableState f23789OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        @NotNull
        public final MutableState f23790OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        @NotNull
        public final MutableState f23791OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        @NotNull
        public final MutableState f23792OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        @NotNull
        public final MutableState f23793OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        @Nullable
        public Function0<Unit> f23794OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        @NotNull
        public final p452o0Ooo0.OooOOOO f23795OooOOOo;

        /* JADX WARN: Type inference failed for: r4v9, types: [o0Ooo0.OooOOOO] */
        public OooO00o(long j, @NotNull final OooO0O0 musicState) {
            Intrinsics.checkNotNullParameter(musicState, "musicState");
            this.f23781OooO00o = j;
            this.f23783OooO0OO = new ArrayList<>();
            this.f23785OooO0o = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
            this.f23787OooO0oO = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(VideoRecordState.IDLE, null, 2, null);
            this.f23780OooO = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);
            Float fValueOf = Float.valueOf(0.0f);
            this.f23789OooOO0 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(fValueOf, null, 2, null);
            this.f23790OooOO0O = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);
            this.f23791OooOO0o = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(fValueOf, null, 2, null);
            this.f23793OooOOO0 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);
            this.f23792OooOOO = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(fValueOf, null, 2, null);
            this.f23795OooOOOo = new o000OO.OooO00o() { // from class: o0Ooo0.OooOOOO
                /* JADX WARN: Multi-variable type inference failed */
                @Override // o000OO.OooO00o
                public final void accept(Object obj) throws IOException {
                    CameraViewModel.VideoRecordState videoRecordState;
                    long j2;
                    VideoRecordEvent videoRecordEvent = (VideoRecordEvent) obj;
                    CameraViewModel.OooO00o this$0 = this.f47599OooO00o;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    CameraViewModel.OooO0O0 musicState2 = musicState;
                    Intrinsics.checkNotNullParameter(musicState2, "$musicState");
                    o00OOOOo o00ooooo2 = videoRecordEvent.f4029OooO0O0;
                    Intrinsics.checkNotNullExpressionValue(o00ooooo2, "getRecordingStats(...)");
                    long jOooO0O0 = o00ooooo2.OooO0O0() / ((long) 1000);
                    this$0.f23780OooO.setValue(Long.valueOf(TimeUnit.NANOSECONDS.toMillis(o00ooooo2.OooO0OO())));
                    MutableState mutableState = this$0.f23780OooO;
                    float fLongValue = ((Number) mutableState.getValue()).longValue() * 1.0f;
                    float f = this$0.f23781OooO00o;
                    Float fValueOf2 = Float.valueOf(fLongValue / f);
                    MutableState mutableState2 = this$0.f23789OooOO0;
                    mutableState2.setValue(fValueOf2);
                    this$0.f23793OooOOO0.setValue(Long.valueOf(((Number) mutableState.getValue()).longValue() + this$0.OooO0O0()));
                    MutableState mutableState3 = this$0.f23791OooOO0o;
                    this$0.f23792OooOOO.setValue(Float.valueOf(((Number) mutableState2.getValue()).floatValue() + ((Number) mutableState3.getValue()).floatValue()));
                    boolean z = videoRecordEvent instanceof VideoRecordEvent.Finalize;
                    ArrayList<MediaVideoItemModel> arrayList = this$0.f23783OooO0OO;
                    if (z) {
                        File file = this$0.f23788OooO0oo;
                        String absolutePath = file != null ? file.getAbsolutePath() : null;
                        if (absolutePath == null) {
                            absolutePath = "";
                        }
                        File file2 = this$0.f23788OooO0oo;
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
                        this$0.f23790OooOO0O.setValue(Long.valueOf(mediaVideoItemModel.getDuration() + this$0.OooO0O0()));
                        mutableState3.setValue(Float.valueOf((this$0.OooO0O0() * 1.0f) / f));
                        oo0o0O0.OooO00o("_CameraVM", "recordVideo Finalize file: " + this$0.f23788OooO0oo);
                        oo0o0O0.OooO00o("_CameraVM", "preAllRecordingTimeLength: " + this$0.OooO0O0() + "     preAllRecordingPercent: " + ((Number) mutableState3.getValue()).floatValue());
                        int i = 0;
                        for (MediaVideoItemModel mediaVideoItemModel2 : arrayList) {
                            int i2 = i + 1;
                            if (i < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            oo0o0O0.OooO00o("_CameraVM", "current item: " + i + "  " + mediaVideoItemModel2);
                            i = i2;
                        }
                        Function0<Unit> function0 = this$0.f23794OooOOOO;
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
                    MutableState<CameraViewModel.VideoRecordState> mutableState4 = this$0.f23787OooO0oO;
                    if (mutableState4.getValue() != videoRecordState) {
                        if (videoRecordState == CameraViewModel.VideoRecordState.Recording) {
                            long jOooO00o = this$0.OooO00o();
                            SelectMusicModel value = musicState2.f23796OooO00o.getValue();
                            if (value != null) {
                                oo0o0O0.OooO00o("_CameraVM", "audio startPlay  allRecordingTimeInMillis " + jOooO00o);
                                if (jOooO00o == 0) {
                                    OooO0o oooO0o = o00OOO00.f47803OooO00o;
                                    o00OOO00.OooO00o(value.getFilePath(), true, Long.valueOf(value.getStartPosition()), Long.valueOf(value.getDurationMs()), null, 32);
                                } else {
                                    OooO0o oooO0o2 = o00OOO00.f47803OooO00o;
                                    OooO0o oooO0o3 = o00OOO00.f47803OooO00o;
                                    if (Intrinsics.areEqual(oooO0o3.f43020OooOO0, OooOOO.OooOO0O.f43051OooO00o) && Intrinsics.areEqual(oooO0o3.f43019OooO0oo.f43056OooO00o, value.getFilePath())) {
                                        OooO oooO = oooO0o3.f43016OooO0o;
                                        if (!oooO.isPlaying()) {
                                            oooO.OooO0Oo();
                                            oooO.o0OOO0o(true);
                                        }
                                    } else {
                                        o00OOO00.OooO00o(value.getFilePath(), true, Long.valueOf(value.getStartPosition()), Long.valueOf(value.getDurationMs()), null, 32);
                                    }
                                    oooO0o3.f43016OooO0o.Ooooo0o(5, jOooO00o);
                                }
                            }
                        } else if (videoRecordState == CameraViewModel.VideoRecordState.Pause) {
                            if (this$0.f23782OooO0O0) {
                                if (musicState2.f23796OooO00o.getValue() != null) {
                                    oo0o0O0.OooO00o("_CameraVM", "audio stop");
                                    OooO0o oooO0o4 = o00OOO00.f47803OooO00o;
                                    o00OOO00.OooO0O0();
                                }
                            } else if (musicState2.f23796OooO00o.getValue() != null) {
                                oo0o0O0.OooO00o("_CameraVM", "audio pause");
                                OooO0o oooO0o5 = o00OOO00.f47803OooO00o;
                                o00OOO00.f47803OooO00o.pause();
                            }
                        }
                    }
                    mutableState4.setValue(videoRecordState);
                }
            };
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final long OooO00o() {
            return ((Number) this.f23793OooOOO0.getValue()).longValue();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final long OooO0O0() {
            return ((Number) this.f23790OooOO0O.getValue()).longValue();
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final MutableState<SelectMusicModel> f23796OooO00o = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    public static final class OooO0OO extends Lambda implements Function0<Boolean> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            Bundle bundle = CameraViewModel.this.f23758OooO0Oo;
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
            Bundle bundle = CameraViewModel.this.f23758OooO0Oo;
            if (bundle == null) {
                Intrinsics.throwUninitializedPropertyAccessException(NativeProtocol.WEB_DIALOG_PARAMS);
                bundle = null;
            }
            return Boolean.valueOf(bundle.getBoolean("camera_take_picture"));
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<OooO0O0> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOO0 f23799OooO0Oo = new OooOO0();

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
        public static final OooOO0O f23800OooO0Oo = new OooOO0O();

        public OooOO0O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final androidx.camera.core.OooOOOO invoke() {
            androidx.camera.core.OooOOOO.OooO00o oooO00o = new androidx.camera.core.OooOOOO.OooO00o();
            androidx.camera.core.impl.OooO0o oooO0o = ImageOutputConfig.f3539OooOO0O;
            oOO00O ooo00o = oooO00o.f3472OooO00o;
            ooo00o.Oooo0oO(oooO0o, 1);
            o00O0O0O o00o0o0o2 = new o00O0O0O(o00O0O00.Oooo0O0(ooo00o));
            o000OO0O.OooO0o(o00o0o0o2);
            return new androidx.camera.core.OooOOOO(o00o0o0o2);
        }
    }

    public static final class OooOOO extends Lambda implements Function0<Long> {
        public OooOOO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            Bundle bundle = CameraViewModel.this.f23758OooO0Oo;
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
            Bundle bundle = CameraViewModel.this.f23758OooO0Oo;
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
            return new OooO00o(((Number) cameraViewModel.f23767OooOOO0.getValue()).longValue(), cameraViewModel.OooO0o());
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v2 com.yalla.yalla.module.media.camera.CameraViewModel$VideoRecordState[], still in use, count: 1, list:
      (r7v2 com.yalla.yalla.module.media.camera.CameraViewModel$VideoRecordState[]) from 0x0035: INVOKE (r7v2 com.yalla.yalla.module.media.camera.CameraViewModel$VideoRecordState[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:54)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yalla/yalla/module/media/camera/CameraViewModel$VideoRecordState;", "", "IDLE", "Recording", "Pause", "Complete", "Media_YallaRelease"}, k = 1, mv = {1, 9, 0})
    public static final class VideoRecordState {
        IDLE,
        Recording,
        Pause,
        Complete;

        private static final /* synthetic */ EnumEntries $ENTRIES;

        static {
            $ENTRIES = EnumEntriesKt.enumEntries(videoRecordStateArr);
        }

        public VideoRecordState() {
            super(str, i);
        }

        public static VideoRecordState valueOf(String str) {
            return (VideoRecordState) Enum.valueOf(VideoRecordState.class, str);
        }

        public static VideoRecordState[] values() {
            return (VideoRecordState[]) $VALUES.clone();
        }
    }

    public CameraViewModel() {
        Boolean bool = Boolean.FALSE;
        this.f23759OooO0o = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.f23761OooO0oO = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.f23762OooO0oo = LazyKt.lazy(new OooO0o());
        this.f23754OooO = LazyKt.lazy(new OooO0OO());
        this.f23763OooOO0 = LazyKt.lazy(new OooO());
        Boolean bool2 = Boolean.TRUE;
        this.f23764OooOO0O = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool2, null, 2, null);
        this.f23765OooOO0o = LazyKt.lazy(new OooOOO());
        this.f23767OooOOO0 = LazyKt.lazy(new OooOOO0());
        this.f23766OooOOO = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.f23768OooOOOO = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool2, null, 2, null);
        this.f23772OooOOoo = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        o0oOO o0ooo2 = o0oOO.f47775OooO0O0;
        o0ooo2.getClass();
        Intrinsics.checkNotNullParameter("flashMode", "key");
        this.f23774OooOo0 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(o0ooo2.f47774OooO00o.getInt("flashMode", 2)), null, 2, null);
        this.f23776OooOo0O = new ArrayList();
        this.f23777OooOo0o = LazyKt.lazy(OooOO0O.f23800OooO0Oo);
        this.f23773OooOo = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(o0ooo2.OooO00o("pauseRecordingVideo", true)), null, 2, null);
        this.f23778OooOoO0 = LazyKt.lazy(new OooOOOO());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean OooO() {
        return ((Boolean) this.f23768OooOOOO.getValue()).booleanValue();
    }

    public final void OooO0O0() {
        Object objM4215constructorimpl;
        CameraControl cameraControlOooO0OO;
        CameraControl cameraControlOooO0OO2;
        oo0o0O0.OooO00o("_CameraVM", "checkTorch");
        try {
            Result.Companion companion = Result.INSTANCE;
            com.google.common.util.concurrent.OooOO0O<Void> oooOO0OOooO0o0 = null;
            if (OooO() || OooO0o0() != 1 || OooO0oO()) {
                oo0o0O0.OooO00o("_CameraVM", "checkTorch disable");
                o000O0Oo o000o0oo2 = this.f23771OooOOo0;
                if (o000o0oo2 != null && (cameraControlOooO0OO = o000o0oo2.OooO0OO()) != null) {
                    oooOO0OOooO0o0 = cameraControlOooO0OO.OooO0o0(false);
                }
            } else {
                oo0o0O0.OooO00o("_CameraVM", "checkTorch enable");
                o000O0Oo o000o0oo3 = this.f23771OooOOo0;
                if (o000o0oo3 != null && (cameraControlOooO0OO2 = o000o0oo3.OooO0OO()) != null) {
                    oooOO0OOooO0o0 = cameraControlOooO0OO2.OooO0o0(true);
                }
            }
            objM4215constructorimpl = Result.m4215constructorimpl(oooOO0OOooO0o0);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM4215constructorimpl = Result.m4215constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m4218exceptionOrNullimpl(objM4215constructorimpl) != null) {
            oo0o0O0.OooO00o("_CameraVM", "checkTorch error");
        }
    }

    public final boolean OooO0OO() {
        return ((Boolean) this.f23754OooO.getValue()).booleanValue();
    }

    public final boolean OooO0Oo() {
        return ((Boolean) this.f23762OooO0oo.getValue()).booleanValue();
    }

    @NotNull
    public final OooO0O0 OooO0o() {
        return (OooO0O0) this.f23757OooO0OO.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int OooO0o0() {
        return ((Number) this.f23774OooOo0.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean OooO0oO() {
        return ((Boolean) this.f23764OooOO0O.getValue()).booleanValue();
    }

    @NotNull
    public final OooO00o OooO0oo() {
        return (OooO00o) this.f23778OooOoO0.getValue();
    }
}
