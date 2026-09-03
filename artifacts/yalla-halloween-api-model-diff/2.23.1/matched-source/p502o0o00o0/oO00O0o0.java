package p502o0o00o0;

import android.os.Handler;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yalla.yalla.ui.activity.room.live.side.RoomScreenShotManager;
import com.yalla.yalla.ui.dialog.PasswordSettingDialog;
import kotlin.jvm.internal.Intrinsics;
import p373o0OOo0oO.o00O0O;
import p373o0OOo0oO.o00Oo0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class oO00O0o0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f50010OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f50011OooO0o0;

    public /* synthetic */ oO00O0o0(Object obj, int i) {
        this.f50010OooO0Oo = i;
        this.f50011OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f50010OooO0Oo;
        Object obj = this.f50011OooO0o0;
        switch (i) {
            case 0:
                RoomScreenShotManager this$0 = (RoomScreenShotManager) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooO0OO();
                break;
            default:
                EditText editText = ((PasswordSettingDialog) obj).f27417OooOOo0;
                InputMethodManager inputMethodManagerOooO00o = o00O0O.OooO00o(editText, ViewHierarchyConstants.VIEW_KEY, "getContext(...)");
                o00Oo0.OooO00o(editText.getContext().getApplicationContext(), new Handler(), inputMethodManagerOooO00o, editText.getWindowToken(), 0);
                break;
        }
    }
}
