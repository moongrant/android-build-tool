package androidx.compose.ui.platform;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.InternalComposeUiApi;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.umeng.analytics.pro.d;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.android.HandlerDispatcherKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010#\u001a\u00020\"\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$\u0012\b\b\u0002\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R(\u0010\u000f\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR0\u0010\u0019\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u00108F@FX\u0087\u000e¢\u0006\u0018\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R(\u0010\u001a\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u00028\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u00108TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0014R\u0011\u0010!\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b \u0010\u0014¨\u0006*"}, d2 = {"Landroidx/compose/ui/platform/AbstractComposeView;", "Landroid/view/ViewGroup;", "Lo000oOoO/o00O0OOO;", "parent", "", "setParentCompositionContext", "Landroidx/compose/ui/platform/o00OOOO0;", "strategy", "setViewCompositionStrategy", "Landroid/os/IBinder;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Oooo0oO", "Landroid/os/IBinder;", "setPreviousAttachedWindowToken", "(Landroid/os/IBinder;)V", "previousAttachedWindowToken", "", "OoooO0", "Z", "getShowLayoutBounds", "()Z", "setShowLayoutBounds", "(Z)V", "getShowLayoutBounds$annotations", "()V", "showLayoutBounds", "parentContext", "Lo000oOoO/o00O0OOO;", "setParentContext", "(Lo000oOoO/o00O0OOO;)V", "getShouldCreateCompositionOnAttachedToWindow", "shouldCreateCompositionOnAttachedToWindow", "getHasComposition", "hasComposition", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ui_release"}, k = 1, mv = {1, 6, 0})
public abstract class AbstractComposeView extends ViewGroup {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @Nullable
    public p100o000oOoO.o00O0OOO f6188Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @Nullable
    public WeakReference<p100o000oOoO.o00O0OOO> f6189Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public IBinder previousAttachedWindowToken;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Nullable
    public p100o000oOoO.o00O0OO f6191Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name and from kotlin metadata */
    public boolean showLayoutBounds;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f6193OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public boolean f6194OoooO0O;

