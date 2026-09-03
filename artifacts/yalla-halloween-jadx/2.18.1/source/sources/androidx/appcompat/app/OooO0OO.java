package androidx.appcompat.app;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ AlertController f4515Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ AlertController.OooO0O0 f4516Oooo0oO;

    public OooO0OO(AlertController.OooO0O0 oooO0O0, AlertController alertController) {
        this.f4516Oooo0oO = oooO0O0;
        this.f4515Oooo0o = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f4516Oooo0oO.f4410OooO0oo.onClick(this.f4515Oooo0o.f4364OooO0O0, i);
        if (this.f4516Oooo0oO.f4411OooOO0) {
            return;
        }
        this.f4515Oooo0o.f4364OooO0O0.dismiss();
    }
}
