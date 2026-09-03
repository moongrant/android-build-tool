package p074o000O0oo;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOOO extends InputConnectionWrapper {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ OooOo f28224OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOOO(InputConnection inputConnection, OooOo oooOo) {
        super(inputConnection, false);
        this.f28224OooO00o = oooOo;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        OooOo oooOo = this.f28224OooO00o;
        Oooo000 oooo000 = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            oooo000 = new Oooo000(new Oooo000.OooO00o(inputContentInfo));
        }
        if (((OooOOO0) oooOo).OooO0OO(oooo000, i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
