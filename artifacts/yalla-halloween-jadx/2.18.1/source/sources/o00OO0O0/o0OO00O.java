package o00OO0O0;

import android.app.Activity;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.mixedroom.MixedRoomActivity;
import com.app.base.model.ChatModel;
import com.app.base.model.RoomChatType;
import com.app.base.view.FixTextView;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.RoomUserInfoModel;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.util.netimage.NetImageView;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class o0OO00O extends BaseAdapter {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @Nullable
    public Function1<? super ChatModel, Unit> f31586Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final MixedRoomActivity f31587Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final ArrayList<ChatModel> f31588Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public final Lazy f31589Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @Nullable
    public Function1<? super Integer, Unit> f31590OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @Nullable
    public Function1<? super Integer, Unit> f31591OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @Nullable
    public Function1<? super ChatModel, Unit> f31592OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @Nullable
    public Function2<? super Integer, ? super Boolean, Unit> f31593OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @Nullable
    public Function1<? super Integer, Unit> f31594OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    @Nullable
    public Function2<? super String, ? super Boolean, Unit> f31595OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public boolean f31596OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public int f31597OoooOo0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @Nullable
    public Function4<? super RoomUserInfoModel, ? super Integer, ? super Integer, ? super Integer, Unit> f31598o000oOoO;

    public static final class OooO extends Lambda implements Function1<Float, Unit> {
        public OooO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Float f) {
            if (f.floatValue() >= 1.0f) {
                o0OO00O o0oo00o2 = o0OO00O.this;
                o0oo00o2.f31597OoooOo0 = -1;
                o0oo00o2.f31596OoooOOo = false;
            } else {
                o0OO00O.this.f31596OoooOOo = true;
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function1<ChatModel, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f31601Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(int i) {
            super(1);
            this.f31601Oooo0oO = i;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ChatModel chatModel) {
            ChatModel it = chatModel;
            Intrinsics.checkNotNullParameter(it, "it");
            o0Oo0oo onLogin = new o0Oo0oo(o0OO00O.this, this.f31601Oooo0oO);
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            if (Intrinsics.areEqual(p498o0o00Oo0.OooOOO.f41216OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
            } else {
                Activity activityOooO0O0 = p254o00ooO0O.o00000O.f34254OooO00o.OooO0O0();
                if (activityOooO0O0 != null) {
                    LoginActivity.OooO00o oooO00o = LoginActivity.f21752OooooO0;
                    o0OOO0o.OooO0O0(activityOooO0O0, d.R, activityOooO0O0, LoginActivity.class);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<ChatModel, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f31603Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(int i) {
            super(1);
            this.f31603Oooo0oO = i;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ChatModel chatModel) {
            ChatModel it = chatModel;
            Intrinsics.checkNotNullParameter(it, "it");
            oo0o0Oo onLogin = new oo0o0Oo(o0OO00O.this, this.f31603Oooo0oO);
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            if (Intrinsics.areEqual(p498o0o00Oo0.OooOOO.f41216OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
            } else {
                Activity activityOooO0O0 = p254o00ooO0O.o00000O.f34254OooO00o.OooO0O0();
                if (activityOooO0O0 != null) {
                    LoginActivity.OooO00o oooO00o = LoginActivity.f21752OooooO0;
                    o0OOO0o.OooO0O0(activityOooO0O0, d.R, activityOooO0O0, LoginActivity.class);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f31605Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(int i) {
            super(0);
            this.f31605Oooo0oO = i;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0O0O00 onLogin = new o0O0O00(o0OO00O.this, this.f31605Oooo0oO);
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            if (Intrinsics.areEqual(p498o0o00Oo0.OooOOO.f41216OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
            } else {
                Activity activityOooO0O0 = p254o00ooO0O.o00000O.f34254OooO00o.OooO0O0();
                if (activityOooO0O0 != null) {
                    LoginActivity.OooO00o oooO00o = LoginActivity.f21752OooooO0;
                    o0OOO0o.OooO0O0(activityOooO0O0, d.R, activityOooO0O0, LoginActivity.class);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f31607Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ OooOO0O f31608Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(int i, OooOO0O oooOO0O) {
            super(0);
            this.f31607Oooo0oO = i;
            this.f31608Oooo0oo = oooOO0O;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            o000OOo onLogin = new o000OOo(o0OO00O.this, this.f31607Oooo0oO, this.f31608Oooo0oo);
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            if (Intrinsics.areEqual(p498o0o00Oo0.OooOOO.f41216OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
            } else {
                Activity activityOooO0O0 = p254o00ooO0O.o00000O.f34254OooO00o.OooO0O0();
                if (activityOooO0O0 != null) {
                    LoginActivity.OooO00o oooO00o = LoginActivity.f21752OooooO0;
                    o0OOO0o.OooO0O0(activityOooO0O0, d.R, activityOooO0O0, LoginActivity.class);
                }
            }
            return Boolean.FALSE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<Oooo0> {
        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Oooo0 invoke() {
            return new Oooo0(o0OO00O.this.f31587Oooo0o);
        }
    }

    public o0OO00O(@NotNull MixedRoomActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f31587Oooo0o = activity;
        this.f31588Oooo0oO = new ArrayList<>();
        this.f31589Oooo0oo = LazyKt.lazy(new OooOO0());
        this.f31597OoooOo0 = -1;
    }

    public final View OooO0O0(int i, View view) {
        View view2 = view == null ? OooO0oo(R.layout.chatline_inrom_beconvened) : view;
        Object tag = view != null ? view.getTag() : null;
        o000O00 o000o01 = tag instanceof o000O00 ? (o000O00) tag : null;
        if (o000o01 == null) {
            MixedRoomActivity mixedRoomActivity = this.f31587Oooo0o;
            Intrinsics.checkNotNullExpressionValue(view2, "view");
            o000o01 = new o000O00(mixedRoomActivity, view2);
            view2.setTag(o000o01);
        }
        ChatModel chatModel = this.f31588Oooo0oO.get(i);
        Intrinsics.checkNotNullExpressionValue(chatModel, "data[position]");
        ChatModel model = chatModel;
        Intrinsics.checkNotNullParameter(model, "model");
        String userName = model.from.getUserName();
        o000o01.f31465OooO0OO.f49642OooO0O0.setText(com.yalla.support.common.util.OooOo.OooO00o(p254o00ooO0O.o000O0O0.OooO0OO(R.string.room_member_convene_room_chat_adapter_xxx), userName));
        FixTextView fixTextView = o000o01.f31465OooO0OO.f49642OooO0O0;
        Intrinsics.checkNotNullExpressionValue(fixTextView, "binding.tvMessage");
        p522o0o0O0o.oo0o0O0.OooO0O0(fixTextView, userName, new o000Oo0(model));
        long userId = model.from.getUserId();
        Long value = p498o0o00Oo0.OooOOO.f41216OooO00o.OooOo().getValue();
        if (value != null && userId == value.longValue()) {
            FixTextView fixTextView2 = o000o01.f31465OooO0OO.f49642OooO0O0;
            Intrinsics.checkNotNullExpressionValue(fixTextView2, "binding.tvMessage");
            p522o0o0O0o.oo0o0O0.OooO0o0(fixTextView2, new String[]{userName}, p254o00ooO0O.o000O0O0.OooO00o(R.color.color_FFFFFFF));
            FixTextView fixTextView3 = o000o01.f31465OooO0OO.f49642OooO0O0;
            Intrinsics.checkNotNullExpressionValue(fixTextView3, "binding.tvMessage");
            p522o0o0O0o.oo0o0O0.OooO0OO(fixTextView3, new String[]{userName}, p254o00ooO0O.o000O0O0.OooO00o(R.color.color_EA6713));
        } else {
            FixTextView fixTextView4 = o000o01.f31465OooO0OO.f49642OooO0O0;
            Intrinsics.checkNotNullExpressionValue(fixTextView4, "binding.tvMessage");
            p522o0o0O0o.oo0o0O0.OooO0o0(fixTextView4, new String[]{userName}, p254o00ooO0O.o000O0O0.OooO00o(R.color.color_FF7217));
        }
        Intrinsics.checkNotNullExpressionValue(view2, "view");
        return view2;
    }

    public final View OooO0OO(int i, View view) {
        View view2 = view == null ? OooO0oo(R.layout.chatline_lucky_set_notification) : view;
        Object tag = view != null ? view.getTag() : null;
        o00oOoo o00oooo2 = tag instanceof o00oOoo ? (o00oOoo) tag : null;
        if (o00oooo2 == null) {
            MixedRoomActivity mixedRoomActivity = this.f31587Oooo0o;
            Intrinsics.checkNotNullExpressionValue(view2, "view");
            o00oooo2 = new o00oOoo(mixedRoomActivity, view2);
            view2.setTag(o00oooo2);
        }
        ChatModel chatModel = this.f31588Oooo0oO.get(i);
        Intrinsics.checkNotNullExpressionValue(chatModel, "data[position]");
        ChatModel model = chatModel;
        Intrinsics.checkNotNullParameter(model, "model");
        String strValueOf = String.valueOf(model.lucknum);
        boolean z = false;
        if (model.luckSetRole == 1) {
            o00oooo2.f31578OooO0OO.f49915OooO0O0.setText(com.yalla.support.common.util.OooOo.OooO00o(p254o00ooO0O.o000O0O0.OooO0OO(R.string.room_lucky_number_save_for_host_xxx), strValueOf));
            FixTextView fixTextView = o00oooo2.f31578OooO0OO.f49915OooO0O0;
            Intrinsics.checkNotNullExpressionValue(fixTextView, "binding.tvMessage");
            p522o0o0O0o.oo0o0O0.OooO0o0(fixTextView, new String[]{strValueOf}, p254o00ooO0O.o000O0O0.OooO00o(R.color.color_FFE28B));
        } else {
            RoomUserInfoModel roomUserInfoModelOooOO0 = p530o0o0OOO.o00O.f43140OooO00o.OooOO0(model.luckSetRoleUserId);
            String userName = roomUserInfoModelOooOO0 != null ? roomUserInfoModelOooOO0.getUserName() : null;
            o00oooo2.f31578OooO0OO.f49915OooO0O0.setText(com.yalla.support.common.util.OooOo.OooO00o(p254o00ooO0O.o000O0O0.OooO0OO(R.string.room_lucky_number_save_for_manage_xxx1_xxx2), userName, strValueOf));
            int iIndexOf = StringsKt__StringsKt.indexOf(com.yalla.support.common.util.OooOo.OooO00o(p254o00ooO0O.o000O0O0.OooO0OO(R.string.room_lucky_number_save_for_manage_xxx1_xxx2), userName), "XXX2", 0, true);
            int length = strValueOf.length() + iIndexOf;
            if (iIndexOf >= 0 && iIndexOf <= length) {
                z = true;
            }
            if (z && o00oooo2.f31578OooO0OO.f49915OooO0O0.getText().length() > length) {
                FixTextView fixTextView2 = o00oooo2.f31578OooO0OO.f49915OooO0O0;
                Intrinsics.checkNotNullExpressionValue(fixTextView2, "binding.tvMessage");
                int iOooO00o = p254o00ooO0O.o000O0O0.OooO00o(R.color.color_FFE28B);
                Intrinsics.checkNotNullParameter(fixTextView2, "<this>");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(fixTextView2.getText());
                if (fixTextView2.length() > 0) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(iOooO00o), iIndexOf, length, 33);
                }
                fixTextView2.setText(spannableStringBuilder);
            }
        }
        Intrinsics.checkNotNullExpressionValue(view2, "view");
        return view2;
    }

    public final View OooO0Oo(int i, View view) {
        View view2 = view == null ? OooO0oo(R.layout.chatline_lucky_set_result) : view;
        Object tag = view != null ? view.getTag() : null;
        o00O000 o00o001 = tag instanceof o00O000 ? (o00O000) tag : null;
        if (o00o001 == null) {
            MixedRoomActivity mixedRoomActivity = this.f31587Oooo0o;
            Intrinsics.checkNotNullExpressionValue(view2, "view");
            o00o001 = new o00O000(mixedRoomActivity, view2);
            view2.setTag(o00o001);
        }
        ChatModel chatModel = this.f31588Oooo0oO.get(i);
        Intrinsics.checkNotNullExpressionValue(chatModel, "data[position]");
        ChatModel model = chatModel;
        Intrinsics.checkNotNullParameter(model, "model");
        String strValueOf = String.valueOf(model.lucknum);
        if (model.luckSetRole == 1) {
            o00o001.f31492OooO0OO.f50002OooO0O0.setText(com.yalla.support.common.util.OooOo.OooO00o(p254o00ooO0O.o000O0O0.OooO0OO(R.string.room_lucky_number_save_for_host_xxx), strValueOf));
        } else {
            RoomUserInfoModel roomUserInfoModelOooOO0 = p530o0o0OOO.o00O.f43140OooO00o.OooOO0(model.luckSetRoleUserId);
            o00o001.f31492OooO0OO.f50002OooO0O0.setText(com.yalla.support.common.util.OooOo.OooO00o(p254o00ooO0O.o000O0O0.OooO0OO(R.string.room_lucky_number_save_for_manage_xxx1_xxx2), roomUserInfoModelOooOO0 != null ? roomUserInfoModelOooOO0.getUserName() : null, strValueOf));
        }
        FixTextView fixTextView = o00o001.f31492OooO0OO.f50002OooO0O0;
        Intrinsics.checkNotNullExpressionValue(fixTextView, "binding.tvMessage");
        p522o0o0O0o.oo0o0O0.OooO0o0(fixTextView, new String[]{strValueOf}, p254o00ooO0O.o000O0O0.OooO00o(R.color.color_FFE28B));
        Intrinsics.checkNotNullExpressionValue(view2, "view");
        return view2;
    }

    public final View OooO0o(int i, View view) {
        View view2 = view == null ? OooO0oo(R.layout.chatline_member_share_task) : view;
        Object tag = view != null ? view.getTag() : null;
        o00O00o0 o00o00o1 = tag instanceof o00O00o0 ? (o00O00o0) tag : null;
        if (o00o00o1 == null) {
            MixedRoomActivity mixedRoomActivity = this.f31587Oooo0o;
            Intrinsics.checkNotNullExpressionValue(view2, "view");
            o00o00o1 = new o00O00o0(mixedRoomActivity, view2);
            view2.setTag(o00o00o1);
        }
        ChatModel chatModel = this.f31588Oooo0oO.get(i);
        Intrinsics.checkNotNullExpressionValue(chatModel, "data[position]");
        ChatModel model = chatModel;
        Intrinsics.checkNotNullParameter(model, "model");
        oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(o00o00o1.f31499OooO0OO.f50071OooO0O0.getContext());
        oooO00o.f48429OooO0OO = p522o0o0O0o.o00O00O.OooO00o(model.from.getUserHeader());
        oooO00o.f48427OooO00o = 0;
        oooO00o.f48446OooOo0 = true;
        oooO00o.OooO0o(o00o00o1.f31499OooO0OO.f50071OooO0O0);
        o00o00o1.f31499OooO0OO.f50073OooO0Oo.setText(com.yalla.support.common.util.OooOo.OooO00o(p254o00ooO0O.o000O0O0.OooO0OO(R.string.x_shared_the_room), model.from.getUserName()));
        FixTextView fixTextView = o00o00o1.f31499OooO0OO.f50073OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(fixTextView, "binding.tvMessage");
        com.yalla.support.common.util.Oooo0.OooO00o(fixTextView, model.from.getUserName(), new o00O00(model));
        FixTextView fixTextView2 = o00o00o1.f31499OooO0OO.f50073OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(fixTextView2, "binding.tvMessage");
        com.yalla.support.common.util.Oooo0.OooO0O0(fixTextView2, p254o00ooO0O.o000O0O0.OooO00o(R.color.color_FF7217), model.from.getUserName());
        ImageView imageView = o00o00o1.f31499OooO0OO.f50072OooO0OO;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivShare");
        p254o00ooO0O.oOO00O.OooO0oO(imageView, new oOO00O(o00o00o1));
        NetImageView netImageView = o00o00o1.f31499OooO0OO.f50071OooO0O0;
        Intrinsics.checkNotNullExpressionValue(netImageView, "binding.ivHeader");
        p254o00ooO0O.oOO00O.OooO0oO(netImageView, new o00O00OO(model));
        Intrinsics.checkNotNullExpressionValue(view2, "view");
        return view2;
    }

    public final View OooO0o0(int i, View view) {
        View view2 = view == null ? OooO0oo(R.layout.chatline_intimacy_tip) : view;
        Object tag = view != null ? view.getTag() : null;
        o000OO00 o000oo01 = tag instanceof o000OO00 ? (o000OO00) tag : null;
        if (o000oo01 == null) {
            MixedRoomActivity mixedRoomActivity = this.f31587Oooo0o;
            Intrinsics.checkNotNullExpressionValue(view2, "view");
            o000oo01 = new o000OO00(mixedRoomActivity, view2);
            view2.setTag(o000oo01);
        }
        ChatModel chatModel = this.f31588Oooo0oO.get(i);
        Intrinsics.checkNotNullExpressionValue(chatModel, "data[position]");
        ChatModel model = chatModel;
        Intrinsics.checkNotNullParameter(model, "model");
        String value = p498o0o00Oo0.OooOOO.f41216OooO00o.OooOoO().getValue();
        if (value == null) {
            value = "";
        }
        o000oo01.f31478OooO0OO.f49828OooO0OO.setText('@' + value + ' ' + p254o00ooO0O.o000O0O0.OooO0OO(R.string.ower_invites_member_task));
        FixTextView fixTextView = o000oo01.f31478OooO0OO.f49828OooO0OO;
        Intrinsics.checkNotNullExpressionValue(fixTextView, "binding.tvMessage");
        p522o0o0O0o.oo0o0O0.OooO0O0(fixTextView, '@' + value, o000OO0O.f31479Oooo0o);
        if (p168o00Ooo0.oo000o.OooO0o0()) {
            o000oo01.f31478OooO0OO.f49827OooO0O0.setRotationY(180.0f);
        } else {
            o000oo01.f31478OooO0OO.f49827OooO0O0.setRotationY(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        }
        FixTextView fixTextView2 = o000oo01.f31478OooO0OO.f49828OooO0OO;
        Intrinsics.checkNotNullExpressionValue(fixTextView2, "binding.tvMessage");
        p522o0o0O0o.oo0o0O0.OooO0o0(fixTextView2, new String[]{'@' + value}, p254o00ooO0O.o000O0O0.OooO00o(R.color.color_FFFFFFF));
        FixTextView fixTextView3 = o000oo01.f31478OooO0OO.f49828OooO0OO;
        Intrinsics.checkNotNullExpressionValue(fixTextView3, "binding.tvMessage");
        p522o0o0O0o.oo0o0O0.OooO0OO(fixTextView3, new String[]{'@' + value}, p254o00ooO0O.o000O0O0.OooO00o(R.color.color_EA6713));
        ImageView imageView = o000oo01.f31478OooO0OO.f49827OooO0O0;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.iv");
        p254o00ooO0O.oOO00O.OooO0oO(imageView, o000O.f31463Oooo0o);
        Intrinsics.checkNotNullExpressionValue(view2, "view");
        return view2;
    }

    public final View OooO0oO(int i, View view) {
        View view2 = view == null ? OooO0oo(R.layout.chatline_member_up_level) : view;
        Object tag = view != null ? view.getTag() : null;
        o00O0 o00o1 = tag instanceof o00O0 ? (o00O0) tag : null;
        if (o00o1 == null) {
            MixedRoomActivity mixedRoomActivity = this.f31587Oooo0o;
            Intrinsics.checkNotNullExpressionValue(view2, "view");
            o00o1 = new o00O0(mixedRoomActivity, view2);
            view2.setTag(o00o1);
        }
        ChatModel chatModel = this.f31588Oooo0oO.get(i);
        Intrinsics.checkNotNullExpressionValue(chatModel, "data[position]");
        ChatModel model = chatModel;
        Intrinsics.checkNotNullParameter(model, "model");
        o00o1.f31490OooO0OO.f50147OooO0O0.setText(com.yalla.support.common.util.OooOo.OooO00o(com.yalla.support.common.util.OooOo.OooO00o(p254o00ooO0O.o000O0O0.OooO0OO(R.string.member_level_up_message), model.memberUpLevelModel.userName), String.valueOf(model.memberUpLevelModel.level)));
        FixTextView fixTextView = o00o1.f31490OooO0OO.f50147OooO0O0;
        Intrinsics.checkNotNullExpressionValue(fixTextView, "binding.tvMessage");
        String str = model.memberUpLevelModel.userName;
        Intrinsics.checkNotNullExpressionValue(str, "model.memberUpLevelModel.userName");
        com.yalla.support.common.util.Oooo0.OooO00o(fixTextView, str, new oo00o(model));
        FixTextView fixTextView2 = o00o1.f31490OooO0OO.f50147OooO0O0;
        Intrinsics.checkNotNullExpressionValue(fixTextView2, "binding.tvMessage");
        String str2 = model.memberUpLevelModel.userName;
        Intrinsics.checkNotNullExpressionValue(str2, "model.memberUpLevelModel.userName");
        p522o0o0O0o.oo0o0O0.OooO0o0(fixTextView2, new String[]{str2}, p254o00ooO0O.o000O0O0.OooO00o(R.color.color_FF7217));
        long j = model.memberUpLevelModel.userId;
        Long value = p498o0o00Oo0.OooOOO.f41216OooO00o.OooOo().getValue();
        if (value != null && j == value.longValue()) {
            FixTextView fixTextView3 = o00o1.f31490OooO0OO.f50147OooO0O0;
            Intrinsics.checkNotNullExpressionValue(fixTextView3, "binding.tvMessage");
            String str3 = model.memberUpLevelModel.userName;
            Intrinsics.checkNotNullExpressionValue(str3, "model.memberUpLevelModel.userName");
            p522o0o0O0o.oo0o0O0.OooO0o0(fixTextView3, new String[]{str3}, p254o00ooO0O.o000O0O0.OooO00o(R.color.color_FFFFFFF));
            FixTextView fixTextView4 = o00o1.f31490OooO0OO.f50147OooO0O0;
            Intrinsics.checkNotNullExpressionValue(fixTextView4, "binding.tvMessage");
            String str4 = model.memberUpLevelModel.userName;
            Intrinsics.checkNotNullExpressionValue(str4, "model.memberUpLevelModel.userName");
            p522o0o0O0o.oo0o0O0.OooO0OO(fixTextView4, new String[]{str4}, p254o00ooO0O.o000O0O0.OooO00o(R.color.color_EA6713));
        }
        Intrinsics.checkNotNullExpressionValue(view2, "view");
        return view2;
    }

    public final View OooO0oo(int i) {
        return View.inflate(this.f31587Oooo0o, i, null);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f31588Oooo0oO.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        ChatModel chatModel = this.f31588Oooo0oO.get(i);
        Intrinsics.checkNotNullExpressionValue(chatModel, "data[i]");
        return chatModel;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i) {
        ChatModel chatModel;
        if (!(!this.f31588Oooo0oO.isEmpty())) {
            return -1;
        }
        if (i >= this.f31588Oooo0oO.size()) {
            ArrayList<ChatModel> arrayList = this.f31588Oooo0oO;
            chatModel = arrayList.get(arrayList.size() - 1);
        } else {
            chatModel = this.f31588Oooo0oO.get(i);
        }
        if (chatModel != null) {
            return chatModel.type;
        }
        return -1;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 30761. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // android.widget.Adapter
    @org.jetbrains.annotations.Nullable
    public final android.view.View getView(int r11, @org.jetbrains.annotations.Nullable android.view.View r12, @org.jetbrains.annotations.NotNull android.view.ViewGroup r13) {
        /*
            Method dump skipped, instruction units count: 3076
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o00OO0O0.o0OO00O.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return RoomChatType.viewTypeCount();
    }
}
