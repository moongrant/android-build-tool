package p650o0ooo;

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
import p207o00o0oO0.o000O0Oo;
import p562o0oOo000.o000000;
import p562o0oOo000.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO0oO0 extends Lambda implements Function3<MutableState<Boolean>, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomUserInfoModel f58689OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO0oO0(RoomUserInfoModel roomUserInfoModel) {
        super(3);
        this.f58689OooO0Oo = roomUserInfoModel;
    }

    /* JADX WARN: Type inference failed for: r11v2, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v10, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v8, types: [T, java.lang.String] */
    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(MutableState<Boolean> mutableState, Composer composer, Integer num) {
        Function0 o0oo1;
        String str;
        String str2;
        o0OO0o o0oo0o2;
        String strOooO0OO;
        String strOooO0OO2;
        Function0 o0oo0o1;
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
                ComposerKt.traceEventStart(-1781378273, i, -1, "com.yalla.yalla.ui.dialog.IdentitySelectDialogUtil.showIdentitySelectDialog.<anonymous> (IdentitySelectDialogUtil.kt:39)");
            }
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            Ref.LongRef longRef = new Ref.LongRef();
            Ref.LongRef longRef2 = new Ref.LongRef();
            Ref.IntRef intRef = new Ref.IntRef();
            int i2 = o0Oo0oo.icon_identity_gray;
            intRef.element = i2;
            String strOooO0OO3 = o0000.OooO0OO(o000000.yl_dialog_OK);
            String strOooO0OO4 = o0000.OooO0OO(o000000.yl_dialog_Cancel);
            RoomUserInfoModel roomUserInfoModel = this.f58689OooO0Oo;
            o0OO0o o0oo0o3 = new o0OO0o(roomUserInfoModel);
            int iIntValue2 = ((Number) SnapshotStateKt.collectAsState(roomUserInfoModel.getRoomMemberType(), null, composer2, 8, 1).getValue()).intValue();
            if (iIntValue2 != 0) {
                if (iIntValue2 != 2) {
                    if (iIntValue2 != 3) {
                        str = strOooO0OO3;
                        o0oo1 = null;
                        str2 = strOooO0OO4;
                    } else {
                        strOooO0OO = o0000.OooO0OO(o000000.set_as_admin);
                        objectRef.element = o0000.OooO0OO(o000000.Member);
                        longRef.element = 4278245577L;
                        longRef2.element = 436263113L;
                        intRef.element = o0Oo0oo.icon_identity_green;
                        strOooO0OO2 = o0000.OooO0OO(o000000.Remove_Member);
                        o0oo0o1 = new o0OOooO0(roomUserInfoModel);
                    }
                    o0oo0o2 = o0oo0o3;
                } else {
                    strOooO0OO = o0000.OooO0OO(o000000.set_as_member);
                    objectRef.element = o0000.OooO0OO(o000000.admin);
                    longRef.element = 4294951737L;
                    longRef2.element = 452969273L;
                    intRef.element = o0Oo0oo.icon_identity_yellow;
                    strOooO0OO2 = o0000.OooO0OO(o000000.Remove_Member);
                    o0oo0o1 = new o0OO0O0(roomUserInfoModel);
                }
                str = strOooO0OO;
                str2 = strOooO0OO2;
                o0oo1 = o0oo0o1;
                o0oo0o2 = o0oo0o3;
            } else {
                String strOooO0OO5 = o0000.OooO0OO(o000000.Invite);
                objectRef.element = o0000.OooO0OO(o000000.room_user_info_Visitor);
                objectRef = objectRef;
                longRef.element = 4288256409L;
                longRef2.element = 442852709L;
                intRef.element = i2;
                o0oo1 = new o0OO0(roomUserInfoModel);
                str = strOooO0OO5;
                str2 = strOooO0OO4;
                o0oo0o2 = null;
            }
            o000O0Oo.OooO0Oo(it, o0000.OooO0OO(o000000.set_user_role), null, ComposableLambdaKt.composableLambda(composer2, 1162769802, true, new o0OO0o00(this.f58689OooO0Oo, intRef, objectRef, longRef, longRef2)), true, false, null, null, str, false, null, false, o0oo1, str2, false, false, null, o0oo0o2, null, null, composer2, (i & 14) | 27648, 0, 904932);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
