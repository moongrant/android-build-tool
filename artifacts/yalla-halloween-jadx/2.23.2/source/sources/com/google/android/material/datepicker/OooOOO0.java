package com.google.android.material.datepicker;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Calendar;
import java.util.Locale;
import p272o0O0000o.o0000O0;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOO0 extends BaseAdapter {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final int f16421OooO0oO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final Calendar f16422OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f16423OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f16424OooO0o0;

    static {
        f16421OooO0oO = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public OooOOO0() {
        Calendar calendarOooO = o0000.OooO(null);
        this.f16422OooO0Oo = calendarOooO;
        this.f16424OooO0o0 = calendarOooO.getMaximum(7);
        this.f16423OooO0o = calendarOooO.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f16424OooO0o0;
    }

    @Override // android.widget.Adapter
    @Nullable
    public final Object getItem(int i) {
        int i2 = this.f16424OooO0o0;
        if (i >= i2) {
            return null;
        }
        int i3 = i + this.f16423OooO0o;
        if (i3 > i2) {
            i3 -= i2;
        }
        return Integer.valueOf(i3);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @Nullable
    @SuppressLint({"WrongConstant"})
    public final View getView(int i, @Nullable View view, @NonNull ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(p272o0O0000o.o0000O00.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i2 = i + this.f16423OooO0o;
        int i3 = this.f16424OooO0o0;
        if (i2 > i3) {
            i2 -= i3;
        }
        Calendar calendar = this.f16422OooO0Oo;
        calendar.set(7, i2);
        textView.setText(calendar.getDisplayName(7, f16421OooO0oO, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(o0000O0.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public OooOOO0(int i) {
        Calendar calendarOooO = o0000.OooO(null);
        this.f16422OooO0Oo = calendarOooO;
        this.f16424OooO0o0 = calendarOooO.getMaximum(7);
        this.f16423OooO0o = i;
    }
}
