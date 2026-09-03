package p318o0O0oOoo;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.yalla.yalla.model.moment.MomentReplyModel;
import java.net.HttpURLConnection;
import p302o0O0o0OO.o000;
import p593o0oo0.OooOOOO;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00O0OOO implements SuccessContinuation, OooOOOO.OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f41997OooO0Oo;

    @Override // o0oo0.OooOOOO.OooO00o
    public final void OooO0Oo() {
        o0000O00.OooO0oO("onTextClicked setViewData 动态详情 postCommentSonModel = " + ((MomentReplyModel) this.f41997OooO0Oo));
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task then(Object obj) {
        ((HttpURLConnection) this.f41997OooO0Oo).setRequestProperty("X-Goog-Firebase-Installations-Auth", ((o000) obj).OooO00o());
        return Tasks.forResult(null);
    }
}
