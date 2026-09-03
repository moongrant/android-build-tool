package o000O00O;

import androidx.media3.common.Player;
import com.facebook.appevents.internal.FileDownloadTask;
import com.facebook.appevents.ml.ModelManager;
import com.yalla.yalla.ui.activity.moment.TopicBlackListActivity;
import com.yalla.yalla.ui.activity.user.FollowerActivity;
import com.yalla.yalla.ui.view.moment.MomentDetailCommentItemView;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0000Ooo implements o000OoO.o00000O0.OooO00o, FileDownloadTask.Callback, p559o0oOo.o00O0O, o0oo0.OooOOOO.OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f34022OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f34023OooO0o0;

    public /* synthetic */ o0000Ooo(Object obj, int i) {
        this.f34022OooO0Oo = i;
        this.f34023OooO0o0 = obj;
    }

    @Override // p559o0oOo.o00O0O
    public final void OooO0OO() {
        int i = this.f34022OooO0Oo;
        Object obj = this.f34023OooO0o0;
        switch (i) {
            case 3:
                TopicBlackListActivity this$0 = (TopicBlackListActivity) obj;
                int i2 = TopicBlackListActivity.f25826OooOo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOoO0(false);
                break;
            default:
                FollowerActivity this$1 = (FollowerActivity) obj;
                int i3 = FollowerActivity.f26638OooOo0o;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.OooOo0O();
                break;
        }
    }

    @Override // o0oo0.OooOOOO.OooO00o
    public final void OooO0Oo() {
        MomentDetailCommentItemView this$0 = (MomentDetailCommentItemView) this.f34023OooO0o0;
        int i = MomentDetailCommentItemView.f30535OooOOO;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.OooO0o();
    }

    @Override // o000OoO.o00000O0.OooO00o
    public final void invoke(Object obj) {
        int i = this.f34022OooO0Oo;
        Object obj2 = this.f34023OooO0o0;
        switch (i) {
            case 0:
                ((Player.OooO0OO) obj).onAvailableCommandsChanged(((androidx.media3.exoplayer.OooO) obj2).f7160Oooo0o0);
                return;
            default:
                ((androidx.media3.session.o000OO0O.OooO0OO) obj2).getClass();
                throw null;
        }
    }

    @Override // com.facebook.appevents.internal.FileDownloadTask.Callback
    public final void onComplete(File file) {
        ModelManager.TaskHandler.Companion.m4100execute$lambda1((List) this.f34023OooO0o0, file);
    }
}
