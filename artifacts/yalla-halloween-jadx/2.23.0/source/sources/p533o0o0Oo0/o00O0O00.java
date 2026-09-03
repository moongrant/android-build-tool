package p533o0o0Oo0;

import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import com.code.android.util.o0000;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.service.room.OooO00o;
import com.yalla.yalla.service.room.OooO0O0;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p157o00OoOO0.o00O0O;
import p464o0Oooo.o000000O;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0O00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oo0O f54766OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Context f54767OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O00(oo0O oo0o, Context context) {
        super(0);
        this.f54766OooO0Oo = oo0o;
        this.f54767OooO0o0 = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        oo0O oo0o = this.f54766OooO0Oo;
        long jLongValue = oo0o.f54838OooO0OO.getValue().longValue();
        o000000O o000000o2 = o000000O.f46674OooO00o;
        Long l = (Long) o000000O.OooOOo0().getValue();
        if (l != null && jLongValue == l.longValue()) {
            o0OO000.OooO00o("102272");
            o00O0O o00o0o2 = new o00O0O(this.f54767OooO0o0, null);
            o00o0o2.OooOOO0(o0000.OooO0OO(oO00OOo0.Room_Dialog_leave_mic));
            o00o0o2.OooOOO0(o0000.OooO0OO(oO00OOo0.Room_Dialog_open_profile));
            o00o0o2.OooOOOo(o00O0.f54736OooO0Oo);
            o00o0o2.OooOO0o();
        } else {
            o0OO000.OooO00o("102273");
            MutableLiveData<RoomUserInfoModel> mutableLiveData = OooO0O0.f24995OoooOOO.OooO00o().f25040OoooO0;
            ArrayList arrayList = OooO00o.f24973OooO00o;
            mutableLiveData.postValue(OooO00o.OooO0o0(oo0o.f54838OooO0OO.getValue()));
        }
        return Unit.INSTANCE;
    }
}
