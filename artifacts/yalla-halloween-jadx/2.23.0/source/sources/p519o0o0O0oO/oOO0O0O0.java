package p519o0o0O0oO;

import android.content.Context;
import android.view.View;
import androidx.camera.core.impl.o000OOo0;
import androidx.recyclerview.widget.RecyclerView;
import com.code.android.util.o000OO00;
import com.yalla.yalla.model.gift.GifListJson;
import com.yalla.yalla.ui.view.CrossRecyclerView;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p641o0ooOOOO.y7;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO0O0O0 extends Lambda implements Function1<List<GifListJson>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oOO0O00O f52978OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO0O0O0(oOO0O00O ooo0o00o) {
        super(1);
        this.f52978OooO0Oo = ooo0o00o;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<GifListJson> list) {
        List<GifListJson> list2 = list;
        if (list2 != null && list2.size() > 0) {
            int size = list2.size();
            oOO0O00O ooo0o00o = this.f52978OooO0Oo;
            if (size > 1) {
                CrossRecyclerView crossRecyclerView = ooo0o00o.f52969OooOO0O.f59398OooO0O0;
                Intrinsics.checkNotNullExpressionValue(crossRecyclerView, "emojiPanelBinding.rvEmojiPanelContent");
                o000OO00.OooOOOO(crossRecyclerView);
                y7 y7Var = ooo0o00o.f52969OooOO0O;
                View view = y7Var.f59400OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(view, "emojiPanelBinding.vSplitLine");
                o000OO00.OooOOOO(view);
                RecyclerView recyclerView = y7Var.f59399OooO0OO;
                Intrinsics.checkNotNullExpressionValue(recyclerView, "emojiPanelBinding.rvEmojiPanelTable");
                o000OO00.OooOOOO(recyclerView);
                oOO0O00O.OooOO0(ooo0o00o, list2);
                Context context = ooo0o00o.f52532OooO0Oo;
                recyclerView.setLayoutManager(new FixLinearLayoutManager(context, 0));
                oOO0O00O.OooO0O0 oooO0O0 = new oOO0O00O.OooO0O0(ooo0o00o, context, list2);
                ooo0o00o.f52972OooOOO0 = oooO0O0;
                recyclerView.setAdapter(oooO0O0);
                oOO0O00O.OooO0O0 oooO0O1 = ooo0o00o.f52972OooOOO0;
                if (oooO0O1 != null) {
                    oooO0O1.f10098OooO0o = new o000OOo0(ooo0o00o);
                }
            } else if (list2.size() == 1) {
                CrossRecyclerView crossRecyclerView2 = ooo0o00o.f52969OooOO0O.f59398OooO0O0;
                Intrinsics.checkNotNullExpressionValue(crossRecyclerView2, "emojiPanelBinding.rvEmojiPanelContent");
                o000OO00.OooO0O0(crossRecyclerView2);
                y7 y7Var2 = ooo0o00o.f52969OooOO0O;
                View view2 = y7Var2.f59400OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(view2, "emojiPanelBinding.vSplitLine");
                o000OO00.OooO0O0(view2);
                RecyclerView recyclerView2 = y7Var2.f59399OooO0OO;
                Intrinsics.checkNotNullExpressionValue(recyclerView2, "emojiPanelBinding.rvEmojiPanelTable");
                o000OO00.OooO0O0(recyclerView2);
                oOO0O00O.OooOO0(ooo0o00o, list2);
            }
        }
        return Unit.INSTANCE;
    }
}
