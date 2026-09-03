package com.yalla.yalla.module.media.preview;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.animation.OooOOOO;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavBackStackEntry;
import com.code.android.util.OooOOO;
import com.code.android.util.o000O0;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.yalla.yalla.manager.RoomState;
import com.yalla.yalla.model.media.MediaModel;
import com.yalla.yalla.model.media.MediaVideoInfo;
import com.yalla.yalla.model.media.SelectMusicFrom;
import com.yalla.yalla.model.media.SelectMusicModel;
import com.yalla.yalla.model.media.SelectMusicModelWrapper;
import com.yalla.yalla.module.media.music.MusicScreen;
import com.yalla.yalla.util.permission.PermissionGroupReveal;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149o00Oo0o0.o00000O;
import p427o0OoOO00.o0OOO0o;
import p455o0Ooo0O0.o00Oo0;
import p455o0Ooo0O0.oo0o0Oo;
import p468o0OoooO0.o0OO0O0;
import p468o0OoooO0.o0OOo000;
import p468o0OoooO0.o0o0000;
import p526o0o0OOO0.o00O;
import p526o0o0OOO0.o00O00O;
import p526o0o0OOO0.oo0oOO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J.\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bJ\u0013\u0010\u000f\u001a\u00020\u0004*\u00020\u000eH\u0017¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/yalla/yalla/module/media/preview/YLMediaPreViewScreen;", "Lo0o0OOO0/o00O00O;", "", ViewHierarchyConstants.TEXT_KEY, "", "logDebug", "Lcom/yalla/yalla/model/media/MediaModel;", "mediaModel", "", "minMontageDurationMs", "maxMontageDurationMs", "Lcom/yalla/yalla/model/media/SelectMusicModelWrapper;", "musicModel", "navigate", "Landroidx/compose/foundation/layout/ColumnScope;", "Content", "(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V", "<init>", "()V", "Media_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nYLMediaPreViewScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 YLMediaPreViewScreen.kt\ncom/yalla/yalla/module/media/preview/YLMediaPreViewScreen\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 7 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,132:1\n76#2:133\n81#3,11:134\n25#4:145\n25#4:156\n1097#5,6:146\n1097#5,3:157\n1100#5,3:163\n486#6,4:152\n490#6,2:160\n494#6:166\n486#7:162\n*S KotlinDebug\n*F\n+ 1 YLMediaPreViewScreen.kt\ncom/yalla/yalla/module/media/preview/YLMediaPreViewScreen\n*L\n69#1:133\n71#1:134,11\n73#1:145\n84#1:156\n73#1:146,6\n84#1:157,3\n84#1:163,3\n84#1:152,4\n84#1:160,2\n84#1:166\n84#1:162\n*E\n"})
public final class YLMediaPreViewScreen extends o00O00O {
    public static final int $stable = 0;

    @NotNull
    public static final YLMediaPreViewScreen INSTANCE = new YLMediaPreViewScreen();

    public static final class OooO extends Lambda implements Function1<Uri, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f24686OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(CoroutineScope coroutineScope) {
            super(1);
            this.f24686OooO0Oo = coroutineScope;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Uri uri) {
            Uri it = uri;
            Intrinsics.checkNotNullParameter(it, "it");
            OooOOO.OooO0OO(this.f24686OooO0Oo, new com.yalla.yalla.module.media.preview.OooO(it, null));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.module.media.preview.YLMediaPreViewScreen$Content$2", f = "YLMediaPreViewScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
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

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            MutableState mutableState = o0OOO0o.f45698OooO00o;
            if (o0OOO0o.OooO0oO() != RoomState.Close) {
                o0OOO0o.OooO00o();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 implements Observer<Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ oo0o0Oo f24687OooO0Oo;

        public OooO0O0(oo0o0Oo oo0o0oo) {
            this.f24687OooO0Oo = oo0o0oo;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Boolean bool) {
            if (bool.booleanValue()) {
                oo0o0Oo oo0o0oo = this.f24687OooO0Oo;
                oo0o0oo.f46603OooO0o.setValue(null);
                oo0o0oo.f46605OooO0oO.setValue(null);
                oo0o0oo.f46607OooOO0.setIntValue(100);
                o0OOo000.OooO0O0();
            }
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f24688OooO0Oo = new OooO0OO();

        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            oo0oOO0.OooO0o(null);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<SelectMusicModel, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ oo0o0Oo f24689OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(oo0o0Oo oo0o0oo) {
            super(1);
            this.f24689OooO0Oo = oo0o0oo;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SelectMusicModel selectMusicModel) {
            SelectMusicModel selectMusicModel2 = selectMusicModel;
            MusicScreen.navigate$default(MusicScreen.INSTANCE, false, true, selectMusicModel2 != null ? selectMusicModel2.getFilePath() : null, selectMusicModel2 != null ? selectMusicModel2.getStartPosition() : 0L, new com.yalla.yalla.module.media.preview.OooO0o(selectMusicModel2, this.f24689OooO0Oo), 1, null);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f24691OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ColumnScope f24692OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(ColumnScope columnScope, int i) {
            super(2);
            this.f24692OooO0o0 = columnScope;
            this.f24691OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f24691OooO0o | 1);
            YLMediaPreViewScreen.this.Content(this.f24692OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MediaModel f24693OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f24694OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ SelectMusicModelWrapper f24695OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ long f24696OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(MediaModel mediaModel, long j, long j2, SelectMusicModelWrapper selectMusicModelWrapper) {
            super(0);
            this.f24693OooO0Oo = mediaModel;
            this.f24695OooO0o0 = selectMusicModelWrapper;
            this.f24694OooO0o = j;
            this.f24696OooO0oO = j2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Context context = o000O0.f10354OooO00o;
            Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
            Intrinsics.checkNotNull(activityOooO0O0);
            com.yalla.yalla.util.permission.OooO00o.OooO0OO(activityOooO0O0, PermissionGroupReveal.f32884OooO0o0, null, new com.yalla.yalla.module.media.preview.OooOO0(this.f24693OooO0Oo, this.f24694OooO0o, this.f24696OooO0oO, this.f24695OooO0o0));
            return Unit.INSTANCE;
        }
    }

    private YLMediaPreViewScreen() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logDebug(String text) {
        o0OO0O0.OooO00o("_PreView", text);
    }

    public static /* synthetic */ void navigate$default(YLMediaPreViewScreen yLMediaPreViewScreen, MediaModel mediaModel, long j, long j2, SelectMusicModelWrapper selectMusicModelWrapper, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 5000;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = 60000;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            selectMusicModelWrapper = null;
        }
        yLMediaPreViewScreen.navigate(mediaModel, j3, j4, selectMusicModelWrapper);
    }

    @Override // p526o0o0OOO0.o00O00O
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public void Content(@NotNull ColumnScope columnScope, @Nullable Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(columnScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(2044068118);
        if ((i & 112) == 0) {
            i2 = (composerStartRestartGroup.changed(this) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 81) == 16 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2044068118, i, -1, "com.yalla.yalla.module.media.preview.YLMediaPreViewScreen.Content (YLMediaPreViewScreen.kt:66)");
            }
            boolean z = true;
            o00000O.OooO0O0(true, composerStartRestartGroup, 6, 0);
            Bundle params = o00O.OooO0O0((NavBackStackEntry) composerStartRestartGroup.consume(o00O.f53592OooO00o), composerStartRestartGroup);
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(oo0o0Oo.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            oo0o0Oo oo0o0oo = (oo0o0Oo) viewModel;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                oo0o0oo.getClass();
                Intrinsics.checkNotNullParameter(params, "params");
                if (oo0o0oo.f46599OooO00o == null) {
                    Parcelable parcelable = params.getParcelable("param_media_model");
                    Intrinsics.checkNotNull(parcelable);
                    MediaModel mediaModel = (MediaModel) parcelable;
                    Intrinsics.checkNotNullParameter(mediaModel, "<set-?>");
                    oo0o0oo.f46599OooO00o = mediaModel;
                    SelectMusicModelWrapper selectMusicModelWrapper = (SelectMusicModelWrapper) params.getParcelable("param_select_music_model");
                    oo0o0oo.OooO0o().f46572OooO00o = params.getLong("param_min_montage_duration_ms");
                    oo0o0oo.OooO0o().f46573OooO0O0 = params.getLong("param_max_montage_duration_ms");
                    o0OO0O0.OooO00o("_PreviewVM", "MediaPreviewViewModel init mediaModel: " + oo0o0oo.OooO0Oo() + "  musicModelWrapper:" + selectMusicModelWrapper);
                    SelectMusicModel selectMusicModel = selectMusicModelWrapper != null ? selectMusicModelWrapper.getSelectMusicModel() : null;
                    MutableState<SelectMusicModel> mutableState = oo0o0oo.f46603OooO0o;
                    mutableState.setValue(selectMusicModel);
                    SelectMusicFrom from = selectMusicModelWrapper != null ? selectMusicModelWrapper.getFrom() : null;
                    MutableState<SelectMusicFrom> mutableState2 = oo0o0oo.f46605OooO0oO;
                    mutableState2.setValue(from);
                    if (mutableState2.getValue() == SelectMusicFrom.CAMERA_PAGE && mutableState.getValue() != null) {
                        z = false;
                    }
                    oo0o0oo.f46612OooOOOO = z;
                    oo0o0oo.f46598OooO.setIntValue(z ? 100 : 0);
                    oo0o0oo.f46607OooOO0.setIntValue(mutableState.getValue() != null ? 100 : 0);
                    if (!oo0o0oo.OooO0Oo().isPicture()) {
                        oo0o0oo.f46614OooOOo = oo0o0oo.OooO0Oo().getVideoDuration();
                        if (oo0o0oo.OooO0Oo().getVideoInfo() == null) {
                            if (oo0o0oo.f46614OooOOo > oo0o0oo.OooO0o().f46573OooO0O0) {
                                oo0o0oo.OooO0Oo().setVideoInfo(new MediaVideoInfo(new ArrayList(), 0L, oo0o0oo.OooO0o().f46573OooO0O0));
                            } else {
                                oo0o0oo.OooO0Oo().setVideoInfo(new MediaVideoInfo(new ArrayList(), 0L, oo0o0oo.f46614OooOOo));
                            }
                        }
                    }
                }
                composerStartRestartGroup.updateRememberedValue(SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Unit.INSTANCE, null, 2, null));
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(Unit.INSTANCE, new OooO00o(null), composerStartRestartGroup, 70);
            composerStartRestartGroup.startReplaceableGroup(773894976);
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue2).getCoroutineScope();
            composerStartRestartGroup.endReplaceableGroup();
            logDebug("YLCameraPreViewScreen mediaModel : " + oo0o0oo.OooO0Oo());
            Observable<Object> observable = LiveEventBus.get("MUSIC_EDIT_DELETE");
            Intrinsics.checkNotNullExpressionValue(observable, "get(EventKey.MUSIC_EDIT_DELETE)");
            p417o0OoO0.o00000O.OooO00o(observable, new OooO0O0(oo0o0oo), composerStartRestartGroup, 8);
            o00Oo0.OooO00o(OooO0OO.f24688OooO0Oo, new OooO0o(oo0o0oo), oo0o0oo, new OooO(coroutineScope), composerStartRestartGroup, 518);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0(columnScope, i));
    }

    public final void navigate(@NotNull MediaModel mediaModel, long minMontageDurationMs, long maxMontageDurationMs, @Nullable SelectMusicModelWrapper musicModel) {
        Intrinsics.checkNotNullParameter(mediaModel, "mediaModel");
        o0o0000.OooO00o(new OooOO0O(mediaModel, minMontageDurationMs, maxMontageDurationMs, musicModel));
    }
}
