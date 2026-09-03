package p354o0OOOo00;

import android.view.KeyEvent;
import android.view.View;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.twitter.sdk.android.tweetui.internal.VideoControlView;
import com.twitter.sdk.android.tweetui.internal.VideoView;
import com.yalla.yalla.ui.activity.room.MemberListRemoveActivity;
import com.yalla.yalla.ui.activity.room.o000Oo0;
import kotlin.jvm.internal.Intrinsics;
import p205o00o0o0o.o000O;
import p565o0oOo000.o000OOo;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class OooOo implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f42892OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f42893OooO0o0;

    public /* synthetic */ OooOo(KeyEvent.Callback callback, int i) {
        this.f42892OooO0Oo = i;
        this.f42893OooO0o0 = callback;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f42892OooO0Oo;
        KeyEvent.Callback callback = this.f42893OooO0o0;
        switch (i) {
            case 0:
                VideoControlView videoControlView = (VideoControlView) callback;
                if (((VideoView) videoControlView.f21919OooO0Oo).OooO0OO()) {
                    ((VideoView) videoControlView.f21919OooO0Oo).OooO0o0();
                } else {
                    ((VideoView) videoControlView.f21919OooO0Oo).OooO0oO();
                }
                videoControlView.OooO0O0();
                break;
            default:
                MemberListRemoveActivity this$0 = (MemberListRemoveActivity) callback;
                int i2 = MemberListRemoveActivity.f26112OooOoO0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.getClass();
                o000O o000o = new o000O(this$0);
                o000o.OooOoO(o0000.OooO0OO(o000OOo.room_member_remove_dialog_title));
                o000o.OooOo00(o0000O.OooO00o(o0000.OooO0OO(o000OOo.room_member_remove_dialog_info), String.valueOf(this$0.f26117OooOo0O.size())));
                o000o.OooOo0(new o000Oo0(this$0));
                o000o.OooOo(true);
                o000o.OooOO0o();
                break;
        }
    }
}
