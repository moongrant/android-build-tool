package p361o0OOo00o;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.Oooo000;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.util.o0000O0;
import com.yalla.android.ylpopupwindow.utils.VBViewHolder;
import com.yalla.yalla.base.activity.BaseFragmentActivity;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p360o0OOo00O.OooO0OO;
import p363o0OOo0O0.OooO;
import p363o0OOo0O0.OooO0o;
import p462o0OooOo.o0O000O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class OooOO0O extends OooO0OO<OooO0o> {

    public final class OooO00o extends o0O000O<OooO, String> {
        public OooO00o() {
            super(0);
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
            VBViewHolder holder = (VBViewHolder) baseViewHolder;
            String item = (String) obj;
            Intrinsics.checkNotNullParameter(holder, "holder");
            Intrinsics.checkNotNullParameter(item, "item");
            ((OooO) holder.getViewBinding()).f43947OooO0O0.setText(item);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0O(BaseFragmentActivity context, ArrayList listData, final Function1 onItemClick) {
        super(context);
        int iOooO00o = o0000O0.OooO00o(140);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listData, "listData");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        OooO00o oooO00o = new OooO00o();
        oooO00o.OooOoO0(listData);
        oooO00o.f10098OooO0o = new BaseQuickAdapter.OooO0o() { // from class: o0OOo00o.OooOO0
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
            public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) throws Exception {
                OooOO0O this$0 = this.f43871OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Function1 onItemClick2 = onItemClick;
                Intrinsics.checkNotNullParameter(onItemClick2, "$onItemClick");
                this$0.OooO00o();
                onItemClick2.invoke(Integer.valueOf(i));
            }
        };
        ((OooO0o) this.f43870OooO0O0).f43949OooO0O0.setLayoutManager(new LinearLayoutManager(context, 1, false));
        ((OooO0o) this.f43870OooO0O0).f43949OooO0O0.setAdapter(oooO00o);
        Oooo000 oooo000 = new Oooo000(context);
        oooo000.f7622OooO00o = new ColorDrawable(context.getResources().getColor(p360o0OOo00O.OooO0o.color_d8d8d8));
        ((OooO0o) this.f43870OooO0O0).f43949OooO0O0.addItemDecoration(oooo000);
        ((OooO0o) this.f43870OooO0O0).f43949OooO0O0.setMinimumWidth(iOooO00o);
    }
}
