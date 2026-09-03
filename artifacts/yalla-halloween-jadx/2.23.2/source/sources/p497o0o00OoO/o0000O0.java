package p497o0o00OoO;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.o0000O0O;
import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.IconKt;
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
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
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
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import com.code.android.util.o0000;
import com.code.android.util.o0000Ooo;
import com.code.android.util.o000O;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.mixedroom.MixedRoomDataSource;
import com.yalla.yalla.mixedroom.model.RoomLoginInformation;
import com.yalla.yalla.service.room.RoomLiveService;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.view.tips.TipsBubbleView;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
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
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p414o0Oo0oO.oO0OOo0o;
import p423o0OoO0OO.o000OO;
import p475o0Ooooo0.o0O00oO0;
import p476o0OooooO.o0OOo000;
import p483o0o000Oo.o0000oo;
import p541o0o0OoOO.oO0O0;
import p598o0oo00Oo.o0000O00;
import p650o0ooo.oOO0Oo00;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nRoomBottomDefaultComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomBottomDefaultComp.kt\ncom/yalla/yalla/ui/activity/room/live/bottom/RoomBottomDefaultCompKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,575:1\n154#2:576\n154#2:657\n154#2:658\n154#2:660\n154#2:676\n154#2:677\n154#2:748\n154#2:754\n154#2:777\n154#2:778\n154#2:779\n154#2:780\n154#2:781\n154#2:782\n154#2:783\n154#2:784\n154#2:800\n154#2:808\n154#2:816\n154#2:817\n154#2:826\n154#2:827\n73#3,6:577\n79#3:611\n73#3,6:612\n79#3:646\n83#3:651\n83#3:656\n73#3,6:713\n79#3:747\n83#3:753\n78#4,11:583\n78#4,11:618\n91#4:650\n91#4:655\n78#4,11:684\n78#4,11:719\n91#4:752\n91#4:775\n456#5,8:594\n464#5,3:608\n456#5,8:629\n464#5,3:643\n467#5,3:647\n467#5,3:652\n25#5:662\n25#5:669\n456#5,8:695\n464#5,3:709\n456#5,8:730\n464#5,3:744\n467#5,3:749\n36#5:755\n67#5,3:762\n66#5:765\n467#5,3:772\n25#5:785\n50#5:792\n49#5:793\n25#5:801\n36#5:809\n36#5:818\n4144#6,6:602\n4144#6,6:637\n4144#6,6:703\n4144#6,6:738\n76#7:659\n76#7:661\n76#7:825\n1097#8,6:663\n1097#8,6:670\n1097#8,6:756\n1097#8,6:766\n1097#8,6:786\n1097#8,6:794\n1097#8,6:802\n1097#8,6:810\n1097#8,6:819\n66#9,6:678\n72#9:712\n76#9:776\n215#10,2:828\n81#11:830\n81#11:831\n81#11:832\n81#11:833\n81#11:834\n107#11,2:835\n81#11:837\n107#11,2:838\n81#11:840\n81#11:841\n81#11:842\n81#11:843\n107#11,2:844\n81#11:846\n*S KotlinDebug\n*F\n+ 1 RoomBottomDefaultComp.kt\ncom/yalla/yalla/ui/activity/room/live/bottom/RoomBottomDefaultCompKt\n*L\n75#1:576\n100#1:657\n120#1:658\n143#1:660\n171#1:676\n174#1:677\n200#1:748\n211#1:754\n246#1:777\n257#1:778\n259#1:779\n262#1:780\n264#1:781\n276#1:782\n277#1:783\n278#1:784\n323#1:800\n371#1:808\n406#1:816\n415#1:817\n456#1:826\n457#1:827\n72#1:577,6\n72#1:611\n78#1:612,6\n78#1:646\n78#1:651\n72#1:656\n188#1:713,6\n188#1:747\n188#1:753\n72#1:583,11\n78#1:618,11\n78#1:650\n72#1:655\n173#1:684,11\n188#1:719,11\n188#1:752\n173#1:775\n72#1:594,8\n72#1:608,3\n78#1:629,8\n78#1:643,3\n78#1:647,3\n72#1:652,3\n167#1:662\n169#1:669\n173#1:695,8\n173#1:709,3\n188#1:730,8\n188#1:744,3\n188#1:749,3\n215#1:755\n225#1:762,3\n225#1:765\n173#1:772,3\n313#1:785\n314#1:792\n314#1:793\n324#1:801\n376#1:809\n431#1:818\n72#1:602,6\n78#1:637,6\n173#1:703,6\n188#1:738,6\n141#1:659\n164#1:661\n450#1:825\n167#1:663,6\n169#1:670,6\n215#1:756,6\n225#1:766,6\n313#1:786,6\n314#1:794,6\n324#1:802,6\n376#1:810,6\n431#1:819,6\n173#1:678,6\n173#1:712\n173#1:776\n518#1:828,2\n101#1:830\n118#1:831\n121#1:832\n139#1:833\n167#1:834\n167#1:835,2\n169#1:837\n169#1:838,2\n195#1:840\n210#1:841\n312#1:842\n313#1:843\n313#1:844,2\n321#1:846\n*E\n"})
public final class o0000O0 {

