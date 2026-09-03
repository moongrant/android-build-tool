package p546o0o0Ooo0;

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
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
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
import kotlinx.coroutines.CoroutineScope;
import o0O0O00.o000000;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0o0.o0O00o00;
import p028Oooo0o0.o0O0O0O;
import p044OooooOO.o00O00O;
import p048OoooooO.o00OO0O0;
import p048OoooooO.o00OOO0O;
import p100o000oOoO.o00OOOO0;
import p100o000oOoO.o00Oo00;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO00o0;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.o0o0Oo;
import p100o000oOoO.oO00000o;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p100o000oOoO.oo0ooO;
import p143o00OOooo.oo0oOO0;
import p145o00Oo0.o00000OO;
import p145o00Oo0.o000O0Oo;
import p159o00OoOO.o000O00O;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o000O0o;
import p254o00ooO0O.o0O0ooO;
import p263o00ooo.o000OO0O;
import p391o0OOooOo.o0O00000;
import p470o0Oooo0.o00;
import p470o0Oooo0.o00O000;
import p470o0Oooo0.o00O0000;
import p515o0o0O00.o00O00;
import p522o0o0O0o.o00O000o;
import p523o0o0O0o0.oo00oO;
import p530o0o0OOO.o00O;
import p530o0o0OOO.o00OO00O;
import p535o0o0OOoO.oO0O000;

/* JADX INFO: loaded from: classes2.dex */
public final class oO00o0 {

