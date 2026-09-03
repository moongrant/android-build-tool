package p388o0OOooo0;

import androidx.compose.runtime.internal.StabilityInferred;
import com.common.support.roomgiftplayer.download.RoomGiftVideoPlayDownloadManager;
import com.common.support.roomgiftplayer.log.PlayerLogger;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p145o00Oo0O.o000oOoO;
import p382o0OOoo0o.o00Ooo;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0Oo0oo extends o000oOoO {

    public static final class OooO00o extends Lambda implements Function2<String, Throwable, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f44394OooO0Oo = new OooO00o();

        public OooO00o() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(String str, Throwable th) {
            OooOOO0.OooO00o(100, "JsonUtil", str, th);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 implements PlayerLogger {
        @Override // com.common.support.roomgiftplayer.log.PlayerLogger
        public final void log(@NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            OooOOO0.OooO0OO("RoomGiftVideoPlayer", message);
        }
    }

    @Override // p145o00Oo0O.o000oOoO
    public final boolean OooO0O0() {
        return true;
    }

    @Override // p145o00Oo0O.Oooo0
    public final void run() {
        OooOOO0.f56816OooO00o = !o00Ooo.OooO0o0();
        Function2<? super String, ? super Throwable, Unit> function2 = com.code.android.json.OooO00o.f10146OooO00o;
        com.code.android.json.OooO00o.f10146OooO00o = OooO00o.f44394OooO0Oo;
        RoomGiftVideoPlayDownloadManager.INSTANCE.setPlayerLogger(new OooO0O0());
    }
}
