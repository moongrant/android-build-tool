package p541o0o0OoOO;

import android.app.Activity;
import android.content.Context;
import com.code.android.util.OooO0O0;
import com.code.android.util.o000O00O;
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
import p205o00o0o0o.o000O;
import p483o0o000Oo.o0000oo;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class oOOO00 extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f55265OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MixedRoomActivity f55266OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOOO00(int i, MixedRoomActivity mixedRoomActivity) {
        super(1);
        this.f55265OooO0Oo = i;
        this.f55266OooO0o0 = mixedRoomActivity;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x008c  */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        int i;
        int i2;
        int iIntValue = num.intValue();
        boolean z = false;
        if (iIntValue == 0) {
            int i3 = this.f55265OooO0Oo;
            RoomLiveService roomLiveService = RoomLiveService.f24596OooOo00;
            if (roomLiveService != null ? Intrinsics.areEqual(roomLiveService.OooO0OO(OooO00o.f24516OooO0o0.OooO0o0()), Boolean.TRUE) : false) {
                Context context = o000O00O.f13421OooO00o;
                Activity activityOooO0O0 = OooO0O0.OooO0O0();
                if (activityOooO0O0 != null) {
                    PermissionGroupReveal.RevealGroupType revealGroupType = PermissionGroupReveal.f32335OooO00o;
                    com.yalla.yalla.util.permission.OooO00o.OooO0OO(activityOooO0O0, revealGroupType, null, new oOOO0OOO(i3, 0L, com.yalla.yalla.util.permission.OooO00o.OooO00o(activityOooO0O0, revealGroupType), false));
                }
            }
        } else if (iIntValue == 1) {
            o0000oo o0000ooVar = OooO00o.f24517OooO0oO;
            boolean zOooOO0o = o0000ooVar.OooOO0o();
            List<oo00> list = o0000ooVar.f48585OooOO0O;
            if (zOooOO0o) {
                if ((list instanceof Collection) && list.isEmpty()) {
                    i2 = 0;
                } else {
                    Iterator<T> it = list.iterator();
                    i2 = 0;
                    while (it.hasNext()) {
                        if (((oo00) it.next()).f55306OooO0O0.getValue().booleanValue() && (i2 = i2 + 1) < 0) {
                            CollectionsKt.throwCountOverflow();
                        }
                    }
                }
                if (i2 >= 9) {
                    z = true;
                }
            } else {
                List<oo00> listSubList = list.subList(0, 5);
                if ((listSubList instanceof Collection) && listSubList.isEmpty()) {
                    i = 0;
                } else {
                    Iterator<T> it2 = listSubList.iterator();
                    i = 0;
                    while (it2.hasNext()) {
                        if (((oo00) it2.next()).f55306OooO0O0.getValue().booleanValue() && (i = i + 1) < 0) {
                            CollectionsKt.throwCountOverflow();
                        }
                    }
                }
                if (i >= 4) {
                    z = true;
                }
            }
            if (z) {
                o000O o000o = new o000O(this.f55266OooO0o0);
                o000o.OooOOoo(o000000.no_mic_available);
                o000o.OooOO0o();
            } else {
                String strOooO00o = OooO0OO.OooO00o.OooO00o("{\"order\":", this.f55265OooO0Oo + 1, "}");
                RoomLiveService roomLiveService2 = RoomLiveService.f24596OooOo00;
                if (roomLiveService2 != null) {
                    roomLiveService2.OooO0oO(10031, strOooO00o);
                }
            }
        }
        return null;
    }
}
