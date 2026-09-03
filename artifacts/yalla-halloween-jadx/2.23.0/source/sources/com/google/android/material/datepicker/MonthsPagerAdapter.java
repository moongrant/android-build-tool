package com.google.android.material.datepicker;

import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000O0Oo;
import androidx.core.view.o000OO;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class MonthsPagerAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final CalendarConstraints f16864OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final DateSelector<?> f16865OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final DayViewDecorator f16866OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooOo00.OooO f16867OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f16868OooO0o0;

    public static class ViewHolder extends RecyclerView.o0O0O00 {
        final MaterialCalendarGridView monthGrid;
        final TextView monthTitle;

        public ViewHolder(@NonNull LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(p270o0O0000o.o0000Ooo.month_title);
            this.monthTitle = textView;
            WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
            new o000OO(o00000O0.OooO0OO.tag_accessibility_heading).OooO0o0(textView, Boolean.TRUE);
            this.monthGrid = (MaterialCalendarGridView) linearLayout.findViewById(p270o0O0000o.o0000Ooo.month_grid);
            if (z) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    public MonthsPagerAdapter(@NonNull ContextThemeWrapper contextThemeWrapper, DateSelector dateSelector, @NonNull CalendarConstraints calendarConstraints, @Nullable DayViewDecorator dayViewDecorator, OooOo00.OooO0OO oooO0OO) {
        Calendar calendar = calendarConstraints.f16805OooO0Oo.f16858OooO0Oo;
        Month month = calendarConstraints.f16808OooO0oO;
        if (calendar.compareTo(month.f16858OooO0Oo) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (month.f16858OooO0Oo.compareTo(calendarConstraints.f16807OooO0o0.f16858OooO0Oo) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        int i = o0ooOOo.f16960OooOO0;
        int i2 = OooOo00.f16900OooOOo;
        Resources resources = contextThemeWrapper.getResources();
        int i3 = p270o0O0000o.o00000O.mtrl_calendar_day_height;
        this.f16868OooO0o0 = (resources.getDimensionPixelSize(i3) * i) + (MaterialDatePicker.OooO0Oo(contextThemeWrapper) ? contextThemeWrapper.getResources().getDimensionPixelSize(i3) : 0);
        this.f16864OooO00o = calendarConstraints;
        this.f16865OooO0O0 = dateSelector;
        this.f16866OooO0OO = dayViewDecorator;
        this.f16867OooO0Oo = oooO0OO;
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f16864OooO00o.f16810OooOO0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        Calendar calendarOooO0Oo = o0000.OooO0Oo(this.f16864OooO00o.f16805OooO0Oo.f16858OooO0Oo);
        calendarOooO0Oo.add(2, i);
        return new Month(calendarOooO0Oo).f16858OooO0Oo.getTimeInMillis();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@NonNull RecyclerView.o0O0O00 o0o0o00, int i) {
        ViewHolder viewHolder = (ViewHolder) o0o0o00;
        CalendarConstraints calendarConstraints = this.f16864OooO00o;
        Calendar calendarOooO0Oo = o0000.OooO0Oo(calendarConstraints.f16805OooO0Oo.f16858OooO0Oo);
        calendarOooO0Oo.add(2, i);
        Month month = new Month(calendarOooO0Oo);
        viewHolder.monthTitle.setText(month.OooO0OO());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) viewHolder.monthGrid.findViewById(p270o0O0000o.o0000Ooo.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !month.equals(materialCalendarGridView.getAdapter().f16963OooO0Oo)) {
            o0ooOOo o0ooooo = new o0ooOOo(month, this.f16865OooO0O0, calendarConstraints, this.f16866OooO0OO);
            materialCalendarGridView.setNumColumns(month.f16861OooO0oO);
            materialCalendarGridView.setAdapter((ListAdapter) o0ooooo);
        } else {
            materialCalendarGridView.invalidate();
            o0ooOOo o0oooooOooO00o = materialCalendarGridView.getAdapter();
            Iterator<Long> it = o0oooooOooO00o.f16964OooO0o.iterator();
            while (it.hasNext()) {
                o0oooooOooO00o.OooO0o0(materialCalendarGridView, it.next().longValue());
            }
            DateSelector<?> dateSelector = o0oooooOooO00o.f16965OooO0o0;
            if (dateSelector != null) {
                Iterator it2 = dateSelector.o00000oo().iterator();
                while (it2.hasNext()) {
                    o0oooooOooO00o.OooO0o0(materialCalendarGridView, ((Long) it2.next()).longValue());
                }
                o0oooooOooO00o.f16964OooO0o = dateSelector.o00000oo();
            }
        }
        materialCalendarGridView.setOnItemClickListener(new o0OOO0o(this, materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public final RecyclerView.o0O0O00 onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(p270o0O0000o.o0000O00.mtrl_calendar_month_labeled, viewGroup, false);
        if (!MaterialDatePicker.OooO0Oo(viewGroup.getContext())) {
            return new ViewHolder(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, this.f16868OooO0o0));
        return new ViewHolder(linearLayout, true);
    }
}
