package com.code.android.uikit.marquee;

import android.content.Context;
import android.text.TextDirectionHeuristic;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o000O00O;
import com.code.android.util.o0ooOOo;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\tH\u0016¨\u0006\u0012"}, d2 = {"Lcom/code/android/uikit/marquee/MarqueeText;", "Landroidx/appcompat/widget/AppCompatTextView;", "", "isLTR", "", "setLeftToRight", "", "getLayoutDirection", "getTextDirection", "Landroid/text/TextDirectionHeuristic;", "getTextDirectionHeuristic", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "YLUIKit_release"}, k = 1, mv = {1, 9, 0})
public final class MarqueeText extends AppCompatTextView {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f13209OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f13210OooOO0o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MarqueeText(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void OooOO0o(MarqueeText marqueeText) {
        o0ooOOo o0ooooo = o000O00O.f13424OooO0Oo;
        if (o0ooooo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ltrCheckListener");
            o0ooooo = null;
        }
        marqueeText.setLeftToRight(!o0ooooo.OooO00o());
    }

    @Override // android.view.View
    public int getLayoutDirection() {
        return this.f13209OooOO0O;
    }

    @Override // android.view.View
    public int getTextDirection() {
        return this.f13210OooOO0o;
    }

    @Override // android.widget.TextView
    @NotNull
    public TextDirectionHeuristic getTextDirectionHeuristic() {
        TextDirectionHeuristic textDirectionHeuristic = super.getTextDirectionHeuristic();
        Intrinsics.checkNotNullExpressionValue(textDirectionHeuristic, "getTextDirectionHeuristic(...)");
        return textDirectionHeuristic;
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return true;
    }

    public final void setLeftToRight(boolean isLTR) {
        this.f13209OooOO0O = !isLTR ? 1 : 0;
        this.f13210OooOO0o = isLTR ? 3 : 4;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MarqueeText(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ MarqueeText(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MarqueeText(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f13209OooOO0O = 1;
        this.f13210OooOO0o = 4;
    }
}
