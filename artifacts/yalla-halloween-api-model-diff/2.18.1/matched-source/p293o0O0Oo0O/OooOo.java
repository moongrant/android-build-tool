package p293o0O0Oo0O;

import com.google.android.exoplayer2.audio.OooO00o;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.ui.activity.moment.PostDetailActivity;
import com.yalla.yalla.ui.vm.message.PrivateChatVM;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import p294o0O0Oo0o.o0O0O00;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooOo implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f35749Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f35750Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Object f35751Oooo0oo;

    public /* synthetic */ OooOo(Object obj, Object obj2, int i) {
        this.f35749Oooo0o = i;
        this.f35750Oooo0oO = obj;
        this.f35751Oooo0oo = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f35749Oooo0o) {
            case 0:
                OooO00o.C0096OooO00o c0096OooO00o = (OooO00o.C0096OooO00o) this.f35750Oooo0oO;
                o0O0O00 o0o0o00 = (o0O0O00) this.f35751Oooo0oo;
                Objects.requireNonNull(c0096OooO00o);
                synchronized (o0o0o00) {
                }
                OooO00o oooO00o = c0096OooO00o.f13553OooO0O0;
                int i = o000OOo0.f36740OooO00o;
                oooO00o.Oooo0oo(o0o0o00);
                break;
            default:
                PostDetailActivity this$0 = (PostDetailActivity) this.f35750Oooo0oO;
                MomentDetailModel data = (MomentDetailModel) this.f35751Oooo0oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(data, "$data");
                ((PrivateChatVM) this$0.f22430o00Ooo.getValue()).updateMsgMoment(this$0.f22425Oooooo0, data, this$0.OooOooO().f50589OooOOOO.getContentTextContent());
                LiveEventBus.get("MOMENT_DETAIL_DATA_REFRESH_FOR_PRIVATE_CHAT").post(this$0.f22425Oooooo0);
                break;
        }
    }
}
