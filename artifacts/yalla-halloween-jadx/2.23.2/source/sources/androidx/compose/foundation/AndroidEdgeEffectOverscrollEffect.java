package androidx.compose.foundation;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.EdgeEffect;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010-\u001a\u00020!H\u0002JE\u0010.\u001a\u00020!2\u0006\u0010/\u001a\u0002002\"\u00101\u001a\u001e\b\u0001\u0012\u0004\u0012\u000200\u0012\n\u0012\b\u0012\u0004\u0012\u00020003\u0012\u0006\u0012\u0004\u0018\u00010402H\u0096@ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b5\u00106J9\u00107\u001a\u00020%2\u0006\u00108\u001a\u00020%2\u0006\u00109\u001a\u00020:2\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020%0\u001fH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b<\u0010=J\b\u0010>\u001a\u00020!H\u0002J%\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020%2\u0006\u0010B\u001a\u00020%H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bC\u0010DJ%\u0010E\u001a\u00020@2\u0006\u0010A\u001a\u00020%2\u0006\u0010B\u001a\u00020%H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bF\u0010DJ%\u0010G\u001a\u00020@2\u0006\u0010A\u001a\u00020%2\u0006\u0010B\u001a\u00020%H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bH\u0010DJ%\u0010I\u001a\u00020@2\u0006\u0010A\u001a\u00020%2\u0006\u0010B\u001a\u00020%H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bJ\u0010DJ\u001d\u0010K\u001a\u00020\u00142\u0006\u00108\u001a\u00020%H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bL\u0010MJ\b\u0010N\u001a\u00020\u0014H\u0002J \u0010O\u001a\u00020\u0014*\u00020P2\u0006\u0010Q\u001a\u00020\t2\n\u0010R\u001a\u00060Sj\u0002`TH\u0002J \u0010U\u001a\u00020\u0014*\u00020P2\u0006\u0010V\u001a\u00020\t2\n\u0010R\u001a\u00060Sj\u0002`TH\u0002J\n\u0010W\u001a\u00020!*\u00020PJ \u0010X\u001a\u00020\u0014*\u00020P2\u0006\u0010Y\u001a\u00020\t2\n\u0010R\u001a\u00060Sj\u0002`TH\u0002J \u0010Z\u001a\u00020\u0014*\u00020P2\u0006\u0010[\u001a\u00020\t2\n\u0010R\u001a\u00060Sj\u0002`TH\u0002R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\f\u001a\u00020\rX\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R$\u0010\u0013\u001a\u00020\u00148\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0018R\u000e\u0010\u001c\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001fX\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0002\n\u0000R\u0019\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020!0'X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\\"}, d2 = {"Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;", "Landroidx/compose/foundation/OverscrollEffect;", "context", "Landroid/content/Context;", "overscrollConfig", "Landroidx/compose/foundation/OverscrollConfiguration;", "(Landroid/content/Context;Landroidx/compose/foundation/OverscrollConfiguration;)V", "allEffects", "", "Landroid/widget/EdgeEffect;", "bottomEffect", "bottomEffectNegation", "containerSize", "Landroidx/compose/ui/geometry/Size;", "J", "effectModifier", "Landroidx/compose/ui/Modifier;", "getEffectModifier", "()Landroidx/compose/ui/Modifier;", "invalidationEnabled", "", "getInvalidationEnabled$foundation_release$annotations", "()V", "getInvalidationEnabled$foundation_release", "()Z", "setInvalidationEnabled$foundation_release", "(Z)V", "isInProgress", "leftEffect", "leftEffectNegation", "onNewSize", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/IntSize;", "", "pointerId", "Landroidx/compose/ui/input/pointer/PointerId;", "pointerPosition", "Landroidx/compose/ui/geometry/Offset;", "redrawSignal", "Landroidx/compose/runtime/MutableState;", "rightEffect", "rightEffectNegation", "scrollCycleInProgress", "topEffect", "topEffectNegation", "animateToRelease", "applyToFling", "velocity", "Landroidx/compose/ui/unit/Velocity;", "performFling", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "applyToFling-BMRW4eQ", "(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "applyToScroll", "delta", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "performScroll", "applyToScroll-Rhakbz0", "(JILkotlin/jvm/functions/Function1;)J", "invalidateOverscroll", "pullBottom", "", "scroll", "displacement", "pullBottom-0a9Yr6o", "(JJ)F", "pullLeft", "pullLeft-0a9Yr6o", "pullRight", "pullRight-0a9Yr6o", "pullTop", "pullTop-0a9Yr6o", "releaseOppositeOverscroll", "releaseOppositeOverscroll-k-4lQ0M", "(J)Z", "stopOverscrollAnimation", "drawBottom", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "bottom", "canvas", "Landroid/graphics/Canvas;", "Landroidx/compose/ui/graphics/NativeCanvas;", "drawLeft", ViewHierarchyConstants.DIMENSION_LEFT_KEY, "drawOverscroll", "drawRight", "right", "drawTop", ViewHierarchyConstants.DIMENSION_TOP_KEY, "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAndroidOverscroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidOverscroll.kt\nandroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 4 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,589:1\n33#2,6:590\n101#2,2:597\n33#2,6:599\n103#2:605\n33#2,6:607\n135#3:596\n245#4:606\n*S KotlinDebug\n*F\n+ 1 AndroidOverscroll.kt\nandroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect\n*L\n123#1:590,6\n266#1:597,2\n266#1:599,6\n266#1:605\n445#1:607,6\n341#1:596\n351#1:606\n*E\n"})
public final class AndroidEdgeEffectOverscrollEffect implements OverscrollEffect {

