package com.yalla.yalla.ui.screen.store;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Looper;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
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
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
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
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.code.android.uikit.TextButtonStyle;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.yalla.yalla.model.PremiumLevel;
import com.yalla.yalla.model.StoreRoomChatBubbleModel;
import com.yalla.yalla.model.VipLevel;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import com.yalla.yalla.ui.screen.user.vip.VipScreen;
import com.yalla.yalla.ui.vm.user.StoreRoomChatBubbleMineVM;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import net.sqlcipher.database.SQLiteDatabase;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoo.o0000O0;
import p147o00Oo0Oo.o000OOo;
import p150o00Oo0oO.o0000Ooo;
import p375o0OOoOO.o00000O0;
import p377o0OOoOo.o000O000;
import p417o0OoO0.o00000O;
import p420o0OoO0OO.o0OO00O;
import p469o0OoooOO.o0oO0O0o;
import p507o0o00ooo.t1;
import p507o0o00ooo.v0;
import p526o0o0OOO0.o00O00O;
import p535o0o0Oo0O.oo0oO0;
import p536o0o0Oo0o.o0OO00OO;
import p571o0oOoOO.o0O0OOO0;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u001d\u0010\u0013\u001a\u00020\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0015\u001a\u00020\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u001d\u0010\u0016\u001a\u00020\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0013\u0010\u0018\u001a\u00020\n*\u00020\u0017H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001b\u001a\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/yalla/yalla/ui/screen/store/StoreChatBubbleMineScreen;", "Lo0o0OOO0/o00O00O;", "Lcom/yalla/yalla/model/StoreRoomChatBubbleModel;", DeviceRequestsHelper.DEVICE_INFO_MODEL, "Lcom/yalla/yalla/ui/vm/user/StoreRoomChatBubbleMineVM;", "vm", "Lo0oOoOO/o0O0OOO0;", "loadingVM", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "", "ItemBubbleUseButton", "(Lcom/yalla/yalla/model/StoreRoomChatBubbleModel;Lcom/yalla/yalla/ui/vm/user/StoreRoomChatBubbleMineVM;Lo0oOoOO/o0O0OOO0;Landroidx/lifecycle/LifecycleOwner;Landroidx/compose/runtime/Composer;I)V", "ItemBubbleInfo", "(Lcom/yalla/yalla/model/StoreRoomChatBubbleModel;Landroidx/compose/runtime/Composer;I)V", "onBubbleClick", "Landroidx/compose/runtime/MutableState;", "", "show", "PremiumBubbleBuyFrozenDialog", "(Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/Composer;I)V", "VipBubbleBuyFrozenDialog", "VipBubbleGiveFrozenDialog", "Landroidx/compose/foundation/layout/ColumnScope;", "Content", "(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V", "isFromOutfit", "MainContent", "(ZLandroidx/compose/runtime/Composer;II)V", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nStoreChatBubbleMineScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StoreChatBubbleMineScreen.kt\ncom/yalla/yalla/ui/screen/store/StoreChatBubbleMineScreen\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 10 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,380:1\n76#2:381\n76#2:567\n76#2:568\n76#2:569\n81#3,11:382\n81#3,11:393\n154#4:404\n154#4:405\n154#4:406\n154#4:407\n154#4:408\n154#4:466\n154#4:467\n154#4:475\n154#4:476\n154#4:477\n154#4:478\n154#4:479\n154#4:515\n154#4:516\n154#4:522\n66#5,6:409\n72#5:443\n67#5,5:523\n72#5:556\n76#5:561\n76#5:566\n78#6,11:415\n78#6,11:486\n91#6:520\n78#6,11:528\n91#6:560\n91#6:565\n456#7,8:426\n464#7,3:440\n25#7:444\n25#7:451\n50#7:458\n49#7:459\n25#7:468\n456#7,8:497\n464#7,3:511\n467#7,3:517\n456#7,8:539\n464#7,3:553\n467#7,3:557\n467#7,3:562\n4144#8,6:434\n4144#8,6:505\n4144#8,6:547\n1097#9,6:445\n1097#9,6:452\n1097#9,6:460\n1097#9,6:469\n73#10,6:480\n79#10:514\n83#10:521\n81#11:570\n107#11,2:571\n81#11:573\n107#11,2:574\n*S KotlinDebug\n*F\n+ 1 StoreChatBubbleMineScreen.kt\ncom/yalla/yalla/ui/screen/store/StoreChatBubbleMineScreen\n*L\n93#1:381\n344#1:567\n358#1:568\n372#1:569\n94#1:382,11\n101#1:393,11\n153#1:404\n166#1:405\n177#1:406\n179#1:407\n181#1:408\n210#1:466\n218#1:467\n227#1:475\n229#1:476\n236#1:477\n237#1:478\n242#1:479\n247#1:515\n249#1:516\n265#1:522\n174#1:409,6\n174#1:443\n261#1:523,5\n261#1:556\n261#1:561\n174#1:566\n174#1:415,11\n233#1:486,11\n233#1:520\n261#1:528,11\n261#1:560\n174#1:565\n174#1:426,8\n174#1:440,3\n192#1:444\n193#1:451\n195#1:458\n195#1:459\n225#1:468\n233#1:497,8\n233#1:511,3\n233#1:517,3\n261#1:539,8\n261#1:553,3\n261#1:557,3\n174#1:562,3\n174#1:434,6\n233#1:505,6\n261#1:547,6\n192#1:445,6\n193#1:452,6\n195#1:460,6\n225#1:469,6\n233#1:480,6\n233#1:514\n233#1:521\n192#1:570\n192#1:571,2\n193#1:573\n193#1:574,2\n*E\n"})
public final class StoreChatBubbleMineScreen extends o00O00O {
    public static final int $stable = 0;

