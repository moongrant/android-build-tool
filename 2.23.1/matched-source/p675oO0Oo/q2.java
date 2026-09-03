package p675oO0Oo;

import android.view.View;
import com.yalla.yalla.ui.dialog.RoomBlackListUnJoinAndUnFollowDialog;
import com.yalla.yalla.ui.view.ThemeLayout;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class q2 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f59905OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f59906OooO0o0;

    public /* synthetic */ q2(Object obj, int i) {
        this.f59905OooO0Oo = i;
        this.f59906OooO0o0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f59905OooO0Oo;
        Object obj = this.f59906OooO0o0;
        switch (i) {
            case 0:
                RoomBlackListUnJoinAndUnFollowDialog this$0 = (RoomBlackListUnJoinAndUnFollowDialog) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooO0O0();
                break;
            default:
                Function0 function0 = (Function0) obj;
                int i2 = ThemeLayout.f30223OooO0o0;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
        }
    }
}
