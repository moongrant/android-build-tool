package com.google.android.material.search;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import com.yalla.yalla.ui.activity.account.DeleteAccountCheckActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooOo00 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f17501OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f17502OooO0o0;

    public /* synthetic */ OooOo00(KeyEvent.Callback callback, int i) {
        this.f17501OooO0Oo = i;
        this.f17502OooO0o0 = callback;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f17501OooO0Oo;
        KeyEvent.Callback callback = this.f17502OooO0o0;
        switch (i) {
            case 0:
                SearchView searchView = (SearchView) callback;
                searchView.f17536OooOOO0.setText("");
                searchView.OooO0Oo();
                break;
            default:
                DeleteAccountCheckActivity this$0 = (DeleteAccountCheckActivity) callback;
                int i2 = DeleteAccountCheckActivity.f25168OooOoO0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ImageView imageView = this$0.OooOo().f58911OooO0o0;
                Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivSelectFacebook");
                this$0.OooOoO0(imageView);
                break;
        }
    }
}
