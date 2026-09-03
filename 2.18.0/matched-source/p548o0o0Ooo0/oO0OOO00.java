package p548o0o0Ooo0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.ui.platform.o000;
import androidx.compose.ui.platform.o00OOOOo;
import androidx.compose.ui.platform.o0O0O00;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.lifecycle.MutableLiveData;
import com.android.billingclient.api.o0Oo0oo;
import com.app.base.framework.view.editTextSpan.MessageEditText;
import com.app.base.mixedroom.room_bottom.RoomAtView;
import com.app.base.mixedroom.room_bottom.RoomReplyView;
import com.app.base.model.ChatModel;
import com.app.base.model.RoomMessageReplyInfo;
import com.app.base.view.FacePanelView;
import com.code.android.util.ToastUtil;
import com.facebook.share.internal.ShareConstants;
import com.jeremyliao.liveeventbus.core.Observable;
import com.weieyu.yalla.R;
import com.yalla.support.keyboardpanel.KeyBoardUtil$showKeyboard$1;
import com.yalla.support.keyboardpanel.panel.PanelLayout;
import com.yalla.yalla.common.manager.data.SharedGifFaceManager;
import com.yalla.yalla.common.ui.view.PremiumLevel;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.HashMap;
import java.util.Objects;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.CoroutineScope;
import o0O0O00.o000000;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0o0.o0O00oO0;
import p028Oooo0o0.o0oO0Ooo;
import p044OooooOO.o00O00O;
import p048OoooooO.o00OOO0O;
import p100o000oOoO.o00OOOO0;
import p100o000oOoO.o00Oo00;
import p100o000oOoO.o0O00O;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO00o0;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.o0o0Oo;
import p100o000oOoO.oO00000o;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p100o000oOoO.oo0ooO;
import p144o00OOooo.oo0oOO0;
import p146o00Oo0.o00000OO;
import p160o00OoOO.o000O00O;
import p255o00ooO0O.o000O0O0;
import p255o00ooO0O.o000O0o;
import p255o00ooO0O.o0O0ooO;
import p264o00ooo.o000OO0O;
import p393o0OOooOo.o0O00000;
import p472o0Oooo0.o00;
import p472o0Oooo0.o00O000;
import p472o0Oooo0.o00O0000;
import p517o0o0O00.o00O00;
import p524o0o0O0o.o00O000o;
import p525o0o0O0o0.o0O0o;
import p532o0o0OOO.o00OO0O0;
import p537o0o0OOoO.oO0;

