package p580o0oOoOo;

import android.app.Activity;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p159o00OoOO.o000O00O;
import p159o00OoOO.o00O000;
import p254o00ooO0O.o000O0O0;
import p255o00ooO0o.oo0oOO0;
import p530o0o0OOO.o00O;
import p606o0oo0O.OooOo;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OO00o0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ long f46403Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO00o0(long j) {
        super(0);
        this.f46403Oooo0o = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        OooOo.OooO0O0("102236");
        int iOooO0oO = o000O00O.OooO().OooO0oO();
        if (o000O00O.OooO().OooO0oo() >= 0) {
            o00O000.OooO().OooOOO0(this.f46403Oooo0o, o00O.OooO0o.f43216OooO00o.OooO00o() > 0);
        } else if (iOooO0oO >= 0) {
            p254o00ooO0O.o00O000 o00o001 = p254o00ooO0O.o00O000.f34346OooO00o;
            Activity activityOooO0O0 = p254o00ooO0O.o00O000.OooO0O0();
            if (activityOooO0O0 != null) {
                long j = this.f46403Oooo0o;
                oo0oOO0 oo0ooo0 = new oo0oOO0(activityOooO0O0);
                oo0ooo0.OooOo0(R.string.only_locked_mic);
                oo0ooo0.OooOo(oo0ooO.f46737Oooo0o);
                oo0ooo0.OooOo0o(new o0OO00OO(j));
                oo0ooo0.OooOOO0();
            }
        } else {
            ToastUtil.f12567OooO00o.OooO0O0(o000O0O0.OooO0OO(R.string.microom_code_1005));
        }
        return Unit.INSTANCE;
    }
}
