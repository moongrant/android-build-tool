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
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p538o0o0Oo0.o00O0O;
import p538o0o0Oo0.o00Oo0;
import p622o0oo0oO.o000O0;
import p622o0oo0oO.o000O00O;
import p622o0oo0oO.o000O0Oo;
import p624o0oo0oOo.oO0O00oO;
import p624o0oo0oOo.oO0O0O00;
import p625o0oo0oo.o000O;
import p627o0oo0ooO.oO0O0Oo0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO extends OooO0o.OooO00o {

    public static final class OooO00o extends Lambda implements Function2<Integer, oO0O0O00, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ BottomSheetBean f31Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ OooO f32Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(BottomSheetBean bottomSheetBean, OooO oooO) {
            super(2);
            this.f31Oooo0o = bottomSheetBean;
            this.f32Oooo0oO = oooO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Integer num, oO0O0O00 oo0o0o00) {
            int iIntValue = num.intValue();
            oO0O0O00 i = oo0o0o00;
            Intrinsics.checkNotNullParameter(i, "i");
            this.f32Oooo0oO.OooO0OO(this.f31Oooo0o.getCustomActions().get(iIntValue).getActionID(), null);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<CharSequence> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ ToastBean f33Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(ToastBean toastBean) {
            super(0);
            this.f33Oooo0o = toastBean;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CharSequence invoke() {
            return this.f33Oooo0o.getContent();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO(@NotNull WebView webView) {
        super(webView);
        Intrinsics.checkNotNullParameter(webView, "webView");
    }

    @Override // OooO0o.OooOO0
    @NotNull
    public final String OooO00o() {
        return "YLSystemUIBridge";
    }

    @JavascriptInterface
    public final boolean bottomSheet(@NotNull String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        final BottomSheetBean bottomSheetBean = (BottomSheetBean) OooO0O0(data, BottomSheetBean.class, "");
        if (bottomSheetBean == null) {
            return false;
        }
        List<Action> customActions = bottomSheetBean.getCustomActions();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(customActions, 10));
        for (Action action : customActions) {
            arrayList.add(new oO0O0O00(action.getTitle(), action));
        }
        oO0O00oO oo0o00oo = oO0O00oO.f48663OooO00o;
        Context context = this.f128OooO00o.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "webView.context");
        Dialog dialogOooO00o = oo0o00oo.OooO00o(context, arrayList, new OooO00o(bottomSheetBean, this));
        dialogOooO00o.setCanceledOnTouchOutside(true);
        dialogOooO00o.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: OooO0oO.o0OOO0o
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                OooO this$0 = this.f136Oooo0o;
                BottomSheetBean this_run = bottomSheetBean;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(this_run, "$this_run");
                this$0.OooO0OO(this_run.getCancelAction().getActionID(), null);
            }
        });
        return true;
    }

    @JavascriptInterface
    public final boolean dialog(@NotNull String data) {
        Pair pair;
        Pair pair2;
        Intrinsics.checkNotNullParameter(data, "data");
        com.yallatech.support.platform.base.bean.Dialog dialog = (com.yallatech.support.platform.base.bean.Dialog) OooO0O0(data, com.yallatech.support.platform.base.bean.Dialog.class, "");
        if (dialog == null) {
            return false;
        }
        if (dialog.getActions().size() > 0 || dialog.getActions().size() > 1) {
            Action action = dialog.getActions().get(0);
            pair = new Pair(action.getTitle(), new OooOO0(this, action));
        } else {
            pair = new Pair(this.f128OooO00o.getContext().getString(oO0O0Oo0.base_platform_ok), OooOO0O.f36Oooo0o);
        }
        String positiveText = (String) pair.component1();
        Function0 function0 = (Function0) pair.component2();
        if (dialog.getActions().size() > 1) {
            Action action2 = dialog.getActions().get(1);
            pair2 = new Pair(action2.getTitle(), new OooOOO0(this, action2));
        } else {
            pair2 = new Pair("", null);
        }
        String negativeText = (String) pair2.component1();
        final Function0 function1 = (Function0) pair2.component2();
        Context context = this.f128OooO00o.getContext();
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
        final Dialog dialog2 = new Dialog(context, o000O0Oo.BaseCore_MD_Light);
        View viewInflate = dialog2.getLayoutInflater().inflate(o000O0.base_core_layout_dlg_remind, (ViewGroup) null, false);
        TextView textView = (TextView) viewInflate.findViewById(o000O00O.tvDlgTitle);
        TextView textView2 = (TextView) viewInflate.findViewById(o000O00O.tvDlgContent);
        TextView textView3 = (TextView) viewInflate.findViewById(o000O00O.btnPositive);
        TextView textView4 = (TextView) viewInflate.findViewById(o000O00O.btnNegative);
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
        textView3.setOnClickListener(new o00O0O(dialog2, function0, 1));
        if (StringsKt.isBlank(negativeText)) {
            textView4.setVisibility(8);
        } else {
            textView4.setVisibility(0);
            textView4.setText(negativeText);
            textView4.setOnClickListener(new o00Oo0(dialog2, function1, 1));
        }
        dialog2.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: o0oo0oOo.oO0O00O
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                Dialog this_apply = dialog2;
                Function0 function2 = function1;
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                this_apply.dismiss();
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
        ToastBean toastBean = (ToastBean) OooO0O0(data, ToastBean.class, "");
        if (toastBean == null) {
            return false;
        }
        Context context = this.f128OooO00o.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "webView.context");
        OooO0O0 value = new OooO0O0(toastBean);
        Intrinsics.checkNotNullParameter(toastBean, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        o000O.OooO00o(context, value);
        return true;
    }
}
