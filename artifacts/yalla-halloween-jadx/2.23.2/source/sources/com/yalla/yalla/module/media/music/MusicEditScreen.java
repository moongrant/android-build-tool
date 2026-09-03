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
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import o000O.o0ooOOo;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p194o00o0OO.o00O000o;
import p194o00o0OO.o00O0OO0;
import p195o00o0OO0.o00000OO;
import p408o0Oo0Oo0.o00Oo0;
import p475o0Ooooo0.o0O00oO0;
import p476o0OooooO.o0OOo000;
import p516o0o0O00o.o0O0oo0o;
import p532o0o0OOo0.o000O0;
import p532o0o0OOo0.o00O00;
import p532o0o0OOo0.o00O00O;
import p535o0o0Oo0.oO0O00;
import p562o0oOo000.o000000;
import p584o0oOoo0O.oo0o0O0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b$\u0010%J7\u0010\f\u001a\u00020\u000b*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\f\u0010\rJT\u0010\u0016\u001a\u00020\u000b*\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072!\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u000b0\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0014H\u0003¢\u0006\u0004\b\u0016\u0010\u0017J8\u0010\u001d\u001a\u00020\u000b2\b\b\u0002\u0010\n\u001a\u00020\t2\u001c\b\u0002\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018j\n\u0012\u0004\u0012\u00020\u0019\u0018\u0001`\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\tJ\u0013\u0010\u001e\u001a\u00020\u000b*\u00020\u0002H\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010#\u001a\u00020 H\u0017ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b!\u0010\"\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006&²\u0006\u000e\u0010\u0012\u001a\u00020\t8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/yalla/yalla/module/media/music/MusicEditScreen;", "Lo0o0OOo0/o000O0;", "Landroidx/compose/foundation/layout/ColumnScope;", "", "Lcom/yalla/yalla/data/db/model/MusicTable;", "musicList", "Landroidx/compose/runtime/MutableState;", "", "selectCount", "", "isFromEdit", "", "ListPage", "(Landroidx/compose/foundation/layout/ColumnScope;Ljava/util/List;Landroidx/compose/runtime/MutableState;ZLandroidx/compose/runtime/Composer;I)V", "Landroidx/compose/foundation/layout/BoxScope;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "isSelectAll", "selectAllClick", "Lkotlin/Function0;", "confirmClick", "BottomArea", "(Landroidx/compose/foundation/layout/BoxScope;ZILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Ljava/util/ArrayList;", "Lcom/yalla/yalla/util/Player/Audio;", "Lkotlin/collections/ArrayList;", "list", "isFromVideo", "navigate", "Content", "(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/graphics/Color;", "getWindowBackgroundColor-WaAFU9c", "(Landroidx/compose/runtime/Composer;I)J", "getWindowBackgroundColor", "<init>", "()V", "Media_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nMusicEditScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicEditScreen.kt\ncom/yalla/yalla/module/media/music/MusicEditScreen\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 11 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 12 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 13 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,232:1\n81#2,11:233\n25#3:244\n36#3:252\n36#3:259\n36#3:266\n456#3,8:291\n464#3,3:305\n456#3,8:326\n464#3,3:340\n467#3,3:344\n467#3,3:349\n25#3:355\n456#3,8:376\n464#3,3:390\n50#3:394\n49#3:395\n456#3,8:419\n464#3,3:433\n467#3,3:439\n36#3:447\n467#3,3:454\n1097#4,6:245\n1097#4,6:253\n1097#4,6:260\n1097#4,6:267\n1097#4,6:356\n1097#4,6:396\n1097#4,6:448\n76#5:251\n1#6:273\n66#7,6:274\n72#7:308\n76#7:353\n78#8,11:280\n78#8,11:315\n91#8:347\n91#8:352\n78#8,11:365\n78#8,11:408\n91#8:442\n91#8:457\n4144#9,6:299\n4144#9,6:334\n4144#9,6:384\n4144#9,6:427\n72#10,6:309\n78#10:343\n82#10:348\n154#11:354\n154#11:362\n154#11:437\n154#11:438\n154#11:444\n154#11:445\n154#11:446\n77#12,2:363\n79#12:393\n73#12,6:402\n79#12:436\n83#12:443\n83#12:458\n81#13:459\n107#13,2:460\n*S KotlinDebug\n*F\n+ 1 MusicEditScreen.kt\ncom/yalla/yalla/module/media/music/MusicEditScreen\n*L\n78#1:233,11\n79#1:244\n81#1:252\n82#1:259\n88#1:266\n93#1:291,8\n93#1:305,3\n98#1:326,8\n98#1:340,3\n98#1:344,3\n93#1:349,3\n185#1:355\n186#1:376,8\n186#1:390,3\n195#1:394\n195#1:395\n195#1:419,8\n195#1:433,3\n195#1:439,3\n227#1:447\n186#1:454,3\n79#1:245,6\n81#1:253,6\n82#1:260,6\n88#1:267,6\n185#1:356,6\n195#1:396,6\n227#1:448,6\n80#1:251\n93#1:274,6\n93#1:308\n93#1:353\n93#1:280,11\n98#1:315,11\n98#1:347\n93#1:352\n186#1:365,11\n195#1:408,11\n195#1:442\n186#1:457\n93#1:299,6\n98#1:334,6\n186#1:384,6\n195#1:427,6\n98#1:309,6\n98#1:343\n98#1:348\n160#1:354\n189#1:362\n203#1:437\n204#1:438\n223#1:444\n225#1:445\n226#1:446\n186#1:363,2\n186#1:393\n195#1:402,6\n195#1:436\n195#1:443\n186#1:458\n185#1:459\n185#1:460,2\n*E\n"})
public final class MusicEditScreen extends o000O0 {
    public static final int $stable = 0;

    @NotNull
    public static final MusicEditScreen INSTANCE = new MusicEditScreen();

    @SourceDebugExtension({"SMAP\nMusicEditScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicEditScreen.kt\ncom/yalla/yalla/module/media/music/MusicEditScreen$Content$1$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,232:1\n766#2:233\n857#2,2:234\n766#2:236\n857#2,2:237\n*S KotlinDebug\n*F\n+ 1 MusicEditScreen.kt\ncom/yalla/yalla/module/media/music/MusicEditScreen$Content$1$3\n*L\n128#1:233\n128#1:234,2\n136#1:236\n136#1:237,2\n*E\n"})
    public static final class OooO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f23956OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f23957OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ List<MusicTable> f23958OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ oo0o0O0 f23959OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO(boolean z, List<? extends MusicTable> list, boolean z2, oo0o0O0 oo0o0o0) {
            super(0);
            this.f23956OooO0Oo = z;
            this.f23958OooO0o0 = list;
            this.f23957OooO0o = z2;
            this.f23959OooO0oO = oo0o0o0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            boolean z = this.f23956OooO0Oo;
            List<MusicTable> list = this.f23958OooO0o0;
            if (z) {
                if (list != null) {
                    ArrayList musicList = new ArrayList();
                    for (Object obj : list) {
                        if (Intrinsics.areEqual(((MusicTable) obj).isSelected.getValue(), Boolean.TRUE)) {
                            musicList.add(obj);
                        }
                    }
                    if (this.f23957OooO0o) {
                        this.f23959OooO0oO.getClass();
                        Intrinsics.checkNotNullParameter(musicList, "deleteList");
                        Intrinsics.checkNotNullParameter(musicList, "musicList");
                        o00Oo0.OooO00o().OooOoO0().OooO0o0(musicList);
                    } else {
                        boolean z2 = oO0O00.f53970OooO00o;
                        oO0O00.OooO00o(musicList);
                    }
                }
            } else if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (Intrinsics.areEqual(((MusicTable) obj2).isSelected.getValue(), Boolean.TRUE)) {
                        arrayList.add(obj2);
                    }
                }
                LiveEventBus.get("MUSIC_LIST_UPDATE").post(arrayList);
            }
            o00O00.OooO0o(null);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1<Boolean, Unit> f23960OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f23961OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(Function1<? super Boolean, Unit> function1, MutableState<Boolean> mutableState) {
            super(0);
            this.f23960OooO0Oo = function1;
            this.f23961OooO0o0 = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            MutableState<Boolean> mutableState = this.f23961OooO0o0;
            MusicEditScreen.BottomArea$lambda$11(mutableState, !MusicEditScreen.BottomArea$lambda$10(mutableState));
            this.f23960OooO0Oo.invoke(Boolean.valueOf(MusicEditScreen.BottomArea$lambda$10(mutableState)));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f23962OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Function0<Unit> function0) {
            super(0);
            this.f23962OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f23962OooO0Oo.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f23963OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f23965OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ BoxScope f23966OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f23967OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Function1<Boolean, Unit> f23968OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ int f23969OooOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0OO(BoxScope boxScope, boolean z, int i, Function1<? super Boolean, Unit> function1, Function0<Unit> function0, int i2) {
            super(2);
            this.f23966OooO0o0 = boxScope;
            this.f23965OooO0o = z;
            this.f23967OooO0oO = i;
            this.f23968OooO0oo = function1;
            this.f23963OooO = function0;
            this.f23969OooOO0 = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            MusicEditScreen.this.BottomArea(this.f23966OooO0o0, this.f23965OooO0o, this.f23967OooO0oO, this.f23968OooO0oo, this.f23963OooO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f23969OooOO0 | 1));
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nMusicEditScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicEditScreen.kt\ncom/yalla/yalla/module/media/music/MusicEditScreen$Content$1$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,232:1\n1855#2,2:233\n1855#2,2:235\n766#2:237\n857#2,2:238\n*S KotlinDebug\n*F\n+ 1 MusicEditScreen.kt\ncom/yalla/yalla/module/media/music/MusicEditScreen$Content$1$2\n*L\n112#1:233,2\n117#1:235,2\n122#1:237\n122#1:238,2\n*E\n"})
    public static final class OooO0o extends Lambda implements Function1<Boolean, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f23970OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableIntState f23971OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ List<MusicTable> f23972OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0o(boolean z, List<? extends MusicTable> list, MutableIntState mutableIntState) {
            super(1);
            this.f23970OooO0Oo = z;
            this.f23972OooO0o0 = list;
            this.f23971OooO0o = mutableIntState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            boolean z = this.f23970OooO0Oo;
            MutableIntState mutableIntState = this.f23971OooO0o;
            int size = 0;
            List<MusicTable> list = this.f23972OooO0o0;
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
        public final /* synthetic */ int f23974OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ColumnScope f23975OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(ColumnScope columnScope, int i) {
            super(2);
            this.f23975OooO0o0 = columnScope;
            this.f23974OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f23974OooO0o | 1);
            MusicEditScreen.this.Content(this.f23975OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nMusicEditScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicEditScreen.kt\ncom/yalla/yalla/module/media/music/MusicEditScreen$ListPage$1\n+ 2 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n1#1,232:1\n171#2,12:233\n*S KotlinDebug\n*F\n+ 1 MusicEditScreen.kt\ncom/yalla/yalla/module/media/music/MusicEditScreen$ListPage$1\n*L\n163#1:233,12\n*E\n"})
    public static final class OooOO0O extends Lambda implements Function1<LazyListScope, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ List<MusicTable> f23976OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<Integer> f23977OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f23978OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f23979OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOO0O(List<? extends MusicTable> list, boolean z, MutableState<Integer> mutableState, int i) {
            super(1);
            this.f23976OooO0Oo = list;
            this.f23978OooO0o0 = z;
            this.f23977OooO0o = mutableState;
            this.f23979OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(LazyListScope lazyListScope) {
            LazyListScope LazyColumn = lazyListScope;
            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
            final List<MusicTable> list = this.f23976OooO0Oo;
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
            final MutableState<Integer> mutableState = this.f23977OooO0o;
            final int i = this.f23979OooO0oO;
            final boolean z = this.f23978OooO0o0;
            LazyColumn.items(size, null, function1, ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>(list, z, mutableState, i) { // from class: com.yalla.yalla.module.media.music.MusicEditScreen$ListPage$1$invoke$$inlined$itemsIndexed$default$3

                /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                public final /* synthetic */ List f23953OooO0Oo;

                /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
                public final /* synthetic */ MutableState f23954OooO0o;

                /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
                public final /* synthetic */ boolean f23955OooO0o0;

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
                        MusicTable musicTable = (MusicTable) this.f23953OooO0Oo.get(iIntValue);
                        OooO oooO = this.f23955OooO0o0 ? OooO.OooO0O0.f24082OooO00o : OooO.OooO00o.f24081OooO00o;
                        composer2.startReplaceableGroup(1157296644);
                        MutableState mutableState2 = this.f23954OooO0o;
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
        public final /* synthetic */ int f23980OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ List<MusicTable> f23982OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ColumnScope f23983OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableState<Integer> f23984OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ boolean f23985OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOOO0(ColumnScope columnScope, List<? extends MusicTable> list, MutableState<Integer> mutableState, boolean z, int i) {
            super(2);
            this.f23983OooO0o0 = columnScope;
            this.f23982OooO0o = list;
            this.f23984OooO0oO = mutableState;
            this.f23985OooO0oo = z;
            this.f23980OooO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            MusicEditScreen.this.ListPage(this.f23983OooO0o0, this.f23982OooO0o, this.f23984OooO0oO, this.f23985OooO0oo, composer, RecomposeScopeImplKt.updateChangedFlags(this.f23980OooO | 1));
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
                ComposerKt.traceEventStart(723520261, i3, -1, "com.yalla.yalla.module.media.music.MusicEditScreen.BottomArea (MusicEditScreen.kt:183)");
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
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m511height3ABfNKs(BackgroundKt.m171backgroundbw27NRU$default(companion2, o0OOo000.f48200o000000o, null, 2, null), Dp.m3775constructorimpl(60)), 0.0f, 1, null);
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
            Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion4, composerM1320constructorimpl, measurePolicyRowMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
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
            MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooOO0O.OooO00o(companion3, arrangement.getStart(), composerStartRestartGroup, 0, -1323940314);
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
            Composer composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion4, composerM1320constructorimpl2, measurePolicyOooO00o, composerM1320constructorimpl2, currentCompositionLocalMap2);
            if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            Painter painterPainterResource = PainterResources_androidKt.painterResource(BottomArea$lambda$10(mutableState) ? p562o0oOo000.o0O0O00.ic_music_selected : p562o0oOo000.o0O0O00.ic_music_unselected, composerStartRestartGroup, 0);
            float f = 16;
            ImageKt.Image(painterPainterResource, (String) null, SizeKt.m525size3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(companion2, Dp.m3775constructorimpl(f), 0.0f, Dp.m3775constructorimpl(12), 0.0f, 10, null), Dp.m3775constructorimpl(24)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
            TextKt.m1261Text4IGK_g(StringResources_androidKt.stringResource(o000000.select_all, composerStartRestartGroup, 0), (Modifier) null, o0OOo000.f48149OooOOo, TextUnitKt.getSp(16), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 199680, 0, 131026);
            o0ooOOo.OooO00o(composerStartRestartGroup);
            String strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(o0000.OooO0OO(z ? o000000.delete : o000000.addfriend), i > 0 ? OooO0OO.OooO00o.OooO00o("(", i, ")") : "");
            long j = i > 0 ? o0OOo000.f48135OooO0O0 : o0OOo000.f48140OooO0oO;
            long j2 = i > 0 ? o0OOo000.f48193Ooooooo : o0OOo000.f48137OooO0Oo;
            long jOooO0OO = o0000O0.OooO0OO(15, composerStartRestartGroup, 6);
            boolean z2 = i > 0;
            PaddingValues paddingValuesM472PaddingValuesYgX7TsA = PaddingKt.m472PaddingValuesYgX7TsA(Dp.m3775constructorimpl(20), Dp.m3775constructorimpl(11));
            Modifier modifierM532widthInVpY3zN4$default = SizeKt.m532widthInVpY3zN4$default(PaddingKt.m482paddingqDBjuR0$default(companion2, 0.0f, 0.0f, Dp.m3775constructorimpl(f), 0.0f, 11, null), Dp.m3775constructorimpl(128), 0.0f, 2, null);
            Color colorM1671boximpl = Color.m1671boximpl(j);
            Color colorM1671boximpl2 = Color.m1671boximpl(j2);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged2 = composerStartRestartGroup.changed(function0);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new OooO0O0(function0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            o00O0OO0.OooO00o(strOooO00o, jOooO0OO, null, null, colorM1671boximpl, colorM1671boximpl2, null, 0.0f, paddingValuesM472PaddingValuesYgX7TsA, z2, false, 0L, false, null, null, null, null, null, modifierM532widthInVpY3zN4$default, (Function0) objRememberedValue3, composerStartRestartGroup, 100663296, 100663296, 261324);
            if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
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
    public static final boolean BottomArea$lambda$10(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BottomArea$lambda$11(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void ListPage(ColumnScope columnScope, List<? extends MusicTable> list, MutableState<Integer> mutableState, boolean z, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(944720338);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(944720338, i, -1, "com.yalla.yalla.module.media.music.MusicEditScreen.ListPage (MusicEditScreen.kt:156)");
        }
        LazyDslKt.LazyColumn(androidx.compose.foundation.layout.OooOO0.OooO00o(columnScope, PaddingKt.m482paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl(60), 7, null), 1.0f, false, 2, null), null, null, false, null, null, null, false, new OooOO0O(list, z, mutableState, i), composerStartRestartGroup, 0, 254);
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
    public static /* synthetic */ void navigate$default(MusicEditScreen musicEditScreen, boolean z, ArrayList arrayList, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            arrayList = null;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        musicEditScreen.navigate(z, arrayList, z2);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // p532o0o0OOo0.o000O0
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
                ComposerKt.traceEventStart(-329750969, i, -1, "com.yalla.yalla.module.media.music.MusicEditScreen.Content (MusicEditScreen.kt:74)");
            }
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(oo0o0O0.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            oo0o0O0 oo0o0o0 = (oo0o0O0) viewModel;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotIntStateKt.mutableIntStateOf(0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableIntState mutableIntState = (MutableIntState) objRememberedValue;
            Bundle bundleOooO0O0 = o00O00O.OooO0O0((NavBackStackEntry) composerStartRestartGroup.consume(o00O00O.f53500OooO00o), composerStartRestartGroup);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(bundleOooO0O0);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = Boolean.valueOf(bundleOooO0O0.getBoolean("isFromEdit", true));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            boolean zBooleanValue = ((Boolean) objRememberedValue2).booleanValue();
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged2 = composerStartRestartGroup.changed(bundleOooO0O0);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = Boolean.valueOf(bundleOooO0O0.getBoolean("isFromVideo", false));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            boolean zBooleanValue2 = ((Boolean) objRememberedValue3).booleanValue();
            if (zBooleanValue) {
                composerStartRestartGroup.startReplaceableGroup(635079328);
                list = (List) LiveDataAdapterKt.observeAsState(oo0o0o0.f56700OooO0Oo, composerStartRestartGroup, 8).getValue();
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(635079409);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                boolean zChanged3 = composerStartRestartGroup.changed(bundleOooO0O0);
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged3 || objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = bundleOooO0O0.getParcelableArrayList("folderMusicList");
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                ArrayList<Audio> list2 = (ArrayList) objRememberedValue4;
                if (list2 != null) {
                    oo0o0o0.getClass();
                    Intrinsics.checkNotNullParameter(list2, "list");
                    MutableLiveData<List<MusicTable>> mutableLiveData = oo0o0o0.f56701OooO0o;
                    ArrayList arrayList = new ArrayList(CollectionsKt.OooO0oo(list2));
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
                        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                        musicTable.user = p004OooO0oO.o0OoOo0.OooO00o();
                        musicTable.mDuration = audio.getDuration();
                        arrayList.add(musicTable);
                    }
                    mutableLiveData.setValue(arrayList);
                    List<MusicTable> value = oo0o0o0.f56700OooO0Oo.getValue();
                    if (value != null) {
                        for (MusicTable musicTable2 : value) {
                            List<MusicTable> value2 = mutableLiveData.getValue();
                            if (value2 != null) {
                                Intrinsics.checkNotNull(value2);
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
                list = (List) LiveDataAdapterKt.observeAsState(oo0o0o0.f56701OooO0o, composerStartRestartGroup, 8).getValue();
                composerStartRestartGroup.endReplaceableGroup();
            }
            List<? extends MusicTable> list3 = list;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierStatusBarsPadding = WindowInsetsPadding_androidKt.statusBarsPadding(BackgroundKt.m171backgroundbw27NRU$default(companion2, o0OOo000.f48183OoooOoO, null, 2, null));
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO00o = androidx.compose.animation.Oooo000.OooO00o(companion3, false, composerStartRestartGroup, 0, -1323940314);
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
            Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion4, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyOooO0O0 = p022Oooo00O.o0O00oO0.OooO0O0(companion3, Arrangement.INSTANCE.getTop(), composerStartRestartGroup, 0, -1323940314);
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
            Composer composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion4, composerM1320constructorimpl2, measurePolicyOooO0O0, composerM1320constructorimpl2, currentCompositionLocalMap2);
            if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            if (zBooleanValue) {
                String strOooO0OO2 = o0000.OooO0OO(o000000.title_activity_music);
                if ((list3 != null ? list3.size() : 0) > 0) {
                    str = "(" + (list3 != null ? Integer.valueOf(list3.size()) : null) + ")";
                } else {
                    str = "";
                }
                strOooO0OO = androidx.camera.core.impl.OooOOOO.OooO00o(strOooO0OO2, str);
            } else {
                strOooO0OO = o0000.OooO0OO(o000000.add_music);
            }
            composer2 = composerStartRestartGroup;
            o0O0oo0o.OooO00o(strOooO0OO, 0.0f, o0OOo000.f48135OooO0O0, null, null, null, null, null, null, composerStartRestartGroup, 0, 506);
            composer2.startReplaceableGroup(-853263253);
            if (list3 != null) {
                INSTANCE.ListPage(columnScopeInstance, list3, mutableIntState, zBooleanValue, composer2, 25030);
                Unit unit2 = Unit.INSTANCE;
            }
            o00O000o.OooO00o(composer2);
            INSTANCE.BottomArea(boxScopeInstance, zBooleanValue, mutableIntState.getValue().intValue(), new OooO0o(zBooleanValue, list3, mutableIntState), new OooO(zBooleanValue, list3, zBooleanValue2, oo0o0o0), composer2, 196614);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            o00000OO.OooO0O0(true, composer2, 6, 0);
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

    @Override // p532o0o0OOo0.o000O0
    @Composable
    /* JADX INFO: renamed from: getWindowBackgroundColor-WaAFU9c */
    public long mo4200getWindowBackgroundColorWaAFU9c(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-539113918);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-539113918, i, -1, "com.yalla.yalla.module.media.music.MusicEditScreen.getWindowBackgroundColor (MusicEditScreen.kt:147)");
        }
        int i2 = o0OOo000.f48347o00OOooO;
        long j = o0OOo000.f48183OoooOoO;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return j;
    }

    public final void navigate(boolean isFromEdit, @Nullable ArrayList<Audio> list, boolean isFromVideo) {
        MusicEditScreen musicEditScreen = INSTANCE;
        Bundle bundleOooO00o = p063o0000oO.o000oOoO.OooO00o();
        bundleOooO00o.putBoolean("isFromEdit", isFromEdit);
        bundleOooO00o.putBoolean("isFromVideo", isFromVideo);
        bundleOooO00o.putParcelableArrayList("folderMusicList", list);
        o00O00.OooO0o0(musicEditScreen, bundleOooO00o, false, null, 12);
    }
}
