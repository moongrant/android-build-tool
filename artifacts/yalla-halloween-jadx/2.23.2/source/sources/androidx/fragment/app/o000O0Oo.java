package androidx.fragment.app;

import android.view.View;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.ui.activity.moment.TopicManagerActivity;
import kotlin.jvm.internal.Intrinsics;
import p492o0o00OO0.oOO00O0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000O0Oo implements o0000oO.o0OoOo0.OooO00o, BaseQuickAdapter.OooO0O0, BaseQuickAdapter.OooO0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f6031OooO0Oo;

    public /* synthetic */ o000O0Oo(Object obj) {
        this.f6031OooO0Oo = obj;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0O0
    public final void OooO0O0(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        TopicManagerActivity this$0 = (TopicManagerActivity) this.f6031OooO0Oo;
        int i2 = TopicManagerActivity.f25931OooOoO;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (view.getId() == p562o0oOo000.o0OO00O.tvUserRevoke) {
            String strValueOf = String.valueOf(this$0.OooOo().f13189OooOOoo.get(i).getUserId());
            String userName = this$0.OooOo().f13189OooOOoo.get(i).getUserName();
            if (this$0.isDestroyed() || this$0.isFinishing()) {
                return;
            }
            Intrinsics.checkNotNull(this$0, "null cannot be cast to non-null type com.yalla.yalla.base.activity.IComposeDialog");
            this$0.showDialog((String) null, ComposableLambdaKt.composableLambdaInstance(930893164, true, new oOO00O0(userName, this$0, strValueOf, i)));
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        com.yalla.yalla.ui.adapter.o000OOo this$0 = (com.yalla.yalla.ui.adapter.o000OOo) this.f6031OooO0Oo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int i2 = this$0.f27082OooOooO;
        if (i2 == i) {
            this$0.f27082OooOooO = -1;
            baseQuickAdapter.notifyItemChanged(i2);
        } else {
            this$0.f27082OooOooO = i;
            if (i2 >= 0) {
                baseQuickAdapter.notifyItemChanged(i2);
            }
            baseQuickAdapter.notifyItemChanged(this$0.f27082OooOooO);
        }
    }

    @Override // o0000oO.o0OoOo0.OooO00o
    public final void onCancel() {
        SpecialEffectsController.Operation this$0 = (SpecialEffectsController.Operation) this.f6031OooO0Oo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.OooO00o();
    }
}
