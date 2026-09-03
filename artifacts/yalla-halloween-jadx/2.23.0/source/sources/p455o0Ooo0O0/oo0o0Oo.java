package p455o0Ooo0O0;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotLongStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import com.yalla.yalla.model.media.MediaModel;
import com.yalla.yalla.model.media.MediaVideoInfo;
import com.yalla.yalla.model.media.SelectMusicFrom;
import com.yalla.yalla.model.media.SelectMusicModel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import o0OOo000.OooOOO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0oO.o00O0000;
import p468o0OoooO0.o0OO0O0;
import p468o0OoooO0.o0OOo000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nMediaPreviewViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaPreviewViewModel.kt\ncom/yalla/yalla/module/media/preview/MediaPreviewViewModel\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 4 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 5 SnapshotLongState.kt\nandroidx/compose/runtime/SnapshotLongStateKt__SnapshotLongStateKt\n*L\n1#1,388:1\n81#2:389\n107#2,2:390\n81#2:392\n107#2,2:393\n75#3:395\n108#3,2:396\n75#3:398\n108#3,2:399\n75#4:401\n108#4,2:402\n76#5:404\n109#5,2:405\n*S KotlinDebug\n*F\n+ 1 MediaPreviewViewModel.kt\ncom/yalla/yalla/module/media/preview/MediaPreviewViewModel\n*L\n30#1:389\n30#1:390,2\n35#1:392\n35#1:393,2\n59#1:395\n59#1:396,2\n62#1:398\n62#1:399,2\n67#1:401\n67#1:402,2\n92#1:404\n92#1:405,2\n*E\n"})
public final class oo0o0Oo extends ViewModel {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final MutableIntState f46598OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public MediaModel f46599OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final MutableState f46600OooO0O0 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final MutableState f46601OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final MutableState<Boolean> f46602OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final MutableState<SelectMusicModel> f46603OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final MutableState<Boolean> f46604OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final MutableState<SelectMusicFrom> f46605OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public long f46606OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final MutableIntState f46607OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final MutableFloatState f46608OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final Lazy f46609OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public final Lazy f46610OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final Lazy f46611OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f46612OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NotNull
    public final MutableState<Boolean> f46613OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public long f46614OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public final MutableLongState f46615OooOOo0;

    @StabilityInferred(parameters = 0)
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final MutableState<Float> f46616OooO00o = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final MutableState<Float> f46617OooO0O0 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    public static final class OooO0O0 extends Lambda implements Function0<o0OoOo0> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f46618OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0OoOo0 invoke() {
            return new o0OoOo0();
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<o0O0O00> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f46619OooO0Oo = new OooO0OO();

        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0O0O00 invoke() {
            return new o0O0O00();
        }
    }

