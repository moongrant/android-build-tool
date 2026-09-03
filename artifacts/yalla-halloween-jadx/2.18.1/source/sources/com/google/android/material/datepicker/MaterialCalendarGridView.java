package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import java.util.Calendar;
import java.util.Iterator;
import p072o000O0o0.o0000OO0;

/* JADX INFO: loaded from: classes2.dex */
final class MaterialCalendarGridView extends GridView {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final Calendar f16885Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final boolean f16886Oooo0oO;

    public class OooO00o extends androidx.core.view.OooO00o {
        @Override // androidx.core.view.OooO00o
        public final void OooO0Oo(View view, @NonNull o0000OO0 o0000oo1) {
            this.f7862OooO00o.onInitializeAccessibilityNodeInfo(view, o0000oo1.f28194OooO00o);
            o0000oo1.Oooo00o(null);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    @NonNull
    /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
    public final o00Oo0 getAdapter() {
        return (o00Oo0) super.getAdapter();
    }

    public final View OooO0O0(int i) {
        return getChildAt(i - getFirstVisiblePosition());
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(@NonNull Canvas canvas) {
        int iOooO0O0;
        int width;
        int iOooO0O1;
        int width2;
        int i;
        int width3;
        int right;
        int right2;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        o00Oo0 adapter = getAdapter();
        DateSelector<?> dateSelector = adapter.f16998Oooo0oO;
        OooO0O0 oooO0O0 = adapter.f16996Oooo;
        int iMax = Math.max(adapter.OooO0OO(), getFirstVisiblePosition());
        int iMin = Math.min(adapter.OooO0o0(), getLastVisiblePosition());
        Long item = adapter.getItem(iMax);
        Long item2 = adapter.getItem(iMin);
        Iterator<o000OO0O.OooO0o<Long, Long>> it = dateSelector.OooOo0O().iterator();
        while (it.hasNext()) {
            o000OO0O.OooO0o<Long, Long> next = it.next();
            Long l = next.f28234OooO00o;
            if (l == null) {
                materialCalendarGridView = this;
            } else if (next.f28235OooO0O0 != null) {
                long jLongValue = l.longValue();
                long jLongValue2 = next.f28235OooO0O0.longValue();
                Long lValueOf = Long.valueOf(jLongValue);
                Long lValueOf2 = Long.valueOf(jLongValue2);
                if (!(item == null || item2 == null || lValueOf == null || lValueOf2 == null || lValueOf.longValue() > item2.longValue() || lValueOf2.longValue() < item.longValue())) {
                    boolean zOooO0o = com.google.android.material.internal.o00Ooo.OooO0o(this);
                    if (jLongValue < item.longValue()) {
                        if (iMax % adapter.f16997Oooo0o.f16913Oooo == 0) {
                            right2 = 0;
                        } else {
                            right2 = !zOooO0o ? materialCalendarGridView.OooO0O0(iMax - 1).getRight() : materialCalendarGridView.OooO0O0(iMax - 1).getLeft();
                        }
                        width = right2;
                        iOooO0O0 = iMax;
                    } else {
                        materialCalendarGridView.f16885Oooo0o.setTimeInMillis(jLongValue);
                        iOooO0O0 = adapter.OooO0O0(materialCalendarGridView.f16885Oooo0o.get(5));
                        View viewOooO0O0 = materialCalendarGridView.OooO0O0(iOooO0O0);
                        width = (viewOooO0O0.getWidth() / 2) + viewOooO0O0.getLeft();
                    }
                    if (jLongValue2 > item2.longValue()) {
                        if ((iMin + 1) % adapter.f16997Oooo0o.f16913Oooo == 0) {
                            right = getWidth();
                        } else {
                            right = !zOooO0o ? materialCalendarGridView.OooO0O0(iMin).getRight() : materialCalendarGridView.OooO0O0(iMin).getLeft();
                        }
                        width2 = right;
                        iOooO0O1 = iMin;
                    } else {
                        materialCalendarGridView.f16885Oooo0o.setTimeInMillis(jLongValue2);
                        iOooO0O1 = adapter.OooO0O0(materialCalendarGridView.f16885Oooo0o.get(5));
                        View viewOooO0O1 = materialCalendarGridView.OooO0O0(iOooO0O1);
                        width2 = (viewOooO0O1.getWidth() / 2) + viewOooO0O1.getLeft();
                    }
                    int itemId = (int) adapter.getItemId(iOooO0O0);
                    int i2 = iMax;
                    int i3 = iMin;
                    int itemId2 = (int) adapter.getItemId(iOooO0O1);
                    while (itemId <= itemId2) {
                        int numColumns = getNumColumns() * itemId;
                        o00Oo0 o00oo1 = adapter;
                        int numColumns2 = (getNumColumns() + numColumns) - 1;
                        View viewOooO0O2 = materialCalendarGridView.OooO0O0(numColumns);
                        int top = viewOooO0O2.getTop() + oooO0O0.f16926OooO00o.f16920OooO00o.top;
                        int bottom = viewOooO0O2.getBottom() - oooO0O0.f16926OooO00o.f16920OooO00o.bottom;
                        if (zOooO0o) {
                            int i4 = iOooO0O1 > numColumns2 ? 0 : width2;
                            int width4 = numColumns > iOooO0O0 ? getWidth() : width;
                            i = i4;
                            width3 = width4;
                        } else {
                            i = numColumns > iOooO0O0 ? 0 : width;
                            width3 = iOooO0O1 > numColumns2 ? getWidth() : width2;
                        }
                        canvas.drawRect(i, top, width3, bottom, oooO0O0.f16933OooO0oo);
                        itemId++;
                        materialCalendarGridView = this;
                        it = it;
                        adapter = o00oo1;
                    }
                    materialCalendarGridView = this;
                    iMax = i2;
                    iMin = i3;
                }
            }
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        if (!z) {
            super.onFocusChanged(false, i, rect);
            return;
        }
        if (i == 33) {
            setSelection(getAdapter().OooO0o0());
        } else if (i == 130) {
            setSelection(getAdapter().OooO0OO());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().OooO0OO()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(getAdapter().OooO0OO());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (!this.f16886Oooo0oO) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i) {
        if (i < getAdapter().OooO0OO()) {
            super.setSelection(getAdapter().OooO0OO());
        } else {
            super.setSelection(i);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f16885Oooo0o = o000OOo.OooO(null);
        if (MaterialDatePicker.OooO0OO(getContext())) {
            setNextFocusLeftId(p337o0OO0o0.OooOOO0.cancel_button);
            setNextFocusRightId(p337o0OO0o0.OooOOO0.confirm_button);
        }
        this.f16886Oooo0oO = MaterialDatePicker.OooO0Oo(getContext(), p337o0OO0o0.OooO0o.nestedScrollable);
        ViewCompat.OooOo0o(this, new OooO00o());
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof o00Oo0)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), o00Oo0.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }
}
