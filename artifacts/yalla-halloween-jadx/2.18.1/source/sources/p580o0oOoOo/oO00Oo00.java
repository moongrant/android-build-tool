package p580o0oOoOo;

import android.os.Looper;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p074o000O0oo.OooOOO;
import p159o00OoOO.o00;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o0O0ooO;
import p497o0o00Oo.OooOOO0;
import p530o0o0OOO.o00O;
import p606o0oo0O.OooOo;
import p607o0oo0O0.oo000o;

/* JADX INFO: loaded from: classes3.dex */
public final class oO00Oo00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ long f46550Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ int f46551Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ oo000o f46552Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00Oo00(long j, int i, oo000o oo000oVar) {
        super(0);
        this.f46550Oooo0o = j;
        this.f46551Oooo0oO = i;
        this.f46552Oooo0oo = oo000oVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        OooOo.OooO0O0("102022");
        if (this.f46550Oooo0o > 0) {
            String strOooO0OO = o000O0O0.OooO0OO(R.string.ower_invites_member_once_time);
            o00O o00o2 = o00O.f43140OooO00o;
            double d = 60;
            String strOooO00o = com.yalla.support.common.util.OooOo.OooO00o(strOooO0OO, new BigDecimal(((o00O.f43171Oooo0 / ((double) 1000)) / d) / d).setScale(0, RoundingMode.FLOOR).toString());
            ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
            if (!StringsKt.isBlank(strOooO00o)) {
                o0O0ooO o0o0oooOooO0O0 = OooOOO.OooO0O0(toastUtil, strOooO00o, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o0o0oooOooO0O0.run();
                } else {
                    o00O000 o00o001 = o00O000.f34346OooO00o;
                    o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
                }
            }
        } else if (this.f46551Oooo0oO == 0) {
            String strOooO0OO2 = o000O0O0.OooO0OO(R.string.ower_invites_member_exhausted);
            ToastUtil toastUtil2 = ToastUtil.f12568OooO0O0;
            if (!(strOooO0OO2 == null || StringsKt.isBlank(strOooO0OO2))) {
                o0O0ooO o0o0oooOooO0O1 = OooOOO.OooO0O0(toastUtil2, strOooO0OO2, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o0o0oooOooO0O1.run();
                } else {
                    o00O000 o00o002 = o00O000.f34346OooO00o;
                    o00O000.f34348OooO0OO.post(o0o0oooOooO0O1);
                }
            }
        } else {
            o00O.OooOO0 oooOO1 = o00O.OooOO0.f43243OooO00o;
            if (o00O.OooOO0.f43246OooO0Oo.size() <= 1) {
                String strOooO0OO3 = o000O0O0.OooO0OO(R.string.invite_no_one);
                ToastUtil toastUtil3 = ToastUtil.f12568OooO0O0;
                if (!(strOooO0OO3 == null || StringsKt.isBlank(strOooO0OO3))) {
                    o0O0ooO o0o0oooOooO0O2 = OooOOO.OooO0O0(toastUtil3, strOooO0OO3, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o0o0oooOooO0O2.run();
                    } else {
                        o00O000 o00o003 = o00O000.f34346OooO00o;
                        o00O000.f34348OooO0OO.post(o0o0oooOooO0O2);
                    }
                }
            } else {
                OooOOO0 oooOOO0 = OooOOO0.f41180OooO00o;
                if (OooOOO0.OooOO0o().OooOO0O()) {
                    Objects.requireNonNull(p159o00OoOO.o00O000.OooO());
                    o00 o00Var = p159o00OoOO.o00O000.f32468OooO00o;
                    if (o00Var != null) {
                        o00Var.OooO0oO(1000900, null);
                    }
                } else {
                    this.f46552Oooo0oo.f48331OooO0Oo.setValue(Boolean.valueOf(OooOOO0.OooOO0o().OooOO0O()));
                    this.f46552Oooo0oo.f48330OooO0OO.setValue(Boolean.TRUE);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
