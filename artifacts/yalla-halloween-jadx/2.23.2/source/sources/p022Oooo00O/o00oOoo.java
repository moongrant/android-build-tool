package p022Oooo00O;

import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.media3.common.Player;
import androidx.media3.session.o00O00O;
import com.yalla.yalla.ui.activity.message.SearchFriendActivity;
import com.yalla.yalla.ui.activity.message.o00O00o0;
import kotlin.jvm.internal.Intrinsics;
import o0oo0000.OooO00o;
import p080o000OoO.o00000O0;
import p601o0oo00oO.o0000O;
import p639o0ooOO0.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00oOoo implements o000Oo0.OooO0OO, o00000O0.OooO00o, o0000O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f670OooO0Oo;

    public /* synthetic */ o00oOoo(Object obj) {
        this.f670OooO0Oo = obj;
    }

    @Override // p601o0oo00oO.o0000O
    public final void OooO00o(String data) {
        SearchFriendActivity this$0 = (SearchFriendActivity) this.f670OooO0Oo;
        int i = SearchFriendActivity.f25264OooOo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(data, "data");
        LinearLayout linearLayout = null;
        if (data.length() > 0) {
            OooO00o.OooO0O0("204020");
            this$0.OooOo0(true);
            ImageView imageView = this$0.f25269OooOo00;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ivClear");
                imageView = null;
            }
            imageView.setVisibility(0);
            LinearLayout linearLayout2 = this$0.f25267OooOOoo;
            if (linearLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("llSearchFriendHot");
            } else {
                linearLayout = linearLayout2;
            }
            linearLayout.setVisibility(4);
            return;
        }
        o00O00o0 o00o00o1 = this$0.f25270OooOo0O;
        if (o00o00o1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("resultAdapter");
            o00o00o1 = null;
        }
        o00o00o1.OooOoO0(null);
        ImageView imageView2 = this$0.f25269OooOo00;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivClear");
            imageView2 = null;
        }
        imageView2.setVisibility(8);
        o00O00o0 o00o00o2 = this$0.f25270OooOo0O;
        if (o00o00o2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("resultAdapter");
            o00o00o2 = null;
        }
        o00o00o2.notifyDataSetChanged();
        LinearLayout linearLayout3 = this$0.f25267OooOOoo;
        if (linearLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("llSearchFriendHot");
        } else {
            linearLayout = linearLayout3;
        }
        linearLayout.setVisibility(0);
    }

    @Override // o0ooOO0.o000Oo0.OooO0OO
    public final Object OooO0o0(o000Oo0.OooO00o oooO00o) {
        ((o000O0Oo.OooO) this.f670OooO0Oo).f521OooO00o = oooO00o;
        return "waitFor3AResult";
    }

    @Override // o000OoO.o00000O0.OooO00o
    public final void invoke(Object obj) {
        ((Player.OooO0OO) obj).onAudioAttributesChanged(((o00O00O) this.f670OooO0Oo).f9379OooOOo);
    }
}
