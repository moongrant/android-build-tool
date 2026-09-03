package p205o00o0o0o;

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
import com.code.android.util.o000O;
import com.code.android.util.o000O0;
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
import p202o00o0o.o00O0O;
import p202o00o0o.o0OoOo0;
import p206o00o0oO.o0;
import p209o00o0oOo.o0O00OO;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nBottomListDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomListDialog.kt\ncom/code/android/yldialog/BottomListDialog\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,266:1\n23#2:267\n1855#3,2:268\n*S KotlinDebug\n*F\n+ 1 BottomListDialog.kt\ncom/code/android/yldialog/BottomListDialog\n*L\n29#1:267\n185#1:268,2\n*E\n"})
public class o000O0o extends o0000OO0<o000O0o> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final OooO0O0 f39373OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public final Function0<Unit> f39374OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final ArrayList f39375OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f39376OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public Integer f39377OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final boolean f39378OooOO0o;

    public static final class OooO00o extends Lambda implements Function1<View, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            o000O0o o000o0o2 = o000O0o.this;
            o000o0o2.f38488OooO0O0.cancel();
            Function0<Unit> function0 = o000o0o2.f39374OooO0oO;
            if (function0 != null) {
                function0.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    public final class OooO0O0 extends BaseQuickAdapter<o0OoOo0, BaseViewHolder> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ o000O0o f39380OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(@NotNull o000O0o o000o0o2, ArrayList list) {
            super(o000O0.yl_dialog_bottom_list_item, list);
            Intrinsics.checkNotNullParameter(list, "list");
            this.f39380OooOo = o000o0o2;
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void OooO0oO(BaseViewHolder helper, o0OoOo0 o0oooo1) {
            o0OoOo0 item = o0oooo1;
            Intrinsics.checkNotNullParameter(helper, "helper");
            Intrinsics.checkNotNullParameter(item, "item");
            TextView textView = (TextView) helper.getView(o000O00O.tvText);
            ImageView imageView = (ImageView) helper.getView(o000O00O.ivIcon);
            View view = helper.getView(o000O00O.vRed);
            textView.setText(item.getText());
            o000O0o o000o0o2 = this.f39380OooOo;
            if (o000o0o2.f39376OooOO0 == helper.getAbsoluteAdapterPosition()) {
                Intrinsics.checkNotNull(imageView);
                o000O.OooOOO0(imageView, true);
                Integer num = o000o0o2.f39377OooOO0O;
                if (num != null) {
                    textView.setTextColor(num.intValue());
                }
            } else {
                Intrinsics.checkNotNull(imageView);
                o000O.OooOOO0(imageView, false);
                textView.setTextColor(o000o0o2.f38487OooO00o.getResources().getColor(o000Oo0.color_333333));
            }
            Intrinsics.checkNotNull(view);
            o000O.OooOOO0(view, false);
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<ViewGroup> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewGroup invoke() {
            return o000O0o.this.f38489OooO0OO;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0o(@NotNull Context context, @Nullable Function0<Unit> function0) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f39374OooO0oO = function0;
        o000O0 o000o0 = new o000O0(Reflection.getOrCreateKotlinClass(o0.class), context, new OooO0OO());
        ArrayList arrayList = new ArrayList();
        this.f39375OooO0oo = arrayList;
        OooO0O0 oooO0O0 = new OooO0O0(this, arrayList);
        this.f39373OooO = oooO0O0;
        this.f39376OooOO0 = -1;
        this.f39378OooOO0o = true;
        OooOO0O(WindowAnim.BottomWithAlpha);
        LinearLayout linearLayout = ((o0) o000o0.getValue()).f39382OooO00o;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "getRoot(...)");
        float f = 16;
        o000O.OooO0oO(linearLayout, o0000O0.OooO00o(f), o0000O0.OooO00o(f), 0, 0);
        TextView tvCancel = ((o0) o000o0.getValue()).f39384OooO0OO;
        Intrinsics.checkNotNullExpressionValue(tvCancel, "tvCancel");
        o000O.OooO(tvCancel, new OooO00o());
        ((o0) o000o0.getValue()).f39383OooO0O0.setLayoutManager(new LinearLayoutManager(context));
        ((o0) o000o0.getValue()).f39383OooO0O0.setAdapter(oooO0O0);
        ((o0) o000o0.getValue()).f39383OooO0O0.addItemDecoration(new o0O00OO(Color.parseColor("#E2E2E2")));
        OooO0oo();
    }

    @NotNull
    public final void OooOOO(@NotNull List list) {
        Intrinsics.checkNotNullParameter(list, "list");
        ArrayList arrayList = this.f39375OooO0oo;
        arrayList.clear();
        arrayList.addAll(list);
        this.f39373OooO.notifyDataSetChanged();
    }

    @NotNull
    public final void OooOOO0(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        o00O0O item = new o00O0O(text);
        Intrinsics.checkNotNullParameter(item, "item");
        ArrayList arrayList = this.f39375OooO0oo;
        arrayList.add(item);
        this.f39373OooO.notifyItemInserted(arrayList.size() - 1);
    }

    @NotNull
    public final void OooOOOO(@NotNull List stringList) {
        Intrinsics.checkNotNullParameter(stringList, "stringList");
        ArrayList arrayList = this.f39375OooO0oo;
        arrayList.clear();
        Iterator it = stringList.iterator();
        while (it.hasNext()) {
            arrayList.add(new o00O0O((String) it.next()));
        }
        this.f39373OooO.notifyDataSetChanged();
    }

    @NotNull
    public final void OooOOOo(@NotNull final Function1 onItemClick) {
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        this.f39373OooO.f13176OooO0o = new BaseQuickAdapter.OooO0o() { // from class: o00o0o0o.o000
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
            public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
                o000O0o this$0 = this.f39359OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Function1 onItemClick2 = onItemClick;
                Intrinsics.checkNotNullParameter(onItemClick2, "$onItemClick");
                if (this$0.f39378OooOO0o) {
                    this$0.OooO0OO();
                }
                onItemClick2.invoke(Integer.valueOf(i));
            }
        };
    }

    @NotNull
    public final void OooOOo0(@NotNull final Function2 onItemClick) {
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        this.f39373OooO.f13176OooO0o = new BaseQuickAdapter.OooO0o() { // from class: o00o0o0o.o000O000
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
            public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
                o000O0o this$0 = this.f39371OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Function2 onItemClick2 = onItemClick;
                Intrinsics.checkNotNullParameter(onItemClick2, "$onItemClick");
                if (this$0.f39378OooOO0o) {
                    this$0.OooO0OO();
                }
                Integer numValueOf = Integer.valueOf(i);
                Object obj = this$0.f39375OooO0oo.get(i);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of com.code.android.yldialog.BottomListDialog.setOnItemClickListener$lambda$1");
                onItemClick2.invoke(numValueOf, (o0OoOo0) obj);
            }
        };
    }
}
