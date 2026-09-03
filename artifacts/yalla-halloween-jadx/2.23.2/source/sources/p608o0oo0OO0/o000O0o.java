package p608o0oo0OO0;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.Oooo0;
import androidx.recyclerview.widget.RecyclerView;
import com.yallatech.support.basecore.dialog.SheetAdapter;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p603o0oo0O.OooOOO;
import p603o0oo0O.OooOOOO;
import p603o0oo0O.OooOo;
import p603o0oo0O.OooOo00;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O0o {
    @NotNull
    public static Dialog OooO00o(@NotNull Context context, @NotNull ArrayList data, @Nullable Function2 function2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Dialog dialog = new Dialog(context, OooOo.BaseCore_MD_Light);
        View viewInflate = dialog.getLayoutInflater().inflate(OooOo00.base_core_layout_dlg_bottom_sheet, (ViewGroup) null, false);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(OooOOOO.rvItems);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.setOrientation(1);
        recyclerView.setLayoutManager(linearLayoutManager);
        Oooo0 oooo0 = new Oooo0(context);
        oooo0.f10658OooO00o = new ColorDrawable(context.getResources().getColor(OooOOO.base_core_grey_DEE0E3));
        recyclerView.addItemDecoration(oooo0);
        recyclerView.setAdapter(new SheetAdapter(data, new o000O000(dialog, function2)));
        dialog.setContentView(viewInflate);
        dialog.show();
        return dialog;
    }

    public static Dialog OooO0O0(FragmentActivity context, final Function0 function0) {
        Intrinsics.checkNotNullParameter(context, "context");
        Dialog dialog = new Dialog(context, OooOo.BaseCore_MD_Light);
        dialog.setContentView(OooOo00.base_core_layout_loading);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(true);
        dialog.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: o0oo0OO0.o000
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                Function0 function1 = function0;
                if (function1 == null) {
                    return;
                }
                function1.invoke();
            }
        });
        dialog.show();
        return dialog;
    }
}
