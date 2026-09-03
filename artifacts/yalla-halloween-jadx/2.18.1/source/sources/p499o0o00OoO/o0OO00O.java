package p499o0o00OoO;

import android.os.Handler;
import android.os.Looper;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.umeng.analytics.pro.ak;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p142o00OOooO.o000OO00;
import p142o00OOooO.o000OOo0;
import p166o00OoOoo.o0O00;
import p498o0o00Oo0.OooOOO;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o0OO00O extends o0O00 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Lazy f41369OooO0O0;

    public static final class OooO00o extends Lambda implements Function0<MutableLiveData<Boolean>> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Boolean> invoke() {
            o0OO00O o0oo00o2 = o0OO00O.this;
            StringBuilder sbOooO00o = o000OO00.OooO00o(o0oo00o2, "isPayEmojiHasRead");
            sbOooO00o.append(OooOOO.f41216OooO00o.OooOo().getValue());
            MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>(Boolean.valueOf(o0oo00o2.OooO00o(sbOooO00o.toString(), false)));
            o0OO00O o0oo00o3 = o0OO00O.this;
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0OOO0o(o0oo00o3));
            } else {
                new Handler(Looper.getMainLooper()).post(new o0Oo0oo(mutableLiveData, o0oo00o3));
            }
            return mutableLiveData;
        }
    }

    public o0OO00O() {
        super("guide_table");
        this.f41369OooO0O0 = LazyKt.lazy(new OooO00o());
    }

    public final boolean OooOO0O() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("hideEventManager");
        sbOooO0o0.append(OooOOO.f41216OooO00o.OooOo().getValue());
        return OooO00o(sbOooO0o0.toString(), false);
    }

    @NotNull
    public final MutableLiveData<Boolean> OooOO0o() {
        return (MutableLiveData) this.f41369OooO0O0.getValue();
    }

    public final void OooOOO() {
        o000OOo0.OooO00o(OooOOO.f41216OooO00o, OooO00o.OooO00o.OooO0o0("hideEventManager"), this, true);
    }

    public final void OooOOO0() {
        o000OOo0.OooO00o(OooOOO.f41216OooO00o, OooO00o.OooO00o.OooO0o0("isConveneMembersRead"), this, false);
    }

    public final void OooOOOO(boolean z) {
        o000OOo0.OooO00o(OooOOO.f41216OooO00o, OooO00o.OooO00o.OooO0o0("messageDot"), this, z);
    }

    public final void OooOOOo(boolean z) {
        o000OOo0.OooO00o(OooOOO.f41216OooO00o, OooO00o.OooO00o.OooO0o0(ak.N), this, z);
    }

    public final void OooOOo(boolean z) {
        o000OOo0.OooO00o(OooOOO.f41216OooO00o, OooO00o.OooO00o.OooO0o0("room"), this, z);
    }

    public final void OooOOo0(boolean z) {
        o000OOo0.OooO00o(OooOOO.f41216OooO00o, OooO00o.OooO00o.OooO0o0("related"), this, z);
    }

    public final void OooOOoo(boolean z) {
        o000OOo0.OooO00o(OooOOO.f41216OooO00o, OooO00o.OooO00o.OooO0o0("roomChat"), this, z);
    }

    public final void OooOo() {
        o000OOo0.OooO00o(OooOOO.f41216OooO00o, OooO00o.OooO00o.OooO0o0("showRoomApplyMicSettingDot"), this, false);
    }

    public final void OooOo0(boolean z) {
        o000OOo0.OooO00o(OooOOO.f41216OooO00o, OooO00o.OooO00o.OooO0o0("roomHook"), this, z);
    }

    public final void OooOo00(boolean z) {
        o000OOo0.OooO00o(OooOOO.f41216OooO00o, OooO00o.OooO00o.OooO0o0("roomGift"), this, z);
    }

    public final void OooOo0O() {
        o000OOo0.OooO00o(OooOOO.f41216OooO00o, OooO00o.OooO00o.OooO0o0("showRoomApplyMicGuideForManager"), this, false);
    }

    public final void OooOo0o() {
        o000OOo0.OooO00o(OooOOO.f41216OooO00o, OooO00o.OooO00o.OooO0o0("showRoomApplyMicGuideForMember"), this, false);
    }

    public final void OooOoO(boolean z) {
        o000OOo0.OooO00o(OooOOO.f41216OooO00o, OooO00o.OooO00o.OooO0o0("touristLoginRoom"), this, z);
    }

    public final void OooOoO0() {
        o000OOo0.OooO00o(OooOOO.f41216OooO00o, OooO00o.OooO00o.OooO0o0("showRoomSettingChangeGuide"), this, false);
    }

    public final void OooOoOO() {
        o000OOo0.OooO00o(OooOOO.f41216OooO00o, OooO00o.OooO00o.OooO0o0("userVehicleMessageDot"), this, false);
    }

    public final void OooOoo0(boolean z) {
        o000OOo0.OooO00o(OooOOO.f41216OooO00o, OooO00o.OooO00o.OooO0o0("welcome"), this, z);
    }
}
