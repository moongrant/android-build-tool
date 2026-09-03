package androidx.camera.core.impl;

import android.os.SystemClock;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.ui.activity.moment.MomentSendActivity;
import com.yalla.yalla.ui.fragment.ExploreTagRoomListFragment;
import com.yalla.yalla.ui.view.moment.MomentDetailCommentItemView;
import java.util.Calendar;
import kotlin.jvm.internal.Intrinsics;
import p519o0o0O0oO.oOO0O00O;
import p585o0oOooOO.i;
import p641o0ooOOOO.y7;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000OOo0 implements o0ooOO0.o00O000.OooO0OO, i, BaseQuickAdapter.OooO0o, p562o0oOo0O.o000oOoO, o0oo00oO.o0000O00.OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f3707OooO0Oo;

    public /* synthetic */ o000OOo0(Object obj) {
        this.f3707OooO0Oo = obj;
    }

    public void OooO00o(String content) {
        MomentSendActivity this$0 = (MomentSendActivity) this.f3707OooO0Oo;
        int i = MomentSendActivity.f26175Oooo0OO;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(content, "content");
        p592o0oo00O.OooOOO0.OooO0O0("onMaskAdd content = " + content);
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        if (timeInMillis - this$0.f26188OooOooo > this$0.f26187OooOooO) {
            this$0.f26188OooOooo = timeInMillis;
            if (Intrinsics.areEqual(content, "@")) {
                this$0.OooOo().f58558OooO0o.OooO0oO(true);
            }
        }
    }

    @Override // p562o0oOo0O.o000oOoO
    public void OooO0O0() {
        ExploreTagRoomListFragment.initView$lambda$0((ExploreTagRoomListFragment) this.f3707OooO0Oo);
    }

    @Override // o0oo00oO.o0000O00.OooO00o
    public void OooO0Oo() {
        MomentDetailCommentItemView this$0 = (MomentDetailCommentItemView) this.f3707OooO0Oo;
        int i = MomentDetailCommentItemView.f31080OooOOO;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.OooO0oO();
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        oOO0O00O this$0 = (oOO0O00O) this.f3707OooO0Oo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.f52970OooOO0o == i) {
            return;
        }
        this$0.f52970OooOO0o = i;
        y7 y7Var = this$0.f52969OooOO0O;
        RecyclerView.Adapter adapter = y7Var.f59398OooO0O0.getAdapter();
        boolean z = false;
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        int i2 = this$0.f52970OooOO0o;
        if (i2 >= 0 && i2 < itemCount) {
            z = true;
        }
        if (z) {
            y7Var.f59398OooO0O0.scrollToPosition(i2);
            oOO0O00O.OooO0O0 oooO0O0 = this$0.f52972OooOOO0;
            if (oooO0O0 != null) {
                oooO0O0.notifyDataSetChanged();
            }
        }
    }

    @Override // o0ooOO0.o00O000.OooO0OO
    public Object OooO0o0(final o0ooOO0.o00O000.OooO00o oooO00o) {
        final o00O000 o00o001 = (o00O000) this.f3707OooO0Oo;
        o00o001.getClass();
        p033OoooO0O.o00oO0o.OooO0OO().execute(new Runnable() { // from class: androidx.camera.core.impl.o0O0ooO
            @Override // java.lang.Runnable
            public final void run() {
                o00O000.OooO0O0 oooO0O0 = (o00O000.OooO0O0) o00o001.f3711OooO00o.getValue();
                o0ooOO0.o00O000.OooO00o oooO00o2 = oooO00o;
                if (oooO0O0 == null) {
                    oooO00o2.OooO0OO(new IllegalStateException("Observable has not yet been initialized with a value."));
                    return;
                }
                Throwable th = oooO0O0.f3717OooO0O0;
                if (!(th == null)) {
                    th.getClass();
                    oooO00o2.OooO0OO(th);
                } else {
                    if (!(th == null)) {
                        throw new IllegalStateException("Result contains an error. Does not contain a value.");
                    }
                    oooO00o2.OooO0O0(oooO0O0.f3716OooO00o);
                }
            }
        });
        return o00o001 + " [fetch@" + SystemClock.uptimeMillis() + "]";
    }
}
