package p541o0o0OoOO;

import android.content.SharedPreferences;
import com.yalla.yalla.data.db.model.MusicTable;
import com.yalla.yalla.data.manager.MusicState;
import com.yalla.yalla.service.room.OooO00o;
import com.yalla.yalla.service.room.RoomLiveService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p004OooO0oO.o0OoOo0;
import p269o00oooo0.o0O0oo0o;
import p355o0OOOo0o.OooO;
import p355o0OOOo0o.OooO0o;
import p390o0OOooo.o00000;
import p475o0Ooooo0.o0O00oO0;
import p482o0o000OO.OooOOO;
import p535o0o0Oo0.oO0O00;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
public final class oOOO0OOO extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ boolean f55274OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f55275OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ boolean f55276OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ long f55277OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOOO0OOO(int i, long j, boolean z, boolean z2) {
        super(1);
        this.f55274OooO0Oo = z;
        this.f55276OooO0o0 = z2;
        this.f55275OooO0o = i;
        this.f55277OooO0oO = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        Integer num;
        if (bool.booleanValue()) {
            if (!this.f55274OooO0Oo) {
                boolean z = MusicState.f22363OooO0O0.getValue() == MusicState.State.Playing;
                boolean z2 = oO0O00.f53970OooO00o;
                int iOooO0O0 = OooO0o.OooO0O0().OooO00o().OooO0O0();
                RoomLiveService roomLiveService = RoomLiveService.f24596OooOo00;
                if (roomLiveService != null) {
                    o0000O00.OooO0OO("RoomLiveService", "reJoinAudioChatChannel");
                    String str = roomLiveService.f24607OooOOO0;
                    if (str != null && (num = roomLiveService.f24605OooOO0o) != null) {
                        int iIntValue = num.intValue();
                        if (OooO00o.f24516OooO0o0.OooO0o0() != 0 && (!StringsKt.isBlank(str))) {
                            OooO oooO = roomLiveService.f24601OooO0oO;
                            if (oooO != null) {
                                oooO.OooO0Oo();
                            }
                            roomLiveService.OooO0Oo(iIntValue, str);
                        }
                    }
                }
                MusicTable value = MusicState.f22362OooO00o.getValue();
                if (z && value != null) {
                    oO0O00.OooO0o(value, 2);
                    int i = oO0O00.f53975OooO0o0;
                    OooO0o.OooO0O0().OooO00o().OooOO0o(i);
                    oO0O00.f53975OooO0o0 = i;
                    OooO0o.OooO0O0().OooO00o().OooOOo0(iOooO0O0);
                }
            }
            if (this.f55276OooO0o0) {
                OooOOO.OooO00o(true, true);
            } else {
                int i2 = this.f55275OooO0o + 1;
                String pullerId = String.valueOf(this.f55277OooO0oO);
                Intrinsics.checkNotNullParameter(pullerId, "pullerId");
                String str2 = "{\"micorder\":" + i2 + ",\"puller\":" + pullerId + "}";
                RoomLiveService roomLiveService2 = RoomLiveService.f24596OooOo00;
                if (roomLiveService2 != null) {
                    roomLiveService2.OooO0oO(10016, str2);
                }
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                String strOooO00o = o0OoOo0.OooO00o();
                p477o0o00.OooO0o oooO0oOooO00o = o0O0oo0o.OooO00o();
                String strConcat = "Hold_MIC_".concat(strOooO00o);
                SharedPreferences sharedPreferences = oooO0oOooO00o.f48377OooO00o;
                if ((sharedPreferences != null ? sharedPreferences.getInt(strConcat, 0) : 0) == 0) {
                    o00000.OooO00o("AFEventMic", null);
                    o0O0oo0o.OooO00o().OooO0OO(1, "Hold_MIC_".concat(strOooO00o));
                }
            }
        }
        return Unit.INSTANCE;
    }
}
