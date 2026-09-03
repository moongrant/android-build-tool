package com.yalla.yalla.module.event.ui.view;

import androidx.compose.runtime.MutableState;
import androidx.lifecycle.Observer;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0OO<T> implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f23589OooO0Oo;

    public OooO0OO(MutableState<Boolean> mutableState) {
        this.f23589OooO0Oo = mutableState;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        this.f23589OooO0Oo.setValue(Boolean.valueOf(((Boolean) obj).booleanValue()));
    }
}
