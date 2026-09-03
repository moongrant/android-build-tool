package p528o0o0OOOo;

import android.app.Activity;
import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.code.android.util.o0000;
import com.code.android.util.o0000O0;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00O;
import com.code.android.util.o0O0O00;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.model.VipLevel;
import com.yalla.yalla.model.VipState;
import com.yalla.yalla.model.moment.MomentCommentDetailModel;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentReplyModel;
import com.yalla.yalla.model.moment.MomentSendContentAtModel;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.vm.moment.MomentCommentsVM;
import com.yalla.yalla.ui.vm.moment.MomentReplyVM;
import com.yalla.yalla.ui.vm.moment.MomentVideoVM;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147o00Oo0Oo.o000OOo;
import p406o0Oo0Ooo.oOO0O0O;
import p408o0Oo0o0O.o00Oo0;
import p464o0Oooo.o000000O;
import p469o0OoooOO.o0oO0O0o;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p601o0oo0O0.o0000oo;
import p605o0oo0OO0.o000OO00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nMomentReply.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentReply.kt\ncom/yalla/yalla/ui/screen/moment/media/MomentReply\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 9 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 10 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 11 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 12 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,535:1\n154#2:536\n154#2:572\n154#2:573\n154#2:574\n154#2:610\n154#2:611\n154#2:660\n154#2:661\n154#2:755\n154#2:791\n154#2:792\n154#2:828\n154#2:879\n154#2:880\n154#2:886\n154#2:887\n154#2:923\n154#2:924\n154#2:925\n154#2:926\n154#2:927\n154#2:928\n154#2:929\n154#2:930\n154#2:931\n154#2:932\n154#2:933\n154#2:934\n154#2:935\n154#2:936\n154#2:937\n154#2:943\n154#2:1013\n154#2:1014\n154#2:1057\n154#2:1058\n154#2:1090\n154#2:1125\n154#2:1126\n66#3,6:537\n72#3:571\n66#3,6:620\n72#3:654\n76#3:659\n66#3,6:670\n72#3:704\n76#3:709\n76#3:719\n66#3,6:844\n72#3:878\n76#3:885\n67#3,5:944\n72#3:977\n76#3:982\n66#3,6:1022\n72#3:1056\n76#3:1063\n67#3,5:1091\n72#3:1124\n76#3:1131\n78#4,11:543\n78#4,11:581\n78#4,11:626\n91#4:658\n78#4,11:676\n91#4:708\n91#4:713\n91#4:718\n78#4,11:726\n78#4,11:762\n78#4,11:799\n91#4:832\n91#4:837\n91#4:842\n78#4,11:850\n91#4:884\n78#4,11:894\n91#4:941\n78#4,11:949\n91#4:981\n78#4,11:1028\n91#4:1062\n78#4,11:1096\n91#4:1130\n456#5,8:554\n464#5,3:568\n456#5,8:592\n464#5,3:606\n50#5:612\n49#5:613\n456#5,8:637\n464#5,3:651\n467#5,3:655\n50#5:662\n49#5:663\n456#5,8:687\n464#5,3:701\n467#5,3:705\n467#5,3:710\n467#5,3:715\n456#5,8:737\n464#5,3:751\n456#5,8:773\n464#5,3:787\n456#5,8:810\n464#5,3:824\n467#5,3:829\n467#5,3:834\n467#5,3:839\n456#5,8:861\n464#5,3:875\n467#5,3:881\n456#5,8:905\n464#5,3:919\n467#5,3:938\n456#5,8:960\n464#5,3:974\n467#5,3:978\n25#5:1006\n36#5:1015\n456#5,8:1039\n464#5,3:1053\n467#5,3:1059\n25#5:1064\n25#5:1083\n456#5,8:1107\n464#5,3:1121\n467#5,3:1127\n4144#6,6:562\n4144#6,6:600\n4144#6,6:645\n4144#6,6:695\n4144#6,6:745\n4144#6,6:781\n4144#6,6:818\n4144#6,6:869\n4144#6,6:913\n4144#6,6:968\n4144#6,6:1047\n4144#6,6:1115\n73#7,6:575\n79#7:609\n83#7:714\n73#7,6:720\n79#7:754\n73#7,6:793\n79#7:827\n83#7:833\n83#7:843\n73#7,6:888\n79#7:922\n83#7:942\n1097#8,6:614\n1097#8,6:664\n1097#8,6:1007\n1097#8,6:1016\n1097#8,6:1065\n1097#8,6:1084\n72#9,6:756\n78#9:790\n82#9:838\n81#10,11:983\n81#10,11:994\n81#10,11:1071\n76#11:1005\n76#11:1082\n81#12:1132\n107#12,2:1133\n*S KotlinDebug\n*F\n+ 1 MomentReply.kt\ncom/yalla/yalla/ui/screen/moment/media/MomentReply\n*L\n88#1:536\n95#1:572\n96#1:573\n99#1:574\n103#1:610\n106#1:611\n124#1:660\n127#1:661\n194#1:755\n209#1:791\n239#1:792\n252#1:828\n280#1:879\n281#1:880\n294#1:886\n295#1:887\n305#1:923\n309#1:924\n312#1:925\n319#1:926\n326#1:927\n330#1:928\n336#1:929\n337#1:930\n342#1:931\n343#1:932\n347#1:933\n352#1:934\n353#1:935\n356#1:936\n361#1:937\n372#1:943\n420#1:1013\n421#1:1014\n463#1:1057\n473#1:1058\n494#1:1090\n525#1:1125\n530#1:1126\n85#1:537,6\n85#1:571\n101#1:620,6\n101#1:654\n101#1:659\n122#1:670,6\n122#1:704\n122#1:709\n85#1:719\n264#1:844,6\n264#1:878\n264#1:885\n368#1:944,5\n368#1:977\n368#1:982\n417#1:1022,6\n417#1:1056\n417#1:1063\n490#1:1091,5\n490#1:1124\n490#1:1131\n85#1:543,11\n91#1:581,11\n101#1:626,11\n101#1:658\n122#1:676,11\n122#1:708\n91#1:713\n85#1:718\n159#1:726,11\n190#1:762,11\n236#1:799,11\n236#1:832\n190#1:837\n159#1:842\n264#1:850,11\n264#1:884\n290#1:894,11\n290#1:941\n368#1:949,11\n368#1:981\n417#1:1028,11\n417#1:1062\n490#1:1096,11\n490#1:1130\n85#1:554,8\n85#1:568,3\n91#1:592,8\n91#1:606,3\n107#1:612\n107#1:613\n101#1:637,8\n101#1:651,3\n101#1:655,3\n128#1:662\n128#1:663\n122#1:687,8\n122#1:701,3\n122#1:705,3\n91#1:710,3\n85#1:715,3\n159#1:737,8\n159#1:751,3\n190#1:773,8\n190#1:787,3\n236#1:810,8\n236#1:824,3\n236#1:829,3\n190#1:834,3\n159#1:839,3\n264#1:861,8\n264#1:875,3\n264#1:881,3\n290#1:905,8\n290#1:919,3\n290#1:938,3\n368#1:960,8\n368#1:974,3\n368#1:978,3\n415#1:1006\n423#1:1015\n417#1:1039,8\n417#1:1053,3\n417#1:1059,3\n484#1:1064\n488#1:1083\n490#1:1107,8\n490#1:1121,3\n490#1:1127,3\n85#1:562,6\n91#1:600,6\n101#1:645,6\n122#1:695,6\n159#1:745,6\n190#1:781,6\n236#1:818,6\n264#1:869,6\n290#1:913,6\n368#1:968,6\n417#1:1047,6\n490#1:1115,6\n91#1:575,6\n91#1:609\n91#1:714\n159#1:720,6\n159#1:754\n236#1:793,6\n236#1:827\n236#1:833\n159#1:843\n290#1:888,6\n290#1:922\n290#1:942\n107#1:614,6\n128#1:664,6\n415#1:1007,6\n423#1:1016,6\n484#1:1065,6\n488#1:1084,6\n190#1:756,6\n190#1:790\n190#1:838\n412#1:983,11\n413#1:994,11\n485#1:1071,11\n414#1:1005\n486#1:1082\n415#1:1132\n415#1:1133,2\n*E\n"})
public final class oO0OO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final oO0OO00o f53953OooO00o = new oO0OO00o();

    public static final class OooO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentReplyModel f53954OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(MomentReplyModel momentReplyModel) {
            super(0);
            this.f53954OooO0Oo = momentReplyModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Context context = o000O0.f10354OooO00o;
            Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
            if (activityOooO0O0 != null) {
                oOo000Oo onLogin = new oOo000Oo(activityOooO0O0, this.f53954OooO0Oo);
                Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                o000000O o000000o2 = o000000O.f46674OooO00o;
                if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
                    onLogin.invoke();
                } else {
                    Activity activityOooO0O1 = com.code.android.util.OooO0O0.OooO0O0();
                    if (activityOooO0O1 != null) {
                        int i = LoginActivity.f25186OooOo0O;
                        LoginActivity.OooO00o.OooO00o(activityOooO0O1);
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ Modifier f53955OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ float f53957OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f53958OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ String f53959OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f53960OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ int f53961OooOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(int i, float f, String str, int i2, Modifier modifier, int i3) {
            super(2);
            this.f53958OooO0o0 = i;
            this.f53957OooO0o = f;
            this.f53959OooO0oO = str;
            this.f53960OooO0oo = i2;
            this.f53955OooO = modifier;
            this.f53961OooOO0 = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            oO0OO00o.this.OooO0O0(this.f53958OooO0o0, this.f53957OooO0o, this.f53959OooO0oO, this.f53960OooO0oo, this.f53955OooO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f53961OooOO0 | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1<MomentReplyModel, Unit> f53962OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentReplyModel f53963OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(Function1<? super MomentReplyModel, Unit> function1, MomentReplyModel momentReplyModel) {
            super(0);
            this.f53962OooO0Oo = function1;
            this.f53963OooO0o0 = momentReplyModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Function1<MomentReplyModel, Unit> function1 = this.f53962OooO0Oo;
            if (function1 != null) {
                function1.invoke(this.f53963OooO0o0);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1<MomentReplyModel, Unit> f53964OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentReplyModel f53965OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0OO(Function1<? super MomentReplyModel, Unit> function1, MomentReplyModel momentReplyModel) {
            super(0);
            this.f53964OooO0Oo = function1;
            this.f53965OooO0o0 = momentReplyModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Function1<MomentReplyModel, Unit> function1 = this.f53964OooO0Oo;
            if (function1 != null) {
                function1.invoke(this.f53965OooO0o0);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1<MomentReplyModel, Unit> f53966OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentReplyModel f53967OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0o(Function1<? super MomentReplyModel, Unit> function1, MomentReplyModel momentReplyModel) {
            super(0);
            this.f53966OooO0Oo = function1;
            this.f53967OooO0o0 = momentReplyModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Function1<MomentReplyModel, Unit> function1 = this.f53966OooO0Oo;
            if (function1 != null) {
                function1.invoke(this.f53967OooO0o0);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1<MomentReplyModel, Unit> f53968OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentReplyModel f53969OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOO0(Function1<? super MomentReplyModel, Unit> function1, MomentReplyModel momentReplyModel) {
            super(1);
            this.f53968OooO0Oo = function1;
            this.f53969OooO0o0 = momentReplyModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String it = str;
            Intrinsics.checkNotNullParameter(it, "it");
            Function1<MomentReplyModel, Unit> function1 = this.f53968OooO0Oo;
            if (function1 != null) {
                function1.invoke(this.f53969OooO0o0);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1<MomentReplyModel, Unit> f53970OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentReplyModel f53971OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOO0O(Function1<? super MomentReplyModel, Unit> function1, MomentReplyModel momentReplyModel) {
            super(0);
            this.f53970OooO0Oo = function1;
            this.f53971OooO0o0 = momentReplyModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Function1<MomentReplyModel, Unit> function1 = this.f53970OooO0Oo;
            if (function1 != null) {
                function1.invoke(this.f53971OooO0o0);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentReplyModel f53973OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f53974OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f53975OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f53976OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(int i, MomentReplyModel momentReplyModel, MomentDetailModel momentDetailModel, int i2) {
            super(2);
            this.f53974OooO0o0 = i;
            this.f53973OooO0o = momentReplyModel;
            this.f53975OooO0oO = momentDetailModel;
            this.f53976OooO0oo = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            oO0OO00o.this.OooO0Oo(this.f53974OooO0o0, this.f53973OooO0o, this.f53975OooO0oO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f53976OooO0oo | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ MomentReplyModel f53977OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f53979OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f53980OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ float f53981OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ boolean f53982OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ MomentCommentDetailModel f53983OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f53984OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ Function1<MomentReplyModel, Unit> f53985OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final /* synthetic */ int f53986OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final /* synthetic */ Function1<MomentReplyModel, Unit> f53987OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public final /* synthetic */ int f53988OooOOOO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOOO0(boolean z, int i, float f, boolean z2, MomentReplyModel momentReplyModel, MomentCommentDetailModel momentCommentDetailModel, MomentDetailModel momentDetailModel, Function1<? super MomentReplyModel, Unit> function1, Function1<? super MomentReplyModel, Unit> function2, int i2, int i3) {
            super(2);
            this.f53980OooO0o0 = z;
            this.f53979OooO0o = i;
            this.f53981OooO0oO = f;
            this.f53982OooO0oo = z2;
            this.f53977OooO = momentReplyModel;
            this.f53983OooOO0 = momentCommentDetailModel;
            this.f53984OooOO0O = momentDetailModel;
            this.f53985OooOO0o = function1;
            this.f53987OooOOO0 = function2;
            this.f53986OooOOO = i2;
            this.f53988OooOOOO = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            oO0OO00o.this.OooO0OO(this.f53980OooO0o0, this.f53979OooO0o, this.f53981OooO0oO, this.f53982OooO0oo, this.f53977OooO, this.f53983OooOO0, this.f53984OooOO0O, this.f53985OooOO0o, this.f53987OooOOO0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f53986OooOOO | 1), this.f53988OooOOOO);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentReplyModel f53990OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f53991OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ long f53992OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f53993OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(int i, MomentReplyModel momentReplyModel, long j, int i2) {
            super(2);
            this.f53991OooO0o0 = i;
            this.f53990OooO0o = momentReplyModel;
            this.f53992OooO0oO = j;
            this.f53993OooO0oo = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            oO0OO00o.this.OooO0o0(this.f53991OooO0o0, this.f53990OooO0o, this.f53992OooO0oO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f53993OooO0oo | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f53994OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentReplyModel f53996OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ BoxScope f53997OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f53998OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Modifier f53999OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ int f54000OooOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(BoxScope boxScope, MomentReplyModel momentReplyModel, MomentDetailModel momentDetailModel, Modifier modifier, int i, int i2) {
            super(2);
            this.f53997OooO0o0 = boxScope;
            this.f53996OooO0o = momentReplyModel;
            this.f53998OooO0oO = momentDetailModel;
            this.f53999OooO0oo = modifier;
            this.f53994OooO = i;
            this.f54000OooOO0 = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            oO0OO00o.this.OooO0o(this.f53997OooO0o0, this.f53996OooO0o, this.f53998OooO0oO, this.f53999OooO0oo, composer, RecomposeScopeImplKt.updateChangedFlags(this.f53994OooO | 1), this.f54000OooOO0);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f54001OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f54002OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f54003OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentReplyModel f54004OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MomentCommentsVM f54005OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f54006OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(MutableState<Boolean> mutableState, MomentReplyModel momentReplyModel, MomentDetailModel momentDetailModel, MomentCommentsVM momentCommentsVM, LifecycleOwner lifecycleOwner, MutableState<Boolean> mutableState2) {
            super(0);
            this.f54002OooO0Oo = mutableState;
            this.f54004OooO0o0 = momentReplyModel;
            this.f54003OooO0o = momentDetailModel;
            this.f54005OooO0oO = momentCommentsVM;
            this.f54006OooO0oo = lifecycleOwner;
            this.f54001OooO = mutableState2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            if (!this.f54002OooO0Oo.getValue().booleanValue()) {
                oOo0000O onLogin = new oOo0000O(this.f54002OooO0Oo, this.f54004OooO0o0, this.f54003OooO0o, this.f54005OooO0oO, this.f54006OooO0oo, this.f54001OooO);
                Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                o000000O o000000o2 = o000000O.f46674OooO00o;
                if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
                    onLogin.invoke();
                } else {
                    Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                    if (activityOooO0O0 != null) {
                        int i = LoginActivity.f25186OooOo0O;
                        LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentReplyModel f54007OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<LayoutCoordinates> f54008OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentVideoVM f54009OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f54010OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo0(MutableState mutableState, LifecycleOwner lifecycleOwner, MomentReplyModel momentReplyModel, MomentVideoVM momentVideoVM) {
            super(0);
            this.f54007OooO0Oo = momentReplyModel;
            this.f54009OooO0o0 = momentVideoVM;
            this.f54008OooO0o = mutableState;
            this.f54010OooO0oO = lifecycleOwner;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o000000O o000000o2 = o000000O.f46674OooO00o;
            Long l = (Long) o000000O.OooOOo0().getValue();
            MomentReplyModel momentReplyModel = this.f54007OooO0Oo;
            long userid = momentReplyModel.getUserid();
            if (l != null && l.longValue() == userid) {
                o000O00O.OooO0O0(o0000.OooO0OO(oO00OOo0.send_reward_self));
            } else if (!momentReplyModel.getLocalSendRewardIsIn().getValue().booleanValue() && !momentReplyModel.getLocalShowRewardAnim().getValue().booleanValue()) {
                MomentVideoVM momentVideoVM = this.f54009OooO0o0;
                if (!momentVideoVM.getSendRewardDialog().getValue().booleanValue()) {
                    boolean zOooOO0o = o00Oo0.OooO().OooOO0o();
                    MutableState<LayoutCoordinates> mutableState = this.f54008OooO0o;
                    if (zOooOO0o) {
                        oOo000o0 onLogin = new oOo000o0(mutableState, this.f54010OooO0oO, momentReplyModel, momentVideoVM);
                        Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                        if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
                            onLogin.invoke();
                        } else {
                            Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                            if (activityOooO0O0 != null) {
                                int i = LoginActivity.f25186OooOo0O;
                                LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                            }
                        }
                    } else {
                        momentVideoVM.setSendRewardDialogReply(momentReplyModel);
                        momentVideoVM.setSendRewardDialogReplyLayoutCoordinates(mutableState.getValue());
                        momentVideoVM.getSendRewardDialog().setValue(Boolean.TRUE);
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 extends Lambda implements Function1<LayoutCoordinates, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<LayoutCoordinates> f54011OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo000(MutableState<LayoutCoordinates> mutableState) {
            super(1);
            this.f54011OooO0Oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(LayoutCoordinates layoutCoordinates) {
            LayoutCoordinates it = layoutCoordinates;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f54011OooO0Oo.setValue(it);
            return Unit.INSTANCE;
        }
    }

    public static final class o000oOoO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f54012OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentReplyModel f54014OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ BoxScope f54015OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Modifier f54016OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f54017OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000oOoO(BoxScope boxScope, MomentReplyModel momentReplyModel, Modifier modifier, int i, int i2) {
            super(2);
            this.f54015OooO0o0 = boxScope;
            this.f54014OooO0o = momentReplyModel;
            this.f54016OooO0oO = modifier;
            this.f54017OooO0oo = i;
            this.f54012OooO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            oO0OO00o.this.OooO0oO(this.f54015OooO0o0, this.f54014OooO0o, this.f54016OooO0oO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f54017OooO0oo | 1), this.f54012OooO);
            return Unit.INSTANCE;
        }
    }

    public static final class o0OoOo0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ long f54018OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f54020OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ BoxScope f54021OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ long f54022OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ long f54023OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ Modifier f54024OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ int f54025OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ int f54026OooOO0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OoOo0(BoxScope boxScope, long j, long j2, long j3, long j4, Modifier modifier, int i, int i2) {
            super(2);
            this.f54021OooO0o0 = boxScope;
            this.f54020OooO0o = j;
            this.f54022OooO0oO = j2;
            this.f54023OooO0oo = j3;
            this.f54018OooO = j4;
            this.f54024OooOO0 = modifier;
            this.f54025OooOO0O = i;
            this.f54026OooOO0o = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            oO0OO00o.this.OooO0oo(this.f54021OooO0o0, this.f54020OooO0o, this.f54022OooO0oO, this.f54023OooO0oo, this.f54018OooO, this.f54024OooOO0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f54025OooOO0O | 1), this.f54026OooOO0o);
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(int i, int i2, @Nullable Composer composer, @NotNull Function1 listener) {
        int i3;
        long j;
        long j2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(listener, "listener");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1141475636);
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(listener) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1141475636, i3, -1, "com.yalla.yalla.ui.screen.moment.media.MomentReply.ItemTitle (MomentReply.kt:83)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM509height3ABfNKs = SizeKt.m509height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3765constructorimpl(44));
            long j3 = o0oO0O0o.f46946OooO0O0;
            Modifier modifierM169backgroundbw27NRU$default = BackgroundKt.m169backgroundbw27NRU$default(modifierM509height3ABfNKs, j3, null, 2, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO00o = p018OooOoo0.OooOOO.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            Modifier modifierM476padding3ABfNKs = PaddingKt.m476padding3ABfNKs(BackgroundKt.m169backgroundbw27NRU$default(ClipKt.clip(SizeKt.m509height3ABfNKs(PaddingKt.m478paddingVpY3zN4$default(boxScopeInstance.align(companion, companion2.getCenterEnd()), Dp.m3765constructorimpl(16), 0.0f, 2, null), Dp.m3765constructorimpl(30)), RoundedCornerShapeKt.RoundedCornerShape(50)), o0oO0O0o.f47078o000o0O, null, 2, null), Dp.m3765constructorimpl(3));
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO00o2 = androidx.compose.material.OooO.OooO00o(Arrangement.INSTANCE, centerVertically, composerStartRestartGroup, 48, -1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM476padding3ABfNKs);
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
            float f = 24;
            float f2 = 8;
            Modifier modifierM478paddingVpY3zN4$default = PaddingKt.m478paddingVpY3zN4$default(BackgroundKt.m169backgroundbw27NRU$default(ClipKt.clip(SizeKt.m509height3ABfNKs(companion, Dp.m3765constructorimpl(f)), RoundedCornerShapeKt.RoundedCornerShape(50)), i == 1 ? j3 : o0oO0O0o.f46945OooO00o, null, 2, null), Dp.m3765constructorimpl(f2), 0.0f, 2, null);
            Integer numValueOf = Integer.valueOf(i);
            composerStartRestartGroup.startReplaceableGroup(511388516);
            boolean zChanged = composerStartRestartGroup.changed(numValueOf) | composerStartRestartGroup.changed(listener);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new oO00o0(i, listener);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierOooO0O0 = o0O0O00.OooO0O0(modifierM478paddingVpY3zN4$default, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyOooO00o3 = p018OooOoo0.OooOOO.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierOooO0O0);
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
            Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl3, measurePolicyOooO00o3, composerM1309constructorimpl3, currentCompositionLocalMap3);
            if (composerM1309constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1309constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            String strStringResource = StringResources_androidKt.stringResource(oO00OOo0.Popular, composerStartRestartGroup, 0);
            long sp = TextUnitKt.getSp(14);
            TextAlign.Companion companion4 = TextAlign.INSTANCE;
            int iM3671getCentere0LSkKk = companion4.m3671getCentere0LSkKk();
            if (i == 1) {
                composerStartRestartGroup.startReplaceableGroup(-544770603);
                j = o000OOo.OooO0OO(composerStartRestartGroup).f37701OooO;
            } else {
                composerStartRestartGroup.startReplaceableGroup(-544770588);
                j = o000OOo.OooO0OO(composerStartRestartGroup).f37711OooOO0O;
            }
            composerStartRestartGroup.endReplaceableGroup();
            TextKt.m1251Text4IGK_g(strStringResource, boxScopeInstance.align(companion, companion2.getCenter()), j, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(iM3671getCentere0LSkKk), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 130544);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierClip = ClipKt.clip(SizeKt.m509height3ABfNKs(companion, Dp.m3765constructorimpl(f)), RoundedCornerShapeKt.RoundedCornerShape(50));
            if (i != 0) {
                j3 = o0oO0O0o.f46945OooO00o;
            }
            Modifier modifierM478paddingVpY3zN4$default2 = PaddingKt.m478paddingVpY3zN4$default(BackgroundKt.m169backgroundbw27NRU$default(modifierClip, j3, null, 2, null), Dp.m3765constructorimpl(f2), 0.0f, 2, null);
            Integer numValueOf2 = Integer.valueOf(i);
            composerStartRestartGroup.startReplaceableGroup(511388516);
            boolean zChanged2 = composerStartRestartGroup.changed(numValueOf2) | composerStartRestartGroup.changed(listener);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new oOo00o0o(i, listener);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierOooO0O1 = o0O0O00.OooO0O0(modifierM478paddingVpY3zN4$default2, false, false, 0L, false, null, null, null, (Function0) objRememberedValue2, 253);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyOooO00o4 = p018OooOoo0.OooOOO.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierOooO0O1);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor4);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1309constructorimpl4 = Updater.m1309constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o4 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl4, measurePolicyOooO00o4, composerM1309constructorimpl4, currentCompositionLocalMap4);
            if (composerM1309constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash4, composerM1309constructorimpl4, currentCompositeKeyHash4, function2OooO00o4);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf4, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            String strStringResource2 = StringResources_androidKt.stringResource(oO00OOo0.Latest, composerStartRestartGroup, 0);
            long sp2 = TextUnitKt.getSp(14);
            int iM3676getStarte0LSkKk = companion4.m3676getStarte0LSkKk();
            if (i == 0) {
                composerStartRestartGroup.startReplaceableGroup(-544769577);
                j2 = o000OOo.OooO0OO(composerStartRestartGroup).f37701OooO;
            } else {
                composerStartRestartGroup.startReplaceableGroup(-544769562);
                j2 = o000OOo.OooO0OO(composerStartRestartGroup).f37711OooOO0O;
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierAlign = boxScopeInstance.align(companion, companion2.getCenter());
            composer2 = composerStartRestartGroup;
            TextKt.m1251Text4IGK_g(strStringResource2, modifierAlign, j2, sp2, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(iM3676getStarte0LSkKk), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 130544);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new oOo00ooO(this, i, listener, i2));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0O0(int i, float f, String str, int i2, Modifier modifier, Composer composer, int i3) {
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(1226634735);
        if ((i3 & 112) == 0) {
            i4 = (composerStartRestartGroup.changed(f) ? 32 : 16) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 896) == 0) {
            i4 |= composerStartRestartGroup.changed(str) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i3 & 7168) == 0) {
            i4 |= composerStartRestartGroup.changed(i2) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((57344 & i3) == 0) {
            i4 |= composerStartRestartGroup.changed(modifier) ? 16384 : 8192;
        }
        if ((i4 & 46801) == 9360 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1226634735, i3, -1, "com.yalla.yalla.ui.screen.moment.media.MomentReply.ItemViewHead (MomentReply.kt:262)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM523size3ABfNKs = SizeKt.m523size3ABfNKs(companion.then(modifier), f);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO00o = p018OooOoo0.OooOOO.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM523size3ABfNKs);
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
            p517o0o0O0o.OooOOOO oooOOOO = p517o0o0O0o.OooOOOO.f51970OooO00o;
            oooOOOO.OooOO0O(p139o00OOooO.OooO0o.OooO0oo(60, 60, str), SizeKt.m523size3ABfNKs(boxScopeInstance.align(companion, companion2.getCenter()), f), 0.0f, null, false, composerStartRestartGroup, 262144, 28);
            oooOOOO.OooOOo0(ConstantsKt.MINIMUM_BLOCK_SIZE, 0, composerStartRestartGroup, boxScopeInstance.align(OffsetKt.m436offsetVpY3zN4(SizeKt.m525sizeVpY3zN4(companion, Dp.m3765constructorimpl(22), Dp.m3765constructorimpl(14)), Dp.m3765constructorimpl(6), Dp.m3765constructorimpl(-2)), companion2.getTopEnd()), UserInfo.Role.INSTANCE.isOfficial(i2));
            if (androidx.compose.material.OooOO0.OooO0O0(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(i, f, str, i2, modifier, i3));
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0203  */
    /* JADX WARN: Code duplicated, block: B:50:0x0209  */
    /* JADX WARN: Code duplicated, block: B:51:0x020b  */
    /* JADX WARN: Code duplicated, block: B:53:0x020e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0214  */
    /* JADX WARN: Code duplicated, block: B:56:0x0216  */
    /* JADX WARN: Code duplicated, block: B:58:0x0219  */
    /* JADX WARN: Code duplicated, block: B:59:0x022f  */
    /* JADX WARN: Code duplicated, block: B:62:0x024a  */
    /* JADX WARN: Code duplicated, block: B:64:0x028b  */
    /* JADX WARN: Code duplicated, block: B:65:0x028e  */
    /* JADX WARN: Code duplicated, block: B:67:0x030e  */
    /* JADX WARN: Code duplicated, block: B:74:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:77:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:78:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:83:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:87:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:91:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0OO(boolean z, int i, float f, boolean z2, @NotNull MomentReplyModel item, @NotNull MomentCommentDetailModel comment, @NotNull MomentDetailModel momentDetail, @Nullable Function1<? super MomentReplyModel, Unit> function1, @Nullable Function1<? super MomentReplyModel, Unit> function2, @Nullable Composer composer, int i2, int i3) {
        Modifier.Companion companion;
        Modifier.Companion companion2;
        MomentSendContentAtModel momentSendContentAtModel;
        int i4;
        Function1<? super MomentReplyModel, Unit> function3;
        Function1<? super MomentReplyModel, Unit> function4;
        int i5;
        int i6;
        Function1<? super MomentReplyModel, Unit> function5;
        Function1<? super MomentReplyModel, Unit> function6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Composer composerM1309constructorimpl;
        Function2 function2OooO00o;
        TextDirection textDirectionM3677boximpl;
        boolean z3;
        boolean z4;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(comment, "comment");
        Intrinsics.checkNotNullParameter(momentDetail, "momentDetail");
        Composer composerStartRestartGroup = composer.startRestartGroup(1556536678);
        Function1<? super MomentReplyModel, Unit> function7 = (i3 & 128) != 0 ? null : function1;
        Function1<? super MomentReplyModel, Unit> function8 = (i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? null : function2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1556536678, i2, -1, "com.yalla.yalla.ui.screen.moment.media.MomentReply.ItemViewSon (MomentReply.kt:147)");
        }
        Alignment.Companion companion3 = Alignment.INSTANCE;
        Alignment.Vertical top = companion3.getTop();
        Modifier.Companion companion4 = Modifier.INSTANCE;
        Modifier modifierOooO0O0 = o0O0O00.OooO0O0(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), (z && item.isHide()) ? false : true, false, 0L, false, null, null, new OooO0O0(function7, item), new OooO0OO(function8, item), 188);
        composerStartRestartGroup.startReplaceableGroup(693286680);
        Arrangement arrangement = Arrangement.INSTANCE;
        MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO.OooO00o(arrangement, top, composerStartRestartGroup, 48, -1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierOooO0O0);
        Function1<? super MomentReplyModel, Unit> function9 = function8;
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
        Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion5, composerM1309constructorimpl2, measurePolicyOooO00o, composerM1309constructorimpl2, currentCompositionLocalMap);
        if (composerM1309constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        oO0OO00o oo0oo00o = f53953OooO00o;
        Function1<? super MomentReplyModel, Unit> function10 = function7;
        int i7 = i2 >> 3;
        int i8 = i7 & 14;
        oo0oo00o.OooO0O0(i, f, String.valueOf(item.getHeadurl()), item.getRole(), o0O0O00.OooO0O0(companion4, !item.isHide(), false, 0L, false, null, null, new OooO0o(function7, item), new OooO(item), 188), composerStartRestartGroup, 196608 | i8 | (i7 & 112));
        float f2 = 8;
        Modifier modifierM480paddingqDBjuR0$default = PaddingKt.m480paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(rowScopeInstance.weight(companion4, 1.0f, true), 0.0f, 1, null), Dp.m3765constructorimpl(f2), 0.0f, 0.0f, Dp.m3765constructorimpl(4), 6, null);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyOooO00o2 = androidx.compose.material.OooO0o.OooO00o(companion3, arrangement.getTop(), composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM480paddingqDBjuR0$default);
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
        Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion5, composerM1309constructorimpl3, measurePolicyOooO00o2, composerM1309constructorimpl3, currentCompositionLocalMap2);
        if (!composerM1309constructorimpl3.getInserting()) {
            companion = companion4;
            if (!Intrinsics.areEqual(composerM1309constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            companion2 = companion;
            oo0oo00o.OooO0o0(i, item, momentDetail.getUserId(), composerStartRestartGroup, i8 | 3136);
            if (z) {
                if (item.getParentUserId() != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    if (item.getParentUserName() != null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        String parentUserId = item.getParentUserId();
                        Intrinsics.checkNotNull(parentUserId);
                        String parentUserName = item.getParentUserName();
                        Intrinsics.checkNotNull(parentUserName);
                        momentSendContentAtModel = new MomentSendContentAtModel(parentUserId, parentUserName);
                    } else {
                        momentSendContentAtModel = null;
                    }
                } else {
                    momentSendContentAtModel = null;
                }
            } else {
                momentSendContentAtModel = null;
            }
            p592o0oo00O.OooOOO.f56809OooO00o.OooO00o("WRM ItemViewSon = ".concat(p140o00OOooo.OooOO0.OooO00o(item)), composerStartRestartGroup, 48);
            if (item.isHide()) {
                i4 = 1;
                function3 = function9;
                function4 = function10;
                composerStartRestartGroup.startReplaceableGroup(518678468);
                TextKt.m1251Text4IGK_g(StringResources_androidKt.stringResource(oO00OOo0.comment_is_hidden, composerStartRestartGroup, 0), (Modifier) null, o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o, TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 131058);
                composerStartRestartGroup.endReplaceableGroup();
                i5 = 0;
            } else {
                composerStartRestartGroup.startReplaceableGroup(518677314);
                Modifier modifierM480paddingqDBjuR0$default2 = PaddingKt.m480paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.0f, 0.0f, Dp.m3765constructorimpl(f2), 0.0f, 11, null);
                String content = item.getContent().getContent();
                List<MomentSendContentAtModel> at = item.getContent().getAt();
                PlatformTextStyle platformTextStyle = new PlatformTextStyle(true);
                long sp = TextUnitKt.getSp(14);
                long j = o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0;
                if (p591o0oo000O.OooO.OooO0o0()) {
                    textDirectionM3677boximpl = null;
                } else {
                    textDirectionM3677boximpl = TextDirection.m3677boximpl(TextDirection.INSTANCE.m3684getContents_7Xco());
                }
                TextStyle textStyle = new TextStyle(j, sp, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, textDirectionM3677boximpl, 0L, (TextIndent) null, platformTextStyle, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16187388, (DefaultConstructorMarker) null);
                function4 = function10;
                function3 = function9;
                p515o0o0O0O0.OooO0OO.OooO00o(modifierM480paddingqDBjuR0$default2, content, false, at, momentSendContentAtModel, null, textStyle, false, 0, Integer.MAX_VALUE, null, null, new OooOO0(function4, item), new OooOO0O(function3, item), composerStartRestartGroup, 805540230, 6, 2432);
                composerStartRestartGroup.endReplaceableGroup();
                i5 = 0;
                i4 = 1;
            }
            int i9 = i8 | 3648;
            i6 = i4;
            function5 = function3;
            function6 = function4;
            oo0oo00o.OooO0Oo(i, item, momentDetail, composerStartRestartGroup, i9);
            composerStartRestartGroup.startReplaceableGroup(1611209859);
            if (z2 && comment.getNum() > 1) {
                Modifier modifierM480paddingqDBjuR0$default3 = PaddingKt.m480paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, i6, null), 0.0f, 0.0f, Dp.m3765constructorimpl(f2), Dp.m3765constructorimpl(f2), 3, null);
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyOooO00o3 = androidx.compose.material.OooOOO.OooO00o(companion3, arrangement.getStart(), composerStartRestartGroup, i5, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, i5);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor = r21.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM480paddingqDBjuR0$default3);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion5, composerM1309constructorimpl, measurePolicyOooO00o3, composerM1309constructorimpl, currentCompositionLocalMap3);
                if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(i5, function3ModifierMaterializerOf3, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                TextKt.m1251Text4IGK_g(o000OO00.OooO00o(o0000.OooO0OO(oO00OOo0.xxx_replies), String.valueOf(comment.getNum())), rowScopeInstance.align(companion2, companion3.getCenterVertically()), o0oO0O0o.f46981Oooo0OO, o0000O0.OooO0OO(14, composerStartRestartGroup, 6), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 131056);
                ImageKt.Image(PainterResources_androidKt.painterResource(oOo00OO0.icon_xinxi_gengduo, composerStartRestartGroup, i5), (String) null, SizeKt.m523size3ABfNKs(rowScopeInstance.align(companion2, companion3.getCenterVertically()), Dp.m3765constructorimpl(16)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                p426o0OoOO.o000oOoO.OooO00o(composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO0(z, i, f, z2, item, comment, momentDetail, function6, function5, i2, i3));
        }
        companion = companion4;
        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1309constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
        companion2 = companion;
        oo0oo00o.OooO0o0(i, item, momentDetail.getUserId(), composerStartRestartGroup, i8 | 3136);
        if (z) {
            momentSendContentAtModel = null;
        } else {
            if (item.getParentUserId() != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                momentSendContentAtModel = null;
            } else {
                if (item.getParentUserName() != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    String parentUserId2 = item.getParentUserId();
                    Intrinsics.checkNotNull(parentUserId2);
                    String parentUserName2 = item.getParentUserName();
                    Intrinsics.checkNotNull(parentUserName2);
                    momentSendContentAtModel = new MomentSendContentAtModel(parentUserId2, parentUserName2);
                } else {
                    momentSendContentAtModel = null;
                }
            }
        }
        p592o0oo00O.OooOOO.f56809OooO00o.OooO00o("WRM ItemViewSon = ".concat(p140o00OOooo.OooOO0.OooO00o(item)), composerStartRestartGroup, 48);
        if (item.isHide()) {
            composerStartRestartGroup.startReplaceableGroup(518677314);
            Modifier modifierM480paddingqDBjuR0$default4 = PaddingKt.m480paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.0f, 0.0f, Dp.m3765constructorimpl(f2), 0.0f, 11, null);
            String content2 = item.getContent().getContent();
            List<MomentSendContentAtModel> at2 = item.getContent().getAt();
            PlatformTextStyle platformTextStyle2 = new PlatformTextStyle(true);
            long sp2 = TextUnitKt.getSp(14);
            long j2 = o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0;
            if (p591o0oo000O.OooO.OooO0o0()) {
                textDirectionM3677boximpl = null;
            } else {
                textDirectionM3677boximpl = TextDirection.m3677boximpl(TextDirection.INSTANCE.m3684getContents_7Xco());
            }
            TextStyle textStyle2 = new TextStyle(j2, sp2, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, textDirectionM3677boximpl, 0L, (TextIndent) null, platformTextStyle2, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16187388, (DefaultConstructorMarker) null);
            function4 = function10;
            function3 = function9;
            p515o0o0O0O0.OooO0OO.OooO00o(modifierM480paddingqDBjuR0$default4, content2, false, at2, momentSendContentAtModel, null, textStyle2, false, 0, Integer.MAX_VALUE, null, null, new OooOO0(function4, item), new OooOO0O(function3, item), composerStartRestartGroup, 805540230, 6, 2432);
            composerStartRestartGroup.endReplaceableGroup();
            i5 = 0;
            i4 = 1;
        } else {
            i4 = 1;
            function3 = function9;
            function4 = function10;
            composerStartRestartGroup.startReplaceableGroup(518678468);
            TextKt.m1251Text4IGK_g(StringResources_androidKt.stringResource(oO00OOo0.comment_is_hidden, composerStartRestartGroup, 0), (Modifier) null, o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o, TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 131058);
            composerStartRestartGroup.endReplaceableGroup();
            i5 = 0;
        }
        int i10 = i8 | 3648;
        i6 = i4;
        function5 = function3;
        function6 = function4;
        oo0oo00o.OooO0Oo(i, item, momentDetail, composerStartRestartGroup, i10);
        composerStartRestartGroup.startReplaceableGroup(1611209859);
        if (z2) {
            Modifier modifierM480paddingqDBjuR0$default5 = PaddingKt.m480paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, i6, null), 0.0f, 0.0f, Dp.m3765constructorimpl(f2), Dp.m3765constructorimpl(f2), 3, null);
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO00o4 = androidx.compose.material.OooOOO.OooO00o(companion3, arrangement.getStart(), composerStartRestartGroup, i5, -1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, i5);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            constructor = r21.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierM480paddingqDBjuR0$default5);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
            function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion5, composerM1309constructorimpl, measurePolicyOooO00o4, composerM1309constructorimpl, currentCompositionLocalMap4);
            if (composerM1309constructorimpl.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            } else {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(i5, function3ModifierMaterializerOf4, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            TextKt.m1251Text4IGK_g(o000OO00.OooO00o(o0000.OooO0OO(oO00OOo0.xxx_replies), String.valueOf(comment.getNum())), rowScopeInstance.align(companion2, companion3.getCenterVertically()), o0oO0O0o.f46981Oooo0OO, o0000O0.OooO0OO(14, composerStartRestartGroup, 6), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 131056);
            ImageKt.Image(PainterResources_androidKt.painterResource(oOo00OO0.icon_xinxi_gengduo, composerStartRestartGroup, i5), (String) null, SizeKt.m523size3ABfNKs(rowScopeInstance.align(companion2, companion3.getCenterVertically()), Dp.m3765constructorimpl(16)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
            p426o0OoOO.o000oOoO.OooO00o(composerStartRestartGroup);
        }
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO0(z, i, f, z2, item, comment, momentDetail, function6, function5, i2, i3));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0Oo(int i, MomentReplyModel momentReplyModel, MomentDetailModel momentDetailModel, Composer composer, int i2) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1373002285);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1373002285, i2, -1, "com.yalla.yalla.ui.screen.moment.media.MomentReply.ItemViewTimeRewardPraise (MomentReply.kt:366)");
        }
        Alignment center = Alignment.INSTANCE.getCenter();
        Modifier modifierOooO00o = p153o00OoO0.OooOO0.OooO00o(32, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), composerStartRestartGroup, 733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierOooO00o);
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
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM1309constructorimpl, currentCompositionLocalMap);
        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        oO0OO00o oo0oo00o = f53953OooO00o;
        oo0oo00o.OooO0oo(boxScopeInstance, momentReplyModel.getId(), momentReplyModel.getCreateTime(), 0L, 0L, null, composerStartRestartGroup, 1572870, 28);
        oo0oo00o.OooO0oO(boxScopeInstance, momentReplyModel, null, composerStartRestartGroup, 3142, 2);
        oo0oo00o.OooO0o(boxScopeInstance, momentReplyModel, momentDetailModel, null, composerStartRestartGroup, 25158, 4);
        if (androidx.compose.material.OooOO0.OooO0O0(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO(i, momentReplyModel, momentDetailModel, i2));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0o(BoxScope boxScope, MomentReplyModel momentReplyModel, MomentDetailModel momentDetailModel, Modifier modifier, Composer composer, int i, int i2) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-2119273335);
        Modifier modifier2 = (i2 & 4) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2119273335, i, -1, "com.yalla.yalla.ui.screen.moment.media.MomentReply.PraiseView (MomentReply.kt:478)");
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
        composerStartRestartGroup.startReplaceableGroup(1729797275);
        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
        if (current == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        ViewModel viewModel = ViewModelKt.viewModel(MomentCommentsVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
        composerStartRestartGroup.endReplaceableGroup();
        MomentCommentsVM momentCommentsVM = (MomentCommentsVM) viewModel;
        LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState<Boolean> mutableState2 = (MutableState) objRememberedValue2;
        Alignment.Companion companion2 = Alignment.INSTANCE;
        Alignment centerStart = companion2.getCenterStart();
        Modifier.Companion companion3 = Modifier.INSTANCE;
        Modifier modifierOooO0O0 = o0O0O00.OooO0O0(boxScope.align(SizeKt.m528width3ABfNKs(companion3.then(modifier2), Dp.m3765constructorimpl(59)), companion2.getCenterEnd()), !momentReplyModel.isHide(), false, 0L, false, null, null, null, new OooOo00(mutableState, momentReplyModel, momentDetailModel, momentCommentsVM, lifecycleOwner, mutableState2), 252);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(centerStart, false, composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion4, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM1309constructorimpl, currentCompositionLocalMap);
        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        String strOooO0o = p590o0oo0.OooOOOO.OooO0o(momentReplyModel.getPraiseNum(), true);
        long jOooO0OO = o0000O0.OooO0OO(12, composerStartRestartGroup, 6);
        long j = (!momentReplyModel.isPraise() || momentReplyModel.getPraiseNum() <= 0) ? o0oO0O0o.f46981Oooo0OO : o0oO0O0o.f46976Oooo0;
        TextStyle textStyle = new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null);
        Modifier modifierAlign = boxScopeInstance.align(SizeKt.fillMaxWidth$default(PaddingKt.m480paddingqDBjuR0$default(companion3, Dp.m3765constructorimpl(18), 0.0f, 0.0f, 0.0f, 14, null), 0.0f, 1, null), companion2.getCenterStart());
        Intrinsics.checkNotNullExpressionValue(strOooO0o, "formatNumberToKMUnit(item.praiseNum, true)");
        Modifier modifier3 = modifier2;
        TextKt.m1251Text4IGK_g(strOooO0o, modifierAlign, j, jOooO0OO, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle, composerStartRestartGroup, 0, 3072, 57328);
        oO00o00O.f53897OooO00o.OooO00o(momentReplyModel.isPraise(), mutableState2, Dp.m3765constructorimpl(16), Dp.m3765constructorimpl(36), composerStartRestartGroup, 28080, 0);
        if (androidx.compose.material.OooOO0.OooO0O0(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOo(boxScope, momentReplyModel, momentDetailModel, modifier3, i, i2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0o0(int i, MomentReplyModel momentReplyModel, long j, Composer composer, int i2) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1070691830);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1070691830, i2, -1, "com.yalla.yalla.ui.screen.moment.media.MomentReply.ItemViewUser (MomentReply.kt:288)");
        }
        Alignment.Vertical top = Alignment.INSTANCE.getTop();
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierM480paddingqDBjuR0$default = PaddingKt.m480paddingqDBjuR0$default(SizeKt.m509height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3765constructorimpl(33)), 0.0f, 0.0f, Dp.m3765constructorimpl(8), 0.0f, 11, null);
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO.OooO00o(Arrangement.INSTANCE, top, composerStartRestartGroup, 48, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM480paddingqDBjuR0$default);
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
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        p517o0o0O0o.OooOOOO oooOOOO = p517o0o0O0o.OooOOOO.f51970OooO00o;
        long userid = momentReplyModel.getUserid();
        String nickname = momentReplyModel.getNickname();
        if (nickname == null) {
            nickname = "";
        }
        oooOOOO.OooOOOo(oOO0O0O.OooO0O0(userid, nickname), o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0, false, TextUnitKt.getSp(16), 0, 0, null, false, rowScopeInstance.weight(companion, 1.0f, false), composerStartRestartGroup, 1073744896, 244);
        float f = 2;
        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f), null, composerStartRestartGroup, 6, 2);
        float f2 = 16;
        oooOOOO.OooO0oO(Integer.valueOf(momentReplyModel.getSex()), SizeKt.m509height3ABfNKs(companion, Dp.m3765constructorimpl(f2)), composerStartRestartGroup, 560, 0);
        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f), null, composerStartRestartGroup, 6, 2);
        long userid2 = momentReplyModel.getUserid();
        o000000O o000000o2 = o000000O.f46674OooO00o;
        Long l = (Long) o000000O.OooOOo0().getValue();
        if (l != null && userid2 == l.longValue() && Intrinsics.areEqual(o000000O.OooOo().getValue(), Boolean.TRUE)) {
            composerStartRestartGroup.startReplaceableGroup(-2016675792);
            oooOOOO.OooOo(com.code.android.util.o0OoOo0.OooO0o0(0, (Integer) o000000O.OooO0oO().getValue()), com.code.android.util.o0OoOo0.OooOOO((String) o000000O.OooO0o0().getValue(), ""), SizeKt.m509height3ABfNKs(companion, Dp.m3765constructorimpl(19)), o0000O0.OooO0OO(10, composerStartRestartGroup, 6), composerStartRestartGroup, 33152, 0);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(-2016675479);
            oooOOOO.OooOo(momentReplyModel.getWealthLevel(), momentReplyModel.getWealthBadgeImage(), SizeKt.m509height3ABfNKs(companion, Dp.m3765constructorimpl(19)), o0000O0.OooO0OO(10, composerStartRestartGroup, 6), composerStartRestartGroup, 33152, 0);
            composerStartRestartGroup.endReplaceableGroup();
        }
        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f), null, composerStartRestartGroup, 6, 2);
        long userid3 = momentReplyModel.getUserid();
        Long l2 = (Long) o000000O.OooOOo0().getValue();
        if (l2 != null && userid3 == l2.longValue()) {
            composerStartRestartGroup.startReplaceableGroup(-2016675116);
            Pair pair = (Pair) o000000O.OooOO0().getValue();
            int iIntValue = pair != null ? ((Number) pair.getSecond()).intValue() : VipLevel.Vip0.getValue();
            Pair pair2 = (Pair) o000000O.OooOO0().getValue();
            p517o0o0O0o.OooOOOO.OooOo0(Integer.valueOf(pair2 != null ? ((Number) pair2.getFirst()).intValue() : VipState.Vip.getValue()), Integer.valueOf(iIntValue), null, Dp.m3765constructorimpl(f2), SizeKt.m509height3ABfNKs(companion, Dp.m3765constructorimpl(19)), composerStartRestartGroup, 289792, 4);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(-2016674760);
            p517o0o0O0o.OooOOOO.OooOo0(null, Integer.valueOf(momentReplyModel.getKaVIPLv()), null, Dp.m3765constructorimpl(f2), SizeKt.m509height3ABfNKs(companion, Dp.m3765constructorimpl(19)), composerStartRestartGroup, 289792, 5);
            composerStartRestartGroup.endReplaceableGroup();
        }
        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f), null, composerStartRestartGroup, 6, 2);
        float f3 = 19;
        p517o0o0O0o.OooOOOO.OooOOo(Boolean.valueOf(p417o0OoO0.o0000.OooO0OO(Integer.valueOf(momentReplyModel.getVip()))), Integer.valueOf(momentReplyModel.getVipLevel()), false, Dp.m3765constructorimpl(f3), SizeKt.m509height3ABfNKs(companion, Dp.m3765constructorimpl(f3)), composerStartRestartGroup, 289792, 4);
        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f), null, composerStartRestartGroup, 6, 2);
        oooOOOO.OooO0Oo(j == momentReplyModel.getUserid(), StringResources_androidKt.stringResource(oO00OOo0.Author, composerStartRestartGroup, 0), 0L, 0L, 0.0f, 0L, 0.0f, null, composerStartRestartGroup, 134217728, 252);
        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f2), null, composerStartRestartGroup, 6, 2);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOOO(i, momentReplyModel, j, i2));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0oO(BoxScope boxScope, MomentReplyModel momentReplyModel, Modifier modifier, Composer composer, int i, int i2) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1042953496);
        Modifier modifier2 = (i2 & 2) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1042953496, i, -1, "com.yalla.yalla.ui.screen.moment.media.MomentReply.RewardView (MomentReply.kt:406)");
        }
        composerStartRestartGroup.startReplaceableGroup(1729797275);
        LocalViewModelStoreOwner localViewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE;
        ViewModelStoreOwner current = localViewModelStoreOwner.getCurrent(composerStartRestartGroup, 6);
        if (current == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        ViewModel viewModel = ViewModelKt.viewModel(MomentVideoVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
        composerStartRestartGroup.endReplaceableGroup();
        MomentVideoVM momentVideoVM = (MomentVideoVM) viewModel;
        composerStartRestartGroup.startReplaceableGroup(1729797275);
        ViewModelStoreOwner current2 = localViewModelStoreOwner.getCurrent(composerStartRestartGroup, 6);
        if (current2 == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        ViewModel viewModel2 = ViewModelKt.viewModel(MomentReplyVM.class, current2, null, null, current2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
        composerStartRestartGroup.endReplaceableGroup();
        LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue;
        Modifier.Companion companion2 = Modifier.INSTANCE;
        Modifier modifierM528width3ABfNKs = SizeKt.m528width3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion2.then(modifier2), 0.0f, 0.0f, Dp.m3765constructorimpl(59), 0.0f, 11, null), Dp.m3765constructorimpl(68));
        Alignment.Companion companion3 = Alignment.INSTANCE;
        Modifier modifierAlign = boxScope.align(modifierM528width3ABfNKs, companion3.getCenterEnd());
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged = composerStartRestartGroup.changed(mutableState);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Oooo000(mutableState);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierOooO0O0 = o0O0O00.OooO0O0(OnGloballyPositionedModifierKt.onGloballyPositioned(modifierAlign, (Function1) objRememberedValue2), !momentReplyModel.isHide(), false, 0L, false, null, null, null, new Oooo0(mutableState, lifecycleOwner, momentReplyModel, momentVideoVM), 252);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyOooO00o = p018OooOoo0.OooOOO.OooO00o(companion3, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion4, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        String strOooO0o = p590o0oo0.OooOOOO.OooO0o(momentReplyModel.getPropNum(), true);
        long jOooO0OO = o0000O0.OooO0OO(12, composerStartRestartGroup, 6);
        long j = (!momentReplyModel.isSendProp() || momentReplyModel.getPropNum() <= 0) ? o0oO0O0o.f46981Oooo0OO : o0oO0O0o.f46976Oooo0;
        TextStyle textStyle = new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null);
        Modifier modifierAlign2 = boxScopeInstance.align(SizeKt.fillMaxWidth$default(PaddingKt.m480paddingqDBjuR0$default(companion2, Dp.m3765constructorimpl(20), 0.0f, 0.0f, 0.0f, 14, null), 0.0f, 1, null), companion3.getCenterStart());
        Intrinsics.checkNotNullExpressionValue(strOooO0o, "formatNumberToKMUnit(item.propNum, true)");
        Modifier modifier3 = modifier2;
        TextKt.m1251Text4IGK_g(strOooO0o, modifierAlign2, j, jOooO0OO, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle, composerStartRestartGroup, 0, 3072, 57328);
        oO0oO000.f54066OooO00o.OooO00o(momentReplyModel.isSendProp(), momentReplyModel.getLocalShowRewardAnim(), null, 0.0f, 0.0f, OffsetKt.m437offsetVpY3zN4$default(boxScopeInstance.align(companion2, companion3.getBottomStart()), 0.0f, Dp.m3765constructorimpl(-9), 1, null), composerStartRestartGroup, 1572864, 28);
        if (androidx.compose.material.OooOO0.OooO0O0(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o000oOoO(boxScope, momentReplyModel, modifier3, i, i2));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0169  */
    /* JADX WARN: Code duplicated, block: B:106:0x0174  */
    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x005f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0063  */
    /* JADX WARN: Code duplicated, block: B:40:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0074  */
    /* JADX WARN: Code duplicated, block: B:47:0x007c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0080  */
    /* JADX WARN: Code duplicated, block: B:51:0x0088  */
    /* JADX WARN: Code duplicated, block: B:52:0x008b  */
    /* JADX WARN: Code duplicated, block: B:55:0x0091  */
    /* JADX WARN: Code duplicated, block: B:58:0x0097  */
    /* JADX WARN: Code duplicated, block: B:59:0x009b  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:92:0x0101 A[PHI: r5 r8 r10
      0x0101: PHI (r5v26 int) = (r5v19 int), (r5v27 int), (r5v28 int) binds: [B:90:0x00fc, B:82:0x00e2, B:83:0x00e4] A[DONT_GENERATE, DONT_INLINE]
      0x0101: PHI (r8v10 long) = (r8v7 long), (r8v6 long), (r8v6 long) binds: [B:90:0x00fc, B:82:0x00e2, B:83:0x00e4] A[DONT_GENERATE, DONT_INLINE]
      0x0101: PHI (r10v8 long) = (r10v4 long), (r10v3 long), (r10v3 long) binds: [B:90:0x00fc, B:82:0x00e2, B:83:0x00e4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:95:0x010b  */
    /* JADX WARN: Code duplicated, block: B:98:0x0120  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0oo(BoxScope boxScope, long j, long j2, long j3, long j4, Modifier modifier, Composer composer, int i, int i2) {
        int i3;
        long j5;
        long jOooO0OO;
        int i4;
        Modifier modifier2;
        int i5;
        Modifier modifier3;
        String strOooO0OO;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-6485301);
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 1) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i2 & 2) == 0) {
            if ((i & 896) == 0) {
                i3 |= composerStartRestartGroup.changed(j2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
            }
            if ((i & 7168) == 0) {
                if ((i2 & 4) == 0) {
                    j5 = j3;
                    if (composerStartRestartGroup.changed(j5)) {
                        i6 = 2048;
                    }
                    i3 |= i6;
                } else {
                    j5 = j3;
                }
                i6 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                i3 |= i6;
            } else {
                j5 = j3;
            }
            if ((57344 & i) == 0) {
                if ((i2 & 8) == 0) {
                    jOooO0OO = j4;
                    int i7 = composerStartRestartGroup.changed(jOooO0OO) ? 16384 : 8192;
                    i3 |= i7;
                } else {
                    jOooO0OO = j4;
                }
                i3 |= i7;
            } else {
                jOooO0OO = j4;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((458752 & i) == 0) {
                    modifier2 = modifier;
                    if (composerStartRestartGroup.changed(modifier2)) {
                        i5 = 131072;
                    } else {
                        i5 = 65536;
                    }
                    i3 |= i5;
                }
                if ((374491 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if ((i2 & 4) != 0) {
                            j5 = o0oO0O0o.f46983Oooo0o0;
                            i3 &= -7169;
                        }
                        if ((i2 & 8) != 0) {
                            jOooO0OO = o0000O0.OooO0OO(12, composerStartRestartGroup, 6);
                            i3 &= -57345;
                        }
                        if (i4 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-6485301, i3, -1, "com.yalla.yalla.ui.screen.moment.media.MomentReply.TimeView (MomentReply.kt:384)");
                        }
                        strOooO0OO = o0000.OooO0OO(oO00OOo0.post_comment_sending);
                        if (j >= 1) {
                            strOooO0OO = o0000oo.OooO0Oo(j2, System.currentTimeMillis());
                        }
                        int i8 = i3 >> 3;
                        TextKt.m1251Text4IGK_g(strOooO0OO, boxScope.align(Modifier.INSTANCE.then(modifier3), Alignment.INSTANCE.getCenterStart()), j5, jOooO0OO, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i8 & 896) | (i8 & 7168), 0, 131056);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier3;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -57345;
                        }
                    }
                    modifier3 = modifier2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-6485301, i3, -1, "com.yalla.yalla.ui.screen.moment.media.MomentReply.TimeView (MomentReply.kt:384)");
                    }
                    strOooO0OO = o0000.OooO0OO(oO00OOo0.post_comment_sending);
                    if (j >= 1) {
                        strOooO0OO = o0000oo.OooO0Oo(j2, System.currentTimeMillis());
                    }
                    int i9 = i3 >> 3;
                    TextKt.m1251Text4IGK_g(strOooO0OO, boxScope.align(Modifier.INSTANCE.then(modifier3), Alignment.INSTANCE.getCenterStart()), j5, jOooO0OO, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i9 & 896) | (i9 & 7168), 0, 131056);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new o0OoOo0(boxScope, j, j2, j5, jOooO0OO, modifier2, i, i2));
            }
            i3 |= 196608;
            modifier2 = modifier;
            if ((374491 & i3) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if ((i2 & 4) != 0) {
                        j5 = o0oO0O0o.f46983Oooo0o0;
                        i3 &= -7169;
                    }
                    if ((i2 & 8) != 0) {
                        jOooO0OO = o0000O0.OooO0OO(12, composerStartRestartGroup, 6);
                        i3 &= -57345;
                    }
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                } else {
                    if ((i2 & 4) != 0) {
                        j5 = o0oO0O0o.f46983Oooo0o0;
                        i3 &= -7169;
                    }
                    if ((i2 & 8) != 0) {
                        jOooO0OO = o0000O0.OooO0OO(12, composerStartRestartGroup, 6);
                        i3 &= -57345;
                    }
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-6485301, i3, -1, "com.yalla.yalla.ui.screen.moment.media.MomentReply.TimeView (MomentReply.kt:384)");
                }
                strOooO0OO = o0000.OooO0OO(oO00OOo0.post_comment_sending);
                if (j >= 1) {
                    strOooO0OO = o0000oo.OooO0Oo(j2, System.currentTimeMillis());
                }
                int i10 = i3 >> 3;
                TextKt.m1251Text4IGK_g(strOooO0OO, boxScope.align(Modifier.INSTANCE.then(modifier3), Alignment.INSTANCE.getCenterStart()), j5, jOooO0OO, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i10 & 896) | (i10 & 7168), 0, 131056);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if ((i2 & 4) != 0) {
                        j5 = o0oO0O0o.f46983Oooo0o0;
                        i3 &= -7169;
                    }
                    if ((i2 & 8) != 0) {
                        jOooO0OO = o0000O0.OooO0OO(12, composerStartRestartGroup, 6);
                        i3 &= -57345;
                    }
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                } else {
                    if ((i2 & 4) != 0) {
                        j5 = o0oO0O0o.f46983Oooo0o0;
                        i3 &= -7169;
                    }
                    if ((i2 & 8) != 0) {
                        jOooO0OO = o0000O0.OooO0OO(12, composerStartRestartGroup, 6);
                        i3 &= -57345;
                    }
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-6485301, i3, -1, "com.yalla.yalla.ui.screen.moment.media.MomentReply.TimeView (MomentReply.kt:384)");
                }
                strOooO0OO = o0000.OooO0OO(oO00OOo0.post_comment_sending);
                if (j >= 1) {
                    strOooO0OO = o0000oo.OooO0Oo(j2, System.currentTimeMillis());
                }
                int i11 = i3 >> 3;
                TextKt.m1251Text4IGK_g(strOooO0OO, boxScope.align(Modifier.INSTANCE.then(modifier3), Alignment.INSTANCE.getCenterStart()), j5, jOooO0OO, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i11 & 896) | (i11 & 7168), 0, 131056);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new o0OoOo0(boxScope, j, j2, j5, jOooO0OO, modifier2, i, i2));
        }
        i3 |= 384;
        if ((i & 7168) == 0) {
            if ((i2 & 4) == 0) {
                j5 = j3;
                if (composerStartRestartGroup.changed(j5)) {
                    i6 = 2048;
                }
                i3 |= i6;
            } else {
                j5 = j3;
            }
            i6 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            i3 |= i6;
        } else {
            j5 = j3;
        }
        if ((57344 & i) == 0) {
            if ((i2 & 8) == 0) {
                jOooO0OO = j4;
                if (composerStartRestartGroup.changed(jOooO0OO)) {
                }
                i3 |= i7;
            } else {
                jOooO0OO = j4;
            }
            i3 |= i7;
        } else {
            jOooO0OO = j4;
        }
        i4 = i2 & 16;
        if (i4 != 0) {
            if ((458752 & i) == 0) {
                modifier2 = modifier;
                if (composerStartRestartGroup.changed(modifier2)) {
                    i5 = 131072;
                } else {
                    i5 = 65536;
                }
                i3 |= i5;
            }
            if ((374491 & i3) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if ((i2 & 4) != 0) {
                        j5 = o0oO0O0o.f46983Oooo0o0;
                        i3 &= -7169;
                    }
                    if ((i2 & 8) != 0) {
                        jOooO0OO = o0000O0.OooO0OO(12, composerStartRestartGroup, 6);
                        i3 &= -57345;
                    }
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                } else {
                    if ((i2 & 4) != 0) {
                        j5 = o0oO0O0o.f46983Oooo0o0;
                        i3 &= -7169;
                    }
                    if ((i2 & 8) != 0) {
                        jOooO0OO = o0000O0.OooO0OO(12, composerStartRestartGroup, 6);
                        i3 &= -57345;
                    }
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-6485301, i3, -1, "com.yalla.yalla.ui.screen.moment.media.MomentReply.TimeView (MomentReply.kt:384)");
                }
                strOooO0OO = o0000.OooO0OO(oO00OOo0.post_comment_sending);
                if (j >= 1) {
                    strOooO0OO = o0000oo.OooO0Oo(j2, System.currentTimeMillis());
                }
                int i12 = i3 >> 3;
                TextKt.m1251Text4IGK_g(strOooO0OO, boxScope.align(Modifier.INSTANCE.then(modifier3), Alignment.INSTANCE.getCenterStart()), j5, jOooO0OO, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i12 & 896) | (i12 & 7168), 0, 131056);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if ((i2 & 4) != 0) {
                        j5 = o0oO0O0o.f46983Oooo0o0;
                        i3 &= -7169;
                    }
                    if ((i2 & 8) != 0) {
                        jOooO0OO = o0000O0.OooO0OO(12, composerStartRestartGroup, 6);
                        i3 &= -57345;
                    }
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                } else {
                    if ((i2 & 4) != 0) {
                        j5 = o0oO0O0o.f46983Oooo0o0;
                        i3 &= -7169;
                    }
                    if ((i2 & 8) != 0) {
                        jOooO0OO = o0000O0.OooO0OO(12, composerStartRestartGroup, 6);
                        i3 &= -57345;
                    }
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-6485301, i3, -1, "com.yalla.yalla.ui.screen.moment.media.MomentReply.TimeView (MomentReply.kt:384)");
                }
                strOooO0OO = o0000.OooO0OO(oO00OOo0.post_comment_sending);
                if (j >= 1) {
                    strOooO0OO = o0000oo.OooO0Oo(j2, System.currentTimeMillis());
                }
                int i13 = i3 >> 3;
                TextKt.m1251Text4IGK_g(strOooO0OO, boxScope.align(Modifier.INSTANCE.then(modifier3), Alignment.INSTANCE.getCenterStart()), j5, jOooO0OO, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i13 & 896) | (i13 & 7168), 0, 131056);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new o0OoOo0(boxScope, j, j2, j5, jOooO0OO, modifier2, i, i2));
        }
        i3 |= 196608;
        modifier2 = modifier;
        if ((374491 & i3) == 74898) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if ((i2 & 4) != 0) {
                    j5 = o0oO0O0o.f46983Oooo0o0;
                    i3 &= -7169;
                }
                if ((i2 & 8) != 0) {
                    jOooO0OO = o0000O0.OooO0OO(12, composerStartRestartGroup, 6);
                    i3 &= -57345;
                }
                if (i4 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
            } else {
                if ((i2 & 4) != 0) {
                    j5 = o0oO0O0o.f46983Oooo0o0;
                    i3 &= -7169;
                }
                if ((i2 & 8) != 0) {
                    jOooO0OO = o0000O0.OooO0OO(12, composerStartRestartGroup, 6);
                    i3 &= -57345;
                }
                if (i4 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-6485301, i3, -1, "com.yalla.yalla.ui.screen.moment.media.MomentReply.TimeView (MomentReply.kt:384)");
            }
            strOooO0OO = o0000.OooO0OO(oO00OOo0.post_comment_sending);
            if (j >= 1) {
                strOooO0OO = o0000oo.OooO0Oo(j2, System.currentTimeMillis());
            }
            int i14 = i3 >> 3;
            TextKt.m1251Text4IGK_g(strOooO0OO, boxScope.align(Modifier.INSTANCE.then(modifier3), Alignment.INSTANCE.getCenterStart()), j5, jOooO0OO, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i14 & 896) | (i14 & 7168), 0, 131056);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if ((i2 & 4) != 0) {
                    j5 = o0oO0O0o.f46983Oooo0o0;
                    i3 &= -7169;
                }
                if ((i2 & 8) != 0) {
                    jOooO0OO = o0000O0.OooO0OO(12, composerStartRestartGroup, 6);
                    i3 &= -57345;
                }
                if (i4 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
            } else {
                if ((i2 & 4) != 0) {
                    j5 = o0oO0O0o.f46983Oooo0o0;
                    i3 &= -7169;
                }
                if ((i2 & 8) != 0) {
                    jOooO0OO = o0000O0.OooO0OO(12, composerStartRestartGroup, 6);
                    i3 &= -57345;
                }
                if (i4 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-6485301, i3, -1, "com.yalla.yalla.ui.screen.moment.media.MomentReply.TimeView (MomentReply.kt:384)");
            }
            strOooO0OO = o0000.OooO0OO(oO00OOo0.post_comment_sending);
            if (j >= 1) {
                strOooO0OO = o0000oo.OooO0Oo(j2, System.currentTimeMillis());
            }
            int i15 = i3 >> 3;
            TextKt.m1251Text4IGK_g(strOooO0OO, boxScope.align(Modifier.INSTANCE.then(modifier3), Alignment.INSTANCE.getCenterStart()), j5, jOooO0OO, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i15 & 896) | (i15 & 7168), 0, 131056);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o0OoOo0(boxScope, j, j2, j5, jOooO0OO, modifier2, i, i2));
    }
}
