package p650o0ooo;

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
import p423o0OoO0OO.o00oOoo;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class g1 extends OooO0OO.OooO0O0 {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ h1 f58221OooO0o0;

    public g1(h1 h1Var) {
        this.f58221OooO0o0 = h1Var;
    }

    @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
    public final void OooO0o0(@Nullable String str) {
        RoomLevelInfoModel roomLevelInfoModel;
        if ((str == null || StringsKt.isBlank(str)) || (roomLevelInfoModel = (RoomLevelInfoModel) OooO00o.OooO0OO(RoomLevelInfoModel.class, str)) == null) {
            return;
        }
        h1 h1Var = this.f58221OooO0o0;
        h1Var.f58263OooOOoo.setText(o0000O.OooO00o(o0000.OooO0OO(o000000.room_level_limit), o00oOoo.OooO0O0(roomLevelInfoModel.barMax)));
        h1Var.f58253OooO.setText(o0000O.OooO00o(o0000.OooO0OO(o000000.Room_Level_note_info), roomLevelInfoModel.userMax));
        List<RoomLevelInfoModel.RoomLevelInfo> data = roomLevelInfoModel.data;
        Intrinsics.checkNotNullExpressionValue(data, "data");
        for (RoomLevelInfoModel.RoomLevelInfo roomLevelInfo : data) {
            int i = roomLevelInfo.type;
            if (i == 1) {
                int iLongValue = (int) roomLevelInfo.maxExperience.longValue();
                ProgressBar progressBar = h1Var.f58261OooOOo;
                progressBar.setMax(iLongValue);
                progressBar.setProgress((int) roomLevelInfo.sumExperience.longValue());
                h1Var.f58262OooOOo0.setText(o0000O.OooO00o(o0000O.OooO00o(o0000.OooO0OO(o000000.Room_Level_Progress_Take_Mic), String.valueOf(roomLevelInfo.single)), String.valueOf(roomLevelInfo.experience)));
                Long sumExperience = roomLevelInfo.sumExperience;
                Intrinsics.checkNotNullExpressionValue(sumExperience, "sumExperience");
                String strOooO0O0 = o00oOoo.OooO0O0(sumExperience.longValue());
                Long maxExperience = roomLevelInfo.maxExperience;
                Intrinsics.checkNotNullExpressionValue(maxExperience, "maxExperience");
                h1Var.f58260OooOOOo.setText(o0OoOo0.OooO0O0(strOooO0O0, "/", o00oOoo.OooO0O0(maxExperience.longValue())));
            } else if (i == 3) {
                int iLongValue2 = (int) roomLevelInfo.maxExperience.longValue();
                ProgressBar progressBar2 = h1Var.f58259OooOOOO;
                progressBar2.setMax(iLongValue2);
                progressBar2.setProgress((int) roomLevelInfo.sumExperience.longValue());
                h1Var.f58257OooOOO.setText(o0000O.OooO00o(o0000O.OooO00o(o0000.OooO0OO(o000000.Room_Level_Progress_Gold_Gifts), String.valueOf(roomLevelInfo.single)), String.valueOf(roomLevelInfo.experience)));
                Long sumExperience2 = roomLevelInfo.sumExperience;
                Intrinsics.checkNotNullExpressionValue(sumExperience2, "sumExperience");
                String strOooO0O1 = o00oOoo.OooO0O0(sumExperience2.longValue());
                Long maxExperience2 = roomLevelInfo.maxExperience;
                Intrinsics.checkNotNullExpressionValue(maxExperience2, "maxExperience");
                h1Var.f58258OooOOO0.setText(o0OoOo0.OooO0O0(strOooO0O1, "/", o00oOoo.OooO0O0(maxExperience2.longValue())));
            } else if (i == 4) {
                int iLongValue3 = (int) roomLevelInfo.maxExperience.longValue();
                ProgressBar progressBar3 = h1Var.f58256OooOO0o;
                progressBar3.setMax(iLongValue3);
                progressBar3.setProgress((int) roomLevelInfo.sumExperience.longValue());
                h1Var.f58255OooOO0O.setText(o0000O.OooO00o(o0000O.OooO00o(o0000.OooO0OO(o000000.Room_Level_Progress_Crystal_Gifts), String.valueOf(roomLevelInfo.single)), String.valueOf(roomLevelInfo.experience)));
                Long sumExperience3 = roomLevelInfo.sumExperience;
                Intrinsics.checkNotNullExpressionValue(sumExperience3, "sumExperience");
                String strOooO0O2 = o00oOoo.OooO0O0(sumExperience3.longValue());
                Long maxExperience3 = roomLevelInfo.maxExperience;
                Intrinsics.checkNotNullExpressionValue(maxExperience3, "maxExperience");
                h1Var.f58254OooOO0.setText(o0OoOo0.OooO0O0(strOooO0O2, "/", o00oOoo.OooO0O0(maxExperience3.longValue())));
            }
        }
    }
}
