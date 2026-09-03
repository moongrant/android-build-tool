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
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotIntStateKt;
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
import com.code.android.util.o000O00O;
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
import kotlin.collections.CollectionsKt;
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
import o000O.o0ooOOo;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p022Oooo00O.o0O00oO0;
import p194o00o0OO.o00O0OO0;
import p195o00o0OO0.o00000OO;
import p423o0OoO0OO.o00O0000;
import p471o0OoooO0.o0;
import p476o0OooooO.o0OOo000;
import p516o0o0O00o.o0O0oo0o;
import p532o0o0OOo0.o000O0;
import p532o0o0OOo0.o00O00;
import p562o0oOo000.o000000;
import p584o0oOoo0O.o00O;
import p584o0oOoo0O.o00O0OO;
import p584o0oOoo0O.oo0o0O0;
import p589o0oOooo.o0OO00o0;
import p650o0ooo.z2;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b,\u0010-J)\u0010\b\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0003¢\u0006\u0004\b\b\u0010\tJ^\u0010\u0016\u001a\u00020\u00062\u001c\u0010\u000e\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r0\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f2!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00060\u0011H\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\u0006\u0010\u001d\u001a\u00020\u0006J\u0018\u0010!\u001a\u00020\u001eH\u0017ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010#\u001a\u00020\u0006*\u00020\"H\u0017¢\u0006\u0004\b#\u0010$J:\u0010'\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\f2!\u0010&\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u00060\u0011H\u0007¢\u0006\u0004\b'\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006.²\u0006\u000e\u0010\u0004\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/yalla/yalla/module/media/music/MusicAddScreen;", "Lo0o0OOo0/o000O0;", "Landroidx/compose/foundation/layout/BoxScope;", "", "selectCount", "Lkotlin/Function0;", "", "confirmAddClick", "BottomArea", "(Landroidx/compose/foundation/layout/BoxScope;ILkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/runtime/State;", "Ljava/util/ArrayList;", "Lcom/yalla/yalla/model/MusicFileModel;", "Lkotlin/collections/ArrayList;", "foldList", "Landroidx/compose/runtime/MutableState;", "currentFolderIndex", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "countSum", "countSumListener", "InitObservers", "(Landroidx/compose/runtime/State;Landroidx/compose/runtime/MutableState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Landroid/app/Activity;", "context", "Lo0oOoo0O/oo0o0O0;", "musicViewModel", "scanMusic", "navigate", "Landroidx/compose/ui/graphics/Color;", "getWindowBackgroundColor-WaAFU9c", "(Landroidx/compose/runtime/Composer;I)J", "getWindowBackgroundColor", "Landroidx/compose/foundation/layout/ColumnScope;", "Content", "(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V", "item", "onItemClick", "FoldItemContent", "(Lcom/yalla/yalla/model/MusicFileModel;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lo0oOooo/o0OO00o0$OooO0O0;", "scanCompletedListener", "Lo0oOooo/o0OO00o0$OooO0O0;", "<init>", "()V", "Media_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nMusicAddScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicAddScreen.kt\ncom/yalla/yalla/module/media/music/MusicAddScreen\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 11 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 12 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 13 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n*L\n1#1,267:1\n81#2,11:268\n36#3:279\n456#3,8:304\n464#3,3:318\n456#3,8:339\n464#3,3:353\n50#3:358\n49#3:359\n467#3,3:366\n467#3,3:371\n456#3,8:396\n464#3,3:410\n456#3,8:434\n464#3,3:448\n467#3,3:454\n467#3,3:463\n456#3,8:486\n464#3,3:500\n36#3:505\n467#3,3:512\n67#3,3:517\n66#3:520\n1097#4,6:280\n1097#4,6:360\n1097#4,6:506\n1097#4,6:521\n76#5:286\n66#6,6:287\n72#6:321\n76#6:375\n78#7,11:293\n78#7,11:328\n91#7:369\n91#7:374\n78#7,11:385\n78#7,11:423\n91#7:457\n91#7:466\n78#7,11:475\n91#7:515\n4144#8,6:312\n4144#8,6:347\n4144#8,6:404\n4144#8,6:442\n4144#8,6:494\n72#9,6:322\n78#9:356\n82#9:370\n72#9,6:417\n78#9:451\n82#9:458\n154#10:357\n154#10:376\n154#10:377\n154#10:378\n154#10:414\n154#10:415\n154#10:416\n154#10:452\n154#10:453\n154#10:462\n154#10:468\n154#10:504\n73#11,6:379\n79#11:413\n83#11:467\n73#11,6:469\n79#11:503\n83#11:516\n766#12:459\n857#12,2:460\n75#13:527\n108#13,2:528\n*S KotlinDebug\n*F\n+ 1 MusicAddScreen.kt\ncom/yalla/yalla/module/media/music/MusicAddScreen\n*L\n84#1:268,11\n94#1:279\n98#1:304,8\n98#1:318,3\n103#1:339,8\n103#1:353,3\n122#1:358\n122#1:359\n103#1:366,3\n98#1:371,3\n143#1:396,8\n143#1:410,3\n161#1:434,8\n161#1:448,3\n161#1:454,3\n143#1:463,3\n199#1:486,8\n199#1:500,3\n219#1:505\n199#1:512,3\n231#1:517,3\n231#1:520\n94#1:280,6\n122#1:360,6\n219#1:506,6\n231#1:521,6\n97#1:286\n98#1:287,6\n98#1:321\n98#1:375\n98#1:293,11\n103#1:328,11\n103#1:369\n98#1:374\n143#1:385,11\n161#1:423,11\n161#1:457\n143#1:466\n199#1:475,11\n199#1:515\n98#1:312,6\n103#1:347,6\n143#1:404,6\n161#1:442,6\n199#1:494,6\n103#1:322,6\n103#1:356\n103#1:370\n161#1:417,6\n161#1:451\n161#1:458\n120#1:357\n147#1:376\n148#1:377\n149#1:378\n158#1:414\n159#1:415\n163#1:416\n172#1:452\n180#1:453\n189#1:462\n202#1:468\n217#1:504\n143#1:379,6\n143#1:413\n143#1:467\n199#1:469,6\n199#1:503\n199#1:516\n184#1:459\n184#1:460,2\n92#1:527\n92#1:528,2\n*E\n"})
public final class MusicAddScreen extends o000O0 {

