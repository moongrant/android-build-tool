package p611o0oo0o;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.Oooo000;
import androidx.recyclerview.widget.RecyclerView;
import com.yallatech.support.basecore.dialog.SheetAdapter;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p603o0oo0O0o.o000O0;
import p603o0oo0O0o.o000O00;
import p603o0oo0O0o.o000O00O;
import p603o0oo0O0o.o000O0Oo;

/* JADX INFO: loaded from: classes5.dex */
public final class o000oOoO {
    @NotNull
    public static Dialog OooO00o(@NotNull Context context, @NotNull ArrayList data, @Nullable Function2 function2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Dialog dialog = new Dialog(context, o000O0Oo.BaseCore_MD_Light);
        View viewInflate = dialog.getLayoutInflater().inflate(o000O0.base_core_layout_dlg_bottom_sheet, (ViewGroup) null, false);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(o000O00O.rvItems);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.setOrientation(1);
        recyclerView.setLayoutManager(linearLayoutManager);
        Oooo000 oooo000 = new Oooo000(context);
        oooo000.f7622OooO00o = new ColorDrawable(context.getResources().getColor(o000O00.base_core_grey_DEE0E3));
        recyclerView.addItemDecoration(oooo000);
        recyclerView.setAdapter(new SheetAdapter(data, new Oooo0(dialog, function2)));
        dialog.setContentView(viewInflate);
        dialog.show();
        return dialog;
    }

    public static Dialog OooO0O0(FragmentActivity context, final Function0 function0) {
        Intrinsics.checkNotNullParameter(context, "context");
        Dialog dialog = new Dialog(context, o000O0Oo.BaseCore_MD_Light);
        dialog.setContentView(o000O0.base_core_layout_loading);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(true);
        dialog.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: o0oo0o.Oooo000
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
