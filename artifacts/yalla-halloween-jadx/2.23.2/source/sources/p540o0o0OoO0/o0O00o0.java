package p540o0o0OoO0;

import android.app.Activity;
import android.content.Context;
import com.code.android.util.OooO0O0;
import com.code.android.util.o000O00O;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.ui.activity.store.WalletActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p590o0oOooo0.oOO0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nLiveRoomJoinMemberDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRoomJoinMemberDialog.kt\ncom/yalla/yalla/ui/dialog/room/ComposableSingletons$LiveRoomJoinMemberDialogKt$lambda-2$1$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,292:1\n1#2:293\n*E\n"})
public final class o0O00o0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o0O00o0 f54775OooO0Oo = new o0O00o0();

    public o0O00o0() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (oOO0.f57167OooO00o.OooO0O0()) {
            Context context = o000O00O.f13421OooO00o;
            Activity activityOooO0O0 = OooO0O0.OooO0O0();
            if (activityOooO0O0 != null) {
                int i = WalletActivity.f26588OooOoOO;
                WalletActivity.OooO00o.OooO00o(activityOooO0O0, false);
            }
        } else {
            LiveEventBus.get("ROOM_COIN_NOT_ENOUGH").post(Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }
}
