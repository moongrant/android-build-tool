package p669oO0Oo;

import android.os.CountDownTimer;
import androidx.compose.runtime.MutableState;
import com.yalla.yalla.model.CheckConveneMemberStatusModel;
import com.yalla.yalla.model.GetConveneMemberStateModel;
import com.yalla.yalla.service.room.OooO00o;
import java.util.ArrayList;
import p475o0o000.o0OO00O;
import p601o0oo0O0.o0000oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00OO extends CountDownTimer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ MutableState<Long> f60605OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ MutableState<String> f60606OooO0O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00OO(long j, MutableState<Long> mutableState, MutableState<String> mutableState2) {
        super(j, 1000L);
        this.f60605OooO00o = mutableState;
        this.f60606OooO0O0 = mutableState2;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        this.f60606OooO0O0.setValue("");
        ArrayList arrayList = OooO00o.f24973OooO00o;
        o0OO00O o0oo00o2 = OooO00o.f24980OooO0oo;
        CheckConveneMemberStatusModel value = o0oo00o2.f47469OooO0OO.getValue();
        if (value != null) {
            CheckConveneMemberStatusModel checkConveneMemberStatusModelClone = CheckConveneMemberStatusModel.INSTANCE.clone(value);
            checkConveneMemberStatusModelClone.setState(2);
            o0oo00o2.f47469OooO0OO.postValue(checkConveneMemberStatusModelClone);
        }
        GetConveneMemberStateModel value2 = o0oo00o2.f47468OooO0O0.getValue();
        if (value2 != null) {
            GetConveneMemberStateModel getConveneMemberStateModelClone = GetConveneMemberStateModel.INSTANCE.clone(value2);
            getConveneMemberStateModelClone.setState(2);
            o0oo00o2.f47468OooO0O0.postValue(getConveneMemberStateModelClone);
        }
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        this.f60605OooO00o.setValue(Long.valueOf(j));
        this.f60606OooO0O0.setValue(o0000oo.OooO00o(j));
    }
}
