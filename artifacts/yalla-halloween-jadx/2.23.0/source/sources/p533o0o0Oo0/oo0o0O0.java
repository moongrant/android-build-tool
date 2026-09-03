package p533o0o0Oo0;

import android.app.Activity;
import android.content.Context;
import com.code.android.util.OooO0O0;
import com.code.android.util.o000O0;
import com.yalla.yalla.service.room.OooO00o;
import com.yalla.yalla.service.room.RoomLiveService;
import com.yalla.yalla.util.permission.PermissionGroupReveal;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0o0O0 extends Lambda implements Function0<Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f54845OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0o0O0(int i) {
        super(0);
        this.f54845OooO0Oo = i;
    }

    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public final Object invoke() {
        o0OO000.OooO00o("102077");
        int i = this.f54845OooO0Oo;
        RoomLiveService roomLiveService = RoomLiveService.f25058OooOo00;
        boolean z = false;
        if (roomLiveService != null ? Intrinsics.areEqual(roomLiveService.OooO0OO(OooO00o.f24978OooO0o0.OooO0o0()), Boolean.TRUE) : false) {
            Context context = o000O0.f10354OooO00o;
            Activity activityOooO0O0 = OooO0O0.OooO0O0();
            if (activityOooO0O0 != null) {
                PermissionGroupReveal.RevealGroupType revealGroupType = PermissionGroupReveal.f32879OooO00o;
                com.yalla.yalla.util.permission.OooO00o.OooO0OO(activityOooO0O0, revealGroupType, null, new o00O0OOO(i, 0L, com.yalla.yalla.util.permission.OooO00o.OooO00o(activityOooO0O0, revealGroupType), false));
            }
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
