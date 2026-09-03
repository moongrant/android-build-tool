package p509o0o00ooO;

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
import com.code.android.util.o000O;
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
import p368o0OOo0Oo.Oooo000;
import p405o0Oo0OOO.o00OO000;
import p405o0Oo0OOO.o00OO0OO;
import p405o0Oo0OOO.o00OOO0;
import p405o0Oo0OOO.o00OOO00;
import p405o0Oo0OOO.o00OOOO0;
import p405o0Oo0OOO.o0o0Oo;
import p405o0Oo0OOO.oo0O;
import p423o0OoO0OO.o00O0O0O;
import p475o0Ooooo0.o0O00oO0;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OOO0o;
import p562o0oOo000.oo0o0Oo;
import p595o0oo00O.OooOo00;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomChatAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomChatAdapter.kt\ncom/yalla/yalla/ui/adapter/roomChat/RoomChatAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,581:1\n1#2:582\n*E\n"})
public final class w1 extends BaseAdapter {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public Function1<? super Integer, Unit> f50851OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final MixedRoomActivity f50852OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final Lazy f50853OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final ArrayList<ChatModel> f50854OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public Function1<? super ChatModel, Unit> f50855OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public Function1<? super ChatModel, Unit> f50856OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public Function2<? super Integer, ? super Boolean, Unit> f50857OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public Function1<? super Integer, Unit> f50858OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public Function1<? super Integer, Unit> f50859OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public Function6<? super RoomUserInfoModel, ? super Integer, ? super Integer, ? super Integer, ? super Boolean, ? super ChatModel, Unit> f50860OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public Function5<? super Integer, ? super Integer, ? super Integer, ? super Boolean, ? super ChatModel, Unit> f50861OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @Nullable
    public Function2<? super String, ? super Boolean, Unit> f50862OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f50863OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f50864OooOOo0;

