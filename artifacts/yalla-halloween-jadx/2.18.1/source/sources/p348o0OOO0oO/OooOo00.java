package p348o0OOO0oO;

import android.view.View;
import com.google.android.material.snackbar.Snackbar;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo00 implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ View.OnClickListener f38187Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Snackbar f38188Oooo0oO;

    public OooOo00(Snackbar snackbar, View.OnClickListener onClickListener) {
        this.f38188Oooo0oO = snackbar;
        this.f38187Oooo0o = onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f38187Oooo0o.onClick(view);
        this.f38188Oooo0oO.OooO0O0(1);
    }
}
