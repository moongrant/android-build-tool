package com.yalla.yalla.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o0OoOo0;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p417o0OoO0.o0000;
import p584o0oOooO0.oO00Oo0;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001e"}, d2 = {"Lcom/yalla/yalla/ui/view/NumberViews;", "Landroid/widget/LinearLayout;", "", "number", "", "setData", "", "numberData", "Lcom/yalla/yalla/ui/view/NumberSize$Size;", "OooO0Oo", "Lcom/yalla/yalla/ui/view/NumberSize$Size;", "getSize", "()Lcom/yalla/yalla/ui/view/NumberSize$Size;", "setSize", "(Lcom/yalla/yalla/ui/view/NumberSize$Size;)V", "size", "OooO0o0", "I", "getNumCount", "()I", "setNumCount", "(I)V", "numCount", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attr", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class NumberViews extends LinearLayout {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public NumberSize.Size size;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public String f30508OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name and from kotlin metadata */
    public int numCount;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NumberViews(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    public final void OooO00o() {
        int i = this.numCount;
        if (i >= 0) {
            this.f30508OooO0o = o0000.OooO00o(i, this.f30508OooO0o);
        }
        int i2 = 0;
        if (this.f30508OooO0o.length() == 0) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        char[] charArray = this.f30508OooO0o.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "this as java.lang.String).toCharArray()");
        removeAllViews();
        ?? it = ArraysKt.getIndices(charArray).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            NumberView numberView = new NumberView(context, null, 6, i2);
            numberView.setSize(this.size);
            char c = charArray[iNextInt];
            if (c == '-') {
                setGravity(17);
                numberView.setDataRes(NumberSize.f30504OooO0O0);
                addView(numberView);
            } else if (c == 'X' || c == 'x') {
                setGravity(80);
                numberView.setDataRes(NumberSize.f30503OooO00o);
                addView(numberView);
            } else if (Character.isDigit(c)) {
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
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setData(@NotNull String numberData) {
        Intrinsics.checkNotNullParameter(numberData, "numberData");
        this.f30508OooO0o = numberData;
        OooO00o();
    }

    public /* synthetic */ NumberViews(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NumberViews(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.size = NumberSize.Size.H;
        this.numCount = -1;
        this.f30508OooO0o = "";
        setOrientation(0);
        setGravity(16);
        setLayoutDirection(0);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, oO00Oo0.NumberViews);
        int integer = typedArrayObtainStyledAttributes.getInteger(oO00Oo0.NumberViews_numSize, 1);
        int i2 = NumberSize.f30503OooO00o;
        this.size = NumberSize.OooO00o(Integer.valueOf(integer));
        this.f30508OooO0o = o0OoOo0.OooOOO(typedArrayObtainStyledAttributes.getString(oO00Oo0.NumberViews_numData), "");
        this.numCount = typedArrayObtainStyledAttributes.getInteger(oO00Oo0.NumberViews_numCount, -1);
        typedArrayObtainStyledAttributes.recycle();
        OooO00o();
    }
}
