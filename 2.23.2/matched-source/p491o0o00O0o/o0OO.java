package p491o0o00O0o;

import android.view.View;
import androidx.lifecycle.Observer;
import com.yalla.yalla.model.AccountBindInfo;
import com.yalla.yalla.model.InOutRoomModel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.account.UntieAccountBindActivity;
import com.yalla.yalla.ui.vm.account.AccountVM;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p530o0o0OOOO.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0OO implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f49035OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ View.OnClickListener f49036OooO0o0;

    public /* synthetic */ o0OO(int i, View.OnClickListener onClickListener) {
        this.f49035OooO0Oo = i;
        this.f49036OooO0o0 = onClickListener;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        RoomUserInfoModel newUser;
        int i = this.f49035OooO0Oo;
        View.OnClickListener onClickListener = this.f49036OooO0o0;
        switch (i) {
            case 0:
                final UntieAccountBindActivity this$0 = (UntieAccountBindActivity) onClickListener;
                int i2 = UntieAccountBindActivity.f24887OooOo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.getClass();
                BaseActivityK.OooOo0o(this$0, null, 0L, 3);
                ((AccountVM) this$0.f24890OooOo00.getValue()).getAccountBindInfo().observe(this$0, new Observer() { // from class: o0o00O0o.o0OOO0
                    @Override // androidx.lifecycle.Observer
                    public final void onChanged(Object obj2) {
                        ApiResult apiResult = (ApiResult) obj2;
                        int i3 = UntieAccountBindActivity.f24887OooOo;
                        UntieAccountBindActivity this$1 = this$0;
                        Intrinsics.checkNotNullParameter(this$1, "this$0");
                        this$1.OooOo0();
                        if (apiResult.isSuccess()) {
                            if (apiResult.getData() != null) {
                                this$1.f24889OooOo0 = (AccountBindInfo) apiResult.getData();
                            }
                        }
                    }
                });
                break;
            default:
                o0O00oO0 this$1 = (o0O00oO0) onClickListener;
                InOutRoomModel inOutRoomModel = (InOutRoomModel) obj;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                if (this$1.f53410OooOo0O && (newUser = inOutRoomModel.getNewUser()) != null) {
                    int kind = inOutRoomModel.getKind();
                    LinkedHashMap linkedHashMap = this$1.f53409OooOo00;
                    if (kind == 0) {
                        newUser.isInRoom().setValue(Boolean.TRUE);
                        linkedHashMap.put(newUser.getUserId().getValue(), newUser);
                    } else {
                        newUser.isInRoom().setValue(Boolean.FALSE);
                        linkedHashMap.remove(newUser.getUserId().getValue());
                    }
                    int i3 = 0;
                    this$1.OooOOo(0);
                    for (Object obj2 : this$1.f53404OooOOo) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        RoomUserInfoModel roomUserInfoModel = (RoomUserInfoModel) obj2;
                        if (roomUserInfoModel.getUserId().getValue().longValue() == newUser.getUserId().getValue().longValue()) {
                            roomUserInfoModel.isInRoom().setValue(newUser.isInRoom().getValue());
                        }
                        this$1.OooOO0O().notifyItemChanged(i3);
                        i3 = i4;
                    }
                    break;
                }
                break;
        }
    }
}
