package p502o0o00oOO;

import android.app.Activity;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.protobuf.room.Room;
import com.code.android.util.o000;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000OO00;
import com.code.android.util.o0OoOo0;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.model.chat.ChatModel;
import com.yalla.yalla.model.gift.GiftPropTypeUser;
import com.yalla.yalla.model.room.RoomChatType;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.view.FixTextView;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p396o0Oo0O.OooOOO;
import p417o0OoO0.o000O0o;
import p464o0Oooo.o000000O;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p592o0oo00O.OooOOO0;
import p641o0ooOOOO.a1;
import p641o0ooOOOO.b1;
import p641o0ooOOOO.c1;
import p641o0ooOOOO.d1;
import p641o0ooOOOO.t0;
import p641o0ooOOOO.w0;
import p641o0ooOOOO.x0;
import p641o0ooOOOO.z0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomChatAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomChatAdapter.kt\ncom/yalla/yalla/ui/adapter/roomChat/RoomChatAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,579:1\n1#2:580\n*E\n"})
public final class o0oo0000 extends BaseAdapter {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public Function1<? super Integer, Unit> f49487OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final MixedRoomActivity f49488OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final Lazy f49489OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final ArrayList<ChatModel> f49490OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public Function1<? super ChatModel, Unit> f49491OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public Function1<? super ChatModel, Unit> f49492OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public Function2<? super Integer, ? super Boolean, Unit> f49493OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public Function1<? super Integer, Unit> f49494OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public Function1<? super Integer, Unit> f49495OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public Function6<? super RoomUserInfoModel, ? super Integer, ? super Integer, ? super Integer, ? super Boolean, ? super ChatModel, Unit> f49496OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public Function5<? super Integer, ? super Integer, ? super Integer, ? super Boolean, ? super ChatModel, Unit> f49497OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @Nullable
    public Function2<? super String, ? super Boolean, Unit> f49498OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f49499OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f49500OooOOo0;

