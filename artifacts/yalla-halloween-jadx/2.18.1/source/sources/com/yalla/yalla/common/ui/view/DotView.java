package com.yalla.yalla.common.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.oOO00O;
import p444o0OoOo0O.o0O0OO0;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/yalla/yalla/common/ui/view/DotView;", "Landroidx/appcompat/widget/AppCompatTextView;", "", "number", "", "setNumber", "(Ljava/lang/Integer;)V", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attr", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class DotView extends AppCompatTextView {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public int f20932OoooO;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public boolean f20933OoooO0O;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DotView(@NotNull Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void OooO0OO(boolean z) {
        this.f20933OoooO0O = z;
        OooO0o0();
    }

    public final void OooO0o0() {
        int i = this.f20932OoooO;
        if (i > 99) {
            setText("...");
            setBackgroundResource(R.drawable.bg_red_point_oval);
            oOO00O.OooO(this);
        } else if (i > 0) {
            setText(String.valueOf(i));
            setBackgroundResource(R.drawable.bg_red_point_circle);
            oOO00O.OooO(this);
        } else {
            if (i > 0 || !this.f20933OoooO0O) {
                oOO00O.OooO0O0(this);
                return;
            }
            setBackgroundResource(R.drawable.bg_red_point);
            setText("");
            oOO00O.OooO(this);
        }
    }

    public final void setNumber(@Nullable Integer number) {
        this.f20932OoooO = number != null ? number.intValue() : 0;
        OooO0o0();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DotView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DotView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        setIncludeFontPadding(false);
        setSingleLine();
        setGravity(17);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, o0O0OO0.DotView);
        this.f20933OoooO0O = typedArrayObtainStyledAttributes.getBoolean(0, false);
        this.f20932OoooO = typedArrayObtainStyledAttributes.getInteger(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        OooO0o0();
    }
}
