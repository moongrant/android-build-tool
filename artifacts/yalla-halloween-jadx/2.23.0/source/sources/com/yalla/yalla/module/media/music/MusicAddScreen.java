package com.yalla.yalla.module.media.music;

import android.app.Activity;
import android.os.Looper;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.code.android.util.o0000;
import com.code.android.util.o0000O0;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.code.android.util.o0O0O00;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.yalla.yalla.data.db.model.MusicTable;
import com.yalla.yalla.model.MusicFileModel;
import com.yalla.yalla.module.media.music.MusicAddScreen;
import com.yalla.yalla.util.Player.Audio;
import com.zego.zegoavkit2.ZegoConstants;
import io.agora.rtc.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p148o00Oo0o.o00000O0;
import p417o0OoO0.o00000O;
import p449o0Ooo0.o000O;
import p469o0OoooOO.o0oO0O0o;
import p507o0o00ooo.t1;
import p519o0o0O0oO.z2;
import p526o0o0OOO0.o00O00O;
import p526o0o0OOO0.oo0oOO0;
import p575o0oOoOo.o0O0o0;
import p575o0oOoOo.o0O0o00O;
import p583o0oOooO.o0O;
import p584o0oOooO0.oO00OOO;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b,\u0010-J)\u0010\b\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0003¢\u0006\u0004\b\b\u0010\tJ^\u0010\u0016\u001a\u00020\u00062\u001c\u0010\u000e\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r0\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f2!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00060\u0011H\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\u0006\u0010\u001d\u001a\u00020\u0006J\u0018\u0010!\u001a\u00020\u001eH\u0017ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010#\u001a\u00020\u0006*\u00020\"H\u0017¢\u0006\u0004\b#\u0010$J:\u0010'\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\f2!\u0010&\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u00060\u0011H\u0007¢\u0006\u0004\b'\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006."}, d2 = {"Lcom/yalla/yalla/module/media/music/MusicAddScreen;", "Lo0o0OOO0/o00O00O;", "Landroidx/compose/foundation/layout/BoxScope;", "", "selectCount", "Lkotlin/Function0;", "", "confirmAddClick", "BottomArea", "(Landroidx/compose/foundation/layout/BoxScope;ILkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/runtime/State;", "Ljava/util/ArrayList;", "Lcom/yalla/yalla/model/MusicFileModel;", "Lkotlin/collections/ArrayList;", "foldList", "Landroidx/compose/runtime/MutableState;", "currentFolderIndex", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "countSum", "countSumListener", "InitObservers", "(Landroidx/compose/runtime/State;Landroidx/compose/runtime/MutableState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Landroid/app/Activity;", "context", "Lo0oOoOo/o0O0o00O;", "musicViewModel", "scanMusic", "navigate", "Landroidx/compose/ui/graphics/Color;", "getWindowBackgroundColor-WaAFU9c", "(Landroidx/compose/runtime/Composer;I)J", "getWindowBackgroundColor", "Landroidx/compose/foundation/layout/ColumnScope;", "Content", "(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V", "item", "onItemClick", "FoldItemContent", "(Lcom/yalla/yalla/model/MusicFileModel;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lo0oOooO/o0O$OooO0O0;", "scanCompletedListener", "Lo0oOooO/o0O$OooO0O0;", "<init>", "()V", "Media_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMusicAddScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicAddScreen.kt\ncom/yalla/yalla/module/media/music/MusicAddScreen\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 11 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 12 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 13 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,259:1\n81#2,11:260\n36#3:271\n456#3,8:296\n464#3,3:310\n456#3,8:331\n464#3,3:345\n50#3:350\n49#3:351\n467#3,3:358\n467#3,3:363\n456#3,8:388\n464#3,3:402\n456#3,8:426\n464#3,3:440\n467#3,3:446\n467#3,3:455\n456#3,8:478\n464#3,3:492\n36#3:497\n467#3,3:504\n1097#4,6:272\n1097#4,6:352\n1097#4,6:498\n76#5:278\n66#6,6:279\n72#6:313\n76#6:367\n78#7,11:285\n78#7,11:320\n91#7:361\n91#7:366\n78#7,11:377\n78#7,11:415\n91#7:449\n91#7:458\n78#7,11:467\n91#7:507\n4144#8,6:304\n4144#8,6:339\n4144#8,6:396\n4144#8,6:434\n4144#8,6:486\n72#9,6:314\n78#9:348\n82#9:362\n72#9,6:409\n78#9:443\n82#9:450\n154#10:349\n154#10:368\n154#10:369\n154#10:370\n154#10:406\n154#10:407\n154#10:408\n154#10:444\n154#10:445\n154#10:454\n154#10:460\n154#10:496\n73#11,6:371\n79#11:405\n83#11:459\n73#11,6:461\n79#11:495\n83#11:508\n766#12:451\n857#12,2:452\n81#13:509\n107#13,2:510\n*S KotlinDebug\n*F\n+ 1 MusicAddScreen.kt\ncom/yalla/yalla/module/media/music/MusicAddScreen\n*L\n82#1:260,11\n86#1:271\n90#1:296,8\n90#1:310,3\n95#1:331,8\n95#1:345,3\n114#1:350\n114#1:351\n95#1:358,3\n90#1:363,3\n135#1:388,8\n135#1:402,3\n153#1:426,8\n153#1:440,3\n153#1:446,3\n135#1:455,3\n191#1:478,8\n191#1:492,3\n211#1:497\n191#1:504,3\n86#1:272,6\n114#1:352,6\n211#1:498,6\n89#1:278\n90#1:279,6\n90#1:313\n90#1:367\n90#1:285,11\n95#1:320,11\n95#1:361\n90#1:366\n135#1:377,11\n153#1:415,11\n153#1:449\n135#1:458\n191#1:467,11\n191#1:507\n90#1:304,6\n95#1:339,6\n135#1:396,6\n153#1:434,6\n191#1:486,6\n95#1:314,6\n95#1:348\n95#1:362\n153#1:409,6\n153#1:443\n153#1:450\n112#1:349\n139#1:368\n140#1:369\n141#1:370\n150#1:406\n151#1:407\n155#1:408\n164#1:444\n172#1:445\n181#1:454\n194#1:460\n209#1:496\n135#1:371,6\n135#1:405\n135#1:459\n191#1:461,6\n191#1:495\n191#1:508\n176#1:451\n176#1:452,2\n84#1:509\n84#1:510,2\n*E\n"})
public final class MusicAddScreen extends o00O00O {

