package p519o0o0O0oO;

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
import com.code.android.videoplayer.view.VideoView;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p139o00OOooO.OooO0o;
import p152o00OoO.OooO;
import p152o00OoO.OooOO0;
import p402o0Oo0OOO.o00O000;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p641o0ooOOOO.f5;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nThemeReceiveDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThemeReceiveDialog.kt\ncom/yalla/yalla/ui/dialog/ThemeReceiveDialog\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,141:1\n1855#2,2:142\n*S KotlinDebug\n*F\n+ 1 ThemeReceiveDialog.kt\ncom/yalla/yalla/ui/dialog/ThemeReceiveDialog\n*L\n135#1:142,2\n*E\n"})
public final class x3 extends o00O00OO {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f53206OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f53207OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public final ArrayList f53208OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final f5 f53209OooOOO0;

    public static final class OooO00o implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f53210OooO0Oo;

        public OooO00o(y3 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f53210OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f53210OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f53210OooO0Oo;
        }

        public final int hashCode() {
            return this.f53210OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f53210OooO0Oo.invoke(obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(@NotNull PrivateChatActivity context, @NotNull o000O onReceiveRequest, @NotNull o000OO00 onWatchRequest) {
        super(context, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onReceiveRequest, "onReceiveRequest");
        Intrinsics.checkNotNullParameter(onWatchRequest, "onWatchRequest");
        this.f53206OooOO0O = onReceiveRequest;
        this.f53207OooOO0o = onWatchRequest;
        f5 f5VarInflate = f5.inflate(LayoutInflater.from(context), this.f52533OooO0o, true);
        Intrinsics.checkNotNullExpressionValue(f5VarInflate, "inflate(LayoutInflater.f…xt), getRootView(), true)");
        this.f53209OooOOO0 = f5VarInflate;
        this.f53208OooOOO = new ArrayList();
        ConstraintLayout constraintLayout = f5VarInflate.f57908OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.root");
        OooO0oO(constraintLayout);
        f5VarInflate.f57912OooO0o.setOnClickListener(this);
        f5VarInflate.f57909OooO0O0.setOnClickListener(this);
        f5VarInflate.f57916OooOO0.setOnClickListener(this);
        OooO0o(false);
    }

    public static void OooOO0(x3 x3Var, boolean z, boolean z2, boolean z3, boolean z4, int i) {
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
        f5 f5Var = x3Var.f53209OooOOO0;
        if (z) {
            ImageView imageView = f5Var.f57910OooO0OO;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivBg");
            com.code.android.util.o000OO00.OooOOOO(imageView);
        } else {
            ImageView imageView2 = f5Var.f57910OooO0OO;
            Intrinsics.checkNotNullExpressionValue(imageView2, "binding.ivBg");
            com.code.android.util.o000OO00.OooO0O0(imageView2);
        }
        if (z2) {
            ImageView imageView3 = f5Var.f57911OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(imageView3, "binding.ivBgShape");
            com.code.android.util.o000OO00.OooOOOO(imageView3);
        } else {
            ImageView imageView4 = f5Var.f57911OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(imageView4, "binding.ivBgShape");
            com.code.android.util.o000OO00.OooO0O0(imageView4);
        }
        ImageView imageView5 = f5Var.f57913OooO0o0;
        Intrinsics.checkNotNullExpressionValue(imageView5, "binding.ivBgStroke");
        if (z3) {
            com.code.android.util.o000OO00.OooOOOO(imageView5);
        } else {
            com.code.android.util.o000OO00.OooO0O0(imageView5);
        }
        TextView textView = f5Var.f57916OooOO0;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.tvView");
        if (z4) {
            com.code.android.util.o000OO00.OooOOOO(textView);
        } else {
            com.code.android.util.o000OO00.OooO0O0(textView);
        }
    }

    public static void OooOO0O(x3 x3Var, boolean z, boolean z2, boolean z3, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        f5 f5Var = x3Var.f53209OooOOO0;
        if (z) {
            LinearLayoutCompat linearLayoutCompat = f5Var.f57915OooO0oo;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "binding.llBottom");
            com.code.android.util.o000OO00.OooOOOO(linearLayoutCompat);
        } else {
            LinearLayoutCompat linearLayoutCompat2 = f5Var.f57915OooO0oo;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat2, "binding.llBottom");
            com.code.android.util.o000OO00.OooO0OO(linearLayoutCompat2);
        }
        if (z2) {
            TextView textView = f5Var.f57907OooO;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.tvReceived");
            com.code.android.util.o000OO00.OooOOOO(textView);
        } else {
            TextView textView2 = f5Var.f57907OooO;
            Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvReceived");
            com.code.android.util.o000OO00.OooO0O0(textView2);
        }
        TextView textView3 = f5Var.f57909OooO0O0;
        Intrinsics.checkNotNullExpressionValue(textView3, "binding.btConfirm");
        if (z3) {
            com.code.android.util.o000OO00.OooOOOO(textView3);
        } else {
            com.code.android.util.o000OO00.OooO0O0(textView3);
        }
    }

