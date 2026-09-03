package com.google.android.material.divider;

import OooO0O0.OooO00o;
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
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.internal.o000oOoO;
import java.util.WeakHashMap;
import o000O0O0.o00000O;
import o0OOO0O.OooO0OO;
import p084o000Ooo.o0OOO0o;
import p337o0OO0o0.OooO0o;
import p337o0OO0o0.OooOO0;
import p337o0OO0o0.Oooo0;
import p337o0OO0o0.Oooo000;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialDividerItemDecoration extends RecyclerView.OooOo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final int f17029OooO = Oooo000.Widget_MaterialComponents_MaterialDivider;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public Drawable f17030OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f17031OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @ColorInt
    public int f17032OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f17033OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f17034OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f17035OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f17036OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final Rect f17037OooO0oo;

    public MaterialDividerItemDecoration(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        int i2 = OooO0o.materialDividerStyle;
        this.f17037OooO0oo = new Rect();
        TypedArray typedArrayOooO0Oo = o000oOoO.OooO0Oo(context, attributeSet, Oooo0.MaterialDivider, i2, f17029OooO, new int[0]);
        this.f17032OooO0OO = OooO0OO.OooO00o(context, typedArrayOooO0Oo, Oooo0.MaterialDivider_dividerColor).getDefaultColor();
        this.f17031OooO0O0 = typedArrayOooO0Oo.getDimensionPixelSize(Oooo0.MaterialDivider_dividerThickness, context.getResources().getDimensionPixelSize(OooOO0.material_divider_thickness));
        this.f17035OooO0o0 = typedArrayOooO0Oo.getDimensionPixelOffset(Oooo0.MaterialDivider_dividerInsetStart, 0);
        this.f17034OooO0o = typedArrayOooO0Oo.getDimensionPixelOffset(Oooo0.MaterialDivider_dividerInsetEnd, 0);
        this.f17036OooO0oO = typedArrayOooO0Oo.getBoolean(Oooo0.MaterialDivider_lastItemDecorated, true);
        typedArrayOooO0Oo.recycle();
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        this.f17030OooO00o = shapeDrawable;
        int i3 = this.f17032OooO0OO;
        this.f17032OooO0OO = i3;
        Drawable drawableOooO0o0 = o0OOO0o.OooO0o0(shapeDrawable);
        this.f17030OooO00o = drawableOooO0o0;
        o0OOO0o.OooO0O0.OooO0oO(drawableOooO0o0, i3);
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(OooO00o.OooO00o("Invalid orientation: ", i, ". It should be either HORIZONTAL or VERTICAL"));
        }
        this.f17033OooO0Oo = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOo
    public final void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.o0OOO0o o0ooo0o2) {
        rect.set(0, 0, 0, 0);
        if (this.f17033OooO0Oo == 1) {
            rect.bottom = this.f17030OooO00o.getIntrinsicHeight() + this.f17031OooO0O0;
        } else {
            rect.right = this.f17030OooO00o.getIntrinsicWidth() + this.f17031OooO0O0;
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
        int i = 0;
        if (this.f17033OooO0Oo != 1) {
            canvas.save();
            if (recyclerView.getClipToPadding()) {
                paddingTop = recyclerView.getPaddingTop();
                height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
                canvas.clipRect(recyclerView.getPaddingLeft(), paddingTop, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
            } else {
                height = recyclerView.getHeight();
                paddingTop = 0;
            }
            int i2 = paddingTop + this.f17035OooO0o0;
            int i3 = height - this.f17034OooO0o;
            int childCount = recyclerView.getChildCount();
            while (i < childCount) {
                View childAt = recyclerView.getChildAt(i);
                recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt, this.f17037OooO0oo);
                int iRound = Math.round(childAt.getTranslationX()) + this.f17037OooO0oo.right;
                this.f17030OooO00o.setBounds((iRound - this.f17030OooO00o.getIntrinsicWidth()) - this.f17031OooO0O0, i2, iRound, i3);
                this.f17030OooO00o.draw(canvas);
                i++;
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
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        boolean z = ViewCompat.OooO.OooO0Oo(recyclerView) == 1;
        int i4 = paddingLeft + (z ? this.f17034OooO0o : this.f17035OooO0o0);
        int i5 = width - (z ? this.f17035OooO0o0 : this.f17034OooO0o);
        int childCount2 = recyclerView.getChildCount();
        if (!this.f17036OooO0oO) {
            childCount2--;
        }
        while (i < childCount2) {
            View childAt2 = recyclerView.getChildAt(i);
            recyclerView.getDecoratedBoundsWithMargins(childAt2, this.f17037OooO0oo);
            int iRound2 = Math.round(childAt2.getTranslationY()) + this.f17037OooO0oo.bottom;
            this.f17030OooO00o.setBounds(i4, (iRound2 - this.f17030OooO00o.getIntrinsicHeight()) - this.f17031OooO0O0, i5, iRound2);
            this.f17030OooO00o.draw(canvas);
            i++;
        }
        canvas.restore();
    }
}
