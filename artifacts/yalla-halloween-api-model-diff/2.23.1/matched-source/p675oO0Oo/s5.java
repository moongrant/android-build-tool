package p675oO0Oo;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Observer;
import com.code.android.util.o0000;
import com.code.android.util.o0000O0;
import com.yalla.android.videoplayer.view.VideoView;
import com.yalla.yalla.data.db.table.ChatMessage;
import com.yalla.yalla.ui.activity.message.PrivateChatActivity;
import com.yalla.yalla.ui.activity.message.o000O;
import com.yalla.yalla.ui.activity.message.o000OO00;
import com.yalla.yalla.ui.screen.user.MyOutfitScreen;
import java.io.File;
import java.util.ArrayList;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import o0OOo000.OooO0O0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p184o00o00O0.OooO0OO;
import p370o0OOo0Oo.Oooo000;
import p407o0Oo0OOO.oO0O00;
import p565o0oOo000.o000OOo;
import p565o0oOo000.o0OOO0o;
import p585o0oOoo00.o00000O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nThemeReceiveDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThemeReceiveDialog.kt\ncom/yalla/yalla/ui/dialog/ThemeReceiveDialog\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,141:1\n1855#2,2:142\n*S KotlinDebug\n*F\n+ 1 ThemeReceiveDialog.kt\ncom/yalla/yalla/ui/dialog/ThemeReceiveDialog\n*L\n135#1:142,2\n*E\n"})
public final class s5 extends o0oO0Ooo {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f59959OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f59960OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public final ArrayList f59961OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final oO0O00 f59962OooOOO0;

    public static final class OooO00o implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f59963OooO0Oo;

        public OooO00o(t5 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f59963OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f59963OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f59963OooO0Oo;
        }

