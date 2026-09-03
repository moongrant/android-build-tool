package p318o0O0oOoo;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.yalla.yalla.model.moment.MomentCommentDetailModel;
import p593o0oo0.OooOOOO;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00O0OO0 implements SuccessContinuation, OooOOOO.OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f41996OooO0Oo;

    public /* synthetic */ o00O0OO0(Object obj) {
        this.f41996OooO0Oo = obj;
    }

    @Override // o0oo0.OooOOOO.OooO00o
    public final void OooO0Oo() {
        o0000O00.OooO0oO("onTextClicked setViewData 动态详情 postCommentDetailModel = " + ((MomentCommentDetailModel) this.f41996OooO0Oo));
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task then(Object obj) {
        return Tasks.forResult((ConfigFetchHandler.FetchResponse) this.f41996OooO0Oo);
    }
}
