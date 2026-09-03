package com.google.android.material.divider;

import OooO0OO.OooO00o;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000OOo0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.internal.o00oO0o;
import java.util.WeakHashMap;
import p053o00000oo.o00Ooo;
import p272o0O0000o.o00000;
import p272o0O0000o.o00000O;
import p272o0O0000o.o0000O0O;
import p272o0O0000o.o000OO;
import p276o0O00OoO.OooO0o;

/* JADX INFO: loaded from: classes3.dex */
public class MaterialDividerItemDecoration extends RecyclerView.OooOo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final int f16505OooO = o0000O0O.Widget_MaterialComponents_MaterialDivider;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public Drawable f16506OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f16507OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @ColorInt
    public int f16508OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f16509OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f16510OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f16511OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f16512OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final Rect f16513OooO0oo;

    public MaterialDividerItemDecoration(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        int i2 = o00000.materialDividerStyle;
        this.f16513OooO0oo = new Rect();
        TypedArray typedArrayOooO0Oo = o00oO0o.OooO0Oo(context, attributeSet, o000OO.MaterialDivider, i2, f16505OooO, new int[0]);
        this.f16508OooO0OO = OooO0o.OooO00o(context, typedArrayOooO0Oo, o000OO.MaterialDivider_dividerColor).getDefaultColor();
        this.f16507OooO0O0 = typedArrayOooO0Oo.getDimensionPixelSize(o000OO.MaterialDivider_dividerThickness, context.getResources().getDimensionPixelSize(o00000O.material_divider_thickness));
        this.f16511OooO0o0 = typedArrayOooO0Oo.getDimensionPixelOffset(o000OO.MaterialDivider_dividerInsetStart, 0);
        this.f16510OooO0o = typedArrayOooO0Oo.getDimensionPixelOffset(o000OO.MaterialDivider_dividerInsetEnd, 0);
        this.f16512OooO0oO = typedArrayOooO0Oo.getBoolean(o000OO.MaterialDivider_lastItemDecorated, true);
        typedArrayOooO0Oo.recycle();
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        int i3 = this.f16508OooO0OO;
        this.f16508OooO0OO = i3;
        this.f16506OooO00o = shapeDrawable;
        o00Ooo.OooO0O0.OooO0oO(shapeDrawable, i3);
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(OooO00o.OooO00o("Invalid orientation: ", i, ". It should be either HORIZONTAL or VERTICAL"));
        }
        this.f16509OooO0Oo = i;
    }

    public final boolean OooO0Oo(@NonNull RecyclerView recyclerView, @NonNull View view) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        boolean z = adapter != null && childAdapterPosition == adapter.getItemCount() - 1;
        if (childAdapterPosition != -1) {
            return !z || this.f16512OooO0oO;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOo
    public final void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.o0OOO0o o0ooo0o2) {
        rect.set(0, 0, 0, 0);
        if (OooO0Oo(recyclerView, view)) {
            int i = this.f16509OooO0Oo;
            int i2 = this.f16507OooO0O0;
            if (i == 1) {
                rect.bottom = i2;
            } else {
                rect.right = i2;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOo
    public final void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.o0OOO0o o0ooo0o2) {
        int height;
        int paddingTop;
        int width;
        int paddingLeft;
        if (recyclerView.getLayoutManager() == null) {
            return;
        }
        int i = this.f16509OooO0Oo;
        int i2 = this.f16507OooO0O0;
        Rect rect = this.f16513OooO0oo;
        int i3 = this.f16510OooO0o;
        int i4 = this.f16511OooO0o0;
        int i5 = 0;
        if (i != 1) {
            canvas.save();
            if (recyclerView.getClipToPadding()) {
                paddingTop = recyclerView.getPaddingTop();
                height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
                canvas.clipRect(recyclerView.getPaddingLeft(), paddingTop, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
            } else {
                height = recyclerView.getHeight();
                paddingTop = 0;
            }
            int i6 = paddingTop + i4;
            int i7 = height - i3;
            int childCount = recyclerView.getChildCount();
            while (i5 < childCount) {
                View childAt = recyclerView.getChildAt(i5);
                if (OooO0Oo(recyclerView, childAt)) {
                    recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt, rect);
                    int iRound = Math.round(childAt.getTranslationX()) + rect.right;
                    this.f16506OooO00o.setBounds(iRound - i2, i6, iRound, i7);
                    this.f16506OooO00o.draw(canvas);
                }
                i5++;
            }
            canvas.restore();
            return;
        }
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingLeft = recyclerView.getPaddingLeft();
            width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            width = recyclerView.getWidth();
            paddingLeft = 0;
        }
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        boolean z = ViewCompat.OooO.OooO0Oo(recyclerView) == 1;
        int i8 = paddingLeft + (z ? i3 : i4);
        if (z) {
            i3 = i4;
        }
        int i9 = width - i3;
        int childCount2 = recyclerView.getChildCount();
        while (i5 < childCount2) {
            View childAt2 = recyclerView.getChildAt(i5);
            if (OooO0Oo(recyclerView, childAt2)) {
                recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt2, rect);
                int iRound2 = Math.round(childAt2.getTranslationY()) + rect.bottom;
                this.f16506OooO00o.setBounds(i8, iRound2 - i2, i9, iRound2);
                this.f16506OooO00o.draw(canvas);
            }
            i5++;
        }
        canvas.restore();
    }
}
