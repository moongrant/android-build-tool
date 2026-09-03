package p139o00OOOo0;

import com.weieyu.yalla.R;
import com.yalla.yalla.model.RoomUserInfoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import p043OooooO0.o00O0000;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p254o00ooO0O.o000O0O0;
import p257o00ooOO0.o0O0oo0o;

/* JADX INFO: loaded from: classes.dex */
public final class o000O000 extends Lambda implements Function3<o0O00OO<Boolean>, oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ RoomUserInfoModel f31781Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O000(RoomUserInfoModel roomUserInfoModel) {
        super(3);
        this.f31781Oooo0o = roomUserInfoModel;
    }

    /* JADX WARN: Type inference failed for: r4v13, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v2, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v7, types: [T, java.lang.String] */
    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(o0O00OO<Boolean> o0o00oo2, oOO00O ooo00o, Integer num) {
        String str;
        o000 o000Var;
        Function0 function0;
        String str2;
        String strOooO0OO;
        String strOooO0OO2;
        Function0 o000oo2;
        o0O00OO<Boolean> it = o0o00oo2;
        oOO00O ooo00o2 = ooo00o;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(it, "it");
        if ((iIntValue & 14) == 0) {
            iIntValue |= ooo00o2.Oooo0oo(it) ? 4 : 2;
        }
        int i = iIntValue;
        if ((i & 91) == 18 && ooo00o2.OooOo0()) {
            ooo00o2.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            Ref.LongRef longRef = new Ref.LongRef();
            Ref.LongRef longRef2 = new Ref.LongRef();
            Ref.IntRef intRef = new Ref.IntRef();
            intRef.element = R.drawable.icon_identity_gray;
            String strOooO0OO3 = o000O0O0.OooO0OO(R.string.yl_dialog_OK);
            String strOooO0OO4 = o000O0O0.OooO0OO(R.string.yl_dialog_Cancel);
            o000 o000Var2 = new o000(this.f31781Oooo0o);
            int roomMemberType = this.f31781Oooo0o.getRoomMemberType();
            o0000O0O o0000o0o2 = null;
            if (roomMemberType != 0) {
                if (roomMemberType != 2) {
                    if (roomMemberType == 3) {
                        strOooO0OO = o000O0O0.OooO0OO(R.string.set_as_admin);
                        objectRef.element = o000O0O0.OooO0OO(R.string.Member);
                        longRef.element = 4278245577L;
                        longRef2.element = 436263113L;
                        intRef.element = R.drawable.icon_identity_green;
                        strOooO0OO2 = o000O0O0.OooO0OO(R.string.Remove_Member);
                        o000oo2 = new o0000O(this.f31781Oooo0o);
                    }
                    o0O0oo0o.OooO0Oo(it, o000O0O0.OooO0OO(R.string.set_user_role), null, o00O0000.OooO00o(ooo00o2, 1830870753, new o0000OO0(this.f31781Oooo0o, intRef, objectRef, longRef, longRef2)), true, false, null, null, str2, false, null, false, function0, str, false, null, o000Var, null, null, ooo00o2, (i & 14) | 27648, 0, 446180);
                } else {
                    strOooO0OO = o000O0O0.OooO0OO(R.string.set_as_member);
                    objectRef.element = o000O0O0.OooO0OO(R.string.admin);
                    longRef.element = 4294951737L;
                    longRef2.element = 452969273L;
                    intRef.element = R.drawable.icon_identity_yellow;
                    strOooO0OO2 = o000O0O0.OooO0OO(R.string.Remove_Member);
                    o000oo2 = new o000OO(this.f31781Oooo0o);
                }
                str = strOooO0OO2;
                str2 = strOooO0OO;
                function0 = o000oo2;
                o000Var = o000Var2;
                o0O0oo0o.OooO0Oo(it, o000O0O0.OooO0OO(R.string.set_user_role), null, o00O0000.OooO00o(ooo00o2, 1830870753, new o0000OO0(this.f31781Oooo0o, intRef, objectRef, longRef, longRef2)), true, false, null, null, str2, false, null, false, function0, str, false, null, o000Var, null, null, ooo00o2, (i & 14) | 27648, 0, 446180);
            } else {
                strOooO0OO3 = o000O0O0.OooO0OO(R.string.Invite);
                objectRef.element = o000O0O0.OooO0OO(R.string.room_user_info_Visitor);
                longRef.element = 4288256409L;
                longRef2.element = 442852709L;
                intRef.element = R.drawable.icon_identity_gray;
                o000Var2 = null;
                o0000o0o2 = new o0000O0O(this.f31781Oooo0o);
            }
            str = strOooO0OO4;
            o000Var = o000Var2;
            function0 = o0000o0o2;
            str2 = strOooO0OO3;
            o0O0oo0o.OooO0Oo(it, o000O0O0.OooO0OO(R.string.set_user_role), null, o00O0000.OooO00o(ooo00o2, 1830870753, new o0000OO0(this.f31781Oooo0o, intRef, objectRef, longRef, longRef2)), true, false, null, null, str2, false, null, false, function0, str, false, null, o000Var, null, null, ooo00o2, (i & 14) | 27648, 0, 446180);
        }
        return Unit.INSTANCE;
    }
}