    @NotNull
    private final List<EdgeEffect> allEffects;

    @NotNull
    private final EdgeEffect bottomEffect;

    @NotNull
    private final EdgeEffect bottomEffectNegation;
    private long containerSize;

    @NotNull
    private final Modifier effectModifier;
    private boolean invalidationEnabled;

    @NotNull
    private final EdgeEffect leftEffect;

    @NotNull
    private final EdgeEffect leftEffectNegation;

    @NotNull
    private final Function1<IntSize, Unit> onNewSize;

    @NotNull
    private final OverscrollConfiguration overscrollConfig;

    @Nullable
    private PointerId pointerId;

    @Nullable
    private Offset pointerPosition;

    @NotNull
    private final MutableState<Unit> redrawSignal;

    @NotNull
    private final EdgeEffect rightEffect;

    @NotNull
    private final EdgeEffect rightEffectNegation;
    private boolean scrollCycleInProgress;

    @NotNull
    private final EdgeEffect topEffect;

    @NotNull
    private final EdgeEffect topEffectNegation;

    public AndroidEdgeEffectOverscrollEffect(@NotNull Context context, @NotNull OverscrollConfiguration overscrollConfig) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(overscrollConfig, "overscrollConfig");
        this.overscrollConfig = overscrollConfig;
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        EdgeEffect edgeEffectCreate = edgeEffectCompat.create(context, null);
        this.topEffect = edgeEffectCreate;
        EdgeEffect edgeEffectCreate2 = edgeEffectCompat.create(context, null);
        this.bottomEffect = edgeEffectCreate2;
        EdgeEffect edgeEffectCreate3 = edgeEffectCompat.create(context, null);
        this.leftEffect = edgeEffectCreate3;
        EdgeEffect edgeEffectCreate4 = edgeEffectCompat.create(context, null);
        this.rightEffect = edgeEffectCreate4;
        List<EdgeEffect> listListOf = CollectionsKt.listOf((Object[]) new EdgeEffect[]{edgeEffectCreate3, edgeEffectCreate, edgeEffectCreate4, edgeEffectCreate2});
        this.allEffects = listListOf;
        this.topEffectNegation = edgeEffectCompat.create(context, null);
        this.bottomEffectNegation = edgeEffectCompat.create(context, null);
        this.leftEffectNegation = edgeEffectCompat.create(context, null);
        this.rightEffectNegation = edgeEffectCompat.create(context, null);
        int size = listListOf.size();
        for (int i = 0; i < size; i++) {
            listListOf.get(i).setColor(ColorKt.m1735toArgb8_81llA(this.overscrollConfig.getGlowColor()));
        }
        Unit unit = Unit.INSTANCE;
        this.redrawSignal = SnapshotStateKt.mutableStateOf(unit, SnapshotStateKt.neverEqualPolicy());
        this.invalidationEnabled = true;
        this.containerSize = Size.INSTANCE.m1525getZeroNHjbRc();
        Function1<IntSize, Unit> function1 = new Function1<IntSize, Unit>() { // from class: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$onNewSize$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                m167invokeozmzZPI(intSize.getPackedValue());
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke-ozmzZPI, reason: not valid java name */
            public final void m167invokeozmzZPI(long j) {
                boolean z = !Size.m1512equalsimpl0(IntSizeKt.m3945toSizeozmzZPI(j), this.this$0.containerSize);
                this.this$0.containerSize = IntSizeKt.m3945toSizeozmzZPI(j);
                if (z) {
                    this.this$0.topEffect.setSize(IntSize.m3935getWidthimpl(j), IntSize.m3934getHeightimpl(j));
                    this.this$0.bottomEffect.setSize(IntSize.m3935getWidthimpl(j), IntSize.m3934getHeightimpl(j));
                    this.this$0.leftEffect.setSize(IntSize.m3934getHeightimpl(j), IntSize.m3935getWidthimpl(j));
                    this.this$0.rightEffect.setSize(IntSize.m3934getHeightimpl(j), IntSize.m3935getWidthimpl(j));
                    this.this$0.topEffectNegation.setSize(IntSize.m3935getWidthimpl(j), IntSize.m3934getHeightimpl(j));
                    this.this$0.bottomEffectNegation.setSize(IntSize.m3935getWidthimpl(j), IntSize.m3934getHeightimpl(j));
                    this.this$0.leftEffectNegation.setSize(IntSize.m3934getHeightimpl(j), IntSize.m3935getWidthimpl(j));
                    this.this$0.rightEffectNegation.setSize(IntSize.m3934getHeightimpl(j), IntSize.m3935getWidthimpl(j));
                }
                if (z) {
                    this.this$0.invalidateOverscroll();
                    this.this$0.animateToRelease();
                }
            }
        };
        this.onNewSize = function1;
        this.effectModifier = OnRemeasuredModifierKt.onSizeChanged(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE.then(AndroidOverscrollKt.StretchOverscrollNonClippingLayer), unit, new AndroidEdgeEffectOverscrollEffect$effectModifier$1(this, null)), function1).then(new DrawOverscrollModifier(this, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$special$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("overscroll");
                inspectorInfo.setValue(this.this$0);
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void animateToRelease() {
        List<EdgeEffect> list = this.allEffects;
        int size = list.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            EdgeEffect edgeEffect = list.get(i);
            edgeEffect.onRelease();
            z = edgeEffect.isFinished() || z;
        }
        if (z) {
            invalidateOverscroll();
        }
    }

    private final boolean drawBottom(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(180.0f);
        canvas.translate(-Size.m1516getWidthimpl(this.containerSize), (-Size.m1513getHeightimpl(this.containerSize)) + drawScope.mo326toPx0680j_4(this.overscrollConfig.getDrawPadding().getBottom()));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    private final boolean drawLeft(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(270.0f);
        canvas.translate(-Size.m1513getHeightimpl(this.containerSize), drawScope.mo326toPx0680j_4(this.overscrollConfig.getDrawPadding().mo429calculateLeftPaddingu2uoSUM(drawScope.getLayoutDirection())));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    private final boolean drawRight(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        int iRoundToInt = MathKt.roundToInt(Size.m1516getWidthimpl(this.containerSize));
        float fMo430calculateRightPaddingu2uoSUM = this.overscrollConfig.getDrawPadding().mo430calculateRightPaddingu2uoSUM(drawScope.getLayoutDirection());
        canvas.rotate(90.0f);
        canvas.translate(0.0f, drawScope.mo326toPx0680j_4(fMo430calculateRightPaddingu2uoSUM) + (-iRoundToInt));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    private final boolean drawTop(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.translate(0.0f, drawScope.mo326toPx0680j_4(this.overscrollConfig.getDrawPadding().getTop()));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    @VisibleForTesting
    public static /* synthetic */ void getInvalidationEnabled$foundation_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invalidateOverscroll() {
        if (this.invalidationEnabled) {
            this.redrawSignal.setValue(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: pullBottom-0a9Yr6o, reason: not valid java name */
    private final float m160pullBottom0a9Yr6o(long scroll, long displacement) {
        float fM1447getXimpl = Offset.m1447getXimpl(displacement) / Size.m1516getWidthimpl(this.containerSize);
        float fM1448getYimpl = Offset.m1448getYimpl(scroll) / Size.m1513getHeightimpl(this.containerSize);
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        return !(edgeEffectCompat.getDistanceCompat(this.bottomEffect) == 0.0f) ? Offset.m1448getYimpl(scroll) : Size.m1513getHeightimpl(this.containerSize) * (-edgeEffectCompat.onPullDistanceCompat(this.bottomEffect, -fM1448getYimpl, 1 - fM1447getXimpl));
    }

    /* JADX INFO: renamed from: pullLeft-0a9Yr6o, reason: not valid java name */
    private final float m161pullLeft0a9Yr6o(long scroll, long displacement) {
        float fM1448getYimpl = Offset.m1448getYimpl(displacement) / Size.m1513getHeightimpl(this.containerSize);
        float fM1447getXimpl = Offset.m1447getXimpl(scroll) / Size.m1516getWidthimpl(this.containerSize);
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        return !(edgeEffectCompat.getDistanceCompat(this.leftEffect) == 0.0f) ? Offset.m1447getXimpl(scroll) : Size.m1516getWidthimpl(this.containerSize) * edgeEffectCompat.onPullDistanceCompat(this.leftEffect, fM1447getXimpl, 1 - fM1448getYimpl);
    }

    /* JADX INFO: renamed from: pullRight-0a9Yr6o, reason: not valid java name */
    private final float m162pullRight0a9Yr6o(long scroll, long displacement) {
        float fM1448getYimpl = Offset.m1448getYimpl(displacement) / Size.m1513getHeightimpl(this.containerSize);
        float fM1447getXimpl = Offset.m1447getXimpl(scroll) / Size.m1516getWidthimpl(this.containerSize);
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        return !((edgeEffectCompat.getDistanceCompat(this.rightEffect) > 0.0f ? 1 : (edgeEffectCompat.getDistanceCompat(this.rightEffect) == 0.0f ? 0 : -1)) == 0) ? Offset.m1447getXimpl(scroll) : Size.m1516getWidthimpl(this.containerSize) * (-edgeEffectCompat.onPullDistanceCompat(this.rightEffect, -fM1447getXimpl, fM1448getYimpl));
    }

    /* JADX INFO: renamed from: pullTop-0a9Yr6o, reason: not valid java name */
    private final float m163pullTop0a9Yr6o(long scroll, long displacement) {
        float fM1447getXimpl = Offset.m1447getXimpl(displacement) / Size.m1516getWidthimpl(this.containerSize);
        float fM1448getYimpl = Offset.m1448getYimpl(scroll) / Size.m1513getHeightimpl(this.containerSize);
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        return !((edgeEffectCompat.getDistanceCompat(this.topEffect) > 0.0f ? 1 : (edgeEffectCompat.getDistanceCompat(this.topEffect) == 0.0f ? 0 : -1)) == 0) ? Offset.m1448getYimpl(scroll) : Size.m1513getHeightimpl(this.containerSize) * edgeEffectCompat.onPullDistanceCompat(this.topEffect, fM1448getYimpl, fM1447getXimpl);
    }

    /* JADX INFO: renamed from: releaseOppositeOverscroll-k-4lQ0M, reason: not valid java name */
    private final boolean m164releaseOppositeOverscrollk4lQ0M(long delta) {
        boolean zIsFinished;
        if (this.leftEffect.isFinished() || Offset.m1447getXimpl(delta) >= 0.0f) {
            zIsFinished = false;
        } else {
            EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(this.leftEffect, Offset.m1447getXimpl(delta));
            zIsFinished = this.leftEffect.isFinished();
        }
        if (!this.rightEffect.isFinished() && Offset.m1447getXimpl(delta) > 0.0f) {
            EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(this.rightEffect, Offset.m1447getXimpl(delta));
            zIsFinished = zIsFinished || this.rightEffect.isFinished();
        }
        if (!this.topEffect.isFinished() && Offset.m1448getYimpl(delta) < 0.0f) {
            EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(this.topEffect, Offset.m1448getYimpl(delta));
            zIsFinished = zIsFinished || this.topEffect.isFinished();
        }
        if (this.bottomEffect.isFinished() || Offset.m1448getYimpl(delta) <= 0.0f) {
            return zIsFinished;
        }
        EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(this.bottomEffect, Offset.m1448getYimpl(delta));
        return zIsFinished || this.bottomEffect.isFinished();
    }

    private final boolean stopOverscrollAnimation() {
        boolean z;
        long jM1526getCenteruvyYCjk = SizeKt.m1526getCenteruvyYCjk(this.containerSize);
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        if (edgeEffectCompat.getDistanceCompat(this.leftEffect) == 0.0f) {
            z = false;
        } else {
            m161pullLeft0a9Yr6o(Offset.INSTANCE.m1463getZeroF1C5BW0(), jM1526getCenteruvyYCjk);
            z = true;
        }
        if (!(edgeEffectCompat.getDistanceCompat(this.rightEffect) == 0.0f)) {
            m162pullRight0a9Yr6o(Offset.INSTANCE.m1463getZeroF1C5BW0(), jM1526getCenteruvyYCjk);
            z = true;
        }
        if (!(edgeEffectCompat.getDistanceCompat(this.topEffect) == 0.0f)) {
            m163pullTop0a9Yr6o(Offset.INSTANCE.m1463getZeroF1C5BW0(), jM1526getCenteruvyYCjk);
            z = true;
        }
        if (edgeEffectCompat.getDistanceCompat(this.bottomEffect) == 0.0f) {
            return z;
        }
        m160pullBottom0a9Yr6o(Offset.INSTANCE.m1463getZeroF1C5BW0(), jM1526getCenteruvyYCjk);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0087  */
    /* JADX WARN: Code duplicated, block: B:33:0x008f  */
    /* JADX WARN: Code duplicated, block: B:35:0x009b  */
    /* JADX WARN: Code duplicated, block: B:36:0x009d  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00df  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:56:0x010a  */
    /* JADX WARN: Code duplicated, block: B:66:0x0148  */
    /* JADX WARN: Code duplicated, block: B:67:0x0158  */
    /* JADX WARN: Code duplicated, block: B:69:0x0160  */
    /* JADX WARN: Code duplicated, block: B:72:0x0178  */
    /* JADX WARN: Code duplicated, block: B:73:0x0188  */
    /* JADX WARN: Code duplicated, block: B:75:0x0190  */
    /* JADX WARN: Code duplicated, block: B:78:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.compose.foundation.OverscrollEffect
    @Nullable
    /* JADX INFO: renamed from: applyToFling-BMRW4eQ, reason: not valid java name */
    public Object mo165applyToFlingBMRW4eQ(long j, @NotNull Function2<? super Velocity, ? super Continuation<? super Velocity>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) {
        AndroidEdgeEffectOverscrollEffect$applyToFling$1 androidEdgeEffectOverscrollEffect$applyToFling$1;
        float fM4000getXimpl;
        EdgeEffectCompat edgeEffectCompat;
        boolean z;
        float fM4001getYimpl;
        EdgeEffectCompat edgeEffectCompat2;
        long jM4003minusAH228Gc;
        AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect;
        long jM4003minusAH228Gc2;
        if (continuation instanceof AndroidEdgeEffectOverscrollEffect$applyToFling$1) {
            androidEdgeEffectOverscrollEffect$applyToFling$1 = (AndroidEdgeEffectOverscrollEffect$applyToFling$1) continuation;
            int i = androidEdgeEffectOverscrollEffect$applyToFling$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                androidEdgeEffectOverscrollEffect$applyToFling$1.label = i - Integer.MIN_VALUE;
            } else {
                androidEdgeEffectOverscrollEffect$applyToFling$1 = new AndroidEdgeEffectOverscrollEffect$applyToFling$1(this, continuation);
            }
        } else {
            androidEdgeEffectOverscrollEffect$applyToFling$1 = new AndroidEdgeEffectOverscrollEffect$applyToFling$1(this, continuation);
        }
        Object objInvoke = androidEdgeEffectOverscrollEffect$applyToFling$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = androidEdgeEffectOverscrollEffect$applyToFling$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(objInvoke);
                return Unit.INSTANCE;
            }
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jM4003minusAH228Gc = androidEdgeEffectOverscrollEffect$applyToFling$1.J$0;
            androidEdgeEffectOverscrollEffect = (AndroidEdgeEffectOverscrollEffect) androidEdgeEffectOverscrollEffect$applyToFling$1.L$0;
            ResultKt.throwOnFailure(objInvoke);
            jM4003minusAH228Gc2 = Velocity.m4003minusAH228Gc(jM4003minusAH228Gc, ((Velocity) objInvoke).getPackedValue());
            androidEdgeEffectOverscrollEffect.scrollCycleInProgress = false;
            if (Velocity.m4000getXimpl(jM4003minusAH228Gc2) > 0.0f) {
                EdgeEffectCompat.INSTANCE.onAbsorbCompat(androidEdgeEffectOverscrollEffect.leftEffect, MathKt.roundToInt(Velocity.m4000getXimpl(jM4003minusAH228Gc2)));
            } else if (Velocity.m4000getXimpl(jM4003minusAH228Gc2) < 0.0f) {
                EdgeEffectCompat.INSTANCE.onAbsorbCompat(androidEdgeEffectOverscrollEffect.rightEffect, -MathKt.roundToInt(Velocity.m4000getXimpl(jM4003minusAH228Gc2)));
            }
            if (Velocity.m4001getYimpl(jM4003minusAH228Gc2) > 0.0f) {
                EdgeEffectCompat.INSTANCE.onAbsorbCompat(androidEdgeEffectOverscrollEffect.topEffect, MathKt.roundToInt(Velocity.m4001getYimpl(jM4003minusAH228Gc2)));
            } else if (Velocity.m4001getYimpl(jM4003minusAH228Gc2) < 0.0f) {
                EdgeEffectCompat.INSTANCE.onAbsorbCompat(androidEdgeEffectOverscrollEffect.bottomEffect, -MathKt.roundToInt(Velocity.m4001getYimpl(jM4003minusAH228Gc2)));
            }
            if (!Velocity.m3999equalsimpl0(jM4003minusAH228Gc2, Velocity.INSTANCE.m4011getZero9UxMQ8M())) {
                androidEdgeEffectOverscrollEffect.invalidateOverscroll();
            }
            androidEdgeEffectOverscrollEffect.animateToRelease();
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objInvoke);
        if (Size.m1518isEmptyimpl(this.containerSize)) {
            Velocity velocityM3991boximpl = Velocity.m3991boximpl(j);
            androidEdgeEffectOverscrollEffect$applyToFling$1.label = 1;
            if (function2.invoke(velocityM3991boximpl, androidEdgeEffectOverscrollEffect$applyToFling$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
        if (Velocity.m4000getXimpl(j) > 0.0f) {
            EdgeEffectCompat edgeEffectCompat3 = EdgeEffectCompat.INSTANCE;
            if (!(edgeEffectCompat3.getDistanceCompat(this.leftEffect) == 0.0f)) {
                edgeEffectCompat3.onAbsorbCompat(this.leftEffect, MathKt.roundToInt(Velocity.m4000getXimpl(j)));
                fM4000getXimpl = Velocity.m4000getXimpl(j);
            } else if (Velocity.m4000getXimpl(j) < 0.0f) {
                edgeEffectCompat = EdgeEffectCompat.INSTANCE;
                if (edgeEffectCompat.getDistanceCompat(this.rightEffect) == 0.0f) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    fM4000getXimpl = 0.0f;
                } else {
                    edgeEffectCompat.onAbsorbCompat(this.rightEffect, -MathKt.roundToInt(Velocity.m4000getXimpl(j)));
                    fM4000getXimpl = Velocity.m4000getXimpl(j);
                }
            } else {
                fM4000getXimpl = 0.0f;
            }
        } else if (Velocity.m4000getXimpl(j) < 0.0f) {
            edgeEffectCompat = EdgeEffectCompat.INSTANCE;
            if (edgeEffectCompat.getDistanceCompat(this.rightEffect) == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                edgeEffectCompat.onAbsorbCompat(this.rightEffect, -MathKt.roundToInt(Velocity.m4000getXimpl(j)));
                fM4000getXimpl = Velocity.m4000getXimpl(j);
            } else {
                fM4000getXimpl = 0.0f;
            }
        } else {
            fM4000getXimpl = 0.0f;
        }
        if (Velocity.m4001getYimpl(j) > 0.0f) {
            EdgeEffectCompat edgeEffectCompat4 = EdgeEffectCompat.INSTANCE;
            if (!(edgeEffectCompat4.getDistanceCompat(this.topEffect) == 0.0f)) {
                edgeEffectCompat4.onAbsorbCompat(this.topEffect, MathKt.roundToInt(Velocity.m4001getYimpl(j)));
                fM4001getYimpl = Velocity.m4001getYimpl(j);
            } else if (Velocity.m4001getYimpl(j) < 0.0f) {
                edgeEffectCompat2 = EdgeEffectCompat.INSTANCE;
                if (edgeEffectCompat2.getDistanceCompat(this.bottomEffect) == 0.0f) {
                    fM4001getYimpl = 0.0f;
                } else {
                    edgeEffectCompat2.onAbsorbCompat(this.bottomEffect, -MathKt.roundToInt(Velocity.m4001getYimpl(j)));
                    fM4001getYimpl = Velocity.m4001getYimpl(j);
                }
            } else {
                fM4001getYimpl = 0.0f;
            }
        } else if (Velocity.m4001getYimpl(j) < 0.0f) {
            edgeEffectCompat2 = EdgeEffectCompat.INSTANCE;
            if (edgeEffectCompat2.getDistanceCompat(this.bottomEffect) == 0.0f) {
                edgeEffectCompat2.onAbsorbCompat(this.bottomEffect, -MathKt.roundToInt(Velocity.m4001getYimpl(j)));
                fM4001getYimpl = Velocity.m4001getYimpl(j);
            } else {
                fM4001getYimpl = 0.0f;
            }
        } else {
            fM4001getYimpl = 0.0f;
        }
        long jVelocity = VelocityKt.Velocity(fM4000getXimpl, fM4001getYimpl);
        if (!Velocity.m3999equalsimpl0(jVelocity, Velocity.INSTANCE.m4011getZero9UxMQ8M())) {
            invalidateOverscroll();
        }
        jM4003minusAH228Gc = Velocity.m4003minusAH228Gc(j, jVelocity);
        Velocity velocityM3991boximpl2 = Velocity.m3991boximpl(jM4003minusAH228Gc);
        androidEdgeEffectOverscrollEffect$applyToFling$1.L$0 = this;
        androidEdgeEffectOverscrollEffect$applyToFling$1.J$0 = jM4003minusAH228Gc;
        androidEdgeEffectOverscrollEffect$applyToFling$1.label = 2;
        objInvoke = function2.invoke(velocityM3991boximpl2, androidEdgeEffectOverscrollEffect$applyToFling$1);
        if (objInvoke == coroutine_suspended) {
            return coroutine_suspended;
        }
        androidEdgeEffectOverscrollEffect = this;
        jM4003minusAH228Gc2 = Velocity.m4003minusAH228Gc(jM4003minusAH228Gc, ((Velocity) objInvoke).getPackedValue());
        androidEdgeEffectOverscrollEffect.scrollCycleInProgress = false;
        if (Velocity.m4000getXimpl(jM4003minusAH228Gc2) > 0.0f) {
            EdgeEffectCompat.INSTANCE.onAbsorbCompat(androidEdgeEffectOverscrollEffect.leftEffect, MathKt.roundToInt(Velocity.m4000getXimpl(jM4003minusAH228Gc2)));
        } else if (Velocity.m4000getXimpl(jM4003minusAH228Gc2) < 0.0f) {
            EdgeEffectCompat.INSTANCE.onAbsorbCompat(androidEdgeEffectOverscrollEffect.rightEffect, -MathKt.roundToInt(Velocity.m4000getXimpl(jM4003minusAH228Gc2)));
        }
        if (Velocity.m4001getYimpl(jM4003minusAH228Gc2) > 0.0f) {
            EdgeEffectCompat.INSTANCE.onAbsorbCompat(androidEdgeEffectOverscrollEffect.topEffect, MathKt.roundToInt(Velocity.m4001getYimpl(jM4003minusAH228Gc2)));
        } else if (Velocity.m4001getYimpl(jM4003minusAH228Gc2) < 0.0f) {
            EdgeEffectCompat.INSTANCE.onAbsorbCompat(androidEdgeEffectOverscrollEffect.bottomEffect, -MathKt.roundToInt(Velocity.m4001getYimpl(jM4003minusAH228Gc2)));
        }
        if (!Velocity.m3999equalsimpl0(jM4003minusAH228Gc2, Velocity.INSTANCE.m4011getZero9UxMQ8M())) {
            androidEdgeEffectOverscrollEffect.invalidateOverscroll();
        }
        androidEdgeEffectOverscrollEffect.animateToRelease();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    /* JADX WARN: Code duplicated, block: B:85:0x015b  */
    /* JADX WARN: Code duplicated, block: B:87:0x0160  */
    /* JADX WARN: Code duplicated, block: B:89:0x0168  */
    /* JADX WARN: Code duplicated, block: B:90:0x016c  */
    /* JADX WARN: Code duplicated, block: B:92:0x016f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:94:0x0173  */
    @Override // androidx.compose.foundation.OverscrollEffect
    /* JADX INFO: renamed from: applyToScroll-Rhakbz0, reason: not valid java name */
    public long mo166applyToScrollRhakbz0(long delta, int source, @NotNull Function1<? super Offset, Offset> performScroll) {
        float fM160pullBottom0a9Yr6o;
        boolean z;
        boolean z2;
        boolean z3;
        float fM162pullRight0a9Yr6o;
        Intrinsics.checkNotNullParameter(performScroll, "performScroll");
        if (Size.m1518isEmptyimpl(this.containerSize)) {
            return performScroll.invoke(Offset.m1436boximpl(delta)).getPackedValue();
        }
        boolean z4 = true;
        if (!this.scrollCycleInProgress) {
            stopOverscrollAnimation();
            this.scrollCycleInProgress = true;
        }
        Offset offset = this.pointerPosition;
        long packedValue = offset != null ? offset.getPackedValue() : SizeKt.m1526getCenteruvyYCjk(this.containerSize);
        float f = 0.0f;
        if (Offset.m1448getYimpl(delta) == 0.0f) {
            fM160pullBottom0a9Yr6o = 0.0f;
        } else {
            EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
            if (edgeEffectCompat.getDistanceCompat(this.topEffect) == 0.0f) {
                if (edgeEffectCompat.getDistanceCompat(this.bottomEffect) == 0.0f) {
                    fM160pullBottom0a9Yr6o = 0.0f;
                } else {
                    fM160pullBottom0a9Yr6o = m160pullBottom0a9Yr6o(delta, packedValue);
                    if (edgeEffectCompat.getDistanceCompat(this.bottomEffect) == 0.0f) {
                        this.bottomEffect.onRelease();
                    }
                }
            } else {
                fM160pullBottom0a9Yr6o = m163pullTop0a9Yr6o(delta, packedValue);
                if (edgeEffectCompat.getDistanceCompat(this.topEffect) == 0.0f) {
                    this.topEffect.onRelease();
                }
            }
        }
        if (!(Offset.m1447getXimpl(delta) == 0.0f)) {
            EdgeEffectCompat edgeEffectCompat2 = EdgeEffectCompat.INSTANCE;
            if (edgeEffectCompat2.getDistanceCompat(this.leftEffect) == 0.0f) {
                if (!(edgeEffectCompat2.getDistanceCompat(this.rightEffect) == 0.0f)) {
                    fM162pullRight0a9Yr6o = m162pullRight0a9Yr6o(delta, packedValue);
                    if (edgeEffectCompat2.getDistanceCompat(this.rightEffect) == 0.0f) {
                        this.rightEffect.onRelease();
                    }
                }
            } else {
                fM162pullRight0a9Yr6o = m161pullLeft0a9Yr6o(delta, packedValue);
                if (edgeEffectCompat2.getDistanceCompat(this.leftEffect) == 0.0f) {
                    this.leftEffect.onRelease();
                }
            }
            f = fM162pullRight0a9Yr6o;
        }
        long jOffset = OffsetKt.Offset(f, fM160pullBottom0a9Yr6o);
        if (!Offset.m1444equalsimpl0(jOffset, Offset.INSTANCE.m1463getZeroF1C5BW0())) {
            invalidateOverscroll();
        }
        long jM1451minusMKHz9U = Offset.m1451minusMKHz9U(delta, jOffset);
        long packedValue2 = performScroll.invoke(Offset.m1436boximpl(jM1451minusMKHz9U)).getPackedValue();
        long jM1451minusMKHz9U2 = Offset.m1451minusMKHz9U(jM1451minusMKHz9U, packedValue2);
        if (NestedScrollSource.m2604equalsimpl0(source, NestedScrollSource.INSTANCE.m2609getDragWNlRxjI())) {
            if (Offset.m1447getXimpl(jM1451minusMKHz9U2) > 0.5f) {
                m161pullLeft0a9Yr6o(jM1451minusMKHz9U2, packedValue);
            } else {
                if (Offset.m1447getXimpl(jM1451minusMKHz9U2) < -0.5f) {
                    m162pullRight0a9Yr6o(jM1451minusMKHz9U2, packedValue);
                } else {
                    z2 = false;
                }
                if (Offset.m1448getYimpl(jM1451minusMKHz9U2) > 0.5f) {
                    m163pullTop0a9Yr6o(jM1451minusMKHz9U2, packedValue);
                } else {
                    if (Offset.m1448getYimpl(jM1451minusMKHz9U2) < -0.5f) {
                        m160pullBottom0a9Yr6o(jM1451minusMKHz9U2, packedValue);
                    } else {
                        z3 = false;
                    }
                    if (!z2 || z3) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                z3 = true;
                if (z2) {
                }
                z = true;
            }
            z2 = true;
            if (Offset.m1448getYimpl(jM1451minusMKHz9U2) > 0.5f) {
                m163pullTop0a9Yr6o(jM1451minusMKHz9U2, packedValue);
            } else {
                if (Offset.m1448getYimpl(jM1451minusMKHz9U2) < -0.5f) {
                    m160pullBottom0a9Yr6o(jM1451minusMKHz9U2, packedValue);
                } else {
                    z3 = false;
                }
                if (z2) {
                }
                z = true;
            }
            z3 = true;
            if (z2) {
            }
            z = true;
        } else {
            z = false;
        }
        if (!m164releaseOppositeOverscrollk4lQ0M(delta) && !z) {
            z4 = false;
        }
        if (z4) {
            invalidateOverscroll();
        }
        return Offset.m1452plusMKHz9U(jOffset, packedValue2);
    }

    public final void drawOverscroll(@NotNull DrawScope drawScope) {
        boolean zDrawLeft;
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
        if (Size.m1518isEmptyimpl(this.containerSize)) {
            return;
        }
        androidx.compose.ui.graphics.Canvas canvas = drawScope.getDrawContext().getCanvas();
        this.redrawSignal.getValue();
        Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        boolean z = true;
        if (!(edgeEffectCompat.getDistanceCompat(this.leftEffectNegation) == 0.0f)) {
            drawRight(drawScope, this.leftEffectNegation, nativeCanvas);
            this.leftEffectNegation.finish();
        }
        if (this.leftEffect.isFinished()) {
            zDrawLeft = false;
        } else {
            zDrawLeft = drawLeft(drawScope, this.leftEffect, nativeCanvas);
            edgeEffectCompat.onPullDistanceCompat(this.leftEffectNegation, edgeEffectCompat.getDistanceCompat(this.leftEffect), 0.0f);
        }
        if (!(edgeEffectCompat.getDistanceCompat(this.topEffectNegation) == 0.0f)) {
            drawBottom(drawScope, this.topEffectNegation, nativeCanvas);
            this.topEffectNegation.finish();
        }
        if (!this.topEffect.isFinished()) {
            zDrawLeft = drawTop(drawScope, this.topEffect, nativeCanvas) || zDrawLeft;
            edgeEffectCompat.onPullDistanceCompat(this.topEffectNegation, edgeEffectCompat.getDistanceCompat(this.topEffect), 0.0f);
        }
        if (!(edgeEffectCompat.getDistanceCompat(this.rightEffectNegation) == 0.0f)) {
            drawLeft(drawScope, this.rightEffectNegation, nativeCanvas);
            this.rightEffectNegation.finish();
        }
        if (!this.rightEffect.isFinished()) {
            zDrawLeft = drawRight(drawScope, this.rightEffect, nativeCanvas) || zDrawLeft;
            edgeEffectCompat.onPullDistanceCompat(this.rightEffectNegation, edgeEffectCompat.getDistanceCompat(this.rightEffect), 0.0f);
        }
        if (!(edgeEffectCompat.getDistanceCompat(this.bottomEffectNegation) == 0.0f)) {
            drawTop(drawScope, this.bottomEffectNegation, nativeCanvas);
            this.bottomEffectNegation.finish();
        }
        if (!this.bottomEffect.isFinished()) {
            if (!drawBottom(drawScope, this.bottomEffect, nativeCanvas) && !zDrawLeft) {
                z = false;
            }
            edgeEffectCompat.onPullDistanceCompat(this.bottomEffectNegation, edgeEffectCompat.getDistanceCompat(this.bottomEffect), 0.0f);
            zDrawLeft = z;
        }
        if (zDrawLeft) {
            invalidateOverscroll();
        }
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    @NotNull
    public Modifier getEffectModifier() {
        return this.effectModifier;
    }

    /* JADX INFO: renamed from: getInvalidationEnabled$foundation_release, reason: from getter */
    public final boolean getInvalidationEnabled() {
        return this.invalidationEnabled;
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public boolean isInProgress() {
        List<EdgeEffect> list = this.allEffects;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!(EdgeEffectCompat.INSTANCE.getDistanceCompat(list.get(i)) == 0.0f)) {
                return true;
            }
        }
        return false;
    }

    public final void setInvalidationEnabled$foundation_release(boolean z) {
        this.invalidationEnabled = z;
    }
}
