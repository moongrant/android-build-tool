package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Oo0 extends BaseAdapter {

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public static final int f16995OoooO0 = o000OOo.OooO(null).getMaximum(4);

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public OooO0O0 f16996Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final Month f16997Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final DateSelector<?> f16998Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public Collection<Long> f16999Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final CalendarConstraints f17000OoooO00;

    public o00Oo0(Month month, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints) {
        this.f16997Oooo0o = month;
        this.f16998Oooo0oO = dateSelector;
        this.f17000OoooO00 = calendarConstraints;
        this.f16999Oooo0oo = dateSelector.oo0o0Oo();
    }

    public final int OooO0O0(int i) {
        return OooO0OO() + (i - 1);
    }

    public final int OooO0OO() {
        return this.f16997Oooo0o.OooO0o0();
    }

    @Override // android.widget.Adapter
    @Nullable
    /* JADX INFO: renamed from: OooO0Oo, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i) {
        if (i < this.f16997Oooo0o.OooO0o0() || i > OooO0o0()) {
            return null;
        }
        Month month = this.f16997Oooo0o;
        return Long.valueOf(month.OooO0o((i - month.OooO0o0()) + 1));
    }

    public final void OooO0o(@Nullable TextView textView, long j) {
        OooO00o oooO00o;
        if (textView == null) {
            return;
        }
        boolean z = false;
        if (this.f17000OoooO00.f16870Oooo0oo.oo000o(j)) {
            textView.setEnabled(true);
            Iterator<Long> it = this.f16998Oooo0oO.oo0o0Oo().iterator();
            while (it.hasNext()) {
                if (o000OOo.OooO00o(j) == o000OOo.OooO00o(it.next().longValue())) {
                    z = true;
                    break;
                }
            }
            if (z) {
                oooO00o = this.f16996Oooo.f16927OooO0O0;
            } else {
                oooO00o = o000OOo.OooO0oo().getTimeInMillis() == j ? this.f16996Oooo.f16928OooO0OO : this.f16996Oooo.f16926OooO00o;
            }
        } else {
            textView.setEnabled(false);
            oooO00o = this.f16996Oooo.f16932OooO0oO;
        }
        oooO00o.OooO0O0(textView);
    }

    public final int OooO0o0() {
        return (this.f16997Oooo0o.OooO0o0() + this.f16997Oooo0o.f16918OoooO00) - 1;
    }

    public final void OooO0oO(MaterialCalendarGridView materialCalendarGridView, long j) {
        if (Month.OooO0Oo(j).equals(this.f16997Oooo0o)) {
            Calendar calendarOooO0Oo = o000OOo.OooO0Oo(this.f16997Oooo0o.f16914Oooo0o);
            calendarOooO0Oo.setTimeInMillis(j);
            OooO0o((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().OooO0O0(calendarOooO0Oo.get(5)) - materialCalendarGridView.getFirstVisiblePosition()), j);
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return OooO0OO() + this.f16997Oooo0o.f16918OoooO00;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i / this.f16997Oooo0o.f16913Oooo;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0082  */
    @Override // android.widget.Adapter
    @NonNull
    public final View getView(int i, @Nullable View view, @NonNull ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        if (this.f16996Oooo == null) {
            this.f16996Oooo = new OooO0O0(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(p337o0OO0o0.OooOOOO.mtrl_calendar_day, viewGroup, false);
        }
        int iOooO0OO = i - OooO0OO();
        if (iOooO0OO >= 0) {
            Month month = this.f16997Oooo0o;
            if (iOooO0OO >= month.f16918OoooO00) {
                textView.setVisibility(8);
                textView.setEnabled(false);
            } else {
                int i2 = iOooO0OO + 1;
                textView.setTag(month);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(i2)));
                long jOooO0o = this.f16997Oooo0o.OooO0o(i2);
                if (this.f16997Oooo0o.f16916Oooo0oo == new Month(o000OOo.OooO0oo()).f16916Oooo0oo) {
                    textView.setContentDescription(OooO.OooO0OO(jOooO0o));
                } else {
                    textView.setContentDescription(OooO.OooO0o0(jOooO0o));
                }
                textView.setVisibility(0);
                textView.setEnabled(true);
            }
        } else {
            textView.setVisibility(8);
            textView.setEnabled(false);
        }
        Long item = getItem(i);
        if (item != null) {
            OooO0o(textView, item.longValue());
        }
        return textView;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
