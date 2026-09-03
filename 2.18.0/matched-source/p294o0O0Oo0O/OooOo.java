package p294o0O0Oo0O;

import com.google.android.exoplayer2.audio.OooO00o;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.ui.activity.moment.PostDetailActivity;
import com.yalla.yalla.ui.vm.message.PrivateChatVM;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import p295o0O0Oo0o.o0O0O00;
import p319o0O0oOo.o00;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooOo implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f35770Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ Object f35771OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f35772OoooO00;

    public /* synthetic */ OooOo(Object obj, Object obj2, int i) {
        this.f35770Oooo = i;
        this.f35772OoooO00 = obj;
        this.f35771OoooO0 = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f35770Oooo) {
            case 0:
                OooO00o.C0096OooO00o c0096OooO00o = (OooO00o.C0096OooO00o) this.f35772OoooO00;
                o0O0O00 o0o0o00 = (o0O0O00) this.f35771OoooO0;
                Objects.requireNonNull(c0096OooO00o);
                synchronized (o0o0o00) {
                }
                OooO00o oooO00o = c0096OooO00o.f13570OooO0O0;
                int i = o00.f36680OooO00o;
                oooO00o.Oooo0oo(o0o0o00);
                break;
            default:
                PostDetailActivity this$0 = (PostDetailActivity) this.f35772OoooO00;
                MomentDetailModel data = (MomentDetailModel) this.f35771OoooO0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(data, "$data");
                ((PrivateChatVM) this$0.f22461oo000o.getValue()).updateMsgMoment(this$0.f22443Ooooooo, data, this$0.OooOooO().f50526OooOOOO.getContentTextContent());
                LiveEventBus.get("MOMENT_DETAIL_DATA_REFRESH_FOR_PRIVATE_CHAT").post(this$0.f22443Ooooooo);
                break;
        }
    }
}
