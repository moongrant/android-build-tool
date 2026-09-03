package o00OO0O0;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.app.base.model.ChatModel;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.yalla.model.GiftPropModel;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.util.netimage.NetImageView;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class o0000OO0 extends OooOO0O {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public final TextView f31448OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public final TextView f31449OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final NetImageView f31450OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @Nullable
    public Function1<? super ChatModel, Unit> f31451OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public final ImageView f31452OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ImageView f31453OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public final ImageView f31454OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @NotNull
    public final ImageView f31455OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @NotNull
    public final int[] f31456OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @Nullable
    public Function1<? super ChatModel, Unit> f31457OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000OO0(@NotNull FragmentActivity activity, @NotNull View view) {
        super(activity, view);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(R.id.tv_gift_blind_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "view.findViewById(R.id.tv_gift_blind_title)");
        this.f31449OooOOo0 = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.tv_gift_receiver);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "view.findViewById(R.id.tv_gift_receiver)");
        this.f31448OooOOo = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.iv_gift_icon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "view.findViewById(R.id.iv_gift_icon)");
        this.f31450OooOOoo = (NetImageView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.iv_hundred);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "view.findViewById(R.id.iv_hundred)");
        this.f31453OooOo00 = (ImageView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.iv_ten);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "view.findViewById(R.id.iv_ten)");
        this.f31452OooOo0 = (ImageView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.iv_one);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "view.findViewById(R.id.iv_one)");
        this.f31454OooOo0O = (ImageView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.iv_room_chat_gift_return);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "view.findViewById(R.id.iv_room_chat_gift_return)");
        this.f31455OooOo0o = (ImageView) viewFindViewById7;
        this.f31456OooOoO = new int[]{R.drawable.ic_gift_num0, R.drawable.ic_gift_num1, R.drawable.ic_gift_num2, R.drawable.ic_gift_num3, R.drawable.ic_gift_num4, R.drawable.ic_gift_num5, R.drawable.ic_gift_num6, R.drawable.ic_gift_num7, R.drawable.ic_gift_num8, R.drawable.ic_gift_num9};
    }

    @Override // o00OO0O0.OooOO0O
    public final boolean OooO00o() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0069  */
    @Override // o00OO0O0.OooOO0O
    public final void OooO0OO(int i, @NotNull final ChatModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        super.OooO0OO(i, model);
        if (model.fromboxid > 0) {
            p254o00ooO0O.oOO00O.OooO(this.f31449OooOOo0);
        } else {
            p254o00ooO0O.oOO00O.OooO00o(this.f31449OooOOo0);
        }
        this.f31448OooOOo.setText(p520o0o0O0O0.o00O0O.f42677OooO00o.OooO0O0(model.to.getUserId(), model.to.getUserName()));
        if (com.yalla.support.common.util.OooO0OO.OooO0O0(model.to) && com.yalla.support.common.util.OooO0OO.OooO0O0(Long.valueOf(model.to.getUserId()))) {
            long userId = model.to.getUserId();
            Long value = p498o0o00Oo0.OooOOO.f41216OooO00o.OooOo().getValue();
            if (value != null && userId == value.longValue()) {
                p254o00ooO0O.oOO00O.OooO(this.f31455OooOo0o);
            } else {
                p254o00ooO0O.oOO00O.OooO00o(this.f31455OooOo0o);
            }
        } else {
            p254o00ooO0O.oOO00O.OooO00o(this.f31455OooOo0o);
        }
        this.f31455OooOo0o.setOnClickListener(new View.OnClickListener() { // from class: o00OO0O0.o0000O0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o0000OO0 this$0 = this.f31443Oooo0o;
                ChatModel model2 = model;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(model2, "$model");
                Objects.requireNonNull(this$0);
                o0000O onLogin = new o0000O(this$0, model2);
                Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                if (Intrinsics.areEqual(p498o0o00Oo0.OooOOO.f41216OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
                    onLogin.invoke();
                    return;
                }
                Activity activityOooO0O0 = p254o00ooO0O.o00000O.f34254OooO00o.OooO0O0();
                if (activityOooO0O0 != null) {
                    LoginActivity.OooO00o oooO00o = LoginActivity.f21752OooooO0;
                    o0OOO0o.OooO0O0(activityOooO0O0, d.R, activityOooO0O0, LoginActivity.class);
                }
            }
        });
        this.f31450OooOOoo.setOnClickListener(new View.OnClickListener() { // from class: o00OO0O0.o0000O0O
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o0000OO0 this$0 = this.f31446Oooo0o;
                ChatModel model2 = model;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(model2, "$model");
                p606o0oo0O.OooOo.OooO0O0("102212");
                Objects.requireNonNull(this$0);
                o000OO onLogin = new o000OO(this$0, model2);
                Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                if (Intrinsics.areEqual(p498o0o00Oo0.OooOOO.f41216OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
                    onLogin.invoke();
                    return;
                }
                Activity activityOooO0O0 = p254o00ooO0O.o00000O.f34254OooO00o.OooO0O0();
                if (activityOooO0O0 != null) {
                    LoginActivity.OooO00o oooO00o = LoginActivity.f21752OooooO0;
                    o0OOO0o.OooO0O0(activityOooO0O0, d.R, activityOooO0O0, LoginActivity.class);
                }
            }
        });
        String imageUrl = model.giftUrl;
        if (imageUrl == null || StringsKt.isBlank(imageUrl)) {
            GiftPropModel giftPropModelOooO0O0 = oo0O.OooO0OO.f53327OooO00o.OooO0O0(model.giftid);
            imageUrl = giftPropModelOooO0O0 != null ? giftPropModelOooO0O0.getImageUrl() : null;
        }
        oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(this.f31399OooO00o);
        oooO00o.OooO00o(o00OOO.OooO00o.OooO0Oo());
        oooO00o.f48429OooO0OO = CloudImageUtilKt.imgFormat(imageUrl);
        oooO00o.f48427OooO00o = 0;
        oooO00o.f48454OooOoo0 = 1;
        oooO00o.OooO0o(this.f31450OooOOoo);
        int i2 = model.number / 100;
        if (i2 == 0) {
            p254o00ooO0O.oOO00O.OooO00o(this.f31453OooOo00);
        } else {
            p254o00ooO0O.oOO00O.OooO(this.f31453OooOo00);
            this.f31453OooOo00.setImageResource(this.f31456OooOoO[i2]);
        }
        int i3 = (model.number / 10) % 10;
        if (i3 == 0 && i2 == 0) {
            p254o00ooO0O.oOO00O.OooO00o(this.f31452OooOo0);
        } else {
            p254o00ooO0O.oOO00O.OooO(this.f31452OooOo0);
            this.f31452OooOo0.setImageResource(this.f31456OooOoO[i3]);
        }
        this.f31454OooOo0O.setImageResource(this.f31456OooOoO[model.number % 10]);
    }

    @Override // o00OO0O0.OooOO0O
    public final boolean OooO0Oo() {
        return true;
    }
}
