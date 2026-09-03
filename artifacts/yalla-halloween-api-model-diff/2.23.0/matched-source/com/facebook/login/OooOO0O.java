package com.facebook.login;

import android.view.View;
import com.yalla.album.AlbumActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooOO0O implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f10698OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f10699OooO0o0;

    public /* synthetic */ OooOO0O(Object obj, int i) {
        this.f10698OooO0Oo = i;
        this.f10699OooO0o0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f10698OooO0Oo;
        Object obj = this.f10699OooO0o0;
        switch (i) {
            case 0:
                DeviceAuthDialog.m4164initializeContentView$lambda2((DeviceAuthDialog) obj, view);
                break;
            default:
                AlbumActivity this$0 = (AlbumActivity) obj;
                int i2 = AlbumActivity.f22491OooOo0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOOoo(false);
                break;
        }
    }
}
