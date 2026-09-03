package com.facebook.internal;

import android.view.View;
import com.yalla.yalla.ui.view.ScrollableView;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class OooOO0O implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f12836Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ Object f12837OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f12838OoooO00;

    public /* synthetic */ OooOO0O(Object obj, Object obj2, int i) {
        this.f12836Oooo = i;
        this.f12838OoooO00 = obj;
        this.f12837OoooO0 = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.ArrayList, java.util.List<android.view.View>] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList, java.util.List<android.view.View>] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12836Oooo) {
            case 0:
                ((FetchedAppSettingsManager.FetchedAppSettingsCallback) this.f12838OoooO00).onSuccess((FetchedAppSettings) this.f12837OoooO0);
                break;
            default:
                ScrollableView this$0 = (ScrollableView) this.f12838OoooO00;
                Function0 function0 = (Function0) this.f12837OoooO0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Iterator it = this$0.f25143Oooo.iterator();
                while (it.hasNext()) {
                    this$0.getLinearLayout().removeView((View) it.next());
                }
                this$0.f25143Oooo.clear();
                if (function0 != null) {
                    function0.invoke();
                }
                this$0.invalidate();
                break;
        }
    }
}
