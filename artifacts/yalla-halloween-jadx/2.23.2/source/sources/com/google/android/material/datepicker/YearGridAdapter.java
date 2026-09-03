package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;
import p272o0O0000o.o0000O0;

/* JADX INFO: loaded from: classes3.dex */
public final class YearGridAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOo00<?> f16456OooO00o;

    public static class ViewHolder extends RecyclerView.o0O0O00 {
        final TextView textView;

        public ViewHolder(TextView textView) {
            super(textView);
            this.textView = textView;
        }
    }

    public YearGridAdapter(OooOo00<?> oooOo00) {
        this.f16456OooO00o = oooOo00;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f16456OooO00o.f16431OooO0oO.f16331OooO;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@NonNull RecyclerView.o0O0O00 o0o0o00, int i) {
        ViewHolder viewHolder = (ViewHolder) o0o0o00;
        OooOo00<?> oooOo00 = this.f16456OooO00o;
        int i2 = oooOo00.f16431OooO0oO.f16332OooO0Oo.f16386OooO0o + i;
        viewHolder.textView.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i2)));
        TextView textView = viewHolder.textView;
        Context context = textView.getContext();
        textView.setContentDescription(o0000.OooO0oo().get(1) == i2 ? String.format(context.getString(o0000O0.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i2)) : String.format(context.getString(o0000O0.mtrl_picker_navigate_to_year_description), Integer.valueOf(i2)));
        OooO0O0 oooO0O0 = oooOo00.f16434OooOO0O;
        Calendar calendarOooO0oo = o0000.OooO0oo();
        OooO00o oooO00o = calendarOooO0oo.get(1) == i2 ? oooO0O0.f16407OooO0o : oooO0O0.f16406OooO0Oo;
        Iterator it = oooOo00.f16429OooO0o.o0000().iterator();
        while (it.hasNext()) {
            calendarOooO0oo.setTimeInMillis(((Long) it.next()).longValue());
            if (calendarOooO0oo.get(1) == i2) {
                oooO00o = oooO0O0.f16408OooO0o0;
            }
        }
        oooO00o.OooO0O0(viewHolder.textView);
        viewHolder.textView.setOnClickListener(new o0000O00(this, i2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public final RecyclerView.o0O0O00 onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ViewHolder((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(p272o0O0000o.o0000O00.mtrl_calendar_year, viewGroup, false));
    }
}
