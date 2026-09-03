package p435o0OoOOO0;

import android.app.Activity;
import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
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
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
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
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.code.android.util.o0000Ooo;
import com.code.android.util.o0O0O00;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.qiniu.android.storage.Configuration;
import com.yalla.yalla.data.manager.SharedMessageVM;
import com.yalla.yalla.manager.AppUIThemeConfig;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.vm.main.MainVM;
import com.zego.zegoliveroom.constants.ZegoConstants;
import kotlin.Function;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p022Oooo00O.o00O00OO;
import p193o00o0O0O.o0000oo;
import p194o00o0OO.o0O0ooO;
import p416o0Oo0oO.oO0OOo0o;
import p417o0Oo0oO0.o00Oo0;
import p419o0Oo0oo0.o0OOO0o;
import p425o0OoO0OO.o00;
import p474o0OoooOO.oo0oO0;
import p477o0Ooooo0.o0O0o;
import p519o0o0O0O.o0oOO;
import p565o0oOo000.o000OOo;
import p565o0oOo000.oo000o;
import p565o0oOo000.oo0o0Oo;
import p587o0oOooO.oOOO0OO0;
import p593o0oOoooO.h0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMainTabManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainTabManager.kt\ncom/yalla/yalla/manager/main/MainTabManagerKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 6 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 10 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,512:1\n81#2,11:513\n25#3:524\n456#3,8:549\n464#3,3:563\n467#3,3:567\n50#3:572\n49#3:573\n36#3:580\n456#3,8:604\n464#3,3:618\n456#3,8:639\n464#3,3:653\n456#3,8:675\n464#3,3:689\n467#3,3:693\n467#3,3:699\n467#3,3:704\n36#3:719\n36#3:727\n456#3,8:752\n464#3,3:766\n467#3,3:770\n1097#4,6:525\n1097#4,6:574\n1097#4,6:581\n1097#4,6:720\n1097#4,6:728\n154#5:531\n154#5:657\n154#5:698\n154#5:709\n154#5:710\n154#5:711\n154#5:712\n154#5:713\n154#5:714\n154#5:715\n154#5:716\n154#5:717\n154#5:718\n154#5:726\n154#5:734\n73#6,6:532\n79#6:566\n83#6:571\n73#6,6:622\n79#6:656\n83#6:703\n78#7,11:538\n91#7:570\n78#7,11:593\n78#7,11:628\n78#7,11:664\n91#7:696\n91#7:702\n91#7:707\n78#7,11:741\n91#7:773\n4144#8,6:557\n4144#8,6:612\n4144#8,6:647\n4144#8,6:683\n4144#8,6:760\n72#9,6:587\n78#9:621\n82#9:708\n66#10,6:658\n72#10:692\n76#10:697\n66#10,6:735\n72#10:769\n76#10:774\n81#11:775\n81#11:776\n81#11:777\n*S KotlinDebug\n*F\n+ 1 MainTabManager.kt\ncom/yalla/yalla/manager/main/MainTabManagerKt\n*L\n224#1:513,11\n239#1:524\n272#1:549,8\n272#1:563,3\n272#1:567,3\n344#1:572\n344#1:573\n349#1:580\n346#1:604,8\n346#1:618,3\n354#1:639,8\n354#1:653,3\n368#1:675,8\n368#1:689,3\n368#1:693,3\n354#1:699,3\n346#1:704,3\n484#1:719\n495#1:727\n508#1:752,8\n508#1:766,3\n508#1:770,3\n239#1:525,6\n344#1:574,6\n349#1:581,6\n484#1:720,6\n495#1:728,6\n266#1:531\n363#1:657\n381#1:698\n397#1:709\n408#1:710\n411#1:711\n415#1:712\n417#1:713\n431#1:714\n434#1:715\n443#1:716\n452#1:717\n472#1:718\n487#1:726\n498#1:734\n272#1:532,6\n272#1:566\n272#1:571\n354#1:622,6\n354#1:656\n354#1:703\n272#1:538,11\n272#1:570\n346#1:593,11\n354#1:628,11\n368#1:664,11\n368#1:696\n354#1:702\n346#1:707\n508#1:741,11\n508#1:773\n272#1:557,6\n346#1:612,6\n354#1:647,6\n368#1:683,6\n508#1:760,6\n346#1:587,6\n346#1:621\n346#1:708\n368#1:658,6\n368#1:692\n368#1:697\n508#1:735,6\n508#1:769\n508#1:774\n396#1:775\n404#1:776\n459#1:777\n*E\n"})
public final class o0000O00 {

