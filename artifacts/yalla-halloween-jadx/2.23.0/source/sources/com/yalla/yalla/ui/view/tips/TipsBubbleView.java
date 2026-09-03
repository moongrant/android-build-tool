package com.yalla.yalla.ui.view.tips;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000O0Oo;
import com.code.android.util.o0000O0;
import com.code.android.util.o0000O00;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.yalla.yalla.ui.view.tips.TipsBubbleView;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p568o0oOoO.o0OOO0OO;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p591o0oo000O.OooO;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001dB\u0011\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017B\u0019\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0016\u0010\u001aB!\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u001cJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rJ\u000e\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010J\u0006\u0010\u0013\u001a\u00020\n¨\u0006\u001e"}, d2 = {"Lcom/yalla/yalla/ui/view/tips/TipsBubbleView;", "Landroid/widget/LinearLayout;", "Landroid/view/View$OnClickListener;", "", "content", "", "setContent", "", "gravity", "setTriangleGravity", "Landroid/view/View;", "anchor", "setAnchorView", "Landroid/view/ViewGroup;", "root", "setRootView", "Lcom/yalla/yalla/ui/view/tips/TipsBubbleView$OooO00o;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setDismissListener", "getTriangleView", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class TipsBubbleView extends LinearLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final /* synthetic */ int f31373OooOOO = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f31374OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f31375OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final View f31376OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final View f31377OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final TextView f31378OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final View f31379OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public View f31380OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public ViewGroup f31381OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f31382OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public OooO00o f31383OooOOO0;

    public interface OooO00o {
        void OooO00o();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TipsBubbleView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f31375OooO0Oo = o0000O0.OooO00o(5.0f);
        this.f31374OooO = 17;
        LayoutInflater.from(getContext()).inflate(oO00OO0O.layout_tips_bubble, (ViewGroup) this, true);
        View viewFindViewById = findViewById(oO00O0oO.tips_bubble_triangle_upward);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(R.id.tips_bubble_triangle_upward)");
        this.f31377OooO0o0 = viewFindViewById;
        View viewFindViewById2 = findViewById(oO00O0oO.tips_bubble_triangle_downward);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(R.id.tips_bubble_triangle_downward)");
        this.f31376OooO0o = viewFindViewById2;
        View viewFindViewById3 = findViewById(oO00O0oO.tips_bubble_content);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(R.id.tips_bubble_content)");
        this.f31379OooO0oo = viewFindViewById3;
        View viewFindViewById4 = findViewById(oO00O0oO.tv_tips_bubble_content);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(R.id.tv_tips_bubble_content)");
        this.f31378OooO0oO = (TextView) viewFindViewById4;
        View viewFindViewById5 = findViewById(oO00O0oO.tv_tips_bubble_ok);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(R.id.tv_tips_bubble_ok)");
        ((TextView) viewFindViewById5).setOnClickListener(this);
        setOrientation(1);
    }

    public final void OooO00o(boolean z) {
        int i = z ? 0 : 8;
        View view = this.f31376OooO0o;
        view.setVisibility(i);
        int i2 = z ? 8 : 0;
        View view2 = this.f31377OooO0o0;
        view2.setVisibility(i2);
        setVisibility(0);
        if (z) {
            ViewGroup.LayoutParams layoutParams = this.f31379OooO0oo.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            ((LinearLayout.LayoutParams) layoutParams).topMargin = 0;
        }
        if (this.f31380OooOO0 == null || this.f31381OooOO0O == null) {
            if (!z) {
                view = view2;
            }
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(view.getLayoutParams());
            layoutParams2.gravity = 1;
            view.setLayoutParams(layoutParams2);
        } else {
            getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: o0oOoO.o0OOo000
                /* JADX WARN: Code duplicated, block: B:22:0x00a5  */
                /* JADX WARN: Code duplicated, block: B:24:0x00a9  */
                /* JADX WARN: Code duplicated, block: B:25:0x00b1  */
                /* JADX WARN: Code duplicated, block: B:26:0x00bf  */
                /* JADX WARN: Code duplicated, block: B:28:0x00c2  */
                /* JADX WARN: Code duplicated, block: B:29:0x00ce  */
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    int i3;
                    int i4;
                    int i5;
                    int i6;
                    int i7 = TipsBubbleView.f31373OooOOO;
                    TipsBubbleView this$0 = this.f56217OooO0Oo;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    if (this$0.f31382OooOO0o) {
                        return true;
                    }
                    View view3 = this$0.f31376OooO0o;
                    if (view3.getVisibility() == 8) {
                        view3 = this$0.f31377OooO0o0;
                    }
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    View view4 = this$0.f31380OooOO0;
                    if (view4 != null) {
                        view4.getLocationInWindow(iArr);
                    }
                    this$0.getLocationInWindow(iArr2);
                    int iAbs = Math.abs(iArr[0] - iArr2[0]);
                    int iAbs2 = Math.abs(iArr[1] - iArr2[1]);
                    View view5 = this$0.f31380OooOO0;
                    Intrinsics.checkNotNull(view5);
                    int measuredWidth = view5.getMeasuredWidth();
                    View view6 = this$0.f31380OooOO0;
                    Intrinsics.checkNotNull(view6);
                    int measuredHeight = view6.getMeasuredHeight();
                    int measuredWidth2 = this$0.getMeasuredWidth();
                    int measuredHeight2 = this$0.getMeasuredHeight();
                    int measuredWidth3 = view3.getMeasuredWidth();
                    int iOooO0O0 = o0000O00.OooO0O0();
                    int i8 = this$0.f31374OooO;
                    ViewGroup viewGroup = this$0.f31381OooOO0O;
                    Intrinsics.checkNotNull(viewGroup);
                    WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
                    int absoluteGravity = Gravity.getAbsoluteGravity(i8, ViewCompat.OooO.OooO0Oo(viewGroup)) & 7;
                    int i9 = this$0.f31374OooO & 112;
                    boolean zOooO0o0 = OooO.OooO0o0();
                    if (absoluteGravity == 3) {
                        if (zOooO0o0) {
                            i5 = (iOooO0O0 - iArr[0]) - measuredWidth2;
                            i6 = (measuredWidth2 - (measuredWidth / 2)) - (measuredWidth3 / 2);
                        } else {
                            i3 = measuredWidth / 2;
                            i4 = measuredWidth3 / 2;
                            i5 = iAbs;
                            i6 = i3 - i4;
                        }
                    } else if (absoluteGravity != 5) {
                        if (absoluteGravity != 8388611) {
                            if (absoluteGravity != 8388613) {
                                iAbs = (iOooO0O0 / 2) - (measuredWidth2 / 2);
                                if (zOooO0o0) {
                                    i3 = (measuredWidth / 2) + (((iOooO0O0 - iArr[0]) - measuredWidth) - iAbs);
                                    i4 = measuredWidth3 / 2;
                                } else {
                                    i3 = (measuredWidth / 2) + (iArr[0] - iAbs);
                                    i4 = measuredWidth3 / 2;
                                }
                            } else if (zOooO0o0) {
                                iAbs = (iOooO0O0 - measuredWidth) - iArr[0];
                                i3 = measuredWidth / 2;
                                i4 = measuredWidth3 / 2;
                            } else {
                                i6 = (measuredWidth2 - (measuredWidth / 2)) - (measuredWidth3 / 2);
                                i5 = (iArr[0] + measuredWidth) - (iArr2[0] + measuredWidth2);
                            }
                        } else if (zOooO0o0) {
                            i5 = (iOooO0O0 - iArr[0]) - measuredWidth2;
                            i6 = (measuredWidth2 - (measuredWidth / 2)) - (measuredWidth3 / 2);
                        } else {
                            i3 = measuredWidth / 2;
                            i4 = measuredWidth3 / 2;
                        }
                        i5 = iAbs;
                        i6 = i3 - i4;
                    } else if (zOooO0o0) {
                        iAbs = (iOooO0O0 - measuredWidth) - iArr[0];
                        i3 = measuredWidth / 2;
                        i4 = measuredWidth3 / 2;
                        i5 = iAbs;
                        i6 = i3 - i4;
                    } else {
                        i6 = (measuredWidth2 - (measuredWidth / 2)) - (measuredWidth3 / 2);
                        i5 = (iArr[0] + measuredWidth) - (iArr2[0] + measuredWidth2);
                    }
                    int i10 = this$0.f31375OooO0Oo;
                    int i11 = i9 != 48 ? iAbs2 + measuredHeight + i10 : (iAbs2 - measuredHeight2) - i10;
                    float f = i6;
                    if (zOooO0o0) {
                        f = -f;
                    }
                    view3.setTranslationX(f);
                    if (zOooO0o0) {
                        this$0.setPadding(0, i11, i5, 0);
                    } else {
                        this$0.setPadding(i5, i11, 0, 0);
                    }
                    this$0.f31382OooOO0o = true;
                    return true;
                }
            });
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "translationY", 0.0f, o0000O0.OooO00o(4.0f));
        objectAnimatorOfFloat.setInterpolator(new o0OOO0OO());
        objectAnimatorOfFloat.setDuration(1000L);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.start();
    }

    @NotNull
    public final View getTriangleView() {
        View view = this.f31376OooO0o;
        return view.getVisibility() == 8 ? this.f31377OooO0o0 : view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) {
        OooO00o oooO00o = this.f31383OooOOO0;
        if (oooO00o != null) {
            oooO00o.OooO00o();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setVisibility(8);
    }

    public final void setAnchorView(@NotNull View anchor) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        this.f31380OooOO0 = anchor;
    }

    public final void setContent(@NotNull CharSequence content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f31378OooO0oO.setText(content);
    }

    public final void setDismissListener(@NotNull OooO00o listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f31383OooOOO0 = listener;
    }

    public final void setRootView(@NotNull ViewGroup root) {
        Intrinsics.checkNotNullParameter(root, "root");
        this.f31381OooOO0O = root;
    }

    public final void setTriangleGravity(int gravity) {
        this.f31374OooO = gravity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TipsBubbleView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f31375OooO0Oo = o0000O0.OooO00o(5.0f);
        this.f31374OooO = 17;
        LayoutInflater.from(getContext()).inflate(oO00OO0O.layout_tips_bubble, (ViewGroup) this, true);
        View viewFindViewById = findViewById(oO00O0oO.tips_bubble_triangle_upward);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(R.id.tips_bubble_triangle_upward)");
        this.f31377OooO0o0 = viewFindViewById;
        View viewFindViewById2 = findViewById(oO00O0oO.tips_bubble_triangle_downward);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(R.id.tips_bubble_triangle_downward)");
        this.f31376OooO0o = viewFindViewById2;
        View viewFindViewById3 = findViewById(oO00O0oO.tips_bubble_content);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(R.id.tips_bubble_content)");
        this.f31379OooO0oo = viewFindViewById3;
        View viewFindViewById4 = findViewById(oO00O0oO.tv_tips_bubble_content);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(R.id.tv_tips_bubble_content)");
        this.f31378OooO0oO = (TextView) viewFindViewById4;
        View viewFindViewById5 = findViewById(oO00O0oO.tv_tips_bubble_ok);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(R.id.tv_tips_bubble_ok)");
        ((TextView) viewFindViewById5).setOnClickListener(this);
        setOrientation(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TipsBubbleView(@NotNull Context context, @NotNull AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f31375OooO0Oo = o0000O0.OooO00o(5.0f);
        this.f31374OooO = 17;
        LayoutInflater.from(getContext()).inflate(oO00OO0O.layout_tips_bubble, (ViewGroup) this, true);
        View viewFindViewById = findViewById(oO00O0oO.tips_bubble_triangle_upward);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(R.id.tips_bubble_triangle_upward)");
        this.f31377OooO0o0 = viewFindViewById;
        View viewFindViewById2 = findViewById(oO00O0oO.tips_bubble_triangle_downward);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(R.id.tips_bubble_triangle_downward)");
        this.f31376OooO0o = viewFindViewById2;
        View viewFindViewById3 = findViewById(oO00O0oO.tips_bubble_content);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(R.id.tips_bubble_content)");
        this.f31379OooO0oo = viewFindViewById3;
        View viewFindViewById4 = findViewById(oO00O0oO.tv_tips_bubble_content);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(R.id.tv_tips_bubble_content)");
        this.f31378OooO0oO = (TextView) viewFindViewById4;
        View viewFindViewById5 = findViewById(oO00O0oO.tv_tips_bubble_ok);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(R.id.tv_tips_bubble_ok)");
        ((TextView) viewFindViewById5).setOnClickListener(this);
        setOrientation(1);
    }
}
