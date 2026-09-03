package p039OoooOoo;

import android.view.View;
import androidx.camera.video.OooOO0O;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.model.VoteGameGift;
import com.yalla.yalla.ui.activity.room.o0OO00o0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import p637o0ooOO0.o00O000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00O0OO0 implements o00O000.OooO0OO, BaseQuickAdapter.OooO0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f1694OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1695OooO0o0;

    public /* synthetic */ o00O0OO0(Object obj, Object obj2) {
        this.f1694OooO0Oo = obj;
        this.f1695OooO0o0 = obj2;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [T, com.yalla.yalla.model.VoteGameGift] */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        Ref.ObjectRef selectVoteGift = (Ref.ObjectRef) this.f1694OooO0Oo;
        o0OO00o0 this$0 = (o0OO00o0) this.f1695OooO0o0;
        Intrinsics.checkNotNullParameter(selectVoteGift, "$selectVoteGift");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (Intrinsics.areEqual(selectVoteGift.element, baseQuickAdapter.f10111OooOOoo.get(i))) {
            return;
        }
        Object obj = baseQuickAdapter.f10111OooOOoo.get(i);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.yalla.yalla.model.VoteGameGift");
        selectVoteGift.element = (VoteGameGift) obj;
        this$0.notifyDataSetChanged();
    }

    @Override // o0ooOO0.o00O000.OooO0OO
    public final Object OooO0o0(o00O000.OooO00o oooO00o) {
        OooOO0O oooOO0O = (OooOO0O) this.f1694OooO0Oo;
        oooOO0O.f3945OooOoo.OooOO0O(new OooOO0O.OooO0O0((OooOO0O.OooOOO0) this.f1695OooO0o0, oooOO0O, oooO00o), oooOO0O.f3921OooO0OO);
        return "videoEncodingFuture";
    }
}