    public static final class OooO extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ p1 f50866OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f50867OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(int i, p1 p1Var) {
            super(0);
            this.f50867OooO0o0 = i;
            this.f50866OooO0o = p1Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            Function2<? super Integer, ? super Boolean, Unit> function2 = w1.this.f50857OooOO0;
            if (function2 != null) {
                function2.invoke(Integer.valueOf(this.f50867OooO0o0), Boolean.valueOf(this.f50866OooO0o.OooO0Oo()));
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
            if (giftBlindBoxNotify != null && (function5 = w1.this.f50861OooOOO0) != null) {
                function5.invoke(1, Integer.valueOf(giftBlindBoxNotify.getRewardId()), Integer.valueOf(GiftPropTypeUser.Backpack.getValue()), Boolean.TRUE, chatModel2);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<ChatModel, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f50869OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ w1 f50870OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(int i, w1 w1Var) {
            super(1);
            this.f50869OooO0Oo = i;
            this.f50870OooO0o0 = w1Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ChatModel chatModel) {
            ChatModel it = chatModel;
            Intrinsics.checkNotNullParameter(it, "it");
            e2 onLogin = new e2(this.f50869OooO0Oo, this.f50870OooO0o0);
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
            } else {
                Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                if (activityOooO0O0 != null) {
                    int i = LoginActivity.f24727OooOo0O;
                    LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<ChatModel, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f50871OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ w1 f50872OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(int i, w1 w1Var) {
            super(1);
            this.f50871OooO0Oo = i;
            this.f50872OooO0o0 = w1Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ChatModel chatModel) {
            ChatModel it = chatModel;
            Intrinsics.checkNotNullParameter(it, "it");
            f2 onLogin = new f2(this.f50871OooO0Oo, this.f50872OooO0o0);
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
            } else {
                Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                if (activityOooO0O0 != null) {
                    int i = LoginActivity.f24727OooOo0O;
                    LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ w1 f50873OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f50874OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(int i, w1 w1Var) {
            super(0);
            this.f50873OooO0Oo = w1Var;
            this.f50874OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            g2 onLogin = new g2(this.f50874OooO0o0, this.f50873OooO0Oo);
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
            } else {
                Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                if (activityOooO0O0 != null) {
                    int i = LoginActivity.f24727OooOo0O;
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
            w1 w1Var = w1.this;
            if (fFloatValue >= 1.0f) {
                w1Var.f50864OooOOo0 = -1;
                w1Var.f50863OooOOOo = false;
            } else {
                w1Var.f50863OooOOOo = true;
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<u1> {
        public OooOO0O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final u1 invoke() {
            return new u1(w1.this.f50852OooO0Oo);
        }
    }

    public w1(@NotNull MixedRoomActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f50852OooO0Oo = activity;
        this.f50854OooO0o0 = new ArrayList<>();
        this.f50853OooO0o = LazyKt.lazy(new OooOO0O());
        this.f50864OooOOo0 = -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View OooO(int i, View view) {
        View viewOooOO0 = view == null ? OooOO0(oo0o0Oo.chatline_member_up_level) : view;
        Object tag = view != null ? view.getTag() : null;
        c4 c4Var = tag instanceof c4 ? (c4) tag : null;
        if (c4Var == null) {
            Intrinsics.checkNotNull(viewOooOO0);
            c4Var = new c4(viewOooOO0, this.f50852OooO0Oo);
            viewOooOO0.setTag(c4Var);
        }
        ChatModel chatModel = this.f50854OooO0o0.get(i);
        Intrinsics.checkNotNullExpressionValue(chatModel, "get(...)");
        ChatModel model = chatModel;
        Intrinsics.checkNotNullParameter(model, "model");
        o00OOOO0 o00oooo1 = c4Var.f50645OooO0OO;
        FixTextView fixTextView = o00oooo1.f44363OooO0O0;
        String strOooO0OO = o0000.OooO0OO(o000000.member_level_up_message);
        ChatModel.MemberUpLevelModel memberUpLevelModel = model.getMemberUpLevelModel();
        Intrinsics.checkNotNull(memberUpLevelModel);
        String strOooO00o = o0000O.OooO00o(strOooO0OO, memberUpLevelModel.getUserName());
        ChatModel.MemberUpLevelModel memberUpLevelModel2 = model.getMemberUpLevelModel();
        Intrinsics.checkNotNull(memberUpLevelModel2);
        fixTextView.setText(o0000O.OooO00o(strOooO00o, String.valueOf(memberUpLevelModel2.getLevel())));
        FixTextView tvMessage = o00oooo1.f44363OooO0O0;
        Intrinsics.checkNotNullExpressionValue(tvMessage, "tvMessage");
        ChatModel.MemberUpLevelModel memberUpLevelModel3 = model.getMemberUpLevelModel();
        Intrinsics.checkNotNull(memberUpLevelModel3);
        o000.OooO00o(tvMessage, memberUpLevelModel3.getUserName(), new b4(model));
        Intrinsics.checkNotNullExpressionValue(tvMessage, "tvMessage");
        int iOooO00o = o0000.OooO00o(o0OOO0o.color_FF7217);
        ChatModel.MemberUpLevelModel memberUpLevelModel4 = model.getMemberUpLevelModel();
        Intrinsics.checkNotNull(memberUpLevelModel4);
        o00O0O0O.OooO0Oo(tvMessage, iOooO00o, memberUpLevelModel4.getUserName());
        ChatModel.MemberUpLevelModel memberUpLevelModel5 = model.getMemberUpLevelModel();
        Intrinsics.checkNotNull(memberUpLevelModel5);
        long userId = memberUpLevelModel5.getUserId();
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        Long l = (Long) o0O00oO0.OooOOo0().getValue();
        if (l != null && userId == l.longValue()) {
            Intrinsics.checkNotNullExpressionValue(tvMessage, "tvMessage");
            int iOooO00o2 = o0000.OooO00o(o0OOO0o.color_FFFFFFF);
            ChatModel.MemberUpLevelModel memberUpLevelModel6 = model.getMemberUpLevelModel();
            Intrinsics.checkNotNull(memberUpLevelModel6);
            o00O0O0O.OooO0Oo(tvMessage, iOooO00o2, memberUpLevelModel6.getUserName());
            Intrinsics.checkNotNullExpressionValue(tvMessage, "tvMessage");
            int iOooO00o3 = o0000.OooO00o(o0OOO0o.color_EA6713);
            ChatModel.MemberUpLevelModel memberUpLevelModel7 = model.getMemberUpLevelModel();
            Intrinsics.checkNotNull(memberUpLevelModel7);
            o00O0O0O.OooO0O0(tvMessage, iOooO00o3, memberUpLevelModel7.getUserName());
        }
        Intrinsics.checkNotNull(viewOooOO0);
        return viewOooOO0;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0144  */
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
        View viewOooOO0 = view == null ? OooOO0(oo0o0Oo.chatline_gift_blind_notify) : view;
        Object tag = view != null ? view.getTag() : null;
        x2 x2Var = tag instanceof x2 ? (x2) tag : null;
        if (x2Var == null) {
            Intrinsics.checkNotNull(viewOooOO0);
            x2Var = new x2(viewOooOO0, this.f50852OooO0Oo);
            viewOooOO0.setTag(x2Var);
        }
        ChatModel chatModel = this.f50854OooO0o0.get(i);
        Intrinsics.checkNotNullExpressionValue(chatModel, "get(...)");
        ChatModel model = chatModel;
        Intrinsics.checkNotNullParameter(model, "model");
        Room.MessageBlindBoxNotify giftBlindBoxNotify = model.getGiftBlindBoxNotify();
        if (giftBlindBoxNotify != null) {
            o0000O00.OooO0O0("RoomChatGiftBlindNotifyVH it = ".concat(p187o00o00o0.OooO.OooO00o(giftBlindBoxNotify)));
            String strOooOOO = o0OoOo0.OooOOO(giftBlindBoxNotify.getSendUserNick(), "");
            long sendUserId = giftBlindBoxNotify.getSendUserId();
            String strOooOOO2 = o0OoOo0.OooOOO(giftBlindBoxNotify.getGetUserNick(), "");
            giftBlindBoxNotify.getGetUserId();
            List<Room.MessageBlindBoxPropName> propNameTextList = giftBlindBoxNotify.getPropNameTextList();
            Intrinsics.checkNotNullExpressionValue(propNameTextList, "getPropNameTextList(...)");
            Iterator<T> it = propNameTextList.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                region2 = ((Room.MessageBlindBoxPropName) next).getRegion();
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                num2 = (Integer) o0O00oO0.OooOOO0().getValue();
            } while (!(num2 != null && region2 == num2.intValue()));
            Room.MessageBlindBoxPropName messageBlindBoxPropName = (Room.MessageBlindBoxPropName) next;
            String strOooOOO3 = (messageBlindBoxPropName == null || (text2 = messageBlindBoxPropName.getText()) == null) ? null : o0OoOo0.OooOOO(text2, "");
            List<Room.MessageBlindBoxPropName> rewardPropNameTextList = giftBlindBoxNotify.getRewardPropNameTextList();
            Intrinsics.checkNotNullExpressionValue(rewardPropNameTextList, "getRewardPropNameTextList(...)");
            Iterator<T> it2 = rewardPropNameTextList.iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                region = ((Room.MessageBlindBoxPropName) next2).getRegion();
                o0O00oO0 o0o00oo2 = o0O00oO0.f47936OooO00o;
                num = (Integer) o0O00oO0.OooOOO0().getValue();
            } while (!(num != null && region == num.intValue()));
            Room.MessageBlindBoxPropName messageBlindBoxPropName2 = (Room.MessageBlindBoxPropName) next2;
            String strOooOOO4 = (messageBlindBoxPropName2 == null || (text = messageBlindBoxPropName2.getText()) == null) ? null : o0OoOo0.OooOOO(text, "");
            String strOooOO0o = o0OoOo0.OooOO0o(Integer.valueOf(giftBlindBoxNotify.getRewardValue()), "");
            String strOooOO0o2 = o0OoOo0.OooOO0o(Integer.valueOf(giftBlindBoxNotify.getCoin()), "");
            int redirectType = giftBlindBoxNotify.getRedirectType();
            view2 = viewOooOO0;
            o00OO0OO o00oo0oo = x2Var.f50882OooO0o;
            if (redirectType == 1) {
                o0O00oO0 o0o00oo3 = o0O00oO0.f47936OooO00o;
                Long l = (Long) o0O00oO0.OooOOo0().getValue();
                if (l != null && sendUserId == l.longValue()) {
                    ImageView ivArrow = o00oo0oo.f44353OooO0O0;
                    Intrinsics.checkNotNullExpressionValue(ivArrow, "ivArrow");
                    o000O.OooOOOO(ivArrow);
                } else {
                    ImageView ivArrow2 = o00oo0oo.f44353OooO0O0;
                    Intrinsics.checkNotNullExpressionValue(ivArrow2, "ivArrow");
                    o000O.OooO0O0(ivArrow2);
                }
            } else {
                ImageView ivArrow3 = o00oo0oo.f44353OooO0O0;
                Intrinsics.checkNotNullExpressionValue(ivArrow3, "ivArrow");
                o000O.OooO0O0(ivArrow3);
            }
            ImageView ivArrow4 = o00oo0oo.f44353OooO0O0;
            Intrinsics.checkNotNullExpressionValue(ivArrow4, "ivArrow");
            o000O.OooO(ivArrow4, new v2(x2Var, model));
            int rewardType = giftBlindBoxNotify.getRewardType();
            FixTextView tvMessage = o00oo0oo.f44354OooO0OO;
            if (rewardType == x2Var.f50880OooO0OO) {
                tvMessage.setText(o0000O.OooO00o(o0000O.OooO00o(o0000O.OooO00o(o0000O.OooO00o(o0000O.OooO00o(o0000.OooO0OO(o000000.blind_gift_message_XXX1_XXX2_XXX3_XXX4_XXX5), strOooOOO), strOooOO0o), strOooOOO3), strOooOO0o2), strOooOOO4));
            } else if (rewardType == x2Var.f50881OooO0Oo) {
                tvMessage.setText(o0000O.OooO00o(o0000O.OooO00o(o0000O.OooO00o(o0000O.OooO00o(o0000.OooO0OO(o000000.blind_gift_message_XXX1_XXX2_XXX3_XXX4), strOooOOO), strOooOOO2), strOooOOO3), strOooOO0o));
                Intrinsics.checkNotNullExpressionValue(tvMessage, "tvMessage");
                o00O0O0O.OooO0Oo(tvMessage, o0000.OooO00o(o0OOO0o.color_FFF085), strOooOO0o);
            } else if (rewardType == x2Var.f50883OooO0o0) {
                tvMessage.setText(o0000O.OooO00o(o0000O.OooO00o(o0000O.OooO00o(o0000.OooO0OO(o000000.blind_gift_message_XXX1_XXX2_XXX3), strOooOOO), strOooOOO3), strOooOO0o));
                Intrinsics.checkNotNullExpressionValue(tvMessage, "tvMessage");
                o00O0O0O.OooO0Oo(tvMessage, o0000.OooO00o(o0OOO0o.color_FFF085), strOooOO0o);
            }
            Intrinsics.checkNotNullExpressionValue(tvMessage, "tvMessage");
            o00O0O0O.OooO00o(tvMessage, strOooOOO, new w2(sendUserId));
            o0O00oO0 o0o00oo4 = o0O00oO0.f47936OooO00o;
            Long l2 = (Long) o0O00oO0.OooOOo0().getValue();
            if (l2 != null && sendUserId == l2.longValue()) {
                Intrinsics.checkNotNullExpressionValue(tvMessage, "tvMessage");
                o00O0O0O.OooO0Oo(tvMessage, o0000.OooO00o(o0OOO0o.color_FFFFFFF), strOooOOO);
                Intrinsics.checkNotNullExpressionValue(tvMessage, "tvMessage");
                o00O0O0O.OooO0O0(tvMessage, o0000.OooO00o(o0OOO0o.color_EA6713), strOooOOO);
            } else {
                Intrinsics.checkNotNullExpressionValue(tvMessage, "tvMessage");
                o00O0O0O.OooO0Oo(tvMessage, o0000.OooO00o(o0OOO0o.color_FF7217), strOooOOO);
            }
        } else {
            view2 = viewOooOO0;
        }
        x2Var.f50884OooO0oO = new OooO00o();
        Intrinsics.checkNotNull(view2);
        return view2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View OooO0OO(int i, View view) {
        View viewOooOO0 = view == null ? OooOO0(oo0o0Oo.chatline_inrom_beconvened) : view;
        Object tag = view != null ? view.getTag() : null;
        h3 h3Var = tag instanceof h3 ? (h3) tag : null;
        if (h3Var == null) {
            Intrinsics.checkNotNull(viewOooOO0);
            h3Var = new h3(viewOooOO0, this.f50852OooO0Oo);
            viewOooOO0.setTag(h3Var);
        }
        ChatModel chatModel = this.f50854OooO0o0.get(i);
        Intrinsics.checkNotNullExpressionValue(chatModel, "get(...)");
        ChatModel model = chatModel;
        Intrinsics.checkNotNullParameter(model, "model");
        RoomUserInfoModel newFrom = model.getNewFrom();
        Intrinsics.checkNotNull(newFrom);
        String value = newFrom.getUserName().getValue();
        oo0O oo0o = h3Var.f50694OooO0OO;
        oo0o.f45264OooO0O0.setText(o0000O.OooO00o(o0000.OooO0OO(o000000.room_member_convene_room_chat_adapter_xxx), value));
        FixTextView tvMessage = oo0o.f45264OooO0O0;
        Intrinsics.checkNotNullExpressionValue(tvMessage, "tvMessage");
        o00O0O0O.OooO00o(tvMessage, value, new g3(model));
        RoomUserInfoModel newFrom2 = model.getNewFrom();
        Intrinsics.checkNotNull(newFrom2);
        long jLongValue = newFrom2.getUserId().getValue().longValue();
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        Long l = (Long) o0O00oO0.OooOOo0().getValue();
        if (l != null && jLongValue == l.longValue()) {
            Intrinsics.checkNotNullExpressionValue(tvMessage, "tvMessage");
            o00O0O0O.OooO0Oo(tvMessage, o0000.OooO00o(o0OOO0o.color_FFFFFFF), value);
            Intrinsics.checkNotNullExpressionValue(tvMessage, "tvMessage");
            o00O0O0O.OooO0O0(tvMessage, o0000.OooO00o(o0OOO0o.color_EA6713), value);
        } else {
            Intrinsics.checkNotNullExpressionValue(tvMessage, "tvMessage");
            o00O0O0O.OooO0Oo(tvMessage, o0000.OooO00o(o0OOO0o.color_FF7217), value);
        }
        Intrinsics.checkNotNull(viewOooOO0);
        return viewOooOO0;
    }

    public final View OooO0Oo(int i, View view) {
        MutableStateFlow<String> userName;
        View viewOooOO0 = view == null ? OooOO0(oo0o0Oo.chatline_lucky_set_notification) : view;
        String value = null;
        Object tag = view != null ? view.getTag() : null;
        t3 t3Var = tag instanceof t3 ? (t3) tag : null;
        if (t3Var == null) {
            Intrinsics.checkNotNull(viewOooOO0);
            t3Var = new t3(viewOooOO0, this.f50852OooO0Oo);
            viewOooOO0.setTag(t3Var);
        }
        ChatModel chatModel = this.f50854OooO0o0.get(i);
        Intrinsics.checkNotNullExpressionValue(chatModel, "get(...)");
        ChatModel model = chatModel;
        Intrinsics.checkNotNullParameter(model, "model");
        String strValueOf = String.valueOf(model.getLucknum());
        int luckSetRole = model.getLuckSetRole();
        o00OOO0 o00ooo1 = t3Var.f50819OooO0OO;
        if (luckSetRole == 1) {
            o00ooo1.f44356OooO0O0.setText(o0000O.OooO00o(o0000.OooO0OO(o000000.room_lucky_number_save_for_host_xxx), strValueOf));
            FixTextView tvMessage = o00ooo1.f44356OooO0O0;
            Intrinsics.checkNotNullExpressionValue(tvMessage, "tvMessage");
            o00O0O0O.OooO0Oo(tvMessage, o0000.OooO00o(o0OOO0o.color_FFE28B), strValueOf);
        } else {
            ArrayList arrayList = com.yalla.yalla.service.room.OooO00o.f24511OooO00o;
            RoomUserInfoModel roomUserInfoModelOooO0o0 = com.yalla.yalla.service.room.OooO00o.OooO0o0(Long.valueOf(model.getLuckSetRoleUserId()));
            if (roomUserInfoModelOooO0o0 != null && (userName = roomUserInfoModelOooO0o0.getUserName()) != null) {
                value = userName.getValue();
            }
            FixTextView fixTextView = o00ooo1.f44356OooO0O0;
            int i2 = o000000.room_lucky_number_save_for_manage_xxx1_xxx2;
            fixTextView.setText(o0000O.OooO00o(o0000.OooO0OO(i2), value, strValueOf));
            int iIndexOf = StringsKt__StringsKt.indexOf((CharSequence) o0000O.OooO00o(o0000.OooO0OO(i2), value), "XXX2", 0, true);
            int length = strValueOf.length() + iIndexOf;
            if (iIndexOf >= 0 && iIndexOf <= length) {
                FixTextView tvMessage2 = o00ooo1.f44356OooO0O0;
                if (tvMessage2.getText().length() > length) {
                    Intrinsics.checkNotNullExpressionValue(tvMessage2, "tvMessage");
                    int iOooO00o = o0000.OooO00o(o0OOO0o.color_FFE28B);
                    Intrinsics.checkNotNullParameter(tvMessage2, "<this>");
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tvMessage2.getText());
                    if (tvMessage2.length() > 0) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(iOooO00o), iIndexOf, length, 33);
                    }
                    tvMessage2.setText(spannableStringBuilder);
                }
            }
        }
        Intrinsics.checkNotNull(viewOooOO0);
        return viewOooOO0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View OooO0o(int i, View view) {
        View viewOooOO0 = view == null ? OooOO0(oo0o0Oo.chatline_contribution_up) : view;
        Object tag = view != null ? view.getTag() : null;
        m2 m2Var = tag instanceof m2 ? (m2) tag : null;
        if (m2Var == null) {
            Intrinsics.checkNotNull(viewOooOO0);
            m2Var = new m2(viewOooOO0, this.f50852OooO0Oo);
            viewOooOO0.setTag(m2Var);
        }
        ChatModel chatModel = this.f50854OooO0o0.get(i);
        Intrinsics.checkNotNullExpressionValue(chatModel, "get(...)");
        ChatModel model = chatModel;
        Intrinsics.checkNotNullParameter(model, "model");
        ChatModel.ContributionUpModel contributionUpModel = model.getContributionUpModel();
        if (contributionUpModel != null) {
            String strOooO00o = o0000O.OooO00o(o0000O.OooO00o(o0000.OooO0OO(contributionUpModel.getType() == 1 ? o000000.contribution_up_day : o000000.contribution_up_weekly), contributionUpModel.getUserName()), String.valueOf(contributionUpModel.getRank()));
            o00OO000 o00oo001 = m2Var.f50731OooO0OO;
            o00oo001.f44341OooO0O0.setText(strOooO00o);
            long userId = contributionUpModel.getUserId();
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            Long l = (Long) o0O00oO0.OooOOo0().getValue();
            FixTextView tvMessage = o00oo001.f44341OooO0O0;
            if (l != null && userId == l.longValue()) {
                Intrinsics.checkNotNullExpressionValue(tvMessage, "tvMessage");
                o00O0O0O.OooO0O0(tvMessage, o0000.OooO00o(o0OOO0o.color_EA6713), contributionUpModel.getUserName());
            } else {
                Intrinsics.checkNotNullExpressionValue(tvMessage, "tvMessage");
                o00O0O0O.OooO0Oo(tvMessage, o0000.OooO00o(o0OOO0o.color_FF7217), contributionUpModel.getUserName());
            }
            Intrinsics.checkNotNullExpressionValue(tvMessage, "tvMessage");
            o00O0O0O.OooO0Oo(tvMessage, o0000.OooO00o(o0OOO0o.color_FFF085), o0000O.OooO00o(o0000.OooO0OO(o000000.Top_x), String.valueOf(contributionUpModel.getRank())));
            Intrinsics.checkNotNullExpressionValue(tvMessage, "tvMessage");
            o000O.OooO(tvMessage, new l2(contributionUpModel));
        }
        Intrinsics.checkNotNull(viewOooOO0);
        return viewOooOO0;
    }

    public final View OooO0o0(int i, View view) {
        View viewOooOO0 = view == null ? OooOO0(oo0o0Oo.chatline_apply_mic_switch) : view;
        Object tag = view != null ? view.getTag() : null;
        k2 k2Var = tag instanceof k2 ? (k2) tag : null;
        if (k2Var == null) {
            Intrinsics.checkNotNull(viewOooOO0);
            k2Var = new k2(viewOooOO0, this.f50852OooO0Oo);
            viewOooOO0.setTag(k2Var);
        }
        ChatModel chatModel = this.f50854OooO0o0.get(i);
        Intrinsics.checkNotNullExpressionValue(chatModel, "get(...)");
        ChatModel model = chatModel;
        Intrinsics.checkNotNullParameter(model, "model");
        if (model.getApplyMicSwitchModel() != null) {
            ChatModel.ApplyMicSwitchModel applyMicSwitchModel = model.getApplyMicSwitchModel();
            Intrinsics.checkNotNull(applyMicSwitchModel);
            RoomUserInfoModel switchUser = applyMicSwitchModel.getSwitchUser();
            int iIntValue = switchUser.getRoomMemberType().getValue().intValue();
            o00OOOO0 o00oooo1 = k2Var.f50720OooO0OO;
            if (iIntValue == 1) {
                ChatModel.ApplyMicSwitchModel applyMicSwitchModel2 = model.getApplyMicSwitchModel();
                Intrinsics.checkNotNull(applyMicSwitchModel2);
                if (applyMicSwitchModel2.getIsOpen()) {
                    o00oooo1.f44363OooO0O0.setText(o0000.OooO0OO(o000000.room_owner_open_apply_mic));
                } else {
                    o00oooo1.f44363OooO0O0.setText(o0000.OooO0OO(o000000.room_owner_close_apply_mic));
                }
            } else {
                ChatModel.ApplyMicSwitchModel applyMicSwitchModel3 = model.getApplyMicSwitchModel();
                Intrinsics.checkNotNull(applyMicSwitchModel3);
                if (applyMicSwitchModel3.getIsOpen()) {
                    o00oooo1.f44363OooO0O0.setText(o0000O.OooO00o(o0000.OooO0OO(o000000.room_admin_XXX_open_apply_mic), switchUser.getUserName().getValue()));
                } else {
                    o00oooo1.f44363OooO0O0.setText(o0000O.OooO00o(o0000.OooO0OO(o000000.room_admin_XXX_close_apply_mic), switchUser.getUserName().getValue()));
                }
            }
        }
        Intrinsics.checkNotNull(viewOooOO0);
        return viewOooOO0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View OooO0oO(int i, View view) {
        View viewOooOO0 = view == null ? OooOO0(oo0o0Oo.chatline_intimacy_tip) : view;
        Object tag = view != null ? view.getTag() : null;
        o3 o3Var = tag instanceof o3 ? (o3) tag : null;
        if (o3Var == null) {
            Intrinsics.checkNotNull(viewOooOO0);
            o3Var = new o3(viewOooOO0, this.f50852OooO0Oo);
            viewOooOO0.setTag(o3Var);
        }
        ChatModel chatModel = this.f50854OooO0o0.get(i);
        Intrinsics.checkNotNullExpressionValue(chatModel, "get(...)");
        ChatModel model = chatModel;
        Intrinsics.checkNotNullParameter(model, "model");
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        String str = (String) o0O00oO0.OooOOoo().getValue();
        if (str == null) {
            str = "";
        }
        o00OOO00 o00ooo00 = o3Var.f50750OooO0OO;
        o00ooo00.f44359OooO0OO.setText("@" + str + ZegoConstants.ZegoVideoDataAuxPublishingStream + o0000.OooO0OO(o000000.ower_invites_member_task));
        FixTextView tvMessage = o00ooo00.f44359OooO0OO;
        Intrinsics.checkNotNullExpressionValue(tvMessage, "tvMessage");
        o00O0O0O.OooO00o(tvMessage, "@".concat(str), l3.f50728OooO0Oo);
        boolean zOooO0o0 = OooOo00.OooO0o0();
        ImageView iv = o00ooo00.f44358OooO0O0;
        if (zOooO0o0) {
            iv.setRotationY(180.0f);
        } else {
            iv.setRotationY(0.0f);
        }
        Intrinsics.checkNotNullExpressionValue(tvMessage, "tvMessage");
        o00O0O0O.OooO0Oo(tvMessage, o0000.OooO00o(o0OOO0o.color_FFFFFFF), "@".concat(str));
        Intrinsics.checkNotNullExpressionValue(tvMessage, "tvMessage");
        o00O0O0O.OooO0O0(tvMessage, o0000.OooO00o(o0OOO0o.color_EA6713), "@".concat(str));
        Intrinsics.checkNotNullExpressionValue(iv, "iv");
        o000O.OooO(iv, n3.f50744OooO0Oo);
        Intrinsics.checkNotNull(viewOooOO0);
        return viewOooOO0;
    }

    public final View OooO0oo(int i, View view) {
        View viewOooOO0 = view == null ? OooOO0(oo0o0Oo.chatline_member_share_task) : view;
        Object tag = view != null ? view.getTag() : null;
        a4 a4Var = tag instanceof a4 ? (a4) tag : null;
        if (a4Var == null) {
            Intrinsics.checkNotNull(viewOooOO0);
            a4Var = new a4(viewOooOO0, this.f50852OooO0Oo);
            viewOooOO0.setTag(a4Var);
        }
        ChatModel chatModel = this.f50854OooO0o0.get(i);
        Intrinsics.checkNotNullExpressionValue(chatModel, "get(...)");
        ChatModel model = chatModel;
        Intrinsics.checkNotNullParameter(model, "model");
        o0o0Oo o0o0oo = a4Var.f50630OooO0OO;
        Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(o0o0oo.f44667OooO0O0.getContext());
        RoomUserInfoModel newFrom = model.getNewFrom();
        Intrinsics.checkNotNull(newFrom);
        oooO00o.f43126OooO0OO = p403o0Oo0OO.OooO0OO.OooO00o(newFrom.getUserHeader().getValue());
        oooO00o.f43124OooO00o = 0;
        oooO00o.f43143OooOo0 = true;
        NetImageView ivHeader = o0o0oo.f44667OooO0O0;
        oooO00o.OooO0Oo(ivHeader);
        String strOooO0OO = o0000.OooO0OO(o000000.x_shared_the_room);
        RoomUserInfoModel newFrom2 = model.getNewFrom();
        Intrinsics.checkNotNull(newFrom2);
        String strOooO00o = o0000O.OooO00o(strOooO0OO, newFrom2.getUserName().getValue());
        FixTextView tvMessage = o0o0oo.f44669OooO0Oo;
        tvMessage.setText(strOooO00o);
        Intrinsics.checkNotNullExpressionValue(tvMessage, "tvMessage");
        RoomUserInfoModel newFrom3 = model.getNewFrom();
        Intrinsics.checkNotNull(newFrom3);
        o000.OooO00o(tvMessage, newFrom3.getUserName().getValue(), new w3(model));
        Intrinsics.checkNotNullExpressionValue(tvMessage, "tvMessage");
        int iOooO00o = o0000.OooO00o(o0OOO0o.color_FF7217);
        RoomUserInfoModel newFrom4 = model.getNewFrom();
        Intrinsics.checkNotNull(newFrom4);
        o000.OooO0O0(tvMessage, iOooO00o, newFrom4.getUserName().getValue());
        ImageView ivShare = o0o0oo.f44668OooO0OO;
        Intrinsics.checkNotNullExpressionValue(ivShare, "ivShare");
        o000O.OooO(ivShare, new y3(a4Var));
        Intrinsics.checkNotNullExpressionValue(ivHeader, "ivHeader");
        o000O.OooO(ivHeader, new z3(model));
        Intrinsics.checkNotNull(viewOooOO0);
        return viewOooOO0;
    }

    public final View OooOO0(int i) {
        return View.inflate(this.f50852OooO0Oo, i, null);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f50854OooO0o0.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        ChatModel chatModel = this.f50854OooO0o0.get(i);
        Intrinsics.checkNotNullExpressionValue(chatModel, "get(...)");
        return chatModel;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i) {
        ArrayList<ChatModel> arrayList = this.f50854OooO0o0;
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
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 31541. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // android.widget.Adapter
    @org.jetbrains.annotations.Nullable
    public final android.view.View getView(int r13, @org.jetbrains.annotations.Nullable android.view.View r14, @org.jetbrains.annotations.NotNull android.view.ViewGroup r15) {
        /*
            Method dump skipped, instruction units count: 3154
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p509o0o00ooO.w1.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return RoomChatType.viewTypeCount();
    }
}
