package com.yalla.yalla.module.media.music;

import android.os.Bundle;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
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
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
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
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavBackStackEntry;
import com.code.android.util.o0000;
import com.code.android.util.o0000O0;
import com.code.android.util.o0O0O00;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.data.db.model.MusicTable;
import com.yalla.yalla.util.Player.Audio;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p063o0000oO.o00Ooo;
import p148o00Oo0o.o00000O0;
import p148o00Oo0o.o0ooOOo;
import p149o00Oo0o0.o00000O;
import p464o0Oooo.o000000O;
import p469o0OoooOO.o0oO0O0o;
import p507o0o00ooo.t1;
import p526o0o0OOO0.o00O;
import p526o0o0OOO0.o00O00O;
import p526o0o0OOO0.oo0oOO0;
import p528o0o0OOOo.oOO0;
import p575o0oOoOo.o0O0o00O;
import p584o0oOooO0.oO00OOO;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b#\u0010$J7\u0010\f\u001a\u00020\u000b*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\f\u0010\rJT\u0010\u0016\u001a\u00020\u000b*\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072!\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u000b0\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0014H\u0003¢\u0006\u0004\b\u0016\u0010\u0017J.\u0010\u001c\u001a\u00020\u000b2\b\b\u0002\u0010\n\u001a\u00020\t2\u001c\b\u0002\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018j\n\u0012\u0004\u0012\u00020\u0019\u0018\u0001`\u001aJ\u0013\u0010\u001d\u001a\u00020\u000b*\u00020\u0002H\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\"\u001a\u00020\u001fH\u0017ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b \u0010!\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006%"}, d2 = {"Lcom/yalla/yalla/module/media/music/MusicEditScreen;", "Lo0o0OOO0/o00O00O;", "Landroidx/compose/foundation/layout/ColumnScope;", "", "Lcom/yalla/yalla/data/db/model/MusicTable;", "musicList", "Landroidx/compose/runtime/MutableState;", "", "selectCount", "", "isFromEdit", "", "ListPage", "(Landroidx/compose/foundation/layout/ColumnScope;Ljava/util/List;Landroidx/compose/runtime/MutableState;ZLandroidx/compose/runtime/Composer;I)V", "Landroidx/compose/foundation/layout/BoxScope;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "isSelectAll", "selectAllClick", "Lkotlin/Function0;", "confirmClick", "BottomArea", "(Landroidx/compose/foundation/layout/BoxScope;ZILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Ljava/util/ArrayList;", "Lcom/yalla/yalla/util/Player/Audio;", "Lkotlin/collections/ArrayList;", "list", "navigate", "Content", "(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/graphics/Color;", "getWindowBackgroundColor-WaAFU9c", "(Landroidx/compose/runtime/Composer;I)J", "getWindowBackgroundColor", "<init>", "()V", "Media_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMusicEditScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicEditScreen.kt\ncom/yalla/yalla/module/media/music/MusicEditScreen\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 11 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 12 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 13 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,227:1\n81#2,11:228\n25#3:239\n36#3:247\n36#3:254\n456#3,8:279\n464#3,3:293\n456#3,8:314\n464#3,3:328\n467#3,3:332\n467#3,3:337\n25#3:343\n456#3,8:364\n464#3,3:378\n50#3:382\n49#3:383\n456#3,8:407\n464#3,3:421\n467#3,3:427\n36#3:435\n467#3,3:442\n1097#4,6:240\n1097#4,6:248\n1097#4,6:255\n1097#4,6:344\n1097#4,6:384\n1097#4,6:436\n76#5:246\n1#6:261\n66#7,6:262\n72#7:296\n76#7:341\n78#8,11:268\n78#8,11:303\n91#8:335\n91#8:340\n78#8,11:353\n78#8,11:396\n91#8:430\n91#8:445\n4144#9,6:287\n4144#9,6:322\n4144#9,6:372\n4144#9,6:415\n72#10,6:297\n78#10:331\n82#10:336\n154#11:342\n154#11:350\n154#11:425\n154#11:426\n154#11:432\n154#11:433\n154#11:434\n77#12,2:351\n79#12:381\n73#12,6:390\n79#12:424\n83#12:431\n83#12:446\n81#13:447\n107#13,2:448\n*S KotlinDebug\n*F\n+ 1 MusicEditScreen.kt\ncom/yalla/yalla/module/media/music/MusicEditScreen\n*L\n77#1:228,11\n78#1:239\n80#1:247\n86#1:254\n91#1:279,8\n91#1:293,3\n96#1:314,8\n96#1:328,3\n96#1:332,3\n91#1:337,3\n180#1:343\n181#1:364,8\n181#1:378,3\n190#1:382\n190#1:383\n190#1:407,8\n190#1:421,3\n190#1:427,3\n222#1:435\n181#1:442,3\n78#1:240,6\n80#1:248,6\n86#1:255,6\n180#1:344,6\n190#1:384,6\n222#1:436,6\n79#1:246\n91#1:262,6\n91#1:296\n91#1:341\n91#1:268,11\n96#1:303,11\n96#1:335\n91#1:340\n181#1:353,11\n190#1:396,11\n190#1:430\n181#1:445\n91#1:287,6\n96#1:322,6\n181#1:372,6\n190#1:415,6\n96#1:297,6\n96#1:331\n96#1:336\n155#1:342\n184#1:350\n198#1:425\n199#1:426\n218#1:432\n220#1:433\n221#1:434\n181#1:351,2\n181#1:381\n190#1:390,6\n190#1:424\n190#1:431\n181#1:446\n180#1:447\n180#1:448,2\n*E\n"})
public final class MusicEditScreen extends o00O00O {
    public static final int $stable = 0;

