package com.yalla.yalla.ui.activity.message;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.android.billingclient.api.o0Oo0oo;
import com.app.base.application.App;
import com.app.base.base.activity.BaseActivity;
import com.app.base.model.RoomModel;
import com.app.base.model.UserInBarModel;
import com.app.base.protobuf.MessageIM;
import com.app.base.view.FacePanelView;
import com.app.base.view.HeaderLayout;
import com.code.android.util.ToastUtil;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.umeng.analytics.pro.ak;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.o00O0O;
import com.yalla.support.emojifaceutil.EmojiEditText;
import com.yalla.support.keyboardpanel.KeyBoardUtil$hideKeyboard$1;
import com.yalla.support.keyboardpanel.KeyBoardUtil$showKeyboard$1;
import com.yalla.support.keyboardpanel.panel.PanelLayout;
import com.yalla.yalla.common.db.table.ChatMessage;
import com.yalla.yalla.common.db.table.UserInfo;
import com.yalla.yalla.common.event.webEvent.EnterRoomParentPage;
import com.yalla.yalla.common.manager.PackManager;
import com.yalla.yalla.common.manager.RoomState;
import com.yalla.yalla.common.manager.RoomStateManager;
import com.yalla.yalla.common.manager.data.SharedGifFaceManager;
import com.yalla.yalla.common.model.ShopVehicleListModel;
import com.yalla.yalla.common.vm.UserBlackVM;
import com.yalla.yalla.model.GiftPropTypeShow;
import com.yalla.yalla.model.RoomUserInfoModel;
import com.yalla.yalla.ui.adapter.PrivateChatAdapter;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.vm.message.PrivateChatVM;
import com.yalla.yalla.ui.vm.moment.MomentVM;
import com.yalla.yalla.ui.vm.moment.YallaChatVM;
import java.util.Objects;
import java.util.Timer;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.Typography;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p143o00OOooO.o0000O;
import p143o00OOooO.o0000O00;
import p154o00Oo0oO.o000000O;
import p160o00OoOO.o00000O;
import p160o00OoOO.o00000OO;
import p160o00OoOO.o0000Ooo;
import p161o00OoOO0.o00OO0OO;
import p169o00Ooo0.o0O0O00;
import p169o00Ooo0.o0OOO0o;
import p255o00ooO0O.o000O0O0;
import p255o00ooO0O.o000Oo0;
import p255o00ooO0O.o00O000;
import p255o00ooO0O.o00O000o;
import p255o00ooO0O.o0O0ooO;
import p255o00ooO0O.oOO00O;
import p256o00ooO0o.oo0oOO0;
import p393o0OOooOo.o0O00000;
import p472o0Oooo0.o00O0000;
import p480o0OooooO.oO0o0o;
import p503o0o00o.o000O000;
import p503o0o00o.o00OO0O0;
import p518o0o0O000.o00000;
import p518o0o0O000.o0OO00O;
import p536o0o0OOo0.o0O000;
import p538o0o0OOoo.a0;
import p538o0o0OOoo.b0;
import p538o0o0OOoo.c0;
import p538o0o0OOoo.f0;
import p538o0o0OOoo.h0;
import p538o0o0OOoo.i0;
import p538o0o0OOoo.j0;
import p538o0o0OOoo.k0;
import p538o0o0OOoo.l;
import p538o0o0OOoo.l0;
import p538o0o0OOoo.m;
import p538o0o0OOoo.m0;
import p538o0o0OOoo.n;
import p538o0o0OOoo.n0;
import p538o0o0OOoo.q;
import p538o0o0OOoo.r;
import p538o0o0OOoo.s;
import p538o0o0OOoo.t;
import p538o0o0OOoo.u;
import p538o0o0OOoo.v;
import p538o0o0OOoo.w;
import p538o0o0OOoo.y;
import p581o0oOoOOo.d1;
import p625o0oo0oO0.o0000O0;
import p625o0oo0oO0.o0000oo;
import p651o0ooOOoo.bc;
import p702oO0Oo.o0000;
import p702oO0Oo.oo000o;
import p702oO0Oo.oo0o0Oo;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u000b"}, d2 = {"Lcom/yalla/yalla/ui/activity/message/PrivateChatActivity;", "Lcom/app/base/base/activity/BaseActivity;", "Landroid/view/View$OnClickListener;", "Landroid/media/MediaPlayer$OnCompletionListener;", "Landroid/view/View;", ak.aE, "", "onClick", "<init>", "()V", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class PrivateChatActivity extends BaseActivity implements MediaPlayer.OnCompletionListener {

    /* JADX INFO: renamed from: o0ooOOo, reason: collision with root package name */
    @NotNull
    public static final OooO00o f22185o0ooOOo = new OooO00o();

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public boolean f22187Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public boolean f22188OooooO0;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public boolean f22190OooooOo;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    @Nullable
    public o00O0000 f22193OoooooO;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    @Nullable
    public d1 f22196o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public boolean f22197o00Ooo;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    public boolean f22204oo000o;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @NotNull
    public final o00O000o f22186Ooooo00 = new o00O000o(Reflection.getOrCreateKotlinClass(bc.class), this, null);

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public boolean f22189OooooOO = true;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    @NotNull
    public final Lazy f22192Oooooo0 = LazyKt.lazy(new OooOO0O());

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    @NotNull
    public final Lazy f22191Oooooo = LazyKt.lazy(new OooO0o());

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    @NotNull
    public final Lazy f22194Ooooooo = LazyKt.lazy(new OooOo00());

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    @NotNull
    public final Lazy f22202o0OoOo0 = LazyKt.lazy(new OooOO0());

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    @NotNull
    public final Lazy f22205ooOO = LazyKt.lazy(new OooO());

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    @NotNull
    public final Lazy f22195o00O0O = LazyKt.lazy(new OooOOO0());

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    @NotNull
    public final oo0o0Oo f22198o00o0O = new oo0o0Oo(this);

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    @NotNull
    public final o0000 f22201o00ooo = new o0000(this);

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    @NotNull
    public final RoomUserInfoModel f22200o00oO0o = new RoomUserInfoModel();

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    @NotNull
    public String f22199o00oO0O = "";

    /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
    @NotNull
    public final Lazy f22203o0ooOO0 = LazyKt.lazy(new OooO0OO());

    public static final class OooO extends Lambda implements Function0<MomentVM> {
        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MomentVM invoke() {
            return (MomentVM) new ViewModelProvider(PrivateChatActivity.this).get(MomentVM.class);
        }
    }

    public static final class OooO00o {
        public final void OooO00o(@Nullable Context context, @Nullable Long l) {
            if (context == null || l == null) {
                return;
            }
            Intent intent = new Intent(context, (Class<?>) PrivateChatActivity.class);
            intent.putExtra(o00OOOO0.OooO00o.f31699OooO00o, l.longValue());
            context.startActivity(intent);
        }
    }

    public static final class OooO0O0 extends o00OO0OO.OooO0O0 {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ boolean f22208OooO0O0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(boolean z) {
            super(PrivateChatActivity.this);
            this.f22208OooO0O0 = z;
        }

        @Override // o00OoOO0.o00OO0OO.OooO0O0, o00OoOO0.o00OO0OO.OooO00o
        public final void onError(@NotNull String code2, @NotNull String message) {
            Intrinsics.checkNotNullParameter(code2, "code");
            Intrinsics.checkNotNullParameter(message, "message");
            if (1039 == o0O0O00.OooOO0o(code2)) {
                return;
            }
            super.onError(code2, message);
        }

        @Override // o00OoOO0.o00OO0OO.OooO0O0, o00OoOO0.o00OO0OO.OooO00o
        public final void onFinish(@NotNull String response) {
            UserInBarModel.DataBean dataBean;
            Intrinsics.checkNotNullParameter(response, "response");
            if (PrivateChatActivity.this.isFinishing()) {
                return;
            }
            UserInBarModel userInBarModel = (UserInBarModel) o0Oo0oo.OooO0O0(response, UserInBarModel.class);
            if (userInBarModel == null || !Intrinsics.areEqual("1000", userInBarModel.f11914code) || (dataBean = userInBarModel.data) == null) {
                PrivateChatActivity.this.Oooo00o().f49033OooO0o.f49595OooO0O0.setVisibility(8);
                return;
            }
            if (!userInBarModel.isinbar) {
                if (this.f22208OooO0O0) {
                    ToastUtil.f12582OooO00o.OooO0O0(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.notinroom));
                }
                PrivateChatActivity.this.Oooo00o().f49033OooO0o.f49595OooO0O0.setVisibility(8);
                return;
            }
            if (this.f22208OooO0O0) {
                String str = dataBean.roomserverip;
                RoomModel roomModel = new RoomModel();
                roomModel.setRoomIp(str);
                roomModel.setId(o0O0O00.OooOOO0(userInBarModel.data.barid));
                roomModel.setName(userInBarModel.data.barname);
                roomModel.setLevel(userInBarModel.data.barlevel);
                if (roomModel.getKinds() == 0 || roomModel.getKinds() == 1) {
                    RoomStateManager.INSTANCE.enterRoom(roomModel, EnterRoomParentPage.Message_Chat_lnRoom);
                    return;
                }
                return;
            }
            if (PrivateChatActivity.this.Oooo0O0().userInfo() != null) {
                PrivateChatActivity privateChatActivity = PrivateChatActivity.this;
                if (!privateChatActivity.f22187Ooooo0o || privateChatActivity.Oooo00o().f49036OooO0oo.f49794OooO0O0.getVisibility() == 0) {
                    return;
                }
                PrivateChatActivity privateChatActivity2 = PrivateChatActivity.this;
                if (privateChatActivity2.f22188OooooO0) {
                    return;
                }
                privateChatActivity2.Oooo00o().f49033OooO0o.f49595OooO0O0.setVisibility(0);
            }
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<o000O000> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o000O000 invoke() {
            return new o000O000(PrivateChatActivity.this, o00OO0O0.f41527OooO0O0, GiftPropTypeShow.InChat);
        }
    }

    public static final class OooO0o extends Lambda implements Function0<PrivateChatAdapter> {
        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final PrivateChatAdapter invoke() {
            return new PrivateChatAdapter(PrivateChatActivity.this);
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<PrivateChatVM> {
        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final PrivateChatVM invoke() {
            return (PrivateChatVM) new ViewModelProvider(PrivateChatActivity.this).get(PrivateChatVM.class);
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<oo0oOO0> {
        public OooOO0O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final oo0oOO0 invoke() {
            oo0oOO0 oo0ooo0 = new oo0oOO0(PrivateChatActivity.this);
            oo0oOO0.OooOoo0(oo0ooo0, false, 1, null);
            return oo0ooo0;
        }
    }

    public static final class OooOOO extends Lambda implements Function1<Boolean, Unit> {
        public OooOOO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            if (bool.booleanValue()) {
                PrivateChatActivity privateChatActivity = PrivateChatActivity.this;
                o0000 o0000Var = privateChatActivity.f22201o00ooo;
                o00O0000 o00o0001 = privateChatActivity.f22193OoooooO;
                Objects.requireNonNull(o0000Var);
                if (o00o0001 != null) {
                    o00o0001.OooO0OO();
                }
                bc bcVar = o0000Var.f52880OooO0O0;
                bc bcVar2 = null;
                if (bcVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    bcVar = null;
                }
                bcVar.f49034OooO0o0.f49489OooO0oO.setImageResource(R.drawable.icon_keyboard);
                bc bcVar3 = o0000Var.f52880OooO0O0;
                if (bcVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    bcVar3 = null;
                }
                bcVar3.f49035OooO0oO.f49688OooO0oo.setVisibility(0);
                bc bcVar4 = o0000Var.f52880OooO0O0;
                if (bcVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    bcVar4 = null;
                }
                bcVar4.f49035OooO0oO.f49687OooO0oO.setVisibility(8);
                bc bcVar5 = o0000Var.f52880OooO0O0;
                if (bcVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    bcVar5 = null;
                }
                bcVar5.f49035OooO0oO.f49685OooO0o.setImageResource(R.drawable.icon_voice_prepare);
                bc bcVar6 = o0000Var.f52880OooO0O0;
                if (bcVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    bcVar6 = null;
                }
                bcVar6.f49035OooO0oO.f49682OooO0O0.setVisibility(8);
                bc bcVar7 = o0000Var.f52880OooO0O0;
                if (bcVar7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    bcVar7 = null;
                }
                bcVar7.f49034OooO0o0.f49487OooO0o.setVisibility(8);
                bc bcVar8 = o0000Var.f52880OooO0O0;
                if (bcVar8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    bcVar2 = bcVar8;
                }
                bcVar2.f49034OooO0o0.f49488OooO0o0.setVisibility(0);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<UserBlackVM> {
        public OooOOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final UserBlackVM invoke() {
            return (UserBlackVM) new ViewModelProvider(PrivateChatActivity.this).get(UserBlackVM.class);
        }
    }

    public static final class OooOOOO extends Lambda implements Function0<Unit> {
        public OooOOOO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            PrivateChatActivity privateChatActivity = PrivateChatActivity.this;
            OooO00o oooO00o = PrivateChatActivity.f22185o0ooOOo;
            UserInfo value = privateChatActivity.Oooo0O0().getChatUserInfo().getValue();
            if (value != null) {
                long userId = value.getUserId();
                PrivateChatActivity privateChatActivity2 = PrivateChatActivity.this;
                PrivateChatActivity.OooOoo0(privateChatActivity2).friendYallaChat(userId).observe(privateChatActivity2, new o0000Ooo(privateChatActivity2, 2));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function0<YallaChatVM> {
        public OooOo00() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final YallaChatVM invoke() {
            return (YallaChatVM) new ViewModelProvider(PrivateChatActivity.this).get(YallaChatVM.class);
        }
    }

    public static final MomentVM OooOoO(PrivateChatActivity privateChatActivity) {
        return (MomentVM) privateChatActivity.f22205ooOO.getValue();
    }

    public static final oo0oOO0 OooOoOO(PrivateChatActivity privateChatActivity) {
        return (oo0oOO0) privateChatActivity.f22192Oooooo0.getValue();
    }

    public static final void OooOoo(PrivateChatActivity privateChatActivity, boolean z) {
        privateChatActivity.Oooo00o().f49034OooO0o0.f49484OooO0O0.setAlpha(z ? 1.0f : 0.5f);
        if (z) {
            return;
        }
        privateChatActivity.Oooo00o().f49034OooO0o0.f49484OooO0O0.clearFocus();
    }

    public static final YallaChatVM OooOoo0(PrivateChatActivity privateChatActivity) {
        return (YallaChatVM) privateChatActivity.f22194Ooooooo.getValue();
    }

    public final void OooOooO() {
        if (String.valueOf(Oooo00o().f49034OooO0o0.f49484OooO0O0.getText()).length() <= 0 || Oooo00o().f49035OooO0oO.f49688OooO0oo.getVisibility() == 0) {
            Oooo00o().f49034OooO0o0.f49487OooO0o.setVisibility(8);
            Oooo00o().f49034OooO0o0.f49488OooO0o0.setVisibility(0);
        } else {
            Oooo00o().f49034OooO0o0.f49487OooO0o.setVisibility(0);
            Oooo00o().f49034OooO0o0.f49488OooO0o0.setVisibility(8);
        }
    }

    public final void OooOooo(boolean z) {
        o000000O.OooO0OO(String.valueOf(Oooo0O0().getTargetId()), new OooO0O0(z));
    }

    public final PrivateChatAdapter Oooo0() {
        return (PrivateChatAdapter) this.f22191Oooooo.getValue();
    }

    public final void Oooo000() {
        if (isDestroyed() || isFinishing() || Oooo0O0().userInfo() == null || this.f22187Ooooo0o) {
            return;
        }
        this.f22190OooooOo = false;
        Oooo00o().f49032OooO0Oo.setVisibility(8);
        Oooo00o().f49034OooO0o0.f49490OooO0oo.setVisibility(0);
    }

    public final o000O000 Oooo00O() {
        return (o000O000) this.f22203o0ooOO0.getValue();
    }

    public final bc Oooo00o() {
        return (bc) this.f22186Ooooo00.getValue();
    }

    public final PrivateChatVM Oooo0O0() {
        return (PrivateChatVM) this.f22202o0OoOo0.getValue();
    }

    public final UserBlackVM Oooo0OO() {
        return (UserBlackVM) this.f22195o00O0O.getValue();
    }

    public final boolean Oooo0o() {
        if (Oooo0O0().userInfo() == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        UserInfo userInfo = Oooo0O0().userInfo();
        Intrinsics.checkNotNull(userInfo);
        sb.append(userInfo.getUserId());
        sb.append("");
        if (!o0000O.OooO00o(p500o0o00Oo0.OooOOO.f41235OooO00o, sb.toString())) {
            return true;
        }
        ToastUtil.f12582OooO00o.OooO0O0(getString(R.string.cannot_chat_self));
        return false;
    }

    public final void Oooo0o0(Intent intent) {
        Bundle extras = intent.getExtras();
        Intrinsics.checkNotNull(extras);
        long j = extras.getLong(o00OOOO0.OooO00o.f31699OooO00o, 0L);
        if (j != Oooo0O0().getTargetId()) {
            Oooo00o().f49034OooO0o0.f49484OooO0O0.setText((CharSequence) null);
        }
        Oooo0O0().setTargetId(j);
        if (Oooo0O0().getChatMessage() != null) {
            PrivateChatAdapter privateChatAdapterOooo0 = Oooo0();
            p466o0Ooo0oO.o0000O<Integer, ChatMessage> chatMessage = Oooo0O0().getChatMessage();
            Intrinsics.checkNotNull(chatMessage);
            privateChatAdapterOooo0.OooO0oO(chatMessage);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x002a  */
    public final void Oooo0oO() {
        boolean z;
        if (Intrinsics.areEqual(SharedGifFaceManager.INSTANCE.getContainsPayEmojiLiveData().getValue(), Boolean.TRUE)) {
            p499o0o00Oo.OooOOO0 oooOOO0 = p499o0o00Oo.OooOOO0.f41199OooO00o;
            if (Intrinsics.areEqual(p499o0o00Oo.OooOOO0.OooO0o0().OooOO0o().getValue(), Boolean.FALSE)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (!z || this.f22204oo000o) {
            ImageView imageView = Oooo00o().f49034OooO0o0.f49485OooO0OO;
            Intrinsics.checkNotNullExpressionValue(imageView, "mBinding.messageLayoutChatControl.faceRedPoint");
            oOO00O.OooO00o(imageView);
        } else {
            ImageView imageView2 = Oooo00o().f49034OooO0o0.f49485OooO0OO;
            Intrinsics.checkNotNullExpressionValue(imageView2, "mBinding.messageLayoutChatControl.faceRedPoint");
            o00O0O.OooO(imageView2);
        }
    }

    public final void Oooo0oo() {
        OooOOOO action = new OooOOOO();
        o0000oo notInstall = true & true ? o0000oo.f48659Oooo : null;
        Intrinsics.checkNotNullParameter(notInstall, "notInstall");
        Intrinsics.checkNotNullParameter(action, "action");
        if (PackManager.INSTANCE.isInstalledYallaChat()) {
            action.invoke();
        } else {
            notInstall.invoke();
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getMain(), null, new o0000O0.OooO00o.C0418OooO00o(null), 2, null);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        o00O0000 o00o0001 = this.f22193OoooooO;
        if (o00o0001 != null) {
            Intrinsics.checkNotNull(o00o0001);
            if (o00o0001.OooO0o0()) {
                return;
            }
        }
        super.onBackPressed();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0104  */
    /* JADX WARN: Code duplicated, block: B:42:0x011a  */
    /* JADX WARN: Code duplicated, block: B:44:0x012e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0132  */
    /* JADX WARN: Code duplicated, block: B:46:0x013a  */
    /* JADX WARN: Code duplicated, block: B:49:0x013e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0155  */
    @Override // com.app.base.base.activity.BaseFragmentActivity, android.view.View.OnClickListener
    public void onClick(@NotNull View v) {
        String string;
        String string2;
        ToastUtil toastUtil;
        o0O0ooO o0o0oooOooO0O0;
        Intrinsics.checkNotNullParameter(v, "v");
        boolean z = false;
        boolean z2 = true;
        switch (v.getId()) {
            case R.id.btInRoom /* 2131296515 */:
                OooOooo(true);
                break;
            case R.id.ivGiftChat /* 2131297663 */:
                o0O00000.OooO0OO("Message_chat_gift");
                this.f22201o00ooo.OooO00o();
                oo0O.OooO0OO.f53343OooO00o.OooO0Oo(false);
                o00O0000 o00o0001 = this.f22193OoooooO;
                if (o00o0001 != null) {
                    Intrinsics.checkNotNull(o00o0001);
                    o00o0001.OooO0OO();
                }
                o000O000 o000o000Oooo00O = Oooo00O();
                o000o000Oooo00O.f41457OooOO0O = new l0(this, o000o000Oooo00O);
                o000o000Oooo00O.f41458OooOO0o = new m0(this);
                o000o000Oooo00O.f41460OooOOO0 = new n0(this);
                UserInfo userInfo = Oooo0O0().userInfo();
                if (userInfo != null) {
                    this.f22200o00oO0o.setUserId(userInfo.getUserId());
                    this.f22200o00oO0o.setUserName(userInfo.getUserName());
                    this.f22200o00oO0o.setUserHeader(userInfo.getUserHeader());
                    if (this.f22187Ooooo0o) {
                        this.f22190OooooOo = true;
                        Oooo00o().f49032OooO0Oo.setVisibility(0);
                        Oooo00o().f49034OooO0o0.f49490OooO0oo.setVisibility(8);
                    }
                }
                if (com.yalla.support.common.util.OooO0OO.OooO0O0(this.f22199o00oO0O)) {
                    this.f22200o00oO0o.setUserName(this.f22199o00oO0O);
                }
                Oooo00O().OooOoO0(this.f22200o00oO0o);
                Oooo00O().OooOOO0();
                break;
            case R.id.ivInRoomClose /* 2131297696 */:
                this.f22188OooooO0 = true;
                Oooo00o().f49033OooO0o.f49595OooO0O0.setVisibility(8);
                break;
            case R.id.ivSendChat /* 2131297797 */:
                if (Oooo0O0().userInfo() != null) {
                    UserInfo userInfo2 = Oooo0O0().userInfo();
                    Intrinsics.checkNotNull(userInfo2);
                    if (userInfo2.getUserId() != 0 && Oooo0o()) {
                        String strValueOf = String.valueOf(Oooo00o().f49034OooO0o0.f49484OooO0O0.getText());
                        int length = strValueOf.length() - 1;
                        int i = 0;
                        boolean z3 = false;
                        while (i <= length) {
                            boolean z4 = Intrinsics.compare((int) strValueOf.charAt(!z3 ? i : length), 32) <= 0;
                            if (z3) {
                                if (!z4) {
                                    if (TextUtils.isEmpty(strValueOf.subSequence(i, length + 1).toString())) {
                                        string2 = getString(R.string.illegal_empty_msg);
                                        toastUtil = ToastUtil.f12583OooO0O0;
                                        if (string2 != null && !StringsKt.isBlank(string2)) {
                                            z2 = false;
                                        }
                                        if (!z2) {
                                            o0o0oooOooO0O0 = p074o000O0oo.OooOOO.OooO0O0(toastUtil, string2, "runnable");
                                            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                                o0o0oooOooO0O0.run();
                                            } else {
                                                o00O000 o00o001 = o00O000.f34368OooO00o;
                                                o00O000.f34370OooO0OO.post(o0o0oooOooO0O0);
                                            }
                                        }
                                    } else {
                                        z = true;
                                    }
                                    if (!z) {
                                        string = Oooo00o().f49034OooO0o0.f49484OooO0O0.getTransformedText().toString();
                                        if (com.yalla.support.common.util.OooO0OO.OooO00o(string)) {
                                            Oooo0O0().sendTextMessage(string);
                                            Oooo00o().f49034OooO0o0.f49484OooO0O0.setText((CharSequence) null);
                                            break;
                                        }
                                    }
                                } else {
                                    length--;
                                }
                            } else if (z4) {
                                i++;
                            } else {
                                z3 = true;
                            }
                        }
                        if (TextUtils.isEmpty(strValueOf.subSequence(i, length + 1).toString())) {
                            string2 = getString(R.string.illegal_empty_msg);
                            toastUtil = ToastUtil.f12583OooO0O0;
                            if (string2 != null) {
                                z2 = false;
                            }
                            if (!z2) {
                                o0o0oooOooO0O0 = p074o000O0oo.OooOOO.OooO0O0(toastUtil, string2, "runnable");
                                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                    o0o0oooOooO0O0.run();
                                } else {
                                    o00O000 o00o002 = o00O000.f34368OooO00o;
                                    o00O000.f34370OooO0OO.post(o0o0oooOooO0O0);
                                }
                            }
                        } else {
                            z = true;
                        }
                        if (!z) {
                            string = Oooo00o().f49034OooO0o0.f49484OooO0O0.getTransformedText().toString();
                            if (com.yalla.support.common.util.OooO0OO.OooO00o(string)) {
                                Oooo0O0().sendTextMessage(string);
                                Oooo00o().f49034OooO0o0.f49484OooO0O0.setText((CharSequence) null);
                                break;
                            }
                        }
                    }
                }
                break;
            case R.id.ivVoiceChat /* 2131297850 */:
                if (Oooo00o().f49035OooO0oO.f49688OooO0oo.getVisibility() != 8) {
                    EmojiEditText view = Oooo00o().f49034OooO0o0.f49484OooO0O0;
                    Intrinsics.checkNotNullExpressionValue(view, "mBinding.messageLayoutChatControl.etMessage");
                    Intrinsics.checkNotNullParameter(view, "view");
                    Context context = view.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "view.context");
                    InputMethodManager inputMethodManagerOooO00o = p472o0Oooo0.o00O000.OooO00o(context);
                    view.setFocusable(true);
                    view.setFocusableInTouchMode(true);
                    view.requestFocus();
                    Context context2 = view.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "view.context");
                    inputMethodManagerOooO00o.showSoftInput(view, 2, new KeyBoardUtil$showKeyboard$1(context2.getApplicationContext(), new Handler()));
                    this.f22201o00ooo.OooO00o();
                    OooOooO();
                } else {
                    o0O00000.OooO0OO("Message_chat_voice");
                    p620o0oo0o0.o0O0O00.OooO0OO(this, p620o0oo0o0.oo0o0Oo.f48623OooO00o, null, new OooOOO());
                }
                break;
            case R.id.ivWarnClose /* 2131297865 */:
                Oooo0O0().updateRiskFriend();
                Oooo00o().f49036OooO0oo.f49794OooO0O0.setVisibility(8);
                break;
        }
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(@NotNull MediaPlayer mp) {
        Intrinsics.checkNotNullParameter(mp, "mp");
        Oooo0().OooOOOo();
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "window");
        int i = 0;
        oO0o0o.OooO0Oo(window, 0);
        setContentView(Oooo00o().f49029OooO00o);
        o0O00000.OooO0OO("Message_chat");
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type com.app.base.base.activity.IComposeDialog");
        int i2 = 1;
        showDialog((String) null, p043OooooO0.o00O0000.OooO0O0(-605407946, true, new y(this)));
        final oo0o0Oo oo0o0oo = this.f22198o00o0O;
        final bc mBinding = Oooo00o();
        final UserBlackVM userBlackVM = Oooo0OO();
        final PrivateChatVM privateChatVM = Oooo0O0();
        final PrivateChatAdapter chatAdapter = Oooo0();
        Objects.requireNonNull(oo0o0oo);
        Intrinsics.checkNotNullParameter(mBinding, "mBinding");
        Intrinsics.checkNotNullParameter(userBlackVM, "userBlackVM");
        Intrinsics.checkNotNullParameter(privateChatVM, "privateChatVM");
        Intrinsics.checkNotNullParameter(chatAdapter, "chatAdapter");
        final HeaderLayout headerLayout = mBinding.f49030OooO0O0.f49272OooO0O0;
        Intrinsics.checkNotNullExpressionValue(headerLayout, "mBinding.baseHeaderLayout.headerLayout");
        oO0o0o.OooO00o(headerLayout, true, true);
        headerLayout.setNavigationOnClickListener(new oo000o(oo0o0oo, i));
        privateChatVM.isFriendLiveData().observe(oo0o0oo.f52936OooO00o, new Observer() { // from class: oO0Oo.o00oO0o
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                HeaderLayout headerLayout2 = headerLayout;
                bc mBinding2 = mBinding;
                oo0o0Oo this$0 = oo0o0oo;
                UserBlackVM userBlackVM2 = userBlackVM;
                PrivateChatVM privateChatVM2 = privateChatVM;
                PrivateChatAdapter chatAdapter2 = chatAdapter;
                Boolean it = (Boolean) obj;
                Intrinsics.checkNotNullParameter(headerLayout2, "$headerLayout");
                Intrinsics.checkNotNullParameter(mBinding2, "$mBinding");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(userBlackVM2, "$userBlackVM");
                Intrinsics.checkNotNullParameter(privateChatVM2, "$privateChatVM");
                Intrinsics.checkNotNullParameter(chatAdapter2, "$chatAdapter");
                Intrinsics.checkNotNullExpressionValue(it, "it");
                if (it.booleanValue()) {
                    headerLayout2.OooOoOO(R.drawable.ic_toolbar_more_white, new o0Oo0oo(mBinding2, this$0, userBlackVM2, headerLayout2, privateChatVM2, chatAdapter2));
                } else {
                    headerLayout2.OooOoOO(R.drawable.icon_message_profile, new o0OO00O(mBinding2, this$0, privateChatVM2));
                }
            }
        });
        this.f11480OoooOOO = headerLayout;
        Oooo00o().f49033OooO0o.f49595OooO0O0.setVisibility(8);
        Button button = (Button) findViewById(R.id.btInRoom);
        ImageView imageView = (ImageView) findViewById(R.id.ivInRoomClose);
        button.setOnClickListener(this);
        imageView.setOnClickListener(this);
        Oooo00o().f49036OooO0oo.f49794OooO0O0.setVisibility(8);
        TextView textView = (TextView) findViewById(R.id.tvWarn);
        String string = getString(R.string.private_chat_warning);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.private_chat_warning)");
        String string2 = getString(R.string.report);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.report)");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(p016OooOoO0.OooOo00.OooO00o(string, string2));
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) p016OooOoO0.OooOo00.OooO00o(string, string2), string2, 0, false, 6, (Object) null);
        spannableStringBuilder.setSpan(new k0(this), iIndexOf$default, string2.length() + iIndexOf$default, 33);
        textView.setText(spannableStringBuilder);
        textView.setMovementMethod(o0OO00O.f42136OooO0O0.OooO00o());
        textView.setHighlightColor(getResources().getColor(android.R.color.transparent));
        ((ImageView) findViewById(R.id.ivWarnClose)).setOnClickListener(this);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.flChat);
        Oooo00o().f49032OooO0Oo.setOnClickListener(new l(this, 0));
        FixLinearLayoutManager fixLinearLayoutManager = new FixLinearLayoutManager(this);
        fixLinearLayoutManager.setReverseLayout(true);
        Oooo00o().f49028OooO.setLayoutManager(fixLinearLayoutManager);
        Oooo0().f23666OooOoOO = new a0(this);
        Oooo00o().f49028OooO.setAdapter(Oooo0());
        frameLayout.setOnTouchListener(new m(this, 0));
        RecyclerView recyclerView = Oooo00o().f49028OooO;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "mBinding.rvChat");
        o00000.OooO0O0(recyclerView, 100L, 0L, 100L, 100L);
        Oooo0().OooO0o0(new b0(this));
        Oooo00o().f49028OooO.addOnScrollListener(new c0(this));
        PrivateChatAdapter privateChatAdapterOooo0 = Oooo0();
        f0 listener = new f0(this);
        Objects.requireNonNull(privateChatAdapterOooo0);
        Intrinsics.checkNotNullParameter(listener, "listener");
        privateChatAdapterOooo0.f40476OooOO0o = listener;
        PrivateChatAdapter privateChatAdapterOooo1 = Oooo0();
        h0 listener2 = new h0(this);
        Objects.requireNonNull(privateChatAdapterOooo1);
        Intrinsics.checkNotNullParameter(listener2, "listener");
        privateChatAdapterOooo1.f40477OooOOO = listener2;
        PrivateChatAdapter privateChatAdapterOooo2 = Oooo0();
        i0 listener3 = new i0(this);
        Objects.requireNonNull(privateChatAdapterOooo2);
        Intrinsics.checkNotNullParameter(listener3, "listener");
        privateChatAdapterOooo2.f23660OooOo0 = listener3;
        PrivateChatAdapter privateChatAdapterOooo3 = Oooo0();
        j0 listener4 = new j0(this);
        Objects.requireNonNull(privateChatAdapterOooo3);
        Intrinsics.checkNotNullParameter(listener4, "listener");
        privateChatAdapterOooo3.f23662OooOo0O = listener4;
        p499o0o00Oo.OooOOO0 oooOOO0 = p499o0o00Oo.OooOOO0.f41199OooO00o;
        p499o0o00Oo.OooOOO0.OooO0o0().OooOO0o().observe(this, new o0O000(this, i2));
        SharedGifFaceManager.INSTANCE.getContainsPayEmojiLiveData().observe(this, new n(this, i));
        Oooo00o().f49034OooO0o0.f49489OooO0oO.setOnClickListener(this);
        Oooo00o().f49034OooO0o0.f49484OooO0O0.setMaxContentLength(ShopVehicleListModel.VehicleTagType_Vip300);
        Oooo00o().f49034OooO0o0.f49484OooO0O0.setMaxContentTips(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.char_room_text_lenght));
        Oooo00o().f49034OooO0o0.f49484OooO0O0.setMaxEmojiCount(50);
        Oooo00o().f49034OooO0o0.f49484OooO0O0.setMaxEmojiCountTips(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.char_room_edit1));
        Oooo00o().f49034OooO0o0.f49484OooO0O0.addTextChangedListener(new q(this));
        PanelLayout panelLayout = (PanelLayout) findViewById(R.id.panelLayout);
        Intrinsics.checkNotNullExpressionValue(panelLayout, "panelLayout");
        EmojiEditText emojiEditText = Oooo00o().f49034OooO0o0.f49484OooO0O0;
        Intrinsics.checkNotNullExpressionValue(emojiEditText, "mBinding.messageLayoutChatControl.etMessage");
        o00O0000 o00o0001 = new o00O0000(panelLayout, emojiEditText);
        ImageView imageView2 = Oooo00o().f49034OooO0o0.f49486OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(imageView2, "mBinding.messageLayoutChatControl.ivFaceChat");
        o00o0001.OooO0O0(imageView2);
        this.f22193OoooooO = o00o0001;
        Intrinsics.checkNotNull(o00o0001);
        o00o0001.f40642OooO0O0 = new r(this);
        o00O0000 o00o0002 = this.f22193OoooooO;
        Intrinsics.checkNotNull(o00o0002);
        o00o0002.f40641OooO00o = new s(this);
        Oooo00o().f49034OooO0o0.f49490OooO0oo.setOnClickListener(new t(this));
        FacePanelView facePanelView = Oooo00o().f49031OooO0OO;
        EmojiEditText emojiEditText2 = Oooo00o().f49034OooO0o0.f49484OooO0O0;
        Intrinsics.checkNotNullExpressionValue(emojiEditText2, "mBinding.messageLayoutChatControl.etMessage");
        facePanelView.OooO0O0(emojiEditText2, new u(this));
        Oooo00o().f49031OooO0OO.setOnSendStickerMessageListener(new v(this));
        Oooo00o().f49031OooO0OO.setOnSendGifMessageListener(new w(this));
        Oooo00o().f49034OooO0o0.f49488OooO0o0.setOnClickListener(this);
        Oooo00o().f49034OooO0o0.f49487OooO0o.setOnClickListener(this);
        final o0000 o0000Var = this.f22201o00ooo;
        bc binding = Oooo00o();
        final PrivateChatVM privateChatVM2 = Oooo0O0();
        Objects.requireNonNull(o0000Var);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(privateChatVM2, "privateChatVM");
        o0000Var.f52880OooO0O0 = binding;
        if (binding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            binding = null;
        }
        binding.f49035OooO0oO.f49685OooO0o.setOnTouchListener(new View.OnTouchListener() { // from class: oO0Oo.o000000O
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                o0000 this$0 = o0000Var;
                PrivateChatVM privateChatVM3 = privateChatVM2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(privateChatVM3, "$privateChatVM");
                Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
                int action = motionEvent.getAction();
                bc bcVar = null;
                if (action == 0) {
                    bc bcVar2 = this$0.f52880OooO0O0;
                    if (bcVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        bcVar2 = null;
                    }
                    bcVar2.f49035OooO0oO.f49687OooO0oO.setVisibility(0);
                    bc bcVar3 = this$0.f52880OooO0O0;
                    if (bcVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        bcVar3 = null;
                    }
                    bcVar3.f49035OooO0oO.f49682OooO0O0.setVisibility(8);
                    bc bcVar4 = this$0.f52880OooO0O0;
                    if (bcVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        bcVar4 = null;
                    }
                    bcVar4.f49035OooO0oO.f49685OooO0o.setImageResource(R.drawable.icon_voice_recording);
                    bc bcVar5 = this$0.f52880OooO0O0;
                    if (bcVar5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        bcVar5 = null;
                    }
                    TextView textView2 = bcVar5.f49035OooO0oO.f49689OooOO0;
                    StringBuilder sb = new StringBuilder();
                    sb.append(o000Oo0.OooO0Oo(Float.valueOf(30.0f)));
                    sb.append(Typography.quote);
                    textView2.setText(sb.toString());
                    o0000Ooo o0000ooo = this$0.f52888OooOO0O;
                    if (o0000ooo != null) {
                        Intrinsics.checkNotNull(o0000ooo);
                        o0000ooo.cancel();
                        this$0.f52888OooOO0O = null;
                    }
                    Timer timer = this$0.f52887OooOO0;
                    if (timer != null) {
                        Intrinsics.checkNotNull(timer);
                        timer.cancel();
                        Timer timer2 = this$0.f52887OooOO0;
                        Intrinsics.checkNotNull(timer2);
                        timer2.purge();
                        this$0.f52887OooOO0 = null;
                    }
                    this$0.f52887OooOO0 = new Timer();
                    this$0.f52888OooOO0O = new o0000Ooo(this$0, motionEvent, privateChatVM3);
                    Timer timer3 = this$0.f52887OooOO0;
                    Intrinsics.checkNotNull(timer3);
                    timer3.schedule(this$0.f52888OooOO0O, 600L);
                } else if (action == 1) {
                    bc bcVar6 = this$0.f52880OooO0O0;
                    if (bcVar6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    } else {
                        bcVar = bcVar6;
                    }
                    if (bcVar.f49035OooO0oO.f49687OooO0oO.getVisibility() == 0) {
                        this$0.f52879OooO00o.runOnUiThread(new o00000OO(this$0, motionEvent, privateChatVM3));
                    }
                } else if (action == 2) {
                    int[] iArr = new int[2];
                    bc bcVar7 = this$0.f52880OooO0O0;
                    if (bcVar7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        bcVar7 = null;
                    }
                    bcVar7.f49035OooO0oO.f49689OooOO0.getLocationOnScreen(iArr);
                    this$0.f52884OooO0o0 = iArr[1];
                    if (motionEvent.getRawY() < this$0.f52884OooO0o0) {
                        bc bcVar8 = this$0.f52880OooO0O0;
                        if (bcVar8 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                            bcVar8 = null;
                        }
                        bcVar8.f49035OooO0oO.f49680OooO.setText(o000O0O0.OooO0OO(R.string.release_to_cancel));
                        bc bcVar9 = this$0.f52880OooO0O0;
                        if (bcVar9 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                            bcVar9 = null;
                        }
                        bcVar9.f49035OooO0oO.f49682OooO0O0.setVisibility(0);
                        bc bcVar10 = this$0.f52880OooO0O0;
                        if (bcVar10 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        } else {
                            bcVar = bcVar10;
                        }
                        bcVar.f49035OooO0oO.f49683OooO0OO.setVisibility(4);
                    } else {
                        bc bcVar11 = this$0.f52880OooO0O0;
                        if (bcVar11 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                            bcVar11 = null;
                        }
                        bcVar11.f49035OooO0oO.f49680OooO.setText(o000O0O0.OooO0OO(R.string.slide_up_to_cancel));
                        bc bcVar12 = this$0.f52880OooO0O0;
                        if (bcVar12 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                            bcVar12 = null;
                        }
                        bcVar12.f49035OooO0oO.f49682OooO0O0.setVisibility(8);
                        bc bcVar13 = this$0.f52880OooO0O0;
                        if (bcVar13 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        } else {
                            bcVar = bcVar13;
                        }
                        bcVar.f49035OooO0oO.f49683OooO0OO.setVisibility(0);
                    }
                }
                return true;
            }
        });
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        Oooo0o0(intent);
        Oooo0O0().getChatUserInfo().observe(this, new o0000O00(this, 3));
        Oooo0O0().getFriendRemarkLiveData().observe(this, new o00000OO(this, i2));
        Oooo0O0().loadConversation().observe(this, new p044OooooOO.o00O000(this, 4));
        int i3 = 2;
        Oooo0O0().isFriendLiveData().observe(this, new o00000O(this, i3));
        LiveEventBus.get("MOMENT_DETAIL_DATA_REFRESH_FOR_PRIVATE_CHAT", String.class).observe(this, new p143o00OOooO.o0000(this, 2));
        LiveEventBus.get("EVENTMSG_PRIVATE_LUCKY_GIFT", MessageIM.SendGiftReply.class).observe(this, new p143o00OOooO.o0000oo(this, i2));
        Oooo0O0().getRoomThemeGiveState().observe(this, new p143o00OOooO.o0000O0(this, i3));
        Oooo0O0().getRoomThemeAccept().observe(this, new p143o00OOooO.o0000Ooo(this, i3));
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        o0OOO0o o0ooo0o2 = this.f22201o00ooo.f52882OooO0Oo;
        MediaPlayer mediaPlayer = o0ooo0o2.f32677OooO00o;
        if (mediaPlayer == null || !mediaPlayer.isPlaying()) {
            return;
        }
        o0ooo0o2.f32677OooO00o.stop();
        o0ooo0o2.f32677OooO00o.release();
        o0ooo0o2.f32677OooO00o = null;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        Oooo0o0(intent);
        if (com.yalla.support.common.util.OooO0OO.OooO00o(Oooo0O0().userInfo()) && com.yalla.support.common.util.OooO0OO.OooO0O0(this)) {
            finish();
        }
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        Oooo0O0().saveDraftMessage(String.valueOf(Oooo00o().f49034OooO0o0.f49484OooO0O0.getText()));
        if (Oooo0O0().userInfo() != null) {
            PrivateChatVM privateChatVMOooo0O0 = Oooo0O0();
            UserInfo userInfo = Oooo0O0().userInfo();
            Intrinsics.checkNotNull(userInfo);
            privateChatVMOooo0O0.updateConversationCount(userInfo.getUserId());
        }
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (Oooo0O0().userInfo() != null) {
            PrivateChatVM privateChatVMOooo0O0 = Oooo0O0();
            UserInfo userInfo = Oooo0O0().userInfo();
            Intrinsics.checkNotNull(userInfo);
            privateChatVMOooo0O0.updateConversationCount(userInfo.getUserId());
        }
        if (RoomStateManager.INSTANCE.getRoomState() != RoomState.Close && Oooo00o().f49034OooO0o0.f49489OooO0oO.getVisibility() == 0) {
            Oooo00o().f49034OooO0o0.f49489OooO0oO.setVisibility(8);
            this.f22201o00ooo.OooO00o();
        }
        Oooo0O0().checkUserRisk().observe(this, new p143o00OOooO.o000000O(this, 2));
        App.f11472OoooO0.postDelayed(new p304o0O0o00o.OooO(this, 2), 5000L);
        UserInfo userInfo2 = Oooo0O0().userInfo();
        if (userInfo2 != null) {
            Oooo0OO().checkIsFriendAndBlock(userInfo2.getUserId());
        }
        Oooo00o().f49031OooO0OO.OooO0OO();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        super.onStop();
        EmojiEditText view = Oooo00o().f49034OooO0o0.f49484OooO0O0;
        Intrinsics.checkNotNullExpressionValue(view, "mBinding.messageLayoutChatControl.etMessage");
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        InputMethodManager inputMethodManagerOooO00o = p472o0Oooo0.o00O000.OooO00o(context);
        Context context2 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "view.context");
        inputMethodManagerOooO00o.hideSoftInputFromWindow(view.getWindowToken(), 0, new KeyBoardUtil$hideKeyboard$1(context2.getApplicationContext(), new Handler()));
        Oooo00o().f49034OooO0o0.f49484OooO0O0.clearFocus();
        o00O0000 o00o0001 = this.f22193OoooooO;
        Intrinsics.checkNotNull(o00o0001);
        o00o0001.OooO0OO();
        this.f22201o00ooo.f52882OooO0Oo.OooO0O0();
    }
}
