package p162o00OoOOo;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewStub;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import com.app.base.mixedroom.MixedRoomActivity;
import com.weieyu.yalla.R;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p043OooooO0.o00O0000;
import p391o0OOooOo.o0O00000;
import p546o0o0Ooo0.oO00Oo00;
import p546o0o0Ooo0.oO00o000;
import p606o0oo0O.OooOo;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class oo00oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final oO00Oo00 f32509OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final ViewStub f32510OooO0O0;

    public oo00oO(@NotNull MixedRoomActivity activity, @NotNull View bottomView, @NotNull oO00Oo00 roomBottomMessageInputManager) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(bottomView, "bottomView");
        Intrinsics.checkNotNullParameter(roomBottomMessageInputManager, "roomBottomMessageInputManager");
        this.f32509OooO00o = roomBottomMessageInputManager;
        View viewFindViewById = bottomView.findViewById(R.id.vs_room_bottom_message_input);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "bottomView.findViewById(…oom_bottom_message_input)");
        this.f32510OooO0O0 = (ViewStub) viewFindViewById;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void OooO00o() {
        if (this.f32510OooO0O0.getParent() == null) {
            return;
        }
        this.f32510OooO0O0.inflate().setOnClickListener(o0O00o0.f32504Oooo0o);
        oO00Oo00 oo00oo00 = this.f32509OooO00o;
        ComposeView composeView = (ComposeView) oo00oo00.f44431OooO0O0.findViewById(R.id.compose_room_bottom_message_input);
        composeView.setContent(o00O0000.OooO0O0(-1208113508, true, new oO00o000(oo00oo00, composeView)));
    }

    public final void OooO0O0() {
        OooOo.OooO0OO("202021", MapsKt.mapOf(new Pair("sources", 1)));
        OooO00o();
        o0O00000.OooO0OO("InRoom_sayhi");
        this.f32509OooO00o.f44432OooO0OO.setValue(Boolean.TRUE);
    }
}
