package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class OooO implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, OooOOO0.OooO00o {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public OooO0o f4677Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public androidx.appcompat.app.OooO0o f4678Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public OooO0O0 f4679Oooo0oo;

    public OooO(OooO0o oooO0o) {
        this.f4677Oooo0o = oooO0o;
    }

    @Override // androidx.appcompat.view.menu.OooOOO0.OooO00o
    public final void OooO0OO(@NonNull OooO0o oooO0o, boolean z) {
        androidx.appcompat.app.OooO0o oooO0o2;
        if ((z || oooO0o == this.f4677Oooo0o) && (oooO0o2 = this.f4678Oooo0oO) != null) {
            oooO0o2.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.OooOOO0.OooO00o
    public final boolean OooO0Oo(@NonNull OooO0o oooO0o) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f4677Oooo0o.OooOOoo(((OooO0O0.OooO00o) this.f4679Oooo0oo.OooO00o()).getItem(i), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        OooO0O0 oooO0O0 = this.f4679Oooo0oo;
        OooO0o oooO0o = this.f4677Oooo0o;
        OooOOO0.OooO00o oooO00o = oooO0O0.f4693OoooO0;
        if (oooO00o != null) {
            oooO00o.OooO0OO(oooO0o, true);
        }
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f4678Oooo0oO.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f4678Oooo0oO.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f4677Oooo0o.OooO0Oo(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f4677Oooo0o.performShortcut(i, keyEvent, 0);
    }
}
