package o0000OO;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes.dex */
public final class OooO extends InputConnectionWrapper {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ OooOO0O f33602OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO(InputConnection inputConnection, OooO0o oooO0o) {
        super(inputConnection, false);
        this.f33602OooO00o = oooO0o;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        if (((OooO0o) this.f33602OooO00o).OooO0OO((inputContentInfo != null && Build.VERSION.SDK_INT >= 25) ? new OooOOO0(new OooOOO0.OooO00o(inputContentInfo)) : null, i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
