package p438o0OoOOo;

import android.view.View;
import android.widget.EditText;
import com.twitter.sdk.android.tweetui.internal.VideoControlView;
import com.twitter.sdk.android.tweetui.internal.VideoView;
import com.yalla.yalla.ui.activity.room.CreateRoomActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000Oo0 implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f40109Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f40110Oooo0oO;

    public /* synthetic */ o000Oo0(Object obj, int i) {
        this.f40109Oooo0o = i;
        this.f40110Oooo0oO = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f40109Oooo0o) {
            case 0:
                VideoControlView videoControlView = (VideoControlView) this.f40110Oooo0oO;
                if (((VideoView) videoControlView.f20193Oooo0o).OooO0Oo()) {
                    ((VideoView) videoControlView.f20193Oooo0o).OooO0o();
                } else {
                    ((VideoView) videoControlView.f20193Oooo0o).OooO();
                }
                videoControlView.OooO0OO();
                break;
            default:
                CreateRoomActivity this$0 = (CreateRoomActivity) this.f40110Oooo0oO;
                CreateRoomActivity.OooO00o oooO00o = CreateRoomActivity.f22774Ooooooo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                EditText editText = this$0.f22776OoooOoO;
                if (editText == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("etRoomName");
                    editText = null;
                }
                editText.setText((CharSequence) null);
                break;
        }
    }
}
