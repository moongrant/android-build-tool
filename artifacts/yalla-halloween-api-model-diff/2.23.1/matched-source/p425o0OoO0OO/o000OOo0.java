package p425o0OoO0OO;

import android.widget.TextView;
import androidx.lifecycle.Observer;
import com.code.android.util.o0000;
import com.yalla.yalla.data.db.model.MusicTable;
import com.yalla.yalla.model.BadgeDataModel;
import com.yalla.yalla.ui.activity.user.BadgeWearActivity;
import com.yalla.yalla.ui.fragment.moment.MainMomentFragment;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import p459o0Ooo0O.o0000O0O;
import p535o0o0OOoO.g;
import p565o0oOo000.o000OOo;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o000OOo0 implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f46688OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f46689OooO0o0;

    public /* synthetic */ o000OOo0(Object obj, int i) {
        this.f46688OooO0Oo = i;
        this.f46689OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        String strOooO0OO;
        int i = this.f46688OooO0Oo;
        Object obj2 = this.f46689OooO0o0;
        switch (i) {
            case 0:
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of com.yalla.yalla.ext.LiveEventBusObservableExtKt.effectObserve.<no name provided>.invokeSuspend$lambda$0");
                ((Observer) obj2).onChanged(obj);
                break;
            case 1:
                o0000O0O this$0 = (o0000O0O) obj2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                boolean z = g.f53585OooO00o;
                MusicTable musicTableOooO0O0 = g.OooO0O0();
                TextView textView = this$0.f47759OooOO0O.f44402OooOOo0;
                if (musicTableOooO0O0 == null || (strOooO0OO = musicTableOooO0O0.mDisplayName) == null) {
                    strOooO0OO = o0000.OooO0OO(o000OOo.no_more_music);
                }
                textView.setText(strOooO0OO);
                break;
            case 2:
                BadgeWearActivity this$1 = (BadgeWearActivity) obj2;
                int i2 = BadgeWearActivity.f26634OooOo0o;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.f26638OooOo0O.clear();
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.MutableList<com.yalla.yalla.model.BadgeDataModel>");
                for (BadgeDataModel badgeDataModel : TypeIntrinsics.asMutableList(obj)) {
                    this$1.f26638OooOo0O.put(Integer.valueOf(badgeDataModel.getMedalId()), badgeDataModel.getName());
                }
                this$1.OooOoO0();
                break;
            default:
                MainMomentFragment.initObserver$lambda$9((MainMomentFragment) obj2, obj);
                break;
        }
    }
}
