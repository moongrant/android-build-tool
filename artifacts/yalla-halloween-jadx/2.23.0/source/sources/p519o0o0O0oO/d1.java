package p519o0o0O0oO;

import android.widget.ProgressBar;
import com.code.android.json.OooO00o;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.yalla.yalla.http.iteratehttp.OooO0OO;
import com.yalla.yalla.model.room.RoomLevelInfoModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;
import p031OoooO0.o0OoOo0;
import p417o0OoO0.o00000OO;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class d1 extends OooO0OO.OooO0O0 {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ e1 f52194OooO0o0;

    public d1(e1 e1Var) {
        this.f52194OooO0o0 = e1Var;
    }

    @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
    public final void OooO0o0(@Nullable String str) {
        RoomLevelInfoModel roomLevelInfoModel;
        if ((str == null || StringsKt.isBlank(str)) || (roomLevelInfoModel = (RoomLevelInfoModel) OooO00o.OooO0OO(RoomLevelInfoModel.class, str)) == null) {
            return;
        }
        e1 e1Var = this.f52194OooO0o0;
        e1Var.f52219OooOOoo.setText(o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.room_level_limit), o00000OO.OooO0O0(roomLevelInfoModel.barMax)));
        e1Var.f52209OooO.setText(o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.Room_Level_note_info), roomLevelInfoModel.userMax));
        List<RoomLevelInfoModel.RoomLevelInfo> list = roomLevelInfoModel.data;
        Intrinsics.checkNotNullExpressionValue(list, "roomLevelInfoModel.data");
        for (RoomLevelInfoModel.RoomLevelInfo roomLevelInfo : list) {
            int i = roomLevelInfo.type;
            if (i == 1) {
                int iLongValue = (int) roomLevelInfo.maxExperience.longValue();
                ProgressBar progressBar = e1Var.f52217OooOOo;
                progressBar.setMax(iLongValue);
                progressBar.setProgress((int) roomLevelInfo.sumExperience.longValue());
                e1Var.f52218OooOOo0.setText(o0000O.OooO00o(o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.Room_Level_Progress_Take_Mic), String.valueOf(roomLevelInfo.single)), String.valueOf(roomLevelInfo.experience)));
                Long l = roomLevelInfo.sumExperience;
                Intrinsics.checkNotNullExpressionValue(l, "levelInfo.sumExperience");
                String strOooO0O0 = o00000OO.OooO0O0(l.longValue());
                Long l2 = roomLevelInfo.maxExperience;
                Intrinsics.checkNotNullExpressionValue(l2, "levelInfo.maxExperience");
                e1Var.f52216OooOOOo.setText(o0OoOo0.OooO00o(strOooO0O0, "/", o00000OO.OooO0O0(l2.longValue())));
            } else if (i == 3) {
                int iLongValue2 = (int) roomLevelInfo.maxExperience.longValue();
                ProgressBar progressBar2 = e1Var.f52215OooOOOO;
                progressBar2.setMax(iLongValue2);
                progressBar2.setProgress((int) roomLevelInfo.sumExperience.longValue());
                e1Var.f52213OooOOO.setText(o0000O.OooO00o(o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.Room_Level_Progress_Gold_Gifts), String.valueOf(roomLevelInfo.single)), String.valueOf(roomLevelInfo.experience)));
                Long l3 = roomLevelInfo.sumExperience;
                Intrinsics.checkNotNullExpressionValue(l3, "levelInfo.sumExperience");
                String strOooO0O1 = o00000OO.OooO0O0(l3.longValue());
                Long l4 = roomLevelInfo.maxExperience;
                Intrinsics.checkNotNullExpressionValue(l4, "levelInfo.maxExperience");
                e1Var.f52214OooOOO0.setText(o0OoOo0.OooO00o(strOooO0O1, "/", o00000OO.OooO0O0(l4.longValue())));
            } else if (i == 4) {
                int iLongValue3 = (int) roomLevelInfo.maxExperience.longValue();
                ProgressBar progressBar3 = e1Var.f52212OooOO0o;
                progressBar3.setMax(iLongValue3);
                progressBar3.setProgress((int) roomLevelInfo.sumExperience.longValue());
                e1Var.f52211OooOO0O.setText(o0000O.OooO00o(o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.Room_Level_Progress_Crystal_Gifts), String.valueOf(roomLevelInfo.single)), String.valueOf(roomLevelInfo.experience)));
                Long l5 = roomLevelInfo.sumExperience;
                Intrinsics.checkNotNullExpressionValue(l5, "levelInfo.sumExperience");
                String strOooO0O2 = o00000OO.OooO0O0(l5.longValue());
                Long l6 = roomLevelInfo.maxExperience;
                Intrinsics.checkNotNullExpressionValue(l6, "levelInfo.maxExperience");
                e1Var.f52210OooOO0.setText(o0OoOo0.OooO00o(strOooO0O2, "/", o00000OO.OooO0O0(l6.longValue())));
            }
        }
    }
}
