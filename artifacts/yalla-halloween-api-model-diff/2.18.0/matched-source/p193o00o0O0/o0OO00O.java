package p193o00o0O0;

import android.content.Intent;
import android.net.Uri;
import com.app.selectPicture.model.SelectImageData;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.model.MomentPoll;
import com.yalla.yalla.model.MomentType;
import com.yalla.yalla.ui.activity.moment.PostDetailActivity;
import com.yalla.yalla.ui.activity.room.MemberListConveneActivity;
import com.yalla.yalla.ui.fragment.UserInfoLeftFragment;
import java.util.Objects;
import java.util.concurrent.ScheduledFuture;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p187o00o00Oo.o0ooOOo;
import p194o00o0O00.Oooo000;
import p201o00o0Oo0.o00000OO;
import p410o0Oo0OOo.oO000Oo0;
import p420o0Oo0oOo.oO00OO0O;
import p540o0o0Oo0.o00O00;
import p540o0o0Oo0.o00O000o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0OO00O implements o00000OO, OnCompleteListener, oO00OO0O, o0ooOOo {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f33121Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f33122OoooO00;

    public /* synthetic */ o0OO00O(Object obj, int i) {
        this.f33121Oooo = i;
        this.f33122OoooO00 = obj;
    }

    @Override // p201o00o0Oo0.o00000OO
    public final void OooO00o(Object obj) {
        o00000 o00000Var = (o00000) this.f33122OoooO00;
        Objects.requireNonNull(o00000Var);
        Intent intent = new Intent();
        SelectImageData selectImageData = new SelectImageData();
        selectImageData.OooO0OO((Uri) obj);
        intent.putExtra("selectData", selectImageData);
        o00000Var.f33104OooO00o.setResult(-1, intent);
        Function1<? super SelectImageData, Unit> function1 = Oooo000.f33164OooO0O0;
        if (function1 != null) {
            function1.invoke(selectImageData);
        }
        Oooo000.f33164OooO0O0 = null;
        o00000Var.f33104OooO00o.finish();
    }

    @Override // p420o0Oo0oOo.oO00OO0O
    public final void OooO0O0(oO000Oo0 it) {
        MomentDetailModel momentDetailModel;
        MomentDetailModel forward;
        MomentPoll momentPoll;
        PostDetailActivity this$0 = (PostDetailActivity) this.f33122OoooO00;
        PostDetailActivity.OooO00o oooO00o = PostDetailActivity.f22436o000000O;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        int i = this$0.f22462oo0o0Oo;
        if (i == 0) {
            this$0.Oooo000().tabRefreshData(true);
        } else if (i == 1) {
            this$0.Oooo00o().tabRefreshData(true);
        } else if (i == 2) {
            this$0.Oooo00O().tabRefreshData(true);
        }
        MomentDetailModel momentDetailModel2 = this$0.f22439OooooOo;
        if (momentDetailModel2 != null) {
            int type = momentDetailModel2.getType();
            MomentType momentType = MomentType.Poll;
            long id = 0;
            if (type == momentType.getValue()) {
                MomentDetailModel momentDetailModel3 = this$0.f22439OooooOo;
                if (momentDetailModel3 != null && (momentPoll = momentDetailModel3.getMomentPoll()) != null) {
                    id = momentPoll.getId();
                }
                this$0.Oooo0OO(id, new o00O000o(this$0));
                return;
            }
            if (type != MomentType.Forward.getValue() || (momentDetailModel = this$0.f22439OooooOo) == null || (forward = momentDetailModel.getForward()) == null || forward.getType() != momentType.getValue()) {
                return;
            }
            MomentPoll momentPoll2 = forward.getMomentPoll();
            this$0.Oooo0OO(momentPoll2 != null ? momentPoll2.getId() : 0L, new o00O00(this$0));
        }
    }

    @Override // p187o00o00Oo.o0ooOOo
    public final void OooO0oO() {
        switch (this.f33121Oooo) {
            case 3:
                MemberListConveneActivity this$0 = (MemberListConveneActivity) this.f33122OoooO00;
                int i = MemberListConveneActivity.f22879o00Oo0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (!(!StringsKt.isBlank(this$0.f22887o00O0O))) {
                    this$0.Oooo00O(false);
                } else {
                    this$0.Oooo00o(this$0.f22887o00O0O, false);
                }
                break;
            default:
                ((UserInfoLeftFragment) this.f33122OoooO00).lambda$initView$2();
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        ((ScheduledFuture) this.f33122OoooO00).cancel(false);
    }
}
