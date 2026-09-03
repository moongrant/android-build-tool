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
import com.code.android.util.o000O0;
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
import o000O00.o00000O;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoo.o000O00;
import p148o00Oo0o.o00000O0;
import p150o00Oo0oO.o00000OO;
import p321o0O0ooO.o000;
import p449o0Ooo0.o000OO0O;
import p449o0Ooo0.o00O00OO;
import p449o0Ooo0.o00O00o0;
import p468o0OoooO0.o0OOo000;
import p469o0OoooOO.o0oO0O0o;
import p507o0o00ooo.j1;
import p507o0o00ooo.t1;
import p526o0o0OOO0.o00O;
import p526o0o0OOO0.o00O00O;
import p526o0o0OOO0.oo0oOO0;
import p528o0o0OOOo.oOO0;
import p575o0oOoOo.o0O0o00O;
import p575o0oOoOo.o0O0oo00;
import p575o0oOoOo.o0oOo0O0;
import p578o0oOoOoo.d;
import p579o0oOoo.oOo00ooO;
import p584o0oOooO0.oO00OOO;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b.\u0010/J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002JU\u0010\u0013\u001a\u00020\b*\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\r2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\rH\u0003¢\u0006\u0004\b\u0013\u0010\u0014JO\u0010\u0016\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\r2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\rH\u0003¢\u0006\u0004\b\u0016\u0010\u0017Jc\u0010\u001a\u001a\u00020\b*\u00020\u00182\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f2\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\r2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u000bH\u0002J\u0018\u0010!\u001a\u00020\u001eH\u0017ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010\"\u001a\u00020\b*\u00020\u0018H\u0017¢\u0006\u0004\b\"\u0010#JL\u0010+\u001a\u00020\b2\b\b\u0002\u0010$\u001a\u00020\u00112\b\b\u0002\u0010\u0019\u001a\u00020\u00112\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010'\u001a\u00020&2\u001a\b\u0002\u0010*\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010)\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010(R$\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00060"}, d2 = {"Lcom/yalla/yalla/module/media/music/MusicScreen;", "Lo0o0OOO0/o00O00O;", "", "searchText", "Lo0oOoOo/o0O0o00O;", "musicViewModel", "Landroidx/appcompat/app/AppCompatActivity;", "activity", "", "handleSearchResult", "Landroidx/compose/foundation/layout/BoxScope;", "Lcom/yalla/yalla/data/db/model/MusicTable;", "selectedMusic", "Landroidx/compose/runtime/MutableState;", "lastPlayingItem", "", "musicList", "", "isPopVisible", "BottomArea", "(Landroidx/compose/foundation/layout/BoxScope;Lcom/yalla/yalla/data/db/model/MusicTable;Lo0oOoOo/o0O0o00O;Landroidx/compose/runtime/MutableState;Ljava/util/List;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/Composer;II)V", "playingSong", "MusicPopWindow", "(Lcom/yalla/yalla/data/db/model/MusicTable;Lo0oOoOo/o0O0o00O;Landroidx/compose/runtime/MutableState;Ljava/util/List;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/foundation/layout/ColumnScope;", "isFromVideo", "ListPage", "(Landroidx/compose/foundation/layout/ColumnScope;Ljava/util/List;ZLo0oOoOo/o0O0o00O;Landroidx/compose/runtime/MutableState;Lcom/yalla/yalla/data/db/model/MusicTable;Landroidx/compose/runtime/MutableState;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "deleteMusic", "sureDeleteMusic", "Landroidx/compose/ui/graphics/Color;", "getWindowBackgroundColor-WaAFU9c", "(Landroidx/compose/runtime/Composer;I)J", "getWindowBackgroundColor", "Content", "(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V", "isToAdd", "path", "", "startPosition", "Lkotlin/Function1;", "", "onResult", "navigate", "searchTextSetter", "Lkotlin/jvm/functions/Function1;", "<init>", "()V", "Media_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMusicScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicScreen.kt\ncom/yalla/yalla/module/media/music/MusicScreen\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 10 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 11 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 12 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,669:1\n76#2:670\n76#2:710\n76#2:732\n36#3:671\n36#3:678\n36#3:685\n25#3:692\n25#3:711\n25#3:718\n25#3:725\n25#3:733\n25#3:740\n25#3:747\n50#3:754\n49#3:755\n36#3:762\n36#3:769\n50#3:776\n49#3:777\n456#3,8:801\n464#3,3:815\n456#3,8:836\n464#3,3:850\n456#3,8:871\n464#3,3:885\n467#3,3:889\n467#3,3:894\n467#3,3:899\n456#3,8:921\n464#3,3:935\n456#3,8:957\n464#3,3:971\n467#3,3:976\n467#3,3:981\n1097#4,6:672\n1097#4,6:679\n1097#4,6:686\n1097#4,6:693\n1097#4,6:712\n1097#4,6:719\n1097#4,6:726\n1097#4,6:734\n1097#4,6:741\n1097#4,6:748\n1097#4,6:756\n1097#4,6:763\n1097#4,6:770\n1097#4,6:778\n81#5,11:699\n66#6,6:784\n72#6:818\n76#6:903\n78#7,11:790\n78#7,11:825\n78#7,11:860\n91#7:892\n91#7:897\n91#7:902\n78#7,11:910\n78#7,11:946\n91#7:979\n91#7:984\n4144#8,6:809\n4144#8,6:844\n4144#8,6:879\n4144#8,6:929\n4144#8,6:965\n72#9,6:819\n78#9:853\n82#9:898\n72#9,6:904\n78#9:938\n82#9:985\n73#10,6:854\n79#10:888\n83#10:893\n73#10,6:940\n79#10:974\n83#10:980\n154#11:939\n154#11:975\n154#11:986\n81#12:987\n107#12,2:988\n81#12:990\n81#12:991\n107#12,2:992\n81#12:994\n*S KotlinDebug\n*F\n+ 1 MusicScreen.kt\ncom/yalla/yalla/module/media/music/MusicScreen\n*L\n112#1:670\n124#1:710\n144#1:732\n113#1:671\n114#1:678\n115#1:685\n116#1:692\n125#1:711\n127#1:718\n140#1:725\n146#1:733\n148#1:740\n151#1:747\n162#1:754\n162#1:755\n183#1:762\n187#1:769\n190#1:776\n190#1:777\n221#1:801,8\n221#1:815,3\n226#1:836,8\n226#1:850,3\n246#1:871,8\n246#1:885,3\n246#1:889,3\n226#1:894,3\n221#1:899,3\n340#1:921,8\n340#1:935,3\n348#1:957,8\n348#1:971,3\n348#1:976,3\n340#1:981,3\n113#1:672,6\n114#1:679,6\n115#1:686,6\n116#1:693,6\n125#1:712,6\n127#1:719,6\n140#1:726,6\n146#1:734,6\n148#1:741,6\n151#1:748,6\n162#1:756,6\n183#1:763,6\n187#1:770,6\n190#1:778,6\n119#1:699,11\n221#1:784,6\n221#1:818\n221#1:903\n221#1:790,11\n226#1:825,11\n246#1:860,11\n246#1:892\n226#1:897\n221#1:902\n340#1:910,11\n348#1:946,11\n348#1:979\n340#1:984\n221#1:809,6\n226#1:844,6\n246#1:879,6\n340#1:929,6\n348#1:965,6\n226#1:819,6\n226#1:853\n226#1:898\n340#1:904,6\n340#1:938\n340#1:985\n246#1:854,6\n246#1:888\n246#1:893\n348#1:940,6\n348#1:974\n348#1:980\n351#1:939\n361#1:975\n542#1:986\n116#1:987\n116#1:988,2\n143#1:990\n146#1:991\n146#1:992,2\n148#1:994\n*E\n"})
public final class MusicScreen extends o00O00O {

    @Nullable
    private static Function1<? super String, Unit> searchTextSetter;

    @NotNull
    public static final MusicScreen INSTANCE = new MusicScreen();
    public static final int $stable = 8;

    @SourceDebugExtension({"SMAP\nMusicScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicScreen.kt\ncom/yalla/yalla/module/media/music/MusicScreen$Content$3$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,669:1\n63#2,5:670\n*S KotlinDebug\n*F\n+ 1 MusicScreen.kt\ncom/yalla/yalla/module/media/music/MusicScreen$Content$3$1\n*L\n163#1:670,5\n*E\n"})
    public static final class OooO extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f24461OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ State<List<MusicTable>> f24462OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO(boolean z, State<? extends List<MusicTable>> state) {
            super(1);
            this.f24461OooO0Oo = z;
            this.f24462OooO0o0 = state;
        }

        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
            DisposableEffectScope DisposableEffect = disposableEffectScope;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            return new o00O00OO(this.f24461OooO0Oo, this.f24462OooO0o0);
        }
    }

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f24463OooO0Oo = new OooO00o();

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
        public final /* synthetic */ List<MusicTable> f24464OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MusicTable f24466OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ BoxScope f24467OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ o0O0o00O f24468OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<MusicTable> f24469OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f24470OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ int f24471OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ int f24472OooOO0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(BoxScope boxScope, MusicTable musicTable, o0O0o00O o0o0o00o, MutableState<MusicTable> mutableState, List<? extends MusicTable> list, MutableState<Boolean> mutableState2, int i, int i2) {
            super(2);
            this.f24467OooO0o0 = boxScope;
            this.f24466OooO0o = musicTable;
            this.f24468OooO0oO = o0o0o00o;
            this.f24469OooO0oo = mutableState;
            this.f24464OooO = list;
            this.f24470OooOO0 = mutableState2;
            this.f24471OooOO0O = i;
            this.f24472OooOO0o = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            MusicScreen.this.BottomArea(this.f24467OooO0o0, this.f24466OooO0o, this.f24468OooO0oO, this.f24469OooO0oo, this.f24464OooO, this.f24470OooOO0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f24471OooOO0O | 1), this.f24472OooOO0o);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f24474OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ColumnScope f24475OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(ColumnScope columnScope, int i) {
            super(2);
            this.f24475OooO0o0 = columnScope;
            this.f24474OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f24474OooO0o | 1);
            MusicScreen.this.Content(this.f24475OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.module.media.music.MusicScreen$Content$2", f = "MusicScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<MusicTable> f24476OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableLongState f24477OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o0O0o00O f24478OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ long f24479OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(MutableState<MusicTable> mutableState, o0O0o00O o0o0o00o, MutableLongState mutableLongState, long j, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f24476OooO0Oo = mutableState;
            this.f24478OooO0o0 = o0o0o00o;
            this.f24477OooO0o = mutableLongState;
            this.f24479OooO0oO = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0o(this.f24476OooO0Oo, this.f24478OooO0o0, this.f24477OooO0o, this.f24479OooO0oO, continuation);
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
            MusicTable musicTableContent$lambda$4 = MusicScreen.Content$lambda$4(this.f24476OooO0Oo);
            if (musicTableContent$lambda$4 != null) {
                o0O0o00O o0o0o00o = this.f24478OooO0o0;
                o0o0o00o.getClass();
                Intrinsics.checkNotNullParameter(musicTableContent$lambda$4, "<set-?>");
                o0o0o00o.f56324OooO0O0.setValue(musicTableContent$lambda$4);
                this.f24477OooO0o.setValue(this.f24479OooO0oO);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<Long, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1<Long, Unit> f24480OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(o0OoOo0 o0oooo0) {
            super(1);
            this.f24480OooO0Oo = o0oooo0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Long l) {
            long jLongValue = l.longValue();
            o0OOo000.OooO0O0 oooO0O0 = o0OOo000.f46938OooO00o;
            o0OOo000.OooO0O0();
            this.f24480OooO0Oo.invoke(Long.valueOf(jLongValue));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function1<Long, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1<Long, Unit> f24481OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(o0OoOo0 o0oooo0) {
            super(1);
            this.f24481OooO0Oo = o0oooo0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Long l) {
            this.f24481OooO0Oo.invoke(Long.valueOf(l.longValue()));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function1<Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOOO f24482OooO0Oo = new OooOOO();

        public OooOOO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            int iIntValue = num.intValue();
            if (iIntValue == 1) {
                o0OO000.OooO00o("106094");
            } else if (iIntValue == 2) {
                o0OO000.OooO00o("106095");
            } else if (iIntValue == 3) {
                o0OO000.OooO00o("106093");
            }
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nMusicScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicScreen.kt\ncom/yalla/yalla/module/media/music/MusicScreen$Content$6$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,669:1\n1#2:670\n*E\n"})
    public static final class OooOOO0 extends Lambda implements Function1<Long, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<MusicTable> f24483OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ State<List<MusicTable>> f24484OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOOO0(MutableState<MusicTable> mutableState, State<? extends List<MusicTable>> state) {
            super(1);
            this.f24483OooO0Oo = mutableState;
            this.f24484OooO0o0 = state;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Long l) {
            l.longValue();
            o0OOo000.OooO0O0 oooO0O0 = o0OOo000.f46938OooO00o;
            o0OOo000.OooO0O0();
            MutableState<MusicTable> mutableState = this.f24483OooO0Oo;
            MusicTable musicTableContent$lambda$4 = MusicScreen.Content$lambda$4(mutableState);
            Object obj = null;
            MutableState<Boolean> mutableState2 = musicTableContent$lambda$4 != null ? musicTableContent$lambda$4.isPlaying : null;
            if (mutableState2 != null) {
                mutableState2.setValue(Boolean.FALSE);
            }
            List listContent$lambda$10 = MusicScreen.Content$lambda$10(this.f24484OooO0o0);
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
        public final /* synthetic */ o0O0o00O f24485OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(o0O0o00O o0o0o00o) {
            super(1);
            this.f24485OooO0Oo = o0o0o00o;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Long l) {
            long jLongValue = l.longValue();
            MusicTable musicTableOooO0OO = this.f24485OooO0Oo.OooO0OO();
            p188o00o0O.OooOO0<Activity, o00000O> oooOO1 = oo0oOO0.f53618OooO00o;
            long j = musicTableOooO0OO.mDuration;
            String mDisplayName = musicTableOooO0OO.mDisplayName;
            Intrinsics.checkNotNullExpressionValue(mDisplayName, "mDisplayName");
            String mTitleKey = musicTableOooO0OO.mTitleKey;
            Intrinsics.checkNotNullExpressionValue(mTitleKey, "mTitleKey");
            String mPath = musicTableOooO0OO.mPath;
            Intrinsics.checkNotNullExpressionValue(mPath, "mPath");
            oo0oOO0.OooO0o(new SelectMusicModel(j, mDisplayName, mTitleKey, jLongValue, mPath));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0O0o00O f24486OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<String> f24487OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ AppCompatActivity f24488OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(AppCompatActivity appCompatActivity, MutableState mutableState, o0O0o00O o0o0o00o) {
            super(1);
            this.f24486OooO0Oo = o0o0o00o;
            this.f24488OooO0o0 = appCompatActivity;
            this.f24487OooO0o = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String it = str;
            Intrinsics.checkNotNullParameter(it, "it");
            MutableState<String> mutableState = this.f24487OooO0o;
            MusicScreen.Content$lambda$13(mutableState, it);
            MusicScreen.INSTANCE.handleSearchResult(MusicScreen.Content$lambda$12(mutableState), this.f24486OooO0Oo, this.f24488OooO0o0);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nMusicScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicScreen.kt\ncom/yalla/yalla/module/media/music/MusicScreen$Content$9$1$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,669:1\n36#2:670\n1097#3,6:671\n*S KotlinDebug\n*F\n+ 1 MusicScreen.kt\ncom/yalla/yalla/module/media/music/MusicScreen$Content$9$1$1\n*L\n238#1:670\n238#1:671,6\n*E\n"})
    public static final class OooOo00 extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ State<Boolean> f24489OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(State<Boolean> state) {
            super(3);
            this.f24489OooO0Oo = state;
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
                    ComposerKt.traceEventStart(3666110, iIntValue, -1, "com.yalla.yalla.module.media.music.MusicScreen.Content.<anonymous>.<anonymous>.<anonymous> (MusicScreen.kt:232)");
                }
                String strOooO0OO = o0000.OooO0OO(oO00OOo0.button_editor);
                State<Boolean> state = this.f24489OooO0Oo;
                long j = MusicScreen.Content$lambda$15(state) ? o0oO0O0o.f46951OooO0oO : o0oO0O0o.f46959OooOOOo;
                long sp = TextUnitKt.getSp(16);
                Modifier.Companion companion = Modifier.INSTANCE;
                composer2.startReplaceableGroup(1157296644);
                boolean zChanged = composer2.changed(state);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new com.yalla.yalla.module.media.music.OooOO0(state);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceableGroup();
                TextKt.m1251Text4IGK_g(strOooO0OO, o0O0O00.OooO0O0(companion, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 255), j, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131056);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo0 extends Lambda implements Function1<Function1<? super String, ? extends Unit>, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final Oooo0 f24490OooO0Oo = new Oooo0();

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
        public final /* synthetic */ Context f24491OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o0O0o00O f24492OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ AppCompatActivity f24493OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableState<String> f24494OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo000(Context context, AppCompatActivity appCompatActivity, o0O0o00O o0o0o00o, MutableState<String> mutableState) {
            super(1);
            this.f24491OooO0Oo = context;
            this.f24493OooO0o0 = appCompatActivity;
            this.f24492OooO0o = o0o0o00o;
            this.f24494OooO0oO = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String it = str;
            Intrinsics.checkNotNullParameter(it, "it");
            Context context = this.f24491OooO0Oo;
            if ((context instanceof AppCompatActivity ? (AppCompatActivity) context : null) != null) {
                AppCompatActivity activity = this.f24493OooO0o0;
                Intrinsics.checkNotNullParameter(activity, "activity");
                Object systemService = activity.getSystemService("input_method");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                ((InputMethodManager) systemService).hideSoftInputFromWindow(activity.findViewById(R.id.content).getWindowToken(), 0);
                MusicScreen.INSTANCE.handleSearchResult(MusicScreen.Content$lambda$12(this.f24494OooO0oO), this.f24492OooO0o, activity);
            }
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nMusicScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicScreen.kt\ncom/yalla/yalla/module/media/music/MusicScreen$Content$9$1$2$4\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,669:1\n154#2:670\n*S KotlinDebug\n*F\n+ 1 MusicScreen.kt\ncom/yalla/yalla/module/media/music/MusicScreen$Content$9$1$2$4\n*L\n277#1:670\n*E\n"})
    public static final class o000oOoO extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ AppCompatActivity f24495OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<String> f24496OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o0O0o00O f24497OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000oOoO(AppCompatActivity appCompatActivity, MutableState mutableState, o0O0o00O o0o0o00o) {
            super(3);
            this.f24495OooO0Oo = appCompatActivity;
            this.f24497OooO0o0 = o0o0o00o;
            this.f24496OooO0o = mutableState;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            AnimatedVisibilityScope AnimatedVisibility = animatedVisibilityScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(695948131, iIntValue, -1, "com.yalla.yalla.module.media.music.MusicScreen.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MusicScreen.kt:270)");
            }
            TextKt.m1251Text4IGK_g(o0000.OooO0OO(oO00OOo0.Cancel), o0O0O00.OooO0O0(PaddingKt.m480paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, Dp.m3765constructorimpl(12), 0.0f, 11, null), false, false, 0L, false, null, null, null, new com.yalla.yalla.module.media.music.OooOO0O(this.f24495OooO0Oo, this.f24496OooO0o, this.f24497OooO0o0), 255), o0oO0O0o.f46957OooOOO0, TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131056);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o00O0O extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<String> f24498OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00O0O(MutableState<String> mutableState) {
            super(0);
            this.f24498OooO0Oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(MusicScreen.Content$lambda$12(this.f24498OooO0Oo).length() > 0);
        }
    }

    @SourceDebugExtension({"SMAP\nMusicScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicScreen.kt\ncom/yalla/yalla/module/media/music/MusicScreen$ListPage$1\n+ 2 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n1#1,669:1\n171#2,12:670\n*S KotlinDebug\n*F\n+ 1 MusicScreen.kt\ncom/yalla/yalla/module/media/music/MusicScreen$ListPage$1\n*L\n545#1:670,12\n*E\n"})
    public static final class o00Oo0 extends Lambda implements Function1<LazyListScope, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ MutableState<MusicTable> f24499OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ List<MusicTable> f24500OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f24501OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f24502OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f24503OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ o0O0o00O f24504OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ MusicTable f24505OooOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o00Oo0(List<? extends MusicTable> list, boolean z, String str, int i, o0O0o00O o0o0o00o, MutableState<MusicTable> mutableState, MusicTable musicTable) {
            super(1);
            this.f24500OooO0Oo = list;
            this.f24502OooO0o0 = z;
            this.f24501OooO0o = str;
            this.f24503OooO0oO = i;
            this.f24504OooO0oo = o0o0o00o;
            this.f24499OooO = mutableState;
            this.f24505OooOO0 = musicTable;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(LazyListScope lazyListScope) {
            LazyListScope LazyColumn = lazyListScope;
            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
            final boolean z = this.f24502OooO0o0;
            final String str = this.f24501OooO0o;
            final int i = this.f24503OooO0oO;
            final o0O0o00O o0o0o00o = this.f24504OooO0oo;
            final MutableState<MusicTable> mutableState = this.f24499OooO;
            final MusicTable musicTable = this.f24505OooOO0;
            final List<MusicTable> list = this.f24500OooO0Oo;
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
                        OooOOO oooOOO = new OooOOO(o0o0o00o);
                        OooOOOO oooOOOO = new OooOOOO(musicTable2);
                        OooOo00 oooOo00 = OooOo00.f24596OooO0Oo;
                        OooOo oooOo = new OooOo(musicTable2, mutableState, musicTable, z, list);
                        int i3 = i;
                        OooO0o.OooO0O0(musicTable2, null, z2, str2, oooOOO, oooOOOO, null, oooOo00, oooOo, composer2, ((i3 >> 12) & 7168) | (i3 & 896) | 12582920, 66);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                    return Unit.INSTANCE;
                }
            }));
            if (list.isEmpty()) {
                LazyListScope.CC.OooO(LazyColumn, null, null, o000OO0O.f46415OooO00o, 3, null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o00Ooo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ MutableState<MusicTable> f24506OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ List<MusicTable> f24508OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ColumnScope f24509OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f24510OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ o0O0o00O f24511OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ MusicTable f24512OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f24513OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ String f24514OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final /* synthetic */ int f24515OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final /* synthetic */ int f24516OooOOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o00Ooo(ColumnScope columnScope, List<? extends MusicTable> list, boolean z, o0O0o00O o0o0o00o, MutableState<MusicTable> mutableState, MusicTable musicTable, MutableState<Boolean> mutableState2, String str, int i, int i2) {
            super(2);
            this.f24509OooO0o0 = columnScope;
            this.f24508OooO0o = list;
            this.f24510OooO0oO = z;
            this.f24511OooO0oo = o0o0o00o;
            this.f24506OooO = mutableState;
            this.f24512OooOO0 = musicTable;
            this.f24513OooOO0O = mutableState2;
            this.f24514OooOO0o = str;
            this.f24516OooOOO0 = i;
            this.f24515OooOOO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            MusicScreen.this.ListPage(this.f24509OooO0o0, this.f24508OooO0o, this.f24510OooO0oO, this.f24511OooO0oo, this.f24506OooO, this.f24512OooOO0, this.f24513OooOO0O, this.f24514OooOO0o, composer, RecomposeScopeImplKt.updateChangedFlags(this.f24516OooOOO0 | 1), this.f24515OooOOO);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nMusicScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicScreen.kt\ncom/yalla/yalla/module/media/music/MusicScreen$MusicPopWindow$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,669:1\n154#2:670\n154#2:706\n154#2:707\n154#2:710\n154#2:777\n154#2:778\n154#2:819\n154#2:820\n154#2:821\n154#2:822\n154#2:833\n66#3,6:671\n72#3:705\n76#3:838\n78#4,11:677\n78#4,11:713\n78#4,11:748\n91#4:782\n78#4,11:790\n91#4:826\n91#4:831\n91#4:837\n456#5,8:688\n464#5,3:702\n456#5,8:724\n464#5,3:738\n456#5,8:759\n464#5,3:773\n467#5,3:779\n456#5,8:801\n464#5,3:815\n467#5,3:823\n467#5,3:828\n467#5,3:834\n4144#6,6:696\n4144#6,6:732\n4144#6,6:767\n4144#6,6:809\n76#7:708\n76#7:709\n77#8,2:711\n79#8:741\n73#8,6:742\n79#8:776\n83#8:783\n73#8,6:784\n79#8:818\n83#8:827\n83#8:832\n*S KotlinDebug\n*F\n+ 1 MusicScreen.kt\ncom/yalla/yalla/module/media/music/MusicScreen$MusicPopWindow$2\n*L\n385#1:670\n414#1:706\n415#1:707\n444#1:710\n461#1:777\n467#1:778\n479#1:819\n491#1:820\n496#1:821\n512#1:822\n519#1:833\n383#1:671,6\n383#1:705\n383#1:838\n383#1:677,11\n442#1:713,11\n458#1:748,11\n458#1:782\n472#1:790,11\n472#1:826\n442#1:831\n383#1:837\n383#1:688,8\n383#1:702,3\n442#1:724,8\n442#1:738,3\n458#1:759,8\n458#1:773,3\n458#1:779,3\n472#1:801,8\n472#1:815,3\n472#1:823,3\n442#1:828,3\n383#1:834,3\n383#1:696,6\n442#1:732,6\n458#1:767,6\n472#1:809,6\n421#1:708\n423#1:709\n442#1:711,2\n442#1:741\n458#1:742,6\n458#1:776\n458#1:783\n472#1:784,6\n472#1:818\n472#1:827\n442#1:832\n*E\n"})
    public static final class o00oO0o extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MusicTable f24517OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ List<MusicTable> f24518OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<MusicTable> f24519OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ o0O0o00O f24520OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f24521OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o00oO0o(MusicTable musicTable, MutableState<MusicTable> mutableState, List<? extends MusicTable> list, o0O0o00O o0o0o00o, MutableState<Boolean> mutableState2) {
            super(3);
            this.f24517OooO0Oo = musicTable;
            this.f24519OooO0o0 = mutableState;
            this.f24518OooO0o = list;
            this.f24520OooO0oO = o0o0o00o;
            this.f24521OooO0oo = mutableState2;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            AnimatedVisibilityScope AnimatedVisibility = animatedVisibilityScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-390986173, iIntValue, -1, "com.yalla.yalla.module.media.music.MusicScreen.MusicPopWindow.<anonymous> (MusicScreen.kt:380)");
            }
            MusicTable musicTable = this.f24517OooO0Oo;
            String str = musicTable.mPath;
            Intrinsics.checkNotNullExpressionValue(str, "playingSong.mPath");
            Bitmap bitmapOooO0O0 = oOo00ooO.OooO0O0(str);
            Modifier.Companion companion = Modifier.INSTANCE;
            float f = 52;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(companion, Dp.m3765constructorimpl(f)), 0.0f, 1, null);
            MutableState<MusicTable> mutableState = this.f24519OooO0o0;
            List<MusicTable> list = this.f24518OooO0o;
            Modifier modifierOooO0O0 = o0O0O00.OooO0O0(modifierFillMaxWidth$default, false, false, 0L, false, null, null, null, new com.yalla.yalla.module.media.music.Oooo000(mutableState, musicTable, list), 255);
            composer2.startReplaceableGroup(733328855);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO00o = p018OooOoo0.OooOOO.OooO00o(companion2, false, composer2, 0, -1323940314);
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
            Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer2);
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (bitmapOooO0O0 == null) {
                composer2.startReplaceableGroup(413009624);
                float f2 = 10;
                ImageKt.Image(PainterResources_androidKt.painterResource(oO00OOO.ic_music_pop_bg, composer2, 0), (String) null, BlurKt.m1329blur1fqSgw$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), Dp.m3765constructorimpl(f2), Dp.m3765constructorimpl(f2), null, 4, null), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composer2, 25016, 104);
                composer2.endReplaceableGroup();
            } else {
                composer2.startReplaceableGroup(413010139);
                coil.request.OooO00o.C0170OooO00o c0170OooO00o = new coil.request.OooO00o.C0170OooO00o((Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
                c0170OooO00o.f8590OooO0OO = bitmapOooO0O0;
                c0170OooO00o.f8600OooOOO0 = o000.OooO00o(ArraysKt.toList(new o00.OooO0OO[]{new o00.OooO0O0((Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext()))}));
                o000O00.OooO00o(c0170OooO00o.OooO00o(), "icon", SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), null, null, null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, composer2, 1573304, 952);
                composer2.endReplaceableGroup();
            }
            Modifier modifierBackground$default = BackgroundKt.background$default(SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(companion, Dp.m3765constructorimpl(f)), 0.0f, 1, null), Brush.Companion.m1627linearGradientmHitzGk$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m1660boximpl(o0oO0O0o.f46969OooOoO0), Color.m1660boximpl(o0oO0O0o.f46972OooOoo0), Color.m1660boximpl(o0oO0O0o.f46974OooOooo)}), 0L, 0L, 0, 14, (Object) null), null, 0.0f, 6, null);
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
            Composer composerM1309constructorimpl2 = Updater.m1309constructorimpl(composer2);
            Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl2, measurePolicyRowMeasurePolicy, composerM1309constructorimpl2, currentCompositionLocalMap2);
            if (composerM1309constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier modifierWrapContentWidth$default = SizeKt.wrapContentWidth$default(companion, null, false, 3, null);
            composer2.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO00o2 = androidx.compose.material.OooOOO.OooO00o(companion2, arrangement.getStart(), composer2, 0, -1323940314);
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
            Composer composerM1309constructorimpl3 = Updater.m1309constructorimpl(composer2);
            Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl3, measurePolicyOooO00o2, composerM1309constructorimpl3, currentCompositionLocalMap3);
            if (composerM1309constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1309constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
            com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(100), null, composer2, 6, 2);
            String mDisplayName = musicTable.mDisplayName;
            long sp = TextUnitKt.getSp(16);
            long j = o0oO0O0o.f46946OooO0O0;
            FontWeight medium = FontWeight.INSTANCE.getMedium();
            Modifier modifierM530widthInVpY3zN4$default = SizeKt.m530widthInVpY3zN4$default(companion, 0.0f, Dp.m3765constructorimpl(Constants.ERR_ALREADY_IN_RECORDING), 1, null);
            int iM3719getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m3719getEllipsisgIe3tQ8();
            Intrinsics.checkNotNullExpressionValue(mDisplayName, "mDisplayName");
            TextKt.m1251Text4IGK_g(mDisplayName, modifierM530widthInVpY3zN4$default, j, sp, (FontStyle) null, medium, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, iM3719getEllipsisgIe3tQ8, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199728, 3120, 120784);
            p426o0OoOO.o000oOoO.OooO00o(composer2);
            Modifier modifierWrapContentWidth$default2 = SizeKt.wrapContentWidth$default(companion, null, false, 3, null);
            composer2.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO00o3 = androidx.compose.material.OooOOO.OooO00o(companion2, arrangement.getStart(), composer2, 0, -1323940314);
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
            Composer composerM1309constructorimpl4 = Updater.m1309constructorimpl(composer2);
            Function2 function2OooO00o4 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl4, measurePolicyOooO00o3, composerM1309constructorimpl4, currentCompositionLocalMap4);
            if (composerM1309constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash4, composerM1309constructorimpl4, currentCompositeKeyHash4, function2OooO00o4);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf4, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
            float f3 = 24;
            ImageKt.Image(PainterResources_androidKt.painterResource(oO00OOO.ic_music_clip, composer2, 0), (String) null, o0O0O00.OooO0O0(SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(f3)), false, false, 0L, false, null, null, null, new com.yalla.yalla.module.media.music.Oooo0(list, this.f24520OooO0oO, musicTable), 255), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
            com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(12), null, composer2, 6, 2);
            ImageKt.Image(PainterResources_androidKt.painterResource(oO00OOO.ic_music_delete, composer2, 0), (String) null, o0O0O00.OooO0O0(SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(f3)), false, false, 0L, false, null, null, null, new com.yalla.yalla.module.media.music.o000oOoO(this.f24521OooO0oo, musicTable, list), 255), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
            com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f3), null, composer2, 6, 2);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            com.yalla.yalla.module.media.music.OooO0o.OooO00o(musicTable, false, boxScopeInstance.align(PaddingKt.m480paddingqDBjuR0$default(companion, Dp.m3765constructorimpl(f3), 0.0f, 0.0f, Dp.m3765constructorimpl(18), 6, null), companion2.getBottomStart()), j, bitmapOooO0O0, composer2, 32824, 0);
            if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o0OO00O extends Lambda implements Function0<Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MusicTable f24522OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OO00O(MusicTable musicTable) {
            super(0);
            this.f24522OooO0Oo = musicTable;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Object invoke() {
            o0OO000.OooO00o("102142");
            boolean z = oOO0.f54098OooO00o;
            MusicTable music = this.f24522OooO0Oo;
            Intrinsics.checkNotNullParameter(music, "music");
            oOO0.OooO00o(CollectionsKt.mutableListOf(music));
            return null;
        }
    }

    public static final class o0OOO0o extends Lambda implements Function1<List<MusicTable>, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0O0o00O f24523OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OOO0o(o0O0o00O o0o0o00o) {
            super(1);
            this.f24523OooO0Oo = o0o0o00o;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<MusicTable> list) {
            this.f24523OooO0Oo.f56325OooO0OO.postValue(list);
            return Unit.INSTANCE;
        }
    }

    public static final class o0Oo0oo extends Lambda implements Function1<Boolean, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1<Object, Unit> f24524OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f24525OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f24526OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ String f24527OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ long f24528OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0Oo0oo(boolean z, boolean z2, String str, long j, Function1 function1) {
            super(1);
            this.f24524OooO0Oo = function1;
            this.f24526OooO0o0 = z;
            this.f24525OooO0o = z2;
            this.f24527OooO0oO = str;
            this.f24528OooO0oo = j;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            if (bool.booleanValue()) {
                MusicScreen musicScreen = MusicScreen.INSTANCE;
                Bundle bundleOooO00o = p063o0000oO.o00Ooo.OooO00o();
                bundleOooO00o.putBoolean("isFromVideo", this.f24525OooO0o);
                bundleOooO00o.putString("titleKey", this.f24527OooO0oO);
                bundleOooO00o.putLong("startPosition", this.f24528OooO0oo);
                oo0oOO0.OooO0o0(musicScreen, bundleOooO00o, false, this.f24524OooO0Oo, 4);
                if (this.f24526OooO0o0) {
                    oo0oOO0.OooO0o0(MusicAddScreen.INSTANCE, null, false, null, 14);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o0OoOo0 extends Lambda implements Function1<Long, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0O0o00O f24529OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Function0<Unit>> f24530OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OoOo0(o0O0o00O o0o0o00o, MutableState<Function0<Unit>> mutableState) {
            super(1);
            this.f24529OooO0Oo = o0o0o00o;
            this.f24530OooO0o0 = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Long l) {
            long jLongValue = l.longValue();
            o0OOo000.OooO0O0 oooO0O0 = o0OOo000.f46938OooO00o;
            o0O0o00O o0o0o00o = this.f24529OooO0Oo;
            String str = o0o0o00o.OooO0OO().mPath;
            Intrinsics.checkNotNullExpressionValue(str, "musicViewModel.selectMusic.mPath");
            o0OOo000.OooO00o(str, false, Long.valueOf(jLongValue), Long.valueOf(o0o0o00o.OooO0OO().mDuration), new com.yalla.yalla.module.media.music.OooOOO0(this.f24530OooO0o0), 6);
            return Unit.INSTANCE;
        }
    }

    public static final class o0ooOOo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f24531OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o0O0o00O f24533OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MusicTable f24534OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableState<MusicTable> f24535OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ List<MusicTable> f24536OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ int f24537OooOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o0ooOOo(MusicTable musicTable, o0O0o00O o0o0o00o, MutableState<MusicTable> mutableState, List<? extends MusicTable> list, MutableState<Boolean> mutableState2, int i) {
            super(2);
            this.f24534OooO0o0 = musicTable;
            this.f24533OooO0o = o0o0o00o;
            this.f24535OooO0oO = mutableState;
            this.f24536OooO0oo = list;
            this.f24531OooO = mutableState2;
            this.f24537OooOO0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            MusicScreen.this.MusicPopWindow(this.f24534OooO0o0, this.f24533OooO0o, this.f24535OooO0oO, this.f24536OooO0oo, this.f24531OooO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f24537OooOO0 | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class oo000o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f24538OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o0O0o00O f24540OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MusicTable f24541OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableState<MusicTable> f24542OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ List<MusicTable> f24543OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ int f24544OooOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public oo000o(MusicTable musicTable, o0O0o00O o0o0o00o, MutableState<MusicTable> mutableState, List<? extends MusicTable> list, MutableState<Boolean> mutableState2, int i) {
            super(2);
            this.f24541OooO0o0 = musicTable;
            this.f24540OooO0o = o0o0o00o;
            this.f24542OooO0oO = mutableState;
            this.f24543OooO0oo = list;
            this.f24538OooO = mutableState2;
            this.f24544OooOO0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            MusicScreen.this.MusicPopWindow(this.f24541OooO0o0, this.f24540OooO0o, this.f24542OooO0oO, this.f24543OooO0oo, this.f24538OooO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f24544OooOO0 | 1));
            return Unit.INSTANCE;
        }
    }

    private MusicScreen() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void BottomArea(BoxScope boxScope, MusicTable musicTable, o0O0o00O o0o0o00o, MutableState<MusicTable> mutableState, List<? extends MusicTable> list, MutableState<Boolean> mutableState2, Composer composer, int i, int i2) {
        Composer composerStartRestartGroup = composer.startRestartGroup(478879872);
        MusicTable musicTable2 = (i2 & 1) != 0 ? null : musicTable;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(478879872, i, -1, "com.yalla.yalla.module.media.music.MusicScreen.BottomArea (MusicScreen.kt:332)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Alignment.Companion companion2 = Alignment.INSTANCE;
        Modifier modifierAlign = boxScope.align(companion, companion2.getBottomCenter());
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        Arrangement arrangement = Arrangement.INSTANCE;
        MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO0o.OooO00o(companion2, arrangement.getTop(), composerStartRestartGroup, 0, -1323940314);
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
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        int i3 = i >> 3;
        INSTANCE.MusicPopWindow(musicTable2, o0o0o00o, mutableState, list, mutableState2, composerStartRestartGroup, (i3 & 112) | 266312 | (i3 & 896) | (i3 & 57344));
        int i4 = o0oO0O0o.f47152o00OOOo;
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(BackgroundKt.m169backgroundbw27NRU$default(companion, o0oO0O0o.f47059o000OOo, null, 2, null), Dp.m3765constructorimpl(60)), 0.0f, 1, null);
        Alignment.Vertical centerVertically = companion2.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyOooO00o2 = androidx.compose.material.OooO.OooO00o(arrangement, centerVertically, composerStartRestartGroup, 48, -1323940314);
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
        Composer composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl2, measurePolicyOooO00o2, composerM1309constructorimpl2, currentCompositionLocalMap2);
        if (composerM1309constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        o00000O0.OooO00o(StringResources_androidKt.stringResource(oO00OOo0.add_music, composerStartRestartGroup, 0), o0000O0.OooO0OO(15, composerStartRestartGroup, 6), null, null, Color.m1660boximpl(o0oO0O0o.f46946OooO0O0), Color.m1660boximpl(o0oO0O0o.f47002Oooooo0), null, 0.0f, null, false, false, 0L, false, null, null, null, null, null, SizeKt.fillMaxSize$default(PaddingKt.m477paddingVpY3zN4(companion, Dp.m3765constructorimpl(16), Dp.m3765constructorimpl(10)), 0.0f, 1, null), OooO00o.f24463OooO0Oo, composerStartRestartGroup, 0, 905969664, 262092);
        if (o00000OO.OooO00o(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(boxScope, musicTable2, o0o0o00o, mutableState, list, mutableState2, i, i2));
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
    public final void ListPage(ColumnScope columnScope, List<? extends MusicTable> list, boolean z, o0O0o00O o0o0o00o, MutableState<MusicTable> mutableState, MusicTable musicTable, MutableState<Boolean> mutableState2, String str, Composer composer, int i, int i2) {
        Composer composerStartRestartGroup = composer.startRestartGroup(266925113);
        MusicTable musicTable2 = (i2 & 16) != 0 ? null : musicTable;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(266925113, i, -1, "com.yalla.yalla.module.media.music.MusicScreen.ListPage (MusicScreen.kt:530)");
        }
        LazyDslKt.LazyColumn(androidx.compose.foundation.layout.OooOO0.OooO00o(columnScope, PaddingKt.m480paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Dp.m3765constructorimpl(mutableState2.getValue().booleanValue() ? 112 : 60), 7, null), 1.0f, false, 2, null), null, null, false, null, null, null, false, new o00Oo0(list, z, str, i, o0o0o00o, mutableState, musicTable2), composerStartRestartGroup, 0, 254);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o00Ooo(columnScope, list, z, o0o0o00o, mutableState, musicTable2, mutableState2, str, i, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void MusicPopWindow(MusicTable musicTable, o0O0o00O o0o0o00o, MutableState<MusicTable> mutableState, List<? extends MusicTable> list, MutableState<Boolean> mutableState2, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(99054107);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(99054107, i, -1, "com.yalla.yalla.module.media.music.MusicScreen.MusicPopWindow (MusicScreen.kt:371)");
        }
        if (musicTable == null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new oo000o(musicTable, o0o0o00o, mutableState, list, mutableState2, i));
            return;
        }
        AnimatedVisibilityKt.AnimatedVisibility(mutableState2.getValue().booleanValue(), (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -390986173, true, new o00oO0o(musicTable, mutableState, list, o0o0o00o, mutableState2)), composerStartRestartGroup, 196608, 30);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new o0ooOOo(musicTable, o0o0o00o, mutableState, list, mutableState2, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleSearchResult(String searchText, o0O0o00O musicViewModel, AppCompatActivity activity) {
        if (!(searchText.length() > 0)) {
            musicViewModel.f56325OooO0OO.postValue(musicViewModel.f56326OooO0Oo);
            return;
        }
        CopyOnWriteArrayList<MusicTable> copyOnWriteArrayList = musicViewModel.f56326OooO0Oo;
        copyOnWriteArrayList.clear();
        List list = (List) MusicState.OooO00o().getValue();
        if (list != null) {
            copyOnWriteArrayList.addAll(list);
        }
        Intrinsics.checkNotNullParameter(searchText, "keyword");
        com.code.android.util.o00oO0o.OooO00o(new o0O0oo00(searchText, musicViewModel, null)).observe(activity, new o00O00o0(new o0OOO0o(musicViewModel)));
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
        Context context = o000O0.f10354OooO00o;
        Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
        if (activityOooO0O0 != null) {
            p157o00OoOO0.o0OO00O o0oo00o2 = new p157o00OoOO0.o0OO00O(activityOooO0O0);
            o0oo00o2.OooOo00(o0000.OooO0OO(oO00OOo0.Sure_delete_selected_music));
            o0oo00o2.OooOo(true);
            o0oo00o2.OooOo0(new o0OO00O(deleteMusic));
            o0oo00o2.OooOO0o();
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
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v46 */
    @Override // p526o0o0OOO0.o00O00O
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public void Content(@NotNull ColumnScope columnScope, @Nullable Composer composer, int i) {
        int i2;
        AppCompatActivity appCompatActivity;
        o0O0o00O o0o0o00o;
        String str;
        Context context;
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
                ComposerKt.traceEventStart(478134427, i, -1, "com.yalla.yalla.module.media.music.MusicScreen.Content (MusicScreen.kt:110)");
            }
            Bundle bundleOooO0O0 = o00O.OooO0O0((NavBackStackEntry) composerStartRestartGroup.consume(o00O.f53592OooO00o), composerStartRestartGroup);
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
            MutableState mutableState = (MutableState) objRememberedValue4;
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(o0O0o00O.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            o0O0o00O o0o0o00o2 = (o0O0o00O) viewModel;
            composerStartRestartGroup.startReplaceableGroup(-100970225);
            if (mPath != null) {
                o0o0o00o2.getClass();
                Intrinsics.checkNotNullParameter(mPath, "mPath");
                mutableState.setValue((MusicTable) LiveDataAdapterKt.observeAsState(com.code.android.util.o00oO0o.OooO00o(new o0oOo0O0(mPath, null)), composerStartRestartGroup, 8).getValue());
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
            MutableState<MusicTable> mutableState2 = (MutableState) objRememberedValue5;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, i2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState3 = (MutableState) objRememberedValue6;
            o0OoOo0 o0oooo0 = new o0OoOo0(o0o0o00o2, mutableState3);
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue7 == companion.getEmpty()) {
                objRememberedValue7 = SnapshotLongStateKt.mutableLongStateOf(0L);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableLongState mutableLongState = (MutableLongState) objRememberedValue7;
            State stateObserveAsState = LiveDataAdapterKt.observeAsState(o0o0o00o2.f56325OooO0OO, composerStartRestartGroup, 8);
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
            MutableState mutableState4 = (MutableState) objRememberedValue8;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue9 == companion.getEmpty()) {
                objRememberedValue9 = SnapshotStateKt.derivedStateOf(new o00O0O(mutableState4));
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
            MutableState<Boolean> mutableState5 = (MutableState) objRememberedValue10;
            if (Content$lambda$4(mutableState) != null) {
                mutableState5.setValue(Boolean.TRUE);
            }
            EffectsKt.LaunchedEffect(Content$lambda$4(mutableState), new OooO0o(mutableState, o0o0o00o2, mutableLongState, jLongValue, null), composerStartRestartGroup, 72);
            Unit unit2 = Unit.INSTANCE;
            boolean zOooO00o = androidx.compose.foundation.gestures.OooO0OO.OooO00o(zBooleanValue, composerStartRestartGroup, 511388516) | composerStartRestartGroup.changed(stateObserveAsState);
            Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
            if (zOooO00o || objRememberedValue11 == companion.getEmpty()) {
                objRememberedValue11 = new OooO(zBooleanValue, stateObserveAsState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.DisposableEffect(unit2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue11, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-100968469);
            if (zBooleanValue) {
                MutableState<Boolean> mutableState6 = o0o0o00o2.f56323OooO00o;
                String str3 = o0o0o00o2.OooO0OO().mDisplayName;
                if (str3 == null) {
                    str3 = "";
                }
                long j = o0o0o00o2.OooO0OO().mDuration;
                String str4 = o0o0o00o2.OooO0OO().mPath;
                MusicTable musicTableContent$lambda$4 = Content$lambda$4(mutableState);
                long jLongValue2 = Intrinsics.areEqual(str4, musicTableContent$lambda$4 != null ? musicTableContent$lambda$4.mPath : null) ? mutableLongState.getValue().longValue() : 0L;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                boolean zChanged4 = composerStartRestartGroup.changed(o0oooo0);
                Object objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                if (zChanged4 || objRememberedValue12 == companion.getEmpty()) {
                    objRememberedValue12 = new OooOO0(o0oooo0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function1 function1 = (Function1) objRememberedValue12;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                boolean zChanged5 = composerStartRestartGroup.changed(o0oooo0);
                Object objRememberedValue13 = composerStartRestartGroup.rememberedValue();
                if (zChanged5 || objRememberedValue13 == companion.getEmpty()) {
                    objRememberedValue13 = new OooOO0O(o0oooo0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function1 function2 = (Function1) objRememberedValue13;
                composerStartRestartGroup.startReplaceableGroup(511388516);
                boolean zChanged6 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(stateObserveAsState);
                Object objRememberedValue14 = composerStartRestartGroup.rememberedValue();
                if (zChanged6 || objRememberedValue14 == companion.getEmpty()) {
                    objRememberedValue14 = new OooOOO0(mutableState, stateObserveAsState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
                }
                composerStartRestartGroup.endReplaceableGroup();
                z = false;
                long j2 = jLongValue2;
                appCompatActivity = appCompatActivity2;
                str = "";
                context = context2;
                o0o0o00o = o0o0o00o2;
                mutableState3.setValue(d.OooO00o(mutableState6, str3, j, j2, function1, function2, (Function1) objRememberedValue14, OooOOO.f24482OooO0Oo, new OooOOOO(o0o0o00o2), composerStartRestartGroup, 100663296));
            } else {
                appCompatActivity = appCompatActivity2;
                o0o0o00o = o0o0o00o2;
                str = "";
                context = context2;
                z = false;
            }
            ?? r2 = z;
            composerStartRestartGroup.endReplaceableGroup();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierM169backgroundbw27NRU$default = BackgroundKt.m169backgroundbw27NRU$default(WindowInsetsPadding_androidKt.statusBarsPadding(companion2), o0oO0O0o.f46991OoooOOO, null, 2, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO00o = p018OooOoo0.OooOOO.OooO00o(companion3, r2, composerStartRestartGroup, r2, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, r2);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM169backgroundbw27NRU$default);
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
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion4, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(r2, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyOooO00o2 = androidx.compose.material.OooO0o.OooO00o(companion3, arrangement.getTop(), composerStartRestartGroup, r2, -1323940314);
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
            Composer composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion4, composerM1309constructorimpl2, measurePolicyOooO00o2, composerM1309constructorimpl2, currentCompositionLocalMap2);
            if (composerM1309constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            androidx.compose.animation.OooOO0.OooO00o(r2, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            String strOooO0OO = o0000.OooO0OO(oO00OOo0.title_activity_music);
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
            t1.OooO00o(androidx.camera.core.impl.OooOOOO.OooO00o(strOooO0OO, str2), 0.0f, o0oO0O0o.f46946OooO0O0, null, null, null, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 3666110, true, new OooOo00(state)), null, composerStartRestartGroup, 12582912, 378);
            Alignment.Vertical centerVertically = companion3.getCenterVertically();
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO00o3 = androidx.compose.material.OooO.OooO00o(arrangement, centerVertically, composerStartRestartGroup, 48, -1323940314);
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
            Composer composerM1309constructorimpl3 = Updater.m1309constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion4, composerM1309constructorimpl3, measurePolicyOooO00o3, composerM1309constructorimpl3, currentCompositionLocalMap3);
            if (composerM1309constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1309constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            AppCompatActivity appCompatActivity3 = appCompatActivity;
            o0O0o00O o0o0o00o3 = o0o0o00o;
            j1.f49943OooO00o.OooO00o(null, new OooOo(appCompatActivity3, r25, o0o0o00o3), new Oooo000(context, appCompatActivity3, o0o0o00o3, r25), Oooo0.f24490OooO0Oo, o0000.OooO0OO(oO00OOo0.Search_for_artists_or_songs), 0L, false, o0oO0O0o.f47091o000oo0O, null, 0, null, null, androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, companion2, 1.0f, false, 2, null), o0oO0O0o.f46951OooO0oO, o0oO0O0o.f46959OooOOOo, oO00OOO.ic_music_search_clear, composerStartRestartGroup, 3072, j1.f49945OooO0OO << 18, 3937);
            composer2 = composerStartRestartGroup;
            AnimatedVisibilityKt.AnimatedVisibility(rowScopeInstance, Content$lambda$15(state), (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(composer2, 695948131, true, new o000oOoO(appCompatActivity3, r25, o0o0o00o3)), composer2, 1572870, 30);
            p426o0OoOO.o000oOoO.OooO00o(composer2);
            List<MusicTable> listContent$lambda$12 = Content$lambda$10(stateObserveAsState);
            composer2.startReplaceableGroup(920816377);
            if (listContent$lambda$12 != null) {
                INSTANCE.ListPage(columnScopeInstance, listContent$lambda$12, zBooleanValue, o0o0o00o3, mutableState2, Content$lambda$4(r2), r18, Content$lambda$12(mutableState4), composer2, 136081478, 0);
                Unit unit3 = Unit.INSTANCE;
            }
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.startReplaceableGroup(-100963008);
            if (Content$lambda$15(state)) {
                i3 = 0;
            } else {
                INSTANCE.BottomArea(boxScopeInstance, Content$lambda$4(mutableState), o0o0o00o3, mutableState2, Content$lambda$10(stateObserveAsState), mutableState5, composer2, 2330182, 0);
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
            p149o00Oo0o0.o00000O.OooO0O0(true, composer2, 6, i3);
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

    @Override // p526o0o0OOO0.o00O00O
    @Composable
    /* JADX INFO: renamed from: getWindowBackgroundColor-WaAFU9c */
    public long mo4198getWindowBackgroundColorWaAFU9c(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-1021949034);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1021949034, i, -1, "com.yalla.yalla.module.media.music.MusicScreen.getWindowBackgroundColor (MusicScreen.kt:105)");
        }
        int i2 = o0oO0O0o.f47152o00OOOo;
        long j = o0oO0O0o.f46991OoooOOO;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return j;
    }

    public final void navigate(boolean isToAdd, boolean isFromVideo, @Nullable String path, long startPosition, @Nullable Function1<Object, Unit> onResult) {
        Context context = o000O0.f10354OooO00o;
        Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
        if (activityOooO0O0 != null) {
            com.yalla.yalla.util.permission.OooO00o.OooO0OO(activityOooO0O0, PermissionGroupReveal.f32882OooO0Oo, null, new o0Oo0oo(isToAdd, isFromVideo, path, startPosition, onResult));
        }
    }
}
