package p650o0ooo;

import android.view.View;
import com.app.base.protobuf.room.Room;
import com.code.android.util.o0OoOo0;
import com.yalla.yalla.service.room.OooO0O0;
import com.yalla.yalla.service.room.RoomLiveService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0oo0000.OooO00o;
import p041Ooooo0o.o00000;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
public final class o1 extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ w1 f58757OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(w1 w1Var) {
        super(1);
        this.f58757OooO0Oo = w1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View setNoDoubleClickListener = view;
        Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
        OooO00o.OooO0O0("102240");
        w1 w1Var = this.f58757OooO0Oo;
        int i = w1Var.OooOOOO().f44441OooO0oO.currCost;
        int i2 = w1Var.OooOOOO().f44441OooO0oO.currRange;
        boolean zIsChecked = w1Var.OooOOOO().f44434OooO.isChecked();
        String strValueOf = String.valueOf(w1Var.OooOOOO().f44436OooO0O0.getText());
        boolean zIsChecked2 = w1Var.OooOOOO().f44444OooOO0O.isChecked();
        if (strValueOf.length() > i2) {
            w1Var.OooOOO(true, false);
        } else {
            long jOooO = o0OoOo0.OooO(-1L, strValueOf);
            int i3 = w1Var.f59197OooOO0O;
            int i4 = w1Var.f59198OooOO0o;
            long j = w1Var.f59199OooOOO;
            boolean z = w1Var.f59200OooOOO0;
            StringBuilder sbOooO00o = o00000.OooO00o("房间幸运数字-房主\ncurrCost:'", i3, "', currRange:'", i4, "', currLuckyNumber:'");
            sbOooO00o.append(j);
            sbOooO00o.append("', currSettableFromManage:'");
            sbOooO00o.append(z);
            sbOooO00o.append("'\nnewCost:'");
            sbOooO00o.append(i);
            sbOooO00o.append("', newRange:'");
            sbOooO00o.append(i2);
            sbOooO00o.append("', newLuckyNumberStr:'");
            sbOooO00o.append(strValueOf);
            sbOooO00o.append("', newLuckyNumberSettableFromManage:'");
            sbOooO00o.append(zIsChecked2);
            sbOooO00o.append("', newLuckyNumberSettable:'");
            sbOooO00o.append(zIsChecked);
            sbOooO00o.append("'");
            o0000O00.OooO0O0(sbOooO00o.toString());
            Integer value = OooO0O0.f24533OoooOOO.OooO00o().f24546OooOO0o.getValue();
            if (value != null && value.intValue() == 1) {
                if (zIsChecked) {
                    if (strValueOf.length() == 0) {
                        w1Var.OooOOO(true, false);
                    }
                } else {
                    jOooO = -1;
                }
                Room.ChangeLuckNumSetRequest.Builder builderNewBuilder = Room.ChangeLuckNumSetRequest.newBuilder();
                builderNewBuilder.setLucknumcost(i);
                builderNewBuilder.setLucknummode(i2);
                builderNewBuilder.setLuckNum(jOooO);
                builderNewBuilder.setIsAdminManage(zIsChecked2);
                RoomLiveService roomLiveService = RoomLiveService.f24596OooOo00;
                if (roomLiveService != null) {
                    roomLiveService.OooO0oo(10071, builderNewBuilder.build().toByteArray());
                }
                w1Var.OooO0OO();
            } else if (value != null && value.intValue() == 2) {
                if (strValueOf.length() == 0) {
                    w1Var.OooOOO(true, false);
                } else {
                    int i5 = w1Var.f59197OooOO0O;
                    int i6 = w1Var.f59198OooOO0o;
                    boolean z2 = w1Var.f59200OooOOO0;
                    Room.ChangeLuckNumSetRequest.Builder builderNewBuilder2 = Room.ChangeLuckNumSetRequest.newBuilder();
                    builderNewBuilder2.setLucknumcost(i5);
                    builderNewBuilder2.setLucknummode(i6);
                    builderNewBuilder2.setLuckNum(jOooO);
                    builderNewBuilder2.setIsAdminManage(z2);
                    RoomLiveService roomLiveService2 = RoomLiveService.f24596OooOo00;
                    if (roomLiveService2 != null) {
                        roomLiveService2.OooO0oo(10071, builderNewBuilder2.build().toByteArray());
                    }
                    w1Var.OooO0OO();
                }
            }
        }
        return Unit.INSTANCE;
    }
}
