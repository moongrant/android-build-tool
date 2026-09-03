package androidx.media3.ui;

import android.view.View;
import android.widget.LinearLayout;
import com.code.android.util.o000OO00;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.ui.StyledPlayerControlView;
import com.yalla.yalla.ui.activity.room.ExploreCountryRoomListActivity;
import com.yalla.yalla.ui.view.SetLuckyNumberLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOO0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f6562OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f6563OooO0o0;

    public /* synthetic */ OooOO0(Object obj, int i) {
        this.f6562OooO0Oo = i;
        this.f6563OooO0o0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f6562OooO0Oo;
        Object obj = this.f6563OooO0o0;
        switch (i) {
            case 0:
                PlayerControlView.OooO00o((PlayerControlView) obj);
                break;
            case 1:
                StyledPlayerControlView styledPlayerControlView = StyledPlayerControlView.this;
                Player player = styledPlayerControlView.f13937Oooooo;
                if (player != null && player.Oooo0O0(29)) {
                    com.google.android.exoplayer2.trackselection.OooO oooOOooOO0o = styledPlayerControlView.f13937Oooooo.OooOO0o();
                    Player player2 = styledPlayerControlView.f13937Oooooo;
                    int i2 = o0O00.f40595OooO00o;
                    player2.OooooOO(oooOOooOO0o.OooO00o().OooO0O0(1).OooO0o(1).OooO00o());
                    styledPlayerControlView.f13883OooO.f13962OooO0O0[1] = styledPlayerControlView.getResources().getString(com.google.android.exoplayer2.ui.Oooo0.exo_track_selection_auto);
                    styledPlayerControlView.f13892OooOOO.dismiss();
                    break;
                }
                break;
            case 2:
                ExploreCountryRoomListActivity this$0 = (ExploreCountryRoomListActivity) obj;
                int i3 = ExploreCountryRoomListActivity.f26525OooOoo0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                LinearLayout linearLayout = this$0.OooOo().f58507OooO0OO.f57723OooO0OO;
                Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.llCountries.llCountryRoot");
                o000OO00.OooO0O0(linearLayout);
                break;
            default:
                SetLuckyNumberLayout this$1 = (SetLuckyNumberLayout) obj;
                int i4 = SetLuckyNumberLayout.f30669OooO;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.OooO0OO(2);
                this$1.currRange = 2;
                Function1<? super Integer, Unit> function1 = this$1.rangeListener;
                if (function1 != null) {
                    function1.invoke(2);
                }
                break;
        }
    }
}
