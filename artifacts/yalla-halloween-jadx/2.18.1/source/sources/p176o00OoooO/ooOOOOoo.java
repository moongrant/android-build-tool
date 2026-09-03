package p176o00OoooO;

import android.widget.TextView;
import com.app.base.model.RoomLevelInfoModel;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;
import p160o00OoOO0.o00OO0O0;
import p516o0o0O000.o0OOO0o;
import p522o0o0O0o.o00O00;
import p522o0o0O0o.oo0oOO0;

/* JADX INFO: loaded from: classes.dex */
public final class ooOOOOoo extends o00OO0O0.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ oO0OOo0o f32890OooO00o;

    public ooOOOOoo(oO0OOo0o oo0ooo0o) {
        this.f32890OooO00o = oo0ooo0o;
    }

    @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
    public final void onFinish(@Nullable String str) {
        super.onFinish(str);
        if (str == null || StringsKt.isBlank(str)) {
            return;
        }
        o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
        RoomLevelInfoModel roomLevelInfoModel = (RoomLevelInfoModel) o0OOO0o.OooO0O0(str, RoomLevelInfoModel.class);
        if (roomLevelInfoModel != null) {
            oO0OOo0o oo0ooo0o = this.f32890OooO00o;
            oo0ooo0o.f32880Ooooo00.setText(OooOo.OooO00o(oo0oOO0.OooO0OO(R.string.room_level_limit), o00O00.OooO00o(roomLevelInfoModel.barMax)));
            oo0ooo0o.f32872OoooO0.setText(OooOo.OooO00o(oo0oOO0.OooO0OO(R.string.Room_Level_note_info), roomLevelInfoModel.userMax));
            List<RoomLevelInfoModel.RoomLevelInfo> list = roomLevelInfoModel.data;
            Intrinsics.checkNotNullExpressionValue(list, "roomLevelInfoModel.data");
            for (RoomLevelInfoModel.RoomLevelInfo roomLevelInfo : list) {
                int i = roomLevelInfo.type;
                if (i == 1) {
                    oo0ooo0o.f32879OoooOoo.setMax((int) roomLevelInfo.maxExperience.longValue());
                    oo0ooo0o.f32879OoooOoo.setProgress((int) roomLevelInfo.sumExperience.longValue());
                    oo0ooo0o.f32878OoooOoO.setText(OooOo.OooO00o(OooOo.OooO00o(oo0oOO0.OooO0OO(R.string.Room_Level_Progress_Take_Mic), String.valueOf(roomLevelInfo.single)), String.valueOf(roomLevelInfo.experience)));
                    TextView textView = oo0ooo0o.f32877OoooOo0;
                    StringBuilder sb = new StringBuilder();
                    Long l = roomLevelInfo.sumExperience;
                    Intrinsics.checkNotNullExpressionValue(l, "levelInfo.sumExperience");
                    sb.append(o00O00.OooO00o(l.longValue()));
                    sb.append('/');
                    Long l2 = roomLevelInfo.maxExperience;
                    Intrinsics.checkNotNullExpressionValue(l2, "levelInfo.maxExperience");
                    sb.append(o00O00.OooO00o(l2.longValue()));
                    textView.setText(sb.toString());
                } else if (i == 3) {
                    oo0ooo0o.f32876OoooOOo.setMax((int) roomLevelInfo.maxExperience.longValue());
                    oo0ooo0o.f32876OoooOOo.setProgress((int) roomLevelInfo.sumExperience.longValue());
                    oo0ooo0o.f32875OoooOOO.setText(OooOo.OooO00o(OooOo.OooO00o(oo0oOO0.OooO0OO(R.string.Room_Level_Progress_Gold_Gifts), String.valueOf(roomLevelInfo.single)), String.valueOf(roomLevelInfo.experience)));
                    TextView textView2 = oo0ooo0o.f32881o000oOoO;
                    StringBuilder sb2 = new StringBuilder();
                    Long l3 = roomLevelInfo.sumExperience;
                    Intrinsics.checkNotNullExpressionValue(l3, "levelInfo.sumExperience");
                    sb2.append(o00O00.OooO00o(l3.longValue()));
                    sb2.append('/');
                    Long l4 = roomLevelInfo.maxExperience;
                    Intrinsics.checkNotNullExpressionValue(l4, "levelInfo.maxExperience");
                    sb2.append(o00O00.OooO00o(l4.longValue()));
                    textView2.setText(sb2.toString());
                } else if (i == 4) {
                    oo0ooo0o.f32874OoooOO0.setMax((int) roomLevelInfo.maxExperience.longValue());
                    oo0ooo0o.f32874OoooOO0.setProgress((int) roomLevelInfo.sumExperience.longValue());
                    oo0ooo0o.f32871OoooO.setText(OooOo.OooO00o(OooOo.OooO00o(oo0oOO0.OooO0OO(R.string.Room_Level_Progress_Crystal_Gifts), String.valueOf(roomLevelInfo.single)), String.valueOf(roomLevelInfo.experience)));
                    TextView textView3 = oo0ooo0o.f32873OoooO0O;
                    StringBuilder sb3 = new StringBuilder();
                    Long l5 = roomLevelInfo.sumExperience;
                    Intrinsics.checkNotNullExpressionValue(l5, "levelInfo.sumExperience");
                    sb3.append(o00O00.OooO00o(l5.longValue()));
                    sb3.append('/');
                    Long l6 = roomLevelInfo.maxExperience;
                    Intrinsics.checkNotNullExpressionValue(l6, "levelInfo.maxExperience");
                    sb3.append(o00O00.OooO00o(l6.longValue()));
                    textView3.setText(sb3.toString());
                }
            }
        }
    }
}
