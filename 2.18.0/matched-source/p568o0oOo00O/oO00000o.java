package p568o0oOo00O;

import android.view.View;
import android.widget.TextView;
import com.app.base.model.TagListModel;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.user.UserInfoTagActivity;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import p255o00ooO0O.o000O0O0;
import p581o0oOoOOo.l;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oO00000o implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f45364Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f45365OoooO00;

    public /* synthetic */ oO00000o(Object obj, int i) {
        this.f45364Oooo = i;
        this.f45365OoooO00 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f45364Oooo) {
            case 0:
                UserInfoTagActivity this$0 = (UserInfoTagActivity) this.f45365OoooO00;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNull(view, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView = (TextView) view;
                Object tag = view.getTag();
                Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue = ((Integer) tag).intValue();
                if (!UserInfoTagActivity.OooOoo(this$0, iIntValue)) {
                    ArrayList<TagListModel.TagInfo> arrayList = this$0.f23573ooOO;
                    Intrinsics.checkNotNull(arrayList);
                    if (arrayList.size() < this$0.f23568o00o0O) {
                        ArrayList<TagListModel.TagInfo> arrayList2 = this$0.f23573ooOO;
                        Intrinsics.checkNotNull(arrayList2);
                        arrayList2.add(this$0.f23566o00Oo0.get(iIntValue));
                        view.setSelected(true);
                        textView.setTextColor(o000O0O0.OooO00o(R.color.color_white));
                        this$0.Oooo0o0();
                    }
                } else {
                    ArrayList<TagListModel.TagInfo> arrayList3 = this$0.f23573ooOO;
                    Intrinsics.checkNotNull(arrayList3);
                    TypeIntrinsics.asMutableCollection(arrayList3).remove(this$0.Oooo00o(iIntValue));
                    view.setSelected(false);
                    textView.setTextColor(o000O0O0.OooO00o(R.color.color_6D6D6D));
                    this$0.Oooo0o0();
                }
                break;
            default:
                l this$1 = (l) this.f45365OoooO00;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.OooO0O0();
                break;
        }
    }
}
