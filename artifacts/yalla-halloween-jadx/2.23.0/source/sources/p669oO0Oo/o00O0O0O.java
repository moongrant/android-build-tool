package p669oO0Oo;

import android.os.Looper;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.service.room.OooO00o;
import com.yalla.yalla.service.room.RoomLiveService;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p408o0Oo0o0O.o00Oo0;
import p577o0oOoOoO.oOO000;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0O0O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ long f60548OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ oOO000 f60549OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f60550OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O0O(long j, int i, oOO000 ooo000) {
        super(0);
        this.f60548OooO0Oo = j;
        this.f60550OooO0o0 = i;
        this.f60549OooO0o = ooo000;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0OO000.OooO00o("102022");
        if (this.f60548OooO0Oo > 0) {
            double d = 60;
            String strOooO00o = o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.ower_invites_member_once_time), new BigDecimal(((OooO00o.f24986OooOOOO.f47522OooOOo0 / ((double) 1000)) / d) / d).setScale(0, RoundingMode.FLOOR).toString());
            if (!StringsKt.isBlank(strOooO00o)) {
                o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO00o, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                }
            }
        } else if (this.f60550OooO0o0 == 0) {
            String strOooO0OO = o0000.OooO0OO(oO00OOo0.ower_invites_member_exhausted);
            if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                o000Oo0 o000oo0OooO00o2 = o000O00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o2.run();
                } else {
                    o000O0.f10355OooO0O0.post(o000oo0OooO00o2);
                }
            }
        } else if (OooO00o.f24981OooOO0.f47414OooO0OO.size() <= 1) {
            String strOooO0OO2 = o0000.OooO0OO(oO00OOo0.invite_no_one);
            if (!(strOooO0OO2 == null || StringsKt.isBlank(strOooO0OO2))) {
                o000Oo0 o000oo0OooO00o3 = o000O00.OooO00o(strOooO0OO2, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o3.run();
                } else {
                    o000O0.f10355OooO0O0.post(o000oo0OooO00o3);
                }
            }
        } else {
            Lazy lazy = o00Oo0.f45190OooOOOo;
            if (((p409o0Oo0o0o.o0000) lazy.getValue()).OooOO0O()) {
                RoomLiveService roomLiveService = RoomLiveService.f25058OooOo00;
                if (roomLiveService != null) {
                    roomLiveService.OooO0oo(1000900, null);
                }
            } else {
                oOO000 ooo000 = this.f60549OooO0o;
                ooo000.f56364OooO0Oo.setValue(Boolean.valueOf(((p409o0Oo0o0o.o0000) lazy.getValue()).OooOO0O()));
                ooo000.f56363OooO0OO.setValue(Boolean.TRUE);
            }
        }
        return Unit.INSTANCE;
    }
}
