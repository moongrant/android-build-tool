package p508o0o00oOo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO;
import com.yalla.support.common.util.OooOo00;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p142o00OOooO.OooOOOO;
import p188o00o00o0.OooO0OO;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o00O0000<Model> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Context f41878OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f41879OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final OooO0OO<Model> f41880OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public PopupWindow f41881OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f41882OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public float f41883OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f41884OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public Function1<? super Model, Unit> f41885OooO0oo;

    public o00O0000(@NotNull Context context, @NotNull OooO0OO adapter) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.f41878OooO00o = context;
        this.f41879OooO0O0 = R.drawable.bg_line_1h_gray_tr90;
        this.f41880OooO0OO = adapter;
        this.f41883OooO0o0 = 45.2f;
        this.f41882OooO0o = 5;
    }

    public final void OooO00o(@NotNull View location) {
        Intrinsics.checkNotNullParameter(location, "location");
        int right = location.getRight() - location.getLeft();
        int itemCount = this.f41880OooO0OO.getItemCount();
        int itemCount2 = this.f41880OooO0OO.getItemCount();
        int i = this.f41882OooO0o;
        if (itemCount2 > i) {
            itemCount = i;
        }
        int iOooO00o = OooOo00.OooO00o(this.f41883OooO0o0) * itemCount;
        if (this.f41881OooO0Oo == null) {
            View viewInflate = LayoutInflater.from(this.f41878OooO00o).inflate(R.layout.spinner_item_select, (ViewGroup) null);
            View viewFindViewById = viewInflate.findViewById(R.id.spinner_item_list);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "rootView.findViewById(R.id.spinner_item_list)");
            RecyclerView recyclerView = (RecyclerView) viewFindViewById;
            recyclerView.setBackgroundResource(this.f41879OooO0O0);
            recyclerView.setLayoutManager(new LinearLayoutManager(this.f41878OooO00o));
            recyclerView.setAdapter(this.f41880OooO0OO);
            this.f41880OooO0OO.setOnItemClickListener(new OooOOOO(this, 3));
            this.f41880OooO0OO.hindEmptyView(true);
            PopupWindow popupWindow = new PopupWindow(viewInflate, right, iOooO00o, true);
            this.f41881OooO0Oo = popupWindow;
            popupWindow.setBackgroundDrawable(OooOOO.OooO0O0(R.color.color_transparent));
        }
        PopupWindow popupWindow2 = this.f41881OooO0Oo;
        if (popupWindow2 != null) {
            popupWindow2.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: o0o00oOo.o00
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    o00O0000 this$0 = this.f41813Oooo0o;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    Function0<Unit> function0 = this$0.f41884OooO0oO;
                    if (function0 != null) {
                        function0.invoke();
                    }
                }
            });
        }
        PopupWindow popupWindow3 = this.f41881OooO0Oo;
        if (popupWindow3 != null) {
            popupWindow3.showAsDropDown(location, 0, 0, 80);
        }
    }
}
