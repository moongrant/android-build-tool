package com.app.base.view.tips;

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
import com.app.base.view.tips.TipsBubbleView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOo00;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o000O0O0.o00000O;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p168o00Ooo0.oo000o;
import p189o00o00oO.o0Oo0oo;
import p206o00o0o0o.o000OO0O;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001dB\u0011\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017B\u0019\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0016\u0010\u001aB!\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u001cJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rJ\u000e\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010J\u0006\u0010\u0013\u001a\u00020\n¨\u0006\u001e"}, d2 = {"Lcom/app/base/view/tips/TipsBubbleView;", "Landroid/widget/LinearLayout;", "Landroid/view/View$OnClickListener;", "", "content", "", "setContent", "", "gravity", "setTriangleGravity", "Landroid/view/View;", "anchor", "setAnchorView", "Landroid/view/ViewGroup;", "root", "setRootView", "Lcom/app/base/view/tips/TipsBubbleView$OooO00o;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setDismissListener", "getTriangleView", "Landroid/content/Context;", d.R, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class TipsBubbleView extends LinearLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public static final /* synthetic */ int f12240OoooOOO = 0;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NotNull
    public final TextView f12241Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final int f12242Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final View f12243Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public final View f12244Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @Nullable
    public ViewGroup f12245OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public int f12246OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @NotNull
    public final View f12247OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @Nullable
    public View f12248OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public boolean f12249OoooOO0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @Nullable
    public OooO00o f12250o000oOoO;

    public interface OooO00o {
        void OooO00o();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TipsBubbleView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f12242Oooo0o = OooOo00.OooO00o(5.0f);
        this.f12246OoooO0 = 17;
        LayoutInflater.from(getContext()).inflate(R.layout.layout_tips_bubble, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R.id.tips_bubble_triangle_upward);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(R.id.tips_bubble_triangle_upward)");
        this.f12243Oooo0oO = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.tips_bubble_triangle_downward);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(R.id.tips_bubble_triangle_downward)");
        this.f12244Oooo0oo = viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.tips_bubble_content);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(R.id.tips_bubble_content)");
        this.f12247OoooO00 = viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.tv_tips_bubble_content);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(R.id.tv_tips_bubble_content)");
        this.f12241Oooo = (TextView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.tv_tips_bubble_ok);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(R.id.tv_tips_bubble_ok)");
        ((TextView) viewFindViewById5).setOnClickListener(this);
        setOrientation(1);
    }

    public final void OooO00o(boolean z) {
        this.f12244Oooo0oo.setVisibility(z ? 0 : 8);
        this.f12243Oooo0oO.setVisibility(z ? 8 : 0);
        setVisibility(0);
        if (z) {
            ViewGroup.LayoutParams layoutParams = this.f12247OoooO00.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            ((LinearLayout.LayoutParams) layoutParams).topMargin = 0;
        }
        if (this.f12248OoooO0O == null || this.f12245OoooO == null) {
            View view = z ? this.f12244Oooo0oo : this.f12243Oooo0oO;
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(view.getLayoutParams());
            layoutParams2.gravity = 1;
            view.setLayoutParams(layoutParams2);
        } else {
            getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: o00o00oO.o000000
                /* JADX WARN: Code duplicated, block: B:23:0x00a8  */
                /* JADX WARN: Code duplicated, block: B:25:0x00ac  */
                /* JADX WARN: Code duplicated, block: B:26:0x00b4  */
                /* JADX WARN: Code duplicated, block: B:27:0x00c2  */
                /* JADX WARN: Code duplicated, block: B:29:0x00c5  */
                /* JADX WARN: Code duplicated, block: B:30:0x00d1  */
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    int i;
                    int i2;
                    int i3;
                    int i4;
                    int i5;
                    int i6;
                    int i7;
                    TipsBubbleView this$0 = this.f33047Oooo0o;
                    int i8 = TipsBubbleView.f12240OoooOOO;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    if (this$0.f12249OoooOO0) {
                        return true;
                    }
                    View view2 = this$0.f12244Oooo0oo.getVisibility() == 8 ? this$0.f12243Oooo0oO : this$0.f12244Oooo0oo;
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    View view3 = this$0.f12248OoooO0O;
                    if (view3 != null) {
                        view3.getLocationInWindow(iArr);
                    }
                    this$0.getLocationInWindow(iArr2);
                    int iAbs = Math.abs(iArr[0] - iArr2[0]);
                    int iAbs2 = Math.abs(iArr[1] - iArr2[1]);
                    View view4 = this$0.f12248OoooO0O;
                    Intrinsics.checkNotNull(view4);
                    int measuredWidth = view4.getMeasuredWidth();
                    View view5 = this$0.f12248OoooO0O;
                    Intrinsics.checkNotNull(view5);
                    int measuredHeight = view5.getMeasuredHeight();
                    int measuredWidth2 = this$0.getMeasuredWidth();
                    int measuredHeight2 = this$0.getMeasuredHeight();
                    int measuredWidth3 = view2.getMeasuredWidth();
                    int iOooO0oo = o000OO0O.OooO0oo();
                    int i9 = this$0.f12246OoooO0;
                    ViewGroup viewGroup = this$0.f12245OoooO;
                    Intrinsics.checkNotNull(viewGroup);
                    WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                    int absoluteGravity = Gravity.getAbsoluteGravity(i9, ViewCompat.OooO.OooO0Oo(viewGroup)) & 7;
                    int i10 = this$0.f12246OoooO0 & 112;
                    boolean zOooO0o0 = oo000o.OooO0o0();
                    if (absoluteGravity == 3) {
                        if (zOooO0o0) {
                            i3 = (iOooO0oo - iArr[0]) - measuredWidth2;
                            i4 = (measuredWidth2 - (measuredWidth / 2)) - (measuredWidth3 / 2);
                        } else {
                            i = measuredWidth / 2;
                            i2 = measuredWidth3 / 2;
                            i3 = iAbs;
                            i4 = i - i2;
                        }
                    } else if (absoluteGravity != 5) {
                        if (absoluteGravity != 8388611) {
                            if (absoluteGravity != 8388613) {
                                iAbs = (iOooO0oo / 2) - (measuredWidth2 / 2);
                                if (zOooO0o0) {
                                    i = (measuredWidth / 2) + (((iOooO0oo - iArr[0]) - measuredWidth) - iAbs);
                                    i2 = measuredWidth3 / 2;
                                } else {
                                    i = (measuredWidth / 2) + (iArr[0] - iAbs);
                                    i2 = measuredWidth3 / 2;
                                }
                            } else if (zOooO0o0) {
                                iAbs = (iOooO0oo - measuredWidth) - iArr[0];
                                i = measuredWidth / 2;
                                i2 = measuredWidth3 / 2;
                            } else {
                                i4 = (measuredWidth2 - (measuredWidth / 2)) - (measuredWidth3 / 2);
                                i3 = (iArr[0] + measuredWidth) - (iArr2[0] + measuredWidth2);
                            }
                        } else if (zOooO0o0) {
                            i3 = (iOooO0oo - iArr[0]) - measuredWidth2;
                            i4 = (measuredWidth2 - (measuredWidth / 2)) - (measuredWidth3 / 2);
                        } else {
                            i = measuredWidth / 2;
                            i2 = measuredWidth3 / 2;
                        }
                        i3 = iAbs;
                        i4 = i - i2;
                    } else if (zOooO0o0) {
                        iAbs = (iOooO0oo - measuredWidth) - iArr[0];
                        i = measuredWidth / 2;
                        i2 = measuredWidth3 / 2;
                        i3 = iAbs;
                        i4 = i - i2;
                    } else {
                        i4 = (measuredWidth2 - (measuredWidth / 2)) - (measuredWidth3 / 2);
                        i3 = (iArr[0] + measuredWidth) - (iArr2[0] + measuredWidth2);
                    }
                    if (i10 != 48) {
                        if (i10 != 80) {
                            i6 = iAbs2 + measuredHeight;
                            i7 = this$0.f12242Oooo0o;
                        } else {
                            i6 = iAbs2 + measuredHeight;
                            i7 = this$0.f12242Oooo0o;
                        }
                        i5 = i6 + i7;
                    } else {
                        i5 = (iAbs2 - measuredHeight2) - this$0.f12242Oooo0o;
                    }
                    float f = i4;
                    if (zOooO0o0) {
                        f = -f;
                    }
                    view2.setTranslationX(f);
                    if (zOooO0o0) {
                        this$0.setPadding(0, i5, i3, 0);
                    } else {
                        this$0.setPadding(i3, i5, 0, 0);
                    }
                    this$0.f12249OoooOO0 = true;
                    return true;
                }
            });
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "translationY", ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, OooOo00.OooO00o(4.0f));
        objectAnimatorOfFloat.setInterpolator(new o0Oo0oo());
        objectAnimatorOfFloat.setDuration(1000L);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.start();
    }

    @NotNull
    public final View getTriangleView() {
        return this.f12244Oooo0oo.getVisibility() == 8 ? this.f12243Oooo0oO : this.f12244Oooo0oo;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) {
        OooO00o oooO00o = this.f12250o000oOoO;
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
        this.f12248OoooO0O = anchor;
    }

    public final void setContent(@NotNull CharSequence content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f12241Oooo.setText(content);
    }

    public final void setDismissListener(@NotNull OooO00o listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f12250o000oOoO = listener;
    }

    public final void setRootView(@NotNull ViewGroup root) {
        Intrinsics.checkNotNullParameter(root, "root");
        this.f12245OoooO = root;
    }

    public final void setTriangleGravity(int gravity) {
        this.f12246OoooO0 = gravity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TipsBubbleView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f12242Oooo0o = OooOo00.OooO00o(5.0f);
        this.f12246OoooO0 = 17;
        LayoutInflater.from(getContext()).inflate(R.layout.layout_tips_bubble, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R.id.tips_bubble_triangle_upward);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(R.id.tips_bubble_triangle_upward)");
        this.f12243Oooo0oO = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.tips_bubble_triangle_downward);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(R.id.tips_bubble_triangle_downward)");
        this.f12244Oooo0oo = viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.tips_bubble_content);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(R.id.tips_bubble_content)");
        this.f12247OoooO00 = viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.tv_tips_bubble_content);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(R.id.tv_tips_bubble_content)");
        this.f12241Oooo = (TextView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.tv_tips_bubble_ok);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(R.id.tv_tips_bubble_ok)");
        ((TextView) viewFindViewById5).setOnClickListener(this);
        setOrientation(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TipsBubbleView(@NotNull Context context, @NotNull AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f12242Oooo0o = OooOo00.OooO00o(5.0f);
        this.f12246OoooO0 = 17;
        LayoutInflater.from(getContext()).inflate(R.layout.layout_tips_bubble, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R.id.tips_bubble_triangle_upward);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(R.id.tips_bubble_triangle_upward)");
        this.f12243Oooo0oO = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.tips_bubble_triangle_downward);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(R.id.tips_bubble_triangle_downward)");
        this.f12244Oooo0oo = viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.tips_bubble_content);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(R.id.tips_bubble_content)");
        this.f12247OoooO00 = viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.tv_tips_bubble_content);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(R.id.tv_tips_bubble_content)");
        this.f12241Oooo = (TextView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.tv_tips_bubble_ok);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(R.id.tv_tips_bubble_ok)");
        ((TextView) viewFindViewById5).setOnClickListener(this);
        setOrientation(1);
    }
}
