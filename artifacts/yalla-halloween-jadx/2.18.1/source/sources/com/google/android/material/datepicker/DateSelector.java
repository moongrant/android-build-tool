package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface DateSelector<S> extends Parcelable {
    @NonNull
    String OooOOoo(Context context);

    @NonNull
    Collection<o000OO0O.OooO0o<Long, Long>> OooOo0O();

    @Nullable
    S o000000O();

    void o0000O00(long j);

    @NonNull
    View o0000Ooo(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @NonNull CalendarConstraints calendarConstraints, @NonNull o00oO0o o00oo0o2);

    @StyleRes
    int o00Oo0(Context context);

    boolean o00oO0O();

    @NonNull
    Collection<Long> oo0o0Oo();
}
