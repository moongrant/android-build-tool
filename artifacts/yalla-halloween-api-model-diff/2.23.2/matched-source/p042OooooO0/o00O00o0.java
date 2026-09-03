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
import p233o00oOoOO.o0O00;
import p238o00oOooo.o0OO0;
import p238o00oOooo.o0OOooO0;
import p244o00oo0O0.o00000OO;
import p442o0OoOo0O.o0000;
import p475o0Ooooo0.o0O00oO0;
import p557o0oOOooO.oOo00ooO;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00O00o0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1765OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f1766OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1767OooO0o0;

    public /* synthetic */ o00O00o0(int i, Object obj, Object obj2) {
        this.f1765OooO0Oo = i;
        this.f1767OooO0o0 = obj;
        this.f1766OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MutableStateFlow<Long> userId;
        MutableStateFlow<String> userName;
        MutableStateFlow<Long> userId2;
        int i = this.f1765OooO0Oo;
        Object obj = this.f1766OooO0o;
        Object obj2 = this.f1767OooO0o0;
        switch (i) {
            case 0:
                Throwable th = (Throwable) obj;
                OooOO0O.OooO0OO oooO0OO = (OooOO0O.OooO0OO) ((OooO00o.OooO0o) obj2);
                oooO0OO.getClass();
                o00O0O0.OooO0OO("Recorder", "Error occurred after audio source started.", th);
                if (th instanceof AudioSourceAccessException) {
                    oooO0OO.f3976OooO00o.accept(th);
                }
                break;
            case 1:
                OooO0OO oooO0OO2 = (OooO0OO) obj2;
                CountDownLatch countDownLatch = (CountDownLatch) obj;
                oooO0OO2.getClass();
                try {
                    o0O00<CrashlyticsReport> o0o01 = oooO0OO2.f60327OooO0oo;
                    Priority priority = Priority.HIGHEST;
                    if (o0o01 instanceof o0OO0) {
                        o0OOooO0.OooO00o().f40039OooO0Oo.OooO00o(((o0OO0) o0o01).f40020OooO00o.OooO0o0(priority), 1);
                    } else {
                        String strOooO0OO = o00000OO.OooO0OO("ForcedSender");
                        if (Log.isLoggable(strOooO0OO, 5)) {
                            Log.w(strOooO0OO, String.format("Expected instance of `TransportImpl`, got `%s`.", o0o01));
                        }
                    }
                    break;
                } catch (SQLException unused) {
                }
                countDownLatch.countDown();
                break;
            default:
                ChatModel model = (ChatModel) obj;
                o0000 o0000Var = ((MixedRoomActivity) obj2).f22983OoooO0.f49614OooO;
                if (o0000Var != null) {
                    Intrinsics.checkNotNullParameter(model, "model");
                    o0000Var.OooO0O0();
                    RoomUserInfoModel newFrom = model.getNewFrom();
                    String value = null;
                    Long value2 = (newFrom == null || (userId2 = newFrom.getUserId()) == null) ? null : userId2.getValue();
                    o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                    boolean zAreEqual = Intrinsics.areEqual(value2, o0O00oO0.OooOOo0().getValue());
                    p497o0o00OoO.o0000 o0000Var2 = o0000Var.f47221OooO0OO;
                    if (zAreEqual) {
                        o0000Var2.OooO00o().setText("");
                    } else {
                        RoomUserInfoModel newFrom2 = model.getNewFrom();
                        if (newFrom2 != null && (userName = newFrom2.getUserName()) != null) {
                            value = userName.getValue();
                        }
                        RoomUserInfoModel newFrom3 = model.getNewFrom();
                        o0000Var.OooO00o(new oOo00ooO(value, (newFrom3 == null || (userId = newFrom3.getUserId()) == null) ? 0L : userId.getValue().longValue()), false);
                    }
                    o0000Var2.OooO0OO().f47211OooO00o.setValue(model);
                }
                break;
        }
    }
}
