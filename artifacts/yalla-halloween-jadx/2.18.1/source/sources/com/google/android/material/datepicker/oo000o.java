package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.WeakHashMap;
import o000O0O0.o00000O;
import p069o0000oo0.o000OO0O;

/* JADX INFO: loaded from: classes2.dex */
public final class oo000o extends RecyclerView.Adapter<OooO00o> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final CalendarConstraints f17017OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final DateSelector<?> f17018OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooOO0O.OooO f17019OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f17020OooO0Oo;

    public static class OooO00o extends RecyclerView.oo0o0Oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final TextView f17021OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final MaterialCalendarGridView f17022OooO0O0;

        public OooO00o(@NonNull LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(p337o0OO0o0.OooOOO0.month_title);
            this.f17021OooO00o = textView;
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            new androidx.core.view.OooO(o000OO0O.tag_accessibility_heading).OooO0o0(textView, Boolean.TRUE);
            this.f17022OooO0O0 = (MaterialCalendarGridView) linearLayout.findViewById(p337o0OO0o0.OooOOO0.month_grid);
            if (z) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    public oo000o(@NonNull Context context, DateSelector<?> dateSelector, @NonNull CalendarConstraints calendarConstraints, OooOO0O.OooO oooO) {
        Month month = calendarConstraints.f16868Oooo0o;
        Month month2 = calendarConstraints.f16869Oooo0oO;
        Month month3 = calendarConstraints.f16867Oooo;
        if (month.compareTo(month3) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (month3.compareTo(month2) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        int i = o00Oo0.f16995OoooO0;
        int i2 = OooOO0O.f16948OoooOOo;
        Resources resources = context.getResources();
        int i3 = p337o0OO0o0.OooOO0.mtrl_calendar_day_height;
        this.f17020OooO0Oo = (resources.getDimensionPixelSize(i3) * i) + (MaterialDatePicker.OooO0OO(context) ? context.getResources().getDimensionPixelSize(i3) : 0);
        this.f17017OooO00o = calendarConstraints;
        this.f17018OooO0O0 = dateSelector;
        this.f17019OooO0OO = oooO;
        setHasStableIds(true);
    }

    @NonNull
    public final Month OooO00o(int i) {
        return this.f17017OooO00o.f16868Oooo0o.OooO0oo(i);
    }

    public final int OooO0O0(@NonNull Month month) {
        return this.f17017OooO00o.f16868Oooo0o.OooO(month);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f17017OooO00o.f16871OoooO0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        return this.f17017OooO00o.f16868Oooo0o.OooO0oo(i).f16914Oooo0o.getTimeInMillis();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@NonNull RecyclerView.oo0o0Oo oo0o0oo, int i) {
        OooO00o oooO00o = (OooO00o) oo0o0oo;
        Month monthOooO0oo = this.f17017OooO00o.f16868Oooo0o.OooO0oo(i);
        oooO00o.f17021OooO00o.setText(monthOooO0oo.OooO0oO());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) oooO00o.f17022OooO0O0.findViewById(p337o0OO0o0.OooOOO0.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !monthOooO0oo.equals(materialCalendarGridView.getAdapter().f16997Oooo0o)) {
            o00Oo0 o00oo1 = new o00Oo0(monthOooO0oo, this.f17018OooO0O0, this.f17017OooO00o);
            materialCalendarGridView.setNumColumns(monthOooO0oo.f16913Oooo);
            materialCalendarGridView.setAdapter((ListAdapter) o00oo1);
        } else {
            materialCalendarGridView.invalidate();
            o00Oo0 o00oo0OooO00o = materialCalendarGridView.getAdapter();
            Iterator<Long> it = o00oo0OooO00o.f16999Oooo0oo.iterator();
            while (it.hasNext()) {
                o00oo0OooO00o.OooO0oO(materialCalendarGridView, it.next().longValue());
            }
            DateSelector<?> dateSelector = o00oo0OooO00o.f16998Oooo0oO;
            if (dateSelector != null) {
                Iterator<Long> it2 = dateSelector.oo0o0Oo().iterator();
                while (it2.hasNext()) {
                    o00oo0OooO00o.OooO0oO(materialCalendarGridView, it2.next().longValue());
                }
                o00oo0OooO00o.f16999Oooo0oo = o00oo0OooO00o.f16998Oooo0oO.oo0o0Oo();
            }
        }
        materialCalendarGridView.setOnItemClickListener(new o00Ooo(this, materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public final RecyclerView.oo0o0Oo onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(p337o0OO0o0.OooOOOO.mtrl_calendar_month_labeled, viewGroup, false);
        if (!MaterialDatePicker.OooO0OO(viewGroup.getContext())) {
            return new OooO00o(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, this.f17020OooO0Oo));
        return new OooO00o(linearLayout, true);
    }
}