    public static final class OooO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f49702OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(MutableState<Boolean> mutableState) {
            super(0);
            this.f49702OooO0Oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0000O0O onLogin = new o0000O0O(this.f49702OooO0Oo);
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
            } else {
                Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                if (activityOooO0O0 != null) {
                    int i = LoginActivity.f24727OooOo0O;
                    LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f49703OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(int i) {
            super(2);
            this.f49703OooO0Oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o0000O0.OooO00o(composer, RecomposeScopeImplKt.updateChangedFlags(this.f49703OooO0Oo | 1));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.room.live.bottom.RoomBottomDefaultCompKt$ApplyMicCompose$2$1", f = "RoomBottomDefaultComp.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ State<Integer> f49704OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f49705OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(MutableState mutableState, State state, Continuation continuation) {
            super(2, continuation);
            this.f49704OooO0Oo = state;
            this.f49705OooO0o0 = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f49705OooO0o0, this.f49704OooO0Oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Integer value;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            State<Integer> state = this.f49704OooO0Oo;
            Integer value2 = state.getValue();
            boolean z = true;
            if ((value2 == null || value2.intValue() != 1) && ((value = state.getValue()) == null || value.intValue() != 2)) {
                z = false;
            }
            this.f49705OooO0o0.setValue(Boolean.valueOf(z));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f49706OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(int i) {
            super(2);
            this.f49706OooO0Oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o0000O0.OooO00o(composer, RecomposeScopeImplKt.updateChangedFlags(this.f49706OooO0Oo | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f49707OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(int i) {
            super(2);
            this.f49707OooO0Oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o0000O0.OooO00o(composer, RecomposeScopeImplKt.updateChangedFlags(this.f49707OooO0Oo | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<LayoutCoordinates, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOO0 f49708OooO0Oo = new OooOO0();

        public OooOO0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(LayoutCoordinates layoutCoordinates) {
            LayoutCoordinates it = layoutCoordinates;
            Intrinsics.checkNotNullParameter(it, "it");
            long jPositionInWindow = LayoutCoordinatesKt.positionInWindow(it);
            oO0O0 oo0o0 = oO0O0.f55079OooO00o;
            oO0O0.f55080OooO0O0.setValue(IntOffset.m3884boximpl(IntOffsetKt.IntOffset(com.code.android.util.o000000.OooO0Oo(Float.valueOf(Offset.m1447getXimpl(jPositionInWindow))), com.code.android.util.o0000O0.OooO00o(-50))));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f49709OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(Function0<Unit> function0) {
            super(0);
            this.f49709OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f49709OooO0Oo.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f49710OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f49711OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(int i, Function0 function0) {
            super(2);
            this.f49710OooO0Oo = function0;
            this.f49711OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f49711OooO0o0 | 1);
            o0000O0.OooO0O0(this.f49710OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nRoomBottomDefaultComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomBottomDefaultComp.kt\ncom/yalla/yalla/ui/activity/room/live/bottom/RoomBottomDefaultCompKt$ApplyMicNewUserInfo$3\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,575:1\n154#2:576\n*S KotlinDebug\n*F\n+ 1 RoomBottomDefaultComp.kt\ncom/yalla/yalla/ui/activity/room/live/bottom/RoomBottomDefaultCompKt$ApplyMicNewUserInfo$3\n*L\n388#1:576\n*E\n"})
    public static final class OooOOO0 extends Lambda implements Function1<ContentDrawScope, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOOO0 f49712OooO0Oo = new OooOOO0();

        public OooOOO0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ContentDrawScope contentDrawScope) {
            ContentDrawScope drawWithContent = contentDrawScope;
            Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
            drawWithContent.drawContent();
            long j = o0OOo000.f48350o00o0O;
            float f = 21;
            androidx.compose.ui.graphics.drawscope.OooO0O0.Oooo0OO(drawWithContent, j, OffsetKt.Offset(com.code.android.util.o0000O0.OooO00o(f), com.code.android.util.o0000O0.OooO00o((float) 2.5d)), SizeKt.Size(com.code.android.util.o0000O0.OooO00o((float) 9.5d), com.code.android.util.o0000O0.OooO00o((float) 6.5d)), 0.0f, null, null, 0, 120, null);
            float f2 = 100;
            androidx.compose.ui.graphics.drawscope.OooO0O0.Oooo0o(drawWithContent, j, OffsetKt.Offset(com.code.android.util.o0000O0.OooO00o(f), -com.code.android.util.o0000O0.OooO00o(4)), SizeKt.Size(com.code.android.util.o0000O0.OooO00o(19), com.code.android.util.o0000O0.OooO00o(13)), CornerRadiusKt.CornerRadius(drawWithContent.mo326toPx0680j_4(Dp.m3775constructorimpl(f2)), drawWithContent.mo326toPx0680j_4(Dp.m3775constructorimpl(f2))), null, 0.0f, null, 0, 240, null);
            Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(drawWithContent.getDrawContext().getCanvas());
            String strValueOf = String.valueOf(RangesKt.coerceIn(com.yalla.yalla.service.room.OooO00o.f24517OooO0oO.OooO0oO(), 0, 99));
            float fOooO00o = com.code.android.util.o0000O0.OooO00o((float) 30.5d);
            float fOooO00o2 = com.code.android.util.o0000O0.OooO00o((float) 5.5d);
            Paint paint = new Paint();
            paint.setTextSize(com.code.android.util.o0000O0.OooO00o(9));
            paint.setColor(o0000.OooO00o(p562o0oOo000.o0OOO0o.color_333333));
            paint.setTextAlign(Paint.Align.CENTER);
            Unit unit = Unit.INSTANCE;
            nativeCanvas.drawText(strValueOf, fOooO00o, fOooO00o2, paint);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function1<LayoutCoordinates, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOOOO f49713OooO0Oo = new OooOOOO();

        public OooOOOO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(LayoutCoordinates layoutCoordinates) {
            LayoutCoordinates it = layoutCoordinates;
            Intrinsics.checkNotNullParameter(it, "it");
            long jPositionInWindow = LayoutCoordinatesKt.positionInWindow(it);
            oO0O0 oo0o0 = oO0O0.f55079OooO00o;
            oO0O0.f55080OooO0O0.setValue(IntOffset.m3884boximpl(IntOffsetKt.IntOffset(com.code.android.util.o000000.OooO0Oo(Float.valueOf(Offset.m1447getXimpl(jPositionInWindow))), com.code.android.util.o0000O0.OooO00o(-50))));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f49714OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f49715OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(int i, Function0 function0) {
            super(2);
            this.f49714OooO0Oo = function0;
            this.f49715OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f49715OooO0o0 | 1);
            o0000O0.OooO0OO(this.f49714OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f49716OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(Function0<Unit> function0) {
            super(0);
            this.f49716OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f49716OooO0Oo.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f49717OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo0(int i) {
            super(2);
            this.f49717OooO0Oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o0000O0.OooO0Oo(composer, RecomposeScopeImplKt.updateChangedFlags(this.f49717OooO0Oo | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f49718OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo000(FragmentActivity fragmentActivity) {
            super(0);
            this.f49718OooO0Oo = fragmentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0oo0000.OooO00o.OooO0O0("102060");
            FragmentActivity fragmentActivity = this.f49718OooO0Oo;
            if (fragmentActivity != null) {
                new oOO0Oo00(fragmentActivity).OooO();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o000000 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f49719OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000000(int i) {
            super(2);
            this.f49719OooO0Oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o0000O0.OooOO0(composer, RecomposeScopeImplKt.updateChangedFlags(this.f49719OooO0Oo | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class o000OOo extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o000OOo f49720OooO0Oo = new o000OOo();

        public o000OOo() {
            super(0);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0031  */
        /* JADX WARN: Code duplicated, block: B:12:0x0043  */
        /* JADX WARN: Code duplicated, block: B:13:0x0046  */
        /* JADX WARN: Code duplicated, block: B:16:0x0058  */
        /* JADX WARN: Code duplicated, block: B:18:0x0060  */
        /* JADX WARN: Code duplicated, block: B:22:0x007c A[LOOP:0: B:20:0x0076->B:22:0x007c, LOOP_END] */
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            boolean z;
            String str;
            MixedRoomDataSource mixedRoomDataSourceOooO0o0;
            boolean zAreEqual;
            RoomLoginInformation roomLoginInformation = MixedRoomDataSource.OooO0o0().f22992OooO0o0;
            if (roomLoginInformation == null) {
                z = !com.yalla.yalla.service.room.OooO00o.f24517OooO0oO.f48578OooO0OO.getValue().booleanValue();
                if (z) {
                    str = "102055";
                } else {
                    str = "102056";
                }
                o0oo0000.OooO00o.OooO0O0(str);
                p355o0OOOo0o.OooO0o.OooO0O0().OooO00o().OooOOOo(z);
                if (!z) {
                    mixedRoomDataSourceOooO0o0 = MixedRoomDataSource.OooO0o0();
                    if (mixedRoomDataSourceOooO0o0.f22989OooO == null) {
                        mixedRoomDataSourceOooO0o0.f22989OooO = new HashMap<>();
                    }
                    HashMap<Long, Boolean> map = mixedRoomDataSourceOooO0o0.f22989OooO;
                    Intrinsics.checkNotNullExpressionValue(map, "getMuteSoundMap(...)");
                    for (Map.Entry<Long, Boolean> entry : map.entrySet()) {
                        p355o0OOOo0o.OooO oooOOooO00o = p355o0OOOo0o.OooO0o.OooO0O0().OooO00o();
                        int iOooO0OO = com.code.android.util.o000000.OooO0OO(entry.getKey());
                        Boolean value = entry.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "<get-value>(...)");
                        oooOOooO00o.OooO0o(iOooO0OO, value.booleanValue());
                    }
                }
                com.yalla.yalla.service.room.OooO00o.f24517OooO0oO.f48578OooO0OO.setValue(Boolean.valueOf(z));
            } else {
                RoomLiveService roomLiveService = RoomLiveService.f24596OooOo00;
                if (roomLiveService != null) {
                    RoomLoginInformation.RoomBean room = roomLoginInformation.getRoom();
                    Intrinsics.checkNotNull(room);
                    zAreEqual = Intrinsics.areEqual(roomLiveService.OooO0OO(room.getId()), Boolean.TRUE);
                } else {
                    zAreEqual = false;
                }
                if (zAreEqual) {
                    z = !com.yalla.yalla.service.room.OooO00o.f24517OooO0oO.f48578OooO0OO.getValue().booleanValue();
                    if (z) {
                        str = "102055";
                    } else {
                        str = "102056";
                    }
                    o0oo0000.OooO00o.OooO0O0(str);
                    p355o0OOOo0o.OooO0o.OooO0O0().OooO00o().OooOOOo(z);
                    if (!z) {
                        mixedRoomDataSourceOooO0o0 = MixedRoomDataSource.OooO0o0();
                        if (mixedRoomDataSourceOooO0o0.f22989OooO == null) {
                            mixedRoomDataSourceOooO0o0.f22989OooO = new HashMap<>();
                        }
                        HashMap<Long, Boolean> map2 = mixedRoomDataSourceOooO0o0.f22989OooO;
                        Intrinsics.checkNotNullExpressionValue(map2, "getMuteSoundMap(...)");
                        while (r1.hasNext()) {
                            p355o0OOOo0o.OooO oooOOooO00o2 = p355o0OOOo0o.OooO0o.OooO0O0().OooO00o();
                            int iOooO0OO2 = com.code.android.util.o000000.OooO0OO(entry.getKey());
                            Boolean value2 = entry.getValue();
                            Intrinsics.checkNotNullExpressionValue(value2, "<get-value>(...)");
                            oooOOooO00o2.OooO0o(iOooO0OO2, value2.booleanValue());
                        }
                    }
                    com.yalla.yalla.service.room.OooO00o.f24517OooO0oO.f48578OooO0OO.setValue(Boolean.valueOf(z));
                } else {
                    o0000O00.OooO00o(102, "RoomBottomDefaultComp", "switchMuteSound: 语音未登录房间静音被取消", null);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o000oOoO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MixedRoomActivity f49721OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000oOoO(MixedRoomActivity mixedRoomActivity) {
            super(0);
            this.f49721OooO0Oo = mixedRoomActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            MixedRoomActivity mixedRoomActivity = this.f49721OooO0Oo;
            if (mixedRoomActivity != null) {
                o000OO onLogin = new o000OO(mixedRoomActivity);
                Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
                    onLogin.invoke();
                } else {
                    Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                    if (activityOooO0O0 != null) {
                        int i = LoginActivity.f24727OooOo0O;
                        LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o00O0O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o00O0O f49722OooO0Oo = new o00O0O();

        public o00O0O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0oo0000.OooO00o.OooO0OO("102223", MapsKt.mapOf(new Pair("usertype", com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO.OooO00o().f24546OooOO0o.getValue())));
            o0000O onLogin = o0000O.f49701OooO0Oo;
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
            } else {
                Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                if (activityOooO0O0 != null) {
                    int i = LoginActivity.f24727OooOo0O;
                    LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o00Oo0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData<Pair<Integer, Integer>> f49723OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f49724OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Oo0(int i, MutableLiveData mutableLiveData) {
            super(2);
            this.f49723OooO0Oo = mutableLiveData;
            this.f49724OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f49724OooO0o0 | 1);
            o0000O0.OooO0o(this.f49723OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o00Ooo extends Lambda implements Function1<LayoutCoordinates, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData<Pair<Integer, Integer>> f49725OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Ooo(MutableLiveData<Pair<Integer, Integer>> mutableLiveData) {
            super(1);
            this.f49725OooO0Oo = mutableLiveData;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(LayoutCoordinates layoutCoordinates) {
            LayoutCoordinates it = layoutCoordinates;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f49725OooO0Oo.setValue(new Pair<>(Integer.valueOf((int) Offset.m1447getXimpl(it.mo2814localToWindowMKHz9U(Offset.INSTANCE.m1463getZeroF1C5BW0()))), Integer.valueOf(IntSize.m3935getWidthimpl(it.mo2811getSizeYbymL2g()))));
            return Unit.INSTANCE;
        }
    }

    public static final class o00oO0o extends Lambda implements Function1<Context, View> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<View> f49726OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oO0o(MutableState<View> mutableState) {
            super(1);
            this.f49726OooO0Oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final View invoke(Context context) {
            Context it = context;
            Intrinsics.checkNotNullParameter(it, "it");
            View view = new View(it);
            MutableState<View> mutableState = this.f49726OooO0Oo;
            mutableState.setValue(view);
            View value = mutableState.getValue();
            Intrinsics.checkNotNull(value);
            return value;
        }
    }

    public static final class o0O0O00 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ p495o0o00Oo.OooOO0 f49727OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f49728OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0O0O00(p495o0o00Oo.OooOO0 oooOO1, int i) {
            super(2);
            this.f49727OooO0Oo = oooOO1;
            this.f49728OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f49728OooO0o0 | 1);
            o0000O0.OooO(this.f49727OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o0OO00O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0OO00O f49729OooO0Oo = new o0OO00O();

        public o0OO00O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            boolean zAreEqual;
            if (MixedRoomDataSource.OooO0o0().f22992OooO0o0 != null) {
                RoomLiveService roomLiveService = RoomLiveService.f24596OooOo00;
                if (roomLiveService != null) {
                    RoomLoginInformation.RoomBean room = MixedRoomDataSource.OooO0o0().f22992OooO0o0.getRoom();
                    Intrinsics.checkNotNull(room);
                    zAreEqual = Intrinsics.areEqual(roomLiveService.OooO0OO(room.getId()), Boolean.TRUE);
                } else {
                    zAreEqual = false;
                }
                if (zAreEqual) {
                    o0000oo o0000ooVar = com.yalla.yalla.service.room.OooO00o.f24517OooO0oO;
                    boolean z = !o0000ooVar.f48577OooO0O0.getValue().booleanValue();
                    if (z) {
                        o0oo0000.OooO00o.OooO0O0("102057");
                    } else {
                        o0oo0000.OooO00o.OooO0O0("102058");
                    }
                    o0000O00.OooO0OO("麦变更", "switchMuteMike muteMike " + z);
                    o0000ooVar.f48577OooO0O0.setValue(Boolean.valueOf(z));
                } else {
                    o0000O00.OooO00o(102, "RoomBottomDefaultComp", "switchMuteMike: 语音未登录房间切换静麦被取消", null);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.room.live.bottom.RoomBottomDefaultCompKt$MessageCompose$2$4$1", f = "RoomBottomDefaultComp.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o0OOO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ State<Boolean> f49730OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<TipsBubbleView> f49731OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<View> f49732OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OOO0o(State<Boolean> state, MutableState<View> mutableState, MutableState<TipsBubbleView> mutableState2, Continuation<? super o0OOO0o> continuation) {
            super(2, continuation);
            this.f49730OooO0Oo = state;
            this.f49732OooO0o0 = mutableState;
            this.f49731OooO0o = mutableState2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new o0OOO0o(this.f49730OooO0Oo, this.f49732OooO0o0, this.f49731OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((o0OOO0o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            View triangleView;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            boolean zBooleanValue = this.f49730OooO0Oo.getValue().booleanValue();
            View value = this.f49732OooO0o0.getValue();
            TipsBubbleView value2 = this.f49731OooO0o.getValue();
            if (value != null && value2 != null && (triangleView = value2.getTriangleView()) != null) {
                float width = value.getWidth() / 2.0f;
                if (p595o0oo00O.OooOo00.OooO0o0()) {
                    if (zBooleanValue) {
                        width += com.code.android.util.o0000O0.OooO00o(77);
                    }
                    width = -width;
                } else if (zBooleanValue) {
                    width += com.code.android.util.o0000O0.OooO00o(77);
                }
                triangleView.setTranslationX(width);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o0Oo0oo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f49733OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0Oo0oo(int i) {
            super(2);
            this.f49733OooO0Oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o0000O0.OooO0oO(composer, RecomposeScopeImplKt.updateChangedFlags(this.f49733OooO0Oo | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class o0OoOo0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f49734OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OoOo0(int i) {
            super(2);
            this.f49734OooO0Oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o0000O0.OooO0o0(composer, RecomposeScopeImplKt.updateChangedFlags(this.f49734OooO0Oo | 1));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.room.live.bottom.RoomBottomDefaultCompKt$MessageCompose$2$3", f = "RoomBottomDefaultComp.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o0ooOOo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MixedRoomActivity f49735OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<TipsBubbleView> f49736OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<View> f49737OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0ooOOo(MixedRoomActivity mixedRoomActivity, MutableState<View> mutableState, MutableState<TipsBubbleView> mutableState2, Continuation<? super o0ooOOo> continuation) {
            super(2, continuation);
            this.f49735OooO0Oo = mixedRoomActivity;
            this.f49737OooO0o0 = mutableState;
            this.f49736OooO0o = mutableState2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new o0ooOOo(this.f49735OooO0Oo, this.f49737OooO0o0, this.f49736OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((o0ooOOo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            TipsBubbleView tipsBubbleView;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            MixedRoomActivity mixedRoomActivity = this.f49735OooO0Oo;
            if (mixedRoomActivity != null) {
                MutableState<View> mutableState = this.f49737OooO0o0;
                if (mutableState.getValue() != null) {
                    View value = mutableState.getValue();
                    Intrinsics.checkNotNull(value);
                    ViewGroup viewGroup = (ViewGroup) mixedRoomActivity.findViewById(p562o0oOo000.o0OO00O.v_room_root);
                    if (viewGroup.findViewWithTag("room_chat_tips") != null) {
                        tipsBubbleView = null;
                    } else {
                        String strOooO0OO = o0000.OooO0OO(p562o0oOo000.o000000.tips_room_message_hello);
                        TipsBubbleView tipsBubbleView2 = new TipsBubbleView(viewGroup.getContext());
                        tipsBubbleView2.setTag("room_chat_tips");
                        viewGroup.addView(tipsBubbleView2, -2, -2);
                        tipsBubbleView2.setTriangleGravity(8388659);
                        tipsBubbleView2.setContent(strOooO0OO);
                        tipsBubbleView2.setAnchorView(value);
                        tipsBubbleView2.setRootView(viewGroup);
                        tipsBubbleView2.OooO00o(true);
                        tipsBubbleView = tipsBubbleView2;
                    }
                    if (tipsBubbleView != null) {
                        tipsBubbleView.setDismissListener(new o000O000(mixedRoomActivity, tipsBubbleView));
                    }
                    this.f49736OooO0o.setValue(tipsBubbleView);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class oo000o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MixedRoomActivity f49738OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<TipsBubbleView> f49739OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public oo000o(MutableState mutableState, MixedRoomActivity mixedRoomActivity) {
            super(0);
            this.f49738OooO0Oo = mixedRoomActivity;
            this.f49739OooO0o0 = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            MixedRoomActivity mixedRoomActivity = this.f49738OooO0Oo;
            if (mixedRoomActivity != null) {
                MutableState<TipsBubbleView> mutableState = this.f49739OooO0o0;
                o0000O0.OooOO0O(mixedRoomActivity, mutableState.getValue());
                mutableState.setValue(null);
            }
            o0000OO0 onLogin = new o0000OO0(mixedRoomActivity);
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
            } else {
                Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                if (activityOooO0O0 != null) {
                    int i = LoginActivity.f24727OooOo0O;
                    LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class oo0o0Oo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f49740OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public oo0o0Oo(int i) {
            super(2);
            this.f49740OooO0Oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o0000O0.OooO0oo(composer, RecomposeScopeImplKt.updateChangedFlags(this.f49740OooO0Oo | 1));
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO(@NotNull p495o0o00Oo.OooOO0 dataMedium, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(dataMedium, "dataMedium");
        Composer composerStartRestartGroup = composer.startRestartGroup(1146213151);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1146213151, i, -1, "com.yalla.yalla.ui.activity.room.live.bottom.RoomBottomDefaultComp (RoomBottomDefaultComp.kt:70)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierM511height3ABfNKs = androidx.compose.foundation.layout.SizeKt.m511height3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(58));
        Alignment.Companion companion2 = Alignment.INSTANCE;
        Alignment.Vertical centerVertically = companion2.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        Arrangement arrangement = Arrangement.INSTANCE;
        MeasurePolicy measurePolicyOooO0O0 = androidx.compose.material.OooO0OO.OooO0O0(arrangement, centerVertically, composerStartRestartGroup, 48, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM511height3ABfNKs);
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
        Modifier modifierOooO00o = androidx.compose.foundation.layout.OooOO0O.OooO00o(RowScopeInstance.INSTANCE, companion, 1.0f, false, 2, null);
        Alignment.Vertical centerVertically2 = companion2.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyOooO0O1 = androidx.compose.material.OooO0OO.OooO0O0(arrangement, centerVertically2, composerStartRestartGroup, 48, -1323940314);
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
        OooOO0(composerStartRestartGroup, 0);
        OooO0oo(composerStartRestartGroup, 0);
        OooO0Oo(composerStartRestartGroup, 0);
        OooO0oO(composerStartRestartGroup, 0);
        OooO0o(dataMedium.f49625OooO00o, composerStartRestartGroup, 8);
        OooO00o(composerStartRestartGroup, 0);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        o000OOo0.f49811OooO00o.OooO00o(composerStartRestartGroup, 6);
        OooO0o0(composerStartRestartGroup, 0);
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
        scopeUpdateScopeEndRestartGroup.updateScope(new o0O0O00(dataMedium, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(896009061);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(896009061, i, -1, "com.yalla.yalla.ui.activity.room.live.bottom.ApplyMicCompose (RoomBottomDefaultComp.kt:309)");
            }
            o0000oo o0000ooVar = com.yalla.yalla.service.room.OooO00o.f24517OooO0oO;
            if (!o0000ooVar.OooOO0()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(i));
                return;
            }
            State stateObserveAsState = LiveDataAdapterKt.observeAsState(com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO.OooO00o().f24546OooOO0o, composerStartRestartGroup, 8);
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState = (MutableState) objRememberedValue;
            Integer num = (Integer) stateObserveAsState.getValue();
            composerStartRestartGroup.startReplaceableGroup(511388516);
            boolean zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(stateObserveAsState);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new OooO0O0(mutableState, stateObserveAsState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(num, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 64);
            State stateCollectAsState = SnapshotStateKt.collectAsState(o0000ooVar.f48576OooO00o, null, composerStartRestartGroup, 8, 1);
            if (!((Boolean) mutableState.getValue()).booleanValue() && ((Boolean) stateCollectAsState.getValue()).booleanValue()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup2 == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup2.updateScope(new OooO0OO(i));
                return;
            }
            com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(8), null, composerStartRestartGroup, 6, 2);
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new OooO(mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Function0 function0 = (Function0) objRememberedValue3;
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                composerStartRestartGroup.startReplaceableGroup(305537852);
                if (!(!StringsKt.isBlank((String) o0000ooVar.f48595OooOo00.getValue())) || o0000ooVar.OooO0oO() <= 0) {
                    composerStartRestartGroup.startReplaceableGroup(305538008);
                    OooO0OO(function0, composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(305537950);
                    OooO0O0(function0, composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceableGroup();
                }
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(305538071);
                if (!((Boolean) stateCollectAsState.getValue()).booleanValue()) {
                    OooO0OO(function0, composerStartRestartGroup, 6);
                }
                composerStartRestartGroup.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup3 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup3 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup3.updateScope(new OooO0o(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0O0(Function0<Unit> function0, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(929856394);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(929856394, i2, -1, "com.yalla.yalla.ui.activity.room.live.bottom.ApplyMicNewUserInfo (RoomBottomDefaultComp.kt:365)");
            }
            p121o00O0Ooo.o0000 o0000VarOooO0O0 = o000OO.OooO0O0((String) com.yalla.yalla.service.room.OooO00o.f24517OooO0oO.f48595OooOo00.getValue(), null, composerStartRestartGroup, 0, 1);
            Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(androidx.compose.foundation.layout.SizeKt.m525size3ABfNKs(Modifier.INSTANCE, Dp.m3775constructorimpl(36)), OooOO0.f49708OooO0Oo);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(function0);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new OooOO0O(function0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            ImageKt.Image(o0000VarOooO0O0, (String) null, ClipKt.clip(PaddingKt.m478padding3ABfNKs(BorderKt.m184borderziNgDLE(DrawModifierKt.drawWithContent(com.code.android.util.o0O0O00.OooO0O0(modifierOnGloballyPositioned, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), OooOOO0.f49712OooO0Oo), Dp.m3775constructorimpl(1), Brush.Companion.m1644verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m1671boximpl(o0OOo000.f48185Ooooo00), Color.m1671boximpl(o0OOo000.f48350o00o0O)}), 0.0f, 0.0f, 0, 14, (Object) null), RoundedCornerShapeKt.getCircleShape()), Dp.m3775constructorimpl(3)), RoundedCornerShapeKt.getCircleShape()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 48, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO(i, function0));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0OO(Function0<Unit> function0, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(2015154807);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2015154807, i2, -1, "com.yalla.yalla.ui.activity.room.live.bottom.ApplyMicRaiseHands (RoomBottomDefaultComp.kt:420)");
            }
            Painter painterPainterResource = PainterResources_androidKt.painterResource(p562o0oOo000.o0O0O00.icon_room_bottom_hand, composerStartRestartGroup, 0);
            Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(ComposedModifierKt.composed$default(Modifier.INSTANCE, null, new o000(true), 1, null), OooOOOO.f49713OooO0Oo);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(function0);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new OooOo00(function0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            IconKt.m1119Iconww6aTOc(painterPainterResource, (String) null, com.code.android.util.o0O0O00.OooO0O0(modifierOnGloballyPositioned, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), com.yalla.yalla.service.room.OooO00o.f24517OooO0oO.OooOO0O() ? o0OOo000.f48185Ooooo00 : o0OOo000.f48135OooO0O0, composerStartRestartGroup, 56, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOo(i, function0));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0Oo(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-2125895274);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2125895274, i, -1, "com.yalla.yalla.ui.activity.room.live.bottom.EmojiCompose (RoomBottomDefaultComp.kt:137)");
            }
            if (((Boolean) SnapshotStateKt.collectAsState(com.yalla.yalla.service.room.OooO00o.f24517OooO0oO.f48576OooO00o, null, composerStartRestartGroup, 8, 1).getValue()).booleanValue()) {
                Object objConsume = composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                FragmentActivity fragmentActivity = objConsume instanceof FragmentActivity ? (FragmentActivity) objConsume : null;
                com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(8), null, composerStartRestartGroup, 6, 2);
                ImageKt.Image(PainterResources_androidKt.painterResource(p562o0oOo000.o0O0O00.room_activity_mic_emoji, composerStartRestartGroup, 0), (String) null, com.code.android.util.o0O0O00.OooO0O0(ComposedModifierKt.composed$default(Modifier.INSTANCE, null, new o000(true), 1, null), false, false, 0L, false, null, null, null, new Oooo000(fragmentActivity), 253), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Oooo0(i));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x005c  */
    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0o(MutableLiveData<Pair<Integer, Integer>> mutableLiveData, Composer composer, int i) {
        boolean z;
        Modifier modifierOooO00o;
        Composer composerStartRestartGroup = composer.startRestartGroup(-866880703);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-866880703, i, -1, "com.yalla.yalla.ui.activity.room.live.bottom.MenuCompose (RoomBottomDefaultComp.kt:244)");
        }
        com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(8), null, composerStartRestartGroup, 6, 2);
        boolean zBooleanValue = ((Boolean) com.yalla.yalla.service.room.OooO00o.f24529OooOo0.f48500OooO00o.getValue()).booleanValue();
        composerStartRestartGroup.startReplaceableGroup(2033672659);
        composerStartRestartGroup.startReplaceableGroup(2033672663);
        if (zBooleanValue) {
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            if (Intrinsics.areEqual(LiveDataAdapterKt.observeAsState(o0O00oO0.OooOo0O(), composerStartRestartGroup, 8).getValue(), Boolean.TRUE)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        composerStartRestartGroup.endReplaceableGroup();
        if (z) {
            Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(Modifier.INSTANCE, new o00Ooo(mutableLiveData));
            float fM3775constructorimpl = Dp.m3775constructorimpl(22);
            long j = o0OOo000.f48186Ooooo0o;
            float f = 2;
            modifierOooO00o = ZIndexModifierKt.zIndex(com.code.android.util.o0O0O00.OooO00o(com.code.android.util.o0O0O00.OooO00o(modifierOnGloballyPositioned, fM3775constructorimpl, Color.m1671boximpl(j), null, Dp.m3773boximpl(Dp.m3775constructorimpl(f)), 20), Dp.m3775constructorimpl(27), Color.m1671boximpl(Color.m1680copywmQWz5c$default(j, 0.5f, 0.0f, 0.0f, 0.0f, 14, null)), null, Dp.m3773boximpl(Dp.m3775constructorimpl(f)), 20), 1.0f);
        } else {
            composerStartRestartGroup.startReplaceableGroup(2033673401);
            Integer num = (Integer) LiveDataAdapterKt.observeAsState(com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO.OooO00o().f24546OooOO0o, composerStartRestartGroup, 8).getValue();
            boolean z2 = num != null && num.intValue() == 1;
            composerStartRestartGroup.endReplaceableGroup();
            if (z2) {
                boolean zOooO0oo = com.yalla.yalla.service.room.OooO00o.f24517OooO0oO.OooO0oo();
                p483o0o000Oo.o000000 o000000Var = com.yalla.yalla.service.room.OooO00o.f24516OooO0o0;
                modifierOooO00o = o0000Ooo.OooO00o(Modifier.INSTANCE, zOooO0oo || (o000000Var.OooO0o() > 0) || ((Boolean) o000000Var.f48467OooOO0.getValue()).booleanValue() || ((Boolean) com.yalla.yalla.service.room.OooO00o.f24518OooO0oo.f48485OooO00o.getValue()).booleanValue() || ((Boolean) o000000Var.f48462OooO0Oo.getValue()).booleanValue(), 0L, Dp.m3775constructorimpl(3), false, false, Dp.m3775constructorimpl(28), Dp.m3775constructorimpl(0), 0.0f, 826);
            } else {
                modifierOooO00o = Modifier.INSTANCE;
            }
        }
        composerStartRestartGroup.endReplaceableGroup();
        ImageKt.Image(PainterResources_androidKt.painterResource(p562o0oOo000.o0O0O00.icon_room_bottom_menu, composerStartRestartGroup, 0), (String) null, com.code.android.util.o0O0O00.OooO0O0(ComposedModifierKt.composed$default(Modifier.INSTANCE.then(modifierOooO00o), null, new o000(true), 1, null), false, false, 0L, false, null, null, null, o00O0O.f49722OooO0Oo, 253), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o00Oo0(i, mutableLiveData));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0o0(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1998960329);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1998960329, i, -1, "com.yalla.yalla.ui.activity.room.live.bottom.GameBoxCompose (RoomBottomDefaultComp.kt:448)");
            }
            Object objConsume = composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            ImageKt.Image(PainterResources_androidKt.painterResource(p562o0oOo000.o0Oo0oo.icon_room_bottom_game_box, composerStartRestartGroup, 0), (String) null, com.code.android.util.o0O0O00.OooO0O0(androidx.compose.foundation.layout.SizeKt.m525size3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, Dp.m3775constructorimpl(8), 0.0f, 11, null), Dp.m3775constructorimpl(35)), false, false, 0L, false, null, null, null, new o000oOoO(objConsume instanceof MixedRoomActivity ? (MixedRoomActivity) objConsume : null), 253), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o0OoOo0(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0oO(Composer composer, int i) {
        Composer composer2;
        Composer composer3;
        Composer composerStartRestartGroup = composer.startRestartGroup(141338967);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer3 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(141338967, i, -1, "com.yalla.yalla.ui.activity.room.live.bottom.MessageCompose (RoomBottomDefaultComp.kt:162)");
            }
            Object objConsume = composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            MixedRoomActivity mixedRoomActivity = objConsume instanceof MixedRoomActivity ? (MixedRoomActivity) objConsume : null;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState = (MutableState) objRememberedValue;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState2 = (MutableState) objRememberedValue2;
            com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(8), null, composerStartRestartGroup, 6, 2);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            float f = 35;
            Modifier modifierOooO0O0 = com.code.android.util.o0O0O00.OooO0O0(AnimationModifierKt.animateContentSize$default(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(androidx.compose.foundation.layout.SizeKt.m511height3ABfNKs(companion2, Dp.m3775constructorimpl(f)), RoundedCornerShapeKt.getCircleShape()), o0OOo000.f48152OooOo, null, 2, null), null, null, 3, null), false, false, 0L, false, null, null, null, new oo000o(mutableState2, mixedRoomActivity), 253);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO00o = androidx.compose.animation.Oooo000.OooO00o(companion3, false, composerStartRestartGroup, 0, -1323940314);
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
            Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion4, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierFillMaxHeight$default = androidx.compose.foundation.layout.SizeKt.fillMaxHeight$default(companion2, 0.0f, 1, null);
            Alignment.Vertical centerVertically = companion3.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO0O0 = androidx.compose.material.OooO0OO.OooO0O0(Arrangement.INSTANCE, centerVertically, composerStartRestartGroup, 48, -1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxHeight$default);
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
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(p562o0oOo000.o0O0O00.icon_room_bottom_message, composerStartRestartGroup, 0), (String) null, ComposedModifierKt.composed$default(companion2, null, new o000(false), 1, null), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
            o0000oo o0000ooVar = com.yalla.yalla.service.room.OooO00o.f24517OooO0oO;
            State stateCollectAsState = SnapshotStateKt.collectAsState(o0000ooVar.f48576OooO00o, null, composerStartRestartGroup, 8, 1);
            composerStartRestartGroup.startReplaceableGroup(-1621971921);
            if (((Boolean) stateCollectAsState.getValue()).booleanValue()) {
                composer2 = composerStartRestartGroup;
            } else {
                composer2 = composerStartRestartGroup;
                TextKt.m1261Text4IGK_g(StringResources_androidKt.stringResource(p562o0oOo000.o000000.Type, composerStartRestartGroup, 0), androidx.compose.foundation.layout.SizeKt.m530width3ABfNKs(companion2, Dp.m3775constructorimpl(88)), o0OOo000.f48135OooO0O0, TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composer2, 3120, 3072, 57328);
            }
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer3 = composer2;
            composer3.startReplaceableGroup(2142429004);
            if (Intrinsics.areEqual(LiveDataAdapterKt.observeAsState((MutableLiveData) com.yalla.yalla.service.room.OooO00o.f24526OooOOo.f48645OooO0OO.getValue(), composer3, 8).getValue(), Boolean.TRUE)) {
                State stateCollectAsState2 = SnapshotStateKt.collectAsState(o0000ooVar.f48576OooO00o, null, composer3, 8, 1);
                Modifier modifierM530width3ABfNKs = androidx.compose.foundation.layout.SizeKt.m530width3ABfNKs(companion2, ((Boolean) stateCollectAsState2.getValue()).booleanValue() ? Dp.m3775constructorimpl(f) : Dp.m3775constructorimpl(119));
                composer3.startReplaceableGroup(1157296644);
                boolean zChanged = composer3.changed(mutableState);
                Object objRememberedValue3 = composer3.rememberedValue();
                if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new o00oO0o(mutableState);
                    composer3.updateRememberedValue(objRememberedValue3);
                }
                composer3.endReplaceableGroup();
                AndroidView_androidKt.AndroidView((Function1) objRememberedValue3, modifierM530width3ABfNKs, null, composer3, 0, 4);
                EffectsKt.LaunchedEffect(Unit.INSTANCE, new o0ooOOo(mixedRoomActivity, mutableState, mutableState2, null), composer3, 70);
                Boolean boolValueOf = Boolean.valueOf(((Boolean) stateCollectAsState2.getValue()).booleanValue());
                composer3.startReplaceableGroup(1618982084);
                boolean zChanged2 = composer3.changed(stateCollectAsState2) | composer3.changed(mutableState) | composer3.changed(mutableState2);
                Object objRememberedValue4 = composer3.rememberedValue();
                if (zChanged2 || objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new o0OOO0o(stateCollectAsState2, mutableState, mutableState2, null);
                    composer3.updateRememberedValue(objRememberedValue4);
                }
                composer3.endReplaceableGroup();
                EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composer3, 64);
            }
            if (androidx.compose.animation.OooOo.OooO00o(composer3)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o0Oo0oo(i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0oo(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1229092713);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1229092713, i, -1, "com.yalla.yalla.ui.activity.room.live.bottom.MicCompose (RoomBottomDefaultComp.kt:116)");
            }
            o0000oo o0000ooVar = com.yalla.yalla.service.room.OooO00o.f24517OooO0oO;
            if (((Boolean) SnapshotStateKt.collectAsState(o0000ooVar.f48576OooO00o, null, composerStartRestartGroup, 8, 1).getValue()).booleanValue()) {
                com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(8), null, composerStartRestartGroup, 6, 2);
                ImageKt.Image(PainterResources_androidKt.painterResource(((Boolean) SnapshotStateKt.collectAsState(o0000ooVar.f48577OooO0O0, null, composerStartRestartGroup, 8, 1).getValue()).booleanValue() ? p562o0oOo000.o0O0O00.icon_room_bottom_mic_off : p562o0oOo000.o0O0O00.icon_room_bottom_mic_on, composerStartRestartGroup, 0), (String) null, com.code.android.util.o0O0O00.OooO0O0(ComposedModifierKt.composed$default(Modifier.INSTANCE, null, new o000(true), 1, null), false, false, 0L, false, null, null, null, o0OO00O.f49729OooO0Oo, 253), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new oo0o0Oo(i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooOO0(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1835052321);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1835052321, i, -1, "com.yalla.yalla.ui.activity.room.live.bottom.SoundCompose (RoomBottomDefaultComp.kt:98)");
            }
            com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(8), null, composerStartRestartGroup, 6, 2);
            ImageKt.Image(PainterResources_androidKt.painterResource(((Boolean) SnapshotStateKt.collectAsState(com.yalla.yalla.service.room.OooO00o.f24517OooO0oO.f48578OooO0OO, null, composerStartRestartGroup, 8, 1).getValue()).booleanValue() ? p562o0oOo000.o0O0O00.icon_room_bottom_sound_off : p562o0oOo000.o0O0O00.icon_room_bottom_sound_on, composerStartRestartGroup, 0), (String) null, com.code.android.util.o0O0O00.OooO0O0(ComposedModifierKt.composed$default(Modifier.INSTANCE, null, new o000(true), 1, null), false, false, 0L, false, null, null, null, o000OOo.f49720OooO0Oo, 253), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o000000(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void OooOO0O(MixedRoomActivity mixedRoomActivity, TipsBubbleView tipsBubbleView) {
        View viewFindViewWithTag;
        if (tipsBubbleView == null || !o000O.OooO0o0(tipsBubbleView)) {
            return;
        }
        ((MutableLiveData) com.yalla.yalla.service.room.OooO00o.f24526OooOOo.f48645OooO0OO.getValue()).setValue(Boolean.FALSE);
        oO0OOo0o oo0ooo0oOooO0o0 = p415o0Oo0oO0.o00Ooo.OooO0o0();
        oo0ooo0oOooO0o0.getClass();
        o0000O0O.OooO0O0("roomChat", o0O00oO0.OooOOo0().getValue(), oo0ooo0oOooO0o0, false);
        ViewGroup viewGroup = (ViewGroup) mixedRoomActivity.findViewById(p562o0oOo000.o0OO00O.v_room_root);
        if (viewGroup == null || (viewFindViewWithTag = viewGroup.findViewWithTag("room_chat_tips")) == null) {
            return;
        }
        viewGroup.removeView(viewFindViewWithTag);
    }
}