    public static final class OooO00o extends Lambda implements Function2<p100o000oOoO.oOO00O, Integer, Unit> {
        public OooO00o() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(p100o000oOoO.oOO00O ooo00o, Integer num) {
            p100o000oOoO.oOO00O ooo00o2 = ooo00o;
            if ((num.intValue() & 11) == 2 && ooo00o2.OooOo0()) {
                ooo00o2.OooOoo0();
            } else {
                AbstractComposeView.this.OooO00o(ooo00o2, 8);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AbstractComposeView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AbstractComposeView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ AbstractComposeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, 0);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    @InternalComposeUiApi
    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    private final void setParentContext(p100o000oOoO.o00O0OOO o00o0ooo2) {
        if (this.f6188Oooo != o00o0ooo2) {
            this.f6188Oooo = o00o0ooo2;
            if (o00o0ooo2 != null) {
                this.f6189Oooo0o = null;
            }
            p100o000oOoO.o00O0OO o00o0oo2 = this.f6191Oooo0oo;
            if (o00o0oo2 != null) {
                o00o0oo2.dispose();
                this.f6191Oooo0oo = null;
                if (isAttachedToWindow()) {
                    OooO0o0();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.previousAttachedWindowToken != iBinder) {
            this.previousAttachedWindowToken = iBinder;
            this.f6189Oooo0o = null;
        }
    }

    public final p100o000oOoO.o00O0OOO OooO() {
        Recomposer recomposerOooO00o;
        p100o000oOoO.o00O0OOO o00o0ooo2 = this.f6188Oooo;
        if (o00o0ooo2 != null) {
            return o00o0ooo2;
        }
        Map<Context, StateFlow<Float>> map = o0O000Oo.f6580OooO00o;
        Intrinsics.checkNotNullParameter(this, "<this>");
        p100o000oOoO.o00O0OOO o00o0oooOooO0O0 = o0O000Oo.OooO0O0(this);
        if (o00o0oooOooO0O0 == null) {
            for (ViewParent parent = getParent(); o00o0oooOooO0O0 == null && (parent instanceof View); parent = parent.getParent()) {
                o00o0oooOooO0O0 = o0O000Oo.OooO0O0((View) parent);
            }
        }
        if (o00o0oooOooO0O0 != null) {
            p100o000oOoO.o00O0OOO o00o0ooo3 = OooO0oo(o00o0oooOooO0O0) ? o00o0oooOooO0O0 : null;
            if (o00o0ooo3 != null) {
                this.f6189Oooo0o = new WeakReference<>(o00o0ooo3);
            }
        } else {
            o00o0oooOooO0O0 = null;
        }
        if (o00o0oooOooO0O0 == null) {
            WeakReference<p100o000oOoO.o00O0OOO> weakReference = this.f6189Oooo0o;
            if (weakReference == null || (o00o0oooOooO0O0 = weakReference.get()) == null || !OooO0oo(o00o0oooOooO0O0)) {
                o00o0oooOooO0O0 = null;
            }
            if (o00o0oooOooO0O0 == null) {
                Intrinsics.checkNotNullParameter(this, "<this>");
                if (!isAttachedToWindow()) {
                    throw new IllegalStateException(("Cannot locate windowRecomposer; View " + this + " is not attached to a window").toString());
                }
                Object parent2 = getParent();
                View rootView = this;
                while (parent2 instanceof View) {
                    View view = (View) parent2;
                    if (view.getId() == 16908290) {
                        break;
                    }
                    rootView = view;
                    parent2 = view.getParent();
                }
                p100o000oOoO.o00O0OOO o00o0oooOooO0O1 = o0O000Oo.OooO0O0(rootView);
                if (o00o0oooOooO0O1 == null) {
                    o0O0000O o0o0000o2 = o0O0000O.f6570OooO00o;
                    Intrinsics.checkNotNullParameter(rootView, "rootView");
                    recomposerOooO00o = o0O0000O.f6571OooO0O0.get().OooO00o(rootView);
                    o0O000Oo.OooO0OO(rootView, recomposerOooO00o);
                    GlobalScope globalScope = GlobalScope.INSTANCE;
                    Handler handler = rootView.getHandler();
                    Intrinsics.checkNotNullExpressionValue(handler, "rootView.handler");
                    rootView.addOnAttachStateChangeListener(new o0(BuildersKt__Builders_commonKt.launch$default(globalScope, HandlerDispatcherKt.from(handler, "windowRecomposer cleanup").getImmediate(), null, new o0O00000(recomposerOooO00o, rootView, null), 2, null)));
                } else {
                    if (!(o00o0oooOooO0O1 instanceof Recomposer)) {
                        throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer".toString());
                    }
                    recomposerOooO00o = (Recomposer) o00o0oooOooO0O1;
                }
                Recomposer recomposer = OooO0oo(recomposerOooO00o) ? recomposerOooO00o : null;
                if (recomposer == null) {
                    return recomposerOooO00o;
                }
                this.f6189Oooo0o = new WeakReference<>(recomposer);
                return recomposerOooO00o;
            }
        }
        return o00o0oooOooO0O0;
    }

    @Composable
    public abstract void OooO00o(@Nullable p100o000oOoO.oOO00O ooo00o, int i);

    public final void OooO0O0() {
        if (this.f6194OoooO0O) {
            return;
        }
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Cannot add views to ");
        sbOooO0o0.append(getClass().getSimpleName());
        sbOooO0o0.append("; only Compose content is supported");
        throw new UnsupportedOperationException(sbOooO0o0.toString());
    }

    public final void OooO0OO() {
        if (!(this.f6188Oooo != null || isAttachedToWindow())) {
            throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.".toString());
        }
        OooO0o0();
    }

    public final void OooO0Oo() {
        p100o000oOoO.o00O0OO o00o0oo2 = this.f6191Oooo0oo;
        if (o00o0oo2 != null) {
            o00o0oo2.dispose();
        }
        this.f6191Oooo0oo = null;
        requestLayout();
    }

    public void OooO0o(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    public final void OooO0o0() {
        if (this.f6191Oooo0oo == null) {
            try {
                this.f6194OoooO0O = true;
                this.f6191Oooo0oo = o0O00OOO.OooO00o(this, OooO(), p043OooooO0.o00O0000.OooO0O0(-656146368, true, new OooO00o()));
            } finally {
                this.f6194OoooO0O = false;
            }
        }
    }

    public void OooO0oO(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    public final boolean OooO0oo(p100o000oOoO.o00O0OOO o00o0ooo2) {
        return !(o00o0ooo2 instanceof Recomposer) || ((Recomposer) o00o0ooo2).f5978OooOOOO.getValue().compareTo(Recomposer.State.ShuttingDown) > 0;
    }

    @Override // android.view.ViewGroup
    public final void addView(@Nullable View view) {
        OooO0O0();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(@Nullable View view, int i, @Nullable ViewGroup.LayoutParams layoutParams) {
        OooO0O0();
        return super.addViewInLayout(view, i, layoutParams);
    }

    public final boolean getHasComposition() {
        return this.f6191Oooo0oo != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.showLayoutBounds;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            OooO0o0();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        OooO0o(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        OooO0o0();
        OooO0oO(i, i2);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        childAt.setLayoutDirection(i);
    }

    public final void setParentCompositionContext(@Nullable p100o000oOoO.o00O0OOO parent) {
        setParentContext(parent);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.showLayoutBounds = z;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((o000000.o00000) childAt).setShowLayoutBounds(z);
        }
    }

    public final void setViewCompositionStrategy(@NotNull o00OOOO0 strategy) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Function0<Unit> function0 = this.f6193OoooO00;
        if (function0 != null) {
            function0.invoke();
        }
        this.f6193OoooO00 = strategy.OooO00o(this);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AbstractComposeView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        setClipChildren(false);
        setClipToPadding(false);
        Intrinsics.checkNotNullParameter(this, "view");
        o0o0Oo o0o0oo = new o0o0Oo(this);
        addOnAttachStateChangeListener(o0o0oo);
        o00000O0 listener = new o00000O0();
        int i2 = o000OO00.OooO00o.f28231OooO00o;
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(listener, "listener");
        int i3 = o000OO00.OooO00o.f28231OooO00o;
        o000OO00.OooO0OO oooO0OO = (o000OO00.OooO0OO) getTag(i3);
        if (oooO0OO == null) {
            oooO0OO = new o000OO00.OooO0OO();
            setTag(i3, oooO0OO);
        }
        Intrinsics.checkNotNullParameter(listener, "listener");
        oooO0OO.f28233OooO00o.add(listener);
        this.f6193OoooO00 = new o00OOO0O(this, o0o0oo, listener);
    }

    @Override // android.view.ViewGroup
    public final void addView(@Nullable View view, int i) {
        OooO0O0();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(@Nullable View view, int i, @Nullable ViewGroup.LayoutParams layoutParams, boolean z) {
        OooO0O0();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public final void addView(@Nullable View view, int i, int i2) {
        OooO0O0();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(@Nullable View view, @Nullable ViewGroup.LayoutParams layoutParams) {
        OooO0O0();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(@Nullable View view, int i, @Nullable ViewGroup.LayoutParams layoutParams) {
        OooO0O0();
        super.addView(view, i, layoutParams);
    }
}
