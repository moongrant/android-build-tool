package p465o0OooOo;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.Oooo0;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.util.o0000O0;
import com.yalla.android.ylpopupwindow.utils.VBViewHolder;
import com.yalla.yalla.base.activity.BaseFragmentActivity;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p365o0OOo0O.OooO;
import p365o0OOo0O.OooO0o;
import p366o0OOo0O0.OooOO0;
import p366o0OOo0O0.OooOO0O;
import p367o0OOo0OO.OooOOO0;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o0O0O0o0 extends OooOO0<OooO0o> {

    public final class OooO00o extends OooOOO0<OooO, String> {
        public OooO00o() {
            super(0);
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
            VBViewHolder holder = (VBViewHolder) baseViewHolder;
            String item = (String) obj;
            Intrinsics.checkNotNullParameter(holder, "holder");
            Intrinsics.checkNotNullParameter(item, "item");
            ((OooO) holder.getViewBinding()).f43073OooO0O0.setText(item);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0O0o0(BaseFragmentActivity context, ArrayList listData, final Function1 onItemClick) {
        super(context);
        int iOooO00o = o0000O0.OooO00o(140);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listData, "listData");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        OooO00o oooO00o = new OooO00o();
        oooO00o.OooOoO0(listData);
        oooO00o.f13176OooO0o = new BaseQuickAdapter.OooO0o() { // from class: o0OooOo.o0O0O0Oo
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
            public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) throws Exception {
                o0O0O0o0 this$0 = this.f47841OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Function1 onItemClick2 = onItemClick;
                Intrinsics.checkNotNullParameter(onItemClick2, "$onItemClick");
                this$0.OooO00o();
                onItemClick2.invoke(Integer.valueOf(i));
            }
        };
        ((OooO0o) this.f43077OooO0O0).f43075OooO0O0.setLayoutManager(new LinearLayoutManager(context, 1, false));
        ((OooO0o) this.f43077OooO0O0).f43075OooO0O0.setAdapter(oooO00o);
        Oooo0 oooo0 = new Oooo0(context);
        oooo0.f10658OooO00o = new ColorDrawable(context.getResources().getColor(OooOO0O.color_d8d8d8));
        ((OooO0o) this.f43077OooO0O0).f43075OooO0O0.addItemDecoration(oooo0);
        ((OooO0o) this.f43077OooO0O0).f43075OooO0O0.setMinimumWidth(iOooO00o);
    }
}
