package p501o0o00o;

import android.content.Intent;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.app.base.mixedroom.model.RoomConfiguration;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO;
import com.yalla.support.common.util.o00O0O;
import com.yalla.yalla.common.model.WebFrom;
import com.yalla.yalla.common.util.WebPageInfo;
import com.yalla.yalla.data.db.model.MusicTable;
import com.yalla.yalla.data.manager.MusicState;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.ui.activity.moment.UserPostListActivity;
import com.yalla.yalla.ui.activity.room.RoomSettingActivity;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomFragment;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p254o00ooO0O.o000O0O0;
import p579o0oOoOOo.b;
import p617o0oo0o.o00;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0000O0O implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f41455OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f41456OooO0O0;

    public /* synthetic */ o0000O0O(Object obj, int i) {
        this.f41455OooO00o = i;
        this.f41456OooO0O0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        String strOooO0OO;
        switch (this.f41455OooO00o) {
            case 0:
                o000 this$0 = (o000) this.f41456OooO0O0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOo0o();
                break;
            case 1:
                UserPostListActivity this$1 = (UserPostListActivity) this.f41456OooO0O0;
                MomentDetailModel result = (MomentDetailModel) obj;
                UserPostListActivity.OooO00o oooO00o = UserPostListActivity.f22674Ooooooo;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                Intrinsics.checkNotNullParameter(result, "result");
                int size = this$1.OooOooo().getData().size();
                for (int i = 0; i < size; i++) {
                    if (this$1.OooOooo().getData().get(i).getId() == result.getId()) {
                        this$1.OooOooo().getData().set(i, result);
                        this$1.OooOooo().notifyItemChanged(this$1.OooOooo().getHeaderLayoutCount() + i);
                    }
                    break;
                }
                break;
            case 2:
                RoomSettingActivity context = (RoomSettingActivity) this.f41456OooO0O0;
                String url = (String) obj;
                RoomSettingActivity.OooO00o oooO00o2 = RoomSettingActivity.f22969o00Ooo;
                Intrinsics.checkNotNullParameter(context, "this$0");
                if (context.f22972Ooooo0o != null) {
                    WebPageInfo webPageInfo = new WebPageInfo(WebFrom.RoomBonus);
                    Intrinsics.checkNotNullExpressionValue(url, "url");
                    Intrinsics.checkNotNullParameter(url, "url");
                    webPageInfo.f21217Oooo0oO = url;
                    webPageInfo.OooO0OO(o000O0O0.OooO0OO(R.string.room_info_bonus));
                    RoomConfiguration roomConfiguration = context.f22972Ooooo0o;
                    String barid = roomConfiguration != null ? roomConfiguration.getBarid() : null;
                    if (barid == null) {
                        barid = "";
                    }
                    webPageInfo.OooO00o("barId", barid);
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intent intent = new Intent(context, (Class<?>) WebActivity.class);
                    intent.putExtra("pageinfo", webPageInfo);
                    context.startActivity(intent);
                }
                break;
            case 3:
                b this$2 = (b) this.f41456OooO0O0;
                List list = (List) obj;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                ConstraintLayout constraintLayout = this$2.f45905OoooO.f48905OooO00o;
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.root");
                o00O0O.OooO(constraintLayout);
                if (list == null || list.isEmpty()) {
                    Group group = this$2.f45905OoooO.f48907OooO0OO;
                    Intrinsics.checkNotNullExpressionValue(group, "binding.groupEmpty");
                    o00O0O.OooO(group);
                    Group group2 = this$2.f45905OoooO.f48906OooO0O0;
                    Intrinsics.checkNotNullExpressionValue(group2, "binding.groupControl");
                    o00O0O.OooO00o(group2);
                    this$2.f45907o000oOoO = false;
                } else {
                    MusicState musicState = MusicState.f21402OooO00o;
                    MutableLiveData<MusicTable> mutableLiveData = MusicState.f21403OooO0O0;
                    if (mutableLiveData.getValue() == null) {
                        mutableLiveData.setValue((MusicTable) list.get(0));
                    }
                    this$2.f45907o000oOoO = true;
                    Group group3 = this$2.f45905OoooO.f48906OooO0O0;
                    Intrinsics.checkNotNullExpressionValue(group3, "binding.groupControl");
                    o00O0O.OooO(group3);
                    Group group4 = this$2.f45905OoooO.f48907OooO0OO;
                    Intrinsics.checkNotNullExpressionValue(group4, "binding.groupEmpty");
                    o00O0O.OooO00o(group4);
                    MusicTable musicTableOooO0O0 = o00.f48461OooO00o.OooO0O0();
                    TextView textView = this$2.f45905OoooO.f48921OooOOo0;
                    if (musicTableOooO0O0 == null || (strOooO0OO = musicTableOooO0O0.mDisplayName) == null) {
                        strOooO0OO = OooOOO.OooO0OO(R.string.no_more_music);
                    }
                    textView.setText(strOooO0OO);
                }
                break;
            default:
                MainRoomFragment.m447initObserver$lambda1((MainRoomFragment) this.f41456OooO0O0, (Integer) obj);
                break;
        }
    }
}