    public static final class OooO0o extends Lambda implements Function0<OooO00o> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0o f46620OooO0Oo = new OooO0o();

        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final OooO00o invoke() {
            return new OooO00o();
        }
    }

    public oo0o0Oo() {
        Boolean bool = Boolean.FALSE;
        this.f46601OooO0OO = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.f46602OooO0Oo = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        this.f46604OooO0o0 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.f46603OooO0o = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.f46605OooO0oO = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.f46606OooO0oo = -1L;
        this.f46598OooO = SnapshotIntStateKt.mutableIntStateOf(100);
        this.f46607OooOO0 = SnapshotIntStateKt.mutableIntStateOf(100);
        this.f46608OooOO0O = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.f46609OooOO0o = LazyKt.lazy(OooO0o.f46620OooO0Oo);
        this.f46611OooOOO0 = LazyKt.lazy(OooO0OO.f46619OooO0Oo);
        this.f46610OooOOO = LazyKt.lazy(OooO0O0.f46618OooO0Oo);
        this.f46612OooOOOO = true;
        this.f46613OooOOOo = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.f46615OooOOo0 = SnapshotLongStateKt.mutableLongStateOf(0L);
    }

    public final void OooO(boolean z) {
        long durationMs;
        long videoPlayRangeEnd;
        long videoPlayRangeStart;
        float fFloatValue;
        Function0<Unit> value;
        SelectMusicModel value2 = this.f46603OooO0o.getValue();
        if (value2 == null || OooO0Oo().getVideoInfo() == null) {
            return;
        }
        o0OO0O0.OooO00o("_PreviewVM", "playBackgroundMusic");
        long longValue = OooO0OO().f46589OooO00o.getValue().booleanValue() ? OooO0OO().f46590OooO0O0.getLongValue() : value2.getStartPosition();
        if (!this.f46613OooOOOo.getValue().booleanValue()) {
            MediaVideoInfo videoInfo = OooO0Oo().getVideoInfo();
            Intrinsics.checkNotNull(videoInfo);
            long videoPlayRangeEnd2 = videoInfo.getVideoPlayRangeEnd();
            MediaVideoInfo videoInfo2 = OooO0Oo().getVideoInfo();
            Intrinsics.checkNotNull(videoInfo2);
            if (videoPlayRangeEnd2 - videoInfo2.getVideoPlayRangeStart() <= value2.getDurationMs() - longValue) {
                MediaVideoInfo videoInfo3 = OooO0Oo().getVideoInfo();
                Intrinsics.checkNotNull(videoInfo3);
                videoPlayRangeEnd = videoInfo3.getVideoPlayRangeEnd() + longValue;
                MediaVideoInfo videoInfo4 = OooO0Oo().getVideoInfo();
                Intrinsics.checkNotNull(videoInfo4);
                videoPlayRangeStart = videoInfo4.getVideoPlayRangeStart();
                durationMs = videoPlayRangeEnd - videoPlayRangeStart;
            } else {
                durationMs = value2.getDurationMs();
            }
        } else if (OooO0o().f46575OooO0Oo.getLongValue() - OooO0o().f46574OooO0OO.getLongValue() <= value2.getDurationMs() - longValue) {
            videoPlayRangeEnd = OooO0o().f46575OooO0Oo.getLongValue() + longValue;
            videoPlayRangeStart = OooO0o().f46574OooO0OO.getLongValue();
            durationMs = videoPlayRangeEnd - videoPlayRangeStart;
        } else {
            durationMs = value2.getDurationMs();
        }
        this.f46606OooO0oo = durationMs;
        if (OooO0OO().f46589OooO00o.getValue().booleanValue()) {
            fFloatValue = 100.0f;
        } else {
            Float value3 = OooO0oo().f46617OooO0O0.getValue();
            fFloatValue = value3 != null ? value3.floatValue() : OooO0O0();
        }
        String filePath = value2.getFilePath();
        long j = this.f46606OooO0oo;
        long startPosition = j - value2.getStartPosition();
        StringBuilder sb = new StringBuilder("playBackgroundMusic  path: ");
        sb.append(filePath);
        sb.append("    voiceLevel: ");
        sb.append(fFloatValue);
        sb.append("   startPositionMs:");
        sb.append(longValue);
        o000Oo0.OooO0O0.OooO00o(sb, "  endPositionMs:", j, "  duration:");
        sb.append(startPosition);
        o0OO0O0.OooO00o("_PreviewVM", sb.toString());
        o0OOo000.OooO0O0 oooO0O0 = o0OOo000.f46938OooO00o;
        o0OOo000.OooO0O0 oooO0O1 = o0OOo000.f46938OooO00o;
        oooO0O1.OooO0oO(fFloatValue / 100.0f);
        o0OOo000.OooO00o(value2.getFilePath(), false, Long.valueOf(longValue), Long.valueOf(this.f46606OooO0oo), null, 32);
        if (OooO0OO().f46589OooO00o.getValue().booleanValue() && (value = OooO0OO().f46591OooO0OO.getValue()) != null) {
            value.invoke();
        }
        if (z) {
            oooO0O1.f43841OooO0o.o00Ooo(5, 0L);
        } else {
            oooO0O1.f43841OooO0o.o00Ooo(5, this.f46615OooOOo0.getLongValue());
        }
    }

    public final int OooO0O0() {
        return this.f46607OooOO0.getIntValue();
    }

    @NotNull
    public final o0OoOo0 OooO0OO() {
        return (o0OoOo0) this.f46610OooOOO.getValue();
    }

    @NotNull
    public final MediaModel OooO0Oo() {
        MediaModel mediaModel = this.f46599OooO00o;
        if (mediaModel != null) {
            return mediaModel;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mediaModel");
        return null;
    }

    @NotNull
    public final o0O0O00 OooO0o() {
        return (o0O0O00) this.f46611OooOOO0.getValue();
    }

    @Nullable
    public final o0OOo000.OooO0OO OooO0o0() {
        return (o0OOo000.OooO0OO) this.f46600OooO0O0.getValue();
    }

    public final int OooO0oO() {
        return this.f46598OooO.getIntValue();
    }

    @NotNull
    public final OooO00o OooO0oo() {
        return (OooO00o) this.f46609OooOO0o.getValue();
    }

    public final void OooOO0() {
        long videoPlayRangeStart;
        long videoPlayRangeEnd;
        if (OooO0o0() == null || OooO0Oo().getVideoInfo() == null) {
            return;
        }
        MediaVideoInfo videoInfo = OooO0Oo().getVideoInfo();
        Intrinsics.checkNotNull(videoInfo);
        long videoPlayRangeStart2 = videoInfo.getVideoPlayRangeStart();
        MediaVideoInfo videoInfo2 = OooO0Oo().getVideoInfo();
        Intrinsics.checkNotNull(videoInfo2);
        long videoPlayRangeEnd2 = videoInfo2.getVideoPlayRangeEnd();
        StringBuilder sbOooO00o = o00O0000.OooO00o("playVideo  start: ", videoPlayRangeStart2, "     end: ");
        sbOooO00o.append(videoPlayRangeEnd2);
        o0OO0O0.OooO00o("_PreviewVM", sbOooO00o.toString());
        if (this.f46613OooOOOo.getValue().booleanValue()) {
            videoPlayRangeStart = OooO0o().f46574OooO0OO.getLongValue();
            videoPlayRangeEnd = OooO0o().f46575OooO0Oo.getLongValue();
        } else {
            MediaVideoInfo videoInfo3 = OooO0Oo().getVideoInfo();
            Intrinsics.checkNotNull(videoInfo3);
            if (videoInfo3.getVideoPlayRangeStart() == 0) {
                MediaVideoInfo videoInfo4 = OooO0Oo().getVideoInfo();
                Intrinsics.checkNotNull(videoInfo4);
                if (videoInfo4.getVideoPlayRangeEnd() == 0) {
                    return;
                }
            }
            MediaVideoInfo videoInfo5 = OooO0Oo().getVideoInfo();
            Intrinsics.checkNotNull(videoInfo5);
            long videoPlayRangeStart3 = videoInfo5.getVideoPlayRangeStart();
            MediaVideoInfo videoInfo6 = OooO0Oo().getVideoInfo();
            Intrinsics.checkNotNull(videoInfo6);
            if (videoPlayRangeStart3 >= videoInfo6.getVideoPlayRangeEnd()) {
                return;
            }
            MediaVideoInfo videoInfo7 = OooO0Oo().getVideoInfo();
            Intrinsics.checkNotNull(videoInfo7);
            videoPlayRangeStart = videoInfo7.getVideoPlayRangeStart();
            MediaVideoInfo videoInfo8 = OooO0Oo().getVideoInfo();
            Intrinsics.checkNotNull(videoInfo8);
            videoPlayRangeEnd = videoInfo8.getVideoPlayRangeEnd();
        }
        long j = videoPlayRangeStart;
        long j2 = videoPlayRangeEnd;
        if (!(j == 0 && j2 == 0) && j < j2) {
            String string = OooO0Oo().getUri().toString();
            Intrinsics.checkNotNullExpressionValue(string, "mediaModel.uri.toString()");
            o0OOo000.OooO0OO oooO0OOOooO0o0 = OooO0o0();
            if (oooO0OOOooO0o0 != null) {
                oooO0OOOooO0o0.OooO0O0(new OooOOO(string, true, j, j2, 4));
                oooO0OOOooO0o0.OooO(string);
                oooO0OOOooO0o0.OooO0oO(OooO0oO() / 100.0f);
                oooO0OOOooO0o0.OooO00o(string);
            }
        }
    }

    public final void OooOO0O() {
        o0OOo000.OooO0OO oooO0OOOooO0o0 = OooO0o0();
        if (oooO0OOOooO0o0 != null) {
            oooO0OOOooO0o0.OooO0oO(OooO0oO() / 100.0f);
        }
        o0OOo000.OooO0O0 oooO0O0 = o0OOo000.f46938OooO00o;
        o0OOo000.f46938OooO00o.OooO0oO(OooO0O0() / 100.0f);
    }
}
