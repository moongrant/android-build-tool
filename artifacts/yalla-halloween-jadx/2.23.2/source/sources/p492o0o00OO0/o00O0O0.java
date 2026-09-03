package p492o0o00OO0;

import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.http.iteratehttp.OooO0OO;
import com.yalla.yalla.ui.activity.moment.MomentReplyActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0O0 extends OooO0OO.OooO0O0 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MomentReplyActivity f49162OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ boolean f49163OooO0o0;

    public o00O0O0(boolean z, MomentReplyActivity momentReplyActivity) {
        this.f49163OooO0o0 = z;
        this.f49162OooO0o = momentReplyActivity;
    }

    @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
    public final void OooO0o0(@NotNull String response) {
        Intrinsics.checkNotNullParameter(response, "response");
        o0000O00.OooO0O0("response = " + response);
        LiveEventBus.get("POST_COMMENT_LIST_REFRESH_FOR_REPLY_DEL").post(Boolean.TRUE);
        boolean z = this.f49163OooO0o0;
        MomentReplyActivity momentReplyActivity = this.f49162OooO0o;
        if (z) {
            momentReplyActivity.finish();
        } else {
            int i = MomentReplyActivity.f25700OooOoO;
            momentReplyActivity.OooOoOO(true);
        }
    }
}
