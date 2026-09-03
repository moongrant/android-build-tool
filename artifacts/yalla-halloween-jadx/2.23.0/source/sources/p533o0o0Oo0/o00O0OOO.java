package p533o0o0Oo0;

import android.content.SharedPreferences;
import androidx.compose.runtime.Oooo0;
import com.android.billingclient.api.o0000OO0;
import com.yalla.yalla.data.db.model.MusicTable;
import com.yalla.yalla.data.manager.MusicState;
import com.yalla.yalla.service.room.OooO00o;
import com.yalla.yalla.service.room.RoomLiveService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p351o0OOOo0O.OooO;
import p351o0OOOo0O.OooOO0;
import p386o0OOooOo.o00O0O0O;
import p464o0Oooo.o000000O;
import p476o0o0000o.o0000O;
import p480o0o000Oo.o0OOO0o;
import p528o0o0OOOo.oOO0;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0OOO extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ boolean f54772OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f54773OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ boolean f54774OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ long f54775OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0OOO(int i, long j, boolean z, boolean z2) {
        super(1);
        this.f54772OooO0Oo = z;
        this.f54774OooO0o0 = z2;
        this.f54773OooO0o = i;
        this.f54775OooO0oO = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        Integer num;
        if (bool.booleanValue()) {
            if (!this.f54772OooO0Oo) {
                boolean z = MusicState.f22836OooO0O0.getValue() == MusicState.State.Playing;
                boolean z2 = oOO0.f54098OooO00o;
                int iOooO0O0 = OooO.OooO0O0().OooO00o().OooO0O0();
                RoomLiveService roomLiveService = RoomLiveService.f25058OooOo00;
                if (roomLiveService != null) {
                    OooOOO0.OooO0OO("RoomLiveService", "reJoinAudioChatChannel");
                    String str = roomLiveService.f25069OooOOO0;
                    if (str != null && (num = roomLiveService.f25067OooOO0o) != null) {
                        int iIntValue = num.intValue();
                        if (OooO00o.f24978OooO0o0.OooO0o0() != 0 && (!StringsKt.isBlank(str))) {
                            OooOO0 oooOO1 = roomLiveService.f25063OooO0oO;
                            if (oooOO1 != null) {
                                oooOO1.OooO0Oo();
                            }
                            roomLiveService.OooO0Oo(iIntValue, str);
                        }
                    }
                }
                MusicTable value = MusicState.f22835OooO00o.getValue();
                if (z && value != null) {
                    oOO0.OooO0o(value, 2);
                    int i = oOO0.f54103OooO0o0;
                    OooO.OooO0O0().OooO00o().OooOO0O(i);
                    oOO0.f54103OooO0o0 = i;
                    OooO.OooO0O0().OooO00o().OooOOOo(iOooO0O0);
                }
            }
            if (this.f54774OooO0o0) {
                o0000O.OooO00o(true, true);
            } else {
                int i2 = this.f54773OooO0o + 1;
                String pullerId = String.valueOf(this.f54775OooO0oO);
                Intrinsics.checkNotNullParameter(pullerId, "pullerId");
                String str2 = "{\"micorder\":" + i2 + ",\"puller\":" + pullerId + "}";
                RoomLiveService roomLiveService2 = RoomLiveService.f25058OooOo00;
                if (roomLiveService2 != null) {
                    roomLiveService2.OooO0oO(10016, str2);
                }
                o000000O o000000o2 = o000000O.f46674OooO00o;
                String strOooO00o = Oooo0.OooO00o();
                o0OOO0o o0ooo0oOooO0O0 = o0000OO0.OooO0O0();
                String strConcat = "Hold_MIC_".concat(strOooO00o);
                SharedPreferences sharedPreferences = o0ooo0oOooO0O0.f47688OooO00o;
                if ((sharedPreferences != null ? sharedPreferences.getInt(strConcat, 0) : 0) == 0) {
                    o00O0O0O.OooO00o("AFEventMic", null);
                    o0000OO0.OooO0O0().OooO0OO(1, "Hold_MIC_".concat(strOooO00o));
                }
            }
        }
        return Unit.INSTANCE;
    }
}