    public static final class OooO extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o0OOO0 f49502OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f49503OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(int i, o0OOO0 o0ooo1) {
            super(0);
            this.f49503OooO0o0 = i;
            this.f49502OooO0o = o0ooo1;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            oO0Ooooo onLogin = new oO0Ooooo(o0oo0000.this, this.f49503OooO0o0, this.f49502OooO0o);
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            o000000O o000000o2 = o000000O.f46674OooO00o;
            if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
            } else {
                Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                if (activityOooO0O0 != null) {
                    int i = LoginActivity.f25186OooOo0O;
                    LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                }
            }
            return Boolean.FALSE;
        }
    }

    public static final class OooO00o extends Lambda implements Function1<ChatModel, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ChatModel chatModel) {
            Function5<? super Integer, ? super Integer, ? super Integer, ? super Boolean, ? super ChatModel, Unit> function5;
            ChatModel chatModel2 = chatModel;
            Intrinsics.checkNotNullParameter(chatModel2, "chatModel");
            Room.MessageBlindBoxNotify giftBlindBoxNotify = chatModel2.getGiftBlindBoxNotify();
            if (giftBlindBoxNotify != null && (function5 = o0oo0000.this.f49497OooOOO0) != null) {
                function5.invoke(1, Integer.valueOf(giftBlindBoxNotify.getRewardId()), Integer.valueOf(GiftPropTypeUser.Backpack.getValue()), Boolean.TRUE, chatModel2);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<ChatModel, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f49506OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(int i) {
            super(1);
            this.f49506OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ChatModel chatModel) {
            ChatModel it = chatModel;
            Intrinsics.checkNotNullParameter(it, "it");
            oO000 onLogin = new oO000(o0oo0000.this, this.f49506OooO0o0);
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            o000000O o000000o2 = o000000O.f46674OooO00o;
            if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
            } else {
                Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                if (activityOooO0O0 != null) {
                    int i = LoginActivity.f25186OooOo0O;
                    LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<ChatModel, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f49508OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(int i) {
            super(1);
            this.f49508OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ChatModel chatModel) {
            ChatModel it = chatModel;
            Intrinsics.checkNotNullParameter(it, "it");
            oO000O0 onLogin = new oO000O0(o0oo0000.this, this.f49508OooO0o0);
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            o000000O o000000o2 = o000000O.f46674OooO00o;
            if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
            } else {
                Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                if (activityOooO0O0 != null) {
                    int i = LoginActivity.f25186OooOo0O;
                    LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f49510OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(int i) {
            super(0);
            this.f49510OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            oO000O0O onLogin = new oO000O0O(o0oo0000.this, this.f49510OooO0o0);
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            o000000O o000000o2 = o000000O.f46674OooO00o;
            if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
            } else {
                Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                if (activityOooO0O0 != null) {
                    int i = LoginActivity.f25186OooOo0O;
                    LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<Float, Unit> {
        public OooOO0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Float f) {
            float fFloatValue = f.floatValue();
            o0oo0000 o0oo0000Var = o0oo0000.this;
            if (fFloatValue >= 1.0f) {
                o0oo0000Var.f49500OooOOo0 = -1;
                o0oo0000Var.f49499OooOOOo = false;
            } else {
                o0oo0000Var.f49499OooOOOo = true;
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<o0o0000> {
        public OooOO0O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0o0000 invoke() {
            return new o0o0000(o0oo0000.this.f49488OooO0Oo);
        }
    }

    public o0oo0000(@NotNull MixedRoomActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f49488OooO0Oo = activity;
        this.f49490OooO0o0 = new ArrayList<>();
        this.f49489OooO0o = LazyKt.lazy(new OooOO0O());
        this.f49500OooOOo0 = -1;
    }

    public final View OooO(int i, View view) {
        View view2 = view == null ? OooOO0O(oO00OO0O.chatline_member_share_task) : view;
        Object tag = view != null ? view.getTag() : null;
        oOo0o0oO ooo0o0oo = tag instanceof oOo0o0oO ? (oOo0o0oO) tag : null;
        if (ooo0o0oo == null) {
            Intrinsics.checkNotNullExpressionValue(view2, "view");
            ooo0o0oo = new oOo0o0oO(view2, this.f49488OooO0Oo);
            view2.setTag(ooo0o0oo);
        }
        ChatModel chatModel = this.f49490OooO0o0.get(i);
        Intrinsics.checkNotNullExpressionValue(chatModel, "data[position]");
        ChatModel model = chatModel;
        Intrinsics.checkNotNullParameter(model, "model");
        c1 c1Var = ooo0o0oo.f49694OooO0OO;
        o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(c1Var.f57635OooO0O0.getContext());
        RoomUserInfoModel newFrom = model.getNewFrom();
        Intrinsics.checkNotNull(newFrom);
        oooO00o.f43911OooO0OO = OooOOO.OooO00o(newFrom.getUserHeader().getValue());
        oooO00o.f43909OooO00o = 0;
        oooO00o.f43928OooOo0 = true;
        NetImageView netImageView = c1Var.f57635OooO0O0;
        oooO00o.OooO0Oo(netImageView);
        String strOooO0OO = o0000.OooO0OO(oO00OOo0.x_shared_the_room);
        RoomUserInfoModel newFrom2 = model.getNewFrom();
        Intrinsics.checkNotNull(newFrom2);
        String strOooO00o = o0000O.OooO00o(strOooO0OO, newFrom2.getUserName().getValue());
        FixTextView fixTextView = c1Var.f57637OooO0Oo;
        fixTextView.setText(strOooO00o);
        Intrinsics.checkNotNullExpressionValue(fixTextView, "binding.tvMessage");
        RoomUserInfoModel newFrom3 = model.getNewFrom();
        Intrinsics.checkNotNull(newFrom3);
        o000.OooO00o(fixTextView, newFrom3.getUserName().getValue(), new oO0O0O00(model));
        Intrinsics.checkNotNullExpressionValue(fixTextView, "binding.tvMessage");
        int iOooO00o = o0000.OooO00o(oO00O0o.color_FF7217);
        RoomUserInfoModel newFrom4 = model.getNewFrom();
        Intrinsics.checkNotNull(newFrom4);
        o000.OooO0O0(fixTextView, iOooO00o, newFrom4.getUserName().getValue());
        ImageView imageView = c1Var.f57636OooO0OO;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivShare");
        o000OO00.OooO(imageView, new oOo0oooO(ooo0o0oo));
        Intrinsics.checkNotNullExpressionValue(netImageView, "binding.ivHeader");
        o000OO00.OooO(netImageView, new oO0O0Oo0(model));
        Intrinsics.checkNotNullExpressionValue(view2, "view");
        return view2;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0149  */
    /* JADX WARN: Multi-variable type inference failed */
    public final View OooO0O0(int i, View view) {
        View view2;
        Object next;
        Object next2;
        String text;
        int region;
        Integer num;
        String text2;
        int region2;
        Integer num2;
        View view3 = view == null ? OooOO0O(oO00OO0O.chatline_gift_blind_notify) : view;
        Object tag = view != null ? view.getTag() : null;
        oO00OOO oo00ooo = tag instanceof oO00OOO ? (oO00OOO) tag : null;
        if (oo00ooo == null) {
            Intrinsics.checkNotNullExpressionValue(view3, "view");
            oo00ooo = new oO00OOO(view3, this.f49488OooO0Oo);
            view3.setTag(oo00ooo);
        }
        ChatModel chatModel = this.f49490OooO0o0.get(i);
        Intrinsics.checkNotNullExpressionValue(chatModel, "data[position]");
        ChatModel model = chatModel;
        Intrinsics.checkNotNullParameter(model, "model");
        Room.MessageBlindBoxNotify giftBlindBoxNotify = model.getGiftBlindBoxNotify();
        if (giftBlindBoxNotify != null) {
            OooOOO0.OooO0O0("RoomChatGiftBlindNotifyVH it = ".concat(p140o00OOooo.OooOO0.OooO00o(giftBlindBoxNotify)));
            String strOooOOO = o0OoOo0.OooOOO(giftBlindBoxNotify.getSendUserNick(), "");
            long sendUserId = giftBlindBoxNotify.getSendUserId();
            String strOooOOO2 = o0OoOo0.OooOOO(giftBlindBoxNotify.getGetUserNick(), "");
            giftBlindBoxNotify.getGetUserId();
            List<Room.MessageBlindBoxPropName> propNameTextList = giftBlindBoxNotify.getPropNameTextList();
            Intrinsics.checkNotNullExpressionValue(propNameTextList, "it.propNameTextList");
            Iterator<T> it = propNameTextList.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                region2 = ((Room.MessageBlindBoxPropName) next).getRegion();
                o000000O o000000o2 = o000000O.f46674OooO00o;
                num2 = (Integer) o000000O.OooOOO0().getValue();
            } while (!(num2 != null && region2 == num2.intValue()));
            Room.MessageBlindBoxPropName messageBlindBoxPropName = (Room.MessageBlindBoxPropName) next;
            String strOooOOO3 = (messageBlindBoxPropName == null || (text2 = messageBlindBoxPropName.getText()) == null) ? null : o0OoOo0.OooOOO(text2, "");
            List<Room.MessageBlindBoxPropName> rewardPropNameTextList = giftBlindBoxNotify.getRewardPropNameTextList();
            Intrinsics.checkNotNullExpressionValue(rewardPropNameTextList, "it.rewardPropNameTextList");
            Iterator<T> it2 = rewardPropNameTextList.iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                region = ((Room.MessageBlindBoxPropName) next2).getRegion();
                o000000O o000000o3 = o000000O.f46674OooO00o;
                num = (Integer) o000000O.OooOOO0().getValue();
            } while (!(num != null && region == num.intValue()));
            Room.MessageBlindBoxPropName messageBlindBoxPropName2 = (Room.MessageBlindBoxPropName) next2;
            String strOooOOO4 = (messageBlindBoxPropName2 == null || (text = messageBlindBoxPropName2.getText()) == null) ? null : o0OoOo0.OooOOO(text, "");
            String strOooOO0o = o0OoOo0.OooOO0o(Integer.valueOf(giftBlindBoxNotify.getRewardValue()), "");
            String strOooOO0o2 = o0OoOo0.OooOO0o(Integer.valueOf(giftBlindBoxNotify.getCoin()), "");
            int redirectType = giftBlindBoxNotify.getRedirectType();
            view2 = view3;
            w0 w0Var = oo00ooo.f49544OooO0o;
            if (redirectType == 1) {
                o000000O o000000o4 = o000000O.f46674OooO00o;
                Long l = (Long) o000000O.OooOOo0().getValue();
                if (l != null && sendUserId == l.longValue()) {
                    ImageView imageView = w0Var.f59115OooO0O0;
                    Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivArrow");
                    o000OO00.OooOOOO(imageView);
                } else {
                    ImageView imageView2 = w0Var.f59115OooO0O0;
                    Intrinsics.checkNotNullExpressionValue(imageView2, "binding.ivArrow");
                    o000OO00.OooO0O0(imageView2);
                }
            } else {
                ImageView imageView3 = w0Var.f59115OooO0O0;
                Intrinsics.checkNotNullExpressionValue(imageView3, "binding.ivArrow");
                o000OO00.OooO0O0(imageView3);
            }
            ImageView imageView4 = w0Var.f59115OooO0O0;
            Intrinsics.checkNotNullExpressionValue(imageView4, "binding.ivArrow");
            o000OO00.OooO(imageView4, new oO00O0oO(oo00ooo, model));
            int rewardType = giftBlindBoxNotify.getRewardType();
            FixTextView fixTextView = w0Var.f59116OooO0OO;
            if (rewardType == oo00ooo.f49542OooO0OO) {
                fixTextView.setText(o0000O.OooO00o(o0000O.OooO00o(o0000O.OooO00o(o0000O.OooO00o(o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.blind_gift_message_XXX1_XXX2_XXX3_XXX4_XXX5), strOooOOO), strOooOO0o), strOooOOO3), strOooOO0o2), strOooOOO4));
            } else if (rewardType == oo00ooo.f49543OooO0Oo) {
                fixTextView.setText(o0000O.OooO00o(o0000O.OooO00o(o0000O.OooO00o(o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.blind_gift_message_XXX1_XXX2_XXX3_XXX4), strOooOOO), strOooOOO2), strOooOOO3), strOooOO0o));
                Intrinsics.checkNotNullExpressionValue(fixTextView, "binding.tvMessage");
                o000O0o.OooO0Oo(fixTextView, o0000.OooO00o(oO00O0o.color_FFF085), strOooOO0o);
            } else if (rewardType == oo00ooo.f49545OooO0o0) {
                fixTextView.setText(o0000O.OooO00o(o0000O.OooO00o(o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.blind_gift_message_XXX1_XXX2_XXX3), strOooOOO), strOooOOO3), strOooOO0o));
                Intrinsics.checkNotNullExpressionValue(fixTextView, "binding.tvMessage");
                o000O0o.OooO0Oo(fixTextView, o0000.OooO00o(oO00O0o.color_FFF085), strOooOO0o);
            }
            Intrinsics.checkNotNullExpressionValue(fixTextView, "binding.tvMessage");
            o000O0o.OooO00o(fixTextView, strOooOOO, new oO00OO0O(sendUserId));
            o000000O o000000o5 = o000000O.f46674OooO00o;
            Long l2 = (Long) o000000O.OooOOo0().getValue();
            if (l2 != null && sendUserId == l2.longValue()) {
                Intrinsics.checkNotNullExpressionValue(fixTextView, "binding.tvMessage");
                o000O0o.OooO0Oo(fixTextView, o0000.OooO00o(oO00O0o.color_FFFFFFF), strOooOOO);
                Intrinsics.checkNotNullExpressionValue(fixTextView, "binding.tvMessage");
                o000O0o.OooO0O0(fixTextView, o0000.OooO00o(oO00O0o.color_EA6713), strOooOOO);
            } else {
                Intrinsics.checkNotNullExpressionValue(fixTextView, "binding.tvMessage");
                o000O0o.OooO0Oo(fixTextView, o0000.OooO00o(oO00O0o.color_FF7217), strOooOOO);
            }
        } else {
            view2 = view3;
        }
        oo00ooo.f49546OooO0oO = new OooO00o();
        View view4 = view2;
        Intrinsics.checkNotNullExpressionValue(view4, "view");
        return view4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View OooO0OO(int i, View view) {
        View view2 = view == null ? OooOO0O(oO00OO0O.chatline_inrom_beconvened) : view;
        Object tag = view != null ? view.getTag() : null;
        oO00o0 oo00o0 = tag instanceof oO00o0 ? (oO00o0) tag : null;
        if (oo00o0 == null) {
            Intrinsics.checkNotNullExpressionValue(view2, "view");
            oo00o0 = new oO00o0(view2, this.f49488OooO0Oo);
            view2.setTag(oo00o0);
        }
        ChatModel chatModel = this.f49490OooO0o0.get(i);
        Intrinsics.checkNotNullExpressionValue(chatModel, "data[position]");
        ChatModel model = chatModel;
        Intrinsics.checkNotNullParameter(model, "model");
        RoomUserInfoModel newFrom = model.getNewFrom();
        Intrinsics.checkNotNull(newFrom);
        String value = newFrom.getUserName().getValue();
        x0 x0Var = oo00o0.f49556OooO0OO;
        x0Var.f59231OooO0O0.setText(o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.room_member_convene_room_chat_adapter_xxx), value));
        FixTextView fixTextView = x0Var.f59231OooO0O0;
        Intrinsics.checkNotNullExpressionValue(fixTextView, "binding.tvMessage");
        o000O0o.OooO00o(fixTextView, value, new oO00o00O(model));
        RoomUserInfoModel newFrom2 = model.getNewFrom();
        Intrinsics.checkNotNull(newFrom2);
        long jLongValue = newFrom2.getUserId().getValue().longValue();
        o000000O o000000o2 = o000000O.f46674OooO00o;
        Long l = (Long) o000000O.OooOOo0().getValue();
        if (l != null && jLongValue == l.longValue()) {
            Intrinsics.checkNotNullExpressionValue(fixTextView, "binding.tvMessage");
            o000O0o.OooO0Oo(fixTextView, o0000.OooO00o(oO00O0o.color_FFFFFFF), value);
            Intrinsics.checkNotNullExpressionValue(fixTextView, "binding.tvMessage");
            o000O0o.OooO0O0(fixTextView, o0000.OooO00o(oO00O0o.color_EA6713), value);
        } else {
            Intrinsics.checkNotNullExpressionValue(fixTextView, "binding.tvMessage");
            o000O0o.OooO0Oo(fixTextView, o0000.OooO00o(oO00O0o.color_FF7217), value);
        }
        Intrinsics.checkNotNullExpressionValue(view2, "view");
        return view2;
    }

    public final View OooO0Oo(int i, View view) {
        MutableStateFlow<String> userName;
        View view2 = view == null ? OooOO0O(oO00OO0O.chatline_lucky_set_notification) : view;
        String value = null;
        Object tag = view != null ? view.getTag() : null;
        oO0O00o0 oo0o00o0 = tag instanceof oO0O00o0 ? (oO0O00o0) tag : null;
        if (oo0o00o0 == null) {
            Intrinsics.checkNotNullExpressionValue(view2, "view");
            oo0o00o0 = new oO0O00o0(view2, this.f49488OooO0Oo);
            view2.setTag(oo0o00o0);
        }
        ChatModel chatModel = this.f49490OooO0o0.get(i);
        Intrinsics.checkNotNullExpressionValue(chatModel, "data[position]");
        ChatModel model = chatModel;
        Intrinsics.checkNotNullParameter(model, "model");
        String strValueOf = String.valueOf(model.getLucknum());
        int luckSetRole = model.getLuckSetRole();
        a1 a1Var = oo0o00o0.f49574OooO0OO;
        if (luckSetRole == 1) {
            a1Var.f57463OooO0O0.setText(o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.room_lucky_number_save_for_host_xxx), strValueOf));
            FixTextView fixTextView = a1Var.f57463OooO0O0;
            Intrinsics.checkNotNullExpressionValue(fixTextView, "binding.tvMessage");
            o000O0o.OooO0Oo(fixTextView, o0000.OooO00o(oO00O0o.color_FFE28B), strValueOf);
        } else {
            ArrayList arrayList = com.yalla.yalla.service.room.OooO00o.f24973OooO00o;
            RoomUserInfoModel roomUserInfoModelOooO0o0 = com.yalla.yalla.service.room.OooO00o.OooO0o0(Long.valueOf(model.getLuckSetRoleUserId()));
            if (roomUserInfoModelOooO0o0 != null && (userName = roomUserInfoModelOooO0o0.getUserName()) != null) {
                value = userName.getValue();
            }
            FixTextView fixTextView2 = a1Var.f57463OooO0O0;
            int i2 = oO00OOo0.room_lucky_number_save_for_manage_xxx1_xxx2;
            fixTextView2.setText(o0000O.OooO00o(o0000.OooO0OO(i2), value, strValueOf));
            int iIndexOf = StringsKt__StringsKt.indexOf((CharSequence) o0000O.OooO00o(o0000.OooO0OO(i2), value), "XXX2", 0, true);
            int length = strValueOf.length() + iIndexOf;
            if (iIndexOf >= 0 && iIndexOf <= length) {
                FixTextView fixTextView3 = a1Var.f57463OooO0O0;
                if (fixTextView3.getText().length() > length) {
                    Intrinsics.checkNotNullExpressionValue(fixTextView3, "binding.tvMessage");
                    int iOooO00o = o0000.OooO00o(oO00O0o.color_FFE28B);
                    Intrinsics.checkNotNullParameter(fixTextView3, "<this>");
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(fixTextView3.getText());
                    if (fixTextView3.length() > 0) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(iOooO00o), iIndexOf, length, 33);
                    }
                    fixTextView3.setText(spannableStringBuilder);
                }
            }
        }
        Intrinsics.checkNotNullExpressionValue(view2, "view");
        return view2;
    }

    public final View OooO0o(int i, View view) {
        View view2 = view == null ? OooOO0O(oO00OO0O.chatline_apply_mic_switch) : view;
        Object tag = view != null ? view.getTag() : null;
        oO000OOo oo000ooo = tag instanceof oO000OOo ? (oO000OOo) tag : null;
        if (oo000ooo == null) {
            Intrinsics.checkNotNullExpressionValue(view2, "view");
            oo000ooo = new oO000OOo(view2, this.f49488OooO0Oo);
            view2.setTag(oo000ooo);
        }
        ChatModel chatModel = this.f49490OooO0o0.get(i);
        Intrinsics.checkNotNullExpressionValue(chatModel, "data[position]");
        ChatModel model = chatModel;
        Intrinsics.checkNotNullParameter(model, "model");
        if (model.getApplyMicSwitchModel() != null) {
            ChatModel.ApplyMicSwitchModel applyMicSwitchModel = model.getApplyMicSwitchModel();
            Intrinsics.checkNotNull(applyMicSwitchModel);
            RoomUserInfoModel switchUser = applyMicSwitchModel.getSwitchUser();
            int iIntValue = switchUser.getRoomMemberType().getValue().intValue();
            d1 d1Var = oo000ooo.f49530OooO0OO;
            if (iIntValue == 1) {
                ChatModel.ApplyMicSwitchModel applyMicSwitchModel2 = model.getApplyMicSwitchModel();
                Intrinsics.checkNotNull(applyMicSwitchModel2);
                if (applyMicSwitchModel2.getIsOpen()) {
                    d1Var.f57712OooO0O0.setText(o0000.OooO0OO(oO00OOo0.room_owner_open_apply_mic));
                } else {
                    d1Var.f57712OooO0O0.setText(o0000.OooO0OO(oO00OOo0.room_owner_close_apply_mic));
                }
            } else {
                ChatModel.ApplyMicSwitchModel applyMicSwitchModel3 = model.getApplyMicSwitchModel();
                Intrinsics.checkNotNull(applyMicSwitchModel3);
                if (applyMicSwitchModel3.getIsOpen()) {
                    d1Var.f57712OooO0O0.setText(o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.room_admin_XXX_open_apply_mic), switchUser.getUserName().getValue()));
                } else {
                    d1Var.f57712OooO0O0.setText(o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.room_admin_XXX_close_apply_mic), switchUser.getUserName().getValue()));
                }
            }
        }
        Intrinsics.checkNotNullExpressionValue(view2, "view");
        return view2;
    }

    public final View OooO0o0(int i, View view) {
        View view2 = view == null ? OooOO0O(oO00OO0O.chatline_lucky_set_result) : view;
        Object tag = view != null ? view.getTag() : null;
        oO0O00oO oo0o00oo = tag instanceof oO0O00oO ? (oO0O00oO) tag : null;
        if (oo0o00oo == null) {
            Intrinsics.checkNotNullExpressionValue(view2, "view");
            oo0o00oo = new oO0O00oO(view2, this.f49488OooO0Oo);
            view2.setTag(oo0o00oo);
        }
        ChatModel chatModel = this.f49490OooO0o0.get(i);
        Intrinsics.checkNotNullExpressionValue(chatModel, "data[position]");
        ChatModel model = chatModel;
        Intrinsics.checkNotNullParameter(model, "model");
        String strValueOf = String.valueOf(model.getLucknum());
        int luckSetRole = model.getLuckSetRole();
        b1 b1Var = oo0o00oo.f49575OooO0OO;
        if (luckSetRole == 1) {
            b1Var.f57538OooO0O0.setText(o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.room_lucky_number_save_for_host_xxx), strValueOf));
        } else {
            ArrayList arrayList = com.yalla.yalla.service.room.OooO00o.f24973OooO00o;
            RoomUserInfoModel roomUserInfoModelOooO0o0 = com.yalla.yalla.service.room.OooO00o.OooO0o0(Long.valueOf(model.getLuckSetRoleUserId()));
            MutableStateFlow<String> userName = roomUserInfoModelOooO0o0 != null ? roomUserInfoModelOooO0o0.getUserName() : null;
            FixTextView fixTextView = b1Var.f57538OooO0O0;
            String strOooO0OO = o0000.OooO0OO(oO00OOo0.room_lucky_number_save_for_manage_xxx1_xxx2);
            String[] strArr = new String[2];
            strArr[0] = userName != null ? userName.getValue() : null;
            strArr[1] = strValueOf;
            fixTextView.setText(o0000O.OooO00o(strOooO0OO, strArr));
        }
        FixTextView fixTextView2 = b1Var.f57538OooO0O0;
        Intrinsics.checkNotNullExpressionValue(fixTextView2, "binding.tvMessage");
        o000O0o.OooO0Oo(fixTextView2, o0000.OooO00o(oO00O0o.color_FFE28B), strValueOf);
        Intrinsics.checkNotNullExpressionValue(view2, "view");
        return view2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View OooO0oO(int i, View view) {
        View view2 = view == null ? OooOO0O(oO00OO0O.chatline_contribution_up) : view;
        Object tag = view != null ? view.getTag() : null;
        oO0OOo0o oo0ooo0o = tag instanceof oO0OOo0o ? (oO0OOo0o) tag : null;
        if (oo0ooo0o == null) {
            Intrinsics.checkNotNullExpressionValue(view2, "view");
            oo0ooo0o = new oO0OOo0o(view2, this.f49488OooO0Oo);
            view2.setTag(oo0ooo0o);
        }
        ChatModel chatModel = this.f49490OooO0o0.get(i);
        Intrinsics.checkNotNullExpressionValue(chatModel, "data[position]");
        ChatModel model = chatModel;
        Intrinsics.checkNotNullParameter(model, "model");
        ChatModel.ContributionUpModel contributionUpModel = model.getContributionUpModel();
        if (contributionUpModel != null) {
            String strOooO00o = o0000O.OooO00o(o0000O.OooO00o(o0000.OooO0OO(contributionUpModel.getType() == 1 ? oO00OOo0.contribution_up_day : oO00OOo0.contribution_up_weekly), contributionUpModel.getUserName()), String.valueOf(contributionUpModel.getRank()));
            t0 t0Var = oo0ooo0o.f49599OooO0OO;
            t0Var.f58831OooO0O0.setText(strOooO00o);
            long userId = contributionUpModel.getUserId();
            o000000O o000000o2 = o000000O.f46674OooO00o;
            Long l = (Long) o000000O.OooOOo0().getValue();
            FixTextView fixTextView = t0Var.f58831OooO0O0;
            if (l != null && userId == l.longValue()) {
                Intrinsics.checkNotNullExpressionValue(fixTextView, "binding.tvMessage");
                o000O0o.OooO0O0(fixTextView, o0000.OooO00o(oO00O0o.color_EA6713), contributionUpModel.getUserName());
            } else {
                Intrinsics.checkNotNullExpressionValue(fixTextView, "binding.tvMessage");
                o000O0o.OooO0Oo(fixTextView, o0000.OooO00o(oO00O0o.color_FF7217), contributionUpModel.getUserName());
            }
            Intrinsics.checkNotNullExpressionValue(fixTextView, "binding.tvMessage");
            o000O0o.OooO0Oo(fixTextView, o0000.OooO00o(oO00O0o.color_FFF085), o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.Top_x), String.valueOf(contributionUpModel.getRank())));
            Intrinsics.checkNotNullExpressionValue(fixTextView, "binding.tvMessage");
            o000OO00.OooO(fixTextView, new ooOOOOoo(contributionUpModel));
        }
        Intrinsics.checkNotNullExpressionValue(view2, "view");
        return view2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View OooO0oo(int i, View view) {
        View view2 = view == null ? OooOO0O(oO00OO0O.chatline_intimacy_tip) : view;
        Object tag = view != null ? view.getTag() : null;
        oO0 oo0 = tag instanceof oO0 ? (oO0) tag : null;
        if (oo0 == null) {
            Intrinsics.checkNotNullExpressionValue(view2, "view");
            oo0 = new oO0(view2, this.f49488OooO0Oo);
            view2.setTag(oo0);
        }
        ChatModel chatModel = this.f49490OooO0o0.get(i);
        Intrinsics.checkNotNullExpressionValue(chatModel, "data[position]");
        ChatModel model = chatModel;
        Intrinsics.checkNotNullParameter(model, "model");
        o000000O o000000o2 = o000000O.f46674OooO00o;
        String str = (String) o000000O.OooOOoo().getValue();
        if (str == null) {
            str = "";
        }
        z0 z0Var = oo0.f49517OooO0OO;
        z0Var.f59431OooO0OO.setText("@" + str + ZegoConstants.ZegoVideoDataAuxPublishingStream + o0000.OooO0OO(oO00OOo0.ower_invites_member_task));
        FixTextView fixTextView = z0Var.f59431OooO0OO;
        Intrinsics.checkNotNullExpressionValue(fixTextView, "binding.tvMessage");
        o000O0o.OooO00o(fixTextView, "@".concat(str), oOo000Oo.f49681OooO0Oo);
        boolean zOooO0o0 = p591o0oo000O.OooO.OooO0o0();
        ImageView imageView = z0Var.f59430OooO0O0;
        if (zOooO0o0) {
            imageView.setRotationY(180.0f);
        } else {
            imageView.setRotationY(0.0f);
        }
        Intrinsics.checkNotNullExpressionValue(fixTextView, "binding.tvMessage");
        o000O0o.OooO0Oo(fixTextView, o0000.OooO00o(oO00O0o.color_FFFFFFF), "@".concat(str));
        Intrinsics.checkNotNullExpressionValue(fixTextView, "binding.tvMessage");
        o000O0o.OooO0O0(fixTextView, o0000.OooO00o(oO00O0o.color_EA6713), "@".concat(str));
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.iv");
        o000OO00.OooO(imageView, oOo000o0.f49682OooO0Oo);
        Intrinsics.checkNotNullExpressionValue(view2, "view");
        return view2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View OooOO0(int i, View view) {
        View view2 = view == null ? OooOO0O(oO00OO0O.chatline_member_up_level) : view;
        Object tag = view != null ? view.getTag() : null;
        ooOOO00O ooooo00o = tag instanceof ooOOO00O ? (ooOOO00O) tag : null;
        if (ooooo00o == null) {
            Intrinsics.checkNotNullExpressionValue(view2, "view");
            ooooo00o = new ooOOO00O(view2, this.f49488OooO0Oo);
            view2.setTag(ooooo00o);
        }
        ChatModel chatModel = this.f49490OooO0o0.get(i);
        Intrinsics.checkNotNullExpressionValue(chatModel, "data[position]");
        ChatModel model = chatModel;
        Intrinsics.checkNotNullParameter(model, "model");
        d1 d1Var = ooooo00o.f49696OooO0OO;
        FixTextView fixTextView = d1Var.f57712OooO0O0;
        String strOooO0OO = o0000.OooO0OO(oO00OOo0.member_level_up_message);
        ChatModel.MemberUpLevelModel memberUpLevelModel = model.getMemberUpLevelModel();
        Intrinsics.checkNotNull(memberUpLevelModel);
        String strOooO00o = o0000O.OooO00o(strOooO0OO, memberUpLevelModel.getUserName());
        ChatModel.MemberUpLevelModel memberUpLevelModel2 = model.getMemberUpLevelModel();
        Intrinsics.checkNotNull(memberUpLevelModel2);
        fixTextView.setText(o0000O.OooO00o(strOooO00o, String.valueOf(memberUpLevelModel2.getLevel())));
        FixTextView fixTextView2 = d1Var.f57712OooO0O0;
        Intrinsics.checkNotNullExpressionValue(fixTextView2, "binding.tvMessage");
        ChatModel.MemberUpLevelModel memberUpLevelModel3 = model.getMemberUpLevelModel();
        Intrinsics.checkNotNull(memberUpLevelModel3);
        o000.OooO00o(fixTextView2, memberUpLevelModel3.getUserName(), new ooOOO0Oo(model));
        Intrinsics.checkNotNullExpressionValue(fixTextView2, "binding.tvMessage");
        int iOooO00o = o0000.OooO00o(oO00O0o.color_FF7217);
        ChatModel.MemberUpLevelModel memberUpLevelModel4 = model.getMemberUpLevelModel();
        Intrinsics.checkNotNull(memberUpLevelModel4);
        o000O0o.OooO0Oo(fixTextView2, iOooO00o, memberUpLevelModel4.getUserName());
        ChatModel.MemberUpLevelModel memberUpLevelModel5 = model.getMemberUpLevelModel();
        Intrinsics.checkNotNull(memberUpLevelModel5);
        long userId = memberUpLevelModel5.getUserId();
        o000000O o000000o2 = o000000O.f46674OooO00o;
        Long l = (Long) o000000O.OooOOo0().getValue();
        if (l != null && userId == l.longValue()) {
            Intrinsics.checkNotNullExpressionValue(fixTextView2, "binding.tvMessage");
            int iOooO00o2 = o0000.OooO00o(oO00O0o.color_FFFFFFF);
            ChatModel.MemberUpLevelModel memberUpLevelModel6 = model.getMemberUpLevelModel();
            Intrinsics.checkNotNull(memberUpLevelModel6);
            o000O0o.OooO0Oo(fixTextView2, iOooO00o2, memberUpLevelModel6.getUserName());
            Intrinsics.checkNotNullExpressionValue(fixTextView2, "binding.tvMessage");
            int iOooO00o3 = o0000.OooO00o(oO00O0o.color_EA6713);
            ChatModel.MemberUpLevelModel memberUpLevelModel7 = model.getMemberUpLevelModel();
            Intrinsics.checkNotNull(memberUpLevelModel7);
            o000O0o.OooO0O0(fixTextView2, iOooO00o3, memberUpLevelModel7.getUserName());
        }
        Intrinsics.checkNotNullExpressionValue(view2, "view");
        return view2;
    }

    public final View OooOO0O(int i) {
        return View.inflate(this.f49488OooO0Oo, i, null);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f49490OooO0o0.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        ChatModel chatModel = this.f49490OooO0o0.get(i);
        Intrinsics.checkNotNullExpressionValue(chatModel, "data[i]");
        return chatModel;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i) {
        ArrayList<ChatModel> arrayList = this.f49490OooO0o0;
        if (!(!arrayList.isEmpty())) {
            return -1;
        }
        ChatModel chatModel = i >= arrayList.size() ? arrayList.get(arrayList.size() - 1) : arrayList.get(i);
        if (chatModel != null) {
            return chatModel.getType();
        }
        return -1;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 31041. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // android.widget.Adapter
    @org.jetbrains.annotations.Nullable
    public final android.view.View getView(int r17, @org.jetbrains.annotations.Nullable android.view.View r18, @org.jetbrains.annotations.NotNull android.view.ViewGroup r19) {
        /*
            Method dump skipped, instruction units count: 3104
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p502o0o00oOO.o0oo0000.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return RoomChatType.viewTypeCount();
    }
}
