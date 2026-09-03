package com.facebook.internal;

import android.view.View;
import com.yalla.yalla.ui.view.ScrollableView;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class OooOO0O implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f12820Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f12821Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Object f12822Oooo0oo;

    public /* synthetic */ OooOO0O(Object obj, Object obj2, int i) {
        this.f12820Oooo0o = i;
        this.f12821Oooo0oO = obj;
        this.f12822Oooo0oo = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.ArrayList, java.util.List<android.view.View>] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList, java.util.List<android.view.View>] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12820Oooo0o) {
            case 0:
                ((FetchedAppSettingsManager.FetchedAppSettingsCallback) this.f12821Oooo0oO).onSuccess((FetchedAppSettings) this.f12822Oooo0oo);
                break;
            default:
                ScrollableView this$0 = (ScrollableView) this.f12821Oooo0oO;
                Function0 function0 = (Function0) this.f12822Oooo0oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Iterator it = this$0.f25125Oooo0o.iterator();
                while (it.hasNext()) {
                    this$0.getLinearLayout().removeView((View) it.next());
                }
                this$0.f25125Oooo0o.clear();
                if (function0 != null) {
                    function0.invoke();
                }
                this$0.invalidate();
                break;
        }
    }
}
