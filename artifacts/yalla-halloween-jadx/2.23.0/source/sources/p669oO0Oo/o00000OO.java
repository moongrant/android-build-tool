package p669oO0Oo;

import android.app.Activity;
import android.content.Context;
import com.code.android.util.OooO0O0;
import com.code.android.util.o000O0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.ui.activity.store.WalletActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p579o0oOoo.oO000O0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nLiveRoomJoinMemberDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRoomJoinMemberDialog.kt\ncom/yalla/yalla/ui/dialog/room/ComposableSingletons$LiveRoomJoinMemberDialogKt$lambda-2$1$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,292:1\n1#2:293\n*E\n"})
public final class o00000OO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o00000OO f60442OooO0Oo = new o00000OO();

    public o00000OO() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (oO000O0.f56533OooO00o.OooO0O0()) {
            Context context = o000O0.f10354OooO00o;
            Activity activityOooO0O0 = OooO0O0.OooO0O0();
            if (activityOooO0O0 != null) {
                int i = WalletActivity.f27054OooOoOO;
                WalletActivity.OooO00o.OooO00o(activityOooO0O0, false);
            }
        } else {
            LiveEventBus.get("ROOM_COIN_NOT_ENOUGH").post(Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }
}
