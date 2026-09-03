package p144o00OOooo;

import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import androidx.lifecycle.Observer;
import com.app.base.fragment.room.RoomInfoProfileFragment;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.view.BaseWebView;
import com.yalla.yalla.model.OnTopPostForTopicModel;
import com.yalla.yalla.model.TopicInfoModel;
import com.yalla.yalla.ui.activity.main.TaskActivity;
import com.yalla.yalla.ui.activity.moment.PostDetailActivity;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import com.yalla.yalla.ui.fragment.TopicPostPopularFragment;
import kotlin.jvm.internal.Intrinsics;
import p143o00OOooO.o00O0O;
import p146o00Oo0.o00000O0;
import p146o00Oo0.o00000OO;
import p255o00ooO0O.oOO00O;
import p500o0o00Oo0.OooOOO;
import p504o0o00o0.o00000O;
import p560o0oOOoo.o00O0;
import p560o0oOOoo.o00O0O0O;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0o0Oo implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f32055OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f32056OooO0O0;

    public /* synthetic */ o0o0Oo(Object obj, int i) {
        this.f32055OooO00o = i;
        this.f32056OooO0O0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.f32055OooO00o) {
            case 0:
                RoomInfoProfileFragment.m75initDataObserver$lambda10((RoomInfoProfileFragment) this.f32056OooO0O0, (Integer) obj);
                break;
            case 1:
                TaskActivity this$0 = (TaskActivity) this.f32056OooO0O0;
                Boolean aBoolean = (Boolean) obj;
                TaskActivity.OooO00o oooO00o = TaskActivity.f22080o00ooo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ImageView imageView = this$0.OooOooo().f49341OooO0OO;
                Intrinsics.checkNotNullExpressionValue(aBoolean, "aBoolean");
                imageView.setImageResource(aBoolean.booleanValue() ? R.drawable.task_check_in_check : R.drawable.task_check_in_checked);
                break;
            case 2:
                PostDetailActivity this$1 = (PostDetailActivity) this.f32056OooO0O0;
                PostDetailActivity.OooO00o oooO00o2 = PostDetailActivity.f22436o000000O;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.OooOooO().f50528OooOOo.OooO();
                break;
            case 3:
                TopicDetailActivity this$2 = (TopicDetailActivity) this.f32056OooO0O0;
                OnTopPostForTopicModel onTopPostForTopicModel = (OnTopPostForTopicModel) obj;
                TopicDetailActivity.OooO00o oooO00o3 = TopicDetailActivity.f22586o00Oo0;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                TopicInfoModel value = this$2.Oooo000().getTopicDetailLocal().getValue();
                if (value != null && onTopPostForTopicModel.getTopicId() == value.getId()) {
                    this$2.Oooo000().getDeletePostId().postValue(Long.valueOf(onTopPostForTopicModel.getPostId()));
                }
                break;
            case 4:
                o00O0O0O this$3 = (o00O0O0O) this.f32056OooO0O0;
                String url = (String) obj;
                Intrinsics.checkNotNullParameter(this$3, "this$0");
                Intrinsics.checkNotNullExpressionValue(url, "url");
                if (this$3.f44717OooO0O0 == null) {
                    o00000O o00000o = new o00000O(this$3.f44372OooO00o, R.style.FullscreenDialog);
                    Window window = o00000o.f41565OoooO0O;
                    WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
                    if (attributes != null) {
                        attributes.width = -1;
                    }
                    Window window2 = o00000o.f41565OoooO0O;
                    WindowManager.LayoutParams attributes2 = window2 != null ? window2.getAttributes() : null;
                    if (attributes2 != null) {
                        attributes2.height = -1;
                    }
                    Window window3 = o00000o.f41565OoooO0O;
                    if (window3 != null) {
                        window3.setAttributes(window3.getAttributes());
                    }
                    Window window4 = o00000o.f41565OoooO0O;
                    if (window4 != null) {
                        window4.setWindowAnimations(R.style.animation_bottom_in_bottom_out);
                    }
                    Window window5 = o00000o.f41565OoooO0O;
                    if (window5 != null) {
                        o00000O0.OooO00o oooO00o4 = o00000O0.f32084OooO0O0;
                        window5.setStatusBarColor(o00000OO.OooO0oO(o00000O0.f32089OooO0oO));
                    }
                    oOO00O.OooO0o0(this$3.OooO0OO());
                    o00000o.OooO0oO(this$3.OooO0OO());
                    o00000o.OooO0oo(80);
                    OooOOO.f41235OooO00o.OooO0OO().observe(o00000o.f41564OoooO00, new o00O0O(this$3, 6));
                    this$3.f44717OooO0O0 = o00000o;
                }
                if (this$3.OooO0OO().getLoadState() != BaseWebView.LoadState.Loading) {
                    if (this$3.OooO0OO().getLoadState() != BaseWebView.LoadState.Success) {
                        this$3.OooO0OO().loadUrl(p518o0o0O000.o00000OO.OooO0OO(p518o0o0O000.o00000OO.OooO00o(url), null));
                        this$3.OooO0OO().setLoadStateListener(new o00O0(this$3));
                    } else {
                        o00000O o00000o2 = this$3.f44717OooO0O0;
                        if (o00000o2 != null) {
                            o00000o2.OooOO0();
                        }
                    }
                    break;
                }
                break;
            default:
                TopicPostPopularFragment.m415initObserve$lambda6((TopicPostPopularFragment) this.f32056OooO0O0, (Long) obj);
                break;
        }
    }
}