    @NotNull
    public static final StoreChatBubbleMineScreen INSTANCE = new StoreChatBubbleMineScreen();

    @SourceDebugExtension({"SMAP\nStoreChatBubbleMineScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StoreChatBubbleMineScreen.kt\ncom/yalla/yalla/ui/screen/store/StoreChatBubbleMineScreen$ItemBubbleUseButton$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,380:1\n154#2:381\n154#2:382\n*S KotlinDebug\n*F\n+ 1 StoreChatBubbleMineScreen.kt\ncom/yalla/yalla/ui/screen/store/StoreChatBubbleMineScreen$ItemBubbleUseButton$1\n*L\n159#1:381\n161#1:382\n*E\n"})
    public static final class OooO extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ StoreRoomChatBubbleModel f29786OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(StoreRoomChatBubbleModel storeRoomChatBubbleModel) {
            super(3);
            this.f29786OooO0Oo = storeRoomChatBubbleModel;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            RowScope TextButton = rowScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1969554633, iIntValue, -1, "com.yalla.yalla.ui.screen.store.StoreChatBubbleMineScreen.ItemBubbleUseButton.<anonymous> (StoreChatBubbleMineScreen.kt:153)");
                }
                if (this.f29786OooO0Oo.getSelected()) {
                    ImageKt.Image(PainterResources_androidKt.painterResource(oOo00OO0.ic_store_bubble_use, composer2, 0), (String) null, SizeKt.m523size3ABfNKs(Modifier.INSTANCE, Dp.m3765constructorimpl(12)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 440, 120);
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(8), null, composer2, 6, 2);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f29788OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ColumnScope f29789OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(ColumnScope columnScope, int i) {
            super(2);
            this.f29789OooO0o0 = columnScope;
            this.f29788OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29788OooO0o | 1);
            StoreChatBubbleMineScreen.this.Content(this.f29789OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<coil.request.OooO00o.C0170OooO00o, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f29790OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(coil.request.OooO00o.C0170OooO00o c0170OooO00o) {
            coil.request.OooO00o.C0170OooO00o it = c0170OooO00o;
            Intrinsics.checkNotNullParameter(it, "it");
            it.f8617OooOooo = new ColorDrawable(Color.parseColor("#FF2C2C34"));
            it.f8616OooOooO = 0;
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nStoreChatBubbleMineScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StoreChatBubbleMineScreen.kt\ncom/yalla/yalla/ui/screen/store/StoreChatBubbleMineScreen$ItemBubbleInfo$1$2$1\n+ 2 ImageRequest.kt\ncoil/request/ImageRequest$Builder\n*L\n1#1,380:1\n489#2,11:381\n*S KotlinDebug\n*F\n+ 1 StoreChatBubbleMineScreen.kt\ncom/yalla/yalla/ui/screen/store/StoreChatBubbleMineScreen$ItemBubbleInfo$1$2$1\n*L\n196#1:381,11\n*E\n"})
    public static final class OooO0OO extends Lambda implements Function1<coil.request.OooO00o.C0170OooO00o, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f29791OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f29792OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2) {
            super(1);
            this.f29791OooO0Oo = mutableState;
            this.f29792OooO0o0 = mutableState2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(coil.request.OooO00o.C0170OooO00o c0170OooO00o) {
            coil.request.OooO00o.C0170OooO00o it = c0170OooO00o;
            Intrinsics.checkNotNullParameter(it, "it");
            MutableState<Boolean> mutableState = this.f29791OooO0Oo;
            it.f8593OooO0o0 = new oo0oO0(mutableState, mutableState, this.f29792OooO0o0);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f29794OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ StoreRoomChatBubbleModel f29795OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(StoreRoomChatBubbleModel storeRoomChatBubbleModel, int i) {
            super(2);
            this.f29795OooO0o0 = storeRoomChatBubbleModel;
            this.f29794OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29794OooO0o | 1);
            StoreChatBubbleMineScreen.this.ItemBubbleInfo(this.f29795OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ StoreRoomChatBubbleModel f29796OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o0O0OOO0 f29797OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ StoreRoomChatBubbleMineVM f29798OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f29799OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(StoreRoomChatBubbleModel storeRoomChatBubbleModel, StoreRoomChatBubbleMineVM storeRoomChatBubbleMineVM, o0O0OOO0 o0o0ooo0, LifecycleOwner lifecycleOwner) {
            super(0);
            this.f29796OooO0Oo = storeRoomChatBubbleModel;
            this.f29798OooO0o0 = storeRoomChatBubbleMineVM;
            this.f29797OooO0o = o0o0ooo0;
            this.f29799OooO0oO = lifecycleOwner;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            StoreChatBubbleMineScreen.INSTANCE.onBubbleClick(this.f29796OooO0Oo, this.f29798OooO0o0, this.f29797OooO0o, this.f29799OooO0oO);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f29800OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ StoreRoomChatBubbleMineVM f29802OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ StoreRoomChatBubbleModel f29803OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ o0O0OOO0 f29804OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f29805OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(StoreRoomChatBubbleModel storeRoomChatBubbleModel, StoreRoomChatBubbleMineVM storeRoomChatBubbleMineVM, o0O0OOO0 o0o0ooo0, LifecycleOwner lifecycleOwner, int i) {
            super(2);
            this.f29803OooO0o0 = storeRoomChatBubbleModel;
            this.f29802OooO0o = storeRoomChatBubbleMineVM;
            this.f29804OooO0oO = o0o0ooo0;
            this.f29805OooO0oo = lifecycleOwner;
            this.f29800OooO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            StoreChatBubbleMineScreen.this.ItemBubbleUseButton(this.f29803OooO0o0, this.f29802OooO0o, this.f29804OooO0oO, this.f29805OooO0oo, composer, RecomposeScopeImplKt.updateChangedFlags(this.f29800OooO | 1));
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nStoreChatBubbleMineScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StoreChatBubbleMineScreen.kt\ncom/yalla/yalla/ui/screen/store/StoreChatBubbleMineScreen$MainContent$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,380:1\n154#2:381\n154#2:382\n154#2:383\n*S KotlinDebug\n*F\n+ 1 StoreChatBubbleMineScreen.kt\ncom/yalla/yalla/ui/screen/store/StoreChatBubbleMineScreen$MainContent$2\n*L\n112#1:381\n113#1:382\n114#1:383\n*E\n"})
    public static final class OooOOO extends Lambda implements Function3<BoxScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o000O0.OooO0O0<StoreRoomChatBubbleModel> f29806OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o0O0OOO0 f29807OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ StoreRoomChatBubbleMineVM f29808OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f29809OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(o000O0.OooO0O0<StoreRoomChatBubbleModel> oooO0O0, StoreRoomChatBubbleMineVM storeRoomChatBubbleMineVM, o0O0OOO0 o0o0ooo0, LifecycleOwner lifecycleOwner) {
            super(3);
            this.f29806OooO0Oo = oooO0O0;
            this.f29808OooO0o0 = storeRoomChatBubbleMineVM;
            this.f29807OooO0o = o0o0ooo0;
            this.f29809OooO0oO = lifecycleOwner;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
            BoxScope ContentStatus = boxScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(ContentStatus, "$this$ContentStatus");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1151852158, iIntValue, -1, "com.yalla.yalla.ui.screen.store.StoreChatBubbleMineScreen.MainContent.<anonymous> (StoreChatBubbleMineScreen.kt:108)");
                }
                GridCells.Fixed fixed = new GridCells.Fixed(2);
                PaddingValues paddingValuesM470PaddingValuesYgX7TsA = PaddingKt.m470PaddingValuesYgX7TsA(Dp.m3765constructorimpl(9), Dp.m3765constructorimpl(8));
                Arrangement arrangement = Arrangement.INSTANCE;
                float f = 1;
                LazyGridDslKt.LazyVerticalGrid(fixed, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, paddingValuesM470PaddingValuesYgX7TsA, false, arrangement.m390spacedBy0680j_4(Dp.m3765constructorimpl(f)), arrangement.m390spacedBy0680j_4(Dp.m3765constructorimpl(f)), null, false, new com.yalla.yalla.ui.screen.store.OooOO0O(this.f29806OooO0Oo, this.f29808OooO0o0, this.f29807OooO0o, this.f29809OooO0oO), composer2, 1772592, 404);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 implements Observer<Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o000O0.OooO0O0<StoreRoomChatBubbleModel> f29810OooO0Oo;

        public OooOOO0(o000O0.OooO0O0<StoreRoomChatBubbleModel> oooO0O0) {
            this.f29810OooO0Oo = oooO0O0;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Boolean bool) {
            bool.booleanValue();
            this.f29810OooO0Oo.OooO0Oo();
        }
    }

    public static final class OooOOOO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f29812OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f29813OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f29814OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(boolean z, int i, int i2) {
            super(2);
            this.f29813OooO0o0 = z;
            this.f29812OooO0o = i;
            this.f29814OooO0oO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29812OooO0o | 1);
            StoreChatBubbleMineScreen.this.MainContent(this.f29813OooO0o0, composer, iUpdateChangedFlags, this.f29814OooO0oO);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOo f29815OooO0Oo = new OooOo();

        public OooOo() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Context f29816OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(Context context) {
            super(0);
            this.f29816OooO0Oo = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            int i = PremiumActivity.f27140Oooo0oO;
            PremiumActivity.OooO00o.OooO00o(this.f29816OooO0Oo, PremiumLevel.Premium1);
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final Oooo0 f29817OooO0Oo = new Oooo0();

        public Oooo0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            VipScreen.navigate$default(VipScreen.INSTANCE, VipLevel.Vip1, false, 2, null);
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f29819OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f29820OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo000(MutableState<Boolean> mutableState, int i) {
            super(2);
            this.f29820OooO0o0 = mutableState;
            this.f29819OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29819OooO0o | 1);
            StoreChatBubbleMineScreen.this.PremiumBubbleBuyFrozenDialog(this.f29820OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o000oOoO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o000oOoO f29821OooO0Oo = new o000oOoO();

        public o000oOoO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    public static final class o00O0O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o00O0O f29822OooO0Oo = new o00O0O();

        public o00O0O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            VipScreen.navigate$default(VipScreen.INSTANCE, VipLevel.Vip1, false, 2, null);
            return Unit.INSTANCE;
        }
    }

    public static final class o00Oo0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o00Oo0 f29823OooO0Oo = new o00Oo0();

        public o00Oo0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    public static final class o00Ooo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f29825OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f29826OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Ooo(MutableState<Boolean> mutableState, int i) {
            super(2);
            this.f29826OooO0o0 = mutableState;
            this.f29825OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29825OooO0o | 1);
            StoreChatBubbleMineScreen.this.VipBubbleGiveFrozenDialog(this.f29826OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o00oO0o extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o00oO0o f29827OooO0Oo = new o00oO0o();

        public o00oO0o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String strOooO0OO = o0000.OooO0OO(oO00OOo0.item_in_use_now);
            if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o0OoOo0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f29829OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f29830OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OoOo0(MutableState<Boolean> mutableState, int i) {
            super(2);
            this.f29830OooO0o0 = mutableState;
            this.f29829OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29829OooO0o | 1);
            StoreChatBubbleMineScreen.this.VipBubbleBuyFrozenDialog(this.f29830OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class oo000o extends Lambda implements Function1<ApiError, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ StoreRoomChatBubbleMineVM f29831OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public oo000o(StoreRoomChatBubbleMineVM storeRoomChatBubbleMineVM) {
            super(1);
            this.f29831OooO0Oo = storeRoomChatBubbleMineVM;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            ApiError error = apiError;
            Intrinsics.checkNotNullParameter(error, "it");
            int code = error.getCode();
            StoreRoomChatBubbleMineVM storeRoomChatBubbleMineVM = this.f29831OooO0Oo;
            if (code == 2088) {
                storeRoomChatBubbleMineVM.getShowVipHiddenDialog().setValue(Boolean.TRUE);
            } else if (code != 2092) {
                Intrinsics.checkNotNullParameter(error, "error");
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o00000O0(error, null), 3, null);
            } else {
                storeRoomChatBubbleMineVM.getShowWealthHiddenDialog().setValue(Boolean.TRUE);
            }
            return Unit.INSTANCE;
        }
    }

    private StoreChatBubbleMineScreen() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void ItemBubbleInfo(StoreRoomChatBubbleModel storeRoomChatBubbleModel, Composer composer, int i) {
        long j;
        SnapshotMutationPolicy snapshotMutationPolicy;
        int i2;
        Composer composer2;
        BoxScopeInstance boxScopeInstance;
        int i3;
        long j2;
        Composer composer3;
        Composer composer4;
        String strOooO0OO;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1621591298);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1621591298, i, -1, "com.yalla.yalla.ui.screen.store.StoreChatBubbleMineScreen.ItemBubbleInfo (StoreChatBubbleMineScreen.kt:172)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierM509height3ABfNKs = SizeKt.m509height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3765constructorimpl(170));
        float f = 2;
        float fM3765constructorimpl = Dp.m3765constructorimpl(f);
        if (storeRoomChatBubbleModel.getSelected()) {
            int i4 = o0oO0O0o.f47152o00OOOo;
            j = o0oO0O0o.f46993OoooOo0;
        } else {
            int i5 = o0oO0O0o.f47152o00OOOo;
            j = o0oO0O0o.f46945OooO00o;
        }
        float f2 = 6;
        float f3 = 0;
        Modifier modifierM180borderxT4_qwU = BorderKt.m180borderxT4_qwU(modifierM509height3ABfNKs, fM3765constructorimpl, j, RoundedCornerShapeKt.m728RoundedCornerShapea9UjIt4(Dp.m3765constructorimpl(f2), Dp.m3765constructorimpl(f2), Dp.m3765constructorimpl(f3), Dp.m3765constructorimpl(f3)));
        composerStartRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyOooO00o = p018OooOoo0.OooOOO.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM180borderxT4_qwU);
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
        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
        o0000O0 o0000o0OooO0OO = p417o0OoO0.o00Oo0.OooO0OO(p139o00OOooO.OooO0o.OooO0Oo(storeRoomChatBubbleModel.getBackgroundUrl()), OooO0O0.f29790OooO0Oo, composerStartRestartGroup, 48, 0);
        ContentScale.Companion companion4 = ContentScale.INSTANCE;
        ComposeUiNode.Companion companion5 = companion3;
        ImageKt.Image(o0000o0OooO0OO, "", SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), (Alignment) null, companion4.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 25008, 104);
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion6 = Composer.INSTANCE;
        if (objRememberedValue == companion6.getEmpty()) {
            snapshotMutationPolicy = null;
            i2 = 2;
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        } else {
            snapshotMutationPolicy = null;
            i2 = 2;
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue;
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue2 == companion6.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, snapshotMutationPolicy, i2, snapshotMutationPolicy);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState2 = (MutableState) objRememberedValue2;
        String attachedPicUrl = storeRoomChatBubbleModel.getAttachedPicUrl();
        composerStartRestartGroup.startReplaceableGroup(511388516);
        boolean zChanged = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState);
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue3 == companion6.getEmpty()) {
            objRememberedValue3 = new OooO0OO(mutableState2, mutableState);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        }
        composerStartRestartGroup.endReplaceableGroup();
        float f4 = 30;
        ImageKt.Image(p417o0OoO0.o00Oo0.OooO0OO(attachedPicUrl, (Function1) objRememberedValue3, composerStartRestartGroup, 0, 0), "", SizeKt.fillMaxSize$default(PaddingKt.m479paddingqDBjuR0(boxScopeInstance2.align(companion, companion2.getCenter()), Dp.m3765constructorimpl(f4), Dp.m3765constructorimpl(35), Dp.m3765constructorimpl(f4), Dp.m3765constructorimpl(46)), 0.0f, 1, snapshotMutationPolicy), (Alignment) null, companion4.getFit(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24624, 104);
        composerStartRestartGroup.startReplaceableGroup(-749359730);
        if (ItemBubbleInfo$lambda$10$lambda$1(mutableState)) {
            String bubbleText = storeRoomChatBubbleModel.getBubbleText();
            Modifier modifierM480paddingqDBjuR0$default = PaddingKt.m480paddingqDBjuR0$default(boxScopeInstance2.align(companion, companion2.getCenter()), 0.0f, 0.0f, 0.0f, Dp.m3765constructorimpl(11), 7, null);
            int i6 = o0oO0O0o.f47152o00OOOo;
            composer2 = composerStartRestartGroup;
            TextKt.m1251Text4IGK_g(bubbleText, modifierM480paddingqDBjuR0$default, o0oO0O0o.f46946OooO0O0, com.code.android.util.o0000O0.OooO0OO(20, composerStartRestartGroup, 6), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131056);
        } else {
            composer2 = composerStartRestartGroup;
        }
        composer2.endReplaceableGroup();
        Composer composer5 = composer2;
        composer5.startReplaceableGroup(-749359352);
        if (ItemBubbleInfo$lambda$10$lambda$4(mutableState2)) {
            composer5.startReplaceableGroup(-492369756);
            Object objRememberedValue4 = composer5.rememberedValue();
            if (objRememberedValue4 == companion6.getEmpty()) {
                objRememberedValue4 = "svga/anim_loading.svga";
                composer5.updateRememberedValue("svga/anim_loading.svga");
            }
            composer5.endReplaceableGroup();
            boxScopeInstance = boxScopeInstance2;
            i3 = 11;
            p154o00OoO00.OooOo00.OooO00o((String) objRememberedValue4, true, 0, null, null, PaddingKt.m480paddingqDBjuR0$default(boxScopeInstance.align(SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(60)), companion2.getCenter()), 0.0f, 0.0f, 0.0f, Dp.m3765constructorimpl(11), 7, null), composer5, 54, 28);
        } else {
            boxScopeInstance = r14;
            i3 = 11;
        }
        int i7 = i3;
        composer5.endReplaceableGroup();
        composer5.startReplaceableGroup(-749359003);
        if ((storeRoomChatBubbleModel.getDayNum() > 0 || storeRoomChatBubbleModel.getFrozenDay() > 0) && storeRoomChatBubbleModel.getTimeLong() != -1) {
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            float f5 = 5;
            Modifier modifierM509height3ABfNKs2 = SizeKt.m509height3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion, Dp.m3765constructorimpl(f5), Dp.m3765constructorimpl(f5), 0.0f, 0.0f, 12, null), Dp.m3765constructorimpl(20));
            if (storeRoomChatBubbleModel.getFrozenDay() > 0) {
                int i8 = o0oO0O0o.f47152o00OOOo;
                j2 = o0oO0O0o.f47050o000O0o;
            } else {
                int i9 = o0oO0O0o.f47152o00OOOo;
                j2 = o0oO0O0o.f47054o000OO;
            }
            Modifier modifierM480paddingqDBjuR0$default2 = PaddingKt.m480paddingqDBjuR0$default(BackgroundKt.m168backgroundbw27NRU(modifierM509height3ABfNKs2, j2, RoundedCornerShapeKt.RoundedCornerShape(50)), Dp.m3765constructorimpl(4), 0.0f, Dp.m3765constructorimpl(f2), 0.0f, 10, null);
            composer5.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO00o2 = androidx.compose.material.OooO.OooO00o(Arrangement.INSTANCE, centerVertically, composer5, 48, -1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer5.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM480paddingqDBjuR0$default2);
            if (!(composer5.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer5.startReusableNode();
            if (composer5.getInserting()) {
                composer5.createNode(constructor2);
            } else {
                composer5.useNode();
            }
            Composer composerM1309constructorimpl2 = Updater.m1309constructorimpl(composer5);
            Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion5, composerM1309constructorimpl2, measurePolicyOooO00o2, composerM1309constructorimpl2, currentCompositionLocalMap2);
            if (composerM1309constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer5)), composer5, 2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            companion5 = companion5;
            ImageKt.Image(PainterResources_androidKt.painterResource(oOo00OO0.ic_store_limit_time, composer5, 0), (String) null, SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(i7)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer5, 440, 120);
            com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f), null, composer5, 6, 2);
            String strOooO0OO2 = o0000.OooO0OO(oO00OOo0.store_xxx_days);
            String[] strArr = new String[1];
            strArr[0] = storeRoomChatBubbleModel.getFrozenDay() > 0 ? String.valueOf(storeRoomChatBubbleModel.getFrozenDay()) : String.valueOf(storeRoomChatBubbleModel.getDayNum());
            String strOooO00o = o0000O.OooO00o(strOooO0OO2, strArr);
            int i10 = o0oO0O0o.f47152o00OOOo;
            composer3 = composer5;
            TextKt.m1251Text4IGK_g(strOooO00o, (Modifier) null, o0oO0O0o.f46946OooO0O0, com.code.android.util.o0000O0.OooO0OO(i7, composer5, 6), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131058);
            p426o0OoOO.o000oOoO.OooO00o(composer3);
        } else {
            composer3 = composer5;
        }
        composer3.endReplaceableGroup();
        Composer composer6 = composer3;
        composer6.startReplaceableGroup(1945483027);
        if (storeRoomChatBubbleModel.getObtainType() > 0) {
            Alignment center = companion2.getCenter();
            Modifier modifierAlign = boxScopeInstance.align(SizeKt.m509height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3765constructorimpl(24)), companion2.getBottomCenter());
            int i11 = o0oO0O0o.f47152o00OOOo;
            Modifier modifierM169backgroundbw27NRU$default = BackgroundKt.m169backgroundbw27NRU$default(modifierAlign, o0oO0O0o.f47041o0000ooO, null, 2, null);
            composer6.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer6, 6);
            composer6.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer6, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer6.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM169backgroundbw27NRU$default);
            if (!(composer6.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer6.startReusableNode();
            if (composer6.getInserting()) {
                composer6.createNode(constructor3);
            } else {
                composer6.useNode();
            }
            Composer composerM1309constructorimpl3 = Updater.m1309constructorimpl(composer6);
            Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion5, composerM1309constructorimpl3, measurePolicyRememberBoxMeasurePolicy, composerM1309constructorimpl3, currentCompositionLocalMap3);
            if (composerM1309constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1309constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
            }
            function3ModifierMaterializerOf3.invoke(SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer6)), composer6, 0);
            composer6.startReplaceableGroup(2058660585);
            if (storeRoomChatBubbleModel.getObtainType() == 1 && PremiumLevel.INSTANCE.of(Integer.valueOf(storeRoomChatBubbleModel.getObtainLevel())) == PremiumLevel.Premium4) {
                strOooO0OO = o0000.OooO0OO(oO00OOo0.Free_for_Count);
            } else if (storeRoomChatBubbleModel.getObtainType() == 1 && PremiumLevel.INSTANCE.of(Integer.valueOf(storeRoomChatBubbleModel.getObtainLevel())) == PremiumLevel.Premium5) {
                strOooO0OO = o0000.OooO0OO(oO00OOo0.Free_for_Marquis);
            } else {
                strOooO0OO = storeRoomChatBubbleModel.getObtainType() == 2 ? o0000.OooO0OO(oO00OOo0.Free_for_VIP) : "";
            }
            String str = strOooO0OO;
            composer4 = composer6;
            TextKt.m1251Text4IGK_g(str, (Modifier) null, o0oO0O0o.f47006o000, com.code.android.util.o0000O0.OooO0OO(12, composer6, 6), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, 0, 0, 131058);
            p426o0OoOO.o000oOoO.OooO00o(composer4);
        } else {
            composer4 = composer6;
        }
        if (OooOo.OooO0o.OooO0O0(composer4)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(storeRoomChatBubbleModel, i));
    }

    private static final boolean ItemBubbleInfo$lambda$10$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ItemBubbleInfo$lambda$10$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean ItemBubbleInfo$lambda$10$lambda$4(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ItemBubbleInfo$lambda$10$lambda$5(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void ItemBubbleUseButton(StoreRoomChatBubbleModel storeRoomChatBubbleModel, StoreRoomChatBubbleMineVM storeRoomChatBubbleMineVM, o0O0OOO0 o0o0ooo0, LifecycleOwner lifecycleOwner, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(454000073);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(454000073, i, -1, "com.yalla.yalla.ui.screen.store.StoreChatBubbleMineScreen.ItemBubbleUseButton (StoreChatBubbleMineScreen.kt:141)");
        }
        p148o00Oo0o.o00000O0.OooO00o(o0000.OooO0OO(storeRoomChatBubbleModel.getSelected() ? oO00OOo0.In_Use : oO00OOo0.Use), com.code.android.util.o0000O0.OooO0OO(16, composerStartRestartGroup, 6), null, storeRoomChatBubbleModel.getFrozenDay() == 0 ? TextButtonStyle.Green : TextButtonStyle.GreyDisable, null, null, RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl(0)), 0.0f, null, storeRoomChatBubbleModel.getFrozenDay() == 0, false, 0L, false, null, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1969554633, true, new OooO(storeRoomChatBubbleModel)), null, null, SizeKt.m509height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m3765constructorimpl(36)), new OooOO0(storeRoomChatBubbleModel, storeRoomChatBubbleMineVM, o0o0ooo0, lifecycleOwner), composerStartRestartGroup, 0, 100859904, 228788);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0O(storeRoomChatBubbleModel, storeRoomChatBubbleMineVM, o0o0ooo0, lifecycleOwner, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void PremiumBubbleBuyFrozenDialog(MutableState<Boolean> mutableState, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-165564454);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(mutableState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-165564454, i2, -1, "com.yalla.yalla.ui.screen.store.StoreChatBubbleMineScreen.PremiumBubbleBuyFrozenDialog (StoreChatBubbleMineScreen.kt:342)");
            }
            composer2 = composerStartRestartGroup;
            p158o00OoOOO.oo000o.OooO0Oo(mutableState, null, o0000.OooO0OO(oO00OOo0.only_premium_use), null, false, false, null, null, o0000.OooO0OO(oO00OOo0.Get_Yalla_Premium), false, null, false, new OooOo00((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())), null, false, false, null, OooOo.f29815OooO0Oo, null, null, composer2, i2 & 14, 12582912, 913146);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Oooo000(mutableState, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void VipBubbleBuyFrozenDialog(MutableState<Boolean> mutableState, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(35827412);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(mutableState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(35827412, i2, -1, "com.yalla.yalla.ui.screen.store.StoreChatBubbleMineScreen.VipBubbleBuyFrozenDialog (StoreChatBubbleMineScreen.kt:356)");
            }
            composer2 = composerStartRestartGroup;
            p158o00OoOOO.oo000o.OooO0Oo(mutableState, null, o0000.OooO0OO(oO00OOo0.vip_can_use), null, false, false, null, null, o0000.OooO0OO(oO00OOo0.Get_Vip), false, null, false, Oooo0.f29817OooO0Oo, null, false, false, null, o000oOoO.f29821OooO0Oo, null, null, composer2, i2 & 14, 12583296, 913146);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o0OoOo0(mutableState, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void VipBubbleGiveFrozenDialog(MutableState<Boolean> mutableState, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(391170997);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(mutableState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(391170997, i2, -1, "com.yalla.yalla.ui.screen.store.StoreChatBubbleMineScreen.VipBubbleGiveFrozenDialog (StoreChatBubbleMineScreen.kt:370)");
            }
            composer2 = composerStartRestartGroup;
            p158o00OoOOO.oo000o.OooO0Oo(mutableState, null, o0000.OooO0OO(oO00OOo0.firzen_vip_use_ubfrozen), null, false, false, null, null, o0000.OooO0OO(oO00OOo0.Unfreeze_VIP), false, null, false, o00O0O.f29822OooO0Oo, null, false, false, null, o00Oo0.f29823OooO0Oo, null, null, composer2, i2 & 14, 12583296, 913146);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o00Ooo(mutableState, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onBubbleClick(StoreRoomChatBubbleModel model, StoreRoomChatBubbleMineVM vm, o0O0OOO0 loadingVM, LifecycleOwner lifecycleOwner) {
        if (model.getSelected()) {
            String strOooO0OO = o0000.OooO0OO(oO00OOo0.item_in_used);
            if (strOooO0OO == null || StringsKt.isBlank(strOooO0OO)) {
                return;
            }
            o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o.run();
                return;
            } else {
                o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                return;
            }
        }
        if (model.getFrozenDay() != 0 && model.getCanBuy() && model.getCanBuyUserType() == 1) {
            vm.getShowPremiumBuyFrozenDialog().setValue(Boolean.TRUE);
            return;
        }
        if (model.getFrozenDay() != 0 && model.getCanBuy() && model.getCanBuyUserType() == 2) {
            vm.getShowVipBuyFrozenDialog().setValue(Boolean.TRUE);
            return;
        }
        if (model.getFrozenDay() != 0 && !model.getCanBuy() && model.getObtainType() == 2) {
            vm.getShowVipGiveFrozenDialog().setValue(Boolean.TRUE);
            return;
        }
        o0OO00O<ApiResult<String>> o0oo00oUseBubble = vm.useBubble(model.getShopId());
        v0.OooO0O0(o0oo00oUseBubble, loadingVM, false, 6);
        o000O000.OooO0Oo(o0oo00oUseBubble, lifecycleOwner, true, null, new oo000o(vm), o00oO0o.f29827OooO0Oo, 4);
    }

    @Override // p526o0o0OOO0.o00O00O
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public void Content(@NotNull ColumnScope columnScope, @Nullable Composer composer, int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(columnScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(1032349415);
        if ((i & 112) == 0) {
            i2 = (composerStartRestartGroup.changed(this) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 81) == 16 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1032349415, i2, -1, "com.yalla.yalla.ui.screen.store.StoreChatBubbleMineScreen.Content (StoreChatBubbleMineScreen.kt:79)");
            }
            t1.OooO00o(o0000.OooO0OO(oO00OOo0.Chat_Box), 0.0f, o000OOo.OooO0OO(composerStartRestartGroup).f37715OooOOOO, null, null, null, null, null, BackgroundKt.m169backgroundbw27NRU$default(Modifier.INSTANCE, o000OOo.OooO0OO(composerStartRestartGroup).f37716OooOOOo, null, 2, null), composerStartRestartGroup, 0, SQLiteDatabase.MAX_SQL_CACHE_SIZE);
            composer2 = composerStartRestartGroup;
            MainContent(false, composer2, i2 & 112, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(columnScope, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void MainContent(boolean z, @Nullable Composer composer, int i, int i2) {
        boolean z2;
        int i3;
        boolean z3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-566158910);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            z2 = z;
        } else if ((i & 14) == 0) {
            z2 = z;
            i3 = (composerStartRestartGroup.changed(z2) ? 4 : 2) | i;
        } else {
            z2 = z;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(this) ? 32 : 16;
        }
        int i5 = i3;
        if ((i5 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            z3 = z2;
        } else {
            z3 = i4 != 0 ? false : z2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-566158910, i5, -1, "com.yalla.yalla.ui.screen.store.StoreChatBubbleMineScreen.MainContent (StoreChatBubbleMineScreen.kt:89)");
            }
            LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            LocalViewModelStoreOwner localViewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE;
            ViewModelStoreOwner current = localViewModelStoreOwner.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(StoreRoomChatBubbleMineVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            StoreRoomChatBubbleMineVM storeRoomChatBubbleMineVM = (StoreRoomChatBubbleMineVM) viewModel;
            o0OO00OO.OooO00o(storeRoomChatBubbleMineVM.getShowVipHiddenDialog(), composerStartRestartGroup, 0);
            o0OO00OO.OooO0O0(storeRoomChatBubbleMineVM.getShowWealthHiddenDialog(), composerStartRestartGroup, 0);
            int i6 = i5 & 112;
            PremiumBubbleBuyFrozenDialog(storeRoomChatBubbleMineVM.getShowPremiumBuyFrozenDialog(), composerStartRestartGroup, i6);
            VipBubbleBuyFrozenDialog(storeRoomChatBubbleMineVM.getShowVipBuyFrozenDialog(), composerStartRestartGroup, i6);
            VipBubbleGiveFrozenDialog(storeRoomChatBubbleMineVM.getShowVipGiveFrozenDialog(), composerStartRestartGroup, i6);
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current2 = localViewModelStoreOwner.getCurrent(composerStartRestartGroup, 6);
            if (current2 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel2 = ViewModelKt.viewModel(o0O0OOO0.class, current2, null, null, current2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            o0O0OOO0 o0o0ooo0 = (o0O0OOO0) viewModel2;
            o000O0.OooO0O0 oooO0O0OooO00o = o000O0.OooOOO.OooO00o(storeRoomChatBubbleMineVM.getBubblePagingSource().f37667OooO0oo, composerStartRestartGroup);
            composerStartRestartGroup.startReplaceableGroup(682588937);
            if (z3) {
                Observable<Object> observable = LiveEventBus.get("OUT_FIT_CHAT_BOX_REFRESH");
                Intrinsics.checkNotNullExpressionValue(observable, "get(EventKey.OUT_FIT_CHAT_BOX_REFRESH)");
                o00000O.OooO00o(observable, new OooOOO0(oooO0O0OooO00o), composerStartRestartGroup, 8);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1151852158, true, new OooOOO(oooO0O0OooO00o, storeRoomChatBubbleMineVM, o0o0ooo0, lifecycleOwner));
            int i7 = o000O0.OooO0O0.f34327OooO0o0;
            o0000Ooo.OooO0o(oooO0O0OooO00o, modifierFillMaxSize$default, null, null, null, composableLambda, composerStartRestartGroup, 196664, 28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOOO(z3, i, i2));
    }
}
