package com.yalla.yalla.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p444o0OoOo0O.o0O0OO0;
import p522o0o0O0o.o00O0;
import p522o0o0O0o.oOO00O;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001e"}, d2 = {"Lcom/yalla/yalla/ui/view/NumberViews;", "Landroid/widget/LinearLayout;", "", "number", "", "setData", "", "numberData", "Lcom/yalla/yalla/ui/view/NumberSize$Size;", "Oooo0o", "Lcom/yalla/yalla/ui/view/NumberSize$Size;", "getSize", "()Lcom/yalla/yalla/ui/view/NumberSize$Size;", "setSize", "(Lcom/yalla/yalla/ui/view/NumberSize$Size;)V", "size", "Oooo0oO", "I", "getNumCount", "()I", "setNumCount", "(I)V", "numCount", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attr", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class NumberViews extends LinearLayout {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public NumberSize.Size size;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name and from kotlin metadata */
    public int numCount;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public String f25031Oooo0oo;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NumberViews(@NotNull Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    public final void OooO00o() {
        int i = this.numCount;
        if (i >= 0) {
            this.f25031Oooo0oo = oOO00O.OooO00o(this.f25031Oooo0oo, i);
        }
        if (this.f25031Oooo0oo.length() == 0) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        char[] charArray = this.f25031Oooo0oo.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "this as java.lang.String).toCharArray()");
        removeAllViews();
        ?? it = ArraysKt.getIndices(charArray).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            NumberView numberView = new NumberView(context, null, 0, 6, null);
            numberView.setSize(this.size);
            if (charArray[iNextInt] == '-') {
                setGravity(17);
                numberView.setDataRes(R.drawable.ic_x_number_space);
                addView(numberView);
            } else if (charArray[iNextInt] == 'X' || charArray[iNextInt] == 'x') {
                setGravity(80);
                numberView.setDataRes(R.drawable.ic_chatline_gift_x);
                addView(numberView);
            } else if (Character.isDigit(charArray[iNextInt])) {
                setGravity(17);
                numberView.setData(charArray[iNextInt] - '0');
                addView(numberView);
            }
        }
    }

    public final int getNumCount() {
        return this.numCount;
    }

    @NotNull
    public final NumberSize.Size getSize() {
        return this.size;
    }

    public final void setData(int number) {
        setData(String.valueOf(number));
    }

    public final void setNumCount(int i) {
        this.numCount = i;
    }

    public final void setSize(@NotNull NumberSize.Size size) {
        Intrinsics.checkNotNullParameter(size, "<set-?>");
        this.size = size;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NumberViews(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setData(@NotNull String numberData) {
        Intrinsics.checkNotNullParameter(numberData, "numberData");
        this.f25031Oooo0oo = numberData;
        OooO00o();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NumberViews(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.size = NumberSize.Size.H;
        this.numCount = -1;
        this.f25031Oooo0oo = "";
        setOrientation(0);
        setGravity(16);
        setLayoutDirection(0);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, o0O0OO0.NumberViews);
        this.size = NumberSize.f25021OooO00o.OooO00o(Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(2, 1)));
        this.f25031Oooo0oo = o00O0.OooO0oO(typedArrayObtainStyledAttributes.getString(1));
        this.numCount = typedArrayObtainStyledAttributes.getInteger(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        OooO00o();
    }
}
