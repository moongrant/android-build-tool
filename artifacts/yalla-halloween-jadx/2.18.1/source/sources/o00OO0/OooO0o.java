package o00OO0;

import android.view.View;
import com.facebook.internal.security.CertificateUtil;
import com.yalla.yalla.data.db.model.RoomHistory;
import java.util.Objects;
import p016OooOoO0.OooOo00;
import p153o00Oo0oO.o00000OO;
import p153o00Oo0oO.o00oO0o;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o extends o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ RoomHistory f31178Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ OooOO0 f31179OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ p188o00o00o0.OooO0o f31180OoooO00;

    public OooO0o(OooOO0 oooOO1, RoomHistory roomHistory, p188o00o00o0.OooO0o oooO0o) {
        this.f31179OoooO0 = oooOO1;
        this.f31178Oooo = roomHistory;
        this.f31180OoooO00 = oooO0o;
    }

    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(View view) {
        OooOO0 oooOO1 = this.f31179OoooO0;
        RoomHistory roomHistory = this.f31178Oooo;
        String str = roomHistory.barid;
        String str2 = roomHistory.roomserverip;
        int layoutPosition = this.f31180OoooO00.getLayoutPosition();
        Objects.requireNonNull(oooOO1);
        if (com.yalla.support.common.util.OooO0OO.OooO00o(str)) {
            return;
        }
        if (com.yalla.support.common.util.OooO0OO.OooO0O0(str2) && str2.contains(CertificateUtil.DELIMITER)) {
            oooOO1.OooO00o(Long.valueOf(str).longValue(), str2, layoutPosition);
        } else {
            o00oO0o o00oo0o2 = o00000OO.f32207OooO00o;
            o00000OO.f32213OooO0oO.OooO0OO(OooOo00.OooO0Oo(str, ""), new OooO(oooOO1, layoutPosition));
        }
    }
}
