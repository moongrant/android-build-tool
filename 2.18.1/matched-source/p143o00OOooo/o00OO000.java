package p143o00OOooo;

import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import com.app.base.fragment.room.RoomInfoMomentFragment;
import com.yalla.yalla.common.ui.view.BaseWebView;
import com.yalla.yalla.model.BadgeDataModel;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.service.im.IMMessageService;
import com.yalla.yalla.ui.activity.user.BadgeWearActivity;
import com.yalla.yalla.ui.dialog.RoomGameBoxDialog;
import com.yalla.yalla.ui.fragment.MainMomentTopicFragment;
import com.yalla.yalla.ui.fragment.TopicPostLatestFragment;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import p522o0o0O0o.o00O0;
import p522o0o0O0o.oo0oOO0;
import p527o0o0OO0.Oooo0;
import p649o0ooOOoo.wa;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00OO000 implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f32011OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f32012OooO0O0;

    public /* synthetic */ o00OO000(Object obj, int i) {
        this.f32011OooO00o = i;
        this.f32012OooO0O0 = obj;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Integer, java.lang.String>] */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        boolean z = true;
        switch (this.f32011OooO00o) {
            case 0:
                RoomInfoMomentFragment.m67initObserver$lambda3((RoomInfoMomentFragment) this.f32012OooO0O0, (MomentDetailModel) obj);
                break;
            case 1:
                BaseWebView this$0 = (BaseWebView) this.f32012OooO0O0;
                String str = (String) obj;
                BaseWebView.OooO0OO oooO0OO = BaseWebView.f20915OoooO0O;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                oo0oOO0.OooO0O0("H5RefreshAssociationYallaChat : " + str);
                if (str != null && str.length() != 0) {
                    z = false;
                }
                if (z) {
                    p522o0o0O0o.o00OO000.OooO0O0(this$0, null);
                } else {
                    p522o0o0O0o.o00OO000.OooO0O0(this$0, str);
                }
                break;
            case 2:
                wa bindingDrawer = (wa) this.f32012OooO0O0;
                Intrinsics.checkNotNullParameter(bindingDrawer, "$bindingDrawer");
                bindingDrawer.f50875OooO0o.f50955OooOo00.setText(o00O0.OooO0O0(String.valueOf((Long) obj)));
                break;
            case 3:
                IMMessageService this$1 = (IMMessageService) this.f32012OooO0O0;
                int i = IMMessageService.f21662Oooo;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                Job job = this$1.f21665Oooo0oo;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                this$1.f21665Oooo0oo = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this$1), Dispatchers.getIO(), null, new Oooo0(this$1, null), 2, null);
                break;
            case 4:
                BadgeWearActivity this$2 = (BadgeWearActivity) this.f32012OooO0O0;
                int i2 = BadgeWearActivity.f23311OooooOO;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                this$2.f23315OooooO0.clear();
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.MutableList<com.yalla.yalla.model.BadgeDataModel>");
                for (BadgeDataModel badgeDataModel : TypeIntrinsics.asMutableList(obj)) {
                    this$2.f23315OooooO0.put(Integer.valueOf(badgeDataModel.getMedalId()), badgeDataModel.getName());
                }
                this$2.OooOooO();
                break;
            case 5:
                RoomGameBoxDialog this$3 = (RoomGameBoxDialog) this.f32012OooO0O0;
                Boolean bool = (Boolean) obj;
                Intrinsics.checkNotNullParameter(this$3, "this$0");
                if (bool != null) {
                    this$3.OooOOOO(bool.booleanValue(), RoomGameBoxDialog.GameType.GameCamel);
                }
                break;
            case 6:
                MainMomentTopicFragment.m342initObserver$lambda0((MainMomentTopicFragment) this.f32012OooO0O0, obj);
                break;
            default:
                TopicPostLatestFragment.m401initObserve$lambda0((TopicPostLatestFragment) this.f32012OooO0O0, (MomentDetailModel) obj);
                break;
        }
    }
}
