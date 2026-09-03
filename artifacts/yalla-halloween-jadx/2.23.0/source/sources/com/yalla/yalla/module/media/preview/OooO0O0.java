package com.yalla.yalla.module.media.preview;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import com.code.android.util.o0000O;
import com.yalla.yalla.model.media.MediaVideoInfo;
import io.agora.rtc.Constants;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p455o0Ooo0O0.o000000;
import p455o0Ooo0O0.oo0o0Oo;
import p468o0OoooO0.o0OO0O0;
import p468o0OoooO0.oO0Oo;
import p469o0OoooOO.o0oO0O0o;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMediaVideoRangeChoose.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaVideoRangeChoose.kt\ncom/yalla/yalla/module/media/preview/MediaVideoRangeChooseKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,167:1\n72#2,6:168\n78#2:202\n82#2:229\n78#3,11:174\n91#3:228\n456#4,8:185\n464#4,3:199\n25#4:203\n25#4:210\n25#4:217\n467#4,3:225\n4144#5,6:193\n1097#6,6:204\n1097#6,6:211\n1097#6,6:218\n154#7:224\n154#7:239\n81#8:230\n107#8,2:231\n81#8:233\n107#8,2:234\n81#8:236\n107#8,2:237\n*S KotlinDebug\n*F\n+ 1 MediaVideoRangeChoose.kt\ncom/yalla/yalla/module/media/preview/MediaVideoRangeChooseKt\n*L\n30#1:168,6\n30#1:202\n30#1:229\n30#1:174,11\n30#1:228\n30#1:185,8\n30#1:199,3\n35#1:203\n37#1:210\n39#1:217\n30#1:225,3\n30#1:193,6\n35#1:204,6\n37#1:211,6\n39#1:218,6\n47#1:224\n167#1:239\n35#1:230\n35#1:231,2\n37#1:233\n37#1:234,2\n39#1:236\n39#1:237,2\n*E\n"})
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final float f24612OooO00o = Dp.m3765constructorimpl(Constants.ERR_ENCRYPTED_STREAM_NOT_ALLOWED_PUBLISHED);

    public static final class OooO00o extends Lambda implements Function1<Context, VideoTimelinePlayView> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ oo0o0Oo f24613OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f24614OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Long> f24615OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableState<Float> f24616OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(oo0o0Oo oo0o0oo, MutableState<Long> mutableState, MutableState<Boolean> mutableState2, MutableState<Float> mutableState3) {
            super(1);
            this.f24613OooO0Oo = oo0o0oo;
            this.f24615OooO0o0 = mutableState;
            this.f24614OooO0o = mutableState2;
            this.f24616OooO0oO = mutableState3;
        }

        public static final void OooO00o(MutableState mutableState, MutableState mutableState2, oo0o0Oo oo0o0oo, VideoTimelinePlayView videoTimelinePlayView) {
            float f24634OooO0oo = videoTimelinePlayView.getF24634OooO0oo() - videoTimelinePlayView.getLeftProgress();
            float f = OooO0O0.f24612OooO00o;
            mutableState.setValue(Float.valueOf(f24634OooO0oo));
            oo0o0oo.OooO0o().f46574OooO0OO.setValue((long) (videoTimelinePlayView.getLeftProgress() * OooO0O0.OooO0O0(mutableState2)));
            oo0o0oo.OooO0o().f46575OooO0Oo.setValue((long) (videoTimelinePlayView.getF24634OooO0oo() * OooO0O0.OooO0O0(mutableState2)));
            videoTimelinePlayView.setShowProgress(true);
        }

        @Override // kotlin.jvm.functions.Function1
        public final VideoTimelinePlayView invoke(Context context) {
            float videoPlayRangeEnd;
            float videoPlayRangeStart;
            Context it = context;
            Intrinsics.checkNotNullParameter(it, "it");
            VideoTimelinePlayView videoTimelinePlayView = new VideoTimelinePlayView(it, null, 6, 0);
            oo0o0Oo oo0o0oo = this.f24613OooO0Oo;
            MutableState<Long> mutableState = this.f24615OooO0o0;
            MutableState<Boolean> mutableState2 = this.f24614OooO0o;
            MutableState<Float> mutableState3 = this.f24616OooO0oO;
            mutableState.setValue(Long.valueOf(oo0o0oo.OooO0Oo().getVideoDuration()));
            o0OO0O0.OooO00o("_RangeChooseView", "videoDuration:" + OooO0O0.OooO0O0(mutableState));
            float fOooO0O0 = ((float) oo0o0oo.OooO0o().f46573OooO0O0) / ((float) OooO0O0.OooO0O0(mutableState));
            if (fOooO0O0 > 1.0f) {
                fOooO0O0 = 1.0f;
            }
            videoTimelinePlayView.setMinProgressDiff(oo0o0oo.OooO0o().f46572OooO00o / OooO0O0.OooO0O0(mutableState));
            videoTimelinePlayView.setMaxProgressDiff(fOooO0O0);
            MediaVideoInfo videoInfo = oo0o0oo.OooO0Oo().getVideoInfo();
            if (videoInfo == null || videoInfo.getVideoPlayRangeEnd() <= 0 || videoInfo.getVideoPlayRangeEnd() - videoInfo.getVideoPlayRangeStart() < oo0o0oo.OooO0o().f46572OooO00o) {
                videoPlayRangeEnd = fOooO0O0;
                videoPlayRangeStart = 0.0f;
            } else {
                videoPlayRangeStart = videoInfo.getVideoPlayRangeStart() / OooO0O0.OooO0O0(mutableState);
                videoPlayRangeEnd = videoInfo.getVideoPlayRangeEnd() / OooO0O0.OooO0O0(mutableState);
            }
            videoTimelinePlayView.setDelegate(new com.yalla.yalla.module.media.preview.OooO00o(mutableState2, oo0o0oo, videoTimelinePlayView, mutableState3, mutableState));
            Uri uri = oo0o0oo.OooO0Oo().getUri();
            videoTimelinePlayView.f24670OoooO00.set(false);
            synchronized (VideoTimelinePlayView.f24628Ooooo00) {
                MediaMetadataRetriever mediaMetadataRetriever = videoTimelinePlayView.f24641OooOOOo;
                videoTimelinePlayView.f24641OooOOOo = null;
                oO0Oo.OooO00o(new o000000(mediaMetadataRetriever, null));
            }
            int size = videoTimelinePlayView.f24642OooOOo.size();
            for (int i = 0; i < size; i++) {
                VideoTimelinePlayView.OooO00o oooO00o = videoTimelinePlayView.f24642OooOOo.get(i);
                Intrinsics.checkNotNullExpressionValue(oooO00o, "mFramesList[a]");
                Bitmap bitmap = oooO00o.f24679OooO00o;
                if (bitmap != null) {
                    bitmap.recycle();
                }
            }
            videoTimelinePlayView.f24642OooOOo.clear();
            VideoTimelinePlayView.OooO0o oooO0o = videoTimelinePlayView.f24644OooOOoo;
            if (oooO0o != null) {
                Intrinsics.checkNotNull(oooO0o);
                oooO0o.cancel(true);
                videoTimelinePlayView.f24644OooOOoo = null;
            }
            videoTimelinePlayView.leftProgress = videoPlayRangeStart;
            videoTimelinePlayView.f24634OooO0oo = videoPlayRangeEnd;
            Job job = videoTimelinePlayView.f24657Oooo;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            videoTimelinePlayView.f24657Oooo = oO0Oo.OooO00o(new com.yalla.yalla.module.media.preview.OooO0OO(videoTimelinePlayView, uri, null));
            OooO00o(mutableState3, mutableState, oo0o0oo, videoTimelinePlayView);
            return videoTimelinePlayView;
        }
    }

    /* JADX INFO: renamed from: com.yalla.yalla.module.media.preview.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public static final class C0307OooO0O0 extends Lambda implements Function1<VideoTimelinePlayView, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ oo0o0Oo f24617OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0307OooO0O0(oo0o0Oo oo0o0oo) {
            super(1);
            this.f24617OooO0Oo = oo0o0oo;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(VideoTimelinePlayView videoTimelinePlayView) {
            VideoTimelinePlayView it = videoTimelinePlayView;
            Intrinsics.checkNotNullParameter(it, "it");
            it.setProgress((this.f24617OooO0Oo.f46608OooOO0O.getFloatValue() * (it.getF24634OooO0oo() - it.getLeftProgress())) + it.getLeftProgress());
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ oo0o0Oo f24618OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f24619OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(oo0o0Oo oo0o0oo, int i) {
            super(2);
            this.f24618OooO0Oo = oo0o0oo;
            this.f24619OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f24619OooO0o0 | 1);
            OooO0O0.OooO00o(this.f24618OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@NotNull oo0o0Oo previewViewModel, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(previewViewModel, "previewViewModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(913655865);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(913655865, i, -1, "com.yalla.yalla.module.media.preview.MediaVideoRangeChoose (MediaVideoRangeChoose.kt:26)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierM509height3ABfNKs = SizeKt.m509height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), f24612OooO00o);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO0o.OooO00o(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM509height3ABfNKs);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion3 = Composer.INSTANCE;
        if (objRememberedValue == companion3.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue;
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue2 == companion3.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState2 = (MutableState) objRememberedValue2;
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue3 == companion3.getEmpty()) {
            objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState3 = (MutableState) objRememberedValue3;
        String strOooO00o = o0000O.OooO00o(StringResources_androidKt.stringResource(p450o0Ooo00.OooO.seconds_selected, composerStartRestartGroup, 0), String.valueOf(MathKt.roundToInt((((Number) mutableState2.getValue()).floatValue() * OooO0O0(mutableState)) / 1000.0f)));
        long sp = TextUnitKt.getSp(10);
        int i2 = o0oO0O0o.f47152o00OOOo;
        TextKt.m1251Text4IGK_g(strOooO00o, PaddingKt.m480paddingqDBjuR0$default(companion, Dp.m3765constructorimpl(27), Dp.m3765constructorimpl(15), 0.0f, Dp.m3765constructorimpl(7), 4, null), o0oO0O0o.f46959OooOOOo, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 131056);
        AndroidView_androidKt.AndroidView(new OooO00o(previewViewModel, mutableState, mutableState3, mutableState2), SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), new C0307OooO0O0(previewViewModel), composerStartRestartGroup, 48, 0);
        if (androidx.compose.material.OooOO0.OooO0O0(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(previewViewModel, i));
    }

    public static final long OooO0O0(MutableState<Long> mutableState) {
        return mutableState.getValue().longValue();
    }
}
