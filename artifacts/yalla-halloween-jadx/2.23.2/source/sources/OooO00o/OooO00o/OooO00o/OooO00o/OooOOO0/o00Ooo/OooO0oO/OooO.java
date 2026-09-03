package OooO00o.OooO00o.OooO00o.OooO00o.OooOOO0.o00Ooo.OooO0oO;

import OooO00o.OooO00o.OooO00o.OooO00o.OooOOO0.o00Ooo.OooO0oO.OooO;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.widget.TextView;
import com.yallatech.support.platform.base.bean.Action;
import com.yallatech.support.platform.base.bean.BottomSheetBean;
import com.yallatech.support.platform.base.bean.ToastBean;
import com.yallatech.support.platform.base.web.BaseWebView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p004OooO0oO.Oooo000;
import p603o0oo0O.OooOOOO;
import p603o0oo0O.OooOo;
import p603o0oo0O.OooOo00;
import p608o0oo0OO0.o000O0o;
import p608o0oo0OO0.o000Oo0;
import p609o0oo0OOO.j5;
import p610o0oo0OOo.n5;

/* JADX INFO: loaded from: classes.dex */
public final class OooO extends Oooo000 {

    public static final class OooO00o extends Lambda implements Function2<Integer, o000Oo0, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BottomSheetBean f56OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ OooO f57OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(OooO oooO, BottomSheetBean bottomSheetBean) {
            super(2);
            this.f56OooO0Oo = bottomSheetBean;
            this.f57OooO0o0 = oooO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Integer num, o000Oo0 o000oo1) {
            int iIntValue = num.intValue();
            o000Oo0 i = o000oo1;
            Intrinsics.checkNotNullParameter(i, "i");
            this.f57OooO0o0.OooO0OO(null, this.f56OooO0Oo.getCustomActions().get(iIntValue).getActionID());
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<CharSequence> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ ToastBean f58OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(ToastBean toastBean) {
            super(0);
            this.f58OooO0Oo = toastBean;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CharSequence invoke() {
            return this.f58OooO0Oo.getContent();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO(@NotNull BaseWebView webView) {
        super(webView);
        Intrinsics.checkNotNullParameter(webView, "webView");
    }

    @Override // p004OooO0oO.o00Oo0
    @NotNull
    public final String OooO00o() {
        return "YLSystemUIBridge";
    }

    @JavascriptInterface
    public final boolean bottomSheet(@NotNull String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        final BottomSheetBean bottomSheetBean = (BottomSheetBean) Oooo000.OooO0O0(BottomSheetBean.class, data, "");
        if (bottomSheetBean == null) {
            return false;
        }
        List<Action> customActions = bottomSheetBean.getCustomActions();
        ArrayList arrayList = new ArrayList(CollectionsKt.OooO0oo(customActions));
        for (Action action : customActions) {
            arrayList.add(new o000Oo0(action.getTitle(), action));
        }
        Context context = this.f153OooO00o.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "webView.context");
        Dialog dialogOooO00o = o000O0o.OooO00o(context, arrayList, new OooO00o(this, bottomSheetBean));
        dialogOooO00o.setCanceledOnTouchOutside(true);
        dialogOooO00o.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: OooO0oo.o00Ooo
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                OooO this$0 = this.f157OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                BottomSheetBean this_run = bottomSheetBean;
                Intrinsics.checkNotNullParameter(this_run, "$this_run");
                this$0.OooO0OO(null, this_run.getCancelAction().getActionID());
            }
        });
        return true;
    }

    @JavascriptInterface
    public final boolean dialog(@NotNull String data) {
        Pair pair;
        Pair pair2;
        Intrinsics.checkNotNullParameter(data, "data");
        com.yallatech.support.platform.base.bean.Dialog dialog = (com.yallatech.support.platform.base.bean.Dialog) Oooo000.OooO0O0(com.yallatech.support.platform.base.bean.Dialog.class, data, "");
        if (dialog == null) {
            return false;
        }
        int size = dialog.getActions().size();
        WebView webView = this.f153OooO00o;
        if (size > 0 || dialog.getActions().size() > 1) {
            Action action = dialog.getActions().get(0);
            pair = new Pair(action.getTitle(), new OooOO0(this, action));
        } else {
            pair = new Pair(webView.getContext().getString(n5.base_platform_ok), OooOO0O.f61OooO0Oo);
        }
        String positiveText = (String) pair.component1();
        final Function0 function0 = (Function0) pair.component2();
        if (dialog.getActions().size() > 1) {
            Action action2 = dialog.getActions().get(1);
            pair2 = new Pair(action2.getTitle(), new OooOOO0(this, action2));
        } else {
            pair2 = new Pair("", null);
        }
        String negativeText = (String) pair2.component1();
        final Function0 function1 = (Function0) pair2.component2();
        Context context = webView.getContext();
        String title = dialog.getTitle();
        String title2 = title != null ? title : "";
        String content = dialog.getMessage();
        boolean touchOutsideCancelable = dialog.getTouchOutsideCancelable();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(title2, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(negativeText, "negativeText");
        Intrinsics.checkNotNullParameter(positiveText, "positiveText");
        final Dialog dialog2 = new Dialog(context, OooOo.BaseCore_MD_Light);
        View viewInflate = dialog2.getLayoutInflater().inflate(OooOo00.base_core_layout_dlg_remind, (ViewGroup) null, false);
        TextView textView = (TextView) viewInflate.findViewById(OooOOOO.tvDlgTitle);
        TextView textView2 = (TextView) viewInflate.findViewById(OooOOOO.tvDlgContent);
        TextView textView3 = (TextView) viewInflate.findViewById(OooOOOO.btnPositive);
        TextView textView4 = (TextView) viewInflate.findViewById(OooOOOO.btnNegative);
        if (StringsKt.isBlank(title2)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(title2);
        }
        dialog2.setCancelable(true);
        dialog2.setCanceledOnTouchOutside(touchOutsideCancelable);
        textView2.setText(content);
        textView3.setText(positiveText);
        textView3.setOnClickListener(new View.OnClickListener() { // from class: o0oo0OO0.o000OO
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Dialog this_apply = dialog2;
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                this_apply.dismiss();
                Function0 function2 = function0;
                if (function2 == null) {
                    return;
                }
                function2.invoke();
            }
        });
        if (StringsKt.isBlank(negativeText)) {
            textView4.setVisibility(8);
        } else {
            textView4.setVisibility(0);
            textView4.setText(negativeText);
            textView4.setOnClickListener(new View.OnClickListener() { // from class: o0oo0OO0.o0000O
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Dialog this_apply = dialog2;
                    Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                    this_apply.dismiss();
                    Function0 function2 = function1;
                    if (function2 == null) {
                        return;
                    }
                    function2.invoke();
                }
            });
        }
        dialog2.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: o0oo0OO0.o0000OO0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                Dialog this_apply = dialog2;
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                this_apply.dismiss();
                Function0 function2 = function1;
                if (function2 == null) {
                    return;
                }
                function2.invoke();
            }
        });
        dialog2.setContentView(viewInflate);
        dialog2.show();
        return true;
    }

    @JavascriptInterface
    public final boolean toast(@NotNull String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        ToastBean toastBean = (ToastBean) Oooo000.OooO0O0(ToastBean.class, data, "");
        if (toastBean == null) {
            return false;
        }
        Context context = this.f153OooO00o.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "webView.context");
        OooO0O0 value = new OooO0O0(toastBean);
        Intrinsics.checkNotNullParameter(toastBean, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        j5.OooO00o(context, value);
        return true;
    }
}
