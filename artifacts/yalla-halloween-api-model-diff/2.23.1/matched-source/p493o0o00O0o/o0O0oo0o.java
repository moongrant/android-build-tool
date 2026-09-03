package p493o0o00O0o;

import android.view.View;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.ui.activity.moment.AddTopicListActivity;
import com.yalla.yalla.ui.activity.room.VoteGameCreateActivity;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0O0oo0o implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f49182OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f49183OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f49184OooO0o0;

    public /* synthetic */ o0O0oo0o(int i, Object obj, Object obj2) {
        this.f49182OooO0Oo = i;
        this.f49184OooO0o0 = obj;
        this.f49183OooO0o = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f49182OooO0Oo;
        Object obj = this.f49183OooO0o;
        Object obj2 = this.f49184OooO0o0;
        switch (i) {
            case 0:
                AddTopicListActivity.OooO00o this$0 = (AddTopicListActivity.OooO00o) obj2;
                ViewHolder helper = (ViewHolder) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(helper, "$helper");
                Function1<? super Integer, Unit> function1 = this$0.f25576OooOooO;
                if (function1 != null) {
                    function1.invoke(Integer.valueOf(helper.getLayoutPosition()));
                }
                break;
            default:
                VoteGameCreateActivity this$1 = (VoteGameCreateActivity) obj2;
                RoomUserInfoModel roomUserInfoModel = (RoomUserInfoModel) obj;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                int size = this$1.f26305OooOo0.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ArrayList arrayList = this$1.f26305OooOo0;
                    if (((RoomUserInfoModel) arrayList.get(i2)).getUserId().getValue().longValue() == roomUserInfoModel.getUserId().getValue().longValue()) {
                        arrayList.remove(i2);
                        this$1.OooOoO0();
                    }
                    break;
                }
                break;
        }
    }
}
