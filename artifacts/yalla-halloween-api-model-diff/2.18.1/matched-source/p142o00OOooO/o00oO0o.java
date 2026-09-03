package p142o00OOooO;

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
import p163o00OoOo.o00O00OO;
import p579o0oOoOOo.oO0OO0O;
import p579o0oOoOOo.ooOOO0Oo;
import p630o0ooO00.o000O0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00oO0o implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f31968OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f31969OooO0O0;

    public /* synthetic */ o00oO0o(Object obj, int i) {
        this.f31968OooO00o = i;
        this.f31969OooO0O0 = obj;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x013a  */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.ArrayList, java.util.List<T>] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList, java.util.List<T>] */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        EventModel eventModel;
        ?? r12;
        Object obj2 = null;
        switch (this.f31968OooO00o) {
            case 0:
                MainMomentFollowingFragment.m16initObserver$lambda15((MainMomentFollowingFragment) this.f31969OooO0O0, (MomentSendModel) obj);
                break;
            case 1:
                o00O00OO this$0 = (o00O00OO) this.f31969OooO0O0;
                String it = (String) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                o00O0O.OooO(this$0.f32522OooO0OO);
                OooO0O0 oooO0O0 = this$0.f32526OooO0oO;
                Intrinsics.checkNotNullExpressionValue(it, "it");
                oooO0O0.OooO0OO(new OooO0o(it, Integer.MAX_VALUE));
                this$0.f32526OooO0oO.OooO00o();
                break;
            case 2:
                PostDetailActivity this$1 = (PostDetailActivity) this.f31969OooO0O0;
                PostDetailActivity.OooO00o oooO00o = PostDetailActivity.f22417o0O0O00;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.OooOoo(false);
                break;
            case 3:
                TopicDetailActivity this$2 = (TopicDetailActivity) this.f31969OooO0O0;
                TopicDetailActivity.OooO00o oooO00o2 = TopicDetailActivity.f22567o0OoOo0;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                if (!Intrinsics.areEqual((Boolean) obj, Boolean.TRUE)) {
                    this$2.OooOooo().f51080OooO0o0.f49838OooO0O0.setText(R.string.Follow);
                    TextView textView = this$2.f22577Ooooooo;
                    if (textView != null) {
                        textView.setText(R.string.Follow);
                    }
                    this$2.OooOooo().f51080OooO0o0.f49838OooO0O0.setBackgroundResource(R.drawable.selector_btn_bg_green_white_gray_r21);
                    TopicGroupInfoModel value = this$2.Oooo00O().getTopicGroupInfoModel().getValue();
                    if (value != null) {
                        value.setFollowed(false);
                        break;
                    }
                } else {
                    this$2.OooOooo().f51080OooO0o0.f49838OooO0O0.setText(R.string.Following);
                    TextView textView2 = this$2.f22577Ooooooo;
                    if (textView2 != null) {
                        textView2.setText(R.string.Following);
                    }
                    this$2.OooOooo().f51080OooO0o0.f49838OooO0O0.setBackgroundResource(R.drawable.shape_bg_corner_black20);
                    TopicGroupInfoModel value2 = this$2.Oooo00O().getTopicGroupInfoModel().getValue();
                    if (value2 != null) {
                        value2.setFollowed(true);
                        break;
                    }
                }
                break;
            case 4:
                Function1 tmp0 = (Function1) this.f31969OooO0O0;
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                break;
            case 5:
                ooOOO0Oo this$3 = (ooOOO0Oo) this.f31969OooO0O0;
                Intrinsics.checkNotNullParameter(this$3, "this$0");
                if (Intrinsics.areEqual(obj, Boolean.TRUE)) {
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new oO0OO0O(null), 3, null);
                }
                this$3.OooO0O0();
                break;
            default:
                EventMineViewModel mineVM = (EventMineViewModel) this.f31969OooO0O0;
                Long l = (Long) obj;
                Intrinsics.checkNotNullParameter(mineVM, "$mineVM");
                o000O0<EventModel> mineEventPager = mineVM.getMineEventPager();
                for (Object obj3 : mineEventPager.f48682OooO0Oo) {
                    if (l != null && ((EventModel) obj3).getId() == l.longValue()) {
                        obj2 = obj3;
                        eventModel = (EventModel) obj2;
                        r12 = mineEventPager.f48682OooO0Oo;
                        if (eventModel == null) {
                            r12.remove(eventModel);
                            mineEventPager.OooO0O0();
                            break;
                        }
                    }
                }
                eventModel = (EventModel) obj2;
                r12 = mineEventPager.f48682OooO0Oo;
                if (eventModel == null) {
                    r12.remove(eventModel);
                    mineEventPager.OooO0O0();
                    break;
                }
                break;
        }
    }
}
