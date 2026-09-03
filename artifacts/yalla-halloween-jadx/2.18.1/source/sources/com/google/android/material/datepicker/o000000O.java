package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class o000000O extends RecyclerView.Adapter<OooO00o> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOO0O<?> f16987OooO00o;

    public static class OooO00o extends RecyclerView.oo0o0Oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final TextView f16988OooO00o;

        public OooO00o(TextView textView) {
            super(textView);
            this.f16988OooO00o = textView;
        }
    }

    public o000000O(OooOO0O<?> oooOO0O) {
        this.f16987OooO00o = oooOO0O;
    }

    public final int OooO00o(int i) {
        return i - this.f16987OooO00o.f16949Oooo.f16868Oooo0o.f16916Oooo0oo;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f16987OooO00o.f16949Oooo.f16872OoooO00;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@NonNull RecyclerView.oo0o0Oo oo0o0oo, int i) {
        OooO00o oooO00o = (OooO00o) oo0o0oo;
        int i2 = this.f16987OooO00o.f16949Oooo.f16868Oooo0o.f16916Oooo0oo + i;
        String string = oooO00o.f16988OooO00o.getContext().getString(p337o0OO0o0.OooOo.mtrl_picker_navigate_to_year_description);
        oooO00o.f16988OooO00o.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i2)));
        oooO00o.f16988OooO00o.setContentDescription(String.format(string, Integer.valueOf(i2)));
        OooO0O0 oooO0O0 = this.f16987OooO00o.f16955OoooO0O;
        Calendar calendarOooO0oo = o000OOo.OooO0oo();
        com.google.android.material.datepicker.OooO00o oooO00o2 = calendarOooO0oo.get(1) == i2 ? oooO0O0.f16930OooO0o : oooO0O0.f16929OooO0Oo;
        Iterator<Long> it = this.f16987OooO00o.f16951Oooo0oo.oo0o0Oo().iterator();
        while (it.hasNext()) {
            calendarOooO0oo.setTimeInMillis(it.next().longValue());
            if (calendarOooO0oo.get(1) == i2) {
                oooO00o2 = oooO0O0.f16931OooO0o0;
            }
        }
        oooO00o2.OooO0O0(oooO00o.f16988OooO00o);
        oooO00o.f16988OooO00o.setOnClickListener(new o000000(this, i2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public final RecyclerView.oo0o0Oo onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new OooO00o((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(p337o0OO0o0.OooOOOO.mtrl_calendar_year, viewGroup, false));
    }
}
