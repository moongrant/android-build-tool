package com.google.android.material.snackbar;

import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO implements SwipeDismissBehavior.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f17825OooO00o;

    public OooO(BaseTransientBottomBar baseTransientBottomBar) {
        this.f17825OooO00o = baseTransientBottomBar;
    }

    public final void OooO00o(@NonNull View view) {
        if (view.getParent() != null) {
            view.setVisibility(8);
        }
        this.f17825OooO00o.OooO0O0(0);
    }
}
