package p023Oooo00o;

import android.content.Intent;
import android.hardware.camera2.CameraCaptureSession;
import android.os.Looper;
import android.widget.Toast;
import com.code.android.util.o000O00O;
import com.yalla.yalla.data.db.table.FriendInfo;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.ui.view.editTextSpan.EditTextSpan;
import kotlin.jvm.internal.Intrinsics;
import o0O0OOOo.OooOo00;
import p418o0Oo0ooO.b4;
import p423o0OoO0OO.o0000oo;
import p492o0o00OO0.o00OOO0;
import p557o0oOOooO.oOo00ooO;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oO0OoOO0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f978OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f979OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f980OooO0o0;

    public /* synthetic */ oO0OoOO0(int i, Object obj, Object obj2) {
        this.f978OooO0Oo = i;
        this.f980OooO0o0 = obj;
        this.f979OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f978OooO0Oo;
        Object obj = this.f979OooO0o;
        Object obj2 = this.f980OooO0o0;
        switch (i) {
            case 0:
                o.OooO0O0(((oO0000O.OooO0OO) obj2).f920OooO00o, (CameraCaptureSession) obj);
                break;
            case 1:
                OooOo00.OooO0O0 oooO0O0 = (OooOo00.OooO0O0) obj;
                try {
                    ((Runnable) obj2).run();
                } catch (Exception e) {
                    OooOo00.this.OooOO0O(e);
                    return;
                }
                break;
            case 2:
                String errorType = (String) obj2;
                Throwable e2 = (Throwable) obj;
                b4 b4Var = b4.f46576OooO00o;
                Intrinsics.checkNotNullParameter(errorType, "$errorType");
                Intrinsics.checkNotNullParameter(e2, "$e");
                try {
                    Looper.prepare();
                    Toast toastMakeText = Toast.makeText(o000O00O.OooO00o(), errorType + ": " + o0000oo.OooO00o(e2), 1);
                    toastMakeText.setGravity(17, 0, 0);
                    toastMakeText.show();
                    Looper.loop();
                    b4.f46582OooO0oO = true;
                } catch (Exception e3) {
                    o0000O00.OooO00o(101, "CrashHandler", "handleException Toast error" + e3, null);
                }
                break;
            default:
                o00OOO0 detailBottomState = (o00OOO0) obj2;
                Intent intent = (Intent) obj;
                Intrinsics.checkNotNullParameter(detailBottomState, "$detailBottomState");
                if (!detailBottomState.f49178OooO00o.isDestroyed()) {
                    detailBottomState.OooO0O0(true);
                    FriendInfo friendInfo = (FriendInfo) intent.getSerializableExtra("Data");
                    if (friendInfo != null) {
                        EditTextSpan editTextSpanOooO00o = detailBottomState.OooO00o();
                        UserInfo userInfo = friendInfo.getUserInfo();
                        Intrinsics.checkNotNull(userInfo);
                        String userName = userInfo.getUserName();
                        UserInfo userInfo2 = friendInfo.getUserInfo();
                        Intrinsics.checkNotNull(userInfo2);
                        editTextSpanOooO00o.OooO00o("@", new oOo00ooO(userName, userInfo2.getUserId()));
                    }
                    break;
                }
                break;
        }
    }
}
