package com.yalla.yalla.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o0000;
import com.code.android.util.o000OO00;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p519o0o0O0oO.q0;
import p584o0oOooO0.oO00OOo0;
import p641o0ooOOOO.a2;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0017B'\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/yalla/yalla/ui/view/EmptyView;", "Landroid/widget/LinearLayout;", "", "resId", "", "setImage", "(Ljava/lang/Integer;)V", "", "content", "setText", "Lo0ooOOOO/a2;", "OooO0Oo", "Lo0ooOOOO/a2;", "getBinding", "()Lo0ooOOOO/a2;", "binding", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "State", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class EmptyView extends LinearLayout {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final /* synthetic */ int f30392OooO0oo = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final a2 binding;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public String f30394OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @DrawableRes
    @Nullable
    public Integer f30395OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f30396OooO0oO;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[State.DataError.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[State.DataNull.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/ui/view/EmptyView$State;", "", "", "code", "I", "getCode", "()I", "DataError", "DataNull", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
    public enum State {
        DataError(-1),
        DataNull(0);

        private final int code;

        State(int i) {
            this.code = i;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public EmptyView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void OooO00o(EmptyView emptyView, Function0 function0) {
        String strOooO0OO = o0000.OooO0OO(oO00OOo0.Try_again);
        emptyView.f30396OooO0oO = function0;
        boolean z = strOooO0OO == null || strOooO0OO.length() == 0;
        a2 a2Var = emptyView.binding;
        if (z) {
            Button button = a2Var.f57465OooO0O0;
            Intrinsics.checkNotNullExpressionValue(button, "binding.button");
            o000OO00.OooO0O0(button);
        } else {
            Button button2 = a2Var.f57465OooO0O0;
            Intrinsics.checkNotNullExpressionValue(button2, "binding.button");
            o000OO00.OooOOOO(button2);
            Button button3 = a2Var.f57465OooO0O0;
            button3.setText(strOooO0OO);
            button3.setOnClickListener(new q0(function0, 1));
        }
    }

    public final void OooO0O0(@NotNull State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        int i = OooO00o.$EnumSwitchMapping$0[state.ordinal()];
        boolean z = true;
        a2 a2Var = this.binding;
        if (i == 1) {
            ImageView imageView = a2Var.f57466OooO0OO;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.image");
            o000OO00.OooO0O0(imageView);
            TextView textView = a2Var.f57467OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.text");
            o000OO00.OooOOOO(textView);
            a2Var.f57467OooO0Oo.setText(o0000.OooO0OO(oO00OOo0.Network_request_failed));
            if (this.f30396OooO0oO != null) {
                Button button = a2Var.f57465OooO0O0;
                Intrinsics.checkNotNullExpressionValue(button, "binding.button");
                o000OO00.OooOOOO(button);
                return;
            }
            return;
        }
        if (i != 2) {
            return;
        }
        Integer num = this.f30395OooO0o0;
        if (num != null) {
            int iIntValue = num.intValue();
            ImageView imageView2 = a2Var.f57466OooO0OO;
            Intrinsics.checkNotNullExpressionValue(imageView2, "binding.image");
            o000OO00.OooOOOO(imageView2);
            a2Var.f57466OooO0OO.setImageResource(iIntValue);
        }
        String str = this.f30394OooO0o;
        if (str != null && str.length() != 0) {
            z = false;
        }
        if (!z) {
            TextView textView2 = a2Var.f57467OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(textView2, "binding.text");
            o000OO00.OooOOOO(textView2);
            a2Var.f57467OooO0Oo.setText(this.f30394OooO0o);
        }
        Button button2 = a2Var.f57465OooO0O0;
        Intrinsics.checkNotNullExpressionValue(button2, "binding.button");
        o000OO00.OooO0O0(button2);
    }

    @NotNull
    public final a2 getBinding() {
        return this.binding;
    }

    public final void setImage(@DrawableRes @Nullable Integer resId) {
        this.f30395OooO0o0 = resId;
        a2 a2Var = this.binding;
        if (resId != null) {
            int iIntValue = resId.intValue();
            ImageView imageView = a2Var.f57466OooO0OO;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.image");
            o000OO00.OooOOOO(imageView);
            a2Var.f57466OooO0OO.setImageResource(iIntValue);
        }
        if (this.f30395OooO0o0 == null) {
            ImageView imageView2 = a2Var.f57466OooO0OO;
            Intrinsics.checkNotNullExpressionValue(imageView2, "binding.image");
            o000OO00.OooO0O0(imageView2);
        }
    }

    public final void setText(@Nullable String content) {
        this.f30394OooO0o = content;
        boolean z = content == null || content.length() == 0;
        a2 a2Var = this.binding;
        if (z) {
            TextView textView = a2Var.f57467OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.text");
            o000OO00.OooO0O0(textView);
        } else {
            TextView textView2 = a2Var.f57467OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(textView2, "binding.text");
            o000OO00.OooOOOO(textView2);
            a2Var.f57467OooO0Oo.setText(this.f30394OooO0o);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public EmptyView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ EmptyView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public EmptyView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        a2 a2VarInflate = a2.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(a2VarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.binding = a2VarInflate;
        State state = State.DataError;
        a2VarInflate.f57466OooO0OO.setImageDrawable(null);
        a2VarInflate.f57467OooO0Oo.setText("");
        a2VarInflate.f57465OooO0O0.setText("");
    }
}
