package p624o0oo0oOo;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.Oooo000;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p622o0oo0oO.o000O0;
import p622o0oo0oO.o000O00;
import p622o0oo0oO.o000O00O;
import p622o0oo0oO.o000O0Oo;

/* JADX INFO: loaded from: classes3.dex */
public final class oO0O00oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final oO0O00oO f48663OooO00o = new oO0O00oO();

    public static final class OooO00o extends Lambda implements Function2<Integer, oO0O0O00, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Dialog f48664Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Function2<Integer, oO0O0O00, Unit> f48665Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(Dialog dialog, Function2<? super Integer, ? super oO0O0O00, Unit> function2) {
            super(2);
            this.f48664Oooo0o = dialog;
            this.f48665Oooo0oO = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Integer num, oO0O0O00 oo0o0o00) {
            int iIntValue = num.intValue();
            oO0O0O00 a = oo0o0o00;
            Intrinsics.checkNotNullParameter(a, "a");
            this.f48664Oooo0o.dismiss();
            Function2<Integer, oO0O0O00, Unit> function2 = this.f48665Oooo0oO;
            if (function2 != null) {
                function2.invoke(Integer.valueOf(iIntValue), a);
            }
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public final Dialog OooO00o(@NotNull Context context, @NotNull List<oO0O0O00> data, @Nullable Function2<? super Integer, ? super oO0O0O00, Unit> function2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Dialog dialog = new Dialog(context, o000O0Oo.BaseCore_MD_Light);
        View viewInflate = dialog.getLayoutInflater().inflate(o000O0.base_core_layout_dlg_bottom_sheet, (ViewGroup) null, false);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(o000O00O.rvItems);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.setOrientation(1);
        recyclerView.setLayoutManager(linearLayoutManager);
        Oooo000 oooo000 = new Oooo000(context);
        oooo000.f9005OooO00o = new ColorDrawable(context.getResources().getColor(o000O00.base_core_grey_DEE0E3));
        recyclerView.addItemDecoration(oooo000);
        recyclerView.setAdapter(new oO0O0(data, new OooO00o(dialog, function2)));
        dialog.setContentView(viewInflate);
        dialog.show();
        return dialog;
    }
}
