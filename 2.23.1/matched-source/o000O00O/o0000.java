package o000O00O;

import androidx.media3.common.Player;
import com.facebook.appevents.internal.FileDownloadTask;
import com.facebook.appevents.ml.ModelManager;
import com.yalla.yalla.ui.activity.moment.TopicBlackListActivity;
import com.yalla.yalla.ui.view.moment.MomentDetailCommentItemView;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p569o0oOo0Oo.o0O0OO0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0000 implements o000OoO.o00000.OooO00o, FileDownloadTask.Callback, o0O0OO0, o0oo00oO.o0000O0O.OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f33999OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f34000OooO0o0;

    public /* synthetic */ o0000(Object obj, int i) {
        this.f33999OooO0Oo = i;
        this.f34000OooO0o0 = obj;
    }

    @Override // o0oo00oO.o0000O0O.OooO00o
    public final void OooO0O0() {
        MomentDetailCommentItemView this$0 = (MomentDetailCommentItemView) this.f34000OooO0o0;
        int i = MomentDetailCommentItemView.f30545OooOOO;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.OooO0oO();
    }

    @Override // p569o0oOo0Oo.o0O0OO0
    public final void OooO0Oo() {
        TopicBlackListActivity this$0 = (TopicBlackListActivity) this.f34000OooO0o0;
        int i = TopicBlackListActivity.f25828OooOo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.OooOoO0(true);
    }

    @Override // o000OoO.o00000.OooO00o
    public final void invoke(Object obj) {
        int i = this.f33999OooO0Oo;
        Object obj2 = this.f34000OooO0o0;
        switch (i) {
            case 0:
                ((Player.OooO0OO) obj).onAvailableCommandsChanged(((androidx.media3.exoplayer.OooO) obj2).f7165Oooo0o0);
                return;
            default:
                ((androidx.media3.session.o000O0Oo.OooO0OO) obj2).getClass();
                throw null;
        }
    }

    @Override // com.facebook.appevents.internal.FileDownloadTask.Callback
    public final void onComplete(File file) {
        ModelManager.TaskHandler.Companion.m4100execute$lambda1((List) this.f34000OooO0o0, file);
    }
}
