package p539o0o0OoOO;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.code.android.util.o0000;
import com.code.android.util.o0000O0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p203o00o0o0o.o00OO000;
import p564o0oOo0OO.o000O;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
public final class b3<Model> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Context f55463OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f55464OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final o000O<Model> f55465OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public PopupWindow f55466OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f55467OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final float f55468OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f55469OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public Function1<? super Model, Unit> f55470OooO0oo;

    public b3(@NotNull Context context, int i, @NotNull o000O<Model> adapter) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.f55463OooO00o = context;
        this.f55464OooO0O0 = i;
        this.f55465OooO0OO = adapter;
        this.f55468OooO0o0 = 45.2f;
        this.f55467OooO0o = 5;
    }

    public final void OooO00o(@NotNull View location) {
        Intrinsics.checkNotNullParameter(location, "location");
        int right = location.getRight() - location.getLeft();
        o000O<Model> o000o = this.f55465OooO0OO;
        int itemCount = o000o.getItemCount();
        int itemCount2 = o000o.getItemCount();
        int i = this.f55467OooO0o;
        if (itemCount2 > i) {
            itemCount = i;
        }
        int iOooO00o = o0000O0.OooO00o(this.f55468OooO0o0) * itemCount;
        if (this.f55466OooO0Oo == null) {
            Context context = this.f55463OooO00o;
            View viewInflate = LayoutInflater.from(context).inflate(oO00OO0O.spinner_item_select, (ViewGroup) null);
            View viewFindViewById = viewInflate.findViewById(oO00O0oO.spinner_item_list);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "rootView.findViewById(R.id.spinner_item_list)");
            RecyclerView recyclerView = (RecyclerView) viewFindViewById;
            recyclerView.setBackgroundResource(this.f55464OooO0O0);
            recyclerView.setLayoutManager(new LinearLayoutManager(context));
            recyclerView.setAdapter(o000o);
            o000o.f10098OooO0o = new o00OO000(this);
            o000o.OooOoOO(true);
            PopupWindow popupWindow = new PopupWindow(viewInflate, right, iOooO00o, true);
            this.f55466OooO0Oo = popupWindow;
            popupWindow.setBackgroundDrawable(o0000.OooO0O0(oO00O0o.color_transparent));
        }
        PopupWindow popupWindow2 = this.f55466OooO0Oo;
        if (popupWindow2 != null) {
            popupWindow2.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: o0o0OoOO.a3
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    b3 this$0 = this.f55430OooO0Oo;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    Function0<Unit> function0 = this$0.f55469OooO0oO;
                    if (function0 != null) {
                        function0.invoke();
                    }
                }
            });
        }
        PopupWindow popupWindow3 = this.f55466OooO0Oo;
        if (popupWindow3 != null) {
            popupWindow3.showAsDropDown(location, 0, 0, 80);
        }
    }
}
