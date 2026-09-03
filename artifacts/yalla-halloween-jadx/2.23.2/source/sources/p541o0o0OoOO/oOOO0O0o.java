package p541o0o0OoOO;

import android.app.Activity;
import android.content.Context;
import com.code.android.util.OooO0O0;
import com.code.android.util.o000O00O;
import com.yalla.yalla.service.room.RoomLiveService;
import com.yalla.yalla.util.permission.PermissionGroupReveal;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0oo0000.OooO00o;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class oOOO0O0o extends Lambda implements Function0<Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f55271OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOOO0O0o(int i) {
        super(0);
        this.f55271OooO0Oo = i;
    }

    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public final Object invoke() {
        OooO00o.OooO0O0("102077");
        int i = this.f55271OooO0Oo;
        RoomLiveService roomLiveService = RoomLiveService.f24596OooOo00;
        boolean z = false;
        if (roomLiveService != null ? Intrinsics.areEqual(roomLiveService.OooO0OO(com.yalla.yalla.service.room.OooO00o.f24516OooO0o0.OooO0o0()), Boolean.TRUE) : false) {
            Context context = o000O00O.f13421OooO00o;
            Activity activityOooO0O0 = OooO0O0.OooO0O0();
            if (activityOooO0O0 != null) {
                PermissionGroupReveal.RevealGroupType revealGroupType = PermissionGroupReveal.f32335OooO00o;
                com.yalla.yalla.util.permission.OooO00o.OooO0OO(activityOooO0O0, revealGroupType, null, new oOOO0OOO(i, 0L, com.yalla.yalla.util.permission.OooO00o.OooO00o(activityOooO0O0, revealGroupType), false));
            }
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