    @Override // p519o0o0O0oO.o00O00OO
    public final void OooO0Oo() {
        for (OooOO0 oooOO1 : this.f53208OooOOO) {
            oooOO1.OooO0O0();
            OooO oooO = oooOO1.f38118OooO00o;
            if (oooO != null) {
                oooO.release();
            }
            oooOO1.f38118OooO00o = null;
        }
    }

    @Override // p519o0o0O0oO.o00O00OO
    public final void OooO0o0(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        f5 f5Var = this.f53209OooOOO0;
        if (Intrinsics.areEqual(view, f5Var.f57909OooO0O0)) {
            this.f53206OooOO0O.invoke();
            return;
        }
        if (Intrinsics.areEqual(view, f5Var.f57907OooO)) {
            this.f53207OooOO0o.invoke();
        } else if (Intrinsics.areEqual(view, f5Var.f57916OooOO0)) {
            MyOutfitScreen.navigate$default(MyOutfitScreen.INSTANCE, 3, null, false, 6, null);
        } else {
            OooO0O0();
        }
    }

    public final void OooOO0o(@NotNull String themeBackgroundUrl, int i, @NotNull String videoUrl, boolean z) {
        Intrinsics.checkNotNullParameter(themeBackgroundUrl, "themeBackgroundUrl");
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        boolean z2 = !StringsKt.isBlank(themeBackgroundUrl);
        f5 f5Var = this.f53209OooOOO0;
        if (z2) {
            o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(this.f52532OooO0Oo);
            oooO00o.f43911OooO0OO = OooO0o.OooO0oo(o0000O0.OooO00o(165), o0000O0.OooO00o(260), themeBackgroundUrl);
            oooO00o.f43909OooO00o = 0;
            oooO00o.f43923OooOOOo = oOo00OO0.icon_room_theme_placeholder_big;
            oooO00o.OooO0o0(6);
            oooO00o.OooO0Oo(f5Var.f57914OooO0oO);
            ImageView imageView = f5Var.f57914OooO0oO;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivTheme");
            com.code.android.util.o000OO00.OooOOOO(imageView);
        } else {
            ImageView imageView2 = f5Var.f57914OooO0oO;
            Intrinsics.checkNotNullExpressionValue(imageView2, "binding.ivTheme");
            com.code.android.util.o000OO00.OooO0O0(imageView2);
        }
        if (!StringsKt.isBlank(videoUrl)) {
            OooOO0 oooOO1 = new OooOO0();
            this.f53208OooOOO.add(oooOO1);
            VideoView videoPlayer = f5Var.f57917OooOO0O;
            Intrinsics.checkNotNullExpressionValue(videoPlayer, "binding.videoView");
            Intrinsics.checkNotNullParameter(videoPlayer, "videoPlayer");
            oooOO1.f38118OooO00o = videoPlayer;
            File file = o00O000.f44470OooO00o;
            o00O000.OooO00o(videoUrl).observe(this.f52534OooO0o0, new OooO00o(new y3(this, oooOO1)));
            f5Var.f57917OooOO0O.setStateChangedListener(new z3(this));
        } else {
            VideoView videoView = f5Var.f57917OooOO0O;
            Intrinsics.checkNotNullExpressionValue(videoView, "binding.videoView");
            com.code.android.util.o000OO00.OooO0O0(videoView);
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
            f5Var.f57907OooO.setText(o0000.OooO0OO(oO00OOo0.message_theme_has_received));
            OooOO0(this, false, z, false, z, 5);
        } else {
            if (i == ChatMessage.GiveRoomThemeInfo.ThemeState.ThemeHasExpired.getValue() || i == ChatMessage.GiveRoomThemeInfo.ThemeState.ThemeHasReturn.getValue()) {
                OooOO0O(this, true, true, false, 4);
                f5Var.f57907OooO.setText(o0000.OooO0OO(oO00OOo0.message_theme_has_invalid));
                OooOO0(this, false, false, false, false, 15);
            }
        }
    }
}
