package p544o0o0OoOO;

import android.widget.ImageView;
import android.widget.TextView;
import com.app.base.model.MoraHistoryModel;
import com.chad.library.adapter.base.OooO00o;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOo;
import com.yalla.yalla.ui.activity.room.RoomMoraGameHistoryActivity;
import kotlin.jvm.internal.Intrinsics;
import p168o00Ooo0.o0O0O00;
import p188o00o00o0.OooO0OO;
import p188o00o00o0.OooO0o;
import p254o00ooO0O.o000O0O0;
import p616o0oo0Ooo.oO0O00;
import p621o0oo0o0o.o00O0;

/* JADX INFO: loaded from: classes2.dex */
public final class p5 extends OooO0OO<MoraHistoryModel> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ RoomMoraGameHistoryActivity f44292OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(RoomMoraGameHistoryActivity roomMoraGameHistoryActivity) {
        super(roomMoraGameHistoryActivity, R.layout.activity_mora_history_item);
        this.f44292OooO00o = roomMoraGameHistoryActivity;
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(OooO00o oooO00o, Object obj) {
        OooO0o helper = (OooO0o) oooO00o;
        MoraHistoryModel moraHistoryModel = (MoraHistoryModel) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        try {
            TextView textView = (TextView) helper.OooO0Oo(R.id.tv_mora_history_title);
            Integer numValueOf = moraHistoryModel != null ? Integer.valueOf(moraHistoryModel.getUserType()) : null;
            if (numValueOf != null && numValueOf.intValue() == 1) {
                textView.setText(o000O0O0.OooO0OO(R.string.you_state_a_mora));
            } else if (numValueOf != null && numValueOf.intValue() == 2) {
                textView.setText(OooOo.OooO00o(o000O0O0.OooO0OO(R.string.others_join_my_mora), moraHistoryModel.getOtherNickName()));
            } else if (numValueOf != null && numValueOf.intValue() == 3) {
                textView.setText(OooOo.OooO00o(o000O0O0.OooO0OO(R.string.you_join_a_mora), moraHistoryModel.getOtherNickName()));
            } else if (numValueOf != null && numValueOf.intValue() == 4) {
                textView.setText(OooOo.OooO00o(o000O0O0.OooO0OO(R.string.room_others_join_my_mora_challenge), moraHistoryModel.getOtherNickName()));
            } else if (numValueOf != null && numValueOf.intValue() == 5) {
                textView.setText(OooOo.OooO00o(o000O0O0.OooO0OO(R.string.room_you_join_a_mora_challenge), moraHistoryModel.getOtherNickName()));
            }
            helper.OooOO0(R.id.tv_mora_history_time, o00O0.f48624OooO00o.OooO0Oo(o0O0O00.OooOOO0(moraHistoryModel != null ? moraHistoryModel.getCreateTime() : null), System.currentTimeMillis()));
            TextView textView2 = (TextView) helper.OooO0Oo(R.id.tv_mora_history_label);
            Integer numValueOf2 = moraHistoryModel != null ? Integer.valueOf(moraHistoryModel.getFinalResult()) : null;
            if (numValueOf2 != null && numValueOf2.intValue() == 1) {
                textView2.setTextColor(o000O0O0.OooO00o(R.color.mora_waiting));
            } else if (numValueOf2 != null && numValueOf2.intValue() == 5) {
                textView2.setTextColor(o000O0O0.OooO00o(R.color.color_FF5B48));
            } else if (numValueOf2 != null && numValueOf2.intValue() == 3) {
                textView2.setTextColor(o000O0O0.OooO00o(R.color.theme_00c5b8));
            } else {
                textView2.setTextColor(o000O0O0.OooO00o(R.color.color_999999));
            }
            if ((moraHistoryModel != null ? Integer.valueOf(moraHistoryModel.getFinalResult()) : null) == null) {
                textView2.setText((CharSequence) this.f44292OooO00o.f22944OooooO0.get(0));
            } else {
                textView2.setText((CharSequence) this.f44292OooO00o.f22944OooooO0.get(moraHistoryModel.getFinalResult() - 1));
            }
            oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(getContext());
            oooO00o2.f48429OooO0OO = moraHistoryModel != null ? moraHistoryModel.getImageUrl() : null;
            oooO00o2.f48427OooO00o = 0;
            oooO00o2.f48441OooOOOo = R.drawable.icon_head_default;
            oooO00o2.OooO0o((ImageView) helper.OooO0Oo(R.id.iv_mora_history_gift));
            String[] strArr = new String[2];
            strArr[0] = "×";
            strArr[1] = String.valueOf(moraHistoryModel != null ? moraHistoryModel.getGiftNum() : 0);
            helper.OooOO0(R.id.tv_mora_history_gift_num, o0O0O00.OooO0oo(strArr));
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}
