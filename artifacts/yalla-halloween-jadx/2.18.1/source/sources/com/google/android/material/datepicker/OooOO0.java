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

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0 extends BaseAdapter {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public static final int f16944Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NonNull
    public final Calendar f16945Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final int f16946Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final int f16947Oooo0oo;

    static {
        f16944Oooo = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public OooOO0() {
        Calendar calendarOooO = o000OOo.OooO(null);
        this.f16945Oooo0o = calendarOooO;
        this.f16946Oooo0oO = calendarOooO.getMaximum(7);
        this.f16947Oooo0oo = calendarOooO.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f16946Oooo0oO;
    }

    @Override // android.widget.Adapter
    @Nullable
    public final Object getItem(int i) {
        int i2 = this.f16946Oooo0oO;
        if (i >= i2) {
            return null;
        }
        int i3 = i + this.f16947Oooo0oo;
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
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(p337o0OO0o0.OooOOOO.mtrl_calendar_day_of_week, viewGroup, false);
        }
        Calendar calendar = this.f16945Oooo0o;
        int i2 = i + this.f16947Oooo0oo;
        int i3 = this.f16946Oooo0oO;
        if (i2 > i3) {
            i2 -= i3;
        }
        calendar.set(7, i2);
        textView.setText(this.f16945Oooo0o.getDisplayName(7, f16944Oooo, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(p337o0OO0o0.OooOo.mtrl_picker_day_of_week_column_header), this.f16945Oooo0o.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }
}
