package com.facebook.internal;

import com.yalla.yalla.ui.activity.main.TaskActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class OooOO0 implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f12818Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f12819Oooo0oO;

    public /* synthetic */ OooOO0(Object obj, int i) {
        this.f12818Oooo0o = i;
        this.f12819Oooo0oO = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12818Oooo0o) {
            case 0:
                ((FetchedAppSettingsManager.FetchedAppSettingsCallback) this.f12819Oooo0oO).onError();
                break;
            default:
                TaskActivity this$0 = (TaskActivity) this.f12819Oooo0oO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                TaskActivity.OooO00o oooO00o = TaskActivity.f22061o00Oo0;
                this$0.Oooo00o();
                break;
        }
    }
}
