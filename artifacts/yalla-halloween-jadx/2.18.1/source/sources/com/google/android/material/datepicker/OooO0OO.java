package com.google.android.material.datepicker;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OooO0OO extends com.google.android.material.internal.Oooo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final String f16934Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f16935Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final DateFormat f16936Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final CalendarConstraints f16937Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public OooO0o f16938OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final OooO00o f16939OoooO00;

    public class OooO00o implements Runnable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ String f16940Oooo0o;

        public OooO00o(String str) {
            this.f16940Oooo0o = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            OooO0OO oooO0OO = OooO0OO.this;
            TextInputLayout textInputLayout = oooO0OO.f16935Oooo0o;
            DateFormat dateFormat = oooO0OO.f16936Oooo0oO;
            Context context = textInputLayout.getContext();
            textInputLayout.setError(p060o0000o.oo000o.OooO00o(context.getString(p337o0OO0o0.OooOo.mtrl_picker_invalid_format), "\n", String.format(context.getString(p337o0OO0o0.OooOo.mtrl_picker_invalid_format_use), this.f16940Oooo0o), "\n", String.format(context.getString(p337o0OO0o0.OooOo.mtrl_picker_invalid_format_example), dateFormat.format(new Date(o000OOo.OooO0oo().getTimeInMillis())))));
            OooO0OO.this.OooO00o();
        }
    }

    public OooO0OO(String str, DateFormat dateFormat, @NonNull TextInputLayout textInputLayout, CalendarConstraints calendarConstraints) {
        this.f16936Oooo0oO = dateFormat;
        this.f16935Oooo0o = textInputLayout;
        this.f16937Oooo0oo = calendarConstraints;
        this.f16934Oooo = textInputLayout.getContext().getString(p337o0OO0o0.OooOo.mtrl_picker_out_of_range);
        this.f16939OoooO00 = new OooO00o(str);
    }

    public abstract void OooO00o();

    public abstract void OooO0O0(@Nullable Long l);

    /* JADX WARN: Code duplicated, block: B:13:0x0057  */
    @Override // com.google.android.material.internal.Oooo0, android.text.TextWatcher
    public final void onTextChanged(@NonNull CharSequence charSequence, int i, int i2, int i3) {
        this.f16935Oooo0o.removeCallbacks(this.f16939OoooO00);
        this.f16935Oooo0o.removeCallbacks(this.f16938OoooO0);
        this.f16935Oooo0o.setError(null);
        OooO0O0(null);
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        try {
            Date date = this.f16936Oooo0oO.parse(charSequence.toString());
            this.f16935Oooo0o.setError(null);
            long time = date.getTime();
            if (this.f16937Oooo0oo.f16870Oooo0oo.oo000o(time)) {
                CalendarConstraints calendarConstraints = this.f16937Oooo0oo;
                boolean z = true;
                if (calendarConstraints.f16868Oooo0o.OooO0o(1) <= time) {
                    Month month = calendarConstraints.f16869Oooo0oO;
                    if (time > month.OooO0o(month.f16918OoooO00)) {
                        z = false;
                    }
                } else {
                    z = false;
                }
                if (z) {
                    OooO0O0(Long.valueOf(date.getTime()));
                    return;
                }
            }
            OooO0o oooO0o = new OooO0o(this, time);
            this.f16938OoooO0 = oooO0o;
            this.f16935Oooo0o.postDelayed(oooO0o, 1000L);
        } catch (ParseException unused) {
            this.f16935Oooo0o.postDelayed(this.f16939OoooO00, 1000L);
        }
    }
}
