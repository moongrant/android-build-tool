package p485o0o00O0;

import android.view.View;
import com.yalla.yalla.service.room.OooO00o;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import com.yalla.yalla.ui.dialog.RoomBlackListUnJoinAndUnFollowDialog;
import com.yalla.yalla.ui.vm.LiveRoomVM;
import kotlin.jvm.internal.Intrinsics;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class oO0OoOO0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f48127OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ View.OnClickListener f48128OooO0o0;

    public /* synthetic */ oO0OoOO0(int i, View.OnClickListener onClickListener) {
        this.f48127OooO0Oo = i;
        this.f48128OooO0o0 = onClickListener;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f48127OooO0Oo;
        View.OnClickListener onClickListener = this.f48128OooO0o0;
        switch (i) {
            case 0:
                TopicDetailActivity this$0 = (TopicDetailActivity) onClickListener;
                int i2 = TopicDetailActivity.f26305OooOoOO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOoO0();
                break;
            default:
                RoomBlackListUnJoinAndUnFollowDialog this$1 = (RoomBlackListUnJoinAndUnFollowDialog) onClickListener;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                o0OO000.OooO00o("101022");
                ((LiveRoomVM) this$1.f27910OooOOO0.getValue()).unJoinRoom(String.valueOf(OooO00o.f24978OooO0o0.OooO0o0())).observe(this$1.f27908OooOO0O, new RoomBlackListUnJoinAndUnFollowDialog.OooO(new RoomBlackListUnJoinAndUnFollowDialog.OooO0O0(this$1)));
                break;
        }
    }
}
