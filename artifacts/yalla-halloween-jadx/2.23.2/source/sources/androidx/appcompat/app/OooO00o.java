package androidx.appcompat.app;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AlertController f2389OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ AlertController.OooO0O0 f2390OooO0o0;

    public OooO00o(AlertController.OooO0O0 oooO0O0, AlertController alertController) {
        this.f2390OooO0o0 = oooO0O0;
        this.f2389OooO0Oo = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        AlertController.OooO0O0 oooO0O0 = this.f2390OooO0o0;
        DialogInterface.OnClickListener onClickListener = oooO0O0.f2278OooOO0o;
        AlertController alertController = this.f2389OooO0Oo;
        onClickListener.onClick(alertController.f2231OooO0O0, i);
        if (oooO0O0.f2279OooOOO) {
            return;
        }
        alertController.f2231OooO0O0.dismiss();
    }
}
