package com.yalla.yalla.ui.adapter;

import android.content.Context;
import android.text.InputFilter;
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
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nSendMomentPollViewAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SendMomentPollViewAdapter.kt\ncom/yalla/yalla/ui/adapter/SendMomentPollViewAdapter\n+ 2 TextViewExt.kt\ncom/yalla/yalla/ext/TextViewExtKt\n*L\n1#1,67:1\n160#2,2:68\n*S KotlinDebug\n*F\n+ 1 SendMomentPollViewAdapter.kt\ncom/yalla/yalla/ui/adapter/SendMomentPollViewAdapter\n*L\n33#1:68,2\n*E\n"})
public final class o000O0O0 extends p564o0oOo0OO.o000O<MomentSendPollModel.Option> {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @Nullable
    public Function1<? super Integer, Unit> f27531OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @Nullable
    public Function2<? super Integer, ? super String, Unit> f27532OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f27533OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    @Nullable
    public Function1<? super Integer, Unit> f27534OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public boolean f27535Oooo000;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0O0(@NotNull Context context, int i) {
        super(context, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f27533OooOooO = new LinkedHashMap();
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        Function1<? super Integer, Unit> function1;
        ViewHolder helper = (ViewHolder) baseViewHolder;
        MomentSendPollModel.Option item = (MomentSendPollModel.Option) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        EditText tvContent = (EditText) helper.getView(oO00O0oO.content);
        ImageView ivDelete = (ImageView) helper.getView(oO00O0oO.delete);
        LinkedHashMap linkedHashMap = this.f27533OooOooO;
        Integer numValueOf = Integer.valueOf(helper.getLayoutPosition());
        Intrinsics.checkNotNullExpressionValue(tvContent, "tvContent");
        linkedHashMap.put(numValueOf, tvContent);
        tvContent.setText(item.getText());
        tvContent.setFilters(new InputFilter[]{new p417o0OoO0.o000OOo(), new InputFilter.LengthFilter(60)});
        p417o0OoO0.o000Oo0 o000oo1 = new p417o0OoO0.o000Oo0();
        o000O0Oo listener = new o000O0Oo(this, helper);
        Intrinsics.checkNotNullParameter(listener, "listener");
        o000oo1.f45518OooO0o0 = listener;
        o000OO0O listener2 = new o000OO0O(tvContent);
        Intrinsics.checkNotNullParameter(listener2, "listener");
        o000oo1.f45517OooO0Oo = listener2;
        tvContent.addTextChangedListener(o000oo1);
        tvContent.setHint(com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(oO00OOo0.send_moment_poll_item_option_XXX), String.valueOf(helper.getLayoutPosition() + 1)));
        ivDelete.setOnClickListener(new p400o0Oo0OO.OooO0OO(this, helper, 1));
        if (this.f10111OooOOoo.size() > 2) {
            Intrinsics.checkNotNullExpressionValue(ivDelete, "ivDelete");
            com.code.android.util.o000OO00.OooOOOO(ivDelete);
        } else {
            Intrinsics.checkNotNullExpressionValue(ivDelete, "ivDelete");
            com.code.android.util.o000OO00.OooO0O0(ivDelete);
        }
        if (helper.getLayoutPosition() == this.f10111OooOOoo.size() - 1 && this.f27535Oooo000 && (function1 = this.f27534OooOooo) != null) {
            function1.invoke(Integer.valueOf(helper.getLayoutPosition()));
        }
    }
}
