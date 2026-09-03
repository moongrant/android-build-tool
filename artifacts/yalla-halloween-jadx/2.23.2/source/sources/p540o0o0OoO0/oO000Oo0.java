package p540o0o0OoO0;

import android.os.CountDownTimer;
import androidx.compose.runtime.MutableState;
import com.yalla.yalla.model.CheckConveneMemberStatusModel;
import com.yalla.yalla.model.GetConveneMemberStateModel;
import com.yalla.yalla.service.room.OooO00o;
import java.util.ArrayList;
import p483o0o000Oo.o00000OO;
import p606o0oo0O0o.o0O0O0o0;

/* JADX INFO: loaded from: classes4.dex */
public final class oO000Oo0 extends CountDownTimer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ MutableState<Long> f54940OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ MutableState<String> f54941OooO0O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO000Oo0(long j, MutableState<Long> mutableState, MutableState<String> mutableState2) {
        super(j, 1000L);
        this.f54940OooO00o = mutableState;
        this.f54941OooO0O0 = mutableState2;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        this.f54941OooO0O0.setValue("");
        ArrayList arrayList = OooO00o.f24511OooO00o;
        o00000OO o00000oo2 = OooO00o.f24518OooO0oo;
        CheckConveneMemberStatusModel value = o00000oo2.f48487OooO0OO.getValue();
        if (value != null) {
            CheckConveneMemberStatusModel checkConveneMemberStatusModelClone = CheckConveneMemberStatusModel.INSTANCE.clone(value);
            checkConveneMemberStatusModelClone.setState(2);
            o00000oo2.f48487OooO0OO.postValue(checkConveneMemberStatusModelClone);
        }
        GetConveneMemberStateModel value2 = o00000oo2.f48486OooO0O0.getValue();
        if (value2 != null) {
            GetConveneMemberStateModel getConveneMemberStateModelClone = GetConveneMemberStateModel.INSTANCE.clone(value2);
            getConveneMemberStateModelClone.setState(2);
            o00000oo2.f48486OooO0O0.postValue(getConveneMemberStateModelClone);
        }
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        this.f54940OooO00o.setValue(Long.valueOf(j));
        this.f54941OooO0O0.setValue(o0O0O0o0.OooO00o(j));
    }
}
