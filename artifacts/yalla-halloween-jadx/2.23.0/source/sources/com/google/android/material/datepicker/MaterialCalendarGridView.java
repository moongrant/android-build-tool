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

/* JADX INFO: loaded from: classes3.dex */
final class MaterialCalendarGridView extends GridView {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Calendar f16824OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f16825OooO0o0;

    public class OooO00o extends androidx.core.view.OooO00o {
        @Override // androidx.core.view.OooO00o
        public final void onInitializeAccessibilityNodeInfo(View view, @NonNull o0000O.o0Oo0oo o0oo0oo2) {
            super.onInitializeAccessibilityNodeInfo(view, o0oo0oo2);
            o0oo0oo2.OooOO0O(null);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    @NonNull
    /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
    public final o0ooOOo getAdapter() {
        return (o0ooOOo) super.getAdapter();
    }

    public final View OooO0O0(int i) {
        return getChildAt(i - getFirstVisiblePosition());
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onDraw(@NonNull Canvas canvas) {
        o0ooOOo o0ooooo;
        Iterator it;
        int iOooO0O0;
        int width;
        int iOooO0O1;
        int width2;
        int i;
        int width3;
        int right;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        o0ooOOo adapter = getAdapter();
        DateSelector<?> dateSelector = adapter.f16965OooO0o0;
        OooO0O0 oooO0O0 = adapter.f16966OooO0oO;
        int iMax = Math.max(adapter.OooO0O0(), getFirstVisiblePosition());
        int iOooO0O2 = adapter.OooO0O0();
        Month month = adapter.f16963OooO0Oo;
        int iMin = Math.min((iOooO0O2 + month.f16862OooO0oo) - 1, getLastVisiblePosition());
        Long item = adapter.getItem(iMax);
        Long item2 = adapter.getItem(iMin);
        Iterator it2 = dateSelector.ooOO().iterator();
        while (it2.hasNext()) {
            o000OO.OooO0o oooO0o = (o000OO.OooO0o) it2.next();
            F f = oooO0o.f34865OooO00o;
            if (f != 0) {
                S s = oooO0o.f34866OooO0O0;
                if (s != 0) {
                    long jLongValue = ((Long) f).longValue();
                    long jLongValue2 = ((Long) s).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Long lValueOf2 = Long.valueOf(jLongValue2);
                    if (!(item == null || item2 == null || lValueOf == null || lValueOf2 == null || lValueOf.longValue() > item2.longValue() || lValueOf2.longValue() < item.longValue())) {
                        boolean zOooO0o = com.google.android.material.internal.oo0o0Oo.OooO0o(this);
                        long jLongValue3 = item.longValue();
                        Calendar calendar = materialCalendarGridView.f16824OooO0Oo;
                        if (jLongValue < jLongValue3) {
                            if (iMax % month.f16861OooO0oO == 0) {
                                right = 0;
                            } else {
                                right = !zOooO0o ? materialCalendarGridView.OooO0O0(iMax - 1).getRight() : materialCalendarGridView.OooO0O0(iMax - 1).getLeft();
                            }
                            width = right;
                            iOooO0O0 = iMax;
                        } else {
                            calendar.setTimeInMillis(jLongValue);
                            iOooO0O0 = adapter.OooO0O0() + (calendar.get(5) - 1);
                            View viewOooO0O0 = materialCalendarGridView.OooO0O0(iOooO0O0);
                            width = (viewOooO0O0.getWidth() / 2) + viewOooO0O0.getLeft();
                        }
                        if (jLongValue2 > item2.longValue()) {
                            if ((iMin + 1) % month.f16861OooO0oO == 0) {
                                width2 = getWidth();
                            } else {
                                width2 = !zOooO0o ? materialCalendarGridView.OooO0O0(iMin).getRight() : materialCalendarGridView.OooO0O0(iMin).getLeft();
                            }
                            iOooO0O1 = iMin;
                        } else {
                            calendar.setTimeInMillis(jLongValue2);
                            iOooO0O1 = adapter.OooO0O0() + (calendar.get(5) - 1);
                            View viewOooO0O1 = materialCalendarGridView.OooO0O0(iOooO0O1);
                            width2 = (viewOooO0O1.getWidth() / 2) + viewOooO0O1.getLeft();
                        }
                        int itemId = (int) adapter.getItemId(iOooO0O0);
                        int itemId2 = (int) adapter.getItemId(iOooO0O1);
                        while (itemId <= itemId2) {
                            int numColumns = getNumColumns() * itemId;
                            o0ooOOo o0ooooo2 = adapter;
                            int numColumns2 = (getNumColumns() + numColumns) - 1;
                            View viewOooO0O2 = materialCalendarGridView.OooO0O0(numColumns);
                            int top = viewOooO0O2.getTop() + oooO0O0.f16876OooO00o.f16870OooO00o.top;
                            Iterator it3 = it2;
                            int bottom = viewOooO0O2.getBottom() - oooO0O0.f16876OooO00o.f16870OooO00o.bottom;
                            if (zOooO0o) {
                                int i2 = iOooO0O1 > numColumns2 ? 0 : width2;
                                int width4 = numColumns > iOooO0O0 ? getWidth() : width;
                                i = i2;
                                width3 = width4;
                            } else {
                                i = numColumns > iOooO0O0 ? 0 : width;
                                width3 = iOooO0O1 > numColumns2 ? getWidth() : width2;
                            }
                            canvas.drawRect(i, top, width3, bottom, oooO0O0.f16883OooO0oo);
                            itemId++;
                            materialCalendarGridView = this;
                            itemId2 = itemId2;
                            adapter = o0ooooo2;
                            it2 = it3;
                        }
                        o0ooooo = adapter;
                        it = it2;
                    }
                }
            } else {
                o0ooooo = adapter;
                it = it2;
            }
            materialCalendarGridView = this;
            iMax = iMax;
            iMin = iMin;
            adapter = o0ooooo;
            it2 = it;
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        if (!z) {
            super.onFocusChanged(false, i, rect);
            return;
        }
        if (i == 33) {
            o0ooOOo adapter = getAdapter();
            setSelection((adapter.OooO0O0() + adapter.f16963OooO0Oo.f16862OooO0oo) - 1);
        } else if (i == 130) {
            setSelection(getAdapter().OooO0O0());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().OooO0O0()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(getAdapter().OooO0O0());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (!this.f16825OooO0o0) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i) {
        if (i < getAdapter().OooO0O0()) {
            super.setSelection(getAdapter().OooO0O0());
        } else {
            super.setSelection(i);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f16824OooO0Oo = o0000.OooO(null);
        if (MaterialDatePicker.OooO0Oo(getContext())) {
            setNextFocusLeftId(p270o0O0000o.o0000Ooo.cancel_button);
            setNextFocusRightId(p270o0O0000o.o0000Ooo.confirm_button);
        }
        this.f16825OooO0o0 = MaterialDatePicker.OooO0o0(p270o0O0000o.o00000.nestedScrollable, getContext());
        ViewCompat.OooOOOO(this, new OooO00o());
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof o0ooOOo)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), o0ooOOo.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }
}
