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
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface DateSelector<S> extends Parcelable {
    @NonNull
    String Oooo0OO(@NonNull Context context);

    @StyleRes
    int Oooo0o(Context context);

    @NonNull
    String OoooooO(Context context);

    @Nullable
    String getError();

    boolean o00000o0();

    @NonNull
    ArrayList o00000oo();

    void o0000OOO(long j);

    @Nullable
    S o0000oo();

    @NonNull
    View o00ooo(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @NonNull CalendarConstraints calendarConstraints, @NonNull o00oO0o.OooO00o oooO00o);

    @NonNull
    ArrayList ooOO();
}
