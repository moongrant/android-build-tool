package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class o00oO0o<S> extends o0OO00O<S> {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public DateSelector<S> f16475OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @StyleRes
    public int f16476OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public CalendarConstraints f16477OooO0oO;

    public class OooO00o extends o0Oo0oo<S> {
        public OooO00o() {
        }

        @Override // com.google.android.material.datepicker.o0Oo0oo
        public final void OooO00o() {
            Iterator<o0Oo0oo<S>> it = o00oO0o.this.f16483OooO0Oo.iterator();
            while (it.hasNext()) {
                it.next().OooO00o();
            }
        }

        @Override // com.google.android.material.datepicker.o0Oo0oo
        public final void OooO0O0(S s) {
            Iterator<o0Oo0oo<S>> it = o00oO0o.this.f16483OooO0Oo.iterator();
            while (it.hasNext()) {
                it.next().OooO0O0(s);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f16476OooO0o0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f16475OooO0o = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f16477OooO0oO = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return this.f16475OooO0o.o00oO0o(layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.f16476OooO0o0)), viewGroup, this.f16477OooO0oO, new OooO00o());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f16476OooO0o0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f16475OooO0o);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f16477OooO0oO);
    }
}
