package o00OO0O0;

import android.app.Activity;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
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
import java.util.ArrayList;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class o00O0O00 extends OooOO0O {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public final NetImageView f31505OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public final TextView f31506OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final ImageView f31507OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final LinearLayout f31508OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public final ImageView f31509OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ImageView f31510OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public final ImageView f31511OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @NotNull
    public final ImageView f31512OooOo0o;

    public static final class OooO00o extends Lambda implements Function1<View, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ ChatModel f31513Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(ChatModel chatModel) {
            super(1);
            this.f31513Oooo0o = chatModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            p159o00OoOO.o00O000.OooO().OooO0oo(this.f31513Oooo0o.toUserId);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends p654o0ooo.o00Oo0 {

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ ChatModel f31515OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ boolean f31516OoooO00;

        public OooO0O0(boolean z, ChatModel chatModel) {
            this.f31516OoooO00 = z;
            this.f31515OoooO0 = chatModel;
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(@Nullable View view) {
            o00O0O00 o00o0o01 = o00O0O00.this;
            boolean z = this.f31516OoooO00;
            ChatModel chatModel = this.f31515OoooO0;
            Objects.requireNonNull(o00o0o01);
            o00O0O0 onLogin = new o00O0O0(z, chatModel, o00o0o01);
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
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O00(@NotNull FragmentActivity activity, @NotNull View view) {
        super(activity, view);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(R.id.tv_mora_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "view.findViewById(R.id.tv_mora_title)");
        this.f31506OooOOo0 = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.iv_mora_gift_icon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "view.findViewById(R.id.iv_mora_gift_icon)");
        this.f31505OooOOo = (NetImageView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.iv_hundred);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "view.findViewById(R.id.iv_hundred)");
        this.f31507OooOOoo = (ImageView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.iv_ten);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "view.findViewById(R.id.iv_ten)");
        this.f31510OooOo00 = (ImageView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.iv_one);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "view.findViewById(R.id.iv_one)");
        this.f31509OooOo0 = (ImageView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.iv_mora_pk);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "view.findViewById(R.id.iv_mora_pk)");
        this.f31511OooOo0O = (ImageView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.iv_mora_pk_label);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "view.findViewById(R.id.iv_mora_pk_label)");
        this.f31512OooOo0o = (ImageView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.ll_mora_list);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "view.findViewById(R.id.ll_mora_list)");
        this.f31508OooOo = (LinearLayout) viewFindViewById8;
    }

    @Override // o00OO0O0.OooOO0O
    public final boolean OooO00o() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0146  */
    @Override // o00OO0O0.OooOO0O
    public final void OooO0OO(int i, @NotNull ChatModel model) {
        boolean z;
        Long value;
        Intrinsics.checkNotNullParameter(model, "model");
        super.OooO0OO(i, model);
        OooO0O0(model, this.f31506OooOOo0);
        boolean z2 = true;
        if (model.toUserId > 0) {
            StringBuilder sbOooO00o = p028Oooo0o0.o00O0O0O.OooO00o('@');
            sbOooO00o.append(model.toNickname);
            String string = sbOooO00o.toString();
            StringBuilder sbOooO00o2 = p708oo000o.Oooo0.OooO00o(string, "  ");
            sbOooO00o2.append(p254o00ooO0O.o000O0O0.OooO0OO(R.string.room_dialog_guess_start_by_me));
            this.f31506OooOOo0.setText(sbOooO00o2.toString());
            p522o0o0O0o.oo0o0O0.OooO0O0(this.f31506OooOOo0, string, new OooO00o(model));
            long j = model.toUserId;
            Long value2 = p498o0o00Oo0.OooOOO.f41216OooO00o.OooOo().getValue();
            if (value2 != null && j == value2.longValue()) {
                TextView textView = this.f31506OooOOo0;
                int iOooO00o = p254o00ooO0O.o000O0O0.OooO00o(R.color.color_FBFF45);
                int iOooO00o2 = com.yalla.support.common.util.OooOo00.OooO00o(2.0f);
                int iOooO00o3 = p254o00ooO0O.o000O0O0.OooO00o(R.color.color_FF7217);
                String[] strings = {string};
                Intrinsics.checkNotNullParameter(textView, "<this>");
                Intrinsics.checkNotNullParameter(strings, "strings");
                for (int i2 = 0; i2 < 1; i2++) {
                    String str = strings[i2];
                    try {
                        CharSequence text = textView.getText();
                        Intrinsics.checkNotNullExpressionValue(text, "text");
                        int iIndexOf$default = StringsKt__StringsKt.indexOf$default(text, str, 0, false, 6, (Object) null);
                        if (iIndexOf$default >= 0) {
                            int length = str.length() + iIndexOf$default;
                            if (length > textView.getText().length()) {
                                length = textView.getText().length();
                            }
                            Intrinsics.checkNotNullParameter(textView, "<this>");
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(textView.getText());
                            try {
                                spannableStringBuilder.setSpan(new p465o0Ooo0oo.o000(iOooO00o, iOooO00o2, iOooO00o3), iIndexOf$default, length, 33);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            textView.setText(spannableStringBuilder);
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            } else {
                com.yalla.support.common.util.Oooo0.OooO0O0(this.f31506OooOOo0, p254o00ooO0O.o000O0O0.OooO00o(R.color.color_FF7217), string);
            }
        } else {
            this.f31506OooOOo0.setText(model.message);
        }
        if (model.isTie) {
            this.f31508OooOo.setVisibility(8);
        } else {
            this.f31508OooOo.setVisibility(0);
        }
        ImageView imageView = this.f31512OooOo0o;
        imageView.setVisibility(8);
        this.f31511OooOo0O.setVisibility(0);
        long userId = model.from.getUserId();
        p498o0o00Oo0.OooOOO oooOOO = p498o0o00Oo0.OooOOO.f41216OooO00o;
        Long value3 = oooOOO.OooOo().getValue();
        if (value3 != null && userId == value3.longValue()) {
            z = true;
        } else {
            long j2 = model.toUserId;
            if (j2 <= 0 || ((value = oooOOO.OooOo().getValue()) != null && j2 == value.longValue())) {
                z = false;
            } else {
                z = true;
            }
        }
        int i3 = model.pkType;
        if (i3 == 1) {
            this.f31511OooOo0O.setImageResource(R.drawable.icon_room_bottom_game_box_mora_pk_1);
            if (z) {
                this.f31511OooOo0O.setVisibility(8);
            }
        } else if (i3 == 2) {
            this.f31511OooOo0O.setImageResource(R.drawable.icon_room_bottom_game_box_mora_pk_2);
            this.f31511OooOo0O.setClickable(false);
            if (z) {
                this.f31511OooOo0O.setVisibility(8);
            }
        } else {
            this.f31511OooOo0O.setVisibility(8);
            imageView.setVisibility(0);
            imageView.setImageResource(R.drawable.icon_room_bottom_game_box_mora);
        }
        String str2 = model.num;
        Intrinsics.checkNotNullExpressionValue(str2, "model.num");
        OooO0o0(Integer.parseInt(str2) / 100, this.f31507OooOOoo);
        String str3 = model.num;
        Intrinsics.checkNotNullExpressionValue(str3, "model.num");
        OooO0o0((Integer.parseInt(str3) % 100) / 10, this.f31510OooOo00);
        String str4 = model.num;
        Intrinsics.checkNotNullExpressionValue(str4, "model.num");
        OooO0o0((Integer.parseInt(str4) % 100) % 10, this.f31509OooOo0);
        String imageUrl = model.giftUrl;
        if (imageUrl != null && !StringsKt.isBlank(imageUrl)) {
            z2 = false;
        }
        if (z2) {
            GiftPropModel giftPropModelOooO0O0 = oo0O.OooO0OO.f53327OooO00o.OooO0O0(model.giftid);
            imageUrl = giftPropModelOooO0O0 != null ? giftPropModelOooO0O0.getImageUrl() : null;
        }
        oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(this.f31399OooO00o);
        oooO00o.OooO00o(o00OOO.OooO00o.OooO0Oo());
        oooO00o.f48429OooO0OO = CloudImageUtilKt.imgFormat(imageUrl);
        oooO00o.f48427OooO00o = 0;
        oooO00o.OooO0o(this.f31505OooOOo);
        this.f31511OooOo0O.setOnClickListener(new OooO0O0(z, model));
    }

    @Override // o00OO0O0.OooOO0O
    public final boolean OooO0Oo() {
        return true;
    }

    public final void OooO0o0(int i, ImageView imageView) {
        if (!(1 <= i && i < 10)) {
            imageView.setVisibility(8);
            return;
        }
        Object obj = ((ArrayList) p159o00OoOO.o000O00O.OooO().OooOO0o()).get(i);
        Intrinsics.checkNotNullExpressionValue(obj, "MixedRoomDataSource.getI….numberImageList[giftNum]");
        imageView.setImageResource(((Number) obj).intValue());
        imageView.setVisibility(0);
    }
}
