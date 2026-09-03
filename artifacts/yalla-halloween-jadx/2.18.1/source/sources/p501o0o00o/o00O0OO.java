package p501o0o00o;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.GiftPropTypeShow;
import com.yalla.yalla.model.RoomUserInfoModel;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p047Oooooo0.o00OO0OO;
import p254o00ooO0O.o00oOoo;
import p391o0OOooOo.o0O00000;
import p498o0o00Oo0.OooOOO;
import p508o0o00oOo.o00O0000;
import p530o0o0OOO.o00O;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0OO extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o000 f41502Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0OO(o000 o000Var) {
        super(1);
        this.f41502Oooo0o = o000Var;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.model.RoomUserInfoModel>] */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.model.RoomUserInfoModel>] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.model.RoomUserInfoModel>] */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        RoomUserInfoModel roomUserInfoModelOooOO0;
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        GiftPropTypeShow giftPropTypeShow = this.f41502Oooo0o.f41394OooO;
        GiftPropTypeShow giftPropTypeShow2 = GiftPropTypeShow.InRoom;
        if (giftPropTypeShow == giftPropTypeShow2) {
            o00O.OooOO0 oooOO1 = o00O.OooOO0.f43243OooO00o;
            o00OO0OO<Long> o00oo0oo = o00O.OooOO0.f43246OooO0Oo;
            if (o00oo0oo.size() < 2) {
                o00oOoo.OooO00o(R.string.no_user_in_list);
                o000 o000Var = this.f41502Oooo0o;
                o00000.OooO00o oooO00o = o00000.f41437OooO0o0;
                o000Var.OooOooO(o00000.f41436OooO0o);
            } else {
                o0O00000.OooO0OO("InRoom_gift_user");
                this.f41502Oooo0o.OooOo00().f50858OooOoOO.setRotationX(180.0f);
                o00000 o00000Var = (o00000) this.f41502Oooo0o.f41403OooOOOo.getValue();
                LinearLayout localView = this.f41502Oooo0o.OooOo00().f50853OooOo00;
                Intrinsics.checkNotNullExpressionValue(localView, "mBinding.layoutUser");
                o00O0OO0 o00o0oo1 = new o00O0OO0(this.f41502Oooo0o);
                oo0o0O0 oo0o0o0 = new oo0o0O0(this.f41502Oooo0o);
                Objects.requireNonNull(o00000Var);
                Intrinsics.checkNotNullParameter(localView, "localView");
                if (o00000Var.f41442OooO0OO == giftPropTypeShow2) {
                    o00000Var.f41443OooO0Oo.clear();
                    int size = o00oo0oo.size();
                    for (int i = 0; i < size; i++) {
                        long jLongValue = o00oo0oo.get(i).longValue();
                        Long value = OooOOO.f41216OooO00o.OooOo().getValue();
                        if ((value == null || jLongValue != value.longValue()) && (roomUserInfoModelOooOO0 = o00O.f43140OooO00o.OooOO0(o00oo0oo.get(i).longValue())) != null) {
                            o00000Var.f41443OooO0Oo.add(roomUserInfoModelOooOO0);
                        }
                    }
                    if (o00000Var.f41443OooO0Oo.size() != 0) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.addAll(o00000Var.f41443OooO0Oo);
                        arrayList.add(0, o00000.f41439OooO0oo);
                        Context context = o00000Var.f41440OooO00o;
                        Objects.requireNonNull(o00000Var.f41441OooO0O0);
                        o0000Ooo o0000ooo = new o0000Ooo(o00000Var, o00000Var.f41440OooO00o);
                        o0000ooo.setNewData(arrayList);
                        Unit unit = Unit.INSTANCE;
                        o00O0000 o00o0001 = new o00O0000(context, o0000ooo);
                        o00o0001.f41885OooO0oo = new o0000(oo0o0o0);
                        o00o0001.f41884OooO0oO = new o0000O00(o00o0oo1);
                        o00o0001.OooO00o(localView);
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