    @NotNull
    public static final MusicEditScreen INSTANCE = new MusicEditScreen();

    @SourceDebugExtension({"SMAP\nMusicEditScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicEditScreen.kt\ncom/yalla/yalla/module/media/music/MusicEditScreen$Content$1$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,227:1\n766#2:228\n857#2,2:229\n766#2:231\n857#2,2:232\n*S KotlinDebug\n*F\n+ 1 MusicEditScreen.kt\ncom/yalla/yalla/module/media/music/MusicEditScreen$Content$1$3\n*L\n126#1:228\n126#1:229,2\n131#1:231\n131#1:232,2\n*E\n"})
    public static final class OooO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f24423OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o0O0o00O f24424OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ List<MusicTable> f24425OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO(boolean z, List<? extends MusicTable> list, o0O0o00O o0o0o00o) {
            super(0);
            this.f24423OooO0Oo = z;
            this.f24425OooO0o0 = list;
            this.f24424OooO0o = o0o0o00o;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            boolean z = this.f24423OooO0Oo;
            List<MusicTable> list = this.f24425OooO0o0;
            if (z) {
                if (list != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (Intrinsics.areEqual(((MusicTable) obj).isSelected.getValue(), Boolean.TRUE)) {
                            arrayList.add(obj);
                        }
                    }
                    boolean z2 = oOO0.f54098OooO00o;
                    oOO0.OooO00o(arrayList);
                    this.f24424OooO0o.getClass();
                }
            } else if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list) {
                    if (Intrinsics.areEqual(((MusicTable) obj2).isSelected.getValue(), Boolean.TRUE)) {
                        arrayList2.add(obj2);
                    }
                }
                LiveEventBus.get("MUSIC_LIST_UPDATE").post(arrayList2);
            }
            oo0oOO0.OooO0o(null);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1<Boolean, Unit> f24426OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f24427OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(Function1<? super Boolean, Unit> function1, MutableState<Boolean> mutableState) {
            super(0);
            this.f24426OooO0Oo = function1;
            this.f24427OooO0o0 = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            MutableState<Boolean> mutableState = this.f24427OooO0o0;
            MusicEditScreen.BottomArea$lambda$10(mutableState, !MusicEditScreen.BottomArea$lambda$9(mutableState));
            this.f24426OooO0Oo.invoke(Boolean.valueOf(MusicEditScreen.BottomArea$lambda$9(mutableState)));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f24428OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Function0<Unit> function0) {
            super(0);
            this.f24428OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f24428OooO0Oo.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f24429OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f24431OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ BoxScope f24432OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f24433OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Function1<Boolean, Unit> f24434OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ int f24435OooOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0OO(BoxScope boxScope, boolean z, int i, Function1<? super Boolean, Unit> function1, Function0<Unit> function0, int i2) {
            super(2);
            this.f24432OooO0o0 = boxScope;
            this.f24431OooO0o = z;
            this.f24433OooO0oO = i;
            this.f24434OooO0oo = function1;
            this.f24429OooO = function0;
            this.f24435OooOO0 = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            MusicEditScreen.this.BottomArea(this.f24432OooO0o0, this.f24431OooO0o, this.f24433OooO0oO, this.f24434OooO0oo, this.f24429OooO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f24435OooOO0 | 1));
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nMusicEditScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicEditScreen.kt\ncom/yalla/yalla/module/media/music/MusicEditScreen$Content$1$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,227:1\n1855#2,2:228\n1855#2,2:230\n766#2:232\n857#2,2:233\n*S KotlinDebug\n*F\n+ 1 MusicEditScreen.kt\ncom/yalla/yalla/module/media/music/MusicEditScreen$Content$1$2\n*L\n110#1:228,2\n115#1:230,2\n120#1:232\n120#1:233,2\n*E\n"})
    public static final class OooO0o extends Lambda implements Function1<Boolean, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f24436OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableIntState f24437OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ List<MusicTable> f24438OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0o(boolean z, List<? extends MusicTable> list, MutableIntState mutableIntState) {
            super(1);
            this.f24436OooO0Oo = z;
            this.f24438OooO0o0 = list;
            this.f24437OooO0o = mutableIntState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            boolean z = this.f24436OooO0Oo;
            MutableIntState mutableIntState = this.f24437OooO0o;
            int size = 0;
            List<MusicTable> list = this.f24438OooO0o0;
            if (z) {
                if (list != null) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        ((MusicTable) it.next()).isSelected.setValue(Boolean.valueOf(zBooleanValue));
                    }
                }
                if (zBooleanValue && list != null) {
                    size = list.size();
                }
                mutableIntState.setValue(size);
            } else {
                if (list != null) {
                    for (MusicTable musicTable : list) {
                        if (!musicTable.isExist) {
                            musicTable.isSelected.setValue(Boolean.valueOf(zBooleanValue));
                        }
                    }
                }
                if (zBooleanValue && list != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (!((MusicTable) obj).isExist) {
                            arrayList.add(obj);
                        }
                    }
                    size = arrayList.size();
                }
                mutableIntState.setValue(size);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f24440OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ColumnScope f24441OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(ColumnScope columnScope, int i) {
            super(2);
            this.f24441OooO0o0 = columnScope;
            this.f24440OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f24440OooO0o | 1);
            MusicEditScreen.this.Content(this.f24441OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nMusicEditScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicEditScreen.kt\ncom/yalla/yalla/module/media/music/MusicEditScreen$ListPage$1\n+ 2 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n1#1,227:1\n171#2,12:228\n*S KotlinDebug\n*F\n+ 1 MusicEditScreen.kt\ncom/yalla/yalla/module/media/music/MusicEditScreen$ListPage$1\n*L\n158#1:228,12\n*E\n"})
    public static final class OooOO0O extends Lambda implements Function1<LazyListScope, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ List<MusicTable> f24442OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<Integer> f24443OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f24444OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f24445OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOO0O(List<? extends MusicTable> list, boolean z, MutableState<Integer> mutableState, int i) {
            super(1);
            this.f24442OooO0Oo = list;
            this.f24444OooO0o0 = z;
            this.f24443OooO0o = mutableState;
            this.f24445OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(LazyListScope lazyListScope) {
            LazyListScope LazyColumn = lazyListScope;
            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
            final List<MusicTable> list = this.f24442OooO0Oo;
            int size = list.size();
            Function1<Integer, Object> function1 = new Function1<Integer, Object>() { // from class: com.yalla.yalla.module.media.music.MusicEditScreen$ListPage$1$invoke$$inlined$itemsIndexed$default$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Integer num) {
                    list.get(num.intValue());
                    return null;
                }
            };
            final MutableState<Integer> mutableState = this.f24443OooO0o;
            final int i = this.f24445OooO0oO;
            final boolean z = this.f24444OooO0o0;
            LazyColumn.items(size, null, function1, ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>(list, z, mutableState, i) { // from class: com.yalla.yalla.module.media.music.MusicEditScreen$ListPage$1$invoke$$inlined$itemsIndexed$default$3

                /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                public final /* synthetic */ List f24420OooO0Oo;

                /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
                public final /* synthetic */ MutableState f24421OooO0o;

                /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
                public final /* synthetic */ boolean f24422OooO0o0;

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
                        MusicTable musicTable = (MusicTable) this.f24420OooO0Oo.get(iIntValue);
                        OooO oooO = this.f24422OooO0o0 ? OooO.OooO0O0.f24546OooO00o : OooO.OooO00o.f24545OooO00o;
                        composer2.startReplaceableGroup(1157296644);
                        MutableState mutableState2 = this.f24421OooO0o;
                        boolean zChanged = composer2.changed(mutableState2);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new OooO0OO(mutableState2);
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceableGroup();
                        OooO0o.OooO0O0(musicTable, oooO, false, null, null, null, (Function1) objRememberedValue, null, null, composer2, 8, 444);
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

    public static final class OooOOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f24446OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ List<MusicTable> f24448OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ColumnScope f24449OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableState<Integer> f24450OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ boolean f24451OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOOO0(ColumnScope columnScope, List<? extends MusicTable> list, MutableState<Integer> mutableState, boolean z, int i) {
            super(2);
            this.f24449OooO0o0 = columnScope;
            this.f24448OooO0o = list;
            this.f24450OooO0oO = mutableState;
            this.f24451OooO0oo = z;
            this.f24446OooO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            MusicEditScreen.this.ListPage(this.f24449OooO0o0, this.f24448OooO0o, this.f24450OooO0oO, this.f24451OooO0oo, composer, RecomposeScopeImplKt.updateChangedFlags(this.f24446OooO | 1));
            return Unit.INSTANCE;
        }
    }

    private MusicEditScreen() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void BottomArea(BoxScope boxScope, boolean z, int i, Function1<? super Boolean, Unit> function1, Function0<Unit> function0, Composer composer, int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(723520261);
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i2 & 7168) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((57344 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if ((46811 & i3) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(723520261, i3, -1, "com.yalla.yalla.module.media.music.MusicEditScreen.BottomArea (MusicEditScreen.kt:173)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState = (MutableState) objRememberedValue;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(BackgroundKt.m169backgroundbw27NRU$default(companion2, o0oO0O0o.f47059o000OOo, null, 2, null), Dp.m3765constructorimpl(60)), 0.0f, 1, null);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            Modifier modifierAlign = boxScope.align(modifierFillMaxWidth$default, companion3.getBottomCenter());
            Alignment.Vertical centerVertically = companion3.getCenterVertically();
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion4, composerM1309constructorimpl, measurePolicyRowMeasurePolicy, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(511388516);
            boolean zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function1);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new OooO00o(function1, mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierOooO0O0 = o0O0O00.OooO0O0(companion2, false, false, 0L, false, null, null, null, (Function0) objRememberedValue2, 255);
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooOOO.OooO00o(companion3, arrangement.getStart(), composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierOooO0O0);
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
            Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion4, composerM1309constructorimpl2, measurePolicyOooO00o, composerM1309constructorimpl2, currentCompositionLocalMap2);
            if (composerM1309constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            Painter painterPainterResource = PainterResources_androidKt.painterResource(BottomArea$lambda$9(mutableState) ? oO00OOO.ic_music_selected : oO00OOO.ic_music_unselected, composerStartRestartGroup, 0);
            float f = 16;
            ImageKt.Image(painterPainterResource, (String) null, SizeKt.m523size3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion2, Dp.m3765constructorimpl(f), 0.0f, Dp.m3765constructorimpl(12), 0.0f, 10, null), Dp.m3765constructorimpl(24)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
            TextKt.m1251Text4IGK_g(StringResources_androidKt.stringResource(oO00OOo0.select_all, composerStartRestartGroup, 0), (Modifier) null, o0oO0O0o.f46960OooOOo, TextUnitKt.getSp(16), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 199680, 0, 131026);
            p426o0OoOO.o000oOoO.OooO00o(composerStartRestartGroup);
            String strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(o0000.OooO0OO(z ? oO00OOo0.delete : oO00OOo0.addfriend), i > 0 ? OooO0OO.OooO00o.OooO00o("(", i, ")") : "");
            long j = i > 0 ? o0oO0O0o.f46946OooO0O0 : o0oO0O0o.f46951OooO0oO;
            long j2 = i > 0 ? o0oO0O0o.f47002Oooooo0 : o0oO0O0o.f46948OooO0Oo;
            long jOooO0OO = o0000O0.OooO0OO(15, composerStartRestartGroup, 6);
            boolean z2 = i > 0;
            PaddingValues paddingValuesM470PaddingValuesYgX7TsA = PaddingKt.m470PaddingValuesYgX7TsA(Dp.m3765constructorimpl(20), Dp.m3765constructorimpl(11));
            Modifier modifierM530widthInVpY3zN4$default = SizeKt.m530widthInVpY3zN4$default(PaddingKt.m480paddingqDBjuR0$default(companion2, 0.0f, 0.0f, Dp.m3765constructorimpl(f), 0.0f, 11, null), Dp.m3765constructorimpl(128), 0.0f, 2, null);
            Color colorM1660boximpl = Color.m1660boximpl(j);
            Color colorM1660boximpl2 = Color.m1660boximpl(j2);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged2 = composerStartRestartGroup.changed(function0);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new OooO0O0(function0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            o00000O0.OooO00o(strOooO00o, jOooO0OO, null, null, colorM1660boximpl, colorM1660boximpl2, null, 0.0f, paddingValuesM470PaddingValuesYgX7TsA, z2, false, 0L, false, null, null, null, null, null, modifierM530widthInVpY3zN4$default, (Function0) objRememberedValue3, composerStartRestartGroup, 100663296, 100663296, 261324);
            if (androidx.compose.material.OooOO0.OooO0O0(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(boxScope, z, i, function1, function0, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BottomArea$lambda$10(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean BottomArea$lambda$9(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void ListPage(ColumnScope columnScope, List<? extends MusicTable> list, MutableState<Integer> mutableState, boolean z, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(944720338);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(944720338, i, -1, "com.yalla.yalla.module.media.music.MusicEditScreen.ListPage (MusicEditScreen.kt:147)");
        }
        LazyDslKt.LazyColumn(androidx.compose.foundation.layout.OooOO0.OooO00o(columnScope, PaddingKt.m480paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Dp.m3765constructorimpl(60), 7, null), 1.0f, false, 2, null), null, null, false, null, null, null, false, new OooOO0O(list, z, mutableState, i), composerStartRestartGroup, 0, 254);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO0(columnScope, list, mutableState, z, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void navigate$default(MusicEditScreen musicEditScreen, boolean z, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            arrayList = null;
        }
        musicEditScreen.navigate(z, arrayList);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // p526o0o0OOO0.o00O00O
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public void Content(@NotNull ColumnScope columnScope, @Nullable Composer composer, int i) {
        List<? extends MusicTable> list;
        String strOooO0OO;
        Composer composer2;
        String str;
        Intrinsics.checkNotNullParameter(columnScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-329750969);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-329750969, i, -1, "com.yalla.yalla.module.media.music.MusicEditScreen.Content (MusicEditScreen.kt:73)");
            }
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(o0O0o00O.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            o0O0o00O o0o0o00o = (o0O0o00O) viewModel;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotIntStateKt.mutableIntStateOf(0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableIntState mutableIntState = (MutableIntState) objRememberedValue;
            Bundle bundleOooO0O0 = o00O.OooO0O0((NavBackStackEntry) composerStartRestartGroup.consume(o00O.f53592OooO00o), composerStartRestartGroup);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(bundleOooO0O0);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = Boolean.valueOf(bundleOooO0O0.getBoolean("isFromEdit", true));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            boolean zBooleanValue = ((Boolean) objRememberedValue2).booleanValue();
            if (zBooleanValue) {
                composerStartRestartGroup.startReplaceableGroup(635079162);
                list = (List) LiveDataAdapterKt.observeAsState(o0o0o00o.f56325OooO0OO, composerStartRestartGroup, 8).getValue();
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(635079243);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                boolean zChanged2 = composerStartRestartGroup.changed(bundleOooO0O0);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = bundleOooO0O0.getParcelableArrayList("folderMusicList");
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                ArrayList<Audio> list2 = (ArrayList) objRememberedValue3;
                if (list2 != null) {
                    o0o0o00o.getClass();
                    Intrinsics.checkNotNullParameter(list2, "list");
                    MutableLiveData<List<MusicTable>> mutableLiveData = o0o0o00o.f56328OooO0o0;
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                    for (Audio audio : list2) {
                        MusicTable musicTable = new MusicTable();
                        musicTable.mTitle = audio.getTitle();
                        musicTable.mTitleKey = audio.getTitleKey();
                        musicTable.mArtist = audio.getArtist();
                        musicTable.mArtistKey = audio.getArtistKey();
                        musicTable.mComposer = audio.getComposer();
                        musicTable.mAlbum = audio.getAlbum();
                        musicTable.mAlbumKey = audio.getAlbumKey();
                        musicTable.mDisplayName = audio.getDisplayName();
                        musicTable.mMimeType = audio.getMimeType();
                        musicTable.mPath = audio.getPath();
                        o000000O o000000o2 = o000000O.f46674OooO00o;
                        musicTable.user = androidx.compose.runtime.Oooo0.OooO00o();
                        musicTable.mDuration = audio.getDuration();
                        arrayList.add(musicTable);
                    }
                    mutableLiveData.setValue(arrayList);
                    List<MusicTable> value = o0o0o00o.f56325OooO0OO.getValue();
                    if (value != null) {
                        for (MusicTable musicTable2 : value) {
                            List<MusicTable> value2 = mutableLiveData.getValue();
                            if (value2 != null) {
                                Intrinsics.checkNotNullExpressionValue(value2, "value");
                                for (MusicTable musicTable3 : value2) {
                                    if (Intrinsics.areEqual(musicTable3.mPath, musicTable2.mPath)) {
                                        musicTable3.isExist = true;
                                    }
                                }
                            }
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                }
                list = (List) LiveDataAdapterKt.observeAsState(o0o0o00o.f56328OooO0o0, composerStartRestartGroup, 8).getValue();
                composerStartRestartGroup.endReplaceableGroup();
            }
            List<? extends MusicTable> list3 = list;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierStatusBarsPadding = WindowInsetsPadding_androidKt.statusBarsPadding(BackgroundKt.m169backgroundbw27NRU$default(companion2, o0oO0O0o.f46991OoooOOO, null, 2, null));
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO00o = p018OooOoo0.OooOOO.OooO00o(companion3, false, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion4, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyOooO00o2 = androidx.compose.material.OooO0o.OooO00o(companion3, Arrangement.INSTANCE.getTop(), composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
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
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            if (zBooleanValue) {
                String strOooO0OO2 = o0000.OooO0OO(oO00OOo0.title_activity_music);
                if ((list3 != null ? list3.size() : 0) > 0) {
                    str = "(" + (list3 != null ? Integer.valueOf(list3.size()) : null) + ")";
                } else {
                    str = "";
                }
                strOooO0OO = androidx.camera.core.impl.OooOOOO.OooO00o(strOooO0OO2, str);
            } else {
                strOooO0OO = o0000.OooO0OO(oO00OOo0.add_music);
            }
            composer2 = composerStartRestartGroup;
            t1.OooO00o(strOooO0OO, 0.0f, o0oO0O0o.f46946OooO0O0, null, null, null, null, null, null, composerStartRestartGroup, 0, 506);
            composer2.startReplaceableGroup(-853263419);
            if (list3 != null) {
                INSTANCE.ListPage(columnScopeInstance, list3, mutableIntState, zBooleanValue, composer2, 25030);
                Unit unit2 = Unit.INSTANCE;
            }
            o0ooOOo.OooO00o(composer2);
            INSTANCE.BottomArea(boxScopeInstance, zBooleanValue, mutableIntState.getValue().intValue(), new OooO0o(zBooleanValue, list3, mutableIntState), new OooO(zBooleanValue, list3, o0o0o00o), composer2, 196614);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            o00000O.OooO0O0(true, composer2, 6, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0(columnScope, i));
    }

    @Override // p526o0o0OOO0.o00O00O
    @Composable
    /* JADX INFO: renamed from: getWindowBackgroundColor-WaAFU9c */
    public long mo4198getWindowBackgroundColorWaAFU9c(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-539113918);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-539113918, i, -1, "com.yalla.yalla.module.media.music.MusicEditScreen.getWindowBackgroundColor (MusicEditScreen.kt:142)");
        }
        int i2 = o0oO0O0o.f47152o00OOOo;
        long j = o0oO0O0o.f46991OoooOOO;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return j;
    }

    public final void navigate(boolean isFromEdit, @Nullable ArrayList<Audio> list) {
        MusicEditScreen musicEditScreen = INSTANCE;
        Bundle bundleOooO00o = o00Ooo.OooO00o();
        bundleOooO00o.putBoolean("isFromEdit", isFromEdit);
        bundleOooO00o.putParcelableArrayList("folderMusicList", list);
        oo0oOO0.OooO0o0(musicEditScreen, bundleOooO00o, false, null, 12);
    }
}
