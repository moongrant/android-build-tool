package androidx.media3.ui;

import android.view.View;
import android.widget.LinearLayout;
import com.code.android.util.o000OO00;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.ui.StyledPlayerControlView;
import com.yalla.yalla.ui.activity.room.ExploreTagRoomListActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOOO implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f6566OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f6567OooO0o0;

    public /* synthetic */ OooOOO(Object obj, int i) {
        this.f6566OooO0Oo = i;
        this.f6567OooO0o0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f6566OooO0Oo;
        Object obj = this.f6567OooO0o0;
        switch (i) {
            case 0:
                PlayerControlView.this.getClass();
                break;
            case 1:
                StyledPlayerControlView styledPlayerControlView = StyledPlayerControlView.this;
                Player player = styledPlayerControlView.f13937Oooooo;
                if (player != null && player.Oooo0O0(29)) {
                    styledPlayerControlView.f13937Oooooo.OooooOO(styledPlayerControlView.f13937Oooooo.OooOO0o().OooO00o().OooO0O0(3).OooO0Oo().OooO00o());
                    styledPlayerControlView.f13892OooOOO.dismiss();
                    break;
                }
                break;
            default:
                ExploreTagRoomListActivity this$0 = (ExploreTagRoomListActivity) obj;
                int i2 = ExploreTagRoomListActivity.f26546OooOoOO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                LinearLayout linearLayout = this$0.OooOo().f58582OooO0OO.f57813OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.llTags.llTagRoot");
                o000OO00.OooO0O0(linearLayout);
                break;
        }
    }
}
