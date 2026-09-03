package p143o00OOooO;

import android.os.Looper;
import androidx.lifecycle.Observer;
import com.app.base.fragment.MainMomentFollowingFragment;
import com.app.base.mixedroom.model.TreasureBoxProgressModel;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.Response;
import com.yalla.yalla.model.EventModel;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.ui.activity.account.DeleteAccountSubmitActivity;
import com.yalla.yalla.ui.activity.moment.PostDetailActivity;
import com.yalla.yalla.ui.fragment.TreasureBoxFragment;
import com.yalla.yalla.ui.vm.room.RoomEventInfoViewModel;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p074o000O0oo.OooOOO;
import p255o00ooO0O.o000O0O0;
import p255o00ooO0O.o00O000;
import p255o00ooO0O.o0O0ooO;
import p518o0o0O000.oo0o0Oo;
import p632o0ooO00.o000O0Oo;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0O0O00 implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f31991OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f31992OooO0O0;

    public /* synthetic */ o0O0O00(Object obj, int i) {
        this.f31991OooO00o = i;
        this.f31992OooO0O0 = obj;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00ee  */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList, java.util.List<T>] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.ArrayList, java.util.List<T>] */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        Object next;
        EventModel eventModel;
        ?? r9;
        switch (this.f31991OooO00o) {
            case 0:
                MainMomentFollowingFragment.m22initObserver$lambda7((MainMomentFollowingFragment) this.f31992OooO0O0, (MomentDetailModel) obj);
                break;
            case 1:
                DeleteAccountSubmitActivity this$0 = (DeleteAccountSubmitActivity) this.f31992OooO0O0;
                Response response = (Response) obj;
                DeleteAccountSubmitActivity.OooO00o oooO00o = DeleteAccountSubmitActivity.f21764OooooOo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (response.getIsSuccess() && response.getData() != null && Intrinsics.areEqual(response.getData(), "1")) {
                    String strOooO0OO = o000O0O0.OooO0OO(R.string.account_delete_account_success);
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
                    oo0o0Oo.f42144OooO00o.OooO0O0(this$0, true);
                }
                this$0.OooOoO();
                break;
            case 2:
                PostDetailActivity this$1 = (PostDetailActivity) this.f31992OooO0O0;
                MomentDetailModel momentDetailModel = (MomentDetailModel) obj;
                PostDetailActivity.OooO00o oooO00o2 = PostDetailActivity.f22436o000000O;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                MomentDetailModel momentDetailModel2 = this$1.f22439OooooOo;
                if (momentDetailModel2 != null && momentDetailModel2.getId() == momentDetailModel.getId()) {
                    momentDetailModel2.setCommentNum(momentDetailModel.getCommentNum());
                    this$1.OooOooO().f50527OooOOOo.setCommentCount(momentDetailModel2.getCommentNum());
                    break;
                }
                break;
            case 3:
                TreasureBoxFragment.m421initView$lambda11((TreasureBoxFragment) this.f31992OooO0O0, (TreasureBoxProgressModel) obj);
                break;
            default:
                RoomEventInfoViewModel roomInfoVM = (RoomEventInfoViewModel) this.f31992OooO0O0;
                Long l = (Long) obj;
                Intrinsics.checkNotNullParameter(roomInfoVM, "$roomInfoVM");
                o000O0Oo<EventModel> eventInfoPager = roomInfoVM.getEventInfoPager();
                Iterator it = eventInfoPager.f48702OooO0Oo.iterator();
                do {
                    if (it.hasNext()) {
                        next = it.next();
                    } else {
                        next = null;
                    }
                    eventModel = (EventModel) next;
                    r9 = eventInfoPager.f48702OooO0Oo;
                    if (eventModel == null) {
                        r9.remove(eventModel);
                        eventInfoPager.OooO0O0();
                        break;
                    }
                } while (!(l != null && ((EventModel) next).getId() == l.longValue()));
                eventModel = (EventModel) next;
                r9 = eventInfoPager.f48702OooO0Oo;
                if (eventModel == null) {
                    r9.remove(eventModel);
                    eventInfoPager.OooO0O0();
                    break;
                }
                break;
        }
    }
}
