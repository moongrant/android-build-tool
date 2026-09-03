package p023Oooo00o;

import android.content.Intent;
import android.hardware.camera2.CameraCaptureSession;
import androidx.media3.exoplayer.audio.OooO0O0;
import com.yalla.yalla.data.db.table.FriendInfo;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.ui.view.editTextSpan.EditTextSpan;
import kotlin.jvm.internal.Intrinsics;
import p080o000OoO.o000OO00;
import p493o0o00O0o.oO0O0O0o;
import p559o0oOOoo0.o0O000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oO0Oo0oo implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f978OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f979OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f980OooO0o0;

    public /* synthetic */ oO0Oo0oo(int i, Object obj, Object obj2) {
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
                ((oO0000O.OooO0OO) obj2).f922OooO00o.onActive((CameraCaptureSession) obj);
                break;
            case 1:
            default:
                oO0O0O0o detailBottomState = (oO0O0O0o) obj2;
                Intent intent = (Intent) obj;
                Intrinsics.checkNotNullParameter(detailBottomState, "$detailBottomState");
                if (!detailBottomState.f49261OooO00o.isDestroyed()) {
                    detailBottomState.OooO0O0(true);
                    FriendInfo friendInfo = (FriendInfo) intent.getSerializableExtra("Data");
                    if (friendInfo != null) {
                        EditTextSpan editTextSpanOooO00o = detailBottomState.OooO00o();
                        UserInfo userInfo = friendInfo.getUserInfo();
                        Intrinsics.checkNotNull(userInfo);
                        String userName = userInfo.getUserName();
                        UserInfo userInfo2 = friendInfo.getUserInfo();
                        Intrinsics.checkNotNull(userInfo2);
                        editTextSpanOooO00o.OooO00o("@", new o0O000(userName, userInfo2.getUserId()));
                    }
                    break;
                }
                break;
            case 2:
                OooO0O0.OooO00o oooO00o = (OooO0O0.OooO00o) obj2;
                oooO00o.getClass();
                int i2 = o000OO00.f34965OooO00o;
                oooO00o.f7535OooO0O0.OooOOo((Exception) obj);
                break;
        }
    }
}
