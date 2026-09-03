package p396o0Oo00o0;

import androidx.compose.runtime.internal.StabilityInferred;
import com.common.support.roomgiftplayer.download.RoomGiftVideoPlayDownloadManager;
import com.common.support.roomgiftplayer.log.PlayerLogger;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p191o00o0O0.o00Oo0;
import p386o0OOooO.oo0o0Oo;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class OooOOO extends o00Oo0 {

    public static final class OooO00o extends Lambda implements Function2<String, Throwable, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f43625OooO0Oo = new OooO00o();

        public OooO00o() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(String str, Throwable th) {
            o0000O00.OooO00o(100, "JsonUtil", str, th);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 implements PlayerLogger {
        @Override // com.common.support.roomgiftplayer.log.PlayerLogger
        public final void log(@NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            o0000O00.OooO0OO("RoomGiftVideoPlayer", message);
        }
    }

    @Override // p191o00o0O0.o00Oo0
    public final boolean OooO0O0() {
        return true;
    }

    @Override // p191o00o0O0.o00O0O
    public final void run() {
        o0000O00.f57359OooO00o = !oo0o0Oo.OooO0o0();
        Function2<? super String, ? super Throwable, Unit> function2 = com.code.android.json.OooO00o.f13206OooO00o;
        com.code.android.json.OooO00o.f13206OooO00o = OooO00o.f43625OooO0Oo;
        RoomGiftVideoPlayDownloadManager.INSTANCE.setPlayerLogger(new OooO0O0());
    }
}
