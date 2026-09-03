package com.google.android.material.internal;

import android.widget.Checkable;
import androidx.annotation.IdRes;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.material.internal.OooOOO0;

/* JADX INFO: loaded from: classes3.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface OooOOO0<T extends OooOOO0<T>> extends Checkable {

    public interface OooO00o<C> {
    }

    @IdRes
    int getId();

    void setInternalOnCheckedChangeListener(@Nullable OooO00o<T> oooO00o);
}
