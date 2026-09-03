package p587o0oOooOO;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.code.android.util.o0000;
import com.code.android.util.o0000O0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.o0OOO0o;
import p562o0oOo000.oo0o0Oo;
import p571o0oOoO0.o0000oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class f2<Model> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Context f56791OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f56792OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final o0000oo<Model> f56793OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public PopupWindow f56794OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f56795OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final float f56796OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f56797OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public Function1<? super Model, Unit> f56798OooO0oo;

    public f2(@NotNull Context context, int i, @NotNull o0000oo<Model> adapter) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.f56791OooO00o = context;
        this.f56792OooO0O0 = i;
        this.f56793OooO0OO = adapter;
        this.f56796OooO0o0 = 45.2f;
        this.f56795OooO0o = 5;
    }

    public final void OooO00o(@NotNull View location) {
        Intrinsics.checkNotNullParameter(location, "location");
        int right = location.getRight() - location.getLeft();
        o0000oo<Model> o0000ooVar = this.f56793OooO0OO;
        int itemCount = o0000ooVar.getItemCount();
        int itemCount2 = o0000ooVar.getItemCount();
        int i = this.f56795OooO0o;
        if (itemCount2 > i) {
            itemCount = i;
        }
        int iOooO00o = o0000O0.OooO00o(this.f56796OooO0o0) * itemCount;
        if (this.f56794OooO0Oo == null) {
            Context context = this.f56791OooO00o;
            View viewInflate = LayoutInflater.from(context).inflate(oo0o0Oo.spinner_item_select, (ViewGroup) null);
            View viewFindViewById = viewInflate.findViewById(o0OO00O.spinner_item_list);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            RecyclerView recyclerView = (RecyclerView) viewFindViewById;
            recyclerView.setBackgroundResource(this.f56792OooO0O0);
            recyclerView.setLayoutManager(new LinearLayoutManager(context));
            recyclerView.setAdapter(o0000ooVar);
            o0000ooVar.f13176OooO0o = new BaseQuickAdapter.OooO0o() { // from class: o0oOooOO.d2
                /* JADX WARN: Type inference incomplete: some casts might be missing */
                @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
                public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i2) {
                    f2 this$0 = this.f56778OooO0Oo;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    Function1<? super Model, Unit> function1 = this$0.f56798OooO0oo;
                    if (function1 != 0) {
                        function1.invoke((Object) baseQuickAdapter.OooOOO(i2));
                    }
                    PopupWindow popupWindow = this$0.f56794OooO0Oo;
                    if (popupWindow != null) {
                        popupWindow.dismiss();
                    }
                }
            };
            o0000ooVar.OooOoOO(true);
            PopupWindow popupWindow = new PopupWindow(viewInflate, right, iOooO00o, true);
            this.f56794OooO0Oo = popupWindow;
            popupWindow.setBackgroundDrawable(o0000.OooO0O0(o0OOO0o.color_transparent));
        }
        PopupWindow popupWindow2 = this.f56794OooO0Oo;
        if (popupWindow2 != null) {
            popupWindow2.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: o0oOooOO.e2
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    f2 this$0 = this.f56786OooO0Oo;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    Function0<Unit> function0 = this$0.f56797OooO0oO;
                    if (function0 != null) {
                        function0.invoke();
                    }
                }
            });
        }
        PopupWindow popupWindow3 = this.f56794OooO0Oo;
        if (popupWindow3 != null) {
            popupWindow3.showAsDropDown(location, 0, 0, 80);
        }
    }
}