    public static final class OooO extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<Boolean> f44445Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<ImageView> f44446Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f44447Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(o0O00OO<Boolean> o0o00oo2, o0O00OO<ImageView> o0o00oo3, int i) {
            super(2);
            this.f44445Oooo0o = o0o00oo2;
            this.f44446Oooo0oO = o0o00oo3;
            this.f44447Oooo0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            oO00o0.OooO0O0(this.f44445Oooo0o, this.f44446Oooo0oO, ooo00o, this.f44447Oooo0oo | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ RoomAtView f44448Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(RoomAtView roomAtView) {
            super(0);
            this.f44448Oooo0o = roomAtView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            p606o0oo0O.OooOo.OooO0O0("102202");
            RoomAtView roomAtView = this.f44448Oooo0o;
            if (roomAtView != null) {
                if (roomAtView.f11848OoooO00) {
                    roomAtView.OooO0O0();
                } else {
                    roomAtView.OooO0OO();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<Boolean> f44449Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ RoomAtView f44450Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f44451Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o0O00OO<Boolean> o0o00oo2, RoomAtView roomAtView, int i) {
            super(2);
            this.f44449Oooo0o = o0o00oo2;
            this.f44450Oooo0oO = roomAtView;
            this.f44451Oooo0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            oO00o0.OooO00o(this.f44449Oooo0o, this.f44450Oooo0oO, ooo00o, this.f44451Oooo0oo | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<Context, ImageView> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<ImageView> f44452Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(o0O00OO<ImageView> o0o00oo2) {
            super(1);
            this.f44452Oooo0o = o0o00oo2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final ImageView invoke(Context context) {
            Context it = context;
            Intrinsics.checkNotNullParameter(it, "it");
            final ImageView imageView = new ImageView(it);
            this.f44452Oooo0o.setValue(imageView);
            imageView.setOnTouchListener(new View.OnTouchListener() { // from class: o0o0Ooo0.oOo00o0o
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

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<Boolean> f44453Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(o0O00OO<Boolean> o0o00oo2) {
            super(1);
            this.f44453Oooo0o = o0o00oo2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ImageView imageView) {
            ImageView ivMessageFaceSwitch = imageView;
            Intrinsics.checkNotNullParameter(ivMessageFaceSwitch, "ivMessageFaceSwitch");
            ivMessageFaceSwitch.setImageResource(this.f44453Oooo0o.getValue().booleanValue() ? R.drawable.icom_room_chat_emoji_gray : R.drawable.icom_room_chat_keyboard_gray);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<Context, MessageEditText> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ MessageEditText f44454Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(MessageEditText messageEditText) {
            super(1);
            this.f44454Oooo0o = messageEditText;
        }

        @Override // kotlin.jvm.functions.Function1
        public final MessageEditText invoke(Context context) {
            Context it = context;
            Intrinsics.checkNotNullParameter(it, "it");
            return this.f44454Oooo0o;
        }
    }

    public static final class OooOO0O extends Lambda implements Function1<MessageEditText, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<Boolean> f44455Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f44456Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(o0O00OO<Boolean> o0o00oo2, int i) {
            super(1);
            this.f44455Oooo0o = o0o00oo2;
            this.f44456Oooo0oO = i;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MessageEditText messageEditText) {
            MessageEditText it = messageEditText;
            Intrinsics.checkNotNullParameter(it, "it");
            if (!this.f44455Oooo0o.getValue().booleanValue()) {
                it.setHint(o000O0O0.OooO0OO(R.string.hint_say_something));
            } else if (this.f44456Oooo0oO > 0) {
                it.setHint(com.yalla.support.common.util.OooOo.OooO00o(o000O0O0.OooO0OO(R.string.times_available), String.valueOf(this.f44456Oooo0oO)));
            } else {
                it.setHint(o000O0O0.OooO0OO(R.string.hint_say_something));
                ToastUtil.f12567OooO00o.OooO0O0(o000O0O0.OooO0OO(R.string.Out_of_broadcast_chances));
                this.f44455Oooo0o.setValue(Boolean.FALSE);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<Boolean> f44457Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(o0O00OO<Boolean> o0o00oo2) {
            super(0);
            this.f44457Oooo0o = o0o00oo2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0O00OO<Boolean> o0o00oo2 = this.f44457Oooo0o;
            o0o00oo2.setValue(Boolean.valueOf(!o0o00oo2.getValue().booleanValue()));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ int f44458Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o0O0O0O f44459Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<Boolean> f44460Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ MessageEditText f44461Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(o0O0O0O o0o0o0o, o0O00OO<Boolean> o0o00oo2, MessageEditText messageEditText, int i) {
            super(2);
            this.f44459Oooo0o = o0o0o0o;
            this.f44460Oooo0oO = o0o00oo2;
            this.f44461Oooo0oo = messageEditText;
            this.f44458Oooo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            oO00o0.OooO0OO(this.f44459Oooo0o, this.f44460Oooo0oO, this.f44461Oooo0oo, ooo00o, this.f44458Oooo | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<Boolean> f44462Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f44463Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(o0O00OO<Boolean> o0o00oo2, int i) {
            super(2);
            this.f44462Oooo0o = o0o00oo2;
            this.f44463Oooo0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            oO00o0.OooO0Oo(this.f44462Oooo0o, ooo00o, this.f44463Oooo0oO | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends Lambda implements Function1<o00OOOO0, o0o0Oo> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ MessageEditText f44464Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(MessageEditText messageEditText) {
            super(1);
            this.f44464Oooo0o = messageEditText;
        }

        @Override // kotlin.jvm.functions.Function1
        public final o0o0Oo invoke(o00OOOO0 o00oooo1) {
            o00OOOO0 DisposableEffect = o00oooo1;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            return new oOo000Oo(this.f44464Oooo0o);
        }
    }

    public static final class OooOo00 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<Boolean> f44465Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f44466Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(o0O00OO<Boolean> o0o00oo2, int i) {
            super(2);
            this.f44465Oooo0o = o0o00oo2;
            this.f44466Oooo0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            oO00o0.OooO0Oo(this.f44465Oooo0o, ooo00o, this.f44466Oooo0oO | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo0 extends Lambda implements Function1<Boolean, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<o00O0000> f44467Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo0(o0O00OO<o00O0000> o0o00oo2) {
            super(1);
            this.f44467Oooo0o = o0o00oo2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            Boolean it = bool;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            if (it.booleanValue()) {
                o00O0000 value = this.f44467Oooo0o.getValue();
                o00 o00Var = value != null ? value.f40624OooO0OO : null;
                if (o00Var != null) {
                    o00Var.f40615OooO0O0 = !it.booleanValue();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 extends Lambda implements Function1<Boolean, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<o00O0000> f44468Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo000(o0O00OO<o00O0000> o0o00oo2) {
            super(1);
            this.f44468Oooo0o = o0o00oo2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            o00O0000 value;
            Boolean it = bool;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            if (it.booleanValue() && (value = this.f44468Oooo0o.getValue()) != null) {
                value.OooO0OO();
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.room.live.bottom.RoomBottomMessageInputManagerKt$RoomMessageBottomLayoutLifecycleHelper$4", f = "RoomBottomMessageInputManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o000oOoO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<ImageView> f44469Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ PanelLayout f44470Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<o00O0000> f44471Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ MessageEditText f44472Oooo0oo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final /* synthetic */ FacePanelView f44473OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ RoomReplyView f44474OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<Boolean> f44475OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ RoomAtView f44476OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<Boolean> f44477OoooOO0;

        public static final class OooO00o extends Lambda implements Function2<Boolean, Integer, Unit> {

            /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
            public final /* synthetic */ RoomAtView f44478Oooo;

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ MessageEditText f44479Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public final /* synthetic */ o0O00OO<Boolean> f44480Oooo0oO;

            /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
            public final /* synthetic */ RoomReplyView f44481Oooo0oo;

            /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
            public final /* synthetic */ FacePanelView f44482OoooO00;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(MessageEditText messageEditText, o0O00OO<Boolean> o0o00oo2, RoomReplyView roomReplyView, RoomAtView roomAtView, FacePanelView facePanelView) {
                super(2);
                this.f44479Oooo0o = messageEditText;
                this.f44480Oooo0oO = o0o00oo2;
                this.f44481Oooo0oo = roomReplyView;
                this.f44478Oooo = roomAtView;
                this.f44482OoooO00 = facePanelView;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Unit invoke(Boolean bool, Integer num) {
                boolean zBooleanValue = bool.booleanValue();
                num.intValue();
                o00OO00O.f43313OooooOo.OooO00o().f43344OooOooO.setValue(Boolean.valueOf(zBooleanValue));
                oO00o0.OooO0oo(false, this.f44479Oooo0o);
                if (zBooleanValue) {
                    FacePanelView facePanelView = this.f44482OoooO00;
                    if (facePanelView != null) {
                        facePanelView.OooO0OO();
                    }
                } else {
                    this.f44480Oooo0oO.setValue(Boolean.FALSE);
                    RoomReplyView roomReplyView = this.f44481Oooo0oo;
                    if (roomReplyView != null) {
                        roomReplyView.OooO0OO();
                    }
                    RoomAtView roomAtView = this.f44478Oooo;
                    if (roomAtView != null) {
                        roomAtView.OooO0O0();
                    }
                }
                return Unit.INSTANCE;
            }
        }

        public static final class OooO0O0 extends Lambda implements Function3<Boolean, Integer, View, Unit> {

            /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
            public final /* synthetic */ o0O00OO<ImageView> f44483Oooo;

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ o0O00OO<Boolean> f44484Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public final /* synthetic */ MessageEditText f44485Oooo0oO;

            /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
            public final /* synthetic */ FacePanelView f44486Oooo0oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(o0O00OO<Boolean> o0o00oo2, MessageEditText messageEditText, FacePanelView facePanelView, o0O00OO<ImageView> o0o00oo3) {
                super(3);
                this.f44484Oooo0o = o0o00oo2;
                this.f44485Oooo0oO = messageEditText;
                this.f44486Oooo0oo = facePanelView;
                this.f44483Oooo = o0o00oo3;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Unit invoke(Boolean bool, Integer num, View view) {
                boolean zBooleanValue = bool.booleanValue();
                num.intValue();
                this.f44484Oooo0o.setValue(Boolean.valueOf(zBooleanValue));
                if (zBooleanValue) {
                    oO00o0.OooO0oo(false, this.f44485Oooo0oO);
                } else {
                    FacePanelView facePanelView = this.f44486Oooo0oo;
                    oO00o0.OooO0oo(!(facePanelView != null ? facePanelView.isEmojiPanel : false), this.f44485Oooo0oO);
                }
                ImageView value = this.f44483Oooo.getValue();
                if (value != null) {
                    value.setTag(Boolean.valueOf(zBooleanValue));
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000oOoO(PanelLayout panelLayout, o0O00OO<o00O0000> o0o00oo2, MessageEditText messageEditText, o0O00OO<ImageView> o0o00oo3, o0O00OO<Boolean> o0o00oo4, RoomReplyView roomReplyView, RoomAtView roomAtView, FacePanelView facePanelView, o0O00OO<Boolean> o0o00oo5, Continuation<? super o000oOoO> continuation) {
            super(2, continuation);
            this.f44470Oooo0o = panelLayout;
            this.f44471Oooo0oO = o0o00oo2;
            this.f44472Oooo0oo = messageEditText;
            this.f44469Oooo = o0o00oo3;
            this.f44475OoooO00 = o0o00oo4;
            this.f44474OoooO0 = roomReplyView;
            this.f44476OoooO0O = roomAtView;
            this.f44473OoooO = facePanelView;
            this.f44477OoooOO0 = o0o00oo5;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new o000oOoO(this.f44470Oooo0o, this.f44471Oooo0oO, this.f44472Oooo0oo, this.f44469Oooo, this.f44475OoooO00, this.f44474OoooO0, this.f44476OoooO0O, this.f44473OoooO, this.f44477OoooOO0, continuation);
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
            if (this.f44470Oooo0o != null && this.f44471Oooo0oO.getValue() == null) {
                o0O00OO<o00O0000> o0o00oo2 = this.f44471Oooo0oO;
                o00O0000 o00o0001 = new o00O0000(this.f44470Oooo0o, this.f44472Oooo0oo);
                ImageView value2 = this.f44469Oooo.getValue();
                Intrinsics.checkNotNull(value2);
                o00o0001.OooO0O0(value2);
                o0o00oo2.setValue(o00o0001);
                o00O0000 value3 = this.f44471Oooo0oO.getValue();
                if (value3 != null) {
                    value3.f40623OooO0O0 = new OooO00o(this.f44472Oooo0oo, this.f44475OoooO00, this.f44474OoooO0, this.f44476OoooO0O, this.f44473OoooO);
                }
            }
            o00O0000 value4 = this.f44471Oooo0oO.getValue();
            if (value4 != null) {
                value4.f40622OooO00o = new OooO0O0(this.f44477OoooOO0, this.f44472Oooo0oo, this.f44473OoooO, this.f44469Oooo);
            }
            ImageView value5 = this.f44469Oooo.getValue();
            if (value5 != null && (value = this.f44471Oooo0oO.getValue()) != null) {
                value.OooO0O0(value5);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.room.live.bottom.RoomBottomMessageInputManagerKt$RoomMessageBottomLayoutLifecycleHelper$6", f = "RoomBottomMessageInputManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o00O0O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ MessageEditText f44487Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<o00O0000> f44488Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ RoomReplyView f44489Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00O0O(MessageEditText messageEditText, o0O00OO<o00O0000> o0o00oo2, RoomReplyView roomReplyView, Continuation<? super o00O0O> continuation) {
            super(2, continuation);
            this.f44487Oooo0o = messageEditText;
            this.f44488Oooo0oO = o0o00oo2;
            this.f44489Oooo0oo = roomReplyView;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new o00O0O(this.f44487Oooo0o, this.f44488Oooo0oO, this.f44489Oooo0oo, continuation);
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
            MessageEditText view = this.f44487Oooo0o;
            o0O00OO<o00O0000> o0o00oo2 = this.f44488Oooo0oO;
            RoomReplyView roomReplyView = this.f44489Oooo0oo;
            o00O0000 value = o0o00oo2.getValue();
            o00 o00Var = value != null ? value.f40624OooO0OO : null;
            if (o00Var != null) {
                o00Var.f40615OooO0O0 = true;
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
        public final /* synthetic */ o0O00OO<ImageView> f44490Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ MessageEditText f44491Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<o00O0000> f44492Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ RoomReplyView f44493Oooo0oo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final /* synthetic */ PanelLayout f44494OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<Boolean> f44495OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<Boolean> f44496OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ RoomAtView f44497OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public final /* synthetic */ FacePanelView f44498OoooOO0;

        /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
        public final /* synthetic */ int f44499o000oOoO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Oo0(MessageEditText messageEditText, o0O00OO<o00O0000> o0o00oo2, RoomReplyView roomReplyView, o0O00OO<ImageView> o0o00oo3, o0O00OO<Boolean> o0o00oo4, o0O00OO<Boolean> o0o00oo5, RoomAtView roomAtView, PanelLayout panelLayout, FacePanelView facePanelView, int i) {
            super(2);
            this.f44491Oooo0o = messageEditText;
            this.f44492Oooo0oO = o0o00oo2;
            this.f44493Oooo0oo = roomReplyView;
            this.f44490Oooo = o0o00oo3;
            this.f44496OoooO00 = o0o00oo4;
            this.f44495OoooO0 = o0o00oo5;
            this.f44497OoooO0O = roomAtView;
            this.f44494OoooO = panelLayout;
            this.f44498OoooOO0 = facePanelView;
            this.f44499o000oOoO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            oO00o0.OooO0o0(this.f44491Oooo0o, this.f44492Oooo0oO, this.f44493Oooo0oo, this.f44490Oooo, this.f44496OoooO00, this.f44495OoooO0, this.f44497OoooO0O, this.f44494OoooO, this.f44498OoooOO0, ooo00o, this.f44499o000oOoO | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class o00Ooo extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<o00O0000> f44500Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ RoomReplyView f44501Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ MessageEditText f44502Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<Boolean> f44503Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Ooo(RoomReplyView roomReplyView, MessageEditText messageEditText, o0O00OO<Boolean> o0o00oo2, o0O00OO<o00O0000> o0o00oo3) {
            super(0);
            this.f44501Oooo0o = roomReplyView;
            this.f44502Oooo0oO = messageEditText;
            this.f44503Oooo0oo = o0o00oo2;
            this.f44500Oooo = o0o00oo3;
        }

        /* JADX WARN: Code duplicated, block: B:68:0x013d A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:69:0x013f  */
        /* JADX WARN: Code duplicated, block: B:72:0x014d  */
        /* JADX WARN: Code duplicated, block: B:73:0x0180  */
        /* JADX WARN: Code duplicated, block: B:75:0x0186  */
        /* JADX WARN: Code duplicated, block: B:76:0x0190  */
        /* JADX WARN: Code duplicated, block: B:78:0x0193  */
        /* JADX WARN: Code duplicated, block: B:79:0x01a2  */
        /* JADX WARN: Instruction removed from duplicated block: B:72:0x014d, please report this as an issue */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            String string;
            ChatModel f11852Oooo0oO;
            RoomMessageReplyInfo replayModel;
            p150o00Oo0Oo.OooOo oooOo;
            if (this.f44501Oooo0o != null) {
                String strValueOf = String.valueOf(this.f44502Oooo0oO.getText());
                MessageEditText messageEditText = this.f44502Oooo0oO;
                o0O00OO<Boolean> o0o00oo2 = this.f44503Oooo0oo;
                RoomReplyView roomReplyView = this.f44501Oooo0o;
                o00O0000 value = this.f44500Oooo.getValue();
                boolean z = true;
                boolean z2 = messageEditText.getSpanManager().OooO0Oo("@") > 0;
                String string2 = StringsKt.trim((CharSequence) strValueOf).toString();
                if (string2 == null || StringsKt.isBlank(string2)) {
                    String strOooO0OO = o000O0O0.OooO0OO(R.string.chat_room_on_Txt);
                    ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
                    if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                        z = false;
                    }
                    if (!z) {
                        o0O0ooO o0o0oooOooO0O0 = p074o000O0oo.OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o0o0oooOooO0O0.run();
                        } else {
                            p254o00ooO0O.o00O000 o00o001 = p254o00ooO0O.o00O000.f34346OooO00o;
                            p254o00ooO0O.o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
                        }
                    }
                } else {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    o00O o00o2 = o00O.f43140OooO00o;
                    if (jCurrentTimeMillis - ((Number) o00O.f43190OoooOoo.getValue()).longValue() < 1000) {
                        String strOooO0OO2 = o000O0O0.OooO0OO(R.string.message_too_often);
                        ToastUtil toastUtil2 = ToastUtil.f12568OooO0O0;
                        if (strOooO0OO2 != null && !StringsKt.isBlank(strOooO0OO2)) {
                            z = false;
                        }
                        if (!z) {
                            o0O0ooO o0o0oooOooO0O1 = p074o000O0oo.OooOOO.OooO0O0(toastUtil2, strOooO0OO2, "runnable");
                            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                o0o0oooOooO0O1.run();
                            } else {
                                p254o00ooO0O.o00O000 o00o002 = p254o00ooO0O.o00O000.f34346OooO00o;
                                p254o00ooO0O.o00O000.f34348OooO0OO.post(o0o0oooOooO0O1);
                            }
                        }
                    } else {
                        string = messageEditText.getTransformedText().toString();
                        ParcelableSnapshotMutableState parcelableSnapshotMutableState = o00O.f43191Ooooo00;
                        if (StringsKt.OooO((String) parcelableSnapshotMutableState.getValue(), string)) {
                            String strOooO0OO3 = o000O0O0.OooO0OO(R.string.char_room_content);
                            ToastUtil toastUtil3 = ToastUtil.f12568OooO0O0;
                            if (strOooO0OO3 != null && !StringsKt.isBlank(strOooO0OO3)) {
                                z = false;
                            }
                            if (!z) {
                                o0O0ooO o0o0oooOooO0O2 = p074o000O0oo.OooOOO.OooO0O0(toastUtil3, strOooO0OO3, "runnable");
                                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                    o0o0oooOooO0O2.run();
                                } else {
                                    p254o00ooO0O.o00O000 o00o003 = p254o00ooO0O.o00O000.f34346OooO00o;
                                    p254o00ooO0O.o00O000.f34348OooO0OO.post(o0o0oooOooO0O2);
                                }
                            }
                        } else {
                            Intrinsics.checkNotNullParameter(string, "<set-?>");
                            parcelableSnapshotMutableState.setValue(string);
                        }
                        if (!TextUtils.isEmpty(string) && o000O00O.OooO().f32430Oooo0oo != null) {
                            if (o0o00oo2.getValue().booleanValue()) {
                                if (value != null) {
                                    value.OooO0OO();
                                }
                                Objects.requireNonNull(p159o00OoOO.o00O000.OooO());
                                if (p159o00OoOO.o00O000.f32468OooO00o != null) {
                                    o00O00.OooO0O0("sendNobleBroadcast " + string);
                                    HashMap map = new HashMap();
                                    map.put(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, string);
                                    map.put("lang", p168o00Ooo0.oo000o.OooO00o());
                                    p159o00OoOO.o00O000.f32468OooO00o.OooO0o(10019, o0Oo0oo.OooO0Oo(map));
                                }
                            } else {
                                f11852Oooo0oO = roomReplyView.getF11852Oooo0oO();
                                if (f11852Oooo0oO != null) {
                                    replayModel = new RoomMessageReplyInfo().getReplayModel(f11852Oooo0oO);
                                } else {
                                    replayModel = null;
                                }
                                if (z2) {
                                    oooOo = messageEditText.getSpanManager().OooO0OO("@").get(0);
                                } else {
                                    oooOo = null;
                                }
                                p159o00OoOO.o00O000.OooO().OooOoO0(string, oooOo, replayModel);
                                messageEditText.getSpanManager().OooO00o();
                                roomReplyView.setChatModel(null);
                            }
                            o00O o00o3 = o00O.f43140OooO00o;
                            o00O.f43190OoooOoo.setValue(Long.valueOf(System.currentTimeMillis()));
                            oO00o0.OooOO0(value, messageEditText);
                        }
                    }
                }
                string = null;
                if (!TextUtils.isEmpty(string)) {
                    if (o0o00oo2.getValue().booleanValue()) {
                        if (value != null) {
                            value.OooO0OO();
                        }
                        Objects.requireNonNull(p159o00OoOO.o00O000.OooO());
                        if (p159o00OoOO.o00O000.f32468OooO00o != null) {
                            o00O00.OooO0O0("sendNobleBroadcast " + string);
                            HashMap map2 = new HashMap();
                            map2.put(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, string);
                            map2.put("lang", p168o00Ooo0.oo000o.OooO00o());
                            p159o00OoOO.o00O000.f32468OooO00o.OooO0o(10019, o0Oo0oo.OooO0Oo(map2));
                        }
                    } else {
                        f11852Oooo0oO = roomReplyView.getF11852Oooo0oO();
                        if (f11852Oooo0oO != null) {
                            replayModel = new RoomMessageReplyInfo().getReplayModel(f11852Oooo0oO);
                        } else {
                            replayModel = null;
                        }
                        if (z2) {
                            oooOo = messageEditText.getSpanManager().OooO0OO("@").get(0);
                        } else {
                            oooOo = null;
                        }
                        p159o00OoOO.o00O000.OooO().OooOoO0(string, oooOo, replayModel);
                        messageEditText.getSpanManager().OooO00o();
                        roomReplyView.setChatModel(null);
                    }
                    o00O o00o4 = o00O.f43140OooO00o;
                    o00O.f43190OoooOoo.setValue(Long.valueOf(System.currentTimeMillis()));
                    oO00o0.OooOO0(value, messageEditText);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.room.live.bottom.RoomBottomMessageInputManagerKt$RoomMessageBottomLayoutLifecycleHelper$5", f = "RoomBottomMessageInputManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o0OoOo0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ FacePanelView f44504Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ MessageEditText f44505Oooo0oO;

        public static final class OooO00o extends Lambda implements Function1<Boolean, Unit> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ MessageEditText f44506Oooo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(MessageEditText messageEditText) {
                super(1);
                this.f44506Oooo0o = messageEditText;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(Boolean bool) {
                oO00o0.OooO0oo(!bool.booleanValue(), this.f44506Oooo0o);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OoOo0(FacePanelView facePanelView, MessageEditText messageEditText, Continuation<? super o0OoOo0> continuation) {
            super(2, continuation);
            this.f44504Oooo0o = facePanelView;
            this.f44505Oooo0oO = messageEditText;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new o0OoOo0(this.f44504Oooo0o, this.f44505Oooo0oO, continuation);
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
            FacePanelView facePanelView = this.f44504Oooo0o;
            if (facePanelView != null) {
                MessageEditText messageEditText = this.f44505Oooo0oO;
                facePanelView.OooO0O0(messageEditText, new OooO00o(messageEditText));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class oo000o extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<o00O0000> f44507Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ MessageEditText f44508Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<Boolean> f44509Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<Boolean> f44510Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ int f44511OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ RoomReplyView f44512OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public oo000o(MessageEditText messageEditText, o0O00OO<Boolean> o0o00oo2, o0O00OO<Boolean> o0o00oo3, o0O00OO<o00O0000> o0o00oo4, RoomReplyView roomReplyView, int i) {
            super(2);
            this.f44508Oooo0o = messageEditText;
            this.f44509Oooo0oO = o0o00oo2;
            this.f44510Oooo0oo = o0o00oo3;
            this.f44507Oooo = o0o00oo4;
            this.f44512OoooO00 = roomReplyView;
            this.f44511OoooO0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            oO00o0.OooO0o(this.f44508Oooo0o, this.f44509Oooo0oO, this.f44510Oooo0oo, this.f44507Oooo, this.f44512OoooO00, ooo00o, this.f44511OoooO0 | 1);
            return Unit.INSTANCE;
        }
    }

    public static final p048OoooooO.o00OOOO0 OooO() {
        return o00OOO0O.OooO0O0(OoooooO.o00OOOO0.OooO00o.f4198Oooo0o, oOo0000O.f44586Oooo0o);
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(o0O00OO<Boolean> o0o00oo2, RoomAtView roomAtView, oOO00O ooo00o, int i) {
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(644052966);
        Function3<p100o000oOoO.o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
        Integer num = (Integer) o00O00O.OooO0O0(o00OO00O.f43313OooooOo.OooO00o().f43329OooOOOO, ooo00oOooOOo).getValue();
        int iIntValue = num != null ? num.intValue() : 0;
        if (iIntValue == 1 || iIntValue == 2) {
            Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(o0o00oo2.getValue().booleanValue() ? R.drawable.icom_room_chat_at_color : R.drawable.icom_room_chat_at_gray, ooo00oOooOOo), null, o000O0o.OooO0O0(OooO(), false, false, null, new OooO00o(roomAtView), 253), null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, ooo00oOooOOo, 56, 120);
        } else if (roomAtView != null) {
            roomAtView.OooO0O0();
        }
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO0O0(o0o00oo2, roomAtView, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @SuppressLint({"ClickableViewAccessibility"})
    public static final void OooO0O0(o0O00OO<Boolean> o0o00oo2, o0O00OO<ImageView> o0o00oo3, oOO00O ooo00o, int i) {
        int i2;
        boolean z;
        p048OoooooO.o00OOOO0 o00oooo0OooOOO0;
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-2015237110);
        if ((i & 14) == 0) {
            i2 = (ooo00oOooOOo.Oooo0oo(o0o00oo2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= ooo00oOooOOo.Oooo0oo(o0o00oo3) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && ooo00oOooOOo.OooOo0()) {
            ooo00oOooOOo.OooOoo0();
        } else {
            Function3<p100o000oOoO.o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            ooo00oOooOOo.OooO0o0(-1287159574);
            ooo00oOooOOo.OooO0o0(-1800107778);
            boolean z2 = false;
            if (Intrinsics.areEqual(p617o0oo0o.Oooo0.OooO00o((Context) ooo00oOooOOo.OooOO0o(o0O0O00.f6591OooO0O0)), "BridgeContext")) {
                ooo00oOooOOo.Oooo0o0();
                z = false;
            } else {
                ooo00oOooOOo.Oooo0o0();
                z = true;
            }
            if (z) {
                if (o0o00oo2.getValue().booleanValue() && Intrinsics.areEqual(o00O00O.OooO0O0(SharedGifFaceManager.INSTANCE.getContainsPayEmojiLiveData(), ooo00oOooOOo).getValue(), Boolean.TRUE)) {
                    p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
                    if (Intrinsics.areEqual(o00O00O.OooO0O0(p497o0o00Oo.OooOOO0.OooO0o0().OooOO0o(), ooo00oOooOOo).getValue(), Boolean.FALSE)) {
                        z2 = true;
                    }
                }
                if (z2) {
                    o00oooo0OooOOO0 = Oooo000.o00O00.OooOOO0(OoooooO.o00OOOO0.OooO00o.f4198Oooo0o, false, o00000OO.OooO0OO(4294863980L), (float) 4.5d, false, false, 16, 12, 1, 569);
                } else {
                    o00oooo0OooOOO0 = OoooooO.o00OOOO0.OooO00o.f4198Oooo0o;
                }
            } else {
                o00oooo0OooOOO0 = OoooooO.o00OOOO0.OooO00o.f4198Oooo0o;
            }
            ooo00oOooOOo.Oooo0o0();
            ooo00oOooOOo.OooO0o0(1157296644);
            boolean zOooo0oo = ooo00oOooOOo.Oooo0oo(o0o00oo3);
            Object objOooO0o = ooo00oOooOOo.OooO0o();
            if (zOooo0oo || objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
                objOooO0o = new OooO0OO(o0o00oo3);
                ooo00oOooOOo.Oooo00o(objOooO0o);
            }
            ooo00oOooOOo.Oooo0o0();
            Function1 function1 = (Function1) objOooO0o;
            p048OoooooO.o00OOOO0 o00oooo0OooOOoo = OooO().OooOOoo(o00oooo0OooOOO0);
            ooo00oOooOOo.OooO0o0(1157296644);
            boolean zOooo0oo2 = ooo00oOooOOo.Oooo0oo(o0o00oo2);
            Object objOooO0o2 = ooo00oOooOOo.OooO0o();
            if (zOooo0oo2 || objOooO0o2 == oOO00O.OooO00o.f29689OooO0O0) {
                objOooO0o2 = new OooO0o(o0o00oo2);
                ooo00oOooOOo.Oooo00o(objOooO0o2);
            }
            ooo00oOooOOo.Oooo0o0();
            AndroidView_androidKt.OooO00o(function1, o00oooo0OooOOoo, (Function1) objOooO0o2, ooo00oOooOOo, 0, 0);
        }
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO(o0o00oo2, o0o00oo3, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0OO(o0O0O0O o0o0o0o, o0O00OO<Boolean> o0o00oo2, MessageEditText messageEditText, oOO00O ooo00o, int i) {
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-9917991);
        Function3<p100o000oOoO.o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
        MutableLiveData<Integer> mutableLiveData = o000O00O.OooO().f32434OoooO0O;
        Intrinsics.checkNotNullExpressionValue(mutableLiveData, "getInstance().broadcastNumLiveData");
        Integer num = (Integer) o00O00O.OooO0O0(mutableLiveData, ooo00oOooOOo).getValue();
        int iIntValue = num != null ? num.intValue() : 0;
        OooOO0 oooOO1 = new OooOO0(messageEditText);
        p048OoooooO.o00OOOO0 o00oooo0OooO0oO = PaddingKt.OooO0oO(o0o0o0o.OooO00o(OoooooO.o00OOOO0.OooO00o.f4198Oooo0o, true), (float) 6.5d, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2);
        Integer numValueOf = Integer.valueOf(iIntValue);
        ooo00oOooOOo.OooO0o0(511388516);
        boolean zOooo0oo = ooo00oOooOOo.Oooo0oo(numValueOf) | ooo00oOooOOo.Oooo0oo(o0o00oo2);
        Object objOooO0o = ooo00oOooOOo.OooO0o();
        if (zOooo0oo || objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
            objOooO0o = new OooOO0O(o0o00oo2, iIntValue);
            ooo00oOooOOo.Oooo00o(objOooO0o);
        }
        ooo00oOooOOo.Oooo0o0();
        AndroidView_androidKt.OooO00o(oooOO1, o00oooo0OooO0oO, (Function1) objOooO0o, ooo00oOooOOo, 0, 0);
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooOOO0(o0o0o0o, o0o00oo2, messageEditText, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0Oo(o0O00OO<Boolean> o0o00oo2, oOO00O ooo00o, int i) {
        int i2;
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-975756959);
        if ((i & 14) == 0) {
            i2 = (ooo00oOooOOo.Oooo0oo(o0o00oo2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && ooo00oOooOOo.OooOo0()) {
            ooo00oOooOOo.OooOoo0();
        } else {
            Function3<p100o000oOoO.o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            Pair pair = (Pair) o00O00O.OooO0O0(p498o0o00Oo0.OooOOO.f41216OooO00o.OooOOO0(), ooo00oOooOOo).getValue();
            if (pair == null) {
                oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooOo00(o0o00oo2, i));
                return;
            }
            if (((Number) pair.getSecond()).intValue() > PremiumLevel.Premium4.getValue() && ((Boolean) pair.getFirst()).booleanValue()) {
                o000OO0O o000oo0oOooO00o = o00000.OooO0O0.OooO00o(o0o00oo2.getValue().booleanValue() ? R.drawable.icom_room_chat_broadcast_color : R.drawable.icon_room_chat_broadcast_gray, ooo00oOooOOo);
                p048OoooooO.o00OOOO0 o00oooo0OooO0OO = o000O0o.OooO0OO(OooO(), ooo00oOooOOo);
                ooo00oOooOOo.OooO0o0(1157296644);
                boolean zOooo0oo = ooo00oOooOOo.Oooo0oo(o0o00oo2);
                Object objOooO0o = ooo00oOooOOo.OooO0o();
                if (zOooo0oo || objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
                    objOooO0o = new OooOOO(o0o00oo2);
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
        oo0oooOooOo2.OooO00o(new OooOOOO(o0o00oo2, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0o(MessageEditText messageEditText, o0O00OO<Boolean> o0o00oo2, o0O00OO<Boolean> o0o00oo3, o0O00OO<o00O0000> o0o00oo4, RoomReplyView roomReplyView, oOO00O ooo00o, int i) {
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-168053700);
        Function3<p100o000oOoO.o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
        Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(o0o00oo2.getValue().booleanValue() ? R.drawable.btn_send : R.drawable.btn_send2, ooo00oOooOOo), null, o000O0o.OooO0O0(OooO(), false, false, null, new o00Ooo(roomReplyView, messageEditText, o0o00oo3, o0o00oo4), 253), null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, ooo00oOooOOo, 56, 120);
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new oo000o(messageEditText, o0o00oo2, o0o00oo3, o0o00oo4, roomReplyView, i));
    }

    @Composable
    public static final void OooO0o0(MessageEditText messageEditText, o0O00OO<o00O0000> o0o00oo2, RoomReplyView roomReplyView, o0O00OO<ImageView> o0o00oo3, o0O00OO<Boolean> o0o00oo4, o0O00OO<Boolean> o0o00oo5, RoomAtView roomAtView, PanelLayout panelLayout, FacePanelView facePanelView, oOO00O ooo00o, int i) {
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(1233344444);
        Function3<p100o000oOoO.o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
        Unit unit = Unit.INSTANCE;
        o00Oo00.OooO0O0(unit, new OooOo(messageEditText), ooo00oOooOOo);
        ooo00oOooOOo.OooO0o0(602286575);
        if (p519o0o0O0O.o0O0O00.OooO00o(ooo00oOooOOo)) {
            Observable observableOooO00o = oo00oO.OooO00o("HIDE_KEYBOARD");
            ooo00oOooOOo.OooO0o0(1157296644);
            boolean zOooo0oo = ooo00oOooOOo.Oooo0oo(o0o00oo2);
            Object objOooO0o = ooo00oOooOOo.OooO0o();
            if (zOooo0oo || objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
                objOooO0o = new Oooo000(o0o00oo2);
                ooo00oOooOOo.Oooo00o(objOooO0o);
            }
            ooo00oOooOOo.Oooo0o0();
            o00O000o.OooO00o(observableOooO00o, new oo0oOO0((Function1) objOooO0o, 4), ooo00oOooOOo, 72);
            Observable observableOooO00o2 = oo00oO.OooO00o("IGNORE_KEYBOARD");
            ooo00oOooOOo.OooO0o0(1157296644);
            boolean zOooo0oo2 = ooo00oOooOOo.Oooo0oo(o0o00oo2);
            Object objOooO0o2 = ooo00oOooOOo.OooO0o();
            if (zOooo0oo2 || objOooO0o2 == oOO00O.OooO00o.f29689OooO0O0) {
                objOooO0o2 = new Oooo0(o0o00oo2);
                ooo00oOooOOo.Oooo00o(objOooO0o2);
            }
            ooo00oOooOOo.Oooo0o0();
            o00O000o.OooO00o(observableOooO00o2, new p143o00OOooo.oo0o0O0((Function1) objOooO0o2, 2), ooo00oOooOOo, 72);
        }
        ooo00oOooOOo.Oooo0o0();
        o00Oo00.OooO0OO(messageEditText, panelLayout, o0o00oo2, new o000oOoO(panelLayout, o0o00oo2, messageEditText, o0o00oo3, o0o00oo5, roomReplyView, roomAtView, facePanelView, o0o00oo4, null), ooo00oOooOOo);
        o00Oo00.OooO0Oo(facePanelView, messageEditText, new o0OoOo0(facePanelView, messageEditText, null), ooo00oOooOOo);
        o00Oo00.OooO0o0(unit, new o00O0O(messageEditText, o0o00oo2, roomReplyView, null), ooo00oOooOOo);
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new o00Oo0(messageEditText, o0o00oo2, roomReplyView, o0o00oo3, o0o00oo4, o0o00oo5, roomAtView, panelLayout, facePanelView, i));
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    public static final void OooO0oO(o0O00OO o0o00oo2, RoomReplyView roomReplyView, RoomAtView roomAtView, FacePanelView facePanelView, PanelLayout panelLayout, o0O00OO o0o00oo3, MessageEditText messageEditText, o0O00OO o0o00oo4, o0O00OO o0o00oo5, oOO00O ooo00o, int i) {
        oOO00O composer = ooo00o.OooOOo(-1053917346);
        Function3<p100o000oOoO.o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
        p048OoooooO.o00OOOO0 o00oooo0OooO0oO = PaddingKt.OooO0oO(o000O0o.OooO0O0(BackgroundKt.OooO0O0(SizeKt.OooO0oO(SizeKt.OooO0o(OoooooO.o00OOOO0.OooO00o.f4198Oooo0o), 50), o00000OO.OooO0OO(4294572537L), o000O0Oo.f32099OooO00o), false, false, null, oOo00ooO.f44593Oooo0o, 253), (float) 6.5d, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2);
        composer.OooO0o0(693286680);
        p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
        o000000 o000000VarOooO00o = o0O00o00.OooO00o(p028Oooo0o0.o00O000.f2030OooO0O0, o00OO0O0.OooO00o.f4180OooOO0O, composer);
        composer.OooO0o0(-1323940314);
        o0000O0O.OooO oooO = (o0000O0O.OooO) composer.OooOO0o(o000.f6356OooO0o0);
        LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o000.f6360OooOO0O);
        o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o000.f6364OooOOOO);
        Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
        Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o0O0O00.o00Oo0.OooO0O0(o00oooo0OooO0oO);
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
        oO00000o.OooO0O0(composer, o000000VarOooO00o, o000000.OooO00o.C0279OooO00o.f26581OooO0o0);
        oO00000o.OooO0O0(composer, oooO, o000000.OooO00o.C0279OooO00o.f26579OooO0Oo);
        oO00000o.OooO0O0(composer, layoutDirection, o000000.OooO00o.C0279OooO00o.f26580OooO0o);
        ((p043OooooO0.o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, o000000.OooO00o.C0279OooO00o.f26582OooO0oO, composer, "composer", composer), composer, 0);
        composer.OooO0o0(2058660585);
        composer.OooO0o0(-678309503);
        RowScopeInstance rowScopeInstance = RowScopeInstance.f5758OooO00o;
        composer.OooO0o0(-492369756);
        Object objOooO0o = composer.OooO0o();
        oOO00O.OooO00o.C0323OooO00o c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
        if (objOooO0o == c0323OooO00o) {
            objOooO0o = o0OOO00.OooO0Oo(Boolean.FALSE);
            composer.Oooo00o(objOooO0o);
        }
        composer.Oooo0o0();
        o0O00OO o0o00oo6 = (o0O00OO) objOooO0o;
        composer.OooO0o0(-492369756);
        Object objOooO0o2 = composer.OooO0o();
        if (objOooO0o2 == c0323OooO00o) {
            objOooO0o2 = o0OOO00.OooO0Oo(Boolean.FALSE);
            composer.Oooo00o(objOooO0o2);
        }
        composer.Oooo0o0();
        o0O00OO o0o00oo7 = (o0O00OO) objOooO0o2;
        composer.OooO0o0(-492369756);
        Object objOooO0o3 = composer.OooO0o();
        if (objOooO0o3 == c0323OooO00o) {
            objOooO0o3 = o0OOO00.OooO0Oo(null);
            composer.Oooo00o(objOooO0o3);
        }
        composer.Oooo0o0();
        o0O00OO o0o00oo8 = (o0O00OO) objOooO0o3;
        OooO0Oo(o0o00oo6, composer, 6);
        int i2 = i >> 21;
        OooO00o(o0o00oo4, roomAtView, composer, (i2 & 14) | 64);
        OooO0OO(rowScopeInstance, o0o00oo6, messageEditText, composer, 566);
        OooO0O0(o0o00oo7, o0o00oo8, composer, 54);
        OooO0o(messageEditText, o0o00oo5, o0o00oo6, o0o00oo3, roomReplyView, composer, 33160 | (i2 & 112) | ((i >> 6) & 7168));
        OooO0o0(messageEditText, o0o00oo3, roomReplyView, o0o00oo8, o0o00oo7, o0o00oo2, roomAtView, panelLayout, facePanelView, composer, 153120264 | ((i >> 12) & 112) | (458752 & (i << 15)));
        oo0ooO oo0oooOooO00o = p032OoooO0.oo000o.OooO00o(composer);
        if (oo0oooOooO00o == null) {
            return;
        }
        oo0oooOooO00o.OooO00o(new oO0OO00o(o0o00oo2, roomReplyView, roomAtView, facePanelView, panelLayout, o0o00oo3, messageEditText, o0o00oo4, o0o00oo5, i));
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

    public static void OooOO0O(p150o00Oo0Oo.OooOo oooOo, RoomReplyView roomReplyView, MessageEditText messageEditText) {
        messageEditText.f11739Ooooo0o = oO0O000.f43650OooO0o0;
        messageEditText.setText("");
        messageEditText.OooO0Oo(oooOo);
        Editable text = messageEditText.getText();
        Intrinsics.checkNotNull(text);
        messageEditText.setSelection(text.length());
    }
}
