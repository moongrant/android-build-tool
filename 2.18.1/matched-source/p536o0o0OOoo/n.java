package p536o0o0OOoo;

import android.view.MotionEvent;
import android.view.View;
import com.app.base.base.activity.BaseActivity;
import com.yalla.yalla.ui.activity.message.PrivateChatActivity;
import com.yalla.yalla.ui.activity.moment.PostDetailActivity;
import kotlin.jvm.internal.Intrinsics;
import p470o0Oooo0.o00O0000;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n implements View.OnTouchListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f43821Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ BaseActivity f43822Oooo0oO;

    public /* synthetic */ n(BaseActivity baseActivity, int i) {
        this.f43821Oooo0o = i;
        this.f43822Oooo0oO = baseActivity;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f43821Oooo0o) {
            case 0:
                PrivateChatActivity this$0 = (PrivateChatActivity) this.f43822Oooo0oO;
                PrivateChatActivity.OooO00o oooO00o = PrivateChatActivity.f22166o00oO0o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.Oooo000();
                o00O0000 o00o0001 = this$0.f22174OooooOo;
                if (o00o0001 != null) {
                    Intrinsics.checkNotNull(o00o0001);
                    o00o0001.OooO0OO();
                }
                return false;
            default:
                PostDetailActivity this$1 = (PostDetailActivity) this.f43822Oooo0oO;
                PostDetailActivity.OooO00o oooO00o2 = PostDetailActivity.f22417o0O0O00;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.Oooo0oO(false);
                return true;
        }
    }
}
