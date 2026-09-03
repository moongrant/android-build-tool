package com.google.android.material.textfield;

import android.view.View;
import com.yalla.yalla.ui.activity.main.TaskActivity;
import com.yalla.yalla.ui.fragment.MainSearchRoomFragment;
import kotlin.jvm.internal.Intrinsics;
import p675oO0Oo.O0OO00;
import p675oO0Oo.o0oO0Ooo;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooOOOO implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f17502OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f17503OooO0o0;

    public /* synthetic */ OooOOOO(Object obj, int i) {
        this.f17502OooO0Oo = i;
        this.f17503OooO0o0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f17502OooO0Oo;
        Object obj = this.f17503OooO0o0;
        switch (i) {
            case 0:
                ((o0OoOo0) obj).OooOo0();
                break;
            case 1:
                TaskActivity this$0 = (TaskActivity) obj;
                int i2 = TaskActivity.f25084OooOooO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                new O0OO00(this$0).OooO();
                break;
            case 2:
                o0oO0Ooo this$1 = (o0oO0Ooo) obj;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                if (this$1.f59576OooO0oo) {
                    this$1.OooO0O0();
                }
                break;
            default:
                MainSearchRoomFragment this$2 = (MainSearchRoomFragment) obj;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                this$2.getVm().clearSearchHistory();
                break;
        }
    }
}
