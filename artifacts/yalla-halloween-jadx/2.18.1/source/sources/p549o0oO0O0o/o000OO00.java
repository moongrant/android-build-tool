package p549o0oO0O0o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.platform.o0O0O00;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0000OO0.o00Oo0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o0O0O0o0;
import p100o000oOoO.oOO00O;
import p145o00Oo0.o00000O0;
import p145o00Oo0.o00000OO;
import p167o00Ooo.OooOOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class o000OO00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final long f44600OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final Function1<o00000O0, o00000O0> f44601OooO0O0;

    public static final class OooO00o extends Lambda implements Function1<o00000O0, o00000O0> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f44602Oooo0o = new OooO00o();

        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final o00000O0 invoke(o00000O0 o00000o1) {
            return new o00000O0(o00000OO.OooO0Oo(o000OO00.f44600OooO00o, o00000o1.f32070OooO00o));
        }
    }

    static {
        OooOOO0 oooOOO0 = OooOOO0.f32567OooO00o;
        f44600OooO00o = o00000OO.OooO00o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 0.3f, OooOOO0.f32570OooO0Oo);
        f44601OooO0O0 = OooO00o.f44602Oooo0o;
    }

    @Composable
    @NotNull
    public static final o000O OooO00o(@Nullable oOO00O ooo00o) {
        ooo00o.OooO0o0(-715745933);
        ooo00o.OooO0o0(1009281237);
        o0O0O0o0<View> o0o0o0o0 = o0O0O00.f6594OooO0o;
        ViewParent parent = ((View) ooo00o.OooOO0o(o0o0o0o0)).getParent();
        Window window = null;
        o00Oo0 o00oo1 = parent instanceof o00Oo0 ? (o00Oo0) parent : null;
        Window window2 = o00oo1 != null ? o00oo1.getWindow() : null;
        if (window2 == null) {
            Context baseContext = ((View) ooo00o.OooOO0o(o0o0o0o0)).getContext();
            Intrinsics.checkNotNullExpressionValue(baseContext, "LocalView.current.context");
            while (true) {
                if (!(baseContext instanceof Activity)) {
                    if (!(baseContext instanceof ContextWrapper)) {
                        break;
                    }
                    baseContext = ((ContextWrapper) baseContext).getBaseContext();
                    Intrinsics.checkNotNullExpressionValue(baseContext, "baseContext");
                } else {
                    window = ((Activity) baseContext).getWindow();
                    break;
                }
            }
            window2 = window;
        }
        ooo00o.Oooo0o0();
        View view = (View) ooo00o.OooOO0o(o0O0O00.f6594OooO0o);
        ooo00o.OooO0o0(511388516);
        boolean zOooo0oo = ooo00o.Oooo0oo(view) | ooo00o.Oooo0oo(window2);
        Object objOooO0o = ooo00o.OooO0o();
        if (zOooo0oo || objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
            objOooO0o = new o000OO0O(view, window2);
            ooo00o.Oooo00o(objOooO0o);
        }
        ooo00o.Oooo0o0();
        o000OO0O o000oo0o2 = (o000OO0O) objOooO0o;
        ooo00o.Oooo0o0();
        return o000oo0o2;
    }
}
