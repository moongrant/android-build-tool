package p579o0oOoOOo;

import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.framework.abs.AbsListener.AbsListenerTag;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOo00;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p146o00Oo000.OooO0O0;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class n1 extends OooO0O0<String, AbsListenerTag> {

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @Nullable
    public OooO00o f46024OoooO0;

    public interface OooO00o {
        void onClick(@NotNull View view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(@NotNull Context context) {
        super(context, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // p146o00Oo000.OooO0O0
    public final void OooO0O0() {
    }

    @Override // p146o00Oo000.OooO0O0
    public final int OooO0o0() {
        return R.layout.activity_room_un_join_popup_layout;
    }

    @Override // p146o00Oo000.OooO0O0
    public final void OooO0oo() {
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
        if (attributes != null) {
            attributes.y = OooOo00.OooO00o(45.0f);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setAttributes(attributes);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setDimAmount(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        }
        Window window4 = getWindow();
        if (window4 != null) {
            window4.setGravity(80);
        }
        OooO00o(R.id.un_join);
        OooO00o(R.id.un_join_follow);
    }

    @Override // o00Oo00.OooO00o
    public final void onClickNotDouble(@Nullable View view) {
        OooO00o oooO00o = this.f46024OoooO0;
        if (oooO00o != null) {
            Intrinsics.checkNotNull(view);
            oooO00o.onClick(view);
        }
    }
}
