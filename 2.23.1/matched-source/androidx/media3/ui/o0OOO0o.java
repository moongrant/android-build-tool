package androidx.media3.ui;

import android.view.View;
import android.widget.LinearLayout;
import com.code.android.util.o000O;
import com.yalla.yalla.ui.activity.room.ExploreCountryRoomListActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o0OOO0o implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f9904OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f9905OooO0o0;

    public /* synthetic */ o0OOO0o(Object obj, int i) {
        this.f9904OooO0Oo = i;
        this.f9905OooO0o0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f9904OooO0Oo;
        Object obj = this.f9905OooO0o0;
        switch (i) {
            case 0:
                o0O0O00.OooO00o((o0O0O00) obj, view);
                break;
            default:
                ExploreCountryRoomListActivity this$0 = (ExploreCountryRoomListActivity) obj;
                int i2 = ExploreCountryRoomListActivity.f26075OooOoo0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                LinearLayout llCountryRoot = this$0.OooOo().f44741OooO0OO.f44775OooO0OO;
                Intrinsics.checkNotNullExpressionValue(llCountryRoot, "llCountryRoot");
                o000O.OooO0O0(llCountryRoot);
                break;
        }
    }
}
