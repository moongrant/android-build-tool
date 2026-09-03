package p029Oooo0oo;

import android.content.Context;
import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.message.SearchFriendActivity;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.fragment.moment.oo000o;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import p045Oooooo.o0000Ooo;
import p045Oooooo.o0000oo;
import p191o00o0O0O.o0Oo0oo;
import p199o00o0Ooo.o00OOOO0;
import p587o0oOooo.o0OO000;
import p637o0ooOO0.o00O000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oo0oO0 implements o00O000.OooO0OO, o00OOOO0.OooO00o, BaseQuickAdapter.OooO0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1355OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1356OooO0o0;

    public /* synthetic */ oo0oO0(Object obj, int i) {
        this.f1355OooO0Oo = i;
        this.f1356OooO0o0 = obj;
    }

    @Override // o00o0Ooo.o00OOOO0.OooO00o
    public final Object OooO0OO() {
        p196o00o0Oo.o00O000 o00o001 = (p196o00o0Oo.o00O000) this.f1356OooO0o0;
        Iterator it = o00o001.f39017OooO0O0.OooOo0O().iterator();
        while (it.hasNext()) {
            o00o001.f39018OooO0OO.OooO0O0((o0Oo0oo) it.next(), 1);
        }
        return null;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter adapter, View view, int i) {
        int i2 = this.f1355OooO0Oo;
        Object obj = this.f1356OooO0o0;
        switch (i2) {
            case 3:
                SearchFriendActivity this$0 = (SearchFriendActivity) obj;
                int i3 = SearchFriendActivity.f25719OooOo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(adapter, "adapter");
                o0OO000.OooO00o("104036");
                Object obj2 = adapter.f10111OooOOoo.get(i);
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type com.yalla.yalla.data.db.table.UserInfo");
                UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f27240Oooo0o;
                this$0.getClass();
                UserInfoActivity.OooO00o.OooO0OO(oooO00o, this$0, oo0ooO.OooO00o(((UserInfo) obj2).getUserId()), false, 12);
                break;
            default:
                oo000o this_apply = (oo000o) obj;
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                Context context = this_apply.f56196OooOo;
                if (context != null) {
                    int i4 = TopicDetailActivity.f26305OooOoOO;
                    Object obj3 = this_apply.f10111OooOOoo.get(i);
                    Intrinsics.checkNotNullExpressionValue(obj3, "this.data[position]");
                    TopicDetailActivity.OooO00o.OooO00o(context, (TopicInfoModel) obj3);
                }
                break;
        }
    }

    @Override // o0ooOO0.o00O000.OooO0OO
    public final Object OooO0o0(o00O000.OooO00o oooO00o) {
        int i = this.f1355OooO0Oo;
        Object obj = this.f1356OooO0o0;
        switch (i) {
            case 0:
                ((o0OO00OO) obj).f1299OooO0o = oooO00o;
                return "RequestCompleteFuture";
            default:
                o0000Ooo.OooO0OO oooO0OO = (o0000Ooo.OooO0OO) obj;
                o0000Ooo.this.f1905OooO0oo.execute(new o0000oo(0, oooO0OO, oooO00o));
                return "fetchData";
        }
    }
}
