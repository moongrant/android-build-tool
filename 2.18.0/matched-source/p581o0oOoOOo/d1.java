package p581o0oOoOOo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Observer;
import com.common.videoplayer.PlayState;
import com.common.videoplayer.view.VideoView;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.support.common.util.OooOo00;
import com.yalla.yalla.common.db.table.ChatMessage;
import com.yalla.yalla.common.manager.data.SharedThemeVideoManager;
import com.yalla.yalla.ui.activity.room.RoomThemeMineActivity;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o0O00O0o.OooO0O0;
import o0O00O0o.OooO0OO;
import o0O00O0o.OooO0o;
import org.jetbrains.annotations.NotNull;
import p255o00ooO0O.o000O0O0;
import p255o00ooO0O.oOO00O;
import p504o0o00o0.o00000O;
import p618o0oo0Ooo.oO0O000o;
import p651o0ooOOoo.xb;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class d1 extends o00000O {

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f45938OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f45939OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    @NotNull
    public final xb f45940OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    @NotNull
    public final List<OooO0O0> f45941OoooOoO;

    public static final class OooO00o implements OooO0OO {
        public OooO00o() {
        }

        @Override // o0O00O0o.OooO0OO
        public final void onStateChanged(@NotNull PlayState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            if (state == PlayState.Playing) {
                VideoView videoView = d1.this.f45940OoooOo0.f50957OooOO0O;
                Intrinsics.checkNotNullExpressionValue(videoView, "binding.videoView");
                oOO00O.OooO(videoView);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(@NotNull Context context, @NotNull Function0<Unit> onReceiveRequest, @NotNull Function0<Unit> onWatchRequest) {
        super(context, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onReceiveRequest, "onReceiveRequest");
        Intrinsics.checkNotNullParameter(onWatchRequest, "onWatchRequest");
        this.f45938OoooOOO = onReceiveRequest;
        this.f45939OoooOOo = onWatchRequest;
        xb xbVarInflate = xb.inflate(LayoutInflater.from(context), this.f41563OoooO0, true);
        Intrinsics.checkNotNullExpressionValue(xbVarInflate, "inflate(LayoutInflater.f…xt), getRootView(), true)");
        this.f45940OoooOo0 = xbVarInflate;
        this.f45941OoooOoO = new ArrayList();
        ConstraintLayout constraintLayout = xbVarInflate.f50948OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.root");
        OooO0oO(constraintLayout);
        xbVarInflate.f50952OooO0o.setOnClickListener(this);
        xbVarInflate.f50949OooO0O0.setOnClickListener(this);
        xbVarInflate.f50956OooOO0.setOnClickListener(this);
        OooO0o(false);
    }

    public static void OooOO0O(d1 d1Var, boolean z, boolean z2, boolean z3, boolean z4, int i) {
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
        if (z) {
            ImageView imageView = d1Var.f45940OoooOo0.f50950OooO0OO;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivBg");
            oOO00O.OooO(imageView);
        } else {
            ImageView imageView2 = d1Var.f45940OoooOo0.f50950OooO0OO;
            Intrinsics.checkNotNullExpressionValue(imageView2, "binding.ivBg");
            oOO00O.OooO00o(imageView2);
        }
        if (z2) {
            ImageView imageView3 = d1Var.f45940OoooOo0.f50951OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(imageView3, "binding.ivBgShape");
            oOO00O.OooO(imageView3);
        } else {
            ImageView imageView4 = d1Var.f45940OoooOo0.f50951OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(imageView4, "binding.ivBgShape");
            oOO00O.OooO00o(imageView4);
        }
        ImageView imageView5 = d1Var.f45940OoooOo0.f50953OooO0o0;
        Intrinsics.checkNotNullExpressionValue(imageView5, "binding.ivBgStroke");
        if (z3) {
            oOO00O.OooO(imageView5);
        } else {
            oOO00O.OooO00o(imageView5);
        }
        TextView textView = d1Var.f45940OoooOo0.f50956OooOO0;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.tvView");
        if (z4) {
            oOO00O.OooO(textView);
        } else {
            oOO00O.OooO00o(textView);
        }
    }

    public static void OooOO0o(d1 d1Var, boolean z, boolean z2, boolean z3, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        if (z) {
            LinearLayoutCompat linearLayoutCompat = d1Var.f45940OoooOo0.f50955OooO0oo;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "binding.llBottom");
            oOO00O.OooO(linearLayoutCompat);
        } else {
            LinearLayoutCompat linearLayoutCompat2 = d1Var.f45940OoooOo0.f50955OooO0oo;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat2, "binding.llBottom");
            oOO00O.OooO0O0(linearLayoutCompat2);
        }
        if (z2) {
            TextView textView = d1Var.f45940OoooOo0.f50947OooO;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.tvReceived");
            oOO00O.OooO(textView);
        } else {
            TextView textView2 = d1Var.f45940OoooOo0.f50947OooO;
            Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvReceived");
            oOO00O.OooO00o(textView2);
        }
        TextView textView3 = d1Var.f45940OoooOo0.f50949OooO0O0;
        Intrinsics.checkNotNullExpressionValue(textView3, "binding.btConfirm");
        if (z3) {
            oOO00O.OooO(textView3);
        } else {
            oOO00O.OooO00o(textView3);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<o0O00O0o.OooO0O0>] */
    @Override // p504o0o00o0.o00000O
    public final void OooO0Oo() {
        for (OooO0O0 oooO0O0 : this.f45941OoooOoO) {
            oooO0O0.OooO0o0();
            oooO0O0.OooO0O0();
        }
    }

    @Override // p504o0o00o0.o00000O
    public final void OooO0o0(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        if (Intrinsics.areEqual(view, this.f45940OoooOo0.f50949OooO0O0)) {
            this.f45938OoooOOO.invoke();
            return;
        }
        if (Intrinsics.areEqual(view, this.f45940OoooOo0.f50947OooO)) {
            this.f45939OoooOOo.invoke();
        } else if (!Intrinsics.areEqual(view, this.f45940OoooOo0.f50956OooOO0)) {
            OooO0O0();
        } else {
            RoomThemeMineActivity.OooO00o oooO00o = RoomThemeMineActivity.f23012Ooooooo;
            RoomThemeMineActivity.f23012Ooooooo.OooO00o(this.f41561Oooo, RoomThemeMineActivity.ThemeType.Mine);
        }
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList, java.util.List<o0O00O0o.OooO0O0>] */
    public final void OooOOO0(boolean z, int i, @NotNull String themeBackgroundUrl, @NotNull String videoUrl) {
        Intrinsics.checkNotNullParameter(themeBackgroundUrl, "themeBackgroundUrl");
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        if (!StringsKt.isBlank(themeBackgroundUrl)) {
            oO0O000o.OooO00o oooO00o = new oO0O000o.OooO00o(this.f41561Oooo);
            oooO00o.f48447OooO0OO = CloudImageUtilKt.imgSize(themeBackgroundUrl, OooOo00.OooO00o(165), OooOo00.OooO00o(260));
            oooO00o.f48445OooO00o = 0;
            oooO00o.f48459OooOOOo = R.drawable.icon_room_theme_placeholder_big;
            oooO00o.OooO0oO(6);
            oooO00o.OooO0o(this.f45940OoooOo0.f50954OooO0oO);
            ImageView imageView = this.f45940OoooOo0.f50954OooO0oO;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivTheme");
            oOO00O.OooO(imageView);
        } else {
            ImageView imageView2 = this.f45940OoooOo0.f50954OooO0oO;
            Intrinsics.checkNotNullExpressionValue(imageView2, "binding.ivTheme");
            oOO00O.OooO00o(imageView2);
        }
        if (!StringsKt.isBlank(videoUrl)) {
            final OooO0O0 oooO0O0 = new OooO0O0();
            this.f45941OoooOoO.add(oooO0O0);
            VideoView videoView = this.f45940OoooOo0.f50957OooOO0O;
            Intrinsics.checkNotNullExpressionValue(videoView, "binding.videoView");
            oooO0O0.OooO0Oo(videoView);
            SharedThemeVideoManager.INSTANCE.loadVideo(videoUrl).observe(this.f41564OoooO00, new Observer() { // from class: o0oOoOOo.c1
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    d1 this$0 = this.f45934OooO00o;
                    OooO0O0 playController = oooO0O0;
                    String it = (String) obj;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    Intrinsics.checkNotNullParameter(playController, "$playController");
                    if (this$0.OooO0OO()) {
                        Intrinsics.checkNotNullExpressionValue(it, "it");
                        playController.OooO0OO(new OooO0o(it, Integer.MAX_VALUE));
                        playController.OooO00o();
                    }
                }
            });
            this.f45940OoooOo0.f50957OooOO0O.setStateChangedListener(new OooO00o());
        } else {
            VideoView videoView2 = this.f45940OoooOo0.f50957OooOO0O;
            Intrinsics.checkNotNullExpressionValue(videoView2, "binding.videoView");
            oOO00O.OooO00o(videoView2);
        }
        if (i == ChatMessage.GiveRoomThemeInfo.ThemeState.ThemeNotReceive.getValue()) {
            if (z) {
                OooOO0o(this, true, false, true, 2);
            } else {
                OooOO0o(this, false, false, false, 6);
            }
            OooOO0O(this, z, z, z, false, 8);
            return;
        }
        if (i == ChatMessage.GiveRoomThemeInfo.ThemeState.ThemeHasReceived.getValue()) {
            OooOO0o(this, z, true, false, 4);
            this.f45940OoooOo0.f50947OooO.setText(o000O0O0.OooO0OO(R.string.message_theme_has_received));
            OooOO0O(this, false, z, false, z, 5);
        } else {
            if (i == ChatMessage.GiveRoomThemeInfo.ThemeState.ThemeHasExpired.getValue() || i == ChatMessage.GiveRoomThemeInfo.ThemeState.ThemeHasReturn.getValue()) {
                OooOO0o(this, true, true, false, 4);
                this.f45940OoooOo0.f50947OooO.setText(o000O0O0.OooO0OO(R.string.message_theme_has_invalid));
                OooOO0O(this, false, false, false, false, 15);
            }
        }
    }
}
