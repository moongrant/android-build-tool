package p544o0o0OoOO;

import com.yalla.yalla.ui.activity.room.MemberListConveneActivity;
import com.yalla.yalla.ui.view.SendMomentLocationPowerView;
import com.yalla.yalla.util.location.LocationInfo;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o00Oo00.OooO0OO;
import p186o00o00Oo.o0ooOOo;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q4 implements o0ooOOo, OooO0OO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f44297OooO0Oo;

    @Override // o00Oo00.OooO0OO
    public final void OooO00o(Object obj) {
        SendMomentLocationPowerView.OooO0O0((SendMomentLocationPowerView) this.f44297OooO0Oo, (LocationInfo) obj);
    }

    @Override // p186o00o00Oo.o0ooOOo
    public final void OooO0oO() {
        MemberListConveneActivity this$0 = (MemberListConveneActivity) this.f44297OooO0Oo;
        int i = MemberListConveneActivity.f22860o0OoOo0;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!StringsKt.isBlank(this$0.f22870Ooooooo)) {
            this$0.Oooo00o(this$0.f22870Ooooooo, true);
        } else {
            this$0.Oooo00O(true);
        }
    }
}
