package p157o00OoOO0;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.easydialog.WindowAnim;
import com.code.android.util.o0000O0;
import com.code.android.util.o000O0Oo;
import com.code.android.util.o000OO00;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p156o00OoOO.OooOo;
import p156o00OoOO.OooOo00;
import p159o00OoOOo.o0O0O00;
import p160o00OoOo.Oooo0;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nBottomListDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomListDialog.kt\ncom/code/android/yldialog/BottomListDialog\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,266:1\n23#2:267\n1855#3,2:268\n*S KotlinDebug\n*F\n+ 1 BottomListDialog.kt\ncom/code/android/yldialog/BottomListDialog\n*L\n29#1:267\n185#1:268,2\n*E\n"})
public class o00O0O extends Oooo0<o00O0O> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final OooO0O0 f38231OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public final Function0<Unit> f38232OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final ArrayList f38233OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f38234OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public Integer f38235OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final boolean f38236OooOO0o;

    public static final class OooO00o extends Lambda implements Function1<View, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            o00O0O o00o0o2 = o00O0O.this;
            o00o0o2.f10134OooO0O0.cancel();
            Function0<Unit> function0 = o00o0o2.f38232OooO0oO;
            if (function0 != null) {
                function0.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    public final class OooO0O0 extends BaseQuickAdapter<OooOo00, BaseViewHolder> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ o00O0O f38238OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(@NotNull o00O0O o00o0o2, ArrayList list) {
            super(o00oO0o.yl_dialog_bottom_list_item, list);
            Intrinsics.checkNotNullParameter(list, "list");
            this.f38238OooOo = o00o0o2;
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void OooO0oO(BaseViewHolder helper, OooOo00 oooOo00) {
            OooOo00 item = oooOo00;
            Intrinsics.checkNotNullParameter(helper, "helper");
            Intrinsics.checkNotNullParameter(item, "item");
            TextView textView = (TextView) helper.getView(oo000o.tvText);
            ImageView ivIcon = (ImageView) helper.getView(oo000o.ivIcon);
            View vRed = helper.getView(oo000o.vRed);
            textView.setText(item.getText());
            o00O0O o00o0o2 = this.f38238OooOo;
            if (o00o0o2.f38234OooOO0 == helper.getAbsoluteAdapterPosition()) {
                Intrinsics.checkNotNullExpressionValue(ivIcon, "ivIcon");
                o000OO00.OooOOO0(ivIcon, true);
                Integer num = o00o0o2.f38235OooOO0O;
                if (num != null) {
                    textView.setTextColor(num.intValue());
                }
            } else {
                Intrinsics.checkNotNullExpressionValue(ivIcon, "ivIcon");
                o000OO00.OooOOO0(ivIcon, false);
                textView.setTextColor(o00o0o2.f10133OooO00o.getResources().getColor(o00Oo0.color_333333));
            }
            Intrinsics.checkNotNullExpressionValue(vRed, "vRed");
            o000OO00.OooOOO0(vRed, false);
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<ViewGroup> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewGroup invoke() {
            return o00O0O.this.f10135OooO0OO;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O(@NotNull Context context, @Nullable Function0<Unit> function0) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f38232OooO0oO = function0;
        o000O0Oo o000o0oo2 = new o000O0Oo(Reflection.getOrCreateKotlinClass(o0O0O00.class), context, new OooO0OO());
        ArrayList arrayList = new ArrayList();
        this.f38233OooO0oo = arrayList;
        OooO0O0 oooO0O0 = new OooO0O0(this, arrayList);
        this.f38231OooO = oooO0O0;
        this.f38234OooOO0 = -1;
        this.f38236OooOO0o = true;
        OooOO0O(WindowAnim.BottomWithAlpha);
        LinearLayout linearLayout = ((o0O0O00) o000o0oo2.getValue()).f38479OooO00o;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "dialogBinding.root");
        float f = 16;
        o000OO00.OooO0oO(linearLayout, o0000O0.OooO00o(f), o0000O0.OooO00o(f), 0, 0);
        TextView textView = ((o0O0O00) o000o0oo2.getValue()).f38481OooO0OO;
        Intrinsics.checkNotNullExpressionValue(textView, "dialogBinding.tvCancel");
        o000OO00.OooO(textView, new OooO00o());
        ((o0O0O00) o000o0oo2.getValue()).f38480OooO0O0.setLayoutManager(new LinearLayoutManager(context));
        ((o0O0O00) o000o0oo2.getValue()).f38480OooO0O0.setAdapter(oooO0O0);
        ((o0O0O00) o000o0oo2.getValue()).f38480OooO0O0.addItemDecoration(new Oooo0(Color.parseColor("#E2E2E2")));
        OooO0oo();
    }

    @NotNull
    public final void OooOOO(@NotNull List list) {
        Intrinsics.checkNotNullParameter(list, "list");
        ArrayList arrayList = this.f38233OooO0oo;
        arrayList.clear();
        arrayList.addAll(list);
        this.f38231OooO.notifyDataSetChanged();
    }

    @NotNull
    public final void OooOOO0(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        OooOo item = new OooOo(text);
        Intrinsics.checkNotNullParameter(item, "item");
        ArrayList arrayList = this.f38233OooO0oo;
        arrayList.add(item);
        this.f38231OooO.notifyItemInserted(arrayList.size() - 1);
    }

    @NotNull
    public final void OooOOOO(@NotNull List stringList) {
        Intrinsics.checkNotNullParameter(stringList, "stringList");
        ArrayList arrayList = this.f38233OooO0oo;
        arrayList.clear();
        Iterator it = stringList.iterator();
        while (it.hasNext()) {
            arrayList.add(new OooOo((String) it.next()));
        }
        this.f38231OooO.notifyDataSetChanged();
    }

    @NotNull
    public final void OooOOOo(@NotNull Function1 onItemClick) {
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        this.f38231OooO.f10098OooO0o = new o000oOoO(this, (Serializable) onItemClick);
    }

    @NotNull
    public final void OooOOo0(@NotNull final Function2 onItemClick) {
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        this.f38231OooO.f10098OooO0o = new BaseQuickAdapter.OooO0o() { // from class: o00OoOO0.o0OoOo0
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
            public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
                o00O0O this$0 = this.f38250OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Function2 onItemClick2 = onItemClick;
                Intrinsics.checkNotNullParameter(onItemClick2, "$onItemClick");
                if (this$0.f38236OooOO0o) {
                    this$0.OooO0OO();
                }
                Integer numValueOf = Integer.valueOf(i);
                Object obj = this$0.f38233OooO0oo.get(i);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of com.code.android.yldialog.BottomListDialog.setOnItemClickListener$lambda$1");
                onItemClick2.invoke(numValueOf, (OooOo00) obj);
            }
        };
    }
}
