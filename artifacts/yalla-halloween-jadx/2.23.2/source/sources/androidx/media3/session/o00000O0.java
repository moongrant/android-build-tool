package androidx.media3.session;

import androidx.media3.common.Player;
import com.yalla.yalla.data.db.model.ApiErrorCodeDB;
import com.yalla.yalla.ui.activity.main.PrivacyActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o00000O0 implements o000OoO.o00000O0.OooO0O0, o0OOooo0.o0OO00O.OooO0O0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f9288OooO0Oo;

    public /* synthetic */ o00000O0(Object obj) {
        this.f9288OooO0Oo = obj;
    }

    @Override // o000OoO.o00000O0.OooO0O0
    public final void OooO0O0(Object obj, androidx.media3.common.OooO oooO) {
        ((Player.OooO0OO) obj).onEvents(((o0000OO0) this.f9288OooO0Oo).OooO0o0(), new Player.OooO0O0(oooO));
    }

    @Override // o0OOooo0.o0OO00O.OooO0O0
    public final void OooO0OO(ApiErrorCodeDB apiErrorCodeDB) {
        PrivacyActivity this$0 = (PrivacyActivity) this.f9288OooO0Oo;
        int i = PrivacyActivity.f25004OooOoO;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.isDestroyed() || this$0.isFinishing()) {
            return;
        }
        p205o00o0o0o.o000O o000o = new p205o00o0o0o.o000O(this$0);
        String messge = apiErrorCodeDB.getMessge();
        Intrinsics.checkNotNullExpressionValue(messge, "getMessge(...)");
        o000o.OooOo00(messge);
        o000o.OooO0o(false);
        o000o.OooOO0(new p487o0o00O.o00O00O(this$0));
        o000o.OooOO0o();
    }
}
