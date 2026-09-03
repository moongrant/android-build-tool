package androidx.appcompat.app;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AlertController f2391OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ AlertController.OooO0O0 f2392OooO0o0;

    public OooO00o(AlertController.OooO0O0 oooO0O0, AlertController alertController) {
        this.f2392OooO0o0 = oooO0O0;
        this.f2391OooO0Oo = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        AlertController.OooO0O0 oooO0O0 = this.f2392OooO0o0;
        DialogInterface.OnClickListener onClickListener = oooO0O0.f2280OooOO0o;
        AlertController alertController = this.f2391OooO0Oo;
        onClickListener.onClick(alertController.f2233OooO0O0, i);
        if (oooO0O0.f2281OooOOO) {
            return;
        }
        alertController.f2233OooO0O0.dismiss();
    }
}
