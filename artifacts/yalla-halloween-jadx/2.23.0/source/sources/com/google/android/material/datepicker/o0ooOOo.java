package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import p270o0O0000o.o0000O0;

/* JADX INFO: loaded from: classes3.dex */
public final class o0ooOOo extends BaseAdapter {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final int f16960OooOO0 = o0000.OooO(null).getMaximum(4);

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final int f16961OooOO0O = (o0000.OooO(null).getMaximum(7) + o0000.OooO(null).getMaximum(5)) - 1;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public final DayViewDecorator f16962OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Month f16963OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public Collection<Long> f16964OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final DateSelector<?> f16965OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public OooO0O0 f16966OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final CalendarConstraints f16967OooO0oo;

    public o0ooOOo(Month month, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints, @Nullable DayViewDecorator dayViewDecorator) {
        this.f16963OooO0Oo = month;
        this.f16965OooO0o0 = dateSelector;
        this.f16967OooO0oo = calendarConstraints;
        this.f16962OooO = dayViewDecorator;
        this.f16964OooO0o = dateSelector.o00000oo();
    }

    public final int OooO0O0() {
        int firstDayOfWeek = this.f16967OooO0oo.f16809OooO0oo;
        Month month = this.f16963OooO0Oo;
        Calendar calendar = month.f16858OooO0Oo;
        int i = calendar.get(7);
        if (firstDayOfWeek <= 0) {
            firstDayOfWeek = calendar.getFirstDayOfWeek();
        }
        int i2 = i - firstDayOfWeek;
        return i2 < 0 ? i2 + month.f16861OooO0oO : i2;
    }

    @Override // android.widget.Adapter
    @Nullable
    /* JADX INFO: renamed from: OooO0OO, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i) {
        if (i < OooO0O0()) {
            return null;
        }
        int iOooO0O0 = OooO0O0();
        Month month = this.f16963OooO0Oo;
        if (i > (iOooO0O0 + month.f16862OooO0oo) - 1) {
            return null;
        }
        int iOooO0O1 = (i - OooO0O0()) + 1;
        Calendar calendarOooO0Oo = o0000.OooO0Oo(month.f16858OooO0Oo);
        calendarOooO0Oo.set(5, iOooO0O1);
        return Long.valueOf(calendarOooO0Oo.getTimeInMillis());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO0Oo(@Nullable TextView textView, long j, int i) {
        boolean z;
        boolean z2;
        String str;
        OooO00o oooO00o;
        boolean z3;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        boolean z4 = o0000.OooO0oo().getTimeInMillis() == j;
        DateSelector<?> dateSelector = this.f16965OooO0o0;
        Iterator it = dateSelector.ooOO().iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            F f = ((o000OO.OooO0o) it.next()).f34865OooO00o;
            if (f != 0 && ((Long) f).longValue() == j) {
                z = true;
                break;
            }
        }
        Iterator it2 = dateSelector.ooOO().iterator();
        while (true) {
            if (!it2.hasNext()) {
                z2 = false;
                break;
            }
            S s = ((o000OO.OooO0o) it2.next()).f34866OooO0O0;
            if (s != 0 && ((Long) s).longValue() == j) {
                z2 = true;
                break;
            }
        }
        Calendar calendarOooO0oo = o0000.OooO0oo();
        Calendar calendarOooO = o0000.OooO(null);
        calendarOooO.setTimeInMillis(j);
        if (calendarOooO0oo.get(1) == calendarOooO.get(1)) {
            Locale locale = Locale.getDefault();
            str = Build.VERSION.SDK_INT >= 24 ? o0000.OooO0OO("MMMEd", locale).format(new Date(j)) : o0000.OooO0oO(0, locale).format(new Date(j));
        } else {
            Locale locale2 = Locale.getDefault();
            str = Build.VERSION.SDK_INT >= 24 ? o0000.OooO0OO("yMMMEd", locale2).format(new Date(j)) : o0000.OooO0oO(0, locale2).format(new Date(j));
        }
        if (z4) {
            str = String.format(context.getString(o0000O0.mtrl_picker_today_description), str);
        }
        if (z) {
            str = String.format(context.getString(o0000O0.mtrl_picker_start_date_description), str);
        } else if (z2) {
            str = String.format(context.getString(o0000O0.mtrl_picker_end_date_description), str);
        }
        textView.setContentDescription(str);
        if (this.f16967OooO0oo.f16806OooO0o.Oooo(j)) {
            textView.setEnabled(true);
            Iterator it3 = dateSelector.o00000oo().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    z3 = false;
                    break;
                } else if (o0000.OooO00o(j) == o0000.OooO00o(((Long) it3.next()).longValue())) {
                    z3 = true;
                    break;
                }
            }
            textView.setSelected(z3);
            if (z3) {
                oooO00o = this.f16966OooO0oO.f16877OooO0O0;
            } else {
                oooO00o = o0000.OooO0oo().getTimeInMillis() == j ? this.f16966OooO0oO.f16878OooO0OO : this.f16966OooO0oO.f16876OooO00o;
            }
        } else {
            textView.setEnabled(false);
            oooO00o = this.f16966OooO0oO.f16882OooO0oO;
        }
        if (this.f16962OooO == null || i == -1) {
            oooO00o.OooO0O0(textView);
            return;
        }
        int i2 = this.f16963OooO0Oo.f16859OooO0o;
        oooO00o.OooO0O0(textView);
        textView.setCompoundDrawables(null, null, null, null);
        textView.setContentDescription(str);
    }

    public final void OooO0o0(MaterialCalendarGridView materialCalendarGridView, long j) {
        Month monthOooO0O0 = Month.OooO0O0(j);
        Month month = this.f16963OooO0Oo;
        if (monthOooO0O0.equals(month)) {
            Calendar calendarOooO0Oo = o0000.OooO0Oo(month.f16858OooO0Oo);
            calendarOooO0Oo.setTimeInMillis(j);
            int i = calendarOooO0Oo.get(5);
            OooO0Oo((TextView) materialCalendarGridView.getChildAt((materialCalendarGridView.getAdapter().OooO0O0() + (i - 1)) - materialCalendarGridView.getFirstVisiblePosition()), j, i);
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return f16961OooOO0O;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i / this.f16963OooO0Oo.f16861OooO0oO;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005c  */
    @Override // android.widget.Adapter
    @NonNull
    public final View getView(int i, @Nullable View view, @NonNull ViewGroup viewGroup) {
        int i2;
        Context context = viewGroup.getContext();
        if (this.f16966OooO0oO == null) {
            this.f16966OooO0oO = new OooO0O0(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(p270o0O0000o.o0000O00.mtrl_calendar_day, viewGroup, false);
        }
        int iOooO0O0 = i - OooO0O0();
        if (iOooO0O0 >= 0) {
            Month month = this.f16963OooO0Oo;
            if (iOooO0O0 >= month.f16862OooO0oo) {
                textView.setVisibility(8);
                textView.setEnabled(false);
                i2 = -1;
            } else {
                i2 = iOooO0O0 + 1;
                textView.setTag(month);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(i2)));
                textView.setVisibility(0);
                textView.setEnabled(true);
            }
        } else {
            textView.setVisibility(8);
            textView.setEnabled(false);
            i2 = -1;
        }
        Long item = getItem(i);
        if (item != null) {
            OooO0Oo(textView, item.longValue(), i2);
        }
        return textView;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
