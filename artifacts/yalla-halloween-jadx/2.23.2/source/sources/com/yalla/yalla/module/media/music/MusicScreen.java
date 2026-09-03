package com.yalla.yalla.module.media.music;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotLongStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.BlurKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
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
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavBackStackEntry;
import com.code.android.util.o0000;
import com.code.android.util.o0000O0;
import com.code.android.util.o000O00O;
import com.code.android.util.o0O0O00;
import com.yalla.yalla.data.db.model.MusicTable;
import com.yalla.yalla.data.manager.MusicState;
import com.yalla.yalla.model.media.SelectMusicModel;
import com.yalla.yalla.util.permission.PermissionGroupReveal;
import io.agora.rtc.Constants;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p022Oooo00O.o0O00oO0;
import p105o000oo0o.o00O00OO;
import p121o00O0Ooo.o000O000;
import p194o00o0OO.o00O0OO0;
import p195o00o0OO0.o00000OO;
import p205o00o0o0o.o000O;
import p457o0Ooo0O.o00O00o0;
import p460o0Ooo0o.o00OOO00;
import p471o0OoooO0.o0O00OO;
import p471o0OoooO0.o0O00OOO;
import p471o0OoooO0.o0oOOo;
import p476o0OooooO.o0OOo000;
import p516o0o0O00o.o0O0oo0o;
import p516o0o0O00o.o0OoO00O;
import p532o0o0OOo0.o000O0;
import p532o0o0OOo0.o00O00;
import p532o0o0OOo0.o00O00O;
import p535o0o0Oo0.oO0O00;
import p562o0oOo000.o000000;
import p584o0oOoo0O.o00O0OOO;
import p584o0oOoo0O.oo0o0O0;
import p584o0oOoo0O.oo0oOO0;
import p590o0oOooo0.O0OO00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b.\u0010/J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002JU\u0010\u0013\u001a\u00020\b*\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\r2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\rH\u0003¢\u0006\u0004\b\u0013\u0010\u0014JO\u0010\u0016\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\r2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\rH\u0003¢\u0006\u0004\b\u0016\u0010\u0017Jc\u0010\u001a\u001a\u00020\b*\u00020\u00182\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f2\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\r2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u000bH\u0002J\u0018\u0010!\u001a\u00020\u001eH\u0017ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010\"\u001a\u00020\b*\u00020\u0018H\u0017¢\u0006\u0004\b\"\u0010#JL\u0010+\u001a\u00020\b2\b\b\u0002\u0010$\u001a\u00020\u00112\b\b\u0002\u0010\u0019\u001a\u00020\u00112\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010'\u001a\u00020&2\u001a\b\u0002\u0010*\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010)\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010(R$\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00062²\u0006\u0010\u0010\f\u001a\u0004\u0018\u00010\u000b8\n@\nX\u008a\u008e\u0002²\u0006\u0014\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u0001008\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\f\u00101\u001a\u00020\u00118\nX\u008a\u0084\u0002"}, d2 = {"Lcom/yalla/yalla/module/media/music/MusicScreen;", "Lo0o0OOo0/o000O0;", "", "searchText", "Lo0oOoo0O/oo0o0O0;", "musicViewModel", "Landroidx/appcompat/app/AppCompatActivity;", "activity", "", "handleSearchResult", "Landroidx/compose/foundation/layout/BoxScope;", "Lcom/yalla/yalla/data/db/model/MusicTable;", "selectedMusic", "Landroidx/compose/runtime/MutableState;", "lastPlayingItem", "", "musicList", "", "isPopVisible", "BottomArea", "(Landroidx/compose/foundation/layout/BoxScope;Lcom/yalla/yalla/data/db/model/MusicTable;Lo0oOoo0O/oo0o0O0;Landroidx/compose/runtime/MutableState;Ljava/util/List;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/Composer;II)V", "playingSong", "MusicPopWindow", "(Lcom/yalla/yalla/data/db/model/MusicTable;Lo0oOoo0O/oo0o0O0;Landroidx/compose/runtime/MutableState;Ljava/util/List;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/foundation/layout/ColumnScope;", "isFromVideo", "ListPage", "(Landroidx/compose/foundation/layout/ColumnScope;Ljava/util/List;ZLo0oOoo0O/oo0o0O0;Landroidx/compose/runtime/MutableState;Lcom/yalla/yalla/data/db/model/MusicTable;Landroidx/compose/runtime/MutableState;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "deleteMusic", "sureDeleteMusic", "Landroidx/compose/ui/graphics/Color;", "getWindowBackgroundColor-WaAFU9c", "(Landroidx/compose/runtime/Composer;I)J", "getWindowBackgroundColor", "Content", "(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V", "isToAdd", "path", "", "startPosition", "Lkotlin/Function1;", "", "onResult", "navigate", "searchTextSetter", "Lkotlin/jvm/functions/Function1;", "<init>", "()V", "", "searchBtnEnabled", "Media_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nMusicScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicScreen.kt\ncom/yalla/yalla/module/media/music/MusicScreen\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 10 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 11 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 12 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,667:1\n76#2:668\n76#2:708\n76#2:730\n36#3:669\n36#3:676\n36#3:683\n25#3:690\n25#3:709\n25#3:716\n25#3:723\n25#3:731\n25#3:738\n25#3:745\n50#3:752\n49#3:753\n36#3:760\n36#3:767\n50#3:774\n49#3:775\n456#3,8:799\n464#3,3:813\n456#3,8:834\n464#3,3:848\n456#3,8:869\n464#3,3:883\n467#3,3:887\n467#3,3:892\n467#3,3:897\n456#3,8:919\n464#3,3:933\n456#3,8:955\n464#3,3:969\n467#3,3:974\n467#3,3:979\n1097#4,6:670\n1097#4,6:677\n1097#4,6:684\n1097#4,6:691\n1097#4,6:710\n1097#4,6:717\n1097#4,6:724\n1097#4,6:732\n1097#4,6:739\n1097#4,6:746\n1097#4,6:754\n1097#4,6:761\n1097#4,6:768\n1097#4,6:776\n81#5,11:697\n66#6,6:782\n72#6:816\n76#6:901\n78#7,11:788\n78#7,11:823\n78#7,11:858\n91#7:890\n91#7:895\n91#7:900\n78#7,11:908\n78#7,11:944\n91#7:977\n91#7:982\n4144#8,6:807\n4144#8,6:842\n4144#8,6:877\n4144#8,6:927\n4144#8,6:963\n72#9,6:817\n78#9:851\n82#9:896\n72#9,6:902\n78#9:936\n82#9:983\n73#10,6:852\n79#10:886\n83#10:891\n73#10,6:938\n79#10:972\n83#10:978\n154#11:937\n154#11:973\n154#11:984\n81#12:985\n107#12,2:986\n81#12:988\n81#12:989\n107#12,2:990\n81#12:992\n*S KotlinDebug\n*F\n+ 1 MusicScreen.kt\ncom/yalla/yalla/module/media/music/MusicScreen\n*L\n109#1:668\n121#1:708\n141#1:730\n110#1:669\n111#1:676\n112#1:683\n113#1:690\n122#1:709\n124#1:716\n137#1:723\n143#1:731\n145#1:738\n148#1:745\n159#1:752\n159#1:753\n180#1:760\n184#1:767\n187#1:774\n187#1:775\n218#1:799,8\n218#1:813,3\n223#1:834,8\n223#1:848,3\n243#1:869,8\n243#1:883,3\n243#1:887,3\n223#1:892,3\n218#1:897,3\n338#1:919,8\n338#1:933,3\n346#1:955,8\n346#1:969,3\n346#1:974,3\n338#1:979,3\n110#1:670,6\n111#1:677,6\n112#1:684,6\n113#1:691,6\n122#1:710,6\n124#1:717,6\n137#1:724,6\n143#1:732,6\n145#1:739,6\n148#1:746,6\n159#1:754,6\n180#1:761,6\n184#1:768,6\n187#1:776,6\n116#1:697,11\n218#1:782,6\n218#1:816\n218#1:901\n218#1:788,11\n223#1:823,11\n243#1:858,11\n243#1:890\n223#1:895\n218#1:900\n338#1:908,11\n346#1:944,11\n346#1:977\n338#1:982\n218#1:807,6\n223#1:842,6\n243#1:877,6\n338#1:927,6\n346#1:963,6\n223#1:817,6\n223#1:851\n223#1:896\n338#1:902,6\n338#1:936\n338#1:983\n243#1:852,6\n243#1:886\n243#1:891\n346#1:938,6\n346#1:972\n346#1:978\n349#1:937\n359#1:973\n540#1:984\n113#1:985\n113#1:986,2\n140#1:988\n143#1:989\n143#1:990,2\n145#1:992\n*E\n"})
public final class MusicScreen extends o000O0 {

    @Nullable
    private static Function1<? super String, Unit> searchTextSetter;

    @NotNull
    public static final MusicScreen INSTANCE = new MusicScreen();
    public static final int $stable = 8;

    @SourceDebugExtension({"SMAP\nMusicScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicScreen.kt\ncom/yalla/yalla/module/media/music/MusicScreen$Content$3$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,667:1\n63#2,5:668\n*S KotlinDebug\n*F\n+ 1 MusicScreen.kt\ncom/yalla/yalla/module/media/music/MusicScreen$Content$3$1\n*L\n160#1:668,5\n*E\n"})
    public static final class OooO extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f23995OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ State<List<MusicTable>> f23996OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO(boolean z, State<? extends List<MusicTable>> state) {
            super(1);
            this.f23995OooO0Oo = z;
            this.f23996OooO0o0 = state;
        }

        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
            DisposableEffectScope DisposableEffect = disposableEffectScope;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            return new o0O00OO(this.f23995OooO0Oo, this.f23996OooO0o0);
        }
    }

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f23997OooO0Oo = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            MusicAddScreen.INSTANCE.navigate();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ List<MusicTable> f23998OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MusicTable f24000OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ BoxScope f24001OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ oo0o0O0 f24002OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<MusicTable> f24003OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f24004OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ int f24005OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ int f24006OooOO0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(BoxScope boxScope, MusicTable musicTable, oo0o0O0 oo0o0o0, MutableState<MusicTable> mutableState, List<? extends MusicTable> list, MutableState<Boolean> mutableState2, int i, int i2) {
            super(2);
            this.f24001OooO0o0 = boxScope;
            this.f24000OooO0o = musicTable;
            this.f24002OooO0oO = oo0o0o0;
            this.f24003OooO0oo = mutableState;
            this.f23998OooO = list;
            this.f24004OooOO0 = mutableState2;
            this.f24005OooOO0O = i;
            this.f24006OooOO0o = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            MusicScreen.this.BottomArea(this.f24001OooO0o0, this.f24000OooO0o, this.f24002OooO0oO, this.f24003OooO0oo, this.f23998OooO, this.f24004OooOO0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f24005OooOO0O | 1), this.f24006OooOO0o);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f24008OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ColumnScope f24009OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(ColumnScope columnScope, int i) {
            super(2);
            this.f24009OooO0o0 = columnScope;
            this.f24008OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f24008OooO0o | 1);
            MusicScreen.this.Content(this.f24009OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.module.media.music.MusicScreen$Content$2", f = "MusicScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<MusicTable> f24010OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableLongState f24011OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ oo0o0O0 f24012OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ long f24013OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(MutableState<MusicTable> mutableState, oo0o0O0 oo0o0o0, MutableLongState mutableLongState, long j, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f24010OooO0Oo = mutableState;
            this.f24012OooO0o0 = oo0o0o0;
            this.f24011OooO0o = mutableLongState;
            this.f24013OooO0oO = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0o(this.f24010OooO0Oo, this.f24012OooO0o0, this.f24011OooO0o, this.f24013OooO0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            MusicTable musicTableContent$lambda$4 = MusicScreen.Content$lambda$4(this.f24010OooO0Oo);
            if (musicTableContent$lambda$4 != null) {
                oo0o0O0 oo0o0o0 = this.f24012OooO0o0;
                oo0o0o0.getClass();
                Intrinsics.checkNotNullParameter(musicTableContent$lambda$4, "<set-?>");
                oo0o0o0.f56699OooO0OO.setValue(musicTableContent$lambda$4);
                this.f24011OooO0o.setValue(this.f24013OooO0oO);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<Long, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1<Long, Unit> f24014OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(o0OoOo0 o0oooo1) {
            super(1);
            this.f24014OooO0Oo = o0oooo1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Long l) {
            long jLongValue = l.longValue();
            p363o0OOo00O.OooO0o oooO0o = o00OOO00.f47803OooO00o;
            o00OOO00.OooO0O0();
            this.f24014OooO0Oo.invoke(Long.valueOf(jLongValue));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function1<Long, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1<Long, Unit> f24015OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(o0OoOo0 o0oooo1) {
            super(1);
            this.f24015OooO0Oo = o0oooo1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Long l) {
            this.f24015OooO0Oo.invoke(Long.valueOf(l.longValue()));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function1<Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOOO f24016OooO0Oo = new OooOOO();

        public OooOOO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            int iIntValue = num.intValue();
            if (iIntValue == 1) {
                o0oo0000.OooO00o.OooO0O0("106094");
            } else if (iIntValue == 2) {
                o0oo0000.OooO00o.OooO0O0("106095");
            } else if (iIntValue == 3) {
                o0oo0000.OooO00o.OooO0O0("106093");
            }
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nMusicScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicScreen.kt\ncom/yalla/yalla/module/media/music/MusicScreen$Content$6$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,667:1\n1#2:668\n*E\n"})
    public static final class OooOOO0 extends Lambda implements Function1<Long, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<MusicTable> f24017OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ State<List<MusicTable>> f24018OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOOO0(MutableState<MusicTable> mutableState, State<? extends List<MusicTable>> state) {
            super(1);
            this.f24017OooO0Oo = mutableState;
            this.f24018OooO0o0 = state;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Long l) {
            l.longValue();
            p363o0OOo00O.OooO0o oooO0o = o00OOO00.f47803OooO00o;
            o00OOO00.OooO0O0();
            MutableState<MusicTable> mutableState = this.f24017OooO0Oo;
            MusicTable musicTableContent$lambda$4 = MusicScreen.Content$lambda$4(mutableState);
            Object obj = null;
            MutableState<Boolean> mutableState2 = musicTableContent$lambda$4 != null ? musicTableContent$lambda$4.isPlaying : null;
            if (mutableState2 != null) {
                mutableState2.setValue(Boolean.FALSE);
            }
            List listContent$lambda$10 = MusicScreen.Content$lambda$10(this.f24018OooO0o0);
            if (listContent$lambda$10 != null) {
                for (Object obj2 : listContent$lambda$10) {
                    String str = ((MusicTable) obj2).mPath;
                    MusicTable musicTableContent$lambda$5 = MusicScreen.Content$lambda$4(mutableState);
                    if (Intrinsics.areEqual(str, musicTableContent$lambda$5 != null ? musicTableContent$lambda$5.mPath : null)) {
                        obj = obj2;
                        break;
                    }
                }
                MusicTable musicTable = (MusicTable) obj;
                if (musicTable != null) {
                    musicTable.isPlaying.setValue(Boolean.FALSE);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function1<Long, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ oo0o0O0 f24019OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(oo0o0O0 oo0o0o0) {
            super(1);
            this.f24019OooO0Oo = oo0o0o0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Long l) {
            long jLongValue = l.longValue();
            MusicTable musicTableOooO0OO = this.f24019OooO0Oo.OooO0OO();
            p190o00o0O.OooO<Activity, o00O00OO> oooO = o00O00.f53494OooO00o;
            long j = musicTableOooO0OO.mDuration;
            String mDisplayName = musicTableOooO0OO.mDisplayName;
            Intrinsics.checkNotNullExpressionValue(mDisplayName, "mDisplayName");
            String mTitleKey = musicTableOooO0OO.mTitleKey;
            Intrinsics.checkNotNullExpressionValue(mTitleKey, "mTitleKey");
            String mPath = musicTableOooO0OO.mPath;
            Intrinsics.checkNotNullExpressionValue(mPath, "mPath");
            o00O00.OooO0o(new SelectMusicModel(j, mDisplayName, mTitleKey, jLongValue, mPath));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ oo0o0O0 f24020OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<String> f24021OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ AppCompatActivity f24022OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(AppCompatActivity appCompatActivity, MutableState mutableState, oo0o0O0 oo0o0o0) {
            super(1);
            this.f24020OooO0Oo = oo0o0o0;
            this.f24022OooO0o0 = appCompatActivity;
            this.f24021OooO0o = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String it = str;
            Intrinsics.checkNotNullParameter(it, "it");
            MutableState<String> mutableState = this.f24021OooO0o;
            MusicScreen.Content$lambda$13(mutableState, it);
            MusicScreen.INSTANCE.handleSearchResult(MusicScreen.Content$lambda$12(mutableState), this.f24020OooO0Oo, this.f24022OooO0o0);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nMusicScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicScreen.kt\ncom/yalla/yalla/module/media/music/MusicScreen$Content$9$1$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,667:1\n50#2:668\n49#2:669\n1097#3,6:670\n*S KotlinDebug\n*F\n+ 1 MusicScreen.kt\ncom/yalla/yalla/module/media/music/MusicScreen$Content$9$1$1\n*L\n235#1:668\n235#1:669\n235#1:670,6\n*E\n"})
    public static final class OooOo00 extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ State<Boolean> f24023OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f24024OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(State<Boolean> state, boolean z) {
            super(3);
            this.f24023OooO0Oo = state;
            this.f24024OooO0o0 = z;
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
                    ComposerKt.traceEventStart(3666110, iIntValue, -1, "com.yalla.yalla.module.media.music.MusicScreen.Content.<anonymous>.<anonymous>.<anonymous> (MusicScreen.kt:230)");
                }
                String strOooO0OO = o0000.OooO0OO(o000000.button_editor);
                State<Boolean> state = this.f24023OooO0Oo;
                long j = MusicScreen.Content$lambda$15(state) ? o0OOo000.f48140OooO0oO : o0OOo000.f48148OooOOOo;
                long sp = TextUnitKt.getSp(16);
                Modifier.Companion companion = Modifier.INSTANCE;
                boolean z = this.f24024OooO0o0;
                Boolean boolValueOf = Boolean.valueOf(z);
                composer2.startReplaceableGroup(511388516);
                boolean zChanged = composer2.changed(boolValueOf) | composer2.changed(state);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new com.yalla.yalla.module.media.music.OooOO0(z, state);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceableGroup();
                TextKt.m1261Text4IGK_g(strOooO0OO, o0O0O00.OooO0O0(companion, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 255), j, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131056);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo0 extends Lambda implements Function1<Function1<? super String, ? extends Unit>, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final Oooo0 f24025OooO0Oo = new Oooo0();

        public Oooo0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Function1<? super String, ? extends Unit> function1) {
            Function1<? super String, ? extends Unit> it = function1;
            Intrinsics.checkNotNullParameter(it, "it");
            MusicScreen.searchTextSetter = it;
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Context f24026OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ oo0o0O0 f24027OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ AppCompatActivity f24028OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableState<String> f24029OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo000(Context context, AppCompatActivity appCompatActivity, oo0o0O0 oo0o0o0, MutableState<String> mutableState) {
            super(1);
            this.f24026OooO0Oo = context;
            this.f24028OooO0o0 = appCompatActivity;
            this.f24027OooO0o = oo0o0o0;
            this.f24029OooO0oO = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String it = str;
            Intrinsics.checkNotNullParameter(it, "it");
            Context context = this.f24026OooO0Oo;
            if ((context instanceof AppCompatActivity ? (AppCompatActivity) context : null) != null) {
                AppCompatActivity activity = this.f24028OooO0o0;
                Intrinsics.checkNotNullParameter(activity, "activity");
                Object systemService = activity.getSystemService("input_method");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                ((InputMethodManager) systemService).hideSoftInputFromWindow(activity.findViewById(R.id.content).getWindowToken(), 0);
                MusicScreen.INSTANCE.handleSearchResult(MusicScreen.Content$lambda$12(this.f24029OooO0oO), this.f24027OooO0o, activity);
            }
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nMusicScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicScreen.kt\ncom/yalla/yalla/module/media/music/MusicScreen$Content$9$1$2$4\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,667:1\n154#2:668\n*S KotlinDebug\n*F\n+ 1 MusicScreen.kt\ncom/yalla/yalla/module/media/music/MusicScreen$Content$9$1$2$4\n*L\n274#1:668\n*E\n"})
    public static final class o000oOoO extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ AppCompatActivity f24030OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<String> f24031OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ oo0o0O0 f24032OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000oOoO(AppCompatActivity appCompatActivity, MutableState mutableState, oo0o0O0 oo0o0o0) {
            super(3);
            this.f24030OooO0Oo = appCompatActivity;
            this.f24032OooO0o0 = oo0o0o0;
            this.f24031OooO0o = mutableState;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            AnimatedVisibilityScope AnimatedVisibility = animatedVisibilityScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(695948131, iIntValue, -1, "com.yalla.yalla.module.media.music.MusicScreen.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MusicScreen.kt:268)");
            }
            TextKt.m1261Text4IGK_g(o0000.OooO0OO(o000000.Cancel), o0O0O00.OooO0O0(SemanticsModifierKt.semantics$default(PaddingKt.m482paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, Dp.m3775constructorimpl(12), 0.0f, 11, null), false, com.yalla.yalla.module.media.music.OooOO0O.f24122OooO0Oo, 1, null), false, false, 0L, false, null, null, null, new com.yalla.yalla.module.media.music.OooOOO0(this.f24030OooO0Oo, this.f24031OooO0o, this.f24032OooO0o0), 255), o0OOo000.f48146OooOOO0, TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131056);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o00O0O extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<String> f24033OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00O0O(MutableState<String> mutableState) {
            super(0);
            this.f24033OooO0Oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(MusicScreen.Content$lambda$12(this.f24033OooO0Oo).length() > 0);
        }
    }

    @SourceDebugExtension({"SMAP\nMusicScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicScreen.kt\ncom/yalla/yalla/module/media/music/MusicScreen$ListPage$1\n+ 2 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n1#1,667:1\n171#2,12:668\n*S KotlinDebug\n*F\n+ 1 MusicScreen.kt\ncom/yalla/yalla/module/media/music/MusicScreen$ListPage$1\n*L\n543#1:668,12\n*E\n"})
    public static final class o00Oo0 extends Lambda implements Function1<LazyListScope, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ MutableState<MusicTable> f24034OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ List<MusicTable> f24035OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f24036OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f24037OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f24038OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ oo0o0O0 f24039OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ MusicTable f24040OooOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o00Oo0(List<? extends MusicTable> list, boolean z, String str, int i, oo0o0O0 oo0o0o0, MutableState<MusicTable> mutableState, MusicTable musicTable) {
            super(1);
            this.f24035OooO0Oo = list;
            this.f24037OooO0o0 = z;
            this.f24036OooO0o = str;
            this.f24038OooO0oO = i;
            this.f24039OooO0oo = oo0o0o0;
            this.f24034OooO = mutableState;
            this.f24040OooOO0 = musicTable;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(LazyListScope lazyListScope) {
            LazyListScope LazyColumn = lazyListScope;
            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
            final boolean z = this.f24037OooO0o0;
            final String str = this.f24036OooO0o;
            final int i = this.f24038OooO0oO;
            final oo0o0O0 oo0o0o0 = this.f24039OooO0oo;
            final MutableState<MusicTable> mutableState = this.f24034OooO;
            final MusicTable musicTable = this.f24040OooOO0;
            final List<MusicTable> list = this.f24035OooO0Oo;
            LazyColumn.items(list.size(), null, new Function1<Integer, Object>() { // from class: com.yalla.yalla.module.media.music.MusicScreen$ListPage$1$invoke$$inlined$itemsIndexed$default$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Integer num) {
                    list.get(num.intValue());
                    return null;
                }
            }, ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yalla.yalla.module.media.music.MusicScreen$ListPage$1$invoke$$inlined$itemsIndexed$default$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // kotlin.jvm.functions.Function4
                public final Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                    int i2;
                    LazyItemScope items = lazyItemScope;
                    int iIntValue = num.intValue();
                    Composer composer2 = composer;
                    int iIntValue2 = num2.intValue();
                    Intrinsics.checkNotNullParameter(items, "$this$items");
                    if ((iIntValue2 & 14) == 0) {
                        i2 = (composer2.changed(items) ? 4 : 2) | iIntValue2;
                    } else {
                        i2 = iIntValue2;
                    }
                    if ((iIntValue2 & 112) == 0) {
                        i2 |= composer2.changed(iIntValue) ? 32 : 16;
                    }
                    if ((i2 & 731) == 146 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                    } else {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1091073711, i2, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:179)");
                        }
                        MusicTable musicTable2 = (MusicTable) list.get(iIntValue);
                        boolean z2 = z;
                        String str2 = str;
                        OooOOOO oooOOOO = new OooOOOO(oo0o0o0);
                        OooOo00 oooOo00 = new OooOo00(musicTable2);
                        OooOo oooOo = OooOo.f24128OooO0Oo;
                        Oooo000 oooo000 = new Oooo000(musicTable2, mutableState, musicTable, z, list);
                        int i3 = i;
                        OooO0o.OooO0O0(musicTable2, null, z2, str2, oooOOOO, oooOo00, null, oooOo, oooo000, composer2, ((i3 >> 12) & 7168) | (i3 & 896) | 12582920, 66);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                    return Unit.INSTANCE;
                }
            }));
            if (list.isEmpty()) {
                LazyListScope.CC.OooO(LazyColumn, null, null, o0oOOo.f47895OooO00o, 3, null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o00Ooo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ MutableState<MusicTable> f24041OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ List<MusicTable> f24043OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ColumnScope f24044OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f24045OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ oo0o0O0 f24046OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ MusicTable f24047OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f24048OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ String f24049OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final /* synthetic */ int f24050OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final /* synthetic */ int f24051OooOOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o00Ooo(ColumnScope columnScope, List<? extends MusicTable> list, boolean z, oo0o0O0 oo0o0o0, MutableState<MusicTable> mutableState, MusicTable musicTable, MutableState<Boolean> mutableState2, String str, int i, int i2) {
            super(2);
            this.f24044OooO0o0 = columnScope;
            this.f24043OooO0o = list;
            this.f24045OooO0oO = z;
            this.f24046OooO0oo = oo0o0o0;
            this.f24041OooO = mutableState;
            this.f24047OooOO0 = musicTable;
            this.f24048OooOO0O = mutableState2;
            this.f24049OooOO0o = str;
            this.f24051OooOOO0 = i;
            this.f24050OooOOO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            MusicScreen.this.ListPage(this.f24044OooO0o0, this.f24043OooO0o, this.f24045OooO0oO, this.f24046OooO0oo, this.f24041OooO, this.f24047OooOO0, this.f24048OooOO0O, this.f24049OooOO0o, composer, RecomposeScopeImplKt.updateChangedFlags(this.f24051OooOOO0 | 1), this.f24050OooOOO);
            return Unit.INSTANCE;
        }
    }

    public static final class o00oO0o extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o00oO0o f24052OooO0Oo = new o00oO0o();

        public o00oO0o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            return Unit.INSTANCE;
        }
    }

    public static final class o0OO00O extends Lambda implements Function1<Boolean, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1<Object, Unit> f24053OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f24054OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f24055OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ String f24056OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ long f24057OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OO00O(boolean z, boolean z2, String str, long j, Function1 function1) {
            super(1);
            this.f24053OooO0Oo = function1;
            this.f24055OooO0o0 = z;
            this.f24054OooO0o = z2;
            this.f24056OooO0oO = str;
            this.f24057OooO0oo = j;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            if (bool.booleanValue()) {
                MusicScreen musicScreen = MusicScreen.INSTANCE;
                Bundle bundleOooO00o = p063o0000oO.o000oOoO.OooO00o();
                bundleOooO00o.putBoolean("isFromVideo", this.f24054OooO0o);
                bundleOooO00o.putString("titleKey", this.f24056OooO0oO);
                bundleOooO00o.putLong("startPosition", this.f24057OooO0oo);
                o00O00.OooO0o0(musicScreen, bundleOooO00o, false, this.f24053OooO0Oo, 4);
                if (this.f24055OooO0o0) {
                    o00O00.OooO0o0(MusicAddScreen.INSTANCE, null, false, null, 14);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o0OOO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f24058OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ oo0o0O0 f24060OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MusicTable f24061OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableState<MusicTable> f24062OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ List<MusicTable> f24063OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ int f24064OooOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o0OOO0o(MusicTable musicTable, oo0o0O0 oo0o0o0, MutableState<MusicTable> mutableState, List<? extends MusicTable> list, MutableState<Boolean> mutableState2, int i) {
            super(2);
            this.f24061OooO0o0 = musicTable;
            this.f24060OooO0o = oo0o0o0;
            this.f24062OooO0oO = mutableState;
            this.f24063OooO0oo = list;
            this.f24058OooO = mutableState2;
            this.f24064OooOO0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            MusicScreen.this.MusicPopWindow(this.f24061OooO0o0, this.f24060OooO0o, this.f24062OooO0oO, this.f24063OooO0oo, this.f24058OooO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f24064OooOO0 | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class o0Oo0oo extends Lambda implements Function1<List<MusicTable>, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ oo0o0O0 f24065OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0Oo0oo(oo0o0O0 oo0o0o0) {
            super(1);
            this.f24065OooO0Oo = oo0o0o0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<MusicTable> list) {
            this.f24065OooO0Oo.f56700OooO0Oo.postValue(list);
            return Unit.INSTANCE;
        }
    }

    public static final class o0OoOo0 extends Lambda implements Function1<Long, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ oo0o0O0 f24066OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Function0<Unit>> f24067OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OoOo0(oo0o0O0 oo0o0o0, MutableState<Function0<Unit>> mutableState) {
            super(1);
            this.f24066OooO0Oo = oo0o0o0;
            this.f24067OooO0o0 = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Long l) {
            long jLongValue = l.longValue();
            p363o0OOo00O.OooO0o oooO0o = o00OOO00.f47803OooO00o;
            oo0o0O0 oo0o0o0 = this.f24066OooO0Oo;
            String mPath = oo0o0o0.OooO0OO().mPath;
            Intrinsics.checkNotNullExpressionValue(mPath, "mPath");
            o00OOO00.OooO00o(mPath, false, Long.valueOf(jLongValue), Long.valueOf(oo0o0o0.OooO0OO().mDuration), new com.yalla.yalla.module.media.music.OooOOO(this.f24067OooO0o0), 6);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nMusicScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicScreen.kt\ncom/yalla/yalla/module/media/music/MusicScreen$MusicPopWindow$3\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,667:1\n154#2:668\n154#2:704\n154#2:705\n154#2:708\n154#2:775\n154#2:776\n154#2:817\n154#2:818\n154#2:819\n154#2:820\n154#2:831\n66#3,6:669\n72#3:703\n76#3:836\n78#4,11:675\n78#4,11:711\n78#4,11:746\n91#4:780\n78#4,11:788\n91#4:824\n91#4:829\n91#4:835\n456#5,8:686\n464#5,3:700\n456#5,8:722\n464#5,3:736\n456#5,8:757\n464#5,3:771\n467#5,3:777\n456#5,8:799\n464#5,3:813\n467#5,3:821\n467#5,3:826\n467#5,3:832\n4144#6,6:694\n4144#6,6:730\n4144#6,6:765\n4144#6,6:807\n76#7:706\n76#7:707\n77#8,2:709\n79#8:739\n73#8,6:740\n79#8:774\n83#8:781\n73#8,6:782\n79#8:816\n83#8:825\n83#8:830\n*S KotlinDebug\n*F\n+ 1 MusicScreen.kt\ncom/yalla/yalla/module/media/music/MusicScreen$MusicPopWindow$3\n*L\n383#1:668\n412#1:704\n413#1:705\n442#1:708\n459#1:775\n465#1:776\n477#1:817\n489#1:818\n494#1:819\n510#1:820\n517#1:831\n381#1:669,6\n381#1:703\n381#1:836\n381#1:675,11\n440#1:711,11\n456#1:746,11\n456#1:780\n470#1:788,11\n470#1:824\n440#1:829\n381#1:835\n381#1:686,8\n381#1:700,3\n440#1:722,8\n440#1:736,3\n456#1:757,8\n456#1:771,3\n456#1:777,3\n470#1:799,8\n470#1:813,3\n470#1:821,3\n440#1:826,3\n381#1:832,3\n381#1:694,6\n440#1:730,6\n456#1:765,6\n470#1:807,6\n419#1:706\n421#1:707\n440#1:709,2\n440#1:739\n456#1:740,6\n456#1:774\n456#1:781\n470#1:782,6\n470#1:816\n470#1:825\n440#1:830\n*E\n"})
    public static final class o0ooOOo extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MusicTable f24068OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ List<MusicTable> f24069OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<MusicTable> f24070OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ oo0o0O0 f24071OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f24072OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o0ooOOo(MusicTable musicTable, MutableState<MusicTable> mutableState, List<? extends MusicTable> list, oo0o0O0 oo0o0o0, MutableState<Boolean> mutableState2) {
            super(3);
            this.f24068OooO0Oo = musicTable;
            this.f24070OooO0o0 = mutableState;
            this.f24069OooO0o = list;
            this.f24071OooO0oO = oo0o0o0;
            this.f24072OooO0oo = mutableState2;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            AnimatedVisibilityScope AnimatedVisibility = animatedVisibilityScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-390986173, iIntValue, -1, "com.yalla.yalla.module.media.music.MusicScreen.MusicPopWindow.<anonymous> (MusicScreen.kt:379)");
            }
            MusicTable musicTable = this.f24068OooO0Oo;
            String mPath = musicTable.mPath;
            Intrinsics.checkNotNullExpressionValue(mPath, "mPath");
            Bitmap bitmapOooO0O0 = O0OO00.OooO0O0(mPath);
            Modifier.Companion companion = Modifier.INSTANCE;
            float f = 52;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m511height3ABfNKs(companion, Dp.m3775constructorimpl(f)), 0.0f, 1, null);
            MutableState<MusicTable> mutableState = this.f24070OooO0o0;
            List<MusicTable> list = this.f24069OooO0o;
            Modifier modifierOooO0O0 = o0O0O00.OooO0O0(modifierFillMaxWidth$default, false, false, 0L, false, null, null, null, new com.yalla.yalla.module.media.music.Oooo0(mutableState, musicTable, list), 255);
            composer2.startReplaceableGroup(733328855);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO00o = androidx.compose.animation.Oooo000.OooO00o(companion2, false, composer2, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierOooO0O0);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (bitmapOooO0O0 == null) {
                composer2.startReplaceableGroup(413009600);
                float f2 = 10;
                ImageKt.Image(PainterResources_androidKt.painterResource(p562o0oOo000.o0O0O00.ic_music_pop_bg, composer2, 0), (String) null, BlurKt.m1340blur1fqSgw$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(f2), Dp.m3775constructorimpl(f2), null, 4, null), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composer2, 25016, 104);
                composer2.endReplaceableGroup();
            } else {
                composer2.startReplaceableGroup(413010115);
                coil.request.OooO00o.C0189OooO00o c0189OooO00o = new coil.request.OooO00o.C0189OooO00o((Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
                c0189OooO00o.f11680OooO0OO = bitmapOooO0O0;
                c0189OooO00o.f11690OooOOO0 = o00OO00O.OooO0O0.OooO00o(ArraysKt.toList(new o00O.OooO0OO[]{new o00O.OooO0O0((Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext()))}));
                o000O000.OooO00o(c0189OooO00o.OooO00o(), "icon", SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), null, null, null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, composer2, 1573304, 952);
                composer2.endReplaceableGroup();
            }
            Modifier modifierBackground$default = BackgroundKt.background$default(SizeKt.fillMaxWidth$default(SizeKt.m511height3ABfNKs(companion, Dp.m3775constructorimpl(f)), 0.0f, 1, null), Brush.Companion.m1638linearGradientmHitzGk$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m1671boximpl(o0OOo000.f48158OooOoO0), Color.m1671boximpl(o0OOo000.f48161OooOoo0), Color.m1671boximpl(o0OOo000.f48163OooOooo)}), 0L, 0L, 0, 14, (Object) null), null, 0.0f, 6, null);
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
            composer2.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer2, 54);
            composer2.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierBackground$default);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor2);
            } else {
                composer2.useNode();
            }
            Composer composerM1320constructorimpl2 = Updater.m1320constructorimpl(composer2);
            Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyRowMeasurePolicy, composerM1320constructorimpl2, currentCompositionLocalMap2);
            if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier modifierWrapContentWidth$default = SizeKt.wrapContentWidth$default(companion, null, false, 3, null);
            composer2.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO00o2 = androidx.compose.material.OooOO0O.OooO00o(companion2, arrangement.getStart(), composer2, 0, -1323940314);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierWrapContentWidth$default);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor3);
            } else {
                composer2.useNode();
            }
            Composer composerM1320constructorimpl3 = Updater.m1320constructorimpl(composer2);
            Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl3, measurePolicyOooO00o2, composerM1320constructorimpl3, currentCompositionLocalMap3);
            if (composerM1320constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
            com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(100), null, composer2, 6, 2);
            String str = musicTable.mDisplayName;
            long sp = TextUnitKt.getSp(16);
            long j = o0OOo000.f48135OooO0O0;
            FontWeight medium = FontWeight.INSTANCE.getMedium();
            Modifier modifierM532widthInVpY3zN4$default = SizeKt.m532widthInVpY3zN4$default(companion, 0.0f, Dp.m3775constructorimpl(Constants.ERR_ALREADY_IN_RECORDING), 1, null);
            int iM3729getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8();
            Intrinsics.checkNotNull(str);
            TextKt.m1261Text4IGK_g(str, modifierM532widthInVpY3zN4$default, j, sp, (FontStyle) null, medium, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, iM3729getEllipsisgIe3tQ8, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199728, 3120, 120784);
            o000O.o0ooOOo.OooO00o(composer2);
            Modifier modifierWrapContentWidth$default2 = SizeKt.wrapContentWidth$default(companion, null, false, 3, null);
            composer2.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO00o3 = androidx.compose.material.OooOO0O.OooO00o(companion2, arrangement.getStart(), composer2, 0, -1323940314);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierWrapContentWidth$default2);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor4);
            } else {
                composer2.useNode();
            }
            Composer composerM1320constructorimpl4 = Updater.m1320constructorimpl(composer2);
            Function2 function2OooO00o4 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl4, measurePolicyOooO00o3, composerM1320constructorimpl4, currentCompositionLocalMap4);
            if (composerM1320constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash4, composerM1320constructorimpl4, currentCompositeKeyHash4, function2OooO00o4);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf4, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
            float f3 = 24;
            ImageKt.Image(PainterResources_androidKt.painterResource(p562o0oOo000.o0O0O00.ic_music_clip, composer2, 0), (String) null, o0O0O00.OooO0O0(SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(f3)), false, false, 0L, false, null, null, null, new com.yalla.yalla.module.media.music.o000oOoO(list, this.f24071OooO0oO, musicTable), 255), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
            com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(12), null, composer2, 6, 2);
            ImageKt.Image(PainterResources_androidKt.painterResource(p562o0oOo000.o0O0O00.ic_music_delete, composer2, 0), (String) null, o0O0O00.OooO0O0(SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(f3)), false, false, 0L, false, null, null, null, new com.yalla.yalla.module.media.music.o0OoOo0(this.f24072OooO0oo, musicTable, list), 255), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
            com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(f3), null, composer2, 6, 2);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            com.yalla.yalla.module.media.music.OooO0o.OooO00o(musicTable, false, boxScopeInstance.align(PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(f3), 0.0f, 0.0f, Dp.m3775constructorimpl(18), 6, null), companion2.getBottomStart()), j, bitmapOooO0O0, composer2, 32824, 0);
            if (androidx.compose.material.OooO0o.OooO00o(composer2)) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class oo000o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f24073OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ oo0o0O0 f24075OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MusicTable f24076OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableState<MusicTable> f24077OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ List<MusicTable> f24078OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ int f24079OooOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public oo000o(MusicTable musicTable, oo0o0O0 oo0o0o0, MutableState<MusicTable> mutableState, List<? extends MusicTable> list, MutableState<Boolean> mutableState2, int i) {
            super(2);
            this.f24076OooO0o0 = musicTable;
            this.f24075OooO0o = oo0o0o0;
            this.f24077OooO0oO = mutableState;
            this.f24078OooO0oo = list;
            this.f24073OooO = mutableState2;
            this.f24079OooOO0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            MusicScreen.this.MusicPopWindow(this.f24076OooO0o0, this.f24075OooO0o, this.f24077OooO0oO, this.f24078OooO0oo, this.f24073OooO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f24079OooOO0 | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class oo0o0Oo extends Lambda implements Function0<Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MusicTable f24080OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public oo0o0Oo(MusicTable musicTable) {
            super(0);
            this.f24080OooO0Oo = musicTable;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Object invoke() {
            o0oo0000.OooO00o.OooO0O0("102142");
            boolean z = oO0O00.f53970OooO00o;
            MusicTable music = this.f24080OooO0Oo;
            Intrinsics.checkNotNullParameter(music, "music");
            oO0O00.OooO00o(CollectionsKt.mutableListOf(music));
            return null;
        }
    }

    private MusicScreen() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void BottomArea(BoxScope boxScope, MusicTable musicTable, oo0o0O0 oo0o0o0, MutableState<MusicTable> mutableState, List<? extends MusicTable> list, MutableState<Boolean> mutableState2, Composer composer, int i, int i2) {
        Composer composerStartRestartGroup = composer.startRestartGroup(478879872);
        MusicTable musicTable2 = (i2 & 1) != 0 ? null : musicTable;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(478879872, i, -1, "com.yalla.yalla.module.media.music.MusicScreen.BottomArea (MusicScreen.kt:336)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Alignment.Companion companion2 = Alignment.INSTANCE;
        Modifier modifierAlign = boxScope.align(companion, companion2.getBottomCenter());
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        Arrangement arrangement = Arrangement.INSTANCE;
        MeasurePolicy measurePolicyOooO0O0 = o0O00oO0.OooO0O0(companion2, arrangement.getTop(), composerStartRestartGroup, 0, -1323940314);
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
        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO0O0, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        int i3 = i >> 3;
        INSTANCE.MusicPopWindow(musicTable2, oo0o0o0, mutableState, list, mutableState2, composerStartRestartGroup, (i3 & 112) | 266312 | (i3 & 896) | (i3 & 57344));
        int i4 = o0OOo000.f48347o00OOooO;
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m511height3ABfNKs(BackgroundKt.m171backgroundbw27NRU$default(companion, o0OOo000.f48200o000000o, null, 2, null), Dp.m3775constructorimpl(60)), 0.0f, 1, null);
        Alignment.Vertical centerVertically = companion2.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyOooO0O1 = androidx.compose.material.OooO0OO.OooO0O0(arrangement, centerVertically, composerStartRestartGroup, 48, -1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor2);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyOooO0O1, composerM1320constructorimpl2, currentCompositionLocalMap2);
        if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        o00O0OO0.OooO00o(StringResources_androidKt.stringResource(o000000.add_music, composerStartRestartGroup, 0), o0000O0.OooO0OO(15, composerStartRestartGroup, 6), null, null, Color.m1671boximpl(o0OOo000.f48135OooO0O0), Color.m1671boximpl(o0OOo000.f48193Ooooooo), null, 0.0f, null, false, false, 0L, false, null, null, null, null, null, SizeKt.fillMaxSize$default(PaddingKt.m479paddingVpY3zN4(companion, Dp.m3775constructorimpl(16), Dp.m3775constructorimpl(10)), 0.0f, 1, null), OooO00o.f23997OooO0Oo, composerStartRestartGroup, 0, 905969664, 262092);
        if (com.facebook.appevents.OooOOO0.OooO0O0(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(boxScope, musicTable2, oo0o0o0, mutableState, list, mutableState2, i, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<MusicTable> Content$lambda$10(State<? extends List<MusicTable>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String Content$lambda$12(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Content$lambda$13(MutableState<String> mutableState, String str) {
        mutableState.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Content$lambda$15(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MusicTable Content$lambda$4(MutableState<MusicTable> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void ListPage(ColumnScope columnScope, List<? extends MusicTable> list, boolean z, oo0o0O0 oo0o0o0, MutableState<MusicTable> mutableState, MusicTable musicTable, MutableState<Boolean> mutableState2, String str, Composer composer, int i, int i2) {
        Composer composerStartRestartGroup = composer.startRestartGroup(266925113);
        MusicTable musicTable2 = (i2 & 16) != 0 ? null : musicTable;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(266925113, i, -1, "com.yalla.yalla.module.media.music.MusicScreen.ListPage (MusicScreen.kt:536)");
        }
        LazyDslKt.LazyColumn(androidx.compose.foundation.layout.OooOO0.OooO00o(columnScope, PaddingKt.m482paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl(mutableState2.getValue().booleanValue() ? 112 : 60), 7, null), 1.0f, false, 2, null), null, null, false, null, null, null, false, new o00Oo0(list, z, str, i, oo0o0o0, mutableState, musicTable2), composerStartRestartGroup, 0, 254);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o00Ooo(columnScope, list, z, oo0o0o0, mutableState, musicTable2, mutableState2, str, i, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void MusicPopWindow(MusicTable musicTable, oo0o0O0 oo0o0o0, MutableState<MusicTable> mutableState, List<? extends MusicTable> list, MutableState<Boolean> mutableState2, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(99054107);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(99054107, i, -1, "com.yalla.yalla.module.media.music.MusicScreen.MusicPopWindow (MusicScreen.kt:375)");
        }
        if (musicTable == null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new oo000o(musicTable, oo0o0o0, mutableState, list, mutableState2, i));
            return;
        }
        AnimatedVisibilityKt.AnimatedVisibility(mutableState2.getValue().booleanValue(), SemanticsModifierKt.semantics$default(Modifier.INSTANCE, false, o00oO0o.f24052OooO0Oo, 1, null), (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -390986173, true, new o0ooOOo(musicTable, mutableState, list, oo0o0o0, mutableState2)), composerStartRestartGroup, 196608, 28);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new o0OOO0o(musicTable, oo0o0o0, mutableState, list, mutableState2, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleSearchResult(String searchText, oo0o0O0 musicViewModel, AppCompatActivity activity) {
        if (!(searchText.length() > 0)) {
            musicViewModel.f56700OooO0Oo.postValue(musicViewModel.f56702OooO0o0);
            return;
        }
        CopyOnWriteArrayList<MusicTable> copyOnWriteArrayList = musicViewModel.f56702OooO0o0;
        copyOnWriteArrayList.clear();
        List list = (List) MusicState.OooO00o().getValue();
        if (list != null) {
            copyOnWriteArrayList.addAll(list);
        }
        Intrinsics.checkNotNullParameter(searchText, "keyword");
        com.code.android.util.o00oO0o.OooO00o(new oo0oOO0(searchText, musicViewModel, null)).observe(activity, new o0O00OOO(new o0Oo0oo(musicViewModel)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void navigate$default(MusicScreen musicScreen, boolean z, boolean z2, String str, long j, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            j = 0;
        }
        if ((i & 16) != 0) {
            function1 = null;
        }
        musicScreen.navigate(z, z2, str, j, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sureDeleteMusic(MusicTable deleteMusic) {
        Context context = o000O00O.f13421OooO00o;
        Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
        if (activityOooO0O0 != null) {
            o000O o000o = new o000O(activityOooO0O0);
            o000o.OooOo00(o0000.OooO0OO(o000000.Sure_delete_selected_music));
            o000o.OooOo(true);
            o000o.OooOo0(new oo0o0Oo(deleteMusic));
            o000o.OooOO0o();
        }
    }

    /* JADX WARN: Failed to extract var names
    jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r14v5 ??
    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
    	at jadx.core.dex.visitors.kotlin.ProcessKotlinInternals.checkAndRename(ProcessKotlinInternals.java:142)
    	at jadx.core.dex.visitors.kotlin.ProcessKotlinInternals.processInvoke(ProcessKotlinInternals.java:125)
    	at jadx.core.dex.visitors.kotlin.ProcessKotlinInternals.processMth(ProcessKotlinInternals.java:98)
    	at jadx.core.dex.visitors.kotlin.ProcessKotlinInternals.visit(ProcessKotlinInternals.java:85)
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v47 */
    @Override // p532o0o0OOo0.o000O0
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public void Content(@NotNull ColumnScope columnScope, @Nullable Composer composer, int i) {
        int i2;
        AppCompatActivity appCompatActivity;
        oo0o0O0 oo0o0o0;
        String str;
        Context context;
        MutableState mutableState;
        boolean z;
        String str2;
        Composer composer2;
        int i3;
        Integer numValueOf;
        int size;
        Intrinsics.checkNotNullParameter(columnScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(478134427);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(478134427, i, -1, "com.yalla.yalla.module.media.music.MusicScreen.Content (MusicScreen.kt:107)");
            }
            Bundle bundleOooO0O0 = o00O00O.OooO0O0((NavBackStackEntry) composerStartRestartGroup.consume(o00O00O.f53500OooO00o), composerStartRestartGroup);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(bundleOooO0O0);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = bundleOooO0O0.get("isFromVideo");
                Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
                objRememberedValue = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            boolean zBooleanValue = ((Boolean) objRememberedValue).booleanValue();
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged2 = composerStartRestartGroup.changed(bundleOooO0O0);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = bundleOooO0O0.get("titleKey");
                objRememberedValue2 = obj2 instanceof String ? (String) obj2 : null;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            String mPath = (String) objRememberedValue2;
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged3 = composerStartRestartGroup.changed(bundleOooO0O0);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object obj3 = bundleOooO0O0.get("startPosition");
                Long l = obj3 instanceof Long ? (Long) obj3 : null;
                objRememberedValue3 = Long.valueOf(l != null ? l.longValue() : 0L);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            long jLongValue = ((Number) objRememberedValue3).longValue();
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState2 = (MutableState) objRememberedValue4;
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(oo0o0O0.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            oo0o0O0 oo0o0o1 = (oo0o0O0) viewModel;
            composerStartRestartGroup.startReplaceableGroup(-100970361);
            if (mPath != null) {
                oo0o0o1.getClass();
                Intrinsics.checkNotNullParameter(mPath, "mPath");
                mutableState2.setValue((MusicTable) LiveDataAdapterKt.observeAsState(com.code.android.util.o00oO0o.OooO00o(new o00O0OOO(mPath, null)), composerStartRestartGroup, 8).getValue());
                Unit unit = Unit.INSTANCE;
            }
            composerStartRestartGroup.endReplaceableGroup();
            Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                MutableState mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default);
                i2 = 2;
                objRememberedValue5 = mutableStateMutableStateOf$default;
            } else {
                i2 = 2;
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState<MusicTable> mutableState3 = (MutableState) objRememberedValue5;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, i2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState4 = (MutableState) objRememberedValue6;
            o0OoOo0 o0oooo1 = new o0OoOo0(oo0o0o1, mutableState4);
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue7 == companion.getEmpty()) {
                objRememberedValue7 = SnapshotLongStateKt.mutableLongStateOf(0L);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableLongState mutableLongState = (MutableLongState) objRememberedValue7;
            State stateObserveAsState = LiveDataAdapterKt.observeAsState(oo0o0o1.f56700OooO0Oo, composerStartRestartGroup, 8);
            Object objConsume = composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Intrinsics.checkNotNull(objConsume, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            AppCompatActivity appCompatActivity2 = (AppCompatActivity) objConsume;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue8 == companion.getEmpty()) {
                objRememberedValue8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState5 = (MutableState) objRememberedValue8;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue9 == companion.getEmpty()) {
                objRememberedValue9 = SnapshotStateKt.derivedStateOf(new o00O0O(mutableState5));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
            }
            composerStartRestartGroup.endReplaceableGroup();
            State state = (State) objRememberedValue9;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue10 == companion.getEmpty()) {
                objRememberedValue10 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState<Boolean> mutableState6 = (MutableState) objRememberedValue10;
            if (Content$lambda$4(mutableState2) != null) {
                mutableState6.setValue(Boolean.TRUE);
            }
            EffectsKt.LaunchedEffect(Content$lambda$4(mutableState2), new OooO0o(mutableState2, oo0o0o1, mutableLongState, jLongValue, null), composerStartRestartGroup, 72);
            Unit unit2 = Unit.INSTANCE;
            boolean zOooO00o = androidx.compose.foundation.gestures.OooO0OO.OooO00o(zBooleanValue, composerStartRestartGroup, 511388516) | composerStartRestartGroup.changed(stateObserveAsState);
            Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
            if (zOooO00o || objRememberedValue11 == companion.getEmpty()) {
                objRememberedValue11 = new OooO(zBooleanValue, stateObserveAsState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.DisposableEffect(unit2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue11, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-100968605);
            if (zBooleanValue) {
                MutableState<Boolean> mutableState7 = oo0o0o1.f56698OooO0O0;
                String str3 = oo0o0o1.OooO0OO().mDisplayName;
                if (str3 == null) {
                    str3 = "";
                }
                long j = oo0o0o1.OooO0OO().mDuration;
                String str4 = oo0o0o1.OooO0OO().mPath;
                MusicTable musicTableContent$lambda$4 = Content$lambda$4(mutableState2);
                long jLongValue2 = Intrinsics.areEqual(str4, musicTableContent$lambda$4 != null ? musicTableContent$lambda$4.mPath : null) ? mutableLongState.getValue().longValue() : 0L;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                boolean zChanged4 = composerStartRestartGroup.changed(o0oooo1);
                Object objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                if (zChanged4 || objRememberedValue12 == companion.getEmpty()) {
                    objRememberedValue12 = new OooOO0(o0oooo1);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function1 function1 = (Function1) objRememberedValue12;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                boolean zChanged5 = composerStartRestartGroup.changed(o0oooo1);
                Object objRememberedValue13 = composerStartRestartGroup.rememberedValue();
                if (zChanged5 || objRememberedValue13 == companion.getEmpty()) {
                    objRememberedValue13 = new OooOO0O(o0oooo1);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function1 function2 = (Function1) objRememberedValue13;
                composerStartRestartGroup.startReplaceableGroup(511388516);
                boolean zChanged6 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(stateObserveAsState);
                Object objRememberedValue14 = composerStartRestartGroup.rememberedValue();
                if (zChanged6 || objRememberedValue14 == companion.getEmpty()) {
                    objRememberedValue14 = new OooOOO0(mutableState2, stateObserveAsState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
                }
                composerStartRestartGroup.endReplaceableGroup();
                z = false;
                long j2 = jLongValue2;
                appCompatActivity = appCompatActivity2;
                str = "";
                context = context2;
                oo0o0o0 = oo0o0o1;
                mutableState = mutableState5;
                mutableState4.setValue(o00O00o0.OooO00o(mutableState7, str3, j, j2, function1, function2, (Function1) objRememberedValue14, OooOOO.f24016OooO0Oo, new OooOOOO(oo0o0o1), composerStartRestartGroup, 100663296));
            } else {
                appCompatActivity = appCompatActivity2;
                oo0o0o0 = oo0o0o1;
                str = "";
                context = context2;
                mutableState = mutableState5;
                z = false;
            }
            ?? r2 = z;
            composerStartRestartGroup.endReplaceableGroup();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierM171backgroundbw27NRU$default = BackgroundKt.m171backgroundbw27NRU$default(WindowInsetsPadding_androidKt.statusBarsPadding(companion2), o0OOo000.f48183OoooOoO, null, 2, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO00o = androidx.compose.animation.Oooo000.OooO00o(companion3, r2, composerStartRestartGroup, r2, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, r2);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM171backgroundbw27NRU$default);
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
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion4, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(r2, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyOooO0O0 = o0O00oO0.OooO0O0(companion3, arrangement.getTop(), composerStartRestartGroup, r2, -1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, r2);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
            Composer composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion4, composerM1320constructorimpl2, measurePolicyOooO0O0, composerM1320constructorimpl2, currentCompositionLocalMap2);
            if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            androidx.compose.animation.OooOO0.OooO00o(r2, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            String strOooO0OO = o0000.OooO0OO(o000000.title_activity_music);
            List<MusicTable> listContent$lambda$10 = Content$lambda$10(stateObserveAsState);
            ?? r3 = r2;
            if (listContent$lambda$10 != null) {
                size = listContent$lambda$10.size();
            }
            if (r3 > 0) {
                List<MusicTable> listContent$lambda$11 = Content$lambda$10(stateObserveAsState);
                if (listContent$lambda$11 != null) {
                    r3 = size;
                    numValueOf = Integer.valueOf(listContent$lambda$11.size());
                } else {
                    r3 = size;
                    numValueOf = null;
                }
                str2 = "(" + numValueOf + ")";
            } else {
                r3 = size;
                str2 = str;
            }
            o0O0oo0o.OooO00o(androidx.camera.core.impl.OooOOOO.OooO00o(strOooO0OO, str2), 0.0f, o0OOo000.f48135OooO0O0, null, null, null, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 3666110, true, new OooOo00(state, zBooleanValue)), null, composerStartRestartGroup, 12582912, 378);
            Alignment.Vertical centerVertically = companion3.getCenterVertically();
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO0O1 = androidx.compose.material.OooO0OO.OooO0O0(arrangement, centerVertically, composerStartRestartGroup, 48, -1323940314);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1320constructorimpl3 = Updater.m1320constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion4, composerM1320constructorimpl3, measurePolicyOooO0O1, composerM1320constructorimpl3, currentCompositionLocalMap3);
            if (composerM1320constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            AppCompatActivity appCompatActivity3 = appCompatActivity;
            oo0o0O0 oo0o0o2 = oo0o0o0;
            MutableState mutableState8 = mutableState;
            o0OoO00O.f51610OooO00o.OooO00o(null, new OooOo(appCompatActivity3, mutableState8, oo0o0o2), new Oooo000(context, appCompatActivity3, oo0o0o2, mutableState8), Oooo0.f24025OooO0Oo, o0000.OooO0OO(o000000.Search_for_artists_or_songs), 0L, false, o0OOo000.f48283o000ooO0, null, 0, null, null, androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, companion2, 1.0f, false, 2, null), o0OOo000.f48140OooO0oO, o0OOo000.f48148OooOOOo, p562o0oOo000.o0O0O00.ic_music_search_clear, composerStartRestartGroup, 3072, o0OoO00O.f51612OooO0OO << 18, 3937);
            AnimatedVisibilityKt.AnimatedVisibility(rowScopeInstance, Content$lambda$15(state), (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 695948131, true, new o000oOoO(appCompatActivity3, mutableState8, oo0o0o2)), composerStartRestartGroup, 1572870, 30);
            o000O.o0ooOOo.OooO00o(composerStartRestartGroup);
            List<MusicTable> listContent$lambda$12 = Content$lambda$10(stateObserveAsState);
            composerStartRestartGroup.startReplaceableGroup(920816317);
            if (listContent$lambda$12 != null) {
                INSTANCE.ListPage(columnScopeInstance, listContent$lambda$12, zBooleanValue, oo0o0o2, mutableState3, Content$lambda$4(r2), r18, Content$lambda$12(mutableState8), composerStartRestartGroup, 136081478, 0);
                Unit unit3 = Unit.INSTANCE;
            }
            r13.endReplaceableGroup();
            r13.endReplaceableGroup();
            r13.endNode();
            r13.endReplaceableGroup();
            r13.endReplaceableGroup();
            composer2 = composerStartRestartGroup;
            composer2.startReplaceableGroup(-100963068);
            if (Content$lambda$15(state)) {
                i3 = 0;
            } else {
                INSTANCE.BottomArea(boxScopeInstance, Content$lambda$4(mutableState2), oo0o0o2, mutableState3, Content$lambda$10(stateObserveAsState), mutableState6, composer2, 2330182, 0);
                Intrinsics.checkNotNullParameter(r14, "activity");
                Object systemService = r14.getSystemService("input_method");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                i3 = 0;
                ((InputMethodManager) systemService).hideSoftInputFromWindow(appCompatActivity3.findViewById(R.id.content).getWindowToken(), 0);
            }
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            o00000OO.OooO0O0(true, composer2, 6, i3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(columnScope, i));
    }

    @Override // p532o0o0OOo0.o000O0
    @Composable
    /* JADX INFO: renamed from: getWindowBackgroundColor-WaAFU9c */
    public long mo4200getWindowBackgroundColorWaAFU9c(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-1021949034);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1021949034, i, -1, "com.yalla.yalla.module.media.music.MusicScreen.getWindowBackgroundColor (MusicScreen.kt:102)");
        }
        int i2 = o0OOo000.f48347o00OOooO;
        long j = o0OOo000.f48183OoooOoO;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return j;
    }

    public final void navigate(boolean isToAdd, boolean isFromVideo, @Nullable String path, long startPosition, @Nullable Function1<Object, Unit> onResult) {
        Context context = o000O00O.f13421OooO00o;
        Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
        if (activityOooO0O0 != null) {
            com.yalla.yalla.util.permission.OooO00o.OooO0OO(activityOooO0O0, PermissionGroupReveal.f32338OooO0Oo, null, new o0OO00O(isToAdd, isFromVideo, path, startPosition, onResult));
        }
    }
}
