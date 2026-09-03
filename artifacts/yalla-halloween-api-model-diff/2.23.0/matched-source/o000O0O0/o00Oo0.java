package o000O0O0;

import com.code.android.util.o000OO00;
import com.yalla.yalla.ui.activity.user.BadgeActivity;
import com.yalla.yalla.ui.view.MarqueeRecyclerView;
import com.yalla.yalla.ui.view.room.RoomMemberConveneCardView;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o00Oo0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f34790OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f34791OooO0o0;

    public /* synthetic */ o00Oo0(Object obj, int i) {
        this.f34790OooO0Oo = i;
        this.f34791OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f34790OooO0Oo;
        Object obj = this.f34791OooO0o0;
        switch (i) {
            case 0:
                o00Ooo this$0 = (o00Ooo) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.getClass();
                CollectionsKt.emptyList();
                throw null;
            case 1:
                BadgeActivity this$1 = (BadgeActivity) obj;
                int i2 = BadgeActivity.f27070OooOo;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                MarqueeRecyclerView marqueeRecyclerView = this$1.OooOoO0().f59205OooO0O0.f57524OooO0o0;
                Intrinsics.checkNotNullExpressionValue(marqueeRecyclerView, "binding.header.rvBanner");
                o000OO00.OooOO0O(marqueeRecyclerView, this$1.OooOoO0().f59205OooO0O0.f57524OooO0o0.getMeasuredWidth() - 1);
                return;
            default:
                RoomMemberConveneCardView this$2 = (RoomMemberConveneCardView) obj;
                int i3 = RoomMemberConveneCardView.f31321OooO0o;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                this$2.OooO00o();
                return;
        }
    }
}