    public static final class OooO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f46872OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f46873OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData<Integer> f46874OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(BoxScope boxScope, MutableLiveData<Integer> mutableLiveData, int i) {
            super(2);
            this.f46872OooO0Oo = boxScope;
            this.f46874OooO0o0 = mutableLiveData;
            this.f46873OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f46873OooO0o | 1);
            o0000O00.OooO00o(this.f46872OooO0Oo, this.f46874OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData<Integer> f46875OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(MutableLiveData<Integer> mutableLiveData) {
            super(0);
            this.f46875OooO0Oo = mutableLiveData;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            MutableLiveData<Integer> mutableLiveData = this.f46875OooO0Oo;
            if (mutableLiveData != null) {
                mutableLiveData.setValue(0);
            }
            h0.OooO0O0("101043");
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData<Integer> f46876OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(MutableLiveData<Integer> mutableLiveData) {
            super(0);
            this.f46876OooO0Oo = mutableLiveData;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            MutableLiveData<Integer> mutableLiveData = this.f46876OooO0Oo;
            if (mutableLiveData != null) {
                mutableLiveData.setValue(1);
            }
            h0.OooO0O0("101044");
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData<Integer> f46877OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MainVM f46878OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(MutableLiveData<Integer> mutableLiveData, MainVM mainVM) {
            super(0);
            this.f46877OooO0Oo = mutableLiveData;
            this.f46878OooO0o0 = mainVM;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0oOO.f52647OooO00o.postValue(Boolean.FALSE);
            MutableLiveData<Integer> mutableLiveData = this.f46877OooO0Oo;
            if (mutableLiveData != null) {
                mutableLiveData.setValue(2);
            }
            h0.OooO0OO("101045", MapsKt.mapOf(TuplesKt.to("scene", Integer.valueOf(this.f46878OooO0o0.isShowingMomentTabAddVideoGuide() ? 1 : 0))));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData<Integer> f46879OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f46880OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(MutableLiveData<Integer> mutableLiveData, MutableState<Boolean> mutableState) {
            super(0);
            this.f46879OooO0Oo = mutableLiveData;
            this.f46880OooO0o0 = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            h0.OooO0O0("101046");
            o0000oo onLogin = new o0000oo(this.f46879OooO0Oo, this.f46880OooO0o0);
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
            if (Intrinsics.areEqual(oo0oO0.OooOo0O().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
            } else {
                Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                if (activityOooO0O0 != null) {
                    int i = LoginActivity.f24734OooOo0O;
                    LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f46881OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(MutableState<Boolean> mutableState) {
            super(0);
            this.f46881OooO0Oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f46881OooO0Oo.setValue(Boolean.FALSE);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f46882OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(MutableState<Boolean> mutableState) {
            super(0);
            this.f46882OooO0Oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f46882OooO0Oo.setValue(Boolean.FALSE);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f46883OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(Function0<Unit> function0) {
            super(0);
            this.f46883OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f46883OooO0Oo.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f46884OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f46885OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f46886OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f46887OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f46888OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(int i, int i2, boolean z, MutableState<Boolean> mutableState, int i3) {
            super(2);
            this.f46884OooO0Oo = i;
            this.f46886OooO0o0 = i2;
            this.f46885OooO0o = z;
            this.f46887OooO0oO = mutableState;
            this.f46888OooO0oo = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o0000O00.OooO0O0(this.f46884OooO0Oo, this.f46886OooO0o0, this.f46885OooO0o, this.f46887OooO0oO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f46888OooO0oo | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ Integer f46889OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ RowScope f46890OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f46891OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f46892OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ String f46893OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ boolean f46894OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ boolean f46895OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f46896OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ int f46897OooOO0o;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final /* synthetic */ int f46898OooOOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(RowScope rowScope, int i, int i2, String str, boolean z, Integer num, boolean z2, Function0<Unit> function0, int i3, int i4) {
            super(2);
            this.f46890OooO0Oo = rowScope;
            this.f46892OooO0o0 = i;
            this.f46891OooO0o = i2;
            this.f46893OooO0oO = str;
            this.f46894OooO0oo = z;
            this.f46889OooO = num;
            this.f46895OooOO0 = z2;
            this.f46896OooOO0O = function0;
            this.f46897OooOO0o = i3;
            this.f46898OooOOO0 = i4;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o0000O00.OooO0OO(this.f46890OooO0Oo, this.f46892OooO0o0, this.f46891OooO0o, this.f46893OooO0oO, this.f46894OooO0oo, this.f46889OooO, this.f46895OooOO0, this.f46896OooOO0O, composer, RecomposeScopeImplKt.updateChangedFlags(this.f46897OooOO0o | 1), this.f46898OooOOO0);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f46899OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f46900OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Integer f46901OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f46902OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f46903OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(BoxScope boxScope, Integer num, boolean z, boolean z2, int i) {
            super(2);
            this.f46899OooO0Oo = boxScope;
            this.f46901OooO0o0 = num;
            this.f46900OooO0o = z;
            this.f46902OooO0oO = z2;
            this.f46903OooO0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o0000O00.OooO0Oo(this.f46899OooO0Oo, this.f46901OooO0o0, this.f46900OooO0o, this.f46902OooO0oO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f46903OooO0oo | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f46904OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f46905OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Integer f46906OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f46907OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f46908OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(BoxScope boxScope, Integer num, boolean z, boolean z2, int i) {
            super(2);
            this.f46904OooO0Oo = boxScope;
            this.f46906OooO0o0 = num;
            this.f46905OooO0o = z;
            this.f46907OooO0oO = z2;
            this.f46908OooO0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o0000O00.OooO0Oo(this.f46904OooO0Oo, this.f46906OooO0o0, this.f46905OooO0o, this.f46907OooO0oO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f46908OooO0oo | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo0 implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f46909OooO0Oo;

        public Oooo0(o00000OO.OooO00o function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f46909OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f46909OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f46909OooO0Oo;
        }

        public final int hashCode() {
            return this.f46909OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f46909OooO0Oo.invoke(obj);
        }
    }

    public static final class Oooo000 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f46910OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f46911OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f46912OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo000(String str, int i, boolean z) {
            super(2);
            this.f46910OooO0Oo = z;
            this.f46912OooO0o0 = str;
            this.f46911OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f46911OooO0o | 1);
            o0000O00.OooO0o0(this.f46910OooO0Oo, this.f46912OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0139  */
    /* JADX WARN: Code duplicated, block: B:54:0x0165  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@NotNull BoxScope boxScope, @Nullable MutableLiveData<Integer> mutableLiveData, @Nullable Composer composer, int i) {
        MutableState mutableState;
        int iIntValue;
        int iIntValue2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        Boolean bool;
        Integer num;
        Integer num2;
        Intrinsics.checkNotNullParameter(boxScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(1830341856);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1830341856, i, -1, "com.yalla.yalla.manager.main.MainTabContainer (MainTabManager.kt:220)");
        }
        composerStartRestartGroup.startReplaceableGroup(2114310900);
        State stateObserveAsState = mutableLiveData == null ? null : LiveDataAdapterKt.observeAsState(mutableLiveData, composerStartRestartGroup, 8);
        composerStartRestartGroup.endReplaceableGroup();
        Integer num3 = stateObserveAsState != null ? (Integer) stateObserveAsState.getValue() : null;
        composerStartRestartGroup.startReplaceableGroup(1729797275);
        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
        if (current == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        ViewModel viewModel = ViewModelKt.viewModel(MainVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
        composerStartRestartGroup.endReplaceableGroup();
        MainVM mainVM = (MainVM) viewModel;
        composerStartRestartGroup.startReplaceableGroup(2114310963);
        if (o0OOO0o.OooO0O0(composerStartRestartGroup)) {
            Observable<Object> observable = LiveEventBus.get("EVENTMSG_TASK_TO_MAIN");
            Intrinsics.checkNotNullExpressionValue(observable, "get(...)");
            o00.OooO00o(observable, new o0000Ooo(mutableLiveData, 0), composerStartRestartGroup, 72);
            Observable<Object> observable2 = LiveEventBus.get("EVENTMSG_TASK_TO_MOMENTS");
            Intrinsics.checkNotNullExpressionValue(observable2, "get(...)");
            o00.OooO00o(observable2, new o0000(mutableLiveData, 0), composerStartRestartGroup, 72);
        }
        composerStartRestartGroup.endReplaceableGroup();
        oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
        Boolean bool2 = (Boolean) LiveDataAdapterKt.observeAsState(oo0oO0.OooOo0O(), composerStartRestartGroup, 8).getValue();
        boolean zBooleanValue = bool2 != null ? bool2.booleanValue() : false;
        composerStartRestartGroup.startReplaceableGroup(2114311397);
        if (zBooleanValue) {
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                oO0OOo0o oo0ooo0oOooO0o0 = o00Oo0.OooO0o0();
                oo0ooo0oOooO0o0.getClass();
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(oo0ooo0oOooO0o0.OooO0O0("messageDot" + oo0oO0.OooOOo0().getValue(), false)), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState = (MutableState) objRememberedValue;
        } else {
            mutableState = null;
        }
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(2114311549);
        if (zBooleanValue) {
            LiveData<Integer> unreadMomentsMessageCount = SharedMessageVM.INSTANCE.getUnreadMomentsMessageCount();
            State stateObserveAsState2 = unreadMomentsMessageCount == null ? null : LiveDataAdapterKt.observeAsState(unreadMomentsMessageCount, composerStartRestartGroup, 8);
            if (stateObserveAsState2 == null || (num2 = (Integer) stateObserveAsState2.getValue()) == null) {
                iIntValue = 0;
            } else {
                iIntValue = num2.intValue();
            }
        } else {
            iIntValue = 0;
        }
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(2114311719);
        if (zBooleanValue) {
            MediatorLiveData<Integer> unreadMessageCount = SharedMessageVM.INSTANCE.getUnreadMessageCount();
            State stateObserveAsState3 = unreadMessageCount == null ? null : LiveDataAdapterKt.observeAsState(unreadMessageCount, composerStartRestartGroup, 8);
            if (stateObserveAsState3 == null || (num = (Integer) stateObserveAsState3.getValue()) == null) {
                iIntValue2 = 0;
            } else {
                iIntValue2 = num.intValue();
            }
        } else {
            iIntValue2 = 0;
        }
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(2114311889);
        boolean zBooleanValue2 = (!zBooleanValue || (bool = (Boolean) LiveDataAdapterKt.observeAsState(mainVM.getHaveNewFollowingPost(), composerStartRestartGroup, 8).getValue()) == null) ? false : bool.booleanValue();
        composerStartRestartGroup.endReplaceableGroup();
        float fM3775constructorimpl = Dp.m3775constructorimpl(49);
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierM171backgroundbw27NRU$default = BackgroundKt.m171backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), o0O0o.f48093OooO0O0, null, 2, null);
        Alignment.Companion companion2 = Alignment.INSTANCE;
        com.code.android.util.OooOO0.OooO0o(fM3775constructorimpl, boxScope.align(modifierM171backgroundbw27NRU$default, companion2.getBottomCenter()), composerStartRestartGroup, 6, 0);
        Modifier modifierAlign = boxScope.align(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), companion2.getBottomCenter());
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooOO0O.OooO00o(companion2, Arrangement.INSTANCE.getStart(), composerStartRestartGroup, 0, -1323940314);
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
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        oOOO0OO0 oooo0oo0 = oOOO0OO0.f56825OooO00o;
        composerStartRestartGroup.startReplaceableGroup(32908487);
        if (ComposerKt.isTraceInProgress()) {
            i2 = 8;
            ComposerKt.traceEventStart(32908487, 8, -1, "com.yalla.yalla.util.UIThemeConfigDrawableIdUtils.mainTabRoomSelect (UIThemeConfigDrawableIdUtils.kt:90)");
        } else {
            i2 = 8;
        }
        MutableLiveData<Integer> mutableLiveData2 = p431o0OoOO.OooOo00.f46776OooO00o;
        AppUIThemeConfig appUIThemeConfigOooO00o = p431o0OoOO.OooOo00.OooO00o((Integer) LiveDataAdapterKt.observeAsState(mutableLiveData2, composerStartRestartGroup, i2).getValue());
        int[] iArr = oOOO0OO0.OooO0O0.$EnumSwitchMapping$0;
        int i25 = iArr[appUIThemeConfigOooO00o.ordinal()];
        if (i25 == 1) {
            i3 = oo000o.tab_room_select;
        } else if (i25 == 2) {
            i3 = oo000o.tab_room_select_ramdan;
        } else {
            if (i25 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i3 = oo000o.tab_room_select_seven_year;
        }
        int i26 = i3;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-329758784);
        if (ComposerKt.isTraceInProgress()) {
            i5 = 8;
            i4 = -1;
            ComposerKt.traceEventStart(-329758784, 8, -1, "com.yalla.yalla.util.UIThemeConfigDrawableIdUtils.mainTabRoomUnSelect (UIThemeConfigDrawableIdUtils.kt:99)");
        } else {
            i4 = -1;
            i5 = 8;
        }
        int i27 = iArr[p431o0OoOO.OooOo00.OooO00o((Integer) LiveDataAdapterKt.observeAsState(mutableLiveData2, composerStartRestartGroup, i5).getValue()).ordinal()];
        if (i27 == 1) {
            i6 = oo000o.tab_room_unselect;
        } else if (i27 == 2) {
            i6 = oo000o.tab_room_unselect_ramdan;
        } else {
            if (i27 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i6 = oo000o.tab_room_unselect_seven_year;
        }
        int i28 = i6;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState2 = mutableState;
        int i29 = i4;
        OooO0OO(rowScopeInstance, i26, i28, StringResources_androidKt.stringResource(o000OOo.room, composerStartRestartGroup, 0), num3 != null && num3.intValue() == 0, null, false, new OooO00o(mutableLiveData), composerStartRestartGroup, 6, 48);
        composerStartRestartGroup.startReplaceableGroup(1687937507);
        if (ComposerKt.isTraceInProgress()) {
            i7 = 8;
            ComposerKt.traceEventStart(1687937507, 8, i29, "com.yalla.yalla.util.UIThemeConfigDrawableIdUtils.mainTabExploreSelect (UIThemeConfigDrawableIdUtils.kt:108)");
        } else {
            i7 = 8;
        }
        int i30 = iArr[p431o0OoOO.OooOo00.OooO00o((Integer) LiveDataAdapterKt.observeAsState(mutableLiveData2, composerStartRestartGroup, i7).getValue()).ordinal()];
        if (i30 != 1) {
            i9 = 2;
            if (i30 != 2) {
                i8 = 3;
                if (i30 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i10 = oo000o.tab_explore_select_seven_year;
            } else {
                i8 = 3;
                i10 = oo000o.tab_explore_select_ramdan;
            }
        } else {
            i8 = 3;
            i9 = 2;
            i10 = oo000o.tab_explore_select;
        }
        int i31 = i9;
        int i32 = i10;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(1015229916);
        if (ComposerKt.isTraceInProgress()) {
            i11 = 8;
            ComposerKt.traceEventStart(1015229916, 8, i29, "com.yalla.yalla.util.UIThemeConfigDrawableIdUtils.mainTabExploreUnSelect (UIThemeConfigDrawableIdUtils.kt:117)");
        } else {
            i11 = 8;
        }
        int i33 = iArr[p431o0OoOO.OooOo00.OooO00o((Integer) LiveDataAdapterKt.observeAsState(mutableLiveData2, composerStartRestartGroup, i11).getValue()).ordinal()];
        if (i33 == 1) {
            i12 = oo000o.tab_explore_unselect;
        } else if (i33 == i31) {
            i12 = oo000o.tab_explore_unselect_ramdan;
        } else {
            if (i33 != i8) {
                throw new NoWhenBranchMatchedException();
            }
            i12 = oo000o.tab_explore_unselect_seven_year;
        }
        int i34 = i12;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composerStartRestartGroup.endReplaceableGroup();
        boolean z = false;
        String strStringResource = StringResources_androidKt.stringResource(o000OOo.room_nav_explore, composerStartRestartGroup, 0);
        if (num3 != null && num3.intValue() == 1) {
            z = true;
        }
        OooO0OO(rowScopeInstance, i32, i34, strStringResource, z, null, false, new OooO0O0(mutableLiveData), composerStartRestartGroup, 6, 48);
        composerStartRestartGroup.startReplaceableGroup(461854147);
        if (ComposerKt.isTraceInProgress()) {
            i13 = 8;
            ComposerKt.traceEventStart(461854147, 8, i29, "com.yalla.yalla.util.UIThemeConfigDrawableIdUtils.mainTabMomentsSelect (UIThemeConfigDrawableIdUtils.kt:126)");
        } else {
            i13 = 8;
        }
        int i35 = iArr[p431o0OoOO.OooOo00.OooO00o((Integer) LiveDataAdapterKt.observeAsState(mutableLiveData2, composerStartRestartGroup, i13).getValue()).ordinal()];
        if (i35 != 1) {
            i15 = 2;
            if (i35 != 2) {
                i14 = 3;
                if (i35 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i16 = oo000o.tab_moments_select_seven_year;
            } else {
                i14 = 3;
                i16 = oo000o.tab_moments_select_ramdan;
            }
        } else {
            i14 = 3;
            i15 = 2;
            i16 = oo000o.tab_moments_select;
        }
        int i36 = i15;
        int i37 = i16;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-429839940);
        if (ComposerKt.isTraceInProgress()) {
            i17 = 8;
            ComposerKt.traceEventStart(-429839940, 8, i29, "com.yalla.yalla.util.UIThemeConfigDrawableIdUtils.mainTabMomentsUnSelect (UIThemeConfigDrawableIdUtils.kt:135)");
        } else {
            i17 = 8;
        }
        int i38 = iArr[p431o0OoOO.OooOo00.OooO00o((Integer) LiveDataAdapterKt.observeAsState(mutableLiveData2, composerStartRestartGroup, i17).getValue()).ordinal()];
        if (i38 == 1) {
            i18 = oo000o.tab_moments_unselect;
        } else if (i38 == i36) {
            i18 = oo000o.tab_moments_unselect_ramdan;
        } else {
            if (i38 != i14) {
                throw new NoWhenBranchMatchedException();
            }
            i18 = oo000o.tab_moments_unselect_seven_year;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composerStartRestartGroup.endReplaceableGroup();
        boolean z2 = false;
        String strStringResource2 = StringResources_androidKt.stringResource(o000OOo.moments, composerStartRestartGroup, 0);
        if (num3 != null && num3.intValue() == i36) {
            z2 = true;
        }
        OooO0OO(rowScopeInstance, i37, i18, strStringResource2, z2, Integer.valueOf(iIntValue), zBooleanValue2, new OooO0OO(mutableLiveData, mainVM), composerStartRestartGroup, 6, 0);
        composerStartRestartGroup.startReplaceableGroup(-1447171753);
        if (ComposerKt.isTraceInProgress()) {
            i19 = 8;
            ComposerKt.traceEventStart(-1447171753, 8, i29, "com.yalla.yalla.util.UIThemeConfigDrawableIdUtils.mainTabMessageSelect (UIThemeConfigDrawableIdUtils.kt:144)");
        } else {
            i19 = 8;
        }
        int i39 = iArr[p431o0OoOO.OooOo00.OooO00o((Integer) LiveDataAdapterKt.observeAsState(mutableLiveData2, composerStartRestartGroup, i19).getValue()).ordinal()];
        if (i39 != 1) {
            i20 = 2;
            if (i39 != 2) {
                i21 = 3;
                if (i39 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i22 = oo000o.tab_message_select_seven_year;
            } else {
                i21 = 3;
                i22 = oo000o.tab_message_select_ramdan;
            }
        } else {
            i20 = 2;
            i21 = 3;
            i22 = oo000o.tab_message_select;
        }
        int i40 = i20;
        int i41 = i22;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-1052694448);
        if (ComposerKt.isTraceInProgress()) {
            i23 = 8;
            ComposerKt.traceEventStart(-1052694448, 8, i29, "com.yalla.yalla.util.UIThemeConfigDrawableIdUtils.mainTabMessageUnSelect (UIThemeConfigDrawableIdUtils.kt:153)");
        } else {
            i23 = 8;
        }
        int i42 = iArr[p431o0OoOO.OooOo00.OooO00o((Integer) LiveDataAdapterKt.observeAsState(mutableLiveData2, composerStartRestartGroup, i23).getValue()).ordinal()];
        if (i42 == 1) {
            i24 = oo000o.tab_message_unselect;
        } else if (i42 == i40) {
            i24 = oo000o.tab_message_unselect_ramdan;
        } else {
            if (i42 != i21) {
                throw new NoWhenBranchMatchedException();
            }
            i24 = oo000o.tab_message_unselect_seven_year;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composerStartRestartGroup.endReplaceableGroup();
        OooO0OO(rowScopeInstance, i41, i24, StringResources_androidKt.stringResource(o000OOo.tab_message, composerStartRestartGroup, 0), num3 != null && num3.intValue() == i21, Integer.valueOf(iIntValue2), (mutableState2 != null ? ((Boolean) mutableState2.getValue()).booleanValue() : false) || iIntValue > 0, new OooO0o(mutableLiveData, mutableState2), composerStartRestartGroup, 6, 0);
        if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO(boxScope, mutableLiveData, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0O0(int i, int i2, boolean z, @NotNull MutableState<Boolean> isFirstShow, @Nullable Composer composer, int i3) {
        int i4;
        long j;
        Intrinsics.checkNotNullParameter(isFirstShow, "isFirstShow");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2038785349);
        if ((i3 & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 112) == 0) {
            i4 |= composerStartRestartGroup.changed(i2) ? 32 : 16;
        }
        if ((i3 & 896) == 0) {
            i4 |= composerStartRestartGroup.changed(z) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i3 & 7168) == 0) {
            i4 |= composerStartRestartGroup.changed(isFirstShow) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((i4 & 5851) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2038785349, i4, -1, "com.yalla.yalla.manager.main.MainTabImageComp (MainTabManager.kt:476)");
            }
            if (z) {
                composerStartRestartGroup.startReplaceableGroup(500295825);
                j = isFirstShow.getValue().booleanValue() ? 0L : 600L;
                ContentScale crop = ContentScale.INSTANCE.getCrop();
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                boolean zChanged = composerStartRestartGroup.changed(isFirstShow);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new OooOO0(isFirstShow);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                o0O0ooO.OooO00o(i, j, crop, 0, null, (Function0) objRememberedValue, null, SizeKt.m525size3ABfNKs(Modifier.INSTANCE, Dp.m3775constructorimpl(48)), composerStartRestartGroup, 12586368 | (i4 & 14), 80);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(500296170);
                j = isFirstShow.getValue().booleanValue() ? 0L : 400L;
                ContentScale crop2 = ContentScale.INSTANCE.getCrop();
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                boolean zChanged2 = composerStartRestartGroup.changed(isFirstShow);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new OooOO0O(isFirstShow);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                o0O0ooO.OooO00o(i2, j, crop2, 0, null, (Function0) objRememberedValue2, null, SizeKt.m525size3ABfNKs(Modifier.INSTANCE, Dp.m3775constructorimpl(48)), composerStartRestartGroup, 12586368 | ((i4 >> 3) & 14), 80);
                composerStartRestartGroup.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO0(i, i2, z, isFirstShow, i3));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0117  */
    /* JADX WARN: Code duplicated, block: B:104:0x0142  */
    /* JADX WARN: Code duplicated, block: B:106:0x014a  */
    /* JADX WARN: Code duplicated, block: B:109:0x0193  */
    /* JADX WARN: Code duplicated, block: B:111:0x019b  */
    /* JADX WARN: Code duplicated, block: B:114:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:117:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:118:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:121:0x0202  */
    /* JADX WARN: Code duplicated, block: B:123:0x0210  */
    /* JADX WARN: Code duplicated, block: B:126:0x0257  */
    /* JADX WARN: Code duplicated, block: B:129:0x0263  */
    /* JADX WARN: Code duplicated, block: B:130:0x0267  */
    /* JADX WARN: Code duplicated, block: B:133:0x0278  */
    /* JADX WARN: Code duplicated, block: B:135:0x0286  */
    /* JADX WARN: Code duplicated, block: B:138:0x0300  */
    /* JADX WARN: Code duplicated, block: B:141:0x030c  */
    /* JADX WARN: Code duplicated, block: B:142:0x0310  */
    /* JADX WARN: Code duplicated, block: B:145:0x0321  */
    /* JADX WARN: Code duplicated, block: B:147:0x032f  */
    /* JADX WARN: Code duplicated, block: B:150:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:155:0x03da  */
    /* JADX WARN: Code duplicated, block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:78:0x00da  */
    /* JADX WARN: Code duplicated, block: B:80:0x00df  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:91:0x0101  */
    /* JADX WARN: Code duplicated, block: B:93:0x0104  */
    /* JADX WARN: Code duplicated, block: B:94:0x0107  */
    /* JADX WARN: Code duplicated, block: B:97:0x010c  */
    /* JADX WARN: Code duplicated, block: B:98:0x010f  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0OO(RowScope rowScope, int i, int i2, String str, boolean z, Integer num, boolean z2, Function0<Unit> function0, Composer composer, int i3, int i4) {
        int i5;
        Integer num2;
        int i6;
        boolean z3;
        int i7;
        int i8;
        Integer num3;
        boolean z4;
        boolean zChanged;
        Object objRememberedValue;
        boolean zChanged2;
        Object objRememberedValue2;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Composer composerM1320constructorimpl;
        Function2 function2OooO00o;
        int currentCompositeKeyHash2;
        Function0<ComposeUiNode> constructor2;
        Composer composerM1320constructorimpl2;
        Function2 function2OooO00o2;
        int currentCompositeKeyHash3;
        Function0<ComposeUiNode> constructor3;
        Composer composerM1320constructorimpl3;
        Function2 function2OooO00o3;
        boolean z5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-40884513);
        if ((i4 & Integer.MIN_VALUE) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i5 = (composerStartRestartGroup.changed(rowScope) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i4 & 1) != 0) {
            i5 |= 48;
        } else if ((i3 & 112) == 0) {
            i5 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i4 & 2) != 0) {
            i5 |= 384;
        } else if ((i3 & 896) == 0) {
            i5 |= composerStartRestartGroup.changed(i2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i4 & 4) != 0) {
            i5 |= 3072;
        } else if ((i3 & 7168) == 0) {
            i5 |= composerStartRestartGroup.changed(str) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((i4 & 8) != 0) {
            i5 |= 24576;
        } else if ((57344 & i3) == 0) {
            i5 |= composerStartRestartGroup.changed(z) ? 16384 : 8192;
        }
        int i9 = i4 & 16;
        if (i9 == 0) {
            if ((458752 & i3) == 0) {
                num2 = num;
                i5 |= composerStartRestartGroup.changed(num2) ? 131072 : 65536;
            }
            i6 = i4 & 32;
            if (i6 != 0) {
                if ((3670016 & i3) == 0) {
                    z3 = z2;
                    if (composerStartRestartGroup.changed(z3)) {
                        i7 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i7 = 524288;
                    }
                    i5 |= i7;
                }
                if ((i4 & 64) != 0) {
                    if ((29360128 & i3) == 0) {
                        if (composerStartRestartGroup.changedInstance(function0)) {
                            i8 = 8388608;
                        } else {
                            i8 = Configuration.BLOCK_SIZE;
                        }
                    }
                    if ((23967451 & i5) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                        if (i9 != 0) {
                            num3 = null;
                        } else {
                            num3 = num2;
                        }
                        if (i6 != 0) {
                            z4 = false;
                        } else {
                            z4 = z3;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-40884513, i5, -1, "com.yalla.yalla.manager.main.MainTabItem (MainTabManager.kt:340)");
                        }
                        Integer numValueOf = Integer.valueOf(i);
                        Integer numValueOf2 = Integer.valueOf(i2);
                        int i10 = i5 >> 3;
                        int i11 = (i10 & 14) | (i10 & 112);
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(numValueOf) | composerStartRestartGroup.changed(numValueOf2);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        MutableState mutableState = (MutableState) objRememberedValue;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierOooO00o = androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScope, companion, 1.0f, false, 2, null);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged2 = composerStartRestartGroup.changed(function0);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new OooOOO(function0);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierOooO0O0 = o0O0O00.OooO0O0(modifierOooO00o, false, false, 0L, false, null, null, null, (Function0) objRememberedValue2, 253);
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
                        composerStartRestartGroup.startReplaceableGroup(-483455358);
                        Arrangement arrangement = Arrangement.INSTANCE;
                        MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooOO0.OooO00o(arrangement, centerHorizontally, composerStartRestartGroup, 48, -1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        constructor = companion3.getConstructor();
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
                        composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                        function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                        Alignment.Vertical bottom = companion2.getBottom();
                        composerStartRestartGroup.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyOooO00o2 = androidx.compose.material.OooO0OO.OooO00o(arrangement, bottom, composerStartRestartGroup, 48, -1323940314);
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        constructor2 = companion3.getConstructor();
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
                        composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
                        function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyOooO00o2, composerM1320constructorimpl2, currentCompositionLocalMap2);
                        if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        int i12 = oo0o0Oo.tab_main_middle_shadow_bg;
                        Painter painterPainterResource = PainterResources_androidKt.painterResource(i12, composerStartRestartGroup, 0);
                        float f = 48;
                        Modifier modifierM511height3ABfNKs = SizeKt.m511height3ABfNKs(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, companion, 1.0f, false, 2, null), Dp.m3775constructorimpl(f));
                        ContentScale.Companion companion4 = ContentScale.INSTANCE;
                        ImageKt.Image(painterPainterResource, (String) null, modifierM511height3ABfNKs, (Alignment) null, companion4.getFillHeight(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
                        Modifier modifierZIndex = ZIndexModifierKt.zIndex(companion, 1.0f);
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyOooO00o3 = androidx.compose.animation.Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
                        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        constructor3 = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierZIndex);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor3);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM1320constructorimpl3 = Updater.m1320constructorimpl(composerStartRestartGroup);
                        function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl3, measurePolicyOooO00o3, composerM1320constructorimpl3, currentCompositionLocalMap3);
                        if (composerM1320constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        int i13 = i5 >> 6;
                        OooO0O0(i, i2, z, mutableState, composerStartRestartGroup, i11 | (i13 & 896));
                        int i14 = i5 >> 12;
                        OooO0Oo(boxScopeInstance, num3, z4, z, composerStartRestartGroup, (i14 & 112) | 6 | (i14 & 896) | (i10 & 7168));
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        ImageKt.Image(PainterResources_androidKt.painterResource(i12, composerStartRestartGroup, 0), (String) null, SizeKt.m511height3ABfNKs(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, companion, 1.0f, false, 2, null), Dp.m3775constructorimpl(f)), (Alignment) null, companion4.getFillHeight(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
                        o00O00OO.OooO0O0(composerStartRestartGroup);
                        OooO0o0(z, str, composerStartRestartGroup, (i14 & 14) | (i13 & 112));
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        num2 = num3;
                        z5 = z4;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        z5 = z3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooOOOO(rowScope, i, i2, str, z, num2, z5, function0, i3, i4));
                }
                i8 = 12582912;
                i5 |= i8;
                if ((23967451 & i5) == 4793490) {
                    if (i9 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    if (i6 != 0) {
                        z4 = false;
                    } else {
                        z4 = z3;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-40884513, i5, -1, "com.yalla.yalla.manager.main.MainTabItem (MainTabManager.kt:340)");
                    }
                    Integer numValueOf3 = Integer.valueOf(i);
                    Integer numValueOf4 = Integer.valueOf(i2);
                    int i15 = i5 >> 3;
                    int i16 = (i15 & 14) | (i15 & 112);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(numValueOf3) | composerStartRestartGroup.changed(numValueOf4);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MutableState mutableState2 = (MutableState) objRememberedValue;
                    Modifier.Companion companion5 = Modifier.INSTANCE;
                    Modifier modifierOooO00o2 = androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScope, companion5, 1.0f, false, 2, null);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged2 = composerStartRestartGroup.changed(function0);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue2 = new OooOOO(function0);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new OooOOO(function0);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierOooO0O1 = o0O0O00.OooO0O0(modifierOooO00o2, false, false, 0L, false, null, null, null, (Function0) objRememberedValue2, 253);
                    Alignment.Companion companion6 = Alignment.INSTANCE;
                    Alignment.Horizontal centerHorizontally2 = companion6.getCenterHorizontally();
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    Arrangement arrangement2 = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyOooO00o4 = androidx.compose.material.OooOO0.OooO00o(arrangement2, centerHorizontally2, composerStartRestartGroup, 48, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                    constructor = companion7.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierOooO0O1);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion7, composerM1320constructorimpl, measurePolicyOooO00o4, composerM1320constructorimpl, currentCompositionLocalMap4);
                    if (composerM1320constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf4, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null);
                    Alignment.Vertical bottom2 = companion6.getBottom();
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyOooO00o5 = androidx.compose.material.OooO0OO.OooO00o(arrangement2, bottom2, composerStartRestartGroup, 48, -1323940314);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor2 = companion7.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default2);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
                    function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion7, composerM1320constructorimpl2, measurePolicyOooO00o5, composerM1320constructorimpl2, currentCompositionLocalMap5);
                    if (composerM1320constructorimpl2.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf5, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    int i17 = oo0o0Oo.tab_main_middle_shadow_bg;
                    Painter painterPainterResource2 = PainterResources_androidKt.painterResource(i17, composerStartRestartGroup, 0);
                    float f2 = 48;
                    Modifier modifierM511height3ABfNKs2 = SizeKt.m511height3ABfNKs(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance2, companion5, 1.0f, false, 2, null), Dp.m3775constructorimpl(f2));
                    ContentScale.Companion companion8 = ContentScale.INSTANCE;
                    ImageKt.Image(painterPainterResource2, (String) null, modifierM511height3ABfNKs2, (Alignment) null, companion8.getFillHeight(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
                    Modifier modifierZIndex2 = ZIndexModifierKt.zIndex(companion5, 1.0f);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyOooO00o6 = androidx.compose.animation.Oooo000.OooO00o(companion6, false, composerStartRestartGroup, 0, -1323940314);
                    currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor3 = companion7.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierZIndex2);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor3);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1320constructorimpl3 = Updater.m1320constructorimpl(composerStartRestartGroup);
                    function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion7, composerM1320constructorimpl3, measurePolicyOooO00o6, composerM1320constructorimpl3, currentCompositionLocalMap6);
                    if (composerM1320constructorimpl3.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf6, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    int i18 = i5 >> 6;
                    OooO0O0(i, i2, z, mutableState2, composerStartRestartGroup, i16 | (i18 & 896));
                    int i19 = i5 >> 12;
                    OooO0Oo(boxScopeInstance2, num3, z4, z, composerStartRestartGroup, (i19 & 112) | 6 | (i19 & 896) | (i15 & 7168));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    ImageKt.Image(PainterResources_androidKt.painterResource(i17, composerStartRestartGroup, 0), (String) null, SizeKt.m511height3ABfNKs(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance2, companion5, 1.0f, false, 2, null), Dp.m3775constructorimpl(f2)), (Alignment) null, companion8.getFillHeight(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
                    o00O00OO.OooO0O0(composerStartRestartGroup);
                    OooO0o0(z, str, composerStartRestartGroup, (i19 & 14) | (i18 & 112));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    num2 = num3;
                    z5 = z4;
                } else {
                    if (i9 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    if (i6 != 0) {
                        z4 = false;
                    } else {
                        z4 = z3;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-40884513, i5, -1, "com.yalla.yalla.manager.main.MainTabItem (MainTabManager.kt:340)");
                    }
                    Integer numValueOf5 = Integer.valueOf(i);
                    Integer numValueOf6 = Integer.valueOf(i2);
                    int i110 = i5 >> 3;
                    int i111 = (i110 & 14) | (i110 & 112);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(numValueOf5) | composerStartRestartGroup.changed(numValueOf6);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MutableState mutableState3 = (MutableState) objRememberedValue;
                    Modifier.Companion companion9 = Modifier.INSTANCE;
                    Modifier modifierOooO00o3 = androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScope, companion9, 1.0f, false, 2, null);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged2 = composerStartRestartGroup.changed(function0);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue2 = new OooOOO(function0);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new OooOOO(function0);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierOooO0O2 = o0O0O00.OooO0O0(modifierOooO00o3, false, false, 0L, false, null, null, null, (Function0) objRememberedValue2, 253);
                    Alignment.Companion companion10 = Alignment.INSTANCE;
                    Alignment.Horizontal centerHorizontally3 = companion10.getCenterHorizontally();
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    Arrangement arrangement3 = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyOooO00o7 = androidx.compose.material.OooOO0.OooO00o(arrangement3, centerHorizontally3, composerStartRestartGroup, 48, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion11 = ComposeUiNode.INSTANCE;
                    constructor = companion11.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(modifierOooO0O2);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion11, composerM1320constructorimpl, measurePolicyOooO00o7, composerM1320constructorimpl, currentCompositionLocalMap7);
                    if (composerM1320constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf7, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                    Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion9, 0.0f, 1, null);
                    Alignment.Vertical bottom3 = companion10.getBottom();
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyOooO00o8 = androidx.compose.material.OooO0OO.OooO00o(arrangement3, bottom3, composerStartRestartGroup, 48, -1323940314);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap8 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor2 = companion11.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf8 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default3);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
                    function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion11, composerM1320constructorimpl2, measurePolicyOooO00o8, composerM1320constructorimpl2, currentCompositionLocalMap8);
                    if (composerM1320constructorimpl2.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf8, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                    int i112 = oo0o0Oo.tab_main_middle_shadow_bg;
                    Painter painterPainterResource3 = PainterResources_androidKt.painterResource(i112, composerStartRestartGroup, 0);
                    float f3 = 48;
                    Modifier modifierM511height3ABfNKs3 = SizeKt.m511height3ABfNKs(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance3, companion9, 1.0f, false, 2, null), Dp.m3775constructorimpl(f3));
                    ContentScale.Companion companion12 = ContentScale.INSTANCE;
                    ImageKt.Image(painterPainterResource3, (String) null, modifierM511height3ABfNKs3, (Alignment) null, companion12.getFillHeight(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
                    Modifier modifierZIndex3 = ZIndexModifierKt.zIndex(companion9, 1.0f);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyOooO00o9 = androidx.compose.animation.Oooo000.OooO00o(companion10, false, composerStartRestartGroup, 0, -1323940314);
                    currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap9 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor3 = companion11.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf9 = LayoutKt.modifierMaterializerOf(modifierZIndex3);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor3);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1320constructorimpl3 = Updater.m1320constructorimpl(composerStartRestartGroup);
                    function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion11, composerM1320constructorimpl3, measurePolicyOooO00o9, composerM1320constructorimpl3, currentCompositionLocalMap9);
                    if (composerM1320constructorimpl3.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf9, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                    int i113 = i5 >> 6;
                    OooO0O0(i, i2, z, mutableState3, composerStartRestartGroup, i111 | (i113 & 896));
                    int i114 = i5 >> 12;
                    OooO0Oo(boxScopeInstance3, num3, z4, z, composerStartRestartGroup, (i114 & 112) | 6 | (i114 & 896) | (i110 & 7168));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    ImageKt.Image(PainterResources_androidKt.painterResource(i112, composerStartRestartGroup, 0), (String) null, SizeKt.m511height3ABfNKs(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance3, companion9, 1.0f, false, 2, null), Dp.m3775constructorimpl(f3)), (Alignment) null, companion12.getFillHeight(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
                    o00O00OO.OooO0O0(composerStartRestartGroup);
                    OooO0o0(z, str, composerStartRestartGroup, (i114 & 14) | (i113 & 112));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    num2 = num3;
                    z5 = z4;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooOOOO(rowScope, i, i2, str, z, num2, z5, function0, i3, i4));
            }
            i5 |= 1572864;
            z3 = z2;
            if ((i4 & 64) != 0) {
                if ((29360128 & i3) == 0) {
                    if (composerStartRestartGroup.changedInstance(function0)) {
                        i8 = 8388608;
                    } else {
                        i8 = Configuration.BLOCK_SIZE;
                    }
                }
                if ((23967451 & i5) == 4793490) {
                    if (i9 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    if (i6 != 0) {
                        z4 = false;
                    } else {
                        z4 = z3;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-40884513, i5, -1, "com.yalla.yalla.manager.main.MainTabItem (MainTabManager.kt:340)");
                    }
                    Integer numValueOf7 = Integer.valueOf(i);
                    Integer numValueOf8 = Integer.valueOf(i2);
                    int i115 = i5 >> 3;
                    int i116 = (i115 & 14) | (i115 & 112);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(numValueOf7) | composerStartRestartGroup.changed(numValueOf8);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MutableState mutableState4 = (MutableState) objRememberedValue;
                    Modifier.Companion companion13 = Modifier.INSTANCE;
                    Modifier modifierOooO00o4 = androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScope, companion13, 1.0f, false, 2, null);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged2 = composerStartRestartGroup.changed(function0);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue2 = new OooOOO(function0);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new OooOOO(function0);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierOooO0O3 = o0O0O00.OooO0O0(modifierOooO00o4, false, false, 0L, false, null, null, null, (Function0) objRememberedValue2, 253);
                    Alignment.Companion companion14 = Alignment.INSTANCE;
                    Alignment.Horizontal centerHorizontally4 = companion14.getCenterHorizontally();
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    Arrangement arrangement4 = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyOooO00o10 = androidx.compose.material.OooOO0.OooO00o(arrangement4, centerHorizontally4, composerStartRestartGroup, 48, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap10 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion15 = ComposeUiNode.INSTANCE;
                    constructor = companion15.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf10 = LayoutKt.modifierMaterializerOf(modifierOooO0O3);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion15, composerM1320constructorimpl, measurePolicyOooO00o10, composerM1320constructorimpl, currentCompositionLocalMap10);
                    if (composerM1320constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf10, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
                    Modifier modifierFillMaxWidth$default4 = SizeKt.fillMaxWidth$default(companion13, 0.0f, 1, null);
                    Alignment.Vertical bottom4 = companion14.getBottom();
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyOooO00o11 = androidx.compose.material.OooO0OO.OooO00o(arrangement4, bottom4, composerStartRestartGroup, 48, -1323940314);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap11 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor2 = companion15.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default4);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
                    function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion15, composerM1320constructorimpl2, measurePolicyOooO00o11, composerM1320constructorimpl2, currentCompositionLocalMap11);
                    if (composerM1320constructorimpl2.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf11, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    RowScopeInstance rowScopeInstance4 = RowScopeInstance.INSTANCE;
                    int i117 = oo0o0Oo.tab_main_middle_shadow_bg;
                    Painter painterPainterResource4 = PainterResources_androidKt.painterResource(i117, composerStartRestartGroup, 0);
                    float f4 = 48;
                    Modifier modifierM511height3ABfNKs4 = SizeKt.m511height3ABfNKs(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance4, companion13, 1.0f, false, 2, null), Dp.m3775constructorimpl(f4));
                    ContentScale.Companion companion16 = ContentScale.INSTANCE;
                    ImageKt.Image(painterPainterResource4, (String) null, modifierM511height3ABfNKs4, (Alignment) null, companion16.getFillHeight(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
                    Modifier modifierZIndex4 = ZIndexModifierKt.zIndex(companion13, 1.0f);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyOooO00o12 = androidx.compose.animation.Oooo000.OooO00o(companion14, false, composerStartRestartGroup, 0, -1323940314);
                    currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap12 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor3 = companion15.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf12 = LayoutKt.modifierMaterializerOf(modifierZIndex4);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor3);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1320constructorimpl3 = Updater.m1320constructorimpl(composerStartRestartGroup);
                    function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion15, composerM1320constructorimpl3, measurePolicyOooO00o12, composerM1320constructorimpl3, currentCompositionLocalMap12);
                    if (composerM1320constructorimpl3.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf12, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                    int i118 = i5 >> 6;
                    OooO0O0(i, i2, z, mutableState4, composerStartRestartGroup, i116 | (i118 & 896));
                    int i119 = i5 >> 12;
                    OooO0Oo(boxScopeInstance4, num3, z4, z, composerStartRestartGroup, (i119 & 112) | 6 | (i119 & 896) | (i115 & 7168));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    ImageKt.Image(PainterResources_androidKt.painterResource(i117, composerStartRestartGroup, 0), (String) null, SizeKt.m511height3ABfNKs(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance4, companion13, 1.0f, false, 2, null), Dp.m3775constructorimpl(f4)), (Alignment) null, companion16.getFillHeight(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
                    o00O00OO.OooO0O0(composerStartRestartGroup);
                    OooO0o0(z, str, composerStartRestartGroup, (i119 & 14) | (i118 & 112));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    num2 = num3;
                    z5 = z4;
                } else {
                    if (i9 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    if (i6 != 0) {
                        z4 = false;
                    } else {
                        z4 = z3;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-40884513, i5, -1, "com.yalla.yalla.manager.main.MainTabItem (MainTabManager.kt:340)");
                    }
                    Integer numValueOf9 = Integer.valueOf(i);
                    Integer numValueOf10 = Integer.valueOf(i2);
                    int i1110 = i5 >> 3;
                    int i1111 = (i1110 & 14) | (i1110 & 112);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(numValueOf9) | composerStartRestartGroup.changed(numValueOf10);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MutableState mutableState5 = (MutableState) objRememberedValue;
                    Modifier.Companion companion17 = Modifier.INSTANCE;
                    Modifier modifierOooO00o5 = androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScope, companion17, 1.0f, false, 2, null);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged2 = composerStartRestartGroup.changed(function0);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue2 = new OooOOO(function0);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new OooOOO(function0);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierOooO0O4 = o0O0O00.OooO0O0(modifierOooO00o5, false, false, 0L, false, null, null, null, (Function0) objRememberedValue2, 253);
                    Alignment.Companion companion18 = Alignment.INSTANCE;
                    Alignment.Horizontal centerHorizontally5 = companion18.getCenterHorizontally();
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    Arrangement arrangement5 = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyOooO00o13 = androidx.compose.material.OooOO0.OooO00o(arrangement5, centerHorizontally5, composerStartRestartGroup, 48, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap13 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion19 = ComposeUiNode.INSTANCE;
                    constructor = companion19.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf13 = LayoutKt.modifierMaterializerOf(modifierOooO0O4);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion19, composerM1320constructorimpl, measurePolicyOooO00o13, composerM1320constructorimpl, currentCompositionLocalMap13);
                    if (composerM1320constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf13, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    ColumnScopeInstance columnScopeInstance5 = ColumnScopeInstance.INSTANCE;
                    Modifier modifierFillMaxWidth$default5 = SizeKt.fillMaxWidth$default(companion17, 0.0f, 1, null);
                    Alignment.Vertical bottom5 = companion18.getBottom();
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyOooO00o14 = androidx.compose.material.OooO0OO.OooO00o(arrangement5, bottom5, composerStartRestartGroup, 48, -1323940314);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap14 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor2 = companion19.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf14 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default5);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
                    function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion19, composerM1320constructorimpl2, measurePolicyOooO00o14, composerM1320constructorimpl2, currentCompositionLocalMap14);
                    if (composerM1320constructorimpl2.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf14, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    RowScopeInstance rowScopeInstance5 = RowScopeInstance.INSTANCE;
                    int i1112 = oo0o0Oo.tab_main_middle_shadow_bg;
                    Painter painterPainterResource5 = PainterResources_androidKt.painterResource(i1112, composerStartRestartGroup, 0);
                    float f5 = 48;
                    Modifier modifierM511height3ABfNKs5 = SizeKt.m511height3ABfNKs(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance5, companion17, 1.0f, false, 2, null), Dp.m3775constructorimpl(f5));
                    ContentScale.Companion companion110 = ContentScale.INSTANCE;
                    ImageKt.Image(painterPainterResource5, (String) null, modifierM511height3ABfNKs5, (Alignment) null, companion110.getFillHeight(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
                    Modifier modifierZIndex5 = ZIndexModifierKt.zIndex(companion17, 1.0f);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyOooO00o15 = androidx.compose.animation.Oooo000.OooO00o(companion18, false, composerStartRestartGroup, 0, -1323940314);
                    currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap15 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor3 = companion19.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf15 = LayoutKt.modifierMaterializerOf(modifierZIndex5);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor3);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1320constructorimpl3 = Updater.m1320constructorimpl(composerStartRestartGroup);
                    function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion19, composerM1320constructorimpl3, measurePolicyOooO00o15, composerM1320constructorimpl3, currentCompositionLocalMap15);
                    if (composerM1320constructorimpl3.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf15, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
                    int i1113 = i5 >> 6;
                    OooO0O0(i, i2, z, mutableState5, composerStartRestartGroup, i1111 | (i1113 & 896));
                    int i1114 = i5 >> 12;
                    OooO0Oo(boxScopeInstance5, num3, z4, z, composerStartRestartGroup, (i1114 & 112) | 6 | (i1114 & 896) | (i1110 & 7168));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    ImageKt.Image(PainterResources_androidKt.painterResource(i1112, composerStartRestartGroup, 0), (String) null, SizeKt.m511height3ABfNKs(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance5, companion17, 1.0f, false, 2, null), Dp.m3775constructorimpl(f5)), (Alignment) null, companion110.getFillHeight(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
                    o00O00OO.OooO0O0(composerStartRestartGroup);
                    OooO0o0(z, str, composerStartRestartGroup, (i1114 & 14) | (i1113 & 112));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    num2 = num3;
                    z5 = z4;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooOOOO(rowScope, i, i2, str, z, num2, z5, function0, i3, i4));
            }
            i8 = 12582912;
            i5 |= i8;
            if ((23967451 & i5) == 4793490) {
                if (i9 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                if (i6 != 0) {
                    z4 = false;
                } else {
                    z4 = z3;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-40884513, i5, -1, "com.yalla.yalla.manager.main.MainTabItem (MainTabManager.kt:340)");
                }
                Integer numValueOf11 = Integer.valueOf(i);
                Integer numValueOf12 = Integer.valueOf(i2);
                int i1115 = i5 >> 3;
                int i1116 = (i1115 & 14) | (i1115 & 112);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(numValueOf11) | composerStartRestartGroup.changed(numValueOf12);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                MutableState mutableState6 = (MutableState) objRememberedValue;
                Modifier.Companion companion111 = Modifier.INSTANCE;
                Modifier modifierOooO00o6 = androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScope, companion111, 1.0f, false, 2, null);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged2 = composerStartRestartGroup.changed(function0);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue2 = new OooOOO(function0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new OooOOO(function0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierOooO0O5 = o0O0O00.OooO0O0(modifierOooO00o6, false, false, 0L, false, null, null, null, (Function0) objRememberedValue2, 253);
                Alignment.Companion companion112 = Alignment.INSTANCE;
                Alignment.Horizontal centerHorizontally6 = companion112.getCenterHorizontally();
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                Arrangement arrangement6 = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyOooO00o16 = androidx.compose.material.OooOO0.OooO00o(arrangement6, centerHorizontally6, composerStartRestartGroup, 48, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap16 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion113 = ComposeUiNode.INSTANCE;
                constructor = companion113.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf16 = LayoutKt.modifierMaterializerOf(modifierOooO0O5);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion113, composerM1320constructorimpl, measurePolicyOooO00o16, composerM1320constructorimpl, currentCompositionLocalMap16);
                if (composerM1320constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf16, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                ColumnScopeInstance columnScopeInstance6 = ColumnScopeInstance.INSTANCE;
                Modifier modifierFillMaxWidth$default6 = SizeKt.fillMaxWidth$default(companion111, 0.0f, 1, null);
                Alignment.Vertical bottom6 = companion112.getBottom();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyOooO00o17 = androidx.compose.material.OooO0OO.OooO00o(arrangement6, bottom6, composerStartRestartGroup, 48, -1323940314);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap17 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor2 = companion113.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf17 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default6);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion113, composerM1320constructorimpl2, measurePolicyOooO00o17, composerM1320constructorimpl2, currentCompositionLocalMap17);
                if (composerM1320constructorimpl2.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf17, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                RowScopeInstance rowScopeInstance6 = RowScopeInstance.INSTANCE;
                int i1117 = oo0o0Oo.tab_main_middle_shadow_bg;
                Painter painterPainterResource6 = PainterResources_androidKt.painterResource(i1117, composerStartRestartGroup, 0);
                float f6 = 48;
                Modifier modifierM511height3ABfNKs6 = SizeKt.m511height3ABfNKs(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance6, companion111, 1.0f, false, 2, null), Dp.m3775constructorimpl(f6));
                ContentScale.Companion companion114 = ContentScale.INSTANCE;
                ImageKt.Image(painterPainterResource6, (String) null, modifierM511height3ABfNKs6, (Alignment) null, companion114.getFillHeight(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
                Modifier modifierZIndex6 = ZIndexModifierKt.zIndex(companion111, 1.0f);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyOooO00o18 = androidx.compose.animation.Oooo000.OooO00o(companion112, false, composerStartRestartGroup, 0, -1323940314);
                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap18 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor3 = companion113.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf18 = LayoutKt.modifierMaterializerOf(modifierZIndex6);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1320constructorimpl3 = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion113, composerM1320constructorimpl3, measurePolicyOooO00o18, composerM1320constructorimpl3, currentCompositionLocalMap18);
                if (composerM1320constructorimpl3.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf18, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.INSTANCE;
                int i1118 = i5 >> 6;
                OooO0O0(i, i2, z, mutableState6, composerStartRestartGroup, i1116 | (i1118 & 896));
                int i1119 = i5 >> 12;
                OooO0Oo(boxScopeInstance6, num3, z4, z, composerStartRestartGroup, (i1119 & 112) | 6 | (i1119 & 896) | (i1115 & 7168));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                ImageKt.Image(PainterResources_androidKt.painterResource(i1117, composerStartRestartGroup, 0), (String) null, SizeKt.m511height3ABfNKs(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance6, companion111, 1.0f, false, 2, null), Dp.m3775constructorimpl(f6)), (Alignment) null, companion114.getFillHeight(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
                o00O00OO.OooO0O0(composerStartRestartGroup);
                OooO0o0(z, str, composerStartRestartGroup, (i1119 & 14) | (i1118 & 112));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                num2 = num3;
                z5 = z4;
            } else {
                if (i9 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                if (i6 != 0) {
                    z4 = false;
                } else {
                    z4 = z3;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-40884513, i5, -1, "com.yalla.yalla.manager.main.MainTabItem (MainTabManager.kt:340)");
                }
                Integer numValueOf13 = Integer.valueOf(i);
                Integer numValueOf14 = Integer.valueOf(i2);
                int i11110 = i5 >> 3;
                int i11111 = (i11110 & 14) | (i11110 & 112);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(numValueOf13) | composerStartRestartGroup.changed(numValueOf14);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                MutableState mutableState7 = (MutableState) objRememberedValue;
                Modifier.Companion companion115 = Modifier.INSTANCE;
                Modifier modifierOooO00o7 = androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScope, companion115, 1.0f, false, 2, null);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged2 = composerStartRestartGroup.changed(function0);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue2 = new OooOOO(function0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new OooOOO(function0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierOooO0O6 = o0O0O00.OooO0O0(modifierOooO00o7, false, false, 0L, false, null, null, null, (Function0) objRememberedValue2, 253);
                Alignment.Companion companion116 = Alignment.INSTANCE;
                Alignment.Horizontal centerHorizontally7 = companion116.getCenterHorizontally();
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                Arrangement arrangement7 = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyOooO00o19 = androidx.compose.material.OooOO0.OooO00o(arrangement7, centerHorizontally7, composerStartRestartGroup, 48, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap19 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion117 = ComposeUiNode.INSTANCE;
                constructor = companion117.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf19 = LayoutKt.modifierMaterializerOf(modifierOooO0O6);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion117, composerM1320constructorimpl, measurePolicyOooO00o19, composerM1320constructorimpl, currentCompositionLocalMap19);
                if (composerM1320constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf19, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                ColumnScopeInstance columnScopeInstance7 = ColumnScopeInstance.INSTANCE;
                Modifier modifierFillMaxWidth$default7 = SizeKt.fillMaxWidth$default(companion115, 0.0f, 1, null);
                Alignment.Vertical bottom7 = companion116.getBottom();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyOooO00o110 = androidx.compose.material.OooO0OO.OooO00o(arrangement7, bottom7, composerStartRestartGroup, 48, -1323940314);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap110 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor2 = companion117.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf110 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default7);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion117, composerM1320constructorimpl2, measurePolicyOooO00o110, composerM1320constructorimpl2, currentCompositionLocalMap110);
                if (composerM1320constructorimpl2.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf110, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                RowScopeInstance rowScopeInstance7 = RowScopeInstance.INSTANCE;
                int i11112 = oo0o0Oo.tab_main_middle_shadow_bg;
                Painter painterPainterResource7 = PainterResources_androidKt.painterResource(i11112, composerStartRestartGroup, 0);
                float f7 = 48;
                Modifier modifierM511height3ABfNKs7 = SizeKt.m511height3ABfNKs(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance7, companion115, 1.0f, false, 2, null), Dp.m3775constructorimpl(f7));
                ContentScale.Companion companion118 = ContentScale.INSTANCE;
                ImageKt.Image(painterPainterResource7, (String) null, modifierM511height3ABfNKs7, (Alignment) null, companion118.getFillHeight(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
                Modifier modifierZIndex7 = ZIndexModifierKt.zIndex(companion115, 1.0f);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyOooO00o111 = androidx.compose.animation.Oooo000.OooO00o(companion116, false, composerStartRestartGroup, 0, -1323940314);
                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap111 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor3 = companion117.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf111 = LayoutKt.modifierMaterializerOf(modifierZIndex7);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1320constructorimpl3 = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion117, composerM1320constructorimpl3, measurePolicyOooO00o111, composerM1320constructorimpl3, currentCompositionLocalMap111);
                if (composerM1320constructorimpl3.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf111, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance7 = BoxScopeInstance.INSTANCE;
                int i11113 = i5 >> 6;
                OooO0O0(i, i2, z, mutableState7, composerStartRestartGroup, i11111 | (i11113 & 896));
                int i11114 = i5 >> 12;
                OooO0Oo(boxScopeInstance7, num3, z4, z, composerStartRestartGroup, (i11114 & 112) | 6 | (i11114 & 896) | (i11110 & 7168));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                ImageKt.Image(PainterResources_androidKt.painterResource(i11112, composerStartRestartGroup, 0), (String) null, SizeKt.m511height3ABfNKs(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance7, companion115, 1.0f, false, 2, null), Dp.m3775constructorimpl(f7)), (Alignment) null, companion118.getFillHeight(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
                o00O00OO.OooO0O0(composerStartRestartGroup);
                OooO0o0(z, str, composerStartRestartGroup, (i11114 & 14) | (i11113 & 112));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                num2 = num3;
                z5 = z4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooOOOO(rowScope, i, i2, str, z, num2, z5, function0, i3, i4));
        }
        i5 |= 196608;
        num2 = num;
        i6 = i4 & 32;
        if (i6 != 0) {
            if ((3670016 & i3) == 0) {
                z3 = z2;
                if (composerStartRestartGroup.changed(z3)) {
                    i7 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i7 = 524288;
                }
                i5 |= i7;
            }
            if ((i4 & 64) != 0) {
                if ((29360128 & i3) == 0) {
                    if (composerStartRestartGroup.changedInstance(function0)) {
                        i8 = 8388608;
                    } else {
                        i8 = Configuration.BLOCK_SIZE;
                    }
                }
                if ((23967451 & i5) == 4793490) {
                    if (i9 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    if (i6 != 0) {
                        z4 = false;
                    } else {
                        z4 = z3;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-40884513, i5, -1, "com.yalla.yalla.manager.main.MainTabItem (MainTabManager.kt:340)");
                    }
                    Integer numValueOf15 = Integer.valueOf(i);
                    Integer numValueOf16 = Integer.valueOf(i2);
                    int i11115 = i5 >> 3;
                    int i11116 = (i11115 & 14) | (i11115 & 112);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(numValueOf15) | composerStartRestartGroup.changed(numValueOf16);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MutableState mutableState8 = (MutableState) objRememberedValue;
                    Modifier.Companion companion119 = Modifier.INSTANCE;
                    Modifier modifierOooO00o8 = androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScope, companion119, 1.0f, false, 2, null);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged2 = composerStartRestartGroup.changed(function0);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue2 = new OooOOO(function0);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new OooOOO(function0);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierOooO0O7 = o0O0O00.OooO0O0(modifierOooO00o8, false, false, 0L, false, null, null, null, (Function0) objRememberedValue2, 253);
                    Alignment.Companion companion1110 = Alignment.INSTANCE;
                    Alignment.Horizontal centerHorizontally8 = companion1110.getCenterHorizontally();
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    Arrangement arrangement8 = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyOooO00o112 = androidx.compose.material.OooOO0.OooO00o(arrangement8, centerHorizontally8, composerStartRestartGroup, 48, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap112 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion1111 = ComposeUiNode.INSTANCE;
                    constructor = companion1111.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf112 = LayoutKt.modifierMaterializerOf(modifierOooO0O7);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion1111, composerM1320constructorimpl, measurePolicyOooO00o112, composerM1320constructorimpl, currentCompositionLocalMap112);
                    if (composerM1320constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf112, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    ColumnScopeInstance columnScopeInstance8 = ColumnScopeInstance.INSTANCE;
                    Modifier modifierFillMaxWidth$default8 = SizeKt.fillMaxWidth$default(companion119, 0.0f, 1, null);
                    Alignment.Vertical bottom8 = companion1110.getBottom();
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyOooO00o113 = androidx.compose.material.OooO0OO.OooO00o(arrangement8, bottom8, composerStartRestartGroup, 48, -1323940314);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap113 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor2 = companion1111.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf113 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default8);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
                    function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion1111, composerM1320constructorimpl2, measurePolicyOooO00o113, composerM1320constructorimpl2, currentCompositionLocalMap113);
                    if (composerM1320constructorimpl2.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf113, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    RowScopeInstance rowScopeInstance8 = RowScopeInstance.INSTANCE;
                    int i11117 = oo0o0Oo.tab_main_middle_shadow_bg;
                    Painter painterPainterResource8 = PainterResources_androidKt.painterResource(i11117, composerStartRestartGroup, 0);
                    float f8 = 48;
                    Modifier modifierM511height3ABfNKs8 = SizeKt.m511height3ABfNKs(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance8, companion119, 1.0f, false, 2, null), Dp.m3775constructorimpl(f8));
                    ContentScale.Companion companion1112 = ContentScale.INSTANCE;
                    ImageKt.Image(painterPainterResource8, (String) null, modifierM511height3ABfNKs8, (Alignment) null, companion1112.getFillHeight(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
                    Modifier modifierZIndex8 = ZIndexModifierKt.zIndex(companion119, 1.0f);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyOooO00o114 = androidx.compose.animation.Oooo000.OooO00o(companion1110, false, composerStartRestartGroup, 0, -1323940314);
                    currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap114 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor3 = companion1111.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf114 = LayoutKt.modifierMaterializerOf(modifierZIndex8);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor3);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1320constructorimpl3 = Updater.m1320constructorimpl(composerStartRestartGroup);
                    function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion1111, composerM1320constructorimpl3, measurePolicyOooO00o114, composerM1320constructorimpl3, currentCompositionLocalMap114);
                    if (composerM1320constructorimpl3.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf114, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance8 = BoxScopeInstance.INSTANCE;
                    int i11118 = i5 >> 6;
                    OooO0O0(i, i2, z, mutableState8, composerStartRestartGroup, i11116 | (i11118 & 896));
                    int i11119 = i5 >> 12;
                    OooO0Oo(boxScopeInstance8, num3, z4, z, composerStartRestartGroup, (i11119 & 112) | 6 | (i11119 & 896) | (i11115 & 7168));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    ImageKt.Image(PainterResources_androidKt.painterResource(i11117, composerStartRestartGroup, 0), (String) null, SizeKt.m511height3ABfNKs(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance8, companion119, 1.0f, false, 2, null), Dp.m3775constructorimpl(f8)), (Alignment) null, companion1112.getFillHeight(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
                    o00O00OO.OooO0O0(composerStartRestartGroup);
                    OooO0o0(z, str, composerStartRestartGroup, (i11119 & 14) | (i11118 & 112));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    num2 = num3;
                    z5 = z4;
                } else {
                    if (i9 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    if (i6 != 0) {
                        z4 = false;
                    } else {
                        z4 = z3;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-40884513, i5, -1, "com.yalla.yalla.manager.main.MainTabItem (MainTabManager.kt:340)");
                    }
                    Integer numValueOf17 = Integer.valueOf(i);
                    Integer numValueOf18 = Integer.valueOf(i2);
                    int i111110 = i5 >> 3;
                    int i111111 = (i111110 & 14) | (i111110 & 112);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(numValueOf17) | composerStartRestartGroup.changed(numValueOf18);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MutableState mutableState9 = (MutableState) objRememberedValue;
                    Modifier.Companion companion1113 = Modifier.INSTANCE;
                    Modifier modifierOooO00o9 = androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScope, companion1113, 1.0f, false, 2, null);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged2 = composerStartRestartGroup.changed(function0);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue2 = new OooOOO(function0);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new OooOOO(function0);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierOooO0O8 = o0O0O00.OooO0O0(modifierOooO00o9, false, false, 0L, false, null, null, null, (Function0) objRememberedValue2, 253);
                    Alignment.Companion companion1114 = Alignment.INSTANCE;
                    Alignment.Horizontal centerHorizontally9 = companion1114.getCenterHorizontally();
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    Arrangement arrangement9 = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyOooO00o115 = androidx.compose.material.OooOO0.OooO00o(arrangement9, centerHorizontally9, composerStartRestartGroup, 48, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap115 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion1115 = ComposeUiNode.INSTANCE;
                    constructor = companion1115.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf115 = LayoutKt.modifierMaterializerOf(modifierOooO0O8);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion1115, composerM1320constructorimpl, measurePolicyOooO00o115, composerM1320constructorimpl, currentCompositionLocalMap115);
                    if (composerM1320constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf115, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    ColumnScopeInstance columnScopeInstance9 = ColumnScopeInstance.INSTANCE;
                    Modifier modifierFillMaxWidth$default9 = SizeKt.fillMaxWidth$default(companion1113, 0.0f, 1, null);
                    Alignment.Vertical bottom9 = companion1114.getBottom();
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyOooO00o116 = androidx.compose.material.OooO0OO.OooO00o(arrangement9, bottom9, composerStartRestartGroup, 48, -1323940314);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap116 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor2 = companion1115.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf116 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default9);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
                    function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion1115, composerM1320constructorimpl2, measurePolicyOooO00o116, composerM1320constructorimpl2, currentCompositionLocalMap116);
                    if (composerM1320constructorimpl2.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf116, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    RowScopeInstance rowScopeInstance9 = RowScopeInstance.INSTANCE;
                    int i111112 = oo0o0Oo.tab_main_middle_shadow_bg;
                    Painter painterPainterResource9 = PainterResources_androidKt.painterResource(i111112, composerStartRestartGroup, 0);
                    float f9 = 48;
                    Modifier modifierM511height3ABfNKs9 = SizeKt.m511height3ABfNKs(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance9, companion1113, 1.0f, false, 2, null), Dp.m3775constructorimpl(f9));
                    ContentScale.Companion companion1116 = ContentScale.INSTANCE;
                    ImageKt.Image(painterPainterResource9, (String) null, modifierM511height3ABfNKs9, (Alignment) null, companion1116.getFillHeight(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
                    Modifier modifierZIndex9 = ZIndexModifierKt.zIndex(companion1113, 1.0f);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyOooO00o117 = androidx.compose.animation.Oooo000.OooO00o(companion1114, false, composerStartRestartGroup, 0, -1323940314);
                    currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap117 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor3 = companion1115.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf117 = LayoutKt.modifierMaterializerOf(modifierZIndex9);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor3);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1320constructorimpl3 = Updater.m1320constructorimpl(composerStartRestartGroup);
                    function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion1115, composerM1320constructorimpl3, measurePolicyOooO00o117, composerM1320constructorimpl3, currentCompositionLocalMap117);
                    if (composerM1320constructorimpl3.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf117, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance9 = BoxScopeInstance.INSTANCE;
                    int i111113 = i5 >> 6;
                    OooO0O0(i, i2, z, mutableState9, composerStartRestartGroup, i111111 | (i111113 & 896));
                    int i111114 = i5 >> 12;
                    OooO0Oo(boxScopeInstance9, num3, z4, z, composerStartRestartGroup, (i111114 & 112) | 6 | (i111114 & 896) | (i111110 & 7168));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    ImageKt.Image(PainterResources_androidKt.painterResource(i111112, composerStartRestartGroup, 0), (String) null, SizeKt.m511height3ABfNKs(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance9, companion1113, 1.0f, false, 2, null), Dp.m3775constructorimpl(f9)), (Alignment) null, companion1116.getFillHeight(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
                    o00O00OO.OooO0O0(composerStartRestartGroup);
                    OooO0o0(z, str, composerStartRestartGroup, (i111114 & 14) | (i111113 & 112));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    num2 = num3;
                    z5 = z4;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooOOOO(rowScope, i, i2, str, z, num2, z5, function0, i3, i4));
            }
            i8 = 12582912;
            i5 |= i8;
            if ((23967451 & i5) == 4793490) {
                if (i9 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                if (i6 != 0) {
                    z4 = false;
                } else {
                    z4 = z3;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-40884513, i5, -1, "com.yalla.yalla.manager.main.MainTabItem (MainTabManager.kt:340)");
                }
                Integer numValueOf19 = Integer.valueOf(i);
                Integer numValueOf110 = Integer.valueOf(i2);
                int i111115 = i5 >> 3;
                int i111116 = (i111115 & 14) | (i111115 & 112);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(numValueOf19) | composerStartRestartGroup.changed(numValueOf110);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                MutableState mutableState10 = (MutableState) objRememberedValue;
                Modifier.Companion companion1117 = Modifier.INSTANCE;
                Modifier modifierOooO00o10 = androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScope, companion1117, 1.0f, false, 2, null);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged2 = composerStartRestartGroup.changed(function0);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue2 = new OooOOO(function0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new OooOOO(function0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierOooO0O9 = o0O0O00.OooO0O0(modifierOooO00o10, false, false, 0L, false, null, null, null, (Function0) objRememberedValue2, 253);
                Alignment.Companion companion1118 = Alignment.INSTANCE;
                Alignment.Horizontal centerHorizontally10 = companion1118.getCenterHorizontally();
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                Arrangement arrangement10 = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyOooO00o118 = androidx.compose.material.OooOO0.OooO00o(arrangement10, centerHorizontally10, composerStartRestartGroup, 48, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap118 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion1119 = ComposeUiNode.INSTANCE;
                constructor = companion1119.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf118 = LayoutKt.modifierMaterializerOf(modifierOooO0O9);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion1119, composerM1320constructorimpl, measurePolicyOooO00o118, composerM1320constructorimpl, currentCompositionLocalMap118);
                if (composerM1320constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf118, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                ColumnScopeInstance columnScopeInstance10 = ColumnScopeInstance.INSTANCE;
                Modifier modifierFillMaxWidth$default10 = SizeKt.fillMaxWidth$default(companion1117, 0.0f, 1, null);
                Alignment.Vertical bottom10 = companion1118.getBottom();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyOooO00o119 = androidx.compose.material.OooO0OO.OooO00o(arrangement10, bottom10, composerStartRestartGroup, 48, -1323940314);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap119 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor2 = companion1119.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf119 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default10);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion1119, composerM1320constructorimpl2, measurePolicyOooO00o119, composerM1320constructorimpl2, currentCompositionLocalMap119);
                if (composerM1320constructorimpl2.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf119, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                RowScopeInstance rowScopeInstance10 = RowScopeInstance.INSTANCE;
                int i111117 = oo0o0Oo.tab_main_middle_shadow_bg;
                Painter painterPainterResource10 = PainterResources_androidKt.painterResource(i111117, composerStartRestartGroup, 0);
                float f10 = 48;
                Modifier modifierM511height3ABfNKs10 = SizeKt.m511height3ABfNKs(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance10, companion1117, 1.0f, false, 2, null), Dp.m3775constructorimpl(f10));
                ContentScale.Companion companion11110 = ContentScale.INSTANCE;
                ImageKt.Image(painterPainterResource10, (String) null, modifierM511height3ABfNKs10, (Alignment) null, companion11110.getFillHeight(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
                Modifier modifierZIndex10 = ZIndexModifierKt.zIndex(companion1117, 1.0f);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyOooO00o1110 = androidx.compose.animation.Oooo000.OooO00o(companion1118, false, composerStartRestartGroup, 0, -1323940314);
                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap1110 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor3 = companion1119.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1110 = LayoutKt.modifierMaterializerOf(modifierZIndex10);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1320constructorimpl3 = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion1119, composerM1320constructorimpl3, measurePolicyOooO00o1110, composerM1320constructorimpl3, currentCompositionLocalMap1110);
                if (composerM1320constructorimpl3.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf1110, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance10 = BoxScopeInstance.INSTANCE;
                int i111118 = i5 >> 6;
                OooO0O0(i, i2, z, mutableState10, composerStartRestartGroup, i111116 | (i111118 & 896));
                int i111119 = i5 >> 12;
                OooO0Oo(boxScopeInstance10, num3, z4, z, composerStartRestartGroup, (i111119 & 112) | 6 | (i111119 & 896) | (i111115 & 7168));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                ImageKt.Image(PainterResources_androidKt.painterResource(i111117, composerStartRestartGroup, 0), (String) null, SizeKt.m511height3ABfNKs(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance10, companion1117, 1.0f, false, 2, null), Dp.m3775constructorimpl(f10)), (Alignment) null, companion11110.getFillHeight(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
                o00O00OO.OooO0O0(composerStartRestartGroup);
                OooO0o0(z, str, composerStartRestartGroup, (i111119 & 14) | (i111118 & 112));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                num2 = num3;
                z5 = z4;
            } else {
                if (i9 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                if (i6 != 0) {
                    z4 = false;
                } else {
                    z4 = z3;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-40884513, i5, -1, "com.yalla.yalla.manager.main.MainTabItem (MainTabManager.kt:340)");
                }
                Integer numValueOf111 = Integer.valueOf(i);
                Integer numValueOf112 = Integer.valueOf(i2);
                int i1111110 = i5 >> 3;
                int i1111111 = (i1111110 & 14) | (i1111110 & 112);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(numValueOf111) | composerStartRestartGroup.changed(numValueOf112);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                MutableState mutableState11 = (MutableState) objRememberedValue;
                Modifier.Companion companion11111 = Modifier.INSTANCE;
                Modifier modifierOooO00o11 = androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScope, companion11111, 1.0f, false, 2, null);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged2 = composerStartRestartGroup.changed(function0);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue2 = new OooOOO(function0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new OooOOO(function0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierOooO0O10 = o0O0O00.OooO0O0(modifierOooO00o11, false, false, 0L, false, null, null, null, (Function0) objRememberedValue2, 253);
                Alignment.Companion companion11112 = Alignment.INSTANCE;
                Alignment.Horizontal centerHorizontally11 = companion11112.getCenterHorizontally();
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                Arrangement arrangement11 = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyOooO00o1111 = androidx.compose.material.OooOO0.OooO00o(arrangement11, centerHorizontally11, composerStartRestartGroup, 48, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap1111 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion11113 = ComposeUiNode.INSTANCE;
                constructor = companion11113.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1111 = LayoutKt.modifierMaterializerOf(modifierOooO0O10);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion11113, composerM1320constructorimpl, measurePolicyOooO00o1111, composerM1320constructorimpl, currentCompositionLocalMap1111);
                if (composerM1320constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf1111, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                ColumnScopeInstance columnScopeInstance11 = ColumnScopeInstance.INSTANCE;
                Modifier modifierFillMaxWidth$default11 = SizeKt.fillMaxWidth$default(companion11111, 0.0f, 1, null);
                Alignment.Vertical bottom11 = companion11112.getBottom();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyOooO00o1112 = androidx.compose.material.OooO0OO.OooO00o(arrangement11, bottom11, composerStartRestartGroup, 48, -1323940314);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap1112 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor2 = companion11113.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1112 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default11);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion11113, composerM1320constructorimpl2, measurePolicyOooO00o1112, composerM1320constructorimpl2, currentCompositionLocalMap1112);
                if (composerM1320constructorimpl2.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf1112, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                RowScopeInstance rowScopeInstance11 = RowScopeInstance.INSTANCE;
                int i1111112 = oo0o0Oo.tab_main_middle_shadow_bg;
                Painter painterPainterResource11 = PainterResources_androidKt.painterResource(i1111112, composerStartRestartGroup, 0);
                float f11 = 48;
                Modifier modifierM511height3ABfNKs11 = SizeKt.m511height3ABfNKs(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance11, companion11111, 1.0f, false, 2, null), Dp.m3775constructorimpl(f11));
                ContentScale.Companion companion11114 = ContentScale.INSTANCE;
                ImageKt.Image(painterPainterResource11, (String) null, modifierM511height3ABfNKs11, (Alignment) null, companion11114.getFillHeight(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
                Modifier modifierZIndex11 = ZIndexModifierKt.zIndex(companion11111, 1.0f);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyOooO00o1113 = androidx.compose.animation.Oooo000.OooO00o(companion11112, false, composerStartRestartGroup, 0, -1323940314);
                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap1113 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor3 = companion11113.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1113 = LayoutKt.modifierMaterializerOf(modifierZIndex11);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1320constructorimpl3 = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion11113, composerM1320constructorimpl3, measurePolicyOooO00o1113, composerM1320constructorimpl3, currentCompositionLocalMap1113);
                if (composerM1320constructorimpl3.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf1113, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance11 = BoxScopeInstance.INSTANCE;
                int i1111113 = i5 >> 6;
                OooO0O0(i, i2, z, mutableState11, composerStartRestartGroup, i1111111 | (i1111113 & 896));
                int i1111114 = i5 >> 12;
                OooO0Oo(boxScopeInstance11, num3, z4, z, composerStartRestartGroup, (i1111114 & 112) | 6 | (i1111114 & 896) | (i1111110 & 7168));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                ImageKt.Image(PainterResources_androidKt.painterResource(i1111112, composerStartRestartGroup, 0), (String) null, SizeKt.m511height3ABfNKs(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance11, companion11111, 1.0f, false, 2, null), Dp.m3775constructorimpl(f11)), (Alignment) null, companion11114.getFillHeight(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
                o00O00OO.OooO0O0(composerStartRestartGroup);
                OooO0o0(z, str, composerStartRestartGroup, (i1111114 & 14) | (i1111113 & 112));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                num2 = num3;
                z5 = z4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooOOOO(rowScope, i, i2, str, z, num2, z5, function0, i3, i4));
        }
        i5 |= 1572864;
        z3 = z2;
        if ((i4 & 64) != 0) {
            if ((29360128 & i3) == 0) {
                if (composerStartRestartGroup.changedInstance(function0)) {
                    i8 = 8388608;
                } else {
                    i8 = Configuration.BLOCK_SIZE;
                }
            }
            if ((23967451 & i5) == 4793490) {
                if (i9 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                if (i6 != 0) {
                    z4 = false;
                } else {
                    z4 = z3;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-40884513, i5, -1, "com.yalla.yalla.manager.main.MainTabItem (MainTabManager.kt:340)");
                }
                Integer numValueOf113 = Integer.valueOf(i);
                Integer numValueOf114 = Integer.valueOf(i2);
                int i1111115 = i5 >> 3;
                int i1111116 = (i1111115 & 14) | (i1111115 & 112);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(numValueOf113) | composerStartRestartGroup.changed(numValueOf114);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                MutableState mutableState12 = (MutableState) objRememberedValue;
                Modifier.Companion companion11115 = Modifier.INSTANCE;
                Modifier modifierOooO00o12 = androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScope, companion11115, 1.0f, false, 2, null);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged2 = composerStartRestartGroup.changed(function0);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue2 = new OooOOO(function0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new OooOOO(function0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierOooO0O11 = o0O0O00.OooO0O0(modifierOooO00o12, false, false, 0L, false, null, null, null, (Function0) objRememberedValue2, 253);
                Alignment.Companion companion11116 = Alignment.INSTANCE;
                Alignment.Horizontal centerHorizontally12 = companion11116.getCenterHorizontally();
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                Arrangement arrangement12 = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyOooO00o1114 = androidx.compose.material.OooOO0.OooO00o(arrangement12, centerHorizontally12, composerStartRestartGroup, 48, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap1114 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion11117 = ComposeUiNode.INSTANCE;
                constructor = companion11117.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1114 = LayoutKt.modifierMaterializerOf(modifierOooO0O11);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion11117, composerM1320constructorimpl, measurePolicyOooO00o1114, composerM1320constructorimpl, currentCompositionLocalMap1114);
                if (composerM1320constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf1114, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                ColumnScopeInstance columnScopeInstance12 = ColumnScopeInstance.INSTANCE;
                Modifier modifierFillMaxWidth$default12 = SizeKt.fillMaxWidth$default(companion11115, 0.0f, 1, null);
                Alignment.Vertical bottom12 = companion11116.getBottom();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyOooO00o1115 = androidx.compose.material.OooO0OO.OooO00o(arrangement12, bottom12, composerStartRestartGroup, 48, -1323940314);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap1115 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor2 = companion11117.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1115 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default12);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion11117, composerM1320constructorimpl2, measurePolicyOooO00o1115, composerM1320constructorimpl2, currentCompositionLocalMap1115);
                if (composerM1320constructorimpl2.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf1115, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                RowScopeInstance rowScopeInstance12 = RowScopeInstance.INSTANCE;
                int i1111117 = oo0o0Oo.tab_main_middle_shadow_bg;
                Painter painterPainterResource12 = PainterResources_androidKt.painterResource(i1111117, composerStartRestartGroup, 0);
                float f12 = 48;
                Modifier modifierM511height3ABfNKs12 = SizeKt.m511height3ABfNKs(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance12, companion11115, 1.0f, false, 2, null), Dp.m3775constructorimpl(f12));
                ContentScale.Companion companion11118 = ContentScale.INSTANCE;
                ImageKt.Image(painterPainterResource12, (String) null, modifierM511height3ABfNKs12, (Alignment) null, companion11118.getFillHeight(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
                Modifier modifierZIndex12 = ZIndexModifierKt.zIndex(companion11115, 1.0f);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyOooO00o1116 = androidx.compose.animation.Oooo000.OooO00o(companion11116, false, composerStartRestartGroup, 0, -1323940314);
                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap1116 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor3 = companion11117.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1116 = LayoutKt.modifierMaterializerOf(modifierZIndex12);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1320constructorimpl3 = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion11117, composerM1320constructorimpl3, measurePolicyOooO00o1116, composerM1320constructorimpl3, currentCompositionLocalMap1116);
                if (composerM1320constructorimpl3.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf1116, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance12 = BoxScopeInstance.INSTANCE;
                int i1111118 = i5 >> 6;
                OooO0O0(i, i2, z, mutableState12, composerStartRestartGroup, i1111116 | (i1111118 & 896));
                int i1111119 = i5 >> 12;
                OooO0Oo(boxScopeInstance12, num3, z4, z, composerStartRestartGroup, (i1111119 & 112) | 6 | (i1111119 & 896) | (i1111115 & 7168));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                ImageKt.Image(PainterResources_androidKt.painterResource(i1111117, composerStartRestartGroup, 0), (String) null, SizeKt.m511height3ABfNKs(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance12, companion11115, 1.0f, false, 2, null), Dp.m3775constructorimpl(f12)), (Alignment) null, companion11118.getFillHeight(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
                o00O00OO.OooO0O0(composerStartRestartGroup);
                OooO0o0(z, str, composerStartRestartGroup, (i1111119 & 14) | (i1111118 & 112));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                num2 = num3;
                z5 = z4;
            } else {
                if (i9 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                if (i6 != 0) {
                    z4 = false;
                } else {
                    z4 = z3;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-40884513, i5, -1, "com.yalla.yalla.manager.main.MainTabItem (MainTabManager.kt:340)");
                }
                Integer numValueOf115 = Integer.valueOf(i);
                Integer numValueOf116 = Integer.valueOf(i2);
                int i11111110 = i5 >> 3;
                int i11111111 = (i11111110 & 14) | (i11111110 & 112);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(numValueOf115) | composerStartRestartGroup.changed(numValueOf116);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                MutableState mutableState13 = (MutableState) objRememberedValue;
                Modifier.Companion companion11119 = Modifier.INSTANCE;
                Modifier modifierOooO00o13 = androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScope, companion11119, 1.0f, false, 2, null);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged2 = composerStartRestartGroup.changed(function0);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue2 = new OooOOO(function0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new OooOOO(function0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierOooO0O12 = o0O0O00.OooO0O0(modifierOooO00o13, false, false, 0L, false, null, null, null, (Function0) objRememberedValue2, 253);
                Alignment.Companion companion111110 = Alignment.INSTANCE;
                Alignment.Horizontal centerHorizontally13 = companion111110.getCenterHorizontally();
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                Arrangement arrangement13 = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyOooO00o1117 = androidx.compose.material.OooOO0.OooO00o(arrangement13, centerHorizontally13, composerStartRestartGroup, 48, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap1117 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion111111 = ComposeUiNode.INSTANCE;
                constructor = companion111111.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1117 = LayoutKt.modifierMaterializerOf(modifierOooO0O12);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion111111, composerM1320constructorimpl, measurePolicyOooO00o1117, composerM1320constructorimpl, currentCompositionLocalMap1117);
                if (composerM1320constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf1117, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                ColumnScopeInstance columnScopeInstance13 = ColumnScopeInstance.INSTANCE;
                Modifier modifierFillMaxWidth$default13 = SizeKt.fillMaxWidth$default(companion11119, 0.0f, 1, null);
                Alignment.Vertical bottom13 = companion111110.getBottom();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyOooO00o1118 = androidx.compose.material.OooO0OO.OooO00o(arrangement13, bottom13, composerStartRestartGroup, 48, -1323940314);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap1118 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor2 = companion111111.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1118 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default13);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion111111, composerM1320constructorimpl2, measurePolicyOooO00o1118, composerM1320constructorimpl2, currentCompositionLocalMap1118);
                if (composerM1320constructorimpl2.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf1118, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                RowScopeInstance rowScopeInstance13 = RowScopeInstance.INSTANCE;
                int i11111112 = oo0o0Oo.tab_main_middle_shadow_bg;
                Painter painterPainterResource13 = PainterResources_androidKt.painterResource(i11111112, composerStartRestartGroup, 0);
                float f13 = 48;
                Modifier modifierM511height3ABfNKs13 = SizeKt.m511height3ABfNKs(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance13, companion11119, 1.0f, false, 2, null), Dp.m3775constructorimpl(f13));
                ContentScale.Companion companion111112 = ContentScale.INSTANCE;
                ImageKt.Image(painterPainterResource13, (String) null, modifierM511height3ABfNKs13, (Alignment) null, companion111112.getFillHeight(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
                Modifier modifierZIndex13 = ZIndexModifierKt.zIndex(companion11119, 1.0f);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyOooO00o1119 = androidx.compose.animation.Oooo000.OooO00o(companion111110, false, composerStartRestartGroup, 0, -1323940314);
                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap1119 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor3 = companion111111.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1119 = LayoutKt.modifierMaterializerOf(modifierZIndex13);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1320constructorimpl3 = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion111111, composerM1320constructorimpl3, measurePolicyOooO00o1119, composerM1320constructorimpl3, currentCompositionLocalMap1119);
                if (composerM1320constructorimpl3.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf1119, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance13 = BoxScopeInstance.INSTANCE;
                int i11111113 = i5 >> 6;
                OooO0O0(i, i2, z, mutableState13, composerStartRestartGroup, i11111111 | (i11111113 & 896));
                int i11111114 = i5 >> 12;
                OooO0Oo(boxScopeInstance13, num3, z4, z, composerStartRestartGroup, (i11111114 & 112) | 6 | (i11111114 & 896) | (i11111110 & 7168));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                ImageKt.Image(PainterResources_androidKt.painterResource(i11111112, composerStartRestartGroup, 0), (String) null, SizeKt.m511height3ABfNKs(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance13, companion11119, 1.0f, false, 2, null), Dp.m3775constructorimpl(f13)), (Alignment) null, companion111112.getFillHeight(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
                o00O00OO.OooO0O0(composerStartRestartGroup);
                OooO0o0(z, str, composerStartRestartGroup, (i11111114 & 14) | (i11111113 & 112));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                num2 = num3;
                z5 = z4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooOOOO(rowScope, i, i2, str, z, num2, z5, function0, i3, i4));
        }
        i8 = 12582912;
        i5 |= i8;
        if ((23967451 & i5) == 4793490) {
            if (i9 != 0) {
                num3 = null;
            } else {
                num3 = num2;
            }
            if (i6 != 0) {
                z4 = false;
            } else {
                z4 = z3;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-40884513, i5, -1, "com.yalla.yalla.manager.main.MainTabItem (MainTabManager.kt:340)");
            }
            Integer numValueOf117 = Integer.valueOf(i);
            Integer numValueOf118 = Integer.valueOf(i2);
            int i11111115 = i5 >> 3;
            int i11111116 = (i11111115 & 14) | (i11111115 & 112);
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged = composerStartRestartGroup.changed(numValueOf117) | composerStartRestartGroup.changed(numValueOf118);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState14 = (MutableState) objRememberedValue;
            Modifier.Companion companion111113 = Modifier.INSTANCE;
            Modifier modifierOooO00o14 = androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScope, companion111113, 1.0f, false, 2, null);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged2 = composerStartRestartGroup.changed(function0);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2) {
                objRememberedValue2 = new OooOOO(function0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = new OooOOO(function0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierOooO0O13 = o0O0O00.OooO0O0(modifierOooO00o14, false, false, 0L, false, null, null, null, (Function0) objRememberedValue2, 253);
            Alignment.Companion companion111114 = Alignment.INSTANCE;
            Alignment.Horizontal centerHorizontally14 = companion111114.getCenterHorizontally();
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            Arrangement arrangement14 = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyOooO00o11110 = androidx.compose.material.OooOO0.OooO00o(arrangement14, centerHorizontally14, composerStartRestartGroup, 48, -1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap11110 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion111115 = ComposeUiNode.INSTANCE;
            constructor = companion111115.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11110 = LayoutKt.modifierMaterializerOf(modifierOooO0O13);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
            function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion111115, composerM1320constructorimpl, measurePolicyOooO00o11110, composerM1320constructorimpl, currentCompositionLocalMap11110);
            if (composerM1320constructorimpl.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            } else {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf11110, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance14 = ColumnScopeInstance.INSTANCE;
            Modifier modifierFillMaxWidth$default14 = SizeKt.fillMaxWidth$default(companion111113, 0.0f, 1, null);
            Alignment.Vertical bottom14 = companion111114.getBottom();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO00o11111 = androidx.compose.material.OooO0OO.OooO00o(arrangement14, bottom14, composerStartRestartGroup, 48, -1323940314);
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap11111 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            constructor2 = companion111115.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11111 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default14);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
            function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion111115, composerM1320constructorimpl2, measurePolicyOooO00o11111, composerM1320constructorimpl2, currentCompositionLocalMap11111);
            if (composerM1320constructorimpl2.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            } else {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf11111, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance14 = RowScopeInstance.INSTANCE;
            int i11111117 = oo0o0Oo.tab_main_middle_shadow_bg;
            Painter painterPainterResource14 = PainterResources_androidKt.painterResource(i11111117, composerStartRestartGroup, 0);
            float f14 = 48;
            Modifier modifierM511height3ABfNKs14 = SizeKt.m511height3ABfNKs(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance14, companion111113, 1.0f, false, 2, null), Dp.m3775constructorimpl(f14));
            ContentScale.Companion companion111116 = ContentScale.INSTANCE;
            ImageKt.Image(painterPainterResource14, (String) null, modifierM511height3ABfNKs14, (Alignment) null, companion111116.getFillHeight(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
            Modifier modifierZIndex14 = ZIndexModifierKt.zIndex(companion111113, 1.0f);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyOooO00o11112 = androidx.compose.animation.Oooo000.OooO00o(companion111114, false, composerStartRestartGroup, 0, -1323940314);
            currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap11112 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            constructor3 = companion111115.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11112 = LayoutKt.modifierMaterializerOf(modifierZIndex14);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM1320constructorimpl3 = Updater.m1320constructorimpl(composerStartRestartGroup);
            function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion111115, composerM1320constructorimpl3, measurePolicyOooO00o11112, composerM1320constructorimpl3, currentCompositionLocalMap11112);
            if (composerM1320constructorimpl3.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
            } else {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf11112, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance14 = BoxScopeInstance.INSTANCE;
            int i11111118 = i5 >> 6;
            OooO0O0(i, i2, z, mutableState14, composerStartRestartGroup, i11111116 | (i11111118 & 896));
            int i11111119 = i5 >> 12;
            OooO0Oo(boxScopeInstance14, num3, z4, z, composerStartRestartGroup, (i11111119 & 112) | 6 | (i11111119 & 896) | (i11111115 & 7168));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            ImageKt.Image(PainterResources_androidKt.painterResource(i11111117, composerStartRestartGroup, 0), (String) null, SizeKt.m511height3ABfNKs(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance14, companion111113, 1.0f, false, 2, null), Dp.m3775constructorimpl(f14)), (Alignment) null, companion111116.getFillHeight(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
            o00O00OO.OooO0O0(composerStartRestartGroup);
            OooO0o0(z, str, composerStartRestartGroup, (i11111119 & 14) | (i11111118 & 112));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            num2 = num3;
            z5 = z4;
        } else {
            if (i9 != 0) {
                num3 = null;
            } else {
                num3 = num2;
            }
            if (i6 != 0) {
                z4 = false;
            } else {
                z4 = z3;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-40884513, i5, -1, "com.yalla.yalla.manager.main.MainTabItem (MainTabManager.kt:340)");
            }
            Integer numValueOf119 = Integer.valueOf(i);
            Integer numValueOf1110 = Integer.valueOf(i2);
            int i111111110 = i5 >> 3;
            int i111111111 = (i111111110 & 14) | (i111111110 & 112);
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged = composerStartRestartGroup.changed(numValueOf119) | composerStartRestartGroup.changed(numValueOf1110);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState15 = (MutableState) objRememberedValue;
            Modifier.Companion companion111117 = Modifier.INSTANCE;
            Modifier modifierOooO00o15 = androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScope, companion111117, 1.0f, false, 2, null);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged2 = composerStartRestartGroup.changed(function0);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2) {
                objRememberedValue2 = new OooOOO(function0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = new OooOOO(function0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierOooO0O14 = o0O0O00.OooO0O0(modifierOooO00o15, false, false, 0L, false, null, null, null, (Function0) objRememberedValue2, 253);
            Alignment.Companion companion111118 = Alignment.INSTANCE;
            Alignment.Horizontal centerHorizontally15 = companion111118.getCenterHorizontally();
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            Arrangement arrangement15 = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyOooO00o11113 = androidx.compose.material.OooOO0.OooO00o(arrangement15, centerHorizontally15, composerStartRestartGroup, 48, -1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap11113 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion111119 = ComposeUiNode.INSTANCE;
            constructor = companion111119.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11113 = LayoutKt.modifierMaterializerOf(modifierOooO0O14);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
            function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion111119, composerM1320constructorimpl, measurePolicyOooO00o11113, composerM1320constructorimpl, currentCompositionLocalMap11113);
            if (composerM1320constructorimpl.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            } else {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf11113, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance15 = ColumnScopeInstance.INSTANCE;
            Modifier modifierFillMaxWidth$default15 = SizeKt.fillMaxWidth$default(companion111117, 0.0f, 1, null);
            Alignment.Vertical bottom15 = companion111118.getBottom();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO00o11114 = androidx.compose.material.OooO0OO.OooO00o(arrangement15, bottom15, composerStartRestartGroup, 48, -1323940314);
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap11114 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            constructor2 = companion111119.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11114 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default15);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
            function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion111119, composerM1320constructorimpl2, measurePolicyOooO00o11114, composerM1320constructorimpl2, currentCompositionLocalMap11114);
            if (composerM1320constructorimpl2.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            } else {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf11114, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance15 = RowScopeInstance.INSTANCE;
            int i111111112 = oo0o0Oo.tab_main_middle_shadow_bg;
            Painter painterPainterResource15 = PainterResources_androidKt.painterResource(i111111112, composerStartRestartGroup, 0);
            float f15 = 48;
            Modifier modifierM511height3ABfNKs15 = SizeKt.m511height3ABfNKs(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance15, companion111117, 1.0f, false, 2, null), Dp.m3775constructorimpl(f15));
            ContentScale.Companion companion1111110 = ContentScale.INSTANCE;
            ImageKt.Image(painterPainterResource15, (String) null, modifierM511height3ABfNKs15, (Alignment) null, companion1111110.getFillHeight(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
            Modifier modifierZIndex15 = ZIndexModifierKt.zIndex(companion111117, 1.0f);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyOooO00o11115 = androidx.compose.animation.Oooo000.OooO00o(companion111118, false, composerStartRestartGroup, 0, -1323940314);
            currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap11115 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            constructor3 = companion111119.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11115 = LayoutKt.modifierMaterializerOf(modifierZIndex15);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM1320constructorimpl3 = Updater.m1320constructorimpl(composerStartRestartGroup);
            function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion111119, composerM1320constructorimpl3, measurePolicyOooO00o11115, composerM1320constructorimpl3, currentCompositionLocalMap11115);
            if (composerM1320constructorimpl3.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
            } else {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf11115, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance15 = BoxScopeInstance.INSTANCE;
            int i111111113 = i5 >> 6;
            OooO0O0(i, i2, z, mutableState15, composerStartRestartGroup, i111111111 | (i111111113 & 896));
            int i111111114 = i5 >> 12;
            OooO0Oo(boxScopeInstance15, num3, z4, z, composerStartRestartGroup, (i111111114 & 112) | 6 | (i111111114 & 896) | (i111111110 & 7168));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            ImageKt.Image(PainterResources_androidKt.painterResource(i111111112, composerStartRestartGroup, 0), (String) null, SizeKt.m511height3ABfNKs(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance15, companion111117, 1.0f, false, 2, null), Dp.m3775constructorimpl(f15)), (Alignment) null, companion1111110.getFillHeight(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
            o00O00OO.OooO0O0(composerStartRestartGroup);
            OooO0o0(z, str, composerStartRestartGroup, (i111111114 & 14) | (i111111113 & 112));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            num2 = num3;
            z5 = z4;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOOO(rowScope, i, i2, str, z, num2, z5, function0, i3, i4));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0Oo(BoxScope boxScope, Integer num, boolean z, boolean z2, Composer composer, int i) {
        int i2;
        float fM3775constructorimpl;
        Composer composerStartRestartGroup = composer.startRestartGroup(693913518);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changed(num) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((i2 & 5851) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composerStartRestartGroup = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(693913518, i2, -1, "com.yalla.yalla.manager.main.MainTabRedModifier (MainTabManager.kt:390)");
            }
            if (num == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooOo00(boxScope, num, z, z2, i));
                return;
            }
            num.intValue();
            State<Dp> stateM70animateDpAsStateAjpBEmI = AnimateAsStateKt.m70animateDpAsStateAjpBEmI(Dp.m3775constructorimpl(z2 ? 30 : 25), AnimationSpecKt.spring$default(z2 ? 0.5f : 1.0f, 400.0f, null, 4, null), "", null, composerStartRestartGroup, 384, 8);
            if (z2) {
                fM3775constructorimpl = (!z || num.intValue() > 0) ? Dp.m3775constructorimpl(-30) : Dp.m3775constructorimpl(-32);
            } else {
                fM3775constructorimpl = (!z || num.intValue() > 0) ? Dp.m3775constructorimpl(-14) : Dp.m3775constructorimpl(-18);
            }
            State<Dp> stateM70animateDpAsStateAjpBEmI2 = AnimateAsStateKt.m70animateDpAsStateAjpBEmI(fM3775constructorimpl, AnimationSpecKt.spring$default(z2 ? 0.5f : 1.0f, 400.0f, null, 4, null), "", null, composerStartRestartGroup, 384, 8);
            BoxKt.Box(SizeKt.m525size3ABfNKs(boxScope.align(Modifier.INSTANCE, Alignment.INSTANCE.getBottomCenter()), Dp.m3775constructorimpl(40)).then(num.intValue() > 0 ? o0000Ooo.OooO0O0(Modifier.INSTANCE, num, Dp.m3775constructorimpl(8), false, true, 0L, stateM70animateDpAsStateAjpBEmI.getValue().m3789unboximpl(), stateM70animateDpAsStateAjpBEmI2.getValue().m3789unboximpl(), Dp.m3775constructorimpl(2), 13924) : o0000Ooo.OooO00o(Modifier.INSTANCE, z, 0L, 0.0f, false, true, stateM70animateDpAsStateAjpBEmI.getValue().m3789unboximpl(), stateM70animateDpAsStateAjpBEmI2.getValue().m3789unboximpl(), Dp.m3775constructorimpl(2), 558)), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new OooOo(boxScope, num, z, z2, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0o0(boolean z, String str, Composer composer, int i) {
        int i2;
        long jColor;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-176915794);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        int i3 = i2;
        if ((i3 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-176915794, i3, -1, "com.yalla.yalla.manager.main.MainTabText (MainTabManager.kt:457)");
            }
            if (z) {
                composerStartRestartGroup.startReplaceableGroup(447084536);
                oOOO0OO0 oooo0oo0 = oOOO0OO0.f56825OooO00o;
                composerStartRestartGroup.startReplaceableGroup(1874650997);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1874650997, 8, -1, "com.yalla.yalla.util.UIThemeConfigDrawableIdUtils.getMainTabSelectedTextColor (UIThemeConfigDrawableIdUtils.kt:162)");
                }
                AppUIThemeConfig appUIThemeConfigOooO00o = p431o0OoOO.OooOo00.OooO00o((Integer) LiveDataAdapterKt.observeAsState(p431o0OoOO.OooOo00.f46776OooO00o, composerStartRestartGroup, 8).getValue());
                if (appUIThemeConfigOooO00o == AppUIThemeConfig.NORMAL) {
                    jColor = o0000oo.OooO0OO(composerStartRestartGroup).f38613OooO00o;
                } else if (appUIThemeConfigOooO00o == AppUIThemeConfig.RAMADAN) {
                    jColor = ColorKt.Color(4278237075L);
                } else {
                    if (appUIThemeConfigOooO00o != AppUIThemeConfig.SEVEN_YEAR) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jColor = ColorKt.Color(4285020408L);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(447084620);
                oOOO0OO0 oooo0oo1 = oOOO0OO0.f56825OooO00o;
                composerStartRestartGroup.startReplaceableGroup(1371711452);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1371711452, 8, -1, "com.yalla.yalla.util.UIThemeConfigDrawableIdUtils.getMainTabUnSelectedTextColor (UIThemeConfigDrawableIdUtils.kt:171)");
                }
                int i4 = oOOO0OO0.OooO0O0.$EnumSwitchMapping$0[p431o0OoOO.OooOo00.OooO00o((Integer) LiveDataAdapterKt.observeAsState(p431o0OoOO.OooOo00.f46776OooO00o, composerStartRestartGroup, 8).getValue()).ordinal()];
                if (i4 == 1 || i4 == 2) {
                    jColor = o0O0o.f48319o0OoO0o;
                } else {
                    if (i4 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jColor = ColorKt.Color(4289374142L);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
            }
            composer2 = composerStartRestartGroup;
            TextKt.m1261Text4IGK_g(str, PaddingKt.m482paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl(5), 7, null), SingleValueAnimationKt.m58animateColorAsStateeuL9pac(jColor, AnimationSpecKt.tween$default(600, 0, null, 6, null), "tabAnim", null, composerStartRestartGroup, 432, 8).getValue().m1691unboximpl(), TextUnitKt.getSp(11), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, ((i3 >> 3) & 14) | 199728, 0, 131024);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Oooo000(str, i, z));
    }
}
