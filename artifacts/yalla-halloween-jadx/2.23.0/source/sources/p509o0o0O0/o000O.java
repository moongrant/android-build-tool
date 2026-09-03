package p509o0o0O0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
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
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
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
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.lifecycle.LifecycleOwner;
import com.app.selectPicture.model.ImageLocationInfo;
import com.code.android.util.o0000O0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentImageModel;
import com.yalla.yalla.model.moment.MomentType;
import com.yalla.yalla.ui.activity.moment.ShowImageActivity;
import com.yalla.yalla.ui.adapter.postList.PostDetailHeaderViewTag;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p003OooO0o0.o0O0O00;
import p029Oooo0oo.oo0ooO;
import p186o00o00oO.o00O00o0;
import p382o0OOoo0o.o00Ooo;
import p469o0OoooOO.o0oO0O0o;
import p515o0o0O0O0.o0Oo0oo;
import p515o0o0O0O0.o0ooOOo;
import p515o0o0O0O0.oo0o0Oo;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMomentImageList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentImageList.kt\ncom/yalla/yalla/ui/composable/moment/MomentImageListKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 10 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 11 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 12 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 13 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,506:1\n76#2:507\n76#2:515\n76#2:530\n76#2:531\n76#2:532\n76#2:582\n76#2:586\n76#2:629\n76#2:713\n76#2:799\n76#2:800\n76#2:801\n76#2:802\n36#3:508\n36#3:516\n36#3:523\n25#3:533\n456#3,8:557\n464#3,3:571\n467#3,3:575\n456#3,8:606\n464#3,3:620\n467#3,3:624\n456#3,8:649\n464#3,3:663\n456#3,8:685\n464#3,3:699\n467#3,3:703\n467#3,3:708\n456#3,8:735\n464#3,3:749\n456#3,8:771\n464#3,3:785\n467#3,3:789\n467#3,3:794\n25#3:803\n50#3:810\n49#3:811\n456#3,8:835\n464#3,3:849\n467#3,3:854\n1097#4,6:509\n1097#4,6:517\n1097#4,6:524\n1097#4,6:534\n1097#4,6:804\n1097#4,6:812\n66#5,6:540\n72#5:574\n76#5:579\n66#5,6:818\n72#5:852\n76#5:858\n78#6,11:546\n91#6:578\n78#6,11:595\n91#6:627\n78#6,11:638\n78#6,11:674\n91#6:706\n91#6:711\n78#6,11:724\n78#6,11:760\n91#6:792\n91#6:797\n78#6,11:824\n91#6:857\n4144#7,6:565\n4144#7,6:614\n4144#7,6:657\n4144#7,6:693\n4144#7,6:743\n4144#7,6:779\n4144#7,6:843\n215#8,2:580\n154#9:583\n154#9:584\n154#9:585\n154#9:587\n154#9:630\n154#9:714\n154#9:853\n154#9:861\n92#10:588\n51#10:589\n92#10:631\n51#10:632\n92#10:715\n51#10:716\n92#10:717\n51#10:718\n74#11,5:590\n79#11:623\n83#11:628\n72#11,7:667\n79#11:702\n83#11:707\n72#11,7:753\n79#11:788\n83#11:793\n73#12,5:633\n78#12:666\n82#12:712\n73#12,5:719\n78#12:752\n82#12:798\n81#13:859\n81#13:860\n*S KotlinDebug\n*F\n+ 1 MomentImageList.kt\ncom/yalla/yalla/ui/composable/moment/MomentImageListKt\n*L\n71#1:507\n110#1:515\n121#1:530\n144#1:531\n145#1:532\n222#1:582\n252#1:586\n312#1:629\n351#1:713\n400#1:799\n402#1:800\n422#1:801\n427#1:802\n83#1:508\n113#1:516\n117#1:523\n150#1:533\n163#1:557,8\n163#1:571,3\n163#1:575,3\n257#1:606,8\n257#1:620,3\n257#1:624,3\n319#1:649,8\n319#1:663,3\n321#1:685,8\n321#1:699,3\n321#1:703,3\n319#1:708,3\n360#1:735,8\n360#1:749,3\n368#1:771,8\n368#1:785,3\n368#1:789,3\n360#1:794,3\n429#1:803\n445#1:810\n445#1:811\n437#1:835,8\n437#1:849,3\n437#1:854,3\n83#1:509,6\n113#1:517,6\n117#1:524,6\n150#1:534,6\n429#1:804,6\n445#1:812,6\n163#1:540,6\n163#1:574\n163#1:579\n437#1:818,6\n437#1:852\n437#1:858\n163#1:546,11\n163#1:578\n257#1:595,11\n257#1:627\n319#1:638,11\n321#1:674,11\n321#1:706\n319#1:711\n360#1:724,11\n368#1:760,11\n368#1:792\n360#1:797\n437#1:824,11\n437#1:857\n163#1:565,6\n257#1:614,6\n319#1:657,6\n321#1:693,6\n360#1:743,6\n368#1:779,6\n437#1:843,6\n192#1:580,2\n226#1:583\n230#1:584\n235#1:585\n255#1:587\n315#1:630\n356#1:714\n500#1:853\n206#1:861\n257#1:588\n257#1:589\n319#1:631\n319#1:632\n362#1:715\n362#1:716\n363#1:717\n363#1:718\n257#1:590,5\n257#1:623\n257#1:628\n321#1:667,7\n321#1:702\n321#1:707\n368#1:753,7\n368#1:788\n368#1:793\n319#1:633,5\n319#1:666\n319#1:712\n360#1:719,5\n360#1:752\n360#1:798\n150#1:859\n429#1:860\n*E\n"})
public final class o000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final float f50553OooO00o = Dp.m3765constructorimpl(4);

    public static final class OooO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ o0ooOOo f50554OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentImageModel f50555OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f50556OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Modifier f50557OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f50558OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Function2<MomentImageModel, Integer, Unit> f50559OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ SnapshotStateMap<Integer, LayoutCoordinates> f50560OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ SnapshotStateMap<Integer, Drawable> f50561OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ int f50562OooOO0o;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final /* synthetic */ int f50563OooOOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO(MomentImageModel momentImageModel, Modifier modifier, int i, int i2, Function2<? super MomentImageModel, ? super Integer, Unit> function2, o0ooOOo o0ooooo, SnapshotStateMap<Integer, LayoutCoordinates> snapshotStateMap, SnapshotStateMap<Integer, Drawable> snapshotStateMap2, int i3, int i4) {
            super(2);
            this.f50555OooO0Oo = momentImageModel;
            this.f50557OooO0o0 = modifier;
            this.f50556OooO0o = i;
            this.f50558OooO0oO = i2;
            this.f50559OooO0oo = function2;
            this.f50554OooO = o0ooooo;
            this.f50560OooOO0 = snapshotStateMap;
            this.f50561OooOO0O = snapshotStateMap2;
            this.f50562OooOO0o = i3;
            this.f50563OooOOO0 = i4;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o000O.OooO00o(this.f50555OooO0Oo, this.f50557OooO0o0, this.f50556OooO0o, this.f50558OooO0oO, this.f50559OooO0oo, this.f50554OooO, this.f50560OooOO0, this.f50561OooOO0O, composer, RecomposeScopeImplKt.updateChangedFlags(this.f50562OooOO0o | 1), this.f50563OooOOO0);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function2<MomentImageModel, Integer, Unit> f50564OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f50565OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentImageModel f50566OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(Function2<? super MomentImageModel, ? super Integer, Unit> function2, MomentImageModel momentImageModel, int i) {
            super(0);
            this.f50564OooO0Oo = function2;
            this.f50566OooO0o0 = momentImageModel;
            this.f50565OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f50564OooO0Oo.invoke(this.f50566OooO0o0, Integer.valueOf(this.f50565OooO0o));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<LayoutCoordinates, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ SnapshotStateMap<Integer, LayoutCoordinates> f50567OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f50568OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(SnapshotStateMap<Integer, LayoutCoordinates> snapshotStateMap, int i) {
            super(1);
            this.f50567OooO0Oo = snapshotStateMap;
            this.f50568OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(LayoutCoordinates layoutCoordinates) {
            LayoutCoordinates it = layoutCoordinates;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f50567OooO0Oo.put(Integer.valueOf(this.f50568OooO0o0), it);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<Context, NetImageView> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f50569OooO0Oo = new OooO0OO();

        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final NetImageView invoke(Context context) {
            Context it = context;
            Intrinsics.checkNotNullParameter(it, "it");
            NetImageView netImageView = new NetImageView(it);
            netImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            return netImageView;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<NetImageView, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f50570OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f50571OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f50572OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Context f50573OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ o0ooOOo f50574OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<o0OOo0O.OooOO0.OooO00o> f50575OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(boolean z, Context context, String str, o0ooOOo o0ooooo, MutableState<o0OOo0O.OooOO0.OooO00o> mutableState, LifecycleOwner lifecycleOwner) {
            super(1);
            this.f50571OooO0Oo = z;
            this.f50573OooO0o0 = context;
            this.f50572OooO0o = str;
            this.f50574OooO0oO = o0ooooo;
            this.f50575OooO0oo = mutableState;
            this.f50570OooO = lifecycleOwner;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(NetImageView netImageView) {
            NetImageView imageView = netImageView;
            Intrinsics.checkNotNullParameter(imageView, "imageView");
            boolean z = this.f50571OooO0Oo;
            String str = this.f50572OooO0o;
            if (z) {
                o0OOo0O.OooOO0.OooO00o value = this.f50575OooO0oo.getValue();
                value.f43936OooOoo0 = 2;
                value.f43923OooOOOo = 0;
                value.f43925OooOOo0 = imageView.getDrawable();
                value.f43924OooOOo = imageView.getDrawable();
                o0ooOOo o0ooooo = this.f50574OooO0oO;
                o000OO00 o000oo01 = new o000OO00(this.f50570OooO, o0ooooo, o0ooooo.f51863OooO0Oo);
                value.f43912OooO0Oo = true;
                value.f43941Oooo00o = o000oo01;
                value.f43911OooO0OO = str;
                value.f43909OooO00o = 0;
                value.OooO0Oo(imageView);
            } else {
                o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(this.f50573OooO0o0);
                oooO00o.OooO00o(p543o0oO0O00.OooO.OooO0Oo());
                oooO00o.f43936OooOoo0 = 2;
                oooO00o.f43926OooOOoo = 2;
                oooO00o.f43911OooO0OO = str;
                oooO00o.f43909OooO00o = 0;
                oooO00o.f43914OooO0o0 = false;
                oooO00o.OooO0Oo(imageView);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Modifier f50576OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f50577OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function2<PostDetailHeaderViewTag, Object, Unit> f50578OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f50579OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOO0(Modifier modifier, Function2<? super PostDetailHeaderViewTag, Object, Unit> function2, int i, int i2) {
            super(2);
            this.f50576OooO0Oo = modifier;
            this.f50578OooO0o0 = function2;
            this.f50577OooO0o = i;
            this.f50579OooO0oO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f50577OooO0o | 1);
            o000O.OooO0O0(this.f50576OooO0Oo, this.f50578OooO0o0, composer, iUpdateChangedFlags, this.f50579OooO0oO);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Modifier f50580OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f50581OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function2<PostDetailHeaderViewTag, Object, Unit> f50582OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f50583OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOO0O(Modifier modifier, Function2<? super PostDetailHeaderViewTag, Object, Unit> function2, int i, int i2) {
            super(2);
            this.f50580OooO0Oo = modifier;
            this.f50582OooO0o0 = function2;
            this.f50581OooO0o = i;
            this.f50583OooO0oO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f50581OooO0o | 1);
            o000O.OooO0O0(this.f50580OooO0Oo, this.f50582OooO0o0, composer, iUpdateChangedFlags, this.f50583OooO0oO);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Modifier f50584OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f50585OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function2<PostDetailHeaderViewTag, Object, Unit> f50586OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f50587OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOOO(Modifier modifier, Function2<? super PostDetailHeaderViewTag, Object, Unit> function2, int i, int i2) {
            super(2);
            this.f50584OooO0Oo = modifier;
            this.f50586OooO0o0 = function2;
            this.f50585OooO0o = i;
            this.f50587OooO0oO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f50585OooO0o | 1);
            o000O.OooO0O0(this.f50584OooO0Oo, this.f50586OooO0o0, composer, iUpdateChangedFlags, this.f50587OooO0oO);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.composable.moment.MomentImageListKt$MomentImageList$3", f = "MomentImageList.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Integer f50588OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ ArrayList<MomentImageModel> f50589OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f50590OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableState<o0ooOOo> f50591OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(Integer num, int i, ArrayList<MomentImageModel> arrayList, MutableState<o0ooOOo> mutableState, Continuation<? super OooOOO0> continuation) {
            super(2, continuation);
            this.f50588OooO0Oo = num;
            this.f50590OooO0o0 = i;
            this.f50589OooO0o = arrayList;
            this.f50591OooO0oO = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOOO0(this.f50588OooO0Oo, this.f50590OooO0o0, this.f50589OooO0o, this.f50591OooO0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOOO0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0062  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            MutableState<o0ooOOo> mutableState = this.f50591OooO0oO;
            Integer num = this.f50588OooO0Oo;
            if (num != null && num.intValue() == this.f50590OooO0o0) {
                float f = o000O.f50553OooO00o;
                o0ooOOo value = mutableState.getValue();
                value.getClass();
                ArrayList<MomentImageModel> imageInfoList = this.f50589OooO0o;
                Intrinsics.checkNotNullParameter(imageInfoList, "imageInfoList");
                ArrayList<Integer> arrayList = value.f51861OooO0O0;
                arrayList.clear();
                value.f51862OooO0OO = 0;
                value.f51864OooO0o0 = true;
                int iOooO00o = 0;
                int i = 0;
                for (Object obj2 : imageInfoList) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    MomentImageModel momentImageModel = (MomentImageModel) obj2;
                    if (momentImageModel.getGifType() == 1) {
                        iOooO00o = o0O0O00.OooO00o(i, arrayList, iOooO00o, 1);
                    } else {
                        String url = momentImageModel.getUrl();
                        if (url != null ? StringsKt__StringsKt.contains(url, ".gif", true) : false) {
                            iOooO00o = o0O0O00.OooO00o(i, arrayList, iOooO00o, 1);
                        }
                    }
                    i = i2;
                }
                value.f51863OooO0Oo = iOooO00o == 1 ? Integer.MAX_VALUE : 3;
                if (!arrayList.isEmpty()) {
                    Integer num2 = arrayList.get(value.f51862OooO0OO);
                    Intrinsics.checkNotNullExpressionValue(num2, "giftIndexList[gifPlayIndex]");
                    value.f51860OooO00o.setValue(num2);
                }
            } else {
                float f2 = o000O.f50553OooO00o;
                o0ooOOo value2 = mutableState.getValue();
                value2.f51864OooO0o0 = false;
                value2.f51860OooO00o.setValue(-1);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function2<MomentImageModel, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ ArrayList<MomentImageModel> f50592OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f50593OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f50594OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Activity f50595OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ SnapshotStateMap<Integer, LayoutCoordinates> f50596OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ SnapshotStateMap<Integer, Drawable> f50597OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(boolean z, Activity activity, MomentDetailModel momentDetailModel, SnapshotStateMap<Integer, LayoutCoordinates> snapshotStateMap, SnapshotStateMap<Integer, Drawable> snapshotStateMap2, ArrayList<MomentImageModel> arrayList) {
            super(2);
            this.f50593OooO0Oo = z;
            this.f50595OooO0o0 = activity;
            this.f50594OooO0o = momentDetailModel;
            this.f50596OooO0oO = snapshotStateMap;
            this.f50597OooO0oo = snapshotStateMap2;
            this.f50592OooO = arrayList;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(MomentImageModel momentImageModel, Integer num) {
            MomentImageModel itemData = momentImageModel;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(itemData, "itemData");
            if (!this.f50593OooO0Oo) {
                Activity activity = this.f50595OooO0o0;
                if (com.code.android.util.OooO0OO.OooO00o(activity)) {
                    o0OO000.OooO00o("103044");
                    MomentDetailModel momentDetailModel = this.f50594OooO0o;
                    String strOooO00o = momentDetailModel.getIsWaterMark() ? oo0ooO.OooO00o(momentDetailModel.getUserIdx()) : "";
                    int i = ShowImageActivity.f26251Oooo00o;
                    Intrinsics.checkNotNull(activity);
                    ArrayList arrayList = new ArrayList();
                    Iterator<MomentImageModel> it = this.f50592OooO.iterator();
                    while (it.hasNext()) {
                        arrayList.add(p139o00OOooO.OooO0o.OooO0Oo(it.next().getUrl()));
                    }
                    ArrayList imageLocationInfoList = new ArrayList();
                    for (Map.Entry<Integer, LayoutCoordinates> entry : this.f50596OooO0oO.entrySet()) {
                        long jMo2804localToWindowMKHz9U = entry.getValue().mo2804localToWindowMKHz9U(Offset.INSTANCE.m1452getZeroF1C5BW0());
                        ImageLocationInfo imageLocationInfo = new ImageLocationInfo();
                        imageLocationInfo.f9782OooO0o = MathKt.roundToInt(Offset.m1436getXimpl(jMo2804localToWindowMKHz9U));
                        imageLocationInfo.f9784OooO0oO = MathKt.roundToInt(Offset.m1437getYimpl(jMo2804localToWindowMKHz9U));
                        imageLocationInfo.f9783OooO0o0 = IntSize.m3925getWidthimpl(entry.getValue().mo2801getSizeYbymL2g());
                        imageLocationInfo.f9781OooO0Oo = IntSize.m3924getHeightimpl(entry.getValue().mo2801getSizeYbymL2g());
                        imageLocationInfoList.add(imageLocationInfo);
                    }
                    Intrinsics.checkNotNullParameter(activity, "activity");
                    Intrinsics.checkNotNullParameter(imageLocationInfoList, "imageLocationInfoList");
                    SnapshotStateMap<Integer, Drawable> imageListDrawable = this.f50597OooO0oo;
                    Intrinsics.checkNotNullParameter(imageListDrawable, "imageListDrawable");
                    ArrayList arrayList2 = new ArrayList();
                    for (Map.Entry<Integer, Drawable> entry2 : imageListDrawable.entrySet()) {
                        if (entry2.getValue() instanceof BitmapDrawable) {
                            Drawable value = entry2.getValue();
                            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                            arrayList2.add(((BitmapDrawable) value).getBitmap());
                        } else {
                            try {
                                Result.Companion companion = Result.INSTANCE;
                                Drawable drawable = entry2.getValue();
                                Intrinsics.checkNotNullParameter(drawable, "drawable");
                                int intrinsicWidth = drawable.getIntrinsicWidth();
                                int intrinsicHeight = drawable.getIntrinsicHeight();
                                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
                                Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(w, h, config)");
                                Canvas canvas = new Canvas(bitmapCreateBitmap);
                                drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                                drawable.draw(canvas);
                                Result.m4213constructorimpl(Boolean.valueOf(arrayList2.add(bitmapCreateBitmap)));
                            } catch (Throwable th) {
                                Result.Companion companion2 = Result.INSTANCE;
                                Result.m4213constructorimpl(ResultKt.createFailure(th));
                            }
                        }
                    }
                    LiveEventBus.get("EVENTMSG_ShowImageBitmap").post(arrayList2);
                    if (!o00Ooo.OooO0o0()) {
                        StringBuffer stringBuffer = new StringBuffer();
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            stringBuffer.append("\n" + ((String) it2.next()));
                        }
                        p592o0oo00O.OooOOO0.OooO0O0("ShowImageUrls : " + ((Object) stringBuffer));
                    }
                    Intent intent = new Intent(activity, (Class<?>) ShowImageActivity.class);
                    intent.putExtra("image_index", iIntValue);
                    intent.putExtra("image_url_list", arrayList);
                    intent.putExtra("image_info_list", imageLocationInfoList);
                    intent.putExtra("IsHeadUrl", false);
                    if (!TextUtils.isEmpty(strOooO00o)) {
                        intent.putExtra("Image_WatermarkText", strOooO00o);
                    }
                    activity.startActivity(intent);
                    activity.overridePendingTransition(0, 0);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f50598OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ ArrayList<MomentImageModel> f50599OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o0ooOOo f50600OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function2<MomentImageModel, Integer, Unit> f50601OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ SnapshotStateMap<Integer, LayoutCoordinates> f50602OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ SnapshotStateMap<Integer, Drawable> f50603OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOo(ArrayList<MomentImageModel> arrayList, Function2<? super MomentImageModel, ? super Integer, Unit> function2, o0ooOOo o0ooooo, SnapshotStateMap<Integer, LayoutCoordinates> snapshotStateMap, SnapshotStateMap<Integer, Drawable> snapshotStateMap2, int i) {
            super(2);
            this.f50599OooO0Oo = arrayList;
            this.f50601OooO0o0 = function2;
            this.f50600OooO0o = o0ooooo;
            this.f50602OooO0oO = snapshotStateMap;
            this.f50603OooO0oo = snapshotStateMap2;
            this.f50598OooO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o000O.OooO0Oo(this.f50599OooO0Oo, this.f50601OooO0o0, this.f50600OooO0o, this.f50602OooO0oO, this.f50603OooO0oo, composer, RecomposeScopeImplKt.updateChangedFlags(this.f50598OooO | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f50604OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ ArrayList<MomentImageModel> f50605OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o0ooOOo f50606OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function2<MomentImageModel, Integer, Unit> f50607OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ SnapshotStateMap<Integer, LayoutCoordinates> f50608OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ SnapshotStateMap<Integer, Drawable> f50609OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOo00(ArrayList<MomentImageModel> arrayList, Function2<? super MomentImageModel, ? super Integer, Unit> function2, o0ooOOo o0ooooo, SnapshotStateMap<Integer, LayoutCoordinates> snapshotStateMap, SnapshotStateMap<Integer, Drawable> snapshotStateMap2, int i) {
            super(2);
            this.f50605OooO0Oo = arrayList;
            this.f50607OooO0o0 = function2;
            this.f50606OooO0o = o0ooooo;
            this.f50608OooO0oO = snapshotStateMap;
            this.f50609OooO0oo = snapshotStateMap2;
            this.f50604OooO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o000O.OooO0OO(this.f50605OooO0Oo, this.f50607OooO0o0, this.f50606OooO0o, this.f50608OooO0oO, this.f50609OooO0oo, composer, RecomposeScopeImplKt.updateChangedFlags(this.f50604OooO | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f50610OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ ArrayList<MomentImageModel> f50611OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o0ooOOo f50612OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function2<MomentImageModel, Integer, Unit> f50613OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ SnapshotStateMap<Integer, LayoutCoordinates> f50614OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ SnapshotStateMap<Integer, Drawable> f50615OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Oooo0(ArrayList<MomentImageModel> arrayList, Function2<? super MomentImageModel, ? super Integer, Unit> function2, o0ooOOo o0ooooo, SnapshotStateMap<Integer, LayoutCoordinates> snapshotStateMap, SnapshotStateMap<Integer, Drawable> snapshotStateMap2, int i) {
            super(2);
            this.f50611OooO0Oo = arrayList;
            this.f50613OooO0o0 = function2;
            this.f50612OooO0o = o0ooooo;
            this.f50614OooO0oO = snapshotStateMap;
            this.f50615OooO0oo = snapshotStateMap2;
            this.f50610OooO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o000O.OooO0o(this.f50611OooO0Oo, this.f50613OooO0o0, this.f50612OooO0o, this.f50614OooO0oO, this.f50615OooO0oo, composer, RecomposeScopeImplKt.updateChangedFlags(this.f50610OooO | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f50616OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ ArrayList<MomentImageModel> f50617OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o0ooOOo f50618OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function2<MomentImageModel, Integer, Unit> f50619OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ SnapshotStateMap<Integer, LayoutCoordinates> f50620OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ SnapshotStateMap<Integer, Drawable> f50621OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Oooo000(ArrayList<MomentImageModel> arrayList, Function2<? super MomentImageModel, ? super Integer, Unit> function2, o0ooOOo o0ooooo, SnapshotStateMap<Integer, LayoutCoordinates> snapshotStateMap, SnapshotStateMap<Integer, Drawable> snapshotStateMap2, int i) {
            super(2);
            this.f50617OooO0Oo = arrayList;
            this.f50619OooO0o0 = function2;
            this.f50618OooO0o = o0ooooo;
            this.f50620OooO0oO = snapshotStateMap;
            this.f50621OooO0oo = snapshotStateMap2;
            this.f50616OooO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o000O.OooO0o0(this.f50617OooO0Oo, this.f50619OooO0o0, this.f50618OooO0o, this.f50620OooO0oO, this.f50621OooO0oo, composer, RecomposeScopeImplKt.updateChangedFlags(this.f50616OooO | 1));
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(MomentImageModel momentImageModel, Modifier modifier, int i, int i2, Function2<? super MomentImageModel, ? super Integer, Unit> function2, o0ooOOo o0ooooo, SnapshotStateMap<Integer, LayoutCoordinates> snapshotStateMap, SnapshotStateMap<Integer, Drawable> snapshotStateMap2, Composer composer, int i3, int i4) {
        String strOooO0oo;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1065850034);
        Modifier modifier2 = (i4 & 2) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1065850034, i3, -1, "com.yalla.yalla.ui.composable.moment.MomentImageItem (MomentImageList.kt:389)");
        }
        boolean zBooleanValue = ((Boolean) composerStartRestartGroup.consume(oo0O.f51351OooO0o)).booleanValue();
        if (((Boolean) composerStartRestartGroup.consume(oo0O.f51346OooO)).booleanValue()) {
            strOooO0oo = momentImageModel.getUrl();
        } else if (i2 == 1) {
            String url = momentImageModel.getUrl();
            int iOooO00o = o0000O0.OooO00o(280);
            strOooO0oo = p139o00OOooO.OooO0o.OooO0oo(iOooO00o, iOooO00o, url);
        } else if (i2 != 2) {
            strOooO0oo = p396o0Oo0O.OooOOO.OooO0O0(momentImageModel.getUrl());
        } else {
            String url2 = momentImageModel.getUrl();
            int iOooO00o2 = o0000O0.OooO00o(140);
            strOooO0oo = p139o00OOooO.OooO0o.OooO0oo(iOooO00o2, iOooO00o2, url2);
        }
        String str = strOooO0oo;
        LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        boolean z = momentImageModel.isGif() && o0ooooo.f51860OooO00o.getValue().intValue() == i;
        Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(context);
            oooO00o.OooO00o(p543o0oO0O00.OooO.OooO0Oo());
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(oooO00o, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue;
        Modifier.Companion companion2 = Modifier.INSTANCE;
        boolean z2 = !zBooleanValue;
        Modifier modifierOooO0O0 = com.code.android.util.o0O0O00.OooO0O0(BackgroundKt.m169backgroundbw27NRU$default(ClipKt.clip(companion2.then(modifier2), RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(oo0o0Oo.OooO00o(z2))), ColorKt.Color(4293783021L), null, 2, null), false, false, 0L, false, null, null, null, new OooO00o(function2, momentImageModel, i), 253);
        Integer numValueOf = Integer.valueOf(i);
        composerStartRestartGroup.startReplaceableGroup(511388516);
        boolean zChanged = composerStartRestartGroup.changed(numValueOf) | composerStartRestartGroup.changed(snapshotStateMap);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new OooO0O0(snapshotStateMap, i);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(modifierOooO0O0, (Function1) objRememberedValue2);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion3 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyOooO00o = p018OooOoo0.OooOOO.OooO00o(companion3, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierOnGloballyPositioned);
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
        AndroidView_androidKt.AndroidView(OooO0OO.f50569OooO0Oo, BackgroundKt.m169backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), ColorKt.Color(4293783021L), null, 2, null), new OooO0o(z, context, str, o0ooooo, mutableState, lifecycleOwner), composerStartRestartGroup, 6, 0);
        composerStartRestartGroup.startReplaceableGroup(-90076793);
        if (momentImageModel.isGif() && !z) {
            TextKt.m1251Text4IGK_g(StringResources_androidKt.stringResource(oO00OOo0.single_GIF, composerStartRestartGroup, 0), PaddingKt.m477paddingVpY3zN4(BackgroundKt.m169backgroundbw27NRU$default(ClipKt.clip(boxScopeInstance.align(companion2, companion3.getBottomEnd()), RoundedCornerShapeKt.m729RoundedCornerShapea9UjIt4$default(oo0o0Oo.OooO00o(z2), 0.0f, oo0o0Oo.OooO00o(z2), 0.0f, 10, null)), o0oO0O0o.f46980Oooo0O0, null, 2, null), Dp.m3765constructorimpl(6), Dp.m3765constructorimpl(2)), o0oO0O0o.f46946OooO0O0, TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composerStartRestartGroup, 3072, 0, 65520);
        }
        if (OooOo.OooO0o.OooO0O0(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO(momentImageModel, modifier2, i, i2, function2, o0ooooo, snapshotStateMap, snapshotStateMap2, i3, i4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0O0(@Nullable Modifier modifier, @Nullable Function2<? super PostDetailHeaderViewTag, Object, Unit> function2, @Nullable Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1703668093);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i3 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1703668093, i, -1, "com.yalla.yalla.ui.composable.moment.MomentImageList (MomentImageList.kt:66)");
            }
            MomentDetailModel momentDetailModel = (MomentDetailModel) composerStartRestartGroup.consume(oo0O.f51350OooO0Oo);
            if (momentDetailModel.getType() == MomentType.Video.getValue()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0(modifier3, function2, i, i2));
                return;
            }
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(momentDetailModel);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = momentDetailModel.getImageInfoList();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            ArrayList arrayList = (ArrayList) objRememberedValue;
            if (arrayList.isEmpty()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup2 == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup2.updateScope(new OooOO0O(modifier3, function2, i, i2));
                return;
            }
            Activity activity = (Activity) composerStartRestartGroup.consume(oo0O.f51352OooO0o0);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged2 = composerStartRestartGroup.changed(momentDetailModel);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.mutableStateMapOf();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            SnapshotStateMap snapshotStateMap = (SnapshotStateMap) objRememberedValue2;
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged3 = composerStartRestartGroup.changed(momentDetailModel);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt.mutableStateMapOf();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            SnapshotStateMap snapshotStateMap2 = (SnapshotStateMap) objRememberedValue3;
            OooOOOO oooOOOO = new OooOOOO(((Boolean) composerStartRestartGroup.consume(oo0O.f51346OooO)).booleanValue(), activity, momentDetailModel, snapshotStateMap, snapshotStateMap2, arrayList);
            o0Oo0oo o0oo0oo2 = (o0Oo0oo) composerStartRestartGroup.consume(oo0O.f51353OooO0oO);
            Integer numValueOf = o0oo0oo2 != null ? Integer.valueOf(o0oo0oo2.f51832OooO0Oo.getIntValue()) : null;
            int iIntValue = ((Number) composerStartRestartGroup.consume(oo0O.f51354OooO0oo)).intValue();
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new o0ooOOo(), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState = (MutableState) objRememberedValue4;
            EffectsKt.LaunchedEffect(numValueOf, new OooOOO0(numValueOf, iIntValue, arrayList, mutableState, null), composerStartRestartGroup, 64);
            Modifier modifierThen = Modifier.INSTANCE.then(modifier3);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyOooO00o = p018OooOoo0.OooOOO.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierThen);
            Modifier modifier4 = modifier3;
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
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int size = arrayList.size();
            if (size == 1) {
                composerStartRestartGroup.startReplaceableGroup(-954550481);
                OooO0OO(arrayList, oooOOOO, (o0ooOOo) mutableState.getValue(), snapshotStateMap, snapshotStateMap2, composerStartRestartGroup, 520);
                composerStartRestartGroup.endReplaceableGroup();
            } else if (size == 2) {
                composerStartRestartGroup.startReplaceableGroup(-954550321);
                OooO0o(arrayList, oooOOOO, (o0ooOOo) mutableState.getValue(), snapshotStateMap, snapshotStateMap2, composerStartRestartGroup, 520);
                composerStartRestartGroup.endReplaceableGroup();
            } else if (size != 4) {
                composerStartRestartGroup.startReplaceableGroup(-954549991);
                OooO0o0(arrayList, oooOOOO, (o0ooOOo) mutableState.getValue(), snapshotStateMap, snapshotStateMap2, composerStartRestartGroup, 520);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(-954550158);
                OooO0Oo(arrayList, oooOOOO, (o0ooOOo) mutableState.getValue(), snapshotStateMap, snapshotStateMap2, composerStartRestartGroup, 520);
                composerStartRestartGroup.endReplaceableGroup();
            }
            if (androidx.compose.material.OooOO0.OooO0O0(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup3 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup3 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup3.updateScope(new OooOOO(modifier2, function2, i, i2));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0078 A[PHI: r1
      0x0078: PHI (r1v29 float) = (r1v27 float), (r1v28 float) binds: [B:17:0x0076, B:20:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0OO(@NotNull ArrayList<MomentImageModel> imageInfoList, @NotNull Function2<? super MomentImageModel, ? super Integer, Unit> itemClick, @NotNull o0ooOOo momentGifPlayManager, @NotNull SnapshotStateMap<Integer, LayoutCoordinates> indexImageLocationMap, @NotNull SnapshotStateMap<Integer, Drawable> indexImageDrawable, @Nullable Composer composer, int i) {
        float f;
        Modifier modifierAspectRatio$default;
        Intrinsics.checkNotNullParameter(imageInfoList, "imageInfoList");
        Intrinsics.checkNotNullParameter(itemClick, "itemClick");
        Intrinsics.checkNotNullParameter(momentGifPlayManager, "momentGifPlayManager");
        Intrinsics.checkNotNullParameter(indexImageLocationMap, "indexImageLocationMap");
        Intrinsics.checkNotNullParameter(indexImageDrawable, "indexImageDrawable");
        Composer composerStartRestartGroup = composer.startRestartGroup(-127049223);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-127049223, i, -1, "com.yalla.yalla.ui.composable.moment.MomentImageOne (MomentImageList.kt:211)");
        }
        MomentImageModel momentImageModel = imageInfoList.get(0);
        Intrinsics.checkNotNullExpressionValue(momentImageModel, "imageInfoList[0]");
        MomentImageModel item = momentImageModel;
        Intrinsics.checkNotNullParameter(item, "item");
        int width = item.getWidth();
        int height = item.getHeight();
        if (width == 0 || height == 0) {
            f = 1.0f;
        } else {
            f = (((((double) width) * 1.0d) / ((double) height)) > 1.0d ? 1 : (((((double) width) * 1.0d) / ((double) height)) == 1.0d ? 0 : -1)) == 0 ? 1.0f : (width * 1.0f) / height;
            float f2 = 0.6666667f;
            if (f < 0.6666667f) {
                f = f2;
            } else {
                f2 = 1.5f;
                if (f > 1.5f) {
                    f = f2;
                }
            }
        }
        boolean zBooleanValue = ((Boolean) composerStartRestartGroup.consume(oo0O.f51351OooO0o)).booleanValue();
        if (f == 1.0f) {
            modifierAspectRatio$default = SizeKt.m523size3ABfNKs(Modifier.INSTANCE, Dp.m3765constructorimpl(zBooleanValue ? 158 : 178));
        } else if (f > 1.0f) {
            modifierAspectRatio$default = AspectRatioKt.aspectRatio$default(SizeKt.m528width3ABfNKs(Modifier.INSTANCE, Dp.m3765constructorimpl(zBooleanValue ? 238 : 267)), f, false, 2, null);
        } else {
            modifierAspectRatio$default = AspectRatioKt.aspectRatio$default(SizeKt.m528width3ABfNKs(Modifier.INSTANCE, Dp.m3765constructorimpl(zBooleanValue ? 158 : 178)), f, false, 2, null);
        }
        Modifier modifier = modifierAspectRatio$default;
        int i2 = i << 9;
        OooO00o(item, modifier, 0, 1, itemClick, momentGifPlayManager, indexImageLocationMap, indexImageDrawable, composerStartRestartGroup, (57344 & i2) | 265608 | (3670016 & i2) | (i2 & 29360128), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOo00(imageInfoList, itemClick, momentGifPlayManager, indexImageLocationMap, indexImageDrawable, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0Oo(@NotNull ArrayList<MomentImageModel> imageInfoList, @NotNull Function2<? super MomentImageModel, ? super Integer, Unit> itemClick, @NotNull o0ooOOo momentGifPlayManager, @NotNull SnapshotStateMap<Integer, LayoutCoordinates> indexImageLocationMap, @NotNull SnapshotStateMap<Integer, Drawable> indexImageDrawable, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(imageInfoList, "imageInfoList");
        Intrinsics.checkNotNullParameter(itemClick, "itemClick");
        Intrinsics.checkNotNullParameter(momentGifPlayManager, "momentGifPlayManager");
        Intrinsics.checkNotNullParameter(indexImageLocationMap, "indexImageLocationMap");
        Intrinsics.checkNotNullParameter(indexImageDrawable, "indexImageDrawable");
        Composer composerStartRestartGroup = composer.startRestartGroup(1459775139);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1459775139, i, -1, "com.yalla.yalla.ui.composable.moment.NewMomentImageFour (MomentImageList.kt:304)");
        }
        float fM3765constructorimpl = Dp.m3765constructorimpl(((Boolean) composerStartRestartGroup.consume(oo0O.f51351OooO0o)).booleanValue() ? 77 : 86);
        Modifier.Companion companion = Modifier.INSTANCE;
        float fM3765constructorimpl2 = Dp.m3765constructorimpl(2 * fM3765constructorimpl);
        float f = f50553OooO00o;
        Modifier modifierM523size3ABfNKs = SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(fM3765constructorimpl2 + f));
        Arrangement.HorizontalOrVertical horizontalOrVerticalM390spacedBy0680j_4 = Arrangement.INSTANCE.m390spacedBy0680j_4(f);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyOooO00o = o00O00o0.OooO00o(Alignment.INSTANCE, horizontalOrVerticalM390spacedBy0680j_4, composerStartRestartGroup, 6, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(-1638036290);
        int i2 = 2;
        int i3 = 0;
        while (i3 < i2) {
            Arrangement.HorizontalOrVertical horizontalOrVerticalM390spacedBy0680j_5 = Arrangement.INSTANCE.m390spacedBy0680j_4(f);
            composerStartRestartGroup.startReplaceableGroup(693286680);
            Modifier.Companion companion3 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM390spacedBy0680j_5, Alignment.INSTANCE.getTop(), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion3);
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
            Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion4, composerM1309constructorimpl2, measurePolicyRowMeasurePolicy, composerM1309constructorimpl2, currentCompositionLocalMap2);
            if (composerM1309constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            boolean z = false;
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(-1900961580);
            i2 = 2;
            int i4 = 0;
            while (i4 < i2) {
                int i5 = (i3 * 2) + i4;
                MomentImageModel momentImageModel = imageInfoList.get(i5);
                Intrinsics.checkNotNullExpressionValue(momentImageModel, "imageInfoList[index]");
                int i6 = i << 9;
                OooO00o(momentImageModel, SizeKt.m523size3ABfNKs(Modifier.INSTANCE, fM3765constructorimpl), i5, 4, itemClick, momentGifPlayManager, indexImageLocationMap, indexImageDrawable, composerStartRestartGroup, (57344 & i6) | 265224 | (i6 & 3670016) | (i6 & 29360128), 0);
                i4++;
                i2 = 2;
                z = z;
                i3 = i3;
                f = f;
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            i3++;
        }
        if (OooOo.OooO0o.OooO0O0(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOo(imageInfoList, itemClick, momentGifPlayManager, indexImageLocationMap, indexImageDrawable, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0o(@NotNull ArrayList<MomentImageModel> imageInfoList, @NotNull Function2<? super MomentImageModel, ? super Integer, Unit> itemClick, @NotNull o0ooOOo momentGifPlayManager, @NotNull SnapshotStateMap<Integer, LayoutCoordinates> indexImageLocationMap, @NotNull SnapshotStateMap<Integer, Drawable> indexImageDrawable, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(imageInfoList, "imageInfoList");
        Intrinsics.checkNotNullParameter(itemClick, "itemClick");
        Intrinsics.checkNotNullParameter(momentGifPlayManager, "momentGifPlayManager");
        Intrinsics.checkNotNullParameter(indexImageLocationMap, "indexImageLocationMap");
        Intrinsics.checkNotNullParameter(indexImageDrawable, "indexImageDrawable");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1082999377);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1082999377, i, -1, "com.yalla.yalla.ui.composable.moment.NewMomentImageTwo (MomentImageList.kt:244)");
        }
        float fM3765constructorimpl = Dp.m3765constructorimpl(((Boolean) composerStartRestartGroup.consume(oo0O.f51351OooO0o)).booleanValue() ? 113 : 132);
        Modifier.Companion companion = Modifier.INSTANCE;
        float fM3765constructorimpl2 = Dp.m3765constructorimpl(2 * fM3765constructorimpl);
        float f = f50553OooO00o;
        Modifier modifierM528width3ABfNKs = SizeKt.m528width3ABfNKs(companion, Dp.m3765constructorimpl(fM3765constructorimpl2 + f));
        Arrangement.HorizontalOrVertical horizontalOrVerticalM390spacedBy0680j_4 = Arrangement.INSTANCE.m390spacedBy0680j_4(f);
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM390spacedBy0680j_4, Alignment.INSTANCE.getTop(), composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM528width3ABfNKs);
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
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyRowMeasurePolicy, composerM1309constructorimpl, currentCompositionLocalMap);
        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(-2130616991);
        int i2 = 0;
        for (int i3 = 2; i2 < i3; i3 = i3) {
            MomentImageModel momentImageModel = imageInfoList.get(i2);
            Intrinsics.checkNotNullExpressionValue(momentImageModel, "imageInfoList[index]");
            int i4 = i << 9;
            OooO00o(momentImageModel, SizeKt.m523size3ABfNKs(Modifier.INSTANCE, fM3765constructorimpl), i2, 2, itemClick, momentGifPlayManager, indexImageLocationMap, indexImageDrawable, composerStartRestartGroup, (57344 & i4) | 265224 | (3670016 & i4) | (i4 & 29360128), 0);
            i2++;
        }
        if (OooOo.OooO0o.OooO0O0(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Oooo0(imageInfoList, itemClick, momentGifPlayManager, indexImageLocationMap, indexImageDrawable, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0o0(@NotNull ArrayList<MomentImageModel> imageInfoList, @NotNull Function2<? super MomentImageModel, ? super Integer, Unit> itemClick, @NotNull o0ooOOo momentGifPlayManager, @NotNull SnapshotStateMap<Integer, LayoutCoordinates> indexImageLocationMap, @NotNull SnapshotStateMap<Integer, Drawable> indexImageDrawable, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(imageInfoList, "imageInfoList");
        Intrinsics.checkNotNullParameter(itemClick, "itemClick");
        Intrinsics.checkNotNullParameter(momentGifPlayManager, "momentGifPlayManager");
        Intrinsics.checkNotNullParameter(indexImageLocationMap, "indexImageLocationMap");
        Intrinsics.checkNotNullParameter(indexImageDrawable, "indexImageDrawable");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1775162412);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1775162412, i, -1, "com.yalla.yalla.ui.composable.moment.NewMomentImageMore (MomentImageList.kt:343)");
        }
        boolean zBooleanValue = ((Boolean) composerStartRestartGroup.consume(oo0O.f51351OooO0o)).booleanValue();
        int size = imageInfoList.size();
        float fM3765constructorimpl = Dp.m3765constructorimpl(zBooleanValue ? 77 : 86);
        int iCeil = (int) Math.ceil(((double) size) / 3.0d);
        Modifier.Companion companion = Modifier.INSTANCE;
        float fM3765constructorimpl2 = Dp.m3765constructorimpl(3 * fM3765constructorimpl);
        float f = f50553OooO00o;
        Modifier modifierM509height3ABfNKs = SizeKt.m509height3ABfNKs(SizeKt.m528width3ABfNKs(companion, Dp.m3765constructorimpl(Dp.m3765constructorimpl(2 * f) + fM3765constructorimpl2)), Dp.m3765constructorimpl(Dp.m3765constructorimpl((iCeil - 1) * f) + Dp.m3765constructorimpl(iCeil * fM3765constructorimpl)));
        Arrangement.HorizontalOrVertical horizontalOrVerticalM390spacedBy0680j_4 = Arrangement.INSTANCE.m390spacedBy0680j_4(f);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyOooO00o = o00O00o0.OooO00o(Alignment.INSTANCE, horizontalOrVerticalM390spacedBy0680j_4, composerStartRestartGroup, 6, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM509height3ABfNKs);
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
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(-1631573493);
        for (int i2 = 0; i2 < iCeil; i2++) {
            Arrangement.HorizontalOrVertical horizontalOrVerticalM390spacedBy0680j_5 = Arrangement.INSTANCE.m390spacedBy0680j_4(f);
            composerStartRestartGroup.startReplaceableGroup(693286680);
            Modifier.Companion companion3 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM390spacedBy0680j_5, Alignment.INSTANCE.getTop(), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion3);
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
            Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion4, composerM1309constructorimpl2, measurePolicyRowMeasurePolicy, composerM1309constructorimpl2, currentCompositionLocalMap2);
            if (composerM1309constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            int i3 = 0;
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(1031879849);
            int i4 = 3;
            while (i3 < i4) {
                int i5 = (i2 * 3) + i3;
                composerStartRestartGroup.startReplaceableGroup(-1206180437);
                if (i5 < size) {
                    MomentImageModel momentImageModel = imageInfoList.get(i5);
                    Intrinsics.checkNotNullExpressionValue(momentImageModel, "imageInfoList[index]");
                    int i6 = i << 9;
                    int i7 = (57344 & i6) | 262152 | (3670016 & i6) | (i6 & 29360128);
                    i4 = 3;
                    OooO00o(momentImageModel, SizeKt.m523size3ABfNKs(Modifier.INSTANCE, fM3765constructorimpl), i5, size, itemClick, momentGifPlayManager, indexImageLocationMap, indexImageDrawable, composerStartRestartGroup, i7, 0);
                }
                composerStartRestartGroup.endReplaceableGroup();
                i3++;
                f = f;
                iCeil = iCeil;
                size = size;
                composerStartRestartGroup = composerStartRestartGroup;
            }
            Composer composer2 = composerStartRestartGroup;
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
        }
        Composer composer3 = composerStartRestartGroup;
        if (OooOo.OooO0o.OooO0O0(composer3)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Oooo000(imageInfoList, itemClick, momentGifPlayManager, indexImageLocationMap, indexImageDrawable, i));
    }
}
