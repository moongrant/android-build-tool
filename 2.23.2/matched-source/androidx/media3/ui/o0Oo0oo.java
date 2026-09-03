package androidx.media3.ui;

import android.view.View;
import android.widget.LinearLayout;
import com.code.android.util.o000O;
import com.yalla.yalla.ui.activity.room.ExploreTagRoomListActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o0Oo0oo implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f9894OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f9895OooO0o0;

    public /* synthetic */ o0Oo0oo(Object obj, int i) {
        this.f9894OooO0Oo = i;
        this.f9895OooO0o0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f9894OooO0Oo;
        Object obj = this.f9895OooO0o0;
        switch (i) {
            case 0:
                o0O0O00.OooO00o((o0O0O00) obj, view);
                break;
            default:
                ExploreTagRoomListActivity this$0 = (ExploreTagRoomListActivity) obj;
                int i2 = ExploreTagRoomListActivity.f26094OooOoOO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                LinearLayout llTagRoot = this$0.OooOo().f44742OooO0OO.f44777OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(llTagRoot, "llTagRoot");
                o000O.OooO0O0(llTagRoot);
                break;
        }
    }
}
