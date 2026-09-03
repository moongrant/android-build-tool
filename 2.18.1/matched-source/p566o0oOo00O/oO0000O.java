package p566o0oOo00O;

import android.view.View;
import android.widget.TextView;
import com.app.base.model.TagListModel;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.user.UserInfoTagActivity;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import p254o00ooO0O.o000O0O0;
import p579o0oOoOOo.m;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oO0000O implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f45354Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f45355Oooo0oO;

    public /* synthetic */ oO0000O(Object obj, int i) {
        this.f45354Oooo0o = i;
        this.f45355Oooo0oO = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f45354Oooo0o) {
            case 0:
                UserInfoTagActivity this$0 = (UserInfoTagActivity) this.f45355Oooo0oO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNull(view, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView = (TextView) view;
                Object tag = view.getTag();
                Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue = ((Integer) tag).intValue();
                if (!UserInfoTagActivity.OooOoo(this$0, iIntValue)) {
                    ArrayList<TagListModel.TagInfo> arrayList = this$0.f23547OoooooO;
                    Intrinsics.checkNotNull(arrayList);
                    if (arrayList.size() < this$0.f23549o00O0O) {
                        ArrayList<TagListModel.TagInfo> arrayList2 = this$0.f23547OoooooO;
                        Intrinsics.checkNotNull(arrayList2);
                        arrayList2.add(this$0.f23553o0OoOo0.get(iIntValue));
                        view.setSelected(true);
                        textView.setTextColor(o000O0O0.OooO00o(R.color.color_white));
                        this$0.Oooo0o0();
                    }
                } else {
                    ArrayList<TagListModel.TagInfo> arrayList3 = this$0.f23547OoooooO;
                    Intrinsics.checkNotNull(arrayList3);
                    TypeIntrinsics.asMutableCollection(arrayList3).remove(this$0.Oooo00o(iIntValue));
                    view.setSelected(false);
                    textView.setTextColor(o000O0O0.OooO00o(R.color.color_6D6D6D));
                    this$0.Oooo0o0();
                }
                break;
            default:
                m this$1 = (m) this.f45355Oooo0oO;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.OooO0O0();
                break;
        }
    }
}
