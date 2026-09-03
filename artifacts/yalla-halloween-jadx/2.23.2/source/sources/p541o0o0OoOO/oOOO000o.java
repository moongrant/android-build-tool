package p541o0o0OoOO;

import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import com.code.android.util.o0000;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.service.room.OooO0O0;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import o0oo0000.OooO00o;
import p205o00o0o0o.o000O0o;
import p475o0Ooooo0.o0O00oO0;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class oOOO000o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oo00 f55267OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Context f55268OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOOO000o(oo00 oo00Var, Context context) {
        super(0);
        this.f55267OooO0Oo = oo00Var;
        this.f55268OooO0o0 = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        oo00 oo00Var = this.f55267OooO0Oo;
        long jLongValue = oo00Var.f55307OooO0OO.getValue().longValue();
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        Long l = (Long) o0O00oO0.OooOOo0().getValue();
        if (l != null && jLongValue == l.longValue()) {
            OooO00o.OooO0O0("102272");
            o000O0o o000o0o2 = new o000O0o(this.f55268OooO0o0, null);
            o000o0o2.OooOOO0(o0000.OooO0OO(o000000.Room_Dialog_leave_mic));
            o000o0o2.OooOOO0(o0000.OooO0OO(o000000.Room_Dialog_open_profile));
            o000o0o2.OooOOOo(oOO.f55197OooO0Oo);
            o000o0o2.OooOO0o();
        } else {
            OooO00o.OooO0O0("102273");
            MutableLiveData<RoomUserInfoModel> mutableLiveData = OooO0O0.f24533OoooOOO.OooO00o().f24578OoooO0;
            ArrayList arrayList = com.yalla.yalla.service.room.OooO00o.f24511OooO00o;
            mutableLiveData.postValue(com.yalla.yalla.service.room.OooO00o.OooO0o0(oo00Var.f55307OooO0OO.getValue()));
        }
        return Unit.INSTANCE;
    }
}