    @Nullable
    private static o0O.OooO0O0 scanCompletedListener;

    @NotNull
    public static final MusicAddScreen INSTANCE = new MusicAddScreen();
    public static final int $stable = 8;

    @SourceDebugExtension({"SMAP\nMusicAddScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicAddScreen.kt\ncom/yalla/yalla/module/media/music/MusicAddScreen$Content$2$1$2$1\n+ 2 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n1#1,259:1\n171#2,12:260\n*S KotlinDebug\n*F\n+ 1 MusicAddScreen.kt\ncom/yalla/yalla/module/media/music/MusicAddScreen$Content$2$1$2$1\n*L\n115#1:260,12\n*E\n"})
    public static final class OooO extends Lambda implements Function1<LazyListScope, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ State<ArrayList<MusicFileModel>> f24383OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Integer> f24384OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(MutableState mutableState, State state) {
            super(1);
            this.f24383OooO0Oo = state;
            this.f24384OooO0o0 = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(LazyListScope lazyListScope) {
            LazyListScope LazyColumn = lazyListScope;
            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
            final ArrayList<MusicFileModel> value = this.f24383OooO0Oo.getValue();
            int size = value.size();
            Function1<Integer, Object> function1 = new Function1<Integer, Object>() { // from class: com.yalla.yalla.module.media.music.MusicAddScreen$Content$2$1$2$1$invoke$$inlined$itemsIndexed$default$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Integer num) {
                    value.get(num.intValue());
                    return null;
                }
            };
            final MutableState<Integer> mutableState = this.f24384OooO0o0;
            LazyColumn.items(size, null, function1, ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yalla.yalla.module.media.music.MusicAddScreen$Content$2$1$2$1$invoke$$inlined$itemsIndexed$default$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // kotlin.jvm.functions.Function4
                public final Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                    int i;
                    LazyItemScope items = lazyItemScope;
                    int iIntValue = num.intValue();
                    Composer composer2 = composer;
                    int iIntValue2 = num2.intValue();
                    Intrinsics.checkNotNullParameter(items, "$this$items");
                    if ((iIntValue2 & 14) == 0) {
                        i = (composer2.changed(items) ? 4 : 2) | iIntValue2;
                    } else {
                        i = iIntValue2;
                    }
                    if ((iIntValue2 & 112) == 0) {
                        i |= composer2.changed(iIntValue) ? 32 : 16;
                    }
                    if ((i & 731) == 146 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                    } else {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1091073711, i, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:179)");
                        }
                        MusicFileModel musicFileModel = (MusicFileModel) value.get(iIntValue);
                        MusicAddScreen.INSTANCE.FoldItemContent(musicFileModel, new OooO0O0(musicFileModel, mutableState, iIntValue), composer2, ((((i & 112) | (i & 14)) >> 6) & 14) | MusicFileModel.$stable | ConstantsKt.MINIMUM_BLOCK_SIZE);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                    return Unit.INSTANCE;
                }
            }));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f24385OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Function0<Unit> function0) {
            super(0);
            this.f24385OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f24385OooO0Oo.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f24387OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ BoxScope f24388OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f24389OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f24390OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(BoxScope boxScope, int i, Function0<Unit> function0, int i2) {
            super(2);
            this.f24388OooO0o0 = boxScope;
            this.f24387OooO0o = i;
            this.f24389OooO0oO = function0;
            this.f24390OooO0oo = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            MusicAddScreen.this.BottomArea(this.f24388OooO0o0, this.f24387OooO0o, this.f24389OooO0oO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f24390OooO0oo | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Integer> f24391OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(MutableState<Integer> mutableState) {
            super(1);
            this.f24391OooO0Oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            MusicAddScreen.Content$lambda$1(this.f24391OooO0Oo, num.intValue());
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ AppCompatActivity f24392OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o0O0o00O f24393OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(AppCompatActivity appCompatActivity, o0O0o00O o0o0o00o) {
            super(3);
            this.f24392OooO0Oo = appCompatActivity;
            this.f24393OooO0o0 = o0o0o00o;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            RowScope Toolbar = rowScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(Toolbar, "$this$Toolbar");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-693661028, iIntValue, -1, "com.yalla.yalla.module.media.music.MusicAddScreen.Content.<anonymous>.<anonymous>.<anonymous> (MusicAddScreen.kt:98)");
                }
                TextKt.m1251Text4IGK_g(o0000.OooO0OO(oO00OOo0.scan), o0O0O00.OooO0O0(Modifier.INSTANCE, false, false, 0L, false, null, null, null, new com.yalla.yalla.module.media.music.OooO00o(this.f24392OooO0Oo, this.f24393OooO0o0), 255), o0oO0O0o.f46960OooOOo, TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131056);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0O0o00O f24394OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ State<ArrayList<MusicFileModel>> f24395OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOO0(o0O0o00O o0o0o00o, State<? extends ArrayList<MusicFileModel>> state) {
            super(0);
            this.f24394OooO0Oo = o0o0o00o;
            this.f24395OooO0o0 = state;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ArrayList<MusicFileModel> list = this.f24395OooO0o0.getValue();
            o0O0o00O o0o0o00o = this.f24394OooO0Oo;
            o0o0o00o.getClass();
            Intrinsics.checkNotNullParameter(list, "list");
            com.code.android.util.OooOOO.OooO0O0(ViewModelKt.getViewModelScope(o0o0o00o), new o0O0o0(list, null));
            String strOooO0OO = o0000.OooO0OO(oO00OOo0.Success);
            if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                }
            }
            oo0oOO0.OooO0o(null);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f24397OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ColumnScope f24398OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(ColumnScope columnScope, int i) {
            super(2);
            this.f24398OooO0o0 = columnScope;
            this.f24397OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f24397OooO0o | 1);
            MusicAddScreen.this.Content(this.f24398OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function0<MutableState<Integer>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOOO f24399OooO0Oo = new OooOOO();

        public OooOOO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableState<Integer> invoke() {
            return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<MutableState<Integer>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOOO0 f24400OooO0Oo = new OooOOO0();

        public OooOOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableState<Integer> invoke() {
            return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
        }
    }

    public static final class OooOOOO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1<MusicFileModel, Unit> f24401OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MusicFileModel f24402OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOOOO(Function1<? super MusicFileModel, Unit> function1, MusicFileModel musicFileModel) {
            super(0);
            this.f24401OooO0Oo = function1;
            this.f24402OooO0o0 = musicFileModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f24401OooO0Oo.invoke(this.f24402OooO0o0);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nMusicAddScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicAddScreen.kt\ncom/yalla/yalla/module/media/music/MusicAddScreen$InitObservers$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,259:1\n1549#2:260\n1620#2,3:261\n1855#2,2:264\n1855#2:266\n766#2:267\n857#2,2:268\n1856#2:270\n*S KotlinDebug\n*F\n+ 1 MusicAddScreen.kt\ncom/yalla/yalla/module/media/music/MusicAddScreen$InitObservers$1\n*L\n226#1:260\n226#1:261,3\n227#1:264,2\n232#1:266\n233#1:267\n233#1:268,2\n232#1:270\n*E\n"})
    public static final class OooOo implements Observer<List<? extends MusicTable>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ State<ArrayList<MusicFileModel>> f24403OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Unit> f24404OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Integer> f24405OooO0o0;

        /* JADX WARN: Multi-variable type inference failed */
        public OooOo(State<? extends ArrayList<MusicFileModel>> state, MutableState<Integer> mutableState, Function1<? super Integer, Unit> function1) {
            this.f24403OooO0Oo = state;
            this.f24405OooO0o0 = mutableState;
            this.f24404OooO0o = function1;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(List<? extends MusicTable> list) {
            List<? extends MusicTable> list2 = list;
            Intrinsics.checkNotNullParameter(list2, "list");
            State<ArrayList<MusicFileModel>> state = this.f24403OooO0Oo;
            if (state.getValue().size() == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((MusicTable) it.next()).mPath);
            }
            for (Audio audio : state.getValue().get(this.f24405OooO0o0.getValue().intValue()).getSongList()) {
                audio.isSelected = arrayList.contains(audio.getPath());
            }
            Iterator<T> it2 = state.getValue().iterator();
            int size = 0;
            while (it2.hasNext()) {
                List<Audio> songList = ((MusicFileModel) it2.next()).getSongList();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : songList) {
                    if (((Audio) obj).isSelected) {
                        arrayList2.add(obj);
                    }
                }
                size += arrayList2.size();
            }
            this.f24404OooO0o.invoke(Integer.valueOf(size));
        }
    }

    public static final class OooOo00 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function1<MusicFileModel, Unit> f24407OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MusicFileModel f24408OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f24409OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOo00(MusicFileModel musicFileModel, Function1<? super MusicFileModel, Unit> function1, int i) {
            super(2);
            this.f24408OooO0o0 = musicFileModel;
            this.f24407OooO0o = function1;
            this.f24409OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f24409OooO0oO | 1);
            MusicFileModel musicFileModel = this.f24408OooO0o0;
            Function1<MusicFileModel, Unit> function1 = this.f24407OooO0o;
            MusicAddScreen.this.FoldItemContent(musicFileModel, function1, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.module.media.music.MusicAddScreen$scanMusic$1$1", f = "MusicAddScreen.kt", i = {}, l = {247}, m = "invokeSuspend", n = {}, s = {})
    public static final class Oooo0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f24410OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ z2 f24411OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Activity f24412OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo0(Activity activity, z2 z2Var, Continuation<? super Oooo0> continuation) {
            super(2, continuation);
            this.f24412OooO0o0 = activity;
            this.f24411OooO0o = z2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new Oooo0(this.f24412OooO0o0, this.f24411OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((Oooo0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f24410OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f24410OooO0Oo = 1;
                if (DelayKt.delay(100L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Activity activity = this.f24412OooO0o0;
            if (!activity.isFinishing() && !activity.isDestroyed()) {
                this.f24411OooO0o.dismiss();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<Integer> f24414OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ State<ArrayList<MusicFileModel>> f24415OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Unit> f24416OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f24417OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Oooo000(State<? extends ArrayList<MusicFileModel>> state, MutableState<Integer> mutableState, Function1<? super Integer, Unit> function1, int i) {
            super(2);
            this.f24415OooO0o0 = state;
            this.f24414OooO0o = mutableState;
            this.f24416OooO0oO = function1;
            this.f24417OooO0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            MusicAddScreen.this.InitObservers(this.f24415OooO0o0, this.f24414OooO0o, this.f24416OooO0oO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f24417OooO0oo | 1));
            return Unit.INSTANCE;
        }
    }

    private MusicAddScreen() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void BottomArea(BoxScope boxScope, int i, Function0<Unit> function0, Composer composer, int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1024891954);
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i3 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1024891954, i3, -1, "com.yalla.yalla.module.media.music.MusicAddScreen.BottomArea (MusicAddScreen.kt:186)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            int i4 = o0oO0O0o.f47152o00OOOo;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(BackgroundKt.m169backgroundbw27NRU$default(companion, o0oO0O0o.f47059o000OOo, null, 2, null), Dp.m3765constructorimpl(60)), 0.0f, 1, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Modifier modifierAlign = boxScope.align(modifierFillMaxWidth$default, companion2.getBottomCenter());
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO.OooO00o(Arrangement.INSTANCE, centerVertically, composerStartRestartGroup, 48, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierAlign);
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
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            String strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(o0000.OooO0OO(oO00OOo0.add_music_submit), i > 0 ? OooO0OO.OooO00o.OooO00o("(", i, ")") : "");
            long j = i > 0 ? o0oO0O0o.f46946OooO0O0 : o0oO0O0o.f46951OooO0oO;
            long j2 = i > 0 ? o0oO0O0o.f47002Oooooo0 : o0oO0O0o.f46948OooO0Oo;
            long jOooO0OO = o0000O0.OooO0OO(15, composerStartRestartGroup, 6);
            boolean z = i > 0;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(PaddingKt.m477paddingVpY3zN4(companion, Dp.m3765constructorimpl(16), Dp.m3765constructorimpl(10)), 0.0f, 1, null);
            Color colorM1660boximpl = Color.m1660boximpl(j);
            Color colorM1660boximpl2 = Color.m1660boximpl(j2);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(function0);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new OooO00o(function0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            o00000O0.OooO00o(strOooO00o, jOooO0OO, null, null, colorM1660boximpl, colorM1660boximpl2, null, 0.0f, null, z, false, 0L, false, null, null, null, null, null, modifierFillMaxSize$default, (Function0) objRememberedValue, composerStartRestartGroup, 0, 100663296, 261580);
            if (androidx.compose.material.OooOO0.OooO0O0(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(boxScope, i, function0, i2));
    }

    private static final int Content$lambda$0(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Content$lambda$1(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public final void InitObservers(State<? extends ArrayList<MusicFileModel>> state, MutableState<Integer> mutableState, Function1<? super Integer, Unit> function1, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1290211160);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changed(mutableState) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i2 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1290211160, i, -1, "com.yalla.yalla.module.media.music.MusicAddScreen.InitObservers (MusicAddScreen.kt:217)");
            }
            Observable<Object> observable = LiveEventBus.get("MUSIC_LIST_UPDATE");
            Intrinsics.checkNotNullExpressionValue(observable, "get(EventKey.MUSIC_LIST_UPDATE)");
            o00000O.OooO00o(observable, new OooOo(state, mutableState, function1), composerStartRestartGroup, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Oooo000(state, mutableState, function1, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scanMusic(final Activity context, final o0O0o00O musicViewModel) {
        final z2 z2Var = new z2(context);
        if (scanCompletedListener == null) {
            scanCompletedListener = new o0O.OooO0O0() { // from class: o0Ooo0.o000O0O0
                @Override // o0oOooO.o0O.OooO0O0
                public final void OooO00o(ArrayList arrayList) {
                    MusicAddScreen.scanMusic$lambda$11(musicViewModel, context, z2Var, arrayList);
                }
            };
        }
        z2Var.setOnDismissListener(new o000O());
        if (p391o0Oo0.OooOO0.OooO(z2Var, context)) {
            z2Var.show();
        }
        o0O.OooO0O0(context, scanCompletedListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scanMusic$lambda$11(o0O0o00O musicViewModel, Activity context, z2 scanningMusicDialog, List audios) {
        Intrinsics.checkNotNullParameter(musicViewModel, "$musicViewModel");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(scanningMusicDialog, "$scanningMusicDialog");
        MutableStateFlow<ArrayList<MusicFileModel>> mutableStateFlow = musicViewModel.f56327OooO0o;
        Intrinsics.checkNotNullExpressionValue(audios, "audios");
        mutableStateFlow.setValue(o0O0o00O.OooO0O0(audios));
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new Oooo0(context, scanningMusicDialog, null), 3, null);
    }

    @Override // p526o0o0OOO0.o00O00O
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public void Content(@NotNull ColumnScope columnScope, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(columnScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(911820985);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(911820985, i, -1, "com.yalla.yalla.module.media.music.MusicAddScreen.Content (MusicAddScreen.kt:80)");
        }
        composerStartRestartGroup.startReplaceableGroup(1729797275);
        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
        if (current == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        ViewModel viewModel = androidx.lifecycle.viewmodel.compose.ViewModelKt.viewModel(o0O0o00O.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
        composerStartRestartGroup.endReplaceableGroup();
        o0O0o00O o0o0o00o = (o0O0o00O) viewModel;
        State<? extends ArrayList<MusicFileModel>> stateCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(o0o0o00o.f56327OooO0o, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 8, 7);
        MutableState mutableState = (MutableState) RememberSaveableKt.m1322rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) OooOOO.f24399OooO0Oo, composerStartRestartGroup, 3080, 6);
        MutableState<Integer> mutableState2 = (MutableState) RememberSaveableKt.m1322rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) OooOOO0.f24400OooO0Oo, composerStartRestartGroup, 3080, 6);
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged = composerStartRestartGroup.changed(mutableState);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new OooO0OO(mutableState);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        InitObservers(stateCollectAsStateWithLifecycle, mutableState2, (Function1) objRememberedValue, composerStartRestartGroup, 4096);
        Object objConsume = composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        Intrinsics.checkNotNull(objConsume, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        AppCompatActivity appCompatActivity = (AppCompatActivity) objConsume;
        Modifier.Companion companion = Modifier.INSTANCE;
        int i2 = o0oO0O0o.f47152o00OOOo;
        Modifier modifierStatusBarsPadding = WindowInsetsPadding_androidKt.statusBarsPadding(BackgroundKt.m169backgroundbw27NRU$default(companion, o0oO0O0o.f46991OoooOOO, null, 2, null));
        composerStartRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyOooO00o = p018OooOoo0.OooOOO.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierStatusBarsPadding);
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
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyOooO00o2 = androidx.compose.material.OooO0o.OooO00o(companion2, Arrangement.INSTANCE.getTop(), composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor2);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl2, measurePolicyOooO00o2, composerM1309constructorimpl2, currentCompositionLocalMap2);
        if (composerM1309constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        t1.OooO00o(o0000.OooO0OO(oO00OOo0.add_music), 0.0f, o0oO0O0o.f46946OooO0O0, null, null, null, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -693661028, true, new OooO0o(appCompatActivity, o0o0o00o)), null, composerStartRestartGroup, 12582912, 378);
        Modifier modifierOooO00o = androidx.compose.foundation.layout.OooOO0.OooO00o(columnScopeInstance, PaddingKt.m480paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, Dp.m3765constructorimpl(60), 7, null), 1.0f, false, 2, null);
        composerStartRestartGroup.startReplaceableGroup(511388516);
        boolean zChanged2 = composerStartRestartGroup.changed(stateCollectAsStateWithLifecycle) | composerStartRestartGroup.changed(mutableState2);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new OooO(mutableState2, stateCollectAsStateWithLifecycle);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        LazyDslKt.LazyColumn(modifierOooO00o, null, null, false, null, null, null, false, (Function1) objRememberedValue2, composerStartRestartGroup, 0, 254);
        p426o0OoOO.o000oOoO.OooO00o(composerStartRestartGroup);
        INSTANCE.BottomArea(boxScopeInstance, Content$lambda$0(mutableState), new OooOO0(o0o0o00o, stateCollectAsStateWithLifecycle), composerStartRestartGroup, 4102);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        p149o00Oo0o0.o00000O.OooO0O0(true, composerStartRestartGroup, 6, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0O(columnScope, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void FoldItemContent(@NotNull MusicFileModel item, @NotNull Function1<? super MusicFileModel, Unit> onItemClick, @Nullable Composer composer, int i) {
        Composer composer2;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-808088014);
        int i2 = (i & 14) == 0 ? (composerStartRestartGroup.changed(item) ? 4 : 2) | i : i;
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onItemClick) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-808088014, i, -1, "com.yalla.yalla.module.media.music.MusicAddScreen.FoldItemContent (MusicAddScreen.kt:133)");
            }
            Alignment.Companion companion = Alignment.INSTANCE;
            Alignment.Vertical centerVertically = companion.getCenterVertically();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            float f = 12;
            float f2 = 16;
            Modifier modifierOooO0O0 = o0O0O00.OooO0O0(BackgroundKt.m168backgroundbw27NRU(SizeKt.m509height3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(f), 0.0f, 8, null), Dp.m3765constructorimpl(80)), o0oO0O0o.f46992OoooOOo, RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl(f2))), false, false, 0L, false, null, null, null, new OooOOOO(onItemClick, item), 255);
            composerStartRestartGroup.startReplaceableGroup(693286680);
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO.OooO00o(arrangement, centerVertically, composerStartRestartGroup, 48, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierOooO0O0);
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
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(oO00OOO.icon_music_folder, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion2, Dp.m3765constructorimpl(f2), 0.0f, 0.0f, 0.0f, 14, null), Dp.m3765constructorimpl(56)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
            Modifier modifierOooO00o = androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, PaddingKt.m480paddingqDBjuR0$default(companion2, Dp.m3765constructorimpl(f), 0.0f, 0.0f, 0.0f, 14, null), 1.0f, false, 2, null);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyOooO00o2 = androidx.compose.material.OooO0o.OooO00o(companion, arrangement.getTop(), composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierOooO00o);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl2, measurePolicyOooO00o2, composerM1309constructorimpl2, currentCompositionLocalMap2);
            if (composerM1309constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            String fileName = item.getFileName();
            long j = o0oO0O0o.f46960OooOOo;
            long sp = TextUnitKt.getSp(16);
            TextOverflow.Companion companion4 = TextOverflow.INSTANCE;
            int iM3719getEllipsisgIe3tQ8 = companion4.m3719getEllipsisgIe3tQ8();
            float f3 = Constants.ERR_ALREADY_IN_RECORDING;
            composer2 = composerStartRestartGroup;
            TextKt.m1251Text4IGK_g(fileName, SizeKt.m530widthInVpY3zN4$default(companion2, 0.0f, Dp.m3765constructorimpl(f3), 1, null), j, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, iM3719getEllipsisgIe3tQ8, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3120, 3120, 120816);
            TextKt.m1251Text4IGK_g(item.getSongsCount() + ZegoConstants.ZegoVideoDataAuxPublishingStream + o0000.OooO0OO(oO00OOo0.songs) + "," + item.getFilePath(), SizeKt.m530widthInVpY3zN4$default(companion2, 0.0f, Dp.m3765constructorimpl(f3), 1, null), o0oO0O0o.f46953OooOO0, TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, companion4.m3719getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3120, 3120, 120816);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            List<Audio> songList = item.getSongList();
            ArrayList arrayList = new ArrayList();
            for (Object obj : songList) {
                if (((Audio) obj).isSelected) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            TextKt.m1251Text4IGK_g(androidx.camera.core.impl.OooOOOO.OooO00o(size > 0 ? size + ZegoConstants.ZegoVideoDataAuxPublishingStream + o0000.OooO0OO(oO00OOo0.songs) : "", ZegoConstants.ZegoVideoDataAuxPublishingStream), PaddingKt.m480paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, Dp.m3765constructorimpl(15), 0.0f, 11, null), o0oO0O0o.f47169o0o0Oo, TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3120, 0, 131056);
            if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOo00(item, onItemClick, i));
    }

    @Override // p526o0o0OOO0.o00O00O
    @Composable
    /* JADX INFO: renamed from: getWindowBackgroundColor-WaAFU9c */
    public long mo4198getWindowBackgroundColorWaAFU9c(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(236743540);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(236743540, i, -1, "com.yalla.yalla.module.media.music.MusicAddScreen.getWindowBackgroundColor (MusicAddScreen.kt:75)");
        }
        int i2 = o0oO0O0o.f47152o00OOOo;
        long j = o0oO0O0o.f46991OoooOOO;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return j;
    }

    public final void navigate() {
        oo0oOO0.OooO0o0(INSTANCE, null, false, null, 14);
    }
}
