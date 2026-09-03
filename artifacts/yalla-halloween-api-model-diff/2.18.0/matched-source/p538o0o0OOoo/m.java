package p538o0o0OOoo;

import android.view.MotionEvent;
import android.view.View;
import com.app.base.base.activity.BaseActivity;
import com.yalla.yalla.ui.activity.message.PrivateChatActivity;
import com.yalla.yalla.ui.activity.moment.PostDetailActivity;
import kotlin.jvm.internal.Intrinsics;
import p472o0Oooo0.o00O0000;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m implements View.OnTouchListener {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f43832Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ BaseActivity f43833OoooO00;

    public /* synthetic */ m(BaseActivity baseActivity, int i) {
        this.f43832Oooo = i;
        this.f43833OoooO00 = baseActivity;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f43832Oooo) {
            case 0:
                PrivateChatActivity this$0 = (PrivateChatActivity) this.f43833OoooO00;
                PrivateChatActivity.OooO00o oooO00o = PrivateChatActivity.f22185o0ooOOo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.Oooo000();
                o00O0000 o00o0001 = this$0.f22193OoooooO;
                if (o00o0001 != null) {
                    Intrinsics.checkNotNull(o00o0001);
                    o00o0001.OooO0OO();
                }
                return false;
            default:
                PostDetailActivity this$1 = (PostDetailActivity) this.f43833OoooO00;
                PostDetailActivity.OooO00o oooO00o2 = PostDetailActivity.f22436o000000O;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.Oooo0oO(false);
                return true;
        }
    }
}
