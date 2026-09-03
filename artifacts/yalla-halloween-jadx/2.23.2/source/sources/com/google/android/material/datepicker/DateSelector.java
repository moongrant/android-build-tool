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
    int Oooo0oO(Context context);

    @NonNull
    String OoooooO(Context context);

    @Nullable
    String getError();

    @NonNull
    ArrayList o0000();

    boolean o00000o0();

    void o0000OOO(long j);

    @Nullable
    S o0000oO();

    @NonNull
    ArrayList o00O0O();

    @NonNull
    View o00oO0o(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @NonNull CalendarConstraints calendarConstraints, @NonNull o00oO0o.OooO00o oooO00o);
}
