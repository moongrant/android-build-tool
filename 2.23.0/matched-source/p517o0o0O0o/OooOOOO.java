package p517o0o0O0o;

import android.content.Context;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
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
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.TileMode;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
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
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.lifecycle.LifecycleOwner;
import com.code.android.util.o0000;
import com.qiniu.android.storage.Configuration;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.model.PremiumLevel;
import com.yalla.yalla.model.VipLevel;
import com.yalla.yalla.model.VipState;
import com.yalla.yalla.ui.view.UserMedalView;
import com.yallatech.support.platform.share.bean.ShareRequest;
import com.zego.zegoliveroom.constants.ZegoConstants;
import java.util.List;
import kotlin.Deprecated;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import org.jctools.util.Pow2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoo.o0000O0;
import p405o0Oo0OoO.oOO000o;
import p469o0OoooOO.o0oO0O0o;
import p584o0oOooO0.oO00OOO;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nUserComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserComp.kt\ncom/yalla/yalla/ui/composable/user/UserComp\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 10 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,850:1\n73#2,6:851\n79#2:885\n83#2:891\n73#2,6:892\n79#2:926\n83#2:941\n73#2,6:942\n79#2:976\n83#2:991\n78#3,11:857\n91#3:890\n78#3,11:898\n91#3:940\n78#3,11:948\n91#3:990\n78#3,11:1018\n91#3:1065\n78#3,11:1105\n91#3:1137\n456#4,8:868\n464#4,3:882\n467#4,3:887\n456#4,8:909\n464#4,3:923\n25#4:927\n467#4,3:937\n456#4,8:959\n464#4,3:973\n25#4:977\n467#4,3:987\n36#4:996\n36#4:1005\n456#4,8:1029\n464#4,3:1043\n25#4:1047\n36#4:1054\n467#4,3:1062\n36#4:1071\n36#4:1087\n456#4,8:1116\n464#4,3:1130\n467#4,3:1134\n4144#5,6:876\n4144#5,6:917\n4144#5,6:967\n4144#5,6:1037\n4144#5,6:1124\n154#6:886\n154#6:934\n154#6:935\n154#6:936\n154#6:984\n154#6:985\n154#6:986\n154#6:992\n154#6:993\n154#6:994\n154#6:995\n154#6:1003\n154#6:1004\n154#6:1012\n154#6:1067\n154#6:1068\n154#6:1069\n154#6:1070\n154#6:1078\n154#6:1079\n154#6:1080\n154#6:1081\n154#6:1082\n154#6:1083\n154#6:1084\n154#6:1085\n154#6:1094\n154#6:1095\n154#6:1096\n154#6:1097\n154#6:1098\n1097#7,6:928\n1097#7,6:978\n1097#7,6:997\n1097#7,6:1006\n1097#7,6:1048\n1097#7,6:1055\n1097#7,6:1072\n1097#7,6:1088\n67#8,5:1013\n72#8:1046\n76#8:1066\n66#8,6:1099\n72#8:1133\n76#8:1138\n88#9:1061\n76#10:1086\n81#11:1139\n107#11,2:1140\n81#11:1142\n107#11,2:1143\n81#11:1145\n81#11:1146\n107#11,2:1147\n*S KotlinDebug\n*F\n+ 1 UserComp.kt\ncom/yalla/yalla/ui/composable/user/UserComp\n*L\n68#1:851,6\n68#1:885\n68#1:891\n78#1:892,6\n78#1:926\n78#1:941\n107#1:942,6\n107#1:976\n107#1:991\n68#1:857,11\n68#1:890\n78#1:898,11\n78#1:940\n107#1:948,11\n107#1:990\n348#1:1018,11\n348#1:1065\n820#1:1105,11\n820#1:1137\n68#1:868,8\n68#1:882,3\n68#1:887,3\n78#1:909,8\n78#1:923,3\n79#1:927\n78#1:937,3\n107#1:959,8\n107#1:973,3\n108#1:977\n107#1:987,3\n295#1:996\n331#1:1005\n348#1:1029,8\n348#1:1043,3\n353#1:1047\n361#1:1054\n348#1:1062,3\n490#1:1071\n765#1:1087\n820#1:1116,8\n820#1:1130,3\n820#1:1134,3\n68#1:876,6\n78#1:917,6\n107#1:967,6\n348#1:1037,6\n820#1:1124,6\n70#1:886\n87#1:934\n93#1:935\n98#1:936\n116#1:984\n120#1:985\n124#1:986\n242#1:992\n254#1:993\n274#1:994\n286#1:995\n311#1:1003\n323#1:1004\n344#1:1012\n439#1:1067\n450#1:1068\n462#1:1069\n482#1:1070\n496#1:1078\n521#1:1079\n541#1:1080\n585#1:1081\n608#1:1082\n719#1:1083\n720#1:1084\n759#1:1085\n791#1:1094\n797#1:1095\n803#1:1096\n814#1:1097\n816#1:1098\n79#1:928,6\n108#1:978,6\n295#1:997,6\n331#1:1006,6\n353#1:1048,6\n361#1:1055,6\n490#1:1072,6\n765#1:1088,6\n348#1:1013,5\n348#1:1046\n348#1:1066\n820#1:1099,6\n820#1:1133\n820#1:1138\n368#1:1061\n763#1:1086\n79#1:1139\n79#1:1140,2\n108#1:1142\n108#1:1143,2\n174#1:1145\n353#1:1146\n353#1:1147,2\n*E\n"})
public final class OooOOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooOOOO f51970OooO00o = new OooOOOO();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final List<Color> f51971OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final int f51972OooO0OO;

    public static final class OooO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Modifier f51974OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ UserInfo f51975OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f51976OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f51977OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(UserInfo userInfo, Modifier modifier, int i, int i2) {
            super(2);
            this.f51975OooO0o0 = userInfo;
            this.f51974OooO0o = modifier;
            this.f51976OooO0oO = i;
            this.f51977OooO0oo = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            OooOOOO.this.OooO0O0(this.f51975OooO0o0, this.f51974OooO0o, composer, RecomposeScopeImplKt.updateChangedFlags(this.f51976OooO0oO | 1), this.f51977OooO0oo);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function1<Context, NetImageView> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f51978OooO0Oo = new OooO00o();

        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final NetImageView invoke(Context context) {
            Context context2 = context;
            Intrinsics.checkNotNullParameter(context2, "context");
            return new NetImageView(context2);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<NetImageView, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ String f51979OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(String str) {
            super(1);
            this.f51979OooO0Oo = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(NetImageView netImageView) {
            NetImageView it = netImageView;
            Intrinsics.checkNotNullParameter(it, "it");
            o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(it.getContext());
            oooO00o.OooO00o(p543o0oO0O00.OooO.OooO0O0());
            oooO00o.f43911OooO0OO = p139o00OOooO.OooO0o.OooO0Oo(this.f51979OooO0Oo);
            oooO00o.f43909OooO00o = 0;
            oooO00o.OooO0Oo(it);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ boolean f51980OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Modifier f51982OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f51983OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ float f51984OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Color f51985OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ int f51986OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ int f51987OooOO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(String str, Modifier modifier, float f, Color color, boolean z, int i, int i2) {
            super(2);
            this.f51983OooO0o0 = str;
            this.f51982OooO0o = modifier;
            this.f51984OooO0oO = f;
            this.f51985OooO0oo = color;
            this.f51980OooO = z;
            this.f51986OooOO0 = i;
            this.f51987OooOO0O = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            OooOOOO.this.OooO00o(this.f51983OooO0o0, this.f51982OooO0o, this.f51984OooO0oO, this.f51985OooO0oo, this.f51980OooO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f51986OooOO0 | 1), this.f51987OooOO0O);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.composable.user.UserComp$OthersNameGenderPremiumVip$1$1", f = "UserComp.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ UserInfo f51988OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<String> f51989OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(UserInfo userInfo, MutableState<String> mutableState, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f51988OooO0Oo = userInfo;
            this.f51989OooO0o0 = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0o(this.f51988OooO0Oo, this.f51989OooO0o0, continuation);
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
            UserInfo userInfo = this.f51988OooO0Oo;
            String strOooO00o = oOO000o.OooO00o(userInfo.getUserName(), Boxing.boxLong(userInfo.getUserId()));
            OooOOOO oooOOOO = OooOOOO.f51970OooO00o;
            this.f51989OooO0o0.setValue(strOooO00o);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ float f51990OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f51992OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f51993OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ long f51994OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ long f51995OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ long f51996OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ float f51997OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ Modifier f51998OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final /* synthetic */ int f51999OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final /* synthetic */ int f52000OooOOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(boolean z, String str, long j, long j2, float f, long j3, float f2, Modifier modifier, int i, int i2) {
            super(2);
            this.f51993OooO0o0 = z;
            this.f51992OooO0o = str;
            this.f51994OooO0oO = j;
            this.f51995OooO0oo = j2;
            this.f51990OooO = f;
            this.f51996OooOO0 = j3;
            this.f51997OooOO0O = f2;
            this.f51998OooOO0o = modifier;
            this.f52000OooOOO0 = i;
            this.f51999OooOOO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            OooOOOO.this.OooO0Oo(this.f51993OooO0o0, this.f51992OooO0o, this.f51994OooO0oO, this.f51995OooO0oo, this.f51990OooO, this.f51996OooOO0, this.f51997OooOO0O, this.f51998OooOO0o, composer, RecomposeScopeImplKt.updateChangedFlags(this.f52000OooOOO0 | 1), this.f51999OooOOO);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f52001OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f52003OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f52004OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ long f52005OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f52006OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ Modifier f52007OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ int f52008OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ int f52009OooOO0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(String str, long j, long j2, int i, int i2, Modifier modifier, int i3, int i4) {
            super(2);
            this.f52004OooO0o0 = str;
            this.f52003OooO0o = j;
            this.f52005OooO0oO = j2;
            this.f52006OooO0oo = i;
            this.f52001OooO = i2;
            this.f52007OooOO0 = modifier;
            this.f52008OooOO0O = i3;
            this.f52009OooOO0o = i4;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            OooOOOO.this.OooO0o0(this.f52004OooO0o0, this.f52003OooO0o, this.f52005OooO0oO, this.f52006OooO0oo, this.f52001OooO, this.f52007OooOO0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f52008OooOO0O | 1), this.f52009OooOO0o);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Modifier f52011OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Integer f52012OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f52013OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f52014OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(Integer num, Modifier modifier, int i, int i2) {
            super(2);
            this.f52012OooO0o0 = num;
            this.f52011OooO0o = modifier;
            this.f52013OooO0oO = i;
            this.f52014OooO0oo = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            OooOOOO.this.OooO0o(this.f52012OooO0o0, this.f52011OooO0o, composer, RecomposeScopeImplKt.updateChangedFlags(this.f52013OooO0oO | 1), this.f52014OooO0oo);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Modifier f52016OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Integer f52017OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f52018OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f52019OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(Integer num, Modifier modifier, int i, int i2) {
            super(2);
            this.f52017OooO0o0 = num;
            this.f52016OooO0o = modifier;
            this.f52018OooO0oO = i;
            this.f52019OooO0oo = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            OooOOOO.this.OooO0o(this.f52017OooO0o0, this.f52016OooO0o, composer, RecomposeScopeImplKt.updateChangedFlags(this.f52018OooO0oO | 1), this.f52019OooO0oo);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o0o0O0o.OooOOOO$OooOOOO, reason: collision with other inner class name */
    public static final class C0499OooOOOO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Modifier f52021OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Integer f52022OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f52023OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f52024OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0499OooOOOO(Integer num, Modifier modifier, int i, int i2) {
            super(2);
            this.f52022OooO0o0 = num;
            this.f52021OooO0o = modifier;
            this.f52023OooO0oO = i;
            this.f52024OooO0oo = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            OooOOOO.this.OooO0oO(this.f52022OooO0o0, this.f52021OooO0o, composer, RecomposeScopeImplKt.updateChangedFlags(this.f52023OooO0oO | 1), this.f52024OooO0oo);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ Modifier f52025OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f52027OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f52028OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ float f52029OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Color f52030OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ int f52031OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ int f52032OooOO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(String str, String str2, float f, Color color, Modifier modifier, int i, int i2) {
            super(2);
            this.f52028OooO0o0 = str;
            this.f52027OooO0o = str2;
            this.f52029OooO0oO = f;
            this.f52030OooO0oo = color;
            this.f52025OooO = modifier;
            this.f52031OooOO0 = i;
            this.f52032OooOO0O = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            OooOOOO.this.OooO(this.f52028OooO0o0, this.f52027OooO0o, this.f52029OooO0oO, this.f52030OooO0oo, this.f52025OooO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f52031OooOO0 | 1), this.f52032OooOO0O);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function1<IntSize, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Integer> f52033OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(MutableState<Integer> mutableState) {
            super(1);
            this.f52033OooO0Oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(IntSize intSize) {
            this.f52033OooO0Oo.setValue(Integer.valueOf(IntSize.m3925getWidthimpl(intSize.getPackedValue())));
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo0 extends Lambda implements Function1<Context, NetImageView> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final Oooo0 f52034OooO0Oo = new Oooo0();

        public Oooo0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final NetImageView invoke(Context context) {
            Context context2 = context;
            Intrinsics.checkNotNullParameter(context2, "context");
            return new NetImageView(context2);
        }
    }

    public static final class Oooo000 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ boolean f52035OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Modifier f52037OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f52038OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ float f52039OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Color f52040OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ int f52041OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ int f52042OooOO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo000(String str, Modifier modifier, float f, Color color, boolean z, int i, int i2) {
            super(2);
            this.f52038OooO0o0 = str;
            this.f52037OooO0o = modifier;
            this.f52039OooO0oO = f;
            this.f52040OooO0oo = color;
            this.f52035OooO = z;
            this.f52041OooOO0 = i;
            this.f52042OooOO0O = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            OooOOOO.this.OooOO0(this.f52038OooO0o0, this.f52037OooO0o, this.f52039OooO0oO, this.f52040OooO0oo, this.f52035OooO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f52041OooOO0 | 1), this.f52042OooOO0O);
            return Unit.INSTANCE;
        }
    }

    public static final class o000000 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f52043OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f52045OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f52046OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Modifier f52047OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ long f52048OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ int f52049OooOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000000(int i, String str, Modifier modifier, long j, int i2, int i3) {
            super(2);
            this.f52046OooO0o0 = i;
            this.f52045OooO0o = str;
            this.f52047OooO0oO = modifier;
            this.f52048OooO0oo = j;
            this.f52043OooO = i2;
            this.f52049OooOO0 = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            OooOOOO.this.OooOo(this.f52046OooO0o0, this.f52045OooO0o, this.f52047OooO0oO, this.f52048OooO0oo, composer, RecomposeScopeImplKt.updateChangedFlags(this.f52043OooO | 1), this.f52049OooOO0);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class o000000O {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PremiumLevel.values().length];
            try {
                iArr[PremiumLevel.Premium1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PremiumLevel.Premium2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PremiumLevel.Premium3.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PremiumLevel.Premium4.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PremiumLevel.Premium5.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PremiumLevel.Premium6.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PremiumLevel.Premium7.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PremiumLevel.Premium0.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[VipLevel.values().length];
            try {
                iArr2[VipLevel.Vip1.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[VipLevel.Vip2.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[VipLevel.Vip3.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[VipLevel.Vip4.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[VipLevel.Vip5.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[VipLevel.Vip6.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @SourceDebugExtension({"SMAP\nUserComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserComp.kt\ncom/yalla/yalla/ui/composable/user/UserComp$UserWealthTagView$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,850:1\n88#2:851\n88#2:852\n88#2:853\n76#3:854\n*S KotlinDebug\n*F\n+ 1 UserComp.kt\ncom/yalla/yalla/ui/composable/user/UserComp$UserWealthTagView$1\n*L\n737#1:851\n738#1:852\n740#1:853\n742#1:854\n*E\n"})
    public static final class o000OOo extends Lambda implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ String f52050OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f52051OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f52052OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ long f52053OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000OOo(String str, int i, int i2, long j) {
            super(3);
            this.f52050OooO0Oo = str;
            this.f52052OooO0o0 = i;
            this.f52051OooO0o = i2;
            this.f52053OooO0oO = j;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
            int i;
            BoxWithConstraintsScope BoxWithConstraints = boxWithConstraintsScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
            if ((iIntValue & 14) == 0) {
                i = (composer2.changed(BoxWithConstraints) ? 4 : 2) | iIntValue;
            } else {
                i = iIntValue;
            }
            if ((i & 91) == 18 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-300934823, iIntValue, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserWealthTagView.<anonymous> (UserComp.kt:721)");
                }
                String str = this.f52050OooO0Oo;
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierOooO0Oo = com.code.android.util.o0O0O00.OooO0Oo(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), composer2, 6);
                int i2 = this.f52052OooO0o0;
                p154o00OoO00.OooOo00.OooO00o(str, true, 0, null, null, modifierOooO0Oo, composer2, ((i2 >> 3) & 14) | 48, 28);
                TextKt.m1251Text4IGK_g(String.valueOf(this.f52051OooO0o), BoxWithConstraints.align(SizeKt.m528width3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion, Dp.m3765constructorimpl(BoxWithConstraints.mo416getMaxWidthD9Ej5fM() * 0.48f), 0.0f, Dp.m3765constructorimpl(BoxWithConstraints.mo416getMaxWidthD9Ej5fM() * 0.13f), 0.0f, 10, null), Dp.m3765constructorimpl(BoxWithConstraints.mo416getMaxWidthD9Ej5fM() * 0.39f)), Alignment.INSTANCE.getCenter()), o0oO0O0o.f46946OooO0O0, this.f52053OooO0oO, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, ((TextStyle) composer2.consume(TextKt.getLocalTextStyle())).merge(new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null)), composer2, i2 & 7168, 0, 65008);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o000oOoO extends Lambda implements Function1<NetImageView, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ String f52054OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000oOoO(String str) {
            super(1);
            this.f52054OooO0Oo = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(NetImageView netImageView) {
            NetImageView it = netImageView;
            Intrinsics.checkNotNullParameter(it, "it");
            o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(it.getContext());
            oooO00o.OooO00o(p543o0oO0O00.OooO.OooO0OO());
            oooO00o.f43911OooO0OO = p139o00OOooO.OooO0o.OooO0Oo(this.f52054OooO0Oo);
            oooO00o.f43909OooO00o = 0;
            oooO00o.OooO0Oo(it);
            return Unit.INSTANCE;
        }
    }

    public static final class o00O0O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f52055OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f52057OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Modifier f52058OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f52059OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ boolean f52060OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ int f52061OooOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00O0O(Modifier modifier, int i, boolean z, boolean z2, int i2, int i3) {
            super(2);
            this.f52058OooO0o0 = modifier;
            this.f52057OooO0o = i;
            this.f52059OooO0oO = z;
            this.f52060OooO0oo = z2;
            this.f52055OooO = i2;
            this.f52061OooOO0 = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            OooOOOO.this.OooOO0o(this.f52058OooO0o0, this.f52057OooO0o, this.f52059OooO0oO, this.f52060OooO0oo, composer, RecomposeScopeImplKt.updateChangedFlags(this.f52055OooO | 1), this.f52061OooOO0);
            return Unit.INSTANCE;
        }
    }

    public static final class o00Oo0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f52062OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f52064OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Integer f52065OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ long f52066OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Modifier f52067OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ int f52068OooOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Oo0(Integer num, long j, long j2, Modifier modifier, int i, int i2) {
            super(2);
            this.f52065OooO0o0 = num;
            this.f52064OooO0o = j;
            this.f52066OooO0oO = j2;
            this.f52067OooO0oo = modifier;
            this.f52062OooO = i;
            this.f52068OooOO0 = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            OooOOOO.this.OooOOO0(this.f52065OooO0o0, this.f52064OooO0o, this.f52066OooO0oO, this.f52067OooO0oo, composer, RecomposeScopeImplKt.updateChangedFlags(this.f52062OooO | 1), this.f52068OooOO0);
            return Unit.INSTANCE;
        }
    }

    public static final class o00Ooo extends Lambda implements Function1<Context, UserMedalView> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Integer f52069OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Ooo(Integer num) {
            super(1);
            this.f52069OooO0Oo = num;
        }

        @Override // kotlin.jvm.functions.Function1
        public final UserMedalView invoke(Context context) {
            Context it = context;
            Intrinsics.checkNotNullParameter(it, "it");
            UserMedalView userMedalView = new UserMedalView(it, null, 6, 0);
            Integer num = this.f52069OooO0Oo;
            if (num != null) {
                userMedalView.setBetweenMargin(num.intValue());
            }
            return userMedalView;
        }
    }

    public static final class o00oO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f52070OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Integer f52072OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f52073OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ float f52074OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Modifier f52075OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ int f52076OooOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oO0o(String str, Integer num, float f, Modifier modifier, int i, int i2) {
            super(2);
            this.f52073OooO0o0 = str;
            this.f52072OooO0o = num;
            this.f52074OooO0oO = f;
            this.f52075OooO0oo = modifier;
            this.f52070OooO = i;
            this.f52076OooOO0 = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            OooOOOO.this.OooOOO(this.f52073OooO0o0, this.f52072OooO0o, this.f52074OooO0oO, this.f52075OooO0oo, composer, RecomposeScopeImplKt.updateChangedFlags(this.f52070OooO | 1), this.f52076OooOO0);
            return Unit.INSTANCE;
        }
    }

    public static final class o0O0O00 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Modifier f52078OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Integer f52079OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f52080OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f52081OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0O0O00(Integer num, Modifier modifier, int i, int i2) {
            super(2);
            this.f52079OooO0o0 = num;
            this.f52078OooO0o = modifier;
            this.f52080OooO0oO = i;
            this.f52081OooO0oo = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            OooOOOO.this.OooOo00(this.f52079OooO0o0, this.f52078OooO0o, composer, RecomposeScopeImplKt.updateChangedFlags(this.f52080OooO0oO | 1), this.f52081OooO0oo);
            return Unit.INSTANCE;
        }
    }

    public static final class o0OO00O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Modifier f52083OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Integer f52084OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f52085OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f52086OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OO00O(Integer num, Modifier modifier, int i, int i2) {
            super(2);
            this.f52084OooO0o0 = num;
            this.f52083OooO0o = modifier;
            this.f52085OooO0oO = i;
            this.f52086OooO0oo = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            OooOOOO.this.OooOo00(this.f52084OooO0o0, this.f52083OooO0o, composer, RecomposeScopeImplKt.updateChangedFlags(this.f52085OooO0oO | 1), this.f52086OooO0oo);
            return Unit.INSTANCE;
        }
    }

    public static final class o0OOO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Modifier f52088OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ UserInfo f52089OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f52090OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f52091OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OOO0o(UserInfo userInfo, Modifier modifier, int i, int i2) {
            super(2);
            this.f52089OooO0o0 = userInfo;
            this.f52088OooO0o = modifier;
            this.f52090OooO0oO = i;
            this.f52091OooO0oo = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            OooOOOO.this.OooOOOO(this.f52089OooO0o0, this.f52088OooO0o, composer, RecomposeScopeImplKt.updateChangedFlags(this.f52090OooO0oO | 1), this.f52091OooO0oo);
            return Unit.INSTANCE;
        }
    }

    public static final class o0Oo0oo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f52092OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f52094OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f52095OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f52096OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ long f52097OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ int f52098OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ FontWeight f52099OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f52100OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final /* synthetic */ int f52101OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final /* synthetic */ Modifier f52102OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public final /* synthetic */ int f52103OooOOOO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0Oo0oo(String str, long j, boolean z, long j2, int i, int i2, FontWeight fontWeight, boolean z2, Modifier modifier, int i3, int i4) {
            super(2);
            this.f52095OooO0o0 = str;
            this.f52094OooO0o = j;
            this.f52096OooO0oO = z;
            this.f52097OooO0oo = j2;
            this.f52092OooO = i;
            this.f52098OooOO0 = i2;
            this.f52099OooOO0O = fontWeight;
            this.f52100OooOO0o = z2;
            this.f52102OooOOO0 = modifier;
            this.f52101OooOOO = i3;
            this.f52103OooOOOO = i4;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            OooOOOO.this.OooOOOo(this.f52095OooO0o0, this.f52094OooO0o, this.f52096OooO0oO, this.f52097OooO0oo, this.f52092OooO, this.f52098OooOO0, this.f52099OooOO0O, this.f52100OooOO0o, this.f52102OooOOO0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f52101OooOOO | 1), this.f52103OooOOOO);
            return Unit.INSTANCE;
        }
    }

    public static final class o0OoOo0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ boolean f52104OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Modifier f52106OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f52107OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ float f52108OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Color f52109OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ int f52110OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ int f52111OooOO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OoOo0(String str, Modifier modifier, float f, Color color, boolean z, int i, int i2) {
            super(2);
            this.f52107OooO0o0 = str;
            this.f52106OooO0o = modifier;
            this.f52108OooO0oO = f;
            this.f52109OooO0oo = color;
            this.f52104OooO = z;
            this.f52110OooOO0 = i;
            this.f52111OooOO0O = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            OooOOOO.this.OooOO0O(this.f52107OooO0o0, this.f52106OooO0o, this.f52108OooO0oO, this.f52109OooO0oo, this.f52104OooO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f52110OooOO0 | 1), this.f52111OooOO0O);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.composable.user.UserComp$UserNameGenderPremiumVip$1$1", f = "UserComp.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o0ooOOo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ UserInfo f52112OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<String> f52113OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0ooOOo(UserInfo userInfo, MutableState<String> mutableState, Continuation<? super o0ooOOo> continuation) {
            super(2, continuation);
            this.f52112OooO0Oo = userInfo;
            this.f52113OooO0o0 = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new o0ooOOo(this.f52112OooO0Oo, this.f52113OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((o0ooOOo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            UserInfo userInfo = this.f52112OooO0Oo;
            String strOooO00o = oOO000o.OooO00o(userInfo.getUserName(), Boxing.boxLong(userInfo.getUserId()));
            OooOOOO oooOOOO = OooOOOO.f51970OooO00o;
            this.f52113OooO0o0.setValue(strOooO00o);
            return Unit.INSTANCE;
        }
    }

    public static final class oo000o extends Lambda implements Function1<UserMedalView, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ String f52114OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f52115OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public oo000o(String str, LifecycleOwner lifecycleOwner) {
            super(1);
            this.f52114OooO0Oo = str;
            this.f52115OooO0o0 = lifecycleOwner;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(UserMedalView userMedalView) {
            UserMedalView it = userMedalView;
            Intrinsics.checkNotNullParameter(it, "it");
            it.OooO00o(this.f52114OooO0Oo, this.f52115OooO0o0);
            return Unit.INSTANCE;
        }
    }

    public static final class oo0o0Oo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Modifier f52117OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Integer f52118OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f52119OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f52120OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public oo0o0Oo(Integer num, Modifier modifier, int i, int i2) {
            super(2);
            this.f52118OooO0o0 = num;
            this.f52117OooO0o = modifier;
            this.f52119OooO0oO = i;
            this.f52120OooO0oo = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            OooOOOO.this.OooOo00(this.f52118OooO0o0, this.f52117OooO0o, composer, RecomposeScopeImplKt.updateChangedFlags(this.f52119OooO0oO | 1), this.f52120OooO0oo);
            return Unit.INSTANCE;
        }
    }

    static {
        int i = o0oO0O0o.f47152o00OOOo;
        long j = o0oO0O0o.f47158o00oO0o;
        f51971OooO0O0 = CollectionsKt.listOf((Object[]) new Color[]{Color.m1660boximpl(j), Color.m1660boximpl(o0oO0O0o.f47157o00oO0O), Color.m1660boximpl(o0oO0O0o.f47170o0ooOO0), Color.m1660boximpl(o0oO0O0o.f47171o0ooOOo), Color.m1660boximpl(o0oO0O0o.f47172o0ooOoO), Color.m1660boximpl(j)});
        f51972OooO0OO = 8;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static boolean OooOOo(@Nullable Boolean bool, @Nullable Integer num, boolean z, float f, @Nullable Modifier modifier, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-228821452);
        boolean z2 = (i2 & 4) != 0 ? false : z;
        float fM3765constructorimpl = (i2 & 8) != 0 ? Dp.m3765constructorimpl(19) : f;
        Modifier modifier2 = (i2 & 16) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-228821452, i, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserPremiumView (UserComp.kt:516)");
        }
        if (bool == null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return false;
        }
        bool.booleanValue();
        if (num == null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return false;
        }
        num.intValue();
        boolean zOooOOoo = OooOOoo(bool.booleanValue(), PremiumLevel.INSTANCE.of(num), z2, fM3765constructorimpl, modifier2, composer, (i & 14) | 262144 | (i & 896) | (i & 7168) | (i & 57344), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return zOooOOoo;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x00c0  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static boolean OooOOoo(boolean z, @NotNull PremiumLevel premiumLevel, boolean z2, float f, @Nullable Modifier modifier, @Nullable Composer composer, int i, int i2) {
        Integer numValueOf;
        PremiumLevel premiumLevel2 = premiumLevel;
        Intrinsics.checkNotNullParameter(premiumLevel, "premiumLevel");
        composer.startReplaceableGroup(-950813500);
        boolean z3 = (i2 & 4) != 0 ? false : z2;
        float fM3765constructorimpl = (i2 & 8) != 0 ? Dp.m3765constructorimpl(19) : f;
        Modifier modifier2 = (i2 & 16) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-950813500, i, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserPremiumView (UserComp.kt:536)");
        }
        if (premiumLevel.getValue() <= 0 || !(z || z3)) {
            numValueOf = null;
        } else {
            int value = premiumLevel.getValue();
            PremiumLevel premiumLevel3 = PremiumLevel.Premium5;
            if (value > premiumLevel3.getValue()) {
                premiumLevel2 = premiumLevel3;
            }
            boolean z4 = !z && z3;
            switch (o000000O.$EnumSwitchMapping$0[premiumLevel2.ordinal()]) {
                case 1:
                    numValueOf = Integer.valueOf(z4 ? oOo00OO0.ic_vip1_expired : oOo00OO0.ic_vip1);
                    break;
                case 2:
                    numValueOf = Integer.valueOf(z4 ? oOo00OO0.ic_vip2_expired : oOo00OO0.ic_vip2);
                    break;
                case 3:
                    numValueOf = Integer.valueOf(z4 ? oOo00OO0.ic_vip3_expired : oOo00OO0.ic_vip3);
                    break;
                case 4:
                    numValueOf = Integer.valueOf(z4 ? oOo00OO0.ic_vip4_expired : oOo00OO0.ic_vip4);
                    break;
                case 5:
                    numValueOf = Integer.valueOf(z4 ? oOo00OO0.ic_vip5_expired : oOo00OO0.ic_vip5);
                    break;
                case 6:
                    numValueOf = Integer.valueOf(z4 ? oOo00OO0.ic_vip6_expired : oOo00OO0.ic_vip6);
                    break;
                case 7:
                    numValueOf = Integer.valueOf(z4 ? oOo00OO0.ic_vip7_expired : oOo00OO0.ic_vip7);
                    break;
                case 8:
                    numValueOf = null;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        if (numValueOf == null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return false;
        }
        ImageKt.Image(PainterResources_androidKt.painterResource(numValueOf.intValue(), composer, 0), "", SizeKt.m523size3ABfNKs(Modifier.INSTANCE.then(modifier2), fM3765constructorimpl), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 56, 120);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return true;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static boolean OooOo0(@Nullable Integer num, @Nullable Integer num2, @Nullable Boolean bool, float f, @Nullable Modifier modifier, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(742755591);
        if ((i2 & 1) != 0) {
            num = Integer.valueOf(VipState.Vip.getValue());
        }
        if ((i2 & 4) != 0) {
            bool = Boolean.TRUE;
        }
        if ((i2 & 8) != 0) {
            f = Dp.m3765constructorimpl(19);
        }
        if ((i2 & 16) != 0) {
            modifier = Modifier.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(742755591, i, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserVIPView (UserComp.kt:580)");
        }
        if (num == null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return false;
        }
        num.intValue();
        if (num2 == null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return false;
        }
        num2.intValue();
        if (bool == null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return false;
        }
        bool.booleanValue();
        if (num.intValue() != VipState.Vip.getValue() || !bool.booleanValue()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return false;
        }
        boolean zOooOo0o = OooOo0o(num2, SizeKt.m523size3ABfNKs(modifier, f), false, composer, ((i >> 3) & 14) | 4480);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return zOooOo0o;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static void OooOo0O(@Nullable Integer num, @Nullable Integer num2, float f, @Nullable Modifier modifier, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(772577625);
        if ((i2 & 1) != 0) {
            num = Integer.valueOf(VipState.Vip.getValue());
        }
        Boolean bool = (i2 & 4) != 0 ? Boolean.TRUE : null;
        if ((i2 & 8) != 0) {
            f = Dp.m3765constructorimpl(19);
        }
        if ((i2 & 16) != 0) {
            modifier = Modifier.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(772577625, i, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserVIPViewBig (UserComp.kt:603)");
        }
        if (num == null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return;
        }
        num.intValue();
        if (num2 == null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return;
        }
        num2.intValue();
        if (bool == null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return;
        }
        bool.booleanValue();
        if (num.intValue() != VipState.NotVip.getValue()) {
            if (num.intValue() != VipState.VipFrozen.getValue()) {
                if (num.intValue() != VipState.VipFrozenHide.getValue() && bool.booleanValue()) {
                    OooOo0o(num2, SizeKt.m523size3ABfNKs(modifier, f), true, composer, ((i >> 3) & 14) | 4480);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer.endReplaceableGroup();
                    return;
                }
            }
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static boolean OooOo0o(Integer num, Modifier modifier, boolean z, Composer composer, int i) {
        composer.startReplaceableGroup(1791004399);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1791004399, i, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserVIPViewShow (UserComp.kt:628)");
        }
        boolean z2 = false;
        if (num == null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return false;
        }
        num.intValue();
        switch (o000000O.$EnumSwitchMapping$1[VipLevel.INSTANCE.of(num.intValue()).ordinal()]) {
            case 1:
                composer.startReplaceableGroup(123889648);
                ImageKt.Image(PainterResources_androidKt.painterResource(oOo00OO0.user_ka_vip_level_image_1, composer, 0), "", Modifier.INSTANCE.then(modifier), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 56, 120);
                composer.endReplaceableGroup();
                z2 = true;
                break;
            case 2:
                composer.startReplaceableGroup(123889971);
                ImageKt.Image(PainterResources_androidKt.painterResource(oOo00OO0.user_ka_vip_level_image_2, composer, 0), "", Modifier.INSTANCE.then(modifier), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 56, 120);
                composer.endReplaceableGroup();
                z2 = true;
                break;
            case 3:
                composer.startReplaceableGroup(123890294);
                ImageKt.Image(PainterResources_androidKt.painterResource(oOo00OO0.user_ka_vip_level_image_3, composer, 0), "", Modifier.INSTANCE.then(modifier), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 56, 120);
                composer.endReplaceableGroup();
                z2 = true;
                break;
            case 4:
                composer.startReplaceableGroup(123890617);
                ImageKt.Image(PainterResources_androidKt.painterResource(oOo00OO0.user_ka_vip_level_image_4, composer, 0), "", Modifier.INSTANCE.then(modifier), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 56, 120);
                composer.endReplaceableGroup();
                z2 = true;
                break;
            case 5:
                composer.startReplaceableGroup(123890940);
                ImageKt.Image(PainterResources_androidKt.painterResource(oOo00OO0.user_ka_vip_level_image_5, composer, 0), "", Modifier.INSTANCE.then(modifier), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 56, 120);
                composer.endReplaceableGroup();
                z2 = true;
                break;
            case 6:
                composer.startReplaceableGroup(123891263);
                p154o00OoO00.OooOo00.OooO00o(z ? "svga/ic_vip6_big.svga" : "svga/ic_vip6_small.svga", true, 0, null, null, Modifier.INSTANCE.then(modifier), composer, 48, 28);
                composer.endReplaceableGroup();
                z2 = true;
                break;
            default:
                composer.startReplaceableGroup(123891719);
                composer.endReplaceableGroup();
                break;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return z2;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01db  */
    /* JADX WARN: Code duplicated, block: B:103:0x0208  */
    /* JADX WARN: Code duplicated, block: B:106:0x020f  */
    /* JADX WARN: Code duplicated, block: B:111:0x021c  */
    /* JADX WARN: Code duplicated, block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:47:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:57:0x009d  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:75:0x010b  */
    /* JADX WARN: Code duplicated, block: B:76:0x010f  */
    /* JADX WARN: Code duplicated, block: B:79:0x0120  */
    /* JADX WARN: Code duplicated, block: B:81:0x012e  */
    /* JADX WARN: Code duplicated, block: B:84:0x0153  */
    /* JADX WARN: Code duplicated, block: B:85:0x0161  */
    /* JADX WARN: Code duplicated, block: B:88:0x017e  */
    /* JADX WARN: Code duplicated, block: B:89:0x0183  */
    /* JADX WARN: Code duplicated, block: B:92:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:94:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:97:0x01d1  */
    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO(@Nullable String str, @Nullable String str2, float f, @Nullable Color color, @NotNull Modifier modifier, @Nullable Composer composer, int i, int i2) {
        int i3;
        float fM3765constructorimpl;
        int i4;
        Color color2;
        int i5;
        int i6;
        Color color3;
        Modifier.Companion companion;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Composer composerM1309constructorimpl;
        Function2 function2OooO00o;
        Object objRememberedValue;
        Composer.Companion companion2;
        Function1 function1;
        MutableState mutableState;
        long jM1705getTransparent0d7_KjU;
        boolean zChanged;
        Object objRememberedValue2;
        boolean z;
        float f2;
        Color color4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Composer composerStartRestartGroup = composer.startRestartGroup(928753302);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 == 0) {
            if ((i & 896) == 0) {
                fM3765constructorimpl = f;
                i3 |= composerStartRestartGroup.changed(fM3765constructorimpl) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 7168) == 0) {
                    color2 = color;
                    if (composerStartRestartGroup.changed(color2)) {
                        i5 = 2048;
                    } else {
                        i5 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i3 |= i5;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((57344 & i) == 0) {
                    if (composerStartRestartGroup.changed(modifier)) {
                        i6 = 16384;
                    } else {
                        i6 = 8192;
                    }
                    i3 |= i6;
                }
                if ((46811 & i3) == 9362 || !composerStartRestartGroup.getSkipping()) {
                    if (i7 != 0) {
                        fM3765constructorimpl = Dp.m3765constructorimpl(0);
                    }
                    if (i4 != 0) {
                        color3 = null;
                    } else {
                        color3 = color2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(928753302, i3, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserHeaderAndHeaddressView (UserComp.kt:340)");
                    }
                    Alignment center = Alignment.INSTANCE.getCenter();
                    companion = Modifier.INSTANCE;
                    Modifier modifierThen = companion.then(modifier);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    constructor = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierThen);
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
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM1309constructorimpl, currentCompositionLocalMap);
                    if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion2 = Composer.INSTANCE;
                    if (objRememberedValue == companion2.getEmpty()) {
                        function1 = null;
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        function1 = null;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    o0000O0 o0000o0OooO0O0 = p417o0OoO0.o00Oo0.OooO0O0(str, function1, composerStartRestartGroup, i3 & 14, 1);
                    ContentScale crop = ContentScale.INSTANCE.getCrop();
                    Modifier modifierClip = ClipKt.clip(modifier, RoundedCornerShapeKt.getCircleShape());
                    if (color3 != null) {
                        jM1705getTransparent0d7_KjU = color3.m1680unboximpl();
                    } else {
                        jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                    }
                    Modifier modifierM180borderxT4_qwU = BorderKt.m180borderxT4_qwU(modifierClip, fM3765constructorimpl, jM1705getTransparent0d7_KjU, RoundedCornerShapeKt.getCircleShape());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(mutableState);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue2 == companion2.getEmpty()) {
                        objRememberedValue2 = new OooOo00(mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    z = true;
                    ImageKt.Image(o0000o0OooO0O0, (String) null, OnRemeasuredModifierKt.onSizeChanged(modifierM180borderxT4_qwU, (Function1) objRememberedValue2), (Alignment) null, crop, 0.0f, (ColorFilter) null, composerStartRestartGroup, 24624, 104);
                    composerStartRestartGroup.startReplaceableGroup(200701560);
                    if (str2 != null && !StringsKt.isBlank(str2)) {
                        z = false;
                    }
                    if (!z) {
                        f51970OooO00o.OooO0oo(((i3 >> 3) & 14) | ConstantsKt.MINIMUM_BLOCK_SIZE, 0, composerStartRestartGroup, SizeKt.m515requiredSize3ABfNKs(companion, Dp.m3765constructorimpl(com.code.android.util.o0000O0.OooO0o0(((Number) mutableState.getValue()).intValue(), composerStartRestartGroup) * 1.388f)), str2);
                    }
                    if (OooOo.OooO0o.OooO0O0(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    f2 = fM3765constructorimpl;
                    color4 = color3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    f2 = fM3765constructorimpl;
                    color4 = color2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooOo(str, str2, f2, color4, modifier, i, i2));
            }
            i3 |= 3072;
            color2 = color;
            if ((i2 & 16) != 0) {
                i3 |= 24576;
            } else if ((57344 & i) == 0) {
                if (composerStartRestartGroup.changed(modifier)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i3 |= i6;
            }
            if ((46811 & i3) == 9362) {
                if (i7 != 0) {
                    fM3765constructorimpl = Dp.m3765constructorimpl(0);
                }
                if (i4 != 0) {
                    color3 = null;
                } else {
                    color3 = color2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(928753302, i3, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserHeaderAndHeaddressView (UserComp.kt:340)");
                }
                Alignment center2 = Alignment.INSTANCE.getCenter();
                companion = Modifier.INSTANCE;
                Modifier modifierThen2 = companion.then(modifier);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                constructor = companion4.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierThen2);
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
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion4, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy2, composerM1309constructorimpl, currentCompositionLocalMap2);
                if (composerM1309constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion2 = Composer.INSTANCE;
                if (objRememberedValue == companion2.getEmpty()) {
                    function1 = null;
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    function1 = null;
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                o0000O0 o0000o0OooO0O1 = p417o0OoO0.o00Oo0.OooO0O0(str, function1, composerStartRestartGroup, i3 & 14, 1);
                ContentScale crop2 = ContentScale.INSTANCE.getCrop();
                Modifier modifierClip2 = ClipKt.clip(modifier, RoundedCornerShapeKt.getCircleShape());
                if (color3 != null) {
                    jM1705getTransparent0d7_KjU = color3.m1680unboximpl();
                } else {
                    jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                }
                Modifier modifierM180borderxT4_qwU2 = BorderKt.m180borderxT4_qwU(modifierClip2, fM3765constructorimpl, jM1705getTransparent0d7_KjU, RoundedCornerShapeKt.getCircleShape());
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(mutableState);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new OooOo00(mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new OooOo00(mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                z = true;
                ImageKt.Image(o0000o0OooO0O1, (String) null, OnRemeasuredModifierKt.onSizeChanged(modifierM180borderxT4_qwU2, (Function1) objRememberedValue2), (Alignment) null, crop2, 0.0f, (ColorFilter) null, composerStartRestartGroup, 24624, 104);
                composerStartRestartGroup.startReplaceableGroup(200701560);
                if (str2 != null) {
                    z = false;
                }
                if (!z) {
                    f51970OooO00o.OooO0oo(((i3 >> 3) & 14) | ConstantsKt.MINIMUM_BLOCK_SIZE, 0, composerStartRestartGroup, SizeKt.m515requiredSize3ABfNKs(companion, Dp.m3765constructorimpl(com.code.android.util.o0000O0.OooO0o0(((Number) mutableState.getValue()).intValue(), composerStartRestartGroup) * 1.388f)), str2);
                }
                if (OooOo.OooO0o.OooO0O0(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                f2 = fM3765constructorimpl;
                color4 = color3;
            } else {
                if (i7 != 0) {
                    fM3765constructorimpl = Dp.m3765constructorimpl(0);
                }
                if (i4 != 0) {
                    color3 = null;
                } else {
                    color3 = color2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(928753302, i3, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserHeaderAndHeaddressView (UserComp.kt:340)");
                }
                Alignment center3 = Alignment.INSTANCE.getCenter();
                companion = Modifier.INSTANCE;
                Modifier modifierThen3 = companion.then(modifier);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(center3, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                constructor = companion5.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierThen3);
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
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion5, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy3, composerM1309constructorimpl, currentCompositionLocalMap3);
                if (composerM1309constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion2 = Composer.INSTANCE;
                if (objRememberedValue == companion2.getEmpty()) {
                    function1 = null;
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    function1 = null;
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                o0000O0 o0000o0OooO0O2 = p417o0OoO0.o00Oo0.OooO0O0(str, function1, composerStartRestartGroup, i3 & 14, 1);
                ContentScale crop3 = ContentScale.INSTANCE.getCrop();
                Modifier modifierClip3 = ClipKt.clip(modifier, RoundedCornerShapeKt.getCircleShape());
                if (color3 != null) {
                    jM1705getTransparent0d7_KjU = color3.m1680unboximpl();
                } else {
                    jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                }
                Modifier modifierM180borderxT4_qwU3 = BorderKt.m180borderxT4_qwU(modifierClip3, fM3765constructorimpl, jM1705getTransparent0d7_KjU, RoundedCornerShapeKt.getCircleShape());
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(mutableState);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new OooOo00(mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new OooOo00(mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                z = true;
                ImageKt.Image(o0000o0OooO0O2, (String) null, OnRemeasuredModifierKt.onSizeChanged(modifierM180borderxT4_qwU3, (Function1) objRememberedValue2), (Alignment) null, crop3, 0.0f, (ColorFilter) null, composerStartRestartGroup, 24624, 104);
                composerStartRestartGroup.startReplaceableGroup(200701560);
                if (str2 != null) {
                    z = false;
                }
                if (!z) {
                    f51970OooO00o.OooO0oo(((i3 >> 3) & 14) | ConstantsKt.MINIMUM_BLOCK_SIZE, 0, composerStartRestartGroup, SizeKt.m515requiredSize3ABfNKs(companion, Dp.m3765constructorimpl(com.code.android.util.o0000O0.OooO0o0(((Number) mutableState.getValue()).intValue(), composerStartRestartGroup) * 1.388f)), str2);
                }
                if (OooOo.OooO0o.OooO0O0(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                f2 = fM3765constructorimpl;
                color4 = color3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooOo(str, str2, f2, color4, modifier, i, i2));
        }
        i3 |= 384;
        fM3765constructorimpl = f;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 7168) == 0) {
                color2 = color;
                if (composerStartRestartGroup.changed(color2)) {
                    i5 = 2048;
                } else {
                    i5 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i3 |= i5;
            }
            if ((i2 & 16) != 0) {
                i3 |= 24576;
            } else if ((57344 & i) == 0) {
                if (composerStartRestartGroup.changed(modifier)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i3 |= i6;
            }
            if ((46811 & i3) == 9362) {
                if (i7 != 0) {
                    fM3765constructorimpl = Dp.m3765constructorimpl(0);
                }
                if (i4 != 0) {
                    color3 = null;
                } else {
                    color3 = color2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(928753302, i3, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserHeaderAndHeaddressView (UserComp.kt:340)");
                }
                Alignment center4 = Alignment.INSTANCE.getCenter();
                companion = Modifier.INSTANCE;
                Modifier modifierThen4 = companion.then(modifier);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(center4, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                constructor = companion6.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierThen4);
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
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion6, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy4, composerM1309constructorimpl, currentCompositionLocalMap4);
                if (composerM1309constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf4, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion2 = Composer.INSTANCE;
                if (objRememberedValue == companion2.getEmpty()) {
                    function1 = null;
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    function1 = null;
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                o0000O0 o0000o0OooO0O3 = p417o0OoO0.o00Oo0.OooO0O0(str, function1, composerStartRestartGroup, i3 & 14, 1);
                ContentScale crop4 = ContentScale.INSTANCE.getCrop();
                Modifier modifierClip4 = ClipKt.clip(modifier, RoundedCornerShapeKt.getCircleShape());
                if (color3 != null) {
                    jM1705getTransparent0d7_KjU = color3.m1680unboximpl();
                } else {
                    jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                }
                Modifier modifierM180borderxT4_qwU4 = BorderKt.m180borderxT4_qwU(modifierClip4, fM3765constructorimpl, jM1705getTransparent0d7_KjU, RoundedCornerShapeKt.getCircleShape());
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(mutableState);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new OooOo00(mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new OooOo00(mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                z = true;
                ImageKt.Image(o0000o0OooO0O3, (String) null, OnRemeasuredModifierKt.onSizeChanged(modifierM180borderxT4_qwU4, (Function1) objRememberedValue2), (Alignment) null, crop4, 0.0f, (ColorFilter) null, composerStartRestartGroup, 24624, 104);
                composerStartRestartGroup.startReplaceableGroup(200701560);
                if (str2 != null) {
                    z = false;
                }
                if (!z) {
                    f51970OooO00o.OooO0oo(((i3 >> 3) & 14) | ConstantsKt.MINIMUM_BLOCK_SIZE, 0, composerStartRestartGroup, SizeKt.m515requiredSize3ABfNKs(companion, Dp.m3765constructorimpl(com.code.android.util.o0000O0.OooO0o0(((Number) mutableState.getValue()).intValue(), composerStartRestartGroup) * 1.388f)), str2);
                }
                if (OooOo.OooO0o.OooO0O0(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                f2 = fM3765constructorimpl;
                color4 = color3;
            } else {
                if (i7 != 0) {
                    fM3765constructorimpl = Dp.m3765constructorimpl(0);
                }
                if (i4 != 0) {
                    color3 = null;
                } else {
                    color3 = color2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(928753302, i3, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserHeaderAndHeaddressView (UserComp.kt:340)");
                }
                Alignment center5 = Alignment.INSTANCE.getCenter();
                companion = Modifier.INSTANCE;
                Modifier modifierThen5 = companion.then(modifier);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy5 = BoxKt.rememberBoxMeasurePolicy(center5, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                constructor = companion7.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierThen5);
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
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion7, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy5, composerM1309constructorimpl, currentCompositionLocalMap5);
                if (composerM1309constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf5, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion2 = Composer.INSTANCE;
                if (objRememberedValue == companion2.getEmpty()) {
                    function1 = null;
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    function1 = null;
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                o0000O0 o0000o0OooO0O4 = p417o0OoO0.o00Oo0.OooO0O0(str, function1, composerStartRestartGroup, i3 & 14, 1);
                ContentScale crop5 = ContentScale.INSTANCE.getCrop();
                Modifier modifierClip5 = ClipKt.clip(modifier, RoundedCornerShapeKt.getCircleShape());
                if (color3 != null) {
                    jM1705getTransparent0d7_KjU = color3.m1680unboximpl();
                } else {
                    jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                }
                Modifier modifierM180borderxT4_qwU5 = BorderKt.m180borderxT4_qwU(modifierClip5, fM3765constructorimpl, jM1705getTransparent0d7_KjU, RoundedCornerShapeKt.getCircleShape());
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(mutableState);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new OooOo00(mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new OooOo00(mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                z = true;
                ImageKt.Image(o0000o0OooO0O4, (String) null, OnRemeasuredModifierKt.onSizeChanged(modifierM180borderxT4_qwU5, (Function1) objRememberedValue2), (Alignment) null, crop5, 0.0f, (ColorFilter) null, composerStartRestartGroup, 24624, 104);
                composerStartRestartGroup.startReplaceableGroup(200701560);
                if (str2 != null) {
                    z = false;
                }
                if (!z) {
                    f51970OooO00o.OooO0oo(((i3 >> 3) & 14) | ConstantsKt.MINIMUM_BLOCK_SIZE, 0, composerStartRestartGroup, SizeKt.m515requiredSize3ABfNKs(companion, Dp.m3765constructorimpl(com.code.android.util.o0000O0.OooO0o0(((Number) mutableState.getValue()).intValue(), composerStartRestartGroup) * 1.388f)), str2);
                }
                if (OooOo.OooO0o.OooO0O0(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                f2 = fM3765constructorimpl;
                color4 = color3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooOo(str, str2, f2, color4, modifier, i, i2));
        }
        i3 |= 3072;
        color2 = color;
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((57344 & i) == 0) {
            if (composerStartRestartGroup.changed(modifier)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i3 |= i6;
        }
        if ((46811 & i3) == 9362) {
            if (i7 != 0) {
                fM3765constructorimpl = Dp.m3765constructorimpl(0);
            }
            if (i4 != 0) {
                color3 = null;
            } else {
                color3 = color2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(928753302, i3, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserHeaderAndHeaddressView (UserComp.kt:340)");
            }
            Alignment center6 = Alignment.INSTANCE.getCenter();
            companion = Modifier.INSTANCE;
            Modifier modifierThen6 = companion.then(modifier);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy6 = BoxKt.rememberBoxMeasurePolicy(center6, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
            constructor = companion8.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierThen6);
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
            function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion8, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy6, composerM1309constructorimpl, currentCompositionLocalMap6);
            if (composerM1309constructorimpl.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            } else {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf6, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion2 = Composer.INSTANCE;
            if (objRememberedValue == companion2.getEmpty()) {
                function1 = null;
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                function1 = null;
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState = (MutableState) objRememberedValue;
            o0000O0 o0000o0OooO0O5 = p417o0OoO0.o00Oo0.OooO0O0(str, function1, composerStartRestartGroup, i3 & 14, 1);
            ContentScale crop6 = ContentScale.INSTANCE.getCrop();
            Modifier modifierClip6 = ClipKt.clip(modifier, RoundedCornerShapeKt.getCircleShape());
            if (color3 != null) {
                jM1705getTransparent0d7_KjU = color3.m1680unboximpl();
            } else {
                jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
            }
            Modifier modifierM180borderxT4_qwU6 = BorderKt.m180borderxT4_qwU(modifierClip6, fM3765constructorimpl, jM1705getTransparent0d7_KjU, RoundedCornerShapeKt.getCircleShape());
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(mutableState);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue2 = new OooOo00(mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = new OooOo00(mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            z = true;
            ImageKt.Image(o0000o0OooO0O5, (String) null, OnRemeasuredModifierKt.onSizeChanged(modifierM180borderxT4_qwU6, (Function1) objRememberedValue2), (Alignment) null, crop6, 0.0f, (ColorFilter) null, composerStartRestartGroup, 24624, 104);
            composerStartRestartGroup.startReplaceableGroup(200701560);
            if (str2 != null) {
                z = false;
            }
            if (!z) {
                f51970OooO00o.OooO0oo(((i3 >> 3) & 14) | ConstantsKt.MINIMUM_BLOCK_SIZE, 0, composerStartRestartGroup, SizeKt.m515requiredSize3ABfNKs(companion, Dp.m3765constructorimpl(com.code.android.util.o0000O0.OooO0o0(((Number) mutableState.getValue()).intValue(), composerStartRestartGroup) * 1.388f)), str2);
            }
            if (OooOo.OooO0o.OooO0O0(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
            f2 = fM3765constructorimpl;
            color4 = color3;
        } else {
            if (i7 != 0) {
                fM3765constructorimpl = Dp.m3765constructorimpl(0);
            }
            if (i4 != 0) {
                color3 = null;
            } else {
                color3 = color2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(928753302, i3, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserHeaderAndHeaddressView (UserComp.kt:340)");
            }
            Alignment center7 = Alignment.INSTANCE.getCenter();
            companion = Modifier.INSTANCE;
            Modifier modifierThen7 = companion.then(modifier);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy7 = BoxKt.rememberBoxMeasurePolicy(center7, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
            constructor = companion9.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(modifierThen7);
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
            function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion9, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy7, composerM1309constructorimpl, currentCompositionLocalMap7);
            if (composerM1309constructorimpl.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            } else {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf7, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance7 = BoxScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion2 = Composer.INSTANCE;
            if (objRememberedValue == companion2.getEmpty()) {
                function1 = null;
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                function1 = null;
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState = (MutableState) objRememberedValue;
            o0000O0 o0000o0OooO0O6 = p417o0OoO0.o00Oo0.OooO0O0(str, function1, composerStartRestartGroup, i3 & 14, 1);
            ContentScale crop7 = ContentScale.INSTANCE.getCrop();
            Modifier modifierClip7 = ClipKt.clip(modifier, RoundedCornerShapeKt.getCircleShape());
            if (color3 != null) {
                jM1705getTransparent0d7_KjU = color3.m1680unboximpl();
            } else {
                jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
            }
            Modifier modifierM180borderxT4_qwU7 = BorderKt.m180borderxT4_qwU(modifierClip7, fM3765constructorimpl, jM1705getTransparent0d7_KjU, RoundedCornerShapeKt.getCircleShape());
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(mutableState);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue2 = new OooOo00(mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = new OooOo00(mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            z = true;
            ImageKt.Image(o0000o0OooO0O6, (String) null, OnRemeasuredModifierKt.onSizeChanged(modifierM180borderxT4_qwU7, (Function1) objRememberedValue2), (Alignment) null, crop7, 0.0f, (ColorFilter) null, composerStartRestartGroup, 24624, 104);
            composerStartRestartGroup.startReplaceableGroup(200701560);
            if (str2 != null) {
                z = false;
            }
            if (!z) {
                f51970OooO00o.OooO0oo(((i3 >> 3) & 14) | ConstantsKt.MINIMUM_BLOCK_SIZE, 0, composerStartRestartGroup, SizeKt.m515requiredSize3ABfNKs(companion, Dp.m3765constructorimpl(com.code.android.util.o0000O0.OooO0o0(((Number) mutableState.getValue()).intValue(), composerStartRestartGroup) * 1.388f)), str2);
            }
            if (OooOo.OooO0o.OooO0O0(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
            f2 = fM3765constructorimpl;
            color4 = color3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOo(str, str2, f2, color4, modifier, i, i2));
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0087  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00af  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00be  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:78:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:86:0x011d  */
    /* JADX WARN: Code duplicated, block: B:88:0x0125  */
    /* JADX WARN: Code duplicated, block: B:91:0x013f  */
    /* JADX WARN: Code duplicated, block: B:96:0x014c  */
    /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(@Nullable String str, @NotNull Modifier modifier, float f, @Nullable Color color, boolean z, @Nullable Composer composer, int i, int i2) {
        int i3;
        float f2;
        int i4;
        Color color2;
        int i5;
        int i6;
        boolean z2;
        int i7;
        float fM3765constructorimpl;
        Color color3;
        boolean z3;
        long jM1705getTransparent0d7_KjU;
        float fM3765constructorimpl2;
        boolean zChanged;
        Object objRememberedValue;
        float f3;
        Color color4;
        boolean z4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Composer composerStartRestartGroup = composer.startRestartGroup(1057720387);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 == 0) {
            if ((i & 896) == 0) {
                f2 = f;
                i3 |= composerStartRestartGroup.changed(f2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 7168) == 0) {
                    color2 = color;
                    if (composerStartRestartGroup.changed(color2)) {
                        i5 = 2048;
                    } else {
                        i5 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((57344 & i) == 0) {
                        z2 = z;
                        if (composerStartRestartGroup.changed(z2)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    if ((46811 & i3) == 9362 || !composerStartRestartGroup.getSkipping()) {
                        if (i8 != 0) {
                            fM3765constructorimpl = Dp.m3765constructorimpl(0);
                        } else {
                            fM3765constructorimpl = f2;
                        }
                        if (i4 != 0) {
                            color3 = null;
                        } else {
                            color3 = color2;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1057720387, i3, -1, "com.yalla.yalla.ui.composable.user.UserComp.GiftViewByNative (UserComp.kt:307)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        RoundedCornerShape circleShape = RoundedCornerShapeKt.getCircleShape();
                        if (color3 != null) {
                            jM1705getTransparent0d7_KjU = color3.m1680unboximpl();
                        } else {
                            jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                        }
                        Modifier modifierBorder = BorderKt.border(companion, new BorderStroke(fM3765constructorimpl, new SolidColor(jM1705getTransparent0d7_KjU, null), null), circleShape);
                        if (z3) {
                            fM3765constructorimpl2 = fM3765constructorimpl;
                        } else {
                            fM3765constructorimpl2 = Dp.m3765constructorimpl(0);
                        }
                        Modifier modifierClip = ClipKt.clip(modifier.then(PaddingKt.m476padding3ABfNKs(modifierBorder, fM3765constructorimpl2)), RoundedCornerShapeKt.getCircleShape());
                        OooO00o oooO00o = OooO00o.f51978OooO0Oo;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(str);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new OooO0O0(str);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        AndroidView_androidKt.AndroidView(oooO00o, modifierClip, (Function1) objRememberedValue, composerStartRestartGroup, 6, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f3 = fM3765constructorimpl;
                        color4 = color3;
                        z4 = z3;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        f3 = f2;
                        color4 = color2;
                        z4 = z2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(str, modifier, f3, color4, z4, i, i2));
                }
                i3 |= 24576;
                z2 = z;
                if ((46811 & i3) == 9362) {
                    if (i8 != 0) {
                        fM3765constructorimpl = Dp.m3765constructorimpl(0);
                    } else {
                        fM3765constructorimpl = f2;
                    }
                    if (i4 != 0) {
                        color3 = null;
                    } else {
                        color3 = color2;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1057720387, i3, -1, "com.yalla.yalla.ui.composable.user.UserComp.GiftViewByNative (UserComp.kt:307)");
                    }
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    RoundedCornerShape circleShape2 = RoundedCornerShapeKt.getCircleShape();
                    if (color3 != null) {
                        jM1705getTransparent0d7_KjU = color3.m1680unboximpl();
                    } else {
                        jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                    }
                    Modifier modifierBorder2 = BorderKt.border(companion2, new BorderStroke(fM3765constructorimpl, new SolidColor(jM1705getTransparent0d7_KjU, null), null), circleShape2);
                    if (z3) {
                        fM3765constructorimpl2 = fM3765constructorimpl;
                    } else {
                        fM3765constructorimpl2 = Dp.m3765constructorimpl(0);
                    }
                    Modifier modifierClip2 = ClipKt.clip(modifier.then(PaddingKt.m476padding3ABfNKs(modifierBorder2, fM3765constructorimpl2)), RoundedCornerShapeKt.getCircleShape());
                    OooO00o oooO00o2 = OooO00o.f51978OooO0Oo;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(str);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new OooO0O0(str);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new OooO0O0(str);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    AndroidView_androidKt.AndroidView(oooO00o2, modifierClip2, (Function1) objRememberedValue, composerStartRestartGroup, 6, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f3 = fM3765constructorimpl;
                    color4 = color3;
                    z4 = z3;
                } else {
                    if (i8 != 0) {
                        fM3765constructorimpl = Dp.m3765constructorimpl(0);
                    } else {
                        fM3765constructorimpl = f2;
                    }
                    if (i4 != 0) {
                        color3 = null;
                    } else {
                        color3 = color2;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1057720387, i3, -1, "com.yalla.yalla.ui.composable.user.UserComp.GiftViewByNative (UserComp.kt:307)");
                    }
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    RoundedCornerShape circleShape3 = RoundedCornerShapeKt.getCircleShape();
                    if (color3 != null) {
                        jM1705getTransparent0d7_KjU = color3.m1680unboximpl();
                    } else {
                        jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                    }
                    Modifier modifierBorder3 = BorderKt.border(companion3, new BorderStroke(fM3765constructorimpl, new SolidColor(jM1705getTransparent0d7_KjU, null), null), circleShape3);
                    if (z3) {
                        fM3765constructorimpl2 = fM3765constructorimpl;
                    } else {
                        fM3765constructorimpl2 = Dp.m3765constructorimpl(0);
                    }
                    Modifier modifierClip3 = ClipKt.clip(modifier.then(PaddingKt.m476padding3ABfNKs(modifierBorder3, fM3765constructorimpl2)), RoundedCornerShapeKt.getCircleShape());
                    OooO00o oooO00o3 = OooO00o.f51978OooO0Oo;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(str);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new OooO0O0(str);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new OooO0O0(str);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    AndroidView_androidKt.AndroidView(oooO00o3, modifierClip3, (Function1) objRememberedValue, composerStartRestartGroup, 6, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f3 = fM3765constructorimpl;
                    color4 = color3;
                    z4 = z3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(str, modifier, f3, color4, z4, i, i2));
            }
            i3 |= 3072;
            color2 = color;
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((57344 & i) == 0) {
                    z2 = z;
                    if (composerStartRestartGroup.changed(z2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((46811 & i3) == 9362) {
                    if (i8 != 0) {
                        fM3765constructorimpl = Dp.m3765constructorimpl(0);
                    } else {
                        fM3765constructorimpl = f2;
                    }
                    if (i4 != 0) {
                        color3 = null;
                    } else {
                        color3 = color2;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1057720387, i3, -1, "com.yalla.yalla.ui.composable.user.UserComp.GiftViewByNative (UserComp.kt:307)");
                    }
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    RoundedCornerShape circleShape4 = RoundedCornerShapeKt.getCircleShape();
                    if (color3 != null) {
                        jM1705getTransparent0d7_KjU = color3.m1680unboximpl();
                    } else {
                        jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                    }
                    Modifier modifierBorder4 = BorderKt.border(companion4, new BorderStroke(fM3765constructorimpl, new SolidColor(jM1705getTransparent0d7_KjU, null), null), circleShape4);
                    if (z3) {
                        fM3765constructorimpl2 = fM3765constructorimpl;
                    } else {
                        fM3765constructorimpl2 = Dp.m3765constructorimpl(0);
                    }
                    Modifier modifierClip4 = ClipKt.clip(modifier.then(PaddingKt.m476padding3ABfNKs(modifierBorder4, fM3765constructorimpl2)), RoundedCornerShapeKt.getCircleShape());
                    OooO00o oooO00o4 = OooO00o.f51978OooO0Oo;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(str);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new OooO0O0(str);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new OooO0O0(str);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    AndroidView_androidKt.AndroidView(oooO00o4, modifierClip4, (Function1) objRememberedValue, composerStartRestartGroup, 6, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f3 = fM3765constructorimpl;
                    color4 = color3;
                    z4 = z3;
                } else {
                    if (i8 != 0) {
                        fM3765constructorimpl = Dp.m3765constructorimpl(0);
                    } else {
                        fM3765constructorimpl = f2;
                    }
                    if (i4 != 0) {
                        color3 = null;
                    } else {
                        color3 = color2;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1057720387, i3, -1, "com.yalla.yalla.ui.composable.user.UserComp.GiftViewByNative (UserComp.kt:307)");
                    }
                    Modifier.Companion companion5 = Modifier.INSTANCE;
                    RoundedCornerShape circleShape5 = RoundedCornerShapeKt.getCircleShape();
                    if (color3 != null) {
                        jM1705getTransparent0d7_KjU = color3.m1680unboximpl();
                    } else {
                        jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                    }
                    Modifier modifierBorder5 = BorderKt.border(companion5, new BorderStroke(fM3765constructorimpl, new SolidColor(jM1705getTransparent0d7_KjU, null), null), circleShape5);
                    if (z3) {
                        fM3765constructorimpl2 = fM3765constructorimpl;
                    } else {
                        fM3765constructorimpl2 = Dp.m3765constructorimpl(0);
                    }
                    Modifier modifierClip5 = ClipKt.clip(modifier.then(PaddingKt.m476padding3ABfNKs(modifierBorder5, fM3765constructorimpl2)), RoundedCornerShapeKt.getCircleShape());
                    OooO00o oooO00o5 = OooO00o.f51978OooO0Oo;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(str);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new OooO0O0(str);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new OooO0O0(str);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    AndroidView_androidKt.AndroidView(oooO00o5, modifierClip5, (Function1) objRememberedValue, composerStartRestartGroup, 6, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f3 = fM3765constructorimpl;
                    color4 = color3;
                    z4 = z3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(str, modifier, f3, color4, z4, i, i2));
            }
            i3 |= 24576;
            z2 = z;
            if ((46811 & i3) == 9362) {
                if (i8 != 0) {
                    fM3765constructorimpl = Dp.m3765constructorimpl(0);
                } else {
                    fM3765constructorimpl = f2;
                }
                if (i4 != 0) {
                    color3 = null;
                } else {
                    color3 = color2;
                }
                if (i6 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1057720387, i3, -1, "com.yalla.yalla.ui.composable.user.UserComp.GiftViewByNative (UserComp.kt:307)");
                }
                Modifier.Companion companion6 = Modifier.INSTANCE;
                RoundedCornerShape circleShape6 = RoundedCornerShapeKt.getCircleShape();
                if (color3 != null) {
                    jM1705getTransparent0d7_KjU = color3.m1680unboximpl();
                } else {
                    jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                }
                Modifier modifierBorder6 = BorderKt.border(companion6, new BorderStroke(fM3765constructorimpl, new SolidColor(jM1705getTransparent0d7_KjU, null), null), circleShape6);
                if (z3) {
                    fM3765constructorimpl2 = fM3765constructorimpl;
                } else {
                    fM3765constructorimpl2 = Dp.m3765constructorimpl(0);
                }
                Modifier modifierClip6 = ClipKt.clip(modifier.then(PaddingKt.m476padding3ABfNKs(modifierBorder6, fM3765constructorimpl2)), RoundedCornerShapeKt.getCircleShape());
                OooO00o oooO00o6 = OooO00o.f51978OooO0Oo;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(str);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new OooO0O0(str);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new OooO0O0(str);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                AndroidView_androidKt.AndroidView(oooO00o6, modifierClip6, (Function1) objRememberedValue, composerStartRestartGroup, 6, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f3 = fM3765constructorimpl;
                color4 = color3;
                z4 = z3;
            } else {
                if (i8 != 0) {
                    fM3765constructorimpl = Dp.m3765constructorimpl(0);
                } else {
                    fM3765constructorimpl = f2;
                }
                if (i4 != 0) {
                    color3 = null;
                } else {
                    color3 = color2;
                }
                if (i6 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1057720387, i3, -1, "com.yalla.yalla.ui.composable.user.UserComp.GiftViewByNative (UserComp.kt:307)");
                }
                Modifier.Companion companion7 = Modifier.INSTANCE;
                RoundedCornerShape circleShape7 = RoundedCornerShapeKt.getCircleShape();
                if (color3 != null) {
                    jM1705getTransparent0d7_KjU = color3.m1680unboximpl();
                } else {
                    jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                }
                Modifier modifierBorder7 = BorderKt.border(companion7, new BorderStroke(fM3765constructorimpl, new SolidColor(jM1705getTransparent0d7_KjU, null), null), circleShape7);
                if (z3) {
                    fM3765constructorimpl2 = fM3765constructorimpl;
                } else {
                    fM3765constructorimpl2 = Dp.m3765constructorimpl(0);
                }
                Modifier modifierClip7 = ClipKt.clip(modifier.then(PaddingKt.m476padding3ABfNKs(modifierBorder7, fM3765constructorimpl2)), RoundedCornerShapeKt.getCircleShape());
                OooO00o oooO00o7 = OooO00o.f51978OooO0Oo;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(str);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new OooO0O0(str);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new OooO0O0(str);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                AndroidView_androidKt.AndroidView(oooO00o7, modifierClip7, (Function1) objRememberedValue, composerStartRestartGroup, 6, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f3 = fM3765constructorimpl;
                color4 = color3;
                z4 = z3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(str, modifier, f3, color4, z4, i, i2));
        }
        i3 |= 384;
        f2 = f;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 7168) == 0) {
                color2 = color;
                if (composerStartRestartGroup.changed(color2)) {
                    i5 = 2048;
                } else {
                    i5 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i3 |= i5;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((57344 & i) == 0) {
                    z2 = z;
                    if (composerStartRestartGroup.changed(z2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((46811 & i3) == 9362) {
                    if (i8 != 0) {
                        fM3765constructorimpl = Dp.m3765constructorimpl(0);
                    } else {
                        fM3765constructorimpl = f2;
                    }
                    if (i4 != 0) {
                        color3 = null;
                    } else {
                        color3 = color2;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1057720387, i3, -1, "com.yalla.yalla.ui.composable.user.UserComp.GiftViewByNative (UserComp.kt:307)");
                    }
                    Modifier.Companion companion8 = Modifier.INSTANCE;
                    RoundedCornerShape circleShape8 = RoundedCornerShapeKt.getCircleShape();
                    if (color3 != null) {
                        jM1705getTransparent0d7_KjU = color3.m1680unboximpl();
                    } else {
                        jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                    }
                    Modifier modifierBorder8 = BorderKt.border(companion8, new BorderStroke(fM3765constructorimpl, new SolidColor(jM1705getTransparent0d7_KjU, null), null), circleShape8);
                    if (z3) {
                        fM3765constructorimpl2 = fM3765constructorimpl;
                    } else {
                        fM3765constructorimpl2 = Dp.m3765constructorimpl(0);
                    }
                    Modifier modifierClip8 = ClipKt.clip(modifier.then(PaddingKt.m476padding3ABfNKs(modifierBorder8, fM3765constructorimpl2)), RoundedCornerShapeKt.getCircleShape());
                    OooO00o oooO00o8 = OooO00o.f51978OooO0Oo;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(str);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new OooO0O0(str);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new OooO0O0(str);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    AndroidView_androidKt.AndroidView(oooO00o8, modifierClip8, (Function1) objRememberedValue, composerStartRestartGroup, 6, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f3 = fM3765constructorimpl;
                    color4 = color3;
                    z4 = z3;
                } else {
                    if (i8 != 0) {
                        fM3765constructorimpl = Dp.m3765constructorimpl(0);
                    } else {
                        fM3765constructorimpl = f2;
                    }
                    if (i4 != 0) {
                        color3 = null;
                    } else {
                        color3 = color2;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1057720387, i3, -1, "com.yalla.yalla.ui.composable.user.UserComp.GiftViewByNative (UserComp.kt:307)");
                    }
                    Modifier.Companion companion9 = Modifier.INSTANCE;
                    RoundedCornerShape circleShape9 = RoundedCornerShapeKt.getCircleShape();
                    if (color3 != null) {
                        jM1705getTransparent0d7_KjU = color3.m1680unboximpl();
                    } else {
                        jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                    }
                    Modifier modifierBorder9 = BorderKt.border(companion9, new BorderStroke(fM3765constructorimpl, new SolidColor(jM1705getTransparent0d7_KjU, null), null), circleShape9);
                    if (z3) {
                        fM3765constructorimpl2 = fM3765constructorimpl;
                    } else {
                        fM3765constructorimpl2 = Dp.m3765constructorimpl(0);
                    }
                    Modifier modifierClip9 = ClipKt.clip(modifier.then(PaddingKt.m476padding3ABfNKs(modifierBorder9, fM3765constructorimpl2)), RoundedCornerShapeKt.getCircleShape());
                    OooO00o oooO00o9 = OooO00o.f51978OooO0Oo;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(str);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new OooO0O0(str);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new OooO0O0(str);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    AndroidView_androidKt.AndroidView(oooO00o9, modifierClip9, (Function1) objRememberedValue, composerStartRestartGroup, 6, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f3 = fM3765constructorimpl;
                    color4 = color3;
                    z4 = z3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(str, modifier, f3, color4, z4, i, i2));
            }
            i3 |= 24576;
            z2 = z;
            if ((46811 & i3) == 9362) {
                if (i8 != 0) {
                    fM3765constructorimpl = Dp.m3765constructorimpl(0);
                } else {
                    fM3765constructorimpl = f2;
                }
                if (i4 != 0) {
                    color3 = null;
                } else {
                    color3 = color2;
                }
                if (i6 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1057720387, i3, -1, "com.yalla.yalla.ui.composable.user.UserComp.GiftViewByNative (UserComp.kt:307)");
                }
                Modifier.Companion companion10 = Modifier.INSTANCE;
                RoundedCornerShape circleShape10 = RoundedCornerShapeKt.getCircleShape();
                if (color3 != null) {
                    jM1705getTransparent0d7_KjU = color3.m1680unboximpl();
                } else {
                    jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                }
                Modifier modifierBorder10 = BorderKt.border(companion10, new BorderStroke(fM3765constructorimpl, new SolidColor(jM1705getTransparent0d7_KjU, null), null), circleShape10);
                if (z3) {
                    fM3765constructorimpl2 = fM3765constructorimpl;
                } else {
                    fM3765constructorimpl2 = Dp.m3765constructorimpl(0);
                }
                Modifier modifierClip10 = ClipKt.clip(modifier.then(PaddingKt.m476padding3ABfNKs(modifierBorder10, fM3765constructorimpl2)), RoundedCornerShapeKt.getCircleShape());
                OooO00o oooO00o10 = OooO00o.f51978OooO0Oo;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(str);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new OooO0O0(str);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new OooO0O0(str);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                AndroidView_androidKt.AndroidView(oooO00o10, modifierClip10, (Function1) objRememberedValue, composerStartRestartGroup, 6, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f3 = fM3765constructorimpl;
                color4 = color3;
                z4 = z3;
            } else {
                if (i8 != 0) {
                    fM3765constructorimpl = Dp.m3765constructorimpl(0);
                } else {
                    fM3765constructorimpl = f2;
                }
                if (i4 != 0) {
                    color3 = null;
                } else {
                    color3 = color2;
                }
                if (i6 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1057720387, i3, -1, "com.yalla.yalla.ui.composable.user.UserComp.GiftViewByNative (UserComp.kt:307)");
                }
                Modifier.Companion companion11 = Modifier.INSTANCE;
                RoundedCornerShape circleShape11 = RoundedCornerShapeKt.getCircleShape();
                if (color3 != null) {
                    jM1705getTransparent0d7_KjU = color3.m1680unboximpl();
                } else {
                    jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                }
                Modifier modifierBorder11 = BorderKt.border(companion11, new BorderStroke(fM3765constructorimpl, new SolidColor(jM1705getTransparent0d7_KjU, null), null), circleShape11);
                if (z3) {
                    fM3765constructorimpl2 = fM3765constructorimpl;
                } else {
                    fM3765constructorimpl2 = Dp.m3765constructorimpl(0);
                }
                Modifier modifierClip11 = ClipKt.clip(modifier.then(PaddingKt.m476padding3ABfNKs(modifierBorder11, fM3765constructorimpl2)), RoundedCornerShapeKt.getCircleShape());
                OooO00o oooO00o11 = OooO00o.f51978OooO0Oo;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(str);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new OooO0O0(str);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new OooO0O0(str);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                AndroidView_androidKt.AndroidView(oooO00o11, modifierClip11, (Function1) objRememberedValue, composerStartRestartGroup, 6, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f3 = fM3765constructorimpl;
                color4 = color3;
                z4 = z3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(str, modifier, f3, color4, z4, i, i2));
        }
        i3 |= 3072;
        color2 = color;
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((57344 & i) == 0) {
                z2 = z;
                if (composerStartRestartGroup.changed(z2)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            if ((46811 & i3) == 9362) {
                if (i8 != 0) {
                    fM3765constructorimpl = Dp.m3765constructorimpl(0);
                } else {
                    fM3765constructorimpl = f2;
                }
                if (i4 != 0) {
                    color3 = null;
                } else {
                    color3 = color2;
                }
                if (i6 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1057720387, i3, -1, "com.yalla.yalla.ui.composable.user.UserComp.GiftViewByNative (UserComp.kt:307)");
                }
                Modifier.Companion companion12 = Modifier.INSTANCE;
                RoundedCornerShape circleShape12 = RoundedCornerShapeKt.getCircleShape();
                if (color3 != null) {
                    jM1705getTransparent0d7_KjU = color3.m1680unboximpl();
                } else {
                    jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                }
                Modifier modifierBorder12 = BorderKt.border(companion12, new BorderStroke(fM3765constructorimpl, new SolidColor(jM1705getTransparent0d7_KjU, null), null), circleShape12);
                if (z3) {
                    fM3765constructorimpl2 = fM3765constructorimpl;
                } else {
                    fM3765constructorimpl2 = Dp.m3765constructorimpl(0);
                }
                Modifier modifierClip12 = ClipKt.clip(modifier.then(PaddingKt.m476padding3ABfNKs(modifierBorder12, fM3765constructorimpl2)), RoundedCornerShapeKt.getCircleShape());
                OooO00o oooO00o12 = OooO00o.f51978OooO0Oo;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(str);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new OooO0O0(str);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new OooO0O0(str);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                AndroidView_androidKt.AndroidView(oooO00o12, modifierClip12, (Function1) objRememberedValue, composerStartRestartGroup, 6, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f3 = fM3765constructorimpl;
                color4 = color3;
                z4 = z3;
            } else {
                if (i8 != 0) {
                    fM3765constructorimpl = Dp.m3765constructorimpl(0);
                } else {
                    fM3765constructorimpl = f2;
                }
                if (i4 != 0) {
                    color3 = null;
                } else {
                    color3 = color2;
                }
                if (i6 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1057720387, i3, -1, "com.yalla.yalla.ui.composable.user.UserComp.GiftViewByNative (UserComp.kt:307)");
                }
                Modifier.Companion companion13 = Modifier.INSTANCE;
                RoundedCornerShape circleShape13 = RoundedCornerShapeKt.getCircleShape();
                if (color3 != null) {
                    jM1705getTransparent0d7_KjU = color3.m1680unboximpl();
                } else {
                    jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                }
                Modifier modifierBorder13 = BorderKt.border(companion13, new BorderStroke(fM3765constructorimpl, new SolidColor(jM1705getTransparent0d7_KjU, null), null), circleShape13);
                if (z3) {
                    fM3765constructorimpl2 = fM3765constructorimpl;
                } else {
                    fM3765constructorimpl2 = Dp.m3765constructorimpl(0);
                }
                Modifier modifierClip13 = ClipKt.clip(modifier.then(PaddingKt.m476padding3ABfNKs(modifierBorder13, fM3765constructorimpl2)), RoundedCornerShapeKt.getCircleShape());
                OooO00o oooO00o13 = OooO00o.f51978OooO0Oo;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(str);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new OooO0O0(str);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new OooO0O0(str);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                AndroidView_androidKt.AndroidView(oooO00o13, modifierClip13, (Function1) objRememberedValue, composerStartRestartGroup, 6, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f3 = fM3765constructorimpl;
                color4 = color3;
                z4 = z3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(str, modifier, f3, color4, z4, i, i2));
        }
        i3 |= 24576;
        z2 = z;
        if ((46811 & i3) == 9362) {
            if (i8 != 0) {
                fM3765constructorimpl = Dp.m3765constructorimpl(0);
            } else {
                fM3765constructorimpl = f2;
            }
            if (i4 != 0) {
                color3 = null;
            } else {
                color3 = color2;
            }
            if (i6 != 0) {
                z3 = true;
            } else {
                z3 = z2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1057720387, i3, -1, "com.yalla.yalla.ui.composable.user.UserComp.GiftViewByNative (UserComp.kt:307)");
            }
            Modifier.Companion companion14 = Modifier.INSTANCE;
            RoundedCornerShape circleShape14 = RoundedCornerShapeKt.getCircleShape();
            if (color3 != null) {
                jM1705getTransparent0d7_KjU = color3.m1680unboximpl();
            } else {
                jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
            }
            Modifier modifierBorder14 = BorderKt.border(companion14, new BorderStroke(fM3765constructorimpl, new SolidColor(jM1705getTransparent0d7_KjU, null), null), circleShape14);
            if (z3) {
                fM3765constructorimpl2 = fM3765constructorimpl;
            } else {
                fM3765constructorimpl2 = Dp.m3765constructorimpl(0);
            }
            Modifier modifierClip14 = ClipKt.clip(modifier.then(PaddingKt.m476padding3ABfNKs(modifierBorder14, fM3765constructorimpl2)), RoundedCornerShapeKt.getCircleShape());
            OooO00o oooO00o14 = OooO00o.f51978OooO0Oo;
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(str);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new OooO0O0(str);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new OooO0O0(str);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            AndroidView_androidKt.AndroidView(oooO00o14, modifierClip14, (Function1) objRememberedValue, composerStartRestartGroup, 6, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f3 = fM3765constructorimpl;
            color4 = color3;
            z4 = z3;
        } else {
            if (i8 != 0) {
                fM3765constructorimpl = Dp.m3765constructorimpl(0);
            } else {
                fM3765constructorimpl = f2;
            }
            if (i4 != 0) {
                color3 = null;
            } else {
                color3 = color2;
            }
            if (i6 != 0) {
                z3 = true;
            } else {
                z3 = z2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1057720387, i3, -1, "com.yalla.yalla.ui.composable.user.UserComp.GiftViewByNative (UserComp.kt:307)");
            }
            Modifier.Companion companion15 = Modifier.INSTANCE;
            RoundedCornerShape circleShape15 = RoundedCornerShapeKt.getCircleShape();
            if (color3 != null) {
                jM1705getTransparent0d7_KjU = color3.m1680unboximpl();
            } else {
                jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
            }
            Modifier modifierBorder15 = BorderKt.border(companion15, new BorderStroke(fM3765constructorimpl, new SolidColor(jM1705getTransparent0d7_KjU, null), null), circleShape15);
            if (z3) {
                fM3765constructorimpl2 = fM3765constructorimpl;
            } else {
                fM3765constructorimpl2 = Dp.m3765constructorimpl(0);
            }
            Modifier modifierClip15 = ClipKt.clip(modifier.then(PaddingKt.m476padding3ABfNKs(modifierBorder15, fM3765constructorimpl2)), RoundedCornerShapeKt.getCircleShape());
            OooO00o oooO00o15 = OooO00o.f51978OooO0Oo;
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(str);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new OooO0O0(str);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new OooO0O0(str);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            AndroidView_androidKt.AndroidView(oooO00o15, modifierClip15, (Function1) objRememberedValue, composerStartRestartGroup, 6, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f3 = fM3765constructorimpl;
            color4 = color3;
            z4 = z3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(str, modifier, f3, color4, z4, i, i2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(message = "需要的地方自己单独写各个控件，禁止再使用这种集合")
    @Composable
    public final void OooO0O0(@NotNull UserInfo userInfo, @Nullable Modifier modifier, @Nullable Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1778157192);
        Modifier modifier2 = (i2 & 2) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1778157192, i, -1, "com.yalla.yalla.ui.composable.user.UserComp.OthersNameGenderPremiumVip (UserComp.kt:105)");
        }
        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
        int i3 = ((i >> 3) & 14) | 384;
        composerStartRestartGroup.startReplaceableGroup(693286680);
        int i4 = i3 >> 3;
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, (i4 & 112) | (i4 & 14));
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier2);
        int i5 = ((((i3 << 3) & 112) << 9) & 7168) | 6;
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
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1309constructorimpl, measurePolicyRowMeasurePolicy, composerM1309constructorimpl, currentCompositionLocalMap);
        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o((i5 >> 3) & 112, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(userInfo.getUserName(), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue;
        EffectsKt.LaunchedEffect(Long.valueOf(userInfo.getUserId()), new OooO0o(userInfo, mutableState, null), composerStartRestartGroup, 64);
        OooOOOO oooOOOO = f51970OooO00o;
        String strOooO00o = oOO000o.OooO00o((String) mutableState.getValue(), Long.valueOf(userInfo.getUserId()));
        Modifier.Companion companion2 = Modifier.INSTANCE;
        oooOOOO.OooOOOo(strOooO00o, 0L, false, 0L, 0, 0, null, false, rowScopeInstance.weight(companion2, 1.0f, false), composerStartRestartGroup, Pow2.MAX_POW2, 254);
        float f = 5;
        oooOOOO.OooO0oO(Integer.valueOf(userInfo.getSex()), PaddingKt.m480paddingqDBjuR0$default(companion2, Dp.m3765constructorimpl(f), 0.0f, 0.0f, 0.0f, 14, null), composerStartRestartGroup, 560, 0);
        oooOOOO.OooOo(userInfo.getWealthLevel(), userInfo.getWealthBadgeWithBg(), null, 0L, composerStartRestartGroup, ShareRequest.THUMB_DATA_SIZE_LIMIT, 12);
        OooOo0(null, Integer.valueOf(userInfo.getVipLevel()), null, 0.0f, PaddingKt.m480paddingqDBjuR0$default(companion2, Dp.m3765constructorimpl(f), 0.0f, 0.0f, 0.0f, 14, null), composerStartRestartGroup, 286720, 13);
        OooOOoo(userInfo.isPremium(), PremiumLevel.INSTANCE.of(Integer.valueOf(userInfo.getPremiumLevel())), false, 0.0f, PaddingKt.m480paddingqDBjuR0$default(companion2, Dp.m3765constructorimpl(f), 0.0f, 0.0f, 0.0f, 14, null), composerStartRestartGroup, 286720, 12);
        if (androidx.compose.material.OooOO0.OooO0O0(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO(userInfo, modifier2, i, i2));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0OO(int i, int i2, int i3, @Nullable Composer composer, @Nullable Modifier modifier) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-602819296);
        if ((i3 & 1) != 0) {
            modifier = Modifier.INSTANCE;
        }
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-602819296, i2, -1, "com.yalla.yalla.ui.composable.user.UserComp.RoomMicListIdentityId (UserComp.kt:390)");
        }
        OooOO0o(modifier, i, false, false, composerStartRestartGroup, (i2 & 14) | 36224 | (i2 & 112), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new p517o0o0O0o.OooOo00(this, modifier, i, i2, i3));
    }

    /* JADX WARN: Code duplicated, block: B:105:0x013d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:106:0x013f  */
    /* JADX WARN: Code duplicated, block: B:107:0x0146  */
    /* JADX WARN: Code duplicated, block: B:110:0x014c  */
    /* JADX WARN: Code duplicated, block: B:111:0x0153  */
    /* JADX WARN: Code duplicated, block: B:113:0x0157  */
    /* JADX WARN: Code duplicated, block: B:114:0x015f  */
    /* JADX WARN: Code duplicated, block: B:117:0x0164  */
    /* JADX WARN: Code duplicated, block: B:118:0x016a  */
    /* JADX WARN: Code duplicated, block: B:120:0x016d  */
    /* JADX WARN: Code duplicated, block: B:121:0x0174  */
    /* JADX WARN: Code duplicated, block: B:123:0x0178  */
    /* JADX WARN: Code duplicated, block: B:124:0x017b  */
    /* JADX WARN: Code duplicated, block: B:128:0x0193  */
    /* JADX WARN: Code duplicated, block: B:130:0x019e  */
    /* JADX WARN: Code duplicated, block: B:132:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:136:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:138:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:140:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:143:0x020a  */
    /* JADX WARN: Code duplicated, block: B:144:0x020e  */
    /* JADX WARN: Code duplicated, block: B:147:0x021f  */
    /* JADX WARN: Code duplicated, block: B:149:0x022d  */
    /* JADX WARN: Code duplicated, block: B:151:0x0292  */
    /* JADX WARN: Code duplicated, block: B:154:0x029e  */
    /* JADX WARN: Code duplicated, block: B:159:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x005f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0074  */
    /* JADX WARN: Code duplicated, block: B:47:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x007d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x008b  */
    /* JADX WARN: Code duplicated, block: B:53:0x008e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0099  */
    /* JADX WARN: Code duplicated, block: B:60:0x009d  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:80:0x00da  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:85:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:93:0x0111  */
    /* JADX WARN: Code duplicated, block: B:95:0x011b  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0Oo(boolean z, @Nullable String str, long j, long j2, float f, long j3, float f2, @Nullable Modifier modifier, @Nullable Composer composer, int i, int i2) {
        int i3;
        int i4;
        float f3;
        int i5;
        long j4;
        int i6;
        int i7;
        int i8;
        int i9;
        long sp;
        long j5;
        float fM3765constructorimpl;
        long j6;
        float fM3765constructorimpl2;
        Modifier modifier2;
        long j7;
        float f4;
        long j8;
        long j9;
        int i10;
        Modifier modifier3;
        float f5;
        Composer composer2;
        Modifier modifier4;
        float f6;
        long j10;
        long j11;
        long j12;
        float f7;
        boolean z2;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Composer composerM1309constructorimpl;
        Function2 function2OooO00o;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1957067506);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        int i11 = i2 & 4;
        if (i11 == 0) {
            if ((i & 896) == 0) {
                i3 |= composerStartRestartGroup.changed(j) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
            }
            if ((i & 7168) != 0) {
                i3 |= ((i2 & 8) == 0 || !composerStartRestartGroup.changed(j2)) ? LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY : 2048;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((57344 & i) == 0) {
                    f3 = f;
                    if (composerStartRestartGroup.changed(f3)) {
                        i5 = 16384;
                    } else {
                        i5 = 8192;
                    }
                    i3 |= i5;
                }
                if ((458752 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        j4 = j3;
                        int i12 = composerStartRestartGroup.changed(j4) ? 131072 : 65536;
                        i3 |= i12;
                    } else {
                        j4 = j3;
                    }
                    i3 |= i12;
                } else {
                    j4 = j3;
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                    i3 |= 1572864;
                } else if ((i & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(f2)) {
                        i7 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i7 = 524288;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 128;
                if (i8 != 0) {
                    i3 |= 12582912;
                } else if ((i & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(modifier)) {
                        i9 = 8388608;
                    } else {
                        i9 = Configuration.BLOCK_SIZE;
                    }
                    i3 |= i9;
                }
                if ((i3 & 23967451) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i11 != 0) {
                            sp = TextUnitKt.getSp(11);
                        } else {
                            sp = j;
                        }
                        if ((i2 & 8) != 0) {
                            int i13 = o0oO0O0o.f47152o00OOOo;
                            j5 = o0oO0O0o.f46983Oooo0o0;
                            i3 &= -7169;
                        } else {
                            j5 = j2;
                        }
                        if (i4 != 0) {
                            fM3765constructorimpl = Dp.m3765constructorimpl(16);
                        } else {
                            fM3765constructorimpl = f3;
                        }
                        if ((i2 & 32) != 0) {
                            int i14 = o0oO0O0o.f47152o00OOOo;
                            j6 = o0oO0O0o.f46985Oooo0oo;
                            i3 &= -458753;
                        } else {
                            j6 = j4;
                        }
                        if (i6 != 0) {
                            fM3765constructorimpl2 = Dp.m3765constructorimpl(6);
                        } else {
                            fM3765constructorimpl2 = f2;
                        }
                        if (i8 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        j7 = sp;
                        f4 = fM3765constructorimpl;
                        j8 = j6;
                        j9 = j5;
                        float f8 = fM3765constructorimpl2;
                        i10 = i3;
                        modifier3 = modifier2;
                        f5 = f8;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                        j7 = j;
                        j9 = j2;
                        f5 = f2;
                        i10 = i3;
                        f4 = f3;
                        j8 = j4;
                        modifier3 = modifier;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1957067506, i10, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserAuthor (UserComp.kt:808)");
                    }
                    if (z) {
                        if (str != null || str.length() == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            composer2 = composerStartRestartGroup;
                        } else {
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierM478paddingVpY3zN4$default = PaddingKt.m478paddingVpY3zN4$default(BackgroundKt.m169backgroundbw27NRU$default(ClipKt.clip(SizeKt.m509height3ABfNKs(companion, f4), RoundedCornerShapeKt.RoundedCornerShape(50)), j8, null, 2, null), f5, 0.0f, 2, null);
                            composerStartRestartGroup.startReplaceableGroup(733328855);
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyOooO00o = p018OooOoo0.OooOOO.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            constructor = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM478paddingVpY3zN4$default);
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
                            function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
                            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                            }
                            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                            int i15 = i10 >> 3;
                            composer2 = composerStartRestartGroup;
                            TextKt.m1251Text4IGK_g(str, BoxScopeInstance.INSTANCE.align(companion.then(modifier3), companion2.getCenter()), j9, j7, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i15 & 896) | (i15 & 14) | ((i10 << 3) & 7168), 0, 130544);
                            p426o0OoOO.o000oOoO.OooO00o(composer2);
                        }
                    } else {
                        composer2 = composerStartRestartGroup;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    f6 = f4;
                    j10 = j7;
                    j11 = j9;
                    j12 = j8;
                    f7 = f5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    j10 = j;
                    j11 = j2;
                    f7 = f2;
                    composer2 = composerStartRestartGroup;
                    f6 = f3;
                    j12 = j4;
                    modifier4 = modifier;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0(z, str, j10, j11, f6, j12, f7, modifier4, i, i2));
            }
            i3 |= 24576;
            f3 = f;
            if ((458752 & i) == 0) {
                if ((i2 & 32) == 0) {
                    j4 = j3;
                    if (composerStartRestartGroup.changed(j4)) {
                    }
                    i3 |= i12;
                } else {
                    j4 = j3;
                }
                i3 |= i12;
            } else {
                j4 = j3;
            }
            i6 = i2 & 64;
            if (i6 != 0) {
                i3 |= 1572864;
            } else if ((i & 3670016) == 0) {
                if (composerStartRestartGroup.changed(f2)) {
                    i7 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i7 = 524288;
                }
                i3 |= i7;
            }
            i8 = i2 & 128;
            if (i8 != 0) {
                i3 |= 12582912;
            } else if ((i & 29360128) == 0) {
                if (composerStartRestartGroup.changed(modifier)) {
                    i9 = 8388608;
                } else {
                    i9 = Configuration.BLOCK_SIZE;
                }
                i3 |= i9;
            }
            if ((i3 & 23967451) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        sp = TextUnitKt.getSp(11);
                    } else {
                        sp = j;
                    }
                    if ((i2 & 8) != 0) {
                        int i16 = o0oO0O0o.f47152o00OOOo;
                        j5 = o0oO0O0o.f46983Oooo0o0;
                        i3 &= -7169;
                    } else {
                        j5 = j2;
                    }
                    if (i4 != 0) {
                        fM3765constructorimpl = Dp.m3765constructorimpl(16);
                    } else {
                        fM3765constructorimpl = f3;
                    }
                    if ((i2 & 32) != 0) {
                        int i17 = o0oO0O0o.f47152o00OOOo;
                        j6 = o0oO0O0o.f46985Oooo0oo;
                        i3 &= -458753;
                    } else {
                        j6 = j4;
                    }
                    if (i6 != 0) {
                        fM3765constructorimpl2 = Dp.m3765constructorimpl(6);
                    } else {
                        fM3765constructorimpl2 = f2;
                    }
                    if (i8 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    j7 = sp;
                    f4 = fM3765constructorimpl;
                    j8 = j6;
                    j9 = j5;
                    float f9 = fM3765constructorimpl2;
                    i10 = i3;
                    modifier3 = modifier2;
                    f5 = f9;
                } else {
                    if (i11 != 0) {
                        sp = TextUnitKt.getSp(11);
                    } else {
                        sp = j;
                    }
                    if ((i2 & 8) != 0) {
                        int i18 = o0oO0O0o.f47152o00OOOo;
                        j5 = o0oO0O0o.f46983Oooo0o0;
                        i3 &= -7169;
                    } else {
                        j5 = j2;
                    }
                    if (i4 != 0) {
                        fM3765constructorimpl = Dp.m3765constructorimpl(16);
                    } else {
                        fM3765constructorimpl = f3;
                    }
                    if ((i2 & 32) != 0) {
                        int i19 = o0oO0O0o.f47152o00OOOo;
                        j6 = o0oO0O0o.f46985Oooo0oo;
                        i3 &= -458753;
                    } else {
                        j6 = j4;
                    }
                    if (i6 != 0) {
                        fM3765constructorimpl2 = Dp.m3765constructorimpl(6);
                    } else {
                        fM3765constructorimpl2 = f2;
                    }
                    if (i8 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    j7 = sp;
                    f4 = fM3765constructorimpl;
                    j8 = j6;
                    j9 = j5;
                    float f10 = fM3765constructorimpl2;
                    i10 = i3;
                    modifier3 = modifier2;
                    f5 = f10;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1957067506, i10, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserAuthor (UserComp.kt:808)");
                }
                if (z) {
                    composer2 = composerStartRestartGroup;
                } else {
                    if (str != null) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        Modifier.Companion companion4 = Modifier.INSTANCE;
                        Modifier modifierM478paddingVpY3zN4$default2 = PaddingKt.m478paddingVpY3zN4$default(BackgroundKt.m169backgroundbw27NRU$default(ClipKt.clip(SizeKt.m509height3ABfNKs(companion4, f4), RoundedCornerShapeKt.RoundedCornerShape(50)), j8, null, 2, null), f5, 0.0f, 2, null);
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        Alignment.Companion companion5 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyOooO00o2 = p018OooOoo0.OooOOO.OooO00o(companion5, false, composerStartRestartGroup, 0, -1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                        constructor = companion6.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM478paddingVpY3zN4$default2);
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
                        function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion6, composerM1309constructorimpl, measurePolicyOooO00o2, composerM1309constructorimpl, currentCompositionLocalMap2);
                        if (composerM1309constructorimpl.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        int i110 = i10 >> 3;
                        composer2 = composerStartRestartGroup;
                        TextKt.m1251Text4IGK_g(str, BoxScopeInstance.INSTANCE.align(companion4.then(modifier3), companion5.getCenter()), j9, j7, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i110 & 896) | (i110 & 14) | ((i10 << 3) & 7168), 0, 130544);
                        p426o0OoOO.o000oOoO.OooO00o(composer2);
                    } else {
                        composer2 = composerStartRestartGroup;
                    }
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                f6 = f4;
                j10 = j7;
                j11 = j9;
                j12 = j8;
                f7 = f5;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        sp = TextUnitKt.getSp(11);
                    } else {
                        sp = j;
                    }
                    if ((i2 & 8) != 0) {
                        int i111 = o0oO0O0o.f47152o00OOOo;
                        j5 = o0oO0O0o.f46983Oooo0o0;
                        i3 &= -7169;
                    } else {
                        j5 = j2;
                    }
                    if (i4 != 0) {
                        fM3765constructorimpl = Dp.m3765constructorimpl(16);
                    } else {
                        fM3765constructorimpl = f3;
                    }
                    if ((i2 & 32) != 0) {
                        int i112 = o0oO0O0o.f47152o00OOOo;
                        j6 = o0oO0O0o.f46985Oooo0oo;
                        i3 &= -458753;
                    } else {
                        j6 = j4;
                    }
                    if (i6 != 0) {
                        fM3765constructorimpl2 = Dp.m3765constructorimpl(6);
                    } else {
                        fM3765constructorimpl2 = f2;
                    }
                    if (i8 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    j7 = sp;
                    f4 = fM3765constructorimpl;
                    j8 = j6;
                    j9 = j5;
                    float f11 = fM3765constructorimpl2;
                    i10 = i3;
                    modifier3 = modifier2;
                    f5 = f11;
                } else {
                    if (i11 != 0) {
                        sp = TextUnitKt.getSp(11);
                    } else {
                        sp = j;
                    }
                    if ((i2 & 8) != 0) {
                        int i113 = o0oO0O0o.f47152o00OOOo;
                        j5 = o0oO0O0o.f46983Oooo0o0;
                        i3 &= -7169;
                    } else {
                        j5 = j2;
                    }
                    if (i4 != 0) {
                        fM3765constructorimpl = Dp.m3765constructorimpl(16);
                    } else {
                        fM3765constructorimpl = f3;
                    }
                    if ((i2 & 32) != 0) {
                        int i114 = o0oO0O0o.f47152o00OOOo;
                        j6 = o0oO0O0o.f46985Oooo0oo;
                        i3 &= -458753;
                    } else {
                        j6 = j4;
                    }
                    if (i6 != 0) {
                        fM3765constructorimpl2 = Dp.m3765constructorimpl(6);
                    } else {
                        fM3765constructorimpl2 = f2;
                    }
                    if (i8 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    j7 = sp;
                    f4 = fM3765constructorimpl;
                    j8 = j6;
                    j9 = j5;
                    float f12 = fM3765constructorimpl2;
                    i10 = i3;
                    modifier3 = modifier2;
                    f5 = f12;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1957067506, i10, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserAuthor (UserComp.kt:808)");
                }
                if (z) {
                    composer2 = composerStartRestartGroup;
                } else {
                    if (str != null) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        Modifier.Companion companion7 = Modifier.INSTANCE;
                        Modifier modifierM478paddingVpY3zN4$default3 = PaddingKt.m478paddingVpY3zN4$default(BackgroundKt.m169backgroundbw27NRU$default(ClipKt.clip(SizeKt.m509height3ABfNKs(companion7, f4), RoundedCornerShapeKt.RoundedCornerShape(50)), j8, null, 2, null), f5, 0.0f, 2, null);
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        Alignment.Companion companion8 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyOooO00o3 = p018OooOoo0.OooOOO.OooO00o(companion8, false, composerStartRestartGroup, 0, -1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
                        constructor = companion9.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM478paddingVpY3zN4$default3);
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
                        function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion9, composerM1309constructorimpl, measurePolicyOooO00o3, composerM1309constructorimpl, currentCompositionLocalMap3);
                        if (composerM1309constructorimpl.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        int i115 = i10 >> 3;
                        composer2 = composerStartRestartGroup;
                        TextKt.m1251Text4IGK_g(str, BoxScopeInstance.INSTANCE.align(companion7.then(modifier3), companion8.getCenter()), j9, j7, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i115 & 896) | (i115 & 14) | ((i10 << 3) & 7168), 0, 130544);
                        p426o0OoOO.o000oOoO.OooO00o(composer2);
                    } else {
                        composer2 = composerStartRestartGroup;
                    }
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                f6 = f4;
                j10 = j7;
                j11 = j9;
                j12 = j8;
                f7 = f5;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0(z, str, j10, j11, f6, j12, f7, modifier4, i, i2));
        }
        i3 |= 384;
        if ((i & 7168) != 0) {
            i3 |= ((i2 & 8) == 0 || !composerStartRestartGroup.changed(j2)) ? LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY : 2048;
        }
        i4 = i2 & 16;
        if (i4 != 0) {
            if ((57344 & i) == 0) {
                f3 = f;
                if (composerStartRestartGroup.changed(f3)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i3 |= i5;
            }
            if ((458752 & i) == 0) {
                if ((i2 & 32) == 0) {
                    j4 = j3;
                    if (composerStartRestartGroup.changed(j4)) {
                    }
                    i3 |= i12;
                } else {
                    j4 = j3;
                }
                i3 |= i12;
            } else {
                j4 = j3;
            }
            i6 = i2 & 64;
            if (i6 != 0) {
                i3 |= 1572864;
            } else if ((i & 3670016) == 0) {
                if (composerStartRestartGroup.changed(f2)) {
                    i7 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i7 = 524288;
                }
                i3 |= i7;
            }
            i8 = i2 & 128;
            if (i8 != 0) {
                i3 |= 12582912;
            } else if ((i & 29360128) == 0) {
                if (composerStartRestartGroup.changed(modifier)) {
                    i9 = 8388608;
                } else {
                    i9 = Configuration.BLOCK_SIZE;
                }
                i3 |= i9;
            }
            if ((i3 & 23967451) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        sp = TextUnitKt.getSp(11);
                    } else {
                        sp = j;
                    }
                    if ((i2 & 8) != 0) {
                        int i116 = o0oO0O0o.f47152o00OOOo;
                        j5 = o0oO0O0o.f46983Oooo0o0;
                        i3 &= -7169;
                    } else {
                        j5 = j2;
                    }
                    if (i4 != 0) {
                        fM3765constructorimpl = Dp.m3765constructorimpl(16);
                    } else {
                        fM3765constructorimpl = f3;
                    }
                    if ((i2 & 32) != 0) {
                        int i117 = o0oO0O0o.f47152o00OOOo;
                        j6 = o0oO0O0o.f46985Oooo0oo;
                        i3 &= -458753;
                    } else {
                        j6 = j4;
                    }
                    if (i6 != 0) {
                        fM3765constructorimpl2 = Dp.m3765constructorimpl(6);
                    } else {
                        fM3765constructorimpl2 = f2;
                    }
                    if (i8 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    j7 = sp;
                    f4 = fM3765constructorimpl;
                    j8 = j6;
                    j9 = j5;
                    float f13 = fM3765constructorimpl2;
                    i10 = i3;
                    modifier3 = modifier2;
                    f5 = f13;
                } else {
                    if (i11 != 0) {
                        sp = TextUnitKt.getSp(11);
                    } else {
                        sp = j;
                    }
                    if ((i2 & 8) != 0) {
                        int i118 = o0oO0O0o.f47152o00OOOo;
                        j5 = o0oO0O0o.f46983Oooo0o0;
                        i3 &= -7169;
                    } else {
                        j5 = j2;
                    }
                    if (i4 != 0) {
                        fM3765constructorimpl = Dp.m3765constructorimpl(16);
                    } else {
                        fM3765constructorimpl = f3;
                    }
                    if ((i2 & 32) != 0) {
                        int i119 = o0oO0O0o.f47152o00OOOo;
                        j6 = o0oO0O0o.f46985Oooo0oo;
                        i3 &= -458753;
                    } else {
                        j6 = j4;
                    }
                    if (i6 != 0) {
                        fM3765constructorimpl2 = Dp.m3765constructorimpl(6);
                    } else {
                        fM3765constructorimpl2 = f2;
                    }
                    if (i8 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    j7 = sp;
                    f4 = fM3765constructorimpl;
                    j8 = j6;
                    j9 = j5;
                    float f14 = fM3765constructorimpl2;
                    i10 = i3;
                    modifier3 = modifier2;
                    f5 = f14;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1957067506, i10, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserAuthor (UserComp.kt:808)");
                }
                if (z) {
                    composer2 = composerStartRestartGroup;
                } else {
                    if (str != null) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        Modifier.Companion companion10 = Modifier.INSTANCE;
                        Modifier modifierM478paddingVpY3zN4$default4 = PaddingKt.m478paddingVpY3zN4$default(BackgroundKt.m169backgroundbw27NRU$default(ClipKt.clip(SizeKt.m509height3ABfNKs(companion10, f4), RoundedCornerShapeKt.RoundedCornerShape(50)), j8, null, 2, null), f5, 0.0f, 2, null);
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        Alignment.Companion companion11 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyOooO00o4 = p018OooOoo0.OooOOO.OooO00o(companion11, false, composerStartRestartGroup, 0, -1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion12 = ComposeUiNode.INSTANCE;
                        constructor = companion12.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierM478paddingVpY3zN4$default4);
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
                        function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion12, composerM1309constructorimpl, measurePolicyOooO00o4, composerM1309constructorimpl, currentCompositionLocalMap4);
                        if (composerM1309constructorimpl.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf4, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        int i1110 = i10 >> 3;
                        composer2 = composerStartRestartGroup;
                        TextKt.m1251Text4IGK_g(str, BoxScopeInstance.INSTANCE.align(companion10.then(modifier3), companion11.getCenter()), j9, j7, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i1110 & 896) | (i1110 & 14) | ((i10 << 3) & 7168), 0, 130544);
                        p426o0OoOO.o000oOoO.OooO00o(composer2);
                    } else {
                        composer2 = composerStartRestartGroup;
                    }
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                f6 = f4;
                j10 = j7;
                j11 = j9;
                j12 = j8;
                f7 = f5;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        sp = TextUnitKt.getSp(11);
                    } else {
                        sp = j;
                    }
                    if ((i2 & 8) != 0) {
                        int i1111 = o0oO0O0o.f47152o00OOOo;
                        j5 = o0oO0O0o.f46983Oooo0o0;
                        i3 &= -7169;
                    } else {
                        j5 = j2;
                    }
                    if (i4 != 0) {
                        fM3765constructorimpl = Dp.m3765constructorimpl(16);
                    } else {
                        fM3765constructorimpl = f3;
                    }
                    if ((i2 & 32) != 0) {
                        int i1112 = o0oO0O0o.f47152o00OOOo;
                        j6 = o0oO0O0o.f46985Oooo0oo;
                        i3 &= -458753;
                    } else {
                        j6 = j4;
                    }
                    if (i6 != 0) {
                        fM3765constructorimpl2 = Dp.m3765constructorimpl(6);
                    } else {
                        fM3765constructorimpl2 = f2;
                    }
                    if (i8 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    j7 = sp;
                    f4 = fM3765constructorimpl;
                    j8 = j6;
                    j9 = j5;
                    float f15 = fM3765constructorimpl2;
                    i10 = i3;
                    modifier3 = modifier2;
                    f5 = f15;
                } else {
                    if (i11 != 0) {
                        sp = TextUnitKt.getSp(11);
                    } else {
                        sp = j;
                    }
                    if ((i2 & 8) != 0) {
                        int i1113 = o0oO0O0o.f47152o00OOOo;
                        j5 = o0oO0O0o.f46983Oooo0o0;
                        i3 &= -7169;
                    } else {
                        j5 = j2;
                    }
                    if (i4 != 0) {
                        fM3765constructorimpl = Dp.m3765constructorimpl(16);
                    } else {
                        fM3765constructorimpl = f3;
                    }
                    if ((i2 & 32) != 0) {
                        int i1114 = o0oO0O0o.f47152o00OOOo;
                        j6 = o0oO0O0o.f46985Oooo0oo;
                        i3 &= -458753;
                    } else {
                        j6 = j4;
                    }
                    if (i6 != 0) {
                        fM3765constructorimpl2 = Dp.m3765constructorimpl(6);
                    } else {
                        fM3765constructorimpl2 = f2;
                    }
                    if (i8 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    j7 = sp;
                    f4 = fM3765constructorimpl;
                    j8 = j6;
                    j9 = j5;
                    float f16 = fM3765constructorimpl2;
                    i10 = i3;
                    modifier3 = modifier2;
                    f5 = f16;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1957067506, i10, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserAuthor (UserComp.kt:808)");
                }
                if (z) {
                    composer2 = composerStartRestartGroup;
                } else {
                    if (str != null) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        Modifier.Companion companion13 = Modifier.INSTANCE;
                        Modifier modifierM478paddingVpY3zN4$default5 = PaddingKt.m478paddingVpY3zN4$default(BackgroundKt.m169backgroundbw27NRU$default(ClipKt.clip(SizeKt.m509height3ABfNKs(companion13, f4), RoundedCornerShapeKt.RoundedCornerShape(50)), j8, null, 2, null), f5, 0.0f, 2, null);
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        Alignment.Companion companion14 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyOooO00o5 = p018OooOoo0.OooOOO.OooO00o(companion14, false, composerStartRestartGroup, 0, -1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion15 = ComposeUiNode.INSTANCE;
                        constructor = companion15.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierM478paddingVpY3zN4$default5);
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
                        function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion15, composerM1309constructorimpl, measurePolicyOooO00o5, composerM1309constructorimpl, currentCompositionLocalMap5);
                        if (composerM1309constructorimpl.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf5, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        int i1115 = i10 >> 3;
                        composer2 = composerStartRestartGroup;
                        TextKt.m1251Text4IGK_g(str, BoxScopeInstance.INSTANCE.align(companion13.then(modifier3), companion14.getCenter()), j9, j7, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i1115 & 896) | (i1115 & 14) | ((i10 << 3) & 7168), 0, 130544);
                        p426o0OoOO.o000oOoO.OooO00o(composer2);
                    } else {
                        composer2 = composerStartRestartGroup;
                    }
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                f6 = f4;
                j10 = j7;
                j11 = j9;
                j12 = j8;
                f7 = f5;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0(z, str, j10, j11, f6, j12, f7, modifier4, i, i2));
        }
        i3 |= 24576;
        f3 = f;
        if ((458752 & i) == 0) {
            if ((i2 & 32) == 0) {
                j4 = j3;
                if (composerStartRestartGroup.changed(j4)) {
                }
                i3 |= i12;
            } else {
                j4 = j3;
            }
            i3 |= i12;
        } else {
            j4 = j3;
        }
        i6 = i2 & 64;
        if (i6 != 0) {
            i3 |= 1572864;
        } else if ((i & 3670016) == 0) {
            if (composerStartRestartGroup.changed(f2)) {
                i7 = ZegoConstants.ErrorMask.RoomServerErrorMask;
            } else {
                i7 = 524288;
            }
            i3 |= i7;
        }
        i8 = i2 & 128;
        if (i8 != 0) {
            i3 |= 12582912;
        } else if ((i & 29360128) == 0) {
            if (composerStartRestartGroup.changed(modifier)) {
                i9 = 8388608;
            } else {
                i9 = Configuration.BLOCK_SIZE;
            }
            i3 |= i9;
        }
        if ((i3 & 23967451) == 4793490) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i11 != 0) {
                    sp = TextUnitKt.getSp(11);
                } else {
                    sp = j;
                }
                if ((i2 & 8) != 0) {
                    int i1116 = o0oO0O0o.f47152o00OOOo;
                    j5 = o0oO0O0o.f46983Oooo0o0;
                    i3 &= -7169;
                } else {
                    j5 = j2;
                }
                if (i4 != 0) {
                    fM3765constructorimpl = Dp.m3765constructorimpl(16);
                } else {
                    fM3765constructorimpl = f3;
                }
                if ((i2 & 32) != 0) {
                    int i1117 = o0oO0O0o.f47152o00OOOo;
                    j6 = o0oO0O0o.f46985Oooo0oo;
                    i3 &= -458753;
                } else {
                    j6 = j4;
                }
                if (i6 != 0) {
                    fM3765constructorimpl2 = Dp.m3765constructorimpl(6);
                } else {
                    fM3765constructorimpl2 = f2;
                }
                if (i8 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                j7 = sp;
                f4 = fM3765constructorimpl;
                j8 = j6;
                j9 = j5;
                float f17 = fM3765constructorimpl2;
                i10 = i3;
                modifier3 = modifier2;
                f5 = f17;
            } else {
                if (i11 != 0) {
                    sp = TextUnitKt.getSp(11);
                } else {
                    sp = j;
                }
                if ((i2 & 8) != 0) {
                    int i1118 = o0oO0O0o.f47152o00OOOo;
                    j5 = o0oO0O0o.f46983Oooo0o0;
                    i3 &= -7169;
                } else {
                    j5 = j2;
                }
                if (i4 != 0) {
                    fM3765constructorimpl = Dp.m3765constructorimpl(16);
                } else {
                    fM3765constructorimpl = f3;
                }
                if ((i2 & 32) != 0) {
                    int i1119 = o0oO0O0o.f47152o00OOOo;
                    j6 = o0oO0O0o.f46985Oooo0oo;
                    i3 &= -458753;
                } else {
                    j6 = j4;
                }
                if (i6 != 0) {
                    fM3765constructorimpl2 = Dp.m3765constructorimpl(6);
                } else {
                    fM3765constructorimpl2 = f2;
                }
                if (i8 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                j7 = sp;
                f4 = fM3765constructorimpl;
                j8 = j6;
                j9 = j5;
                float f18 = fM3765constructorimpl2;
                i10 = i3;
                modifier3 = modifier2;
                f5 = f18;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1957067506, i10, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserAuthor (UserComp.kt:808)");
            }
            if (z) {
                composer2 = composerStartRestartGroup;
            } else {
                if (str != null) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                if (z2) {
                    Modifier.Companion companion16 = Modifier.INSTANCE;
                    Modifier modifierM478paddingVpY3zN4$default6 = PaddingKt.m478paddingVpY3zN4$default(BackgroundKt.m169backgroundbw27NRU$default(ClipKt.clip(SizeKt.m509height3ABfNKs(companion16, f4), RoundedCornerShapeKt.RoundedCornerShape(50)), j8, null, 2, null), f5, 0.0f, 2, null);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    Alignment.Companion companion17 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyOooO00o6 = p018OooOoo0.OooOOO.OooO00o(companion17, false, composerStartRestartGroup, 0, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion18 = ComposeUiNode.INSTANCE;
                    constructor = companion18.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierM478paddingVpY3zN4$default6);
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
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion18, composerM1309constructorimpl, measurePolicyOooO00o6, composerM1309constructorimpl, currentCompositionLocalMap6);
                    if (composerM1309constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf6, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    int i11110 = i10 >> 3;
                    composer2 = composerStartRestartGroup;
                    TextKt.m1251Text4IGK_g(str, BoxScopeInstance.INSTANCE.align(companion16.then(modifier3), companion17.getCenter()), j9, j7, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i11110 & 896) | (i11110 & 14) | ((i10 << 3) & 7168), 0, 130544);
                    p426o0OoOO.o000oOoO.OooO00o(composer2);
                } else {
                    composer2 = composerStartRestartGroup;
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            f6 = f4;
            j10 = j7;
            j11 = j9;
            j12 = j8;
            f7 = f5;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i11 != 0) {
                    sp = TextUnitKt.getSp(11);
                } else {
                    sp = j;
                }
                if ((i2 & 8) != 0) {
                    int i11111 = o0oO0O0o.f47152o00OOOo;
                    j5 = o0oO0O0o.f46983Oooo0o0;
                    i3 &= -7169;
                } else {
                    j5 = j2;
                }
                if (i4 != 0) {
                    fM3765constructorimpl = Dp.m3765constructorimpl(16);
                } else {
                    fM3765constructorimpl = f3;
                }
                if ((i2 & 32) != 0) {
                    int i11112 = o0oO0O0o.f47152o00OOOo;
                    j6 = o0oO0O0o.f46985Oooo0oo;
                    i3 &= -458753;
                } else {
                    j6 = j4;
                }
                if (i6 != 0) {
                    fM3765constructorimpl2 = Dp.m3765constructorimpl(6);
                } else {
                    fM3765constructorimpl2 = f2;
                }
                if (i8 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                j7 = sp;
                f4 = fM3765constructorimpl;
                j8 = j6;
                j9 = j5;
                float f19 = fM3765constructorimpl2;
                i10 = i3;
                modifier3 = modifier2;
                f5 = f19;
            } else {
                if (i11 != 0) {
                    sp = TextUnitKt.getSp(11);
                } else {
                    sp = j;
                }
                if ((i2 & 8) != 0) {
                    int i11113 = o0oO0O0o.f47152o00OOOo;
                    j5 = o0oO0O0o.f46983Oooo0o0;
                    i3 &= -7169;
                } else {
                    j5 = j2;
                }
                if (i4 != 0) {
                    fM3765constructorimpl = Dp.m3765constructorimpl(16);
                } else {
                    fM3765constructorimpl = f3;
                }
                if ((i2 & 32) != 0) {
                    int i11114 = o0oO0O0o.f47152o00OOOo;
                    j6 = o0oO0O0o.f46985Oooo0oo;
                    i3 &= -458753;
                } else {
                    j6 = j4;
                }
                if (i6 != 0) {
                    fM3765constructorimpl2 = Dp.m3765constructorimpl(6);
                } else {
                    fM3765constructorimpl2 = f2;
                }
                if (i8 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                j7 = sp;
                f4 = fM3765constructorimpl;
                j8 = j6;
                j9 = j5;
                float f110 = fM3765constructorimpl2;
                i10 = i3;
                modifier3 = modifier2;
                f5 = f110;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1957067506, i10, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserAuthor (UserComp.kt:808)");
            }
            if (z) {
                composer2 = composerStartRestartGroup;
            } else {
                if (str != null) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                if (z2) {
                    Modifier.Companion companion19 = Modifier.INSTANCE;
                    Modifier modifierM478paddingVpY3zN4$default7 = PaddingKt.m478paddingVpY3zN4$default(BackgroundKt.m169backgroundbw27NRU$default(ClipKt.clip(SizeKt.m509height3ABfNKs(companion19, f4), RoundedCornerShapeKt.RoundedCornerShape(50)), j8, null, 2, null), f5, 0.0f, 2, null);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    Alignment.Companion companion110 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyOooO00o7 = p018OooOoo0.OooOOO.OooO00o(companion110, false, composerStartRestartGroup, 0, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion111 = ComposeUiNode.INSTANCE;
                    constructor = companion111.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(modifierM478paddingVpY3zN4$default7);
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
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion111, composerM1309constructorimpl, measurePolicyOooO00o7, composerM1309constructorimpl, currentCompositionLocalMap7);
                    if (composerM1309constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf7, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    int i11115 = i10 >> 3;
                    composer2 = composerStartRestartGroup;
                    TextKt.m1251Text4IGK_g(str, BoxScopeInstance.INSTANCE.align(companion19.then(modifier3), companion110.getCenter()), j9, j7, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i11115 & 896) | (i11115 & 14) | ((i10 << 3) & 7168), 0, 130544);
                    p426o0OoOO.o000oOoO.OooO00o(composer2);
                } else {
                    composer2 = composerStartRestartGroup;
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            f6 = f4;
            j10 = j7;
            j11 = j9;
            j12 = j8;
            f7 = f5;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0(z, str, j10, j11, f6, j12, f7, modifier4, i, i2));
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0052 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    /* JADX WARN: Code duplicated, block: B:35:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0o(@Nullable Integer num, @Nullable Modifier modifier, @Nullable Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2;
        Composer composerStartRestartGroup = composer.startRestartGroup(52372365);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = i | (composerStartRestartGroup.changed(num) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 112) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 91) == 18 || !composerStartRestartGroup.getSkipping()) {
                if (i4 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(52372365, i3, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserCountryView (UserComp.kt:487)");
                }
                if (num != null || num.intValue() == 0) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO0(num, modifier3, i, i2));
                    return;
                }
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                boolean zChanged = composerStartRestartGroup.changed(num);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = p591o0oo000O.OooO.OooO00o(num.toString());
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                ImageKt.Image(p417o0OoO0.o00Oo0.OooO0OO((String) objRememberedValue, null, composerStartRestartGroup, 0, 1), (String) null, SizeKt.m525sizeVpY3zN4(Modifier.INSTANCE.then(modifier3), Dp.m3765constructorimpl(21), Dp.m3765constructorimpl(14)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 48, 120);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup2 == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup2.updateScope(new OooOOO(num, modifier4, i, i2));
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 91) == 18) {
            if (i4 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(52372365, i3, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserCountryView (UserComp.kt:487)");
            }
            if (num != null) {
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO0(num, modifier3, i, i2));
            return;
        }
        if (i4 != 0) {
            modifier3 = Modifier.INSTANCE;
        } else {
            modifier3 = modifier2;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(52372365, i3, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserCountryView (UserComp.kt:487)");
        }
        if (num != null) {
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO0(num, modifier3, i, i2));
        return;
        scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new OooOOO(num, modifier4, i, i2));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0125  */
    /* JADX WARN: Code duplicated, block: B:102:0x0130  */
    /* JADX WARN: Code duplicated, block: B:107:0x013a  */
    /* JADX WARN: Code duplicated, block: B:108:0x0141  */
    /* JADX WARN: Code duplicated, block: B:111:0x0184  */
    /* JADX WARN: Code duplicated, block: B:116:0x0196  */
    /* JADX WARN: Code duplicated, block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x007a  */
    /* JADX WARN: Code duplicated, block: B:49:0x007d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0083  */
    /* JADX WARN: Code duplicated, block: B:53:0x008b  */
    /* JADX WARN: Code duplicated, block: B:54:0x008e  */
    /* JADX WARN: Code duplicated, block: B:59:0x0098  */
    /* JADX WARN: Code duplicated, block: B:60:0x009c  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:85:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:92:0x0107  */
    /* JADX WARN: Code duplicated, block: B:94:0x0110  */
    /* JADX WARN: Code duplicated, block: B:96:0x0113  */
    /* JADX WARN: Code duplicated, block: B:97:0x0119 A[PHI: r3 r4 r6 r9 r12
      0x0119: PHI (r3v24 int) = (r3v18 int), (r3v26 int), (r3v27 int) binds: [B:95:0x0111, B:83:0x00e6, B:84:0x00e8] A[DONT_GENERATE, DONT_INLINE]
      0x0119: PHI (r4v6 long) = (r4v3 long), (r4v2 long), (r4v2 long) binds: [B:95:0x0111, B:83:0x00e6, B:84:0x00e8] A[DONT_GENERATE, DONT_INLINE]
      0x0119: PHI (r6v7 long) = (r6v3 long), (r6v2 long), (r6v2 long) binds: [B:95:0x0111, B:83:0x00e6, B:84:0x00e8] A[DONT_GENERATE, DONT_INLINE]
      0x0119: PHI (r9v7 int) = (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:95:0x0111, B:83:0x00e6, B:84:0x00e8] A[DONT_GENERATE, DONT_INLINE]
      0x0119: PHI (r12v13 int) = (r12v4 int), (r12v3 int), (r12v3 int) binds: [B:95:0x0111, B:83:0x00e6, B:84:0x00e8] A[DONT_GENERATE, DONT_INLINE]] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0o0(@Nullable String str, long j, long j2, int i, int i2, @Nullable Modifier modifier, @Nullable Composer composer, int i3, int i4) {
        int i5;
        long j3;
        long jOooO0OO;
        int iM3719getEllipsisgIe3tQ8;
        int i6;
        int i7;
        int i8;
        int i9;
        Modifier modifier2;
        int i10;
        boolean z;
        int i11;
        Modifier modifier3;
        int i12;
        String strOooO0OO;
        int i13;
        Modifier modifier4;
        long j4;
        long j5;
        int i14;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1545649145);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i5 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 112) == 0) {
            if ((i4 & 2) == 0) {
                j3 = j;
                int i15 = composerStartRestartGroup.changed(j3) ? 32 : 16;
                i5 |= i15;
            } else {
                j3 = j;
            }
            i5 |= i15;
        } else {
            j3 = j;
        }
        if ((i3 & 896) == 0) {
            if ((i4 & 4) == 0) {
                jOooO0OO = j2;
                int i16 = composerStartRestartGroup.changed(jOooO0OO) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
                i5 |= i16;
            } else {
                jOooO0OO = j2;
            }
            i5 |= i16;
        } else {
            jOooO0OO = j2;
        }
        int i17 = i4 & 8;
        if (i17 == 0) {
            if ((i3 & 7168) == 0) {
                iM3719getEllipsisgIe3tQ8 = i;
                i5 |= composerStartRestartGroup.changed(iM3719getEllipsisgIe3tQ8) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            }
            i6 = i4 & 16;
            if (i6 != 0) {
                if ((57344 & i3) == 0) {
                    i7 = i2;
                    if (composerStartRestartGroup.changed(i7)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i5 |= i8;
                }
                i9 = i4 & 32;
                if (i9 != 0) {
                    if ((458752 & i3) == 0) {
                        modifier2 = modifier;
                        if (composerStartRestartGroup.changed(modifier2)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i5 |= i10;
                    }
                    if ((374491 & i5) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        z = true;
                        if ((i3 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if ((i4 & 2) != 0) {
                                j3 = p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o;
                                i5 &= -113;
                            }
                            if ((i4 & 4) != 0) {
                                jOooO0OO = com.code.android.util.o0000O0.OooO0OO(13, composerStartRestartGroup, 6);
                                i5 &= -897;
                            }
                            if (i17 != 0) {
                                iM3719getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m3719getEllipsisgIe3tQ8();
                            }
                            if (i6 != 0) {
                                i7 = 1;
                            }
                            if (i9 != 0) {
                                i11 = i5;
                                modifier3 = Modifier.INSTANCE;
                                i12 = i7;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1545649145, i11, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserBioView (UserComp.kt:216)");
                            }
                            if (str != null && !StringsKt.isBlank(str)) {
                                z = false;
                            }
                            if (z) {
                                strOooO0OO = o0000.OooO0OO(oO00OOo0.Userinfo_Sign_Hint);
                            } else {
                                strOooO0OO = str;
                            }
                            int i18 = i11 << 3;
                            TextKt.m1251Text4IGK_g(strOooO0OO, modifier3, j3, jOooO0OO, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, iM3719getEllipsisgIe3tQ8, false, i12, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i11 >> 12) & 112) | (i18 & 896) | (i18 & 7168), ((i11 >> 6) & 112) | ((i11 >> 3) & 7168), 120816);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            i13 = i12;
                            int i19 = iM3719getEllipsisgIe3tQ8;
                            modifier4 = modifier3;
                            j4 = j3;
                            j5 = jOooO0OO;
                            i14 = i19;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i4 & 2) != 0) {
                                i5 &= -113;
                            }
                            if ((i4 & 4) != 0) {
                                i5 &= -897;
                            }
                        }
                        i11 = i5;
                        i12 = i7;
                        modifier3 = modifier2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1545649145, i11, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserBioView (UserComp.kt:216)");
                        }
                        if (str != null) {
                            z = false;
                        }
                        if (z) {
                            strOooO0OO = o0000.OooO0OO(oO00OOo0.Userinfo_Sign_Hint);
                        } else {
                            strOooO0OO = str;
                        }
                        int i110 = i11 << 3;
                        TextKt.m1251Text4IGK_g(strOooO0OO, modifier3, j3, jOooO0OO, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, iM3719getEllipsisgIe3tQ8, false, i12, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i11 >> 12) & 112) | (i110 & 896) | (i110 & 7168), ((i11 >> 6) & 112) | ((i11 >> 3) & 7168), 120816);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        i13 = i12;
                        int i111 = iM3719getEllipsisgIe3tQ8;
                        modifier4 = modifier3;
                        j4 = j3;
                        j5 = jOooO0OO;
                        i14 = i111;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        j4 = j3;
                        j5 = jOooO0OO;
                        i14 = iM3719getEllipsisgIe3tQ8;
                        i13 = i7;
                        modifier4 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0O(str, j4, j5, i14, i13, modifier4, i3, i4));
                }
                i5 |= 196608;
                modifier2 = modifier;
                if ((374491 & i5) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    z = true;
                    if ((i3 & 1) != 0) {
                        if ((i4 & 2) != 0) {
                            j3 = p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o;
                            i5 &= -113;
                        }
                        if ((i4 & 4) != 0) {
                            jOooO0OO = com.code.android.util.o0000O0.OooO0OO(13, composerStartRestartGroup, 6);
                            i5 &= -897;
                        }
                        if (i17 != 0) {
                            iM3719getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m3719getEllipsisgIe3tQ8();
                        }
                        if (i6 != 0) {
                            i7 = 1;
                        }
                        if (i9 != 0) {
                            i11 = i5;
                            modifier3 = Modifier.INSTANCE;
                            i12 = i7;
                        } else {
                            i11 = i5;
                            i12 = i7;
                            modifier3 = modifier2;
                        }
                    } else {
                        if ((i4 & 2) != 0) {
                            j3 = p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o;
                            i5 &= -113;
                        }
                        if ((i4 & 4) != 0) {
                            jOooO0OO = com.code.android.util.o0000O0.OooO0OO(13, composerStartRestartGroup, 6);
                            i5 &= -897;
                        }
                        if (i17 != 0) {
                            iM3719getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m3719getEllipsisgIe3tQ8();
                        }
                        if (i6 != 0) {
                            i7 = 1;
                        }
                        if (i9 != 0) {
                            i11 = i5;
                            modifier3 = Modifier.INSTANCE;
                            i12 = i7;
                        } else {
                            i11 = i5;
                            i12 = i7;
                            modifier3 = modifier2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1545649145, i11, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserBioView (UserComp.kt:216)");
                    }
                    if (str != null) {
                        z = false;
                    }
                    if (z) {
                        strOooO0OO = o0000.OooO0OO(oO00OOo0.Userinfo_Sign_Hint);
                    } else {
                        strOooO0OO = str;
                    }
                    int i112 = i11 << 3;
                    TextKt.m1251Text4IGK_g(strOooO0OO, modifier3, j3, jOooO0OO, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, iM3719getEllipsisgIe3tQ8, false, i12, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i11 >> 12) & 112) | (i112 & 896) | (i112 & 7168), ((i11 >> 6) & 112) | ((i11 >> 3) & 7168), 120816);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i13 = i12;
                    int i113 = iM3719getEllipsisgIe3tQ8;
                    modifier4 = modifier3;
                    j4 = j3;
                    j5 = jOooO0OO;
                    i14 = i113;
                } else {
                    composerStartRestartGroup.startDefaults();
                    z = true;
                    if ((i3 & 1) != 0) {
                        if ((i4 & 2) != 0) {
                            j3 = p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o;
                            i5 &= -113;
                        }
                        if ((i4 & 4) != 0) {
                            jOooO0OO = com.code.android.util.o0000O0.OooO0OO(13, composerStartRestartGroup, 6);
                            i5 &= -897;
                        }
                        if (i17 != 0) {
                            iM3719getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m3719getEllipsisgIe3tQ8();
                        }
                        if (i6 != 0) {
                            i7 = 1;
                        }
                        if (i9 != 0) {
                            i11 = i5;
                            modifier3 = Modifier.INSTANCE;
                            i12 = i7;
                        } else {
                            i11 = i5;
                            i12 = i7;
                            modifier3 = modifier2;
                        }
                    } else {
                        if ((i4 & 2) != 0) {
                            j3 = p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o;
                            i5 &= -113;
                        }
                        if ((i4 & 4) != 0) {
                            jOooO0OO = com.code.android.util.o0000O0.OooO0OO(13, composerStartRestartGroup, 6);
                            i5 &= -897;
                        }
                        if (i17 != 0) {
                            iM3719getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m3719getEllipsisgIe3tQ8();
                        }
                        if (i6 != 0) {
                            i7 = 1;
                        }
                        if (i9 != 0) {
                            i11 = i5;
                            modifier3 = Modifier.INSTANCE;
                            i12 = i7;
                        } else {
                            i11 = i5;
                            i12 = i7;
                            modifier3 = modifier2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1545649145, i11, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserBioView (UserComp.kt:216)");
                    }
                    if (str != null) {
                        z = false;
                    }
                    if (z) {
                        strOooO0OO = o0000.OooO0OO(oO00OOo0.Userinfo_Sign_Hint);
                    } else {
                        strOooO0OO = str;
                    }
                    int i114 = i11 << 3;
                    TextKt.m1251Text4IGK_g(strOooO0OO, modifier3, j3, jOooO0OO, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, iM3719getEllipsisgIe3tQ8, false, i12, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i11 >> 12) & 112) | (i114 & 896) | (i114 & 7168), ((i11 >> 6) & 112) | ((i11 >> 3) & 7168), 120816);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i13 = i12;
                    int i115 = iM3719getEllipsisgIe3tQ8;
                    modifier4 = modifier3;
                    j4 = j3;
                    j5 = jOooO0OO;
                    i14 = i115;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0O(str, j4, j5, i14, i13, modifier4, i3, i4));
            }
            i5 |= 24576;
            i7 = i2;
            i9 = i4 & 32;
            if (i9 != 0) {
                if ((458752 & i3) == 0) {
                    modifier2 = modifier;
                    if (composerStartRestartGroup.changed(modifier2)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i5 |= i10;
                }
                if ((374491 & i5) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    z = true;
                    if ((i3 & 1) != 0) {
                        if ((i4 & 2) != 0) {
                            j3 = p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o;
                            i5 &= -113;
                        }
                        if ((i4 & 4) != 0) {
                            jOooO0OO = com.code.android.util.o0000O0.OooO0OO(13, composerStartRestartGroup, 6);
                            i5 &= -897;
                        }
                        if (i17 != 0) {
                            iM3719getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m3719getEllipsisgIe3tQ8();
                        }
                        if (i6 != 0) {
                            i7 = 1;
                        }
                        if (i9 != 0) {
                            i11 = i5;
                            modifier3 = Modifier.INSTANCE;
                            i12 = i7;
                        } else {
                            i11 = i5;
                            i12 = i7;
                            modifier3 = modifier2;
                        }
                    } else {
                        if ((i4 & 2) != 0) {
                            j3 = p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o;
                            i5 &= -113;
                        }
                        if ((i4 & 4) != 0) {
                            jOooO0OO = com.code.android.util.o0000O0.OooO0OO(13, composerStartRestartGroup, 6);
                            i5 &= -897;
                        }
                        if (i17 != 0) {
                            iM3719getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m3719getEllipsisgIe3tQ8();
                        }
                        if (i6 != 0) {
                            i7 = 1;
                        }
                        if (i9 != 0) {
                            i11 = i5;
                            modifier3 = Modifier.INSTANCE;
                            i12 = i7;
                        } else {
                            i11 = i5;
                            i12 = i7;
                            modifier3 = modifier2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1545649145, i11, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserBioView (UserComp.kt:216)");
                    }
                    if (str != null) {
                        z = false;
                    }
                    if (z) {
                        strOooO0OO = o0000.OooO0OO(oO00OOo0.Userinfo_Sign_Hint);
                    } else {
                        strOooO0OO = str;
                    }
                    int i116 = i11 << 3;
                    TextKt.m1251Text4IGK_g(strOooO0OO, modifier3, j3, jOooO0OO, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, iM3719getEllipsisgIe3tQ8, false, i12, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i11 >> 12) & 112) | (i116 & 896) | (i116 & 7168), ((i11 >> 6) & 112) | ((i11 >> 3) & 7168), 120816);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i13 = i12;
                    int i117 = iM3719getEllipsisgIe3tQ8;
                    modifier4 = modifier3;
                    j4 = j3;
                    j5 = jOooO0OO;
                    i14 = i117;
                } else {
                    composerStartRestartGroup.startDefaults();
                    z = true;
                    if ((i3 & 1) != 0) {
                        if ((i4 & 2) != 0) {
                            j3 = p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o;
                            i5 &= -113;
                        }
                        if ((i4 & 4) != 0) {
                            jOooO0OO = com.code.android.util.o0000O0.OooO0OO(13, composerStartRestartGroup, 6);
                            i5 &= -897;
                        }
                        if (i17 != 0) {
                            iM3719getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m3719getEllipsisgIe3tQ8();
                        }
                        if (i6 != 0) {
                            i7 = 1;
                        }
                        if (i9 != 0) {
                            i11 = i5;
                            modifier3 = Modifier.INSTANCE;
                            i12 = i7;
                        } else {
                            i11 = i5;
                            i12 = i7;
                            modifier3 = modifier2;
                        }
                    } else {
                        if ((i4 & 2) != 0) {
                            j3 = p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o;
                            i5 &= -113;
                        }
                        if ((i4 & 4) != 0) {
                            jOooO0OO = com.code.android.util.o0000O0.OooO0OO(13, composerStartRestartGroup, 6);
                            i5 &= -897;
                        }
                        if (i17 != 0) {
                            iM3719getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m3719getEllipsisgIe3tQ8();
                        }
                        if (i6 != 0) {
                            i7 = 1;
                        }
                        if (i9 != 0) {
                            i11 = i5;
                            modifier3 = Modifier.INSTANCE;
                            i12 = i7;
                        } else {
                            i11 = i5;
                            i12 = i7;
                            modifier3 = modifier2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1545649145, i11, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserBioView (UserComp.kt:216)");
                    }
                    if (str != null) {
                        z = false;
                    }
                    if (z) {
                        strOooO0OO = o0000.OooO0OO(oO00OOo0.Userinfo_Sign_Hint);
                    } else {
                        strOooO0OO = str;
                    }
                    int i118 = i11 << 3;
                    TextKt.m1251Text4IGK_g(strOooO0OO, modifier3, j3, jOooO0OO, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, iM3719getEllipsisgIe3tQ8, false, i12, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i11 >> 12) & 112) | (i118 & 896) | (i118 & 7168), ((i11 >> 6) & 112) | ((i11 >> 3) & 7168), 120816);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i13 = i12;
                    int i119 = iM3719getEllipsisgIe3tQ8;
                    modifier4 = modifier3;
                    j4 = j3;
                    j5 = jOooO0OO;
                    i14 = i119;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0O(str, j4, j5, i14, i13, modifier4, i3, i4));
            }
            i5 |= 196608;
            modifier2 = modifier;
            if ((374491 & i5) == 74898) {
                composerStartRestartGroup.startDefaults();
                z = true;
                if ((i3 & 1) != 0) {
                    if ((i4 & 2) != 0) {
                        j3 = p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o;
                        i5 &= -113;
                    }
                    if ((i4 & 4) != 0) {
                        jOooO0OO = com.code.android.util.o0000O0.OooO0OO(13, composerStartRestartGroup, 6);
                        i5 &= -897;
                    }
                    if (i17 != 0) {
                        iM3719getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m3719getEllipsisgIe3tQ8();
                    }
                    if (i6 != 0) {
                        i7 = 1;
                    }
                    if (i9 != 0) {
                        i11 = i5;
                        modifier3 = Modifier.INSTANCE;
                        i12 = i7;
                    } else {
                        i11 = i5;
                        i12 = i7;
                        modifier3 = modifier2;
                    }
                } else {
                    if ((i4 & 2) != 0) {
                        j3 = p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o;
                        i5 &= -113;
                    }
                    if ((i4 & 4) != 0) {
                        jOooO0OO = com.code.android.util.o0000O0.OooO0OO(13, composerStartRestartGroup, 6);
                        i5 &= -897;
                    }
                    if (i17 != 0) {
                        iM3719getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m3719getEllipsisgIe3tQ8();
                    }
                    if (i6 != 0) {
                        i7 = 1;
                    }
                    if (i9 != 0) {
                        i11 = i5;
                        modifier3 = Modifier.INSTANCE;
                        i12 = i7;
                    } else {
                        i11 = i5;
                        i12 = i7;
                        modifier3 = modifier2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1545649145, i11, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserBioView (UserComp.kt:216)");
                }
                if (str != null) {
                    z = false;
                }
                if (z) {
                    strOooO0OO = o0000.OooO0OO(oO00OOo0.Userinfo_Sign_Hint);
                } else {
                    strOooO0OO = str;
                }
                int i1110 = i11 << 3;
                TextKt.m1251Text4IGK_g(strOooO0OO, modifier3, j3, jOooO0OO, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, iM3719getEllipsisgIe3tQ8, false, i12, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i11 >> 12) & 112) | (i1110 & 896) | (i1110 & 7168), ((i11 >> 6) & 112) | ((i11 >> 3) & 7168), 120816);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i13 = i12;
                int i1111 = iM3719getEllipsisgIe3tQ8;
                modifier4 = modifier3;
                j4 = j3;
                j5 = jOooO0OO;
                i14 = i1111;
            } else {
                composerStartRestartGroup.startDefaults();
                z = true;
                if ((i3 & 1) != 0) {
                    if ((i4 & 2) != 0) {
                        j3 = p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o;
                        i5 &= -113;
                    }
                    if ((i4 & 4) != 0) {
                        jOooO0OO = com.code.android.util.o0000O0.OooO0OO(13, composerStartRestartGroup, 6);
                        i5 &= -897;
                    }
                    if (i17 != 0) {
                        iM3719getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m3719getEllipsisgIe3tQ8();
                    }
                    if (i6 != 0) {
                        i7 = 1;
                    }
                    if (i9 != 0) {
                        i11 = i5;
                        modifier3 = Modifier.INSTANCE;
                        i12 = i7;
                    } else {
                        i11 = i5;
                        i12 = i7;
                        modifier3 = modifier2;
                    }
                } else {
                    if ((i4 & 2) != 0) {
                        j3 = p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o;
                        i5 &= -113;
                    }
                    if ((i4 & 4) != 0) {
                        jOooO0OO = com.code.android.util.o0000O0.OooO0OO(13, composerStartRestartGroup, 6);
                        i5 &= -897;
                    }
                    if (i17 != 0) {
                        iM3719getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m3719getEllipsisgIe3tQ8();
                    }
                    if (i6 != 0) {
                        i7 = 1;
                    }
                    if (i9 != 0) {
                        i11 = i5;
                        modifier3 = Modifier.INSTANCE;
                        i12 = i7;
                    } else {
                        i11 = i5;
                        i12 = i7;
                        modifier3 = modifier2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1545649145, i11, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserBioView (UserComp.kt:216)");
                }
                if (str != null) {
                    z = false;
                }
                if (z) {
                    strOooO0OO = o0000.OooO0OO(oO00OOo0.Userinfo_Sign_Hint);
                } else {
                    strOooO0OO = str;
                }
                int i1112 = i11 << 3;
                TextKt.m1251Text4IGK_g(strOooO0OO, modifier3, j3, jOooO0OO, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, iM3719getEllipsisgIe3tQ8, false, i12, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i11 >> 12) & 112) | (i1112 & 896) | (i1112 & 7168), ((i11 >> 6) & 112) | ((i11 >> 3) & 7168), 120816);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i13 = i12;
                int i1113 = iM3719getEllipsisgIe3tQ8;
                modifier4 = modifier3;
                j4 = j3;
                j5 = jOooO0OO;
                i14 = i1113;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0O(str, j4, j5, i14, i13, modifier4, i3, i4));
        }
        i5 |= 3072;
        iM3719getEllipsisgIe3tQ8 = i;
        i6 = i4 & 16;
        if (i6 != 0) {
            if ((57344 & i3) == 0) {
                i7 = i2;
                if (composerStartRestartGroup.changed(i7)) {
                    i8 = 16384;
                } else {
                    i8 = 8192;
                }
                i5 |= i8;
            }
            i9 = i4 & 32;
            if (i9 != 0) {
                if ((458752 & i3) == 0) {
                    modifier2 = modifier;
                    if (composerStartRestartGroup.changed(modifier2)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i5 |= i10;
                }
                if ((374491 & i5) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    z = true;
                    if ((i3 & 1) != 0) {
                        if ((i4 & 2) != 0) {
                            j3 = p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o;
                            i5 &= -113;
                        }
                        if ((i4 & 4) != 0) {
                            jOooO0OO = com.code.android.util.o0000O0.OooO0OO(13, composerStartRestartGroup, 6);
                            i5 &= -897;
                        }
                        if (i17 != 0) {
                            iM3719getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m3719getEllipsisgIe3tQ8();
                        }
                        if (i6 != 0) {
                            i7 = 1;
                        }
                        if (i9 != 0) {
                            i11 = i5;
                            modifier3 = Modifier.INSTANCE;
                            i12 = i7;
                        } else {
                            i11 = i5;
                            i12 = i7;
                            modifier3 = modifier2;
                        }
                    } else {
                        if ((i4 & 2) != 0) {
                            j3 = p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o;
                            i5 &= -113;
                        }
                        if ((i4 & 4) != 0) {
                            jOooO0OO = com.code.android.util.o0000O0.OooO0OO(13, composerStartRestartGroup, 6);
                            i5 &= -897;
                        }
                        if (i17 != 0) {
                            iM3719getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m3719getEllipsisgIe3tQ8();
                        }
                        if (i6 != 0) {
                            i7 = 1;
                        }
                        if (i9 != 0) {
                            i11 = i5;
                            modifier3 = Modifier.INSTANCE;
                            i12 = i7;
                        } else {
                            i11 = i5;
                            i12 = i7;
                            modifier3 = modifier2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1545649145, i11, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserBioView (UserComp.kt:216)");
                    }
                    if (str != null) {
                        z = false;
                    }
                    if (z) {
                        strOooO0OO = o0000.OooO0OO(oO00OOo0.Userinfo_Sign_Hint);
                    } else {
                        strOooO0OO = str;
                    }
                    int i1114 = i11 << 3;
                    TextKt.m1251Text4IGK_g(strOooO0OO, modifier3, j3, jOooO0OO, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, iM3719getEllipsisgIe3tQ8, false, i12, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i11 >> 12) & 112) | (i1114 & 896) | (i1114 & 7168), ((i11 >> 6) & 112) | ((i11 >> 3) & 7168), 120816);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i13 = i12;
                    int i1115 = iM3719getEllipsisgIe3tQ8;
                    modifier4 = modifier3;
                    j4 = j3;
                    j5 = jOooO0OO;
                    i14 = i1115;
                } else {
                    composerStartRestartGroup.startDefaults();
                    z = true;
                    if ((i3 & 1) != 0) {
                        if ((i4 & 2) != 0) {
                            j3 = p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o;
                            i5 &= -113;
                        }
                        if ((i4 & 4) != 0) {
                            jOooO0OO = com.code.android.util.o0000O0.OooO0OO(13, composerStartRestartGroup, 6);
                            i5 &= -897;
                        }
                        if (i17 != 0) {
                            iM3719getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m3719getEllipsisgIe3tQ8();
                        }
                        if (i6 != 0) {
                            i7 = 1;
                        }
                        if (i9 != 0) {
                            i11 = i5;
                            modifier3 = Modifier.INSTANCE;
                            i12 = i7;
                        } else {
                            i11 = i5;
                            i12 = i7;
                            modifier3 = modifier2;
                        }
                    } else {
                        if ((i4 & 2) != 0) {
                            j3 = p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o;
                            i5 &= -113;
                        }
                        if ((i4 & 4) != 0) {
                            jOooO0OO = com.code.android.util.o0000O0.OooO0OO(13, composerStartRestartGroup, 6);
                            i5 &= -897;
                        }
                        if (i17 != 0) {
                            iM3719getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m3719getEllipsisgIe3tQ8();
                        }
                        if (i6 != 0) {
                            i7 = 1;
                        }
                        if (i9 != 0) {
                            i11 = i5;
                            modifier3 = Modifier.INSTANCE;
                            i12 = i7;
                        } else {
                            i11 = i5;
                            i12 = i7;
                            modifier3 = modifier2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1545649145, i11, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserBioView (UserComp.kt:216)");
                    }
                    if (str != null) {
                        z = false;
                    }
                    if (z) {
                        strOooO0OO = o0000.OooO0OO(oO00OOo0.Userinfo_Sign_Hint);
                    } else {
                        strOooO0OO = str;
                    }
                    int i1116 = i11 << 3;
                    TextKt.m1251Text4IGK_g(strOooO0OO, modifier3, j3, jOooO0OO, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, iM3719getEllipsisgIe3tQ8, false, i12, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i11 >> 12) & 112) | (i1116 & 896) | (i1116 & 7168), ((i11 >> 6) & 112) | ((i11 >> 3) & 7168), 120816);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i13 = i12;
                    int i1117 = iM3719getEllipsisgIe3tQ8;
                    modifier4 = modifier3;
                    j4 = j3;
                    j5 = jOooO0OO;
                    i14 = i1117;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0O(str, j4, j5, i14, i13, modifier4, i3, i4));
            }
            i5 |= 196608;
            modifier2 = modifier;
            if ((374491 & i5) == 74898) {
                composerStartRestartGroup.startDefaults();
                z = true;
                if ((i3 & 1) != 0) {
                    if ((i4 & 2) != 0) {
                        j3 = p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o;
                        i5 &= -113;
                    }
                    if ((i4 & 4) != 0) {
                        jOooO0OO = com.code.android.util.o0000O0.OooO0OO(13, composerStartRestartGroup, 6);
                        i5 &= -897;
                    }
                    if (i17 != 0) {
                        iM3719getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m3719getEllipsisgIe3tQ8();
                    }
                    if (i6 != 0) {
                        i7 = 1;
                    }
                    if (i9 != 0) {
                        i11 = i5;
                        modifier3 = Modifier.INSTANCE;
                        i12 = i7;
                    } else {
                        i11 = i5;
                        i12 = i7;
                        modifier3 = modifier2;
                    }
                } else {
                    if ((i4 & 2) != 0) {
                        j3 = p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o;
                        i5 &= -113;
                    }
                    if ((i4 & 4) != 0) {
                        jOooO0OO = com.code.android.util.o0000O0.OooO0OO(13, composerStartRestartGroup, 6);
                        i5 &= -897;
                    }
                    if (i17 != 0) {
                        iM3719getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m3719getEllipsisgIe3tQ8();
                    }
                    if (i6 != 0) {
                        i7 = 1;
                    }
                    if (i9 != 0) {
                        i11 = i5;
                        modifier3 = Modifier.INSTANCE;
                        i12 = i7;
                    } else {
                        i11 = i5;
                        i12 = i7;
                        modifier3 = modifier2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1545649145, i11, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserBioView (UserComp.kt:216)");
                }
                if (str != null) {
                    z = false;
                }
                if (z) {
                    strOooO0OO = o0000.OooO0OO(oO00OOo0.Userinfo_Sign_Hint);
                } else {
                    strOooO0OO = str;
                }
                int i1118 = i11 << 3;
                TextKt.m1251Text4IGK_g(strOooO0OO, modifier3, j3, jOooO0OO, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, iM3719getEllipsisgIe3tQ8, false, i12, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i11 >> 12) & 112) | (i1118 & 896) | (i1118 & 7168), ((i11 >> 6) & 112) | ((i11 >> 3) & 7168), 120816);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i13 = i12;
                int i1119 = iM3719getEllipsisgIe3tQ8;
                modifier4 = modifier3;
                j4 = j3;
                j5 = jOooO0OO;
                i14 = i1119;
            } else {
                composerStartRestartGroup.startDefaults();
                z = true;
                if ((i3 & 1) != 0) {
                    if ((i4 & 2) != 0) {
                        j3 = p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o;
                        i5 &= -113;
                    }
                    if ((i4 & 4) != 0) {
                        jOooO0OO = com.code.android.util.o0000O0.OooO0OO(13, composerStartRestartGroup, 6);
                        i5 &= -897;
                    }
                    if (i17 != 0) {
                        iM3719getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m3719getEllipsisgIe3tQ8();
                    }
                    if (i6 != 0) {
                        i7 = 1;
                    }
                    if (i9 != 0) {
                        i11 = i5;
                        modifier3 = Modifier.INSTANCE;
                        i12 = i7;
                    } else {
                        i11 = i5;
                        i12 = i7;
                        modifier3 = modifier2;
                    }
                } else {
                    if ((i4 & 2) != 0) {
                        j3 = p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o;
                        i5 &= -113;
                    }
                    if ((i4 & 4) != 0) {
                        jOooO0OO = com.code.android.util.o0000O0.OooO0OO(13, composerStartRestartGroup, 6);
                        i5 &= -897;
                    }
                    if (i17 != 0) {
                        iM3719getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m3719getEllipsisgIe3tQ8();
                    }
                    if (i6 != 0) {
                        i7 = 1;
                    }
                    if (i9 != 0) {
                        i11 = i5;
                        modifier3 = Modifier.INSTANCE;
                        i12 = i7;
                    } else {
                        i11 = i5;
                        i12 = i7;
                        modifier3 = modifier2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1545649145, i11, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserBioView (UserComp.kt:216)");
                }
                if (str != null) {
                    z = false;
                }
                if (z) {
                    strOooO0OO = o0000.OooO0OO(oO00OOo0.Userinfo_Sign_Hint);
                } else {
                    strOooO0OO = str;
                }
                int i11110 = i11 << 3;
                TextKt.m1251Text4IGK_g(strOooO0OO, modifier3, j3, jOooO0OO, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, iM3719getEllipsisgIe3tQ8, false, i12, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i11 >> 12) & 112) | (i11110 & 896) | (i11110 & 7168), ((i11 >> 6) & 112) | ((i11 >> 3) & 7168), 120816);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i13 = i12;
                int i11111 = iM3719getEllipsisgIe3tQ8;
                modifier4 = modifier3;
                j4 = j3;
                j5 = jOooO0OO;
                i14 = i11111;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0O(str, j4, j5, i14, i13, modifier4, i3, i4));
        }
        i5 |= 24576;
        i7 = i2;
        i9 = i4 & 32;
        if (i9 != 0) {
            if ((458752 & i3) == 0) {
                modifier2 = modifier;
                if (composerStartRestartGroup.changed(modifier2)) {
                    i10 = 131072;
                } else {
                    i10 = 65536;
                }
                i5 |= i10;
            }
            if ((374491 & i5) == 74898) {
                composerStartRestartGroup.startDefaults();
                z = true;
                if ((i3 & 1) != 0) {
                    if ((i4 & 2) != 0) {
                        j3 = p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o;
                        i5 &= -113;
                    }
                    if ((i4 & 4) != 0) {
                        jOooO0OO = com.code.android.util.o0000O0.OooO0OO(13, composerStartRestartGroup, 6);
                        i5 &= -897;
                    }
                    if (i17 != 0) {
                        iM3719getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m3719getEllipsisgIe3tQ8();
                    }
                    if (i6 != 0) {
                        i7 = 1;
                    }
                    if (i9 != 0) {
                        i11 = i5;
                        modifier3 = Modifier.INSTANCE;
                        i12 = i7;
                    } else {
                        i11 = i5;
                        i12 = i7;
                        modifier3 = modifier2;
                    }
                } else {
                    if ((i4 & 2) != 0) {
                        j3 = p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o;
                        i5 &= -113;
                    }
                    if ((i4 & 4) != 0) {
                        jOooO0OO = com.code.android.util.o0000O0.OooO0OO(13, composerStartRestartGroup, 6);
                        i5 &= -897;
                    }
                    if (i17 != 0) {
                        iM3719getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m3719getEllipsisgIe3tQ8();
                    }
                    if (i6 != 0) {
                        i7 = 1;
                    }
                    if (i9 != 0) {
                        i11 = i5;
                        modifier3 = Modifier.INSTANCE;
                        i12 = i7;
                    } else {
                        i11 = i5;
                        i12 = i7;
                        modifier3 = modifier2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1545649145, i11, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserBioView (UserComp.kt:216)");
                }
                if (str != null) {
                    z = false;
                }
                if (z) {
                    strOooO0OO = o0000.OooO0OO(oO00OOo0.Userinfo_Sign_Hint);
                } else {
                    strOooO0OO = str;
                }
                int i11112 = i11 << 3;
                TextKt.m1251Text4IGK_g(strOooO0OO, modifier3, j3, jOooO0OO, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, iM3719getEllipsisgIe3tQ8, false, i12, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i11 >> 12) & 112) | (i11112 & 896) | (i11112 & 7168), ((i11 >> 6) & 112) | ((i11 >> 3) & 7168), 120816);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i13 = i12;
                int i11113 = iM3719getEllipsisgIe3tQ8;
                modifier4 = modifier3;
                j4 = j3;
                j5 = jOooO0OO;
                i14 = i11113;
            } else {
                composerStartRestartGroup.startDefaults();
                z = true;
                if ((i3 & 1) != 0) {
                    if ((i4 & 2) != 0) {
                        j3 = p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o;
                        i5 &= -113;
                    }
                    if ((i4 & 4) != 0) {
                        jOooO0OO = com.code.android.util.o0000O0.OooO0OO(13, composerStartRestartGroup, 6);
                        i5 &= -897;
                    }
                    if (i17 != 0) {
                        iM3719getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m3719getEllipsisgIe3tQ8();
                    }
                    if (i6 != 0) {
                        i7 = 1;
                    }
                    if (i9 != 0) {
                        i11 = i5;
                        modifier3 = Modifier.INSTANCE;
                        i12 = i7;
                    } else {
                        i11 = i5;
                        i12 = i7;
                        modifier3 = modifier2;
                    }
                } else {
                    if ((i4 & 2) != 0) {
                        j3 = p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o;
                        i5 &= -113;
                    }
                    if ((i4 & 4) != 0) {
                        jOooO0OO = com.code.android.util.o0000O0.OooO0OO(13, composerStartRestartGroup, 6);
                        i5 &= -897;
                    }
                    if (i17 != 0) {
                        iM3719getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m3719getEllipsisgIe3tQ8();
                    }
                    if (i6 != 0) {
                        i7 = 1;
                    }
                    if (i9 != 0) {
                        i11 = i5;
                        modifier3 = Modifier.INSTANCE;
                        i12 = i7;
                    } else {
                        i11 = i5;
                        i12 = i7;
                        modifier3 = modifier2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1545649145, i11, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserBioView (UserComp.kt:216)");
                }
                if (str != null) {
                    z = false;
                }
                if (z) {
                    strOooO0OO = o0000.OooO0OO(oO00OOo0.Userinfo_Sign_Hint);
                } else {
                    strOooO0OO = str;
                }
                int i11114 = i11 << 3;
                TextKt.m1251Text4IGK_g(strOooO0OO, modifier3, j3, jOooO0OO, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, iM3719getEllipsisgIe3tQ8, false, i12, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i11 >> 12) & 112) | (i11114 & 896) | (i11114 & 7168), ((i11 >> 6) & 112) | ((i11 >> 3) & 7168), 120816);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i13 = i12;
                int i11115 = iM3719getEllipsisgIe3tQ8;
                modifier4 = modifier3;
                j4 = j3;
                j5 = jOooO0OO;
                i14 = i11115;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0O(str, j4, j5, i14, i13, modifier4, i3, i4));
        }
        i5 |= 196608;
        modifier2 = modifier;
        if ((374491 & i5) == 74898) {
            composerStartRestartGroup.startDefaults();
            z = true;
            if ((i3 & 1) != 0) {
                if ((i4 & 2) != 0) {
                    j3 = p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o;
                    i5 &= -113;
                }
                if ((i4 & 4) != 0) {
                    jOooO0OO = com.code.android.util.o0000O0.OooO0OO(13, composerStartRestartGroup, 6);
                    i5 &= -897;
                }
                if (i17 != 0) {
                    iM3719getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m3719getEllipsisgIe3tQ8();
                }
                if (i6 != 0) {
                    i7 = 1;
                }
                if (i9 != 0) {
                    i11 = i5;
                    modifier3 = Modifier.INSTANCE;
                    i12 = i7;
                } else {
                    i11 = i5;
                    i12 = i7;
                    modifier3 = modifier2;
                }
            } else {
                if ((i4 & 2) != 0) {
                    j3 = p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o;
                    i5 &= -113;
                }
                if ((i4 & 4) != 0) {
                    jOooO0OO = com.code.android.util.o0000O0.OooO0OO(13, composerStartRestartGroup, 6);
                    i5 &= -897;
                }
                if (i17 != 0) {
                    iM3719getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m3719getEllipsisgIe3tQ8();
                }
                if (i6 != 0) {
                    i7 = 1;
                }
                if (i9 != 0) {
                    i11 = i5;
                    modifier3 = Modifier.INSTANCE;
                    i12 = i7;
                } else {
                    i11 = i5;
                    i12 = i7;
                    modifier3 = modifier2;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1545649145, i11, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserBioView (UserComp.kt:216)");
            }
            if (str != null) {
                z = false;
            }
            if (z) {
                strOooO0OO = o0000.OooO0OO(oO00OOo0.Userinfo_Sign_Hint);
            } else {
                strOooO0OO = str;
            }
            int i11116 = i11 << 3;
            TextKt.m1251Text4IGK_g(strOooO0OO, modifier3, j3, jOooO0OO, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, iM3719getEllipsisgIe3tQ8, false, i12, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i11 >> 12) & 112) | (i11116 & 896) | (i11116 & 7168), ((i11 >> 6) & 112) | ((i11 >> 3) & 7168), 120816);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            i13 = i12;
            int i11117 = iM3719getEllipsisgIe3tQ8;
            modifier4 = modifier3;
            j4 = j3;
            j5 = jOooO0OO;
            i14 = i11117;
        } else {
            composerStartRestartGroup.startDefaults();
            z = true;
            if ((i3 & 1) != 0) {
                if ((i4 & 2) != 0) {
                    j3 = p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o;
                    i5 &= -113;
                }
                if ((i4 & 4) != 0) {
                    jOooO0OO = com.code.android.util.o0000O0.OooO0OO(13, composerStartRestartGroup, 6);
                    i5 &= -897;
                }
                if (i17 != 0) {
                    iM3719getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m3719getEllipsisgIe3tQ8();
                }
                if (i6 != 0) {
                    i7 = 1;
                }
                if (i9 != 0) {
                    i11 = i5;
                    modifier3 = Modifier.INSTANCE;
                    i12 = i7;
                } else {
                    i11 = i5;
                    i12 = i7;
                    modifier3 = modifier2;
                }
            } else {
                if ((i4 & 2) != 0) {
                    j3 = p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o;
                    i5 &= -113;
                }
                if ((i4 & 4) != 0) {
                    jOooO0OO = com.code.android.util.o0000O0.OooO0OO(13, composerStartRestartGroup, 6);
                    i5 &= -897;
                }
                if (i17 != 0) {
                    iM3719getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m3719getEllipsisgIe3tQ8();
                }
                if (i6 != 0) {
                    i7 = 1;
                }
                if (i9 != 0) {
                    i11 = i5;
                    modifier3 = Modifier.INSTANCE;
                    i12 = i7;
                } else {
                    i11 = i5;
                    i12 = i7;
                    modifier3 = modifier2;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1545649145, i11, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserBioView (UserComp.kt:216)");
            }
            if (str != null) {
                z = false;
            }
            if (z) {
                strOooO0OO = o0000.OooO0OO(oO00OOo0.Userinfo_Sign_Hint);
            } else {
                strOooO0OO = str;
            }
            int i11118 = i11 << 3;
            TextKt.m1251Text4IGK_g(strOooO0OO, modifier3, j3, jOooO0OO, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, iM3719getEllipsisgIe3tQ8, false, i12, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i11 >> 12) & 112) | (i11118 & 896) | (i11118 & 7168), ((i11 >> 6) & 112) | ((i11 >> 3) & 7168), 120816);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            i13 = i12;
            int i11119 = iM3719getEllipsisgIe3tQ8;
            modifier4 = modifier3;
            j4 = j3;
            j5 = jOooO0OO;
            i14 = i11119;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0O(str, j4, j5, i14, i13, modifier4, i3, i4));
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:35:0x0060  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:43:0x0081  */
    /* JADX WARN: Code duplicated, block: B:45:0x0084  */
    /* JADX WARN: Code duplicated, block: B:48:0x009b  */
    /* JADX WARN: Code duplicated, block: B:51:0x009f  */
    /* JADX WARN: Code duplicated, block: B:54:0x00af  */
    /* JADX WARN: Code duplicated, block: B:57:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0oO(@Nullable Integer num, @Nullable Modifier modifier, @Nullable Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        Modifier modifier3;
        Painter painterPainterResource;
        Painter painter;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2090799376);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(num) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 112) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 91) == 18 || !composerStartRestartGroup.getSkipping()) {
                if (i4 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2090799376, i, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserGenderView (UserComp.kt:468)");
                }
                if (num == null && num.intValue() == 0) {
                    composerStartRestartGroup.startReplaceableGroup(-1462089636);
                    painterPainterResource = PainterResources_androidKt.painterResource(oOo00OO0.icon_female, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                } else if (num == null && num.intValue() == 1) {
                    composerStartRestartGroup.startReplaceableGroup(-1462089560);
                    painterPainterResource = PainterResources_androidKt.painterResource(oOo00OO0.icon_male, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    painterPainterResource = null;
                    if (num == null && num.intValue() == 2) {
                        composerStartRestartGroup.startReplaceableGroup(1919866160);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(1919866935);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                }
                painter = painterPainterResource;
                if (painter != null) {
                    ImageKt.Image(painter, "", SizeKt.m523size3ABfNKs(Modifier.INSTANCE.then(modifier3), Dp.m3765constructorimpl(15)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new C0499OooOOOO(num, modifier3, i, i2));
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 91) == 18) {
            if (i4 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2090799376, i, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserGenderView (UserComp.kt:468)");
            }
            if (num == null) {
                composerStartRestartGroup.startReplaceableGroup(-1462089636);
                painterPainterResource = PainterResources_androidKt.painterResource(oOo00OO0.icon_female, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
            } else if (num == null) {
                painterPainterResource = null;
                if (num == null) {
                    composerStartRestartGroup.startReplaceableGroup(1919866935);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(1919866160);
                    composerStartRestartGroup.endReplaceableGroup();
                }
            } else {
                composerStartRestartGroup.startReplaceableGroup(-1462089560);
                painterPainterResource = PainterResources_androidKt.painterResource(oOo00OO0.icon_male, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
            }
            painter = painterPainterResource;
            if (painter != null) {
                ImageKt.Image(painter, "", SizeKt.m523size3ABfNKs(Modifier.INSTANCE.then(modifier3), Dp.m3765constructorimpl(15)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            if (i4 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2090799376, i, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserGenderView (UserComp.kt:468)");
            }
            if (num == null) {
                composerStartRestartGroup.startReplaceableGroup(-1462089636);
                painterPainterResource = PainterResources_androidKt.painterResource(oOo00OO0.icon_female, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
            } else if (num == null) {
                painterPainterResource = null;
                if (num == null) {
                    composerStartRestartGroup.startReplaceableGroup(1919866935);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(1919866160);
                    composerStartRestartGroup.endReplaceableGroup();
                }
            } else {
                composerStartRestartGroup.startReplaceableGroup(-1462089560);
                painterPainterResource = PainterResources_androidKt.painterResource(oOo00OO0.icon_male, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
            }
            painter = painterPainterResource;
            if (painter != null) {
                ImageKt.Image(painter, "", SizeKt.m523size3ABfNKs(Modifier.INSTANCE.then(modifier3), Dp.m3765constructorimpl(15)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new C0499OooOOOO(num, modifier3, i, i2));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0oo(int i, int i2, @Nullable Composer composer, @Nullable Modifier modifier, @Nullable String str) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1555449568);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1555449568, i3, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserHeaddressView (UserComp.kt:444)");
            }
            if (str == null || StringsKt.isBlank(str)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new p517o0o0O0o.OooOo(this, str, modifier, i, i2));
                return;
            }
            p154o00OoO00.OooOo00.OooO00o(str, true, 0, null, null, SizeKt.m523size3ABfNKs(Modifier.INSTANCE.then(modifier), Dp.m3765constructorimpl(46)), composerStartRestartGroup, (i3 & 14) | 48, 28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new p517o0o0O0o.Oooo000(this, str, modifier2, i, i2));
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0087  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00af  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:84:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:87:0x012d  */
    /* JADX WARN: Code duplicated, block: B:92:0x013c  */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooOO0(@Nullable String str, @NotNull Modifier modifier, float f, @Nullable Color color, boolean z, @Nullable Composer composer, int i, int i2) {
        int i3;
        float f2;
        int i4;
        Color color2;
        int i5;
        int i6;
        boolean z2;
        int i7;
        float fM3765constructorimpl;
        Color color3;
        boolean z3;
        long jM1705getTransparent0d7_KjU;
        float fM3765constructorimpl2;
        float f3;
        Color color4;
        boolean z4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Composer composerStartRestartGroup = composer.startRestartGroup(1573972073);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 == 0) {
            if ((i & 896) == 0) {
                f2 = f;
                i3 |= composerStartRestartGroup.changed(f2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 7168) == 0) {
                    color2 = color;
                    if (composerStartRestartGroup.changed(color2)) {
                        i5 = 2048;
                    } else {
                        i5 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((57344 & i) == 0) {
                        z2 = z;
                        if (composerStartRestartGroup.changed(z2)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    if ((46811 & i3) == 9362 || !composerStartRestartGroup.getSkipping()) {
                        if (i8 != 0) {
                            fM3765constructorimpl = Dp.m3765constructorimpl(0);
                        } else {
                            fM3765constructorimpl = f2;
                        }
                        if (i4 != 0) {
                            color3 = null;
                        } else {
                            color3 = color2;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1573972073, i3, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserHeaderView (UserComp.kt:238)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        RoundedCornerShape circleShape = RoundedCornerShapeKt.getCircleShape();
                        if (color3 != null) {
                            jM1705getTransparent0d7_KjU = color3.m1680unboximpl();
                        } else {
                            jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                        }
                        Modifier modifierBorder = BorderKt.border(companion, new BorderStroke(fM3765constructorimpl, new SolidColor(jM1705getTransparent0d7_KjU, null), null), circleShape);
                        if (z3) {
                            fM3765constructorimpl2 = fM3765constructorimpl;
                        } else {
                            fM3765constructorimpl2 = Dp.m3765constructorimpl(0);
                        }
                        ImageKt.Image(p417o0OoO0.o00Oo0.OooO0O0(str, null, composerStartRestartGroup, i3 & 14, 1), (String) null, ClipKt.clip(modifier.then(PaddingKt.m476padding3ABfNKs(modifierBorder, fM3765constructorimpl2)), RoundedCornerShapeKt.getCircleShape()), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24624, 104);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f3 = fM3765constructorimpl;
                        color4 = color3;
                        z4 = z3;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        f3 = f2;
                        color4 = color2;
                        z4 = z2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Oooo000(str, modifier, f3, color4, z4, i, i2));
                }
                i3 |= 24576;
                z2 = z;
                if ((46811 & i3) == 9362) {
                    if (i8 != 0) {
                        fM3765constructorimpl = Dp.m3765constructorimpl(0);
                    } else {
                        fM3765constructorimpl = f2;
                    }
                    if (i4 != 0) {
                        color3 = null;
                    } else {
                        color3 = color2;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1573972073, i3, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserHeaderView (UserComp.kt:238)");
                    }
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    RoundedCornerShape circleShape2 = RoundedCornerShapeKt.getCircleShape();
                    if (color3 != null) {
                        jM1705getTransparent0d7_KjU = color3.m1680unboximpl();
                    } else {
                        jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                    }
                    Modifier modifierBorder2 = BorderKt.border(companion2, new BorderStroke(fM3765constructorimpl, new SolidColor(jM1705getTransparent0d7_KjU, null), null), circleShape2);
                    if (z3) {
                        fM3765constructorimpl2 = fM3765constructorimpl;
                    } else {
                        fM3765constructorimpl2 = Dp.m3765constructorimpl(0);
                    }
                    ImageKt.Image(p417o0OoO0.o00Oo0.OooO0O0(str, null, composerStartRestartGroup, i3 & 14, 1), (String) null, ClipKt.clip(modifier.then(PaddingKt.m476padding3ABfNKs(modifierBorder2, fM3765constructorimpl2)), RoundedCornerShapeKt.getCircleShape()), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24624, 104);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f3 = fM3765constructorimpl;
                    color4 = color3;
                    z4 = z3;
                } else {
                    if (i8 != 0) {
                        fM3765constructorimpl = Dp.m3765constructorimpl(0);
                    } else {
                        fM3765constructorimpl = f2;
                    }
                    if (i4 != 0) {
                        color3 = null;
                    } else {
                        color3 = color2;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1573972073, i3, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserHeaderView (UserComp.kt:238)");
                    }
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    RoundedCornerShape circleShape3 = RoundedCornerShapeKt.getCircleShape();
                    if (color3 != null) {
                        jM1705getTransparent0d7_KjU = color3.m1680unboximpl();
                    } else {
                        jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                    }
                    Modifier modifierBorder3 = BorderKt.border(companion3, new BorderStroke(fM3765constructorimpl, new SolidColor(jM1705getTransparent0d7_KjU, null), null), circleShape3);
                    if (z3) {
                        fM3765constructorimpl2 = fM3765constructorimpl;
                    } else {
                        fM3765constructorimpl2 = Dp.m3765constructorimpl(0);
                    }
                    ImageKt.Image(p417o0OoO0.o00Oo0.OooO0O0(str, null, composerStartRestartGroup, i3 & 14, 1), (String) null, ClipKt.clip(modifier.then(PaddingKt.m476padding3ABfNKs(modifierBorder3, fM3765constructorimpl2)), RoundedCornerShapeKt.getCircleShape()), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24624, 104);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f3 = fM3765constructorimpl;
                    color4 = color3;
                    z4 = z3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Oooo000(str, modifier, f3, color4, z4, i, i2));
            }
            i3 |= 3072;
            color2 = color;
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((57344 & i) == 0) {
                    z2 = z;
                    if (composerStartRestartGroup.changed(z2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((46811 & i3) == 9362) {
                    if (i8 != 0) {
                        fM3765constructorimpl = Dp.m3765constructorimpl(0);
                    } else {
                        fM3765constructorimpl = f2;
                    }
                    if (i4 != 0) {
                        color3 = null;
                    } else {
                        color3 = color2;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1573972073, i3, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserHeaderView (UserComp.kt:238)");
                    }
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    RoundedCornerShape circleShape4 = RoundedCornerShapeKt.getCircleShape();
                    if (color3 != null) {
                        jM1705getTransparent0d7_KjU = color3.m1680unboximpl();
                    } else {
                        jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                    }
                    Modifier modifierBorder4 = BorderKt.border(companion4, new BorderStroke(fM3765constructorimpl, new SolidColor(jM1705getTransparent0d7_KjU, null), null), circleShape4);
                    if (z3) {
                        fM3765constructorimpl2 = fM3765constructorimpl;
                    } else {
                        fM3765constructorimpl2 = Dp.m3765constructorimpl(0);
                    }
                    ImageKt.Image(p417o0OoO0.o00Oo0.OooO0O0(str, null, composerStartRestartGroup, i3 & 14, 1), (String) null, ClipKt.clip(modifier.then(PaddingKt.m476padding3ABfNKs(modifierBorder4, fM3765constructorimpl2)), RoundedCornerShapeKt.getCircleShape()), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24624, 104);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f3 = fM3765constructorimpl;
                    color4 = color3;
                    z4 = z3;
                } else {
                    if (i8 != 0) {
                        fM3765constructorimpl = Dp.m3765constructorimpl(0);
                    } else {
                        fM3765constructorimpl = f2;
                    }
                    if (i4 != 0) {
                        color3 = null;
                    } else {
                        color3 = color2;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1573972073, i3, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserHeaderView (UserComp.kt:238)");
                    }
                    Modifier.Companion companion5 = Modifier.INSTANCE;
                    RoundedCornerShape circleShape5 = RoundedCornerShapeKt.getCircleShape();
                    if (color3 != null) {
                        jM1705getTransparent0d7_KjU = color3.m1680unboximpl();
                    } else {
                        jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                    }
                    Modifier modifierBorder5 = BorderKt.border(companion5, new BorderStroke(fM3765constructorimpl, new SolidColor(jM1705getTransparent0d7_KjU, null), null), circleShape5);
                    if (z3) {
                        fM3765constructorimpl2 = fM3765constructorimpl;
                    } else {
                        fM3765constructorimpl2 = Dp.m3765constructorimpl(0);
                    }
                    ImageKt.Image(p417o0OoO0.o00Oo0.OooO0O0(str, null, composerStartRestartGroup, i3 & 14, 1), (String) null, ClipKt.clip(modifier.then(PaddingKt.m476padding3ABfNKs(modifierBorder5, fM3765constructorimpl2)), RoundedCornerShapeKt.getCircleShape()), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24624, 104);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f3 = fM3765constructorimpl;
                    color4 = color3;
                    z4 = z3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Oooo000(str, modifier, f3, color4, z4, i, i2));
            }
            i3 |= 24576;
            z2 = z;
            if ((46811 & i3) == 9362) {
                if (i8 != 0) {
                    fM3765constructorimpl = Dp.m3765constructorimpl(0);
                } else {
                    fM3765constructorimpl = f2;
                }
                if (i4 != 0) {
                    color3 = null;
                } else {
                    color3 = color2;
                }
                if (i6 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1573972073, i3, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserHeaderView (UserComp.kt:238)");
                }
                Modifier.Companion companion6 = Modifier.INSTANCE;
                RoundedCornerShape circleShape6 = RoundedCornerShapeKt.getCircleShape();
                if (color3 != null) {
                    jM1705getTransparent0d7_KjU = color3.m1680unboximpl();
                } else {
                    jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                }
                Modifier modifierBorder6 = BorderKt.border(companion6, new BorderStroke(fM3765constructorimpl, new SolidColor(jM1705getTransparent0d7_KjU, null), null), circleShape6);
                if (z3) {
                    fM3765constructorimpl2 = fM3765constructorimpl;
                } else {
                    fM3765constructorimpl2 = Dp.m3765constructorimpl(0);
                }
                ImageKt.Image(p417o0OoO0.o00Oo0.OooO0O0(str, null, composerStartRestartGroup, i3 & 14, 1), (String) null, ClipKt.clip(modifier.then(PaddingKt.m476padding3ABfNKs(modifierBorder6, fM3765constructorimpl2)), RoundedCornerShapeKt.getCircleShape()), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24624, 104);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f3 = fM3765constructorimpl;
                color4 = color3;
                z4 = z3;
            } else {
                if (i8 != 0) {
                    fM3765constructorimpl = Dp.m3765constructorimpl(0);
                } else {
                    fM3765constructorimpl = f2;
                }
                if (i4 != 0) {
                    color3 = null;
                } else {
                    color3 = color2;
                }
                if (i6 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1573972073, i3, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserHeaderView (UserComp.kt:238)");
                }
                Modifier.Companion companion7 = Modifier.INSTANCE;
                RoundedCornerShape circleShape7 = RoundedCornerShapeKt.getCircleShape();
                if (color3 != null) {
                    jM1705getTransparent0d7_KjU = color3.m1680unboximpl();
                } else {
                    jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                }
                Modifier modifierBorder7 = BorderKt.border(companion7, new BorderStroke(fM3765constructorimpl, new SolidColor(jM1705getTransparent0d7_KjU, null), null), circleShape7);
                if (z3) {
                    fM3765constructorimpl2 = fM3765constructorimpl;
                } else {
                    fM3765constructorimpl2 = Dp.m3765constructorimpl(0);
                }
                ImageKt.Image(p417o0OoO0.o00Oo0.OooO0O0(str, null, composerStartRestartGroup, i3 & 14, 1), (String) null, ClipKt.clip(modifier.then(PaddingKt.m476padding3ABfNKs(modifierBorder7, fM3765constructorimpl2)), RoundedCornerShapeKt.getCircleShape()), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24624, 104);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f3 = fM3765constructorimpl;
                color4 = color3;
                z4 = z3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Oooo000(str, modifier, f3, color4, z4, i, i2));
        }
        i3 |= 384;
        f2 = f;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 7168) == 0) {
                color2 = color;
                if (composerStartRestartGroup.changed(color2)) {
                    i5 = 2048;
                } else {
                    i5 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i3 |= i5;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((57344 & i) == 0) {
                    z2 = z;
                    if (composerStartRestartGroup.changed(z2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((46811 & i3) == 9362) {
                    if (i8 != 0) {
                        fM3765constructorimpl = Dp.m3765constructorimpl(0);
                    } else {
                        fM3765constructorimpl = f2;
                    }
                    if (i4 != 0) {
                        color3 = null;
                    } else {
                        color3 = color2;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1573972073, i3, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserHeaderView (UserComp.kt:238)");
                    }
                    Modifier.Companion companion8 = Modifier.INSTANCE;
                    RoundedCornerShape circleShape8 = RoundedCornerShapeKt.getCircleShape();
                    if (color3 != null) {
                        jM1705getTransparent0d7_KjU = color3.m1680unboximpl();
                    } else {
                        jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                    }
                    Modifier modifierBorder8 = BorderKt.border(companion8, new BorderStroke(fM3765constructorimpl, new SolidColor(jM1705getTransparent0d7_KjU, null), null), circleShape8);
                    if (z3) {
                        fM3765constructorimpl2 = fM3765constructorimpl;
                    } else {
                        fM3765constructorimpl2 = Dp.m3765constructorimpl(0);
                    }
                    ImageKt.Image(p417o0OoO0.o00Oo0.OooO0O0(str, null, composerStartRestartGroup, i3 & 14, 1), (String) null, ClipKt.clip(modifier.then(PaddingKt.m476padding3ABfNKs(modifierBorder8, fM3765constructorimpl2)), RoundedCornerShapeKt.getCircleShape()), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24624, 104);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f3 = fM3765constructorimpl;
                    color4 = color3;
                    z4 = z3;
                } else {
                    if (i8 != 0) {
                        fM3765constructorimpl = Dp.m3765constructorimpl(0);
                    } else {
                        fM3765constructorimpl = f2;
                    }
                    if (i4 != 0) {
                        color3 = null;
                    } else {
                        color3 = color2;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1573972073, i3, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserHeaderView (UserComp.kt:238)");
                    }
                    Modifier.Companion companion9 = Modifier.INSTANCE;
                    RoundedCornerShape circleShape9 = RoundedCornerShapeKt.getCircleShape();
                    if (color3 != null) {
                        jM1705getTransparent0d7_KjU = color3.m1680unboximpl();
                    } else {
                        jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                    }
                    Modifier modifierBorder9 = BorderKt.border(companion9, new BorderStroke(fM3765constructorimpl, new SolidColor(jM1705getTransparent0d7_KjU, null), null), circleShape9);
                    if (z3) {
                        fM3765constructorimpl2 = fM3765constructorimpl;
                    } else {
                        fM3765constructorimpl2 = Dp.m3765constructorimpl(0);
                    }
                    ImageKt.Image(p417o0OoO0.o00Oo0.OooO0O0(str, null, composerStartRestartGroup, i3 & 14, 1), (String) null, ClipKt.clip(modifier.then(PaddingKt.m476padding3ABfNKs(modifierBorder9, fM3765constructorimpl2)), RoundedCornerShapeKt.getCircleShape()), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24624, 104);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f3 = fM3765constructorimpl;
                    color4 = color3;
                    z4 = z3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Oooo000(str, modifier, f3, color4, z4, i, i2));
            }
            i3 |= 24576;
            z2 = z;
            if ((46811 & i3) == 9362) {
                if (i8 != 0) {
                    fM3765constructorimpl = Dp.m3765constructorimpl(0);
                } else {
                    fM3765constructorimpl = f2;
                }
                if (i4 != 0) {
                    color3 = null;
                } else {
                    color3 = color2;
                }
                if (i6 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1573972073, i3, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserHeaderView (UserComp.kt:238)");
                }
                Modifier.Companion companion10 = Modifier.INSTANCE;
                RoundedCornerShape circleShape10 = RoundedCornerShapeKt.getCircleShape();
                if (color3 != null) {
                    jM1705getTransparent0d7_KjU = color3.m1680unboximpl();
                } else {
                    jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                }
                Modifier modifierBorder10 = BorderKt.border(companion10, new BorderStroke(fM3765constructorimpl, new SolidColor(jM1705getTransparent0d7_KjU, null), null), circleShape10);
                if (z3) {
                    fM3765constructorimpl2 = fM3765constructorimpl;
                } else {
                    fM3765constructorimpl2 = Dp.m3765constructorimpl(0);
                }
                ImageKt.Image(p417o0OoO0.o00Oo0.OooO0O0(str, null, composerStartRestartGroup, i3 & 14, 1), (String) null, ClipKt.clip(modifier.then(PaddingKt.m476padding3ABfNKs(modifierBorder10, fM3765constructorimpl2)), RoundedCornerShapeKt.getCircleShape()), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24624, 104);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f3 = fM3765constructorimpl;
                color4 = color3;
                z4 = z3;
            } else {
                if (i8 != 0) {
                    fM3765constructorimpl = Dp.m3765constructorimpl(0);
                } else {
                    fM3765constructorimpl = f2;
                }
                if (i4 != 0) {
                    color3 = null;
                } else {
                    color3 = color2;
                }
                if (i6 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1573972073, i3, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserHeaderView (UserComp.kt:238)");
                }
                Modifier.Companion companion11 = Modifier.INSTANCE;
                RoundedCornerShape circleShape11 = RoundedCornerShapeKt.getCircleShape();
                if (color3 != null) {
                    jM1705getTransparent0d7_KjU = color3.m1680unboximpl();
                } else {
                    jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                }
                Modifier modifierBorder11 = BorderKt.border(companion11, new BorderStroke(fM3765constructorimpl, new SolidColor(jM1705getTransparent0d7_KjU, null), null), circleShape11);
                if (z3) {
                    fM3765constructorimpl2 = fM3765constructorimpl;
                } else {
                    fM3765constructorimpl2 = Dp.m3765constructorimpl(0);
                }
                ImageKt.Image(p417o0OoO0.o00Oo0.OooO0O0(str, null, composerStartRestartGroup, i3 & 14, 1), (String) null, ClipKt.clip(modifier.then(PaddingKt.m476padding3ABfNKs(modifierBorder11, fM3765constructorimpl2)), RoundedCornerShapeKt.getCircleShape()), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24624, 104);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f3 = fM3765constructorimpl;
                color4 = color3;
                z4 = z3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Oooo000(str, modifier, f3, color4, z4, i, i2));
        }
        i3 |= 3072;
        color2 = color;
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((57344 & i) == 0) {
                z2 = z;
                if (composerStartRestartGroup.changed(z2)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            if ((46811 & i3) == 9362) {
                if (i8 != 0) {
                    fM3765constructorimpl = Dp.m3765constructorimpl(0);
                } else {
                    fM3765constructorimpl = f2;
                }
                if (i4 != 0) {
                    color3 = null;
                } else {
                    color3 = color2;
                }
                if (i6 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1573972073, i3, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserHeaderView (UserComp.kt:238)");
                }
                Modifier.Companion companion12 = Modifier.INSTANCE;
                RoundedCornerShape circleShape12 = RoundedCornerShapeKt.getCircleShape();
                if (color3 != null) {
                    jM1705getTransparent0d7_KjU = color3.m1680unboximpl();
                } else {
                    jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                }
                Modifier modifierBorder12 = BorderKt.border(companion12, new BorderStroke(fM3765constructorimpl, new SolidColor(jM1705getTransparent0d7_KjU, null), null), circleShape12);
                if (z3) {
                    fM3765constructorimpl2 = fM3765constructorimpl;
                } else {
                    fM3765constructorimpl2 = Dp.m3765constructorimpl(0);
                }
                ImageKt.Image(p417o0OoO0.o00Oo0.OooO0O0(str, null, composerStartRestartGroup, i3 & 14, 1), (String) null, ClipKt.clip(modifier.then(PaddingKt.m476padding3ABfNKs(modifierBorder12, fM3765constructorimpl2)), RoundedCornerShapeKt.getCircleShape()), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24624, 104);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f3 = fM3765constructorimpl;
                color4 = color3;
                z4 = z3;
            } else {
                if (i8 != 0) {
                    fM3765constructorimpl = Dp.m3765constructorimpl(0);
                } else {
                    fM3765constructorimpl = f2;
                }
                if (i4 != 0) {
                    color3 = null;
                } else {
                    color3 = color2;
                }
                if (i6 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1573972073, i3, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserHeaderView (UserComp.kt:238)");
                }
                Modifier.Companion companion13 = Modifier.INSTANCE;
                RoundedCornerShape circleShape13 = RoundedCornerShapeKt.getCircleShape();
                if (color3 != null) {
                    jM1705getTransparent0d7_KjU = color3.m1680unboximpl();
                } else {
                    jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                }
                Modifier modifierBorder13 = BorderKt.border(companion13, new BorderStroke(fM3765constructorimpl, new SolidColor(jM1705getTransparent0d7_KjU, null), null), circleShape13);
                if (z3) {
                    fM3765constructorimpl2 = fM3765constructorimpl;
                } else {
                    fM3765constructorimpl2 = Dp.m3765constructorimpl(0);
                }
                ImageKt.Image(p417o0OoO0.o00Oo0.OooO0O0(str, null, composerStartRestartGroup, i3 & 14, 1), (String) null, ClipKt.clip(modifier.then(PaddingKt.m476padding3ABfNKs(modifierBorder13, fM3765constructorimpl2)), RoundedCornerShapeKt.getCircleShape()), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24624, 104);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f3 = fM3765constructorimpl;
                color4 = color3;
                z4 = z3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Oooo000(str, modifier, f3, color4, z4, i, i2));
        }
        i3 |= 24576;
        z2 = z;
        if ((46811 & i3) == 9362) {
            if (i8 != 0) {
                fM3765constructorimpl = Dp.m3765constructorimpl(0);
            } else {
                fM3765constructorimpl = f2;
            }
            if (i4 != 0) {
                color3 = null;
            } else {
                color3 = color2;
            }
            if (i6 != 0) {
                z3 = true;
            } else {
                z3 = z2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1573972073, i3, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserHeaderView (UserComp.kt:238)");
            }
            Modifier.Companion companion14 = Modifier.INSTANCE;
            RoundedCornerShape circleShape14 = RoundedCornerShapeKt.getCircleShape();
            if (color3 != null) {
                jM1705getTransparent0d7_KjU = color3.m1680unboximpl();
            } else {
                jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
            }
            Modifier modifierBorder14 = BorderKt.border(companion14, new BorderStroke(fM3765constructorimpl, new SolidColor(jM1705getTransparent0d7_KjU, null), null), circleShape14);
            if (z3) {
                fM3765constructorimpl2 = fM3765constructorimpl;
            } else {
                fM3765constructorimpl2 = Dp.m3765constructorimpl(0);
            }
            ImageKt.Image(p417o0OoO0.o00Oo0.OooO0O0(str, null, composerStartRestartGroup, i3 & 14, 1), (String) null, ClipKt.clip(modifier.then(PaddingKt.m476padding3ABfNKs(modifierBorder14, fM3765constructorimpl2)), RoundedCornerShapeKt.getCircleShape()), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24624, 104);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f3 = fM3765constructorimpl;
            color4 = color3;
            z4 = z3;
        } else {
            if (i8 != 0) {
                fM3765constructorimpl = Dp.m3765constructorimpl(0);
            } else {
                fM3765constructorimpl = f2;
            }
            if (i4 != 0) {
                color3 = null;
            } else {
                color3 = color2;
            }
            if (i6 != 0) {
                z3 = true;
            } else {
                z3 = z2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1573972073, i3, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserHeaderView (UserComp.kt:238)");
            }
            Modifier.Companion companion15 = Modifier.INSTANCE;
            RoundedCornerShape circleShape15 = RoundedCornerShapeKt.getCircleShape();
            if (color3 != null) {
                jM1705getTransparent0d7_KjU = color3.m1680unboximpl();
            } else {
                jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
            }
            Modifier modifierBorder15 = BorderKt.border(companion15, new BorderStroke(fM3765constructorimpl, new SolidColor(jM1705getTransparent0d7_KjU, null), null), circleShape15);
            if (z3) {
                fM3765constructorimpl2 = fM3765constructorimpl;
            } else {
                fM3765constructorimpl2 = Dp.m3765constructorimpl(0);
            }
            ImageKt.Image(p417o0OoO0.o00Oo0.OooO0O0(str, null, composerStartRestartGroup, i3 & 14, 1), (String) null, ClipKt.clip(modifier.then(PaddingKt.m476padding3ABfNKs(modifierBorder15, fM3765constructorimpl2)), RoundedCornerShapeKt.getCircleShape()), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24624, 104);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f3 = fM3765constructorimpl;
            color4 = color3;
            z4 = z3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Oooo000(str, modifier, f3, color4, z4, i, i2));
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0087  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00af  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00be  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:78:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:86:0x011d  */
    /* JADX WARN: Code duplicated, block: B:88:0x0125  */
    /* JADX WARN: Code duplicated, block: B:91:0x013f  */
    /* JADX WARN: Code duplicated, block: B:96:0x014c  */
    /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooOO0O(@Nullable String str, @NotNull Modifier modifier, float f, @Nullable Color color, boolean z, @Nullable Composer composer, int i, int i2) {
        int i3;
        float f2;
        int i4;
        Color color2;
        int i5;
        int i6;
        boolean z2;
        int i7;
        float fM3765constructorimpl;
        Color color3;
        boolean z3;
        long jM1705getTransparent0d7_KjU;
        float fM3765constructorimpl2;
        boolean zChanged;
        Object objRememberedValue;
        float f3;
        Color color4;
        boolean z4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1009631557);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 == 0) {
            if ((i & 896) == 0) {
                f2 = f;
                i3 |= composerStartRestartGroup.changed(f2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 7168) == 0) {
                    color2 = color;
                    if (composerStartRestartGroup.changed(color2)) {
                        i5 = 2048;
                    } else {
                        i5 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((57344 & i) == 0) {
                        z2 = z;
                        if (composerStartRestartGroup.changed(z2)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    if ((46811 & i3) == 9362 || !composerStartRestartGroup.getSkipping()) {
                        if (i8 != 0) {
                            fM3765constructorimpl = Dp.m3765constructorimpl(0);
                        } else {
                            fM3765constructorimpl = f2;
                        }
                        if (i4 != 0) {
                            color3 = null;
                        } else {
                            color3 = color2;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1009631557, i3, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserHeaderViewByNative (UserComp.kt:270)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        RoundedCornerShape circleShape = RoundedCornerShapeKt.getCircleShape();
                        if (color3 != null) {
                            jM1705getTransparent0d7_KjU = color3.m1680unboximpl();
                        } else {
                            jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                        }
                        Modifier modifierBorder = BorderKt.border(companion, new BorderStroke(fM3765constructorimpl, new SolidColor(jM1705getTransparent0d7_KjU, null), null), circleShape);
                        if (z3) {
                            fM3765constructorimpl2 = fM3765constructorimpl;
                        } else {
                            fM3765constructorimpl2 = Dp.m3765constructorimpl(0);
                        }
                        Modifier modifierClip = ClipKt.clip(modifier.then(PaddingKt.m476padding3ABfNKs(modifierBorder, fM3765constructorimpl2)), RoundedCornerShapeKt.getCircleShape());
                        Oooo0 oooo0 = Oooo0.f52034OooO0Oo;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(str);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new o000oOoO(str);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        AndroidView_androidKt.AndroidView(oooo0, modifierClip, (Function1) objRememberedValue, composerStartRestartGroup, 6, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f3 = fM3765constructorimpl;
                        color4 = color3;
                        z4 = z3;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        f3 = f2;
                        color4 = color2;
                        z4 = z2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new o0OoOo0(str, modifier, f3, color4, z4, i, i2));
                }
                i3 |= 24576;
                z2 = z;
                if ((46811 & i3) == 9362) {
                    if (i8 != 0) {
                        fM3765constructorimpl = Dp.m3765constructorimpl(0);
                    } else {
                        fM3765constructorimpl = f2;
                    }
                    if (i4 != 0) {
                        color3 = null;
                    } else {
                        color3 = color2;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1009631557, i3, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserHeaderViewByNative (UserComp.kt:270)");
                    }
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    RoundedCornerShape circleShape2 = RoundedCornerShapeKt.getCircleShape();
                    if (color3 != null) {
                        jM1705getTransparent0d7_KjU = color3.m1680unboximpl();
                    } else {
                        jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                    }
                    Modifier modifierBorder2 = BorderKt.border(companion2, new BorderStroke(fM3765constructorimpl, new SolidColor(jM1705getTransparent0d7_KjU, null), null), circleShape2);
                    if (z3) {
                        fM3765constructorimpl2 = fM3765constructorimpl;
                    } else {
                        fM3765constructorimpl2 = Dp.m3765constructorimpl(0);
                    }
                    Modifier modifierClip2 = ClipKt.clip(modifier.then(PaddingKt.m476padding3ABfNKs(modifierBorder2, fM3765constructorimpl2)), RoundedCornerShapeKt.getCircleShape());
                    Oooo0 oooo1 = Oooo0.f52034OooO0Oo;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(str);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new o000oOoO(str);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new o000oOoO(str);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    AndroidView_androidKt.AndroidView(oooo1, modifierClip2, (Function1) objRememberedValue, composerStartRestartGroup, 6, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f3 = fM3765constructorimpl;
                    color4 = color3;
                    z4 = z3;
                } else {
                    if (i8 != 0) {
                        fM3765constructorimpl = Dp.m3765constructorimpl(0);
                    } else {
                        fM3765constructorimpl = f2;
                    }
                    if (i4 != 0) {
                        color3 = null;
                    } else {
                        color3 = color2;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1009631557, i3, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserHeaderViewByNative (UserComp.kt:270)");
                    }
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    RoundedCornerShape circleShape3 = RoundedCornerShapeKt.getCircleShape();
                    if (color3 != null) {
                        jM1705getTransparent0d7_KjU = color3.m1680unboximpl();
                    } else {
                        jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                    }
                    Modifier modifierBorder3 = BorderKt.border(companion3, new BorderStroke(fM3765constructorimpl, new SolidColor(jM1705getTransparent0d7_KjU, null), null), circleShape3);
                    if (z3) {
                        fM3765constructorimpl2 = fM3765constructorimpl;
                    } else {
                        fM3765constructorimpl2 = Dp.m3765constructorimpl(0);
                    }
                    Modifier modifierClip3 = ClipKt.clip(modifier.then(PaddingKt.m476padding3ABfNKs(modifierBorder3, fM3765constructorimpl2)), RoundedCornerShapeKt.getCircleShape());
                    Oooo0 oooo2 = Oooo0.f52034OooO0Oo;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(str);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new o000oOoO(str);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new o000oOoO(str);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    AndroidView_androidKt.AndroidView(oooo2, modifierClip3, (Function1) objRememberedValue, composerStartRestartGroup, 6, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f3 = fM3765constructorimpl;
                    color4 = color3;
                    z4 = z3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new o0OoOo0(str, modifier, f3, color4, z4, i, i2));
            }
            i3 |= 3072;
            color2 = color;
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((57344 & i) == 0) {
                    z2 = z;
                    if (composerStartRestartGroup.changed(z2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((46811 & i3) == 9362) {
                    if (i8 != 0) {
                        fM3765constructorimpl = Dp.m3765constructorimpl(0);
                    } else {
                        fM3765constructorimpl = f2;
                    }
                    if (i4 != 0) {
                        color3 = null;
                    } else {
                        color3 = color2;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1009631557, i3, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserHeaderViewByNative (UserComp.kt:270)");
                    }
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    RoundedCornerShape circleShape4 = RoundedCornerShapeKt.getCircleShape();
                    if (color3 != null) {
                        jM1705getTransparent0d7_KjU = color3.m1680unboximpl();
                    } else {
                        jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                    }
                    Modifier modifierBorder4 = BorderKt.border(companion4, new BorderStroke(fM3765constructorimpl, new SolidColor(jM1705getTransparent0d7_KjU, null), null), circleShape4);
                    if (z3) {
                        fM3765constructorimpl2 = fM3765constructorimpl;
                    } else {
                        fM3765constructorimpl2 = Dp.m3765constructorimpl(0);
                    }
                    Modifier modifierClip4 = ClipKt.clip(modifier.then(PaddingKt.m476padding3ABfNKs(modifierBorder4, fM3765constructorimpl2)), RoundedCornerShapeKt.getCircleShape());
                    Oooo0 oooo3 = Oooo0.f52034OooO0Oo;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(str);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new o000oOoO(str);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new o000oOoO(str);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    AndroidView_androidKt.AndroidView(oooo3, modifierClip4, (Function1) objRememberedValue, composerStartRestartGroup, 6, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f3 = fM3765constructorimpl;
                    color4 = color3;
                    z4 = z3;
                } else {
                    if (i8 != 0) {
                        fM3765constructorimpl = Dp.m3765constructorimpl(0);
                    } else {
                        fM3765constructorimpl = f2;
                    }
                    if (i4 != 0) {
                        color3 = null;
                    } else {
                        color3 = color2;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1009631557, i3, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserHeaderViewByNative (UserComp.kt:270)");
                    }
                    Modifier.Companion companion5 = Modifier.INSTANCE;
                    RoundedCornerShape circleShape5 = RoundedCornerShapeKt.getCircleShape();
                    if (color3 != null) {
                        jM1705getTransparent0d7_KjU = color3.m1680unboximpl();
                    } else {
                        jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                    }
                    Modifier modifierBorder5 = BorderKt.border(companion5, new BorderStroke(fM3765constructorimpl, new SolidColor(jM1705getTransparent0d7_KjU, null), null), circleShape5);
                    if (z3) {
                        fM3765constructorimpl2 = fM3765constructorimpl;
                    } else {
                        fM3765constructorimpl2 = Dp.m3765constructorimpl(0);
                    }
                    Modifier modifierClip5 = ClipKt.clip(modifier.then(PaddingKt.m476padding3ABfNKs(modifierBorder5, fM3765constructorimpl2)), RoundedCornerShapeKt.getCircleShape());
                    Oooo0 oooo4 = Oooo0.f52034OooO0Oo;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(str);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new o000oOoO(str);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new o000oOoO(str);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    AndroidView_androidKt.AndroidView(oooo4, modifierClip5, (Function1) objRememberedValue, composerStartRestartGroup, 6, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f3 = fM3765constructorimpl;
                    color4 = color3;
                    z4 = z3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new o0OoOo0(str, modifier, f3, color4, z4, i, i2));
            }
            i3 |= 24576;
            z2 = z;
            if ((46811 & i3) == 9362) {
                if (i8 != 0) {
                    fM3765constructorimpl = Dp.m3765constructorimpl(0);
                } else {
                    fM3765constructorimpl = f2;
                }
                if (i4 != 0) {
                    color3 = null;
                } else {
                    color3 = color2;
                }
                if (i6 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1009631557, i3, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserHeaderViewByNative (UserComp.kt:270)");
                }
                Modifier.Companion companion6 = Modifier.INSTANCE;
                RoundedCornerShape circleShape6 = RoundedCornerShapeKt.getCircleShape();
                if (color3 != null) {
                    jM1705getTransparent0d7_KjU = color3.m1680unboximpl();
                } else {
                    jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                }
                Modifier modifierBorder6 = BorderKt.border(companion6, new BorderStroke(fM3765constructorimpl, new SolidColor(jM1705getTransparent0d7_KjU, null), null), circleShape6);
                if (z3) {
                    fM3765constructorimpl2 = fM3765constructorimpl;
                } else {
                    fM3765constructorimpl2 = Dp.m3765constructorimpl(0);
                }
                Modifier modifierClip6 = ClipKt.clip(modifier.then(PaddingKt.m476padding3ABfNKs(modifierBorder6, fM3765constructorimpl2)), RoundedCornerShapeKt.getCircleShape());
                Oooo0 oooo5 = Oooo0.f52034OooO0Oo;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(str);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new o000oOoO(str);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new o000oOoO(str);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                AndroidView_androidKt.AndroidView(oooo5, modifierClip6, (Function1) objRememberedValue, composerStartRestartGroup, 6, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f3 = fM3765constructorimpl;
                color4 = color3;
                z4 = z3;
            } else {
                if (i8 != 0) {
                    fM3765constructorimpl = Dp.m3765constructorimpl(0);
                } else {
                    fM3765constructorimpl = f2;
                }
                if (i4 != 0) {
                    color3 = null;
                } else {
                    color3 = color2;
                }
                if (i6 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1009631557, i3, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserHeaderViewByNative (UserComp.kt:270)");
                }
                Modifier.Companion companion7 = Modifier.INSTANCE;
                RoundedCornerShape circleShape7 = RoundedCornerShapeKt.getCircleShape();
                if (color3 != null) {
                    jM1705getTransparent0d7_KjU = color3.m1680unboximpl();
                } else {
                    jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                }
                Modifier modifierBorder7 = BorderKt.border(companion7, new BorderStroke(fM3765constructorimpl, new SolidColor(jM1705getTransparent0d7_KjU, null), null), circleShape7);
                if (z3) {
                    fM3765constructorimpl2 = fM3765constructorimpl;
                } else {
                    fM3765constructorimpl2 = Dp.m3765constructorimpl(0);
                }
                Modifier modifierClip7 = ClipKt.clip(modifier.then(PaddingKt.m476padding3ABfNKs(modifierBorder7, fM3765constructorimpl2)), RoundedCornerShapeKt.getCircleShape());
                Oooo0 oooo6 = Oooo0.f52034OooO0Oo;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(str);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new o000oOoO(str);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new o000oOoO(str);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                AndroidView_androidKt.AndroidView(oooo6, modifierClip7, (Function1) objRememberedValue, composerStartRestartGroup, 6, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f3 = fM3765constructorimpl;
                color4 = color3;
                z4 = z3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new o0OoOo0(str, modifier, f3, color4, z4, i, i2));
        }
        i3 |= 384;
        f2 = f;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 7168) == 0) {
                color2 = color;
                if (composerStartRestartGroup.changed(color2)) {
                    i5 = 2048;
                } else {
                    i5 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i3 |= i5;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((57344 & i) == 0) {
                    z2 = z;
                    if (composerStartRestartGroup.changed(z2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((46811 & i3) == 9362) {
                    if (i8 != 0) {
                        fM3765constructorimpl = Dp.m3765constructorimpl(0);
                    } else {
                        fM3765constructorimpl = f2;
                    }
                    if (i4 != 0) {
                        color3 = null;
                    } else {
                        color3 = color2;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1009631557, i3, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserHeaderViewByNative (UserComp.kt:270)");
                    }
                    Modifier.Companion companion8 = Modifier.INSTANCE;
                    RoundedCornerShape circleShape8 = RoundedCornerShapeKt.getCircleShape();
                    if (color3 != null) {
                        jM1705getTransparent0d7_KjU = color3.m1680unboximpl();
                    } else {
                        jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                    }
                    Modifier modifierBorder8 = BorderKt.border(companion8, new BorderStroke(fM3765constructorimpl, new SolidColor(jM1705getTransparent0d7_KjU, null), null), circleShape8);
                    if (z3) {
                        fM3765constructorimpl2 = fM3765constructorimpl;
                    } else {
                        fM3765constructorimpl2 = Dp.m3765constructorimpl(0);
                    }
                    Modifier modifierClip8 = ClipKt.clip(modifier.then(PaddingKt.m476padding3ABfNKs(modifierBorder8, fM3765constructorimpl2)), RoundedCornerShapeKt.getCircleShape());
                    Oooo0 oooo7 = Oooo0.f52034OooO0Oo;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(str);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new o000oOoO(str);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new o000oOoO(str);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    AndroidView_androidKt.AndroidView(oooo7, modifierClip8, (Function1) objRememberedValue, composerStartRestartGroup, 6, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f3 = fM3765constructorimpl;
                    color4 = color3;
                    z4 = z3;
                } else {
                    if (i8 != 0) {
                        fM3765constructorimpl = Dp.m3765constructorimpl(0);
                    } else {
                        fM3765constructorimpl = f2;
                    }
                    if (i4 != 0) {
                        color3 = null;
                    } else {
                        color3 = color2;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1009631557, i3, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserHeaderViewByNative (UserComp.kt:270)");
                    }
                    Modifier.Companion companion9 = Modifier.INSTANCE;
                    RoundedCornerShape circleShape9 = RoundedCornerShapeKt.getCircleShape();
                    if (color3 != null) {
                        jM1705getTransparent0d7_KjU = color3.m1680unboximpl();
                    } else {
                        jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                    }
                    Modifier modifierBorder9 = BorderKt.border(companion9, new BorderStroke(fM3765constructorimpl, new SolidColor(jM1705getTransparent0d7_KjU, null), null), circleShape9);
                    if (z3) {
                        fM3765constructorimpl2 = fM3765constructorimpl;
                    } else {
                        fM3765constructorimpl2 = Dp.m3765constructorimpl(0);
                    }
                    Modifier modifierClip9 = ClipKt.clip(modifier.then(PaddingKt.m476padding3ABfNKs(modifierBorder9, fM3765constructorimpl2)), RoundedCornerShapeKt.getCircleShape());
                    Oooo0 oooo8 = Oooo0.f52034OooO0Oo;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(str);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new o000oOoO(str);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new o000oOoO(str);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    AndroidView_androidKt.AndroidView(oooo8, modifierClip9, (Function1) objRememberedValue, composerStartRestartGroup, 6, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f3 = fM3765constructorimpl;
                    color4 = color3;
                    z4 = z3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new o0OoOo0(str, modifier, f3, color4, z4, i, i2));
            }
            i3 |= 24576;
            z2 = z;
            if ((46811 & i3) == 9362) {
                if (i8 != 0) {
                    fM3765constructorimpl = Dp.m3765constructorimpl(0);
                } else {
                    fM3765constructorimpl = f2;
                }
                if (i4 != 0) {
                    color3 = null;
                } else {
                    color3 = color2;
                }
                if (i6 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1009631557, i3, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserHeaderViewByNative (UserComp.kt:270)");
                }
                Modifier.Companion companion10 = Modifier.INSTANCE;
                RoundedCornerShape circleShape10 = RoundedCornerShapeKt.getCircleShape();
                if (color3 != null) {
                    jM1705getTransparent0d7_KjU = color3.m1680unboximpl();
                } else {
                    jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                }
                Modifier modifierBorder10 = BorderKt.border(companion10, new BorderStroke(fM3765constructorimpl, new SolidColor(jM1705getTransparent0d7_KjU, null), null), circleShape10);
                if (z3) {
                    fM3765constructorimpl2 = fM3765constructorimpl;
                } else {
                    fM3765constructorimpl2 = Dp.m3765constructorimpl(0);
                }
                Modifier modifierClip10 = ClipKt.clip(modifier.then(PaddingKt.m476padding3ABfNKs(modifierBorder10, fM3765constructorimpl2)), RoundedCornerShapeKt.getCircleShape());
                Oooo0 oooo9 = Oooo0.f52034OooO0Oo;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(str);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new o000oOoO(str);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new o000oOoO(str);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                AndroidView_androidKt.AndroidView(oooo9, modifierClip10, (Function1) objRememberedValue, composerStartRestartGroup, 6, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f3 = fM3765constructorimpl;
                color4 = color3;
                z4 = z3;
            } else {
                if (i8 != 0) {
                    fM3765constructorimpl = Dp.m3765constructorimpl(0);
                } else {
                    fM3765constructorimpl = f2;
                }
                if (i4 != 0) {
                    color3 = null;
                } else {
                    color3 = color2;
                }
                if (i6 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1009631557, i3, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserHeaderViewByNative (UserComp.kt:270)");
                }
                Modifier.Companion companion11 = Modifier.INSTANCE;
                RoundedCornerShape circleShape11 = RoundedCornerShapeKt.getCircleShape();
                if (color3 != null) {
                    jM1705getTransparent0d7_KjU = color3.m1680unboximpl();
                } else {
                    jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                }
                Modifier modifierBorder11 = BorderKt.border(companion11, new BorderStroke(fM3765constructorimpl, new SolidColor(jM1705getTransparent0d7_KjU, null), null), circleShape11);
                if (z3) {
                    fM3765constructorimpl2 = fM3765constructorimpl;
                } else {
                    fM3765constructorimpl2 = Dp.m3765constructorimpl(0);
                }
                Modifier modifierClip11 = ClipKt.clip(modifier.then(PaddingKt.m476padding3ABfNKs(modifierBorder11, fM3765constructorimpl2)), RoundedCornerShapeKt.getCircleShape());
                Oooo0 oooo10 = Oooo0.f52034OooO0Oo;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(str);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new o000oOoO(str);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new o000oOoO(str);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                AndroidView_androidKt.AndroidView(oooo10, modifierClip11, (Function1) objRememberedValue, composerStartRestartGroup, 6, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f3 = fM3765constructorimpl;
                color4 = color3;
                z4 = z3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new o0OoOo0(str, modifier, f3, color4, z4, i, i2));
        }
        i3 |= 3072;
        color2 = color;
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((57344 & i) == 0) {
                z2 = z;
                if (composerStartRestartGroup.changed(z2)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            if ((46811 & i3) == 9362) {
                if (i8 != 0) {
                    fM3765constructorimpl = Dp.m3765constructorimpl(0);
                } else {
                    fM3765constructorimpl = f2;
                }
                if (i4 != 0) {
                    color3 = null;
                } else {
                    color3 = color2;
                }
                if (i6 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1009631557, i3, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserHeaderViewByNative (UserComp.kt:270)");
                }
                Modifier.Companion companion12 = Modifier.INSTANCE;
                RoundedCornerShape circleShape12 = RoundedCornerShapeKt.getCircleShape();
                if (color3 != null) {
                    jM1705getTransparent0d7_KjU = color3.m1680unboximpl();
                } else {
                    jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                }
                Modifier modifierBorder12 = BorderKt.border(companion12, new BorderStroke(fM3765constructorimpl, new SolidColor(jM1705getTransparent0d7_KjU, null), null), circleShape12);
                if (z3) {
                    fM3765constructorimpl2 = fM3765constructorimpl;
                } else {
                    fM3765constructorimpl2 = Dp.m3765constructorimpl(0);
                }
                Modifier modifierClip12 = ClipKt.clip(modifier.then(PaddingKt.m476padding3ABfNKs(modifierBorder12, fM3765constructorimpl2)), RoundedCornerShapeKt.getCircleShape());
                Oooo0 oooo11 = Oooo0.f52034OooO0Oo;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(str);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new o000oOoO(str);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new o000oOoO(str);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                AndroidView_androidKt.AndroidView(oooo11, modifierClip12, (Function1) objRememberedValue, composerStartRestartGroup, 6, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f3 = fM3765constructorimpl;
                color4 = color3;
                z4 = z3;
            } else {
                if (i8 != 0) {
                    fM3765constructorimpl = Dp.m3765constructorimpl(0);
                } else {
                    fM3765constructorimpl = f2;
                }
                if (i4 != 0) {
                    color3 = null;
                } else {
                    color3 = color2;
                }
                if (i6 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1009631557, i3, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserHeaderViewByNative (UserComp.kt:270)");
                }
                Modifier.Companion companion13 = Modifier.INSTANCE;
                RoundedCornerShape circleShape13 = RoundedCornerShapeKt.getCircleShape();
                if (color3 != null) {
                    jM1705getTransparent0d7_KjU = color3.m1680unboximpl();
                } else {
                    jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
                }
                Modifier modifierBorder13 = BorderKt.border(companion13, new BorderStroke(fM3765constructorimpl, new SolidColor(jM1705getTransparent0d7_KjU, null), null), circleShape13);
                if (z3) {
                    fM3765constructorimpl2 = fM3765constructorimpl;
                } else {
                    fM3765constructorimpl2 = Dp.m3765constructorimpl(0);
                }
                Modifier modifierClip13 = ClipKt.clip(modifier.then(PaddingKt.m476padding3ABfNKs(modifierBorder13, fM3765constructorimpl2)), RoundedCornerShapeKt.getCircleShape());
                Oooo0 oooo12 = Oooo0.f52034OooO0Oo;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(str);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new o000oOoO(str);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new o000oOoO(str);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                AndroidView_androidKt.AndroidView(oooo12, modifierClip13, (Function1) objRememberedValue, composerStartRestartGroup, 6, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f3 = fM3765constructorimpl;
                color4 = color3;
                z4 = z3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new o0OoOo0(str, modifier, f3, color4, z4, i, i2));
        }
        i3 |= 24576;
        z2 = z;
        if ((46811 & i3) == 9362) {
            if (i8 != 0) {
                fM3765constructorimpl = Dp.m3765constructorimpl(0);
            } else {
                fM3765constructorimpl = f2;
            }
            if (i4 != 0) {
                color3 = null;
            } else {
                color3 = color2;
            }
            if (i6 != 0) {
                z3 = true;
            } else {
                z3 = z2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1009631557, i3, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserHeaderViewByNative (UserComp.kt:270)");
            }
            Modifier.Companion companion14 = Modifier.INSTANCE;
            RoundedCornerShape circleShape14 = RoundedCornerShapeKt.getCircleShape();
            if (color3 != null) {
                jM1705getTransparent0d7_KjU = color3.m1680unboximpl();
            } else {
                jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
            }
            Modifier modifierBorder14 = BorderKt.border(companion14, new BorderStroke(fM3765constructorimpl, new SolidColor(jM1705getTransparent0d7_KjU, null), null), circleShape14);
            if (z3) {
                fM3765constructorimpl2 = fM3765constructorimpl;
            } else {
                fM3765constructorimpl2 = Dp.m3765constructorimpl(0);
            }
            Modifier modifierClip14 = ClipKt.clip(modifier.then(PaddingKt.m476padding3ABfNKs(modifierBorder14, fM3765constructorimpl2)), RoundedCornerShapeKt.getCircleShape());
            Oooo0 oooo13 = Oooo0.f52034OooO0Oo;
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(str);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new o000oOoO(str);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new o000oOoO(str);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            AndroidView_androidKt.AndroidView(oooo13, modifierClip14, (Function1) objRememberedValue, composerStartRestartGroup, 6, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f3 = fM3765constructorimpl;
            color4 = color3;
            z4 = z3;
        } else {
            if (i8 != 0) {
                fM3765constructorimpl = Dp.m3765constructorimpl(0);
            } else {
                fM3765constructorimpl = f2;
            }
            if (i4 != 0) {
                color3 = null;
            } else {
                color3 = color2;
            }
            if (i6 != 0) {
                z3 = true;
            } else {
                z3 = z2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1009631557, i3, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserHeaderViewByNative (UserComp.kt:270)");
            }
            Modifier.Companion companion15 = Modifier.INSTANCE;
            RoundedCornerShape circleShape15 = RoundedCornerShapeKt.getCircleShape();
            if (color3 != null) {
                jM1705getTransparent0d7_KjU = color3.m1680unboximpl();
            } else {
                jM1705getTransparent0d7_KjU = Color.INSTANCE.m1705getTransparent0d7_KjU();
            }
            Modifier modifierBorder15 = BorderKt.border(companion15, new BorderStroke(fM3765constructorimpl, new SolidColor(jM1705getTransparent0d7_KjU, null), null), circleShape15);
            if (z3) {
                fM3765constructorimpl2 = fM3765constructorimpl;
            } else {
                fM3765constructorimpl2 = Dp.m3765constructorimpl(0);
            }
            Modifier modifierClip15 = ClipKt.clip(modifier.then(PaddingKt.m476padding3ABfNKs(modifierBorder15, fM3765constructorimpl2)), RoundedCornerShapeKt.getCircleShape());
            Oooo0 oooo14 = Oooo0.f52034OooO0Oo;
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(str);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new o000oOoO(str);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new o000oOoO(str);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            AndroidView_androidKt.AndroidView(oooo14, modifierClip15, (Function1) objRememberedValue, composerStartRestartGroup, 6, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f3 = fM3765constructorimpl;
            color4 = color3;
            z4 = z3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o0OoOo0(str, modifier, f3, color4, z4, i, i2));
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x0081  */
    /* JADX WARN: Code duplicated, block: B:51:0x0090 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0092  */
    /* JADX WARN: Code duplicated, block: B:53:0x0095  */
    /* JADX WARN: Code duplicated, block: B:56:0x0099  */
    /* JADX WARN: Code duplicated, block: B:57:0x009c  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:81:0x0101  */
    /* JADX WARN: Code duplicated, block: B:85:0x010e  */
    /* JADX WARN: Code duplicated, block: B:88:0x0138  */
    /* JADX WARN: Code duplicated, block: B:93:0x0146  */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooOO0o(@Nullable Modifier modifier, int i, boolean z, boolean z2, @Nullable Composer composer, int i2, int i3) {
        Modifier modifier2;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        int i6;
        Modifier modifier3;
        boolean z5;
        boolean z6;
        Painter painterPainterResource;
        Painter painter;
        boolean z7;
        boolean z8;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1270934570);
        int i7 = i3 & 1;
        if (i7 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 14) == 0) {
            modifier2 = modifier;
            i4 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        int i8 = i3 & 4;
        if (i8 == 0) {
            if ((i2 & 896) == 0) {
                z3 = z;
                i4 |= composerStartRestartGroup.changed(z3) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
            }
            i5 = i3 & 8;
            if (i5 != 0) {
                if ((i2 & 7168) == 0) {
                    z4 = z2;
                    if (composerStartRestartGroup.changed(z4)) {
                        i6 = 2048;
                    } else {
                        i6 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i4 |= i6;
                }
                if ((i4 & 5851) == 1170 || !composerStartRestartGroup.getSkipping()) {
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i8 != 0) {
                        z5 = false;
                    } else {
                        z5 = z3;
                    }
                    if (i5 != 0) {
                        z6 = false;
                    } else {
                        z6 = z4;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1270934570, i2, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserIdentityIdView (UserComp.kt:404)");
                    }
                    painterPainterResource = null;
                    if (i == 0) {
                        composerStartRestartGroup.startReplaceableGroup(613401379);
                        painterPainterResource = z6 ? PainterResources_androidKt.painterResource(oOo00OO0.icon_identity_gray, composerStartRestartGroup, 0) : null;
                        composerStartRestartGroup.endReplaceableGroup();
                    } else if (i == 1) {
                        composerStartRestartGroup.startReplaceableGroup(613400979);
                        painterPainterResource = PainterResources_androidKt.painterResource(oOo00OO0.icon_identity_red, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else if (i == 2) {
                        composerStartRestartGroup.startReplaceableGroup(613401064);
                        painterPainterResource = PainterResources_androidKt.painterResource(oOo00OO0.icon_identity_yellow, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else if (i != 3) {
                        composerStartRestartGroup.startReplaceableGroup(1835579921);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(613401153);
                        painterPainterResource = z5 ? PainterResources_androidKt.painterResource(oOo00OO0.icon_identity_green, composerStartRestartGroup, 0) : null;
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    painter = painterPainterResource;
                    if (painter != null) {
                        ImageKt.Image(painter, "", SizeKt.m523size3ABfNKs(Modifier.INSTANCE.then(modifier3), Dp.m3765constructorimpl(15)), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z7 = z5;
                    z8 = z6;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    z7 = z3;
                    z8 = z4;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new o00O0O(modifier3, i, z7, z8, i2, i3));
            }
            i4 |= 3072;
            z4 = z2;
            if ((i4 & 5851) == 1170) {
                if (i7 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i8 != 0) {
                    z5 = false;
                } else {
                    z5 = z3;
                }
                if (i5 != 0) {
                    z6 = false;
                } else {
                    z6 = z4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1270934570, i2, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserIdentityIdView (UserComp.kt:404)");
                }
                painterPainterResource = null;
                if (i == 0) {
                    composerStartRestartGroup.startReplaceableGroup(613401379);
                    if (z6) {
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                } else if (i == 1) {
                    composerStartRestartGroup.startReplaceableGroup(613400979);
                    painterPainterResource = PainterResources_androidKt.painterResource(oOo00OO0.icon_identity_red, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                } else if (i == 2) {
                    composerStartRestartGroup.startReplaceableGroup(613401064);
                    painterPainterResource = PainterResources_androidKt.painterResource(oOo00OO0.icon_identity_yellow, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                } else if (i != 3) {
                    composerStartRestartGroup.startReplaceableGroup(1835579921);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(613401153);
                    if (z5) {
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                }
                painter = painterPainterResource;
                if (painter != null) {
                    ImageKt.Image(painter, "", SizeKt.m523size3ABfNKs(Modifier.INSTANCE.then(modifier3), Dp.m3765constructorimpl(15)), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z7 = z5;
                z8 = z6;
            } else {
                if (i7 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i8 != 0) {
                    z5 = false;
                } else {
                    z5 = z3;
                }
                if (i5 != 0) {
                    z6 = false;
                } else {
                    z6 = z4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1270934570, i2, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserIdentityIdView (UserComp.kt:404)");
                }
                painterPainterResource = null;
                if (i == 0) {
                    composerStartRestartGroup.startReplaceableGroup(613401379);
                    if (z6) {
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                } else if (i == 1) {
                    composerStartRestartGroup.startReplaceableGroup(613400979);
                    painterPainterResource = PainterResources_androidKt.painterResource(oOo00OO0.icon_identity_red, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                } else if (i == 2) {
                    composerStartRestartGroup.startReplaceableGroup(613401064);
                    painterPainterResource = PainterResources_androidKt.painterResource(oOo00OO0.icon_identity_yellow, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                } else if (i != 3) {
                    composerStartRestartGroup.startReplaceableGroup(1835579921);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(613401153);
                    if (z5) {
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                }
                painter = painterPainterResource;
                if (painter != null) {
                    ImageKt.Image(painter, "", SizeKt.m523size3ABfNKs(Modifier.INSTANCE.then(modifier3), Dp.m3765constructorimpl(15)), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z7 = z5;
                z8 = z6;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new o00O0O(modifier3, i, z7, z8, i2, i3));
        }
        i4 |= 384;
        z3 = z;
        i5 = i3 & 8;
        if (i5 != 0) {
            if ((i2 & 7168) == 0) {
                z4 = z2;
                if (composerStartRestartGroup.changed(z4)) {
                    i6 = 2048;
                } else {
                    i6 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i4 |= i6;
            }
            if ((i4 & 5851) == 1170) {
                if (i7 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i8 != 0) {
                    z5 = false;
                } else {
                    z5 = z3;
                }
                if (i5 != 0) {
                    z6 = false;
                } else {
                    z6 = z4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1270934570, i2, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserIdentityIdView (UserComp.kt:404)");
                }
                painterPainterResource = null;
                if (i == 0) {
                    composerStartRestartGroup.startReplaceableGroup(613401379);
                    if (z6) {
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                } else if (i == 1) {
                    composerStartRestartGroup.startReplaceableGroup(613400979);
                    painterPainterResource = PainterResources_androidKt.painterResource(oOo00OO0.icon_identity_red, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                } else if (i == 2) {
                    composerStartRestartGroup.startReplaceableGroup(613401064);
                    painterPainterResource = PainterResources_androidKt.painterResource(oOo00OO0.icon_identity_yellow, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                } else if (i != 3) {
                    composerStartRestartGroup.startReplaceableGroup(1835579921);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(613401153);
                    if (z5) {
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                }
                painter = painterPainterResource;
                if (painter != null) {
                    ImageKt.Image(painter, "", SizeKt.m523size3ABfNKs(Modifier.INSTANCE.then(modifier3), Dp.m3765constructorimpl(15)), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z7 = z5;
                z8 = z6;
            } else {
                if (i7 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i8 != 0) {
                    z5 = false;
                } else {
                    z5 = z3;
                }
                if (i5 != 0) {
                    z6 = false;
                } else {
                    z6 = z4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1270934570, i2, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserIdentityIdView (UserComp.kt:404)");
                }
                painterPainterResource = null;
                if (i == 0) {
                    composerStartRestartGroup.startReplaceableGroup(613401379);
                    if (z6) {
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                } else if (i == 1) {
                    composerStartRestartGroup.startReplaceableGroup(613400979);
                    painterPainterResource = PainterResources_androidKt.painterResource(oOo00OO0.icon_identity_red, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                } else if (i == 2) {
                    composerStartRestartGroup.startReplaceableGroup(613401064);
                    painterPainterResource = PainterResources_androidKt.painterResource(oOo00OO0.icon_identity_yellow, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                } else if (i != 3) {
                    composerStartRestartGroup.startReplaceableGroup(1835579921);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(613401153);
                    if (z5) {
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                }
                painter = painterPainterResource;
                if (painter != null) {
                    ImageKt.Image(painter, "", SizeKt.m523size3ABfNKs(Modifier.INSTANCE.then(modifier3), Dp.m3765constructorimpl(15)), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z7 = z5;
                z8 = z6;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new o00O0O(modifier3, i, z7, z8, i2, i3));
        }
        i4 |= 3072;
        z4 = z2;
        if ((i4 & 5851) == 1170) {
            if (i7 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i8 != 0) {
                z5 = false;
            } else {
                z5 = z3;
            }
            if (i5 != 0) {
                z6 = false;
            } else {
                z6 = z4;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1270934570, i2, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserIdentityIdView (UserComp.kt:404)");
            }
            painterPainterResource = null;
            if (i == 0) {
                composerStartRestartGroup.startReplaceableGroup(613401379);
                if (z6) {
                }
                composerStartRestartGroup.endReplaceableGroup();
            } else if (i == 1) {
                composerStartRestartGroup.startReplaceableGroup(613400979);
                painterPainterResource = PainterResources_androidKt.painterResource(oOo00OO0.icon_identity_red, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
            } else if (i == 2) {
                composerStartRestartGroup.startReplaceableGroup(613401064);
                painterPainterResource = PainterResources_androidKt.painterResource(oOo00OO0.icon_identity_yellow, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
            } else if (i != 3) {
                composerStartRestartGroup.startReplaceableGroup(1835579921);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(613401153);
                if (z5) {
                }
                composerStartRestartGroup.endReplaceableGroup();
            }
            painter = painterPainterResource;
            if (painter != null) {
                ImageKt.Image(painter, "", SizeKt.m523size3ABfNKs(Modifier.INSTANCE.then(modifier3), Dp.m3765constructorimpl(15)), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z7 = z5;
            z8 = z6;
        } else {
            if (i7 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i8 != 0) {
                z5 = false;
            } else {
                z5 = z3;
            }
            if (i5 != 0) {
                z6 = false;
            } else {
                z6 = z4;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1270934570, i2, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserIdentityIdView (UserComp.kt:404)");
            }
            painterPainterResource = null;
            if (i == 0) {
                composerStartRestartGroup.startReplaceableGroup(613401379);
                if (z6) {
                }
                composerStartRestartGroup.endReplaceableGroup();
            } else if (i == 1) {
                composerStartRestartGroup.startReplaceableGroup(613400979);
                painterPainterResource = PainterResources_androidKt.painterResource(oOo00OO0.icon_identity_red, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
            } else if (i == 2) {
                composerStartRestartGroup.startReplaceableGroup(613401064);
                painterPainterResource = PainterResources_androidKt.painterResource(oOo00OO0.icon_identity_yellow, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
            } else if (i != 3) {
                composerStartRestartGroup.startReplaceableGroup(1835579921);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(613401153);
                if (z5) {
                }
                composerStartRestartGroup.endReplaceableGroup();
            }
            painter = painterPainterResource;
            if (painter != null) {
                ImageKt.Image(painter, "", SizeKt.m523size3ABfNKs(Modifier.INSTANCE.then(modifier3), Dp.m3765constructorimpl(15)), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z7 = z5;
            z8 = z6;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o00O0O(modifier3, i, z7, z8, i2, i3));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0044  */
    /* JADX WARN: Code duplicated, block: B:27:0x0047  */
    /* JADX WARN: Code duplicated, block: B:29:0x004b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:37:0x0060  */
    /* JADX WARN: Code duplicated, block: B:38:0x0063  */
    /* JADX WARN: Code duplicated, block: B:40:0x0067  */
    /* JADX WARN: Code duplicated, block: B:42:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0072  */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0091  */
    /* JADX WARN: Code duplicated, block: B:56:0x0094  */
    /* JADX WARN: Code duplicated, block: B:57:0x009a  */
    /* JADX WARN: Code duplicated, block: B:59:0x009d  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:79:0x0108  */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooOOO(@Nullable String str, @Nullable Integer num, float f, @Nullable Modifier modifier, @Nullable Composer composer, int i, int i2) {
        int i3;
        Integer num2;
        int i4;
        float f2;
        int i5;
        int i6;
        Modifier modifier2;
        int i7;
        Integer num3;
        float fM3765constructorimpl;
        Modifier modifier3;
        Integer num4;
        float f3;
        Modifier modifier4;
        boolean zChanged;
        Object objRememberedValue;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1356895543);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 == 0) {
            if ((i & 112) == 0) {
                num2 = num;
                i3 |= composerStartRestartGroup.changed(num2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    f2 = f;
                    if (composerStartRestartGroup.changed(f2)) {
                        i5 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 7168) == 0) {
                        modifier2 = modifier;
                        if (composerStartRestartGroup.changed(modifier2)) {
                            i7 = 2048;
                        } else {
                            i7 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                        }
                        i3 |= i7;
                    }
                    if ((i3 & 5851) == 1170 || !composerStartRestartGroup.getSkipping()) {
                        if (i8 != 0) {
                            num3 = null;
                        } else {
                            num3 = num2;
                        }
                        if (i4 != 0) {
                            fM3765constructorimpl = Dp.m3765constructorimpl(16);
                        } else {
                            fM3765constructorimpl = f2;
                        }
                        if (i6 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1356895543, i3, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserMedalView (UserComp.kt:755)");
                        }
                        if (str != null) {
                            LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(num3);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new o00Ooo(num3);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            AndroidView_androidKt.AndroidView((Function1) objRememberedValue, SizeKt.m509height3ABfNKs(Modifier.INSTANCE.then(modifier3), fM3765constructorimpl), new oo000o(str, lifecycleOwner), composerStartRestartGroup, 0, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        num4 = num3;
                        f3 = fM3765constructorimpl;
                        modifier4 = modifier3;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        num4 = num2;
                        f3 = f2;
                        modifier4 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new o00oO0o(str, num4, f3, modifier4, i, i2));
                }
                i3 |= 3072;
                modifier2 = modifier;
                if ((i3 & 5851) == 1170) {
                    if (i8 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    if (i4 != 0) {
                        fM3765constructorimpl = Dp.m3765constructorimpl(16);
                    } else {
                        fM3765constructorimpl = f2;
                    }
                    if (i6 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1356895543, i3, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserMedalView (UserComp.kt:755)");
                    }
                    if (str != null) {
                        LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(num3);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new o00Ooo(num3);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new o00Ooo(num3);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        AndroidView_androidKt.AndroidView((Function1) objRememberedValue, SizeKt.m509height3ABfNKs(Modifier.INSTANCE.then(modifier3), fM3765constructorimpl), new oo000o(str, lifecycleOwner2), composerStartRestartGroup, 0, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    num4 = num3;
                    f3 = fM3765constructorimpl;
                    modifier4 = modifier3;
                } else {
                    if (i8 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    if (i4 != 0) {
                        fM3765constructorimpl = Dp.m3765constructorimpl(16);
                    } else {
                        fM3765constructorimpl = f2;
                    }
                    if (i6 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1356895543, i3, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserMedalView (UserComp.kt:755)");
                    }
                    if (str != null) {
                        LifecycleOwner lifecycleOwner3 = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(num3);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new o00Ooo(num3);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new o00Ooo(num3);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        AndroidView_androidKt.AndroidView((Function1) objRememberedValue, SizeKt.m509height3ABfNKs(Modifier.INSTANCE.then(modifier3), fM3765constructorimpl), new oo000o(str, lifecycleOwner3), composerStartRestartGroup, 0, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    num4 = num3;
                    f3 = fM3765constructorimpl;
                    modifier4 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new o00oO0o(str, num4, f3, modifier4, i, i2));
            }
            i3 |= 384;
            f2 = f;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 7168) == 0) {
                    modifier2 = modifier;
                    if (composerStartRestartGroup.changed(modifier2)) {
                        i7 = 2048;
                    } else {
                        i7 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i3 |= i7;
                }
                if ((i3 & 5851) == 1170) {
                    if (i8 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    if (i4 != 0) {
                        fM3765constructorimpl = Dp.m3765constructorimpl(16);
                    } else {
                        fM3765constructorimpl = f2;
                    }
                    if (i6 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1356895543, i3, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserMedalView (UserComp.kt:755)");
                    }
                    if (str != null) {
                        LifecycleOwner lifecycleOwner4 = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(num3);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new o00Ooo(num3);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new o00Ooo(num3);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        AndroidView_androidKt.AndroidView((Function1) objRememberedValue, SizeKt.m509height3ABfNKs(Modifier.INSTANCE.then(modifier3), fM3765constructorimpl), new oo000o(str, lifecycleOwner4), composerStartRestartGroup, 0, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    num4 = num3;
                    f3 = fM3765constructorimpl;
                    modifier4 = modifier3;
                } else {
                    if (i8 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    if (i4 != 0) {
                        fM3765constructorimpl = Dp.m3765constructorimpl(16);
                    } else {
                        fM3765constructorimpl = f2;
                    }
                    if (i6 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1356895543, i3, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserMedalView (UserComp.kt:755)");
                    }
                    if (str != null) {
                        LifecycleOwner lifecycleOwner5 = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(num3);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new o00Ooo(num3);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new o00Ooo(num3);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        AndroidView_androidKt.AndroidView((Function1) objRememberedValue, SizeKt.m509height3ABfNKs(Modifier.INSTANCE.then(modifier3), fM3765constructorimpl), new oo000o(str, lifecycleOwner5), composerStartRestartGroup, 0, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    num4 = num3;
                    f3 = fM3765constructorimpl;
                    modifier4 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new o00oO0o(str, num4, f3, modifier4, i, i2));
            }
            i3 |= 3072;
            modifier2 = modifier;
            if ((i3 & 5851) == 1170) {
                if (i8 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                if (i4 != 0) {
                    fM3765constructorimpl = Dp.m3765constructorimpl(16);
                } else {
                    fM3765constructorimpl = f2;
                }
                if (i6 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1356895543, i3, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserMedalView (UserComp.kt:755)");
                }
                if (str != null) {
                    LifecycleOwner lifecycleOwner6 = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(num3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new o00Ooo(num3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new o00Ooo(num3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    AndroidView_androidKt.AndroidView((Function1) objRememberedValue, SizeKt.m509height3ABfNKs(Modifier.INSTANCE.then(modifier3), fM3765constructorimpl), new oo000o(str, lifecycleOwner6), composerStartRestartGroup, 0, 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                num4 = num3;
                f3 = fM3765constructorimpl;
                modifier4 = modifier3;
            } else {
                if (i8 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                if (i4 != 0) {
                    fM3765constructorimpl = Dp.m3765constructorimpl(16);
                } else {
                    fM3765constructorimpl = f2;
                }
                if (i6 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1356895543, i3, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserMedalView (UserComp.kt:755)");
                }
                if (str != null) {
                    LifecycleOwner lifecycleOwner7 = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(num3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new o00Ooo(num3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new o00Ooo(num3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    AndroidView_androidKt.AndroidView((Function1) objRememberedValue, SizeKt.m509height3ABfNKs(Modifier.INSTANCE.then(modifier3), fM3765constructorimpl), new oo000o(str, lifecycleOwner7), composerStartRestartGroup, 0, 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                num4 = num3;
                f3 = fM3765constructorimpl;
                modifier4 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new o00oO0o(str, num4, f3, modifier4, i, i2));
        }
        i3 |= 48;
        num2 = num;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 896) == 0) {
                f2 = f;
                if (composerStartRestartGroup.changed(f2)) {
                    i5 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 7168) == 0) {
                    modifier2 = modifier;
                    if (composerStartRestartGroup.changed(modifier2)) {
                        i7 = 2048;
                    } else {
                        i7 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i3 |= i7;
                }
                if ((i3 & 5851) == 1170) {
                    if (i8 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    if (i4 != 0) {
                        fM3765constructorimpl = Dp.m3765constructorimpl(16);
                    } else {
                        fM3765constructorimpl = f2;
                    }
                    if (i6 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1356895543, i3, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserMedalView (UserComp.kt:755)");
                    }
                    if (str != null) {
                        LifecycleOwner lifecycleOwner8 = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(num3);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new o00Ooo(num3);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new o00Ooo(num3);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        AndroidView_androidKt.AndroidView((Function1) objRememberedValue, SizeKt.m509height3ABfNKs(Modifier.INSTANCE.then(modifier3), fM3765constructorimpl), new oo000o(str, lifecycleOwner8), composerStartRestartGroup, 0, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    num4 = num3;
                    f3 = fM3765constructorimpl;
                    modifier4 = modifier3;
                } else {
                    if (i8 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    if (i4 != 0) {
                        fM3765constructorimpl = Dp.m3765constructorimpl(16);
                    } else {
                        fM3765constructorimpl = f2;
                    }
                    if (i6 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1356895543, i3, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserMedalView (UserComp.kt:755)");
                    }
                    if (str != null) {
                        LifecycleOwner lifecycleOwner9 = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(num3);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new o00Ooo(num3);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new o00Ooo(num3);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        AndroidView_androidKt.AndroidView((Function1) objRememberedValue, SizeKt.m509height3ABfNKs(Modifier.INSTANCE.then(modifier3), fM3765constructorimpl), new oo000o(str, lifecycleOwner9), composerStartRestartGroup, 0, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    num4 = num3;
                    f3 = fM3765constructorimpl;
                    modifier4 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new o00oO0o(str, num4, f3, modifier4, i, i2));
            }
            i3 |= 3072;
            modifier2 = modifier;
            if ((i3 & 5851) == 1170) {
                if (i8 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                if (i4 != 0) {
                    fM3765constructorimpl = Dp.m3765constructorimpl(16);
                } else {
                    fM3765constructorimpl = f2;
                }
                if (i6 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1356895543, i3, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserMedalView (UserComp.kt:755)");
                }
                if (str != null) {
                    LifecycleOwner lifecycleOwner10 = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(num3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new o00Ooo(num3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new o00Ooo(num3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    AndroidView_androidKt.AndroidView((Function1) objRememberedValue, SizeKt.m509height3ABfNKs(Modifier.INSTANCE.then(modifier3), fM3765constructorimpl), new oo000o(str, lifecycleOwner10), composerStartRestartGroup, 0, 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                num4 = num3;
                f3 = fM3765constructorimpl;
                modifier4 = modifier3;
            } else {
                if (i8 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                if (i4 != 0) {
                    fM3765constructorimpl = Dp.m3765constructorimpl(16);
                } else {
                    fM3765constructorimpl = f2;
                }
                if (i6 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1356895543, i3, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserMedalView (UserComp.kt:755)");
                }
                if (str != null) {
                    LifecycleOwner lifecycleOwner11 = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(num3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new o00Ooo(num3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new o00Ooo(num3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    AndroidView_androidKt.AndroidView((Function1) objRememberedValue, SizeKt.m509height3ABfNKs(Modifier.INSTANCE.then(modifier3), fM3765constructorimpl), new oo000o(str, lifecycleOwner11), composerStartRestartGroup, 0, 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                num4 = num3;
                f3 = fM3765constructorimpl;
                modifier4 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new o00oO0o(str, num4, f3, modifier4, i, i2));
        }
        i3 |= 384;
        f2 = f;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 7168) == 0) {
                modifier2 = modifier;
                if (composerStartRestartGroup.changed(modifier2)) {
                    i7 = 2048;
                } else {
                    i7 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i3 |= i7;
            }
            if ((i3 & 5851) == 1170) {
                if (i8 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                if (i4 != 0) {
                    fM3765constructorimpl = Dp.m3765constructorimpl(16);
                } else {
                    fM3765constructorimpl = f2;
                }
                if (i6 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1356895543, i3, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserMedalView (UserComp.kt:755)");
                }
                if (str != null) {
                    LifecycleOwner lifecycleOwner12 = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(num3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new o00Ooo(num3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new o00Ooo(num3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    AndroidView_androidKt.AndroidView((Function1) objRememberedValue, SizeKt.m509height3ABfNKs(Modifier.INSTANCE.then(modifier3), fM3765constructorimpl), new oo000o(str, lifecycleOwner12), composerStartRestartGroup, 0, 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                num4 = num3;
                f3 = fM3765constructorimpl;
                modifier4 = modifier3;
            } else {
                if (i8 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                if (i4 != 0) {
                    fM3765constructorimpl = Dp.m3765constructorimpl(16);
                } else {
                    fM3765constructorimpl = f2;
                }
                if (i6 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1356895543, i3, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserMedalView (UserComp.kt:755)");
                }
                if (str != null) {
                    LifecycleOwner lifecycleOwner13 = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(num3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new o00Ooo(num3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new o00Ooo(num3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    AndroidView_androidKt.AndroidView((Function1) objRememberedValue, SizeKt.m509height3ABfNKs(Modifier.INSTANCE.then(modifier3), fM3765constructorimpl), new oo000o(str, lifecycleOwner13), composerStartRestartGroup, 0, 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                num4 = num3;
                f3 = fM3765constructorimpl;
                modifier4 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new o00oO0o(str, num4, f3, modifier4, i, i2));
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 5851) == 1170) {
            if (i8 != 0) {
                num3 = null;
            } else {
                num3 = num2;
            }
            if (i4 != 0) {
                fM3765constructorimpl = Dp.m3765constructorimpl(16);
            } else {
                fM3765constructorimpl = f2;
            }
            if (i6 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1356895543, i3, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserMedalView (UserComp.kt:755)");
            }
            if (str != null) {
                LifecycleOwner lifecycleOwner14 = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(num3);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new o00Ooo(num3);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new o00Ooo(num3);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                AndroidView_androidKt.AndroidView((Function1) objRememberedValue, SizeKt.m509height3ABfNKs(Modifier.INSTANCE.then(modifier3), fM3765constructorimpl), new oo000o(str, lifecycleOwner14), composerStartRestartGroup, 0, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            num4 = num3;
            f3 = fM3765constructorimpl;
            modifier4 = modifier3;
        } else {
            if (i8 != 0) {
                num3 = null;
            } else {
                num3 = num2;
            }
            if (i4 != 0) {
                fM3765constructorimpl = Dp.m3765constructorimpl(16);
            } else {
                fM3765constructorimpl = f2;
            }
            if (i6 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1356895543, i3, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserMedalView (UserComp.kt:755)");
            }
            if (str != null) {
                LifecycleOwner lifecycleOwner15 = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(num3);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new o00Ooo(num3);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new o00Ooo(num3);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                AndroidView_androidKt.AndroidView((Function1) objRememberedValue, SizeKt.m509height3ABfNKs(Modifier.INSTANCE.then(modifier3), fM3765constructorimpl), new oo000o(str, lifecycleOwner15), composerStartRestartGroup, 0, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            num4 = num3;
            f3 = fM3765constructorimpl;
            modifier4 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o00oO0o(str, num4, f3, modifier4, i, i2));
    }

    /* JADX WARN: Code duplicated, block: B:52:0x008b  */
    /* JADX WARN: Code duplicated, block: B:54:0x0092  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c7 A[PHI: r3 r4 r6
      0x00c7: PHI (r3v20 int) = (r3v14 int), (r3v22 int), (r3v23 int) binds: [B:69:0x00c0, B:61:0x00a4, B:62:0x00a6] A[DONT_GENERATE, DONT_INLINE]
      0x00c7: PHI (r4v7 long) = (r4v3 long), (r4v2 long), (r4v2 long) binds: [B:69:0x00c0, B:61:0x00a4, B:62:0x00a6] A[DONT_GENERATE, DONT_INLINE]
      0x00c7: PHI (r6v7 long) = (r6v3 long), (r6v2 long), (r6v2 long) binds: [B:69:0x00c0, B:61:0x00a4, B:62:0x00a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:77:0x00db  */
    /* JADX WARN: Code duplicated, block: B:80:0x0135  */
    /* JADX WARN: Code duplicated, block: B:85:0x0145  */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:77:0x00db, please report this as an issue */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooOOO0(@Nullable Integer num, long j, long j2, @Nullable Modifier modifier, @Nullable Composer composer, int i, int i2) {
        int i3;
        long j3;
        long jOooO0OO;
        Modifier modifier2;
        int i4;
        Modifier modifier3;
        Modifier modifier4;
        long j4;
        long j5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1903785863);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(num) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0) {
                j3 = j;
                int i5 = composerStartRestartGroup.changed(j3) ? 32 : 16;
                i3 |= i5;
            } else {
                j3 = j;
            }
            i3 |= i5;
        } else {
            j3 = j;
        }
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                jOooO0OO = j2;
                int i6 = composerStartRestartGroup.changed(jOooO0OO) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
                i3 |= i6;
            } else {
                jOooO0OO = j2;
            }
            i3 |= i6;
        } else {
            jOooO0OO = j2;
        }
        int i7 = i2 & 8;
        if (i7 == 0) {
            if ((i & 7168) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            }
            if ((i3 & 5851) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if ((i2 & 2) != 0) {
                        int i8 = o0oO0O0o.f47152o00OOOo;
                        j3 = o0oO0O0o.f46993OoooOo0;
                        i3 &= -113;
                    }
                    if ((i2 & 4) != 0) {
                        jOooO0OO = com.code.android.util.o0000O0.OooO0OO(13, composerStartRestartGroup, 6);
                        i3 &= -897;
                    }
                    if (i7 != 0) {
                        i4 = i3;
                        modifier3 = Modifier.INSTANCE;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1903785863, i4, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserLevelView (UserComp.kt:197)");
                    }
                    if (num != null) {
                        num.intValue();
                        FontWeight medium = FontWeight.INSTANCE.getMedium();
                        int iM3410getItalic_LCdwA = FontStyle.INSTANCE.m3410getItalic_LCdwA();
                        Modifier modifierThen = Modifier.INSTANCE.then(modifier3);
                        FontStyle fontStyleM3403boximpl = FontStyle.m3403boximpl(iM3410getItalic_LCdwA);
                        int i9 = i4 << 3;
                        TextKt.m1251Text4IGK_g("LV." + num, modifierThen, j3, jOooO0OO, fontStyleM3403boximpl, medium, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i9 & 896) | 196608 | (i9 & 7168), 0, 131008);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    j4 = j3;
                    j5 = jOooO0OO;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                }
                i4 = i3;
                modifier3 = modifier2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1903785863, i4, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserLevelView (UserComp.kt:197)");
                }
                if (num != null) {
                    num.intValue();
                    FontWeight medium2 = FontWeight.INSTANCE.getMedium();
                    int iM3410getItalic_LCdwA2 = FontStyle.INSTANCE.m3410getItalic_LCdwA();
                    Modifier modifierThen2 = Modifier.INSTANCE.then(modifier3);
                    FontStyle fontStyleM3403boximpl2 = FontStyle.m3403boximpl(iM3410getItalic_LCdwA2);
                    int i10 = i4 << 3;
                    TextKt.m1251Text4IGK_g("LV." + num, modifierThen2, j3, jOooO0OO, fontStyleM3403boximpl2, medium2, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i10 & 896) | 196608 | (i10 & 7168), 0, 131008);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                j4 = j3;
                j5 = jOooO0OO;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                j4 = j3;
                j5 = jOooO0OO;
                modifier4 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new o00Oo0(num, j4, j5, modifier4, i, i2));
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 5851) == 1170) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if ((i2 & 2) != 0) {
                    int i11 = o0oO0O0o.f47152o00OOOo;
                    j3 = o0oO0O0o.f46993OoooOo0;
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    jOooO0OO = com.code.android.util.o0000O0.OooO0OO(13, composerStartRestartGroup, 6);
                    i3 &= -897;
                }
                if (i7 != 0) {
                    i4 = i3;
                    modifier3 = Modifier.INSTANCE;
                } else {
                    i4 = i3;
                    modifier3 = modifier2;
                }
            } else {
                if ((i2 & 2) != 0) {
                    int i12 = o0oO0O0o.f47152o00OOOo;
                    j3 = o0oO0O0o.f46993OoooOo0;
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    jOooO0OO = com.code.android.util.o0000O0.OooO0OO(13, composerStartRestartGroup, 6);
                    i3 &= -897;
                }
                if (i7 != 0) {
                    i4 = i3;
                    modifier3 = Modifier.INSTANCE;
                } else {
                    i4 = i3;
                    modifier3 = modifier2;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1903785863, i4, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserLevelView (UserComp.kt:197)");
            }
            if (num != null) {
                num.intValue();
                FontWeight medium3 = FontWeight.INSTANCE.getMedium();
                int iM3410getItalic_LCdwA3 = FontStyle.INSTANCE.m3410getItalic_LCdwA();
                Modifier modifierThen3 = Modifier.INSTANCE.then(modifier3);
                FontStyle fontStyleM3403boximpl3 = FontStyle.m3403boximpl(iM3410getItalic_LCdwA3);
                int i13 = i4 << 3;
                TextKt.m1251Text4IGK_g("LV." + num, modifierThen3, j3, jOooO0OO, fontStyleM3403boximpl3, medium3, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i13 & 896) | 196608 | (i13 & 7168), 0, 131008);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            j4 = j3;
            j5 = jOooO0OO;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if ((i2 & 2) != 0) {
                    int i14 = o0oO0O0o.f47152o00OOOo;
                    j3 = o0oO0O0o.f46993OoooOo0;
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    jOooO0OO = com.code.android.util.o0000O0.OooO0OO(13, composerStartRestartGroup, 6);
                    i3 &= -897;
                }
                if (i7 != 0) {
                    i4 = i3;
                    modifier3 = Modifier.INSTANCE;
                } else {
                    i4 = i3;
                    modifier3 = modifier2;
                }
            } else {
                if ((i2 & 2) != 0) {
                    int i15 = o0oO0O0o.f47152o00OOOo;
                    j3 = o0oO0O0o.f46993OoooOo0;
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    jOooO0OO = com.code.android.util.o0000O0.OooO0OO(13, composerStartRestartGroup, 6);
                    i3 &= -897;
                }
                if (i7 != 0) {
                    i4 = i3;
                    modifier3 = Modifier.INSTANCE;
                } else {
                    i4 = i3;
                    modifier3 = modifier2;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1903785863, i4, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserLevelView (UserComp.kt:197)");
            }
            if (num != null) {
                num.intValue();
                FontWeight medium4 = FontWeight.INSTANCE.getMedium();
                int iM3410getItalic_LCdwA4 = FontStyle.INSTANCE.m3410getItalic_LCdwA();
                Modifier modifierThen4 = Modifier.INSTANCE.then(modifier3);
                FontStyle fontStyleM3403boximpl4 = FontStyle.m3403boximpl(iM3410getItalic_LCdwA4);
                int i16 = i4 << 3;
                TextKt.m1251Text4IGK_g("LV." + num, modifierThen4, j3, jOooO0OO, fontStyleM3403boximpl4, medium4, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i16 & 896) | 196608 | (i16 & 7168), 0, 131008);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            j4 = j3;
            j5 = jOooO0OO;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o00Oo0(num, j4, j5, modifier4, i, i2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(message = "需要的地方自己单独写各个控件，禁止再使用这种集合")
    @Composable
    public final void OooOOOO(@NotNull UserInfo userInfo, @Nullable Modifier modifier, @Nullable Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        Composer composerStartRestartGroup = composer.startRestartGroup(-839832736);
        Modifier modifier2 = (i2 & 2) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-839832736, i, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserNameGenderPremiumVip (UserComp.kt:76)");
        }
        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
        int i3 = ((i >> 3) & 14) | 384;
        composerStartRestartGroup.startReplaceableGroup(693286680);
        int i4 = i3 >> 3;
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, (i4 & 112) | (i4 & 14));
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier2);
        int i5 = ((((i3 << 3) & 112) << 9) & 7168) | 6;
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
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1309constructorimpl, measurePolicyRowMeasurePolicy, composerM1309constructorimpl, currentCompositionLocalMap);
        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o((i5 >> 3) & 112, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(userInfo.getUserName(), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue;
        EffectsKt.LaunchedEffect(Long.valueOf(userInfo.getUserId()), new o0ooOOo(userInfo, mutableState, null), composerStartRestartGroup, 64);
        OooOOOO oooOOOO = f51970OooO00o;
        String strOooO00o = oOO000o.OooO00o((String) mutableState.getValue(), Long.valueOf(userInfo.getUserId()));
        Modifier.Companion companion2 = Modifier.INSTANCE;
        oooOOOO.OooOOOo(strOooO00o, 0L, false, 0L, 0, 0, null, false, rowScopeInstance.weight(companion2, 1.0f, false), composerStartRestartGroup, Pow2.MAX_POW2, 254);
        float f = 5;
        oooOOOO.OooO0oO(Integer.valueOf(userInfo.getSex()), PaddingKt.m480paddingqDBjuR0$default(companion2, Dp.m3765constructorimpl(f), 0.0f, 0.0f, 0.0f, 14, null), composerStartRestartGroup, 560, 0);
        oooOOOO.OooOo(userInfo.getWealthLevel(), userInfo.getWealthBadgeWithBg(), null, 0L, composerStartRestartGroup, ShareRequest.THUMB_DATA_SIZE_LIMIT, 12);
        OooOo0(null, Integer.valueOf(userInfo.getVipLevel()), null, 0.0f, PaddingKt.m480paddingqDBjuR0$default(companion2, Dp.m3765constructorimpl(f), 0.0f, 0.0f, 0.0f, 14, null), composerStartRestartGroup, 286720, 13);
        OooOOoo(userInfo.isPremium(), PremiumLevel.INSTANCE.of(Integer.valueOf(userInfo.getPremiumLevel())), false, 0.0f, PaddingKt.m480paddingqDBjuR0$default(companion2, Dp.m3765constructorimpl(f), 0.0f, 0.0f, 0.0f, 14, null), composerStartRestartGroup, 286720, 12);
        if (androidx.compose.material.OooOO0.OooO0O0(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o0OOO0o(userInfo, modifier2, i, i2));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooOOOo(@Nullable String str, long j, boolean z, long j2, int i, int i2, @Nullable FontWeight fontWeight, boolean z2, @Nullable Modifier modifier, @Nullable Composer composer, int i3, int i4) {
        long j3;
        int i5;
        Brush brushM1637linearGradientmHitzGk;
        Composer composerStartRestartGroup = composer.startRestartGroup(-152038133);
        if ((i4 & 2) != 0) {
            i5 = i3 & (-113);
            j3 = p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37701OooO;
        } else {
            j3 = j;
            i5 = i3;
        }
        boolean z3 = (i4 & 4) != 0 ? false : z;
        long sp = (i4 & 8) != 0 ? TextUnitKt.getSp(16) : j2;
        int iM3719getEllipsisgIe3tQ8 = (i4 & 16) != 0 ? TextOverflow.INSTANCE.m3719getEllipsisgIe3tQ8() : i;
        int i6 = (i4 & 32) != 0 ? 1 : i2;
        FontWeight fontWeight2 = (i4 & 64) != 0 ? null : fontWeight;
        boolean z4 = (i4 & 128) != 0 ? false : z2;
        Modifier modifier2 = (i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-152038133, i5, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserNameView (UserComp.kt:150)");
        }
        String str2 = str == null ? "" : str;
        Modifier modifierThen = Modifier.INSTANCE.then(modifier2);
        composerStartRestartGroup.startReplaceableGroup(748985646);
        if (z3) {
            float f = 200;
            State<Float> stateAnimateFloat = InfiniteTransitionKt.animateFloat(InfiniteTransitionKt.rememberInfiniteTransition("", composerStartRestartGroup, 6, 0), 0.0f, com.code.android.util.o0000O0.OooO00o(f), AnimationSpecKt.m81infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(2000, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), "", composerStartRestartGroup, InfiniteTransition.$stable | 24624 | (InfiniteRepeatableSpec.$stable << 9), 0);
            brushM1637linearGradientmHitzGk = Brush.INSTANCE.m1637linearGradientmHitzGk(f51971OooO0O0, OffsetKt.Offset(stateAnimateFloat.getValue().floatValue(), 0.0f), OffsetKt.Offset(stateAnimateFloat.getValue().floatValue() + com.code.android.util.o0000O0.OooO00o(f), 0.0f), TileMode.INSTANCE.m2018getRepeated3opZhB0());
        } else {
            brushM1637linearGradientmHitzGk = null;
        }
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifier3 = modifier2;
        TextKt.m1251Text4IGK_g(str2, modifierThen, j3, sp, (FontStyle) null, fontWeight2, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, iM3719getEllipsisgIe3tQ8, false, i6, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(brushM1637linearGradientmHitzGk, 0.0f, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, null, 0L, null, new PlatformTextStyle(z4), null, null, null, null, 32505854, null), composerStartRestartGroup, ((i5 << 3) & 896) | (i5 & 7168) | (458752 & (i5 >> 3)), ((i5 >> 9) & 112) | ((i5 >> 6) & 7168), 55248);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o0Oo0oo(str, j3, z3, sp, iM3719getEllipsisgIe3tQ8, i6, fontWeight2, z4, modifier3, i3, i4));
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    /* JADX WARN: Code duplicated, block: B:35:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:40:0x0099  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooOOo0(int i, int i2, @Nullable Composer composer, @Nullable Modifier modifier, boolean z) {
        int i3;
        Modifier modifier2;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-908086405);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 112) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 91) == 18 || !composerStartRestartGroup.getSkipping()) {
                if (i4 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-908086405, i, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserOfficialTagView (UserComp.kt:454)");
                }
                if (z) {
                    ImageKt.Image(PainterResources_androidKt.painterResource(oOo00OO0.icon_userinfo_official, composerStartRestartGroup, 0), "", SizeKt.m525sizeVpY3zN4(Modifier.INSTANCE.then(modifier3), Dp.m3765constructorimpl(27), Dp.m3765constructorimpl(16)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new p517o0o0O0o.Oooo0(this, z, modifier3, i, i2));
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 91) == 18) {
            if (i4 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-908086405, i, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserOfficialTagView (UserComp.kt:454)");
            }
            if (z) {
                ImageKt.Image(PainterResources_androidKt.painterResource(oOo00OO0.icon_userinfo_official, composerStartRestartGroup, 0), "", SizeKt.m525sizeVpY3zN4(Modifier.INSTANCE.then(modifier3), Dp.m3765constructorimpl(27), Dp.m3765constructorimpl(16)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            if (i4 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-908086405, i, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserOfficialTagView (UserComp.kt:454)");
            }
            if (z) {
                ImageKt.Image(PainterResources_androidKt.painterResource(oOo00OO0.icon_userinfo_official, composerStartRestartGroup, 0), "", SizeKt.m525sizeVpY3zN4(Modifier.INSTANCE.then(modifier3), Dp.m3765constructorimpl(27), Dp.m3765constructorimpl(16)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new p517o0o0O0o.Oooo0(this, z, modifier3, i, i2));
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0096  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ab A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:76:0x00de  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:80:0x0126  */
    /* JADX WARN: Code duplicated, block: B:83:0x012e  */
    /* JADX WARN: Code duplicated, block: B:87:0x013a  */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooOo(int i, @NotNull String currBadgeImg, @Nullable Modifier modifier, long j, @Nullable Composer composer, int i2, int i3) {
        int i4;
        Modifier modifier2;
        long j2;
        long jOooO0OO;
        int i5;
        boolean z;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i6;
        Intrinsics.checkNotNullParameter(currBadgeImg, "currBadgeImg");
        Composer composerStartRestartGroup = composer.startRestartGroup(1666273642);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= composerStartRestartGroup.changed(currBadgeImg) ? 32 : 16;
        }
        int i7 = i3 & 4;
        if (i7 == 0) {
            if ((i2 & 896) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
            }
            if ((i2 & 7168) == 0) {
                if ((i3 & 8) == 0) {
                    j2 = j;
                    if (composerStartRestartGroup.changed(j2)) {
                        i6 = 2048;
                    }
                    i4 |= i6;
                } else {
                    j2 = j;
                }
                i6 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                i4 |= i6;
            } else {
                j2 = j;
            }
            if ((i4 & 5851) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if (i7 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier2;
                    }
                    if ((i3 & 8) != 0) {
                        i4 &= -7169;
                        jOooO0OO = com.code.android.util.o0000O0.OooO0OO(11, composerStartRestartGroup, 6);
                    } else {
                        jOooO0OO = j2;
                    }
                    i5 = i4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i3 & 8) != 0) {
                        i4 &= -7169;
                    }
                    i5 = i4;
                    modifier2 = modifier2;
                    jOooO0OO = j2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1666273642, i5, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserWealthTagView (UserComp.kt:709)");
                }
                if (i >= 1) {
                    if (currBadgeImg.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        BoxWithConstraintsKt.BoxWithConstraints(SizeKt.m530widthInVpY3zN4$default(SizeKt.m511heightInVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m3765constructorimpl(19), 1, null), 0.0f, Dp.m3765constructorimpl(40), 1, null).then(modifier2), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -300934823, true, new o000OOo(currBadgeImg, i5, i, jOooO0OO)), composerStartRestartGroup, 3072, 6);
                    }
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                jOooO0OO = j2;
                composerStartRestartGroup = composerStartRestartGroup;
            }
            modifier3 = modifier2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new o000000(i, currBadgeImg, modifier3, jOooO0OO, i2, i3));
        }
        i4 |= 384;
        modifier2 = modifier;
        if ((i2 & 7168) == 0) {
            if ((i3 & 8) == 0) {
                j2 = j;
                if (composerStartRestartGroup.changed(j2)) {
                    i6 = 2048;
                }
                i4 |= i6;
            } else {
                j2 = j;
            }
            i6 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            i4 |= i6;
        } else {
            j2 = j;
        }
        if ((i4 & 5851) == 1170) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
                if (i7 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier2;
                }
                if ((i3 & 8) != 0) {
                    i4 &= -7169;
                    jOooO0OO = com.code.android.util.o0000O0.OooO0OO(11, composerStartRestartGroup, 6);
                } else {
                    jOooO0OO = j2;
                }
                i5 = i4;
            } else {
                if (i7 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier2;
                }
                if ((i3 & 8) != 0) {
                    i4 &= -7169;
                    jOooO0OO = com.code.android.util.o0000O0.OooO0OO(11, composerStartRestartGroup, 6);
                } else {
                    jOooO0OO = j2;
                }
                i5 = i4;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1666273642, i5, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserWealthTagView (UserComp.kt:709)");
            }
            if (i >= 1) {
                if (currBadgeImg.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    BoxWithConstraintsKt.BoxWithConstraints(SizeKt.m530widthInVpY3zN4$default(SizeKt.m511heightInVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m3765constructorimpl(19), 1, null), 0.0f, Dp.m3765constructorimpl(40), 1, null).then(modifier2), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -300934823, true, new o000OOo(currBadgeImg, i5, i, jOooO0OO)), composerStartRestartGroup, 3072, 6);
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
                if (i7 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier2;
                }
                if ((i3 & 8) != 0) {
                    i4 &= -7169;
                    jOooO0OO = com.code.android.util.o0000O0.OooO0OO(11, composerStartRestartGroup, 6);
                } else {
                    jOooO0OO = j2;
                }
                i5 = i4;
            } else {
                if (i7 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier2;
                }
                if ((i3 & 8) != 0) {
                    i4 &= -7169;
                    jOooO0OO = com.code.android.util.o0000O0.OooO0OO(11, composerStartRestartGroup, 6);
                } else {
                    jOooO0OO = j2;
                }
                i5 = i4;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1666273642, i5, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserWealthTagView (UserComp.kt:709)");
            }
            if (i >= 1) {
                if (currBadgeImg.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    BoxWithConstraintsKt.BoxWithConstraints(SizeKt.m530widthInVpY3zN4$default(SizeKt.m511heightInVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m3765constructorimpl(19), 1, null), 0.0f, Dp.m3765constructorimpl(40), 1, null).then(modifier2), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -300934823, true, new o000OOo(currBadgeImg, i5, i, jOooO0OO)), composerStartRestartGroup, 3072, 6);
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        modifier3 = modifier2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o000000(i, currBadgeImg, modifier3, jOooO0OO, i2, i3));
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:35:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x0077  */
    /* JADX WARN: Code duplicated, block: B:45:0x0081  */
    /* JADX WARN: Code duplicated, block: B:47:0x0092  */
    /* JADX WARN: Code duplicated, block: B:49:0x0099  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:56:0x0123  */
    /* JADX WARN: Code duplicated, block: B:59:0x0132  */
    /* JADX WARN: Code duplicated, block: B:63:0x013c  */
    /* JADX WARN: Code duplicated, block: B:65:0x014d  */
    /* JADX WARN: Code duplicated, block: B:67:0x0153  */
    /* JADX WARN: Code duplicated, block: B:71:0x015d  */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooOo00(@Nullable Integer num, @Nullable Modifier modifier, @Nullable Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1386998336);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(num) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 112) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 91) == 18 || !composerStartRestartGroup.getSkipping()) {
                if (i4 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1386998336, i, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserPrettyIdView (UserComp.kt:781)");
                }
                if (num == null) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new o0OO00O(num, modifier3, i, i2));
                    return;
                }
                num.intValue();
                if (num.intValue() == 0) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup2 == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup2.updateScope(new oo0o0Oo(num, modifier3, i, i2));
                    return;
                }
                if (num.intValue() == 1) {
                    composerStartRestartGroup.startReplaceableGroup(2009844179);
                    ImageKt.Image(PainterResources_androidKt.painterResource(oO00OOO.ic_user_pretty_id, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(Modifier.INSTANCE.then(modifier3), Dp.m3765constructorimpl(18)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                    composerStartRestartGroup.endReplaceableGroup();
                } else if (num.intValue() == 3) {
                    composerStartRestartGroup.startReplaceableGroup(2009844471);
                    p154o00OoO00.OooOo00.OooO00o("svga/anim_user_id.svga", true, 0, null, null, SizeKt.m523size3ABfNKs(Modifier.INSTANCE.then(modifier3), Dp.m3765constructorimpl(18)), composerStartRestartGroup, 54, 28);
                    composerStartRestartGroup.endReplaceableGroup();
                } else if (num.intValue() == 4) {
                    composerStartRestartGroup.startReplaceableGroup(2009844696);
                    p154o00OoO00.OooOo00.OooO00o("svga/anim_user_id_4.svga", true, 0, null, null, SizeKt.m523size3ABfNKs(Modifier.INSTANCE.then(modifier3), Dp.m3765constructorimpl(18)), composerStartRestartGroup, 54, 28);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(2009844899);
                    composerStartRestartGroup.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup3 = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup3 == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup3.updateScope(new o0O0O00(num, modifier3, i, i2));
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 91) == 18) {
            if (i4 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1386998336, i, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserPrettyIdView (UserComp.kt:781)");
            }
            if (num == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new o0OO00O(num, modifier3, i, i2));
                return;
            }
            num.intValue();
            if (num.intValue() == 0) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup2 == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup2.updateScope(new oo0o0Oo(num, modifier3, i, i2));
                return;
            }
            if (num.intValue() == 1) {
                composerStartRestartGroup.startReplaceableGroup(2009844179);
                ImageKt.Image(PainterResources_androidKt.painterResource(oO00OOO.ic_user_pretty_id, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(Modifier.INSTANCE.then(modifier3), Dp.m3765constructorimpl(18)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                composerStartRestartGroup.endReplaceableGroup();
            } else if (num.intValue() == 3) {
                composerStartRestartGroup.startReplaceableGroup(2009844471);
                p154o00OoO00.OooOo00.OooO00o("svga/anim_user_id.svga", true, 0, null, null, SizeKt.m523size3ABfNKs(Modifier.INSTANCE.then(modifier3), Dp.m3765constructorimpl(18)), composerStartRestartGroup, 54, 28);
                composerStartRestartGroup.endReplaceableGroup();
            } else if (num.intValue() == 4) {
                composerStartRestartGroup.startReplaceableGroup(2009844696);
                p154o00OoO00.OooOo00.OooO00o("svga/anim_user_id_4.svga", true, 0, null, null, SizeKt.m523size3ABfNKs(Modifier.INSTANCE.then(modifier3), Dp.m3765constructorimpl(18)), composerStartRestartGroup, 54, 28);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(2009844899);
                composerStartRestartGroup.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            if (i4 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1386998336, i, -1, "com.yalla.yalla.ui.composable.user.UserComp.UserPrettyIdView (UserComp.kt:781)");
            }
            if (num == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new o0OO00O(num, modifier3, i, i2));
                return;
            }
            num.intValue();
            if (num.intValue() == 0) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup2 == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup2.updateScope(new oo0o0Oo(num, modifier3, i, i2));
                return;
            }
            if (num.intValue() == 1) {
                composerStartRestartGroup.startReplaceableGroup(2009844179);
                ImageKt.Image(PainterResources_androidKt.painterResource(oO00OOO.ic_user_pretty_id, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(Modifier.INSTANCE.then(modifier3), Dp.m3765constructorimpl(18)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                composerStartRestartGroup.endReplaceableGroup();
            } else if (num.intValue() == 3) {
                composerStartRestartGroup.startReplaceableGroup(2009844471);
                p154o00OoO00.OooOo00.OooO00o("svga/anim_user_id.svga", true, 0, null, null, SizeKt.m523size3ABfNKs(Modifier.INSTANCE.then(modifier3), Dp.m3765constructorimpl(18)), composerStartRestartGroup, 54, 28);
                composerStartRestartGroup.endReplaceableGroup();
            } else if (num.intValue() == 4) {
                composerStartRestartGroup.startReplaceableGroup(2009844696);
                p154o00OoO00.OooOo00.OooO00o("svga/anim_user_id_4.svga", true, 0, null, null, SizeKt.m523size3ABfNKs(Modifier.INSTANCE.then(modifier3), Dp.m3765constructorimpl(18)), composerStartRestartGroup, 54, 28);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(2009844899);
                composerStartRestartGroup.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        scopeUpdateScopeEndRestartGroup3 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup3 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup3.updateScope(new o0O0O00(num, modifier3, i, i2));
    }
}
