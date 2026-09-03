package p510o0o00oo0;

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
import p370o0OOo0Oo.Oooo000;
import p407o0Oo0OOO.o00OO000;
import p407o0Oo0OOO.o00OO0OO;
import p407o0Oo0OOO.o00OOO0;
import p407o0Oo0OOO.o00OOO00;
import p407o0Oo0OOO.o00OOOO0;
import p407o0Oo0OOO.o0o0Oo;
import p407o0Oo0OOO.oo0O;
import p425o0OoO0OO.o00O0O0;
import p474o0OoooOO.oo0oO0;
import p565o0oOo000.o000OOo;
import p565o0oOo000.o0OO00O;
import p565o0oOo000.o0ooOOo;
import p597o0oo00O.OooOOOO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomChatAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomChatAdapter.kt\ncom/yalla/yalla/ui/adapter/roomChat/RoomChatAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,581:1\n1#2:582\n*E\n"})
public final class o0o0000 extends BaseAdapter {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public Function1<? super Integer, Unit> f50661OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final MixedRoomActivity f50662OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final Lazy f50663OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final ArrayList<ChatModel> f50664OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public Function1<? super ChatModel, Unit> f50665OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public Function1<? super ChatModel, Unit> f50666OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public Function2<? super Integer, ? super Boolean, Unit> f50667OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public Function1<? super Integer, Unit> f50668OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public Function1<? super Integer, Unit> f50669OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public Function6<? super RoomUserInfoModel, ? super Integer, ? super Integer, ? super Integer, ? super Boolean, ? super ChatModel, Unit> f50670OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public Function5<? super Integer, ? super Integer, ? super Integer, ? super Boolean, ? super ChatModel, Unit> f50671OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @Nullable
    public Function2<? super String, ? super Boolean, Unit> f50672OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f50673OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f50674OooOOo0;

