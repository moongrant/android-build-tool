package com.yalla.yalla.mixedroom;

import android.R;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.Observer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000O00 implements Observer<Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MixedRoomActivity f23505OooO0Oo;

    public o0000O00(MixedRoomActivity mixedRoomActivity) {
        this.f23505OooO0Oo = mixedRoomActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        MixedRoomActivity activity = this.f23505OooO0Oo;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Object systemService = activity.getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(activity.findViewById(R.id.content).getWindowToken(), 0);
    }
}
