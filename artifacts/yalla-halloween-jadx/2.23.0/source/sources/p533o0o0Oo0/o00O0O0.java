package p533o0o0Oo0;

import android.app.Activity;
import android.content.Context;
import com.code.android.util.OooO0O0;
import com.code.android.util.o000O0;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.service.room.OooO00o;
import com.yalla.yalla.service.room.RoomLiveService;
import com.yalla.yalla.util.permission.PermissionGroupReveal;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p157o00OoOO0.o0OO00O;
import p475o0o000.o000000;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0O0 extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f54764OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MixedRoomActivity f54765OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O0(int i, MixedRoomActivity mixedRoomActivity) {
        super(1);
        this.f54764OooO0Oo = i;
        this.f54765OooO0o0 = mixedRoomActivity;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x008c  */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        int i;
        int i2;
        int iIntValue = num.intValue();
        boolean z = false;
        if (iIntValue == 0) {
            int i3 = this.f54764OooO0Oo;
            RoomLiveService roomLiveService = RoomLiveService.f25058OooOo00;
            if (roomLiveService != null ? Intrinsics.areEqual(roomLiveService.OooO0OO(OooO00o.f24978OooO0o0.OooO0o0()), Boolean.TRUE) : false) {
                Context context = o000O0.f10354OooO00o;
                Activity activityOooO0O0 = OooO0O0.OooO0O0();
                if (activityOooO0O0 != null) {
                    PermissionGroupReveal.RevealGroupType revealGroupType = PermissionGroupReveal.f32879OooO00o;
                    com.yalla.yalla.util.permission.OooO00o.OooO0OO(activityOooO0O0, revealGroupType, null, new o00O0OOO(i3, 0L, com.yalla.yalla.util.permission.OooO00o.OooO00o(activityOooO0O0, revealGroupType), false));
                }
            }
        } else if (iIntValue == 1) {
            o000000 o000000Var = OooO00o.f24979OooO0oO;
            boolean zOooOO0o = o000000Var.OooOO0o();
            List<oo0O> list = o000000Var.f47380OooOO0O;
            if (zOooOO0o) {
                if ((list instanceof Collection) && list.isEmpty()) {
                    i2 = 0;
                } else {
                    Iterator<T> it = list.iterator();
                    i2 = 0;
                    while (it.hasNext()) {
                        if (((oo0O) it.next()).f54837OooO0O0.getValue().booleanValue() && (i2 = i2 + 1) < 0) {
                            CollectionsKt.throwCountOverflow();
                        }
                    }
                }
                if (i2 >= 9) {
                    z = true;
                }
            } else {
                List<oo0O> listSubList = list.subList(0, 5);
                if ((listSubList instanceof Collection) && listSubList.isEmpty()) {
                    i = 0;
                } else {
                    Iterator<T> it2 = listSubList.iterator();
                    i = 0;
                    while (it2.hasNext()) {
                        if (((oo0O) it2.next()).f54837OooO0O0.getValue().booleanValue() && (i = i + 1) < 0) {
                            CollectionsKt.throwCountOverflow();
                        }
                    }
                }
                if (i >= 4) {
                    z = true;
                }
            }
            if (z) {
                o0OO00O o0oo00o2 = new o0OO00O(this.f54765OooO0o0);
                o0oo00o2.OooOOoo(oO00OOo0.no_mic_available);
                o0oo00o2.OooOO0o();
            } else {
                String strOooO00o = OooO0OO.OooO00o.OooO00o("{\"order\":", this.f54764OooO0Oo + 1, "}");
                RoomLiveService roomLiveService2 = RoomLiveService.f25058OooOo00;
                if (roomLiveService2 != null) {
                    roomLiveService2.OooO0oO(10031, strOooO00o);
                }
            }
        }
        return null;
    }
}
