package com.yalla.yalla.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o000O;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p562o0oOo000.o00000;
import p562o0oOo000.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/yalla/yalla/ui/view/DotView;", "Landroidx/appcompat/widget/AppCompatTextView;", "", "number", "", "setNumber", "(Ljava/lang/Integer;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attr", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class DotView extends AppCompatTextView {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f29838OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f29839OooOO0o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DotView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void OooOO0o(boolean z) {
        this.f29838OooOO0O = z;
        OooOOO0();
    }

    public final void OooOOO0() {
        int i = this.f29839OooOO0o;
        if (i > 99) {
            setText("...");
            setBackgroundResource(o0Oo0oo.bg_red_point_oval);
            o000O.OooOOOO(this);
        } else if (i > 0) {
            setText(String.valueOf(i));
            setBackgroundResource(o0Oo0oo.bg_red_point_circle);
            o000O.OooOOOO(this);
        } else {
            if (i > 0 || !this.f29838OooOO0O) {
                o000O.OooO0OO(this);
                return;
            }
            setBackgroundResource(o0Oo0oo.bg_red_point);
            setText("");
            o000O.OooOOOO(this);
        }
    }

    public final void setNumber(@Nullable Integer number) {
        this.f29839OooOO0o = number != null ? number.intValue() : 0;
        OooOOO0();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DotView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ DotView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DotView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        setIncludeFontPadding(false);
        setSingleLine();
        setGravity(17);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, o00000.DotView);
        this.f29838OooOO0O = typedArrayObtainStyledAttributes.getBoolean(o00000.DotView_isPoint, false);
        this.f29839OooOO0o = typedArrayObtainStyledAttributes.getInteger(o00000.DotView_number, 0);
        typedArrayObtainStyledAttributes.recycle();
        OooOOO0();
    }
}