        public final int hashCode() {
            return this.f59963OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f59963OooO0Oo.invoke(obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5(@NotNull PrivateChatActivity context, @NotNull o000O onReceiveRequest, @NotNull o000OO00 onWatchRequest) {
        super(context, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onReceiveRequest, "onReceiveRequest");
        Intrinsics.checkNotNullParameter(onWatchRequest, "onWatchRequest");
        this.f59959OooOO0O = onReceiveRequest;
        this.f59960OooOO0o = onWatchRequest;
        oO0O00 oo0o00Inflate = oO0O00.inflate(LayoutInflater.from(context), this.f59573OooO0o, true);
        Intrinsics.checkNotNullExpressionValue(oo0o00Inflate, "inflate(...)");
        this.f59962OooOOO0 = oo0o00Inflate;
        this.f59961OooOOO = new ArrayList();
        ConstraintLayout constraintLayout = oo0o00Inflate.f44842OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        OooO0oO(constraintLayout);
        oo0o00Inflate.f44846OooO0o.setOnClickListener(this);
        oo0o00Inflate.f44843OooO0O0.setOnClickListener(this);
        oo0o00Inflate.f44850OooOO0.setOnClickListener(this);
        OooO0o(false);
    }

    public static void OooOO0(s5 s5Var, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        if ((i & 8) != 0) {
            z4 = false;
        }
        oO0O00 oo0o00 = s5Var.f59962OooOOO0;
        if (z) {
            ImageView ivBg = oo0o00.f44844OooO0OO;
            Intrinsics.checkNotNullExpressionValue(ivBg, "ivBg");
            com.code.android.util.o000O.OooOOOO(ivBg);
        } else {
            ImageView ivBg2 = oo0o00.f44844OooO0OO;
            Intrinsics.checkNotNullExpressionValue(ivBg2, "ivBg");
            com.code.android.util.o000O.OooO0O0(ivBg2);
        }
        if (z2) {
            ImageView ivBgShape = oo0o00.f44845OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(ivBgShape, "ivBgShape");
            com.code.android.util.o000O.OooOOOO(ivBgShape);
        } else {
            ImageView ivBgShape2 = oo0o00.f44845OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(ivBgShape2, "ivBgShape");
            com.code.android.util.o000O.OooO0O0(ivBgShape2);
        }
        ImageView ivBgStroke = oo0o00.f44847OooO0o0;
        Intrinsics.checkNotNullExpressionValue(ivBgStroke, "ivBgStroke");
        if (z3) {
            com.code.android.util.o000O.OooOOOO(ivBgStroke);
        } else {
            com.code.android.util.o000O.OooO0O0(ivBgStroke);
        }
        TextView tvView = oo0o00.f44850OooOO0;
        Intrinsics.checkNotNullExpressionValue(tvView, "tvView");
        if (z4) {
            com.code.android.util.o000O.OooOOOO(tvView);
        } else {
            com.code.android.util.o000O.OooO0O0(tvView);
        }
    }

    public static void OooOO0O(s5 s5Var, boolean z, boolean z2, boolean z3, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        oO0O00 oo0o00 = s5Var.f59962OooOOO0;
        if (z) {
            LinearLayoutCompat llBottom = oo0o00.f44849OooO0oo;
            Intrinsics.checkNotNullExpressionValue(llBottom, "llBottom");
            com.code.android.util.o000O.OooOOOO(llBottom);
        } else {
            LinearLayoutCompat llBottom2 = oo0o00.f44849OooO0oo;
            Intrinsics.checkNotNullExpressionValue(llBottom2, "llBottom");
            com.code.android.util.o000O.OooO0OO(llBottom2);
        }
        if (z2) {
            TextView tvReceived = oo0o00.f44841OooO;
            Intrinsics.checkNotNullExpressionValue(tvReceived, "tvReceived");
            com.code.android.util.o000O.OooOOOO(tvReceived);
        } else {
            TextView tvReceived2 = oo0o00.f44841OooO;
            Intrinsics.checkNotNullExpressionValue(tvReceived2, "tvReceived");
            com.code.android.util.o000O.OooO0O0(tvReceived2);
        }
        TextView btConfirm = oo0o00.f44843OooO0O0;
        Intrinsics.checkNotNullExpressionValue(btConfirm, "btConfirm");
        if (z3) {
            com.code.android.util.o000O.OooOOOO(btConfirm);
        } else {
            com.code.android.util.o000O.OooO0O0(btConfirm);
        }
    }

    @Override // p675oO0Oo.o0oO0Ooo
    public final void OooO0Oo() {
        for (OooO0O0 oooO0O0 : this.f59961OooOOO) {
            oooO0O0.OooO0O0();
            o0OOo000.OooO00o oooO00o = oooO0O0.f43006OooO00o;
            if (oooO00o != null) {
                oooO00o.release();
            }
            oooO0O0.f43006OooO00o = null;
        }
    }

    @Override // p675oO0Oo.o0oO0Ooo
    public final void OooO0o0(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        oO0O00 oo0o00 = this.f59962OooOOO0;
        if (Intrinsics.areEqual(view, oo0o00.f44843OooO0O0)) {
            this.f59959OooOO0O.invoke();
            return;
        }
        if (Intrinsics.areEqual(view, oo0o00.f44841OooO)) {
            this.f59960OooOO0o.invoke();
        } else if (Intrinsics.areEqual(view, oo0o00.f44850OooOO0)) {
            MyOutfitScreen.navigate$default(MyOutfitScreen.INSTANCE, 3, null, false, 6, null);
        } else {
            OooO0O0();
        }
    }

    public final void OooOO0o(@NotNull String themeBackgroundUrl, int i, @NotNull String videoUrl, boolean z) {
        Intrinsics.checkNotNullParameter(themeBackgroundUrl, "themeBackgroundUrl");
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        boolean z2 = !StringsKt.isBlank(themeBackgroundUrl);
        oO0O00 oo0o00 = this.f59962OooOOO0;
        if (z2) {
            Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(this.f59572OooO0Oo);
            oooO00o.f43127OooO0OO = OooO0OO.OooO0oo(o0000O0.OooO00o(165), o0000O0.OooO00o(260), themeBackgroundUrl);
            oooO00o.f43125OooO00o = 0;
            oooO00o.f43139OooOOOo = o0OOO0o.icon_room_theme_placeholder_big;
            oooO00o.OooO0o0(6);
            oooO00o.OooO0Oo(oo0o00.f44848OooO0oO);
            ImageView ivTheme = oo0o00.f44848OooO0oO;
            Intrinsics.checkNotNullExpressionValue(ivTheme, "ivTheme");
            com.code.android.util.o000O.OooOOOO(ivTheme);
        } else {
            ImageView ivTheme2 = oo0o00.f44848OooO0oO;
            Intrinsics.checkNotNullExpressionValue(ivTheme2, "ivTheme");
            com.code.android.util.o000O.OooO0O0(ivTheme2);
        }
        if (!StringsKt.isBlank(videoUrl)) {
            OooO0O0 oooO0O0 = new OooO0O0();
            this.f59961OooOOO.add(oooO0O0);
            VideoView videoPlayer = oo0o00.f44851OooOO0O;
            Intrinsics.checkNotNullExpressionValue(videoPlayer, "videoView");
            Intrinsics.checkNotNullParameter(videoPlayer, "videoPlayer");
            oooO0O0.f43006OooO00o = videoPlayer;
            File file = o00000O.f56607OooO00o;
            o00000O.OooO00o(videoUrl).observe(this.f59574OooO0o0, new OooO00o(new t5(this, oooO0O0)));
            oo0o00.f44851OooOO0O.setStateChangedListener(new u5(this));
        } else {
            VideoView videoView = oo0o00.f44851OooOO0O;
            Intrinsics.checkNotNullExpressionValue(videoView, "videoView");
            com.code.android.util.o000O.OooO0O0(videoView);
        }
        if (i == ChatMessage.GiveRoomThemeInfo.ThemeState.ThemeNotReceive.getValue()) {
            if (z) {
                OooOO0O(this, true, false, true, 2);
            } else {
                OooOO0O(this, false, false, false, 6);
            }
            OooOO0(this, z, z, z, false, 8);
            return;
        }
        if (i == ChatMessage.GiveRoomThemeInfo.ThemeState.ThemeHasReceived.getValue()) {
            OooOO0O(this, z, true, false, 4);
            oo0o00.f44841OooO.setText(o0000.OooO0OO(o000OOo.message_theme_has_received));
            OooOO0(this, false, z, false, z, 5);
        } else {
            if (i == ChatMessage.GiveRoomThemeInfo.ThemeState.ThemeHasExpired.getValue() || i == ChatMessage.GiveRoomThemeInfo.ThemeState.ThemeHasReturn.getValue()) {
                OooOO0O(this, true, true, false, 4);
                oo0o00.f44841OooO.setText(o0000.OooO0OO(o000OOo.message_theme_has_invalid));
                OooOO0(this, false, false, false, false, 15);
            }
        }
    }
}
