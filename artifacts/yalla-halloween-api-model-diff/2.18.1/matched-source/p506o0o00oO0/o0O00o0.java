package p506o0o00oO0;

import android.view.LayoutInflater;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.ShareChannel;
import com.yalla.yalla.common.model.ShareModel;
import com.yalla.yalla.common.model.ShareModelKt;
import com.yalla.yalla.common.model.ShareType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.oOO00O;
import p502o0o00o0.o00000O;
import p516o0o0O000.o00000O0;
import p649o0ooOOoo.g8;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o0O00o0 extends o00000O {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f41666OoooO;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @NotNull
    public ShareType f41667OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    @NotNull
    public final List<TextView> f41668OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    @NotNull
    public final o00000O0 f41669OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public boolean f41670OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public boolean f41671OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @Nullable
    public ShareModel f41672OoooOoo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @NotNull
    public final Lazy f41673o000oOoO;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ShareChannel.values().length];
            iArr[ShareChannel.Friends.ordinal()] = 1;
            iArr[ShareChannel.Moments.ordinal()] = 2;
            iArr[ShareChannel.Facebook.ordinal()] = 3;
            iArr[ShareChannel.Twitter.ordinal()] = 4;
            iArr[ShareChannel.Instagram.ordinal()] = 5;
            iArr[ShareChannel.WhatsApp.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<g8> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final g8 invoke() {
            g8 g8VarInflate = g8.inflate(LayoutInflater.from(o0O00o0.this.f41666OoooO), o0O00o0.this.f41545Oooo0oo, true);
            Intrinsics.checkNotNullExpressionValue(g8VarInflate, "inflate(LayoutInflater.f…ty), getRootView(), true)");
            return g8VarInflate;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00o0(@NotNull FragmentActivity activity, @NotNull ShareType shareType) {
        super(activity, 0);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(shareType, "shareType");
        int i = 0;
        this.f41666OoooO = activity;
        this.f41667OoooOO0 = shareType;
        this.f41673o000oOoO = LazyKt.lazy(new OooO0O0());
        ArrayList arrayList = new ArrayList();
        this.f41668OoooOOO = arrayList;
        this.f41669OoooOOo = new o00000O0(activity, this.f41667OoooOO0);
        this.f41670OoooOo0 = true;
        LinearLayout linearLayout = OooOO0O().f49431OooO00o;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.root");
        OooO0oO(linearLayout);
        OooO0oo(80);
        Window window = this.f41542Oooo;
        if (window != null) {
            window.setWindowAnimations(R.style.animation_bottom_in_bottom_out);
        }
        TextView textView = OooOO0O().f49433OooO0OO;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.friends");
        arrayList.add(textView);
        TextView textView2 = OooOO0O().f49435OooO0o;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.moments");
        arrayList.add(textView2);
        TextView textView3 = OooOO0O().f49432OooO0O0;
        Intrinsics.checkNotNullExpressionValue(textView3, "binding.facebook");
        arrayList.add(textView3);
        TextView textView4 = OooOO0O().f49438OooO0oo;
        Intrinsics.checkNotNullExpressionValue(textView4, "binding.twitter");
        arrayList.add(textView4);
        TextView textView5 = OooOO0O().f49434OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(textView5, "binding.instagram");
        arrayList.add(textView5);
        TextView textView6 = OooOO0O().f49430OooO;
        Intrinsics.checkNotNullExpressionValue(textView6, "binding.whatsApp");
        arrayList.add(textView6);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((TextView) it.next()).setOnClickListener(new o0oOO(this, i));
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<android.widget.TextView>] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.ArrayList, java.util.List<android.widget.TextView>] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.util.ArrayList, java.util.List<android.widget.TextView>] */
    @Override // p502o0o00o0.o00000O
    public final void OooOO0() {
        super.OooOO0();
        this.f41669OoooOOo.f42066OooO00o = this.f41672OoooOoo;
        Iterator it = this.f41668OoooOOO.iterator();
        while (it.hasNext()) {
            oOO00O.OooO00o((TextView) it.next());
        }
        Iterator<T> it2 = ShareModelKt.getShareChannels(this.f41667OoooOO0, this.f41670OoooOo0).iterator();
        while (it2.hasNext()) {
            switch (OooO00o.$EnumSwitchMapping$0[((ShareChannel) it2.next()).ordinal()]) {
                case 1:
                    TextView textView = OooOO0O().f49433OooO0OO;
                    Intrinsics.checkNotNullExpressionValue(textView, "binding.friends");
                    oOO00O.OooO(textView);
                    break;
                case 2:
                    TextView textView2 = OooOO0O().f49435OooO0o;
                    Intrinsics.checkNotNullExpressionValue(textView2, "binding.moments");
                    oOO00O.OooO(textView2);
                    break;
                case 3:
                    TextView textView3 = OooOO0O().f49432OooO0O0;
                    Intrinsics.checkNotNullExpressionValue(textView3, "binding.facebook");
                    oOO00O.OooO(textView3);
                    break;
                case 4:
                    TextView textView4 = OooOO0O().f49438OooO0oo;
                    Intrinsics.checkNotNullExpressionValue(textView4, "binding.twitter");
                    oOO00O.OooO(textView4);
                    break;
                case 5:
                    TextView textView5 = OooOO0O().f49434OooO0Oo;
                    Intrinsics.checkNotNullExpressionValue(textView5, "binding.instagram");
                    oOO00O.OooO(textView5);
                    break;
                case 6:
                    TextView textView6 = OooOO0O().f49430OooO;
                    Intrinsics.checkNotNullExpressionValue(textView6, "binding.whatsApp");
                    oOO00O.OooO(textView6);
                    break;
            }
        }
        if (this.f41670OoooOo0) {
            TextView textView7 = OooOO0O().f49433OooO0OO;
            Intrinsics.checkNotNullExpressionValue(textView7, "binding.friends");
            oOO00O.OooO(textView7);
        } else {
            TextView textView8 = OooOO0O().f49433OooO0OO;
            Intrinsics.checkNotNullExpressionValue(textView8, "binding.friends");
            oOO00O.OooO00o(textView8);
        }
        if (this.f41671OoooOoO) {
            OooOO0O().f49436OooO0o0.setBackgroundResource(R.drawable.shape_dialog_bg_black);
            OooOO0O().f49437OooO0oO.setTextColor(o000O0O0.OooO00o(R.color.white));
            Iterator it3 = this.f41668OoooOOO.iterator();
            while (it3.hasNext()) {
                ((TextView) it3.next()).setTextColor(o000O0O0.OooO00o(R.color.color_FFFFFFF_70));
            }
            return;
        }
        OooOO0O().f49436OooO0o0.setBackgroundResource(R.drawable.shape_dialog_bg_white);
        OooOO0O().f49437OooO0oO.setTextColor(o000O0O0.OooO00o(R.color.color_333333));
        Iterator it4 = this.f41668OoooOOO.iterator();
        while (it4.hasNext()) {
            ((TextView) it4.next()).setTextColor(o000O0O0.OooO00o(R.color.color_5f5f5f));
        }
    }

    public final g8 OooOO0O() {
        return (g8) this.f41673o000oOoO.getValue();
    }
}
