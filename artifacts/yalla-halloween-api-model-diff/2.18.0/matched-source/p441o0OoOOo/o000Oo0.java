package p441o0OoOOo;

import android.view.View;
import android.widget.EditText;
import com.twitter.sdk.android.tweetui.internal.VideoControlView;
import com.twitter.sdk.android.tweetui.internal.VideoView;
import com.yalla.yalla.ui.activity.room.CreateRoomActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000Oo0 implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f40129Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f40130OoooO00;

    public /* synthetic */ o000Oo0(Object obj, int i) {
        this.f40129Oooo = i;
        this.f40130OoooO00 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f40129Oooo) {
            case 0:
                VideoControlView videoControlView = (VideoControlView) this.f40130OoooO00;
                if (((VideoView) videoControlView.f20212Oooo).OooO0Oo()) {
                    ((VideoView) videoControlView.f20212Oooo).OooO0o();
                } else {
                    ((VideoView) videoControlView.f20212Oooo).OooO();
                }
                videoControlView.OooO0OO();
                break;
            default:
                CreateRoomActivity this$0 = (CreateRoomActivity) this.f40130OoooO00;
                CreateRoomActivity.OooO00o oooO00o = CreateRoomActivity.f22793o00O0O;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                EditText editText = this$0.f22795Ooooo0o;
                if (editText == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("etRoomName");
                    editText = null;
                }
                editText.setText((CharSequence) null);
                break;
        }
    }
}
