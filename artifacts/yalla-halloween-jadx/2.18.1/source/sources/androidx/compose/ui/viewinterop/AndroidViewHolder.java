package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.o00O0;
import androidx.compose.ui.platform.o0O000Oo;
import androidx.compose.ui.platform.o0OoOo0;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o000000.o00000;
import o0000O0O.o00oO0o;
import o0000O0O.oo000o;
import o000O0O0.o00000O;
import o000O0O0.o00O0O;
import o000O0O0.o00Ooo;
import o0O0O00.o000000;
import o0O0O00.o000000O;
import o0O0O00.o00000O0;
import o0O0O00.o000O000;
import o0O0O00.o0O0O00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p047Oooooo0.o00OOO0;
import p048OoooooO.o00OOOO0;
import p094o000o0OO.o00Oo0;
import p100o000oOoO.o00O0OOO;
import p191o00o0O.o0Oo0oo;
import p418o0Oo0oo.o0000O0O;
import p418o0Oo0oo.o0000Ooo;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\b \u0018\u00002\u00020\u00012\u00020\u0002J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016R.\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR6\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R0\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R0\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001c\u001a\u0004\b$\u0010\u001e\"\u0004\b%\u0010 R.\u0010.\u001a\u0004\u0018\u00010'2\b\u0010\b\u001a\u0004\u0018\u00010'8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R0\u00103\u001a\u0010\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b0\u0010\u001c\u001a\u0004\b1\u0010\u001e\"\u0004\b2\u0010 R\u0017\u00109\u001a\u0002048\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R*\u0010:\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00020\u001a8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R*\u0010@\u001a\u00020\"2\u0006\u0010\b\u001a\u00020\"8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER.\u0010G\u001a\u0004\u0018\u00010F2\b\u0010\b\u001a\u0004\u0018\u00010F8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010L¨\u0006M"}, d2 = {"Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "Landroid/view/ViewGroup;", "Lo000O0O0/o00O0O;", "Landroid/view/ViewGroup$LayoutParams;", "getLayoutParams", "", "getNestedScrollAxes", "Landroid/view/View;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Oooo0oO", "Landroid/view/View;", "getView", "()Landroid/view/View;", "setView$ui_release", "(Landroid/view/View;)V", ViewHierarchyConstants.VIEW_KEY, "Lkotlin/Function0;", "", "Oooo0oo", "Lkotlin/jvm/functions/Function0;", "getUpdate", "()Lkotlin/jvm/functions/Function0;", "setUpdate", "(Lkotlin/jvm/functions/Function0;)V", "update", "Lkotlin/Function1;", "LOoooooO/o00OOOO0;", "OoooO0", "Lkotlin/jvm/functions/Function1;", "getOnModifierChanged$ui_release", "()Lkotlin/jvm/functions/Function1;", "setOnModifierChanged$ui_release", "(Lkotlin/jvm/functions/Function1;)V", "onModifierChanged", "Lo0000O0O/OooO;", "OoooO", "getOnDensityChanged$ui_release", "setOnDensityChanged$ui_release", "onDensityChanged", "Landroidx/lifecycle/LifecycleOwner;", "OoooOO0", "Landroidx/lifecycle/LifecycleOwner;", "getLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "setLifecycleOwner", "(Landroidx/lifecycle/LifecycleOwner;)V", "lifecycleOwner", "", "OoooOoO", "getOnRequestDisallowInterceptTouchEvent$ui_release", "setOnRequestDisallowInterceptTouchEvent$ui_release", "onRequestDisallowInterceptTouchEvent", "Landroidx/compose/ui/node/LayoutNode;", "OooooOO", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "modifier", "LOoooooO/o00OOOO0;", "getModifier", "()LOoooooO/o00OOOO0;", "setModifier", "(LOoooooO/o00OOOO0;)V", "density", "Lo0000O0O/OooO;", "getDensity", "()Lo0000O0O/OooO;", "setDensity", "(Lo0000O0O/OooO;)V", "Lo000o0OO/o00Oo0;", "savedStateRegistryOwner", "Lo000o0OO/o00Oo0;", "getSavedStateRegistryOwner", "()Lo000o0OO/o00Oo0;", "setSavedStateRegistryOwner", "(Lo000o0OO/o00Oo0;)V", "ui_release"}, k = 1, mv = {1, 6, 0})
public abstract class AndroidViewHolder extends ViewGroup implements o00O0O {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public boolean f6660Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final p346o0OOO0o.OooOOOO f6661Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public View view;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Function0<Unit> update;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super o0000O0O.OooO, Unit> onDensityChanged;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super o00OOOO0, Unit> onModifierChanged;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @NotNull
    public o00OOOO0 f6666OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @NotNull
    public o0000O0O.OooO f6667OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public LifecycleOwner lifecycleOwner;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    @NotNull
    public final o00OOO0 f6669OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    @NotNull
    public final Function1<AndroidViewHolder, Unit> f6670OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f6671OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super Boolean, Unit> onRequestDisallowInterceptTouchEvent;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final int[] f6673OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public int f6674Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public int f6675Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @NotNull
    public final o00Ooo f6676OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LayoutNode layoutNode;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @Nullable
    public o00Oo0 f6678o000oOoO;