    public static final class OooO extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o0OO f50676OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f50677OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(int i, o0OO o0oo) {
            super(0);
            this.f50677OooO0o0 = i;
            this.f50676OooO0o = o0oo;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            oO000O0 onLogin = new oO000O0(o0o0000.this, this.f50677OooO0o0, this.f50676OooO0o);
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
            if (Intrinsics.areEqual(oo0oO0.OooOo0O().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
            } else {
                Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                if (activityOooO0O0 != null) {
                    int i = LoginActivity.f24734OooOo0O;
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
            if (giftBlindBoxNotify != null && (function5 = o0o0000.this.f50671OooOOO0) != null) {
                function5.invoke(1, Integer.valueOf(giftBlindBoxNotify.getRewardId()), Integer.valueOf(GiftPropTypeUser.Backpack.getValue()), Boolean.TRUE, chatModel2);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<ChatModel, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f50679OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o0o0000 f50680OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(int i, o0o0000 o0o0000Var) {
            super(1);
            this.f50679OooO0Oo = i;
            this.f50680OooO0o0 = o0o0000Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ChatModel chatModel) {
            ChatModel it = chatModel;
            Intrinsics.checkNotNullParameter(it, "it");
            oO0000Oo onLogin = new oO0000Oo(this.f50679OooO0Oo, this.f50680OooO0o0);
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
            if (Intrinsics.areEqual(oo0oO0.OooOo0O().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
            } else {
                Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                if (activityOooO0O0 != null) {
                    int i = LoginActivity.f24734OooOo0O;
                    LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<ChatModel, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f50681OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o0o0000 f50682OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(int i, o0o0000 o0o0000Var) {
            super(1);
            this.f50681OooO0Oo = i;
            this.f50682OooO0o0 = o0o0000Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ChatModel chatModel) {
            ChatModel it = chatModel;
            Intrinsics.checkNotNullParameter(it, "it");
            oO0000o0 onLogin = new oO0000o0(this.f50681OooO0Oo, this.f50682OooO0o0);
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
            if (Intrinsics.areEqual(oo0oO0.OooOo0O().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
            } else {
                Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                if (activityOooO0O0 != null) {
                    int i = LoginActivity.f24734OooOo0O;
                    LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0o0000 f50683OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f50684OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(int i, o0o0000 o0o0000Var) {
            super(0);
            this.f50683OooO0Oo = o0o0000Var;
            this.f50684OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            oO000 onLogin = new oO000(this.f50684OooO0o0, this.f50683OooO0Oo);
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
            if (Intrinsics.areEqual(oo0oO0.OooOo0O().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
            } else {
                Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                if (activityOooO0O0 != null) {
                    int i = LoginActivity.f24734OooOo0O;
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
            o0o0000 o0o0000Var = o0o0000.this;
            if (fFloatValue >= 1.0f) {
                o0o0000Var.f50674OooOOo0 = -1;
                o0o0000Var.f50673OooOOOo = false;
            } else {
                o0o0000Var.f50673OooOOOo = true;
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<o0OOOO0o> {
        public OooOO0O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0OOOO0o invoke() {
            return new o0OOOO0o(o0o0000.this.f50662OooO0Oo);
        }
    }

    public o0o0000(@NotNull MixedRoomActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f50662OooO0Oo = activity;
        this.f50664OooO0o0 = new ArrayList<>();
        this.f50663OooO0o = LazyKt.lazy(new OooOO0O());
        this.f50674OooOOo0 = -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View OooO(int i, View view) {
        View viewOooOO0 = view == null ? OooOO0(o0OO00O.chatline_member_up_level) : view;
        Object tag = view != null ? view.getTag() : null;
        ooOOO0Oo ooooo0oo = tag instanceof ooOOO0Oo ? (ooOOO0Oo) tag : null;
        if (ooooo0oo == null) {
            Intrinsics.checkNotNull(viewOooOO0);
            ooooo0oo = new ooOOO0Oo(viewOooOO0, this.f50662OooO0Oo);
            viewOooOO0.setTag(ooooo0oo);
        }
        ChatModel chatModel = this.f50664OooO0o0.get(i);
        Intrinsics.checkNotNullExpressionValue(chatModel, "get(...)");
        ChatModel model = chatModel;
        Intrinsics.checkNotNullParameter(model, "model");
        o00OOOO0 o00oooo1 = ooooo0oo.f50857OooO0OO;
        FixTextView fixTextView = o00oooo1.f44361OooO0O0;
        String strOooO0OO = o0000.OooO0OO(o000OOo.member_level_up_message);
        ChatModel.MemberUpLevelModel memberUpLevelModel = model.getMemberUpLevelModel();
        Intrinsics.checkNotNull(memberUpLevelModel);
        String strOooO00o = o0000O.OooO00o(strOooO0OO, memberUpLevelModel.getUserName());
        ChatModel.MemberUpLevelModel memberUpLevelModel2 = model.getMemberUpLevelModel();
        Intrinsics.checkNotNull(memberUpLevelModel2);
        fixTextView.setText(o0000O.OooO00o(strOooO00o, String.valueOf(memberUpLevelModel2.getLevel())));
        FixTextView tvMessage = o00oooo1.f44361OooO0O0;
        Intrinsics.checkNotNullExpressionValue(tvMessage, "tvMessage");
        ChatModel.MemberUpLevelModel memberUpLevelModel3 = model.getMemberUpLevelModel();
        Intrinsics.checkNotNull(memberUpLevelModel3);
        o000.OooO00o(tvMessage, memberUpLevelModel3.getUserName(), new oOo0o0oO(model));
        Intrinsics.checkNotNullExpressionValue(tvMessage, "tvMessage");
        int iOooO00o = o0000.OooO00o(o0ooOOo.color_FF7217);
        ChatModel.MemberUpLevelModel memberUpLevelModel4 = model.getMemberUpLevelModel();
        Intrinsics.checkNotNull(memberUpLevelModel4);
        o00O0O0.OooO0Oo(tvMessage, iOooO00o, memberUpLevelModel4.getUserName());
        ChatModel.MemberUpLevelModel memberUpLevelModel5 = model.getMemberUpLevelModel();
        Intrinsics.checkNotNull(memberUpLevelModel5);
        long userId = memberUpLevelModel5.getUserId();
        oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
        Long l = (Long) oo0oO0.OooOOo0().getValue();
        if (l != null && userId == l.longValue()) {
            Intrinsics.checkNotNullExpressionValue(tvMessage, "tvMessage");
            int iOooO00o2 = o0000.OooO00o(o0ooOOo.color_FFFFFFF);
            ChatModel.MemberUpLevelModel memberUpLevelModel6 = model.getMemberUpLevelModel();
            Intrinsics.checkNotNull(memberUpLevelModel6);
            o00O0O0.OooO0Oo(tvMessage, iOooO00o2, memberUpLevelModel6.getUserName());
            Intrinsics.checkNotNullExpressionValue(tvMessage, "tvMessage");
            int iOooO00o3 = o0000.OooO00o(o0ooOOo.color_EA6713);
            ChatModel.MemberUpLevelModel memberUpLevelModel7 = model.getMemberUpLevelModel();
            Intrinsics.checkNotNull(memberUpLevelModel7);
            o00O0O0.OooO0O0(tvMessage, iOooO00o3, memberUpLevelModel7.getUserName());
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
        View viewOooOO0 = view == null ? OooOO0(o0OO00O.chatline_gift_blind_notify) : view;
        Object tag = view != null ? view.getTag() : null;
        oO00OO0O oo00oo0o = tag instanceof oO00OO0O ? (oO00OO0O) tag : null;
        if (oo00oo0o == null) {
            Intrinsics.checkNotNull(viewOooOO0);
            oo00oo0o = new oO00OO0O(viewOooOO0, this.f50662OooO0Oo);
            viewOooOO0.setTag(oo00oo0o);
        }
        ChatModel chatModel = this.f50664OooO0o0.get(i);
        Intrinsics.checkNotNullExpressionValue(chatModel, "get(...)");
        ChatModel model = chatModel;
        Intrinsics.checkNotNullParameter(model, "model");
        Room.MessageBlindBoxNotify giftBlindBoxNotify = model.getGiftBlindBoxNotify();
        if (giftBlindBoxNotify != null) {
            OooOOOO.OooO0O0("RoomChatGiftBlindNotifyVH it = ".concat(p187o00o00o0.OooO.OooO00o(giftBlindBoxNotify)));
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
                oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
                num2 = (Integer) oo0oO0.OooOOO0().getValue();
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
                oo0oO0 oo0oo1 = oo0oO0.f47967OooO00o;
                num = (Integer) oo0oO0.OooOOO0().getValue();
            } while (!(num != null && region == num.intValue()));
            Room.MessageBlindBoxPropName messageBlindBoxPropName2 = (Room.MessageBlindBoxPropName) next2;
            String strOooOOO4 = (messageBlindBoxPropName2 == null || (text = messageBlindBoxPropName2.getText()) == null) ? null : o0OoOo0.OooOOO(text, "");
            String strOooOO0o = o0OoOo0.OooOO0o(Integer.valueOf(giftBlindBoxNotify.getRewardValue()), "");
            String strOooOO0o2 = o0OoOo0.OooOO0o(Integer.valueOf(giftBlindBoxNotify.getCoin()), "");
            int redirectType = giftBlindBoxNotify.getRedirectType();
            view2 = viewOooOO0;
            o00OO0OO o00oo0oo = oo00oo0o.f50724OooO0o;
            if (redirectType == 1) {
                oo0oO0 oo0oo2 = oo0oO0.f47967OooO00o;
                Long l = (Long) oo0oO0.OooOOo0().getValue();
                if (l != null && sendUserId == l.longValue()) {
                    ImageView ivArrow = o00oo0oo.f44351OooO0O0;
                    Intrinsics.checkNotNullExpressionValue(ivArrow, "ivArrow");
                    o000O.OooOOOO(ivArrow);
                } else {
                    ImageView ivArrow2 = o00oo0oo.f44351OooO0O0;
                    Intrinsics.checkNotNullExpressionValue(ivArrow2, "ivArrow");
                    o000O.OooO0O0(ivArrow2);
                }
            } else {
                ImageView ivArrow3 = o00oo0oo.f44351OooO0O0;
                Intrinsics.checkNotNullExpressionValue(ivArrow3, "ivArrow");
                o000O.OooO0O0(ivArrow3);
            }
            ImageView ivArrow4 = o00oo0oo.f44351OooO0O0;
            Intrinsics.checkNotNullExpressionValue(ivArrow4, "ivArrow");
            o000O.OooO(ivArrow4, new oOo00OO0(oo00oo0o, model));
            int rewardType = giftBlindBoxNotify.getRewardType();
            FixTextView tvMessage = o00oo0oo.f44352OooO0OO;
            if (rewardType == oo00oo0o.f50722OooO0OO) {
                tvMessage.setText(o0000O.OooO00o(o0000O.OooO00o(o0000O.OooO00o(o0000O.OooO00o(o0000O.OooO00o(o0000.OooO0OO(o000OOo.blind_gift_message_XXX1_XXX2_XXX3_XXX4_XXX5), strOooOOO), strOooOO0o), strOooOOO3), strOooOO0o2), strOooOOO4));
            } else if (rewardType == oo00oo0o.f50723OooO0Oo) {
                tvMessage.setText(o0000O.OooO00o(o0000O.OooO00o(o0000O.OooO00o(o0000O.OooO00o(o0000.OooO0OO(o000OOo.blind_gift_message_XXX1_XXX2_XXX3_XXX4), strOooOOO), strOooOOO2), strOooOOO3), strOooOO0o));
                Intrinsics.checkNotNullExpressionValue(tvMessage, "tvMessage");
                o00O0O0.OooO0Oo(tvMessage, o0000.OooO00o(o0ooOOo.color_FFF085), strOooOO0o);
            } else if (rewardType == oo00oo0o.f50725OooO0o0) {
                tvMessage.setText(o0000O.OooO00o(o0000O.OooO00o(o0000O.OooO00o(o0000.OooO0OO(o000OOo.blind_gift_message_XXX1_XXX2_XXX3), strOooOOO), strOooOOO3), strOooOO0o));
                Intrinsics.checkNotNullExpressionValue(tvMessage, "tvMessage");
                o00O0O0.OooO0Oo(tvMessage, o0000.OooO00o(o0ooOOo.color_FFF085), strOooOO0o);
            }
            Intrinsics.checkNotNullExpressionValue(tvMessage, "tvMessage");
            o00O0O0.OooO00o(tvMessage, strOooOOO, new oO00O0oO(sendUserId));
            oo0oO0 oo0oo3 = oo0oO0.f47967OooO00o;
            Long l2 = (Long) oo0oO0.OooOOo0().getValue();
            if (l2 != null && sendUserId == l2.longValue()) {
                Intrinsics.checkNotNullExpressionValue(tvMessage, "tvMessage");
                o00O0O0.OooO0Oo(tvMessage, o0000.OooO00o(o0ooOOo.color_FFFFFFF), strOooOOO);
                Intrinsics.checkNotNullExpressionValue(tvMessage, "tvMessage");
                o00O0O0.OooO0O0(tvMessage, o0000.OooO00o(o0ooOOo.color_EA6713), strOooOOO);
            } else {
                Intrinsics.checkNotNullExpressionValue(tvMessage, "tvMessage");
                o00O0O0.OooO0Oo(tvMessage, o0000.OooO00o(o0ooOOo.color_FF7217), strOooOOO);
            }
        } else {
            view2 = viewOooOO0;
        }
        oo00oo0o.f50726OooO0oO = new OooO00o();
        Intrinsics.checkNotNull(view2);
        return view2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View OooO0OO(int i, View view) {
        View viewOooOO0 = view == null ? OooOO0(o0OO00O.chatline_inrom_beconvened) : view;
        Object tag = view != null ? view.getTag() : null;
        oO00o00O oo00o00o = tag instanceof oO00o00O ? (oO00o00O) tag : null;
        if (oo00o00o == null) {
            Intrinsics.checkNotNull(viewOooOO0);
            oo00o00o = new oO00o00O(viewOooOO0, this.f50662OooO0Oo);
            viewOooOO0.setTag(oo00o00o);
        }
        ChatModel chatModel = this.f50664OooO0o0.get(i);
        Intrinsics.checkNotNullExpressionValue(chatModel, "get(...)");
        ChatModel model = chatModel;
        Intrinsics.checkNotNullParameter(model, "model");
        RoomUserInfoModel newFrom = model.getNewFrom();
        Intrinsics.checkNotNull(newFrom);
        String value = newFrom.getUserName().getValue();
        oo0O oo0o = oo00o00o.f50751OooO0OO;
        oo0o.f45287OooO0O0.setText(o0000O.OooO00o(o0000.OooO0OO(o000OOo.room_member_convene_room_chat_adapter_xxx), value));
        FixTextView tvMessage = oo0o.f45287OooO0O0;
        Intrinsics.checkNotNullExpressionValue(tvMessage, "tvMessage");
        o00O0O0.OooO00o(tvMessage, value, new oO0OOO00(model));
        RoomUserInfoModel newFrom2 = model.getNewFrom();
        Intrinsics.checkNotNull(newFrom2);
        long jLongValue = newFrom2.getUserId().getValue().longValue();
        oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
        Long l = (Long) oo0oO0.OooOOo0().getValue();
        if (l != null && jLongValue == l.longValue()) {
            Intrinsics.checkNotNullExpressionValue(tvMessage, "tvMessage");
            o00O0O0.OooO0Oo(tvMessage, o0000.OooO00o(o0ooOOo.color_FFFFFFF), value);
            Intrinsics.checkNotNullExpressionValue(tvMessage, "tvMessage");
            o00O0O0.OooO0O0(tvMessage, o0000.OooO00o(o0ooOOo.color_EA6713), value);
        } else {
            Intrinsics.checkNotNullExpressionValue(tvMessage, "tvMessage");
            o00O0O0.OooO0Oo(tvMessage, o0000.OooO00o(o0ooOOo.color_FF7217), value);
        }
        Intrinsics.checkNotNull(viewOooOO0);
        return viewOooOO0;
    }

    public final View OooO0Oo(int i, View view) {
        MutableStateFlow<String> userName;
        View viewOooOO0 = view == null ? OooOO0(o0OO00O.chatline_lucky_set_notification) : view;
        String value = null;
        Object tag = view != null ? view.getTag() : null;
        oO0O00O oo0o00o = tag instanceof oO0O00O ? (oO0O00O) tag : null;
        if (oo0o00o == null) {
            Intrinsics.checkNotNull(viewOooOO0);
            oo0o00o = new oO0O00O(viewOooOO0, this.f50662OooO0Oo);
            viewOooOO0.setTag(oo0o00o);
        }
        ChatModel chatModel = this.f50664OooO0o0.get(i);
        Intrinsics.checkNotNullExpressionValue(chatModel, "get(...)");
        ChatModel model = chatModel;
        Intrinsics.checkNotNullParameter(model, "model");
        String strValueOf = String.valueOf(model.getLucknum());
        int luckSetRole = model.getLuckSetRole();
        o00OOO0 o00ooo1 = oo0o00o.f50762OooO0OO;
        if (luckSetRole == 1) {
            o00ooo1.f44354OooO0O0.setText(o0000O.OooO00o(o0000.OooO0OO(o000OOo.room_lucky_number_save_for_host_xxx), strValueOf));
            FixTextView tvMessage = o00ooo1.f44354OooO0O0;
            Intrinsics.checkNotNullExpressionValue(tvMessage, "tvMessage");
            o00O0O0.OooO0Oo(tvMessage, o0000.OooO00o(o0ooOOo.color_FFE28B), strValueOf);
        } else {
            ArrayList arrayList = com.yalla.yalla.service.room.OooO00o.f24519OooO00o;
            RoomUserInfoModel roomUserInfoModelOooO0o0 = com.yalla.yalla.service.room.OooO00o.OooO0o0(Long.valueOf(model.getLuckSetRoleUserId()));
            if (roomUserInfoModelOooO0o0 != null && (userName = roomUserInfoModelOooO0o0.getUserName()) != null) {
                value = userName.getValue();
            }
            FixTextView fixTextView = o00ooo1.f44354OooO0O0;
            int i2 = o000OOo.room_lucky_number_save_for_manage_xxx1_xxx2;
            fixTextView.setText(o0000O.OooO00o(o0000.OooO0OO(i2), value, strValueOf));
            int iIndexOf = StringsKt__StringsKt.indexOf((CharSequence) o0000O.OooO00o(o0000.OooO0OO(i2), value), "XXX2", 0, true);
            int length = strValueOf.length() + iIndexOf;
            if (iIndexOf >= 0 && iIndexOf <= length) {
                FixTextView tvMessage2 = o00ooo1.f44354OooO0O0;
                if (tvMessage2.getText().length() > length) {
                    Intrinsics.checkNotNullExpressionValue(tvMessage2, "tvMessage");
                    int iOooO00o = o0000.OooO00o(o0ooOOo.color_FFE28B);
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
        View viewOooOO0 = view == null ? OooOO0(o0OO00O.chatline_contribution_up) : view;
        Object tag = view != null ? view.getTag() : null;
        oO000OOo oo000ooo = tag instanceof oO000OOo ? (oO000OOo) tag : null;
        if (oo000ooo == null) {
            Intrinsics.checkNotNull(viewOooOO0);
            oo000ooo = new oO000OOo(viewOooOO0, this.f50662OooO0Oo);
            viewOooOO0.setTag(oo000ooo);
        }
        ChatModel chatModel = this.f50664OooO0o0.get(i);
        Intrinsics.checkNotNullExpressionValue(chatModel, "get(...)");
        ChatModel model = chatModel;
        Intrinsics.checkNotNullParameter(model, "model");
        ChatModel.ContributionUpModel contributionUpModel = model.getContributionUpModel();
        if (contributionUpModel != null) {
            String strOooO00o = o0000O.OooO00o(o0000O.OooO00o(o0000.OooO0OO(contributionUpModel.getType() == 1 ? o000OOo.contribution_up_day : o000OOo.contribution_up_weekly), contributionUpModel.getUserName()), String.valueOf(contributionUpModel.getRank()));
            o00OO000 o00oo001 = oo000ooo.f50711OooO0OO;
            o00oo001.f44339OooO0O0.setText(strOooO00o);
            long userId = contributionUpModel.getUserId();
            oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
            Long l = (Long) oo0oO0.OooOOo0().getValue();
            FixTextView tvMessage = o00oo001.f44339OooO0O0;
            if (l != null && userId == l.longValue()) {
                Intrinsics.checkNotNullExpressionValue(tvMessage, "tvMessage");
                o00O0O0.OooO0O0(tvMessage, o0000.OooO00o(o0ooOOo.color_EA6713), contributionUpModel.getUserName());
            } else {
                Intrinsics.checkNotNullExpressionValue(tvMessage, "tvMessage");
                o00O0O0.OooO0Oo(tvMessage, o0000.OooO00o(o0ooOOo.color_FF7217), contributionUpModel.getUserName());
            }
            Intrinsics.checkNotNullExpressionValue(tvMessage, "tvMessage");
            o00O0O0.OooO0Oo(tvMessage, o0000.OooO00o(o0ooOOo.color_FFF085), o0000O.OooO00o(o0000.OooO0OO(o000OOo.Top_x), String.valueOf(contributionUpModel.getRank())));
            Intrinsics.checkNotNullExpressionValue(tvMessage, "tvMessage");
            o000O.OooO(tvMessage, new oO0Oo0oo(contributionUpModel));
        }
        Intrinsics.checkNotNull(viewOooOO0);
        return viewOooOO0;
    }

    public final View OooO0o0(int i, View view) {
        View viewOooOO0 = view == null ? OooOO0(o0OO00O.chatline_apply_mic_switch) : view;
        Object tag = view != null ? view.getTag() : null;
        oO0OoOO0 oo0oooo0 = tag instanceof oO0OoOO0 ? (oO0OoOO0) tag : null;
        if (oo0oooo0 == null) {
            Intrinsics.checkNotNull(viewOooOO0);
            oo0oooo0 = new oO0OoOO0(viewOooOO0, this.f50662OooO0Oo);
            viewOooOO0.setTag(oo0oooo0);
        }
        ChatModel chatModel = this.f50664OooO0o0.get(i);
        Intrinsics.checkNotNullExpressionValue(chatModel, "get(...)");
        ChatModel model = chatModel;
        Intrinsics.checkNotNullParameter(model, "model");
        if (model.getApplyMicSwitchModel() != null) {
            ChatModel.ApplyMicSwitchModel applyMicSwitchModel = model.getApplyMicSwitchModel();
            Intrinsics.checkNotNull(applyMicSwitchModel);
            RoomUserInfoModel switchUser = applyMicSwitchModel.getSwitchUser();
            int iIntValue = switchUser.getRoomMemberType().getValue().intValue();
            o00OOOO0 o00oooo1 = oo0oooo0.f50790OooO0OO;
            if (iIntValue == 1) {
                ChatModel.ApplyMicSwitchModel applyMicSwitchModel2 = model.getApplyMicSwitchModel();
                Intrinsics.checkNotNull(applyMicSwitchModel2);
                if (applyMicSwitchModel2.getIsOpen()) {
                    o00oooo1.f44361OooO0O0.setText(o0000.OooO0OO(o000OOo.room_owner_open_apply_mic));
                } else {
                    o00oooo1.f44361OooO0O0.setText(o0000.OooO0OO(o000OOo.room_owner_close_apply_mic));
                }
            } else {
                ChatModel.ApplyMicSwitchModel applyMicSwitchModel3 = model.getApplyMicSwitchModel();
                Intrinsics.checkNotNull(applyMicSwitchModel3);
                if (applyMicSwitchModel3.getIsOpen()) {
                    o00oooo1.f44361OooO0O0.setText(o0000O.OooO00o(o0000.OooO0OO(o000OOo.room_admin_XXX_open_apply_mic), switchUser.getUserName().getValue()));
                } else {
                    o00oooo1.f44361OooO0O0.setText(o0000O.OooO00o(o0000.OooO0OO(o000OOo.room_admin_XXX_close_apply_mic), switchUser.getUserName().getValue()));
                }
            }
        }
        Intrinsics.checkNotNull(viewOooOO0);
        return viewOooOO0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View OooO0oO(int i, View view) {
        View viewOooOO0 = view == null ? OooOO0(o0OO00O.chatline_intimacy_tip) : view;
        Object tag = view != null ? view.getTag() : null;
        oOo000o0 ooo000o0 = tag instanceof oOo000o0 ? (oOo000o0) tag : null;
        if (ooo000o0 == null) {
            Intrinsics.checkNotNull(viewOooOO0);
            ooo000o0 = new oOo000o0(viewOooOO0, this.f50662OooO0Oo);
            viewOooOO0.setTag(ooo000o0);
        }
        ChatModel chatModel = this.f50664OooO0o0.get(i);
        Intrinsics.checkNotNullExpressionValue(chatModel, "get(...)");
        ChatModel model = chatModel;
        Intrinsics.checkNotNullParameter(model, "model");
        oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
        String str = (String) oo0oO0.OooOOoo().getValue();
        if (str == null) {
            str = "";
        }
        o00OOO00 o00ooo00 = ooo000o0.f50834OooO0OO;
        o00ooo00.f44357OooO0OO.setText("@" + str + ZegoConstants.ZegoVideoDataAuxPublishingStream + o0000.OooO0OO(o000OOo.ower_invites_member_task));
        FixTextView tvMessage = o00ooo00.f44357OooO0OO;
        Intrinsics.checkNotNullExpressionValue(tvMessage, "tvMessage");
        o00O0O0.OooO00o(tvMessage, "@".concat(str), oO0OO00o.f50778OooO0Oo);
        boolean zOooO0o0 = p596o0oo000O.OooO0o.OooO0o0();
        ImageView iv = o00ooo00.f44356OooO0O0;
        if (zOooO0o0) {
            iv.setRotationY(180.0f);
        } else {
            iv.setRotationY(0.0f);
        }
        Intrinsics.checkNotNullExpressionValue(tvMessage, "tvMessage");
        o00O0O0.OooO0Oo(tvMessage, o0000.OooO00o(o0ooOOo.color_FFFFFFF), "@".concat(str));
        Intrinsics.checkNotNullExpressionValue(tvMessage, "tvMessage");
        o00O0O0.OooO0O0(tvMessage, o0000.OooO00o(o0ooOOo.color_EA6713), "@".concat(str));
        Intrinsics.checkNotNullExpressionValue(iv, "iv");
        o000O.OooO(iv, oOo0000O.f50832OooO0Oo);
        Intrinsics.checkNotNull(viewOooOO0);
        return viewOooOO0;
    }

    public final View OooO0oo(int i, View view) {
        View viewOooOO0 = view == null ? OooOO0(o0OO00O.chatline_member_share_task) : view;
        Object tag = view != null ? view.getTag() : null;
        oO0O0Oo0 oo0o0oo0 = tag instanceof oO0O0Oo0 ? (oO0O0Oo0) tag : null;
        if (oo0o0oo0 == null) {
            Intrinsics.checkNotNull(viewOooOO0);
            oo0o0oo0 = new oO0O0Oo0(viewOooOO0, this.f50662OooO0Oo);
            viewOooOO0.setTag(oo0o0oo0);
        }
        ChatModel chatModel = this.f50664OooO0o0.get(i);
        Intrinsics.checkNotNullExpressionValue(chatModel, "get(...)");
        ChatModel model = chatModel;
        Intrinsics.checkNotNullParameter(model, "model");
        o0o0Oo o0o0oo = oo0o0oo0.f50768OooO0OO;
        Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(o0o0oo.f44670OooO0O0.getContext());
        RoomUserInfoModel newFrom = model.getNewFrom();
        Intrinsics.checkNotNull(newFrom);
        oooO00o.f43127OooO0OO = p405o0Oo0OO.OooO0OO.OooO00o(newFrom.getUserHeader().getValue());
        oooO00o.f43125OooO00o = 0;
        oooO00o.f43144OooOo0 = true;
        NetImageView ivHeader = o0o0oo.f44670OooO0O0;
        oooO00o.OooO0Oo(ivHeader);
        String strOooO0OO = o0000.OooO0OO(o000OOo.x_shared_the_room);
        RoomUserInfoModel newFrom2 = model.getNewFrom();
        Intrinsics.checkNotNull(newFrom2);
        String strOooO00o = o0000O.OooO00o(strOooO0OO, newFrom2.getUserName().getValue());
        FixTextView tvMessage = o0o0oo.f44672OooO0Oo;
        tvMessage.setText(strOooO00o);
        Intrinsics.checkNotNullExpressionValue(tvMessage, "tvMessage");
        RoomUserInfoModel newFrom3 = model.getNewFrom();
        Intrinsics.checkNotNull(newFrom3);
        o000.OooO00o(tvMessage, newFrom3.getUserName().getValue(), new oO0O0(model));
        Intrinsics.checkNotNullExpressionValue(tvMessage, "tvMessage");
        int iOooO00o = o0000.OooO00o(o0ooOOo.color_FF7217);
        RoomUserInfoModel newFrom4 = model.getNewFrom();
        Intrinsics.checkNotNull(newFrom4);
        o000.OooO0O0(tvMessage, iOooO00o, newFrom4.getUserName().getValue());
        ImageView ivShare = o0o0oo.f44671OooO0OO;
        Intrinsics.checkNotNullExpressionValue(ivShare, "ivShare");
        o000O.OooO(ivShare, new oO0O0O0o(oo0o0oo0));
        Intrinsics.checkNotNullExpressionValue(ivHeader, "ivHeader");
        o000O.OooO(ivHeader, new oOo0oooO(model));
        Intrinsics.checkNotNull(viewOooOO0);
        return viewOooOO0;
    }

    public final View OooOO0(int i) {
        return View.inflate(this.f50662OooO0Oo, i, null);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f50664OooO0o0.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        ChatModel chatModel = this.f50664OooO0o0.get(i);
        Intrinsics.checkNotNullExpressionValue(chatModel, "get(...)");
        return chatModel;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i) {
        ArrayList<ChatModel> arrayList = this.f50664OooO0o0;
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
        throw new UnsupportedOperationException("Method not decompiled: p510o0o00oo0.o0o0000.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return RoomChatType.viewTypeCount();
    }
}
