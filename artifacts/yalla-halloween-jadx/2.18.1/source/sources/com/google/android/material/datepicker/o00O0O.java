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

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class o00O0O<S> extends o0ooOOo<S> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @Nullable
    public CalendarConstraints f16991Oooo;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @StyleRes
    public int f16992Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Nullable
    public DateSelector<S> f16993Oooo0oo;

    public class OooO00o extends o00oO0o<S> {
        public OooO00o() {
        }

        @Override // com.google.android.material.datepicker.o00oO0o
        public final void OooO00o() {
            Iterator<o00oO0o<S>> it = o00O0O.this.f17016Oooo0o.iterator();
            while (it.hasNext()) {
                it.next().OooO00o();
            }
        }

        @Override // com.google.android.material.datepicker.o00oO0o
        public final void OooO0O0(S s) {
            Iterator<o00oO0o<S>> it = o00O0O.this.f17016Oooo0o.iterator();
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
        this.f16992Oooo0oO = bundle.getInt("THEME_RES_ID_KEY");
        this.f16993Oooo0oo = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f16991Oooo = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return this.f16993Oooo0oo.o0000Ooo(layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.f16992Oooo0oO)), viewGroup, this.f16991Oooo, new OooO00o());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f16992Oooo0oO);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f16993Oooo0oo);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f16991Oooo);
    }
}
