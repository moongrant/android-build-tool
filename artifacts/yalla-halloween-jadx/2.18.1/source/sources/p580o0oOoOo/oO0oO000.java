package p580o0oOoOo;

import android.os.CountDownTimer;
import com.yalla.yalla.common.model.CheckConveneMemberStatusModel;
import com.yalla.yalla.model.GetConveneMemberStateModel;
import p100o000oOoO.o0O00OO;
import p530o0o0OOO.o00O;
import p621o0oo0o0o.o00O0;

/* JADX INFO: loaded from: classes3.dex */
public final class oO0oO000 extends CountDownTimer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<Long> f46657OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<String> f46658OooO0O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0oO000(long j, o0O00OO<Long> o0o00oo2, o0O00OO<String> o0o00oo3) {
        super(j, 1000L);
        this.f46657OooO00o = o0o00oo2;
        this.f46658OooO0O0 = o0o00oo3;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        this.f46658OooO0O0.setValue("");
        o00O.OooO0OO oooO0OO = o00O.OooO0OO.f43208OooO00o;
        CheckConveneMemberStatusModel value = o00O.OooO0OO.f43211OooO0Oo.getValue();
        if (value != null) {
            CheckConveneMemberStatusModel checkConveneMemberStatusModelClone = CheckConveneMemberStatusModel.INSTANCE.clone(value);
            checkConveneMemberStatusModelClone.setState(2);
            o00O.OooO0OO.f43211OooO0Oo.postValue(checkConveneMemberStatusModelClone);
        }
        GetConveneMemberStateModel value2 = o00O.OooO0OO.f43210OooO0OO.getValue();
        if (value2 != null) {
            GetConveneMemberStateModel getConveneMemberStateModelClone = GetConveneMemberStateModel.INSTANCE.clone(value2);
            getConveneMemberStateModelClone.setState(2);
            o00O.OooO0OO.f43210OooO0OO.postValue(getConveneMemberStateModelClone);
        }
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        this.f46657OooO00o.setValue(Long.valueOf(j));
        this.f46658OooO0O0.setValue(o00O0.OooO00o(j));
    }
}