    public static final class OooO implements o000000 {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ LayoutNode f6680OooO0O0;

        public static final class OooO00o extends Lambda implements Function1<o000O000.OooO00o, Unit> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ AndroidViewHolder f6681Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public final /* synthetic */ LayoutNode f6682Oooo0oO;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(AndroidViewHolder androidViewHolder, LayoutNode layoutNode) {
                super(1);
                this.f6681Oooo0o = androidViewHolder;
                this.f6682Oooo0oO = layoutNode;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(o000O000.OooO00o oooO00o) {
                o000O000.OooO00o layout = oooO00o;
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                o0000O.OooO0OO.OooO0OO(this.f6681Oooo0o, this.f6682Oooo0oO);
                return Unit.INSTANCE;
            }
        }

        public OooO(LayoutNode layoutNode) {
            this.f6680OooO0O0 = layoutNode;
        }

        @Override // o0O0O00.o000000
        @NotNull
        public final o000000O OooO00o(@NotNull o00000O0 measure, @NotNull List<? extends o0O0O00> measurables, long j) {
            Intrinsics.checkNotNullParameter(measure, "$this$measure");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            if (o0000O0O.OooO0O0.OooOO0(j) != 0) {
                AndroidViewHolder.this.getChildAt(0).setMinimumWidth(o0000O0O.OooO0O0.OooOO0(j));
            }
            if (o0000O0O.OooO0O0.OooO(j) != 0) {
                AndroidViewHolder.this.getChildAt(0).setMinimumHeight(o0000O0O.OooO0O0.OooO(j));
            }
            AndroidViewHolder androidViewHolder = AndroidViewHolder.this;
            int iOooOO0 = o0000O0O.OooO0O0.OooOO0(j);
            int iOooO0oo = o0000O0O.OooO0O0.OooO0oo(j);
            ViewGroup.LayoutParams layoutParams = AndroidViewHolder.this.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams);
            int iOooO00o = AndroidViewHolder.OooO00o(androidViewHolder, iOooOO0, iOooO0oo, layoutParams.width);
            AndroidViewHolder androidViewHolder2 = AndroidViewHolder.this;
            int iOooO = o0000O0O.OooO0O0.OooO(j);
            int iOooO0oO = o0000O0O.OooO0O0.OooO0oO(j);
            ViewGroup.LayoutParams layoutParams2 = AndroidViewHolder.this.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams2);
            androidViewHolder.measure(iOooO00o, AndroidViewHolder.OooO00o(androidViewHolder2, iOooO, iOooO0oO, layoutParams2.height));
            return measure.OooOooo(AndroidViewHolder.this.getMeasuredWidth(), AndroidViewHolder.this.getMeasuredHeight(), MapsKt.emptyMap(), new OooO00o(AndroidViewHolder.this, this.f6680OooO0O0));
        }

        @Override // o0O0O00.o000000
        public final int OooO0O0(@NotNull o0O0O00.OooOo00 oooOo00, @NotNull List<? extends o0O0O00.OooOOOO> measurables, int i) {
            Intrinsics.checkNotNullParameter(oooOo00, "<this>");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            return OooO0oO(i);
        }

        @Override // o0O0O00.o000000
        public final int OooO0OO(@NotNull o0O0O00.OooOo00 oooOo00, @NotNull List<? extends o0O0O00.OooOOOO> measurables, int i) {
            Intrinsics.checkNotNullParameter(oooOo00, "<this>");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            return OooO0oO(i);
        }

        @Override // o0O0O00.o000000
        public final int OooO0Oo(@NotNull o0O0O00.OooOo00 oooOo00, @NotNull List<? extends o0O0O00.OooOOOO> measurables, int i) {
            Intrinsics.checkNotNullParameter(oooOo00, "<this>");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            return OooO0o(i);
        }

        public final int OooO0o(int i) {
            AndroidViewHolder androidViewHolder = AndroidViewHolder.this;
            ViewGroup.LayoutParams layoutParams = androidViewHolder.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams);
            androidViewHolder.measure(AndroidViewHolder.OooO00o(androidViewHolder, 0, i, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
            return AndroidViewHolder.this.getMeasuredHeight();
        }

        @Override // o0O0O00.o000000
        public final int OooO0o0(@NotNull o0O0O00.OooOo00 oooOo00, @NotNull List<? extends o0O0O00.OooOOOO> measurables, int i) {
            Intrinsics.checkNotNullParameter(oooOo00, "<this>");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            return OooO0o(i);
        }

        public final int OooO0oO(int i) {
            AndroidViewHolder androidViewHolder = AndroidViewHolder.this;
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            AndroidViewHolder androidViewHolder2 = AndroidViewHolder.this;
            ViewGroup.LayoutParams layoutParams = androidViewHolder2.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams);
            androidViewHolder.measure(iMakeMeasureSpec, AndroidViewHolder.OooO00o(androidViewHolder2, 0, i, layoutParams.height));
            return AndroidViewHolder.this.getMeasuredWidth();
        }
    }

    public static final class OooO00o extends Lambda implements Function1<o00OOOO0, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ LayoutNode f6683Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o00OOOO0 f6684Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(LayoutNode layoutNode, o00OOOO0 o00oooo1) {
            super(1);
            this.f6683Oooo0o = layoutNode;
            this.f6684Oooo0oO = o00oooo1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o00OOOO0 o00oooo1) {
            o00OOOO0 it = o00oooo1;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f6683Oooo0o.OooO0O0(it.OooOOoo(this.f6684Oooo0oO));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<o0000O0O.OooO, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ LayoutNode f6685Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(LayoutNode layoutNode) {
            super(1);
            this.f6685Oooo0o = layoutNode;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0000O0O.OooO oooO) {
            o0000O0O.OooO it = oooO;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f6685Oooo0o.OooO0OO(it);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<o00000, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ LayoutNode f6687Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<View> f6688Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(LayoutNode layoutNode, Ref.ObjectRef<View> objectRef) {
            super(1);
            this.f6687Oooo0oO = layoutNode;
            this.f6688Oooo0oo = objectRef;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o00000 o00000Var) {
            o00000 owner = o00000Var;
            Intrinsics.checkNotNullParameter(owner, "owner");
            AndroidComposeView androidComposeView = owner instanceof AndroidComposeView ? (AndroidComposeView) owner : null;
            if (androidComposeView != null) {
                AndroidViewHolder view = AndroidViewHolder.this;
                LayoutNode layoutNode = this.f6687Oooo0oO;
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
                androidComposeView.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().put(view, layoutNode);
                androidComposeView.getAndroidViewsHandler$ui_release().addView(view);
                androidComposeView.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().put(layoutNode, view);
                WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                ViewCompat.OooO0o.OooOOoo(view, 1);
                ViewCompat.OooOo0o(view, new o0OoOo0(layoutNode, androidComposeView, androidComposeView));
            }
            View view2 = this.f6688Oooo0oo.element;
            if (view2 != null) {
                AndroidViewHolder.this.setView$ui_release(view2);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<o00000, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<View> f6690Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(Ref.ObjectRef<View> objectRef) {
            super(1);
            this.f6690Oooo0oO = objectRef;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [T, android.view.View] */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o00000 o00000Var) {
            o00000 owner = o00000Var;
            Intrinsics.checkNotNullParameter(owner, "owner");
            AndroidComposeView androidComposeView = owner instanceof AndroidComposeView ? (AndroidComposeView) owner : null;
            if (androidComposeView != null) {
                AndroidViewHolder view = AndroidViewHolder.this;
                Intrinsics.checkNotNullParameter(view, "view");
                androidComposeView.getAndroidViewsHandler$ui_release().removeView(view);
                TypeIntrinsics.asMutableMap(androidComposeView.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder()).remove(androidComposeView.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().remove(view));
                WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                ViewCompat.OooO0o.OooOOoo(view, 0);
            }
            this.f6690Oooo0oO.element = AndroidViewHolder.this.getView();
            AndroidViewHolder.this.setView$ui_release(null);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<o0Oo0oo, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ LayoutNode f6691Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ AndroidViewHolder f6692Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(LayoutNode layoutNode, AndroidViewHolder androidViewHolder) {
            super(1);
            this.f6691Oooo0o = layoutNode;
            this.f6692Oooo0oO = androidViewHolder;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0Oo0oo o0oo0oo2) {
            o0Oo0oo drawBehind = o0oo0oo2;
            Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
            LayoutNode layoutNode = this.f6691Oooo0o;
            AndroidViewHolder view = this.f6692Oooo0oO;
            p145o00Oo0.o0O0O00 o0o0o00OooO0o = drawBehind.Ooooo0o().OooO0o();
            o00000 o00000Var = layoutNode.f6143OoooO0O;
            AndroidComposeView androidComposeView = o00000Var instanceof AndroidComposeView ? (AndroidComposeView) o00000Var : null;
            if (androidComposeView != null) {
                Canvas canvas = p145o00Oo0.OooOOOO.OooO00o(o0o0o00OooO0o);
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(canvas, "canvas");
                Objects.requireNonNull(androidComposeView.getAndroidViewsHandler$ui_release());
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(canvas, "canvas");
                view.draw(canvas);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function1<o0O0O00.Oooo000, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ LayoutNode f6694Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(LayoutNode layoutNode) {
            super(1);
            this.f6694Oooo0oO = layoutNode;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0O0O00.Oooo000 oooo000) {
            o0O0O00.Oooo000 it = oooo000;
            Intrinsics.checkNotNullParameter(it, "it");
            o0000O.OooO0OO.OooO0OO(AndroidViewHolder.this, this.f6694Oooo0oO);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1", f = "AndroidViewHolder.android.kt", i = {}, l = {470, 475}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ long f6695Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f6696Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f6697Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ AndroidViewHolder f6698Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(boolean z, AndroidViewHolder androidViewHolder, long j, Continuation<? super OooOOO> continuation) {
            super(2, continuation);
            this.f6697Oooo0oO = z;
            this.f6698Oooo0oo = androidViewHolder;
            this.f6695Oooo = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOOO(this.f6697Oooo0oO, this.f6698Oooo0oo, this.f6695Oooo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOOO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f6696Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.f6697Oooo0oO) {
                    p346o0OOO0o.OooOOOO oooOOOO = this.f6698Oooo0oo.f6661Oooo0o;
                    long j = this.f6695Oooo;
                    oo000o.OooO00o oooO00o = oo000o.f27328OooO0O0;
                    long j2 = oo000o.f27329OooO0OO;
                    this.f6696Oooo0o = 2;
                    if (oooOOOO.OooO00o(j, j2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    p346o0OOO0o.OooOOOO oooOOOO2 = this.f6698Oooo0oo.f6661Oooo0o;
                    oo000o.OooO00o oooO00o2 = oo000o.f27328OooO0O0;
                    long j3 = oo000o.f27329OooO0OO;
                    long j4 = this.f6695Oooo;
                    this.f6696Oooo0o = 1;
                    if (oooOOOO2.OooO00o(j3, j4, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function1<AndroidViewHolder, Unit> {
        public OooOOO0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(AndroidViewHolder androidViewHolder) {
            AndroidViewHolder it = androidViewHolder;
            Intrinsics.checkNotNullParameter(it, "it");
            AndroidViewHolder.this.getHandler().post(new o0000O.OooO00o(AndroidViewHolder.this.f6671OoooOo0, 0));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedPreFling$1", f = "AndroidViewHolder.android.kt", i = {}, l = {488}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOOO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f6700Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ long f6702Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(long j, Continuation<? super OooOOOO> continuation) {
            super(2, continuation);
            this.f6702Oooo0oo = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AndroidViewHolder.this.new OooOOOO(this.f6702Oooo0oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOOOO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f6700Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                p346o0OOO0o.OooOOOO oooOOOO = AndroidViewHolder.this.f6661Oooo0o;
                long j = this.f6702Oooo0oo;
                this.f6700Oooo0o = 1;
                if (oooOOOO.OooO0OO(j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends Lambda implements Function1<Function0<? extends Unit>, Unit> {
        public OooOo() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Function0<? extends Unit> function0) {
            final Function0<? extends Unit> command = function0;
            Intrinsics.checkNotNullParameter(command, "command");
            if (AndroidViewHolder.this.getHandler().getLooper() == Looper.myLooper()) {
                command.invoke();
            } else {
                AndroidViewHolder.this.getHandler().post(new Runnable() { // from class: o0000O.OooO0O0
                    @Override // java.lang.Runnable
                    public final void run() {
                        Function0 tmp0 = command;
                        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                        tmp0.invoke();
                    }
                });
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function0<Unit> {
        public OooOo00() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            AndroidViewHolder androidViewHolder = AndroidViewHolder.this;
            if (androidViewHolder.f6660Oooo) {
                androidViewHolder.f6669OoooOOO.OooO0O0(androidViewHolder, androidViewHolder.f6670OoooOOo, androidViewHolder.getUpdate());
            }
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final Oooo000 f6705Oooo0o = new Oooo000();

        public Oooo000() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder(@NotNull Context context, @Nullable o00O0OOO o00o0ooo2, @NotNull p346o0OOO0o.OooOOOO dispatcher) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.f6661Oooo0o = dispatcher;
        if (o00o0ooo2 != null) {
            o0O000Oo.OooO0OO(this, o00o0ooo2);
        }
        setSaveFromParentEnabled(false);
        this.update = Oooo000.f6705Oooo0o;
        o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
        this.f6666OoooO00 = oooO00o;
        this.f6667OoooO0O = o0000O0O.OooOO0O.OooO00o();
        this.f6669OoooOOO = new o00OOO0(new OooOo());
        this.f6670OoooOOo = new OooOOO0();
        this.f6671OoooOo0 = new OooOo00();
        this.f6673OoooOoo = new int[2];
        this.f6674Ooooo00 = Integer.MIN_VALUE;
        this.f6675Ooooo0o = Integer.MIN_VALUE;
        this.f6676OooooO0 = new o00Ooo();
        LayoutNode layoutNode = new LayoutNode(false);
        Intrinsics.checkNotNullParameter(oooO00o, "<this>");
        Intrinsics.checkNotNullParameter(this, "view");
        p418o0Oo0oo.o00000O other = new p418o0Oo0oo.o00000O();
        o0000Ooo o0000ooo = new o0000Ooo(this);
        Intrinsics.checkNotNullParameter(o0000ooo, "<set-?>");
        other.f39671Oooo0o = o0000ooo;
        o0000O0O o0000o0o2 = new o0000O0O();
        o0000O0O o0000o0o3 = other.f39672Oooo0oO;
        if (o0000o0o3 != null) {
            o0000o0o3.f39687Oooo0o = null;
        }
        other.f39672Oooo0oO = o0000o0o2;
        o0000o0o2.f39687Oooo0o = other;
        setOnRequestDisallowInterceptTouchEvent$ui_release(o0000o0o2);
        Intrinsics.checkNotNullParameter(other, "other");
        o00OOOO0 o00oooo0OooO00o = OnGloballyPositionedModifierKt.OooO00o(DrawModifierKt.OooO00o(other, new OooOO0(layoutNode, this)), new OooOO0O(layoutNode));
        layoutNode.OooO0O0(this.f6666OoooO00.OooOOoo(o00oooo0OooO00o));
        this.onModifierChanged = new OooO00o(layoutNode, o00oooo0OooO00o);
        layoutNode.OooO0OO(this.f6667OoooO0O);
        this.onDensityChanged = new OooO0O0(layoutNode);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        layoutNode.f6172o0OOO0o = new OooO0OO(layoutNode, objectRef);
        layoutNode.f6173o0Oo0oo = new OooO0o(objectRef);
        layoutNode.OooO0Oo(new OooO(layoutNode));
        this.layoutNode = layoutNode;
    }

    public static final int OooO00o(AndroidViewHolder androidViewHolder, int i, int i2, int i3) {
        Objects.requireNonNull(androidViewHolder);
        if (i3 >= 0 || i == i2) {
            return View.MeasureSpec.makeMeasureSpec(RangesKt.coerceIn(i3, i, i2), 1073741824);
        }
        if (i3 != -2 || i2 == Integer.MAX_VALUE) {
            return (i3 != -1 || i2 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        }
        return View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
    }

    @Override // o000O0O0.o00O0O
    public final void OooOO0(@NotNull View target, int i, int i2, int i3, int i4, int i5, @NotNull int[] consumed) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(consumed, "consumed");
        if (isNestedScrollingEnabled()) {
            float f = i;
            float f2 = -1;
            long jOooO0O0 = this.f6661Oooo0o.OooO0O0(o00O0O.OooOO0.OooO00o(f * f2, i2 * f2), o00O0O.OooOO0.OooO00o(i3 * f2, i4 * f2), i5 == 0 ? 1 : 2);
            consumed[0] = o00O0.OooO0O0(o00O0O.OooO.OooO0OO(jOooO0O0));
            consumed[1] = o00O0.OooO0O0(o00O0O.OooO.OooO0Oo(jOooO0O0));
        }
    }

    @Override // o000O0O0.o0OoOo0
    public final void OooOO0O(@NotNull View target, int i, int i2, int i3, int i4, int i5) {
        Intrinsics.checkNotNullParameter(target, "target");
        if (isNestedScrollingEnabled()) {
            float f = i;
            float f2 = -1;
            this.f6661Oooo0o.OooO0O0(o00O0O.OooOO0.OooO00o(f * f2, i2 * f2), o00O0O.OooOO0.OooO00o(i3 * f2, i4 * f2), i5 == 0 ? 1 : 2);
        }
    }

    @Override // o000O0O0.o0OoOo0
    public final boolean OooOO0o(@NotNull View child, @NotNull View target, int i, int i2) {
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(target, "target");
        return ((i & 2) == 0 && (i & 1) == 0) ? false : true;
    }

    @Override // o000O0O0.o0OoOo0
    public final void OooOOO(@NotNull View target, int i) {
        Intrinsics.checkNotNullParameter(target, "target");
        this.f6676OooooO0.OooO0O0(i);
    }

    @Override // o000O0O0.o0OoOo0
    public final void OooOOO0(@NotNull View child, @NotNull View target, int i, int i2) {
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(target, "target");
        this.f6676OooooO0.OooO00o(i, i2);
    }

    @Override // o000O0O0.o0OoOo0
    public final void OooOOOO(@NotNull View target, int i, int i2, @NotNull int[] consumed, int i3) {
        long jOooO0O0;
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(consumed, "consumed");
        if (isNestedScrollingEnabled()) {
            p346o0OOO0o.OooOOOO oooOOOO = this.f6661Oooo0o;
            float f = -1;
            long jOooO00o = o00O0O.OooOO0.OooO00o(i * f, i2 * f);
            int i4 = i3 == 0 ? 1 : 2;
            p346o0OOO0o.OooOOO oooOOO = oooOOOO.f38148OooO0OO;
            if (oooOOO != null) {
                jOooO0O0 = oooOOO.OooO0O0(jOooO00o, i4);
            } else {
                o00O0O.OooO.OooO00o oooO00o = o00O0O.OooO.f30391OooO0O0;
                jOooO0O0 = o00O0O.OooO.f30392OooO0OO;
            }
            consumed[0] = o00O0.OooO0O0(o00O0O.OooO.OooO0OO(jOooO0O0));
            consumed[1] = o00O0.OooO0O0(o00O0O.OooO.OooO0Oo(jOooO0O0));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(@Nullable Region region) {
        if (region == null) {
            return true;
        }
        getLocationInWindow(this.f6673OoooOoo);
        int[] iArr = this.f6673OoooOoo;
        region.op(iArr[0], iArr[1], getWidth() + iArr[0], getHeight() + this.f6673OoooOoo[1], Region.Op.DIFFERENCE);
        return true;
    }

    @NotNull
    /* JADX INFO: renamed from: getDensity, reason: from getter */
    public final o0000O0O.OooO getF6667OoooO0O() {
        return this.f6667OoooO0O;
    }

    @NotNull
    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    @Override // android.view.View
    @Nullable
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams;
        View view = this.view;
        return (view == null || (layoutParams = view.getLayoutParams()) == null) ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    @Nullable
    public final LifecycleOwner getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    @NotNull
    /* JADX INFO: renamed from: getModifier, reason: from getter */
    public final o00OOOO0 getF6666OoooO00() {
        return this.f6666OoooO00;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        o00Ooo o00ooo2 = this.f6676OooooO0;
        return o00ooo2.f28129OooO0O0 | o00ooo2.f28128OooO00o;
    }

    @Nullable
    public final Function1<o0000O0O.OooO, Unit> getOnDensityChanged$ui_release() {
        return this.onDensityChanged;
    }

    @Nullable
    public final Function1<o00OOOO0, Unit> getOnModifierChanged$ui_release() {
        return this.onModifierChanged;
    }

    @Nullable
    public final Function1<Boolean, Unit> getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.onRequestDisallowInterceptTouchEvent;
    }

    @Nullable
    /* JADX INFO: renamed from: getSavedStateRegistryOwner, reason: from getter */
    public final o00Oo0 getF6678o000oOoO() {
        return this.f6678o000oOoO;
    }

    @NotNull
    public final Function0<Unit> getUpdate() {
        return this.update;
    }

    @Nullable
    public final View getView() {
        return this.view;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    @Nullable
    public final ViewParent invalidateChildInParent(@Nullable int[] iArr, @Nullable Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        this.layoutNode.OooOoO0();
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        View view = this.view;
        return view != null ? view.isNestedScrollingEnabled() : super.isNestedScrollingEnabled();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f6669OoooOOO.OooO0OO();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(@NotNull View child, @NotNull View target) {
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(target, "target");
        super.onDescendantInvalidated(child, target);
        this.layoutNode.OooOoO0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f6669OoooOOO.OooO0Oo();
        this.f6669OoooOOO.OooO00o();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view = this.view;
        if (view != null) {
            view.layout(0, 0, i3 - i, i4 - i2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        View view = this.view;
        if (view != null) {
            view.measure(i, i2);
        }
        View view2 = this.view;
        int measuredWidth = view2 != null ? view2.getMeasuredWidth() : 0;
        View view3 = this.view;
        setMeasuredDimension(measuredWidth, view3 != null ? view3.getMeasuredHeight() : 0);
        this.f6674Ooooo00 = i;
        this.f6675Ooooo0o = i2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(@NotNull View target, float f, float f2, boolean z) {
        Intrinsics.checkNotNullParameter(target, "target");
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        BuildersKt__Builders_commonKt.launch$default(this.f6661Oooo0o.OooO0Oo(), null, null, new OooOOO(z, this, o00oO0o.OooO00o(f * (-1.0f), (-1.0f) * f2), null), 3, null);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(@NotNull View target, float f, float f2) {
        Intrinsics.checkNotNullParameter(target, "target");
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        BuildersKt__Builders_commonKt.launch$default(this.f6661Oooo0o.OooO0Oo(), null, null, new OooOOOO(o00oO0o.OooO00o(f * (-1.0f), f2 * (-1.0f)), null), 3, null);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        Function1<? super Boolean, Unit> function1 = this.onRequestDisallowInterceptTouchEvent;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z));
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void setDensity(@NotNull o0000O0O.OooO value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (value != this.f6667OoooO0O) {
            this.f6667OoooO0O = value;
            Function1<? super o0000O0O.OooO, Unit> function1 = this.onDensityChanged;
            if (function1 != null) {
                function1.invoke(value);
            }
        }
    }

    public final void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner != this.lifecycleOwner) {
            this.lifecycleOwner = lifecycleOwner;
            ViewTreeLifecycleOwner.set(this, lifecycleOwner);
        }
    }

    public final void setModifier(@NotNull o00OOOO0 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (value != this.f6666OoooO00) {
            this.f6666OoooO00 = value;
            Function1<? super o00OOOO0, Unit> function1 = this.onModifierChanged;
            if (function1 != null) {
                function1.invoke(value);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(@Nullable Function1<? super o0000O0O.OooO, Unit> function1) {
        this.onDensityChanged = function1;
    }

    public final void setOnModifierChanged$ui_release(@Nullable Function1<? super o00OOOO0, Unit> function1) {
        this.onModifierChanged = function1;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(@Nullable Function1<? super Boolean, Unit> function1) {
        this.onRequestDisallowInterceptTouchEvent = function1;
    }

    public final void setSavedStateRegistryOwner(@Nullable o00Oo0 o00oo1) {
        if (o00oo1 != this.f6678o000oOoO) {
            this.f6678o000oOoO = o00oo1;
            p094o000o0OO.o00Ooo.OooO0O0(this, o00oo1);
        }
    }

    public final void setUpdate(@NotNull Function0<Unit> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.update = value;
        this.f6660Oooo = true;
        this.f6671OoooOo0.invoke();
    }

    public final void setView$ui_release(@Nullable View view) {
        if (view != this.view) {
            this.view = view;
            removeAllViews();
            if (view != null) {
                addView(view);
                this.f6671OoooOo0.invoke();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }
}
