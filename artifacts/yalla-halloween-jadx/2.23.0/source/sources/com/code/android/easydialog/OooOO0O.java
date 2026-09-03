package com.code.android.easydialog;

import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0O implements ViewGroup.OnHierarchyChangeListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooO<OooO<Object>> f10144OooO0Oo;

    public OooOO0O(OooO<OooO<Object>> oooO) {
        this.f10144OooO0Oo = oooO;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(@Nullable View view, @Nullable View view2) {
        if (!Intrinsics.areEqual(view, this.f10144OooO0Oo.f10135OooO0OO) || view2 == null) {
            return;
        }
        view2.setOnClickListener(new OooOO0());
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(@Nullable View view, @Nullable View view2) {
    }
}
