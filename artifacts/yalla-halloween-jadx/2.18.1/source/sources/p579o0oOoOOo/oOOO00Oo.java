package p579o0oOoOOo;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.app.base.protobuf.room.Room;
import com.code.android.util.ToastUtil;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.support.keyboardpanel.KeyBoardUtil$hideKeyboard$1;
import com.yalla.yalla.common.constant.LucklyPacket$Type;
import com.yalla.yalla.common.manager.data.SharedLuckyPacketManager;
import com.yalla.yalla.model.GiftPropModel;
import com.yalla.yalla.ui.activity.room.PacketHistoryActivity;
import com.yalla.yalla.ui.activity.store.WalletActivity;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p142o00OOooO.o0000O0;
import p142o00OOooO.o0000O00;
import p192o00o0O0.o0000;
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o0O0ooO;
import p391o0OOooOo.o0O00000;
import p502o0o00o0.o00000O;
import p515o0o0O00.o00O00;
import p616o0oo0Ooo.oO0O00;
import p649o0ooOOoo.hf;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class oOOO00Oo extends o00000O {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f46124OoooO;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @NotNull
    public p188o00o00o0.OooO0OO<GiftPropModel> f46125OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    @NotNull
    public final Lazy f46126OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    @NotNull
    public final oOO0O000 f46127OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    @NotNull
    public final oOO0O000 f46128OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    @NotNull
    public final oOO0O000 f46129OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final oOO0O000 f46130OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @NotNull
    public final oOO0O000 f46131Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @NotNull
    public final oOO0O000 f46132Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @NotNull
    public final oOO0O000 f46133OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @NotNull
    public final oOO0O000 f46134OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    @Nullable
    public Editable f46135OooooOo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    @Nullable
    public Editable f46136Oooooo0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @NotNull
    public Drawable f46137o000oOoO;

    public static final class OooO extends Lambda implements Function1<View, Unit> {
        public OooO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            oOOO00Oo.this.OooOO0o(false);
            p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
            p497o0o00Oo.OooOOO0.OooO0oO().OooOoOO(Integer.parseInt(((AppCompatTextView) setNoDoubleClickListener).getText().toString()));
            p497o0o00Oo.OooOOO0.OooO0oO().OooOoo0(0);
            oOOO00Oo.this.OooOOOo();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function1<View, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            oOOO00Oo.this.OooOO0o(false);
            p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
            p497o0o00Oo.OooOOO0.OooO0oO().OooOoO(oOOO00Oo.this.f46127OoooOOo.f46082OooO00o);
            p497o0o00Oo.OooOOO0.OooO0oO().OooOoOO(oOOO00Oo.this.f46127OoooOOo.f46083OooO0O0);
            p499o0o00OoO.o0O0O00 o0o0o00OooO0oO = p497o0o00Oo.OooOOO0.OooO0oO();
            oOO0O000 ooo0o000 = oOOO00Oo.this.f46127OoooOOo;
            o0o0o00OooO0oO.OooOoo0(ooo0o000.f46084OooO0OO.indexOf(Integer.valueOf(ooo0o000.f46083OooO0O0)));
            oOOO00Oo oooo00oo = oOOO00Oo.this;
            oooo00oo.OooOOOO(oooo00oo.f46127OoooOOo);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<View, Unit> {
        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            oOOO00Oo.this.OooOO0o(false);
            p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
            p497o0o00Oo.OooOOO0.OooO0oO().OooOoO(oOOO00Oo.this.f46128OoooOo0.f46082OooO00o);
            p497o0o00Oo.OooOOO0.OooO0oO().OooOoOO(oOOO00Oo.this.f46128OoooOo0.f46083OooO0O0);
            p499o0o00OoO.o0O0O00 o0o0o00OooO0oO = p497o0o00Oo.OooOOO0.OooO0oO();
            oOO0O000 ooo0o000 = oOOO00Oo.this.f46128OoooOo0;
            o0o0o00OooO0oO.OooOoo0(ooo0o000.f46084OooO0OO.indexOf(Integer.valueOf(ooo0o000.f46083OooO0O0)));
            oOOO00Oo oooo00oo = oOOO00Oo.this;
            oooo00oo.OooOOOO(oooo00oo.f46128OoooOo0);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<View, Unit> {
        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            oOOO00Oo.this.OooOO0o(false);
            p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
            p497o0o00Oo.OooOOO0.OooO0oO().OooOoO(oOOO00Oo.this.f46129OoooOoO.f46082OooO00o);
            p497o0o00Oo.OooOOO0.OooO0oO().OooOoOO(oOOO00Oo.this.f46129OoooOoO.f46083OooO0O0);
            p499o0o00OoO.o0O0O00 o0o0o00OooO0oO = p497o0o00Oo.OooOOO0.OooO0oO();
            oOO0O000 ooo0o000 = oOOO00Oo.this.f46129OoooOoO;
            o0o0o00OooO0oO.OooOoo0(ooo0o000.f46084OooO0OO.indexOf(Integer.valueOf(ooo0o000.f46083OooO0O0)));
            oOOO00Oo oooo00oo = oOOO00Oo.this;
            oooo00oo.OooOOOO(oooo00oo.f46129OoooOoO);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<View, Unit> {
        public OooO0o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            oOOO00Oo.this.OooOO0o(false);
            p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
            p497o0o00Oo.OooOOO0.OooO0oO().OooOoO(oOOO00Oo.this.f46130OoooOoo.f46082OooO00o);
            p497o0o00Oo.OooOOO0.OooO0oO().OooOoOO(oOOO00Oo.this.f46130OoooOoo.f46083OooO0O0);
            p499o0o00OoO.o0O0O00 o0o0o00OooO0oO = p497o0o00Oo.OooOOO0.OooO0oO();
            oOO0O000 ooo0o000 = oOOO00Oo.this.f46130OoooOoo;
            o0o0o00OooO0oO.OooOoo0(ooo0o000.f46084OooO0OO.indexOf(Integer.valueOf(ooo0o000.f46083OooO0O0)));
            oOOO00Oo oooo00oo = oOOO00Oo.this;
            oooo00oo.OooOOOO(oooo00oo.f46130OoooOoo);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<View, Unit> {
        public OooOO0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            oOOO00Oo.this.OooOO0o(false);
            p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
            p497o0o00Oo.OooOOO0.OooO0oO().OooOoOO(Integer.parseInt(((AppCompatTextView) setNoDoubleClickListener).getText().toString()));
            p497o0o00Oo.OooOOO0.OooO0oO().OooOoo0(1);
            oOOO00Oo.this.OooOOOo();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function1<View, Unit> {
        public OooOO0O() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            oOOO00Oo.this.OooOO0o(false);
            p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
            p497o0o00Oo.OooOOO0.OooO0oO().OooOoOO(Integer.parseInt(((AppCompatTextView) setNoDoubleClickListener).getText().toString()));
            p497o0o00Oo.OooOOO0.OooO0oO().OooOoo0(2);
            oOOO00Oo.this.OooOOOo();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function1<View, Unit> {
        public OooOOO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            oOOO00Oo.this.OooOO0o(false);
            if (oOOO00Oo.this.OooOO0O().f49594OooOOo.isShown()) {
                oOOO00Oo.this.OooOO0O().f49594OooOOo.setVisibility(8);
            } else {
                oOOO00Oo.this.OooOO0O().f49594OooOOo.setVisibility(0);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function1<View, Unit> {
        public OooOOO0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            oOOO00Oo.this.OooOO0o(false);
            p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
            p497o0o00Oo.OooOOO0.OooO0oO().OooOoOO(Integer.parseInt(((AppCompatTextView) setNoDoubleClickListener).getText().toString()));
            p497o0o00Oo.OooOOO0.OooO0oO().OooOoo0(3);
            oOOO00Oo.this.OooOOOo();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function1<View, Unit> {
        public OooOOOO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            oOOO00Oo.this.OooOO0o(false);
            p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
            p497o0o00Oo.OooOOO0.OooO0oO().OooOo0O(oOOO00Oo.this.f46131Ooooo00.f46082OooO00o);
            p497o0o00Oo.OooOOO0.OooO0oO().OooOo(oOOO00Oo.this.f46131Ooooo00.f46083OooO0O0);
            p499o0o00OoO.o0O0O00 o0o0o00OooO0oO = p497o0o00Oo.OooOOO0.OooO0oO();
            oOO0O000 ooo0o000 = oOOO00Oo.this.f46131Ooooo00;
            o0o0o00OooO0oO.OooOoO0(ooo0o000.f46084OooO0OO.indexOf(Integer.valueOf(ooo0o000.f46083OooO0O0)));
            oOOO00Oo oooo00oo = oOOO00Oo.this;
            oooo00oo.OooOOO(oooo00oo.f46131Ooooo00);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends Lambda implements Function1<View, Unit> {
        public OooOo() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            oOOO00Oo.this.OooOO0o(false);
            p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
            p497o0o00Oo.OooOOO0.OooO0oO().OooOo0O(oOOO00Oo.this.f46132Ooooo0o.f46082OooO00o);
            p497o0o00Oo.OooOOO0.OooO0oO().OooOo(oOOO00Oo.this.f46132Ooooo0o.f46083OooO0O0);
            p499o0o00OoO.o0O0O00 o0o0o00OooO0oO = p497o0o00Oo.OooOOO0.OooO0oO();
            oOO0O000 ooo0o000 = oOOO00Oo.this.f46132Ooooo0o;
            o0o0o00OooO0oO.OooOoO0(ooo0o000.f46084OooO0OO.indexOf(Integer.valueOf(ooo0o000.f46083OooO0O0)));
            oOOO00Oo oooo00oo = oOOO00Oo.this;
            oooo00oo.OooOOO(oooo00oo.f46132Ooooo0o);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function1<View, Unit> {
        public OooOo00() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            oOOO00Oo.this.OooOO0o(true);
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo0 extends Lambda implements Function1<View, Unit> {
        public Oooo0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            oOOO00Oo.this.OooOO0o(false);
            p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
            p497o0o00Oo.OooOOO0.OooO0oO().OooOo0O(oOOO00Oo.this.f46134OooooOO.f46082OooO00o);
            p497o0o00Oo.OooOOO0.OooO0oO().OooOo(oOOO00Oo.this.f46134OooooOO.f46083OooO0O0);
            p499o0o00OoO.o0O0O00 o0o0o00OooO0oO = p497o0o00Oo.OooOOO0.OooO0oO();
            oOO0O000 ooo0o000 = oOOO00Oo.this.f46134OooooOO;
            o0o0o00OooO0oO.OooOoO0(ooo0o000.f46084OooO0OO.indexOf(Integer.valueOf(ooo0o000.f46083OooO0O0)));
            oOOO00Oo oooo00oo = oOOO00Oo.this;
            oooo00oo.OooOOO(oooo00oo.f46134OooooOO);
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 extends Lambda implements Function1<View, Unit> {
        public Oooo000() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            oOOO00Oo.this.OooOO0o(false);
            p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
            p497o0o00Oo.OooOOO0.OooO0oO().OooOo0O(oOOO00Oo.this.f46133OooooO0.f46082OooO00o);
            p497o0o00Oo.OooOOO0.OooO0oO().OooOo(oOOO00Oo.this.f46133OooooO0.f46083OooO0O0);
            p499o0o00OoO.o0O0O00 o0o0o00OooO0oO = p497o0o00Oo.OooOOO0.OooO0oO();
            oOO0O000 ooo0o000 = oOOO00Oo.this.f46133OooooO0;
            o0o0o00OooO0oO.OooOoO0(ooo0o000.f46084OooO0OO.indexOf(Integer.valueOf(ooo0o000.f46083OooO0O0)));
            oOOO00Oo oooo00oo = oOOO00Oo.this;
            oooo00oo.OooOOO(oooo00oo.f46133OooooO0);
            return Unit.INSTANCE;
        }
    }

    public static final class o000oOoO extends Lambda implements Function1<View, Unit> {
        public o000oOoO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            oOOO00Oo.this.OooOO0o(false);
            p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
            p497o0o00Oo.OooOOO0.OooO0oO().OooOo(Integer.parseInt(((AppCompatTextView) setNoDoubleClickListener).getText().toString()));
            p497o0o00Oo.OooOOO0.OooO0oO().OooOoO0(0);
            oOOO00Oo.this.OooOOO0();
            return Unit.INSTANCE;
        }
    }

    public static final class o00O0O extends Lambda implements Function1<View, Unit> {
        public o00O0O() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            oOOO00Oo.this.OooOO0o(false);
            p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
            p497o0o00Oo.OooOOO0.OooO0oO().OooOo(Integer.parseInt(((AppCompatTextView) setNoDoubleClickListener).getText().toString()));
            p497o0o00Oo.OooOOO0.OooO0oO().OooOoO0(2);
            oOOO00Oo.this.OooOOO0();
            return Unit.INSTANCE;
        }
    }

    public static final class o00Oo0 extends Lambda implements Function1<View, Unit> {
        public o00Oo0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            oOOO00Oo.this.OooOO0o(false);
            p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
            p497o0o00Oo.OooOOO0.OooO0oO().OooOo(Integer.parseInt(((AppCompatTextView) setNoDoubleClickListener).getText().toString()));
            p497o0o00Oo.OooOOO0.OooO0oO().OooOoO0(3);
            oOOO00Oo.this.OooOOO0();
            return Unit.INSTANCE;
        }
    }

    public static final class o00Ooo extends p188o00o00o0.OooO0OO<GiftPropModel> {
        public o00Ooo(Context context) {
            super(context, R.layout.room_dialog_lucky_packet_send_gift_item);
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void convert(com.chad.library.adapter.base.OooO00o oooO00o, Object obj) {
            p188o00o00o0.OooO0o helper = (p188o00o00o0.OooO0o) oooO00o;
            GiftPropModel item = (GiftPropModel) obj;
            Intrinsics.checkNotNullParameter(helper, "helper");
            Intrinsics.checkNotNullParameter(item, "item");
            oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(getContext());
            oooO00o2.f48429OooO0OO = CloudImageUtilKt.imgFormat(item.getImageUrl());
            oooO00o2.f48427OooO00o = 0;
            oooO00o2.f48441OooOOOo = R.drawable.room_dialog_lucky_golds_send_gift_item_default;
            oooO00o2.OooO0o((ImageView) helper.OooO0Oo(R.id.image));
            helper.OooOO0(R.id.content, com.yalla.support.common.util.OooO.OooO0oo(Integer.valueOf(item.getPrice()), ""));
            int giftId = item.getGiftId();
            p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
            if (giftId == p497o0o00Oo.OooOOO0.OooO0oO().OooOOO()) {
                helper.OooOO0o(R.id.bg_selected, true);
            } else {
                helper.OooOO0o(R.id.bg_selected, false);
            }
        }
    }

    public static final class o00oO0o extends Lambda implements Function1<View, Unit> {
        public o00oO0o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            oOOO00Oo.this.OooOO0o(false);
            p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
            p497o0o00Oo.OooOOO0.OooO0oO().OooOo00(false);
            oOOO00Oo.this.OooOOo0();
            return Unit.INSTANCE;
        }
    }

    public static final class o0O0O00 extends Lambda implements Function0<hf> {
        public o0O0O00() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final hf invoke() {
            hf hfVarInflate = hf.inflate(LayoutInflater.from(oOOO00Oo.this.f41543Oooo0o), oOOO00Oo.this.f41545Oooo0oo, false);
            Intrinsics.checkNotNullExpressionValue(hfVarInflate, "inflate(LayoutInflater.f…t), getRootView(), false)");
            return hfVarInflate;
        }
    }

    public static final class o0OO00O extends Lambda implements Function1<View, Unit> {
        public o0OO00O() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            oOOO00Oo.this.OooOO0o(false);
            WalletActivity.OooO00o oooO00o = WalletActivity.f23268OoooooO;
            Context context = setNoDoubleClickListener.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            oooO00o.OooO00o(context, false);
            return Unit.INSTANCE;
        }
    }

    public static final class o0OOO0o implements TextWatcher {
        public o0OOO0o() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(@NotNull Editable s) {
            Intrinsics.checkNotNullParameter(s, "s");
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(@NotNull CharSequence s, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(s, "s");
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(@NotNull CharSequence content, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(content, "content");
            o00O00.OooO0O0("addTextChangedListener content = " + ((Object) content));
            if (p168o00Ooo0.o0OoOo0.OooO0o0(oOOO00Oo.this.OooOO0O().f49604OooOoOO) > 50) {
                String strOooO00o = com.yalla.support.common.util.OooOo.OooO00o(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Input_a_maximum_of_xxx_characters), "50");
                ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
                if (StringsKt.isBlank(strOooO00o)) {
                    return;
                }
                o0O0ooO o0o0oooOooO0O0 = p074o000O0oo.OooOOO.OooO0O0(toastUtil, strOooO00o, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o0o0oooOooO0O0.run();
                } else {
                    o00O000 o00o001 = o00O000.f34346OooO00o;
                    o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
                }
            }
        }
    }

    public static final class o0Oo0oo extends Lambda implements Function1<View, Unit> {
        public o0Oo0oo() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            oOOO00Oo.this.OooOO0o(false);
            String strValueOf = String.valueOf(oOOO00Oo.this.OooOO0O().f49604OooOoOO.getText());
            p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
            if (p497o0o00Oo.OooOOO0.OooO0oO().OooOOo()) {
                o0O00000.OooO0OO("InRoom_luckyBag_Gifts");
                p159o00OoOO.o00O000 o00o000OooO = p159o00OoOO.o00O000.OooO();
                int iOooOOO = p497o0o00Oo.OooOOO0.OooO0oO().OooOOO();
                int iOooOOO0 = p497o0o00Oo.OooOOO0.OooO0oO().OooOOO0();
                int iOooOOOO = p497o0o00Oo.OooOOO0.OooO0oO().OooOOOO();
                Objects.requireNonNull(o00o000OooO);
                if (p159o00OoOO.o00O000.f32468OooO00o != null) {
                    Room.NewSendBonusRequest.Builder builderNewBuilder = Room.NewSendBonusRequest.newBuilder();
                    builderNewBuilder.setBonustype(2);
                    builderNewBuilder.setBonuscount(iOooOOO0);
                    builderNewBuilder.setBonusnum(iOooOOOO);
                    builderNewBuilder.setGiftid(iOooOOO);
                    builderNewBuilder.setBonusinfo(strValueOf);
                    p159o00OoOO.o00O000.f32468OooO00o.OooO0oO(10073, builderNewBuilder.build().toByteArray());
                }
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Send Content Lucky Packet Gift\ngiftId: ");
                sbOooO0o0.append(p497o0o00Oo.OooOOO0.OooO0oO().OooOOO());
                sbOooO0o0.append(" \ngiftCount: ");
                sbOooO0o0.append(p497o0o00Oo.OooOOO0.OooO0oO().OooOOO0());
                sbOooO0o0.append(" \ngiftPackets: ");
                sbOooO0o0.append(p497o0o00Oo.OooOOO0.OooO0oO().OooOOOO());
                sbOooO0o0.append(" \nluckyPacketContentGift: ");
                sbOooO0o0.append(strValueOf);
                o00O00.OooO0O0(sbOooO0o0.toString());
            } else {
                o0O00000.OooO0OO("InRoom_luckyBag_Golds");
                p159o00OoOO.o00O000 o00o000OooO2 = p159o00OoOO.o00O000.OooO();
                int iOooOOOo = p497o0o00Oo.OooOOO0.OooO0oO().OooOOOo();
                int iOooOOo0 = p497o0o00Oo.OooOOO0.OooO0oO().OooOOo0();
                Objects.requireNonNull(o00o000OooO2);
                if (p159o00OoOO.o00O000.f32468OooO00o != null) {
                    Room.NewSendBonusRequest.Builder builderNewBuilder2 = Room.NewSendBonusRequest.newBuilder();
                    builderNewBuilder2.setBonustype(1);
                    builderNewBuilder2.setBonuscount(iOooOOOo);
                    builderNewBuilder2.setBonusnum(iOooOOo0);
                    builderNewBuilder2.setGiftid(0);
                    builderNewBuilder2.setBonusinfo(strValueOf);
                    p159o00OoOO.o00O000.f32468OooO00o.OooO0oO(10073, builderNewBuilder2.build().toByteArray());
                }
                StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0("Send Content Lucky Packet Golds \ngoldsCoin: ");
                sbOooO0o1.append(p497o0o00Oo.OooOOO0.OooO0oO().OooOOOo());
                sbOooO0o1.append(" \ngoldsPackets: ");
                sbOooO0o1.append(p497o0o00Oo.OooOOO0.OooO0oO().OooOOo0());
                sbOooO0o1.append(" \nluckyPacketContentGolds: ");
                sbOooO0o1.append(strValueOf);
                o00O00.OooO0O0(sbOooO0o1.toString());
            }
            oOOO00Oo.this.OooO0O0();
            return Unit.INSTANCE;
        }
    }

    public static final class o0OoOo0 extends Lambda implements Function1<View, Unit> {
        public o0OoOo0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            oOOO00Oo.this.OooOO0o(false);
            p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
            p497o0o00Oo.OooOOO0.OooO0oO().OooOo(Integer.parseInt(((AppCompatTextView) setNoDoubleClickListener).getText().toString()));
            p497o0o00Oo.OooOOO0.OooO0oO().OooOoO0(1);
            oOOO00Oo.this.OooOOO0();
            return Unit.INSTANCE;
        }
    }

    public static final class o0ooOOo extends Lambda implements Function1<View, Unit> {
        public o0ooOOo() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            oOOO00Oo.this.OooOO0o(false);
            p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
            p497o0o00Oo.OooOOO0.OooO0oO().OooOo00(true);
            oOOO00Oo.this.OooOOo0();
            return Unit.INSTANCE;
        }
    }

    public static final class oo000o extends Lambda implements Function1<View, Unit> {
        public oo000o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            oOOO00Oo.this.OooOO0o(false);
            new oOOO00(oOOO00Oo.this.f46124OoooO).OooOO0();
            return Unit.INSTANCE;
        }
    }

    public static final class oo0o0Oo extends Lambda implements Function1<View, Unit> {
        public oo0o0Oo() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            oOOO00Oo.this.OooOO0o(false);
            PacketHistoryActivity.OooO00o oooO00o = PacketHistoryActivity.f22936Ooooo00;
            Context context = setNoDoubleClickListener.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
            LucklyPacket$Type type = p497o0o00Oo.OooOOO0.OooO0oO().OooOOo() ? LucklyPacket$Type.Gift : LucklyPacket$Type.Coin;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(type, "type");
            Intent intent = new Intent(context, (Class<?>) PacketHistoryActivity.class);
            intent.putExtra("packet_type", type.getValue());
            context.startActivity(intent);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOOO00Oo(@NotNull FragmentActivity activity) {
        super(activity, 0);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f46124OoooO = activity;
        this.f46137o000oOoO = com.yalla.support.common.util.OooOOO.OooO0O0(R.drawable.room_dialog_lucky_packet_send_selected_l);
        this.f46126OoooOOO = LazyKt.lazy(new o0O0O00());
        int i = 4;
        this.f46127OoooOOo = new oOO0O000(20, 5, CollectionsKt.mutableListOf(3, 5, 10, 15));
        this.f46128OoooOo0 = new oOO0O000(50, 10, CollectionsKt.mutableListOf(5, 10, 20, 30));
        this.f46129OoooOoO = new oOO0O000(100, 20, CollectionsKt.mutableListOf(5, 10, 20, 30));
        this.f46130OoooOoo = new oOO0O000(500, 50, CollectionsKt.mutableListOf(10, 20, 30, 50));
        this.f46131Ooooo00 = new oOO0O000(7, 3, CollectionsKt.mutableListOf(1, 3, 5, 7));
        this.f46132Ooooo0o = new oOO0O000(17, 5, CollectionsKt.mutableListOf(3, 5, 10, 15));
        this.f46133OooooO0 = new oOO0O000(77, 20, CollectionsKt.mutableListOf(5, 10, 20, 30));
        this.f46134OooooOO = new oOO0O000(777, 50, CollectionsKt.mutableListOf(10, 20, 30, 50));
        ConstraintLayout constraintLayout = OooOO0O().f49579OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.root");
        OooO0oO(constraintLayout);
        Window window = this.f41542Oooo;
        if (window != null) {
            window.setWindowAnimations(R.style.animation_bottom_in_bottom_out);
        }
        Window window2 = this.f41542Oooo;
        if (window2 != null) {
            window2.setGravity(80);
        }
        ConstraintLayout constraintLayout2 = OooOO0O().f49579OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "binding.root");
        com.yalla.support.common.util.o00O0O.OooO0Oo(constraintLayout2, new OooOo00());
        ImageView imageView = OooOO0O().f49617Oooo0o0;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.info");
        com.yalla.support.common.util.o00O0O.OooO0Oo(imageView, new oo000o());
        LiveEventBus.get("LuckyPacket_Show_MixedRoomActivityOnResume").observe(this.f41544Oooo0oO, new o0000O0(this, i));
        AppCompatTextView appCompatTextView = OooOO0O().f49609Oooo;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "binding.switchGolds");
        com.yalla.support.common.util.o00O0O.OooO0Oo(appCompatTextView, new o00oO0o());
        AppCompatTextView appCompatTextView2 = OooOO0O().f49619Oooo0oo;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "binding.switchGift");
        com.yalla.support.common.util.o00O0O.OooO0Oo(appCompatTextView2, new o0ooOOo());
        OooOO0O().f49604OooOoOO.addTextChangedListener(new o0OOO0o());
        AppCompatTextView appCompatTextView3 = OooOO0O().f49618Oooo0oO;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView3, "binding.send");
        com.yalla.support.common.util.o00O0O.OooO0Oo(appCompatTextView3, new o0Oo0oo());
        AppCompatTextView appCompatTextView4 = OooOO0O().f49616Oooo0o;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView4, "binding.recharge");
        com.yalla.support.common.util.o00O0O.OooO0Oo(appCompatTextView4, new o0OO00O());
        AppCompatTextView appCompatTextView5 = OooOO0O().f49615Oooo0OO;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView5, "binding.history");
        com.yalla.support.common.util.o00O0O.OooO0Oo(appCompatTextView5, new oo0o0Oo());
        AppCompatTextView appCompatTextView6 = OooOO0O().f49596OooOOoo;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView6, "binding.golds0");
        com.yalla.support.common.util.o00O0O.OooO0Oo(appCompatTextView6, new OooO00o());
        AppCompatTextView appCompatTextView7 = OooOO0O().f49598OooOo0;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView7, "binding.golds1");
        com.yalla.support.common.util.o00O0O.OooO0Oo(appCompatTextView7, new OooO0O0());
        AppCompatTextView appCompatTextView8 = OooOO0O().f49601OooOo0o;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView8, "binding.golds2");
        com.yalla.support.common.util.o00O0O.OooO0Oo(appCompatTextView8, new OooO0OO());
        AppCompatTextView appCompatTextView9 = OooOO0O().f49603OooOoO0;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView9, "binding.golds3");
        com.yalla.support.common.util.o00O0O.OooO0Oo(appCompatTextView9, new OooO0o());
        AppCompatTextView appCompatTextView10 = OooOO0O().f49605OooOoo;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView10, "binding.goldsPackets0");
        com.yalla.support.common.util.o00O0O.OooO0Oo(appCompatTextView10, new OooO());
        AppCompatTextView appCompatTextView11 = OooOO0O().f49608OooOooo;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView11, "binding.goldsPackets1");
        com.yalla.support.common.util.o00O0O.OooO0Oo(appCompatTextView11, new OooOO0());
        AppCompatTextView appCompatTextView12 = OooOO0O().f49612Oooo00O;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView12, "binding.goldsPackets2");
        com.yalla.support.common.util.o00O0O.OooO0Oo(appCompatTextView12, new OooOO0O());
        AppCompatTextView appCompatTextView13 = OooOO0O().f49610Oooo0;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView13, "binding.goldsPackets3");
        com.yalla.support.common.util.o00O0O.OooO0Oo(appCompatTextView13, new OooOOO0());
        AppCompatTextView appCompatTextView14 = OooOO0O().f49595OooOOo0;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView14, "binding.giftSelectCount");
        com.yalla.support.common.util.o00O0O.OooO0Oo(appCompatTextView14, new OooOOO());
        AppCompatTextView appCompatTextView15 = OooOO0O().f49590OooOOO;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView15, "binding.giftSelect7");
        com.yalla.support.common.util.o00O0O.OooO0Oo(appCompatTextView15, new OooOOOO());
        AppCompatTextView appCompatTextView16 = OooOO0O().f49591OooOOO0;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView16, "binding.giftSelect17");
        com.yalla.support.common.util.o00O0O.OooO0Oo(appCompatTextView16, new OooOo());
        AppCompatTextView appCompatTextView17 = OooOO0O().f49592OooOOOO;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView17, "binding.giftSelect77");
        com.yalla.support.common.util.o00O0O.OooO0Oo(appCompatTextView17, new Oooo000());
        AppCompatTextView appCompatTextView18 = OooOO0O().f49593OooOOOo;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView18, "binding.giftSelect777");
        com.yalla.support.common.util.o00O0O.OooO0Oo(appCompatTextView18, new Oooo0());
        AppCompatTextView appCompatTextView19 = OooOO0O().f49582OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView19, "binding.giftPackets0");
        com.yalla.support.common.util.o00O0O.OooO0Oo(appCompatTextView19, new o000oOoO());
        AppCompatTextView appCompatTextView20 = OooOO0O().f49583OooO0o;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView20, "binding.giftPackets1");
        com.yalla.support.common.util.o00O0O.OooO0Oo(appCompatTextView20, new o0OoOo0());
        AppCompatTextView appCompatTextView21 = OooOO0O().f49586OooO0oo;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView21, "binding.giftPackets2");
        com.yalla.support.common.util.o00O0O.OooO0Oo(appCompatTextView21, new o00O0O());
        AppCompatTextView appCompatTextView22 = OooOO0O().f49587OooOO0;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView22, "binding.giftPackets3");
        com.yalla.support.common.util.o00O0O.OooO0Oo(appCompatTextView22, new o00Oo0());
        o00Ooo o00ooo2 = new o00Ooo(this.f41543Oooo0o);
        this.f46125OoooOO0 = o00ooo2;
        o00ooo2.setEmptyImageRes(R.drawable.ic_empty_delete);
        this.f46125OoooOO0.setEmptyText(R.string.no_data);
        this.f46125OoooOO0.setOnItemClickListener(new o0000(this));
        OooOO0O().f49589OooOO0o.setLayoutManager(new FixLinearLayoutManager(this.f41543Oooo0o, 0));
        OooOO0O().f49589OooOO0o.setAdapter(this.f46125OoooOO0);
        SharedLuckyPacketManager.INSTANCE.getData().observe(this.f41544Oooo0oO, new o0000O00(this, 6));
        OooOO0O().f49620OoooO0.setText(String.valueOf(p498o0o00Oo0.OooOOO.f41216OooO00o.OooO0OO().getValue()));
        OooOOo0();
    }

    public final hf OooOO0O() {
        return (hf) this.f46126OoooOOO.getValue();
    }

    public final void OooOO0o(boolean z) {
        if (z) {
            AppCompatEditText view = OooOO0O().f49604OooOoOO;
            Intrinsics.checkNotNullExpressionValue(view, "binding.goldsEditContent");
            Intrinsics.checkNotNullParameter(view, "view");
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "view.context");
            InputMethodManager inputMethodManagerOooO00o = p470o0Oooo0.o00O000.OooO00o(context);
            Context context2 = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "view.context");
            inputMethodManagerOooO00o.hideSoftInputFromWindow(view.getWindowToken(), 0, new KeyBoardUtil$hideKeyboard$1(context2.getApplicationContext(), new Handler()));
        }
    }

    public final void OooOOO(oOO0O000 ooo0o000) {
        AppCompatTextView appCompatTextView = OooOO0O().f49595OooOOo0;
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("");
        p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
        sbOooO0o0.append(p497o0o00Oo.OooOOO0.OooO0oO().OooOOO0());
        appCompatTextView.setText(sbOooO0o0.toString());
        OooOO0O().f49594OooOOo.setVisibility(8);
        int i = 0;
        for (Object obj : ooo0o000.f46084OooO0OO) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            int iIntValue = ((Number) obj).intValue();
            if (i == 0) {
                OooOO0O().f49582OooO0Oo.setText(String.valueOf(iIntValue));
            } else if (i == 1) {
                OooOO0O().f49583OooO0o.setText(String.valueOf(iIntValue));
            } else if (i == 2) {
                OooOO0O().f49586OooO0oo.setText(String.valueOf(iIntValue));
            } else if (i == 3) {
                OooOO0O().f49587OooOO0.setText(String.valueOf(iIntValue));
            }
            i = i2;
        }
        OooOOO0();
    }

    public final void OooOOO0() {
        OooOO0O().f49584OooO0o0.setVisibility(8);
        OooOO0O().f49585OooO0oO.setVisibility(8);
        OooOO0O().f49578OooO.setVisibility(8);
        OooOO0O().f49588OooOO0O.setVisibility(8);
        p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
        p499o0o00OoO.o0O0O00 o0o0o00OooO0oO = p497o0o00Oo.OooOOO0.OooO0oO();
        Objects.requireNonNull(o0o0o00OooO0oO);
        int iOooO0O0 = o0o0o00OooO0oO.OooO0O0("giftPacketsIndex" + p498o0o00Oo0.OooOOO.f41216OooO00o.OooOo().getValue(), 1);
        if (iOooO0O0 == 0) {
            OooOO0O().f49584OooO0o0.setVisibility(0);
        } else if (iOooO0O0 == 1) {
            OooOO0O().f49585OooO0oO.setVisibility(0);
        } else if (iOooO0O0 == 2) {
            OooOO0O().f49578OooO.setVisibility(0);
        } else if (iOooO0O0 == 3) {
            OooOO0O().f49588OooOO0O.setVisibility(0);
        }
        OooOO0O().f49580OooO0O0.setText(String.valueOf(p497o0o00Oo.OooOOO0.OooO0oO().OooOO0o() * ((long) p497o0o00Oo.OooOOO0.OooO0oO().OooOOO0())));
    }

    public final void OooOOOO(oOO0O000 ooo0o000) {
        OooOO0O().f49599OooOo00.setVisibility(8);
        OooOO0O().f49600OooOo0O.setVisibility(8);
        OooOO0O().f49597OooOo.setVisibility(8);
        OooOO0O().f49602OooOoO.setVisibility(8);
        p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
        int iOooOOOo = p497o0o00Oo.OooOOO0.OooO0oO().OooOOOo();
        int i = 0;
        if (iOooOOOo == 20) {
            OooOO0O().f49599OooOo00.setVisibility(0);
        } else if (iOooOOOo == 50) {
            OooOO0O().f49600OooOo0O.setVisibility(0);
        } else if (iOooOOOo == 100) {
            OooOO0O().f49597OooOo.setVisibility(0);
        } else if (iOooOOOo == 500) {
            OooOO0O().f49602OooOoO.setVisibility(0);
        }
        for (Object obj : ooo0o000.f46084OooO0OO) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            int iIntValue = ((Number) obj).intValue();
            if (i == 0) {
                OooOO0O().f49605OooOoo.setText(String.valueOf(iIntValue));
            } else if (i == 1) {
                OooOO0O().f49608OooOooo.setText(String.valueOf(iIntValue));
            } else if (i == 2) {
                OooOO0O().f49612Oooo00O.setText(String.valueOf(iIntValue));
            } else if (i == 3) {
                OooOO0O().f49610Oooo0.setText(String.valueOf(iIntValue));
            }
            i = i2;
        }
        OooOOOo();
    }

    public final void OooOOOo() {
        OooOO0O().f49607OooOooO.setVisibility(8);
        OooOO0O().f49611Oooo000.setVisibility(8);
        OooOO0O().f49613Oooo00o.setVisibility(8);
        OooOO0O().f49614Oooo0O0.setVisibility(8);
        p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
        p499o0o00OoO.o0O0O00 o0o0o00OooO0oO = p497o0o00Oo.OooOOO0.OooO0oO();
        Objects.requireNonNull(o0o0o00OooO0oO);
        int iOooO0O0 = o0o0o00OooO0oO.OooO0O0("goldsPacketsIndex" + p498o0o00Oo0.OooOOO.f41216OooO00o.OooOo().getValue(), 1);
        if (iOooO0O0 == 0) {
            OooOO0O().f49607OooOooO.setVisibility(0);
            return;
        }
        if (iOooO0O0 == 1) {
            OooOO0O().f49611Oooo000.setVisibility(0);
        } else if (iOooO0O0 == 2) {
            OooOO0O().f49613Oooo00o.setVisibility(0);
        } else {
            if (iOooO0O0 != 3) {
                return;
            }
            OooOO0O().f49614Oooo0O0.setVisibility(0);
        }
    }

    public final void OooOOo0() {
        p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
        if (p497o0o00Oo.OooOOO0.OooO0oO().OooOOo()) {
            OooOO0O().f49609Oooo.setBackground(null);
            OooOO0O().f49609Oooo.setTextColor(Integer.MAX_VALUE);
            OooOO0O().f49609Oooo.setTextSize(13.0f);
            OooOO0O().f49619Oooo0oo.setBackground(this.f46137o000oOoO);
            OooOO0O().f49619Oooo0oo.setTextColor(-1);
            OooOO0O().f49619Oooo0oo.setTextSize(14.0f);
            OooOO0O().f49581OooO0OO.setVisibility(0);
            OooOO0O().f49606OooOoo0.setVisibility(8);
            this.f46136Oooooo0 = OooOO0O().f49604OooOoOO.getText();
            OooOO0O().f49604OooOoOO.setText(this.f46135OooooOo);
            Editable editable = this.f46135OooooOo;
            if (editable != null) {
                OooOO0O().f49604OooOoOO.setSelection(editable.length());
            }
            int iOooOOO0 = p497o0o00Oo.OooOOO0.OooO0oO().OooOOO0();
            if (iOooOOO0 == 7) {
                OooOOO(this.f46131Ooooo00);
                return;
            }
            if (iOooOOO0 == 17) {
                OooOOO(this.f46132Ooooo0o);
                return;
            } else if (iOooOOO0 == 77) {
                OooOOO(this.f46133OooooO0);
                return;
            } else {
                if (iOooOOO0 == 777) {
                    OooOOO(this.f46134OooooOO);
                    return;
                }
                return;
            }
        }
        OooOO0O().f49619Oooo0oo.setBackground(null);
        OooOO0O().f49619Oooo0oo.setTextColor(Integer.MAX_VALUE);
        OooOO0O().f49619Oooo0oo.setTextSize(13.0f);
        OooOO0O().f49609Oooo.setBackground(this.f46137o000oOoO);
        OooOO0O().f49609Oooo.setTextColor(-1);
        OooOO0O().f49609Oooo.setTextSize(14.0f);
        OooOO0O().f49606OooOoo0.setVisibility(0);
        OooOO0O().f49581OooO0OO.setVisibility(8);
        this.f46135OooooOo = OooOO0O().f49604OooOoOO.getText();
        OooOO0O().f49604OooOoOO.setText(this.f46136Oooooo0);
        Editable editable2 = this.f46136Oooooo0;
        if (editable2 != null) {
            OooOO0O().f49604OooOoOO.setSelection(editable2.length());
        }
        int iOooOOOo = p497o0o00Oo.OooOOO0.OooO0oO().OooOOOo();
        if (iOooOOOo == 20) {
            OooOOOO(this.f46127OoooOOo);
            return;
        }
        if (iOooOOOo == 50) {
            OooOOOO(this.f46128OoooOo0);
        } else if (iOooOOOo == 100) {
            OooOOOO(this.f46129OoooOoO);
        } else if (iOooOOOo == 500) {
            OooOOOO(this.f46130OoooOoo);
        }
    }
}
