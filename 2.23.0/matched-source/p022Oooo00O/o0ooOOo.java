package p022Oooo00O;

import androidx.camera.core.impl.o000oOoO;
import com.yalla.yalla.model.moment.MomentReplyModel;
import com.yalla.yalla.ui.activity.moment.MomentReplyActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0ooOOo implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f894OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f895OooO0o0;

    public /* synthetic */ o0ooOOo(Object obj, int i) {
        this.f894OooO0Oo = i;
        this.f895OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f894OooO0Oo;
        Object obj = this.f895OooO0o0;
        switch (i) {
            case 0:
                ((o000oOoO) obj).OooO00o();
                return;
            default:
                MomentReplyActivity this$0 = (MomentReplyActivity) obj;
                int i2 = MomentReplyActivity.f26149OooOoO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (this$0.isDestroyed()) {
                    return;
                }
                try {
                    int size = this$0.OooOo().f10111OooOOoo.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 < size) {
                            MomentReplyModel momentReplyModel = this$0.OooOo().f10111OooOOoo.get(i3);
                            if (momentReplyModel == null || !momentReplyModel.getIsLocalMessageDiscolor()) {
                                i3++;
                            } else {
                                momentReplyModel.setLocalMessageDiscolor(false);
                            }
                        } else {
                            i3 = -1;
                        }
                    }
                    if (i3 != -1) {
                        this$0.OooOo().notifyItemChanged(i3 + this$0.OooOo().OooOOO0());
                        return;
                    }
                    return;
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
        }
    }
}
