package p519o0o0O0oO;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.code.android.util.o0000;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import p158o00OoOOO.oo000o;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00O0o extends Lambda implements Function3<MutableState<Boolean>, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomUserInfoModel f52812OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00O0o(RoomUserInfoModel roomUserInfoModel) {
        super(3);
        this.f52812OooO0Oo = roomUserInfoModel;
    }

    /* JADX WARN: Type inference failed for: r11v2, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v10, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v8, types: [T, java.lang.String] */
    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(MutableState<Boolean> mutableState, Composer composer, Integer num) {
        Function0 oo000oo0;
        String str;
        String str2;
        oO00O0o0 oo00o0o0;
        String strOooO0OO;
        String strOooO0OO2;
        Function0 oo000oo;
        MutableState<Boolean> it = mutableState;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(it, "it");
        if ((iIntValue & 14) == 0) {
            iIntValue |= composer2.changed(it) ? 4 : 2;
        }
        int i = iIntValue;
        if ((i & 91) == 18 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1781378273, i, -1, "com.yalla.yalla.ui.dialog.IdentitySelectDialogUtil.showIdentitySelectDialog.<anonymous> (IdentitySelectDialogUtil.kt:38)");
            }
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            Ref.LongRef longRef = new Ref.LongRef();
            Ref.LongRef longRef2 = new Ref.LongRef();
            Ref.IntRef intRef = new Ref.IntRef();
            int i2 = oOo00OO0.icon_identity_gray;
            intRef.element = i2;
            String strOooO0OO3 = o0000.OooO0OO(oO00OOo0.yl_dialog_OK);
            String strOooO0OO4 = o0000.OooO0OO(oO00OOo0.yl_dialog_Cancel);
            RoomUserInfoModel roomUserInfoModel = this.f52812OooO0Oo;
            oO00O0o0 oo00o0o1 = new oO00O0o0(roomUserInfoModel);
            int iIntValue2 = ((Number) SnapshotStateKt.collectAsState(roomUserInfoModel.getRoomMemberType(), null, composer2, 8, 1).getValue()).intValue();
            if (iIntValue2 != 0) {
                if (iIntValue2 != 2) {
                    if (iIntValue2 != 3) {
                        str = strOooO0OO3;
                        oo000oo0 = null;
                        str2 = strOooO0OO4;
                    } else {
                        strOooO0OO = o0000.OooO0OO(oO00OOo0.set_as_admin);
                        objectRef.element = o0000.OooO0OO(oO00OOo0.Member);
                        longRef.element = 4278245577L;
                        longRef2.element = 436263113L;
                        intRef.element = oOo00OO0.icon_identity_green;
                        strOooO0OO2 = o0000.OooO0OO(oO00OOo0.Remove_Member);
                        oo000oo = new oO000o00(roomUserInfoModel);
                    }
                    oo00o0o0 = oo00o0o1;
                } else {
                    strOooO0OO = o0000.OooO0OO(oO00OOo0.set_as_member);
                    objectRef.element = o0000.OooO0OO(oO00OOo0.admin);
                    longRef.element = 4294951737L;
                    longRef2.element = 452969273L;
                    intRef.element = oOo00OO0.icon_identity_yellow;
                    strOooO0OO2 = o0000.OooO0OO(oO00OOo0.Remove_Member);
                    oo000oo = new oO000Oo(roomUserInfoModel);
                }
                str = strOooO0OO;
                str2 = strOooO0OO2;
                oo000oo0 = oo000oo;
                oo00o0o0 = oo00o0o1;
            } else {
                String strOooO0OO5 = o0000.OooO0OO(oO00OOo0.Invite);
                objectRef.element = o0000.OooO0OO(oO00OOo0.room_user_info_Visitor);
                objectRef = objectRef;
                longRef.element = 4288256409L;
                longRef2.element = 442852709L;
                intRef.element = i2;
                oo000oo0 = new oO000Oo0(roomUserInfoModel);
                str = strOooO0OO5;
                str2 = strOooO0OO4;
                oo00o0o0 = null;
            }
            oo000o.OooO0Oo(it, o0000.OooO0OO(oO00OOo0.set_user_role), null, ComposableLambdaKt.composableLambda(composer2, 1162769802, true, new oO0O0OoO(this.f52812OooO0Oo, intRef, objectRef, longRef, longRef2)), true, false, null, null, str, false, null, false, oo000oo0, str2, false, false, null, oo00o0o0, null, null, composer2, (i & 14) | 27648, 0, 904932);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
