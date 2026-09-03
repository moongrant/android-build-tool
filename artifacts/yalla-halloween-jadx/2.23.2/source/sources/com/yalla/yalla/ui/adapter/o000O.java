package com.yalla.yalla.ui.adapter;

import android.content.Context;
import android.text.InputFilter;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yalla.yalla.model.moment.MomentSendPollModel;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nSendMomentPollViewAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SendMomentPollViewAdapter.kt\ncom/yalla/yalla/ui/adapter/SendMomentPollViewAdapter\n+ 2 TextViewExt.kt\ncom/yalla/yalla/ext/TextViewExtKt\n*L\n1#1,67:1\n160#2,2:68\n*S KotlinDebug\n*F\n+ 1 SendMomentPollViewAdapter.kt\ncom/yalla/yalla/ui/adapter/SendMomentPollViewAdapter\n*L\n33#1:68,2\n*E\n"})
public final class o000O extends p571o0oOoO0.o0000oo<MomentSendPollModel.Option> {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @Nullable
    public Function1<? super Integer, Unit> f27031OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @Nullable
    public Function2<? super Integer, ? super String, Unit> f27032OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f27033OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    @Nullable
    public Function1<? super Integer, Unit> f27034OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public boolean f27035Oooo000;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O(@NotNull Context context, int i) {
        super(context, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f27033OooOooO = new LinkedHashMap();
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        Function1<? super Integer, Unit> function1;
        final ViewHolder helper = (ViewHolder) baseViewHolder;
        MomentSendPollModel.Option item = (MomentSendPollModel.Option) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        EditText editText = (EditText) helper.getView(p562o0oOo000.o0OO00O.content);
        ImageView imageView = (ImageView) helper.getView(p562o0oOo000.o0OO00O.delete);
        LinkedHashMap linkedHashMap = this.f27033OooOooO;
        Integer numValueOf = Integer.valueOf(helper.getLayoutPosition());
        Intrinsics.checkNotNull(editText);
        linkedHashMap.put(numValueOf, editText);
        editText.setText(item.getText());
        editText.setFilters(new InputFilter[]{new p423o0OoO0OO.o000OO0O(), new InputFilter.LengthFilter(60)});
        p423o0OoO0OO.o00O0OO0 o00o0oo1 = new p423o0OoO0OO.o00O0OO0();
        o000OO0O listener = new o000OO0O(this, helper);
        Intrinsics.checkNotNullParameter(listener, "listener");
        o00o0oo1.f46714OooO0o0 = listener;
        o000O0O0 listener2 = new o000O0O0(editText);
        Intrinsics.checkNotNullParameter(listener2, "listener");
        o00o0oo1.f46713OooO0Oo = listener2;
        editText.addTextChangedListener(o00o0oo1);
        editText.setHint(com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.send_moment_poll_item_option_XXX), String.valueOf(helper.getLayoutPosition() + 1)));
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.yalla.yalla.ui.adapter.o000O0Oo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o000O this$0 = this.f27073OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ViewHolder helper2 = helper;
                Intrinsics.checkNotNullParameter(helper2, "$helper");
                this$0.f27035Oooo000 = false;
                this$0.f27033OooOooO.remove(Integer.valueOf(helper2.getLayoutPosition()));
                Function1<? super Integer, Unit> function2 = this$0.f27031OooOoo;
                if (function2 != null) {
                    function2.invoke(Integer.valueOf(helper2.getLayoutPosition()));
                }
                this$0.notifyDataSetChanged();
            }
        });
        if (this.f13189OooOOoo.size() > 2) {
            Intrinsics.checkNotNull(imageView);
            com.code.android.util.o000O.OooOOOO(imageView);
        } else {
            Intrinsics.checkNotNull(imageView);
            com.code.android.util.o000O.OooO0O0(imageView);
        }
        if (helper.getLayoutPosition() == this.f13189OooOOoo.size() - 1 && this.f27035Oooo000 && (function1 = this.f27034OooOooo) != null) {
            function1.invoke(Integer.valueOf(helper.getLayoutPosition()));
        }
    }
}
