package com.facebook.internal;

import com.yalla.yalla.ui.activity.main.TaskActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class OooOO0 implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f12834Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f12835OoooO00;

    public /* synthetic */ OooOO0(Object obj, int i) {
        this.f12834Oooo = i;
        this.f12835OoooO00 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12834Oooo) {
            case 0:
                ((FetchedAppSettingsManager.FetchedAppSettingsCallback) this.f12835OoooO00).onError();
                break;
            default:
                TaskActivity this$0 = (TaskActivity) this.f12835OoooO00;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                TaskActivity.OooO00o oooO00o = TaskActivity.f22080o00ooo;
                this$0.Oooo00o();
                break;
        }
    }
}