/* JADX INFO: loaded from: classes2.dex */
public final class oO0OOO00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static long f44481OooO00o = 0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static String f44482OooO0O0 = "";

    public static final class OooO extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ o0O00O<Boolean> f44483Oooo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ int f44484OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ o0O00O<ImageView> f44485OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(o0O00O<Boolean> o0o00o2, o0O00O<ImageView> o0o00o3, int i) {
            super(2);
            this.f44483Oooo = o0o00o2;
            this.f44485OoooO00 = o0o00o3;
            this.f44484OoooO0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            oO0OOO00.OooO0O0(this.f44483Oooo, this.f44485OoooO00, ooo00o, this.f44484OoooO0 | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ RoomAtView f44486Oooo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(RoomAtView roomAtView) {
            super(0);
            this.f44486Oooo = roomAtView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            p608o0oo0O.OooOo.OooO0O0("102202");
            RoomAtView roomAtView = this.f44486Oooo;
            if (roomAtView != null) {
                if (roomAtView.f11860OoooO) {
                    roomAtView.OooO0O0();
                } else {
                    roomAtView.OooO0OO();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ o0O00O<Boolean> f44487Oooo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ int f44488OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ RoomAtView f44489OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o0O00O<Boolean> o0o00o2, RoomAtView roomAtView, int i) {
            super(2);
            this.f44487Oooo = o0o00o2;
            this.f44489OoooO00 = roomAtView;
            this.f44488OoooO0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            oO0OOO00.OooO00o(this.f44487Oooo, this.f44489OoooO00, ooo00o, this.f44488OoooO0 | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<Context, ImageView> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ o0O00O<ImageView> f44490Oooo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(o0O00O<ImageView> o0o00o2) {
            super(1);
            this.f44490Oooo = o0o00o2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final ImageView invoke(Context context) {
            Context it = context;
            Intrinsics.checkNotNullParameter(it, "it");
            final ImageView imageView = new ImageView(it);
            this.f44490Oooo.setValue(imageView);
            imageView.setOnTouchListener(new View.OnTouchListener() { // from class: o0o0Ooo0.oO00o00O
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    ImageView this_apply = imageView;
                    Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                    if (motionEvent.getAction() != 1) {
                        return false;
                    }
                    Object tag = this_apply.getTag();
                    if (Intrinsics.areEqual(tag instanceof Boolean ? (Boolean) tag : null, Boolean.FALSE)) {
                        o0O00000.OooO0OO("InRoom_sayhi_keyboard");
                        return false;
                    }
                    o0O00000.OooO0OO("InRoom_sayhi_face");
                    return false;
                }
            });
            return imageView;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<ImageView, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ o0O00O<Boolean> f44491Oooo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(o0O00O<Boolean> o0o00o2) {
            super(1);
            this.f44491Oooo = o0o00o2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ImageView imageView) {
            ImageView ivMessageFaceSwitch = imageView;
            Intrinsics.checkNotNullParameter(ivMessageFaceSwitch, "ivMessageFaceSwitch");
            ivMessageFaceSwitch.setImageResource(this.f44491Oooo.getValue().booleanValue() ? R.drawable.icom_room_chat_emoji_gray : R.drawable.icom_room_chat_keyboard_gray);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<Context, MessageEditText> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ MessageEditText f44492Oooo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(MessageEditText messageEditText) {
            super(1);
            this.f44492Oooo = messageEditText;
        }

        @Override // kotlin.jvm.functions.Function1
        public final MessageEditText invoke(Context context) {
            Context it = context;
            Intrinsics.checkNotNullParameter(it, "it");
            return this.f44492Oooo;
        }
    }

    public static final class OooOO0O extends Lambda implements Function1<MessageEditText, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ o0O00O<Boolean> f44493Oooo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ int f44494OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(o0O00O<Boolean> o0o00o2, int i) {
            super(1);
            this.f44493Oooo = o0o00o2;
            this.f44494OoooO00 = i;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MessageEditText messageEditText) {
            MessageEditText it = messageEditText;
            Intrinsics.checkNotNullParameter(it, "it");
            if (!this.f44493Oooo.getValue().booleanValue()) {
                it.setHint(o000O0O0.OooO0OO(R.string.hint_say_something));
            } else if (this.f44494OoooO00 > 0) {
                it.setHint(com.yalla.support.common.util.OooOo.OooO00o(o000O0O0.OooO0OO(R.string.times_available), String.valueOf(this.f44494OoooO00)));
            } else {
                it.setHint(o000O0O0.OooO0OO(R.string.hint_say_something));
                ToastUtil.f12582OooO00o.OooO0O0(o000O0O0.OooO0OO(R.string.Out_of_broadcast_chances));
                this.f44493Oooo.setValue(Boolean.FALSE);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ o0O00O<Boolean> f44495Oooo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(o0O00O<Boolean> o0o00o2) {
            super(0);
            this.f44495Oooo = o0o00o2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0O00O<Boolean> o0o00o2 = this.f44495Oooo;
            o0o00o2.setValue(Boolean.valueOf(!o0o00o2.getValue().booleanValue()));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ o0O00oO0 f44496Oooo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ MessageEditText f44497OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ o0O00O<Boolean> f44498OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ int f44499OoooO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(o0O00oO0 o0o00oo1, o0O00O<Boolean> o0o00o2, MessageEditText messageEditText, int i) {
            super(2);
            this.f44496Oooo = o0o00oo1;
            this.f44498OoooO00 = o0o00o2;
            this.f44497OoooO0 = messageEditText;
            this.f44499OoooO0O = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            oO0OOO00.OooO0OO(this.f44496Oooo, this.f44498OoooO00, this.f44497OoooO0, ooo00o, this.f44499OoooO0O | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ o0O00O<Boolean> f44500Oooo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ int f44501OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(o0O00O<Boolean> o0o00o2, int i) {
            super(2);
            this.f44500Oooo = o0o00o2;
            this.f44501OoooO00 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            oO0OOO00.OooO0Oo(this.f44500Oooo, ooo00o, this.f44501OoooO00 | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends Lambda implements Function1<o00OOOO0, o0o0Oo> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ MessageEditText f44502Oooo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(MessageEditText messageEditText) {
            super(1);
            this.f44502Oooo = messageEditText;
        }

        @Override // kotlin.jvm.functions.Function1
        public final o0o0Oo invoke(o00OOOO0 o00oooo1) {
            o00OOOO0 DisposableEffect = o00oooo1;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            return new oOo00ooO(this.f44502Oooo);
        }
    }

    public static final class OooOo00 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ o0O00O<Boolean> f44503Oooo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ int f44504OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(o0O00O<Boolean> o0o00o2, int i) {
            super(2);
            this.f44503Oooo = o0o00o2;
            this.f44504OoooO00 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            oO0OOO00.OooO0Oo(this.f44503Oooo, ooo00o, this.f44504OoooO00 | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo0 extends Lambda implements Function1<Boolean, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ o0O00O<o00O0000> f44505Oooo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo0(o0O00O<o00O0000> o0o00o2) {
            super(1);
            this.f44505Oooo = o0o00o2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            Boolean it = bool;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            if (it.booleanValue()) {
                o00O0000 value = this.f44505Oooo.getValue();
                o00 o00Var = value != null ? value.f40643OooO0OO : null;
                if (o00Var != null) {
                    o00Var.f40634OooO0O0 = !it.booleanValue();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 extends Lambda implements Function1<Boolean, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ o0O00O<o00O0000> f44506Oooo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo000(o0O00O<o00O0000> o0o00o2) {
            super(1);
            this.f44506Oooo = o0o00o2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            o00O0000 value;
            Boolean it = bool;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            if (it.booleanValue() && (value = this.f44506Oooo.getValue()) != null) {
                value.OooO0OO();
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.room.live.bottom.RoomBottomMessageInputManagerKt$RoomMessageBottomLayoutLifecycleHelper$4", f = "RoomBottomMessageInputManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o000oOoO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ PanelLayout f44507Oooo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final /* synthetic */ o0O00O<Boolean> f44508OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ MessageEditText f44509OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ o0O00O<o00O0000> f44510OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ o0O00O<ImageView> f44511OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public final /* synthetic */ RoomReplyView f44512OoooOO0;

        /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
        public final /* synthetic */ FacePanelView f44513OoooOOO;

        /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
        public final /* synthetic */ o0O00O<Boolean> f44514OoooOOo;

        /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
        public final /* synthetic */ RoomAtView f44515o000oOoO;

        public static final class OooO00o extends Lambda implements Function2<Boolean, Integer, Unit> {

            /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
            public final /* synthetic */ MessageEditText f44516Oooo;

            /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
            public final /* synthetic */ FacePanelView f44517OoooO;

            /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
            public final /* synthetic */ RoomReplyView f44518OoooO0;

            /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
            public final /* synthetic */ o0O00O<Boolean> f44519OoooO00;

            /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
            public final /* synthetic */ RoomAtView f44520OoooO0O;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(MessageEditText messageEditText, o0O00O<Boolean> o0o00o2, RoomReplyView roomReplyView, RoomAtView roomAtView, FacePanelView facePanelView) {
                super(2);
                this.f44516Oooo = messageEditText;
                this.f44519OoooO00 = o0o00o2;
                this.f44518OoooO0 = roomReplyView;
                this.f44520OoooO0O = roomAtView;
                this.f44517OoooO = facePanelView;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Unit invoke(Boolean bool, Integer num) {
                boolean zBooleanValue = bool.booleanValue();
                num.intValue();
                o00OO0O0.f43338OooooOo.OooO00o().f43369OooOooO.setValue(Boolean.valueOf(zBooleanValue));
                oO0OOO00.OooO0oo(false, this.f44516Oooo);
                if (zBooleanValue) {
                    FacePanelView facePanelView = this.f44517OoooO;
                    if (facePanelView != null) {
                        facePanelView.OooO0OO();
                    }
                } else {
                    this.f44519OoooO00.setValue(Boolean.FALSE);
                    RoomReplyView roomReplyView = this.f44518OoooO0;
                    if (roomReplyView != null) {
                        roomReplyView.OooO0OO();
                    }
                    RoomAtView roomAtView = this.f44520OoooO0O;
                    if (roomAtView != null) {
                        roomAtView.OooO0O0();
                    }
                }
                return Unit.INSTANCE;
            }
        }

        public static final class OooO0O0 extends Lambda implements Function3<Boolean, Integer, View, Unit> {

            /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
            public final /* synthetic */ o0O00O<Boolean> f44521Oooo;

            /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
            public final /* synthetic */ FacePanelView f44522OoooO0;

            /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
            public final /* synthetic */ MessageEditText f44523OoooO00;

            /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
            public final /* synthetic */ o0O00O<ImageView> f44524OoooO0O;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(o0O00O<Boolean> o0o00o2, MessageEditText messageEditText, FacePanelView facePanelView, o0O00O<ImageView> o0o00o3) {
                super(3);
                this.f44521Oooo = o0o00o2;
                this.f44523OoooO00 = messageEditText;
                this.f44522OoooO0 = facePanelView;
                this.f44524OoooO0O = o0o00o3;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Unit invoke(Boolean bool, Integer num, View view) {
                boolean zBooleanValue = bool.booleanValue();
                num.intValue();
                this.f44521Oooo.setValue(Boolean.valueOf(zBooleanValue));
                if (zBooleanValue) {
                    oO0OOO00.OooO0oo(false, this.f44523OoooO00);
                } else {
                    FacePanelView facePanelView = this.f44522OoooO0;
                    oO0OOO00.OooO0oo(!(facePanelView != null ? facePanelView.isEmojiPanel : false), this.f44523OoooO00);
                }
                ImageView value = this.f44524OoooO0O.getValue();
                if (value != null) {
                    value.setTag(Boolean.valueOf(zBooleanValue));
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000oOoO(PanelLayout panelLayout, o0O00O<o00O0000> o0o00o2, MessageEditText messageEditText, o0O00O<ImageView> o0o00o3, o0O00O<Boolean> o0o00o4, RoomReplyView roomReplyView, RoomAtView roomAtView, FacePanelView facePanelView, o0O00O<Boolean> o0o00o5, Continuation<? super o000oOoO> continuation) {
            super(2, continuation);
            this.f44507Oooo = panelLayout;
            this.f44510OoooO00 = o0o00o2;
            this.f44509OoooO0 = messageEditText;
            this.f44511OoooO0O = o0o00o3;
            this.f44508OoooO = o0o00o4;
            this.f44512OoooOO0 = roomReplyView;
            this.f44515o000oOoO = roomAtView;
            this.f44513OoooOOO = facePanelView;
            this.f44514OoooOOo = o0o00o5;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new o000oOoO(this.f44507Oooo, this.f44510OoooO00, this.f44509OoooO0, this.f44511OoooO0O, this.f44508OoooO, this.f44512OoooOO0, this.f44515o000oOoO, this.f44513OoooOOO, this.f44514OoooOOo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((o000oOoO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o00O0000 value;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            if (this.f44507Oooo != null && this.f44510OoooO00.getValue() == null) {
                o0O00O<o00O0000> o0o00o2 = this.f44510OoooO00;
                o00O0000 o00o0001 = new o00O0000(this.f44507Oooo, this.f44509OoooO0);
                ImageView value2 = this.f44511OoooO0O.getValue();
                Intrinsics.checkNotNull(value2);
                o00o0001.OooO0O0(value2);
                o0o00o2.setValue(o00o0001);
                o00O0000 value3 = this.f44510OoooO00.getValue();
                if (value3 != null) {
                    value3.f40642OooO0O0 = new OooO00o(this.f44509OoooO0, this.f44508OoooO, this.f44512OoooOO0, this.f44515o000oOoO, this.f44513OoooOOO);
                }
            }
            o00O0000 value4 = this.f44510OoooO00.getValue();
            if (value4 != null) {
                value4.f40641OooO00o = new OooO0O0(this.f44514OoooOOo, this.f44509OoooO0, this.f44513OoooOOO, this.f44511OoooO0O);
            }
            ImageView value5 = this.f44511OoooO0O.getValue();
            if (value5 != null && (value = this.f44510OoooO00.getValue()) != null) {
                value.OooO0O0(value5);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.room.live.bottom.RoomBottomMessageInputManagerKt$RoomMessageBottomLayoutLifecycleHelper$6", f = "RoomBottomMessageInputManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o00O0O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ MessageEditText f44525Oooo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ RoomReplyView f44526OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ o0O00O<o00O0000> f44527OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00O0O(MessageEditText messageEditText, o0O00O<o00O0000> o0o00o2, RoomReplyView roomReplyView, Continuation<? super o00O0O> continuation) {
            super(2, continuation);
            this.f44525Oooo = messageEditText;
            this.f44527OoooO00 = o0o00o2;
            this.f44526OoooO0 = roomReplyView;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new o00O0O(this.f44525Oooo, this.f44527OoooO00, this.f44526OoooO0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((o00O0O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            MessageEditText view = this.f44525Oooo;
            o0O00O<o00O0000> o0o00o2 = this.f44527OoooO00;
            RoomReplyView roomReplyView = this.f44526OoooO0;
            o00O0000 value = o0o00o2.getValue();
            o00 o00Var = value != null ? value.f40643OooO0OO : null;
            if (o00Var != null) {
                o00Var.f40634OooO0O0 = true;
            }
            Intrinsics.checkNotNullParameter(view, "view");
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "view.context");
            InputMethodManager inputMethodManagerOooO00o = o00O000.OooO00o(context);
            view.setFocusable(true);
            view.setFocusableInTouchMode(true);
            view.requestFocus();
            Context context2 = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "view.context");
            inputMethodManagerOooO00o.showSoftInput(view, 2, new KeyBoardUtil$showKeyboard$1(context2.getApplicationContext(), new Handler()));
            if (roomReplyView != null) {
                roomReplyView.OooO0Oo();
            }
            view.requestFocus();
            view.requestFocusFromTouch();
            return Unit.INSTANCE;
        }
    }

    public static final class o00Oo0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ MessageEditText f44528Oooo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final /* synthetic */ o0O00O<Boolean> f44529OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ RoomReplyView f44530OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ o0O00O<o00O0000> f44531OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ o0O00O<ImageView> f44532OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public final /* synthetic */ o0O00O<Boolean> f44533OoooOO0;

        /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
        public final /* synthetic */ PanelLayout f44534OoooOOO;

        /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
        public final /* synthetic */ FacePanelView f44535OoooOOo;

        /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
        public final /* synthetic */ int f44536OoooOo0;

        /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
        public final /* synthetic */ RoomAtView f44537o000oOoO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Oo0(MessageEditText messageEditText, o0O00O<o00O0000> o0o00o2, RoomReplyView roomReplyView, o0O00O<ImageView> o0o00o3, o0O00O<Boolean> o0o00o4, o0O00O<Boolean> o0o00o5, RoomAtView roomAtView, PanelLayout panelLayout, FacePanelView facePanelView, int i) {
            super(2);
            this.f44528Oooo = messageEditText;
            this.f44531OoooO00 = o0o00o2;
            this.f44530OoooO0 = roomReplyView;
            this.f44532OoooO0O = o0o00o3;
            this.f44529OoooO = o0o00o4;
            this.f44533OoooOO0 = o0o00o5;
            this.f44537o000oOoO = roomAtView;
            this.f44534OoooOOO = panelLayout;
            this.f44535OoooOOo = facePanelView;
            this.f44536OoooOo0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            oO0OOO00.OooO0o0(this.f44528Oooo, this.f44531OoooO00, this.f44530OoooO0, this.f44532OoooO0O, this.f44529OoooO, this.f44533OoooOO0, this.f44537o000oOoO, this.f44534OoooOOO, this.f44535OoooOOo, ooo00o, this.f44536OoooOo0 | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class o00Ooo extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ RoomReplyView f44538Oooo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ o0O00O<Boolean> f44539OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ MessageEditText f44540OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ o0O00O<o00O0000> f44541OoooO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Ooo(RoomReplyView roomReplyView, MessageEditText messageEditText, o0O00O<Boolean> o0o00o2, o0O00O<o00O0000> o0o00o3) {
            super(0);
            this.f44538Oooo = roomReplyView;
            this.f44540OoooO00 = messageEditText;
            this.f44539OoooO0 = o0o00o2;
            this.f44541OoooO0O = o0o00o3;
        }

        /* JADX WARN: Code duplicated, block: B:68:0x0125 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:69:0x0127  */
        /* JADX WARN: Code duplicated, block: B:72:0x0135  */
        /* JADX WARN: Code duplicated, block: B:73:0x0168  */
        /* JADX WARN: Code duplicated, block: B:75:0x016e  */
        /* JADX WARN: Code duplicated, block: B:76:0x0178  */
        /* JADX WARN: Code duplicated, block: B:78:0x017b  */
        /* JADX WARN: Code duplicated, block: B:79:0x018a  */
        /* JADX WARN: Instruction removed from duplicated block: B:72:0x0135, please report this as an issue */
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            String string;
            ChatModel f11868OoooO00;
            RoomMessageReplyInfo replayModel;
            p151o00Oo0Oo.OooOo oooOo;
            if (this.f44538Oooo != null) {
                String strValueOf = String.valueOf(this.f44540OoooO00.getText());
                MessageEditText messageEditText = this.f44540OoooO00;
                o0O00O<Boolean> o0o00o2 = this.f44539OoooO0;
                RoomReplyView roomReplyView = this.f44538Oooo;
                o00O0000 value = this.f44541OoooO0O.getValue();
                boolean z = true;
                boolean z2 = messageEditText.getSpanManager().OooO0Oo("@") > 0;
                String string2 = StringsKt.trim((CharSequence) strValueOf).toString();
                if (string2 == null || StringsKt.isBlank(string2)) {
                    String strOooO0OO = o000O0O0.OooO0OO(R.string.chat_room_on_Txt);
                    ToastUtil toastUtil = ToastUtil.f12583OooO0O0;
                    if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                        z = false;
                    }
                    if (!z) {
                        o0O0ooO o0o0oooOooO0O0 = p074o000O0oo.OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o0o0oooOooO0O0.run();
                        } else {
                            p255o00ooO0O.o00O000 o00o001 = p255o00ooO0O.o00O000.f34368OooO00o;
                            p255o00ooO0O.o00O000.f34370OooO0OO.post(o0o0oooOooO0O0);
                        }
                    }
                } else if (System.currentTimeMillis() - oO0OOO00.f44481OooO00o < 1000) {
                    String strOooO0OO2 = o000O0O0.OooO0OO(R.string.message_too_often);
                    ToastUtil toastUtil2 = ToastUtil.f12583OooO0O0;
                    if (strOooO0OO2 != null && !StringsKt.isBlank(strOooO0OO2)) {
                        z = false;
                    }
                    if (!z) {
                        o0O0ooO o0o0oooOooO0O1 = p074o000O0oo.OooOOO.OooO0O0(toastUtil2, strOooO0OO2, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o0o0oooOooO0O1.run();
                        } else {
                            p255o00ooO0O.o00O000 o00o002 = p255o00ooO0O.o00O000.f34368OooO00o;
                            p255o00ooO0O.o00O000.f34370OooO0OO.post(o0o0oooOooO0O1);
                        }
                    }
                } else {
                    string = messageEditText.getTransformedText().toString();
                    if (StringsKt__StringsJVMKt.equals(oO0OOO00.f44482OooO0O0, string, true)) {
                        String strOooO0OO3 = o000O0O0.OooO0OO(R.string.char_room_content);
                        ToastUtil toastUtil3 = ToastUtil.f12583OooO0O0;
                        if (strOooO0OO3 != null && !StringsKt.isBlank(strOooO0OO3)) {
                            z = false;
                        }
                        if (!z) {
                            o0O0ooO o0o0oooOooO0O2 = p074o000O0oo.OooOOO.OooO0O0(toastUtil3, strOooO0OO3, "runnable");
                            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                o0o0oooOooO0O2.run();
                            } else {
                                p255o00ooO0O.o00O000 o00o003 = p255o00ooO0O.o00O000.f34368OooO00o;
                                p255o00ooO0O.o00O000.f34370OooO0OO.post(o0o0oooOooO0O2);
                            }
                        }
                    } else {
                        oO0OOO00.f44482OooO0O0 = string;
                    }
                    if (!TextUtils.isEmpty(string) && o000O00O.OooO().f32451OoooO0 != null) {
                        if (o0o00o2.getValue().booleanValue()) {
                            if (value != null) {
                                value.OooO0OO();
                            }
                            Objects.requireNonNull(p160o00OoOO.o00O000.OooO());
                            if (p160o00OoOO.o00O000.f32490OooO00o != null) {
                                o00O00.OooO0O0("sendNobleBroadcast " + string);
                                HashMap map = new HashMap();
                                map.put(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, string);
                                map.put("lang", p169o00Ooo0.oo000o.OooO00o());
                                p160o00OoOO.o00O000.f32490OooO00o.OooO0o(10019, o0Oo0oo.OooO0Oo(map));
                            }
                        } else {
                            f11868OoooO00 = roomReplyView.getF11868OoooO00();
                            if (f11868OoooO00 != null) {
                                replayModel = new RoomMessageReplyInfo().getReplayModel(f11868OoooO00);
                            } else {
                                replayModel = null;
                            }
                            if (z2) {
                                oooOo = messageEditText.getSpanManager().OooO0OO("@").get(0);
                            } else {
                                oooOo = null;
                            }
                            p160o00OoOO.o00O000.OooO().OooOoO0(string, oooOo, replayModel);
                            messageEditText.getSpanManager().OooO00o();
                            roomReplyView.setChatModel(null);
                        }
                        oO0OOO00.f44481OooO00o = System.currentTimeMillis();
                        oO0OOO00.OooOO0(value, messageEditText);
                    }
                }
                string = null;
                if (!TextUtils.isEmpty(string)) {
                    if (o0o00o2.getValue().booleanValue()) {
                        if (value != null) {
                            value.OooO0OO();
                        }
                        Objects.requireNonNull(p160o00OoOO.o00O000.OooO());
                        if (p160o00OoOO.o00O000.f32490OooO00o != null) {
                            o00O00.OooO0O0("sendNobleBroadcast " + string);
                            HashMap map2 = new HashMap();
                            map2.put(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, string);
                            map2.put("lang", p169o00Ooo0.oo000o.OooO00o());
                            p160o00OoOO.o00O000.f32490OooO00o.OooO0o(10019, o0Oo0oo.OooO0Oo(map2));
                        }
                    } else {
                        f11868OoooO00 = roomReplyView.getF11868OoooO00();
                        if (f11868OoooO00 != null) {
                            replayModel = new RoomMessageReplyInfo().getReplayModel(f11868OoooO00);
                        } else {
                            replayModel = null;
                        }
                        if (z2) {
                            oooOo = messageEditText.getSpanManager().OooO0OO("@").get(0);
                        } else {
                            oooOo = null;
                        }
                        p160o00OoOO.o00O000.OooO().OooOoO0(string, oooOo, replayModel);
                        messageEditText.getSpanManager().OooO00o();
                        roomReplyView.setChatModel(null);
                    }
                    oO0OOO00.f44481OooO00o = System.currentTimeMillis();
                    oO0OOO00.OooOO0(value, messageEditText);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.room.live.bottom.RoomBottomMessageInputManagerKt$RoomMessageBottomLayoutLifecycleHelper$5", f = "RoomBottomMessageInputManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o0OoOo0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ FacePanelView f44542Oooo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ MessageEditText f44543OoooO00;

        public static final class OooO00o extends Lambda implements Function1<Boolean, Unit> {

            /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
            public final /* synthetic */ MessageEditText f44544Oooo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(MessageEditText messageEditText) {
                super(1);
                this.f44544Oooo = messageEditText;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(Boolean bool) {
                oO0OOO00.OooO0oo(!bool.booleanValue(), this.f44544Oooo);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OoOo0(FacePanelView facePanelView, MessageEditText messageEditText, Continuation<? super o0OoOo0> continuation) {
            super(2, continuation);
            this.f44542Oooo = facePanelView;
            this.f44543OoooO00 = messageEditText;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new o0OoOo0(this.f44542Oooo, this.f44543OoooO00, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((o0OoOo0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            FacePanelView facePanelView = this.f44542Oooo;
            if (facePanelView != null) {
                MessageEditText messageEditText = this.f44543OoooO00;
                facePanelView.OooO0O0(messageEditText, new OooO00o(messageEditText));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class oo000o extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ MessageEditText f44545Oooo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final /* synthetic */ RoomReplyView f44546OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ o0O00O<Boolean> f44547OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ o0O00O<Boolean> f44548OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ o0O00O<o00O0000> f44549OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public final /* synthetic */ int f44550OoooOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public oo000o(MessageEditText messageEditText, o0O00O<Boolean> o0o00o2, o0O00O<Boolean> o0o00o3, o0O00O<o00O0000> o0o00o4, RoomReplyView roomReplyView, int i) {
            super(2);
            this.f44545Oooo = messageEditText;
            this.f44548OoooO00 = o0o00o2;
            this.f44547OoooO0 = o0o00o3;
            this.f44549OoooO0O = o0o00o4;
            this.f44546OoooO = roomReplyView;
            this.f44550OoooOO0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            oO0OOO00.OooO0o(this.f44545Oooo, this.f44548OoooO00, this.f44547OoooO0, this.f44549OoooO0O, this.f44546OoooO, ooo00o, this.f44550OoooOO0 | 1);
            return Unit.INSTANCE;
        }
    }

    public static final p048OoooooO.o00OOOO0 OooO() {
        return o00OOO0O.OooO0O0(OoooooO.o00OOOO0.OooO00o.f4215Oooo, oO0OO00o.f44480Oooo);
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(o0O00O<Boolean> o0o00o2, RoomAtView roomAtView, oOO00O ooo00o, int i) {
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(644052966);
        Function3<p100o000oOoO.o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29723OooO00o;
        Integer num = (Integer) o00O00O.OooO0O0(o00OO0O0.f43338OooooOo.OooO00o().f43354OooOOOO, ooo00oOooOOo).getValue();
        int iIntValue = num != null ? num.intValue() : 0;
        if (iIntValue == 1 || iIntValue == 2) {
            Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(o0o00o2.getValue().booleanValue() ? R.drawable.icom_room_chat_at_color : R.drawable.icom_room_chat_at_gray, ooo00oOooOOo), null, o000O0o.OooO0O0(OooO(), false, false, null, new OooO00o(roomAtView), 253), null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, ooo00oOooOOo, 56, 120);
        } else if (roomAtView != null) {
            roomAtView.OooO0O0();
        }
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO0O0(o0o00o2, roomAtView, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @SuppressLint({"ClickableViewAccessibility"})
    public static final void OooO0O0(o0O00O<Boolean> o0o00o2, o0O00O<ImageView> o0o00o3, oOO00O ooo00o, int i) {
        int i2;
        boolean z;
        p048OoooooO.o00OOOO0 o00oooo0OooO0o;
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-2015237110);
        if ((i & 14) == 0) {
            i2 = (ooo00oOooOOo.Oooo0oo(o0o00o2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= ooo00oOooOOo.Oooo0oo(o0o00o3) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && ooo00oOooOOo.OooOo0()) {
            ooo00oOooOOo.OooOoo0();
        } else {
            Function3<p100o000oOoO.o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29723OooO00o;
            ooo00oOooOOo.OooO0o0(-1287159885);
            ooo00oOooOOo.OooO0o0(-1800107778);
            boolean z2 = false;
            if (Intrinsics.areEqual(p619o0oo0o.Oooo0.OooO00o((Context) ooo00oOooOOo.OooOO0o(o0O0O00.f6616OooO0O0)), "BridgeContext")) {
                ooo00oOooOOo.Oooo0o0();
                z = false;
            } else {
                ooo00oOooOOo.Oooo0o0();
                z = true;
            }
            if (z) {
                if (o0o00o2.getValue().booleanValue() && Intrinsics.areEqual(o00O00O.OooO0O0(SharedGifFaceManager.INSTANCE.getContainsPayEmojiLiveData(), ooo00oOooOOo).getValue(), Boolean.TRUE)) {
                    p499o0o00Oo.OooOOO0 oooOOO0 = p499o0o00Oo.OooOOO0.f41199OooO00o;
                    if (Intrinsics.areEqual(o00O00O.OooO0O0(p499o0o00Oo.OooOOO0.OooO0o0().OooOO0o(), ooo00oOooOOo).getValue(), Boolean.FALSE)) {
                        z2 = true;
                    }
                }
                if (z2) {
                    o00oooo0OooO0o = p023Oooo00O.o000oOoO.OooO0o(OoooooO.o00OOOO0.OooO00o.f4215Oooo, false, o00000OO.OooO0OO(4294863980L), (float) 4.5d, false, false, 16, 12, 1, 569);
                } else {
                    o00oooo0OooO0o = OoooooO.o00OOOO0.OooO00o.f4215Oooo;
                }
            } else {
                o00oooo0OooO0o = OoooooO.o00OOOO0.OooO00o.f4215Oooo;
            }
            ooo00oOooOOo.Oooo0o0();
            ooo00oOooOOo.OooO0o0(1157296644);
            boolean zOooo0oo = ooo00oOooOOo.Oooo0oo(o0o00o3);
            Object objOooO0o = ooo00oOooOOo.OooO0o();
            if (zOooo0oo || objOooO0o == oOO00O.OooO00o.f29707OooO0O0) {
                objOooO0o = new OooO0OO(o0o00o3);
                ooo00oOooOOo.Oooo00o(objOooO0o);
            }
            ooo00oOooOOo.Oooo0o0();
            Function1 function1 = (Function1) objOooO0o;
            p048OoooooO.o00OOOO0 o00oooo0OooOOoo = OooO().OooOOoo(o00oooo0OooO0o);
            ooo00oOooOOo.OooO0o0(1157296644);
            boolean zOooo0oo2 = ooo00oOooOOo.Oooo0oo(o0o00o2);
            Object objOooO0o2 = ooo00oOooOOo.OooO0o();
            if (zOooo0oo2 || objOooO0o2 == oOO00O.OooO00o.f29707OooO0O0) {
                objOooO0o2 = new OooO0o(o0o00o2);
                ooo00oOooOOo.Oooo00o(objOooO0o2);
            }
            ooo00oOooOOo.Oooo0o0();
            AndroidView_androidKt.OooO00o(function1, o00oooo0OooOOoo, (Function1) objOooO0o2, ooo00oOooOOo, 0, 0);
        }
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO(o0o00o2, o0o00o3, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0OO(o0O00oO0 o0o00oo1, o0O00O<Boolean> o0o00o2, MessageEditText messageEditText, oOO00O ooo00o, int i) {
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-9917991);
        Function3<p100o000oOoO.o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29723OooO00o;
        MutableLiveData<Integer> mutableLiveData = o000O00O.OooO().f32468o000oOoO;
        Intrinsics.checkNotNullExpressionValue(mutableLiveData, "getInstance().broadcastNumLiveData");
        Integer num = (Integer) o00O00O.OooO0O0(mutableLiveData, ooo00oOooOOo).getValue();
        int iIntValue = num != null ? num.intValue() : 0;
        OooOO0 oooOO1 = new OooOO0(messageEditText);
        p048OoooooO.o00OOOO0 o00oooo0OooO0oO = PaddingKt.OooO0oO(o0o00oo1.OooO00o(OoooooO.o00OOOO0.OooO00o.f4215Oooo, true), (float) 6.5d, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2);
        Integer numValueOf = Integer.valueOf(iIntValue);
        ooo00oOooOOo.OooO0o0(511388516);
        boolean zOooo0oo = ooo00oOooOOo.Oooo0oo(numValueOf) | ooo00oOooOOo.Oooo0oo(o0o00o2);
        Object objOooO0o = ooo00oOooOOo.OooO0o();
        if (zOooo0oo || objOooO0o == oOO00O.OooO00o.f29707OooO0O0) {
            objOooO0o = new OooOO0O(o0o00o2, iIntValue);
            ooo00oOooOOo.Oooo00o(objOooO0o);
        }
        ooo00oOooOOo.Oooo0o0();
        AndroidView_androidKt.OooO00o(oooOO1, o00oooo0OooO0oO, (Function1) objOooO0o, ooo00oOooOOo, 0, 0);
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooOOO0(o0o00oo1, o0o00o2, messageEditText, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0Oo(o0O00O<Boolean> o0o00o2, oOO00O ooo00o, int i) {
        int i2;
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-975756959);
        if ((i & 14) == 0) {
            i2 = (ooo00oOooOOo.Oooo0oo(o0o00o2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && ooo00oOooOOo.OooOo0()) {
            ooo00oOooOOo.OooOoo0();
        } else {
            Function3<p100o000oOoO.o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29723OooO00o;
            Pair pair = (Pair) o00O00O.OooO0O0(p500o0o00Oo0.OooOOO.f41235OooO00o.OooOOO0(), ooo00oOooOOo).getValue();
            if (pair == null) {
                oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooOo00(o0o00o2, i));
                return;
            }
            if (((Number) pair.getSecond()).intValue() > PremiumLevel.Premium4.getValue() && ((Boolean) pair.getFirst()).booleanValue()) {
                o000OO0O o000oo0oOooO00o = o00000.OooO0O0.OooO00o(o0o00o2.getValue().booleanValue() ? R.drawable.icom_room_chat_broadcast_color : R.drawable.icon_room_chat_broadcast_gray, ooo00oOooOOo);
                p048OoooooO.o00OOOO0 o00oooo0OooO0OO = o000O0o.OooO0OO(OooO(), ooo00oOooOOo);
                ooo00oOooOOo.OooO0o0(1157296644);
                boolean zOooo0oo = ooo00oOooOOo.Oooo0oo(o0o00o2);
                Object objOooO0o = ooo00oOooOOo.OooO0o();
                if (zOooo0oo || objOooO0o == oOO00O.OooO00o.f29707OooO0O0) {
                    objOooO0o = new OooOOO(o0o00o2);
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                }
                ooo00oOooOOo.Oooo0o0();
                Oooo0.o00.OooO00o(o000oo0oOooO00o, null, o000O0o.OooO0O0(o00oooo0OooO0OO, false, false, null, (Function0) objOooO0o, 253), null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, ooo00oOooOOo, 56, 120);
            }
        }
        oo0ooO oo0oooOooOo2 = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo2 == null) {
            return;
        }
        oo0oooOooOo2.OooO00o(new OooOOOO(o0o00o2, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0o(MessageEditText messageEditText, o0O00O<Boolean> o0o00o2, o0O00O<Boolean> o0o00o3, o0O00O<o00O0000> o0o00o4, RoomReplyView roomReplyView, oOO00O ooo00o, int i) {
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-168053700);
        Function3<p100o000oOoO.o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29723OooO00o;
        Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(o0o00o2.getValue().booleanValue() ? R.drawable.btn_send : R.drawable.btn_send2, ooo00oOooOOo), null, o000O0o.OooO0O0(OooO(), false, false, null, new o00Ooo(roomReplyView, messageEditText, o0o00o3, o0o00o4), 253), null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, ooo00oOooOOo, 56, 120);
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new oo000o(messageEditText, o0o00o2, o0o00o3, o0o00o4, roomReplyView, i));
    }

    @Composable
    public static final void OooO0o0(MessageEditText messageEditText, o0O00O<o00O0000> o0o00o2, RoomReplyView roomReplyView, o0O00O<ImageView> o0o00o3, o0O00O<Boolean> o0o00o4, o0O00O<Boolean> o0o00o5, RoomAtView roomAtView, PanelLayout panelLayout, FacePanelView facePanelView, oOO00O ooo00o, int i) {
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(1233344444);
        Function3<p100o000oOoO.o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29723OooO00o;
        Unit unit = Unit.INSTANCE;
        o00Oo00.OooO0O0(unit, new OooOo(messageEditText), ooo00oOooOOo);
        ooo00oOooOOo.OooO0o0(602286264);
        if (p521o0o0O0O.o0O0O00.OooO00o(ooo00oOooOOo)) {
            Observable observableOooO00o = o0O0o.OooO00o("HIDE_KEYBOARD");
            ooo00oOooOOo.OooO0o0(1157296644);
            boolean zOooo0oo = ooo00oOooOOo.Oooo0oo(o0o00o2);
            Object objOooO0o = ooo00oOooOOo.OooO0o();
            if (zOooo0oo || objOooO0o == oOO00O.OooO00o.f29707OooO0O0) {
                objOooO0o = new Oooo000(o0o00o2);
                ooo00oOooOOo.Oooo00o(objOooO0o);
            }
            ooo00oOooOOo.Oooo0o0();
            o00O000o.OooO00o(observableOooO00o, new oo0oOO0((Function1) objOooO0o, 4), ooo00oOooOOo, 72);
            Observable observableOooO00o2 = o0O0o.OooO00o("IGNORE_KEYBOARD");
            ooo00oOooOOo.OooO0o0(1157296644);
            boolean zOooo0oo2 = ooo00oOooOOo.Oooo0oo(o0o00o2);
            Object objOooO0o2 = ooo00oOooOOo.OooO0o();
            if (zOooo0oo2 || objOooO0o2 == oOO00O.OooO00o.f29707OooO0O0) {
                objOooO0o2 = new Oooo0(o0o00o2);
                ooo00oOooOOo.Oooo00o(objOooO0o2);
            }
            ooo00oOooOOo.Oooo0o0();
            o00O000o.OooO00o(observableOooO00o2, new p144o00OOooo.oo0o0O0((Function1) objOooO0o2, 2), ooo00oOooOOo, 72);
        }
        ooo00oOooOOo.Oooo0o0();
        o00Oo00.OooO0OO(messageEditText, panelLayout, o0o00o2, new o000oOoO(panelLayout, o0o00o2, messageEditText, o0o00o3, o0o00o5, roomReplyView, roomAtView, facePanelView, o0o00o4, null), ooo00oOooOOo);
        o00Oo00.OooO0Oo(facePanelView, messageEditText, new o0OoOo0(facePanelView, messageEditText, null), ooo00oOooOOo);
        o00Oo00.OooO0o0(unit, new o00O0O(messageEditText, o0o00o2, roomReplyView, null), ooo00oOooOOo);
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new o00Oo0(messageEditText, o0o00o2, roomReplyView, o0o00o3, o0o00o4, o0o00o5, roomAtView, panelLayout, facePanelView, i));
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    public static final void OooO0oO(o0O00O o0o00o2, RoomReplyView roomReplyView, RoomAtView roomAtView, FacePanelView facePanelView, PanelLayout panelLayout, o0O00O o0o00o3, MessageEditText messageEditText, o0O00O o0o00o4, o0O00O o0o00o5, oOO00O ooo00o, int i) {
        oOO00O composer = ooo00o.OooOOo(-1053917346);
        Function3<p100o000oOoO.o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29723OooO00o;
        p048OoooooO.o00OOOO0 o00oooo0OooO0oO = PaddingKt.OooO0oO(o000O0o.OooO0O0(SizeKt.OooO0oO(SizeKt.OooO0o(OoooooO.o00OOOO0.OooO00o.f4215Oooo), 50), false, false, null, oO00o0.f44430Oooo, 253), (float) 6.5d, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2);
        composer.OooO0o0(693286680);
        p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2039OooO00o;
        o000000 o000000VarOooO00o = o0oO0Ooo.OooO00o(p028Oooo0o0.o00O000.f2040OooO0O0, OoooooO.o00OO0O0.OooO00o.f4197OooOO0O, composer);
        composer.OooO0o0(-1323940314);
        o0000O0O.OooO oooO = (o0000O0O.OooO) composer.OooOO0o(o000.f6371OooO0o0);
        LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o000.f6375OooOO0O);
        o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o000.f6379OooOOOO);
        Objects.requireNonNull(o000000.OooO00o.f26594OooO0Oo);
        Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26596OooO0O0;
        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o0O0O00.o00Ooo.OooO0O0(o00oooo0OooO0oO);
        if (!(composer.OooOo0o() instanceof p100o000oOoO.o00O000)) {
            p100o000oOoO.o00O00O.OooO00o();
            throw null;
        }
        composer.OooOo00();
        if (composer.OooOOO0()) {
            composer.OooOoO0(function0);
        } else {
            composer.Oooo00O();
        }
        composer.OooOo0O();
        Intrinsics.checkNotNullParameter(composer, "composer");
        oO00000o.OooO0O0(composer, o000000VarOooO00o, o000000.OooO00o.C0279OooO00o.f26600OooO0o0);
        oO00000o.OooO0O0(composer, oooO, o000000.OooO00o.C0279OooO00o.f26598OooO0Oo);
        oO00000o.OooO0O0(composer, layoutDirection, o000000.OooO00o.C0279OooO00o.f26599OooO0o);
        ((p043OooooO0.o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, o000000.OooO00o.C0279OooO00o.f26601OooO0oO, composer, "composer", composer), composer, 0);
        composer.OooO0o0(2058660585);
        composer.OooO0o0(-678309503);
        RowScopeInstance rowScopeInstance = RowScopeInstance.f5773OooO00o;
        composer.OooO0o0(-492369756);
        Object objOooO0o = composer.OooO0o();
        oOO00O.OooO00o.C0323OooO00o c0323OooO00o = oOO00O.OooO00o.f29707OooO0O0;
        if (objOooO0o == c0323OooO00o) {
            objOooO0o = o0OOO00.OooO0Oo(Boolean.FALSE);
            composer.Oooo00o(objOooO0o);
        }
        composer.Oooo0o0();
        o0O00O o0o00o6 = (o0O00O) objOooO0o;
        composer.OooO0o0(-492369756);
        Object objOooO0o2 = composer.OooO0o();
        if (objOooO0o2 == c0323OooO00o) {
            objOooO0o2 = o0OOO00.OooO0Oo(Boolean.FALSE);
            composer.Oooo00o(objOooO0o2);
        }
        composer.Oooo0o0();
        o0O00O o0o00o7 = (o0O00O) objOooO0o2;
        composer.OooO0o0(-492369756);
        Object objOooO0o3 = composer.OooO0o();
        if (objOooO0o3 == c0323OooO00o) {
            objOooO0o3 = o0OOO00.OooO0Oo(null);
            composer.Oooo00o(objOooO0o3);
        }
        composer.Oooo0o0();
        o0O00O o0o00o8 = (o0O00O) objOooO0o3;
        OooO0Oo(o0o00o6, composer, 6);
        int i2 = i >> 21;
        OooO00o(o0o00o4, roomAtView, composer, (i2 & 14) | 64);
        OooO0OO(rowScopeInstance, o0o00o6, messageEditText, composer, 566);
        OooO0O0(o0o00o7, o0o00o8, composer, 54);
        OooO0o(messageEditText, o0o00o5, o0o00o6, o0o00o3, roomReplyView, composer, 33160 | (i2 & 112) | ((i >> 6) & 7168));
        OooO0o0(messageEditText, o0o00o3, roomReplyView, o0o00o8, o0o00o7, o0o00o2, roomAtView, panelLayout, facePanelView, composer, 153120264 | ((i >> 12) & 112) | (458752 & (i << 15)));
        oo0ooO oo0oooOooO00o = p032OoooO0.oo000o.OooO00o(composer);
        if (oo0oooOooO00o == null) {
            return;
        }
        oo0oooOooO00o.OooO00o(new oOo00o0o(o0o00o2, roomReplyView, roomAtView, facePanelView, panelLayout, o0o00o3, messageEditText, o0o00o4, o0o00o5, i));
    }

    public static final void OooO0oo(boolean z, MessageEditText messageEditText) {
        messageEditText.setAlpha(z ? 0.5f : 1.0f);
        if (z) {
            messageEditText.clearFocus();
        } else {
            messageEditText.requestFocus();
        }
    }

    public static final void OooOO0(@Nullable o00O0000 o00o0001, @NotNull MessageEditText etMessageInput) {
        Intrinsics.checkNotNullParameter(etMessageInput, "etMessageInput");
        if (o00o0001 != null) {
            etMessageInput.setText("");
            etMessageInput.getSpanManager().OooO00o();
            etMessageInput.getMaskKeys().clear();
        }
    }

    public static void OooOO0O(p151o00Oo0Oo.OooOo oooOo, RoomReplyView roomReplyView, MessageEditText messageEditText) {
        messageEditText.f11754OooooOo = oO0.f43646OoooO00;
        messageEditText.setText("");
        messageEditText.OooO0Oo(oooOo);
        Editable text = messageEditText.getText();
        Intrinsics.checkNotNull(text);
        messageEditText.setSelection(text.length());
    }
}
