package p540o0o0Oo0;

import android.os.Looper;
import androidx.lifecycle.Observer;
import com.code.android.util.ToastUtil;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.Response;
import com.yalla.yalla.ui.activity.moment.TopicEditDescActivity;
import com.yalla.yalla.ui.fragment.MainSearchRoomFragment;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p074o000O0oo.OooOOO;
import p255o00ooO0O.o000O0O0;
import p255o00ooO0O.o00O000;
import p255o00ooO0O.o0O0ooO;
import p651o0ooOOoo.jb;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0O0o00O implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f44035OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f44036OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ Object f44037OooO0OO;

    public /* synthetic */ o0O0o00O(Object obj, Object obj2, int i) {
        this.f44035OooO00o = i;
        this.f44036OooO0O0 = obj;
        this.f44037OooO0OO = obj2;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.f44035OooO00o) {
            case 0:
                String desc = (String) this.f44036OooO0O0;
                TopicEditDescActivity this$0 = (TopicEditDescActivity) this.f44037OooO0OO;
                int i = TopicEditDescActivity.f22620Oooooo;
                Intrinsics.checkNotNullParameter(desc, "$desc");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (((Response) obj).getIsSuccess()) {
                    String strOooO0OO = o000O0O0.OooO0OO(R.string.Success);
                    ToastUtil toastUtil = ToastUtil.f12583OooO0O0;
                    if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                        o0O0ooO o0o0oooOooO0O0 = OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o0o0oooOooO0O0.run();
                        } else {
                            o00O000 o00o001 = o00O000.f34368OooO00o;
                            o00O000.f34370OooO0OO.post(o0o0oooOooO0O0);
                        }
                    }
                    LiveEventBus.get("TOPIC_DESC").post(desc);
                    this$0.finish();
                }
                break;
            default:
                MainSearchRoomFragment.m366initSearchHistory$lambda15((jb) this.f44036OooO0O0, (MainSearchRoomFragment) this.f44037OooO0OO, (List) obj);
                break;
        }
    }
}
