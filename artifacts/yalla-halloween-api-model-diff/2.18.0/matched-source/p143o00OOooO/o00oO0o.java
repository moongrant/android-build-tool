package p143o00OOooO;

import android.widget.TextView;
import androidx.lifecycle.Observer;
import com.app.base.fragment.MainMomentFollowingFragment;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.o00O0O;
import com.yalla.yalla.model.EventModel;
import com.yalla.yalla.model.MomentSendModel;
import com.yalla.yalla.model.TopicGroupInfoModel;
import com.yalla.yalla.ui.activity.moment.PostDetailActivity;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import com.yalla.yalla.ui.vm.event.EventMineViewModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import o0O00O0o.OooO0O0;
import o0O00O0o.OooO0o;
import p164o00OoOo.o00O00OO;
import p581o0oOoOOo.oO0OO00;
import p581o0oOoOOo.oOo0o0oO;
import p632o0ooO00.o000O0Oo;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00oO0o implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f31989OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f31990OooO0O0;

    public /* synthetic */ o00oO0o(Object obj, int i) {
        this.f31989OooO00o = i;
        this.f31990OooO0O0 = obj;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x013a  */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.ArrayList, java.util.List<T>] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList, java.util.List<T>] */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        EventModel eventModel;
        ?? r12;
        Object obj2 = null;
        switch (this.f31989OooO00o) {
            case 0:
                MainMomentFollowingFragment.m16initObserver$lambda15((MainMomentFollowingFragment) this.f31990OooO0O0, (MomentSendModel) obj);
                break;
            case 1:
                o00O00OO this$0 = (o00O00OO) this.f31990OooO0O0;
                String it = (String) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                o00O0O.OooO(this$0.f32544OooO0OO);
                OooO0O0 oooO0O0 = this$0.f32548OooO0oO;
                Intrinsics.checkNotNullExpressionValue(it, "it");
                oooO0O0.OooO0OO(new OooO0o(it, Integer.MAX_VALUE));
                this$0.f32548OooO0oO.OooO00o();
                break;
            case 2:
                PostDetailActivity this$1 = (PostDetailActivity) this.f31990OooO0O0;
                PostDetailActivity.OooO00o oooO00o = PostDetailActivity.f22436o000000O;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.OooOoo(false);
                break;
            case 3:
                TopicDetailActivity this$2 = (TopicDetailActivity) this.f31990OooO0O0;
                TopicDetailActivity.OooO00o oooO00o2 = TopicDetailActivity.f22586o00Oo0;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                if (!Intrinsics.areEqual((Boolean) obj, Boolean.TRUE)) {
                    this$2.OooOooo().f51017OooO0o0.f49775OooO0O0.setText(R.string.Follow);
                    TextView textView = this$2.f22594o00O0O;
                    if (textView != null) {
                        textView.setText(R.string.Follow);
                    }
                    this$2.OooOooo().f51017OooO0o0.f49775OooO0O0.setBackgroundResource(R.drawable.selector_btn_bg_green_white_gray_r21);
                    TopicGroupInfoModel value = this$2.Oooo00O().getTopicGroupInfoModel().getValue();
                    if (value != null) {
                        value.setFollowed(false);
                        break;
                    }
                } else {
                    this$2.OooOooo().f51017OooO0o0.f49775OooO0O0.setText(R.string.Following);
                    TextView textView2 = this$2.f22594o00O0O;
                    if (textView2 != null) {
                        textView2.setText(R.string.Following);
                    }
                    this$2.OooOooo().f51017OooO0o0.f49775OooO0O0.setBackgroundResource(R.drawable.shape_bg_corner_black20);
                    TopicGroupInfoModel value2 = this$2.Oooo00O().getTopicGroupInfoModel().getValue();
                    if (value2 != null) {
                        value2.setFollowed(true);
                        break;
                    }
                }
                break;
            case 4:
                Function1 tmp0 = (Function1) this.f31990OooO0O0;
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                break;
            case 5:
                oOo0o0oO this$3 = (oOo0o0oO) this.f31990OooO0O0;
                Intrinsics.checkNotNullParameter(this$3, "this$0");
                if (Intrinsics.areEqual(obj, Boolean.TRUE)) {
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new oO0OO00(null), 3, null);
                }
                this$3.OooO0O0();
                break;
            default:
                EventMineViewModel mineVM = (EventMineViewModel) this.f31990OooO0O0;
                Long l = (Long) obj;
                Intrinsics.checkNotNullParameter(mineVM, "$mineVM");
                o000O0Oo<EventModel> mineEventPager = mineVM.getMineEventPager();
                for (Object obj3 : mineEventPager.f48702OooO0Oo) {
                    if (l != null && ((EventModel) obj3).getId() == l.longValue()) {
                        obj2 = obj3;
                        eventModel = (EventModel) obj2;
                        r12 = mineEventPager.f48702OooO0Oo;
                        if (eventModel == null) {
                            r12.remove(eventModel);
                            mineEventPager.OooO0O0();
                            break;
                        }
                    }
                }
                eventModel = (EventModel) obj2;
                r12 = mineEventPager.f48702OooO0Oo;
                if (eventModel == null) {
                    r12.remove(eventModel);
                    mineEventPager.OooO0O0();
                    break;
                }
                break;
        }
    }
}
