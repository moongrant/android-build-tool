package p561o0oOOooo;

import androidx.lifecycle.MutableLiveData;
import com.yalla.yalla.model.RoomUserInfoModel;
import java.util.Objects;
import kotlin.collections.unsigned.OooO00o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p159o00OoOO.o00;
import p159o00OoOO.o00O000;
import p251o00ooO.o000Oo0;
import p391o0OOooOo.o0O00000;
import p498o0o00Oo0.OooOOO;
import p530o0o0OOO.o00O;
import p530o0o0OOO.o00OO00O;

/* JADX INFO: loaded from: classes3.dex */
public final class oO00o00O extends Lambda implements Function2<Integer, o000Oo0, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final oO00o00O f44914Oooo0o = new oO00o00O();

    public oO00o00O() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Integer num, o000Oo0 o000oo1) {
        int iIntValue = num.intValue();
        if (iIntValue != 0) {
            if (iIntValue != 1) {
                return null;
            }
            MutableLiveData<RoomUserInfoModel> mutableLiveData = o00OO00O.f43313OooooOo.OooO00o().f43366OoooOoo;
            o00O o00o2 = o00O.f43140OooO00o;
            Long value = OooOOO.f41216OooO00o.OooOo().getValue();
            if (value == null) {
                value = 0L;
            }
            mutableLiveData.postValue(o00o2.OooOO0(value.longValue()));
            return null;
        }
        Objects.requireNonNull(o00O000.OooO());
        String strOooO0O0 = OooO00o.OooO0O0(OooOOO.f41216OooO00o);
        o00 o00Var = o00O000.f32468OooO00o;
        if (o00Var != null) {
            o00Var.OooO0o(10017, "{\"to\":" + strOooO0O0 + "}");
        }
        o0O00000.OooO0OO("InRoom_leave_mic_success");
        return null;
    }
}
