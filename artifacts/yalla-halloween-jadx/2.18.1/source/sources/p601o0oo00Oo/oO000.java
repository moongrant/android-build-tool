package p601o0oo00Oo;

import android.content.Context;
import android.text.InputFilter;
import android.widget.EditText;
import android.widget.ImageView;
import com.chad.library.adapter.base.OooO00o;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOo;
import com.yalla.yalla.model.MomentSendPollModel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p188o00o00o0.OooO0OO;
import p188o00o00o0.OooO0o;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.oOO00O;
import p522o0o0O0o.o00O0000;
import p522o0o0O0o.o00O0OO;

/* JADX INFO: loaded from: classes3.dex */
public final class oO000 extends OooO0OO<MomentSendPollModel.Option> {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final /* synthetic */ int f48238OooO0o = 0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public Function2<? super Integer, ? super String, Unit> f48239OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public Function1<? super Integer, Unit> f48240OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Map<Integer, EditText> f48241OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public Function1<? super Integer, Unit> f48242OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f48243OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO000(@NotNull Context context) {
        super(context, R.layout.item_send_moment_poll);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f48241OooO0OO = new LinkedHashMap();
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(OooO00o oooO00o, Object obj) {
        Function1<? super Integer, Unit> function1;
        OooO0o helper = (OooO0o) oooO00o;
        MomentSendPollModel.Option item = (MomentSendPollModel.Option) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        EditText tvContent = (EditText) helper.OooO0Oo(R.id.content);
        ImageView ivDelete = (ImageView) helper.OooO0Oo(R.id.delete);
        Map<Integer, EditText> map = this.f48241OooO0OO;
        Integer numValueOf = Integer.valueOf(helper.getLayoutPosition());
        Intrinsics.checkNotNullExpressionValue(tvContent, "tvContent");
        map.put(numValueOf, tvContent);
        tvContent.setText(item.getText());
        tvContent.setFilters(new InputFilter[]{new o00O0000(), new InputFilter.LengthFilter(60)});
        o00O0OO o00o0oo2 = new o00O0OO();
        oO0000Oo listener = new oO0000Oo(this, helper);
        Intrinsics.checkNotNullParameter(listener, "listener");
        o00o0oo2.f43011Oooo0oO = listener;
        oO0000o0 listener2 = new oO0000o0(tvContent);
        Intrinsics.checkNotNullParameter(listener2, "listener");
        o00o0oo2.f43010Oooo0o = listener2;
        tvContent.addTextChangedListener(o00o0oo2);
        tvContent.setHint(OooOo.OooO00o(o000O0O0.OooO0OO(R.string.send_moment_poll_item_option_XXX), String.valueOf(helper.getLayoutPosition() + 1)));
        ivDelete.setOnClickListener(new o00O00OO(this, helper, 1));
        if (getData().size() > 2) {
            Intrinsics.checkNotNullExpressionValue(ivDelete, "ivDelete");
            oOO00O.OooO(ivDelete);
        } else {
            Intrinsics.checkNotNullExpressionValue(ivDelete, "ivDelete");
            oOO00O.OooO00o(ivDelete);
        }
        if (helper.getLayoutPosition() == getData().size() - 1 && this.f48243OooO0o0 && (function1 = this.f48242OooO0Oo) != null) {
            function1.invoke(Integer.valueOf(helper.getLayoutPosition()));
        }
    }
}
