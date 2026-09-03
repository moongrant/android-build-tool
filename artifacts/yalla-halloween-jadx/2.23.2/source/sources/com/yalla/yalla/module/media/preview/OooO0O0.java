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
import p022Oooo00O.o0O00oO0;
import p456o0Ooo00o.o00oO0o;
import p460o0Ooo0o.o00OOO0O;
import p460o0Ooo0o.oo0o0O0;
import p476o0OooooO.o0OOo000;
import p550o0oOOO0o.o00O0;
import p550o0oOOO0o.o00O00OO;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMediaVideoRangeChoose.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaVideoRangeChoose.kt\ncom/yalla/yalla/module/media/preview/MediaVideoRangeChooseKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,167:1\n72#2,6:168\n78#2:202\n82#2:229\n78#3,11:174\n91#3:228\n456#4,8:185\n464#4,3:199\n25#4:203\n25#4:210\n25#4:217\n467#4,3:225\n4144#5,6:193\n1097#6,6:204\n1097#6,6:211\n1097#6,6:218\n154#7:224\n154#7:239\n81#8:230\n107#8,2:231\n81#8:233\n107#8,2:234\n81#8:236\n107#8,2:237\n*S KotlinDebug\n*F\n+ 1 MediaVideoRangeChoose.kt\ncom/yalla/yalla/module/media/preview/MediaVideoRangeChooseKt\n*L\n30#1:168,6\n30#1:202\n30#1:229\n30#1:174,11\n30#1:228\n30#1:185,8\n30#1:199,3\n35#1:203\n37#1:210\n39#1:217\n30#1:225,3\n30#1:193,6\n35#1:204,6\n37#1:211,6\n39#1:218,6\n47#1:224\n167#1:239\n35#1:230\n35#1:231,2\n37#1:233\n37#1:234,2\n39#1:236\n39#1:237,2\n*E\n"})
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final float f24150OooO00o = Dp.m3775constructorimpl(Constants.ERR_ENCRYPTED_STREAM_NOT_ALLOWED_PUBLISHED);

    public static final class OooO00o extends Lambda implements Function1<Context, VideoTimelinePlayView> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o00O00OO f24151OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f24152OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Long> f24153OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableState<Float> f24154OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o00O00OO o00o00oo2, MutableState<Long> mutableState, MutableState<Boolean> mutableState2, MutableState<Float> mutableState3) {
            super(1);
            this.f24151OooO0Oo = o00o00oo2;
            this.f24153OooO0o0 = mutableState;
            this.f24152OooO0o = mutableState2;
            this.f24154OooO0oO = mutableState3;
        }

        public static final void OooO00o(MutableState mutableState, MutableState mutableState2, o00O00OO o00o00oo2, VideoTimelinePlayView videoTimelinePlayView) {
            float f24172OooO0oo = videoTimelinePlayView.getF24172OooO0oo() - videoTimelinePlayView.getLeftProgress();
            float f = OooO0O0.f24150OooO00o;
            mutableState.setValue(Float.valueOf(f24172OooO0oo));
            o00o00oo2.OooO0o().f55994OooO0OO.setValue((long) (videoTimelinePlayView.getLeftProgress() * OooO0O0.OooO0O0(mutableState2)));
            o00o00oo2.OooO0o().f55995OooO0Oo.setValue((long) (videoTimelinePlayView.getF24172OooO0oo() * OooO0O0.OooO0O0(mutableState2)));
            videoTimelinePlayView.setShowProgress(true);
        }

        @Override // kotlin.jvm.functions.Function1
        public final VideoTimelinePlayView invoke(Context context) {
            float videoPlayRangeEnd;
            float videoPlayRangeStart;
            Context it = context;
            Intrinsics.checkNotNullParameter(it, "it");
            VideoTimelinePlayView videoTimelinePlayView = new VideoTimelinePlayView(it, null, 6, 0);
            o00O00OO o00o00oo2 = this.f24151OooO0Oo;
            MutableState<Long> mutableState = this.f24153OooO0o0;
            MutableState<Boolean> mutableState2 = this.f24152OooO0o;
            MutableState<Float> mutableState3 = this.f24154OooO0oO;
            mutableState.setValue(Long.valueOf(o00o00oo2.OooO0Oo().getVideoDuration()));
            oo0o0O0.OooO00o("_RangeChooseView", "videoDuration:" + OooO0O0.OooO0O0(mutableState));
            float fOooO0O0 = ((float) o00o00oo2.OooO0o().f55993OooO0O0) / ((float) OooO0O0.OooO0O0(mutableState));
            if (fOooO0O0 > 1.0f) {
                fOooO0O0 = 1.0f;
            }
            videoTimelinePlayView.setMinProgressDiff(o00o00oo2.OooO0o().f55992OooO00o / OooO0O0.OooO0O0(mutableState));
            videoTimelinePlayView.setMaxProgressDiff(fOooO0O0);
            MediaVideoInfo videoInfo = o00o00oo2.OooO0Oo().getVideoInfo();
            if (videoInfo == null || videoInfo.getVideoPlayRangeEnd() <= 0 || videoInfo.getVideoPlayRangeEnd() - videoInfo.getVideoPlayRangeStart() < o00o00oo2.OooO0o().f55992OooO00o) {
                videoPlayRangeEnd = fOooO0O0;
                videoPlayRangeStart = 0.0f;
            } else {
                videoPlayRangeStart = videoInfo.getVideoPlayRangeStart() / OooO0O0.OooO0O0(mutableState);
                videoPlayRangeEnd = videoInfo.getVideoPlayRangeEnd() / OooO0O0.OooO0O0(mutableState);
            }
            videoTimelinePlayView.setDelegate(new com.yalla.yalla.module.media.preview.OooO00o(mutableState2, o00o00oo2, videoTimelinePlayView, mutableState3, mutableState));
            Uri uri = o00o00oo2.OooO0Oo().getUri();
            videoTimelinePlayView.f24208OoooO00.set(false);
            synchronized (VideoTimelinePlayView.f24166Ooooo00) {
                MediaMetadataRetriever mediaMetadataRetriever = videoTimelinePlayView.f24179OooOOOo;
                videoTimelinePlayView.f24179OooOOOo = null;
                o00OOO0O.OooO00o(new o00O0(mediaMetadataRetriever, null));
            }
            int size = videoTimelinePlayView.f24180OooOOo.size();
            for (int i = 0; i < size; i++) {
                VideoTimelinePlayView.OooO00o oooO00o = videoTimelinePlayView.f24180OooOOo.get(i);
                Intrinsics.checkNotNullExpressionValue(oooO00o, "get(...)");
                Bitmap bitmap = oooO00o.f24217OooO00o;
                if (bitmap != null) {
                    bitmap.recycle();
                }
            }
            videoTimelinePlayView.f24180OooOOo.clear();
            VideoTimelinePlayView.OooO0o oooO0o = videoTimelinePlayView.f24182OooOOoo;
            if (oooO0o != null) {
                Intrinsics.checkNotNull(oooO0o);
                oooO0o.cancel(true);
                videoTimelinePlayView.f24182OooOOoo = null;
            }
            videoTimelinePlayView.leftProgress = videoPlayRangeStart;
            videoTimelinePlayView.f24172OooO0oo = videoPlayRangeEnd;
            Job job = videoTimelinePlayView.f24195Oooo;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            videoTimelinePlayView.f24195Oooo = o00OOO0O.OooO00o(new com.yalla.yalla.module.media.preview.OooO0OO(videoTimelinePlayView, uri, null));
            OooO00o(mutableState3, mutableState, o00o00oo2, videoTimelinePlayView);
            return videoTimelinePlayView;
        }
    }

    /* JADX INFO: renamed from: com.yalla.yalla.module.media.preview.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public static final class C0306OooO0O0 extends Lambda implements Function1<VideoTimelinePlayView, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o00O00OO f24155OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0306OooO0O0(o00O00OO o00o00oo2) {
            super(1);
            this.f24155OooO0Oo = o00o00oo2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(VideoTimelinePlayView videoTimelinePlayView) {
            VideoTimelinePlayView it = videoTimelinePlayView;
            Intrinsics.checkNotNullParameter(it, "it");
            it.setProgress((this.f24155OooO0Oo.f55979OooOO0O.getFloatValue() * (it.getF24172OooO0oo() - it.getLeftProgress())) + it.getLeftProgress());
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o00O00OO f24156OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f24157OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(o00O00OO o00o00oo2, int i) {
            super(2);
            this.f24156OooO0Oo = o00o00oo2;
            this.f24157OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f24157OooO0o0 | 1);
            OooO0O0.OooO00o(this.f24156OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@NotNull o00O00OO previewViewModel, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(previewViewModel, "previewViewModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(913655865);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(913655865, i, -1, "com.yalla.yalla.module.media.preview.MediaVideoRangeChoose (MediaVideoRangeChoose.kt:28)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierM511height3ABfNKs = SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), f24150OooO00o);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyOooO0O0 = o0O00oO0.OooO0O0(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM511height3ABfNKs);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1320constructorimpl, measurePolicyOooO0O0, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
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
        String strOooO00o = o0000O.OooO00o(StringResources_androidKt.stringResource(o00oO0o.seconds_selected, composerStartRestartGroup, 0), String.valueOf(MathKt.roundToInt((((Number) mutableState2.getValue()).floatValue() * OooO0O0(mutableState)) / 1000.0f)));
        long sp = TextUnitKt.getSp(10);
        int i2 = o0OOo000.f48347o00OOooO;
        TextKt.m1261Text4IGK_g(strOooO00o, PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(27), Dp.m3775constructorimpl(15), 0.0f, Dp.m3775constructorimpl(7), 4, null), o0OOo000.f48148OooOOOo, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 131056);
        AndroidView_androidKt.AndroidView(new OooO00o(previewViewModel, mutableState, mutableState3, mutableState2), SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), new C0306OooO0O0(previewViewModel), composerStartRestartGroup, 48, 0);
        if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
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
