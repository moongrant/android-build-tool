package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.OooO0OO.OooO00o;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, OooOOO.OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO f2623OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public OooO0OO f2624OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public androidx.appcompat.app.OooO0O0 f2625OooO0o0;

    public OooOO0(OooO oooO) {
        this.f2623OooO0Oo = oooO;
    }

    @Override // androidx.appcompat.view.menu.OooOOO.OooO00o
    public final void OooO0O0(@NonNull OooO oooO, boolean z) {
        androidx.appcompat.app.OooO0O0 oooO0O0;
        if ((z || oooO == this.f2623OooO0Oo) && (oooO0O0 = this.f2625OooO0o0) != null) {
            oooO0O0.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.OooOOO.OooO00o
    public final boolean OooO0OO(@NonNull OooO oooO) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        OooO0OO oooO0OO = this.f2624OooO0o;
        if (oooO0OO.f2614OooOO0 == null) {
            oooO0OO.f2614OooOO0 = oooO0OO.new OooO00o();
        }
        this.f2623OooO0Oo.OooOOo0(oooO0OO.f2614OooOO0.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f2624OooO0o.OooO0O0(this.f2623OooO0Oo, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        OooO oooO = this.f2623OooO0Oo;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f2625OooO0o0.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f2625OooO0o0.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                oooO.OooO0OO(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return oooO.performShortcut(i, keyEvent, 0);
    }
}
