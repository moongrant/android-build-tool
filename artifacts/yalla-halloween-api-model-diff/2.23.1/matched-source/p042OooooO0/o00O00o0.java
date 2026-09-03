package p042OooooO0;

import android.database.SQLException;
import android.util.Log;
import androidx.camera.video.OooOO0O;
import androidx.camera.video.internal.audio.AudioSourceAccessException;
import androidx.camera.video.internal.audio.OooO00o;
import com.google.android.datatransport.Priority;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.model.chat.ChatModel;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import oo0OOoo.OooO0OO;
import p028Oooo0oO.o00O0O0;
import p233o00oOoOO.o0OoO00O;
import p238o00oOooo.o0OO0O0;
import p238o00oOooo.o0OO0o00;
import p244o00oo0O0.o00000OO;
import p444o0OoOo0O.o0000O00;
import p474o0OoooOO.oo0oO0;
import p498o0o00Oo0.o0OO00O;
import p559o0oOOoo0.o0O000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00O00o0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1768OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f1769OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1770OooO0o0;

    public /* synthetic */ o00O00o0(int i, Object obj, Object obj2) {
        this.f1768OooO0Oo = i;
        this.f1770OooO0o0 = obj;
        this.f1769OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MutableStateFlow<Long> userId;
        MutableStateFlow<String> userName;
        MutableStateFlow<Long> userId2;
        int i = this.f1768OooO0Oo;
        Object obj = this.f1769OooO0o;
        Object obj2 = this.f1770OooO0o0;
        switch (i) {
            case 0:
                Throwable th = (Throwable) obj;
                OooOO0O.OooO0OO oooO0OO = (OooOO0O.OooO0OO) ((OooO00o.OooO0o) obj2);
                oooO0OO.getClass();
                o00O0O0.OooO0OO("Recorder", "Error occurred after audio source started.", th);
                if (th instanceof AudioSourceAccessException) {
                    oooO0OO.f3979OooO00o.accept(th);
                }
                break;
            case 1:
                OooO0OO oooO0OO2 = (OooO0OO) obj2;
                CountDownLatch countDownLatch = (CountDownLatch) obj;
                oooO0OO2.getClass();
                try {
                    o0OoO00O<CrashlyticsReport> o0ooo00o2 = oooO0OO2.f60293OooO0oo;
                    Priority priority = Priority.HIGHEST;
                    if (o0ooo00o2 instanceof o0OO0O0) {
                        o0OO0o00.OooO00o().f40021OooO0Oo.OooO00o(((o0OO0O0) o0ooo00o2).f40012OooO00o.OooO0o0(priority), 1);
                    } else {
                        String strOooO0OO = o00000OO.OooO0OO("ForcedSender");
                        if (Log.isLoggable(strOooO0OO, 5)) {
                            Log.w(strOooO0OO, String.format("Expected instance of `TransportImpl`, got `%s`.", o0ooo00o2));
                        }
                    }
                    break;
                } catch (SQLException unused) {
                }
                countDownLatch.countDown();
                break;
            default:
                ChatModel model = (ChatModel) obj;
                o0000O00 o0000o00 = ((MixedRoomActivity) obj2).f22988OoooO0.f49638OooO;
                if (o0000o00 != null) {
                    Intrinsics.checkNotNullParameter(model, "model");
                    o0000o00.OooO0O0();
                    RoomUserInfoModel newFrom = model.getNewFrom();
                    String value = null;
                    Long value2 = (newFrom == null || (userId2 = newFrom.getUserId()) == null) ? null : userId2.getValue();
                    oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
                    boolean zAreEqual = Intrinsics.areEqual(value2, oo0oO0.OooOOo0().getValue());
                    o0OO00O o0oo00o2 = o0000o00.f47238OooO0OO;
                    if (zAreEqual) {
                        o0oo00o2.OooO00o().setText("");
                    } else {
                        RoomUserInfoModel newFrom2 = model.getNewFrom();
                        if (newFrom2 != null && (userName = newFrom2.getUserName()) != null) {
                            value = userName.getValue();
                        }
                        RoomUserInfoModel newFrom3 = model.getNewFrom();
                        o0000o00.OooO00o(new o0O000(value, (newFrom3 == null || (userId = newFrom3.getUserId()) == null) ? 0L : userId.getValue().longValue()), false);
                    }
                    o0oo00o2.OooO0OO().f47271OooO00o.setValue(model);
                }
                break;
        }
    }
}
