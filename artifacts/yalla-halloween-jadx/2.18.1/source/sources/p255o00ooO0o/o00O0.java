package p255o00ooO0o;

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
import com.code.android.easydialog.WindowAnim;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p251o00ooO.o000O00;
import p251o00ooO.o000Oo0;
import p254o00ooO0O.o000OO00;
import p254o00ooO0O.o00O000o;
import p254o00ooO0O.oOO00O;
import p256o00ooOO.o0oOO;
import p260o00ooOo0.o0O0OOOo;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public class o00O0 extends o00O00OO<o00O0> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final OooO0O0 f34358OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final o00O000o f34359OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final List<o000Oo0> f34360OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f34361OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public Integer f34362OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f34363OooOO0o;

    public static final class OooO00o extends Lambda implements Function1<View, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            o00O0.this.OooO0OO();
            return Unit.INSTANCE;
        }
    }

    public final class OooO0O0 extends BaseQuickAdapter<o000Oo0, com.chad.library.adapter.base.OooO00o> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ o00O0 f34365OooO00o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(@NotNull o00O0 o00o1, List<? extends o000Oo0> list) {
            super(o00O0OO0.yl_dialog_bottom_list_item, list);
            Intrinsics.checkNotNullParameter(list, "list");
            this.f34365OooO00o = o00o1;
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void convert(com.chad.library.adapter.base.OooO00o helper, o000Oo0 o000oo1) {
            o000Oo0 item = o000oo1;
            Intrinsics.checkNotNullParameter(helper, "helper");
            Intrinsics.checkNotNullParameter(item, "item");
            TextView textView = (TextView) helper.OooO0Oo(o00O0O0O.tvText);
            ImageView ivIcon = (ImageView) helper.OooO0Oo(o00O0O0O.ivIcon);
            View vRed = helper.OooO0Oo(o00O0O0O.vRed);
            textView.setText(item.getText());
            if (this.f34365OooO00o.f34361OooOO0 == helper.getAbsoluteAdapterPosition()) {
                Intrinsics.checkNotNullExpressionValue(ivIcon, "ivIcon");
                oOO00O.OooO0oo(ivIcon, true);
                Objects.requireNonNull(this.f34365OooO00o);
                Integer num = this.f34365OooO00o.f34362OooOO0O;
                if (num != null) {
                    textView.setTextColor(num.intValue());
                }
            } else {
                Intrinsics.checkNotNullExpressionValue(ivIcon, "ivIcon");
                oOO00O.OooO0oo(ivIcon, false);
                textView.setTextColor(this.f34365OooO00o.f34199OooO00o.getResources().getColor(o00O0O00.color_333333));
            }
            Intrinsics.checkNotNullExpressionValue(vRed, "vRed");
            Objects.requireNonNull(this.f34365OooO00o);
            oOO00O.OooO0oo(vRed, false);
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<ViewGroup> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewGroup invoke() {
            return o00O0.this.f34201OooO0OO;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f34359OooO0oO = new o00O000o(Reflection.getOrCreateKotlinClass(o0oOO.class), context, new OooO0OO());
        ArrayList arrayList = new ArrayList();
        this.f34360OooO0oo = arrayList;
        OooO0O0 oooO0O0 = new OooO0O0(this, arrayList);
        this.f34358OooO = oooO0O0;
        this.f34361OooOO0 = -1;
        this.f34363OooOO0o = true;
        OooOO0o(WindowAnim.BottomWithAlpha);
        LinearLayout linearLayout = OooOOOO().f34403OooO00o;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "dialogBinding.root");
        float f = 16;
        oOO00O.OooO0o(linearLayout, o000OO00.OooO00o(f), o000OO00.OooO00o(f), 0, 0);
        TextView textView = OooOOOO().f34405OooO0OO;
        Intrinsics.checkNotNullExpressionValue(textView, "dialogBinding.tvCancel");
        oOO00O.OooO0oO(textView, new OooO00o());
        OooOOOO().f34404OooO0O0.setLayoutManager(new LinearLayoutManager(context));
        OooOOOO().f34404OooO0O0.setAdapter(oooO0O0);
        OooOOOO().f34404OooO0O0.addItemDecoration(new o0O0OOOo(Color.parseColor("#E2E2E2")));
        OooO();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @NotNull
    public final o00O0 OooOOO(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        o000O00 item = new o000O00(text);
        Intrinsics.checkNotNullParameter(item, "item");
        this.f34360OooO0oo.add(item);
        this.f34358OooO.notifyItemInserted(this.f34360OooO0oo.size() - 1);
        return this;
    }

    @NotNull
    public final o0oOO OooOOOO() {
        return (o0oOO) this.f34359OooO0oO.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<o00ooO.o000Oo0>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<o00ooO.o000Oo0>] */
    @NotNull
    public final o00O0 OooOOOo(@NotNull o000Oo0 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f34360OooO0oo.clear();
        this.f34360OooO0oo.add(item);
        this.f34358OooO.notifyDataSetChanged();
        return this;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @NotNull
    public final o00O0 OooOOo(@NotNull List<String> stringList) {
        Intrinsics.checkNotNullParameter(stringList, "stringList");
        this.f34360OooO0oo.clear();
        Iterator<T> it = stringList.iterator();
        while (it.hasNext()) {
            this.f34360OooO0oo.add(new o000O00((String) it.next()));
        }
        this.f34358OooO.notifyDataSetChanged();
        return this;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @NotNull
    public final o00O0 OooOOo0(@NotNull List<? extends o000Oo0> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f34360OooO0oo.clear();
        this.f34360OooO0oo.addAll(list);
        this.f34358OooO.notifyDataSetChanged();
        return this;
    }

    @NotNull
    public final <T extends o000Oo0> o00O0 OooOOoo(@NotNull Function2<? super Integer, ? super T, ? extends Object> onItemClick) {
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        this.f34358OooO.setOnItemClickListener(new oo00o(this, onItemClick));
        return this;
    }
}
