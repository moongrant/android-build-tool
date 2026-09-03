package p554o0oOOOoo;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.Oooo000;
import com.chad.library.adapter.base.BaseQuickAdapter;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p254o00ooO0O.o000OO00;
import p459o0Ooo0O.o00000O;
import p459o0Ooo0O.o00000O0;
import p473o0OoooO0.o00O;
import p473o0OoooO0.o00OO000;
import p553o0oOOO0o.o0O0o0;
import p553o0oOOO0o.o0O0oo00;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class ooOOOOoo extends o00000O0<o00O> {

    public final class OooO00o extends o0O0o0<o00OO000, String> {
        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void convert(com.chad.library.adapter.base.OooO00o oooO00o, Object obj) {
            o0O0oo00 holder = (o0O0oo00) oooO00o;
            String item = (String) obj;
            Intrinsics.checkNotNullParameter(holder, "holder");
            Intrinsics.checkNotNullParameter(item, "item");
            ((o00OO000) holder.f44623OooO0o).f40656OooO0O0.setText(item);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ooOOOOoo(Activity context, List listData, final Function1 onItemClick) {
        super(context);
        int iOooO00o = o000OO00.OooO00o(140);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listData, "listData");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        OooO00o oooO00o = new OooO00o();
        oooO00o.setNewData(listData);
        oooO00o.setOnItemClickListener(new BaseQuickAdapter.OooOOOO() { // from class: o0oOOOoo.oO000OOo
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOOO
            public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) throws Exception {
                ooOOOOoo this$0 = this.f44628OooO0Oo;
                Function1 onItemClick2 = onItemClick;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(onItemClick2, "$onItemClick");
                this$0.dismiss();
                onItemClick2.invoke(Integer.valueOf(i));
            }
        });
        ((o00O) this.f40437OooO0O0).f40654OooO0O0.setLayoutManager(new LinearLayoutManager(context, 1, false));
        ((o00O) this.f40437OooO0O0).f40654OooO0O0.setAdapter(oooO00o);
        Oooo000 oooo000 = new Oooo000(context);
        oooo000.f9005OooO00o = new ColorDrawable(context.getResources().getColor(o00000O.color_d8d8d8));
        ((o00O) this.f40437OooO0O0).f40654OooO0O0.addItemDecoration(oooo000);
        ((o00O) this.f40437OooO0O0).f40654OooO0O0.setMinimumWidth(iOooO00o);
    }
}
