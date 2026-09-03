package p540o0o0OoO0;

import android.os.Looper;
import androidx.activity.OooOo00;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.service.room.RoomLiveService;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import o0oo0000.OooO00o;
import p414o0Oo0oO.oO00OO0O;
import p415o0Oo0oO0.o00Ooo;
import p562o0oOo000.o000000;
import p581o0oOoo.o0000oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0oO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ long f55048OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o0000oo f55049OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f55050OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0oO0(long j, int i, o0000oo o0000ooVar) {
        super(0);
        this.f55048OooO0Oo = j;
        this.f55050OooO0o0 = i;
        this.f55049OooO0o = o0000ooVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        OooO00o.OooO0O0("102022");
        if (this.f55048OooO0Oo > 0) {
            double d = 60;
            String strOooO00o = o0000O.OooO00o(o0000.OooO0OO(o000000.ower_invites_member_once_time), new BigDecimal(((com.yalla.yalla.service.room.OooO00o.f24524OooOOOO.f48535OooOOo0 / ((double) 1000)) / d) / d).setScale(0, RoundingMode.FLOOR).toString());
            if (!StringsKt.isBlank(strOooO00o)) {
                o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(strOooO00o, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                }
            }
        } else if (this.f55050OooO0o0 == 0) {
            String strOooO0OO = o0000.OooO0OO(o000000.ower_invites_member_exhausted);
            if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                o000Oo0 o000oo0OooO00o2 = OooOo00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o2.run();
                } else {
                    o000O00O.f13422OooO0O0.post(o000oo0OooO00o2);
                }
            }
        } else if (com.yalla.yalla.service.room.OooO00o.f24519OooOO0.f48495OooO0OO.size() <= 1) {
            String strOooO0OO2 = o0000.OooO0OO(o000000.invite_no_one);
            if (!(strOooO0OO2 == null || StringsKt.isBlank(strOooO0OO2))) {
                o000Oo0 o000oo0OooO00o3 = OooOo00.OooO00o(strOooO0OO2, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o3.run();
                } else {
                    o000O00O.f13422OooO0O0.post(o000oo0OooO00o3);
                }
            }
        } else {
            Lazy lazy = o00Ooo.f46421OooOOOo;
            if (((oO00OO0O) lazy.getValue()).OooOO0O()) {
                RoomLiveService roomLiveService = RoomLiveService.f24596OooOo00;
                if (roomLiveService != null) {
                    roomLiveService.OooO0oo(1000900, null);
                }
            } else {
                o0000oo o0000ooVar = this.f55049OooO0o;
                o0000ooVar.f56613OooO0Oo.setValue(Boolean.valueOf(((oO00OO0O) lazy.getValue()).OooOO0O()));
                o0000ooVar.f56612OooO0OO.setValue(Boolean.TRUE);
            }
        }
        return Unit.INSTANCE;
    }
}
