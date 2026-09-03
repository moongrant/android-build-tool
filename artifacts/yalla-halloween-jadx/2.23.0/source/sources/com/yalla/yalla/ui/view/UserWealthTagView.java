package com.yalla.yalla.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o0000O0;
import com.code.android.util.o000OO00;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p641o0ooOOOO.ec;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001b\u0010\u000b\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/yalla/yalla/ui/view/UserWealthTagView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "sizeDp", "", "setTextSize", "Lo0ooOOOO/ec;", "OooO0Oo", "Lkotlin/Lazy;", "getBinding", "()Lo0ooOOOO/ec;", "binding", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class UserWealthTagView extends ConstraintLayout {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final /* synthetic */ int f30812OooO0o0 = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy binding;

    public static final class OooO00o extends Lambda implements Function0<ec> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Context f30814OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ UserWealthTagView f30815OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Context context, UserWealthTagView userWealthTagView) {
            super(0);
            this.f30814OooO0Oo = context;
            this.f30815OooO0o0 = userWealthTagView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ec invoke() {
            ec ecVarInflate = ec.inflate(LayoutInflater.from(this.f30814OooO0Oo), this.f30815OooO0o0, true);
            Intrinsics.checkNotNullExpressionValue(ecVarInflate, "inflate(LayoutInflater.from(context), this, true)");
            return ecVarInflate;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UserWealthTagView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final ec getBinding() {
        return (ec) this.binding.getValue();
    }

    public final void OooO0O0(@Nullable LifecycleOwner lifecycleOwner, @Nullable Integer num, @Nullable String str, float f) {
        getBinding().f57867OooO0O0.setImageDrawable(null);
        o000OO00.OooO0O0(this);
        if (num != null) {
            num.intValue();
            if (num.intValue() >= 1) {
                o000OO00.OooOOOO(this);
                getBinding().f57868OooO0OO.setText(num.toString());
                if (str != null) {
                    SVGAView it = getBinding().f57867OooO0O0;
                    it.clearAnimation();
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    o000OO00.OooOOOO(it);
                    it.OooOO0O(str, lifecycleOwner);
                    it.OooOO0o();
                    SVGAView sVGAView = getBinding().f57867OooO0O0;
                    Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.svga");
                    Intrinsics.checkNotNullParameter(sVGAView, "<this>");
                    sVGAView.setRotationY(o000OO00.OooO0Oo(sVGAView) ? 0.0f : 180.0f);
                }
                getBinding().f57868OooO0OO.setTextSize(f);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setTextSize(float sizeDp) {
        TextView textView = getBinding().f57868OooO0OO;
        Integer numValueOf = Integer.valueOf(o0000O0.OooO00o(sizeDp));
        float fDoubleValue = 0.0f;
        try {
            if (numValueOf instanceof Integer) {
                fDoubleValue = numValueOf.intValue();
            } else if (numValueOf instanceof Long) {
                fDoubleValue = numValueOf.longValue();
            } else if (numValueOf instanceof Double) {
                fDoubleValue = (float) numValueOf.doubleValue();
            } else if (numValueOf instanceof String) {
                fDoubleValue = Float.parseFloat((String) numValueOf);
            }
        } catch (Exception unused) {
        }
        textView.setTextSize(fDoubleValue);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UserWealthTagView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ UserWealthTagView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UserWealthTagView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = LazyKt.lazy(new OooO00o(context, this));
    }
}