    @Nullable
    private static o0OO00o0.OooO0O0 scanCompletedListener;

    @NotNull
    public static final MusicAddScreen INSTANCE = new MusicAddScreen();
    public static final int $stable = 8;

    public static final class OooO extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ AppCompatActivity f23915OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ oo0o0O0 f23916OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(AppCompatActivity appCompatActivity, oo0o0O0 oo0o0o0) {
            super(3);
            this.f23915OooO0Oo = appCompatActivity;
            this.f23916OooO0o0 = oo0o0o0;
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
                    ComposerKt.traceEventStart(-693661028, iIntValue, -1, "com.yalla.yalla.module.media.music.MusicAddScreen.Content.<anonymous>.<anonymous>.<anonymous> (MusicAddScreen.kt:107)");
                }
                TextKt.m1261Text4IGK_g(o0000.OooO0OO(o000000.scan), o0O0O00.OooO0O0(Modifier.INSTANCE, false, false, 0L, false, null, null, null, new com.yalla.yalla.module.media.music.OooO00o(this.f23915OooO0Oo, this.f23916OooO0o0), 255), o0OOo000.f48149OooOOo, TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131056);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f23917OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Function0<Unit> function0) {
            super(0);
            this.f23917OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f23917OooO0Oo.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f23919OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ BoxScope f23920OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f23921OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f23922OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(BoxScope boxScope, int i, Function0<Unit> function0, int i2) {
            super(2);
            this.f23920OooO0o0 = boxScope;
            this.f23919OooO0o = i;
            this.f23921OooO0oO = function0;
            this.f23922OooO0oo = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            MusicAddScreen.this.BottomArea(this.f23920OooO0o0, this.f23919OooO0o, this.f23921OooO0oO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f23922OooO0oo | 1));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.module.media.music.MusicAddScreen$Content$1", f = "MusicAddScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ oo0o0O0 f23923OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(oo0o0O0 oo0o0o0, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f23923OooO0Oo = oo0o0o0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0OO(this.f23923OooO0Oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            oo0o0O0 oo0o0o0 = this.f23923OooO0Oo;
            if (oo0o0o0.f56697OooO00o) {
                oo0o0o0.f56697OooO00o = false;
                com.code.android.util.OooOOO.OooO0O0(ViewModelKt.getViewModelScope(oo0o0o0), new o00O(oo0o0o0, null));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableIntState f23924OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(MutableIntState mutableIntState) {
            super(1);
            this.f23924OooO0Oo = mutableIntState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            MusicAddScreen.Content$lambda$1(this.f23924OooO0Oo, num.intValue());
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nMusicAddScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicAddScreen.kt\ncom/yalla/yalla/module/media/music/MusicAddScreen$Content$3$1$2$1\n+ 2 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n1#1,267:1\n171#2,12:268\n*S KotlinDebug\n*F\n+ 1 MusicAddScreen.kt\ncom/yalla/yalla/module/media/music/MusicAddScreen$Content$3$1$2$1\n*L\n123#1:268,12\n*E\n"})
    public static final class OooOO0 extends Lambda implements Function1<LazyListScope, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ State<ArrayList<MusicFileModel>> f23925OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableIntState f23926OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOO0(State<? extends ArrayList<MusicFileModel>> state, MutableIntState mutableIntState) {
            super(1);
            this.f23925OooO0Oo = state;
            this.f23926OooO0o0 = mutableIntState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(LazyListScope lazyListScope) {
            LazyListScope LazyColumn = lazyListScope;
            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
            final ArrayList<MusicFileModel> value = this.f23925OooO0Oo.getValue();
            int size = value.size();
            Function1<Integer, Object> function1 = new Function1<Integer, Object>() { // from class: com.yalla.yalla.module.media.music.MusicAddScreen$Content$3$1$2$1$invoke$$inlined$itemsIndexed$default$2
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
            final MutableIntState mutableIntState = this.f23926OooO0o0;
            LazyColumn.items(size, null, function1, ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yalla.yalla.module.media.music.MusicAddScreen$Content$3$1$2$1$invoke$$inlined$itemsIndexed$default$3
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
                        MusicAddScreen.INSTANCE.FoldItemContent(musicFileModel, new OooO0O0(musicFileModel, mutableIntState, iIntValue), composer2, ((((i & 112) | (i & 14)) >> 6) & 14) | MusicFileModel.$stable | ConstantsKt.MINIMUM_BLOCK_SIZE);
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

    public static final class OooOO0O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ oo0o0O0 f23927OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ State<ArrayList<MusicFileModel>> f23928OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOO0O(oo0o0O0 oo0o0o0, State<? extends ArrayList<MusicFileModel>> state) {
            super(0);
            this.f23927OooO0Oo = oo0o0o0;
            this.f23928OooO0o0 = state;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ArrayList<MusicFileModel> list = this.f23928OooO0o0.getValue();
            oo0o0O0 oo0o0o0 = this.f23927OooO0Oo;
            oo0o0o0.getClass();
            Intrinsics.checkNotNullParameter(list, "list");
            com.code.android.util.OooOOO.OooO0O0(ViewModelKt.getViewModelScope(oo0o0o0), new o00O0OO(list, null));
            String strOooO0OO = o0000.OooO0OO(o000000.Success);
            if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                }
            }
            o00O00.OooO0o(null);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function0<MutableIntState> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOOO f23929OooO0Oo = new OooOOO();

        public OooOOO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableIntState invoke() {
            return SnapshotIntStateKt.mutableIntStateOf(0);
        }
    }

    public static final class OooOOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f23931OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ColumnScope f23932OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(ColumnScope columnScope, int i) {
            super(2);
            this.f23932OooO0o0 = columnScope;
            this.f23931OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f23931OooO0o | 1);
            MusicAddScreen.this.Content(this.f23932OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function0<MutableIntState> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOOOO f23933OooO0Oo = new OooOOOO();

        public OooOOOO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableIntState invoke() {
            return SnapshotIntStateKt.mutableIntStateOf(0);
        }
    }

    public static final class OooOo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function1<MusicFileModel, Unit> f23935OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MusicFileModel f23936OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f23937OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOo(MusicFileModel musicFileModel, Function1<? super MusicFileModel, Unit> function1, int i) {
            super(2);
            this.f23936OooO0o0 = musicFileModel;
            this.f23935OooO0o = function1;
            this.f23937OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f23937OooO0oO | 1);
            MusicFileModel musicFileModel = this.f23936OooO0o0;
            Function1<MusicFileModel, Unit> function1 = this.f23935OooO0o;
            MusicAddScreen.this.FoldItemContent(musicFileModel, function1, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1<MusicFileModel, Unit> f23938OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MusicFileModel f23939OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOo00(Function1<? super MusicFileModel, Unit> function1, MusicFileModel musicFileModel) {
            super(0);
            this.f23938OooO0Oo = function1;
            this.f23939OooO0o0 = musicFileModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f23938OooO0Oo.invoke(this.f23939OooO0o0);
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<Integer> f23941OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ State<ArrayList<MusicFileModel>> f23942OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Unit> f23943OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f23944OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Oooo0(State<? extends ArrayList<MusicFileModel>> state, MutableState<Integer> mutableState, Function1<? super Integer, Unit> function1, int i) {
            super(2);
            this.f23942OooO0o0 = state;
            this.f23941OooO0o = mutableState;
            this.f23943OooO0oO = function1;
            this.f23944OooO0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            MusicAddScreen.this.InitObservers(this.f23942OooO0o0, this.f23941OooO0o, this.f23943OooO0oO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f23944OooO0oo | 1));
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nMusicAddScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicAddScreen.kt\ncom/yalla/yalla/module/media/music/MusicAddScreen$InitObservers$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,267:1\n1549#2:268\n1620#2,3:269\n1855#2,2:272\n1855#2:274\n766#2:275\n857#2,2:276\n1856#2:278\n*S KotlinDebug\n*F\n+ 1 MusicAddScreen.kt\ncom/yalla/yalla/module/media/music/MusicAddScreen$InitObservers$1$1\n*L\n234#1:268\n234#1:269,3\n235#1:272,2\n240#1:274\n241#1:275\n241#1:276,2\n240#1:278\n*E\n"})
    public static final class Oooo000<T> implements Observer {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ State<ArrayList<MusicFileModel>> f23945OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Unit> f23946OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Integer> f23947OooO0o0;

        /* JADX WARN: Multi-variable type inference failed */
        public Oooo000(State<? extends ArrayList<MusicFileModel>> state, MutableState<Integer> mutableState, Function1<? super Integer, Unit> function1) {
            this.f23945OooO0Oo = state;
            this.f23947OooO0o0 = mutableState;
            this.f23946OooO0o = function1;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            List list = (List) obj;
            Intrinsics.checkNotNullParameter(list, "list");
            State<ArrayList<MusicFileModel>> state = this.f23945OooO0Oo;
            if (state.getValue().size() == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList(CollectionsKt.OooO0oo(list));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((MusicTable) it.next()).mPath);
            }
            for (Audio audio : state.getValue().get(this.f23947OooO0o0.getValue().intValue()).getSongList()) {
                audio.isSelected = arrayList.contains(audio.getPath());
            }
            Iterator<T> it2 = state.getValue().iterator();
            int size = 0;
            while (it2.hasNext()) {
                List<Audio> songList = ((MusicFileModel) it2.next()).getSongList();
                ArrayList arrayList2 = new ArrayList();
                for (T t : songList) {
                    if (((Audio) t).isSelected) {
                        arrayList2.add(t);
                    }
                }
                size += arrayList2.size();
            }
            this.f23946OooO0o.invoke(Integer.valueOf(size));
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.module.media.music.MusicAddScreen$scanMusic$1$1", f = "MusicAddScreen.kt", i = {}, l = {255}, m = "invokeSuspend", n = {}, s = {})
    public static final class o000oOoO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f23948OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ z2 f23949OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Activity f23950OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000oOoO(Activity activity, z2 z2Var, Continuation<? super o000oOoO> continuation) {
            super(2, continuation);
            this.f23950OooO0o0 = activity;
            this.f23949OooO0o = z2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new o000oOoO(this.f23950OooO0o0, this.f23949OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((o000oOoO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f23948OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f23948OooO0Oo = 1;
                if (DelayKt.delay(100L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Activity activity = this.f23950OooO0o0;
            if (!activity.isFinishing() && !activity.isDestroyed()) {
                this.f23949OooO0o.dismiss();
            }
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
                ComposerKt.traceEventStart(-1024891954, i3, -1, "com.yalla.yalla.module.media.music.MusicAddScreen.BottomArea (MusicAddScreen.kt:197)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            int i4 = o0OOo000.f48347o00OOooO;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m511height3ABfNKs(BackgroundKt.m171backgroundbw27NRU$default(companion, o0OOo000.f48200o000000o, null, 2, null), Dp.m3775constructorimpl(60)), 0.0f, 1, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Modifier modifierAlign = boxScope.align(modifierFillMaxWidth$default, companion2.getBottomCenter());
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO0O0 = androidx.compose.material.OooO0OO.OooO0O0(Arrangement.INSTANCE, centerVertically, composerStartRestartGroup, 48, -1323940314);
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
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            String strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(o0000.OooO0OO(o000000.add_music_submit), i > 0 ? OooO0OO.OooO00o.OooO00o("(", i, ")") : "");
            long j = i > 0 ? o0OOo000.f48135OooO0O0 : o0OOo000.f48140OooO0oO;
            long j2 = i > 0 ? o0OOo000.f48193Ooooooo : o0OOo000.f48137OooO0Oo;
            long jOooO0OO = o0000O0.OooO0OO(15, composerStartRestartGroup, 6);
            boolean z = i > 0;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(PaddingKt.m479paddingVpY3zN4(companion, Dp.m3775constructorimpl(16), Dp.m3775constructorimpl(10)), 0.0f, 1, null);
            Color colorM1671boximpl = Color.m1671boximpl(j);
            Color colorM1671boximpl2 = Color.m1671boximpl(j2);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(function0);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new OooO00o(function0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            o00O0OO0.OooO00o(strOooO00o, jOooO0OO, null, null, colorM1671boximpl, colorM1671boximpl2, null, 0.0f, null, z, false, 0L, false, null, null, null, null, null, modifierFillMaxSize$default, (Function0) objRememberedValue, composerStartRestartGroup, 0, 100663296, 261580);
            if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(boxScope, i, function0, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Content$lambda$1(MutableIntState mutableIntState, int i) {
        mutableIntState.setIntValue(i);
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
                ComposerKt.traceEventStart(-1290211160, i2, -1, "com.yalla.yalla.module.media.music.MusicAddScreen.InitObservers (MusicAddScreen.kt:229)");
            }
            Observable<Object> observable = LiveEventBus.get("MUSIC_LIST_UPDATE");
            Intrinsics.checkNotNullExpressionValue(observable, "get(...)");
            composerStartRestartGroup.startReplaceableGroup(1618982084);
            boolean zChanged = composerStartRestartGroup.changed(state) | composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function1);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Oooo000(state, mutableState, function1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            o00O0000.OooO00o(observable, (Observer) objRememberedValue, composerStartRestartGroup, 72);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Oooo0(state, mutableState, function1, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scanMusic(final Activity context, final oo0o0O0 musicViewModel) {
        final z2 z2Var = new z2(context);
        if (scanCompletedListener == null) {
            scanCompletedListener = new o0OO00o0.OooO0O0() { // from class: o0OoooO0.o0O0o
                @Override // o0oOooo.o0OO00o0.OooO0O0
                public final void OooO00o(ArrayList arrayList) {
                    MusicAddScreen.scanMusic$lambda$12(musicViewModel, context, z2Var, arrayList);
                }
            };
        }
        z2Var.setOnDismissListener(new o0());
        if (p401o0Oo0O00.OooO.OooO(z2Var, context)) {
            z2Var.show();
        }
        o0OO00o0.OooO0O0(context, scanCompletedListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scanMusic$lambda$12(oo0o0O0 musicViewModel, Activity context, z2 scanningMusicDialog, List list) {
        Intrinsics.checkNotNullParameter(musicViewModel, "$musicViewModel");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(scanningMusicDialog, "$scanningMusicDialog");
        MutableStateFlow<ArrayList<MusicFileModel>> mutableStateFlow = musicViewModel.f56703OooO0oO;
        Intrinsics.checkNotNull(list);
        mutableStateFlow.setValue(oo0o0O0.OooO0O0(list));
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o000oOoO(context, scanningMusicDialog, null), 3, null);
    }

    @Override // p532o0o0OOo0.o000O0
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public void Content(@NotNull ColumnScope columnScope, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(columnScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(911820985);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(911820985, i, -1, "com.yalla.yalla.module.media.music.MusicAddScreen.Content (MusicAddScreen.kt:82)");
        }
        composerStartRestartGroup.startReplaceableGroup(1729797275);
        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
        if (current == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        ViewModel viewModel = androidx.lifecycle.viewmodel.compose.ViewModelKt.viewModel(oo0o0O0.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
        composerStartRestartGroup.endReplaceableGroup();
        oo0o0O0 oo0o0o0 = (oo0o0O0) viewModel;
        EffectsKt.LaunchedEffect(Unit.INSTANCE, new OooO0OO(oo0o0o0, null), composerStartRestartGroup, 70);
        State<? extends ArrayList<MusicFileModel>> stateCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(oo0o0o0.f56703OooO0oO, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 8, 7);
        MutableIntState mutableIntState = (MutableIntState) RememberSaveableKt.m1333rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) OooOOOO.f23933OooO0Oo, composerStartRestartGroup, 3080, 6);
        MutableIntState mutableIntState2 = (MutableIntState) RememberSaveableKt.m1333rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) OooOOO.f23929OooO0Oo, composerStartRestartGroup, 3080, 6);
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged = composerStartRestartGroup.changed(mutableIntState);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new OooO0o(mutableIntState);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        InitObservers(stateCollectAsStateWithLifecycle, mutableIntState2, (Function1) objRememberedValue, composerStartRestartGroup, 4096);
        Object objConsume = composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        Intrinsics.checkNotNull(objConsume, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        AppCompatActivity appCompatActivity = (AppCompatActivity) objConsume;
        Modifier.Companion companion = Modifier.INSTANCE;
        int i2 = o0OOo000.f48347o00OOooO;
        Modifier modifierStatusBarsPadding = WindowInsetsPadding_androidKt.statusBarsPadding(BackgroundKt.m171backgroundbw27NRU$default(companion, o0OOo000.f48183OoooOoO, null, 2, null));
        composerStartRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyOooO00o = androidx.compose.animation.Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
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
        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyOooO0O0 = o0O00oO0.OooO0O0(companion2, Arrangement.INSTANCE.getTop(), composerStartRestartGroup, 0, -1323940314);
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
        Composer composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyOooO0O0, composerM1320constructorimpl2, currentCompositionLocalMap2);
        if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        o0O0oo0o.OooO00o(o0000.OooO0OO(o000000.add_music), 0.0f, o0OOo000.f48135OooO0O0, null, null, null, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -693661028, true, new OooO(appCompatActivity, oo0o0o0)), null, composerStartRestartGroup, 12582912, 378);
        Modifier modifierOooO00o = androidx.compose.foundation.layout.OooOO0.OooO00o(columnScopeInstance, PaddingKt.m482paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl(60), 7, null), 1.0f, false, 2, null);
        composerStartRestartGroup.startReplaceableGroup(511388516);
        boolean zChanged2 = composerStartRestartGroup.changed(stateCollectAsStateWithLifecycle) | composerStartRestartGroup.changed(mutableIntState2);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new OooOO0(stateCollectAsStateWithLifecycle, mutableIntState2);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        LazyDslKt.LazyColumn(modifierOooO00o, null, null, false, null, null, null, false, (Function1) objRememberedValue2, composerStartRestartGroup, 0, 254);
        o0ooOOo.OooO00o(composerStartRestartGroup);
        INSTANCE.BottomArea(boxScopeInstance, mutableIntState.getIntValue(), new OooOO0O(oo0o0o0, stateCollectAsStateWithLifecycle), composerStartRestartGroup, 4102);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        o00000OO.OooO0O0(true, composerStartRestartGroup, 6, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO0(columnScope, i));
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
                ComposerKt.traceEventStart(-808088014, i2, -1, "com.yalla.yalla.module.media.music.MusicAddScreen.FoldItemContent (MusicAddScreen.kt:141)");
            }
            Alignment.Companion companion = Alignment.INSTANCE;
            Alignment.Vertical centerVertically = companion.getCenterVertically();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            float f = 12;
            float f2 = 16;
            Modifier modifierOooO0O0 = o0O0O00.OooO0O0(BackgroundKt.m170backgroundbw27NRU(SizeKt.m511height3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(f), 0.0f, 8, null), Dp.m3775constructorimpl(80)), o0OOo000.f48184OoooOoo, RoundedCornerShapeKt.m729RoundedCornerShape0680j_4(Dp.m3775constructorimpl(f2))), false, false, 0L, false, null, null, null, new OooOo00(onItemClick, item), 255);
            composerStartRestartGroup.startReplaceableGroup(693286680);
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyOooO0O0 = androidx.compose.material.OooO0OO.OooO0O0(arrangement, centerVertically, composerStartRestartGroup, 48, -1323940314);
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
            Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO0O0, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(p562o0oOo000.o0O0O00.icon_music_folder, composerStartRestartGroup, 0), (String) null, SizeKt.m525size3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(companion2, Dp.m3775constructorimpl(f2), 0.0f, 0.0f, 0.0f, 14, null), Dp.m3775constructorimpl(56)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
            Modifier modifierOooO00o = androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, PaddingKt.m482paddingqDBjuR0$default(companion2, Dp.m3775constructorimpl(f), 0.0f, 0.0f, 0.0f, 14, null), 1.0f, false, 2, null);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyOooO0O1 = o0O00oO0.OooO0O0(companion, arrangement.getTop(), composerStartRestartGroup, 0, -1323940314);
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
            Composer composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyOooO0O1, composerM1320constructorimpl2, currentCompositionLocalMap2);
            if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            String fileName = item.getFileName();
            long j = o0OOo000.f48149OooOOo;
            long sp = TextUnitKt.getSp(16);
            TextOverflow.Companion companion4 = TextOverflow.INSTANCE;
            int iM3729getEllipsisgIe3tQ8 = companion4.m3729getEllipsisgIe3tQ8();
            float f3 = Constants.ERR_ALREADY_IN_RECORDING;
            composer2 = composerStartRestartGroup;
            TextKt.m1261Text4IGK_g(fileName, SizeKt.m532widthInVpY3zN4$default(companion2, 0.0f, Dp.m3775constructorimpl(f3), 1, null), j, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, iM3729getEllipsisgIe3tQ8, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3120, 3120, 120816);
            TextKt.m1261Text4IGK_g(item.getSongsCount() + ZegoConstants.ZegoVideoDataAuxPublishingStream + o0000.OooO0OO(o000000.songs) + "," + item.getFilePath(), SizeKt.m532widthInVpY3zN4$default(companion2, 0.0f, Dp.m3775constructorimpl(f3), 1, null), o0OOo000.f48142OooOO0, TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, companion4.m3729getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3120, 3120, 120816);
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
            TextKt.m1261Text4IGK_g(androidx.camera.core.impl.OooOOOO.OooO00o(size > 0 ? size + ZegoConstants.ZegoVideoDataAuxPublishingStream + o0000.OooO0OO(o000000.songs) : "", ZegoConstants.ZegoVideoDataAuxPublishingStream), PaddingKt.m482paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, Dp.m3775constructorimpl(15), 0.0f, 11, null), o0OOo000.f48340o00OOOO, TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3120, 0, 131056);
            if (androidx.compose.material.OooO0o.OooO00o(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOo(item, onItemClick, i));
    }

    @Override // p532o0o0OOo0.o000O0
    @Composable
    /* JADX INFO: renamed from: getWindowBackgroundColor-WaAFU9c */
    public long mo4200getWindowBackgroundColorWaAFU9c(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(236743540);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(236743540, i, -1, "com.yalla.yalla.module.media.music.MusicAddScreen.getWindowBackgroundColor (MusicAddScreen.kt:77)");
        }
        int i2 = o0OOo000.f48347o00OOooO;
        long j = o0OOo000.f48183OoooOoO;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return j;
    }

    public final void navigate() {
        o00O00.OooO0o0(INSTANCE, null, false, null, 14);
    }
}
